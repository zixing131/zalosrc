package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.j7 */
/* loaded from: classes2.dex */
public final class C4638j7 implements jm4 {

    /* renamed from: h */
    public static final qm4 f22697h = new qm4() { // from class: com.google.android.gms.internal.ads.f7
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C4638j7()};
        }
    };

    /* renamed from: a */
    private mm4 f22698a;

    /* renamed from: b */
    private InterfaceC4928r f22699b;

    /* renamed from: e */
    private InterfaceC4565h7 f22702e;

    /* renamed from: c */
    private int f22700c = 0;

    /* renamed from: d */
    private long f22701d = -1;

    /* renamed from: f */
    private int f22703f = -1;

    /* renamed from: g */
    private long f22704g = -1;

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        return AbstractC4749m7.m24480c(km4Var);
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f22698a = mm4Var;
        this.f22699b = mm4Var.mo21604i(0, 1);
        mm4Var.zzC();
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        int i11;
        if (j11 == 0) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        this.f22700c = i11;
        InterfaceC4565h7 interfaceC4565h7 = this.f22702e;
        if (interfaceC4565h7 != null) {
            interfaceC4565h7.mo22288a(j12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:            if (r1 != 65534) goto L43;     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        boolean z11;
        int m22330X;
        v71.m27171b(this.f22699b);
        int i11 = g92.f20474a;
        int i12 = this.f22700c;
        boolean z12 = true;
        if (i12 != 0) {
            long j11 = -1;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (this.f22704g == -1) {
                            z12 = false;
                        }
                        v71.m27175f(z12);
                        long zzf = this.f22704g - km4Var.zzf();
                        InterfaceC4565h7 interfaceC4565h7 = this.f22702e;
                        interfaceC4565h7.getClass();
                        if (interfaceC4565h7.mo22289b(km4Var, zzf)) {
                            return -1;
                        }
                        return 0;
                    }
                    Pair m24478a = AbstractC4749m7.m24478a(km4Var);
                    this.f22703f = ((Long) m24478a.first).intValue();
                    long longValue = ((Long) m24478a.second).longValue();
                    long j12 = this.f22701d;
                    if (j12 != -1 && longValue == 4294967295L) {
                        longValue = j12;
                    }
                    long j13 = this.f22703f + longValue;
                    this.f22704g = j13;
                    long zzd = km4Var.zzd();
                    if (zzd != -1 && j13 > zzd) {
                        lr1.m24356e("WavExtractor", "Data exceeds input length: " + j13 + ", " + zzd);
                        this.f22704g = zzd;
                        j13 = zzd;
                    }
                    InterfaceC4565h7 interfaceC4565h72 = this.f22702e;
                    interfaceC4565h72.getClass();
                    interfaceC4565h72.zza(this.f22703f, j13);
                    this.f22700c = 4;
                    return 0;
                }
                C4675k7 m24479b = AbstractC4749m7.m24479b(km4Var);
                int i13 = m24479b.f23169a;
                if (i13 == 17) {
                    this.f22702e = new C4528g7(this.f22698a, this.f22699b, m24479b);
                } else if (i13 == 6) {
                    this.f22702e = new C4602i7(this.f22698a, this.f22699b, m24479b, "audio/g711-alaw", -1);
                } else if (i13 == 7) {
                    this.f22702e = new C4602i7(this.f22698a, this.f22699b, m24479b, "audio/g711-mlaw", -1);
                } else {
                    int i14 = m24479b.f23173e;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            if (i14 == 32) {
                                m22330X = 4;
                                if (m22330X != 0) {
                                    this.f22702e = new C4602i7(this.f22698a, this.f22699b, m24479b, "audio/raw", m22330X);
                                } else {
                                    throw zzbu.m28713c("Unsupported WAV format type: " + i13);
                                }
                            }
                        }
                        m22330X = 0;
                        if (m22330X != 0) {
                        }
                    }
                    m22330X = g92.m22330X(i14);
                    if (m22330X != 0) {
                    }
                }
                this.f22700c = 3;
                return 0;
            }
            x02 x02Var = new x02(8);
            C4712l7 m24136a = C4712l7.m24136a(km4Var, x02Var);
            if (m24136a.f23766a != 1685272116) {
                km4Var.zzj();
            } else {
                yl4 yl4Var = (yl4) km4Var;
                yl4Var.m28247k(8, false);
                x02Var.m27775f(0);
                yl4Var.mo23963f(x02Var.m27777h(), 0, 8, false);
                j11 = x02Var.m27793x();
                yl4Var.m28248l(((int) m24136a.f23767b) + 8, false);
            }
            this.f22701d = j11;
            this.f22700c = 2;
            return 0;
        }
        if (km4Var.zzf() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        int i15 = this.f22703f;
        if (i15 != -1) {
            ((yl4) km4Var).m28248l(i15, false);
            this.f22700c = 4;
        } else if (AbstractC4749m7.m24480c(km4Var)) {
            ((yl4) km4Var).m28248l((int) (km4Var.zze() - km4Var.zzf()), false);
            this.f22700c = 1;
        } else {
            throw zzbu.m28711a("Unsupported or unrecognized wav file type.", null);
        }
        return 0;
    }
}
