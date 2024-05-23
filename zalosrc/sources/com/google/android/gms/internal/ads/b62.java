package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b62 {

    /* renamed from: a */
    private long[] f17626a = new long[10];

    /* renamed from: b */
    private Object[] f17627b = new Object[10];

    /* renamed from: c */
    private int f17628c;

    /* renamed from: d */
    private int f17629d;

    public b62(int i11) {
    }

    /* renamed from: f */
    private final Object m20407f() {
        boolean z11;
        if (this.f17629d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        Object[] objArr = this.f17627b;
        int i11 = this.f17628c;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f17628c = (i11 + 1) % objArr.length;
        this.f17629d--;
        return obj;
    }

    /* renamed from: a */
    public final synchronized int m20408a() {
        return this.f17629d;
    }

    /* renamed from: b */
    public final synchronized Object m20409b() {
        if (this.f17629d == 0) {
            return null;
        }
        return m20407f();
    }

    /* renamed from: c */
    public final synchronized Object m20410c(long j11) {
        Object obj;
        obj = null;
        while (this.f17629d > 0 && j11 - this.f17626a[this.f17628c] >= 0) {
            obj = m20407f();
        }
        return obj;
    }

    /* renamed from: d */
    public final synchronized void m20411d(long j11, Object obj) {
        try {
            if (this.f17629d > 0) {
                if (j11 <= this.f17626a[((this.f17628c + r0) - 1) % this.f17627b.length]) {
                    m20412e();
                }
            }
            int length = this.f17627b.length;
            if (this.f17629d >= length) {
                int i11 = length + length;
                long[] jArr = new long[i11];
                Object[] objArr = new Object[i11];
                int i12 = this.f17628c;
                int i13 = length - i12;
                System.arraycopy(this.f17626a, i12, jArr, 0, i13);
                System.arraycopy(this.f17627b, this.f17628c, objArr, 0, i13);
                int i14 = this.f17628c;
                if (i14 > 0) {
                    System.arraycopy(this.f17626a, 0, jArr, i13, i14);
                    System.arraycopy(this.f17627b, 0, objArr, i13, this.f17628c);
                }
                this.f17626a = jArr;
                this.f17627b = objArr;
                this.f17628c = 0;
            }
            int i15 = this.f17628c;
            int i16 = this.f17629d;
            Object[] objArr2 = this.f17627b;
            int length2 = (i15 + i16) % objArr2.length;
            this.f17626a[length2] = j11;
            objArr2[length2] = obj;
            this.f17629d = i16 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: e */
    public final synchronized void m20412e() {
        this.f17628c = 0;
        this.f17629d = 0;
        Arrays.fill(this.f17627b, (Object) null);
    }
}
