package vg;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: vg.y7 */
/* loaded from: classes3.dex */
public final class C28240y7 implements InterfaceC28231x7 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private boolean f131669a;

    /* renamed from: b */
    private int f131670b = Integer.MIN_VALUE;

    /* renamed from: c */
    private int f131671c;

    /* renamed from: vg.y7$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // vg.InterfaceC28231x7
    /* renamed from: a */
    public JSONObject mo141472a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("showAfterReddot", this.f131669a ? 1 : 0);
        jSONObject.put("attachmentId", this.f131670b);
        jSONObject.put("chatType", this.f131671c);
        return jSONObject;
    }

    /* renamed from: b */
    public final int m142211b() {
        return this.f131670b;
    }

    /* renamed from: c */
    public final int m142212c() {
        return this.f131671c;
    }

    /* renamed from: d */
    public final boolean m142213d() {
        return this.f131669a;
    }

    /* renamed from: e */
    public InterfaceC28231x7 m142214e(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        boolean z11 = true;
        if (jSONObject.optInt("showAfterReddot") != 1) {
            z11 = false;
        }
        this.f131669a = z11;
        this.f131670b = jSONObject.optInt("attachmentId", Integer.MIN_VALUE);
        this.f131671c = jSONObject.optInt("chatType");
        return this;
    }

    /* renamed from: f */
    public final void m142215f(int i11) {
        this.f131670b = i11;
    }

    /* renamed from: g */
    public final void m142216g(int i11) {
        this.f131671c = i11;
    }

    /* renamed from: h */
    public final void m142217h(boolean z11) {
        this.f131669a = z11;
    }
}
