package th;

import am.AbstractC0924m0;
import am.C0928o0;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import p173fz.C19172a;
import p623ww.C29255e;
import p623ww.C29257g;

/* renamed from: th.l */
/* loaded from: classes3.dex */
public final class C26691l {

    /* renamed from: b */
    private static int f126459b;

    /* renamed from: g */
    private static boolean f126464g;

    /* renamed from: i */
    private static boolean f126466i;

    /* renamed from: k */
    private static boolean f126468k;

    /* renamed from: m */
    private static boolean f126470m;

    /* renamed from: n */
    private static boolean f126471n;

    /* renamed from: o */
    private static boolean f126472o;

    /* renamed from: p */
    private static boolean f126473p;

    /* renamed from: q */
    private static boolean f126474q;

    /* renamed from: t */
    private static boolean f126477t;

    /* renamed from: u */
    private static String f126478u;

    /* renamed from: a */
    public static final C26691l f126458a = new C26691l();

    /* renamed from: c */
    private static int f126460c = 1;

    /* renamed from: d */
    private static boolean f126461d = true;

    /* renamed from: e */
    private static boolean f126462e = true;

    /* renamed from: f */
    private static boolean f126463f = true;

    /* renamed from: h */
    private static boolean f126465h = true;

    /* renamed from: j */
    private static float f126467j = 0.5f;

    /* renamed from: l */
    private static float f126469l = 0.5f;

    /* renamed from: r */
    private static final int f126475r = 20;

    /* renamed from: s */
    private static String f126476s = "https://h5.zdn.vn/zapps/2646373759294038927/view-qrcard/zprofile/";

    /* renamed from: th.l$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: b */
        private static boolean f126480b;

        /* renamed from: a */
        public static final a f126479a = new a();

        /* renamed from: c */
        private static float f126481c = 1.5f;

        /* renamed from: d */
        private static int f126482d = 320;

        /* renamed from: e */
        private static int f126483e = 30720;

        private a() {
        }

        /* renamed from: a */
        public final int m137153a() {
            return f126482d;
        }

        /* renamed from: b */
        public final int m137154b() {
            return f126483e;
        }

        /* renamed from: c */
        public final boolean m137155c() {
            return f126480b;
        }

        /* renamed from: d */
        public final void m137156d(boolean z11) {
            f126480b = z11;
        }

        /* renamed from: e */
        public final void m137157e(int i11) {
            f126482d = i11;
        }

        /* renamed from: f */
        public final void m137158f(int i11) {
            f126483e = i11;
        }

