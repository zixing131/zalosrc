package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.C4148b;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class rk0 {

    /* renamed from: b */
    public static final Handler f27282b = new m23(Looper.getMainLooper());

    /* renamed from: c */
    private static final String f27283c = AdView.class.getName();

    /* renamed from: d */
    private static final String f27284d = InterstitialAd.class.getName();

    /* renamed from: e */
    private static final String f27285e = AdManagerAdView.class.getName();

    /* renamed from: f */
    private static final String f27286f = AdManagerInterstitialAd.class.getName();

    /* renamed from: g */
    private static final String f27287g = SearchAdView.class.getName();

    /* renamed from: h */
    private static final String f27288h = AdLoader.class.getName();

    /* renamed from: a */
    private float f27289a = -1.0f;

    /* renamed from: A */
    private final JSONArray m26097A(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m26098B(jSONArray, it.next());
        }
        return jSONArray;
    }

    /* renamed from: B */
    private final void m26098B(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m26119j((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(m26120k((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(m26097A((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(m26118i((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: a */
    private final void m26099a(JSONObject jSONObject, String str, Object obj) {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21356r)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, m26119j((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, m26120k((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), m26097A((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, m26097A(Arrays.asList((Object[]) obj)));
            return;
        }
        int i11 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i11 < length) {
                    numArr2[i11] = Integer.valueOf(iArr[i11]);
                    i11++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, m26118i(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i11 < length2) {
                    dArr3[i11] = Double.valueOf(dArr2[i11]);
                    i11++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, m26118i(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i11 < length3) {
                    lArr2[i11] = Long.valueOf(jArr[i11]);
                    i11++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, m26118i(lArr));
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr == null) {
                boolArr = new Boolean[0];
            } else {
                int length4 = zArr.length;
                Boolean[] boolArr2 = new Boolean[length4];
                while (i11 < length4) {
                    boolArr2[i11] = Boolean.valueOf(zArr[i11]);
                    i11++;
                }
                boolArr = boolArr2;
            }
            jSONObject.put(str, m26118i(boolArr));
            return;
        }
        jSONObject.put(str, obj);
    }

    /* renamed from: b */
    private static final void m26100b(ViewGroup viewGroup, zzq zzqVar, String str, int i11, int i12) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i11);
        textView.setBackgroundColor(i12);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i11);
        int m26115y = m26115y(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzqVar.zzf - m26115y, zzqVar.zzc - m26115y, 17));
        viewGroup.addView(frameLayout, zzqVar.zzf, zzqVar.zzc);
    }

    /* renamed from: c */
    public static int m26101c(Context context, int i11) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i12 = configuration.orientation;
        if (i11 == 0) {
            i11 = i12;
        }
        if (i11 == i12) {
            return Math.round(displayMetrics.heightPixels / displayMetrics.density);
        }
        return Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    /* renamed from: e */
    public static AdSize m26102e(Context context, int i11, int i12, int i13) {
        int round;
        int m26101c = m26101c(context, i13);
        if (m26101c == -1) {
            return AdSize.INVALID;
        }
        int min = Math.min(90, Math.round(m26101c * 0.15f));
        if (i11 > 655) {
            round = Math.round((i11 / 728.0f) * 90.0f);
        } else if (i11 > 632) {
            round = 81;
        } else if (i11 > 526) {
            round = Math.round((i11 / 468.0f) * 60.0f);
        } else if (i11 > 432) {
            round = 68;
        } else {
            round = Math.round((i11 / 320.0f) * 50.0f);
        }
        return new AdSize(i11, Math.max(Math.min(round, min), 50));
    }

    /* renamed from: f */
    public static String m26103f() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i11 = 0; i11 < 2; i11++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: g */
    public static String m26104g(String str) {
        for (int i11 = 0; i11 < 2; i11++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    /* renamed from: h */
    public static Throwable m26105h(Throwable th2) {
        if (((Boolean) AbstractC4593hz.f21971f.m24091e()).booleanValue()) {
            return th2;
        }
        LinkedList linkedList = new LinkedList();
        while (th2 != null) {
            linkedList.push(th2);
            th2 = th2.getCause();
        }
        Throwable th3 = null;
        while (!linkedList.isEmpty()) {
            Throwable th4 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th4.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z11 = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m26106p(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z11 = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    } else {
                        arrayList.add(stackTraceElement);
                    }
                }
            }
            if (z11) {
                if (th3 == null) {
                    th3 = new Throwable(th4.getMessage());
                } else {
                    th3 = new Throwable(th4.getMessage(), th3);
                }
                th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th3;
    }

    /* renamed from: p */
    public static boolean m26106p(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) AbstractC4593hz.f21969d.m24091e());
    }

    /* renamed from: q */
    public static final int m26107q(DisplayMetrics displayMetrics, int i11) {
        return (int) TypedValue.applyDimension(1, i11, displayMetrics);
    }

    /* renamed from: r */
    public static final String m26108r(StackTraceElement[] stackTraceElementArr, String str) {
        int i11;
        String str2;
        int i12 = 0;
        while (true) {
            i11 = i12 + 1;
            if (i11 < stackTraceElementArr.length) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i12];
                String className = stackTraceElement.getClassName();
                if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f27283c.equalsIgnoreCase(className) && !f27284d.equalsIgnoreCase(className) && !f27285e.equalsIgnoreCase(className) && !f27286f.equalsIgnoreCase(className) && !f27287g.equalsIgnoreCase(className) && !f27288h.equalsIgnoreCase(className))) {
                    i12 = i11;
                }
            } else {
                str2 = null;
                break;
            }
        }
        str2 = stackTraceElementArr[i11].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb2 = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb2.append(stringTokenizer.nextToken());
                int i13 = 2;
                while (true) {
                    int i14 = i13 - 1;
                    if (i13 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb2.append(".");
                    sb2.append(stringTokenizer.nextToken());
                    i13 = i14;
                }
                str = sb2.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: s */
    public static final boolean m26109s() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            if (!str.contains("generic") && !str.contains("emulator")) {
                return false;
            }
            return true;
        }
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: t */
    public static final boolean m26110t(Context context, int i11) {
        if (C4148b.m19567h().mo19201j(context, i11) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static final boolean m26111u(Context context) {
        int mo19201j = C4148b.m19567h().mo19201j(context, AbstractC4150d.f16480a);
        if (mo19201j != 0 && mo19201j != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static final boolean m26112v() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static final int m26113w(DisplayMetrics displayMetrics, int i11) {
        return Math.round(i11 / displayMetrics.density);
    }

    /* renamed from: x */
    public static final void m26114x(Context context, String str, String str2, Bundle bundle, boolean z11, qk0 qk0Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = C4148b.m19567h().m19569b(context) + ".223104000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        qk0Var.zza(appendQueryParameter.toString());
    }

    /* renamed from: y */
    public static final int m26115y(Context context, int i11) {
        return m26107q(context.getResources().getDisplayMetrics(), i11);
    }

    /* renamed from: z */
    public static final String m26116z(Context context) {
        String string;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (string == null || m26109s()) {
            string = "emulator";
        }
        return m26104g(string);
    }

    /* renamed from: d */
    public final int m26117d(Context context, int i11) {
        if (this.f27289a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f27289a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f27289a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i11 / this.f27289a);
    }

    /* renamed from: i */
    final JSONArray m26118i(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            m26098B(jSONArray, obj);
        }
        return jSONArray;
    }

    /* renamed from: j */
    public final JSONObject m26119j(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m26099a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: k */
    public final JSONObject m26120k(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m26099a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e11) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e11.getMessage())));
        }
    }

    /* renamed from: l */
    public final JSONObject m26121l(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return m26119j(bundle);
        } catch (JSONException e11) {
            yk0.zzh("Error converting Bundle to JSON", e11);
            return null;
        }
    }

    /* renamed from: m */
    public final void m26122m(ViewGroup viewGroup, zzq zzqVar, String str, String str2) {
        if (str2 != null) {
            yk0.zzj(str2);
        }
        m26100b(viewGroup, zzqVar, str, -65536, -16777216);
    }

    /* renamed from: n */
    public final void m26123n(ViewGroup viewGroup, zzq zzqVar, String str) {
        m26100b(viewGroup, zzqVar, "Ads by Google", -16777216, -1);
    }

    /* renamed from: o */
    public final void m26124o(Context context, String str, String str2, Bundle bundle, boolean z11) {
        m26114x(context, str, "gmob-apps", bundle, true, new qk0() { // from class: com.google.android.gms.internal.ads.ok0
            public /* synthetic */ ok0() {
            }

            @Override // com.google.android.gms.internal.ads.qk0
            public final boolean zza(String str3) {
                new pk0(rk0.this, str3).start();
                return true;
            }
        });
    }
}
