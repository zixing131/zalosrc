package p583vq;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23309i;

/* renamed from: vq.b */
/* loaded from: classes4.dex */
public class C28570b {

    /* renamed from: c */
    private static volatile C28570b f132567c;

    /* renamed from: a */
    private boolean f132568a;

    /* renamed from: b */
    private int[] f132569b;

    private C28570b() {
        try {
            String m121191Ma = AbstractC23309i.m121191Ma();
            if (!TextUtils.isEmpty(m121191Ma)) {
                m142997c(new JSONObject(m121191Ma));
            } else {
                m142999d(new JSONObject("{\n\t\"enabled\":1, \n\t\"position\":[0, 1, 2]\n    }"));
            }
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: a */
    public static C28570b m142996a() {
        if (f132567c == null) {
            synchronized (C28594q.class) {
                try {
                    if (f132567c == null) {
                        f132567c = new C28570b();
                    }
                } finally {
                }
            }
        }
        return f132567c;
    }

    /* renamed from: c */
    private void m142997c(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                boolean z11 = true;
                if (jSONObject.optInt("enabled", 0) != 1) {
                    z11 = false;
                }
                this.f132568a = z11;
                JSONArray optJSONArray = jSONObject.optJSONArray("position");
                if (optJSONArray != null) {
                    this.f132569b = new int[optJSONArray.length()];
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        this.f132569b[i11] = optJSONArray.getInt(i11);
                    }
                }
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: b */
    public boolean m142998b(int i11) {
        if (this.f132568a) {
            if (i11 == 3) {
                return true;
            }
            if (this.f132569b != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr = this.f132569b;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    if (i11 == iArr[i12]) {
                        return true;
                    }
                    i12++;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public void m142999d(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                m142997c(jSONObject);
                AbstractC23309i.m120953Fv(jSONObject.toString());
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }
}
