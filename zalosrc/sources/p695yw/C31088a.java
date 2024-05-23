package p695yw;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p087d0.C17686c;

/* renamed from: yw.a */
/* loaded from: classes4.dex */
public class C31088a {

    /* renamed from: a */
    private JSONArray f143291a;

    /* renamed from: b */
    private String f143292b;

    public C31088a(JSONArray jSONArray, String str) {
        this.f143291a = jSONArray;
        this.f143292b = str;
    }

    /* renamed from: a */
    public static C31088a m151068a(WifiManager wifiManager, String str, SensitiveData sensitiveData) {
        JSONArray jSONArray = new JSONArray();
        String str2 = "";
        C31088a c31088a = new C31088a(jSONArray, "");
        if (wifiManager != null) {
            try {
                if (!C8937j0.m47663l(sensitiveData.m35528c())) {
                    return c31088a;
                }
                for (ScanResult scanResult : new C17686c(wifiManager, sensitiveData).m93679f()) {
                    JSONObject jSONObject = new JSONObject();
                    long currentTimeMillis = (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (scanResult.timestamp / 1000);
                    jSONObject.put("name", scanResult.SSID);
                    jSONObject.put("Time", currentTimeMillis);
                    jSONArray.put(jSONObject);
                    if (str.equals(scanResult.BSSID)) {
                        str2 = scanResult.capabilities;
                    }
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        c31088a.m151071d(jSONArray);
        c31088a.m151072e(str2);
        return c31088a;
    }

    /* renamed from: b */
    public JSONArray m151069b() {
        return this.f143291a;
    }

    /* renamed from: c */
    public String m151070c() {
        return this.f143292b;
    }

    /* renamed from: d */
    public void m151071d(JSONArray jSONArray) {
        this.f143291a = jSONArray;
    }

    /* renamed from: e */
    public void m151072e(String str) {
        this.f143292b = str;
    }
}
