package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cu3 {

    /* renamed from: a */
    private final bu3 f18758a;

    private cu3(bu3 bu3Var) {
        dv3.m21551f(bu3Var, "output");
        this.f18758a = bu3Var;
        bu3Var.f17988a = this;
    }

    /* renamed from: l */
    public static cu3 m21066l(bu3 bu3Var) {
        cu3 cu3Var = bu3Var.f17988a;
        if (cu3Var != null) {
            return cu3Var;
        }
        return new cu3(bu3Var);
    }

    /* renamed from: A */
    public final void m21067A(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Float) list.get(i14)).floatValue();
                i13 += 4;
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20750s(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20749r(i11, Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
            i12++;
        }
    }

    /* renamed from: B */
    public final void m21068B(int i11, Object obj, tw3 tw3Var) {
        bu3 bu3Var = this.f18758a;
        bu3Var.mo20757z(i11, 3);
        tw3Var.mo21231f((zv3) obj, bu3Var.f17988a);
        bu3Var.mo20757z(i11, 4);
    }

    /* renamed from: C */
    public final void m21069C(int i11, int i12) {
        this.f18758a.mo20753v(i11, i12);
    }

    /* renamed from: D */
    public final void m21070D(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += bu3.m20728G(((Integer) list.get(i14)).intValue());
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20754w(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20753v(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    /* renamed from: E */
    public final void m21071E(int i11, long j11) {
        this.f18758a.mo20740C(i11, j11);
    }

    /* renamed from: F */
    public final void m21072F(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += bu3.m20734g(((Long) list.get(i14)).longValue());
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20741D(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20740C(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    /* renamed from: G */
    public final void m21073G(int i11, Object obj, tw3 tw3Var) {
        this.f18758a.mo20755x(i11, (zv3) obj, tw3Var);
    }

    /* renamed from: H */
    public final void m21074H(int i11, int i12) {
        this.f18758a.mo20749r(i11, i12);
    }

    /* renamed from: I */
    public final void m21075I(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).intValue();
                i13 += 4;
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20750s(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20749r(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    /* renamed from: J */
    public final void m21076J(int i11, long j11) {
        this.f18758a.mo20751t(i11, j11);
    }

    /* renamed from: K */
    public final void m21077K(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).longValue();
                i13 += 8;
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20752u(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20751t(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    /* renamed from: a */
    public final void m21078a(int i11, int i12) {
        this.f18758a.mo20738A(i11, (i12 >> 31) ^ (i12 + i12));
    }

    /* renamed from: b */
    public final void m21079b(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue = ((Integer) list.get(i14)).intValue();
                i13 += bu3.m20733f((intValue >> 31) ^ (intValue + intValue));
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                bu3 bu3Var = this.f18758a;
                int intValue2 = ((Integer) list.get(i12)).intValue();
                bu3Var.mo20739B((intValue2 >> 31) ^ (intValue2 + intValue2));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            bu3 bu3Var2 = this.f18758a;
            int intValue3 = ((Integer) list.get(i12)).intValue();
            bu3Var2.mo20738A(i11, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i12++;
        }
    }

    /* renamed from: c */
    public final void m21080c(int i11, long j11) {
        this.f18758a.mo20740C(i11, (j11 >> 63) ^ (j11 + j11));
    }

    /* renamed from: d */
    public final void m21081d(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                long longValue = ((Long) list.get(i14)).longValue();
                i13 += bu3.m20734g((longValue >> 63) ^ (longValue + longValue));
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                bu3 bu3Var = this.f18758a;
                long longValue2 = ((Long) list.get(i12)).longValue();
                bu3Var.mo20741D((longValue2 >> 63) ^ (longValue2 + longValue2));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            bu3 bu3Var2 = this.f18758a;
            long longValue3 = ((Long) list.get(i12)).longValue();
            bu3Var2.mo20740C(i11, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i12++;
        }
    }

    /* renamed from: e */
    public final void m21082e(int i11) {
        this.f18758a.mo20757z(i11, 3);
    }

    /* renamed from: f */
    public final void m21083f(int i11, String str) {
        this.f18758a.mo20756y(i11, str);
    }

    /* renamed from: g */
    public final void m21084g(int i11, List list) {
        int i12 = 0;
        if (list instanceof hv3) {
            hv3 hv3Var = (hv3) list;
            while (i12 < list.size()) {
                Object zzf = hv3Var.zzf(i12);
                if (zzf instanceof String) {
                    this.f18758a.mo20756y(i11, (String) zzf);
                } else {
                    this.f18758a.mo20747p(i11, (mt3) zzf);
                }
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20756y(i11, (String) list.get(i12));
            i12++;
        }
    }

    /* renamed from: h */
    public final void m21085h(int i11, int i12) {
        this.f18758a.mo20738A(i11, i12);
    }

    /* renamed from: i */
    public final void m21086i(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += bu3.m20733f(((Integer) list.get(i14)).intValue());
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20739B(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20738A(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    /* renamed from: j */
    public final void m21087j(int i11, long j11) {
        this.f18758a.mo20740C(i11, j11);
    }

    /* renamed from: k */
    public final void m21088k(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += bu3.m20734g(((Long) list.get(i14)).longValue());
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20741D(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20740C(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    /* renamed from: m */
    public final void m21089m(int i11, boolean z11) {
        this.f18758a.mo20746o(i11, z11);
    }

    /* renamed from: n */
    public final void m21090n(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Boolean) list.get(i14)).booleanValue();
                i13++;
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20745n(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20746o(i11, ((Boolean) list.get(i12)).booleanValue());
            i12++;
        }
    }

    /* renamed from: o */
    public final void m21091o(int i11, mt3 mt3Var) {
        this.f18758a.mo20747p(i11, mt3Var);
    }

    /* renamed from: p */
    public final void m21092p(int i11, List list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f18758a.mo20747p(i11, (mt3) list.get(i12));
        }
    }

    /* renamed from: q */
    public final void m21093q(int i11, double d11) {
        this.f18758a.mo20751t(i11, Double.doubleToRawLongBits(d11));
    }

    /* renamed from: r */
    public final void m21094r(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Double) list.get(i14)).doubleValue();
                i13 += 8;
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20752u(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20751t(i11, Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
            i12++;
        }
    }

    /* renamed from: s */
    public final void m21095s(int i11) {
        this.f18758a.mo20757z(i11, 4);
    }

    /* renamed from: t */
    public final void m21096t(int i11, int i12) {
        this.f18758a.mo20753v(i11, i12);
    }

    /* renamed from: u */
    public final void m21097u(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += bu3.m20728G(((Integer) list.get(i14)).intValue());
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20754w(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20753v(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    /* renamed from: v */
    public final void m21098v(int i11, int i12) {
        this.f18758a.mo20749r(i11, i12);
    }

    /* renamed from: w */
    public final void m21099w(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).intValue();
                i13 += 4;
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20750s(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20749r(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    /* renamed from: x */
    public final void m21100x(int i11, long j11) {
        this.f18758a.mo20751t(i11, j11);
    }

    /* renamed from: y */
    public final void m21101y(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f18758a.mo20757z(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).longValue();
                i13 += 8;
            }
            this.f18758a.mo20739B(i13);
            while (i12 < list.size()) {
                this.f18758a.mo20752u(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f18758a.mo20751t(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    /* renamed from: z */
    public final void m21102z(int i11, float f11) {
        this.f18758a.mo20749r(i11, Float.floatToRawIntBits(f11));
    }
}
