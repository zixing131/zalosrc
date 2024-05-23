package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cb4 {

    /* renamed from: a */
    private Exception f18176a;

    /* renamed from: b */
    private long f18177b;

    public cb4(long j11) {
    }

    /* renamed from: a */
    public final void m20858a() {
        this.f18176a = null;
    }

    /* renamed from: b */
    public final void m20859b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f18176a == null) {
            this.f18176a = exc;
            this.f18177b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f18177b) {
            Exception exc2 = this.f18176a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.f18176a;
            this.f18176a = null;
            throw exc3;
        }
    }
}
