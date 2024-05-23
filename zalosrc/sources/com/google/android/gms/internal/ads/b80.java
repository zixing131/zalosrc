package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class b80 extends wl0 {

    /* renamed from: c */
    private final Object f17663c = new Object();

    /* renamed from: d */
    private final g80 f17664d;

    /* renamed from: e */
    private boolean f17665e;

    public b80(g80 g80Var) {
        this.f17664d = g80Var;
    }

    /* renamed from: g */
    public final void m20433g() {
        synchronized (this.f17663c) {
            try {
                if (this.f17665e) {
                    return;
                }
                this.f17665e = true;
                m27653e(new y70(this), new sl0());
                m27653e(new z70(this), new a80(this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
