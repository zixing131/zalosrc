package sd0;

import android.os.SystemClock;
import com.zing.zalo.service.TaskNonStickyExecutor;
import ho0.AbstractC20110a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mm0.AbstractC23350e;
import p248iy.AbstractC20887g;

/* renamed from: sd0.a */
/* loaded from: classes4.dex */
public class C26232a {

    /* renamed from: c */
    static C26232a f124607c;

    /* renamed from: a */
    final Map f124608a = new ConcurrentHashMap();

    /* renamed from: b */
    Runnable f124609b = new a();

    /* renamed from: sd0.a$a */
    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C26232a.this.f124608a.isEmpty()) {
                    return;
                }
                for (Map.Entry entry : C26232a.this.f124608a.entrySet()) {
                    if (entry != null && entry.getValue() != null && SystemClock.uptimeMillis() - ((C26234c) entry.getValue()).f124616b > 1800000) {
                        AbstractC20887g.m109237o(25998);
                        AbstractC20110a.m104538g("markUploadError (something wrong): %d - %d - %s - %s", Integer.valueOf(((C26233b) entry.getKey()).f124611a), Integer.valueOf(((C26233b) entry.getKey()).f124612b), ((C26233b) entry.getKey()).f124613c, ((C26233b) entry.getKey()).f124614d);
                        C26232a.this.f124608a.remove(entry.getKey());
                    }
                }
                if (!C26232a.this.f124608a.isEmpty()) {
                    TaskNonStickyExecutor m50450b = TaskNonStickyExecutor.m50450b();
                    Runnable runnable = C26232a.this.f124609b;
                    m50450b.m50456g(runnable, runnable, 300000L);
                    return;
                }
                TaskNonStickyExecutor.m50450b().m50451a(C26232a.this.f124609b);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: a */
    public static synchronized C26232a m134877a() {
        C26232a c26232a;
        synchronized (C26232a.class) {
            try {
                if (f124607c == null) {
                    f124607c = new C26232a();
                }
                c26232a = f124607c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c26232a;
    }

    /* renamed from: e */
    private void m134878e() {
        TaskNonStickyExecutor m50450b = TaskNonStickyExecutor.m50450b();
        Runnable runnable = this.f124609b;
        m50450b.m50456g(runnable, runnable, 300000L);
    }

    /* renamed from: b */
    public void m134879b(int i11, int i12, String str) {
        AbstractC20110a.m104535d("markStartUpload: %d - %d - %s - %s", Integer.valueOf(i11), Integer.valueOf(i12), null, str);
        C26233b m134882a = C26233b.m134882a(i11, i12, null, str);
        if (((C26234c) this.f124608a.get(m134882a)) == null) {
            C26234c c26234c = new C26234c();
            c26234c.f124616b = SystemClock.uptimeMillis();
            c26234c.f124615a = System.currentTimeMillis();
            this.f124608a.put(m134882a, c26234c);
            m134878e();
        }
    }

    /* renamed from: c */
    public void m134880c(int i11, int i12, String str) {
        AbstractC20110a.m104542k(8, "markUploadError: %d - %d - %s - %s", Integer.valueOf(i11), Integer.valueOf(i12), null, str);
        C26233b m134882a = C26233b.m134882a(i11, i12, null, str);
        C26234c c26234c = (C26234c) this.f124608a.get(m134882a);
        if (c26234c != null) {
            AbstractC20887g.m109239q(i12 + 25000, c26234c.f124615a, System.currentTimeMillis(), SystemClock.uptimeMillis() - c26234c.f124616b);
            this.f124608a.remove(m134882a);
        } else {
            AbstractC20887g.m109237o(25999);
            AbstractC20110a.m104538g("markUploadError (something wrong): %d - %d - %s - %s", Integer.valueOf(i11), Integer.valueOf(i12), null, str);
        }
    }

    /* renamed from: d */
    public void m134881d(int i11, int i12, String str) {
        AbstractC20110a.m104542k(8, "markUploadSuccess: %d - %d - %s - %s", Integer.valueOf(i11), Integer.valueOf(i12), null, str);
        C26233b m134882a = C26233b.m134882a(i11, i12, null, str);
        C26234c c26234c = (C26234c) this.f124608a.get(m134882a);
        if (c26234c != null) {
            AbstractC20887g.m109247y(i12 + 25000, c26234c.f124615a, System.currentTimeMillis(), SystemClock.uptimeMillis() - c26234c.f124616b);
            this.f124608a.remove(m134882a);
        } else {
            AbstractC20887g.m109245w(25999);
            AbstractC20110a.m104538g("markUploadSuccess (something wrong): %d - %d - %s - %s", Integer.valueOf(i11), Integer.valueOf(i12), null, str);
        }
    }
}
