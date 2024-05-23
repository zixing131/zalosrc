package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v2 */
/* loaded from: classes2.dex */
final class C5079v2 {

    /* renamed from: d */
    private static final long[] f29127d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f29128a = new byte[8];

    /* renamed from: b */
    private int f29129b;

    /* renamed from: c */
    private int f29130c;

    /* renamed from: b */
    public static int m27123b(int i11) {
        int i12 = 0;
        while (i12 < 8) {
            long j11 = f29127d[i12] & i11;
            i12++;
            if (j11 != 0) {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m27124c(byte[] bArr, int i11, boolean z11) {
        long j11 = bArr[0] & 255;
        if (z11) {
            j11 &= ~f29127d[i11 - 1];
        }
        for (int i12 = 1; i12 < i11; i12++) {
            j11 = (j11 << 8) | (bArr[i12] & 255);
        }
        return j11;
    }

    /* renamed from: a */
    public final int m27125a() {
        return this.f29130c;
    }

    /* renamed from: d */
    public final long m27126d(km4 km4Var, boolean z11, boolean z12, int i11) {
        if (this.f29129b == 0) {
            if (!km4Var.mo23962e(this.f29128a, 0, 1, z11)) {
                return -1L;
            }
            int m27123b = m27123b(this.f29128a[0] & 255);
            this.f29130c = m27123b;
            if (m27123b != -1) {
                this.f29129b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i12 = this.f29130c;
        if (i12 > i11) {
            this.f29129b = 0;
            return -2L;
        }
        if (i12 != 1) {
            ((yl4) km4Var).mo23962e(this.f29128a, 1, i12 - 1, false);
        }
        this.f29129b = 0;
        return m27124c(this.f29128a, this.f29130c, z12);
    }

    /* renamed from: e */
    public final void m27127e() {
        this.f29129b = 0;
        this.f29130c = 0;
    }
}
