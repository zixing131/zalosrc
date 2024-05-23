package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.app.e1 */
/* loaded from: classes.dex */
public final class C1335e1 {

    /* renamed from: d */
    private static String f5916d;

    /* renamed from: g */
    private static c f5919g;

    /* renamed from: a */
    private final Context f5920a;

    /* renamed from: b */
    private final NotificationManager f5921b;

    /* renamed from: c */
    private static final Object f5915c = new Object();

    /* renamed from: e */
    private static Set f5917e = new HashSet();

    /* renamed from: f */
    private static final Object f5918f = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.e1$a */
    /* loaded from: classes2.dex */
    public static class a implements d {

        /* renamed from: a */
        final String f5922a;

        /* renamed from: b */
        final int f5923b;

        /* renamed from: c */
        final String f5924c;

        /* renamed from: d */
        final Notification f5925d;

        a(String str, int i11, String str2, Notification notification) {
            this.f5922a = str;
            this.f5923b = i11;
            this.f5924c = str2;
            this.f5925d = notification;
        }

        @Override // androidx.core.app.C1335e1.d
        /* renamed from: a */
        public void mo6701a(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.notify(this.f5922a, this.f5923b, this.f5924c, this.f5925d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f5922a + ", id:" + this.f5923b + ", tag:" + this.f5924c + "]";
        }
    }

    /* renamed from: androidx.core.app.e1$b */
    /* loaded from: classes2.dex */
    private static class b {

        /* renamed from: a */
        final ComponentName f5926a;

        /* renamed from: b */
        final IBinder f5927b;

        b(ComponentName componentName, IBinder iBinder) {
            this.f5926a = componentName;
            this.f5927b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.e1$c */
    /* loaded from: classes2.dex */
    public static class c implements Handler.Callback, ServiceConnection {

        /* renamed from: p */
        private final Context f5928p;

        /* renamed from: q */
        private final HandlerThread f5929q;

        /* renamed from: r */
        private final Handler f5930r;

        /* renamed from: s */
        private final Map f5931s = new HashMap();

        /* renamed from: t */
        private Set f5932t = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.e1$c$a */
        /* loaded from: classes2.dex */
        public static class a {

            /* renamed from: a */
            final ComponentName f5933a;

            /* renamed from: c */
            INotificationSideChannel f5935c;

            /* renamed from: b */
            boolean f5934b = false;

            /* renamed from: d */
            ArrayDeque f5936d = new ArrayDeque();

            /* renamed from: e */
            int f5937e = 0;

            a(ComponentName componentName) {
                this.f5933a = componentName;
            }
        }

        c(Context context) {
            this.f5928p = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f5929q = handlerThread;
            handlerThread.start();
            this.f5930r = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m6702a(a aVar) {
            if (aVar.f5934b) {
                return true;
            }
            boolean bindService = this.f5928p.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f5933a), this, 33);
            aVar.f5934b = bindService;
            if (bindService) {
                aVar.f5937e = 0;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to bind to listener ");
                sb2.append(aVar.f5933a);
                this.f5928p.unbindService(this);
            }
            return aVar.f5934b;
        }

        /* renamed from: b */
        private void m6703b(a aVar) {
            if (aVar.f5934b) {
                this.f5928p.unbindService(this);
                aVar.f5934b = false;
            }
            aVar.f5935c = null;
        }

        /* renamed from: c */
        private void m6704c(d dVar) {
            m6710j();
            for (a aVar : this.f5931s.values()) {
                aVar.f5936d.add(dVar);
                m6708g(aVar);
            }
        }

        /* renamed from: d */
        private void m6705d(ComponentName componentName) {
            a aVar = (a) this.f5931s.get(componentName);
            if (aVar != null) {
                m6708g(aVar);
            }
        }

        /* renamed from: e */
        private void m6706e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f5931s.get(componentName);
            if (aVar != null) {
                aVar.f5935c = INotificationSideChannel.Stub.asInterface(iBinder);
                aVar.f5937e = 0;
                m6708g(aVar);
            }
        }

        /* renamed from: f */
        private void m6707f(ComponentName componentName) {
            a aVar = (a) this.f5931s.get(componentName);
            if (aVar != null) {
                m6703b(aVar);
            }
        }

