package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.AbstractC1364q;
import androidx.core.content.AbstractC1388a;
import java.util.concurrent.atomic.AtomicInteger;
import p499s0.AbstractC26064g;

/* renamed from: com.google.firebase.messaging.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6608d {

    /* renamed from: a */
    private static final AtomicInteger f36633a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.d$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public final AbstractC1364q.f f36634a;

        /* renamed from: b */
        public final String f36635b;

        /* renamed from: c */
        public final int f36636c;

        a(AbstractC1364q.f fVar, String str, int i11) {
            this.f36634a = fVar;
            this.f36635b = str;
            this.f36636c = i11;
        }
    }

    /* renamed from: a */
    private static PendingIntent m33794a(Context context, C6618g0 c6618g0, String str, PackageManager packageManager) {
        Intent m33799f = m33799f(str, c6618g0, packageManager);
        if (m33799f == null) {
            return null;
        }
        m33799f.addFlags(67108864);
        m33799f.putExtras(c6618g0.m33881y());
        if (m33810q(c6618g0)) {
            m33799f.putExtra("gcm.n.analytics_data", c6618g0.m33880x());
        }
        return PendingIntent.getActivity(context, m33800g(), m33799f, m33805l(1073741824));
    }

    /* renamed from: b */
    private static PendingIntent m33795b(Context context, Context context2, C6618g0 c6618g0) {
        if (!m33810q(c6618g0)) {
            return null;
        }
        return m33796c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c6618g0.m33880x()));
    }

    /* renamed from: c */
    private static PendingIntent m33796c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m33800g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m33805l(1073741824));
    }

    /* renamed from: d */
    public static a m33797d(Context context, Context context2, C6618g0 c6618g0, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        AbstractC1364q.f fVar = new AbstractC1364q.f(context2, str);
        String m33875n = c6618g0.m33875n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(m33875n)) {
            fVar.mo6895w(m33875n);
        }
        String m33875n2 = c6618g0.m33875n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(m33875n2)) {
            fVar.mo6894v(m33875n2);
            fVar.m6869V(new AbstractC1364q.d().m6828h(m33875n2));
        }
        fVar.m6866S(m33806m(packageManager, resources, packageName, c6618g0.m33877p("gcm.n.icon"), bundle));
        Uri m33807n = m33807n(packageName, c6618g0, resources);
        if (m33807n != null) {
            fVar.m6867T(m33807n);
        }
        fVar.m6893u(m33794a(context, c6618g0, packageName, packageManager));
        PendingIntent m33795b = m33795b(context, context2, c6618g0);
        if (m33795b != null) {
            fVar.m6850B(m33795b);
        }
        Integer m33801h = m33801h(context2, c6618g0.m33877p("gcm.n.color"), bundle);
        if (m33801h != null) {
            fVar.m6890r(m33801h.intValue());
        }
        fVar.m6886n(!c6618g0.m33863a("gcm.n.sticky"));
        fVar.m6857J(c6618g0.m33863a("gcm.n.local_only"));
        String m33877p = c6618g0.m33877p("gcm.n.ticker");
        if (m33877p != null) {
            fVar.m6870W(m33877p);
        }
        Integer m33874m = c6618g0.m33874m();
        if (m33874m != null) {
            fVar.m6862O(m33874m.intValue());
        }
        Integer m33879r = c6618g0.m33879r();
        if (m33879r != null) {
            fVar.m6873Z(m33879r.intValue());
        }
        Integer m33873l = c6618g0.m33873l();
        if (m33873l != null) {
            fVar.m6859L(m33873l.intValue());
        }
        Long m33871j = c6618g0.m33871j("gcm.n.event_time");
        if (m33871j != null) {
            fVar.m6865R(true);
            fVar.m6875a0(m33871j.longValue());
        }
        long[] m33878q = c6618g0.m33878q();
        if (m33878q != null) {
            fVar.m6872Y(m33878q);
        }
        int[] m33866e = c6618g0.m33866e();
        if (m33866e != null) {
            fVar.m6856I(m33866e[0], m33866e[1], m33866e[2]);
        }
        fVar.m6849A(m33802i(c6618g0));
        return new a(fVar, m33808o(c6618g0), 0);
    }

    /* renamed from: e */
    public static a m33798e(Context context, C6618g0 c6618g0) {
        Bundle m33803j = m33803j(context.getPackageManager(), context.getPackageName());
        return m33797d(context, context, c6618g0, m33804k(context, c6618g0.m33872k(), m33803j), m33803j);
    }

    /* renamed from: f */
    private static Intent m33799f(String str, C6618g0 c6618g0, PackageManager packageManager) {
        String m33877p = c6618g0.m33877p("gcm.n.click_action");
        if (!TextUtils.isEmpty(m33877p)) {
            Intent intent = new Intent(m33877p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri m33867f = c6618g0.m33867f();
        if (m33867f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(m33867f);
            return intent2;
        }
        return packageManager.getLaunchIntentForPackage(str);
    }

    /* renamed from: g */
    private static int m33800g() {
        return f36633a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m33801h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Color is invalid: ");
                sb2.append(str);
                sb2.append(". Notification will use default color.");
            }
        }
        int i11 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i11 != 0) {
            try {
                return Integer.valueOf(AbstractC1388a.m6961c(context, i11));
            } catch (Resources.NotFoundException unused2) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: i */
    private static int m33802i(C6618g0 c6618g0) {
        boolean m33863a = c6618g0.m33863a("gcm.n.default_sound");
        ?? r02 = m33863a;
        if (c6618g0.m33863a("gcm.n.default_vibrate_timings")) {
            r02 = (m33863a ? 1 : 0) | 2;
        }
        if (c6618g0.m33863a("gcm.n.default_light_settings")) {
            return r02 | 4;
        }
        return r02;
    }

    /* renamed from: j */
    private static Bundle m33803j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Couldn't get own application info: ");
            sb2.append(e11);
        }
        return Bundle.EMPTY;
    }

    /* renamed from: k */
    public static String m33804k(Context context, String str, Bundle bundle) {
        Object systemService;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                systemService = context.getSystemService((Class<Object>) NotificationManager.class);
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (!TextUtils.isEmpty(str)) {
                    notificationChannel3 = notificationManager.getNotificationChannel(str);
                    if (notificationChannel3 != null) {
                        return str;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Notification Channel requested (");
                    sb2.append(str);
                    sb2.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                }
                String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string2)) {
                    notificationChannel2 = notificationManager.getNotificationChannel(string2);
                    if (notificationChannel2 != null) {
                        return string2;
                    }
                }
                notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                if (notificationChannel == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(AbstractC26064g.m134169a("fcm_fallback_notification_channel", string, 3));
                }
                return "fcm_fallback_notification_channel";
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private static int m33805l(int i11) {
        return Build.VERSION.SDK_INT >= 23 ? i11 | 67108864 : i11;
    }

    /* renamed from: m */
    private static int m33806m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m33809p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m33809p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Icon resource ");
            sb2.append(str2);
            sb2.append(" not found. Notification will use default icon.");
        }
        int i11 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i11 == 0 || !m33809p(resources, i11)) {
            try {
                i11 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e11) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Couldn't get own application info: ");
                sb3.append(e11);
            }
        }
        if (i11 == 0 || !m33809p(resources, i11)) {
            return R.drawable.sym_def_app_icon;
        }
        return i11;
    }

    /* renamed from: n */
    private static Uri m33807n(String str, C6618g0 c6618g0, Resources resources) {
        String m33876o = c6618g0.m33876o();
        if (TextUtils.isEmpty(m33876o)) {
            return null;
        }
        if (!"default".equals(m33876o) && resources.getIdentifier(m33876o, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + m33876o);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    /* renamed from: o */
    private static String m33808o(C6618g0 c6618g0) {
        String m33877p = c6618g0.m33877p("gcm.n.tag");
        if (!TextUtils.isEmpty(m33877p)) {
            return m33877p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    /* renamed from: p */
    private static boolean m33809p(Resources resources, int i11) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC6605c.m33786a(resources.getDrawable(i11, null))) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb2.append(i11);
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Couldn't find resource ");
            sb3.append(i11);
            sb3.append(", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    static boolean m33810q(C6618g0 c6618g0) {
        return c6618g0.m33863a("google.c.a.e");
    }
}
