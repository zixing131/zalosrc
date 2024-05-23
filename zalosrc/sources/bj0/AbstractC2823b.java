package bj0;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: bj0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC2823b {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final List m13648b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            String optString = jSONArray.optString(i11);
            AbstractC19074t.m100207e(optString, "optString(i)");
            arrayList.add(optString);
        }
        return arrayList;
    }
}
