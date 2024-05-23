package ak0;

import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import lk0.C22504b;
import lk0.C22505c;
import org.json.JSONObject;

/* renamed from: ak0.f */
/* loaded from: classes7.dex */
public class C0891f implements InterfaceC0887b {

    /* renamed from: e */
    private static final C17244x0.b f3354e = new a();

    /* renamed from: a */
    private C17244x0 f3355a;

    /* renamed from: b */
    private C17244x0 f3356b;

    /* renamed from: c */
    private C17244x0 f3357c;

    /* renamed from: d */
    private final C0890e f3358d = new C0890e();

    /* renamed from: ak0.f$a */
    /* loaded from: classes7.dex */
    class a implements C17244x0.b {
        a() {
        }

        @Override // com.zing.zalo.zinstant.C17244x0.b
        /* renamed from: a */
        public C22504b mo2748a(JSONObject jSONObject, int i11) {
            if (jSONObject != null && jSONObject.has("zinstantdata")) {
                return new C22504b(i11, jSONObject.getJSONObject("zinstantdata"));
            }
            return null;
        }

        @Override // com.zing.zalo.zinstant.C17244x0.b
        /* renamed from: b */
        public C22505c mo2749b(JSONObject jSONObject, int i11) {
            if (jSONObject != null && jSONObject.has("ZInstantAPIInfo")) {
                return new C22505c(i11, jSONObject.getJSONObject("ZInstantAPIInfo"));
            }
            return null;
        }
    }

    private C0891f() {
    }

    /* renamed from: g */
    public static InterfaceC0887b m2747g(JSONObject jSONObject) {
        int i11;
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return null;
        }
        C0891f c0891f = new C0891f();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("quickmenu");
        boolean z11 = true;
        if (optJSONObject2 != null) {
            c0891f.f3358d.m2746d(optJSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1));
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("zins_info");
            if (optJSONObject3 != null) {
                c0891f.f3355a = new C17244x0(20, optJSONObject3, f3354e);
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("header_menu");
        if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("zins_info")) != null) {
            c0891f.f3357c = new C17244x0(23, optJSONObject, f3354e);
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("panelmenu");
        if (optJSONObject5 != null) {
            if (c0891f.f3357c != null) {
                i11 = 24;
            } else {
                i11 = 19;
            }
            JSONObject optJSONObject6 = optJSONObject5.optJSONObject("zins_info");
            if (optJSONObject6 != null) {
                c0891f.f3356b = new C17244x0(i11, optJSONObject6, f3354e);
            }
        }
        if (c0891f.mo2738b() == null && c0891f.mo2737a() == null) {
            return null;
        }
        if (c0891f.mo2741e()) {
            C0890e c0890e = c0891f.f3358d;
            if (c0891f.mo2742f() != 2) {
                z11 = false;
            }
            c0890e.m2745c(z11);
        }
        return c0891f;
    }

    @Override // ak0.InterfaceC0887b
    /* renamed from: a */
    public C17244x0 mo2737a() {
        return this.f3355a;
    }

    @Override // ak0.InterfaceC0887b
    /* renamed from: b */
    public C17244x0 mo2738b() {
        return this.f3356b;
    }

    @Override // ak0.InterfaceC0887b
    /* renamed from: c */
    public C17244x0 mo2739c() {
        return this.f3357c;
    }

    @Override // ak0.InterfaceC0887b
    /* renamed from: d */
    public InterfaceC0886a mo2740d() {
        return this.f3358d;
    }

    @Override // ak0.InterfaceC0887b
    /* renamed from: e */
    public boolean mo2741e() {
        if (mo2742f() != -1) {
            return true;
        }
        return false;
    }

    @Override // ak0.InterfaceC0887b
    /* renamed from: f */
    public int mo2742f() {
        if (mo2739c() != null) {
            return 2;
        }
        if (mo2738b() != null) {
            return 1;
        }
        return -1;
    }
}
