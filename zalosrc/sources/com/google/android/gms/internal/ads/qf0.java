package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Locale;
import p229i5.AbstractC20289j;
import p229i5.AbstractC20295p;
import p289k5.C21472e;

/* loaded from: classes2.dex */
public final class qf0 {

    /* renamed from: A */
    private int f26737A;

    /* renamed from: B */
    private final String f26738B;

    /* renamed from: C */
    private boolean f26739C;

    /* renamed from: a */
    private int f26740a;

    /* renamed from: b */
    private boolean f26741b;

    /* renamed from: c */
    private boolean f26742c;

    /* renamed from: d */
    private int f26743d;

    /* renamed from: e */
    private int f26744e;

    /* renamed from: f */
    private int f26745f;

    /* renamed from: g */
    private String f26746g;

    /* renamed from: h */
    private int f26747h;

    /* renamed from: i */
    private int f26748i;

    /* renamed from: j */
    private int f26749j;

    /* renamed from: k */
    private boolean f26750k;

    /* renamed from: l */
    private int f26751l;

    /* renamed from: m */
    private double f26752m;

    /* renamed from: n */
    private boolean f26753n;

    /* renamed from: o */
    private String f26754o;

    /* renamed from: p */
    private String f26755p;

    /* renamed from: q */
    private final boolean f26756q;

    /* renamed from: r */
    private final boolean f26757r;

    /* renamed from: s */
    private final String f26758s;

    /* renamed from: t */
    private final boolean f26759t;

    /* renamed from: u */
    private final boolean f26760u;

    /* renamed from: v */
    private final boolean f26761v;

    /* renamed from: w */
    private final String f26762w;

    /* renamed from: x */
    private final String f26763x;

    /* renamed from: y */
    private float f26764y;

