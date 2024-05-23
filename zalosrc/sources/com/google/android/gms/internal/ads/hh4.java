package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class hh4 extends jh4 {

    /* renamed from: f */
    private final ij4 f21756f;

    /* renamed from: g */
    private final c83 f21757g;

    /* renamed from: h */
    private final w81 f21758h;

    /* JADX INFO: Access modifiers changed from: protected */
    public hh4(jt0 jt0Var, int[] iArr, int i11, ij4 ij4Var, long j11, long j12, long j13, int i12, int i13, float f11, float f12, List list, w81 w81Var) {
        super(jt0Var, iArr, 0);
        this.f21756f = ij4Var;
        this.f21757g = c83.m20830u(list);
        this.f21758h = w81Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ c83 m22898b(ti4[] ti4VarArr) {
        int i11;
        int i12;
        c83 m28454h;
        double d11;
        long j11;
        ArrayList arrayList = new ArrayList();
        char c11 = 0;
        int i13 = 0;
        while (true) {
            i11 = 2;
            i12 = 1;
            if (i13 >= 2) {
                break;
            }
            ti4 ti4Var = ti4VarArr[i13];
            if (ti4Var != null && ti4Var.f28381b.length > 1) {
                z73 m20826p = c83.m20826p();
                m20826p.m28452f(new fh4(0L, 0L));
                arrayList.add(m20826p);
            } else {
                arrayList.add(null);
            }
            i13++;
        }
        long[][] jArr = new long[2];
        for (int i14 = 0; i14 < 2; i14++) {
            ti4 ti4Var2 = ti4VarArr[i14];
            if (ti4Var2 == null) {
                jArr[i14] = new long[0];
            } else {
                jArr[i14] = new long[ti4Var2.f28381b.length];
                int i15 = 0;
                while (true) {
                    if (i15 >= ti4Var2.f28381b.length) {
                        break;
                    }
                    jArr[i14][i15] = ti4Var2.f28380a.m23747b(r10[i15]).f23095h;
                    i15++;
                }
                Arrays.sort(jArr[i14]);
            }
        }
        int[] iArr = new int[2];
        long[] jArr2 = new long[2];
        for (int i16 = 0; i16 < 2; i16++) {
            long[] jArr3 = jArr[i16];
            if (jArr3.length == 0) {
                j11 = 0;
            } else {
                j11 = jArr3[0];
            }
            jArr2[i16] = j11;
        }
        m22899d(arrayList, jArr2);
        n83 mo20441c = e93.m21650b(j93.m23576c()).m21290b(2).mo20441c();
        int i17 = 0;
        while (i17 < i11) {
            int length = jArr[i17].length;
            if (length > i12) {
                double[] dArr = new double[length];
                int i18 = 0;
                while (true) {
                    long[] jArr4 = jArr[i17];
                    double d12 = 0.0d;
                    if (i18 >= jArr4.length) {
                        break;
                    }
                    long j12 = jArr4[i18];
                    if (j12 != -1) {
                        d12 = Math.log(j12);
                    }
                    dArr[i18] = d12;
                    i18++;
                }
                int i19 = length - 1;
                double d13 = dArr[i19] - dArr[c11];
                int i21 = 0;
                while (i21 < i19) {
                    int i22 = i21 + 1;
                    double d14 = (dArr[i21] + dArr[i22]) * 0.5d;
                    if (d13 == 0.0d) {
                        d11 = 1.0d;
                    } else {
                        d11 = (d14 - dArr[c11]) / d13;
                    }
                    mo20441c.mo27544b(Double.valueOf(d11), Integer.valueOf(i17));
                    i21 = i22;
                    c11 = 0;
                }
            }
            i17++;
            c11 = 0;
            i11 = 2;
            i12 = 1;
        }
        c83 m20830u = c83.m20830u(mo20441c.zzt());
        for (int i23 = 0; i23 < m20830u.size(); i23++) {
            int intValue = ((Integer) m20830u.get(i23)).intValue();
            int i24 = iArr[intValue] + 1;
            iArr[intValue] = i24;
            jArr2[intValue] = jArr[intValue][i24];
            m22899d(arrayList, jArr2);
        }
        for (int i25 = 0; i25 < 2; i25++) {
            if (arrayList.get(i25) != null) {
                long j13 = jArr2[i25];
                jArr2[i25] = j13 + j13;
            }
        }
        m22899d(arrayList, jArr2);
        z73 m20826p2 = c83.m20826p();
        for (int i26 = 0; i26 < arrayList.size(); i26++) {
            z73 z73Var = (z73) arrayList.get(i26);
            if (z73Var == null) {
                m28454h = c83.m20832w();
            } else {
                m28454h = z73Var.m28454h();
            }
            m20826p2.m28452f(m28454h);
        }
        return m20826p2.m28454h();
    }

    /* renamed from: d */
    private static void m22899d(List list, long[] jArr) {
        long j11 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            j11 += jArr[i11];
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            z73 z73Var = (z73) list.get(i12);
            if (z73Var != null) {
                z73Var.m28452f(new fh4(j11, jArr[i12]));
            }
        }
    }
}
