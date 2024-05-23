package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class ha3 extends ia3 {
    /* renamed from: a */
    public static int m22772a(long j11) {
        int i11 = (int) j11;
        if (i11 == j11) {
            return i11;
        }
        throw new IllegalArgumentException(z53.m28436b("Out of range: %s", Long.valueOf(j11)));
    }

    /* renamed from: b */
    public static int m22773b(int i11, int i12, int i13) {
        return Math.min(Math.max(i11, i12), 1073741823);
    }

    /* renamed from: c */
    public static int m22774c(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j11 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j11;
    }
}