        /* renamed from: g */
        private void m6708g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Processing component ");
                sb2.append(aVar.f5933a);
                sb2.append(", ");
                sb2.append(aVar.f5936d.size());
                sb2.append(" queued tasks");
            }
            if (aVar.f5936d.isEmpty()) {
                return;
            }
            if (m6702a(aVar) && aVar.f5935c != null) {
                while (true) {
                    d dVar = (d) aVar.f5936d.peek();
                    if (dVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Sending task ");
                            sb3.append(dVar);
                        }
                        dVar.mo6701a(aVar.f5935c);
                        aVar.f5936d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Remote service has died: ");
                            sb4.append(aVar.f5933a);
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("RemoteException communicating with ");
                        sb5.append(aVar.f5933a);
                    }
                }
                if (!aVar.f5936d.isEmpty()) {
                    m6709i(aVar);
                    return;
                }
                return;
            }
            m6709i(aVar);
        }

        /* renamed from: i */
        private void m6709i(a aVar) {
            if (this.f5930r.hasMessages(3, aVar.f5933a)) {
                return;
            }
            int i11 = aVar.f5937e;
            int i12 = i11 + 1;
            aVar.f5937e = i12;
            if (i12 > 6) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Giving up on delivering ");
                sb2.append(aVar.f5936d.size());
                sb2.append(" tasks to ");
                sb2.append(aVar.f5933a);
                sb2.append(" after ");
                sb2.append(aVar.f5937e);
                sb2.append(" retries");
                aVar.f5936d.clear();
                return;
            }
            int i13 = (1 << i11) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Scheduling retry for ");
                sb3.append(i13);
                sb3.append(" ms");
            }
            this.f5930r.sendMessageDelayed(this.f5930r.obtainMessage(3, aVar.f5933a), i13);
        }

        /* renamed from: j */
        private void m6710j() {
            Set m6692f = C1335e1.m6692f(this.f5928p);
            if (m6692f.equals(this.f5932t)) {
                return;
            }
            this.f5932t = m6692f;
            List<ResolveInfo> queryIntentServices = this.f5928p.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (m6692f.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Permission present on component ");
                        sb2.append(componentName);
                        sb2.append(", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f5931s.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Adding listener record for ");
                        sb3.append(componentName2);
                    }
                    this.f5931s.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f5931s.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Removing listener record for ");
                        sb4.append(entry.getKey());
                    }
                    m6703b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        /* renamed from: h */
        public void m6711h(d dVar) {
            this.f5930r.obtainMessage(0, dVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return false;
                        }
                        m6705d((ComponentName) message.obj);
                        return true;
                    }
                    m6707f((ComponentName) message.obj);
                    return true;
                }
                b bVar = (b) message.obj;
                m6706e(bVar.f5926a, bVar.f5927b);
                return true;
            }
            m6704c((d) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Connected to service ");
                sb2.append(componentName);
            }
            this.f5930r.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Disconnected from service ");
                sb2.append(componentName);
            }
            this.f5930r.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.e1$d */
    /* loaded from: classes2.dex */
    public interface d {
        /* renamed from: a */
        void mo6701a(INotificationSideChannel iNotificationSideChannel);
    }

    private C1335e1(Context context) {
        this.f5920a = context;
        this.f5921b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: e */
    public static C1335e1 m6691e(Context context) {
        return new C1335e1(context);
    }

    /* renamed from: f */
    public static Set m6692f(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f5915c) {
            if (string != null) {
                try {
                    if (!string.equals(f5916d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        f5917e = hashSet;
                        f5916d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f5917e;
        }
        return set;
    }

    /* renamed from: i */
    private void m6693i(d dVar) {
        synchronized (f5918f) {
            try {
                if (f5919g == null) {
                    f5919g = new c(this.f5920a.getApplicationContext());
                }
                f5919g.m6711h(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    private static boolean m6694j(Notification notification) {
        Bundle m6798a = AbstractC1364q.m6798a(notification);
        if (m6798a != null && m6798a.getBoolean("android.support.useSideChannel")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m6695a() {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            areNotificationsEnabled = this.f5921b.areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f5920a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f5920a.getApplicationInfo();
        String packageName = this.f5920a.getApplicationContext().getPackageName();
        int i11 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i11), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public void m6696b(int i11) {
        m6697c(null, i11);
    }

    /* renamed from: c */
    public void m6697c(String str, int i11) {
        this.f5921b.cancel(str, i11);
    }

    /* renamed from: d */
    public void m6698d() {
        this.f5921b.cancelAll();
    }

    /* renamed from: g */
    public void m6699g(int i11, Notification notification) {
        m6700h(null, i11, notification);
    }

    /* renamed from: h */
    public void m6700h(String str, int i11, Notification notification) {
        if (m6694j(notification)) {
            m6693i(new a(this.f5920a.getPackageName(), i11, str, notification));
            this.f5921b.cancel(str, i11);
        } else {
            this.f5921b.notify(str, i11, notification);
        }
    }
}
