package hh0;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.zing.zalo.zalosdk.core.exception.PreloadException;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import gh0.C19447a;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import jh0.AbstractC21254a;
import lh0.EnumC22486a;
import om.C24310c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p327lm.AbstractC22527g;
import p327lm.AsyncTaskC22525e;
import p327lm.C22523c;

/* renamed from: hh0.b */
/* loaded from: classes.dex */
public abstract class AbstractC20064b {

    /* renamed from: a */
    static String f98667a;

    /* renamed from: b */
    static String f98668b;

    /* renamed from: c */
    static Location f98669c;

    /* renamed from: d */
    static String f98670d;

    /* renamed from: e */
    static String f98671e;

    /* renamed from: f */
    public static C24310c f98672f;

    /* renamed from: g */
    private static final Object f98673g = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hh0.b$a */
    /* loaded from: classes7.dex */
    public class a implements C22523c.a {

        /* renamed from: a */
        final /* synthetic */ Context f98674a;

        /* renamed from: b */
        final /* synthetic */ b f98675b;

        /* renamed from: hh0.b$a$a */
        /* loaded from: classes7.dex */
        class C32831a implements AsyncTaskC22525e.a {
            C32831a() {
            }

            @Override // p327lm.AsyncTaskC22525e.a
            /* renamed from: a */
            public void mo104274a() {
                C24310c c24310c;
                b bVar = a.this.f98675b;
                if (bVar != null && (c24310c = AbstractC20064b.f98672f) != null) {
                    bVar.mo99244a(c24310c.m126955c(), AbstractC20064b.f98672f.f117392a);
                }
            }

            @Override // p327lm.AsyncTaskC22525e.a
            /* renamed from: b */
            public void mo104275b(int i11, String str) {
                AbstractC21254a.m110063e("getPreloadInfo", "Error message: " + str);
                b bVar = a.this.f98675b;
                if (bVar != null) {
                    bVar.mo99244a(AbstractC20064b.f98672f.m126955c(), AbstractC20064b.f98672f.f117392a);
                }
            }
        }

        a(Context context, b bVar) {
            this.f98674a = context;
            this.f98675b = bVar;
        }

        @Override // p327lm.C22523c.a
        /* renamed from: a */
        public void mo99243a(String str) {
            new AsyncTaskC22525e(this.f98674a, new C32831a(), str).execute(new Context[0]);
        }
    }

