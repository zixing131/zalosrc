package rd0;

import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: rd0.u */
/* loaded from: classes4.dex */
public final class C25755u extends AbstractC25751q {

    /* renamed from: a */
    private final JSONObject f122922a;

    public C25755u(JSONObject jSONObject) {
        super(null);
        this.f122922a = jSONObject;
    }

    /* renamed from: a */
    public final JSONObject m132891a() {
        return this.f122922a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25755u) && AbstractC19074t.m100204b(this.f122922a, ((C25755u) obj).f122922a);
    }

    public int hashCode() {
        JSONObject jSONObject = this.f122922a;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.hashCode();
    }

    public String toString() {
        return "UploadStoryPhotoResponse(storyJson=" + this.f122922a + ")";
    }
}
