package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j4 */
/* loaded from: classes2.dex */
final class C4635j4 {

    /* renamed from: a */
    public final C4525g4 f22619a;

    /* renamed from: b */
    public final int f22620b;

    /* renamed from: c */
    public final long[] f22621c;

    /* renamed from: d */
    public final int[] f22622d;

    /* renamed from: e */
    public final int f22623e;

    /* renamed from: f */
    public final long[] f22624f;

    /* renamed from: g */
    public final int[] f22625g;

    /* renamed from: h */
    public final long f22626h;

    public C4635j4(C4525g4 c4525g4, long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2, long j11) {
        boolean z11;
        boolean z12;
        int length = iArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27173d(z11);
        int length3 = jArr.length;
        if (length3 == length2) {
            z12 = true;
        } else {
            z12 = false;
        }
        v71.m27173d(z12);
        int length4 = iArr2.length;
        v71.m27173d(length4 == length2);
        this.f22619a = c4525g4;
        this.f22621c = jArr;
        this.f22622d = iArr;
        this.f22623e = i11;
        this.f22624f = jArr2;
        this.f22625g = iArr2;
        this.f22626h = j11;
        this.f22620b = length3;
        if (length4 > 0) {
            int i12 = length4 - 1;
            iArr2[i12] = iArr2[i12] | 536870912;
        }
    }

    /* renamed from: a */
    public final int m23513a(long j11) {
        for (int m22320N = g92.m22320N(this.f22624f, j11, true, false); m22320N >= 0; m22320N--) {
            if ((this.f22625g[m22320N] & 1) != 0) {
                return m22320N;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int m23514b(long j11) {
        for (int m22318L = g92.m22318L(this.f22624f, j11, true, false); m22318L < this.f22624f.length; m22318L++) {
            if ((this.f22625g[m22318L] & 1) != 0) {
                return m22318L;
            }
        }
        return -1;
    }
}
