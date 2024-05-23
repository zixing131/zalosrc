package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class bk4 {

    /* renamed from: g */
    private static final Comparator f17843g = new Comparator() { // from class: com.google.android.gms.internal.ads.xj4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((ak4) obj).f17154a - ((ak4) obj2).f17154a;
        }
    };

    /* renamed from: h */
    private static final Comparator f17844h = new Comparator() { // from class: com.google.android.gms.internal.ads.yj4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((ak4) obj).f17156c, ((ak4) obj2).f17156c);
        }
    };

    /* renamed from: d */
    private int f17848d;

    /* renamed from: e */
    private int f17849e;

    /* renamed from: f */
    private int f17850f;

    /* renamed from: b */
    private final ak4[] f17846b = new ak4[5];

    /* renamed from: a */
    private final ArrayList f17845a = new ArrayList();

    /* renamed from: c */
    private int f17847c = -1;

    public bk4(int i11) {
    }

    /* renamed from: a */
    public final float m20563a(float f11) {
        if (this.f17847c != 0) {
            Collections.sort(this.f17845a, f17844h);
            this.f17847c = 0;
        }
        float f12 = this.f17849e * 0.5f;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f17845a.size(); i12++) {
            ak4 ak4Var = (ak4) this.f17845a.get(i12);
            i11 += ak4Var.f17155b;
            if (i11 >= f12) {
                return ak4Var.f17156c;
            }
        }
        if (this.f17845a.isEmpty()) {
            return Float.NaN;
        }
        return ((ak4) this.f17845a.get(r5.size() - 1)).f17156c;
    }

    /* renamed from: b */
    public final void m20564b(int i11, float f11) {
        ak4 ak4Var;
        if (this.f17847c != 1) {
            Collections.sort(this.f17845a, f17843g);
            this.f17847c = 1;
        }
        int i12 = this.f17850f;
        if (i12 > 0) {
            ak4[] ak4VarArr = this.f17846b;
            int i13 = i12 - 1;
            this.f17850f = i13;
            ak4Var = ak4VarArr[i13];
        } else {
            ak4Var = new ak4(null);
        }
        int i14 = this.f17848d;
        this.f17848d = i14 + 1;
        ak4Var.f17154a = i14;
        ak4Var.f17155b = i11;
        ak4Var.f17156c = f11;
        this.f17845a.add(ak4Var);
        this.f17849e += i11;
        while (true) {
            int i15 = this.f17849e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                ak4 ak4Var2 = (ak4) this.f17845a.get(0);
                int i17 = ak4Var2.f17155b;
                if (i17 <= i16) {
                    this.f17849e -= i17;
                    this.f17845a.remove(0);
                    int i18 = this.f17850f;
                    if (i18 < 5) {
                        ak4[] ak4VarArr2 = this.f17846b;
                        this.f17850f = i18 + 1;
                        ak4VarArr2[i18] = ak4Var2;
                    }
                } else {
                    ak4Var2.f17155b = i17 - i16;
                    this.f17849e -= i16;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m20565c() {
        this.f17845a.clear();
        this.f17847c = -1;
        this.f17848d = 0;
        this.f17849e = 0;
    }
}
