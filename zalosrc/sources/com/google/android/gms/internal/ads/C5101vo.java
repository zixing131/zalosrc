package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vo */
/* loaded from: classes2.dex */
public final class C5101vo {

    /* renamed from: a */
    public final List f29421a;

    /* renamed from: b */
    public final int f29422b;

    private C5101vo(List list, int i11) {
        this.f29421a = list;
        this.f29422b = i11;
    }

    /* renamed from: a */
    public static C5101vo m27323a(C4655jo c4655jo) {
        List singletonList;
        try {
            c4655jo.m23687w(21);
            int m23671g = c4655jo.m23671g() & 3;
            int m23671g2 = c4655jo.m23671g();
            int m23667c = c4655jo.m23667c();
            int i11 = 0;
            for (int i12 = 0; i12 < m23671g2; i12++) {
                c4655jo.m23687w(1);
                int m23674j = c4655jo.m23674j();
                for (int i13 = 0; i13 < m23674j; i13++) {
                    int m23674j2 = c4655jo.m23674j();
                    i11 += m23674j2 + 4;
                    c4655jo.m23687w(m23674j2);
                }
            }
            c4655jo.m23686v(m23667c);
            byte[] bArr = new byte[i11];
            int i14 = 0;
            for (int i15 = 0; i15 < m23671g2; i15++) {
                c4655jo.m23687w(1);
                int m23674j3 = c4655jo.m23674j();
                for (int i16 = 0; i16 < m23674j3; i16++) {
                    int m23674j4 = c4655jo.m23674j();
                    System.arraycopy(AbstractC4582ho.f21849a, 0, bArr, i14, 4);
                    int i17 = i14 + 4;
                    System.arraycopy(c4655jo.f22891a, c4655jo.m23667c(), bArr, i17, m23674j4);
                    i14 = i17 + m23674j4;
                    c4655jo.m23687w(m23674j4);
                }
            }
            if (i11 == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new C5101vo(singletonList, m23671g + 1);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw new zzasz("Error parsing HEVC config", e11);
        }
    }
}
