package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class nl4 {

    /* renamed from: a */
    public final List f25239a;

    /* renamed from: b */
    public final int f25240b;

    /* renamed from: c */
    public final int f25241c;

    /* renamed from: d */
    public final int f25242d;

    /* renamed from: e */
    public final float f25243e;

    /* renamed from: f */
    public final String f25244f;

    private nl4(List list, int i11, int i12, int i13, float f11, String str) {
        this.f25239a = list;
        this.f25240b = i11;
        this.f25241c = i12;
        this.f25242d = i13;
        this.f25243e = f11;
        this.f25244f = str;
    }

    /* renamed from: a */
    public static nl4 m24946a(x02 x02Var) {
        String str;
        int i11;
        int i12;
        float f11;
        try {
            x02Var.m27776g(4);
            int m27788s = x02Var.m27788s() & 3;
            int i13 = m27788s + 1;
            if (i13 != 3) {
                ArrayList arrayList = new ArrayList();
                int m27788s2 = x02Var.m27788s() & 31;
                for (int i14 = 0; i14 < m27788s2; i14++) {
                    arrayList.add(m24947b(x02Var));
                }
                int m27788s3 = x02Var.m27788s();
                for (int i15 = 0; i15 < m27788s3; i15++) {
                    arrayList.add(m24947b(x02Var));
                }
                if (m27788s2 > 0) {
                    C4520g m22652d = AbstractC4557h.m22652d((byte[]) arrayList.get(0), m27788s + 2, ((byte[]) arrayList.get(0)).length);
                    int i16 = m22652d.f20350e;
                    int i17 = m22652d.f20351f;
                    float f12 = m22652d.f20352g;
                    str = x91.m27865a(m22652d.f20346a, m22652d.f20347b, m22652d.f20348c);
                    i11 = i16;
                    i12 = i17;
                    f11 = f12;
                } else {
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    f11 = 1.0f;
                }
                return new nl4(arrayList, i13, i11, i12, f11, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw zzbu.m28711a("Error parsing AVC config", e11);
        }
    }

    /* renamed from: b */
    private static byte[] m24947b(x02 x02Var) {
        int m27792w = x02Var.m27792w();
        int m27780k = x02Var.m27780k();
        x02Var.m27776g(m27792w);
        return x91.m27867c(x02Var.m27777h(), m27780k, m27792w);
    }
}
