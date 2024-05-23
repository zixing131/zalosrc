package androidx.core.content;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.core.app.C1335e1;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.os.AbstractC1435a;
import androidx.core.os.AbstractC1441g;
import androidx.core.util.AbstractC1482d;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.content.a */
/* loaded from: classes.dex */
public abstract class AbstractC1388a {

    /* renamed from: a */
    private static final Object f6108a = new Object();

    /* renamed from: b */
    private static final Object f6109b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static void m6976a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m6977b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$b */
    /* loaded from: classes2.dex */
    public static class b {
        /* renamed from: a */
        static File[] m6978a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m6979b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m6980c(Context context) {
            return context.getObbDirs();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static File m6981a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m6982b(Context context, int i11) {
            return context.getDrawable(i11);
        }

        /* renamed from: c */
        static File m6983c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        static int m6984a(Context context, int i11) {
            return context.getColor(i11);
        }

        /* renamed from: b */
        static <T> T m6985b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: c */
        static String m6986c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$e */
    /* loaded from: classes.dex */
    public static class e {
        /* renamed from: a */
        static Context m6987a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m6988b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m6989c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$f */
    /* loaded from: classes2.dex */
    public static class f {
        /* renamed from: a */
        static Intent m6990a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i11) {
            if ((i11 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, AbstractC1388a.m6971m(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i11 & 1);
        }

        /* renamed from: b */
        static ComponentName m6991b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$g */
    /* loaded from: classes2.dex */
    public static class g {
        /* renamed from: a */
        static Executor m6992a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$h */
    /* loaded from: classes2.dex */
    public static class h {
        /* renamed from: a */
        static Intent m6993a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i11) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i11);
        }
    }

    /* renamed from: androidx.core.content.a$i */
    /* loaded from: classes2.dex */
    public static final class i {

        /* renamed from: a */
        static final HashMap f6110a;

        static {
            HashMap hashMap = new HashMap();
            f6110a = hashMap;
            if (Build.VERSION.SDK_INT >= 22) {
                hashMap.put(AbstractC1389b.m6994a(), "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    /* renamed from: a */
    public static int m6959a(Context context, String str) {
        AbstractC1482d.m7478d(str, "permission must be non-null");
        if (!AbstractC1435a.m7336c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            if (C1335e1.m6691e(context).m6695a()) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    /* renamed from: b */
    public static Context m6960b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.m6987a(context);
        }
        return null;
    }

    /* renamed from: c */
    public static int m6961c(Context context, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.m6984a(context, i11);
        }
        return context.getResources().getColor(i11);
    }

    /* renamed from: d */
    public static ColorStateList m6962d(Context context, int i11) {
        return AbstractC1401h.m7081e(context.getResources(), i11, context.getTheme());
    }

    /* renamed from: e */
    public static File m6963e(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.m6988b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    /* renamed from: f */
    public static Drawable m6964f(Context context, int i11) {
        return c.m6982b(context, i11);
    }

    /* renamed from: g */
    public static File[] m6965g(Context context) {
        return b.m6978a(context);
    }

    /* renamed from: h */
    public static File[] m6966h(Context context, String str) {
        return b.m6979b(context, str);
    }

    /* renamed from: i */
    public static Executor m6967i(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return g.m6992a(context);
        }
        return AbstractC1441g.m7348a(new Handler(context.getMainLooper()));
    }

    /* renamed from: j */
    public static File m6968j(Context context) {
        return c.m6983c(context);
    }

    /* renamed from: k */
    public static Object m6969k(Context context, Class cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.m6985b(context, cls);
        }
        String m6970l = m6970l(context, cls);
        if (m6970l != null) {
            return context.getSystemService(m6970l);
        }
        return null;
    }

    /* renamed from: l */
    public static String m6970l(Context context, Class cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.m6986c(context, cls);
        }
        return (String) i.f6110a.get(cls);
    }

    /* renamed from: m */
    static String m6971m(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (AbstractC1391d.m6999b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    /* renamed from: n */
    public static Intent m6972n(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i11) {
        int i12 = i11 & 1;
        if (i12 != 0 && (i11 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i12 != 0) {
            i11 |= 2;
        }
        int i13 = i11;
        int i14 = i13 & 2;
        if (i14 == 0 && (i13 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i14 != 0 && (i13 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (AbstractC1435a.m7336c()) {
            return h.m6993a(context, broadcastReceiver, intentFilter, str, handler, i13);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return f.m6990a(context, broadcastReceiver, intentFilter, str, handler, i13);
        }
        if ((i13 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, m6971m(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    /* renamed from: o */
    public static boolean m6973o(Context context, Intent[] intentArr, Bundle bundle) {
        a.m6976a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: p */
    public static void m6974p(Context context, Intent intent, Bundle bundle) {
        a.m6977b(context, intent, bundle);
    }

    /* renamed from: q */
    public static void m6975q(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.m6991b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
