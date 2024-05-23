package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dk */
/* loaded from: classes2.dex */
final class C4430dk {

    /* renamed from: d */
    private static final long[] f19279d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f19280a = new byte[8];

    /* renamed from: b */
    private int f19281b;

    /* renamed from: c */
    private int f19282c;

    /* renamed from: b */
    public static int m21427b(int i11) {
        int i12 = 0;
        while (i12 < 8) {
            long j11 = f19279d[i12] & i11;
            i12++;
            if (j11 != 0) {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m21428c(byte[] bArr, int i11, boolean z11) {
        long j11 = bArr[0] & 255;
        if (z11) {
            j11 &= ~f19279d[i11 - 1];
        }
        for (int i12 = 1; i12 < i11; i12++) {
            j11 = (j11 << 8) | (bArr[i12] & 255);
        }
        return j11;
    }

    /* renamed from: a */
    public final int m21429a() {
        return this.f19282c;
    }

    /* renamed from: d */
    public final void m21430d() {
        this.f19281b = 0;
        this.f19282c = 0;
    }

    /* renamed from: e */
    public final long m21431e(C4577hj c4577hj, boolean z11, boolean z12, int i11) {
        if (this.f19281b == 0) {
            if (!c4577hj.m22921h(this.f19280a, 0, 1, z11)) {
                return -1L;
            }
            int m21427b = m21427b(this.f19280a[0] & 255);
            this.f19282c = m21427b;
            if (m21427b != -1) {
                this.f19281b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i12 = this.f19282c;
        if (i12 > i11) {
            this.f19281b = 0;
            return -2L;
        }
        if (i12 != 1) {
            c4577hj.m22921h(this.f19280a, 1, i12 - 1, false);
        }
        this.f19281b = 0;
        return m21428c(this.f19280a, this.f19282c, z12);
    }
}
