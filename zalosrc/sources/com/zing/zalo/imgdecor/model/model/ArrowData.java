package com.zing.zalo.imgdecor.model.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import mt.AbstractC23442b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ArrowData extends AbstractC23442b implements Parcelable {

    /* renamed from: t */
    private int f47729t;

    /* renamed from: u */
    public final float[] f47730u;
    public static final C8926a Companion = new C8926a(null);
    public static final Parcelable.Creator<ArrowData> CREATOR = new C8927b();

    /* renamed from: com.zing.zalo.imgdecor.model.model.ArrowData$a */
    /* loaded from: classes4.dex */
    public static final class C8926a {
        private C8926a() {
        }

        public /* synthetic */ C8926a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ArrowData m47627a(int i11, float[] fArr) {
            AbstractC19074t.m100208f(fArr, "vertexCoordinates");
            return new ArrowData(i11, (float[]) fArr.clone());
        }
    }

    /* renamed from: com.zing.zalo.imgdecor.model.model.ArrowData$b */
    /* loaded from: classes4.dex */
    public static final class C8927b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrowData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ArrowData(parcel.readInt(), parcel.createFloatArray());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrowData[] newArray(int i11) {
            return new ArrowData[i11];
        }
    }

    public ArrowData(int i11) {
        this(i11, null, 2, 0 == true ? 1 : 0);
    }

    /* renamed from: m */
    public static final ArrowData m47622m(int i11, float[] fArr) {
        return Companion.m47627a(i11, fArr);
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
        JSONArray optJSONArray = jSONObject.optJSONArray("vc");
        if (optJSONArray != null && optJSONArray.length() == this.f47730u.length) {
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f47730u[i11] = (float) optJSONArray.getDouble(i11);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArrowData)) {
            return false;
        }
        ArrowData arrowData = (ArrowData) obj;
        if (mo47625j() == arrowData.mo47625j() && Arrays.equals(this.f47730u, arrowData.f47730u)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mt.AbstractC23441a
    /* renamed from: f */
    public void mo47624f(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        jSONObject.put("vc", new JSONArray(this.f47730u));
    }

    public int hashCode() {
        return (mo47625j() * 31) + Arrays.hashCode(this.f47730u);
    }

    @Override // mt.AbstractC23442b
    /* renamed from: j */
    public int mo47625j() {
        return this.f47729t;
    }

    @Override // mt.AbstractC23442b
    /* renamed from: l */
    public void mo47626l(int i11) {
        this.f47729t = i11;
    }

    public String toString() {
        return "ArrowData(type=" + this.f47729t + ", vertexCoordinates=" + Arrays.toString(this.f47730u) + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f47729t);
        parcel.writeFloatArray(this.f47730u);
    }

    public /* synthetic */ ArrowData(int i11, float[] fArr, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? new float[14] : fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrowData(int i11, float[] fArr) {
        super(i11);
        AbstractC19074t.m100208f(fArr, "vertexCoordinates");
        this.f47729t = i11;
        this.f47730u = fArr;
    }
}
