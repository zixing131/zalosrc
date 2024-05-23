package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
final class ve4 implements qj2 {

    /* renamed from: a */
    private final qj2 f29287a;

    /* renamed from: b */
    private final int f29288b;

    /* renamed from: c */
    private final ue4 f29289c;

    /* renamed from: d */
    private final byte[] f29290d;

    /* renamed from: e */
    private int f29291e;

    public ve4(qj2 qj2Var, int i11, ue4 ue4Var) {
        boolean z11;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27173d(z11);
        this.f29287a = qj2Var;
        this.f29288b = i11;
        this.f29289c = ue4Var;
        this.f29290d = new byte[1];
        this.f29291e = i11;
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        int i13 = this.f29291e;
        if (i13 == 0) {
            int i14 = 0;
            if (this.f29287a.mo19942a(this.f29290d, 0, 1) != -1) {
                int i15 = (this.f29290d[0] & 255) << 4;
                if (i15 != 0) {
                    byte[] bArr2 = new byte[i15];
                    int i16 = i15;
                    while (i16 > 0) {
                        int mo19942a = this.f29287a.mo19942a(bArr2, i14, i16);
                        if (mo19942a != -1) {
                            i14 += mo19942a;
                            i16 -= mo19942a;
                        }
                    }
                    while (i15 > 0) {
                        int i17 = i15 - 1;
                        if (bArr2[i17] != 0) {
                            break;
                        }
                        i15 = i17;
                    }
                    if (i15 > 0) {
                        this.f29289c.mo20878a(new x02(bArr2, i15));
                    }
                }
                i13 = this.f29288b;
                this.f29291e = i13;
            }
            return -1;
        }
        int mo19942a2 = this.f29287a.mo19942a(bArr, i11, Math.min(i13, i12));
        if (mo19942a2 != -1) {
            this.f29291e -= mo19942a2;
        }
        return mo19942a2;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    public final long mo19943d(wo2 wo2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: g */
    public final void mo20854g(dc3 dc3Var) {
        dc3Var.getClass();
        this.f29287a.mo20854g(dc3Var);
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        return this.f29287a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.qj2, com.google.android.gms.internal.ads.n63
    public final Map zze() {
        return this.f29287a.zze();
    }
}
