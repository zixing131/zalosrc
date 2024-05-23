package ee;

import ag0.AbstractC0837p0;
import ag0.InterfaceC0806b1;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.AbstractC2151i0;
import androidx.work.C2148h;
import androidx.work.C2256x;
import androidx.work.EnumC2242k;
import bg0.C2797c;
import com.zing.zalo.MainApplication;
import com.zing.zalo.connection.socket.workers.PushLocalCalenderNotiWorker;
import com.zing.zalo.receiver.AlarmReceiver;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import ge.C19411c;
import ge.C19416h;
import ge.C19426r;
import gu.AbstractC19601a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23104j;
import mm0.AbstractC23350e;
import p348mi.AbstractC23309i;

/* renamed from: ee.k */
/* loaded from: classes3.dex */
public class C18403k {

    /* renamed from: i */
    public static final String f92793i = "k";

    /* renamed from: j */
    private static volatile C18403k f92794j;

    /* renamed from: k */
    private static final Map f92795k = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private final AtomicBoolean f92797b = new AtomicBoolean(false);

    /* renamed from: c */
    private C2797c f92798c = new a(AbstractC0837p0.m2225f());

    /* renamed from: d */
    private final int f92799d = 1000;

    /* renamed from: e */
    private final int f92800e = 40;

    /* renamed from: f */
    private int f92801f = 1000;

    /* renamed from: g */
    private int f92802g = 0;

    /* renamed from: h */
    private final AtomicBoolean f92803h = new AtomicBoolean(false);

    /* renamed from: a */
    private final AlarmManager f92796a = (AlarmManager) MainApplication.getAppContext().getSystemService("alarm");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ee.k$a */
    /* loaded from: classes3.dex */
    public class a extends C2797c {
        a(InterfaceC0806b1 interfaceC0806b1) {
            super(interfaceC0806b1);
        }

        @Override // bg0.C2797c
        /* renamed from: i */
        public void mo12810i(Exception exc) {
            AbstractC23350e.m122776f(C18403k.f92793i, exc);
        }
    }

