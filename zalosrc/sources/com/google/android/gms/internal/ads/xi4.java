package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class xi4 extends aj4 {

    /* renamed from: c */
    private wi4 f30480c;

    @Override // com.google.android.gms.internal.ads.aj4
    /* renamed from: d */
    public final bj4 mo20140d(d44[] d44VarArr, dh4 dh4Var, gf4 gf4Var, mr0 mr0Var) {
        boolean z11;
        boolean z12;
        c83 m20832w;
        int[] iArr;
        boolean z13;
        int[] iArr2 = new int[3];
        jt0[][] jt0VarArr = new jt0[3];
        int[][][] iArr3 = new int[3][];
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = dh4Var.f19251a;
            jt0VarArr[i11] = new jt0[i12];
            iArr3[i11] = new int[i12];
        }
        int i13 = 2;
        int[] iArr4 = new int[2];
        for (int i14 = 0; i14 < 2; i14++) {
            iArr4[i14] = d44VarArr[i14].zze();
        }
        int i15 = 0;
        while (i15 < dh4Var.f19251a) {
            jt0 m21393b = dh4Var.m21393b(i15);
            int i16 = m21393b.f22988c;
            int i17 = 0;
            int i18 = 2;
            int i19 = 0;
            boolean z14 = true;
            while (i17 < i13) {
                d44 d44Var = d44VarArr[i17];
                int i21 = 0;
                for (int i22 = 0; i22 <= 0; i22++) {
                    i21 = Math.max(i21, d44Var.mo21264g(m21393b.m23747b(i22)) & 7);
                }
                if (iArr2[i17] == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i21 <= i19) {
                    if (i21 == i19 && i16 == 5 && !z14 && z13) {
                        i18 = i17;
                        i19 = i21;
                        z14 = true;
                    }
                } else {
                    z14 = z13;
                    i18 = i17;
                    i19 = i21;
                }
                i17++;
                i13 = 2;
            }
            if (i18 == i13) {
                iArr = new int[1];
            } else {
                d44 d44Var2 = d44VarArr[i18];
                int[] iArr5 = new int[1];
                for (int i23 = 0; i23 <= 0; i23++) {
                    iArr5[i23] = d44Var2.mo21264g(m21393b.m23747b(i23));
                }
                iArr = iArr5;
            }
            int i24 = iArr2[i18];
            jt0VarArr[i18][i24] = m21393b;
            iArr3[i18][i24] = iArr;
            iArr2[i18] = i24 + 1;
            i15++;
            i13 = 2;
        }
        dh4[] dh4VarArr = new dh4[i13];
        String[] strArr = new String[i13];
        int[] iArr6 = new int[i13];
        int i25 = 0;
        while (i25 < i13) {
            int i26 = iArr2[i25];
            dh4VarArr[i25] = new dh4((jt0[]) g92.m22312F(jt0VarArr[i25], i26));
            iArr3[i25] = (int[][]) g92.m22312F(iArr3[i25], i26);
            strArr[i25] = d44VarArr[i25].mo20800d();
            iArr6[i25] = d44VarArr[i25].zzb();
            i25++;
            i13 = 2;
        }
        wi4 wi4Var = new wi4(strArr, iArr6, dh4VarArr, iArr4, iArr3, new dh4((jt0[]) g92.m22312F(jt0VarArr[2], iArr2[2])));
        Pair mo26334i = mo26334i(wi4Var, iArr3, iArr4, gf4Var, mr0Var);
        yi4[] yi4VarArr = (yi4[]) mo26334i.second;
        List[] listArr = new List[yi4VarArr.length];
        for (int i27 = 0; i27 < yi4VarArr.length; i27++) {
            yi4 yi4Var = yi4VarArr[i27];
            if (yi4Var != null) {
                m20832w = c83.m20833x(yi4Var);
            } else {
                m20832w = c83.m20832w();
            }
            listArr[i27] = m20832w;
        }
        z73 z73Var = new z73();
        int i28 = 0;
        for (int i29 = 2; i28 < i29; i29 = 2) {
            dh4 m27625d = wi4Var.m27625d(i28);
            List list = listArr[i28];
            for (int i31 = 0; i31 < m27625d.f19251a; i31++) {
                jt0 m21393b2 = m27625d.m21393b(i31);
                if (wi4Var.m27622a(i28, i31, false) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i32 = m21393b2.f22986a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i33 = 0; i33 <= 0; i33++) {
                    iArr7[i33] = wi4Var.m27623b(i28, i31, i33) & 7;
                    int i34 = 0;
                    while (true) {
                        if (i34 < list.size()) {
                            yi4 yi4Var2 = (yi4) list.get(i34);
                            if (yi4Var2.zze().equals(m21393b2) && yi4Var2.zzb(i33) != -1) {
                                z12 = true;
                                break;
                            }
                            i34++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    zArr[i33] = z12;
                }
                z73Var.m28452f(new p11(m21393b2, z11, iArr7, zArr));
            }
            i28++;
        }
        dh4 m27626e = wi4Var.m27626e();
        for (int i35 = 0; i35 < m27626e.f19251a; i35++) {
            jt0 m21393b3 = m27626e.m21393b(i35);
            int i36 = m21393b3.f22986a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            z73Var.m28452f(new p11(m21393b3, false, iArr8, new boolean[1]));
        }
        return new bj4((e44[]) mo26334i.first, (ui4[]) mo26334i.second, new q21(z73Var.m28454h()), wi4Var);
    }

    @Override // com.google.android.gms.internal.ads.aj4
    /* renamed from: e */
    public final void mo20141e(Object obj) {
        this.f30480c = (wi4) obj;
    }

    /* renamed from: i */
    protected abstract Pair mo26334i(wi4 wi4Var, int[][][] iArr, int[] iArr2, gf4 gf4Var, mr0 mr0Var);
}
