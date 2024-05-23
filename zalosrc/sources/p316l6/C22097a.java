package p316l6;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p032b6.AbstractC2584h;
import p032b6.C2578b;
import p229i5.AbstractC20299t;
import p229i5.AbstractC20301v;
import p229i5.C20288i;
import p229i5.InterfaceC20285f;
import p664y.AbstractC30228a;

/* renamed from: l6.a */
/* loaded from: classes2.dex */
public class C22097a {

    /* renamed from: r */
    private static final long f108813r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    private static volatile ScheduledExecutorService f108814s = null;

    /* renamed from: t */
    private static final Object f108815t = new Object();

    /* renamed from: u */
    private static volatile InterfaceC22101e f108816u = new C22099c();

    /* renamed from: a */
    private final Object f108817a;

    /* renamed from: b */
    private final PowerManager.WakeLock f108818b;

    /* renamed from: c */
    private int f108819c;

    /* renamed from: d */
    private Future f108820d;

    /* renamed from: e */
    private long f108821e;

    /* renamed from: f */
    private final Set f108822f;

    /* renamed from: g */
    private boolean f108823g;

    /* renamed from: h */
    private int f108824h;

    /* renamed from: i */
    C2578b f108825i;

    /* renamed from: j */
    private InterfaceC20285f f108826j;

    /* renamed from: k */
    private WorkSource f108827k;

    /* renamed from: l */
    private final String f108828l;

    /* renamed from: m */
    private final String f108829m;

    /* renamed from: n */
    private final Context f108830n;

    /* renamed from: o */
    private final Map f108831o;

    /* renamed from: p */
    private AtomicInteger f108832p;

    /* renamed from: q */
    private final ScheduledExecutorService f108833q;

    public C22097a(Context context, int i11, String str) {
        String str2;
        String packageName = context.getPackageName();
        this.f108817a = new Object();
        this.f108819c = 0;
        this.f108822f = new HashSet();
        this.f108823g = true;
        this.f108826j = C20288i.m105926d();
        this.f108831o = new HashMap();
        this.f108832p = new AtomicInteger(0);
        AbstractC4205o.m19723l(context, "WakeLock: context must not be null");
        AbstractC4205o.m19719h(str, "WakeLock: wakeLockName must not be empty");
        this.f108830n = context.getApplicationContext();
        this.f108829m = str;
        this.f108825i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f108828l = str2;
        } else {
            this.f108828l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i11, str);
            this.f108818b = newWakeLock;
            if (AbstractC20301v.m105967c(context)) {
                WorkSource m105966b = AbstractC20301v.m105966b(context, AbstractC20299t.m105962a(packageName) ? context.getPackageName() : packageName);
                this.f108827k = m105966b;
                if (m105966b != null) {
                    m115313i(newWakeLock, m105966b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f108814s;
            if (scheduledExecutorService == null) {
                synchronized (f108815t) {
                    try {
                        scheduledExecutorService = f108814s;
                        if (scheduledExecutorService == null) {
                            AbstractC2584h.m13015a();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f108814s = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f108833q = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb2.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m115309e(C22097a c22097a) {
        synchronized (c22097a.f108817a) {
            try {
                if (!c22097a.m115315b()) {
                    return;
                }
                String.valueOf(c22097a.f108828l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                c22097a.m115311g();
                if (!c22097a.m115315b()) {
                    return;
                }
                c22097a.f108819c = 1;
                c22097a.m115312h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    private final String m115310f(String str) {
        if (this.f108823g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    /* renamed from: g */
    private final void m115311g() {
        if (this.f108822f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f108822f);
        this.f108822f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC30228a.m149044a(arrayList.get(0));
        throw null;
    }

    /* renamed from: h */
    private final void m115312h(int i11) {
        synchronized (this.f108817a) {
            try {
                if (!m115315b()) {
                    return;
                }
                if (this.f108823g) {
                    int i12 = this.f108819c - 1;
                    this.f108819c = i12;
                    if (i12 > 0) {
                        return;
                    }
                } else {
                    this.f108819c = 0;
                }
                m115311g();
                Iterator it = this.f108831o.values().iterator();
                while (it.hasNext()) {
                    ((C22100d) it.next()).f108835a = 0;
                }
                this.f108831o.clear();
                Future future = this.f108820d;
                if (future != null) {
                    future.cancel(false);
                    this.f108820d = null;
                    this.f108821e = 0L;
                }
                this.f108824h = 0;
                if (this.f108818b.isHeld()) {
                    try {
                        try {
                            this.f108818b.release();
                            if (this.f108825i != null) {
                                this.f108825i = null;
                            }
                        } catch (RuntimeException e11) {
                            if (e11.getClass().equals(RuntimeException.class)) {
                                String.valueOf(this.f108828l).concat(" failed to release!");
                                if (this.f108825i != null) {
                                    this.f108825i = null;
                                }
                            } else {
                                throw e11;
                            }
                        }
                    } catch (Throwable th2) {
                        if (this.f108825i != null) {
                            this.f108825i = null;
                        }
                        throw th2;
                    }
                } else {
                    String.valueOf(this.f108828l).concat(" should be held!");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: i */
    private static void m115313i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
            Log.wtf("WakeLock", e11.toString());
        }
    }

    /* renamed from: a */
    public void m115314a(long j11) {
        this.f108832p.incrementAndGet();
        long j12 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f108813r), 1L);
        if (j11 > 0) {
            max = Math.min(j11, max);
        }
        synchronized (this.f108817a) {
            try {
                if (!m115315b()) {
                    this.f108825i = C2578b.m13014a(false, null);
                    this.f108818b.acquire();
                    this.f108826j.mo105914b();
                }
                this.f108819c++;
                this.f108824h++;
                m115310f(null);
                C22100d c22100d = (C22100d) this.f108831o.get(null);
                if (c22100d == null) {
                    c22100d = new C22100d(null);
                    this.f108831o.put(null, c22100d);
                }
                c22100d.f108835a++;
                long mo105914b = this.f108826j.mo105914b();
                if (Long.MAX_VALUE - mo105914b > max) {
                    j12 = mo105914b + max;
                }
                if (j12 > this.f108821e) {
                    this.f108821e = j12;
                    Future future = this.f108820d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f108820d = this.f108833q.schedule(new Runnable() { // from class: l6.b
                        public /* synthetic */ RunnableC22098b() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C22097a.m115309e(C22097a.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public boolean m115315b() {
        boolean z11;
        synchronized (this.f108817a) {
            if (this.f108819c > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    /* renamed from: c */
    public void m115316c() {
        if (this.f108832p.decrementAndGet() < 0) {
            String.valueOf(this.f108828l).concat(" release without a matched acquire!");
        }
        synchronized (this.f108817a) {
            try {
                m115310f(null);
                if (this.f108831o.containsKey(null)) {
                    C22100d c22100d = (C22100d) this.f108831o.get(null);
                    if (c22100d != null) {
                        int i11 = c22100d.f108835a - 1;
                        c22100d.f108835a = i11;
                        if (i11 == 0) {
                            this.f108831o.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.f108828l).concat(" counter does not exist");
                }
                m115312h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public void m115317d(boolean z11) {
        synchronized (this.f108817a) {
            this.f108823g = z11;
        }
    }
}
