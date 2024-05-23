package th;

import android.text.TextUtils;
import com.zing.zalo.config.VideoNativeCompressConfig;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p547uh.C27260a;
import p547uh.C27261b;
import p576vh.C28251a;
import p576vh.C28252b;
import p576vh.C28253c;

/* renamed from: th.j */
/* loaded from: classes.dex */
public abstract class AbstractC26689j {

    /* renamed from: a */
    public static boolean f126435a = false;

    /* renamed from: b */
    public static boolean f126436b = false;

    /* renamed from: c */
    public static int f126437c = 1;

    /* renamed from: d */
    private static boolean f126438d = true;

    /* renamed from: e */
    private static boolean f126439e = true;

    /* renamed from: f */
    private static int f126440f = 0;

    /* renamed from: g */
    private static boolean f126441g = false;

    /* renamed from: h */
    private static int f126442h;

    /* renamed from: i */
    private static final C28252b f126443i = new C28252b();

    /* renamed from: j */
    private static final C28252b f126444j = new C28252b();

    /* renamed from: k */
    private static final C28252b f126445k = new C28252b();

    /* renamed from: l */
    private static final C28253c f126446l = new C28253c();

    /* renamed from: m */
    private static final C28252b f126447m = new C28251a();

    /* renamed from: n */
    private static final C27260a f126448n = new C27260a();

    /* renamed from: o */
    private static final C27260a f126449o = new C27260a();

    /* renamed from: p */
    private static final C27260a f126450p = new C27260a();

    /* renamed from: q */
    private static final C27260a f126451q = new C27261b();

    /* renamed from: r */
    private static final C27260a f126452r = new C27260a();

    /* renamed from: A */
    public static int m137074A(int i11) {
        return m137081H(i11).mo142247j();
    }

    /* renamed from: B */
    public static int m137075B(int i11) {
        return m137081H(i11).mo142248k();
    }

    /* renamed from: C */
    public static int m137076C(int i11) {
        return m137081H(i11).mo142249l();
    }

    /* renamed from: D */
    public static float m137077D(int i11) {
        return m137106o(i11).m40335i();
    }

    /* renamed from: E */
    public static int m137078E() {
        return f126450p.m139531a();
    }

    /* renamed from: F */
    public static int m137079F() {
        return f126450p.mo139532b();
    }

    /* renamed from: G */
    public static C26692m m137080G(int i11) {
        return m137082I(i11).mo142238a();
    }

    /* renamed from: H */
    public static C28252b m137081H(int i11) {
        if (i11 == 2) {
            return f126444j;
        }
        if (i11 == 3) {
            return f126445k;
        }
        if (i11 == 1) {
            return f126446l;
        }
        if (i11 != 0 && i11 == 4) {
            return f126447m;
        }
        return f126443i;
    }

    /* renamed from: I */
    private static C28252b m137082I(int i11) {
        C28252b m137081H = m137081H(i11);
        if (i11 == 1 && !f126441g) {
            return f126443i;
        }
        return m137081H;
    }

    /* renamed from: J */
    public static float m137083J(int i11) {
        return m137081H(i11).mo142239b();
    }

    /* renamed from: K */
    public static long m137084K(int i11) {
        int m137115x;
        if (f126436b) {
            m137115x = m137113v(i11);
        } else {
            m137115x = m137115x(i11);
        }
        return m137115x;
    }

    /* renamed from: L */
    public static boolean m137085L() {
        return f126441g;
    }

    /* renamed from: M */
    public static boolean m137086M() {
        return f126438d;
    }

    /* renamed from: N */
    public static boolean m137087N() {
        return f126439e;
    }

    /* renamed from: O */
    public static boolean m137088O(int i11) {
        return m137081H(i11).mo142241d();
    }

    /* renamed from: P */
    public static boolean m137089P(int i11) {
        return i11 == 2;
    }

