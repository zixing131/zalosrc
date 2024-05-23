package rd0;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: rd0.b */
/* loaded from: classes4.dex */
public final class C25736b extends AbstractC25751q {

    /* renamed from: a */
    private final long f122869a;

    /* renamed from: b */
    private final JSONObject f122870b;

    public C25736b(long j11, JSONObject jSONObject) {
        super(null);
        this.f122869a = j11;
        this.f122870b = jSONObject;
    }

    /* renamed from: a */
    public final long m132851a() {
        return this.f122869a;
    }

    /* renamed from: b */
    public final JSONObject m132852b() {
        return this.f122870b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25736b)) {
            return false;
        }
        C25736b c25736b = (C25736b) obj;
        return this.f122869a == c25736b.f122869a && AbstractC19074t.m100204b(this.f122870b, c25736b.f122870b);
    }

    public int hashCode() {
        int m11521a = AbstractC2147g0.m11521a(this.f122869a) * 31;
        JSONObject jSONObject = this.f122870b;
        return m11521a + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "UploadCOMFeedPhotoSilentResponse(fileId=" + this.f122869a + ", photoInfo=" + this.f122870b + ")";
    }
}
