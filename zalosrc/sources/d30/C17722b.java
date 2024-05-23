package d30;

import fn0.AbstractC19074t;
import org.json.JSONObject;
import p133ek.AbstractC18459b;

/* renamed from: d30.b */
/* loaded from: classes5.dex */
public final class C17722b {

    /* renamed from: a */
    private final String f89811a;

    /* renamed from: b */
    private final int f89812b;

    /* renamed from: c */
    private final int f89813c;

    /* renamed from: d */
    private final int f89814d;

    /* renamed from: e */
    private final int f89815e;

    /* renamed from: f */
    private final int f89816f;

    /* renamed from: g */
    private final int f89817g;

    /* renamed from: h */
    private final int f89818h;

    /* renamed from: i */
    private final double f89819i;

    /* renamed from: j */
    private final int f89820j;

    /* renamed from: k */
    private final int f89821k;

    /* renamed from: l */
    private final boolean f89822l;

    public C17722b(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, double d11, int i18, int i19, boolean z11) {
        AbstractC19074t.m100208f(str, "modelName");
        this.f89811a = str;
        this.f89812b = i11;
        this.f89813c = i12;
        this.f89814d = i13;
        this.f89815e = i14;
        this.f89816f = i15;
        this.f89817g = i16;
        this.f89818h = i17;
        this.f89819i = d11;
        this.f89820j = i18;
        this.f89821k = i19;
        this.f89822l = z11;
    }

    /* renamed from: a */
    public final int m93797a() {
        return this.f89817g;
    }

    /* renamed from: b */
    public final int m93798b() {
        return this.f89816f;
    }

    /* renamed from: c */
    public final int m93799c() {
        return this.f89812b;
    }

    /* renamed from: d */
    public final int m93800d() {
        return this.f89820j;
    }

    /* renamed from: e */
    public final int m93801e() {
        return this.f89813c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17722b)) {
            return false;
        }
        C17722b c17722b = (C17722b) obj;
        return AbstractC19074t.m100204b(this.f89811a, c17722b.f89811a) && this.f89812b == c17722b.f89812b && this.f89813c == c17722b.f89813c && this.f89814d == c17722b.f89814d && this.f89815e == c17722b.f89815e && this.f89816f == c17722b.f89816f && this.f89817g == c17722b.f89817g && this.f89818h == c17722b.f89818h && AbstractC19074t.m100204b(Double.valueOf(this.f89819i), Double.valueOf(c17722b.f89819i)) && this.f89820j == c17722b.f89820j && this.f89821k == c17722b.f89821k && this.f89822l == c17722b.f89822l;
    }

    /* renamed from: f */
    public final int m93802f() {
        return this.f89818h;
    }

    /* renamed from: g */
    public final int m93803g() {
        return this.f89815e;
    }

    /* renamed from: h */
    public final double m93804h() {
        return this.f89819i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.f89811a.hashCode() * 31) + this.f89812b) * 31) + this.f89813c) * 31) + this.f89814d) * 31) + this.f89815e) * 31) + this.f89816f) * 31) + this.f89817g) * 31) + this.f89818h) * 31) + AbstractC18459b.m97786a(this.f89819i)) * 31) + this.f89820j) * 31) + this.f89821k) * 31;
        boolean z11 = this.f89822l;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    /* renamed from: i */
    public final boolean m93805i() {
        return this.f89822l;
    }

    /* renamed from: j */
    public final int m93806j() {
        return this.f89821k;
    }

    public String toString() {
        return "MFClientConfig(modelName=" + this.f89811a + ", numLatentFactor=" + this.f89812b + ", numReconstructionRound=" + this.f89813c + ", minItemReconstruction=" + this.f89814d + ", numTrainingRound=" + this.f89815e + ", minItemTraining=" + this.f89816f + ", batchSize=" + this.f89817g + ", numReconstructionRoundWhenTraining=" + this.f89818h + ", reconDataRatio=" + this.f89819i + ", numNegativePerEachPositive=" + this.f89820j + ", stickerUsageMaxValue=" + this.f89821k + ", splitDatasetWhenTraining=" + this.f89822l + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C17722b(JSONObject jSONObject) {
        this(r3, jSONObject.optInt("numLatentFactor", 32), jSONObject.optInt("numReconstructionRound", 1), jSONObject.optInt("minItemReconstruction", 10), jSONObject.optInt("numTrainingRound", 1), jSONObject.optInt("minItemTraining", 10), jSONObject.optInt("batchSize", 32), jSONObject.optInt("numReconstructionRoundWhenTraining", 1), jSONObject.optDouble("reconDataRatio", 0.5d), jSONObject.optInt("numNegativePerEachPositive", 50), jSONObject.optInt("stickerUsageMaxValue", 100), jSONObject.optBoolean("splitDatasetWhenTraining", false));
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        String optString = jSONObject.optString("modelName");
        AbstractC19074t.m100207e(optString, "jsonObject.optString(MODEL_NAME)");
    }
}