    /* renamed from: hh0.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo99244a(boolean z11, String str);
    }

    /* renamed from: a */
    public static String m104251a(Context context) {
        String string;
        Object m104271u;
        String str;
        String str2 = f98671e;
        if (str2 != null) {
            return str2;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("adsid", 0);
        try {
            string = sharedPreferences.getString("adsidstr", null);
            f98671e = string;
        } catch (Exception e11) {
            AbstractC21254a.m110062d("getAdvertiseID", e11);
        }
        if (string != null) {
            return string;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Method m104259i = m104259i("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
            if (m104259i != null && (m104271u = m104271u(null, m104259i, context)) != null) {
                Method m104258h = m104258h(m104271u.getClass(), "getId", new Class[0]);
                Method m104258h2 = m104258h(m104271u.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (m104258h != null && m104258h2 != null && (str = (String) m104271u(m104271u, m104258h, new Object[0])) != null && str.length() > 0) {
                    f98671e = str;
                }
            }
            String str3 = f98671e;
            if (str3 != null && str3.length() > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("adsidstr", f98671e);
                edit.apply();
            }
            return f98671e;
        }
        throw new Exception("DeviceHelper.getAdvertiseID call on main thread!!");
    }

    /* renamed from: b */
    public static String m104252b(Context context) {
        return "unknown";
    }

    /* renamed from: c */
    public static String m104253c() {
        return Build.BRAND;
    }

    /* renamed from: d */
    public static String m104254d(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    return "wifi";
                }
                if (activeNetworkInfo.getType() == 0) {
                    return "mobile";
                }
                return "";
            }
            return "";
        } catch (Error | Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static Location m104255e(Context context) {
        LocationManager locationManager;
        Location location = f98669c;
        if (location != null) {
            return location;
        }
        try {
            if ((AbstractC22527g.m116531a(context, "android.permission.ACCESS_FINE_LOCATION") || AbstractC22527g.m116531a(context, "android.permission.ACCESS_COARSE_LOCATION")) && (locationManager = (LocationManager) context.getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) != null) {
                f98669c = locationManager.getLastKnownLocation("network");
            }
        } catch (Exception unused) {
        }
        return f98669c;
    }

    /* renamed from: f */
    private static String m104256f(Context context, String str) {
        return "";
    }

    /* renamed from: g */
    public static String m104257g() {
        return Build.MANUFACTURER;
    }

    /* renamed from: h */
    private static Method m104258h(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: i */
    private static Method m104259i(String str, String str2, Class... clsArr) {
        try {
            return m104258h(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static String m104260j(Context context) {
        String str = f98667a;
        if (str != null) {
            return str;
        }
        try {
            if (AbstractC22527g.m116531a(context, "android.permission.READ_PHONE_STATE")) {
                f98667a = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            } else {
                f98667a = "unknown";
            }
        } catch (Exception unused) {
            f98667a = "unknown";
        }
        return f98667a;
    }

    /* renamed from: k */
    public static String m104261k() {
        return Build.MODEL;
    }

    /* renamed from: l */
    public static String m104262l(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    return String.valueOf(EnumC22486a.WIFI.m116271c());
                }
                if (activeNetworkInfo.getType() == 0) {
                    return String.valueOf(EnumC22486a.MOBILE.m116271c());
                }
                return "";
            }
            return "";
        } catch (Error | Exception unused) {
            return "";
        }
    }

    /* renamed from: m */
    public static String m104263m() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: n */
    public static C24310c m104264n(Context context) {
        synchronized (f98673g) {
            try {
                C24310c c24310c = f98672f;
                if (c24310c != null) {
                    return c24310c;
                }
                String m104293l = AbstractC20066d.m104293l(context);
                String m104287f = AbstractC20066d.m104287f(context);
                if (f98672f == null && TextUtils.isEmpty(m104287f)) {
                    try {
                        m104272v(context);
                    } catch (Throwable unused) {
                        m104273w(context);
                    }
                    AbstractC20066d.m104307z(context, f98672f.f117392a);
                    AbstractC20066d.m104304w(context, f98672f.f117393b);
                    return f98672f;
                }
                C24310c c24310c2 = new C24310c(context, m104293l, m104287f);
                f98672f = c24310c2;
                return c24310c2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o */
    public static void m104265o(Context context, b bVar) {
        synchronized (f98673g) {
            try {
                m104264n(context);
                if (!f98672f.m126955c() && C19447a.m101720d().m101730k(context)) {
                    C22523c.m116498g().m116504e(new a(context, bVar));
                } else {
                    bVar.mo99244a(f98672f.m126955c(), f98672f.f117392a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public static String m104266p() {
        return Build.PRODUCT;
    }

    /* renamed from: q */
    public static String m104267q(Context context) {
        String str = f98668b;
        if (str != null) {
            return str;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f98668b = point.x + "x" + point.y;
        } catch (Exception unused) {
            f98668b = "unknown";
        }
        return f98668b;
    }

    /* renamed from: r */
    public static String m104268r() {
        return "unknown";
    }

    /* renamed from: s */
    private static String m104269s(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "null");
        } catch (Exception e11) {
            e11.printStackTrace();
            return str2;
        }
    }

    /* renamed from: t */
    public static String m104270t(Context context) {
        String str = f98670d;
        if (str != null) {
            return str;
        }
        String m104256f = m104256f(context, "wlan0");
        f98670d = m104256f;
        return m104256f;
    }

    /* renamed from: u */
    private static Object m104271u(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: v */
    public static void m104272v(Context context) {
        f98672f = new C24310c(context);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        boolean z11 = true;
        try {
            String str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "ro.trackingId." + C20063a.m104243l(context), "");
            if (!TextUtils.isEmpty(str)) {
                f98672f.f117392a = str;
                z11 = false;
            } else {
                jSONObject.put("err", "-2");
            }
        } catch (Throwable th2) {
            jSONObject.put("err", "-1: " + th2.getMessage());
        }
        jSONArray.put(jSONObject);
        f98672f.f117393b = jSONArray.toString();
        if (!z11) {
        } else {
            throw new PreloadException("Failed to get preload while using new method !");
        }
    }

    /* renamed from: w */
    private static void m104273w(Context context) {
        ArrayList arrayList = new ArrayList();
        String str = m104269s("ro.preinstall.path", "") + "zalo_appchannel.in";
        arrayList.add("/cust/etc/zalo_appchannel.in");
        arrayList.add(str);
        arrayList.add("/data/etc/appchannel/zalo_appchannel.in");
        arrayList.add("/data/etc/appchannel");
        arrayList.add("/system/etc/zalo_appchannel.in");
        arrayList.add("/my_preload/etc/appchannel/zalo_appchannel.in");
        int i11 = 0;
        try {
            f98672f = new C24310c(context);
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fileCode", arrayList.indexOf(str2));
                jSONObject.put("filePath", str2);
                try {
                    String m104302u = AbstractC20066d.m104302u(str2);
                    if (!TextUtils.isEmpty(m104302u)) {
                        if (m104302u.contains(":")) {
                            String[] split = m104302u.split(":");
                            if (split.length == 2) {
                                f98672f.f117392a = split[1].trim();
                                jSONArray.put(jSONObject);
                                break;
                            }
                            continue;
                        } else {
                            jSONObject.put("err", "-3");
                        }
                    } else {
                        jSONObject.put("err", "-4");
                    }
                } catch (FileNotFoundException unused) {
                    jSONObject.put("err", "-2");
                    i11++;
                } catch (Exception e11) {
                    jSONObject.put("err", "-1: " + e11.getMessage());
                }
                jSONArray.put(jSONObject);
            }
            f98672f.f117393b = jSONArray.toString();
        } catch (JSONException e12) {
            AbstractC21254a.m110062d("readingPreloadOldMethod", e12);
        }
        if (i11 == arrayList.size()) {
            C24310c c24310c = f98672f;
            c24310c.f117392a = "";
            c24310c.f117393b = "";
        }
    }
}