    /* renamed from: z */
    private int f26765z;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:23|24)(1:22)))|9|10|11|12|(0)|16|(1:18)(3:20|23|24)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009a A[Catch: Exception -> 0x00b1, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b1, blocks: (B:12:0x008c, B:14:0x009a), top: B:11:0x008c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qf0(Context context) {
        ActivityInfo activityInfo;
        PackageInfo m111064f;
        String str;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo m111064f2;
        PackageManager packageManager = context.getPackageManager();
        AbstractC4554gx.m22622c(context);
        m25697c(context);
        m25699e(context);
        m25698d(context);
        Locale locale = Locale.getDefault();
        this.f26756q = m25696b(packageManager, "geo:0,0?q=donuts") != null;
        this.f26757r = m25696b(packageManager, "http://www.google.com") != null;
        this.f26758s = locale.getCountry();
        zzt.zzp();
        zzaw.zzb();
        this.f26759t = rk0.m26109s();
        this.f26760u = AbstractC20289j.m105929c(context);
        this.f26761v = AbstractC20289j.m105930d(context);
        this.f26762w = locale.getLanguage();
        ResolveInfo m25696b = m25696b(packageManager, "market://details?id=com.google.android.gms.ads");
        String str2 = null;
        if (m25696b != null && (activityInfo = m25696b.activityInfo) != null) {
            try {
                m111064f = C21472e.m111067a(context).m111064f(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (m111064f != null) {
                str = m111064f.versionCode + "." + activityInfo.packageName;
                this.f26763x = str;
                m111064f2 = C21472e.m111067a(context).m111064f("com.android.vending", 128);
                if (m111064f2 != null) {
                    str2 = m111064f2.versionCode + "." + m111064f2.packageName;
                }
                this.f26738B = str2;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.f26764y = displayMetrics.density;
                    this.f26765z = displayMetrics.widthPixels;
                    this.f26737A = displayMetrics.heightPixels;
                }
                return;
            }
        }
        str = null;
        this.f26763x = str;
        m111064f2 = C21472e.m111067a(context).m111064f("com.android.vending", 128);
        if (m111064f2 != null) {
        }
        this.f26738B = str2;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.f26764y = displayMetrics.density;
        this.f26765z = displayMetrics.widthPixels;
        this.f26737A = displayMetrics.heightPixels;
    }

    /* renamed from: b */
    private static ResolveInfo m25696b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th2) {
            zzt.zzo().m22945t(th2, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: c */
    private final void m25697c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f26740a = audioManager.getMode();
                this.f26741b = audioManager.isMusicActive();
                this.f26742c = audioManager.isSpeakerphoneOn();
                this.f26743d = audioManager.getStreamVolume(3);
                this.f26744e = audioManager.getRingerMode();
                this.f26745f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th2) {
                zzt.zzo().m22945t(th2, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f26740a = -2;
        this.f26741b = false;
        this.f26742c = false;
        this.f26743d = 0;
        this.f26744e = 2;
        this.f26745f = 0;
    }

    /* renamed from: d */
    private final void m25698d(Context context) {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20980E8)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = context.registerReceiver(null, intentFilter, 4);
        } else {
            registerReceiver = context.registerReceiver(null, intentFilter);
        }
        boolean z11 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f26752m = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z11 = true;
            }
            this.f26753n = z11;
            return;
        }
        this.f26752m = -1.0d;
        this.f26753n = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m25699e(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f26746g = telephonyManager.getNetworkOperator();
        if (AbstractC20295p.m105958l()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21324n7)).booleanValue()) {
                networkType = 0;
                this.f26748i = networkType;
                this.f26749j = telephonyManager.getPhoneType();
                this.f26747h = -2;
                this.f26750k = false;
                this.f26751l = -1;
                zzt.zzp();
                if (!zzs.zzx(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        this.f26747h = activeNetworkInfo.getType();
                        this.f26751l = activeNetworkInfo.getDetailedState().ordinal();
                    } else {
                        this.f26747h = -1;
                    }
                    this.f26750k = connectivityManager.isActiveNetworkMetered();
                    return;
                }
                return;
            }
        }
        networkType = telephonyManager.getNetworkType();
        this.f26748i = networkType;
        this.f26749j = telephonyManager.getPhoneType();
        this.f26747h = -2;
        this.f26750k = false;
        this.f26751l = -1;
        zzt.zzp();
        if (!zzs.zzx(context, "android.permission.ACCESS_NETWORK_STATE")) {
        }
    }

    /* renamed from: a */
    public final rf0 m25700a() {
        return new rf0(this.f26740a, this.f26756q, this.f26757r, this.f26746g, this.f26758s, this.f26759t, this.f26760u, this.f26761v, this.f26741b, this.f26742c, this.f26762w, this.f26763x, this.f26738B, this.f26743d, this.f26747h, this.f26748i, this.f26749j, this.f26744e, this.f26745f, this.f26764y, this.f26765z, this.f26737A, this.f26752m, this.f26753n, this.f26750k, this.f26751l, this.f26754o, this.f26739C, this.f26755p);
    }

    public qf0(Context context, rf0 rf0Var) {
        AbstractC4554gx.m22622c(context);
        m25697c(context);
        m25699e(context);
        m25698d(context);
        this.f26754o = Build.FINGERPRINT;
        this.f26755p = Build.DEVICE;
        this.f26739C = C4555gy.m22629g(context);
        this.f26756q = rf0Var.f27182a;
        this.f26757r = rf0Var.f27183b;
        this.f26758s = rf0Var.f27185d;
        this.f26759t = rf0Var.f27186e;
        this.f26760u = rf0Var.f27187f;
        this.f26761v = rf0Var.f27188g;
        this.f26762w = rf0Var.f27189h;
        this.f26763x = rf0Var.f27190i;
        this.f26738B = rf0Var.f27191j;
        this.f26764y = rf0Var.f27194m;
        this.f26765z = rf0Var.f27195n;
        this.f26737A = rf0Var.f27196o;
    }
}
