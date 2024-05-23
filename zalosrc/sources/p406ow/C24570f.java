package p406ow;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ow.f */
/* loaded from: classes.dex */
public class C24570f {

    /* renamed from: a */
    public C24572h f118278a;

    /* renamed from: b */
    private volatile boolean f118279b;

    /* renamed from: c */
    private AtomicReference f118280c;

    /* renamed from: d */
    private AtomicReference f118281d;

    /* renamed from: e */
    private ArrayList f118282e;

    /* renamed from: f */
    private int f118283f;

    /* renamed from: ow.f$a */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a */
        public static final C24570f f118284a = new C24570f();
    }

    /* renamed from: c */
    public static C24570f m127979c() {
        return a.f118284a;
    }

    /* renamed from: d */
    private EnumC24566b m127980d(double d11) {
        if (d11 < 0.0d) {
            return EnumC24566b.UNKNOWN;
        }
        if (d11 < 150.0d) {
            return EnumC24566b.POOR;
        }
        if (d11 < 550.0d) {
            return EnumC24566b.MODERATE;
        }
        if (d11 < 2000.0d) {
            return EnumC24566b.GOOD;
        }
        return EnumC24566b.EXCELLENT;
    }

    /* renamed from: e */
    private void m127981e() {
        int size = this.f118282e.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((InterfaceC24567c) this.f118282e.get(i11)).mo47667a((EnumC24566b) this.f118280c.get());
        }
    }

    /* renamed from: a */
    public synchronized void m127982a(long j11, long j12) {
        if (j12 > 0) {
            double d11 = ((j11 * 1.0d) / j12) * 8.0d;
            if (d11 >= 10.0d) {
                try {
                    this.f118278a.m127986a(d11);
                    if (this.f118279b) {
                        this.f118283f++;
                        if (m127983b() != this.f118281d.get()) {
                            this.f118279b = false;
                            this.f118283f = 1;
                        }
                        if (this.f118283f >= 5.0d) {
                            this.f118279b = false;
                            this.f118283f = 1;
                            this.f118280c.set((EnumC24566b) this.f118281d.get());
                            m127981e();
                        }
                        return;
                    }
                    if (this.f118280c.get() != m127983b()) {
                        this.f118279b = true;
                        this.f118281d = new AtomicReference(m127983b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized EnumC24566b m127983b() {
        C24572h c24572h = this.f118278a;
        if (c24572h == null) {
            return EnumC24566b.UNKNOWN;
        }
        return m127980d(c24572h.m127987b());
    }

    /* renamed from: f */
    public EnumC24566b m127984f(InterfaceC24567c interfaceC24567c) {
        if (interfaceC24567c != null) {
            this.f118282e.add(interfaceC24567c);
        }
        return (EnumC24566b) this.f118280c.get();
    }

    /* renamed from: g */
    public void m127985g() {
        C24572h c24572h = this.f118278a;
        if (c24572h != null) {
            c24572h.m127988c();
        }
    }

    private C24570f() {
        this.f118278a = new C24572h(0.2d);
        this.f118279b = false;
        this.f118280c = new AtomicReference(EnumC24566b.UNKNOWN);
        this.f118282e = new ArrayList();
    }
}
