package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class ck4 {

    /* renamed from: a */
    private long f18461a;

    /* renamed from: b */
    private long f18462b;

    /* renamed from: c */
    private long f18463c;

    /* renamed from: d */
    private long f18464d;

    /* renamed from: e */
    private long f18465e;

    /* renamed from: f */
    private long f18466f;

    /* renamed from: g */
    private final boolean[] f18467g = new boolean[15];

    /* renamed from: h */
    private int f18468h;

    /* renamed from: a */
    public final long m20918a() {
        long j11 = this.f18465e;
        if (j11 == 0) {
            return 0L;
        }
        return this.f18466f / j11;
    }

    /* renamed from: b */
    public final long m20919b() {
        return this.f18466f;
    }

    /* renamed from: c */
    public final void m20920c(long j11) {
        long j12 = this.f18464d;
        if (j12 == 0) {
            this.f18461a = j11;
        } else if (j12 == 1) {
            long j13 = j11 - this.f18461a;
            this.f18462b = j13;
            this.f18466f = j13;
            this.f18465e = 1L;
        } else {
            long j14 = j11 - this.f18463c;
            int i11 = (int) (j12 % 15);
            if (Math.abs(j14 - this.f18462b) <= 1000000) {
                this.f18465e++;
                this.f18466f += j14;
                boolean[] zArr = this.f18467g;
                if (zArr[i11]) {
                    zArr[i11] = false;
                    this.f18468h--;
                }
            } else {
                boolean[] zArr2 = this.f18467g;
                if (!zArr2[i11]) {
                    zArr2[i11] = true;
                    this.f18468h++;
                }
            }
        }
        this.f18464d++;
        this.f18463c = j11;
    }

    /* renamed from: d */
    public final void m20921d() {
        this.f18464d = 0L;
        this.f18465e = 0L;
        this.f18466f = 0L;
        this.f18468h = 0;
        Arrays.fill(this.f18467g, false);
    }

    /* renamed from: e */
    public final boolean m20922e() {
        long j11 = this.f18464d;
        if (j11 == 0) {
            return false;
        }
        return this.f18467g[(int) ((j11 - 1) % 15)];
    }

    /* renamed from: f */
    public final boolean m20923f() {
        return this.f18464d > 15 && this.f18468h == 0;
    }
}
