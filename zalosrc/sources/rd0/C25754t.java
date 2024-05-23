package rd0;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: rd0.t */
/* loaded from: classes4.dex */
public final class C25754t extends AbstractC25751q {

    /* renamed from: a */
    private final String f122918a;

    /* renamed from: b */
    private final boolean f122919b;

    /* renamed from: c */
    private final String f122920c;

    /* renamed from: d */
    private final JSONObject f122921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25754t(String str, boolean z11, String str2, JSONObject jSONObject) {
        super(null);
        AbstractC19074t.m100208f(str, "fileId");
        this.f122918a = str;
        this.f122919b = z11;
        this.f122920c = str2;
        this.f122921d = jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25754t)) {
            return false;
        }
        C25754t c25754t = (C25754t) obj;
        return AbstractC19074t.m100204b(this.f122918a, c25754t.f122918a) && this.f122919b == c25754t.f122919b && AbstractC19074t.m100204b(this.f122920c, c25754t.f122920c) && AbstractC19074t.m100204b(this.f122921d, c25754t.f122921d);
    }

    public int hashCode() {
        int hashCode = ((this.f122918a.hashCode() * 31) + AbstractC2144f.m11520a(this.f122919b)) * 31;
        String str = this.f122920c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        JSONObject jSONObject = this.f122921d;
        return hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public String toString() {
        return "UploadStatusVoiceResponse(fileId=" + this.f122918a + ", completed=" + this.f122919b + ", status=" + this.f122920c + ", feedJson=" + this.f122921d + ")";
    }
}
