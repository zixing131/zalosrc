package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
final class MultiDexExtractor implements Closeable {
    private static final int BUFFER_SIZE = 16384;
    private static final String DEX_PREFIX = "classes";
    static final String DEX_SUFFIX = ".dex";
    private static final String EXTRACTED_NAME_EXT = ".classes";
    static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_CRC = "crc";
    private static final String KEY_DEX_CRC = "dex.crc.";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String KEY_DEX_TIME = "dex.time.";
    private static final String KEY_TIME_STAMP = "timestamp";
    private static final String LOCK_FILENAME = "MultiDex.lock";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final String PREFS_FILE = "multidex.version";
    private static final String TAG = "MultiDex";
    private final FileLock cacheLock;
    private final File dexDir;
    private final FileChannel lockChannel;
    private final RandomAccessFile lockRaf;
    private final File sourceApk;
    private final long sourceCrc;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ExtractedDex extends File {
        public long crc;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.crc = MultiDexExtractor.NO_VALUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MultiDexExtractor(File file, File file2) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MultiDexExtractor(");
        sb2.append(file.getPath());
        sb2.append(", ");
        sb2.append(file2.getPath());
        sb2.append(")");
        this.sourceApk = file;
        this.dexDir = file2;
        this.sourceCrc = getZipCrc(file);
        File file3 = new File(file2, LOCK_FILENAME);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.lockRaf = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.lockChannel = channel;
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Blocking on lock ");
                sb3.append(file3.getPath());
                this.cacheLock = channel.lock();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(file3.getPath());
                sb4.append(" locked");
            } catch (IOException e11) {
                e = e11;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (Error e12) {
                e = e12;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (RuntimeException e13) {
                e = e13;
                closeQuietly(this.lockChannel);
                throw e;
            }
        } catch (IOException e14) {
            e = e14;
            closeQuietly(this.lockRaf);
            throw e;
        } catch (Error e15) {
            e = e15;
            closeQuietly(this.lockRaf);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            closeQuietly(this.lockRaf);
            throw e;
        }
    }

    private void clearDexDir() {
        File[] listFiles = this.dexDir.listFiles(new FileFilter() { // from class: androidx.multidex.MultiDexExtractor.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return !file.getName().equals(MultiDexExtractor.LOCK_FILENAME);
            }
        });
        if (listFiles == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to list secondary dex dir content (");
            sb2.append(this.dexDir.getPath());
            sb2.append(").");
            return;
        }
        for (File file : listFiles) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Trying to delete old file ");
            sb3.append(file.getPath());
            sb3.append(" of size ");
            sb3.append(file.length());
            if (!file.delete()) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to delete old file ");
                sb4.append(file.getPath());
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Deleted old file ");
                sb5.append(file.getPath());
            }
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, EXTRACTED_SUFFIX, file.getParentFile());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Extracting ");
        sb2.append(createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[BUFFER_SIZE];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Renaming to ");
                    sb3.append(file.getPath());
                    if (createTempFile.renameTo(file)) {
                        closeQuietly(inputStream);
                        createTempFile.delete();
                        return;
                    }
                    throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            closeQuietly(inputStream);
            createTempFile.delete();
            throw th3;
        }
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, 4);
    }

    private static long getTimeStamp(File file) {
        long lastModified = file.lastModified();
        if (lastModified == NO_VALUE) {
            return lastModified - 1;
        }
        return lastModified;
    }

    private static long getZipCrc(File file) throws IOException {
        long zipCrc = ZipUtil.getZipCrc(file);
        if (zipCrc == NO_VALUE) {
            return zipCrc - 1;
        }
        return zipCrc;
    }

    private static boolean isModified(Context context, File file, long j11, String str) {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        if (multiDexPreferences.getLong(str + KEY_TIME_STAMP, NO_VALUE) == getTimeStamp(file)) {
            if (multiDexPreferences.getLong(str + KEY_CRC, NO_VALUE) == j11) {
                return false;
            }
        }
        return true;
    }

    private List<ExtractedDex> loadExistingExtractions(Context context, String str) throws IOException {
        String str2 = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        int i11 = multiDexPreferences.getInt(str + KEY_DEX_NUMBER, 1);
        ArrayList arrayList = new ArrayList(i11 + (-1));
        int i12 = 2;
        while (i12 <= i11) {
            ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str2 + i12 + EXTRACTED_SUFFIX);
            if (extractedDex.isFile()) {
                extractedDex.crc = getZipCrc(extractedDex);
                long j11 = multiDexPreferences.getLong(str + KEY_DEX_CRC + i12, NO_VALUE);
                long j12 = multiDexPreferences.getLong(str + KEY_DEX_TIME + i12, NO_VALUE);
                long lastModified = extractedDex.lastModified();
                if (j12 == lastModified) {
                    String str3 = str2;
                    SharedPreferences sharedPreferences = multiDexPreferences;
                    if (j11 == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i12++;
                        multiDexPreferences = sharedPreferences;
                        str2 = str3;
                    }
                }
                throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j12 + ", modification time: " + lastModified + ", expected crc: " + j11 + ", file crc: " + extractedDex.crc);
            }
            throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
        }
        return arrayList;
    }

    private List<ExtractedDex> performExtractions() throws IOException {
        String str;
        String str2 = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        clearDexDir();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.sourceApk);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(DEX_PREFIX);
            int i11 = 2;
            sb2.append(2);
            sb2.append(DEX_SUFFIX);
            ZipEntry entry = zipFile.getEntry(sb2.toString());
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str2 + i11 + EXTRACTED_SUFFIX);
                arrayList.add(extractedDex);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Extraction is needed for file ");
                sb3.append(extractedDex);
                int i12 = 0;
                boolean z11 = false;
                while (i12 < 3 && !z11) {
                    i12++;
                    extract(zipFile, entry, extractedDex, str2);
                    try {
                        extractedDex.crc = getZipCrc(extractedDex);
                        z11 = true;
                    } catch (IOException unused) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Failed to read crc from ");
                        sb4.append(extractedDex.getAbsolutePath());
                        z11 = false;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Extraction ");
                    if (z11) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb5.append(str);
                    sb5.append(" '");
                    sb5.append(extractedDex.getAbsolutePath());
                    sb5.append("': length ");
                    sb5.append(extractedDex.length());
                    sb5.append(" - crc: ");
                    sb5.append(extractedDex.crc);
                    if (!z11) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Failed to delete corrupted secondary dex '");
                            sb6.append(extractedDex.getPath());
                            sb6.append("'");
                        }
                    }
                }
                if (z11) {
                    i11++;
                    entry = zipFile.getEntry(DEX_PREFIX + i11 + DEX_SUFFIX);
                } else {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i11 + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            return arrayList;
        } catch (Throwable th2) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            throw th2;
        }
    }

    private static void putStoredApkInfo(Context context, String str, long j11, long j12, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = getMultiDexPreferences(context).edit();
        edit.putLong(str + KEY_TIME_STAMP, j11);
        edit.putLong(str + KEY_CRC, j12);
        edit.putInt(str + KEY_DEX_NUMBER, list.size() + 1);
        int i11 = 2;
        for (ExtractedDex extractedDex : list) {
            edit.putLong(str + KEY_DEX_CRC + i11, extractedDex.crc);
            edit.putLong(str + KEY_DEX_TIME + i11, extractedDex.lastModified());
            i11++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cacheLock.release();
        this.lockChannel.close();
        this.lockRaf.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<? extends File> load(Context context, String str, boolean z11) throws IOException {
        List<ExtractedDex> performExtractions;
        List<ExtractedDex> list;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MultiDexExtractor.load(");
        sb2.append(this.sourceApk.getPath());
        sb2.append(", ");
        sb2.append(z11);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(")");
        if (this.cacheLock.isValid()) {
            if (!z11 && !isModified(context, this.sourceApk, this.sourceCrc, str)) {
                try {
                    list = loadExistingExtractions(context, str);
                } catch (IOException unused) {
                    performExtractions = performExtractions();
                    putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("load found ");
                sb3.append(list.size());
                sb3.append(" secondary dex files");
                return list;
            }
            performExtractions = performExtractions();
            putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
            list = performExtractions;
            StringBuilder sb32 = new StringBuilder();
            sb32.append("load found ");
            sb32.append(list.size());
            sb32.append(" secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
}
