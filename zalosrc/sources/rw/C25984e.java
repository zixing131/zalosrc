package rw;

import android.os.Binder;
import android.util.Log;
import android.util.Printer;

/* renamed from: rw.e */
/* loaded from: classes.dex */
public class C25984e {

    /* renamed from: d */
    static final ThreadLocal f123954d = new ThreadLocal();

    /* renamed from: a */
    final Thread f123955a = Thread.currentThread();

    /* renamed from: b */
    final C25986g f123956b;

    /* renamed from: c */
    private Printer f123957c;

    private C25984e(boolean z11, boolean z12) {
        this.f123956b = new C25986g(z11, z12);
    }

    /* renamed from: b */
    public static void m133838b() {
        C25984e m133839c = m133839c();
        if (m133839c != null) {
            C25986g c25986g = m133839c.f123956b;
            Binder.clearCallingIdentity();
            long clearCallingIdentity = Binder.clearCallingIdentity();
            while (true) {
                C25985f m133855d = c25986g.m133855d();
                if (m133855d == null) {
                    return;
                }
                Printer printer = m133839c.f123957c;
                if (printer != null) {
                    printer.println(">>>>> Dispatching to " + m133855d.f123968h + " " + m133855d.f123969i + ": " + m133855d.f123961a);
                }
                m133855d.f123968h.m133822a(m133855d);
                if (printer != null) {
                    printer.println("<<<<< Finished to " + m133855d.f123968h + " " + m133855d.f123969i);
                }
                long clearCallingIdentity2 = Binder.clearCallingIdentity();
                if (clearCallingIdentity != clearCallingIdentity2) {
                    Log.wtf("ZaloLooper", "Thread identity changed from 0x" + Long.toHexString(clearCallingIdentity) + " to 0x" + Long.toHexString(clearCallingIdentity2) + " while dispatching to " + m133855d.f123968h.getClass().getName() + " " + m133855d.f123969i + " what=" + m133855d.f123961a);
                }
                m133855d.m133850h();
            }
        } else {
            throw new RuntimeException("No Looper; Looper.prepare() wasn't called on this thread.");
        }
    }

    /* renamed from: c */
    public static C25984e m133839c() {
        return (C25984e) f123954d.get();
    }

    /* renamed from: d */
    public static void m133840d() {
        m133841e(true, true);
    }

    /* renamed from: e */
    private static void m133841e(boolean z11, boolean z12) {
        ThreadLocal threadLocal = f123954d;
        if (threadLocal.get() == null) {
            threadLocal.set(new C25984e(z11, z12));
            return;
        }
        throw new RuntimeException("Only one Looper may be created per thread");
    }

    /* renamed from: a */
    public C25986g m133842a() {
        return this.f123956b;
    }
}
