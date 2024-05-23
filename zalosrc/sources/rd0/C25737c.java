package rd0;

import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: rd0.c */
/* loaded from: classes4.dex */
public final class C25737c extends AbstractC25751q {

    /* renamed from: a */
    private final JSONObject f122871a;

    public C25737c(JSONObject jSONObject) {
        super(null);
        this.f122871a = jSONObject;
    }

    /* renamed from: a */
    public final JSONObject m132853a() {
        return this.f122871a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25737c) && AbstractC19074t.m100204b(this.f122871a, ((C25737c) obj).f122871a);
    }

    public int hashCode() {
        JSONObject jSONObject = this.f122871a;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.hashCode();
    }

    public String toString() {
        return "UploadCOMFeedPhotoSingleResponse(feedData=" + this.f122871a + ")";
    }
}
