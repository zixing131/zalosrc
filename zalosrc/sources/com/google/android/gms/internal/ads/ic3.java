package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ic3 implements Runnable {

    /* renamed from: p */
    final Future f22140p;

    /* renamed from: q */
    final gc3 f22141q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ic3(Future future, gc3 gc3Var) {
        this.f22140p = future;
        this.f22141q = gc3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable m25165a;
        Object obj = this.f22140p;
        if ((obj instanceof nd3) && (m25165a = od3.m25165a((nd3) obj)) != null) {
            this.f22141q.zza(m25165a);
            return;
        }
        try {
            this.f22141q.zzb(kc3.m23884p(this.f22140p));
        } catch (Error e11) {
            e = e11;
            this.f22141q.zza(e);
        } catch (RuntimeException e12) {
            e = e12;
            this.f22141q.zza(e);
        } catch (ExecutionException e13) {
            this.f22141q.zza(e13.getCause());
        }
    }

    public final String toString() {
        c53 m21265a = d53.m21265a(this);
        m21265a.m20808a(this.f22141q);
        return m21265a.toString();
    }
}
