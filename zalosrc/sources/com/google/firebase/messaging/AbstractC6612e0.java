package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.C6576e;
import com.google.firebase.installations.C6584c;
import java.util.concurrent.ExecutionException;
import p014a8.InterfaceC0650a;
import p184g9.C19298a;
import p184g9.C19299b;
import p342m6.AbstractC22894m;
import p668y3.AbstractC30277c;
import p668y3.C30276b;
import p668y3.InterfaceC30279e;
import p668y3.InterfaceC30281g;

/* renamed from: com.google.firebase.messaging.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC6612e0 {
    /* renamed from: A */
    public static boolean m33815A(Intent intent) {
        if (intent != null && !m33834r(intent)) {
            return m33816B(intent.getExtras());
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m33816B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m33817a() {
        Context m33612j;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C6576e.m33601k();
            m33612j = C6576e.m33601k().m33612j();
            sharedPreferences = m33612j.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = m33612j.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m33612j.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    /* renamed from: b */
    static C19298a m33818b(C19298a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C19298a.a m101032h = C19298a.m101009p().m101037m(m33832p(extras)).m101029e(bVar).m101030f(m33822f(extras)).m101033i(m33829m()).m101035k(C19298a.d.ANDROID).m101032h(m33827k(extras));
        String m33824h = m33824h(extras);
        if (m33824h != null) {
            m101032h.m101031g(m33824h);
        }
        String m33831o = m33831o(extras);
        if (m33831o != null) {
            m101032h.m101036l(m33831o);
        }
        String m33819c = m33819c(extras);
        if (m33819c != null) {
            m101032h.m101027c(m33819c);
        }
        String m33825i = m33825i(extras);
        if (m33825i != null) {
            m101032h.m101026b(m33825i);
        }
        String m33821e = m33821e(extras);
        if (m33821e != null) {
            m101032h.m101028d(m33821e);
        }
        long m33830n = m33830n(extras);
        if (m33830n > 0) {
            m101032h.m101034j(m33830n);
        }
        return m101032h.m101025a();
    }

    /* renamed from: c */
    static String m33819c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    static String m33820d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    static String m33821e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    static String m33822f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) AbstractC22894m.m117599a(C6584c.m33656r(C6576e.m33601k()).mo13077f());
        } catch (InterruptedException | ExecutionException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* renamed from: g */
    static String m33823g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    static String m33824h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    /* renamed from: i */
    static String m33825i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    static String m33826j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    static C19298a.c m33827k(Bundle bundle) {
        if (bundle != null && C6618g0.m33858t(bundle)) {
            return C19298a.c.DISPLAY_NOTIFICATION;
        }
        return C19298a.c.DATA_MESSAGE;
    }

    /* renamed from: l */
    static String m33828l(Bundle bundle) {
        if (bundle != null && C6618g0.m33858t(bundle)) {
            return "display";
        }
        return "data";
    }

    /* renamed from: m */
    static String m33829m() {
        return C6576e.m33601k().m33612j().getPackageName();
    }

    /* renamed from: n */
    static long m33830n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException unused) {
            }
        }
        C6576e m33601k = C6576e.m33601k();
        String m33681d = m33601k.m33614m().m33681d();
        if (m33681d != null) {
            try {
                return Long.parseLong(m33681d);
            } catch (NumberFormatException unused2) {
            }
        }
        String m33680c = m33601k.m33614m().m33680c();
        try {
            if (!m33680c.startsWith("1:")) {
                return Long.parseLong(m33680c);
            }
            String[] split = m33680c.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException unused3) {
            return 0L;
        }
    }

    /* renamed from: o */
    static String m33831o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    static int m33832p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid TTL: ");
                sb2.append(obj);
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: q */
    static String m33833q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m33834r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m33835s(Intent intent) {
        m33840x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m33836t(Intent intent) {
        m33840x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m33837u(Bundle bundle) {
        m33841y(bundle);
        m33840x("_no", bundle);
    }

    /* renamed from: v */
    public static void m33838v(Intent intent) {
        if (m33815A(intent)) {
            m33840x("_nr", intent.getExtras());
        }
        if (m33842z(intent)) {
            m33839w(C19298a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m33718s());
        }
    }

    /* renamed from: w */
    private static void m33839w(C19298a.b bVar, Intent intent, InterfaceC30281g interfaceC30281g) {
        C19298a m33818b;
        if (interfaceC30281g == null || (m33818b = m33818b(bVar, intent)) == null) {
            return;
        }
        try {
            interfaceC30281g.mo552a("FCM_CLIENT_EVENT_LOGGING", C19299b.class, C30276b.m149414b("proto"), new InterfaceC30279e() { // from class: com.google.firebase.messaging.d0
                @Override // p668y3.InterfaceC30279e
                public final Object apply(Object obj) {
                    return ((C19299b) obj).m101040c();
                }
            }).mo557b(AbstractC30277c.m149416d(C19299b.m101038b().m101042b(m33818b).m101041a()));
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: x */
    static void m33840x(String str, Bundle bundle) {
        try {
            C6576e.m33601k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String m33820d = m33820d(bundle);
            if (m33820d != null) {
                bundle2.putString("_nmid", m33820d);
            }
            String m33821e = m33821e(bundle);
            if (m33821e != null) {
                bundle2.putString("_nmn", m33821e);
            }
            String m33825i = m33825i(bundle);
            if (!TextUtils.isEmpty(m33825i)) {
                bundle2.putString("label", m33825i);
            }
            String m33823g = m33823g(bundle);
            if (!TextUtils.isEmpty(m33823g)) {
                bundle2.putString("message_channel", m33823g);
            }
            String m33831o = m33831o(bundle);
            if (m33831o != null) {
                bundle2.putString("_nt", m33831o);
            }
            String m33826j = m33826j(bundle);
            if (m33826j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(m33826j));
                } catch (NumberFormatException unused) {
                }
            }
            String m33833q = m33833q(bundle);
            if (m33833q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(m33833q));
                } catch (NumberFormatException unused2) {
                }
            }
            String m33828l = m33828l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", m33828l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Logging to scion event=");
                sb2.append(str);
                sb2.append(" scionPayload=");
                sb2.append(bundle2);
            }
            InterfaceC0650a interfaceC0650a = (InterfaceC0650a) C6576e.m33601k().m33611i(InterfaceC0650a.class);
            if (interfaceC0650a != null) {
                interfaceC0650a.mo930a("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    /* renamed from: y */
    private static void m33841y(Bundle bundle) {
        InterfaceC0650a interfaceC0650a;
        if (bundle != null && "1".equals(bundle.getString("google.c.a.tc")) && (interfaceC0650a = (InterfaceC0650a) C6576e.m33601k().m33611i(InterfaceC0650a.class)) != null) {
            String string = bundle.getString("google.c.a.c_id");
            interfaceC0650a.mo932c("fcm", "_ln", string);
            Bundle bundle2 = new Bundle();
            bundle2.putString("source", "Firebase");
            bundle2.putString("medium", "notification");
            bundle2.putString("campaign", string);
            interfaceC0650a.mo930a("fcm", "_cmp", bundle2);
        }
    }

    /* renamed from: z */
    public static boolean m33842z(Intent intent) {
        if (intent != null && !m33834r(intent)) {
            return m33817a();
        }
        return false;
    }
}
