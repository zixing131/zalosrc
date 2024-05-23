package com.adtima.feedback;

import com.adtima.Adtima;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ZAdsFeedbackData {
    private static final String TAG = "ZAdsFeedbackData";
    private int mMaxOption = 1;
    private int mExpiredInSecs = 0;
    private ArrayList<ZAdsFeedbackEntity> mList = null;

    public static ZAdsFeedbackData deserialize(JSONObject jSONObject) {
        ZAdsFeedbackData zAdsFeedbackData = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("feedback");
            ArrayList<ZAdsFeedbackEntity> deserialize = optJSONArray != null ? ZAdsFeedbackEntity.deserialize(optJSONArray) : null;
            int optInt = jSONObject.optInt("max");
            int i11 = jSONObject.getInt("expired");
            if (deserialize == null || deserialize.size() == 0) {
                return null;
            }
            ZAdsFeedbackData zAdsFeedbackData2 = new ZAdsFeedbackData();
            try {
                zAdsFeedbackData2.mList = deserialize;
                zAdsFeedbackData2.mMaxOption = optInt;
                zAdsFeedbackData2.mExpiredInSecs = i11;
                return zAdsFeedbackData2;
            } catch (Exception e11) {
                e = e11;
                zAdsFeedbackData = zAdsFeedbackData2;
                Adtima.m18329e(TAG, "deserialize", e);
                return zAdsFeedbackData;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public int getExpiredInSecs() {
        return this.mExpiredInSecs;
    }

    public ArrayList<ZAdsFeedbackEntity> getList() {
        return this.mList;
    }

    public int getMaxOption() {
        return this.mMaxOption;
    }

    public JSONObject serialize() {
        Exception e11;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e12) {
            e11 = e12;
            jSONObject = null;
        }
        try {
            jSONObject.put("max", this.mMaxOption);
            jSONObject.put("expired", this.mExpiredInSecs);
            jSONObject.put("feedback", ZAdsFeedbackEntity.serialize(this.mList));
        } catch (Exception e13) {
            e11 = e13;
            Adtima.m18329e(TAG, "serialize", e11);
            return jSONObject;
        }
        return jSONObject;
    }
}
