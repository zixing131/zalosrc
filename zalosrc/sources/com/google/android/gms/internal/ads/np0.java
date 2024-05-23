package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class np0 extends kp0 {

    /* renamed from: u */
    private static final Set f25281u = Collections.synchronizedSet(new HashSet());

    /* renamed from: v */
    private static final DecimalFormat f25282v = new DecimalFormat("#,###");

    /* renamed from: w */
    public static final /* synthetic */ int f25283w = 0;

    /* renamed from: s */
    private File f25284s;

    /* renamed from: t */
    private boolean f25285t;

    public np0(fn0 fn0Var) {
        super(fn0Var);
        File cacheDir = this.f23421p.getCacheDir();
        if (cacheDir == null) {
            yk0.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f25284s = file;
        if (!file.isDirectory() && !this.f25284s.mkdirs()) {
            yk0.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.f25284s.getAbsolutePath())));
            this.f25284s = null;
        } else {
            if (this.f25284s.setReadable(true, false) && this.f25284s.setExecutable(true, false)) {
                return;
            }
            yk0.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.f25284s.getAbsolutePath())));
            this.f25284s = null;
        }
    }

    /* renamed from: v */
    private final File m24968v(File file) {
        return new File(this.f25284s, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: i */
    public final void mo23993i() {
        this.f25285t = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0357, code lost:            r26 = r4;        r24 = r14;        r21 = r15;     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x035d, code lost:            r26.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0365, code lost:            if (com.google.android.gms.internal.ads.yk0.zzm(3) == false) goto L142;     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0367, code lost:            com.google.android.gms.internal.ads.yk0.zze("Preloaded " + com.google.android.gms.internal.ads.np0.f25282v.format(r13) + " bytes from " + r30);     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x038a, code lost:            r12.setReadable(true, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0393, code lost:            if (r0.isFile() == false) goto L188;     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0395, code lost:            r0.setLastModified(java.lang.System.currentTimeMillis());     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x039d, code lost:            r0.createNewFile();     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03f5  */
    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo24003s(final String str) {
        int i11;
        File file;
        String str2;
        String str3;
        String str4;
        FileOutputStream fileOutputStream;
        String str5;
        int i12;
        String str6;
        zzbz zzbzVar;
        FileChannel fileChannel;
        ReadableByteChannel readableByteChannel;
        int i13;
        int i14;
        int responseCode;
        boolean delete;
        FileOutputStream fileOutputStream2 = null;
        if (this.f25284s == null) {
            m23994j(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file2 = this.f25284s;
            if (file2 == null) {
                i11 = 0;
            } else {
                i11 = 0;
                for (File file3 : file2.listFiles()) {
                    if (!file3.getName().endsWith(".done")) {
                        i11++;
                    }
                }
            }
            if (i11 > ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21366s)).intValue()) {
                File file4 = this.f25284s;
                if (file4 == null) {
                    break;
                }
                long j11 = Long.MAX_VALUE;
                File file5 = null;
                for (File file6 : file4.listFiles()) {
                    if (!file6.getName().endsWith(".done")) {
                        long lastModified = file6.lastModified();
                        if (lastModified < j11) {
                            file5 = file6;
                            j11 = lastModified;
                        }
                    }
                }
                if (file5 == null) {
                    break;
                }
                delete = file5.delete();
                File m24968v = m24968v(file5);
                if (m24968v.isFile()) {
                    delete &= m24968v.delete();
                }
            } else {
                file = new File(this.f25284s, rk0.m26104g(str));
                File m24968v2 = m24968v(file);
                if (file.isFile() && m24968v2.isFile()) {
                    long length = file.length();
                    yk0.zze("Stream cache hit at ".concat(String.valueOf(str)));
                    m23995k(str, file.getAbsolutePath(), (int) length);
                    return true;
                }
                String concat = String.valueOf(this.f25284s.getAbsolutePath()).concat(String.valueOf(str));
                Set set = f25281u;
                synchronized (set) {
                    try {
                        if (set.contains(concat)) {
                            yk0.zzj("Stream cache already in progress at " + str);
                            m23994j(str, file.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(concat);
                        str2 = ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR;
                        try {
                            HttpURLConnection m22688i = a23.m19961a().m22688i(new g23() { // from class: com.google.android.gms.internal.ads.mp0
                                @Override // com.google.android.gms.internal.ads.g23
                                public final URLConnection zza() {
                                    String str7 = str;
                                    int i15 = np0.f25283w;
                                    zzt.zzw();
                                    int intValue = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21416x)).intValue();
                                    URL url = new URL(str7);
                                    int i16 = 0;
                                    while (true) {
                                        i16++;
                                        if (i16 <= 20) {
                                            URLConnection openConnection = url.openConnection();
                                            openConnection.setConnectTimeout(intValue);
                                            openConnection.setReadTimeout(intValue);
                                            if (openConnection instanceof HttpURLConnection) {
                                                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                                xk0 xk0Var = new xk0(null);
                                                xk0Var.m27911c(httpURLConnection, null);
                                                httpURLConnection.setInstanceFollowRedirects(false);
                                                int responseCode2 = httpURLConnection.getResponseCode();
                                                xk0Var.m27913e(httpURLConnection, responseCode2);
                                                if (responseCode2 / 100 == 3) {
                                                    String headerField = httpURLConnection.getHeaderField("Location");
                                                    if (headerField != null) {
                                                        URL url2 = new URL(url, headerField);
                                                        String protocol = url2.getProtocol();
                                                        if (protocol != null) {
                                                            if (!protocol.equals("http") && !protocol.equals("https")) {
                                                                throw new IOException("Unsupported scheme: ".concat(protocol));
                                                            }
                                                            yk0.zze("Redirecting to ".concat(headerField));
                                                            httpURLConnection.disconnect();
                                                            url = url2;
                                                        } else {
                                                            throw new IOException("Protocol is null");
                                                        }
                                                    } else {
                                                        throw new IOException("Missing Location header in redirect");
                                                    }
                                                } else {
                                                    return httpURLConnection;
                                                }
                                            } else {
                                                throw new IOException("Invalid protocol.");
                                            }
                                        } else {
                                            throw new IOException("Too many redirects (20)");
                                        }
                                    }
                                }
                            }, 265, -1);
                            if ((m22688i instanceof HttpURLConnection) && (responseCode = m22688i.getResponseCode()) >= 400) {
                                str2 = "badUrl";
                                try {
                                    String str7 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                    try {
                                        throw new IOException("HTTP status code " + responseCode + " at " + str);
                                    } catch (IOException | RuntimeException e11) {
                                        e = e11;
                                        str4 = str7;
                                        str3 = concat;
                                        if (e instanceof RuntimeException) {
                                        }
                                        try {
                                            fileOutputStream2.close();
                                        } catch (IOException | NullPointerException unused) {
                                        }
                                        if (this.f25285t) {
                                        }
                                        if (file.exists()) {
                                        }
                                        m23994j(str, file.getAbsolutePath(), str2, str4);
                                        f25281u.remove(str3);
                                        return false;
                                    }
                                } catch (IOException | RuntimeException e12) {
                                    e = e12;
                                    str4 = null;
                                }
                            }
                            int contentLength = m22688i.getContentLength();
                            if (contentLength < 0) {
                                yk0.zzj("Stream cache aborted, missing content-length header at " + str);
                                m23994j(str, file.getAbsolutePath(), "contentLengthMissing", null);
                                set.remove(concat);
                                return false;
                            }
                            String format = f25282v.format(contentLength);
                            int intValue = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21376t)).intValue();
                            if (contentLength > intValue) {
                                yk0.zzj("Content length " + format + " exceeds limit at " + str);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("File too big for full file cache. Size: ");
                                sb2.append(format);
                                m23994j(str, file.getAbsolutePath(), "sizeExceeded", sb2.toString());
                                set.remove(concat);
                                return false;
                            }
                            yk0.zze("Caching " + format + " bytes from " + str);
                            ReadableByteChannel newChannel = Channels.newChannel(m22688i.getInputStream());
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                            try {
                                FileChannel channel = fileOutputStream3.getChannel();
                                ByteBuffer allocate = ByteBuffer.allocate(ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
                                InterfaceC20285f zzB = zzt.zzB();
                                long mo105913a = zzB.mo105913a();
                                zzbz zzbzVar2 = new zzbz(((Long) zzay.zzc().m21823b(AbstractC4554gx.f21406w)).longValue());
                                AbstractC5184xw abstractC5184xw = AbstractC4554gx.f21396v;
                                SharedPreferencesOnSharedPreferenceChangeListenerC4480ex zzc = zzay.zzc();
                                long longValue = ((Long) zzc.m21823b(abstractC5184xw)).longValue();
                                i12 = 0;
                                while (true) {
                                    int read = newChannel.read(allocate);
                                    if (read < 0) {
                                        break;
                                    }
                                    i12 += read;
                                    try {
                                        try {
                                            if (i12 <= intValue) {
                                                try {
                                                    allocate.flip();
                                                    do {
                                                    } while (channel.write(allocate) > 0);
                                                    allocate.clear();
                                                    if (zzB.mo105913a() - mo105913a <= 1000 * longValue) {
                                                        ByteBuffer byteBuffer = allocate;
                                                        if (!this.f25285t) {
                                                            if (zzbzVar2.zzb()) {
                                                                str5 = str2;
                                                                try {
                                                                    zzbzVar = zzbzVar2;
                                                                    str6 = concat;
                                                                    fileChannel = channel;
                                                                    fileOutputStream = fileOutputStream3;
                                                                    readableByteChannel = newChannel;
                                                                    i13 = intValue;
                                                                    i14 = contentLength;
                                                                } catch (IOException e13) {
                                                                    e = e13;
                                                                    fileOutputStream = fileOutputStream3;
                                                                    str6 = concat;
                                                                    str3 = str6;
                                                                    str2 = str5;
                                                                    fileOutputStream2 = fileOutputStream;
                                                                    str4 = null;
                                                                    if (e instanceof RuntimeException) {
                                                                    }
                                                                    fileOutputStream2.close();
                                                                    if (this.f25285t) {
                                                                    }
                                                                    if (file.exists()) {
                                                                    }
                                                                    m23994j(str, file.getAbsolutePath(), str2, str4);
                                                                    f25281u.remove(str3);
                                                                    return false;
                                                                } catch (RuntimeException e14) {
                                                                    e = e14;
                                                                    fileOutputStream = fileOutputStream3;
                                                                    str6 = concat;
                                                                    str3 = str6;
                                                                    str2 = str5;
                                                                    fileOutputStream2 = fileOutputStream;
                                                                    str4 = null;
                                                                    if (e instanceof RuntimeException) {
                                                                    }
                                                                    fileOutputStream2.close();
                                                                    if (this.f25285t) {
                                                                    }
                                                                    if (file.exists()) {
                                                                    }
                                                                    m23994j(str, file.getAbsolutePath(), str2, str4);
                                                                    f25281u.remove(str3);
                                                                    return false;
                                                                }
                                                                try {
                                                                    try {
                                                                        rk0.f27282b.post(new dp0(this, str, file.getAbsolutePath(), i12, contentLength, false));
                                                                    } catch (RuntimeException e15) {
                                                                        e = e15;
                                                                        str3 = str6;
                                                                        str2 = str5;
                                                                        fileOutputStream2 = fileOutputStream;
                                                                        str4 = null;
                                                                        if (e instanceof RuntimeException) {
                                                                        }
                                                                        fileOutputStream2.close();
                                                                        if (this.f25285t) {
                                                                        }
                                                                        if (file.exists()) {
                                                                            yk0.zzj("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                                        }
                                                                        m23994j(str, file.getAbsolutePath(), str2, str4);
                                                                        f25281u.remove(str3);
                                                                        return false;
                                                                    }
                                                                } catch (IOException e16) {
                                                                    e = e16;
                                                                    str3 = str6;
                                                                    str2 = str5;
                                                                    fileOutputStream2 = fileOutputStream;
                                                                    str4 = null;
                                                                    if (e instanceof RuntimeException) {
                                                                        zzt.zzo().m22945t(e, "VideoStreamFullFileCache.preload");
                                                                    }
                                                                    fileOutputStream2.close();
                                                                    if (this.f25285t) {
                                                                        yk0.zzi("Preload aborted for URL \"" + str + "\"");
                                                                    } else {
                                                                        yk0.zzk("Preload failed for URL \"" + str + "\"", e);
                                                                    }
                                                                    if (file.exists() && !file.delete()) {
                                                                        yk0.zzj("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                                    }
                                                                    m23994j(str, file.getAbsolutePath(), str2, str4);
                                                                    f25281u.remove(str3);
                                                                    return false;
                                                                }
                                                            } else {
                                                                zzbzVar = zzbzVar2;
                                                                fileChannel = channel;
                                                                fileOutputStream = fileOutputStream3;
                                                                readableByteChannel = newChannel;
                                                                i13 = intValue;
                                                                i14 = contentLength;
                                                                str6 = concat;
                                                                str5 = str2;
                                                            }
                                                            allocate = byteBuffer;
                                                            newChannel = readableByteChannel;
                                                            str2 = str5;
                                                            zzbzVar2 = zzbzVar;
                                                            concat = str6;
                                                            channel = fileChannel;
                                                            fileOutputStream3 = fileOutputStream;
                                                            intValue = i13;
                                                            contentLength = i14;
                                                        } else {
                                                            throw new IOException("abort requested");
                                                        }
                                                    } else {
                                                        String str8 = "Timeout exceeded. Limit: " + Long.toString(longValue) + " sec";
                                                        throw new IOException("stream cache time limit exceeded");
                                                    }
                                                } catch (IOException e17) {
                                                    e = e17;
                                                    fileOutputStream = fileOutputStream3;
                                                    str6 = concat;
                                                    str5 = str2;
                                                    str3 = str6;
                                                    str2 = str5;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str4 = null;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream2.close();
                                                    if (this.f25285t) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    m23994j(str, file.getAbsolutePath(), str2, str4);
                                                    f25281u.remove(str3);
                                                    return false;
                                                } catch (RuntimeException e18) {
                                                    e = e18;
                                                    fileOutputStream = fileOutputStream3;
                                                    str6 = concat;
                                                    str5 = str2;
                                                    str3 = str6;
                                                    str2 = str5;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str4 = null;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream2.close();
                                                    if (this.f25285t) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    m23994j(str, file.getAbsolutePath(), str2, str4);
                                                    f25281u.remove(str3);
                                                    return false;
                                                }
                                            } else {
                                                String str9 = "File too big for full file cache. Size: " + Integer.toString(i12);
                                                throw new IOException("stream cache file size limit exceeded");
                                            }
                                        } catch (IOException | RuntimeException e19) {
                                            e = e19;
                                            str4 = zzc;
                                            str3 = str6;
                                            fileOutputStream2 = fileOutputStream;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream2.close();
                                            if (this.f25285t) {
                                            }
                                            if (file.exists()) {
                                            }
                                            m23994j(str, file.getAbsolutePath(), str2, str4);
                                            f25281u.remove(str3);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e21) {
                                        e = e21;
                                        str3 = str6;
                                        fileOutputStream2 = fileOutputStream;
                                        str4 = null;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream2.close();
                                        if (this.f25285t) {
                                        }
                                        if (file.exists()) {
                                        }
                                        m23994j(str, file.getAbsolutePath(), str2, str4);
                                        f25281u.remove(str3);
                                        return false;
                                    }
                                }
                            } catch (IOException | RuntimeException e22) {
                                e = e22;
                                fileOutputStream = fileOutputStream3;
                                str3 = concat;
                                str5 = str2;
                            }
                        } catch (IOException | RuntimeException e23) {
                            e = e23;
                            str3 = concat;
                            str2 = ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR;
                            str4 = null;
                            fileOutputStream2 = null;
                        }
                    } finally {
                    }
                }
            }
        } while (delete);
        yk0.zzj("Unable to expire stream cache");
        m23994j(str, null, "expireFailed", null);
        return false;
        m23995k(str, file.getAbsolutePath(), i12);
        str3 = str6;
        try {
            f25281u.remove(str3);
            return true;
        } catch (IOException e24) {
            e = e24;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.f25285t) {
            }
            if (file.exists()) {
            }
            m23994j(str, file.getAbsolutePath(), str2, str4);
            f25281u.remove(str3);
            return false;
        } catch (RuntimeException e25) {
            e = e25;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.f25285t) {
            }
            if (file.exists()) {
            }
            m23994j(str, file.getAbsolutePath(), str2, str4);
            f25281u.remove(str3);
            return false;
        }
    }
}
