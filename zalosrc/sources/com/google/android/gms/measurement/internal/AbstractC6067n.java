package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.HandlerC5298b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n */
/* loaded from: classes.dex */
public abstract class AbstractC6067n {

    /* renamed from: d */
    private static volatile Handler f34224d;

    /* renamed from: a */
    private final InterfaceC6073n5 f34225a;

    /* renamed from: b */
    private final Runnable f34226b;

    /* renamed from: c */
    private volatile long f34227c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6067n(InterfaceC6073n5 interfaceC6073n5) {
        AbstractC4205o.m19722k(interfaceC6073n5);
        this.f34225a = interfaceC6073n5;
        this.f34226b = new RunnableC6056m(this, interfaceC6073n5);
    }

    /* renamed from: f */
    private final Handler m31145f() {
        Handler handler;
        if (f34224d != null) {
            return f34224d;
        }
        synchronized (AbstractC6067n.class) {
            try {
                if (f34224d == null) {
                    f34224d = new HandlerC5298b1(this.f34225a.mo31032b().getMainLooper());
                }
                handler = f34224d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m31146b() {
        this.f34227c = 0L;
        m31145f().removeCallbacks(this.f34226b);
    }

    /* renamed from: c */
    public abstract void mo31147c();

    /* renamed from: d */
    public final void m31148d(long j11) {
        m31146b();
        if (j11 >= 0) {
            this.f34227c = this.f34225a.mo31031a().mo105913a();
            if (!m31145f().postDelayed(this.f34226b, j11)) {
                this.f34225a.mo31033c().m31197q().m31109b("Failed to schedule delayed post. time", Long.valueOf(j11));
            }
        }
    }

    /* renamed from: e */
    public final boolean m31149e() {
        return this.f34227c != 0;
    }
}
