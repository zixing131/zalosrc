package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.C3918k;
import com.android.billingclient.api.C3931o;
import com.android.billingclient.api.C3940r;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.play_billing.w */
/* loaded from: classes2.dex */
public abstract class AbstractC5856w {

    /* renamed from: a */
    public static final int f33442a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static int m30532a(Intent intent, String str) {
        if (intent == null) {
            m30542k("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return m30544m(intent.getExtras(), "ProxyBillingActivity");
    }

    /* renamed from: b */
    public static int m30533b(Bundle bundle, String str) {
        if (bundle == null) {
            m30542k(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m30541j(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m30542k(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    /* renamed from: c */
    public static int m30534c(Intent intent, String str) {
        return m30536e(intent, "ProxyBillingActivity").m18652b();
    }

    /* renamed from: d */
    public static Bundle m30535d(boolean z11, boolean z12, boolean z13, boolean z14, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z11) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: e */
    public static C3918k m30536e(Intent intent, String str) {
        if (intent == null) {
            m30542k("BillingHelper", "Got null intent!");
            C3918k.a m18648c = C3918k.m18648c();
            m18648c.m18655c(6);
            m18648c.m18654b("An internal error occurred.");
            return m18648c.m18653a();
        }
        C3918k.a m18648c2 = C3918k.m18648c();
        m18648c2.m18655c(m30533b(intent.getExtras(), str));
        m18648c2.m18654b(m30538g(intent.getExtras(), str));
        return m18648c2.m18653a();
    }

    /* renamed from: f */
    public static C3931o m30537f(Bundle bundle, String str) {
        if (bundle == null) {
            return new C3931o(0, null);
        }
        return new C3931o(m30544m(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    /* renamed from: g */
    public static String m30538g(Bundle bundle, String str) {
        if (bundle == null) {
            m30542k(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m30541j(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m30542k(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    /* renamed from: h */
    public static String m30539h(int i11) {
        return EnumC5721a.m30153b(i11).toString();
    }

    /* renamed from: i */
    public static List m30540i(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            m30541j("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i11 = 0; i11 < stringArrayList.size() && i11 < stringArrayList2.size(); i11++) {
                C3940r m30545n = m30545n(stringArrayList.get(i11), stringArrayList2.get(i11));
                if (m30545n != null) {
                    arrayList.add(m30545n);
                }
            }
        } else {
            C3940r m30545n2 = m30545n(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (m30545n2 == null) {
                m30541j("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(m30545n2);
        }
        return arrayList;
    }

    /* renamed from: j */
    public static void m30541j(String str, String str2) {
        if (Log.isLoggable(str, 2) && !str2.isEmpty()) {
            int i11 = 40000;
            while (!str2.isEmpty() && i11 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i11));
                str2.substring(0, min);
                str2 = str2.substring(min);
                i11 -= min;
            }
        }
    }

    /* renamed from: k */
    public static void m30542k(String str, String str2) {
    }

    /* renamed from: l */
    public static void m30543l(String str, String str2, Throwable th2) {
    }

    /* renamed from: m */
    private static int m30544m(Bundle bundle, String str) {
        if (bundle == null) {
            m30542k(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    /* renamed from: n */
    private static C3940r m30545n(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new C3940r(str, str2);
            } catch (JSONException e11) {
                m30542k("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e11.toString()));
                return null;
            }
        }
        m30541j("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
