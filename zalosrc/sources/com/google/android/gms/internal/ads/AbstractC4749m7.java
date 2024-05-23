package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.m7 */
/* loaded from: classes2.dex */
abstract class AbstractC4749m7 {
    /* renamed from: a */
    public static Pair m24478a(km4 km4Var) {
        km4Var.zzj();
        C4712l7 m24481d = m24481d(1684108385, km4Var, new x02(8));
        ((yl4) km4Var).m28248l(8, false);
        return Pair.create(Long.valueOf(km4Var.zzf()), Long.valueOf(m24481d.f23767b));
    }

    /* renamed from: b */
    public static C4675k7 m24479b(km4 km4Var) {
        boolean z11;
        byte[] bArr;
        x02 x02Var = new x02(16);
        C4712l7 m24481d = m24481d(1718449184, km4Var, x02Var);
        if (m24481d.f23767b >= 16) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        yl4 yl4Var = (yl4) km4Var;
        yl4Var.mo23963f(x02Var.m27777h(), 0, 16, false);
        x02Var.m27775f(0);
        int m27786q = x02Var.m27786q();
        int m27786q2 = x02Var.m27786q();
        int m27785p = x02Var.m27785p();
        int m27785p2 = x02Var.m27785p();
        int m27786q3 = x02Var.m27786q();
        int m27786q4 = x02Var.m27786q();
        int i11 = ((int) m24481d.f23767b) - 16;
        if (i11 > 0) {
            bArr = new byte[i11];
            yl4Var.mo23963f(bArr, 0, i11, false);
        } else {
            bArr = g92.f20479f;
        }
        byte[] bArr2 = bArr;
        ((yl4) km4Var).m28248l((int) (km4Var.zze() - km4Var.zzf()), false);
        return new C4675k7(m27786q, m27786q2, m27785p, m27785p2, m27786q3, m27786q4, bArr2);
    }

    /* renamed from: c */
    public static boolean m24480c(km4 km4Var) {
        x02 x02Var = new x02(8);
        int i11 = C4712l7.m24136a(km4Var, x02Var).f23766a;
        if (i11 != 1380533830 && i11 != 1380333108) {
            return false;
        }
        ((yl4) km4Var).mo23963f(x02Var.m27777h(), 0, 4, false);
        x02Var.m27775f(0);
        int m27782m = x02Var.m27782m();
        if (m27782m != 1463899717) {
            lr1.m24353b("WavHeaderReader", "Unsupported form type: " + m27782m);
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static C4712l7 m24481d(int i11, km4 km4Var, x02 x02Var) {
        C4712l7 m24136a = C4712l7.m24136a(km4Var, x02Var);
        while (true) {
            int i12 = m24136a.f23766a;
            if (i12 != i11) {
                lr1.m24356e("WavHeaderReader", "Ignoring unknown WAV chunk: " + i12);
                long j11 = m24136a.f23767b + 8;
                if (j11 <= 2147483647L) {
                    ((yl4) km4Var).m28248l((int) j11, false);
                    m24136a = C4712l7.m24136a(km4Var, x02Var);
                } else {
                    throw zzbu.m28713c("Chunk is too large (~2GB+) to skip; id: " + m24136a.f23766a);
                }
            } else {
                return m24136a;
            }
        }
    }
}
