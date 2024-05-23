package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c */
/* loaded from: classes2.dex */
public final class C4372c implements InterfaceC4779n {

    /* renamed from: a */
    private final long[] f18059a;

    /* renamed from: b */
    private final long[] f18060b;

    /* renamed from: c */
    private final long f18061c;

    /* renamed from: d */
    private final boolean f18062d;

    public C4372c(long[] jArr, long[] jArr2, long j11) {
        boolean z11;
        boolean z12;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27173d(z11);
        if (length2 > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f18062d = z12;
        if (z12 && jArr2[0] > 0) {
            int i11 = length2 + 1;
            long[] jArr3 = new long[i11];
            this.f18059a = jArr3;
            long[] jArr4 = new long[i11];
            this.f18060b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        } else {
            this.f18059a = jArr;
            this.f18060b = jArr2;
        }
        this.f18061c = j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        if (!this.f18062d) {
            C4816o c4816o = C4816o.f25384c;
            return new C4704l(c4816o, c4816o);
        }
        int m22320N = g92.m22320N(this.f18060b, j11, true, true);
        C4816o c4816o2 = new C4816o(this.f18060b[m22320N], this.f18059a[m22320N]);
        if (c4816o2.f25385a != j11) {
            long[] jArr = this.f18060b;
            if (m22320N != jArr.length - 1) {
                int i11 = m22320N + 1;
                return new C4704l(c4816o2, new C4816o(jArr[i11], this.f18059a[i11]));
            }
        }
        return new C4704l(c4816o2, c4816o2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f18061c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return this.f18062d;
    }
}
