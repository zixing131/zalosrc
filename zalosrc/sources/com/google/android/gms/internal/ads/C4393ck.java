package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ck */
/* loaded from: classes2.dex */
final class C4393ck {

    /* renamed from: a */
    private final C4655jo f18455a = new C4655jo(8);

    /* renamed from: b */
    private int f18456b;

    /* renamed from: b */
    private final long m20911b(C4577hj c4577hj) {
        int i11 = 0;
        c4577hj.m22920g(this.f18455a.f22891a, 0, 1, false);
        int i12 = this.f18455a.f22891a[0] & 255;
        if (i12 != 0) {
            int i13 = 128;
            int i14 = 0;
            while ((i12 & i13) == 0) {
                i13 >>= 1;
                i14++;
            }
            int i15 = i12 & (~i13);
            c4577hj.m22920g(this.f18455a.f22891a, 1, i14, false);
            while (i11 < i14) {
                i11++;
                i15 = (this.f18455a.f22891a[i11] & 255) + (i15 << 8);
            }
            this.f18456b += i14 + 1;
            return i15;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: a */
    public final boolean m20912a(C4577hj c4577hj) {
        long m22916c = c4577hj.m22916c();
        long j11 = 1024;
        if (m22916c != -1 && m22916c <= 1024) {
            j11 = m22916c;
        }
        int i11 = (int) j11;
        c4577hj.m22920g(this.f18455a.f22891a, 0, 4, false);
        long m23677m = this.f18455a.m23677m();
        this.f18456b = 4;
        while (m23677m != 440786851) {
            int i12 = this.f18456b + 1;
            this.f18456b = i12;
            if (i12 == i11) {
                return false;
            }
            c4577hj.m22920g(this.f18455a.f22891a, 0, 1, false);
            m23677m = ((m23677m << 8) & (-256)) | (this.f18455a.f22891a[0] & 255);
        }
        long m20911b = m20911b(c4577hj);
        long j12 = this.f18456b;
        if (m20911b != Long.MIN_VALUE && (m22916c == -1 || j12 + m20911b < m22916c)) {
            while (true) {
                long j13 = this.f18456b;
                long j14 = j12 + m20911b;
                if (j13 < j14) {
                    if (m20911b(c4577hj) == Long.MIN_VALUE) {
                        return false;
                    }
                    long m20911b2 = m20911b(c4577hj);
                    if (m20911b2 < 0) {
                        return false;
                    }
                    if (m20911b2 != 0) {
                        c4577hj.m22919f((int) m20911b2, false);
                        this.f18456b = (int) (this.f18456b + m20911b2);
                    }
                } else if (j13 == j14) {
                    return true;
                }
            }
        }
        return false;
    }
}
