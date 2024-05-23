package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class me0 {

    /* renamed from: h */
    public static final g94 f24482h = new g94() { // from class: com.google.android.gms.internal.ads.xn
    };

    /* renamed from: a */
    public final long f24483a;

    /* renamed from: b */
    public final int f24484b;

    /* renamed from: c */
    public final Uri[] f24485c;

    /* renamed from: d */
    public final int[] f24486d;

    /* renamed from: e */
    public final long[] f24487e;

    /* renamed from: f */
    public final long f24488f;

    /* renamed from: g */
    public final boolean f24489g;

    public me0(long j11) {
        this(0L, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    /* renamed from: a */
    public final int m24552a(int i11) {
        int i12;
        int i13 = i11 + 1;
        while (true) {
            int[] iArr = this.f24486d;
            if (i13 >= iArr.length || (i12 = iArr[i13]) == 0 || i12 == 1) {
                break;
            }
            i13++;
        }
        return i13;
    }

    /* renamed from: b */
    public final me0 m24553b(int i11) {
        int[] iArr = this.f24486d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f24487e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new me0(0L, 0, copyOf, (Uri[]) Arrays.copyOf(this.f24485c, 0), copyOf2, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && me0.class == obj.getClass()) {
            me0 me0Var = (me0) obj;
            if (this.f24484b == me0Var.f24484b && Arrays.equals(this.f24485c, me0Var.f24485c) && Arrays.equals(this.f24486d, me0Var.f24486d) && Arrays.equals(this.f24487e, me0Var.f24487e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f24484b * 961) + Arrays.hashCode(this.f24485c)) * 31) + Arrays.hashCode(this.f24486d)) * 31) + Arrays.hashCode(this.f24487e)) * 961;
    }

    private me0(long j11, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j12, boolean z11) {
        v71.m27173d(iArr.length == uriArr.length);
        this.f24483a = 0L;
        this.f24484b = i11;
        this.f24486d = iArr;
        this.f24485c = uriArr;
        this.f24487e = jArr;
        this.f24488f = 0L;
        this.f24489g = false;
    }
}
