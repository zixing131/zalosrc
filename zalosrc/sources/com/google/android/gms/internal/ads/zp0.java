package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
final class zp0 implements qj2 {

    /* renamed from: a */
    private final qj2 f31660a;

    /* renamed from: b */
    private final long f31661b;

    /* renamed from: c */
    private final qj2 f31662c;

    /* renamed from: d */
    private long f31663d;

    /* renamed from: e */
    private Uri f31664e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zp0(qj2 qj2Var, int i11, qj2 qj2Var2) {
        this.f31660a = qj2Var;
        this.f31661b = i11;
        this.f31662c = qj2Var2;
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        int i13;
        long j11 = this.f31663d;
        long j12 = this.f31661b;
        if (j11 < j12) {
            int mo19942a = this.f31660a.mo19942a(bArr, i11, (int) Math.min(i12, j12 - j11));
            long j13 = this.f31663d + mo19942a;
            this.f31663d = j13;
            i13 = mo19942a;
            j11 = j13;
        } else {
            i13 = 0;
        }
        if (j11 >= this.f31661b) {
            int mo19942a2 = this.f31662c.mo19942a(bArr, i11 + i13, i12 - i13);
            this.f31663d += mo19942a2;
            return i13 + mo19942a2;
        }
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    public final long mo19943d(wo2 wo2Var) {
        long j11;
        wo2 wo2Var2;
        long j12;
        long j13;
        this.f31664e = wo2Var.f30043a;
        long j14 = wo2Var.f30048f;
        long j15 = this.f31661b;
        wo2 wo2Var3 = null;
        if (j14 >= j15) {
            wo2Var2 = null;
        } else {
            long j16 = wo2Var.f30049g;
            if (j16 != -1) {
                j11 = Math.min(j16, j15 - j14);
            } else {
                j11 = j15 - j14;
            }
            wo2Var2 = new wo2(wo2Var.f30043a, null, j14, j14, j11, null, 0);
        }
        long j17 = wo2Var.f30049g;
        if (j17 == -1 || wo2Var.f30048f + j17 > this.f31661b) {
            long max = Math.max(this.f31661b, wo2Var.f30048f);
            long j18 = wo2Var.f30049g;
            if (j18 != -1) {
                j12 = Math.min(j18, (wo2Var.f30048f + j18) - this.f31661b);
            } else {
                j12 = -1;
            }
            wo2Var3 = new wo2(wo2Var.f30043a, null, max, max, j12, null, 0);
        }
        long j19 = 0;
        if (wo2Var2 != null) {
            j13 = this.f31660a.mo19943d(wo2Var2);
        } else {
            j13 = 0;
        }
        if (wo2Var3 != null) {
            j19 = this.f31662c.mo19943d(wo2Var3);
        }
        this.f31663d = wo2Var.f30048f;
        if (j13 == -1 || j19 == -1) {
            return -1L;
        }
        return j13 + j19;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: g */
    public final void mo20854g(dc3 dc3Var) {
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        return this.f31664e;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        this.f31660a.zzd();
        this.f31662c.zzd();
    }

    @Override // com.google.android.gms.internal.ads.qj2, com.google.android.gms.internal.ads.n63
    public final Map zze() {
        return f83.m21967d();
    }
}
