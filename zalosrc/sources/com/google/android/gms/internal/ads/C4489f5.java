package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.f5 */
/* loaded from: classes2.dex */
public final class C4489f5 implements jm4 {

    /* renamed from: d */
    public static final qm4 f20011d = new qm4() { // from class: com.google.android.gms.internal.ads.e5
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C4489f5()};
        }
    };

    /* renamed from: a */
    private final C4526g5 f20012a = new C4526g5(null);

    /* renamed from: b */
    private final x02 f20013b = new x02(16384);

    /* renamed from: c */
    private boolean f20014c;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:            r16.zzj();        r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:            if ((r5 - r3) >= 8192) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:            return false;     */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo19968a(km4 km4Var) {
        int i11;
        x02 x02Var = new x02(10);
        int i12 = 0;
        while (true) {
            yl4 yl4Var = (yl4) km4Var;
            yl4Var.mo23963f(x02Var.m27777h(), 0, 10, false);
            x02Var.m27775f(0);
            if (x02Var.m27790u() != 4801587) {
                break;
            }
            x02Var.m27776g(3);
            int m27787r = x02Var.m27787r();
            i12 += m27787r + 10;
            yl4Var.m28247k(m27787r, false);
        }
        km4Var.zzj();
        yl4 yl4Var2 = (yl4) km4Var;
        yl4Var2.m28247k(i12, false);
        int i13 = i12;
        while (true) {
            int i14 = 0;
            while (true) {
                int i15 = 7;
                yl4Var2.mo23963f(x02Var.m27777h(), 0, 7, false);
                x02Var.m27775f(0);
                int m27792w = x02Var.m27792w();
                if (m27792w != 44096 && m27792w != 44097) {
                    break;
                }
                i14++;
                if (i14 >= 4) {
                    return true;
                }
                byte[] m27777h = x02Var.m27777h();
                int i16 = ml4.f24648b;
                if (m27777h.length < 7) {
                    i11 = -1;
                } else {
                    int i17 = ((m27777h[2] & 255) << 8) | (m27777h[3] & 255);
                    if (i17 == 65535) {
                        i17 = ((m27777h[4] & 255) << 16) | ((m27777h[5] & 255) << 8) | (m27777h[6] & 255);
                    } else {
                        i15 = 4;
                    }
                    if (m27792w == 44097) {
                        i15 += 2;
                    }
                    i11 = i17 + i15;
                }
                if (i11 == -1) {
                    return false;
                }
                yl4Var2.m28247k(i11 - 7, false);
            }
            yl4Var2.m28247k(i13, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f20012a.mo20010b(mm4Var, new C4344b7(Integer.MIN_VALUE, 0, 1));
        mm4Var.zzC();
        mm4Var.mo21603f(new C4741m(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        this.f20014c = false;
        this.f20012a.zze();
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        int mo19942a = km4Var.mo19942a(this.f20013b.m27777h(), 0, 16384);
        if (mo19942a == -1) {
            return -1;
        }
        this.f20013b.m27775f(0);
        this.f20013b.m27774e(mo19942a);
        if (!this.f20014c) {
            this.f20012a.mo20011c(0L, 4);
            this.f20014c = true;
        }
        this.f20012a.mo20009a(this.f20013b);
        return 0;
    }
}
