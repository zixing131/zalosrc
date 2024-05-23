package p308kx;

import android.os.PowerManager;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p220hx.AbstractC20164b;
import p665y0.C30245g;

/* renamed from: kx.k */
/* loaded from: classes4.dex */
class C21967k extends AbstractC20164b {

    /* renamed from: d */
    private long f108138d;

    /* renamed from: e */
    private long f108139e;

    /* renamed from: f */
    private long f108140f;

    /* renamed from: g */
    private int f108141g;

    /* renamed from: a */
    private final WeakHashMap f108135a = new WeakHashMap();

    /* renamed from: b */
    private final C30245g f108136b = new C30245g();

    /* renamed from: c */
    private final ArrayList f108137c = new ArrayList();

    /* renamed from: h */
    private boolean f108142h = true;

    /* renamed from: f */
    private synchronized void m114713f() {
        long longValue;
        try {
            Iterator it = this.f108137c.iterator();
            int i11 = 0;
            long j11 = -1;
            while (it.hasNext()) {
                C21966j c21966j = (C21966j) it.next();
                boolean m114706i = c21966j.m114706i();
                if (c21966j.m114710o()) {
                    i11++;
                } else if (m114706i && c21966j.m114708m() > j11) {
                    j11 = c21966j.m114708m();
                }
                if (c21966j.f108127h.get() == null) {
                    Long l11 = (Long) this.f108136b.get(c21966j.f108125f);
                    C30245g c30245g = this.f108136b;
                    String str = c21966j.f108125f;
                    if (l11 == null) {
                        longValue = 0;
                    } else {
                        longValue = l11.longValue();
                    }
                    c30245g.put(str, Long.valueOf(longValue + c21966j.m114707l()));
                    it.remove();
                }
            }
            if (this.f108141g != 0 && i11 == 0) {
                this.f108139e += j11 - this.f108138d;
            }
            this.f108141g = i11;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m114714a(PowerManager.WakeLock wakeLock, long j11) {
        try {
            if (!this.f108142h) {
                return;
            }
            m114713f();
            C21966j c21966j = (C21966j) this.f108135a.get(wakeLock);
            if (c21966j == null) {
                return;
            }
            if (c21966j.m114705h(j11)) {
                if (this.f108141g == 0) {
                    this.f108138d = SystemClock.uptimeMillis();
                }
                this.f108140f++;
                this.f108141g++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b */
    public synchronized C21966j m114715b(PowerManager.WakeLock wakeLock) {
        return (C21966j) this.f108135a.get(wakeLock);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void m114716c(PowerManager.WakeLock wakeLock, int i11, String str, long j11) {
        if (!this.f108142h) {
            return;
        }
        C21966j c21966j = new C21966j(wakeLock, str, i11, j11);
        this.f108135a.put(wakeLock, c21966j);
        this.f108137c.add(c21966j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized C21966j m114717d(PowerManager.WakeLock wakeLock) {
        if (!this.f108142h) {
            return null;
        }
        m114713f();
        C21966j c21966j = (C21966j) this.f108135a.get(wakeLock);
        if (c21966j == null) {
            return null;
        }
        if (c21966j.m114711p()) {
            int i11 = this.f108141g - 1;
            this.f108141g = i11;
            if (i11 == 0) {
                this.f108139e += c21966j.m114708m() - this.f108138d;
            }
        }
        return c21966j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void m114718e(PowerManager.WakeLock wakeLock, boolean z11) {
        if (!this.f108142h) {
            return;
        }
        C21966j c21966j = (C21966j) this.f108135a.get(wakeLock);
        if (c21966j == null) {
            return;
        }
        c21966j.m114712r(z11);
    }
}
