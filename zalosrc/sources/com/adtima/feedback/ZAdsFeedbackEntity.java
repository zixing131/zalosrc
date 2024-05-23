package com.adtima.feedback;

import com.adtima.Adtima;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ZAdsFeedbackEntity {
    private static final String TAG = "ZAdsFeedbackEntity";
    public String content;

    /* renamed from: id */
    public int f15454id;

    public static ZAdsFeedbackEntity deserialize(JSONObject jSONObject) {
        ZAdsFeedbackEntity zAdsFeedbackEntity = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            int optInt = jSONObject.optInt("id");
            String optString = jSONObject.optString("content");
            if (optString == null || optString.length() == 0) {
                return null;
            }
            ZAdsFeedbackEntity zAdsFeedbackEntity2 = new ZAdsFeedbackEntity();
            try {
                zAdsFeedbackEntity2.f15454id = optInt;
                zAdsFeedbackEntity2.content = optString;
                return zAdsFeedbackEntity2;
            } catch (Exception e11) {
                e = e11;
                zAdsFeedbackEntity = zAdsFeedbackEntity2;
                Adtima.m18329e(TAG, "deserialize", e);
                return zAdsFeedbackEntity;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public static JSONArray serialize(ArrayList<ZAdsFeedbackEntity> arrayList) {
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

    public static ArrayList<ZAdsFeedbackEntity> deserialize(JSONArray jSONArray) {
        ArrayList<ZAdsFeedbackEntity> arrayList = null;
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList<ZAdsFeedbackEntity> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    ZAdsFeedbackEntity deserialize = deserialize(jSONArray.getJSONObject(i11));
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
                jSONObject.put("id", this.f15454id);
                jSONObject.put("content", this.content);
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
