package dj;

import bo.C3000l0;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: dj.o0 */
/* loaded from: classes3.dex */
public final class C17987o0 extends C17969i0 {

    /* renamed from: B */
    private C3000l0 f91103B;

    public C17987o0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        m95658h();
    }

    /* renamed from: h */
    private final void m95658h() {
        String str = this.f91017v;
        if (str != null) {
            try {
                this.f91103B = AbstractC20826v0.m108750B0(new JSONObject(str));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: g */
    public final C3000l0 m95659g() {
        return this.f91103B;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17987o0(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC19074t.m100208f(jSONObject, "json");
        m95658h();
    }
}
