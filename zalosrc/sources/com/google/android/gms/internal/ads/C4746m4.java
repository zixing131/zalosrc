package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.m4 */
/* loaded from: classes2.dex */
public final class C4746m4 implements InterfaceC5007t4 {

    /* renamed from: a */
    private final C4970s4 f24365a;

    /* renamed from: b */
    private final long f24366b;

    /* renamed from: c */
    private final long f24367c;

    /* renamed from: d */
    private final AbstractC5193y4 f24368d;

    /* renamed from: e */
    private int f24369e;

    /* renamed from: f */
    private long f24370f;

    /* renamed from: g */
    private long f24371g;

    /* renamed from: h */
    private long f24372h;

    /* renamed from: i */
    private long f24373i;

    /* renamed from: j */
    private long f24374j;

    /* renamed from: k */
    private long f24375k;

    /* renamed from: l */
    private long f24376l;

    public C4746m4(AbstractC5193y4 abstractC5193y4, long j11, long j12, long j13, long j14, boolean z11) {
        boolean z12;
        if (j11 >= 0 && j12 > j11) {
            z12 = true;
        } else {
            z12 = false;
        }
        v71.m27173d(z12);
        this.f24368d = abstractC5193y4;
        this.f24366b = j11;
        this.f24367c = j12;
        if (j13 != j12 - j11 && !z11) {
            this.f24369e = 0;
        } else {
            this.f24370f = j14;
            this.f24369e = 4;
        }
        this.f24365a = new C4970s4();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5007t4
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo24457a(km4 km4Var) {
        long j11;
        long m22336b0;
        int i11 = this.f24369e;
        long j12 = -1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return -1L;
                    }
                } else {
                    long j13 = this.f24373i;
                    long j14 = this.f24374j;
                    if (j13 != j14) {
                        long zzf = km4Var.zzf();
                        if (!this.f24365a.m26246c(km4Var, j14)) {
                            m22336b0 = this.f24373i;
                            if (m22336b0 == zzf) {
                                throw new IOException("No ogg page can be found.");
                            }
                        } else {
                            this.f24365a.m26245b(km4Var, false);
                            km4Var.zzj();
                            long j15 = this.f24372h;
                            C4970s4 c4970s4 = this.f24365a;
                            long j16 = c4970s4.f27521b;
                            long j17 = j15 - j16;
                            int i12 = c4970s4.f27523d + c4970s4.f27524e;
                            if (j17 < 0 || j17 >= 72000) {
                                if (j17 < 0) {
                                    this.f24374j = zzf;
                                    this.f24376l = j16;
                                } else {
                                    this.f24373i = km4Var.zzf() + i12;
                                    this.f24375k = j16;
                                }
                                long j18 = this.f24374j;
                                long j19 = this.f24373i;
                                long j21 = j18 - j19;
                                if (j21 < 100000) {
                                    this.f24374j = j19;
                                    m22336b0 = j19;
                                } else {
                                    long j22 = i12;
                                    if (j17 <= 0) {
                                        j11 = 2;
                                    } else {
                                        j11 = 1;
                                    }
                                    long zzf2 = (km4Var.zzf() - (j22 * j11)) + ((j17 * j21) / (this.f24376l - this.f24375k));
                                    j12 = -1;
                                    m22336b0 = g92.m22336b0(zzf2, j19, j18 - 1);
                                }
                            }
                        }
                        if (m22336b0 == j12) {
                            return m22336b0;
                        }
                        this.f24369e = 3;
                    }
                    m22336b0 = -1;
                    if (m22336b0 == j12) {
                    }
                }
                while (true) {
                    this.f24365a.m26246c(km4Var, j12);
                    this.f24365a.m26245b(km4Var, false);
                    C4970s4 c4970s42 = this.f24365a;
                    if (c4970s42.f27521b > this.f24372h) {
                        km4Var.zzj();
                        this.f24369e = 4;
                        return -(this.f24375k + 2);
                    }
                    ((yl4) km4Var).m28248l(c4970s42.f27523d + c4970s42.f27524e, false);
                    this.f24373i = km4Var.zzf();
                    this.f24375k = this.f24365a.f27521b;
                    j12 = -1;
                }
            }
        } else {
            long zzf3 = km4Var.zzf();
            this.f24371g = zzf3;
            this.f24369e = 1;
            long j23 = this.f24367c - 65307;
            if (j23 > zzf3) {
                return j23;
            }
        }
        this.f24365a.m26244a();
        if (this.f24365a.m26246c(km4Var, -1L)) {
            this.f24365a.m26245b(km4Var, false);
            C4970s4 c4970s43 = this.f24365a;
            ((yl4) km4Var).m28248l(c4970s43.f27523d + c4970s43.f27524e, false);
            long j24 = this.f24365a.f27521b;
            while (true) {
                C4970s4 c4970s44 = this.f24365a;
                if ((c4970s44.f27520a & 4) == 4 || !c4970s44.m26246c(km4Var, -1L) || km4Var.zzf() >= this.f24367c || !this.f24365a.m26245b(km4Var, true)) {
                    break;
                }
                C4970s4 c4970s45 = this.f24365a;
                if (!nm4.m24967e(km4Var, c4970s45.f27523d + c4970s45.f27524e)) {
                    break;
                }
                j24 = this.f24365a.f27521b;
            }
            this.f24370f = j24;
            this.f24369e = 4;
            return this.f24371g;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5007t4
    /* renamed from: b */
    public final void mo24458b(long j11) {
        this.f24372h = g92.m22336b0(j11, 0L, (-1) + this.f24370f);
        this.f24369e = 2;
        this.f24373i = this.f24366b;
        this.f24374j = this.f24367c;
        this.f24375k = 0L;
        this.f24376l = this.f24370f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5007t4
    public final /* bridge */ /* synthetic */ InterfaceC4779n zze() {
        if (this.f24370f != 0) {
            return new C4709l4(this, null);
        }
        return null;
    }
}
