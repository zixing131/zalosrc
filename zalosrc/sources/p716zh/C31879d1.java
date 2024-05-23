package p716zh;

import ag0.AbstractC0837p0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: zh.d1 */
/* loaded from: classes3.dex */
public final class C31879d1 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f146430a;

    /* renamed from: b */
    private long f146431b;

    /* renamed from: c */
    private int f146432c;

    /* renamed from: d */
    private long f146433d;

    /* renamed from: e */
    private long f146434e;

    /* renamed from: f */
    private long f146435f;

    /* renamed from: g */
    private boolean f146436g;

    /* renamed from: zh.d1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C31879d1(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        this.f146430a = str;
    }

    /* renamed from: l */
    public static final void m153189l(C31879d1 c31879d1) {
        AbstractC19074t.m100208f(c31879d1, "this$0");
        C31894e1.f146524a.m153256c(c31879d1);
    }

    /* renamed from: b */
    public final String m153190b() {
        return this.f146430a;
    }

    /* renamed from: c */
    public final int m153191c() {
        return this.f146432c;
    }

    /* renamed from: d */
    public final boolean m153192d() {
        return this.f146436g;
    }

    /* renamed from: e */
    public final String m153193e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lastTimeBlockContextSticker", this.f146431b);
        jSONObject.put("e2eeBannerState", this.f146432c);
        jSONObject.put("remindMuteCallBannerState", this.f146435f);
        jSONObject.put("suggestMuteCallBannerState", this.f146434e);
        jSONObject.put("lastTimeRejectCall", this.f146433d);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: f */
    public final long m153194f() {
        return this.f146431b;
    }

    /* renamed from: g */
    public final long m153195g() {
        return this.f146433d;
    }

    /* renamed from: h */
    public final long m153196h() {
        return this.f146435f;
    }

    /* renamed from: i */
    public final long m153197i() {
        return this.f146434e;
    }

    /* renamed from: j */
    public final boolean m153198j() {
        return this.f146431b == 0 && this.f146432c == 0 && this.f146435f == 0 && this.f146434e == 0 && this.f146433d == 0;
    }

    /* renamed from: k */
    public final void m153199k() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.c1
            public /* synthetic */ RunnableC31864c1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31879d1.m153189l(C31879d1.this);
            }
        });
    }

    /* renamed from: m */
    public final void m153200m(int i11) {
        this.f146432c = i11;
    }

    /* renamed from: n */
    public final void m153201n(boolean z11) {
        this.f146436g = z11;
    }

    /* renamed from: o */
    public final void m153202o(long j11) {
        this.f146431b = j11;
    }

    /* renamed from: p */
    public final void m153203p(long j11) {
        this.f146433d = j11;
    }

    /* renamed from: q */
    public final void m153204q(long j11) {
        this.f146435f = j11;
    }

    /* renamed from: r */
    public final void m153205r(long j11) {
        this.f146434e = j11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31879d1(String str, String str2) {
        this(str);
        AbstractC19074t.m100208f(str, "conversationID");
        AbstractC19074t.m100208f(str2, "data");
        if (str2.length() > 0) {
            try {
                this.f146436g = true;
                JSONObject jSONObject = new JSONObject(str2);
                this.f146431b = jSONObject.optLong("lastTimeBlockContextSticker");
                this.f146432c = jSONObject.optInt("e2eeBannerState");
                this.f146434e = jSONObject.optLong("suggestMuteCallBannerState");
                this.f146435f = jSONObject.optLong("remindMuteCallBannerState");
                this.f146433d = jSONObject.optLong("lastTimeRejectCall");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
