package com.google.android.gms.internal.play_billing;

import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.v0 */
/* loaded from: classes2.dex */
final class C5851v0 implements InterfaceC5806n3 {

    /* renamed from: a */
    private final AbstractC5845u0 f33439a;

    private C5851v0(AbstractC5845u0 abstractC5845u0) {
        byte[] bArr = AbstractC5804n1.f33378d;
        this.f33439a = abstractC5845u0;
        abstractC5845u0.f33434a = this;
    }

    /* renamed from: J */
    public static C5851v0 m30528J(AbstractC5845u0 abstractC5845u0) {
        C5851v0 c5851v0 = abstractC5845u0.f33434a;
        if (c5851v0 != null) {
            return c5851v0;
        }
        return new C5851v0(abstractC5845u0);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: A */
    public final void mo30379A(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue = ((Integer) list.get(i14)).intValue();
                i13 += AbstractC5845u0.m30488y((intValue >> 31) ^ (intValue + intValue));
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                AbstractC5845u0 abstractC5845u0 = this.f33439a;
                int intValue2 = ((Integer) list.get(i12)).intValue();
                abstractC5845u0.mo30462r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            AbstractC5845u0 abstractC5845u02 = this.f33439a;
            int intValue3 = ((Integer) list.get(i12)).intValue();
            abstractC5845u02.mo30461q(i11, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: B */
    public final void mo30380B(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5845u0.m30489z(((Long) list.get(i14)).longValue());
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30464t(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30463s(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: C */
    public final void mo30381C(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).intValue();
                i13 += 4;
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30453i(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30452h(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: D */
    public final void mo30382D(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Double) list.get(i14)).doubleValue();
                i13 += 8;
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30455k(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30454j(i11, Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: E */
    public final void mo30383E(int i11, long j11) {
        this.f33439a.mo30463s(i11, j11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: F */
    public final void mo30384F(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                long longValue = ((Long) list.get(i14)).longValue();
                i13 += AbstractC5845u0.m30489z((longValue >> 63) ^ (longValue + longValue));
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                AbstractC5845u0 abstractC5845u0 = this.f33439a;
                long longValue2 = ((Long) list.get(i12)).longValue();
                abstractC5845u0.mo30464t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            AbstractC5845u0 abstractC5845u02 = this.f33439a;
            long longValue3 = ((Long) list.get(i12)).longValue();
            abstractC5845u02.mo30463s(i11, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: G */
    public final void mo30385G(int i11, AbstractC5803n0 abstractC5803n0) {
        this.f33439a.mo30451g(i11, abstractC5803n0);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: H */
    public final void mo30386H(int i11, Object obj, InterfaceC5835s2 interfaceC5835s2) {
        InterfaceC5775i2 interfaceC5775i2 = (InterfaceC5775i2) obj;
        C5833s0 c5833s0 = (C5833s0) this.f33439a;
        c5833s0.mo30462r((i11 << 3) | 2);
        c5833s0.mo30462r(((AbstractC5868y) interfaceC5775i2).mo30283b(interfaceC5835s2));
        interfaceC5835s2.mo30356e(interfaceC5775i2, c5833s0.f33434a);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: I */
    public final void mo30387I(int i11, Object obj, InterfaceC5835s2 interfaceC5835s2) {
        AbstractC5845u0 abstractC5845u0 = this.f33439a;
        abstractC5845u0.mo30460p(i11, 3);
        interfaceC5835s2.mo30356e((InterfaceC5775i2) obj, abstractC5845u0.f33434a);
        abstractC5845u0.mo30460p(i11, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: a */
    public final void mo30388a(int i11, long j11) {
        this.f33439a.mo30454j(i11, j11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: b */
    public final void mo30389b(int i11, List list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f33439a.mo30451g(i11, (AbstractC5803n0) list.get(i12));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: c */
    public final void mo30390c(int i11, boolean z11) {
        this.f33439a.mo30450f(i11, z11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: d */
    public final void mo30391d(int i11, String str) {
        this.f33439a.mo30459o(i11, str);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: e */
    public final void mo30392e(int i11, long j11) {
        this.f33439a.mo30463s(i11, j11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: f */
    public final void mo30393f(int i11) {
        this.f33439a.mo30460p(i11, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: g */
    public final void mo30394g(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Boolean) list.get(i14)).booleanValue();
                i13++;
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30449e(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30450f(i11, ((Boolean) list.get(i12)).booleanValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: h */
    public final void mo30395h(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5845u0.m30485v(((Integer) list.get(i14)).intValue());
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30457m(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30456l(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: i */
    public final void mo30396i(int i11, double d11) {
        this.f33439a.mo30454j(i11, Double.doubleToRawLongBits(d11));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: j */
    public final void mo30397j(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).longValue();
                i13 += 8;
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30455k(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30454j(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: k */
    public final void mo30398k(int i11, int i12) {
        this.f33439a.mo30452h(i11, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: l */
    public final void mo30399l(int i11, int i12) {
        this.f33439a.mo30461q(i11, (i12 >> 31) ^ (i12 + i12));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: m */
    public final void mo30400m(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5845u0.m30489z(((Long) list.get(i14)).longValue());
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30464t(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30463s(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: n */
    public final void mo30401n(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Float) list.get(i14)).floatValue();
                i13 += 4;
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30453i(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30452h(i11, Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: o */
    public final void mo30402o(int i11, long j11) {
        this.f33439a.mo30463s(i11, (j11 >> 63) ^ (j11 + j11));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: p */
    public final void mo30403p(int i11, int i12) {
        this.f33439a.mo30461q(i11, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: q */
    public final void mo30404q(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).longValue();
                i13 += 8;
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30455k(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30454j(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: r */
    public final void mo30405r(int i11, int i12) {
        this.f33439a.mo30456l(i11, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: s */
    public final void mo30406s(int i11, int i12) {
        this.f33439a.mo30452h(i11, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: t */
    public final void mo30407t(int i11, long j11) {
        this.f33439a.mo30454j(i11, j11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: u */
    public final void mo30408u(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5845u0.m30488y(((Integer) list.get(i14)).intValue());
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30462r(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30461q(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: v */
    public final void mo30409v(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).intValue();
                i13 += 4;
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30453i(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30452h(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: w */
    public final void mo30410w(int i11, int i12) {
        this.f33439a.mo30456l(i11, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: x */
    public final void mo30411x(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f33439a.mo30460p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5845u0.m30485v(((Integer) list.get(i14)).intValue());
            }
            this.f33439a.mo30462r(i13);
            while (i12 < list.size()) {
                this.f33439a.mo30457m(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30456l(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: y */
    public final void mo30412y(int i11, List list) {
        int i12 = 0;
        if (list instanceof InterfaceC5822q1) {
            InterfaceC5822q1 interfaceC5822q1 = (InterfaceC5822q1) list;
            while (i12 < list.size()) {
                Object zzf = interfaceC5822q1.zzf(i12);
                if (zzf instanceof String) {
                    this.f33439a.mo30459o(i11, (String) zzf);
                } else {
                    this.f33439a.mo30451g(i11, (AbstractC5803n0) zzf);
                }
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f33439a.mo30459o(i11, (String) list.get(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    /* renamed from: z */
    public final void mo30413z(int i11, float f11) {
        this.f33439a.mo30452h(i11, Float.floatToRawIntBits(f11));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5806n3
    public final void zzE(int i11) {
        this.f33439a.mo30460p(i11, 3);
    }
}
