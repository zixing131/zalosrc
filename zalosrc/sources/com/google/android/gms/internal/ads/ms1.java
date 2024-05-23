package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ms1 {

    /* renamed from: a */
    private int f24734a;

    /* renamed from: b */
    private long[] f24735b = new long[32];

    public ms1(int i11) {
    }

    /* renamed from: a */
    public final int m24702a() {
        return this.f24734a;
    }

    /* renamed from: b */
    public final long m24703b(int i11) {
        if (i11 >= 0 && i11 < this.f24734a) {
            return this.f24735b[i11];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i11 + ", size is " + this.f24734a);
    }

    /* renamed from: c */
    public final void m24704c(long j11) {
        int i11 = this.f24734a;
        long[] jArr = this.f24735b;
        if (i11 == jArr.length) {
            this.f24735b = Arrays.copyOf(jArr, i11 + i11);
        }
        long[] jArr2 = this.f24735b;
        int i12 = this.f24734a;
        this.f24734a = i12 + 1;
        jArr2[i12] = j11;
    }
}
