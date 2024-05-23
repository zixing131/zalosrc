package me0;

import ag0.AbstractC0837p0;
import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.androidquery.util.AbstractC3972e;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.AbstractC23309i;
import p379o3.AbstractC24006q;
import p379o3.AbstractRunnableC23992c;
import p379o3.C23999j;
import p414p3.AbstractC24621a;
import p436q3.EnumC25103a;
import p502s3.C26117c;
import s00.AbstractC26080o;

/* renamed from: me0.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC23006a0 {

    /* renamed from: A */
    protected static int f111882A = 0;

    /* renamed from: B */
    protected static int f111883B = 0;

    /* renamed from: C */
    protected static int f111884C = 0;

    /* renamed from: D */
    protected static int f111885D = 0;

    /* renamed from: E */
    protected static int f111886E = 0;

    /* renamed from: F */
    protected static int f111887F = 0;

    /* renamed from: G */
    protected static int f111888G = 0;

    /* renamed from: H */
    protected static int f111889H = 0;

    /* renamed from: I */
    protected static int f111890I = 0;

    /* renamed from: J */
    protected static int f111891J = 0;

    /* renamed from: K */
    protected static int f111892K = 0;

    /* renamed from: L */
    protected static int f111893L = 0;

    /* renamed from: M */
    protected static int f111894M = 0;

    /* renamed from: N */
    protected static int f111895N = 0;

    /* renamed from: O */
    protected static int f111896O = 0;

    /* renamed from: P */
    protected static int f111897P = 0;

    /* renamed from: Q */
    protected static int f111898Q = 0;

    /* renamed from: R */
    protected static int f111899R = 0;

    /* renamed from: S */
    protected static int f111900S = 0;

    /* renamed from: T */
    protected static int f111901T = 0;

    /* renamed from: U */
    protected static int f111902U = 0;

    /* renamed from: V */
    protected static int f111903V = 0;

    /* renamed from: W */
    protected static int f111904W = 0;

    /* renamed from: X */
    protected static int f111905X = 0;

    /* renamed from: Y */
    protected static int f111906Y = 0;

    /* renamed from: Z */
    protected static int f111907Z = 0;

    /* renamed from: a */
    public static final String f111908a = "a0";

    /* renamed from: a0 */
    protected static int f111909a0;

    /* renamed from: b0 */
    protected static int f111911b0;

    /* renamed from: d */
    protected static int f111914d;

    /* renamed from: e */
    protected static int f111916e;

    /* renamed from: f */
    protected static int f111918f;

    /* renamed from: f0 */
    protected static int f111919f0;

    /* renamed from: g */
    protected static int f111920g;

    /* renamed from: g0 */
    protected static int f111921g0;

    /* renamed from: h */
    protected static int f111922h;

    /* renamed from: h0 */
    protected static int f111923h0;

    /* renamed from: i */
    protected static int f111924i;

    /* renamed from: i0 */
    protected static int f111925i0;

    /* renamed from: j */
    protected static int f111926j;

    /* renamed from: j0 */
    protected static int f111927j0;

    /* renamed from: k */
    protected static int f111928k;

    /* renamed from: k0 */
    protected static int f111929k0;

    /* renamed from: l */
    protected static int f111930l;

    /* renamed from: l0 */
    protected static int f111931l0;

    /* renamed from: m */
    protected static int f111932m;

    /* renamed from: m0 */
    private static float f111933m0;

    /* renamed from: n */
    private static int f111934n;

    /* renamed from: n0 */
    private static float f111935n0;

    /* renamed from: o */
    protected static int f111936o;

    /* renamed from: o0 */
    private static float f111937o0;

    /* renamed from: p */
    protected static int f111938p;

    /* renamed from: p0 */
    private static int f111939p0;

    /* renamed from: q */
    protected static int f111940q;

    /* renamed from: q0 */
    private static int f111941q0;

    /* renamed from: r */
    protected static int f111942r;

    /* renamed from: r0 */
    private static int f111943r0;

    /* renamed from: s */
    protected static int f111944s;

    /* renamed from: s0 */
    private static int f111945s0;

    /* renamed from: t */
    protected static int f111946t;

    /* renamed from: t0 */
    private static int f111947t0;

    /* renamed from: u */
    protected static int f111948u;

    /* renamed from: u0 */
    private static int f111949u0;

    /* renamed from: v */
    protected static int f111950v;

    /* renamed from: v0 */
    private static int f111951v0;

    /* renamed from: w */
    protected static int f111952w;

    /* renamed from: x */
    protected static int f111953x;

    /* renamed from: y */
    protected static int f111954y;

    /* renamed from: z */
    protected static int f111955z;

    /* renamed from: b */
    public static final int[] f111910b = {960, 640, 480, 420, 360, 320, 260, 240, 230, 160, 120};

    /* renamed from: c */
    public static int f111912c = 0;

    /* renamed from: c0 */
    protected static int f111913c0 = 160;

    /* renamed from: d0 */
    protected static int f111915d0 = 160;

    /* renamed from: e0 */
    protected static int f111917e0 = 240;

    /* renamed from: me0.a0$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f111956a;

        static {
            int[] iArr = new int[EnumC25103a.values().length];
            f111956a = iArr;
            try {
                iArr[EnumC25103a.BigCache.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f111956a[EnumC25103a.MediumCache.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f111956a[EnumC25103a.BitmapPool.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f111956a[EnumC25103a.SmallCache.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f111956a[EnumC25103a.StickerCache.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: A */
    public static int m117871A() {
        return f111955z;
    }

    /* renamed from: B */
    public static int m117872B() {
        return f111892K;
    }

    /* renamed from: C */
    public static int m117873C() {
        return f111890I;
    }

    /* renamed from: D */
    public static int m117874D() {
        return f111891J;
    }

    /* renamed from: E */
    public static int m117875E() {
        return f111900S;
    }

    /* renamed from: F */
    public static int m117876F() {
        return f111901T;
    }

    /* renamed from: G */
    public static int m117877G() {
        return f111904W;
    }

    /* renamed from: H */
    public static int m117878H() {
        return f111921g0;
    }

    /* renamed from: I */
    public static int m117879I() {
        return f111923h0;
    }

    /* renamed from: J */
    public static int m117880J() {
        return f111925i0;
    }

    /* renamed from: K */
    public static int m117881K() {
        return f111927j0;
    }

    /* renamed from: L */
    public static int m117882L() {
        return f111895N;
    }

    /* renamed from: M */
    public static int m117883M() {
        return f111919f0;
    }

    /* renamed from: N */
    public static int m117884N() {
        return f111929k0;
    }

    /* renamed from: O */
    public static int m117885O() {
        return f111931l0;
    }

    /* renamed from: P */
    public static int m117886P() {
        return f111907Z;
    }

    /* renamed from: Q */
    public static int m117887Q() {
        return f111909a0;
    }

    /* renamed from: R */
    public static int m117888R() {
        return f111905X;
    }

    /* renamed from: S */
    public static int m117889S() {
        return f111887F;
    }

    /* renamed from: T */
    public static int m117890T() {
        return f111894M;
    }

    /* renamed from: U */
    private static int m117891U(Context context) {
        Pair m117892V = m117892V(context, f111936o, EnumC25103a.BigCache);
        Pair m117892V2 = m117892V(context, f111938p, EnumC25103a.MediumCache);
        Pair m117892V3 = m117892V(context, f111940q, EnumC25103a.SmallCache);
        Pair m117892V4 = m117892V(context, f111942r, EnumC25103a.StickerCache);
        Pair m117892V5 = m117892V(context, f111944s, EnumC25103a.BitmapPool);
        f111936o = ((Integer) m117892V.first).intValue();
        f111938p = ((Integer) m117892V2.first).intValue();
        f111940q = ((Integer) m117892V3.first).intValue();
        f111942r = ((Integer) m117892V4.first).intValue();
        f111944s = ((Integer) m117892V5.first).intValue();
        return ((Integer) m117892V.second).intValue() + ((Integer) m117892V2.second).intValue() + ((Integer) m117892V3.second).intValue() + ((Integer) m117892V4.second).intValue() + ((Integer) m117892V5.second).intValue();
    }

    /* renamed from: V */
    private static Pair m117892V(Context context, int i11, EnumC25103a enumC25103a) {
        int i12;
        m117896Z(context, enumC25103a);
        int i13 = ((int) (f111937o0 * f111933m0 * f111947t0)) * f111939p0;
        f111945s0 = i13;
        if (i11 > i13) {
            int i14 = i11 - i13;
            i11 = i13;
            i12 = i14;
        } else {
            i12 = 0;
        }
        return new Pair(Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* renamed from: W */
    private static Pair m117893W(Context context, int i11, EnumC25103a enumC25103a, int i12) {
        m117896Z(context, enumC25103a);
        float f11 = f111935n0;
        float f12 = f111933m0;
        int i13 = f111947t0;
        int i14 = (int) (f11 * f12 * i13);
        int i15 = (int) (f111937o0 * f12 * i13);
        int i16 = f111939p0;
        int i17 = i14 * i16;
        f111943r0 = i17;
        int i18 = i15 * i16;
        f111945s0 = i18;
        if (i11 < i17) {
            if (i12 <= 0) {
                return new Pair(Integer.valueOf(i11), Integer.valueOf(i12));
            }
            int i19 = i11 + i12;
            if (i19 <= i18) {
                i18 = i19;
            }
            return new Pair(Integer.valueOf(i18), Integer.valueOf(i12 - (i18 - i11)));
        }
        return new Pair(Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* renamed from: X */
    private static void m117894X(Context context, int i11) {
        Pair m117893W = m117893W(context, f111938p, EnumC25103a.MediumCache, i11);
        Pair m117893W2 = m117893W(context, f111940q, EnumC25103a.SmallCache, ((Integer) m117893W.second).intValue());
        Pair m117893W3 = m117893W(context, f111942r, EnumC25103a.StickerCache, ((Integer) m117893W2.second).intValue());
        Pair m117893W4 = m117893W(context, f111944s, EnumC25103a.BitmapPool, ((Integer) m117893W3.second).intValue());
        f111936o = ((Integer) m117893W(context, f111936o, EnumC25103a.BigCache, ((Integer) m117893W4.second).intValue()).first).intValue();
        f111938p = ((Integer) m117893W.first).intValue();
        f111940q = ((Integer) m117893W2.first).intValue();
        f111942r = ((Integer) m117893W3.first).intValue();
        f111944s = ((Integer) m117893W4.first).intValue();
    }

    /* renamed from: Y */
    static void m117895Y() {
        try {
            String m120810C = AbstractC23309i.m120810C();
            if (!TextUtils.isEmpty(m120810C)) {
                JSONObject jSONObject = new JSONObject(m120810C);
                if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                    AbstractC24621a.f118431a = AbstractC18069a.m96086e(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
                }
                if (jSONObject.has("big")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("big");
                    AbstractC24621a.f118432b = AbstractC18069a.m96086e(jSONObject2, "cache_item_size_small", 480);
                    AbstractC24621a.f118433c = AbstractC18069a.m96086e(jSONObject2, "cache_item_size_big", 960);
                }
                if (jSONObject.has("medium")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("medium");
                    AbstractC24621a.f118434d = AbstractC18069a.m96086e(jSONObject3, "cache_item_size_small", 212);
                    AbstractC24621a.f118435e = AbstractC18069a.m96086e(jSONObject3, "cache_item_size_big", 260);
                    AbstractC24621a.f118436f = AbstractC18069a.m96086e(jSONObject3, "cache_item_size_large", 440);
                }
                if (jSONObject.has("small")) {
                    JSONObject jSONObject4 = jSONObject.getJSONObject("small");
                    AbstractC24621a.f118437g = AbstractC18069a.m96086e(jSONObject4, "cache_item_size_small", 75);
                    AbstractC24621a.f118438h = AbstractC18069a.m96086e(jSONObject4, "cache_item_size_big", 120);
                }
                if (jSONObject.has("sticker")) {
                    JSONObject jSONObject5 = jSONObject.getJSONObject("sticker");
                    AbstractC24621a.f118439i = AbstractC18069a.m96086e(jSONObject5, "cache_item_size_small", 130);
                    AbstractC24621a.f118440j = AbstractC18069a.m96086e(jSONObject5, "cache_item_size_big", 240);
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Z */
    private static void m117896Z(Context context, EnumC25103a enumC25103a) {
        int m118681V = AbstractC23136l9.m118681V();
        int m118679U = AbstractC23136l9.m118679U();
        int i11 = a.f111956a[enumC25103a.ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                if (i11 != 4) {
                    if (i11 == 5) {
                        int i12 = m118681V / 5;
                        f111941q0 = i12;
                        f111933m0 = m118679U / i12;
                        f111947t0 = 4;
                        f111935n0 = 2.0f;
                        f111937o0 = 3.0f;
                        if (m117908f0(context)) {
                            int i13 = AbstractC24621a.f118439i;
                            f111939p0 = i13 * i13;
                            return;
                        } else {
                            int i14 = AbstractC24621a.f118440j;
                            f111939p0 = i14 * i14;
                            return;
                        }
                    }
                    return;
                }
                int m118742r = AbstractC23136l9.m118742r(48.0f);
                f111941q0 = m118742r;
                f111933m0 = m118679U / m118742r;
                f111947t0 = 1;
                f111935n0 = 8.0f;
                f111937o0 = 12.0f;
                if (m117908f0(context)) {
                    int i15 = AbstractC24621a.f118437g;
                    f111939p0 = i15 * i15;
                    return;
                } else {
                    int i16 = AbstractC24621a.f118438h;
                    f111939p0 = i16 * i16;
                    return;
                }
            }
            int i17 = m118681V / 3;
            f111941q0 = i17;
            f111933m0 = m118679U / i17;
            f111947t0 = 3;
            f111935n0 = 2.0f;
            f111937o0 = 4.0f;
            if (m117908f0(context)) {
                int i18 = AbstractC24621a.f118434d;
                f111939p0 = i18 * i18;
                return;
            } else if (m117906e0(context)) {
                int i19 = AbstractC24621a.f118436f;
                f111939p0 = i19 * i19;
                return;
            } else {
                int i21 = AbstractC24621a.f118435e;
                f111939p0 = i21 * i21;
                return;
            }
        }
        f111933m0 = 1.0f;
        f111947t0 = 1;
        f111935n0 = 2.0f;
        f111937o0 = 3.0f;
        if (m117908f0(context)) {
            int i22 = AbstractC24621a.f118432b;
            f111939p0 = i22 * i22;
        } else {
            int i23 = AbstractC24621a.f118433c;
            f111939p0 = i23 * i23;
        }
    }

    /* renamed from: a0 */
    private static void m117898a0(Context context) {
        float f11;
        if (AbstractC3972e.m18763T()) {
            f111946t = 9999;
            f111948u = 9999;
            f111950v = 9999;
            f111952w = 9999;
            return;
        }
        int m117913i = m117913i(context);
        float f12 = 30.0f;
        if (AbstractC23136l9.m118654H0(context)) {
            f11 = 30.0f;
        } else {
            f11 = 40.0f;
        }
        if (m117913i > 48) {
            float f13 = m117913i - 48;
            if (f13 > 208.0f) {
                f13 = 208.0f;
            }
            f11 += 0.72115386f * f13;
            f12 = 30.0f + (f13 * 0.625f);
        }
        f111946t = 3;
        int i11 = (int) f12;
        f111948u = i11;
        f111950v = (int) f11;
        f111952w = i11;
    }

    /* renamed from: b */
    public static void m117899b() {
        try {
            C23999j.m125713W1();
            AbstractC24006q.m125841L1();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f111908a, e11);
        }
    }

    /* renamed from: b0 */
    private static void m117900b0(Context context) {
        long m117913i = ((float) ((m117913i(context) * 1048576) / 4)) * 0.75f;
        int i11 = f111934n;
        f111936o = (int) ((f111924i * m117913i) / i11);
        f111938p = (int) ((f111926j * m117913i) / i11);
        f111940q = (int) ((f111928k * m117913i) / i11);
        f111942r = (int) ((f111930l * m117913i) / i11);
        f111944s = (int) ((f111932m * m117913i) / i11);
    }

    /* renamed from: c */
    private static void m117901c(Context context) {
        m117894X(context, m117891U(context));
    }

    /* renamed from: c0 */
    public static void m117902c0(Context context) {
        boolean z11;
        try {
            m117895Y();
            AbstractRunnableC23992c.m125567l1(AbstractC23309i.m122169mf());
            C23999j.m125683C3(AbstractC23309i.m121942gf());
            C23999j.m125737m3(AbstractC23309i.m122244of());
            AbstractRunnableC23992c.m125564j1(AbstractC26080o.a.f124275b);
            C23999j.m125756z3(AbstractC23309i.m121084Je());
            m117904d0(context);
            AbstractC3972e.m18789j0(new File(AbstractC20130d.m104905y()));
            AbstractC3972e.m18793l0(new File(AbstractC20130d.m104849P()));
            AbstractC3972e.m18791k0(context);
            boolean z12 = false;
            if (AbstractC24621a.f118431a > -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            C23999j.m125735l3(z11);
            AbstractRunnableC23992c.m125560g1(f111914d);
            AbstractRunnableC23992c.m125558f1(f111916e);
            C23999j.m125677A3(f111918f);
            C23999j.m125753x3(f111920g);
            C23999j.m125680B3(f111922h);
            C23999j.m125747u3(f111936o);
            C23999j.m125745t3(f111938p);
            C23999j.m125749v3(f111940q);
            AbstractC24006q.m125865o2(f111942r);
            C26117c.m134455f(f111944s);
            C23999j.m125732j3(f111946t);
            C23999j.m125751w3(f111948u);
            C23999j.m125739p3(f111950v);
            C23999j.m125727g3(f111953x);
            AbstractC24006q.m125863m2(f111952w);
            if (AbstractC24621a.f118431a > -1) {
                z12 = true;
            }
            AbstractC24006q.m125862l2(z12);
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.z
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23006a0.m117910g0();
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f111908a, e11);
        }
    }

    /* renamed from: d */
    public static int m117903d() {
        if (AbstractC23136l9.m118660K0(MainApplication.getAppContext())) {
            return 10;
        }
        return 16;
    }

    /* renamed from: d0 */
    private static void m117904d0(Context context) {
        if (AbstractC23136l9.m118704e0(context) > 240 && AbstractC23136l9.m118681V() >= 480 && m117913i(context) > 64) {
            f111916e = 4;
        } else {
            f111916e = 2;
        }
        f111914d = 2;
        if (AbstractC23136l9.m118654H0(context)) {
            f111918f = 921600;
            f111920g = 176400;
            f111922h = 25600;
            f111901T = 1024;
            f111900S = 360;
            f111904W = 360;
            f111893L = 320;
            f111954y = 320;
            f111955z = 320;
            f111882A = 320;
            f111883B = 320;
            f111884C = 320;
            f111885D = 320;
            f111887F = 320;
            f111888G = 320;
            f111892K = 360;
            f111895N = 160;
            f111889H = 320;
            f111896O = 320;
            f111897P = 230;
            f111898Q = 160;
            f111899R = 320;
            f111890I = 320;
            f111891J = 320;
            f111906Y = 160;
            f111886E = 240;
            f111915d0 = 160;
            f111902U = 320;
            f111903V = 320;
            f111905X = 480;
            f111907Z = 120;
            f111909a0 = 160;
            f111911b0 = 240;
            f111949u0 = 75;
            f111921g0 = 360;
            f111923h0 = 320;
            f111925i0 = 240;
            f111927j0 = 160;
            f111929k0 = 75;
            f111931l0 = 48;
            f111951v0 = 360;
        } else {
            f111918f = 1638400;
            f111920g = 640000;
            f111922h = 25600;
            f111901T = ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
            f111900S = 960;
            f111904W = 960;
            f111893L = 360;
            f111954y = 360;
            f111955z = 360;
            f111882A = 640;
            f111883B = 480;
            f111884C = IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING;
            f111885D = 640;
            f111887F = 640;
            f111888G = 640;
            f111892K = 360;
            f111895N = 160;
            f111889H = 320;
            f111897P = 230;
            f111898Q = 160;
            f111899R = 320;
            f111890I = 320;
            f111891J = 320;
            f111906Y = 160;
            f111886E = 480;
            f111915d0 = 160;
            f111902U = 480;
            f111903V = 960;
            f111905X = 960;
            f111907Z = 160;
            f111909a0 = 240;
            f111911b0 = 240;
            f111949u0 = 120;
            f111921g0 = 960;
            f111923h0 = 640;
            f111925i0 = 360;
            f111927j0 = 320;
            f111929k0 = 75;
            f111931l0 = 75;
            f111951v0 = 960;
            if (m117906e0(context)) {
                f111896O = 420;
                f111894M = 480;
            } else {
                f111896O = 360;
                f111894M = 360;
            }
        }
        f111953x = 2;
        f111919f0 = 320;
        if (AbstractC23136l9.m118660K0(context)) {
            f111913c0 = 160;
        } else {
            f111913c0 = 160;
        }
        if (AbstractC3972e.m18763T()) {
            f111924i = 1;
            f111926j = 4;
            f111928k = 2;
            f111930l = 2;
            if (!AbstractC3972e.m18765V()) {
                f111932m = 0;
            } else {
                f111932m = 2;
            }
            f111934n = f111924i + f111926j + f111928k + f111930l + f111932m;
            m117900b0(context);
            m117898a0(context);
            m117901c(context);
            return;
        }
        f111924i = 1;
        f111926j = 1;
        f111928k = 1;
        f111930l = 1;
        if (!AbstractC3972e.m18765V()) {
            f111932m = 0;
        } else {
            f111932m = 1;
        }
        f111934n = f111924i + f111926j + f111928k + f111930l + f111932m;
        m117900b0(context);
        m117898a0(context);
    }

    /* renamed from: e */
    public static int m117905e() {
        return f111913c0;
    }

    /* renamed from: e0 */
    private static boolean m117906e0(Context context) {
        if (AbstractC23136l9.m118653H(context) >= 3 && m117913i(context) >= 196) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static int m117907f() {
        return f111886E;
    }

    /* renamed from: f0 */
    private static boolean m117908f0(Context context) {
        if (AbstractC23136l9.m118704e0(context) > 240 && AbstractC23136l9.m118681V() >= 480 && m117913i(context) > 64) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static int m117909g() {
        return f111915d0;
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m117910g0() {
        File file = new File(AbstractC20130d.m104842L0(), ZinstantMetaConstant.MEMORY_CACHING_CONTENT_CACHE);
        if (file.exists()) {
            try {
                AbstractC23041d2.m118211j(file);
            } catch (Throwable th2) {
                AbstractC20110a.m104539h(th2);
            }
        }
    }

    /* renamed from: h */
    public static int m117911h(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).getMemoryClass();
    }

    /* renamed from: h0 */
    public static void m117912h0(int i11) {
        C23999j.m125689F3(i11);
        AbstractC24006q.m125866s2(i11);
        C26117c.m134456g(i11);
        AbstractRunnableC23992c.m125526K();
    }

    /* renamed from: i */
    public static int m117913i(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).getLargeMemoryClass();
    }

    /* renamed from: j */
    public static int m117914j() {
        return f111917e0;
    }

    /* renamed from: k */
    public static int m117915k() {
        return f111951v0;
    }

    /* renamed from: l */
    public static int m117916l() {
        return f111903V;
    }

    /* renamed from: m */
    public static int m117917m() {
        return f111911b0;
    }

    /* renamed from: n */
    public static int m117918n() {
        return f111897P;
    }

    /* renamed from: o */
    public static int m117919o() {
        return f111896O;
    }

    /* renamed from: p */
    public static int m117920p() {
        return f111949u0;
    }

    /* renamed from: q */
    public static int m117921q() {
        return f111898Q;
    }

    /* renamed from: r */
    public static int m117922r() {
        return f111902U;
    }

    /* renamed from: s */
    public static int m117923s() {
        return f111893L;
    }

    /* renamed from: t */
    public static int m117924t() {
        return f111888G;
    }

    /* renamed from: u */
    public static int m117925u() {
        return f111882A;
    }

    /* renamed from: v */
    public static int m117926v() {
        return f111883B;
    }

    /* renamed from: w */
    public static int m117927w() {
        return f111885D;
    }

    /* renamed from: x */
    public static int m117928x() {
        return f111884C;
    }

    /* renamed from: y */
    public static int m117929y() {
        return f111889H;
    }

    /* renamed from: z */
    public static int m117930z() {
        return f111954y;
    }
}
