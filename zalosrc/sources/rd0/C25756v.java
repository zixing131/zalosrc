package rd0;

import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: rd0.v */
/* loaded from: classes4.dex */
public final class C25756v extends AbstractC25751q {

    /* renamed from: a */
    private final JSONObject f122923a;

    public C25756v(JSONObject jSONObject) {
        super(null);
        this.f122923a = jSONObject;
    }

    /* renamed from: a */
    public final JSONObject m132892a() {
        return this.f122923a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25756v) && AbstractC19074t.m100204b(this.f122923a, ((C25756v) obj).f122923a);
    }

    public int hashCode() {
        JSONObject jSONObject = this.f122923a;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.hashCode();
    }

    public String toString() {
        return "UploadStoryVideoResponse(storyJson=" + this.f122923a + ")";
    }
}
