package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r90 {
    /* renamed from: a */
    public static final List m25996a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                arrayList.add(optJSONArray.getString(i11));
            }
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }
}
