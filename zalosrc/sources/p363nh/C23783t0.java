package p363nh;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C1335e1;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.NotificationReceiverTrampolineActivity;
import com.zing.zalo.receiver.ZaloNotificationReceiver;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p173fz.C19172a;
import p248iy.AbstractC20887g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: nh.t0 */
/* loaded from: classes.dex */
public final class C23783t0 {
    public static final b Companion = new b(null);

    /* renamed from: f */
    private static final InterfaceC24854k f114919f;

    /* renamed from: a */
    private boolean f114920a;

    /* renamed from: b */
    private final Map f114921b = new ConcurrentHashMap();

    /* renamed from: c */
    private final InterfaceC24854k f114922c;

    /* renamed from: d */
    private final InterfaceC24854k f114923d;

    /* renamed from: e */
    private final int f114924e;

    /* renamed from: nh.t0$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f114925q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23783t0 mo12V4() {
            return c.f114926a.m124243a();
        }
    }

    /* renamed from: nh.t0$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23783t0 m124242a() {
            return (C23783t0) C23783t0.f114919f.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nh.t0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f114926a = new c();

        /* renamed from: b */
        private static final C23783t0 f114927b = new C23783t0();

        private c() {
        }

        /* renamed from: a */
        public final C23783t0 m124243a() {
            return f114927b;
        }
    }

    /* renamed from: nh.t0$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        private final int f114928a;

        /* renamed from: b */
        private final long f114929b;

        /* renamed from: c */
        private final int f114930c;

        /* renamed from: d */
        private final boolean f114931d;

        public d(int i11, long j11, int i12, boolean z11) {
            this.f114928a = i11;
            this.f114929b = j11;
            this.f114930c = i12;
            this.f114931d = z11;
        }

        /* renamed from: a */
        public final long m124244a() {
            return this.f114929b;
        }

        /* renamed from: b */
        public final int m124245b() {
            return this.f114930c;
        }

        /* renamed from: c */
        public final boolean m124246c() {
            return this.f114931d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f114928a == dVar.f114928a && this.f114929b == dVar.f114929b && this.f114930c == dVar.f114930c && this.f114931d == dVar.f114931d;
        }

        public int hashCode() {
            return (((((this.f114928a * 31) + AbstractC2147g0.m11521a(this.f114929b)) * 31) + this.f114930c) * 31) + AbstractC2144f.m11520a(this.f114931d);
        }

        public String toString() {
            return "NotificationData(id=" + this.f114928a + ", postTime=" + this.f114929b + ", qosCodeBase=" + this.f114930c + ", isOngoing=" + this.f114931d + ")";
        }
    }

    /* renamed from: nh.t0$e */
    /* loaded from: classes.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f114932q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NotificationManager mo12V4() {
            Object systemService = CoreUtility.getAppContext().getSystemService("notification");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            return (NotificationManager) systemService;
        }
    }

    /* renamed from: nh.t0$f */
    /* loaded from: classes.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f114933q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1335e1 mo12V4() {
            C1335e1 m6691e = C1335e1.m6691e(CoreUtility.getAppContext());
            AbstractC19074t.m100207e(m6691e, "from(...)");
            return m6691e;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f114925q);
        f114919f = m129210a;
    }

    public C23783t0() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(e.f114932q);
        this.f114922c = m129210a;
        m129210a2 = AbstractC24856m.m129210a(f.f114933q);
        this.f114923d = m129210a2;
        this.f114924e = C19172a.m100600k("notification_manager@max_notify_limit", 50);
    }

    /* renamed from: d */
    private final void m124228d() {
        StatusBarNotification[] activeNotifications;
        boolean z11;
        try {
            if (this.f114920a || Build.VERSION.SDK_INT < 23) {
                return;
            }
            this.f114921b.clear();
            activeNotifications = m124237f().getActiveNotifications();
            if (activeNotifications == null) {
                return;
            }
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification != null && statusBarNotification.getNotification() != null && statusBarNotification.getNotification().extras != null) {
                    String string = statusBarNotification.getNotification().extras.getString("EXTRA_KEY_TYPE");
                    String string2 = statusBarNotification.getNotification().extras.getString("EXTRA_KEY_SUB_TYPE");
                    int i11 = statusBarNotification.getNotification().extras.getInt("EXTRA_KEY_TYPE_QOS_CODE");
                    AbstractC20110a.f98889a.mo104548a("read noti current: %d - (%s-%s) - %d - %d - qos(%d)", Integer.valueOf(statusBarNotification.getId()), string, string2, Long.valueOf(statusBarNotification.getPostTime()), Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(i11));
                    Map map = this.f114921b;
                    Integer valueOf = Integer.valueOf(statusBarNotification.getId());
                    int id2 = statusBarNotification.getId();
                    long postTime = statusBarNotification.getPostTime();
                    if ((statusBarNotification.getNotification().flags & 2) > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    map.put(valueOf, new d(id2, postTime, i11, z11));
                }
            }
            this.f114920a = true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: e */
    private final boolean m124229e(int i11) {
        if (!this.f114920a) {
            m124228d();
        }
        int size = this.f114921b.size();
        int i12 = this.f114924e;
        if (size < i12 || i12 <= 1) {
            return false;
        }
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        aVar.mo104548a("App has already posted %d notifications", Integer.valueOf(this.f114921b.size()));
        if (this.f114921b.containsKey(Integer.valueOf(i11))) {
            aVar.mo104548a("App has exceed quota, update showing notification -> don't remove oldest", new Object[0]);
            return false;
        }
        return m124232k();
    }

    /* renamed from: g */
    private final C1335e1 m124230g() {
        return (C1335e1) this.f114923d.getValue();
    }

    /* renamed from: i */
    private final void m124231i(int i11, int i12) {
        AbstractC20887g.m109217D(i11, null, 2, null);
        if (i12 > 0) {
            AbstractC20887g.m109217D(i11 + (i12 % 100), null, 2, null);
        } else {
            AbstractC20887g.m109217D(i11 + 1, null, 2, null);
        }
    }

    /* renamed from: k */
    private final boolean m124232k() {
        long j11;
        if (Build.VERSION.SDK_INT < 23 || this.f114921b.isEmpty()) {
            return false;
        }
        Iterator it = this.f114921b.keySet().iterator();
        long j12 = Long.MAX_VALUE;
        int i11 = 0;
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            d dVar = (d) this.f114921b.get(Integer.valueOf(intValue));
            if (dVar != null) {
                j11 = dVar.m124244a();
            } else {
                j11 = j12;
            }
            if (j11 < j12 && (dVar == null || !dVar.m124246c())) {
                i11 = intValue;
                j12 = j11;
            }
        }
        if (i11 != 0) {
            d dVar2 = (d) this.f114921b.remove(Integer.valueOf(i11));
            if (dVar2 == null) {
                return false;
            }
            AbstractC20110a.f98889a.mo104548a("Remove oldest notification: %s", dVar2);
            m124237f().cancel(i11);
            m124231i(29500, dVar2.m124245b());
            return true;
        }
        AbstractC20110a.f98889a.mo104548a("Can't remove oldest notification: all of them are ongoing notification", new Object[0]);
        AbstractC20887g.m109217D(29000, null, 2, null);
        return false;
    }

    /* renamed from: m */
    private final PendingIntent m124233m(PendingIntent pendingIntent, int i11, int i12) {
        boolean isActivity;
        Intent intent = new Intent("com.zing.zalo.intent.action.DELETE_NOTIFICATION");
        intent.putExtra("EXTRA_DATA_WRAP_NOTIFICATION_PENDING_INTENT", pendingIntent);
        intent.putExtra("EXTRA_DATA_WRAP_NOTIFICATION_QOS_CODE_BASE", i11);
        intent.putExtra("EXTRA_DATA_WRAP_NOTIFICATION_NOTI_ID", i12);
        if (Build.VERSION.SDK_INT >= 31 && pendingIntent != null) {
            isActivity = pendingIntent.isActivity();
            if (isActivity) {
                MainApplication.C6895a c6895a = MainApplication.Companion;
                intent.setClass(c6895a.m35500c(), NotificationReceiverTrampolineActivity.class);
                PendingIntent activity = PendingIntent.getActivity(c6895a.m35500c(), (int) System.currentTimeMillis(), intent, 201326592);
                AbstractC19074t.m100205c(activity);
                return activity;
            }
        }
        MainApplication.C6895a c6895a2 = MainApplication.Companion;
        intent.setClass(c6895a2.m35500c(), ZaloNotificationReceiver.class);
        PendingIntent broadcast = PendingIntent.getBroadcast(c6895a2.m35500c(), (int) System.currentTimeMillis(), intent, 201326592);
        AbstractC19074t.m100205c(broadcast);
        return broadcast;
    }

    /* renamed from: n */
    private final PendingIntent m124234n(PendingIntent pendingIntent, int i11, int i12, boolean z11) {
        boolean isActivity;
        Intent intent = new Intent("com.zing.zalo.intent.action.OPEN_NOTIFICATION");
        intent.putExtra("EXTRA_DATA_WRAP_NOTIFICATION_PENDING_INTENT", pendingIntent);
        intent.putExtra("EXTRA_DATA_WRAP_NOTIFICATION_QOS_CODE_BASE", i11);
        intent.putExtra("EXTRA_DATA_WRAP_NOTIFICATION_NOTI_ID", i12);
        intent.putExtra("EXTRA_DATA_WRAP_NOTIFICATION_AUTO_CANCEL", z11);
        if (Build.VERSION.SDK_INT >= 31 && pendingIntent != null) {
            isActivity = pendingIntent.isActivity();
            if (isActivity) {
                MainApplication.C6895a c6895a = MainApplication.Companion;
                intent.setClass(c6895a.m35500c(), NotificationReceiverTrampolineActivity.class);
                PendingIntent activity = PendingIntent.getActivity(c6895a.m35500c(), (int) System.currentTimeMillis(), intent, 67108864);
                AbstractC19074t.m100205c(activity);
                return activity;
            }
        }
        MainApplication.C6895a c6895a2 = MainApplication.Companion;
        intent.setClass(c6895a2.m35500c(), ZaloNotificationReceiver.class);
        PendingIntent broadcast = PendingIntent.getBroadcast(c6895a2.m35500c(), (int) System.currentTimeMillis(), intent, 67108864);
        AbstractC19074t.m100205c(broadcast);
        return broadcast;
    }

    /* renamed from: b */
    public final void m124235b(int i11) {
        m124230g().m6696b(i11);
        m124228d();
        d dVar = (d) this.f114921b.remove(Integer.valueOf(i11));
        if (dVar != null) {
            AbstractC20110a.f98889a.mo104548a("Cancel notification by app: %s", dVar);
            m124231i(29400, dVar.m124245b());
        }
    }

    /* renamed from: c */
    public final void m124236c(String str, int i11) {
        m124230g().m6697c(str, i11);
        m124228d();
        d dVar = (d) this.f114921b.remove(Integer.valueOf(i11));
        if (dVar != null) {
            AbstractC20110a.f98889a.mo104548a("Cancel notification by app: %s", dVar);
            m124231i(29400, dVar.m124245b());
        }
    }

    /* renamed from: f */
    public final NotificationManager m124237f() {
        return (NotificationManager) this.f114922c.getValue();
    }

    /* renamed from: h */
    public final void m124238h(Intent intent) {
        PendingIntent pendingIntent;
        d dVar;
        Object parcelableExtra;
        AbstractC19074t.m100208f(intent, "intent");
        if (CoreUtility.getAppContext() != null && intent.getAction() != null && intent.getExtras() != null) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("EXTRA_DATA_WRAP_NOTIFICATION_PENDING_INTENT", PendingIntent.class);
                    pendingIntent = (PendingIntent) parcelableExtra;
                } else {
                    Parcelable parcelableExtra2 = intent.getParcelableExtra("EXTRA_DATA_WRAP_NOTIFICATION_PENDING_INTENT");
                    if (parcelableExtra2 instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) parcelableExtra2;
                    } else {
                        pendingIntent = null;
                    }
                }
                if (pendingIntent != null) {
                    pendingIntent.send();
                }
                int intExtra = intent.getIntExtra("EXTRA_DATA_WRAP_NOTIFICATION_NOTI_ID", 0);
                boolean booleanExtra = intent.getBooleanExtra("EXTRA_DATA_WRAP_NOTIFICATION_AUTO_CANCEL", false);
                int intExtra2 = intent.getIntExtra("EXTRA_DATA_WRAP_NOTIFICATION_QOS_CODE_BASE", 1);
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != -877900178) {
                        if (hashCode == 452621295 && action.equals("com.zing.zalo.intent.action.OPEN_NOTIFICATION")) {
                            m124231i(29200, intExtra2);
                            if (booleanExtra && (dVar = (d) this.f114921b.remove(Integer.valueOf(intExtra))) != null) {
                                AbstractC20110a.f98889a.mo104548a("Event open notification: %s", dVar);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (action.equals("com.zing.zalo.intent.action.DELETE_NOTIFICATION")) {
                        m124231i(29300, intExtra2);
                        d dVar2 = (d) this.f114921b.remove(Integer.valueOf(intExtra));
                        if (dVar2 != null) {
                            AbstractC20110a.f98889a.mo104548a("Event delete notification: %s", dVar2);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: j */
    public final void m124239j(int i11, Notification notification, C23750d c23750d) {
        int i12;
        boolean z11;
        boolean z12;
        AbstractC19074t.m100208f(notification, "notification");
        boolean m124229e = m124229e(i11);
        if (c23750d != null) {
            i12 = c23750d.m124154j0();
        } else {
            i12 = 1;
        }
        notification.deleteIntent = m124233m(notification.deleteIntent, i12, i11);
        PendingIntent pendingIntent = notification.contentIntent;
        if ((notification.flags & 16) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        notification.contentIntent = m124234n(pendingIntent, i12, i11, z11);
        m124230g().m6699g(i11, notification);
        if (!this.f114921b.containsKey(Integer.valueOf(i11))) {
            m124231i(29100, i12);
            if (m124229e) {
                m124231i(29600, i12);
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        Map map = this.f114921b;
        long currentTimeMillis = System.currentTimeMillis();
        if ((notification.flags & 2) > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        map.put(valueOf, new d(i11, currentTimeMillis, i12, z12));
    }

    /* renamed from: l */
    public final void m124240l(Service service, int i11, Notification notification, int i12, C23750d c23750d) {
        int i13;
        if (service == null) {
            return;
        }
        m124229e(i11);
        if (c23750d != null) {
            i13 = c23750d.m124154j0();
        } else {
            i13 = 1;
        }
        if (Build.VERSION.SDK_INT >= 29 && notification != null) {
            service.startForeground(i11, notification, i12);
        } else {
            service.startForeground(i11, notification);
        }
        if (!this.f114921b.containsKey(Integer.valueOf(i11))) {
            m124231i(29100, i13);
        }
        this.f114921b.put(Integer.valueOf(i11), new d(i11, System.currentTimeMillis(), i13, true));
    }
}
