package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m */
/* loaded from: classes.dex */
public final class RunnableC6056m implements Runnable {

    /* renamed from: p */
    final /* synthetic */ InterfaceC6073n5 f34196p;

    /* renamed from: q */
    final /* synthetic */ AbstractC6067n f34197q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6056m(AbstractC6067n abstractC6067n, InterfaceC6073n5 interfaceC6073n5) {
        this.f34197q = abstractC6067n;
        this.f34196p = interfaceC6073n5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34196p.mo31035f();
        if (C5945c.m30814a()) {
            this.f34196p.mo31037v().m31296z(this);
            return;
        }
        boolean m31149e = this.f34197q.m31149e();
        this.f34197q.f34227c = 0L;
        if (m31149e) {
            this.f34197q.mo31147c();
        }
    }
}
