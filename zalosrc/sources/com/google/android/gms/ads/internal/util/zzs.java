package com.google.android.gms.ads.internal.util;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.impl.C4008R;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC4593hz;
import com.google.android.gms.internal.ads.AbstractC5184xw;
import com.google.android.gms.internal.ads.C4555gy;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.iq2;
import com.google.android.gms.internal.ads.kc3;
import com.google.android.gms.internal.ads.kl0;
import com.google.android.gms.internal.ads.lq2;
import com.google.android.gms.internal.ads.m23;
import com.google.android.gms.internal.ads.qq0;
import com.google.android.gms.internal.ads.tc3;
import com.google.android.gms.internal.ads.x04;
import com.google.android.gms.internal.ads.xk0;
import com.google.android.gms.internal.ads.xr0;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.zzdvb;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p229i5.AbstractC20284e;
import p229i5.AbstractC20287h;
import p229i5.AbstractC20298s;
import p289k5.C21472e;
import p468r0.C25593d;

/* loaded from: classes2.dex */
public final class zzs {
    public static final m23 zza = new zzf(Looper.getMainLooper());
    private String zzf;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private boolean zzd = true;
    private final Object zze = new Object();
    private boolean zzg = false;
    private boolean zzh = false;
    private final Executor zzi = Executors.newSingleThreadExecutor();