    /* renamed from: i */
    private void m97440i(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19416h c19416h = (C19416h) it.next();
            f92795k.put(Integer.valueOf(c19416h.f96334a), c19416h);
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: ee.j

            /* renamed from: p */
            public final /* synthetic */ ArrayList f92792p;

            public /* synthetic */ RunnableC18402j(ArrayList arrayList2) {
                r1 = arrayList2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18403k.m97445r(r1);
            }
        });
    }

    /* renamed from: l */
    private void m97441l() {
        try {
            ArrayList arrayList = new ArrayList(f92795k.keySet());
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                int intValue = ((Integer) arrayList.get(i11)).intValue();
                Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) AlarmReceiver.class);
                intent.setAction("com.zing.zalo.calendar.PUSH_EVENT_LOCAL_NOTIFICATION");
                if (Build.VERSION.SDK_INT >= 29) {
                    intent.setIdentifier(intValue + "");
                }
                if (PendingIntent.getBroadcast(MainApplication.getAppContext(), intValue, intent, AbstractC19601a.m102572b(1610612736)) == null) {
                    m97460G(System.currentTimeMillis());
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: n */
    private ArrayList m97442n(String str) {
        ArrayList arrayList = new ArrayList();
        for (C19416h c19416h : f92795k.values()) {
            if (c19416h.f96335b.equals(str)) {
                arrayList.add(Integer.valueOf(c19416h.f96334a));
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    public static synchronized C18403k m97443p() {
        C18403k c18403k;
        synchronized (C18403k.class) {
            try {
                if (f92794j == null) {
                    synchronized (C18403k.class) {
                        try {
                            if (f92794j == null) {
                                f92794j = new C18403k();
                            }
                        } finally {
                        }
                    }
                }
                c18403k = f92794j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c18403k;
    }

    /* renamed from: q */
    private synchronized int m97444q() {
        while (!C19416h.m101551c(this.f92801f)) {
            try {
                this.f92801f++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i11 = this.f92801f;
        if (i11 >= 1000 && i11 < 1040) {
            return i11;
        }
        for (int i12 = 1000; i12 < 1040; i12++) {
            if (C19416h.m101551c(i12)) {
                this.f92801f = i12;
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public static /* synthetic */ void m97445r(ArrayList arrayList) {
        C18412t.m97566F().m97578M(arrayList);
    }

    /* renamed from: s */
    public static /* synthetic */ void m97446s() {
        C18412t.m97566F().m97581b();
    }

    /* renamed from: t */
    public /* synthetic */ void m97447t() {
        synchronized (this.f92797b) {
            try {
                if (!this.f92797b.get()) {
                    ArrayList m97587v = C18412t.m97566F().m97587v();
                    ArrayList arrayList = new ArrayList();
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = m97587v.iterator();
                    while (it.hasNext()) {
                        C19416h c19416h = (C19416h) it.next();
                        if (c19416h.f96337d < currentTimeMillis) {
                            arrayList.add(Integer.valueOf(c19416h.f96334a));
                        } else {
                            f92795k.put(Integer.valueOf(c19416h.f96334a), c19416h);
                        }
                    }
                    if (arrayList.size() > 0) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            C19416h.m101552e(((Integer) it2.next()).intValue());
                        }
                        C18412t.m97566F().m97584q(arrayList);
                    }
                    this.f92797b.set(true);
                    this.f92802g = 0;
                    m97441l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m97448u(ArrayList arrayList) {
        C18412t.m97566F().m97584q(arrayList);
    }

    /* renamed from: v */
    public /* synthetic */ void m97449v() {
        m97463m();
        AbstractC23309i.m122441tr(0L);
        this.f92802g = 0;
        this.f92797b.set(false);
    }

    /* renamed from: x */
    public static /* synthetic */ int m97451x(C19416h c19416h, C19416h c19416h2) {
        long j11 = c19416h.f96337d;
        long j12 = c19416h2.f96337d;
        if (j11 == j12) {
            long j13 = c19416h.f96336c;
            long j14 = c19416h2.f96336c;
            if (j13 == j14) {
                return Long.compare(Long.parseLong(c19416h.f96335b), Long.parseLong(c19416h2.f96335b));
            }
            if (j13 <= j14) {
                return -1;
            }
            return 1;
        }
        if (j11 <= j12) {
            return -1;
        }
        return 1;
    }

    /* renamed from: y */
    public /* synthetic */ void m97452y(long j11) {
        C19411c.a aVar;
        C19411c.a.d dVar;
        if (this.f92803h.compareAndSet(false, true)) {
            m97463m();
            ArrayList m97514O = C18408p.m97476S().m97514O(j11, 1209600000 + j11);
            ArrayList arrayList = new ArrayList();
            Iterator it = m97514O.iterator();
            while (it.hasNext()) {
                C19426r c19426r = (C19426r) it.next();
                if (c19426r != null && (aVar = c19426r.f96281u) != null && (dVar = aVar.f96292f) != null && dVar.f96303a) {
                    arrayList.add(c19426r);
                }
            }
            AbstractC23309i.m122441tr(j11);
            m97450w(arrayList);
            this.f92803h.set(false);
        }
    }

    /* renamed from: z */
    private void m97453z(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                f92795k.remove(num);
                C19416h.m101552e(num.intValue());
            }
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: ee.i

                /* renamed from: p */
                public final /* synthetic */ ArrayList f92791p;

                public /* synthetic */ RunnableC18401i(ArrayList arrayList2) {
                    r1 = arrayList2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18403k.m97448u(r1);
                }
            });
        }
    }

    /* renamed from: A */
    public void m97454A(String str) {
        m97455B(m97442n(str));
    }

    /* renamed from: B */
    public void m97455B(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) AlarmReceiver.class);
                intent.setAction("com.zing.zalo.calendar.PUSH_EVENT_LOCAL_NOTIFICATION");
                if (Build.VERSION.SDK_INT >= 29) {
                    intent.setIdentifier(num + "");
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(MainApplication.getAppContext(), num.intValue(), intent, AbstractC19601a.m102572b(1610612736));
                if (broadcast != null) {
                    this.f92796a.cancel(broadcast);
                    broadcast.cancel();
                }
            }
            m97453z(arrayList);
        }
    }

    /* renamed from: C */
    public void m97456C() {
        this.f92798c.mo13474a(new Runnable() { // from class: ee.h
            public /* synthetic */ RunnableC18400h() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18403k.this.m97449v();
            }
        });
    }

    /* renamed from: D */
    public void m97457D(Runnable runnable) {
        this.f92798c.mo13474a(runnable);
    }

    /* renamed from: E */
    void m97458E(Context context, long j11, String str, Class cls, String str2) {
        try {
            AbstractC2151i0.m11547h(context).m11554f(str2, EnumC2242k.KEEP, (C2256x) ((C2256x.a) ((C2256x.a) ((C2256x.a) new C2256x.a(cls).m11862a(str2)).m11873n(new C2148h.a().m11539f("CALENDAR_EVENT_DATA_KEY", str).m11534a())).m11872m(j11, TimeUnit.MILLISECONDS)).m11863b());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: F */
    public void m97450w(ArrayList arrayList) {
        synchronized (this.f92797b) {
            try {
                if (!this.f92797b.get() && this.f92802g < 5) {
                    AbstractC17930e.m94545d().mo94531e(new Runnable() { // from class: ee.e

                        /* renamed from: q */
                        public final /* synthetic */ ArrayList f92789q;

                        public /* synthetic */ RunnableC18397e(ArrayList arrayList2) {
                            r2 = arrayList2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C18403k.this.m97450w(r2);
                        }
                    }, 5000L);
                    this.f92802g++;
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList2);
                Map map = f92795k;
                if (map.size() + arrayList2.size() > 40) {
                    ArrayList arrayList3 = new ArrayList(map.values());
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C19426r c19426r = (C19426r) it.next();
                        arrayList3.add(C19416h.m101550b(c19426r.f96261a, c19426r.f96262b, c19426r.f96380C));
                    }
                    Collections.sort(arrayList3, new Comparator() { // from class: ee.f
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m97451x;
                            m97451x = C18403k.m97451x((C19416h) obj, (C19416h) obj2);
                            return m97451x;
                        }
                    });
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 40; i11 < arrayList3.size(); i11++) {
                        int i12 = ((C19416h) arrayList3.get(i11)).f96334a;
                        if (i12 != -1) {
                            arrayList4.add(Integer.valueOf(i12));
                        }
                    }
                    m97455B(arrayList4);
                    Collections.sort(arrayList2, C18408p.m97469I());
                    arrayList2 = new ArrayList(arrayList2.subList(0, Math.min(arrayList2.size(), 40 - f92795k.size())));
                }
                ArrayList arrayList5 = new ArrayList();
                try {
                    try {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            C19426r c19426r2 = (C19426r) it2.next();
                            C19416h c19416h = new C19416h(m97444q(), c19426r2.f96261a, c19426r2.f96262b, c19426r2.f96380C);
                            if (c19416h.f96334a != -1) {
                                Context appContext = MainApplication.getAppContext();
                                Intent intent = new Intent(appContext, (Class<?>) AlarmReceiver.class);
                                intent.setAction("com.zing.zalo.calendar.PUSH_EVENT_LOCAL_NOTIFICATION");
                                intent.putExtra("STR_EXTRA_CURRENT_UID", CoreUtility.f89233i);
                                intent.putExtra("CALENDAR_EVENT_DATA_KEY", c19426r2.mo101533h().toString());
                                int i13 = Build.VERSION.SDK_INT;
                                if (i13 >= 29) {
                                    intent.setIdentifier(c19416h.f96334a + "");
                                }
                                PendingIntent broadcast = PendingIntent.getBroadcast(appContext, c19416h.f96334a, intent, AbstractC19601a.m102572b(1342177280));
                                arrayList5.add(c19416h);
                                long currentTimeMillis = c19416h.f96337d - System.currentTimeMillis();
                                if (i13 >= 23 && currentTimeMillis > 60000) {
                                    if (!AbstractC23104j.m118480b(31)) {
                                        this.f92796a.setExactAndAllowWhileIdle(0, c19416h.f96337d, broadcast);
                                    } else {
                                        m97458E(appContext, currentTimeMillis, c19426r2.mo101533h().toString(), PushLocalCalenderNotiWorker.class, c19416h.m101553d());
                                    }
                                } else if (currentTimeMillis > 60000) {
                                    this.f92796a.setExact(0, c19416h.f96337d, broadcast);
                                } else {
                                    this.f92796a.set(0, c19416h.f96337d, broadcast);
                                }
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                } finally {
                    m97440i(arrayList5);
                }
            } finally {
            }
        }
    }

    /* renamed from: G */
    public void m97460G(long j11) {
        try {
            this.f92798c.mo13474a(new Runnable() { // from class: ee.c

                /* renamed from: q */
                public final /* synthetic */ long f92786q;

                public /* synthetic */ RunnableC18395c(long j112) {
                    r2 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18403k.this.m97452y(r2);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: j */
    public void m97461j(ArrayList arrayList) {
        long currentTimeMillis = System.currentTimeMillis();
        m97450w(C18415w.m97599l(C18415w.m97592e(arrayList), currentTimeMillis, 1209600000 + currentTimeMillis));
    }

    /* renamed from: k */
    public void m97462k() {
        try {
            long m121520V6 = AbstractC23309i.m121520V6();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - m121520V6 > 86400000 || currentTimeMillis < m121520V6) {
                m97460G(currentTimeMillis);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: m */
    public void m97463m() {
        for (int i11 = 1000; i11 < 1040; i11++) {
            Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) AlarmReceiver.class);
            intent.setAction("com.zing.zalo.calendar.PUSH_EVENT_LOCAL_NOTIFICATION");
            if (Build.VERSION.SDK_INT >= 29) {
                intent.setIdentifier(i11 + "");
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(MainApplication.getAppContext(), i11, intent, AbstractC19601a.m102572b(1610612736));
            if (broadcast != null) {
                this.f92796a.cancel(broadcast);
                broadcast.cancel();
            }
        }
        f92795k.clear();
        C19416h.m101549a();
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: ee.g
            @Override // java.lang.Runnable
            public final void run() {
                C18403k.m97446s();
            }
        });
    }

    /* renamed from: o */
    public void m97464o() {
        if (!this.f92797b.get()) {
            this.f92798c.mo13474a(new Runnable() { // from class: ee.d
                public /* synthetic */ RunnableC18396d() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18403k.this.m97447t();
                }
            });
        }
    }
}
