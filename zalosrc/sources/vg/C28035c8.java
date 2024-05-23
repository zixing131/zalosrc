package vg;

import com.zing.zalo.AbstractC16801x;
import fn0.AbstractC19074t;
import is.EnumC20799i;
import me0.AbstractC23136l9;
import org.json.JSONObject;

/* renamed from: vg.c8 */
/* loaded from: classes3.dex */
public final class C28035c8 implements InterfaceC28231x7 {

    /* renamed from: a */
    private boolean f130885a;

    /* renamed from: b */
    private EnumC20799i f130886b = EnumC20799i.f102203q;

    /* renamed from: c */
    private String f130887c = "";

    /* renamed from: d */
    private int f130888d = AbstractC23136l9.m118639A(AbstractC16801x.red);

    @Override // vg.InterfaceC28231x7
    /* renamed from: a */
    public JSONObject mo141472a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("showReddotTab", this.f130885a ? 1 : 0);
        jSONObject.put("idItem", this.f130886b.m108530d());
        jSONObject.put("desc", this.f130887c);
        jSONObject.put("colorDesc", this.f130888d);
        return jSONObject;
    }

    /* renamed from: b */
    public final int m141473b() {
        return this.f130888d;
    }

    /* renamed from: c */
    public final String m141474c() {
        return this.f130887c;
    }

    /* renamed from: d */
    public final EnumC20799i m141475d() {
        return this.f130886b;
    }

    /* renamed from: e */
    public final boolean m141476e() {
        return this.f130885a;
    }

    /* renamed from: f */
    public InterfaceC28231x7 m141477f(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        boolean z11 = true;
        if (jSONObject.optInt("showReddotTab") != 1) {
            z11 = false;
        }
        this.f130885a = z11;
        EnumC20799i.a aVar = EnumC20799i.Companion;
        EnumC20799i enumC20799i = EnumC20799i.f102203q;
        EnumC20799i m108532b = aVar.m108532b(jSONObject.optInt("idItem", enumC20799i.m108530d()));
        if (m108532b != null) {
            enumC20799i = m108532b;
        }
        this.f130886b = enumC20799i;
        String optString = jSONObject.optString("desc");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f130887c = optString;
        this.f130888d = jSONObject.optInt("colorDesc");
        return this;
    }

    /* renamed from: g */
    public final void m141478g(boolean z11) {
        this.f130885a = z11;
    }
}
