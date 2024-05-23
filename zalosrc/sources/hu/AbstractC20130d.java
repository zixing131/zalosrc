package hu;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23041d2;
import me0.AbstractC23150n1;
import me0.AbstractC23204s0;
import me0.AbstractC23238v2;
import mm0.AbstractC23352g;
import wi0.C29051a;

/* renamed from: hu.d */
/* loaded from: classes.dex */
public abstract class AbstractC20130d extends AbstractC23204s0 {

    /* renamed from: a */
    public static final String f99270a;

    /* renamed from: b */
    public static final String f99271b;

    /* renamed from: c */
    public static final String f99272c;

    /* renamed from: d */
    public static final String f99273d;

    /* renamed from: e */
    public static String f99274e;

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.DIRECTORY_PICTURES);
        String str = File.separator;
        sb2.append(str);
        sb2.append("Zalo");
        f99270a = sb2.toString();
        f99271b = Environment.DIRECTORY_MOVIES + str + "Zalo";
        f99272c = Environment.DIRECTORY_DOWNLOADS + str + "Zalo";
        f99273d = C29051a.f134591a.m145087g();
        f99274e = "";
    }

    /* renamed from: A */
    public static String m104819A(boolean z11) {
        return AbstractC23150n1.m118930e(z11);
    }

    /* renamed from: A0 */
    public static String m104820A0() {
        return AbstractC23150n1.m118909V0();
    }

    /* renamed from: B */
    public static String m104821B() {
        File file = new File(CoreUtility.getAppContext().getFilesDir().getAbsolutePath() + "/zalo/call/ringtones/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    /* renamed from: B0 */
    public static String m104822B0() {
        return AbstractC23150n1.m118913X0();
    }

    /* renamed from: C */
    public static String m104823C() {
        return C20131e.f99303a.m104961k();
    }

    /* renamed from: C0 */
    public static String m104824C0() {
        return AbstractC23150n1.m118915Y0();
    }

    /* renamed from: D */
    public static String m104825D() {
        return C20131e.f99303a.m104964m();
    }

    /* renamed from: D0 */
    public static String m104826D0() {
        return AbstractC23150n1.m118917Z0();
    }

    /* renamed from: E */
    public static String m104827E() {
        return AbstractC23150n1.m118942i();
    }

    /* renamed from: E0 */
    public static String m104828E0() {
        return C20131e.f99303a.m104963l0();
    }

    /* renamed from: F */
    public static String m104829F() {
        return C20131e.f99303a.m104967o();
    }

    /* renamed from: F0 */
    public static String m104830F0() {
        return C20131e.f99303a.m104965m0();
    }

    /* renamed from: G */
    public static String m104831G() {
        return C20131e.f99303a.m104969p();
    }

    /* renamed from: G0 */
    public static File m104832G0() {
        File file = new File(m104884n0().getAbsoluteFile(), "recordVideo");
        file.mkdirs();
        return file;
    }

    /* renamed from: H */
    public static String m104833H(String str) {
        return AbstractC23204s0.m119552c(str);
    }

    /* renamed from: H0 */
    public static String m104834H0() {
        return AbstractC23150n1.m118929d1();
    }

    /* renamed from: I */
    public static File m104835I() {
        return C20131e.f99303a.m104971s();
    }

    /* renamed from: I0 */
    public static String m104836I0() {
        return C20131e.f99303a.m104968o0();
    }

    /* renamed from: J */
    public static String m104837J(String str, boolean z11) {
        return AbstractC23150n1.m118976w(str, z11);
    }

    /* renamed from: J0 */
    public static String m104838J0() {
        String m104970p0 = C20131e.f99303a.m104970p0();
        AbstractC23204s0.m119550a(m104970p0);
        return m104970p0;
    }

    /* renamed from: K */
    public static String m104839K(String str) {
        return AbstractC23150n1.m118978x(str);
    }

    /* renamed from: K0 */
    public static String m104840K0() {
        return C20131e.m104922q0();
    }

    /* renamed from: L */
    public static String m104841L() {
        return AbstractC23150n1.m118866A();
    }

    /* renamed from: L0 */
    public static String m104842L0() {
        return AbstractC23150n1.m118947j1();
    }

    /* renamed from: M */
    public static String m104843M() {
        if (TextUtils.isEmpty(f99274e)) {
            f99274e = C20131e.f99303a.m104980y();
        }
        return f99274e;
    }

    /* renamed from: M0 */
    public static String m104844M0() {
        return AbstractC23150n1.m118950k1();
    }

    /* renamed from: N */
    public static String m104845N() {
        return AbstractC23150n1.m118868B();
    }

    /* renamed from: N0 */
    public static String m104846N0() {
        return AbstractC23150n1.m118953l1();
    }

    /* renamed from: O */
    public static String m104847O(boolean z11) {
        if (z11) {
            return m104845N();
        }
        return AbstractC23204s0.m119551b("/zalo/zinstant/");
    }

    /* renamed from: O0 */
    public static String m104848O0() {
        return AbstractC23150n1.m118956m1();
    }

    /* renamed from: P */
    public static String m104849P() {
        return C20131e.f99303a.m104945c();
    }

    /* renamed from: P0 */
    public static String m104850P0() {
        return AbstractC23150n1.m118959n1();
    }

    /* renamed from: Q */
    public static String m104851Q() {
        return AbstractC23150n1.m118874E();
    }

    /* renamed from: Q0 */
    public static boolean m104852Q0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith(m104839K(null)) && !str.startsWith(m104837J(null, false))) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    public static String m104853R() {
        return AbstractC23150n1.m118876F();
    }

    /* renamed from: R0 */
    public static boolean m104854R0(String str, String str2, List list) {
        try {
            return AbstractC23238v2.m119719d(new File(str), new File(str2), true, list);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: S */
    public static String m104855S() {
        return AbstractC23150n1.m118878G();
    }

    /* renamed from: S0 */
    public static void m104856S0(File file) {
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory()) {
                    File file2 = new File(file.getPath() + "_" + System.currentTimeMillis());
                    file.renameTo(file2);
                    m104887p(file2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: T */
    public static long m104857T(File file) {
        File[] listFiles;
        long m104857T;
        if (file == null) {
            return 0L;
        }
        try {
            if (!file.exists() || (listFiles = file.listFiles()) == null) {
                return 0L;
            }
            long j11 = 0;
            for (File file2 : listFiles) {
                if (file2 != null) {
                    if (file2.isFile()) {
                        m104857T = file2.length();
                    } else {
                        m104857T = m104857T(file2);
                    }
                    j11 += m104857T;
                }
            }
            return j11;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: T0 */
    public static void m104858T0(File file) {
        try {
            File file2 = new File(file.getPath() + "_" + System.currentTimeMillis());
            file.renameTo(file2);
            file2.delete();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: U */
    public static String m104859U() {
        return AbstractC23150n1.m118884J();
    }

    /* renamed from: U0 */
    public static boolean m104860U0(String str) {
        try {
            File file = new File(str);
            File[] listFiles = file.listFiles();
            if (!file.isDirectory() || listFiles == null) {
                return false;
            }
            if (listFiles.length <= 0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: V */
    public static String m104861V() {
        return AbstractC23150n1.m118886K();
    }

    /* renamed from: W */
    public static String m104862W() {
        return AbstractC23150n1.m118892N();
    }

    /* renamed from: X */
    public static String m104863X() {
        File file = new File(AbstractC23150n1.m118892N(), "/zin-e2e");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    /* renamed from: Y */
    public static String m104864Y() {
        return AbstractC23150n1.m118894O();
    }

    /* renamed from: Z */
    public static String m104865Z() {
        return AbstractC23150n1.m118896P();
    }

    /* renamed from: a0 */
    public static String m104866a0() {
        return AbstractC23150n1.m118898Q();
    }

    /* renamed from: b0 */
    public static File m104867b0(String str) {
        return AbstractC23150n1.m118900R(str);
    }

    /* renamed from: c0 */
    public static String m104868c0(String str) {
        return str + File.separator + "Zalo";
    }

    /* renamed from: d0 */
    public static String m104869d0() {
        return AbstractC23150n1.m118902S();
    }

    /* renamed from: e0 */
    public static String m104870e0() {
        return AbstractC23150n1.m118904T();
    }

    /* renamed from: f0 */
    public static String m104871f0() {
        return C20131e.f99303a.m104929K();
    }

    /* renamed from: g0 */
    public static String m104872g0() {
        return AbstractC23150n1.m118873D0();
    }

    /* renamed from: h0 */
    public static String m104873h0(boolean z11) {
        return AbstractC23150n1.m118877F0(z11);
    }

    /* renamed from: i0 */
    public static String m104874i0() {
        return C20131e.m104915T();
    }

    /* renamed from: j */
    public static String m104875j(File file) {
        return m104879l(file, false);
    }

    /* renamed from: j0 */
    public static String m104876j0() {
        return m104878k0("Zalo");
    }

    /* renamed from: k */
    public static String m104877k(File file) {
        return m104879l(file, false);
    }

    /* renamed from: k0 */
    public static String m104878k0(String str) {
        return AbstractC23150n1.m118879G0(str);
    }

    /* renamed from: l */
    private static String m104879l(File file, boolean z11) {
        if (!file.exists()) {
            return AbstractC23352g.m122788d("not exists");
        }
        if (file.isFile()) {
            if (z11) {
                return AbstractC23352g.m122788d(file.getName() + AbstractC23352g.m122785a(file));
            }
            return AbstractC23352g.m122785a(file);
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles.length == 0) {
                if (z11) {
                    return AbstractC23352g.m122788d(file.getName() + AbstractC23352g.m122788d("empty"));
                }
                return AbstractC23352g.m122788d("empty");
            }
            Arrays.sort(listFiles);
            StringBuilder sb2 = new StringBuilder();
            for (File file2 : listFiles) {
                sb2.append(m104879l(file2, true));
            }
            if (z11) {
                return AbstractC23352g.m122788d(file.getName() + ((Object) sb2));
            }
            return AbstractC23352g.m122788d("" + ((Object) sb2));
        }
        return AbstractC23352g.m122788d(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
    }

    /* renamed from: l0 */
    public static String m104880l0() {
        return AbstractC23150n1.m118885J0();
    }

    /* renamed from: m */
    public static String m104881m(File file) {
        return m104879l(file, false);
    }

    /* renamed from: m0 */
    public static String m104882m0() {
        return AbstractC23150n1.m118887K0();
    }

    /* renamed from: n */
    public static boolean m104883n(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    if (listFiles.length != 1 || !".nomedia".equals(listFiles[0].getName())) {
                        return false;
                    }
                    return AbstractC23041d2.m118210i(file);
                }
                return file.delete();
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: n0 */
    public static File m104884n0() {
        File file = new File(AbstractC23204s0.m119555f());
        file.mkdirs();
        return file;
    }

    /* renamed from: o */
    public static void m104885o() {
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC23204s0.m119550a(m104859U());
            AbstractC23204s0.m119550a(m104823C());
            AbstractC23204s0.m119550a(m104871f0());
            AbstractC23204s0.m119550a(m104897u());
            AbstractC23204s0.m119550a(m104840K0());
            C20131e c20131e = C20131e.f99303a;
            AbstractC23204s0.m119550a(c20131e.m104946c0());
            AbstractC23204s0.m119550a(c20131e.m104942a0());
            AbstractC23204s0.m119550a(c20131e.m104953g());
            AbstractC23204s0.m119550a(m104874i0());
            AbstractC23204s0.m119550a(m104886o0());
            AbstractC23204s0.m119550a(m104905y());
            AbstractC23204s0.m119550a(m104842L0());
            AbstractC23204s0.m119550a(m104906y0());
            AbstractC23204s0.m119550a(m104830F0());
            AbstractC23204s0.m119550a(m104829F());
            AbstractC23204s0.m119550a(m104831G());
            AbstractC23204s0.m119550a(m104895t());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC23204s0.m119552c(null));
        String str = File.separator;
        sb2.append(str);
        AbstractC23204s0.m119550a(sb2.toString());
        File m104835I = m104835I();
        if (m104835I != null) {
            AbstractC23204s0.m119550a(m104835I.getAbsolutePath() + str);
        }
    }

    /* renamed from: o0 */
    public static String m104886o0() {
        return C20131e.f99303a.m104948d0();
    }

    /* renamed from: p */
    public static boolean m104887p(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null && list.length > 0) {
            for (String str : list) {
                File file2 = new File(file, str);
                if (file2.isDirectory()) {
                    m104887p(file2);
                } else {
                    file2.delete();
                }
            }
        }
        return file.delete();
    }

    /* renamed from: p0 */
    public static File m104888p0() {
        return m104890q0("");
    }

    /* renamed from: q */
    public static boolean m104889q(String str) {
        return m104887p(new File(str));
    }

    /* renamed from: q0 */
    public static File m104890q0(String str) {
        return new File(m104884n0(), str + System.currentTimeMillis());
    }

    /* renamed from: r */
    public static long m104891r(String str) {
        File file = new File(str);
        if (file.exists()) {
            long m104857T = m104857T(file);
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    AbstractC23041d2.m118211j(file2);
                }
            }
            return m104857T;
        }
        return 0L;
    }

    /* renamed from: r0 */
    public static String m104892r0() {
        return C20131e.f99303a.m104952f0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(6:15|16|(1:18)|19|21|(1:(4:24|(1:28)|29|30)(1:31))(2:32|33))|37|16|(0)|19|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:            r5 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:            r0 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:            ho0.AbstractC20110a.m104539h(r5);     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:3:0x0001, B:7:0x0012, B:9:0x001d, B:12:0x0025, B:16:0x002e, B:18:0x0034, B:19:0x0037), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d A[Catch: Exception -> 0x004a, TRY_LEAVE, TryCatch #1 {Exception -> 0x004a, blocks: (B:24:0x003f, B:26:0x0045, B:32:0x004d), top: B:21:0x003b }] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m104893s(String str, String str2) {
        File file;
        File file2;
        boolean z11;
        boolean renameTo;
        boolean z12 = false;
        try {
            file = new File(str);
            file2 = new File(str2);
        } catch (Exception e11) {
            e = e11;
        }
        if (!file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (file.exists() && file.isDirectory() && listFiles != null && listFiles.length != 0) {
            z11 = false;
            if (!file2.exists()) {
                file2.mkdirs();
            }
            renameTo = file.renameTo(file2);
            if (!renameTo) {
                if (!z11) {
                    File[] listFiles2 = file2.listFiles();
                    if (listFiles2 != null && listFiles2.length > 0) {
                        z12 = true;
                    }
                    return z12;
                }
                return renameTo;
            }
            AbstractC20110a.m104535d("rename fail ..... %s", str2);
            return renameTo;
        }
        z11 = true;
        if (!file2.exists()) {
        }
        renameTo = file.renameTo(file2);
        if (!renameTo) {
        }
    }

    /* renamed from: s0 */
    public static String m104894s0() {
        return C20131e.f99303a.m104954g0();
    }

    /* renamed from: t */
    public static String m104895t() {
        return C20131e.f99303a.m104941a();
    }

    /* renamed from: t0 */
    public static String m104896t0() {
        return AbstractC23150n1.m118895O0();
    }

    /* renamed from: u */
    public static String m104897u() {
        return C20131e.f99303a.m104943b();
    }

    /* renamed from: u0 */
    public static String m104898u0() {
        return AbstractC23150n1.m118897P0();
    }

    /* renamed from: v */
    public static String m104899v() {
        return AbstractC23150n1.m118927d();
    }

    /* renamed from: v0 */
    public static File m104900v0(String str) {
        return new File(AbstractC23204s0.m119557h() + File.separator + str + System.currentTimeMillis() + ".mp4");
    }

    /* renamed from: w */
    public static String m104901w() {
        return m104899v();
    }

    /* renamed from: w0 */
    public static String m104902w0() {
        return AbstractC23150n1.m118901R0();
    }

    /* renamed from: x */
    public static String m104903x(boolean z11, Context context) {
        return AbstractC23150n1.m118933f(z11, context);
    }

    /* renamed from: x0 */
    public static File m104904x0() {
        String m104962k0 = C20131e.f99303a.m104962k0();
        File file = new File(m104962k0);
        AbstractC23204s0.m119550a(m104962k0);
        return file;
    }

    /* renamed from: y */
    public static String m104905y() {
        return C20131e.f99303a.m104925B();
    }

    /* renamed from: y0 */
    public static String m104906y0() {
        return C20131e.f99303a.m104960j0();
    }

    /* renamed from: z */
    public static String m104907z(Context context) {
        return m104903x(true, context);
    }

    /* renamed from: z0 */
    public static String m104908z0() {
        return AbstractC23150n1.m118907U0();
    }
}
