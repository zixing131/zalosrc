package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class ng4 implements dj4 {

    /* renamed from: a */
    public long f25178a;

    /* renamed from: b */
    public long f25179b;

    /* renamed from: c */
    public cj4 f25180c;

    /* renamed from: d */
    public ng4 f25181d;

    public ng4(long j11, int i11) {
        m24924c(j11, 65536);
    }

    /* renamed from: a */
    public final int m24922a(long j11) {
        long j12 = this.f25178a;
        int i11 = this.f25180c.f18454b;
        return (int) (j11 - j12);
    }

    /* renamed from: b */
    public final ng4 m24923b() {
        this.f25180c = null;
        ng4 ng4Var = this.f25181d;
        this.f25181d = null;
        return ng4Var;
    }

    /* renamed from: c */
    public final void m24924c(long j11, int i11) {
        boolean z11;
        if (this.f25180c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        this.f25178a = j11;
        this.f25179b = j11 + 65536;
    }

    @Override // com.google.android.gms.internal.ads.dj4
    public final cj4 zzc() {
        cj4 cj4Var = this.f25180c;
        cj4Var.getClass();
        return cj4Var;
    }

    @Override // com.google.android.gms.internal.ads.dj4
    public final dj4 zzd() {
        ng4 ng4Var = this.f25181d;
        if (ng4Var == null || ng4Var.f25180c == null) {
            return null;
        }
        return ng4Var;
    }
}
