package com.adtima.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.webkit.JavascriptInterface;
import com.adtima.Adtima;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import p009a3.C0098c;
import p178g3.AbstractC19207b;

/* loaded from: classes2.dex */
public final class ZAdsJSInterface {
    private static final int NETWORK_ETHERNET = 2;
    private static final int NETWORK_MOBILE = 4;
    private static final int NETWORK_NONE = 1;
    private static final int NETWORK_UNKNOWN = 0;
    private static final int NETWORK_WIFI = 3;
    private static final String TAG = "ZAdsJSInterface";
    private C0098c mAdsData;
    private Context mContext = Adtima.SharedContext;

    public ZAdsJSInterface(C0098c c0098c) {
        this.mAdsData = null;
        this.mAdsData = c0098c;
    }

    @JavascriptInterface
    public String getCompleteUrl() {
        ArrayList arrayList;
        try {
            Adtima.m18326d(TAG, "getCompleteUrl");
            C0098c c0098c = this.mAdsData;
            if (c0098c != null && (arrayList = c0098c.f487S) != null && arrayList.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.mAdsData.f487S.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                if (Adtima.isDebuggable()) {
                    jSONArray.put("http://getCompleteUrl");
                }
                String jSONArray2 = jSONArray.toString();
                return jSONArray2 != null ? jSONArray2.replaceAll("\\\\", "") : jSONArray2;
            }
            return null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getCompleteUrl", e11);
            return null;
        }
    }

    @JavascriptInterface
    public String getCreativeViewUrl() {
        ArrayList arrayList;
        try {
            Adtima.m18326d(TAG, "getCreativeViewUrl");
            C0098c c0098c = this.mAdsData;
            if (c0098c != null && (arrayList = c0098c.f483O) != null && arrayList.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.mAdsData.f483O.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                if (Adtima.isDebuggable()) {
                    jSONArray.put("http://getCreativeViewUrl");
                }
                String jSONArray2 = jSONArray.toString();
                return jSONArray2 != null ? jSONArray2.replaceAll("\\\\", "") : jSONArray2;
            }
            return null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getCreativeViewUrl", e11);
            return null;
        }
    }

    @JavascriptInterface
    public String getFirstQuatileUrl() {
        ArrayList arrayList;
        try {
            Adtima.m18326d(TAG, "getFirstQuatileUrl");
            C0098c c0098c = this.mAdsData;
            if (c0098c != null && (arrayList = c0098c.f484P) != null && arrayList.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.mAdsData.f484P.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                if (Adtima.isDebuggable()) {
                    jSONArray.put("http://getFirstQuatileUrl");
                }
                String jSONArray2 = jSONArray.toString();
                return jSONArray2 != null ? jSONArray2.replaceAll("\\\\", "") : jSONArray2;
            }
            return null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getFirstQuatileUrl", e11);
            return null;
        }
    }

    @JavascriptInterface
    public String getMidpointUrl() {
        ArrayList arrayList;
        try {
            Adtima.m18326d(TAG, "getMidpointUrl");
            C0098c c0098c = this.mAdsData;
            if (c0098c != null && (arrayList = c0098c.f485Q) != null && arrayList.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.mAdsData.f485Q.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                if (Adtima.isDebuggable()) {
                    jSONArray.put("http://getMidpointUrl");
                }
                String jSONArray2 = jSONArray.toString();
                return jSONArray2 != null ? jSONArray2.replaceAll("\\\\", "") : jSONArray2;
            }
            return null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getMidpointUrl", e11);
            return null;
        }
    }

    @JavascriptInterface
    public int getNetworkType() {
        int i11;
        NetworkInfo m100795a;
        try {
            Adtima.m18326d(TAG, "getNetworkType");
            m100795a = AbstractC19207b.m100795a(this.mContext);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getNetworkType", e11);
        }
        if (m100795a != null) {
            i11 = 1;
            if (m100795a.isConnected()) {
                if (m100795a.getType() == 9) {
                    i11 = 2;
                } else if (m100795a.getType() == 1) {
                    i11 = 3;
                } else if (m100795a.getType() == 0) {
                    i11 = 4;
                }
            }
            Adtima.m18326d(TAG, "getNetworkType: " + i11);
            return i11;
        }
        i11 = 0;
        Adtima.m18326d(TAG, "getNetworkType: " + i11);
        return i11;
    }

    @JavascriptInterface
    public String getProgressUrl() {
        ArrayList arrayList;
        try {
            Adtima.m18326d(TAG, "getProgressUrl");
            C0098c c0098c = this.mAdsData;
            if (c0098c != null && (arrayList = c0098c.f488T) != null && arrayList.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.mAdsData.f488T.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                if (Adtima.isDebuggable()) {
                    jSONArray.put("http://getProgressUrl");
                }
                String jSONArray2 = jSONArray.toString();
                return jSONArray2 != null ? jSONArray2.replaceAll("\\\\", "") : jSONArray2;
            }
            return null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getProgressUrl", e11);
            return null;
        }
    }

    @JavascriptInterface
    public String getThirdQuatileUrl() {
        ArrayList arrayList;
        try {
            Adtima.m18326d(TAG, "getThirdQuatileUrl");
            C0098c c0098c = this.mAdsData;
            if (c0098c != null && (arrayList = c0098c.f486R) != null && arrayList.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.mAdsData.f486R.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                if (Adtima.isDebuggable()) {
                    jSONArray.put("http://getThirdQuatileUrl");
                }
                String jSONArray2 = jSONArray.toString();
                return jSONArray2 != null ? jSONArray2.replaceAll("\\\\", "") : jSONArray2;
            }
            return null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getThirdQuatileUrl", e11);
            return null;
        }
    }
}
