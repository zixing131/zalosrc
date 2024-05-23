package com.adtima.feedback;

import com.adtima.Adtima;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ZAdsReportData {
    private static final String TAG = "ZAdsReportData";
    private ArrayList<ZAdsReportEntity> mList = null;

    public static ZAdsReportData deserialize(JSONObject jSONObject) {
        ZAdsReportData zAdsReportData = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("value");
            ArrayList<ZAdsReportEntity> deserialize = optJSONArray != null ? ZAdsReportEntity.deserialize(optJSONArray) : null;
            if (deserialize == null || deserialize.size() == 0) {
                return null;
            }
            ZAdsReportData zAdsReportData2 = new ZAdsReportData();
            try {
                zAdsReportData2.mList = deserialize;
                return zAdsReportData2;
            } catch (Exception e11) {
                e = e11;
                zAdsReportData = zAdsReportData2;
                Adtima.m18329e(TAG, "deserialize", e);
                return zAdsReportData;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public ArrayList<ZAdsReportEntity> getList() {
        return this.mList;
    }

    public JSONObject serialize() {
        Exception e11;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("value", ZAdsReportEntity.serialize(this.mList));
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
