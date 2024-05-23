package me0;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.io.File;

/* renamed from: me0.n1 */
/* loaded from: classes.dex */
public abstract class AbstractC23150n1 {
    /* renamed from: A */
    public static String m118866A() {
        return m118978x("/zalo/webcache/");
    }

    /* renamed from: A0 */
    public static String m118867A0() {
        m118947j1();
        return m118880H("/zalo/voice/");
    }

    /* renamed from: B */
    public static String m118868B() {
        m118947j1();
        return m118880H("/zalo/zinstant/");
    }

    /* renamed from: B0 */
    public static String m118869B0() {
        m118947j1();
        return m118880H("/zalo/video/");
    }

    /* renamed from: C */
    public static String m118870C() {
        return m118978x("/zalo/cachefile/");
    }

    /* renamed from: C0 */
    public static String m118871C0() {
        return m118976w("/zalo/paint", true);
    }

    /* renamed from: D */
    public static String m118872D() {
        return m118978x("/zalo/temp/");
    }

    /* renamed from: D0 */
    public static String m118873D0() {
        return m118976w("/zalo/picture/", true);
    }

    /* renamed from: E */
    public static String m118874E() {
        m118947j1();
        return m118880H("/zalo/temp/");
    }

    /* renamed from: E0 */
    private static String m118875E0(boolean z11) {
        File file;
        Context appContext = CoreUtility.getAppContext();
        if (z11) {
            return m118980y("/zalo/picture/", appContext);
        }
        File m118957n = m118957n(appContext);
        if (m118957n == null) {
            file = new File(appContext.getCacheDir() + "/zalo/picture/");
        } else {
            File file2 = new File(m118957n, "/zalo/picture/");
            if (!file2.canWrite()) {
                file = new File(appContext.getCacheDir() + "/zalo/picture/");
            } else {
                file = file2;
            }
        }
        return file.getAbsolutePath() + File.separator;
    }

    /* renamed from: F */
    public static String m118876F() {
        m118947j1();
        return m118880H(Environment.DIRECTORY_DOWNLOADS + "/zalo/");
    }

    /* renamed from: F0 */
    public static String m118877F0(boolean z11) {
        return m118976w("/zalo/picture/", z11);
    }

    /* renamed from: G */
    public static String m118878G() {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "/zalo/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator;
    }

    /* renamed from: G0 */
    public static String m118879G0(String str) {
        if (Build.VERSION.SDK_INT < 29) {
            return m118881H0(str);
        }
        return m118883I0(str);
    }

    /* renamed from: H */
    private static String m118880H(String str) {
        return m118964q(str).getAbsolutePath() + File.separator;
    }

