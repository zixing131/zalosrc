package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.x2 */
/* loaded from: classes2.dex */
final class C5154x2 implements InterfaceC4376c3 {

    /* renamed from: a */
    private final long[] f30302a;

    /* renamed from: b */
    private final long[] f30303b;

    /* renamed from: c */
    private final long f30304c;

    private C5154x2(long[] jArr, long[] jArr2, long j11) {
        this.f30302a = jArr;
        this.f30303b = jArr2;
        this.f30304c = j11 == -9223372036854775807L ? g92.m22344f0(jArr2[jArr2.length - 1]) : j11;
    }

    /* renamed from: a */
    public static C5154x2 m27810a(long j11, zzadh zzadhVar, long j12) {
        int length = zzadhVar.f31793t.length;
        int i11 = length + 1;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        jArr[0] = j11;
        long j13 = 0;
        jArr2[0] = 0;
        for (int i12 = 1; i12 <= length; i12++) {
            int i13 = i12 - 1;
            j11 += zzadhVar.f31791r + zzadhVar.f31793t[i13];
            j13 += zzadhVar.f31792s + zzadhVar.f31794u[i13];
            jArr[i12] = j11;
            jArr2[i12] = j13;
        }
        return new C5154x2(jArr, jArr2, j12);
    }

    /* renamed from: c */
    private static Pair m27811c(long j11, long[] jArr, long[] jArr2) {
        double d11;
        int m22320N = g92.m22320N(jArr, j11, true, true);
        long j12 = jArr[m22320N];
        long j13 = jArr2[m22320N];
        int i11 = m22320N + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j12), Long.valueOf(j13));
        }
        long j14 = jArr[i11];
        long j15 = jArr2[i11];
        if (j14 == j12) {
            d11 = 0.0d;
        } else {
            d11 = (j11 - j12) / (j14 - j12);
        }
        return Pair.create(Long.valueOf(j11), Long.valueOf(((long) (d11 * (j15 - j13))) + j13));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        Pair m27811c = m27811c(g92.m22352j0(g92.m22336b0(j11, 0L, this.f30304c)), this.f30303b, this.f30302a);
        long longValue = ((Long) m27811c.first).longValue();
        C4816o c4816o = new C4816o(g92.m22344f0(longValue), ((Long) m27811c.second).longValue());
        return new C4704l(c4816o, c4816o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376c3
    /* renamed from: d */
    public final long mo20373d(long j11) {
        return g92.m22344f0(((Long) m27811c(j11, this.f30302a, this.f30303b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376c3
    public final long zzb() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f30304c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return true;
    }
}
