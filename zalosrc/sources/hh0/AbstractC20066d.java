package hh0;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import jh0.AbstractC21254a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hh0.d */
/* loaded from: classes.dex */
public abstract class AbstractC20066d {
    /* renamed from: A */
    public static void m104281A(Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                edit.putString(str2, str3);
                edit.apply();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m104282a(JSONObject jSONObject, Map map) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (map == null) {
            return jSONObject;
        }
        for (String str : map.keySet()) {
            try {
                jSONObject.put(str, map.get(str));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static boolean m104283b() {
        return false;
    }

    /* renamed from: c */
    public static String m104284c(Context context) {
        return AbstractC20064b.m104251a(context);
    }

    /* renamed from: d */
    public static boolean m104285d(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            return false;
        }
        try {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                if (jSONObject.getInt(str) == 0) {
                    return false;
                }
                return true;
            }
        } catch (JSONException unused2) {
            return false;
        }
    }

    /* renamed from: e */
    public static String m104286e(Context context) {
        return AbstractC20064b.m104254d(context);
    }

    /* renamed from: f */
    public static String m104287f(Context context) {
        return m104294m(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.preloadkey.exception");
    }

    /* renamed from: g */
    public static String m104288g() {
        return "4.24.0301";
    }

    /* renamed from: h */
    public static int m104289h() {
        return 260401;
    }

    /* renamed from: i */
    public static boolean m104290i(Context context, String str, String str2) {
        if (context == null) {
            return false;
        }
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, false);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: j */
    public static int m104291j(Context context, String str, String str2) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, -1);
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: k */
    public static long m104292k(Context context, String str, String str2) {
        if (context != null) {
            try {
                return context.getSharedPreferences(str, 0).getLong(str2, -1L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return 0L;
    }

    /* renamed from: l */
    public static String m104293l(Context context) {
        return m104294m(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.preloadkey");
    }

    /* renamed from: m */
    public static String m104294m(Context context, String str, String str2) {
        if (context == null) {
            return "";
        }
        try {
            return context.getSharedPreferences(str, 0).getString(str2, "");
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: n */
    public static String m104295n(String[] strArr, String[] strArr2, String str) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.clear();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                arrayList.add(strArr[i11] + "=" + strArr2[i11]);
            }
            Collections.sort(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
            sb2.append(str);
            AbstractC21254a.m110068j("bsig: " + sb2.toString());
            return m104301t(sb2.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: o */
    public static String m104296o(Context context) {
        return AbstractC20064b.m104270t(context);
    }

    /* renamed from: p */
    public static boolean m104297p(Application application) {
        try {
            Method method = Class.forName("com.zing.zalo.zalosdk.oauth.ZaloSDKApplication").getMethod("wrap", Application.class);
            if (method != null) {
                method.invoke(null, application);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m104298q(Context context, String str) {
        int checkPermission;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Method method = context.getClass().getMethod("checkSelfPermission", String.class);
                if (method != null) {
                    checkPermission = ((Integer) method.invoke(context, str)).intValue();
                } else {
                    checkPermission = context.getPackageManager().checkPermission(str, context.getPackageName());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        } else {
            checkPermission = context.getPackageManager().checkPermission(str, context.getPackageName());
        }
        if (checkPermission != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static String m104299r(Context context) {
        return m104294m(context, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.listdeviceid_wk");
    }

    /* renamed from: s */
    public static JSONObject m104300s(Map map) {
        return m104282a(null, map);
    }

    /* renamed from: t */
    public static String m104301t(String str) {
        String str2 = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            for (byte b11 : digest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    str2 = str2 + "0" + hexString;
                } else {
                    str2 = str2 + hexString;
                }
            }
        } catch (NoSuchAlgorithmException unused) {
        }
        return str2;
    }

    /* renamed from: u */
    public static String m104302u(String str) {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder sb2 = new StringBuilder(256);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
            } else {
                fileInputStream.close();
                return sb2.toString();
            }
        }
    }

    /* renamed from: v */
    public static void m104303v(Context context, String str, String str2, boolean z11) {
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                edit.putBoolean(str2, z11);
                edit.apply();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: w */
    public static void m104304w(Context context, String str) {
        m104281A(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.preloadkey.exception", str);
    }

    /* renamed from: x */
    public static void m104305x(Context context, String str, String str2, int i11) {
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                edit.putInt(str2, i11);
                edit.apply();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: y */
    public static void m104306y(Context context, String str, String str2, long j11) {
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                edit.putLong(str2, j11);
                edit.apply();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: z */
    public static void m104307z(Context context, String str) {
        m104281A(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.preloadkey", str);
    }
}
