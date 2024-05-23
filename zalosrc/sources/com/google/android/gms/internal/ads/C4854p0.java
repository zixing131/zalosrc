package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p0 */
/* loaded from: classes2.dex */
final class C4854p0 extends ul4 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4854p0(final wm4 wm4Var, int i11, long j11, long j12) {
        super(r1, r2, r3, 0L, r7, j11, j12, r13, Math.max(6, wm4Var.f30017c));
        long j13;
        rl4 rl4Var = new rl4() { // from class: com.google.android.gms.internal.ads.m0
            @Override // com.google.android.gms.internal.ads.rl4
            /* renamed from: a */
            public final long mo24425a(long j14) {
                return wm4.this.m27662b(j14);
            }
        };
        C4817o0 c4817o0 = new C4817o0(wm4Var, i11, null);
        long m27661a = wm4Var.m27661a();
        long j14 = wm4Var.f30024j;
        int i12 = wm4Var.f30018d;
        if (i12 > 0) {
            j13 = ((i12 + wm4Var.f30017c) / 2) + 1;
        } else {
            int i13 = wm4Var.f30015a;
            long j15 = 4096;
            if (i13 == wm4Var.f30016b && i13 > 0) {
                j15 = i13;
            }
            j13 = (((j15 * wm4Var.f30021g) * wm4Var.f30022h) / 8) + 64;
        }
    }
}