        /* renamed from: g */
        public final void m137159g(float f11) {
            f126481c = f11;
        }
    }

    private C26691l() {
    }

    /* renamed from: a */
    public static final float m137128a() {
        return f126467j;
    }

    /* renamed from: b */
    public static final boolean m137129b() {
        return f126472o;
    }

    /* renamed from: c */
    public static final int m137130c() {
        return f126460c;
    }

    /* renamed from: d */
    public static final int m137131d() {
        return f126459b;
    }

    /* renamed from: f */
    public static final int m137132f() {
        return f126475r;
    }

    /* renamed from: h */
    public static final boolean m137133h() {
        return f126468k;
    }

    /* renamed from: i */
    public static final float m137134i() {
        return f126469l;
    }

    /* renamed from: j */
    public static final void m137135j(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "featuresJson");
        C26691l c26691l = f126458a;
        c26691l.m137136k(jSONObject);
        c26691l.m137151x();
    }

    /* renamed from: k */
    private final void m137136k(JSONObject jSONObject) {
        int i11;
        JSONObject optJSONObject = jSONObject.optJSONObject("qr");
        if (optJSONObject != null) {
            i11 = optJSONObject.optInt("sharegroup", 0);
        } else {
            i11 = 0;
        }
        AbstractC0924m0.m3580Xl(i11);
        AbstractC0924m0.m3609Yl(jSONObject.optInt("group_link", 0));
        C26680a.f126349a.m137035m(optJSONObject);
    }

    /* renamed from: l */
    public static final void m137137l(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "settingsJson");
        C26691l c26691l = f126458a;
        c26691l.m137138m(jSONObject);
        c26691l.m137152y();
    }

    /* renamed from: m */
    private final void m137138m(JSONObject jSONObject) {
        boolean z11;
        JSONObject optJSONObject;
        boolean z12;
        boolean z13 = true;
        if (jSONObject.has("mlkit_qr_scanner") && !jSONObject.isNull("mlkit_qr_scanner") && (optJSONObject = jSONObject.optJSONObject("mlkit_qr_scanner")) != null) {
            if (optJSONObject.optInt("enable", 0) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            AbstractC0924m0.m4348xg(z12);
        }
        if (jSONObject.has("qrcode") && !jSONObject.isNull("qrcode")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("qrcode");
            AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
            if (jSONObject2.optInt("enable_classify", 0) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC0924m0.m3692bg(z11);
            C0928o0.m4446o("CLASSIFY_QR_THRESHOLD_STR", String.valueOf(jSONObject2.optDouble("classify_threshold", 0.5d)), false, 4, null);
            if (jSONObject2.optInt("try_resize_frame", 0) != 1) {
                z13 = false;
            }
            AbstractC0924m0.m3638Zl(z13);
            C0928o0.m4446o("TRY_RESIZE_FRAME_RATIO_STR", String.valueOf(jSONObject2.optDouble("try_resize_frame_ratio", 0.5d)), false, 4, null);
        }
    }

    /* renamed from: n */
    public static final void m137139n() {
        f126461d = true;
    }

    /* renamed from: o */
    public static final boolean m137140o() {
        return f126473p;
    }

    /* renamed from: p */
    public static final boolean m137141p() {
        return f126465h;
    }

    /* renamed from: q */
    public static final boolean m137142q() {
        return f126464g;
    }

    /* renamed from: r */
    public static final boolean m137143r() {
        return f126477t;
    }

    /* renamed from: s */
    public static final boolean m137144s() {
        return f126466i;
    }

    /* renamed from: t */
    public static final boolean m137145t() {
        return f126474q;
    }

    /* renamed from: u */
    public static final boolean m137146u() {
        return f126471n;
    }

    /* renamed from: v */
    public static final boolean m137147v() {
        return f126470m;
    }

    /* renamed from: w */
    public static final void m137148w() {
        if (f126463f) {
            f126458a.m137151x();
        }
        if (f126462e) {
            f126458a.m137152y();
        }
    }

    /* renamed from: e */
    public final String m137149e() {
        return f126476s;
    }

    /* renamed from: g */
    public final String m137150g() {
        return f126478u;
    }

    /* renamed from: x */
    public final void m137151x() {
        f126459b = AbstractC0924m0.m4160r4();
        f126460c = AbstractC0924m0.m4190s4();
        C26680a.f126349a.m137036o();
        C29255e.f135512a.m146097p();
        C29257g.f135528a.m146121q();
        f126463f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0034, code lost:            r0 = on0.AbstractC24339t.m127105k(r0);     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m137152y() {
        float f11;
        boolean z11;
        boolean z12;
        boolean z13;
        Float m127105k;
        f126465h = AbstractC0924m0.m3393R8();
        f126464g = AbstractC0924m0.m3104H9();
        f126466i = AbstractC0924m0.m4165r9();
        String m4438g = C0928o0.m4438g("CLASSIFY_QR_THRESHOLD_STR", "0.5", false, 4, null);
        AbstractC19074t.m100205c(m4438g);
        f126467j = Float.parseFloat(m4438g);
        f126468k = AbstractC0924m0.m2990Db();
        String m4438g2 = C0928o0.m4438g("TRY_RESIZE_FRAME_RATIO_STR", null, false, 4, null);
        if (m4438g2 != null && m127105k != null) {
            f11 = m127105k.floatValue();
        } else {
            f11 = 0.5f;
        }
        f126469l = f11;
        f126470m = AbstractC0924m0.m3422S8();
        boolean z14 = true;
        if (C19172a.m100600k("qr_scan_camera@qr_wallet", 0) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        f126471n = z11;
        if (C19172a.m100600k("qr_scan_camera@qr_recent", 0) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        f126474q = z12;
        f126476s = C19172a.m100607r("qr_scan_camera@qr_wallet_url_my_qr", "https://h5.zdn.vn/zapps/2646373759294038927/view-qrcard/zprofile/");
        if (C19172a.m100600k("qr_login_pcweb@ocr@enable", 0) == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        f126477t = z13;
        a aVar = a.f126479a;
        if (C19172a.m100600k("qr_login_pcweb@submit_qr_image@enable", 0) != 1) {
            z14 = false;
        }
        aVar.m137156d(z14);
        aVar.m137159g((float) C19172a.m100598i("qr_login_pcweb@submit_qr_image@image_range", 1.5d));
        aVar.m137157e(C19172a.m100600k("qr_login_pcweb@submit_qr_image@image_dimension_max", 320));
        aVar.m137158f(C19172a.m100600k("qr_login_pcweb@submit_qr_image@image_size_max", 30720));
        f126462e = false;
    }
}
