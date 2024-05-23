package p231i7;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: i7.g */
/* loaded from: classes.dex */
public final class C20363g {

    /* renamed from: a */
    private final long f100377a;

    /* renamed from: b */
    private final Context f100378b;

    /* renamed from: c */
    private File f100379c;

    public C20363g(Context context) {
        this.f100378b = context;
        this.f100377a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: l */
    public static void m106125l(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m106125l(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    /* renamed from: m */
    public static void m106126m(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    /* renamed from: p */
    public static boolean m106127p(File file) {
        if (!file.canWrite()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private static File m106128q(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: r */
    private final File m106129r() {
        File file = new File(m106134w(), "native-libraries");
        m106132u(file);
        return file;
    }

    /* renamed from: s */
    private final File m106130s(String str) {
        File m106128q = m106128q(m106129r(), str);
        m106132u(m106128q);
        return m106128q;
    }

    /* renamed from: t */
    private final File m106131t() {
        File file = new File(m106134w(), "verified-splits");
        m106132u(file);
        return file;
    }

    /* renamed from: u */
    private static File m106132u(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
        file.mkdirs();
        if (file.isDirectory()) {
            return file;
        }
        throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
    }

    /* renamed from: v */
    private final File m106133v() {
        if (this.f100379c == null) {
            Context context = this.f100378b;
            if (context != null) {
                this.f100379c = context.getFilesDir();
            } else {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
        }
        File file = new File(this.f100379c, "splitcompat");
        m106132u(file);
        return file;
    }

    /* renamed from: w */
    private final File m106134w() {
        File file = new File(m106133v(), Long.toString(this.f100377a));
        m106132u(file);
        return file;
    }

    /* renamed from: x */
    private static String m106135x(String str) {
        return String.valueOf(str).concat(".apk");
    }

    /* renamed from: a */
    public final File m106136a(String str) {
        File file = new File(m106134w(), "dex");
        m106132u(file);
        File m106128q = m106128q(file, str);
        m106132u(m106128q);
        return m106128q;
    }

    /* renamed from: b */
    public final File m106137b() {
        File file = new File(m106134w(), "unverified-splits");
        m106132u(file);
        return file;
    }

    /* renamed from: c */
    public final File m106138c(String str, String str2) {
        return m106128q(m106130s(str), str2);
    }

    /* renamed from: d */
    public final File m106139d() {
        return new File(m106134w(), "lock.tmp");
    }

    /* renamed from: e */
    public final File m106140e(String str) {
        return m106128q(m106137b(), m106135x(str));
    }

    /* renamed from: f */
    public final File m106141f(File file) {
        return m106128q(m106131t(), file.getName());
    }

    /* renamed from: g */
    public final File m106142g(String str) {
        return m106128q(m106131t(), m106135x(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final List m106143h() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = m106129r().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final Set m106144i(String str) {
        HashSet hashSet = new HashSet();
        File[] listFiles = m106130s(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final Set m106145j() {
        File m106131t = m106131t();
        HashSet hashSet = new HashSet();
        File[] listFiles = m106131t.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && m106127p(file)) {
                    hashSet.add(new C20360d(file, file.getName().substring(0, r5.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: k */
    public final void m106146k() {
        File m106133v = m106133v();
        String[] list = m106133v.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f100377a))) {
                    File file = new File(m106133v, str);
                    String obj = file.toString();
                    long j11 = this.f100377a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("FileStorage: removing directory for different version code (directory = ");
                    sb2.append(obj);
                    sb2.append(", current version code = ");
                    sb2.append(j11);
                    sb2.append(")");
                    m106125l(file);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final void m106147n(String str) {
        m106125l(m106130s(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final void m106148o(File file) {
        if (file.getParentFile().getParentFile().equals(m106129r())) {
            m106125l(file);
            return;
        }
        throw new IllegalStateException("File to remove is not a native library");
    }
}
