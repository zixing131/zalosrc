package com.zing.zalo.imgdecor.model.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mt.AbstractC23442b;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class RectData extends AbstractC23442b implements Parcelable {

    /* renamed from: t */
    private int f47742t;

    /* renamed from: u */
    public float f47743u;

    /* renamed from: v */
    public float f47744v;

    /* renamed from: w */
    public float f47745w;

    /* renamed from: x */
    public float f47746x;
    public static final C8932a Companion = new C8932a(null);
    public static final Parcelable.Creator<RectData> CREATOR = new C8933b();

    /* renamed from: com.zing.zalo.imgdecor.model.model.RectData$a */
    /* loaded from: classes4.dex */
    public static final class C8932a {
        private C8932a() {
        }

        public /* synthetic */ C8932a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final RectData m47645a(int i11, float f11, float f12, float f13, float f14) {
            float f15;
            float f16;
            float f17;
            float f18;
            if (f12 < f14) {
                f16 = f12;
                f15 = f14;
            } else {
                f15 = f12;
                f16 = f14;
            }
            if (f13 < f11) {
                f18 = f11;
                f17 = f13;
            } else {
                f17 = f11;
                f18 = f13;
            }
            return new RectData(i11, f17, f15, f18, f16);
        }
    }

    /* renamed from: com.zing.zalo.imgdecor.model.model.RectData$b */
    /* loaded from: classes4.dex */
    public static final class C8933b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RectData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new RectData(parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RectData[] newArray(int i11) {
            return new RectData[i11];
        }
    }

    public RectData(int i11) {
        this(i11, 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
    }

    /* renamed from: m */
    public static final RectData m47644m(int i11, float f11, float f12, float f13, float f14) {
        return Companion.m47645a(i11, f11, f12, f13, f14);
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
        this.f47743u = (float) jSONObject.optDouble("le");
        this.f47744v = (float) jSONObject.optDouble("to");
        this.f47745w = (float) jSONObject.optDouble("ri");
        this.f47746x = (float) jSONObject.optDouble("bo");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC19074t.m100204b(RectData.class, obj.getClass())) {
            return false;
        }
        RectData rectData = (RectData) obj;
        if (this.f47743u == rectData.f47743u && this.f47744v == rectData.f47744v && this.f47745w == rectData.f47745w && this.f47746x == rectData.f47746x) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mt.AbstractC23441a
    /* renamed from: f */
    public void mo47624f(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        jSONObject.put("le", this.f47743u);
        jSONObject.put("to", this.f47744v);
        jSONObject.put("ri", this.f47745w);
        jSONObject.put("bo", this.f47746x);
    }

    public int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int floatToIntBits3;
        float f11 = this.f47743u;
        int i11 = 0;
        if (f11 == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f11);
        }
        int i12 = floatToIntBits * 31;
        float f12 = this.f47744v;
        if (f12 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f12);
        }
        int i13 = (i12 + floatToIntBits2) * 31;
        float f13 = this.f47745w;
        if (f13 == 0.0f) {
            floatToIntBits3 = 0;
        } else {
            floatToIntBits3 = Float.floatToIntBits(f13);
        }
        int i14 = (i13 + floatToIntBits3) * 31;
        float f14 = this.f47746x;
        if (f14 != 0.0f) {
            i11 = Float.floatToIntBits(f14);
        }
        return i14 + i11;
    }

    @Override // mt.AbstractC23442b
    /* renamed from: j */
    public int mo47625j() {
        return this.f47742t;
    }

    @Override // mt.AbstractC23442b
    /* renamed from: l */
    public void mo47626l(int i11) {
        this.f47742t = i11;
    }

    public String toString() {
        return "RectData(" + this.f47743u + ", " + this.f47744v + ", " + this.f47745w + ", " + this.f47746x + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f47742t);
        parcel.writeFloat(this.f47743u);
        parcel.writeFloat(this.f47744v);
        parcel.writeFloat(this.f47745w);
        parcel.writeFloat(this.f47746x);
    }

    public /* synthetic */ RectData(int i11, float f11, float f12, float f13, float f14, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? 0.0f : f11, (i12 & 4) != 0 ? 0.0f : f12, (i12 & 8) != 0 ? 0.0f : f13, (i12 & 16) != 0 ? 0.0f : f14);
    }

    public RectData(int i11, float f11, float f12, float f13, float f14) {
        super(i11);
        this.f47742t = i11;
        this.f47743u = f11;
        this.f47744v = f12;
        this.f47745w = f13;
        this.f47746x = f14;
    }
}
