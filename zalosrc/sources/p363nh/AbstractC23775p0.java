package p363nh;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.Service;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.app.C1335e1;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.service.TaskNonStickyExecutor;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import ho0.AbstractC20110a;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import me0.C23081g9;
import org.json.JSONArray;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23309i;
import p363nh.InterfaceC23785u0;
import p451qk.C25304a;
import vg.C28023b6;
import yf0.C30946k;

/* renamed from: nh.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC23775p0 {

    /* renamed from: a */
    static int f114914a;

    /* renamed from: b */
    static final Map f114915b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final Runnable f114916c = new Runnable() { // from class: nh.n0
        @Override // java.lang.Runnable
        public final void run() {
            AbstractC23775p0.m124205j();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nh.p0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        String f114917a;

        /* renamed from: b */
        long f114918b;

        /* synthetic */ a(AbstractC23773o0 abstractC23773o0) {
            this();
        }

        private a() {
            this.f114918b = -1L;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m124196a() {
        boolean z11;
        synchronized (AbstractC23775p0.class) {
            if (f114914a > 0) {
                if (!C30946k.m150510o()) {
                    z11 = true;
                }
            }
            z11 = false;
        }
        return z11;
    }

    /* renamed from: b */
    public static void m124197b(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            try {
                int hash = Objects.hash(str, "default");
                C23783t0.Companion.m124242a().m124235b(hash);
                AbstractC20110a.m104535d("cancel pre M: %d - (%s-%s)", Integer.valueOf(hash), str, "default");
                return;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        m124201f(str, null);
    }

    /* renamed from: c */
    public static void m124198c(String str, String str2) {
        try {
            if (!"default".equals(str2) && Build.VERSION.SDK_INT >= 23) {
                m124201f(str, str2);
                return;
            }
            int hash = Objects.hash(str, str2);
            C23783t0.Companion.m124242a().m124235b(hash);
            AbstractC20110a.m104535d("cancel pre M: %d - (%s-%s)", Integer.valueOf(hash), str, str2);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: d */
    public static void m124199d(String str, InterfaceC23785u0 interfaceC23785u0) {
        m124203h(str, interfaceC23785u0);
    }

    /* renamed from: e */
    public static void m124200e(List list) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                m124202g(list);
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C25304a c25304a = (C25304a) it.next();
                String m130961b = c25304a.m130961b();
                String m130960a = c25304a.m130960a();
                int hash = Objects.hash(m130961b, m130960a);
                C23783t0.Companion.m124242a().m124235b(hash);
                AbstractC20110a.m104535d("cancel pre M: %d - (%s-%s)", Integer.valueOf(hash), m130961b, m130960a);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: f */
    private static void m124201f(String str, String str2) {
        if (Build.VERSION.SDK_INT < 23) {
            try {
                int hash = Objects.hash(str, str2);
                C23783t0.Companion.m124242a().m124235b(hash);
                AbstractC20110a.m104535d("cancel pre M: %d - (%s-%s)", Integer.valueOf(hash), str, str2);
                return;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        m124203h(str, new InterfaceC23785u0.a(str2));
    }

    /* renamed from: g */
    private static void m124202g(List list) {
        if (Build.VERSION.SDK_INT < 23) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C25304a c25304a = (C25304a) it.next();
                String m130961b = c25304a.m130961b();
                String m130960a = c25304a.m130960a();
                try {
                    int hash = Objects.hash(m130961b, m130960a);
                    C23783t0.Companion.m124242a().m124235b(hash);
                    AbstractC20110a.m104535d("cancel pre M: %d - (%s-%s)", Integer.valueOf(hash), m130961b, m130960a);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            return;
        }
        m124204i(list);
    }

    /* renamed from: h */
    private static void m124203h(String str, InterfaceC23785u0 interfaceC23785u0) {
        StatusBarNotification[] activeNotifications;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                activeNotifications = m124209n().getActiveNotifications();
                if (activeNotifications == null) {
                    return;
                }
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (statusBarNotification != null && statusBarNotification.getNotification() != null && statusBarNotification.getNotification().extras != null) {
                        String string = statusBarNotification.getNotification().extras.getString("EXTRA_KEY_TYPE");
                        String string2 = statusBarNotification.getNotification().extras.getString("EXTRA_KEY_SUB_TYPE");
                        if (string != null && string.equals(str) && (interfaceC23785u0 == null || interfaceC23785u0.mo108726a(string2))) {
                            AbstractC20110a.m104535d("cancel: %d - (%s-%s)", Integer.valueOf(statusBarNotification.getId()), str, string2);
                            C23783t0.Companion.m124242a().m124235b(statusBarNotification.getId());
                        }
                    }
                }
                return;
            }
            int hash = Objects.hash(str, "default");
            C23783t0.Companion.m124242a().m124235b(hash);
            AbstractC20110a.m104535d("cancel pre M: %d - (%s)", Integer.valueOf(hash), str);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: i */
    private static void m124204i(List list) {
        StatusBarNotification[] activeNotifications;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                activeNotifications = m124209n().getActiveNotifications();
                if (activeNotifications == null) {
                    return;
                }
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C25304a c25304a = (C25304a) it.next();
                        String m130961b = c25304a.m130961b();
                        String m130960a = c25304a.m130960a();
                        InterfaceC23785u0.a aVar = new InterfaceC23785u0.a(m130960a);
                        if ("default".equals(m130960a)) {
                            C23783t0.Companion.m124242a().m124235b(Objects.hash(m130961b, m130960a));
                        } else if (statusBarNotification != null && statusBarNotification.getNotification() != null && statusBarNotification.getNotification().extras != null) {
                            String string = statusBarNotification.getNotification().extras.getString("EXTRA_KEY_TYPE");
                            String string2 = statusBarNotification.getNotification().extras.getString("EXTRA_KEY_SUB_TYPE");
                            if (string != null && string.equals(m130961b) && aVar.mo108726a(string2)) {
                                AbstractC20110a.m104535d("cancel: %d - (%s-%s)", Integer.valueOf(statusBarNotification.getId()), m130961b, string2);
                                C23783t0.Companion.m124242a().m124235b(statusBarNotification.getId());
                            }
                        }
                    }
                }
                return;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C25304a c25304a2 = (C25304a) it2.next();
                int hash = Objects.hash(c25304a2.m130961b(), "default");
                C23783t0.Companion.m124242a().m124235b(hash);
                AbstractC20110a.m104535d("cancel pre M: %d - (%s)", Integer.valueOf(hash), c25304a2.m130961b());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:            r2 = m124209n().getActiveNotifications();     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m124205j() {
        StatusBarNotification[] activeNotifications;
        Notification notification;
        Bundle bundle;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            TaskNonStickyExecutor.m50450b().m50451a(TaskNonStickyExecutor.f49562f);
            if (Build.VERSION.SDK_INT < 23 || activeNotifications == null) {
                return;
            }
            long j11 = 0;
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification != null && (notification = statusBarNotification.getNotification()) != null && (bundle = notification.extras) != null && C28023b6.m141225L0(notification)) {
                    C28023b6.m141250h0().m141326Y1(statusBarNotification.getId(), bundle);
                    long j12 = bundle.getLong("EXTRA_KEY_EXPIRED_UPTIME", 0L);
                    if (j12 > 0) {
                        if (j12 <= SystemClock.elapsedRealtime()) {
                            if (!C28023b6.m141237X(statusBarNotification)) {
                                C23783t0.Companion.m124242a().m124236c(statusBarNotification.getTag(), statusBarNotification.getId());
                                AbstractC20887g.m109246x(20310, currentTimeMillis);
                            }
                        } else if (j11 > 0) {
                            j11 = Math.min(j12, j11);
                        } else {
                            j11 = j12;
                        }
                    }
                }
            }
            if (j11 > 0) {
                m124218w(j11, true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: k */
    public static boolean m124206k() {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (AbstractC23309i.m121825dc() == AbstractC23309i.m121863ec() && AbstractC23309i.m121827de() == AbstractC23309i.m121865ee() && AbstractC23309i.m120753Ag() == AbstractC23309i.m120790Bg()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static void m124207l() {
        List notificationChannels;
        String id2;
        String id3;
        String id4;
        String id5;
        String id6;
        String id7;
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            m124208m();
            NotificationManager m124209n = m124209n();
            EnumSet allOf = EnumSet.allOf(EnumC23747b0.class);
            EnumSet noneOf = EnumSet.noneOf(EnumC23747b0.class);
            notificationChannels = m124209n.getNotificationChannels();
            Iterator it = notificationChannels.iterator();
            while (it.hasNext()) {
                NotificationChannel m124195a = AbstractC23774p.m124195a(it.next());
                id5 = m124195a.getId();
                EnumC23747b0 m124124c = EnumC23747b0.m124124c(id5);
                if (m124124c != null) {
                    if (!noneOf.contains(m124124c)) {
                        if (m124124c.m124132m(m124195a)) {
                            m124124c.m124127d(m124209n, m124195a);
                        }
                        noneOf.add(m124124c);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("delete notification channel (clean duplication flow): ");
                        id6 = m124195a.getId();
                        sb2.append(id6);
                        AbstractC20110a.m104542k(8, sb2.toString(), new Object[0]);
                        id7 = m124195a.getId();
                        m124209n.deleteNotificationChannel(id7);
                    }
                    allOf.remove(m124124c);
                }
            }
            Iterator it2 = allOf.iterator();
            while (it2.hasNext()) {
                ((EnumC23747b0) it2.next()).m124127d(m124209n, null);
            }
            Iterator it3 = notificationChannels.iterator();
            while (it3.hasNext()) {
                NotificationChannel m124195a2 = AbstractC23774p.m124195a(it3.next());
                id2 = m124195a2.getId();
                if (EnumC23747b0.m124124c(id2) == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("delete notification channel (clean flow): ");
                    id3 = m124195a2.getId();
                    sb3.append(id3);
                    AbstractC20110a.m104542k(8, sb3.toString(), new Object[0]);
                    id4 = m124195a2.getId();
                    m124209n.deleteNotificationChannel(id4);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: m */
    private static void m124208m() {
        List notificationChannelGroups;
        String id2;
        String id3;
        String id4;
        String id5;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManager m124209n = m124209n();
        notificationChannelGroups = m124209n.getNotificationChannelGroups();
        EnumSet allOf = EnumSet.allOf(EnumC23761i0.class);
        Iterator it = notificationChannelGroups.iterator();
        while (it.hasNext()) {
            id5 = AbstractC23755f0.m124174a(it.next()).getId();
            EnumC23761i0 m124181c = EnumC23761i0.m124181c(id5);
            if (m124181c != null) {
                allOf.remove(m124181c);
            }
        }
        for (EnumC23761i0 enumC23761i0 : EnumC23761i0.values()) {
            if (allOf.contains(enumC23761i0)) {
                enumC23761i0.m124182d(m124209n);
            }
        }
        Iterator it2 = notificationChannelGroups.iterator();
        while (it2.hasNext()) {
            NotificationChannelGroup m124174a = AbstractC23755f0.m124174a(it2.next());
            id2 = m124174a.getId();
            if (EnumC23761i0.m124181c(id2) == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("delete notification channel group (clean flow): ");
                id3 = m124174a.getId();
                sb2.append(id3);
                AbstractC20110a.m104542k(8, sb2.toString(), new Object[0]);
                id4 = m124174a.getId();
                m124209n.deleteNotificationChannelGroup(id4);
            }
        }
    }

    /* renamed from: n */
    public static NotificationManager m124209n() {
        return C23783t0.Companion.m124242a().m124237f();
    }

    /* renamed from: o */
    public static long m124210o(String str) {
        a aVar = (a) f114915b.get(str);
        if (aVar != null) {
            return aVar.f114918b;
        }
        return 0L;
    }

    /* renamed from: p */
    public static boolean m124211p(String str) {
        NotificationChannelGroup notificationChannelGroup;
        boolean isBlocked;
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                notificationChannelGroup = m124209n().getNotificationChannelGroup(str);
                isBlocked = notificationChannelGroup.isBlocked();
                return !isBlocked;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return false;
            }
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m124212q(EnumC23747b0 enumC23747b0) {
        if (Build.VERSION.SDK_INT < 26 || enumC23747b0 == null || enumC23747b0.m124129h() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m124213r() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: s */
    public static void m124214s(C23750d c23750d) {
        EnumC23747b0 m124124c;
        try {
            AbstractC20110a.m104535d("show notify: %d - (%s , %s)", Integer.valueOf(c23750d.m124151g0()), c23750d.f114894h0, c23750d.f114893g0);
            C23783t0.Companion.m124242a().m124239j(c23750d.m124151g0(), c23750d.mo6879e(), c23750d);
            if (m124213r() && AbstractC23309i.m120790Bg() && C1335e1.m6691e(MainApplication.getAppContext()).m6695a() && c23750d.m124157m0() && (m124124c = EnumC23747b0.m124124c(c23750d.m124150f0())) != null && m124124c.m124135t() && m124124c.m124129h() >= 1 && !c23750d.m124155k0()) {
                if (m124124c.m124130i() == null) {
                    C7853b.m40085x0();
                }
                if (!m124124c.m124139x()) {
                    C23081g9.m118408e();
                }
            }
            if (c23750d.f114899m0 > 0 && !c23750d.m124156l0() && Build.VERSION.SDK_INT >= 23) {
                long elapsedRealtime = SystemClock.elapsedRealtime() + c23750d.f114899m0;
                AbstractC20110a.m104535d("notify: %d - timeToLive: %d", Integer.valueOf(c23750d.m124151g0()), Long.valueOf(c23750d.f114899m0));
                m124218w(elapsedRealtime, false);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: t */
    public static void m124215t(C23750d c23750d, Service service, int i11) {
        EnumC23747b0 m124124c;
        try {
            AbstractC20110a.m104535d("notifyAndStartForeground: %d - (%s , %s)", Integer.valueOf(c23750d.m124151g0()), c23750d.f114894h0, c23750d.f114893g0);
            C23783t0.Companion.m124242a().m124240l(service, c23750d.m124151g0(), c23750d.mo6879e(), i11, c23750d);
            if (m124213r() && AbstractC23309i.m120790Bg() && C1335e1.m6691e(MainApplication.getAppContext()).m6695a() && (m124124c = EnumC23747b0.m124124c(c23750d.m124150f0())) != null && m124124c.m124135t()) {
                C23081g9.m118407d();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: u */
    public static void m124216u(String str) {
        try {
            f114915b.clear();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray optJSONArray = new JSONObject(str).optJSONArray("noti_types");
            int i11 = 0;
            while (optJSONArray != null) {
                if (i11 < optJSONArray.length()) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i11);
                    a aVar = new a();
                    aVar.f114917a = jSONObject.getString("name");
                    long j11 = jSONObject.getLong("expire");
                    aVar.f114918b = j11;
                    if (j11 > 0) {
                        f114915b.put(aVar.f114917a, aVar);
                    }
                    i11++;
                } else {
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: v */
    public static synchronized void m124217v(int i11) {
        List notificationChannels;
        List notificationChannels2;
        String id2;
        String id3;
        String id4;
        String id5;
        String id6;
        String id7;
        synchronized (AbstractC23775p0.class) {
            try {
                try {
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                if (Build.VERSION.SDK_INT < 26) {
                    return;
                }
                AbstractC20110a.m104542k(8, "recreateNotificationChannelOnInAppSettingChanged: " + i11, new Object[0]);
                NotificationManager m124209n = m124209n();
                EnumSet allOf = EnumSet.allOf(EnumC23747b0.class);
                EnumSet noneOf = EnumSet.noneOf(EnumC23747b0.class);
                EnumSet noneOf2 = EnumSet.noneOf(EnumC23747b0.class);
                Iterator it = allOf.iterator();
                while (it.hasNext()) {
                    EnumC23747b0 enumC23747b0 = (EnumC23747b0) it.next();
                    enumC23747b0.m124140y();
                    if (!enumC23747b0.m124133r() && !enumC23747b0.m124135t()) {
                    }
                    if (enumC23747b0.m124130i() != null) {
                        noneOf.add(enumC23747b0);
                    }
                }
                if (!noneOf.isEmpty()) {
                    AbstractC20887g.m109245w((i11 % 10) + ZMediaPlayer.FFP_PROP_INT64_LATEST_SEEK_LOAD_DURATION);
                }
                notificationChannels = m124209n.getNotificationChannels();
                Iterator it2 = notificationChannels.iterator();
                while (it2.hasNext()) {
                    NotificationChannel m124195a = AbstractC23774p.m124195a(it2.next());
                    id5 = m124195a.getId();
                    EnumC23747b0 m124124c = EnumC23747b0.m124124c(id5);
                    if (m124124c != null && noneOf.contains(m124124c)) {
                        if (!noneOf2.contains(m124124c)) {
                            m124124c.m124127d(m124209n, m124195a);
                            noneOf2.add(m124124c);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("delete notification channel (clean duplication - recreate flow): ");
                            id6 = m124195a.getId();
                            sb2.append(id6);
                            AbstractC20110a.m104542k(8, sb2.toString(), new Object[0]);
                            id7 = m124195a.getId();
                            m124209n.deleteNotificationChannel(id7);
                        }
                        noneOf.remove(m124124c);
                    }
                }
                Iterator it3 = noneOf.iterator();
                while (it3.hasNext()) {
                    ((EnumC23747b0) it3.next()).m124127d(m124209n, null);
                }
                notificationChannels2 = m124209n.getNotificationChannels();
                Iterator it4 = notificationChannels2.iterator();
                while (it4.hasNext()) {
                    NotificationChannel m124195a2 = AbstractC23774p.m124195a(it4.next());
                    id2 = m124195a2.getId();
                    if (EnumC23747b0.m124124c(id2) == null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("delete notification channel (clean undefine flow): ");
                        id3 = m124195a2.getId();
                        sb3.append(id3);
                        AbstractC20110a.m104542k(8, sb3.toString(), new Object[0]);
                        id4 = m124195a2.getId();
                        m124209n.deleteNotificationChannel(id4);
                    }
                }
                AbstractC23309i.m122373rx(AbstractC23309i.m121825dc());
                AbstractC23309i.m121290Oz(AbstractC23309i.m121827de());
                AbstractC23309i.m122108ku(AbstractC23309i.m120753Ag());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: w */
    private static void m124218w(long j11, boolean z11) {
        long elapsedRealtime = j11 - SystemClock.elapsedRealtime();
        AbstractC20110a.m104535d("scheduleTaskCheckExpired: %d - %s", Long.valueOf(elapsedRealtime), String.valueOf(z11));
        if (z11) {
            TaskNonStickyExecutor m50450b = TaskNonStickyExecutor.m50450b();
            Runnable runnable = f114916c;
            Object obj = TaskNonStickyExecutor.f49562f;
            if (elapsedRealtime <= 0) {
                elapsedRealtime = 0;
            }
            m50450b.m50456g(runnable, obj, elapsedRealtime);
            return;
        }
        TaskNonStickyExecutor m50450b2 = TaskNonStickyExecutor.m50450b();
        Runnable runnable2 = f114916c;
        Object obj2 = TaskNonStickyExecutor.f49562f;
        if (elapsedRealtime <= 0) {
            elapsedRealtime = 0;
        }
        m50450b2.m50457h(runnable2, obj2, elapsedRealtime);
    }

    /* renamed from: x */
    public static synchronized void m124219x(boolean z11) {
        synchronized (AbstractC23775p0.class) {
            try {
                if (z11) {
                    f114914a++;
                } else {
                    f114914a--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
