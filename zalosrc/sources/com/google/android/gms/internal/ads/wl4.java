package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class wl4 implements InterfaceC4779n {

    /* renamed from: a */
    public final int f29998a;

    /* renamed from: b */
    public final int[] f29999b;

    /* renamed from: c */
    public final long[] f30000c;

    /* renamed from: d */
    public final long[] f30001d;

    /* renamed from: e */
    public final long[] f30002e;

    /* renamed from: f */
    private final long f30003f;

    public wl4(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f29999b = iArr;
        this.f30000c = jArr;
        this.f30001d = jArr2;
        this.f30002e = jArr3;
        int length = iArr.length;
        this.f29998a = length;
        if (length > 0) {
            int i11 = length - 1;
            this.f30003f = jArr2[i11] + jArr3[i11];
        } else {
            this.f30003f = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        int m22320N = g92.m22320N(this.f30002e, j11, true, true);
        C4816o c4816o = new C4816o(this.f30002e[m22320N], this.f30000c[m22320N]);
        if (c4816o.f25385a < j11 && m22320N != this.f29998a - 1) {
            int i11 = m22320N + 1;
            return new C4704l(c4816o, new C4816o(this.f30002e[i11], this.f30000c[i11]));
        }
        return new C4704l(c4816o, c4816o);
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f29998a + ", sizes=" + Arrays.toString(this.f29999b) + ", offsets=" + Arrays.toString(this.f30000c) + ", timeUs=" + Arrays.toString(this.f30002e) + ", durationsUs=" + Arrays.toString(this.f30001d) + ")";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f30003f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return true;
    }
}