    /* renamed from: H0 */
    private static String m118881H0(String str) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(externalStoragePublicDirectory.getPath());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        String sb3 = sb2.toString();
        File file = new File(sb3);
        if (!file.exists()) {
            file.mkdirs();
        }
        return sb3 + str2;
    }

    /* renamed from: I */
    private static String m118882I(String str) {
        return m118962p(str).getAbsolutePath() + File.separator;
    }

    /* renamed from: I0 */
    private static String m118883I0(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.DIRECTORY_PICTURES);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        return m118964q(sb2.toString()).toString() + str2;
    }

    /* renamed from: J */
    public static String m118884J() {
        return m118976w("/zalo/picture/galleryselect/", true);
    }

    /* renamed from: J0 */
    public static String m118885J0() {
        return m118978x("/zalo/sticker/");
    }

    /* renamed from: K */
    public static String m118886K() {
        return m118978x("/zalo/instant_upload/");
    }

    /* renamed from: K0 */
    public static String m118887K0() {
        return m118978x("/zalo/thumbs/");
    }

    /* renamed from: L */
    private static String m118888L(String str) {
        String str2 = CoreUtility.getAppContext().getFilesDir().getAbsolutePath() + "/" + str;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str2;
    }

    /* renamed from: L0 */
    public static String m118889L0() {
        return m118978x("/zalo/cacheimg/temp");
    }

    /* renamed from: M */
    private static String m118890M() {
        File file = new File(CoreUtility.getAppContext().getNoBackupFilesDir(), "leveldb-databases");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    /* renamed from: M0 */
    public static String m118891M0() {
        return m118978x("/zalo/downloads/temp_file/");
    }

    /* renamed from: N */
    public static String m118892N() {
        File file = new File(m118890M(), "/zalo-prefs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    /* renamed from: N0 */
    public static String m118893N0() {
        return m118976w("/zalo/picture/upload_temp/", true);
    }

    /* renamed from: O */
    public static String m118894O() {
        m118947j1();
        return m118880H("/zalo/log");
    }

    /* renamed from: O0 */
    public static String m118895O0() {
        return m118978x("/zalo/tensorflow");
    }

    /* renamed from: P */
    public static String m118896P() {
        return m118951l("/zalo/log") + File.separator;
    }

    /* renamed from: P0 */
    public static String m118897P0() {
        return m118978x("/zalo/theme/");
    }

    /* renamed from: Q */
    public static String m118898Q() {
        return m118888L("zalo/log/");
    }

    /* renamed from: Q0 */
    public static String m118899Q0() {
        return AbstractC23204s0.m119551b("/zalo/video/cache/zchannel/") + File.separator;
    }

    /* renamed from: R */
    public static File m118900R(String str) {
        File file = new File(Environment.getExternalStoragePublicDirectory(str), "/Zalo");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: R0 */
    public static String m118901R0() {
        return AbstractC23204s0.m119551b("/zalo/video/cache/default/") + File.separator;
    }

    /* renamed from: S */
    public static String m118902S() {
        return m118978x("/zalo/media_thumbs/");
    }

    /* renamed from: S0 */
    public static String m118903S0() {
        return AbstractC23204s0.m119551b("/zalo/video/cache/download/") + File.separator;
    }

    /* renamed from: T */
    public static String m118904T() {
        m118947j1();
        return m118880H("/zalo/media_thumbs/");
    }

    /* renamed from: T0 */
    public static String m118905T0() {
        return m118951l("/zalo/video/cache/") + File.separator;
    }

    /* renamed from: U */
    public static String m118906U() {
        return m118882I("/zalo/animfilter/");
    }

    /* renamed from: U0 */
    public static String m118907U0() {
        return AbstractC23204s0.m119551b("/zalo/video/cache/feed/") + File.separator;
    }

    /* renamed from: V */
    public static String m118908V() {
        return m118978x("/zalo/bg");
    }

    /* renamed from: V0 */
    public static String m118909V0() {
        return AbstractC23204s0.m119551b("/zalo/video/cache/gif/") + File.separator;
    }

    /* renamed from: W */
    public static String m118910W() {
        m118947j1();
        return m118880H("/zalo/bg");
    }

    /* renamed from: W0 */
    public static String m118911W0() {
        return AbstractC23204s0.m119551b("/zalo/video/cache/group/") + File.separator;
    }

    /* renamed from: X */
    public static String m118912X() {
        return m118962p(null).toString() + "/zalo/cacheimg/";
    }

    /* renamed from: X0 */
    public static String m118913X0() {
        return AbstractC23204s0.m119551b("/zalo/video/cache/oa/") + File.separator;
    }

    /* renamed from: Y */
    public static String m118914Y() {
        return m118978x("/zalo/data/");
    }

    /* renamed from: Y0 */
    public static String m118915Y0() {
        return AbstractC23204s0.m119551b("/zalo/video/cache/story/") + File.separator;
    }

    /* renamed from: Z */
    public static String m118916Z() {
        m118947j1();
        return m118880H("/zalo/data/");
    }

    /* renamed from: Z0 */
    public static String m118917Z0() {
        return m118976w("/zalo/video/chat/", true);
    }

    /* renamed from: a */
    private static File m118918a() {
        return Environment.getExternalStorageDirectory();
    }

    /* renamed from: a0 */
    public static String m118919a0() {
        m118947j1();
        return m118880H("/zalo/downloads/");
    }

    /* renamed from: a1 */
    public static String m118920a1() {
        return m118976w("/zalo/video/compressed/", true);
    }

    /* renamed from: b */
    public static String m118921b() {
        return m118978x("/zalo/animfilter/");
    }

    /* renamed from: b0 */
    public static String m118922b0() {
        return m118882I("/zalo/animation/");
    }

    /* renamed from: b1 */
    public static String m118923b1() {
        return m118976w("/zalo/video/feed/", true);
    }

    /* renamed from: c */
    public static String m118924c() {
        return m118978x("/zalo/audio/");
    }

    /* renamed from: c0 */
    public static String m118925c0() {
        return m118882I("/zalo/decor/");
    }

    /* renamed from: c1 */
    public static String m118926c1() {
        return m118976w("/zalo/video/log/", true);
    }

    /* renamed from: d */
    public static String m118927d() {
        return m118976w("/zalo/bg", true);
    }

    /* renamed from: d0 */
    public static String m118928d0() {
        return m118882I("/zalo/cachefile/");
    }

    /* renamed from: d1 */
    public static String m118929d1() {
        return m118976w("/zalo/video/story/", true);
    }

    /* renamed from: e */
    public static String m118930e(boolean z11) {
        return m118933f(z11, CoreUtility.getAppContext());
    }

    /* renamed from: e0 */
    public static String m118931e0() {
        return m118978x("/zalo/paint");
    }

    /* renamed from: e1 */
    public static String m118932e1() {
        return m118976w("/zalo/video/story/temp/", true);
    }

    /* renamed from: f */
    public static String m118933f(boolean z11, Context context) {
        File file;
        if (z11) {
            return m118980y("/zalo/cacheimg/", context);
        }
        File m118957n = m118957n(context);
        if (m118957n == null) {
            file = new File(context.getCacheDir() + "/zalo/cacheimg/");
        } else {
            File file2 = new File(m118957n, "/zalo/cacheimg/");
            if (!file2.canWrite()) {
                file = new File(context.getCacheDir() + "/zalo/cacheimg/");
            } else {
                file = file2;
            }
        }
        return file.getAbsolutePath() + File.separator;
    }

    /* renamed from: f0 */
    public static String m118934f0() {
        m118947j1();
        return m118880H("/zalo/paint");
    }

    /* renamed from: f1 */
    public static String m118935f1() {
        return m118976w("/zalo/video/compressed/temp/", true);
    }

    /* renamed from: g */
    public static String m118936g() {
        return m118976w("/zalo/data/", true);
    }

    /* renamed from: g0 */
    public static String m118937g0() {
        return m118875E0(true);
    }

    /* renamed from: g1 */
    public static String m118938g1() {
        return m118976w("/zalo/video/thumb/", true);
    }

    /* renamed from: h */
    public static String m118939h() {
        return m118976w("/zalo/downloads/", true);
    }

    /* renamed from: h0 */
    public static String m118940h0(boolean z11) {
        String file = m118964q(null).toString();
        if (z11) {
            m118947j1();
            File file2 = new File(file + "/zalo/picture/");
            if (!file2.exists()) {
                file2.mkdirs();
            }
        }
        return file + "/zalo/picture/";
    }

    /* renamed from: h1 */
    public static String m118941h1() {
        return m118976w("/zalo/video/thumb/temp/", true);
    }

    /* renamed from: i */
    public static String m118942i() {
        return m118880H(Environment.DIRECTORY_DOWNLOADS);
    }

    /* renamed from: i0 */
    public static String m118943i0() {
        return m118882I("/zalo/sticker/");
    }

    /* renamed from: i1 */
    public static String m118944i1() {
        return m118976w("/zalo/voice/", true);
    }

    /* renamed from: j */
    public static String m118945j() {
        return m118978x("/zalo/animation/");
    }

    /* renamed from: j0 */
    public static String m118946j0() {
        return m118882I("/zalo/thumbs/");
    }

    /* renamed from: j1 */
    public static String m118947j1() {
        return m118880H("/zalo/");
    }

    /* renamed from: k */
    public static String m118948k() {
        return m118978x("/zalo/decor/");
    }

    /* renamed from: k0 */
    public static String m118949k0() {
        m118869B0();
        return m118880H("/zalo/video/cache/chat/");
    }

    /* renamed from: k1 */
    public static String m118950k1() {
        return m118972u("/zalo/", true) + File.separator;
    }

    /* renamed from: l */
    public static String m118951l(String str) {
        return m118954m(str, CoreUtility.getAppContext());
    }

    /* renamed from: l0 */
    public static String m118952l0() {
        m118869B0();
        return m118880H("/zalo/video/cache/default/");
    }

    /* renamed from: l1 */
    public static String m118953l1() {
        m118947j1();
        return m118880H("/zalo/tm_pic/");
    }

    /* renamed from: m */
    private static String m118954m(String str, Context context) {
        File m118960o = m118960o(str, context);
        if (m118960o != null) {
            return m118960o.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: m0 */
    public static String m118955m0() {
        m118869B0();
        return m118880H("/zalo/video/cache/");
    }

    /* renamed from: m1 */
    public static String m118956m1() {
        File file = new File(AbstractC23204s0.m119551b("/zalo/tm_pic/"));
        if (!file.canWrite()) {
            file = new File(CoreUtility.getAppContext().getCacheDir() + "/zalo/tm_pic/");
        }
        return file.getAbsolutePath() + File.separator;
    }

    /* renamed from: n */
    private static File m118957n(Context context) {
        return context.getExternalCacheDir();
    }

    /* renamed from: n0 */
    public static String m118958n0() {
        m118869B0();
        return m118880H("/zalo/video/cache/feed/");
    }

    /* renamed from: n1 */
    public static String m118959n1() {
        return m118976w("/zalo/video/", true);
    }

    /* renamed from: o */
    private static File m118960o(String str, Context context) {
        File m118957n = m118957n(context);
        if (str != null && m118957n != null) {
            m118957n = new File(m118957n, str);
        }
        if (m118957n != null && !m118957n.exists()) {
            m118957n.mkdirs();
        }
        return m118957n;
    }

    /* renamed from: o0 */
    public static String m118961o0() {
        m118869B0();
        return m118880H("/zalo/video/cache/gif/");
    }

    /* renamed from: p */
    private static File m118962p(String str) {
        if (TextUtils.isEmpty(str)) {
            return m118918a();
        }
        return new File(m118918a(), str);
    }

    /* renamed from: p0 */
    public static String m118963p0() {
        m118869B0();
        return m118880H("/zalo/video/cache/oa/");
    }

    /* renamed from: q */
    private static File m118964q(String str) {
        File file;
        if (str == null) {
            file = m118918a();
        } else {
            file = new File(m118918a(), str);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: q0 */
    public static String m118965q0() {
        m118869B0();
        return m118880H("/zalo/video/cache/story/");
    }

    /* renamed from: r */
    public static File m118966r() {
        return m118968s(CoreUtility.getAppContext(), null);
    }

    /* renamed from: r0 */
    public static String m118967r0() {
        m118947j1();
        return m118880H("/zalo/video/chat/");
    }

    /* renamed from: s */
    private static File m118968s(Context context, String str) {
        return context.getExternalFilesDir(str);
    }

    /* renamed from: s0 */
    public static String m118969s0() {
        m118947j1();
        return m118880H("/zalo/video/compressed/");
    }

    /* renamed from: t */
    private static String m118970t(Context context, String str, boolean z11) {
        File m118968s = m118968s(context, str);
        if (m118968s != null) {
            if (!m118968s.exists() && z11) {
                m118968s.mkdirs();
            }
            return m118968s.getAbsolutePath();
        }
        return "";
    }

    /* renamed from: t0 */
    public static String m118971t0() {
        m118947j1();
        return m118880H("/zalo/video/download/");
    }

    /* renamed from: u */
    public static String m118972u(String str, boolean z11) {
        return m118970t(CoreUtility.getAppContext(), str, z11);
    }

    /* renamed from: u0 */
    public static String m118973u0() {
        m118947j1();
        return m118880H("/zalo/video/feed/");
    }

    /* renamed from: v */
    private static String m118974v(String str, Context context, boolean z11) {
        File file;
        String m118970t = m118970t(context, str, z11);
        if (!TextUtils.isEmpty(m118970t)) {
            file = new File(m118970t);
            if (!file.canWrite()) {
                file = context.getFilesDir();
            }
        } else {
            try {
                File file2 = new File(context.getFilesDir(), str);
                file2.mkdirs();
                file = file2;
            } catch (Exception e11) {
                File filesDir = context.getFilesDir();
                AbstractC20110a.m104539h(e11);
                file = filesDir;
            }
        }
        if (file != null) {
            return file.getAbsolutePath() + File.separator;
        }
        return "";
    }

    /* renamed from: v0 */
    public static String m118975v0() {
        m118947j1();
        return m118880H("/zalo/video/story/");
    }

    /* renamed from: w */
    public static String m118976w(String str, boolean z11) {
        return m118974v(str, CoreUtility.getAppContext(), z11);
    }

    /* renamed from: w0 */
    public static String m118977w0() {
        m118947j1();
        return m118880H("/zalo/video/story/temp/");
    }

    /* renamed from: x */
    public static String m118978x(String str) {
        return m118980y(str, CoreUtility.getAppContext());
    }

    /* renamed from: x0 */
    public static String m118979x0() {
        m118947j1();
        return m118880H("/zalo/video/compressed/temp/");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067 A[ORIG_RETURN, RETURN] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m118980y(String str, Context context) {
        File cacheDir;
        String m118954m = m118954m(str, context);
        if (!TextUtils.isEmpty(m118954m)) {
            cacheDir = new File(m118954m);
            if (!cacheDir.canWrite()) {
                try {
                    File file = new File(context.getCacheDir() + str);
                    try {
                        file.mkdirs();
                        cacheDir = file;
                    } catch (Exception e11) {
                        e = e11;
                        cacheDir = file;
                        AbstractC20110a.m104539h(e);
                        if (cacheDir == null) {
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
        } else {
            try {
                cacheDir = new File(context.getCacheDir(), str);
                cacheDir.mkdirs();
            } catch (Exception e13) {
                AbstractC20110a.m104539h(e13);
                cacheDir = context.getCacheDir();
            }
        }
        if (cacheDir == null) {
            return cacheDir.getAbsolutePath() + File.separator;
        }
        return "";
    }

    /* renamed from: y0 */
    public static String m118981y0() {
        m118947j1();
        return m118880H("/zalo/video/thumb/");
    }

    /* renamed from: z */
    public static File m118982z() {
        return m118964q(null);
    }

    /* renamed from: z0 */
    public static String m118983z0() {
        return m118978x("/zalo/voice/");
    }
}
