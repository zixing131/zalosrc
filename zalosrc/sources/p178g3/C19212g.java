package p178g3;

import android.content.Context;
import android.os.Environment;
import com.adtima.Adtima;
import java.io.File;
import p009a3.C0097b;
import p227i3.C20215s;
import p667y2.C30267d;

/* renamed from: g3.g */
/* loaded from: classes2.dex */
public class C19212g {

    /* renamed from: b */
    private static final String f95655b = "g";

    /* renamed from: c */
    private static C19212g f95656c = null;

    /* renamed from: d */
    public static int f95657d = 0;

    /* renamed from: e */
    public static String f95658e = "";

    /* renamed from: f */
    public static int f95659f = 0;

    /* renamed from: g */
    public static int f95660g = 1;

    /* renamed from: h */
    public static int f95661h = 1;

    /* renamed from: a */
    private Context f95662a;

    private C19212g(Context context) {
        this.f95662a = context;
        m100813v();
        if (f95657d != 0) {
            m100812u();
        }
    }

    /* renamed from: a */
    private void m100808a(File file) {
        try {
            if (m100809e(file)) {
                return;
            }
            m100810g(file);
        } catch (Exception e11) {
            try {
                m100810g(file);
            } catch (Exception unused) {
            }
            Adtima.m18329e(f95655b, "deleteFiles", e11);
        }
    }

    /* renamed from: e */
    private boolean m100809e(File file) {
        try {
            if (file.exists()) {
                int waitFor = Runtime.getRuntime().exec("rm -r " + file.getAbsolutePath()).waitFor();
                r0 = waitFor == 0;
                Adtima.m18328e(f95655b, "deleteFilesByCommand with exit code " + waitFor);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f95655b, "deleteFilesByCommand", e11);
        }
        return r0;
    }

    /* renamed from: g */
    private void m100810g(File file) {
        File[] listFiles;
        try {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m100810g(file2);
                    }
                }
            }
            file.delete();
        } catch (Exception e11) {
            Adtima.m18329e(f95655b, "deleteFilesRecursive", e11);
        }
    }

    /* renamed from: q */
    public static C19212g m100811q() {
        if (f95656c == null) {
            f95656c = new C19212g(Adtima.SharedContext);
        }
        return f95656c;
    }

    /* renamed from: u */
    private void m100812u() {
        try {
            m100823m();
        } catch (Exception unused) {
        }
        try {
            m100820j();
        } catch (Exception unused2) {
        }
        try {
            m100821k();
        } catch (Exception unused3) {
        }
        try {
            m100822l();
        } catch (Exception unused4) {
        }
    }

    /* renamed from: v */
    private void m100813v() {
        try {
            m100827r();
        } catch (Exception unused) {
        }
        try {
            m100817f();
        } catch (Exception unused2) {
        }
        try {
            m100825o();
        } catch (Exception unused3) {
        }
        try {
            m100826p();
        } catch (Exception unused4) {
        }
        try {
            m100819i();
        } catch (Exception unused5) {
        }
    }

    /* renamed from: b */
    public boolean m100814b() {
        try {
            File file = new File(m100819i());
            if (file.listFiles().length > 100) {
                m100808a(file);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m100815c(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public boolean m100816d() {
        try {
            m100808a(new File(m100828s()));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public String m100817f() {
        String str = m100829t() + "/css/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* renamed from: h */
    public String m100818h() {
        try {
            return (Environment.getExternalStorageState().equals("mounted") ? this.f95662a.getExternalCacheDir() : this.f95662a.getCacheDir()).getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    public String m100819i() {
        String str;
        File file;
        try {
            str = m100818h() + "/cache/";
            file = new File(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (file.exists()) {
            return str;
        }
        if (file.mkdirs()) {
            return str;
        }
        return null;
    }

    /* renamed from: j */
    public String m100820j() {
        String str = m100824n() + "/css/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* renamed from: k */
    public String m100821k() {
        String str = m100824n() + "/html/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* renamed from: l */
    public String m100822l() {
        String str = m100824n() + "/img/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* renamed from: m */
    public String m100823m() {
        String str = m100824n() + "/map/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* renamed from: n */
    public String m100824n() {
        String str = null;
        try {
            str = this.f95662a.getFilesDir().getAbsolutePath() + "/zad_" + Adtima.SDK_DOWNLOAD_VERSION_CODE + "_" + f95657d;
            f95658e = str;
            return str;
        } catch (Exception e11) {
            Adtima.m18329e(f95655b, "getTemplateRootPath", e11);
            return str;
        }
    }

    /* renamed from: o */
    public String m100825o() {
        String str = m100829t() + "/html/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* renamed from: p */
    public String m100826p() {
        String str = m100829t() + "/img/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* renamed from: r */
    public String m100827r() {
        String str = m100829t() + "/map/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* renamed from: s */
    public String m100828s() {
        String str = null;
        try {
            str = C30267d.m149339A().m149343E();
            Adtima.m18328e(f95655b, "getOldTemplateRootPath: " + str);
            return str;
        } catch (Exception e11) {
            Adtima.m18329e(f95655b, "getOldTemplateRootPath", e11);
            return str;
        }
    }

    /* renamed from: t */
    public String m100829t() {
        StringBuilder sb2;
        String str;
        try {
            if (f95661h != f95660g) {
                return f95658e;
            }
            C0097b m105518m = C20215s.m105509k().m105518m();
            if (m105518m != null) {
                if (C30267d.m149339A().m149345G() < 58) {
                    sb2 = new StringBuilder();
                    sb2.append(this.f95662a.getFilesDir().getAbsolutePath());
                    str = "/template";
                    sb2.append(str);
                    return sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f95662a.getFilesDir().getAbsolutePath());
                sb3.append("/zad_");
                sb3.append(Adtima.SDK_VERSION_CODE);
                sb3.append("_");
                sb3.append(m105518m.f460a);
                sb2 = sb3;
                return sb2.toString();
            }
            if (f95657d != 0) {
                sb2 = new StringBuilder();
                sb2.append(this.f95662a.getFilesDir().getAbsolutePath());
                sb2.append("/zad_");
                sb2.append(Adtima.SDK_VERSION_CODE);
                sb2.append("_");
                sb2.append(f95657d);
                return sb2.toString();
            }
            sb2 = new StringBuilder();
            sb2.append(this.f95662a.getFilesDir().getAbsolutePath());
            sb2.append("/zad_");
            sb2.append(Adtima.SDK_VERSION_CODE);
            str = "_1";
            sb2.append(str);
            return sb2.toString();
        } catch (Exception e11) {
            Adtima.m18329e(f95655b, "getTemplateRootPath", e11);
            return null;
        }
    }
}
