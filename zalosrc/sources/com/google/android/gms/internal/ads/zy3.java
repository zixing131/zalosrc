package com.google.android.gms.internal.ads;

import s00.AbstractC26080o;

/* loaded from: classes2.dex */
public final class zy3 implements i34 {

    /* renamed from: a */
    private final jj4 f31722a;

    /* renamed from: b */
    private final long f31723b;

    /* renamed from: c */
    private final long f31724c;

    /* renamed from: d */
    private final long f31725d;

    /* renamed from: e */
    private final long f31726e;

    /* renamed from: f */
    private final long f31727f;

    /* renamed from: g */
    private int f31728g;

    /* renamed from: h */
    private boolean f31729h;

    public zy3() {
        jj4 jj4Var = new jj4(true, 65536);
        m28669d(2500, 0, "bufferForPlaybackMs", "0");
        m28669d(AbstractC26080o.a.f124275b, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m28669d(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m28669d(50000, AbstractC26080o.a.f124275b, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m28669d(50000, 50000, "maxBufferMs", "minBufferMs");
        m28669d(0, 0, "backBufferDurationMs", "0");
        this.f31722a = jj4Var;
        this.f31723b = g92.m22344f0(50000L);
        this.f31724c = g92.m22344f0(50000L);
        this.f31725d = g92.m22344f0(2500L);
        this.f31726e = g92.m22344f0(5000L);
        this.f31728g = 13107200;
        this.f31727f = g92.m22344f0(0L);
    }

    /* renamed from: d */
    private static void m28669d(int i11, int i12, String str, String str2) {
        boolean z11;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27174e(z11, str + " cannot be less than " + str2);
    }

    /* renamed from: e */
    private final void m28670e(boolean z11) {
        this.f31728g = 13107200;
        this.f31729h = false;
        if (z11) {
            this.f31722a.m23627e();
        }
    }

    @Override // com.google.android.gms.internal.ads.i34
    /* renamed from: a */
    public final boolean mo23119a(long j11, float f11, boolean z11, long j12) {
        long j13;
        long m22342e0 = g92.m22342e0(j11, f11);
        if (z11) {
            j13 = this.f31726e;
        } else {
            j13 = this.f31725d;
        }
        if (j12 != -9223372036854775807L) {
            j13 = Math.min(j12 / 2, j13);
        }
        if (j13 > 0 && m22342e0 < j13 && this.f31722a.m23623a() < this.f31728g) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.i34
    /* renamed from: b */
    public final boolean mo23120b(long j11, long j12, float f11) {
        int m23623a = this.f31722a.m23623a();
        int i11 = this.f31728g;
        long j13 = this.f31723b;
        if (f11 > 1.0f) {
            j13 = Math.min(g92.m22338c0(j13, f11), this.f31724c);
        }
        boolean z11 = false;
        if (j12 < Math.max(j13, 500000L)) {
            if (m23623a < i11) {
                z11 = true;
            }
            this.f31729h = z11;
            if (!z11 && j12 < 500000) {
                lr1.m24356e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j12 >= this.f31724c || m23623a >= i11) {
            this.f31729h = false;
        }
        return this.f31729h;
    }

    @Override // com.google.android.gms.internal.ads.i34
    /* renamed from: c */
    public final void mo23121c(c44[] c44VarArr, dh4 dh4Var, ui4[] ui4VarArr) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int length = c44VarArr.length;
            int i13 = 13107200;
            if (i11 < 2) {
                if (ui4VarArr[i11] != null) {
                    if (c44VarArr[i11].zzb() != 1) {
                        i13 = 131072000;
                    }
                    i12 += i13;
                }
                i11++;
            } else {
                int max = Math.max(13107200, i12);
                this.f31728g = max;
                this.f31722a.m23628f(max);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final long zza() {
        return this.f31727f;
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final void zzb() {
        m28670e(false);
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final void zzc() {
        m28670e(true);
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final void zzd() {
        m28670e(true);
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final jj4 zzi() {
        return this.f31722a;
    }
}
