package androidx.core.os;

import android.os.CancellationSignal;

/* renamed from: androidx.core.os.e */
/* loaded from: classes2.dex */
public final class C1439e {

    /* renamed from: a */
    private boolean f6268a;

    /* renamed from: b */
    private Object f6269b;

    /* renamed from: c */
    private boolean f6270c;

    /* renamed from: androidx.core.os.e$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static void m7344a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        static CancellationSignal m7345b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: a */
    public void m7342a() {
        synchronized (this) {
            try {
                if (this.f6268a) {
                    return;
                }
                this.f6268a = true;
                this.f6270c = true;
                Object obj = this.f6269b;
                if (obj != null) {
                    try {
                        a.m7344a(obj);
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f6270c = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    this.f6270c = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: b */
    public Object m7343b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f6269b == null) {
                    CancellationSignal m7345b = a.m7345b();
                    this.f6269b = m7345b;
                    if (this.f6268a) {
                        a.m7344a(m7345b);
                    }
                }
                obj = this.f6269b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
