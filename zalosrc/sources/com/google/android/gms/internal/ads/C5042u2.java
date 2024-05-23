package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u2 */
/* loaded from: classes2.dex */
final class C5042u2 {

    /* renamed from: a */
    private final x02 f28707a = new x02(8);

    /* renamed from: b */
    private int f28708b;

    /* renamed from: b */
    private final long m26826b(km4 km4Var) {
        yl4 yl4Var = (yl4) km4Var;
        int i11 = 0;
        yl4Var.mo23963f(this.f28707a.m27777h(), 0, 1, false);
        int i12 = this.f28707a.m27777h()[0] & 255;
        if (i12 != 0) {
            int i13 = 128;
            int i14 = 0;
            while ((i12 & i13) == 0) {
                i13 >>= 1;
                i14++;
            }
            int i15 = i12 & (~i13);
            yl4Var.mo23963f(this.f28707a.m27777h(), 1, i14, false);
            while (i11 < i14) {
                i11++;
                i15 = (this.f28707a.m27777h()[i11] & 255) + (i15 << 8);
            }
            this.f28708b += i14 + 1;
            return i15;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: a */
    public final boolean m26827a(km4 km4Var) {
        long zzd = km4Var.zzd();
        long j11 = 1024;
        if (zzd != -1 && zzd <= 1024) {
            j11 = zzd;
        }
        int i11 = (int) j11;
        yl4 yl4Var = (yl4) km4Var;
        yl4Var.mo23963f(this.f28707a.m27777h(), 0, 4, false);
        long m27762A = this.f28707a.m27762A();
        this.f28708b = 4;
        while (m27762A != 440786851) {
            int i12 = this.f28708b + 1;
            this.f28708b = i12;
            if (i12 == i11) {
                return false;
            }
            yl4Var.mo23963f(this.f28707a.m27777h(), 0, 1, false);
            m27762A = ((m27762A << 8) & (-256)) | (this.f28707a.m27777h()[0] & 255);
        }
        long m26826b = m26826b(km4Var);
        long j12 = this.f28708b;
        if (m26826b != Long.MIN_VALUE && (zzd == -1 || j12 + m26826b < zzd)) {
            while (true) {
                long j13 = this.f28708b;
                long j14 = j12 + m26826b;
                if (j13 < j14) {
                    if (m26826b(km4Var) == Long.MIN_VALUE) {
                        return false;
                    }
                    long m26826b2 = m26826b(km4Var);
                    if (m26826b2 < 0) {
                        return false;
                    }
                    if (m26826b2 != 0) {
                        int i13 = (int) m26826b2;
                        yl4Var.m28247k(i13, false);
                        this.f28708b += i13;
                    }
                } else if (j13 == j14) {
                    return true;
                }
            }
        }
        return false;
    }
}
