package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class le2 extends kd2 {

    /* renamed from: e */
    private final byte[] f23890e;

    /* renamed from: f */
    private Uri f23891f;

    /* renamed from: g */
    private int f23892g;

    /* renamed from: h */
    private int f23893h;

    /* renamed from: i */
    private boolean f23894i;

    public le2(byte[] bArr) {
        super(false);
        bArr.getClass();
        v71.m27173d(bArr.length > 0);
        this.f23890e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.f23893h;
        if (i13 == 0) {
            return -1;
        }
        int min = Math.min(i12, i13);
        System.arraycopy(this.f23890e, this.f23892g, bArr, i11, min);
        this.f23892g += min;
        this.f23893h -= min;
        m23893b(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    public final long mo19943d(wo2 wo2Var) {
        this.f23891f = wo2Var.f30043a;
        m23895l(wo2Var);
        long j11 = wo2Var.f30048f;
        int length = this.f23890e.length;
        if (j11 <= length) {
            int i11 = (int) j11;
            this.f23892g = i11;
            int i12 = length - i11;
            this.f23893h = i12;
            long j12 = wo2Var.f30049g;
            if (j12 != -1) {
                this.f23893h = (int) Math.min(i12, j12);
            }
            this.f23894i = true;
            m23896m(wo2Var);
            long j13 = wo2Var.f30049g;
            if (j13 != -1) {
                return j13;
            }
            return this.f23893h;
        }
        throw new zzey(2008);
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        return this.f23891f;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        if (this.f23894i) {
            this.f23894i = false;
            m23894k();
        }
        this.f23891f = null;
    }
}