    public static final boolean zzA(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th2) {
            yk0.zzh("Error loading class.", th2);
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(th2, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzB() {
        int myUid = Process.myUid();
        if (myUid != 0 && myUid != 1000) {
            return false;
        }
        return true;
    }

    public static final boolean zzC(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        if (powerManager.isScreenOn()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzD(Context context) {
        Bundle zzU = zzU(context);
        String string = zzU.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
        if (TextUtils.isEmpty(zzV(zzU)) && !TextUtils.isEmpty(string)) {
            return true;
        }
        return false;
    }

    public static final boolean zzE(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzF(View view, int i11, MotionEvent motionEvent) {
        String str;
        int i12;
        int i13;
        int i14;
        String str2;
        iq2 mo25866b;
        lq2 mo26710w;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdvb) {
                view2 = ((zzdvb) view2).getChildAt(0);
            }
            if (!(view2 instanceof com.google.android.gms.ads.formats.zzg) && !(view2 instanceof NativeAdView)) {
                str = "UNKNOWN";
                i12 = 0;
            } else {
                str = "NATIVE";
                i12 = 1;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i14 = rect.width();
                i13 = rect.height();
            } else {
                i13 = 0;
                i14 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            long zzt = zzt(view2);
            view2.getLocationOnScreen(iArr);
            int i15 = iArr[0];
            int i16 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof xr0) || (mo26710w = ((xr0) view2).mo26710w()) == null) {
                str2 = "none";
            } else {
                str2 = mo26710w.f24014b;
                view2.setContentDescription(str2 + ":" + view2.hashCode());
            }
            if ((view2 instanceof qq0) && (mo25866b = ((qq0) view2).mo25866b()) != null) {
                str = iq2.m23338a(mo25866b.f22315b);
                i12 = mo25866b.f22323f;
                str3 = mo25866b.f22292F;
            }
            yk0.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i12), view2.getClass().getName(), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i14), Integer.valueOf(i13), Long.valueOf(zzt), Integer.toString(i11, 2)));
        } catch (Exception e11) {
            yk0.zzh("Failure getting view location.", e11);
        }
    }

    public static final AlertDialog.Builder zzG(Context context) {
        return new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zzq().zza());
    }

    public static final void zzH(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new zzby(context, str, (String) it.next()).zzb();
        }
    }

    public static final void zzI(Context context, Throwable th2) {
        if (context != null) {
            try {
                if (((Boolean) AbstractC4593hz.f21967b.m24091e()).booleanValue()) {
                    AbstractC20287h.m105925a(context, th2);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void zzJ(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final int zzK(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e11) {
            yk0.zzj("Could not parse value:".concat(e11.toString()));
            return 0;
        }
    }

    public static final Map zzL(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final WebResourceResponse zzM(HttpURLConnection httpURLConnection) throws IOException {
        String trim;
        com.google.android.gms.ads.internal.zzt.zzp();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        if (TextUtils.isEmpty(contentType)) {
            trim = "";
        } else {
            trim = contentType.split(";")[0].trim();
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i11 = 1;
                while (true) {
                    if (i11 >= split.length) {
                        break;
                    }
                    if (split[i11].trim().startsWith("charset")) {
                        String[] split2 = split[i11].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i11++;
                }
            }
        }
        String str2 = str;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && !entry.getValue().isEmpty()) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return com.google.android.gms.ads.internal.zzt.zzq().zzc(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static final int[] zzN(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window != null && (findViewById = window.findViewById(R.id.content)) != null) {
            return new int[]{findViewById.getWidth(), findViewById.getHeight()};
        }
        return zzs();
    }

    public static final int[] zzO(Activity activity) {
        int[] zzs;
        View findViewById;
        Window window = activity.getWindow();
        if (window != null && (findViewById = window.findViewById(R.id.content)) != null) {
            zzs = new int[]{findViewById.getTop(), findViewById.getBottom()};
        } else {
            zzs = zzs();
        }
        return new int[]{com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(activity, zzs[0]), com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(activity, zzs[1])};
    }

    public static final boolean zzP(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z11;
        if (com.google.android.gms.ads.internal.zzt.zzp().zzd || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzl(view)) {
            z11 = true;
        } else {
            z11 = false;
        }
        long zzt = zzt(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z11)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21228e1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21325n8)).booleanValue()) {
                    return true;
                }
                if (zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21345p8)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzQ(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzm(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            yk0.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e11) {
            yk0.zzh("No browser is found.", e11);
        }
    }

    public static final int[] zzR(Activity activity) {
        int[] zzN = zzN(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(activity, zzN[0]), com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(activity, zzN[1])};
    }

    public static final boolean zzS(View view, Context context) {
        PowerManager powerManager;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            powerManager = (PowerManager) applicationContext.getSystemService("power");
        } else {
            powerManager = null;
        }
        return zzP(view, powerManager, zzT(context));
    }

    private static KeyguardManager zzT(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    private static Bundle zzU(Context context) {
        try {
            return C21472e.m111067a(context).m111061c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e11) {
            zze.zzb("Error getting metadata", e11);
            return null;
        }
    }

    private static String zzV(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (!string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") && !string.matches("^/\\d+~.+$")) {
            return "";
        }
        return string;
    }

    private static boolean zzW(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static int zza(int i11) {
        if (i11 >= 5000) {
            return i11;
        }
        if (i11 > 0) {
            yk0.zzj("HTTP timeout too low: " + i11 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
            return 60000;
        }
        return 60000;
    }

    public static void zzf(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            kl0.f23363a.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zzl(View view) {
        Activity activity;
        View rootView = view.getRootView();
        WindowManager.LayoutParams layoutParams = null;
        if (rootView != null) {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    return false;
                }
                Window window = activity.getWindow();
                if (window != null) {
                    layoutParams = window.getAttributes();
                }
                if (layoutParams == null || (layoutParams.flags & 524288) == 0) {
                    return false;
                }
                return true;
            }
        }
        activity = null;
        if (activity != null) {
        }
    }

    public static final void zzm(Context context, Intent intent) {
        Bundle bundle;
        if (intent == null) {
            return;
        }
        if (intent.getExtras() != null) {
            bundle = intent.getExtras();
        } else {
            bundle = new Bundle();
        }
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        bundle.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(bundle);
    }

    public static final ViewGroup.LayoutParams zzn() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final String zzo(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzV(zzU(context));
    }

    static final String zzp() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String zzq() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics zzr(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzs() {
        return new int[]{0, 0};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzt(View view) {
        float f11;
        float f12 = Float.MAX_VALUE;
        do {
            f11 = 0.0f;
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f12 = Math.min(f12, view2.getAlpha());
            view = view2.getParent();
        } while (f12 > 0.0f);
        if (f12 >= 0.0f) {
            f11 = f12;
        }
        return Math.round(f11 * 100.0f);
    }

    public static final WebResourceResponse zzu(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e11) {
            yk0.zzk("Could not fetch MRAID JS.", e11);
        }
        return null;
    }

    public static final String zzv() {
        Resources m22933d = com.google.android.gms.ads.internal.zzt.zzo().m22933d();
        if (m22933d != null) {
            return m22933d.getString(C4008R.string.f15890s7);
        }
        return "Test Ad";
    }

    public static final zzbr zzw(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                yk0.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof zzbr) {
                return (zzbr) queryLocalInterface;
            }
            return new zzbp(iBinder);
        } catch (Exception e11) {
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(e11, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzx(Context context, String str) {
        Context m20113a = ag0.m20113a(context);
        if (C21472e.m111067a(m20113a).m111060b(str, m20113a.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean zzy(String str) {
        if (!xk0.m27903l()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21211c4)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21231e4);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21221d4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzz(Context context) {
        KeyguardManager zzT;
        if (context == null || (zzT = zzT(context)) == null || !zzT.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    public final tc3 zzb(Uri uri) {
        return kc3.m23879k(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzl
            public final /* synthetic */ Uri zza;

            public /* synthetic */ zzl(Uri uri2) {
                r1 = uri2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = r1;
                m23 m23Var = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                return zzs.zzL(uri2);
            }
        }, this.zzi);
    }

    public final String zzc(Context context, String str) {
        String str2;
        synchronized (this.zze) {
            try {
                String str3 = this.zzf;
                if (str3 != null) {
                    return str3;
                }
                if (str == null) {
                    return zzp();
                }
                try {
                    zzce zza2 = zzce.zza();
                    if (TextUtils.isEmpty(zza2.zza)) {
                        if (AbstractC20284e.m105912a()) {
                            str2 = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcc
                                public final /* synthetic */ Context zza;

                                public /* synthetic */ zzcc(Context context2) {
                                    r1 = context2;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Context context2 = r1;
                                    SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                    String string = sharedPreferences.getString("user_agent", "");
                                    if (TextUtils.isEmpty(string)) {
                                        zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                                        String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                        AbstractC20298s.m105961a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                        return defaultUserAgent;
                                    }
                                    zze.zza("User agent is already initialized on Google Play Services.");
                                    return string;
                                }
                            });
                        } else {
                            str2 = (String) zzcb.zza(context2, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                                public final /* synthetic */ Context zza;
                                public final /* synthetic */ Context zzb;

                                public /* synthetic */ zzcd(Context context2, Context context22) {
                                    r1 = context2;
                                    r2 = context22;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    SharedPreferences sharedPreferences;
                                    Context context2 = r1;
                                    Context context3 = r2;
                                    boolean z11 = false;
                                    if (context2 != null) {
                                        zze.zza("Attempting to read user agent from Google Play Services.");
                                        sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                    } else {
                                        zze.zza("Attempting to read user agent from local cache.");
                                        sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                        z11 = true;
                                    }
                                    String string = sharedPreferences.getString("user_agent", "");
                                    if (TextUtils.isEmpty(string)) {
                                        zze.zza("Reading user agent from WebSettings");
                                        string = WebSettings.getDefaultUserAgent(context3);
                                        if (z11) {
                                            sharedPreferences.edit().putString("user_agent", string).apply();
                                            zze.zza("Persisting user agent.");
                                        }
                                    }
                                    return string;
                                }
                            });
                        }
                        zza2.zza = str2;
                    }
                    this.zzf = zza2.zza;
                } catch (Exception unused) {
                }
                if (TextUtils.isEmpty(this.zzf)) {
                    this.zzf = WebSettings.getDefaultUserAgent(context22);
                }
                if (TextUtils.isEmpty(this.zzf)) {
                    this.zzf = zzp();
                }
                this.zzf = this.zzf + " (Mobile; " + str;
                try {
                    if (C21472e.m111067a(context22).m111065g()) {
                        this.zzf = this.zzf + ";aia";
                    }
                } catch (Exception e11) {
                    com.google.android.gms.ads.internal.zzt.zzo().m22945t(e11, "AdUtil.getUserAgent");
                }
                String str4 = this.zzf + ")";
                this.zzf = str4;
                return str4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zze(Context context, String str, boolean z11, HttpURLConnection httpURLConnection, boolean z12, int i11) {
        int zza2 = zza(i11);
        yk0.zzi("HTTP timeout: " + zza2 + " milliseconds.");
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzg(String str) {
        return zzW(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21177Z));
    }

    public final boolean zzh(String str) {
        return zzW(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21187a0));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzi(Context context) {
        if (this.zzh) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        AbstractC4554gx.m22622c(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f20980E8)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter);
        }
        this.zzh = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzj(Context context) {
        if (this.zzg) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        AbstractC4554gx.m22622c(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f20980E8)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter);
        }
        this.zzg = true;
        return true;
    }

    public final int zzk(Context context, Uri uri) {
        int i11;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i11 = 2;
        } else {
            i11 = 0;
        }
        AbstractC5184xw abstractC5184xw = AbstractC4554gx.f21015I3;
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(abstractC5184xw);
        AbstractC5184xw abstractC5184xw2 = AbstractC4554gx.f21025J3;
        if (true == bool.equals(com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(abstractC5184xw2))) {
            i11 = 9;
        }
        if (i11 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i11;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
            C4555gy c4555gy = new C4555gy();
            c4555gy.m22634e(new zzn(this, c4555gy, context, uri));
            c4555gy.m22631b((Activity) context);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(abstractC5184xw2)).booleanValue()) {
            C25593d m132189a = new C25593d.a().m132189a();
            m132189a.f122359a.setPackage(x04.m27799a(context));
            m132189a.m132187a(context, uri);
            return 5;
        }
        return 5;
    }
}
