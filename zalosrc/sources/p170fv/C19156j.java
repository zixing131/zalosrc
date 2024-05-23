package p170fv;

import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: fv.j */
/* loaded from: classes4.dex */
public class C19156j extends C19153g implements InterfaceC19148b {

    /* renamed from: h */
    private C19159m f95195h;

    /* renamed from: i */
    private int f95196i;

    /* renamed from: j */
    private EnumC19152f f95197j;

    public C19156j(JSONObject jSONObject) {
        super(jSONObject);
        Boolean bool;
        this.f95196i = 2;
        EnumC19152f enumC19152f = EnumC19152f.f95191p;
        this.f95197j = enumC19152f;
        m100486r(1);
        if (jSONObject != null) {
            this.f95196i = AbstractC19147a.Companion.m100487a(jSONObject.optInt("viewInLeftType", 2));
            m100482n(jSONObject.optInt("confirmToExit", 0));
            m100484p(jSONObject.optString("dialogMessage", ""));
            if (jSONObject.has("textColor")) {
                bool = Boolean.valueOf(AbstractC19074t.m100204b(jSONObject.optString("textColor"), "white"));
            } else {
                bool = null;
            }
            m100483o(bool);
            this.f95197j = jSONObject.optInt("textAlign", 0) != 0 ? EnumC19152f.f95192q : enumC19152f;
        }
    }

    @Override // p170fv.InterfaceC19148b
    /* renamed from: a */
    public void mo100490a(int i11) {
        this.f95196i = i11;
    }

    @Override // p170fv.InterfaceC19148b
    /* renamed from: b */
    public int mo100491b() {
        return this.f95196i;
    }

    /* renamed from: s */
    public final EnumC19152f m100497s() {
        return this.f95197j;
    }

    /* renamed from: t */
    public final C19159m m100498t() {
        return this.f95195h;
    }

    /* renamed from: u */
    public final void m100499u(C19159m c19159m) {
        this.f95195h = c19159m;
    }
}