    /* renamed from: Q */
    public static void m137090Q(String str) {
        boolean z11;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("chat");
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble("chat_normal_jpeg_quality");
                if (!Double.isNaN(optDouble)) {
                    optJSONObject.put("normal_jpeg_quality", optDouble);
                }
                double optDouble2 = optJSONObject.optDouble("chat_hd_jpeg_quality");
                if (!Double.isNaN(optDouble2)) {
                    optJSONObject.put("hd_jpeg_quality", optDouble2);
                }
                f126448n.m139538h(optJSONObject);
                f126451q.m139538h(optJSONObject);
                f126440f = optJSONObject.optInt("dynamic_photo_by_area", 0);
                boolean z12 = true;
                if (optJSONObject.optInt("photo_hd_from_camera", 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f126438d = z11;
                if (optJSONObject.optInt("sort_group_photo_video", 1) != 1) {
                    z12 = false;
                }
                f126439e = z12;
                f126442h = optJSONObject.optInt("preview_thumb_limit", 0);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("feed");
            if (optJSONObject2 != null) {
                f126449o.m139538h(optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("story");
            if (optJSONObject3 != null) {
                f126450p.m139538h(optJSONObject3);
            }
            if (jSONObject.has("jpegQuality")) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("normal_jpeg_quality", jSONObject.optInt("jpegQuality") / 100.0f);
                f126452r.m139538h(jSONObject2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public static void m137091R(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            boolean z11 = false;
            try {
                if (f126435a) {
                    AbstractC20110a.m104542k(8, jSONObject.toString(), new Object[0]);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("chat");
            if (optJSONObject != null) {
                f126443i.mo142260m(optJSONObject);
                if (optJSONObject.optInt("sendVideoHdEnable", 0) == 1) {
                    z11 = true;
                }
                f126441g = z11;
                f126446l.mo142260m(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("feed");
            if (optJSONObject2 != null) {
                f126444j.mo142260m(optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("story");
            if (optJSONObject3 != null) {
                f126445k.mo142260m(optJSONObject3);
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("zchannel");
            if (optJSONObject4 != null) {
                f126447m.mo142260m(optJSONObject4);
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: a */
    public static int m137092a() {
        return f126451q.m139531a();
    }

    /* renamed from: b */
    public static int m137093b() {
        return f126448n.m139531a();
    }

    /* renamed from: c */
    public static int m137094c() {
        return f126451q.m139533c();
    }

    /* renamed from: d */
    public static int m137095d() {
        return f126448n.m139533c();
    }

    /* renamed from: e */
    public static float m137096e() {
        return f126448n.m139534d();
    }

    /* renamed from: f */
    public static float m137097f() {
        return f126448n.m139535e();
    }

    /* renamed from: g */
    public static int m137098g() {
        return f126451q.m139537g();
    }

    /* renamed from: h */
    public static int m137099h() {
        return f126448n.m139537g();
    }

    /* renamed from: i */
    public static int m137100i() {
        return f126440f;
    }

    /* renamed from: j */
    public static int m137101j() {
        return f126449o.m139531a();
    }

    /* renamed from: k */
    public static int m137102k() {
        return f126449o.mo139532b();
    }

    /* renamed from: l */
    public static int m137103l() {
        return f126452r.m139531a();
    }

    /* renamed from: m */
    public static int m137104m() {
        return f126451q.mo139532b();
    }

    /* renamed from: n */
    public static int m137105n() {
        return f126448n.mo139532b();
    }

    /* renamed from: o */
    public static VideoNativeCompressConfig m137106o(int i11) {
        return m137082I(i11).mo142240c();
    }

    /* renamed from: p */
    public static int m137107p(int i11) {
        return m137106o(i11).m40331d();
    }

    /* renamed from: q */
    public static int m137108q(int i11) {
        return m137082I(i11).mo142242e();
    }

    /* renamed from: r */
    public static int m137109r() {
        return f126451q.mo139536f();
    }

    /* renamed from: s */
    public static int m137110s() {
        return f126448n.mo139536f();
    }

    /* renamed from: t */
    private static C27260a m137111t(int i11) {
        return i11 == 0 ? f126448n : i11 == 1 ? f126451q : i11 == 2 ? f126449o : i11 == 3 ? f126450p : f126448n;
    }

    /* renamed from: u */
    public static int m137112u(int i11) {
        return m137111t(i11).mo139536f();
    }

    /* renamed from: v */
    public static int m137113v(int i11) {
        return m137081H(i11).mo142243f();
    }

    /* renamed from: w */
    public static int m137114w(int i11) {
        return m137081H(i11).mo142244g();
    }

    /* renamed from: x */
    public static int m137115x(int i11) {
        return m137081H(i11).mo142245h();
    }

    /* renamed from: y */
    public static int m137116y(int i11) {
        return m137081H(i11).mo142246i();
    }

    /* renamed from: z */
    public static int m137117z() {
        return f126442h;
    }
}
