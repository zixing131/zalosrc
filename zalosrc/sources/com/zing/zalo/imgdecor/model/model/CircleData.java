package com.zing.zalo.imgdecor.model.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23140m2;
import mt.AbstractC23442b;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class CircleData extends AbstractC23442b implements Parcelable {

    /* renamed from: t */
    private int f47731t;

    /* renamed from: u */
    public float f47732u;

    /* renamed from: v */
    public float f47733v;

    /* renamed from: w */
    public float f47734w;
    public static final C8928a Companion = new C8928a(null);
    public static final Parcelable.Creator<CircleData> CREATOR = new C8929b();

    /* renamed from: com.zing.zalo.imgdecor.model.model.CircleData$a */
    /* loaded from: classes4.dex */
    public static final class C8928a {
        private C8928a() {
        }

        public /* synthetic */ C8928a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final CircleData m47631a(int i11, float f11, float f12, float f13, float f14) {
            float f15 = 2;
            return new CircleData(i11, ((f13 - f11) / f15) + f11, ((f14 - f12) / f15) + f12, AbstractC23140m2.m118807d(f11, f12, f13, f14) / f15);
        }
    }

    /* renamed from: com.zing.zalo.imgdecor.model.model.CircleData$b */
    /* loaded from: classes4.dex */
    public static final class C8929b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CircleData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new CircleData(parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CircleData[] newArray(int i11) {
            return new CircleData[i11];
        }
    }

    public CircleData(int i11) {
        this(i11, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: m */
    public static final CircleData m47630m(int i11, float f11, float f12, float f13, float f14) {
        return Companion.m47631a(i11, f11, f12, f13, f14);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mt.AbstractC23441a
    /* renamed from: e */
    public void mo47623e(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f47732u = (float) jSONObject.optDouble("cx");
        this.f47733v = (float) jSONObject.optDouble("cy");
        this.f47734w = (float) jSONObject.optDouble("ra");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CircleData)) {
            return false;
        }
        CircleData circleData = (CircleData) obj;
        return this.f47731t == circleData.f47731t && Float.compare(this.f47732u, circleData.f47732u) == 0 && Float.compare(this.f47733v, circleData.f47733v) == 0 && Float.compare(this.f47734w, circleData.f47734w) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mt.AbstractC23441a
    /* renamed from: f */
    public void mo47624f(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        jSONObject.put("cx", this.f47732u);
        jSONObject.put("cy", this.f47733v);
        jSONObject.put("ra", this.f47734w);
    }

    public int hashCode() {
        return (((((this.f47731t * 31) + Float.floatToIntBits(this.f47732u)) * 31) + Float.floatToIntBits(this.f47733v)) * 31) + Float.floatToIntBits(this.f47734w);
    }

    @Override // mt.AbstractC23442b
    /* renamed from: j */
    public int mo47625j() {
        return this.f47731t;
    }

    @Override // mt.AbstractC23442b
    /* renamed from: l */
    public void mo47626l(int i11) {
        this.f47731t = i11;
    }

    public String toString() {
        return "CircleData(type=" + this.f47731t + ", centerX=" + this.f47732u + ", centerY=" + this.f47733v + ", radius=" + this.f47734w + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f47731t);
        parcel.writeFloat(this.f47732u);
        parcel.writeFloat(this.f47733v);
        parcel.writeFloat(this.f47734w);
    }

    public /* synthetic */ CircleData(int i11, float f11, float f12, float f13, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? 0.0f : f11, (i12 & 4) != 0 ? 0.0f : f12, (i12 & 8) != 0 ? 0.0f : f13);
    }

    public CircleData(int i11, float f11, float f12, float f13) {
        super(i11);
        this.f47731t = i11;
        this.f47732u = f11;
        this.f47733v = f12;
        this.f47734w = f13;
    }
}
