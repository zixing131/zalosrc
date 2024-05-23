package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class i44 implements j34 {

    /* renamed from: a */
    private final w81 f22063a;

    /* renamed from: b */
    private boolean f22064b;

    /* renamed from: c */
    private long f22065c;

    /* renamed from: d */
    private long f22066d;

    /* renamed from: e */
    private kc0 f22067e = kc0.f23208d;

    public i44(w81 w81Var) {
        this.f22063a = w81Var;
    }

    /* renamed from: a */
    public final void m23124a(long j11) {
        this.f22065c = j11;
        if (this.f22064b) {
            this.f22066d = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void m23125b() {
        if (!this.f22064b) {
            this.f22066d = SystemClock.elapsedRealtime();
            this.f22064b = true;
        }
    }

    /* renamed from: c */
    public final void m23126c() {
        if (this.f22064b) {
            m23124a(zza());
            this.f22064b = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.j34
    /* renamed from: j */
    public final void mo23127j(kc0 kc0Var) {
        if (this.f22064b) {
            m23124a(zza());
        }
        this.f22067e = kc0Var;
    }

    @Override // com.google.android.gms.internal.ads.j34
    public final long zza() {
        long m23868a;
        long j11 = this.f22065c;
        if (this.f22064b) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f22066d;
            kc0 kc0Var = this.f22067e;
            if (kc0Var.f23210a == 1.0f) {
                m23868a = g92.m22344f0(elapsedRealtime);
            } else {
                m23868a = kc0Var.m23868a(elapsedRealtime);
            }
            return j11 + m23868a;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.j34
    public final kc0 zzc() {
        return this.f22067e;
    }
}
