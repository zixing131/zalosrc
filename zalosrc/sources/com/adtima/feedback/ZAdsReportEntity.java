package com.adtima.feedback;

import com.adtima.Adtima;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ZAdsReportEntity {
    private static final String TAG = "ZAdsReportEntity";

    /* renamed from: id */
    public int f15455id;
    public String name;

    public static ZAdsReportEntity deserialize(JSONObject jSONObject) {
        ZAdsReportEntity zAdsReportEntity = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            int optInt = jSONObject.optInt("id");
            String optString = jSONObject.optString("name");
            if (optString == null || optString.length() == 0) {
                return null;
            }
            ZAdsReportEntity zAdsReportEntity2 = new ZAdsReportEntity();
            try {
                zAdsReportEntity2.f15455id = optInt;
                zAdsReportEntity2.name = optString;
                return zAdsReportEntity2;
            } catch (Exception e11) {
                e = e11;
                zAdsReportEntity = zAdsReportEntity2;
                Adtima.m18329e(TAG, "deserialize", e);
                return zAdsReportEntity;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public static JSONArray serialize(ArrayList<ZAdsReportEntity> arrayList) {
        JSONArray jSONArray = null;
        if (arrayList == null) {
            return null;
        }
        try {
            if (arrayList.size() == 0) {
                return null;
            }
            JSONArray jSONArray2 = new JSONArray();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    JSONObject serialize = arrayList.get(i11).serialize();
                    if (serialize != null) {
                        jSONArray2.put(i11, serialize);
                    }
                } catch (Exception e11) {
                    e = e11;
                    jSONArray = jSONArray2;
                    Adtima.m18329e(TAG, "serialize", e);
                    return jSONArray;
                }
            }
            return jSONArray2;
        } catch (Exception e12) {
            e = e12;
        }
    }

    public static ArrayList<ZAdsReportEntity> deserialize(JSONArray jSONArray) {
        ArrayList<ZAdsReportEntity> arrayList = null;
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList<ZAdsReportEntity> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    ZAdsReportEntity deserialize = deserialize(jSONArray.getJSONObject(i11));
                    if (deserialize != null) {
                        arrayList2.add(deserialize);
                    }
                } catch (Exception e11) {
                    e = e11;
                    arrayList = arrayList2;
                    Adtima.m18329e(TAG, "deserialize", e);
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e12) {
            e = e12;
        }
    }

    public JSONObject serialize() {
        Exception e11;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f15455id);
                jSONObject.put("name", this.name);
            } catch (Exception e12) {
                e11 = e12;
                Adtima.m18329e(TAG, "serialize", e11);
                return jSONObject;
            }
        } catch (Exception e13) {
            e11 = e13;
            jSONObject = null;
        }
        return jSONObject;
    }
}
