package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eo */
/* loaded from: classes2.dex */
public final class C4471eo {

    /* renamed from: a */
    private int f19718a;

    /* renamed from: b */
    private long[] f19719b = new long[32];

    public C4471eo(int i11) {
    }

    /* renamed from: a */
    public final int m21765a() {
        return this.f19718a;
    }

    /* renamed from: b */
    public final long m21766b(int i11) {
        if (i11 >= 0 && i11 < this.f19718a) {
            return this.f19719b[i11];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i11 + ", size is " + this.f19718a);
    }

    /* renamed from: c */
    public final void m21767c(long j11) {
        int i11 = this.f19718a;
        long[] jArr = this.f19719b;
        if (i11 == jArr.length) {
            this.f19719b = Arrays.copyOf(jArr, i11 + i11);
        }
        long[] jArr2 = this.f19719b;
        int i12 = this.f19718a;
        this.f19718a = i12 + 1;
        jArr2[i12] = j11;
    }
}
