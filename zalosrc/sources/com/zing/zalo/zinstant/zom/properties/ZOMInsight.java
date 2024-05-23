package com.zing.zalo.zinstant.zom.properties;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMInsight {
    public String mCategory;
    public long mImpressionTimeout;
    public String mLabel;
    public float mOffset;
    public int mProtocol;
    public String mValue;
    transient JSONObject mValueJsonCache;

    public ZOMInsight() {
        this.mProtocol = 0;
        this.mOffset = 0.2f;
    }

    public static ZOMInsight createObject() {
        return new ZOMInsight();
    }

    public synchronized JSONObject getValueJson() {
        JSONObject jSONObject = this.mValueJsonCache;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(this.mValue);
            this.mValueJsonCache = jSONObject2;
            return jSONObject2;
        } catch (JSONException e11) {
            e11.printStackTrace();
            JSONObject jSONObject3 = new JSONObject();
            this.mValueJsonCache = jSONObject3;
            return jSONObject3;
        }
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.mCategory)) {
                jSONObject.put("category", this.mCategory);
            }
            if (!TextUtils.isEmpty(this.mValue)) {
                jSONObject.put("value", this.mValue);
            }
            if (!TextUtils.isEmpty(this.mLabel)) {
                jSONObject.put("label", this.mLabel);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    public String toString() {
        return "ZOMInsight{mCategory='" + this.mCategory + "', mLabel='" + this.mLabel + "', mValue='" + this.mValue + "', mImpressionTimeout=" + this.mImpressionTimeout + ", mProtocol=" + this.mProtocol + ", mOffset=" + this.mOffset + '}';
    }

    public void updateValueJson(JSONObject jSONObject) {
        this.mValueJsonCache = jSONObject;
        this.mValue = jSONObject.toString();
    }

    public ZOMInsight(ZOMInsight zOMInsight) {
        this.mProtocol = 0;
        this.mOffset = 0.2f;
        this.mCategory = zOMInsight.mCategory;
        this.mLabel = zOMInsight.mLabel;
        this.mValue = zOMInsight.mValue;
        this.mImpressionTimeout = zOMInsight.mImpressionTimeout;
        this.mProtocol = zOMInsight.mProtocol;
        this.mOffset = zOMInsight.mOffset;
    }

    public ZOMInsight(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, int i12, int i13) {
        this.mProtocol = 0;
        this.mOffset = 0.2f;
        this.mCategory = AbstractC28268b.m142407b(bArr);
        this.mLabel = AbstractC28268b.m142407b(bArr2);
        this.mValue = AbstractC28268b.m142407b(bArr3);
        this.mImpressionTimeout = i11;
        this.mProtocol = i12;
        this.mOffset = i13 / 100.0f;
    }
}
