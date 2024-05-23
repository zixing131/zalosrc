package com.adtima;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.webkit.CookieManager;
import androidx.core.os.AbstractC1442h;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p178g3.AbstractC19211f;
import p227i3.AbstractC20202f;
import p227i3.C20217u;
import p313l3.AbstractC22008a;
import p342m6.InterfaceC22882g;
import p355n4.AbstractC23536a;
import p355n4.C23538c;
import p667y2.C30267d;

/* loaded from: classes2.dex */
public final class Adtima {
    public static final String SDK_BUILD_NUMBER = "20231025_TPL67";
    public static int SDK_DOWNLOAD_VERSION_CODE = 67;
    static final int SDK_ENVIRONMENT = 2;
    static final int SDK_ENVIRONMENT_PRODUCT = 2;
    static final int SDK_ENVIRONMENT_SANDBOX = 1;
    public static final int SDK_PRODUCT_VERSION_CODE = 67;
    static HashMap<String, String> SDK_SUPPORT_NETWORK = null;
    public static int SDK_VERSION_CODE = 67;
    public static final String SDK_VERSION_NAME = "2.0.7";
    public static Context SharedContext = null;
    private static final String TAG = "Adtima";
    public static boolean mIsCheckingLAT = false;
    public static int mIsLat = 0;
    private static boolean mIsReiniting = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.Adtima$a */
    /* loaded from: classes2.dex */
    public class RunnableC3636a implements Runnable {
        RunnableC3636a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean unused = Adtima.mIsReiniting = false;
        }
    }

    /* renamed from: com.adtima.Adtima$b */
    /* loaded from: classes2.dex */
    public class C3637b extends AbstractRunnableC0008c {
        C3637b() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            try {
                Adtima.m18328e(Adtima.TAG, "getUUID: " + C30267d.m149339A().m149347I());
                if (C30267d.m149339A().m149347I() != null) {
                    return null;
                }
                String uuid = UUID.randomUUID().toString();
                C30267d.m149339A().m149344F(uuid);
                Adtima.m18328e(Adtima.TAG, "genUUID: " + uuid);
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: com.adtima.Adtima$c */
    /* loaded from: classes2.dex */
    public class C3638c extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ Context f15298p;

        /* renamed from: com.adtima.Adtima$c$a */
        /* loaded from: classes2.dex */
        class a implements InterfaceC22882g {
            a(C3638c c3638c) {
            }

            @Override // p342m6.InterfaceC22882g
            /* renamed from: a */
            public void onSuccess(C23538c c23538c) {
                String m123623a = c23538c.m123623a();
                C30267d.m149339A().m149361r(m123623a);
                Adtima.m18328e(Adtima.TAG, "AppSetIdInfo: " + m123623a);
            }
        }

        C3638c(Context context) {
            this.f15298p = context;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            try {
                Adtima.m18328e(Adtima.TAG, "getUUID: " + C30267d.m149339A().m149347I());
                if (C30267d.m149339A().m149362s() != null) {
                    return null;
                }
                AbstractC23536a.m123621a(this.f15298p).mo123622d().mo117578g(new a(this));
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: com.adtima.Adtima$d */
    /* loaded from: classes2.dex */
    public class C3639d extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ Context f15299p;

        C3639d(Context context) {
            this.f15299p = context;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            try {
                if (AdvertisingIdClient.getAdvertisingIdInfo(this.f15299p).isLimitAdTrackingEnabled()) {
                    Adtima.mIsLat = 1;
                } else {
                    Adtima.mIsLat = 0;
                }
                return null;
            } catch (GooglePlayServicesNotAvailableException e11) {
                e = e11;
                e.printStackTrace();
                return null;
            } catch (GooglePlayServicesRepairableException e12) {
                e = e12;
                e.printStackTrace();
                return null;
            } catch (IOException e13) {
                e = e13;
                e.printStackTrace();
                return null;
            }
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Object obj) {
            Adtima.mIsCheckingLAT = false;
            Adtima.m18328e(Adtima.TAG, "getIsLat: " + Adtima.mIsLat);
            super.onPostExecute(obj);
        }
    }

    static {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        try {
            z11 = AbstractC22008a.m114893a("com.google.android.gms.ads.AdRequest");
        } catch (Exception e11) {
            m18329e(TAG, "static", e11);
            z11 = false;
        }
        try {
            z12 = AbstractC22008a.m114893a("com.google.android.gms.ads.AdRequest");
        } catch (Exception e12) {
            m18329e(TAG, "static", e12);
            z12 = false;
        }
        try {
            z13 = AbstractC22008a.m114893a("com.google.ads.interactivemedia.v3.api.AdsRequest");
        } catch (Exception e13) {
            m18329e(TAG, "static", e13);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        SDK_SUPPORT_NETWORK = hashMap;
        hashMap.put("adtima", "r11rect;r31rect;r169rect;medium;large;fullpage;interstitial;incentivized;video_suite;native");
        if (z11) {
            SDK_SUPPORT_NETWORK.put("admob", "r11rect;r31rect;r169rect;medium;fullpage;interstitial;incentivized;native");
        }
        if (z12) {
            SDK_SUPPORT_NETWORK.put("dfp", "r11rect;r31rect;r169rect;medium;fullpage;interstitial");
        }
        if (z13) {
            SDK_SUPPORT_NETWORK.put("ima", "video_suite;fullpage;interstitial;native");
        }
    }

    /* renamed from: d */
    public static void m18326d(String str, String str2) {
        isDebuggable();
    }

    /* renamed from: e */
    public static void m18328e(String str, String str2) {
        isDebuggable();
    }

    private static void genAppSetId(Context context) {
        try {
            C0009d.m11g(new C3638c(context));
        } catch (Exception unused) {
        }
    }

    private static void genUUID() {
        try {
            C0009d.m11g(new C3637b());
        } catch (Exception unused) {
        }
    }

    public static String getDeviceId(Context context) {
        try {
            SharedContext = context.getApplicationContext();
            return C20217u.m105538N0().m105579J0();
        } catch (Exception e11) {
            m18329e(TAG, "initSdk", e11);
            return null;
        }
    }

    private static void getIsLat(Context context) {
        try {
            if (mIsCheckingLAT) {
                return;
            }
            mIsCheckingLAT = true;
            C0009d.m11g(new C3639d(context));
        } catch (Exception unused) {
        }
    }

    @Deprecated
    public static void initSdk(Context context) {
        try {
            SharedContext = context;
            genUUID();
            C20217u m105538N0 = C20217u.m105538N0();
            m105538N0.m105607o(SDK_VERSION_CODE);
            m105538N0.m105576G0();
            genAppSetId(context);
            getIsLat(context);
        } catch (Exception e11) {
            m18329e(TAG, "initSdk", e11);
        }
    }

    public static boolean isDebuggable() {
        return false;
    }

    public static boolean isSupport(String str) {
        try {
            String str2 = SDK_SUPPORT_NETWORK.get(str);
            if (str2 != null) {
                if (str2.length() != 0) {
                    return true;
                }
            }
        } catch (Exception e11) {
            m18329e(TAG, "isSupport", e11);
        }
        return false;
    }

    /* renamed from: p */
    public static void m18330p(String str, String str2) {
    }

    public static void reInitSdk(Context context, String str) {
        try {
            if (mIsReiniting) {
                return;
            }
            mIsReiniting = true;
            C20217u.m105538N0().m105610r(SDK_VERSION_CODE, str);
            AbstractC20202f.f99816i0 = str;
            AbstractC1442h.m7349a(Looper.getMainLooper()).postDelayed(new RunnableC3636a(), 1000L);
        } catch (Exception e11) {
            m18329e(TAG, "reInitSdk", e11);
        }
    }

    public static void setCookies(String str, Bundle bundle) {
        if (bundle == null || str == null) {
            return;
        }
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            for (String str2 : bundle.keySet()) {
                cookieManager.setCookie(str, str2 + "=" + bundle.get(str2) + ";");
            }
            cookieManager.setCookie(str, "Secure;");
            cookieManager.flush();
        } catch (Exception e11) {
            m18329e(TAG, "setCookies", e11);
        }
    }

    public static void setPreferVideoSurfaceView(boolean z11) {
        AbstractC19211f.f95654b = z11;
    }

    public static void setSiteId(Context context, String str) {
        try {
            SharedContext = context;
            C20217u.m105538N0().m105603j0(SDK_VERSION_CODE, str);
            AbstractC20202f.f99816i0 = str;
        } catch (Exception e11) {
            m18329e(TAG, "initSdk", e11);
        }
    }

    public static void setZaloLogin(boolean z11) {
        try {
            C20217u.m105538N0().m105597Z(z11);
        } catch (Exception e11) {
            m18329e(TAG, "setZaloUserId", e11);
        }
    }

    public static void setZaloUserId(String str) {
        try {
            C20217u.m105538N0().m105617w0(str);
        } catch (Exception e11) {
            m18329e(TAG, "setZaloUserId", e11);
        }
    }

    public static void updateSupportNetwork() {
        try {
            if (SDK_SUPPORT_NETWORK == null) {
                return;
            }
            if (!AbstractC20202f.f99792T) {
                SDK_SUPPORT_NETWORK.remove("admob");
                SDK_SUPPORT_NETWORK.remove("dfp");
                SDK_SUPPORT_NETWORK.remove("ima");
            }
            m18326d(TAG, "Done update support network.");
        } catch (Exception unused) {
            m18328e(TAG, "updateSupportNetwork");
        }
    }

    /* renamed from: v */
    public static void m18332v(String str, String str2) {
        isDebuggable();
    }

    /* renamed from: d */
    public static void m18327d(String str, String str2, Exception exc) {
        isDebuggable();
    }

    /* renamed from: e */
    public static void m18329e(String str, String str2, Exception exc) {
        isDebuggable();
    }

    public static void initSdk(Context context, String str) {
        try {
            SharedContext = context;
            genUUID();
            C20217u m105538N0 = C20217u.m105538N0();
            m105538N0.m105610r(SDK_VERSION_CODE, str);
            m105538N0.m105576G0();
            AbstractC20202f.f99816i0 = str;
            genAppSetId(context);
            getIsLat(context);
        } catch (Exception e11) {
            m18329e(TAG, "initSdk", e11);
        }
    }

    public static boolean isSupport(String str, String str2) {
        try {
            String str3 = SDK_SUPPORT_NETWORK.get(str);
            if (str3 != null) {
                if (str3.contains(str2)) {
                    return true;
                }
            }
        } catch (Exception e11) {
            m18329e(TAG, "isSupport", e11);
        }
        return false;
    }

    /* renamed from: p */
    public static void m18331p(String str, String str2, Exception exc) {
    }

    /* renamed from: v */
    public static void m18333v(String str, String str2, Exception exc) {
        isDebuggable();
    }

    public static void initSdk(Context context, String str, boolean z11) {
        try {
            SharedContext = context.getApplicationContext();
            C20217u.m105538N0().m105610r(SDK_VERSION_CODE, str);
            AbstractC20202f.f99816i0 = str;
            AbstractC20202f.f99815i = z11;
        } catch (Exception e11) {
            m18329e(TAG, "initSdk", e11);
        }
    }

    public static void initSdk(Context context, boolean z11) {
        try {
            SharedContext = context.getApplicationContext();
            genUUID();
            C20217u m105538N0 = C20217u.m105538N0();
            m105538N0.m105607o(SDK_VERSION_CODE);
            m105538N0.m105576G0();
            AbstractC20202f.f99815i = z11;
            genAppSetId(context);
            getIsLat(context);
        } catch (Exception e11) {
            m18329e(TAG, "initSdk", e11);
        }
    }
}
