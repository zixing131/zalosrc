package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class um4 implements InterfaceC4779n {

    /* renamed from: a */
    private final wm4 f28993a;

    /* renamed from: b */
    private final long f28994b;

    public um4(wm4 wm4Var, long j11) {
        this.f28993a = wm4Var;
        this.f28994b = j11;
    }

    /* renamed from: a */
    private final C4816o m27012a(long j11, long j12) {
        return new C4816o((j11 * 1000000) / this.f28993a.f30019e, this.f28994b + j12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        long j12;
        v71.m27171b(this.f28993a.f30025k);
        wm4 wm4Var = this.f28993a;
        vm4 vm4Var = wm4Var.f30025k;
        long[] jArr = vm4Var.f29407a;
        long[] jArr2 = vm4Var.f29408b;
        int m22320N = g92.m22320N(jArr, wm4Var.m27662b(j11), true, false);
        long j13 = 0;
        if (m22320N == -1) {
            j12 = 0;
        } else {
            j12 = jArr[m22320N];
        }
        if (m22320N != -1) {
            j13 = jArr2[m22320N];
        }
        C4816o m27012a = m27012a(j12, j13);
        if (m27012a.f25385a != j11 && m22320N != jArr.length - 1) {
            int i11 = m22320N + 1;
            return new C4704l(m27012a, m27012a(jArr[i11], jArr2[i11]));
        }
        return new C4704l(m27012a, m27012a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f28993a.m27661a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return true;
    }
}
