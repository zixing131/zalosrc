package p359n8;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p153f8.C18821f;

/* renamed from: n8.g */
/* loaded from: classes.dex */
public class C23620g {

    /* renamed from: a */
    private final File f114483a;

    /* renamed from: b */
    private final File f114484b;

    /* renamed from: c */
    private final File f114485c;

    /* renamed from: d */
    private final File f114486d;

    /* renamed from: e */
    private final File f114487e;

    /* renamed from: f */
    private final File f114488f;

    public C23620g(Context context) {
        String str;
        String processName;
        File filesDir = context.getFilesDir();
        this.f114483a = filesDir;
        if (m123821v()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(".com.google.firebase.crashlytics.files.v2");
            sb2.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb2.append(m123820u(processName));
            str = sb2.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File m123816q = m123816q(new File(filesDir, str));
        this.f114484b = m123816q;
        this.f114485c = m123816q(new File(m123816q, "open-sessions"));
        this.f114486d = m123816q(new File(m123816q, "reports"));
        this.f114487e = m123816q(new File(m123816q, "priority-reports"));
        this.f114488f = m123816q(new File(m123816q, "native-reports"));
    }

    /* renamed from: a */
    private void m123814a(File file) {
        if (file.exists() && m123818s(file)) {
            C18821f.m98795f().m98796b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: n */
    private File m123815n(String str) {
        return m123817r(new File(this.f114485c, str));
    }

    /* renamed from: q */
    private static synchronized File m123816q(File file) {
        synchronized (C23620g.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    C18821f.m98795f().m98796b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    C18821f.m98795f().m98798d("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    private static File m123817r(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static boolean m123818s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m123818s(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: t */
    private static List m123819t(Object[] objArr) {
        if (objArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(objArr);
    }

    /* renamed from: u */
    static String m123820u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    /* renamed from: v */
    private static boolean m123821v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: b */
    public void m123822b() {
        m123814a(new File(this.f114483a, ".com.google.firebase.crashlytics"));
        m123814a(new File(this.f114483a, ".com.google.firebase.crashlytics-ndk"));
        if (m123821v()) {
            m123814a(new File(this.f114483a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    /* renamed from: c */
    public boolean m123823c(String str) {
        return m123818s(new File(this.f114485c, str));
    }

    /* renamed from: d */
    public List m123824d() {
        return m123819t(this.f114485c.list());
    }

    /* renamed from: e */
    public File m123825e(String str) {
        return new File(this.f114484b, str);
    }

    /* renamed from: f */
    public List m123826f(FilenameFilter filenameFilter) {
        return m123819t(this.f114484b.listFiles(filenameFilter));
    }

    /* renamed from: g */
    public File m123827g(String str) {
        return new File(this.f114488f, str);
    }

    /* renamed from: h */
    public List m123828h() {
        return m123819t(this.f114488f.listFiles());
    }

    /* renamed from: i */
    public File m123829i(String str) {
        return m123817r(new File(m123815n(str), "native"));
    }

    /* renamed from: j */
    public File m123830j(String str) {
        return new File(this.f114487e, str);
    }

    /* renamed from: k */
    public List m123831k() {
        return m123819t(this.f114487e.listFiles());
    }

    /* renamed from: l */
    public File m123832l(String str) {
        return new File(this.f114486d, str);
    }

    /* renamed from: m */
    public List m123833m() {
        return m123819t(this.f114486d.listFiles());
    }

    /* renamed from: o */
    public File m123834o(String str, String str2) {
        return new File(m123815n(str), str2);
    }

    /* renamed from: p */
    public List m123835p(String str, FilenameFilter filenameFilter) {
        return m123819t(m123815n(str).listFiles(filenameFilter));
    }
}
