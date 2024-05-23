package j30;

import am.AbstractC0924m0;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.C20128b;
import k30.C21459a;
import ln0.AbstractC22543l;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p405ov.C24561c;
import pm.C24831b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: j30.a */
/* loaded from: classes5.dex */
public final class C20912a {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f102740a;

    /* renamed from: j30.a$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f102741q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20912a mo12V4() {
            return c.f102742a.m109412a();
        }
    }

    /* renamed from: j30.a$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20912a m109411a() {
            return (C20912a) C20912a.f102740a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j30.a$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f102742a = new c();

        /* renamed from: b */
        private static final C20912a f102743b = new C20912a();

        private c() {
        }

        /* renamed from: a */
        public final C20912a m109412a() {
            return f102743b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f102741q);
        f102740a = m129210a;
    }

    /* renamed from: e */
    public static final C20912a m109395e() {
        return Companion.m109411a();
    }

    /* renamed from: i */
    private final void m109396i(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        C24561c.m127942b("SMLStorageConfigs", "handleToolStorageConfig(): " + jSONObject);
        try {
            boolean z15 = true;
            if (jSONObject.optInt("enabled", 1) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC0924m0.m4053nh(z11);
            if (jSONObject.optInt("enable_ep_storage_detail_csc", 1) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            AbstractC0924m0.m4203sh(z12);
            if (jSONObject.optInt("enable_multi_delete", 1) == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            AbstractC0924m0.m4083oh(z13);
            if (jSONObject.optInt("enable_big_old_file", 0) == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            AbstractC0924m0.m3458Tf(z14);
            if (jSONObject.optInt("enable_new_tool", 0) != 1) {
                z15 = false;
            }
            AbstractC0924m0.m3111Hg(z15);
            long j11 = 5;
            long optLong = jSONObject.optLong("big_file_threshold", 5L);
            if (optLong > 0) {
                j11 = optLong;
            }
            AbstractC0924m0.m3062Fp(j11 * ((long) Math.pow(1024.0d, 2)));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLStorageConfigs", e11);
        }
    }

    /* renamed from: j */
    private final void m109397j(JSONObject jSONObject) {
        boolean z11;
        int m116588k;
        Integer num;
        int i11;
        int m116588k2;
        int i12;
        int m116588k3;
        int m116584g;
        C24561c.m127942b("SMLStorageConfigs", "handleWarningFullStorageServerConfig(): " + jSONObject);
        try {
            if (jSONObject.optInt("enable", 0) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC0924m0.m4122pq(z11);
            if (z11) {
                m116588k = AbstractC22543l.m116588k(jSONObject.optInt("warning_threshold", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE), 0, (int) C21459a.m111034b(C20128b.m104766m()));
                AbstractC0924m0.m4182rq(m116588k);
                JSONArray optJSONArray = jSONObject.optJSONArray("full_threshold");
                if (optJSONArray != null) {
                    Object obj = optJSONArray.get(0);
                    Integer num2 = null;
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i11 = num.intValue();
                    } else {
                        i11 = 100;
                    }
                    m116588k2 = AbstractC22543l.m116588k(i11, 0, 1024);
                    Object obj2 = optJSONArray.get(1);
                    if (obj2 instanceof Integer) {
                        num2 = (Integer) obj2;
                    }
                    if (num2 != null) {
                        i12 = num2.intValue();
                    } else {
                        i12 = 150;
                    }
                    m116588k3 = AbstractC22543l.m116588k(i12, 0, 1024);
                    m116584g = AbstractC22543l.m116584g(m116588k2, m116588k3);
                    AbstractC0924m0.m3634Zh(m116584g);
                    AbstractC0924m0.m3664ai(m116588k3);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLStorageConfigs", e11);
        }
    }

    /* renamed from: b */
    public final void m109398b() {
        C24561c.m127942b("SMLStorageConfigs", "clearAllMemCache()");
    }

    /* renamed from: c */
    public final int m109399c() {
        return AbstractC0924m0.m4067o1();
    }

    /* renamed from: d */
    public final int m109400d() {
        return AbstractC0924m0.m4097p1();
    }

    /* renamed from: f */
    public final long m109401f() {
        return AbstractC0924m0.m3420S6();
    }

    /* renamed from: g */
    public final int m109402g() {
        return AbstractC0924m0.m4223t7();
    }

    /* renamed from: h */
    public final void m109403h(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "featuresJson");
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("storage_tool");
            if (optJSONObject != null) {
                m109396i(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("warning_full_storage");
            if (optJSONObject2 != null) {
                m109397j(optJSONObject2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLStorageConfigs", e11);
        }
    }

    /* renamed from: k */
    public final boolean m109404k() {
        C24831b c24831b = C24831b.f119222a;
        if (c24831b.m129120f()) {
            return c24831b.m129119e();
        }
        return AbstractC0924m0.m4015m9();
    }

    /* renamed from: l */
    public final boolean m109405l() {
        C24831b c24831b = C24831b.f119222a;
        if (c24831b.m129120f()) {
            return c24831b.m129119e();
        }
        return AbstractC0924m0.m3394R9();
    }

    /* renamed from: m */
    public final boolean m109406m() {
        return AbstractC0924m0.m4166ra();
    }

    /* renamed from: n */
    public final boolean m109407n() {
        return AbstractC0924m0.m4196sa();
    }

    /* renamed from: o */
    public final boolean m109408o() {
        return AbstractC0924m0.m4313wa();
    }

    /* renamed from: p */
    public final boolean m109409p() {
        return AbstractC0924m0.m3368Qc();
    }
}
