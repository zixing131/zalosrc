package com.zing.zalo.cameradecor.filter;

import android.os.Parcel;
import android.os.Parcelable;
import ho0.AbstractC20110a;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ColorFilterConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<ColorFilterConfig> CREATOR = new C7813a();

    /* renamed from: p */
    public String f41831p;

    /* renamed from: q */
    public float f41832q;

    /* renamed from: com.zing.zalo.cameradecor.filter.ColorFilterConfig$a */
    /* loaded from: classes3.dex */
    class C7813a implements Parcelable.Creator {
        C7813a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ColorFilterConfig createFromParcel(Parcel parcel) {
            return new ColorFilterConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ColorFilterConfig[] newArray(int i11) {
            return new ColorFilterConfig[i11];
        }
    }

    public ColorFilterConfig() {
        this("", 1.0f);
    }

    /* renamed from: a */
    public static ColorFilterConfig m39671a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new ColorFilterConfig(jSONObject.optString("assetPath"), (float) jSONObject.optDouble("intensityValue", 1.0d));
        }
        return null;
    }

    /* renamed from: b */
    public JSONObject m39672b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("assetPath", this.f41831p);
            jSONObject.put("intensityValue", this.f41832q);
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f41831p);
        parcel.writeFloat(this.f41832q);
    }

    public ColorFilterConfig(String str, float f11) {
        this.f41831p = str;
        this.f41832q = f11;
    }

    protected ColorFilterConfig(Parcel parcel) {
        this.f41831p = parcel.readString();
        this.f41832q = parcel.readFloat();
    }
}
