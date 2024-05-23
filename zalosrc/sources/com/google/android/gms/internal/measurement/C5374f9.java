package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.f9 */
/* loaded from: classes.dex */
public final class C5374f9 implements InterfaceC5326cc {

    /* renamed from: a */
    private final AbstractC5357e9 f32371a;

    private C5374f9(AbstractC5357e9 abstractC5357e9) {
        byte[] bArr = AbstractC5290aa.f32259d;
        this.f32371a = abstractC5357e9;
        abstractC5357e9.f32355a = this;
    }

    /* renamed from: J */
    public static C5374f9 m29139J(AbstractC5357e9 abstractC5357e9) {
        C5374f9 c5374f9 = abstractC5357e9.f32355a;
        if (c5374f9 != null) {
            return c5374f9;
        }
        return new C5374f9(abstractC5357e9);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: A */
    public final void mo28994A(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue = ((Integer) list.get(i14)).intValue();
                i13 += AbstractC5357e9.m29089y((intValue >> 31) ^ (intValue + intValue));
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                AbstractC5357e9 abstractC5357e9 = this.f32371a;
                int intValue2 = ((Integer) list.get(i12)).intValue();
                abstractC5357e9.mo28987r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            AbstractC5357e9 abstractC5357e92 = this.f32371a;
            int intValue3 = ((Integer) list.get(i12)).intValue();
            abstractC5357e92.mo28986q(i11, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: B */
    public final void mo28995B(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5357e9.m29090z(((Long) list.get(i14)).longValue());
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28989t(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28988s(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: C */
    public final void mo28996C(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).intValue();
                i13 += 4;
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28978i(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28977h(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: D */
    public final void mo28997D(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Double) list.get(i14)).doubleValue();
                i13 += 8;
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28980k(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28979j(i11, Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: E */
    public final void mo28998E(int i11, long j11) {
        this.f32371a.mo28988s(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: F */
    public final void mo28999F(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                long longValue = ((Long) list.get(i14)).longValue();
                i13 += AbstractC5357e9.m29090z((longValue >> 63) ^ (longValue + longValue));
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                AbstractC5357e9 abstractC5357e9 = this.f32371a;
                long longValue2 = ((Long) list.get(i12)).longValue();
                abstractC5357e9.mo28989t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            AbstractC5357e9 abstractC5357e92 = this.f32371a;
            long longValue3 = ((Long) list.get(i12)).longValue();
            abstractC5357e92.mo28988s(i11, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: G */
    public final void mo29000G(int i11, Object obj, InterfaceC5393gb interfaceC5393gb) {
        AbstractC5357e9 abstractC5357e9 = this.f32371a;
        abstractC5357e9.mo28985p(i11, 3);
        interfaceC5393gb.mo29159e((InterfaceC5647va) obj, abstractC5357e9.f32355a);
        abstractC5357e9.mo28985p(i11, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: H */
    public final void mo29001H(int i11, Object obj, InterfaceC5393gb interfaceC5393gb) {
        InterfaceC5647va interfaceC5647va = (InterfaceC5647va) obj;
        C5323c9 c5323c9 = (C5323c9) this.f32371a;
        c5323c9.mo28987r((i11 << 3) | 2);
        c5323c9.mo28987r(((AbstractC5407h8) interfaceC5647va).mo29187d(interfaceC5393gb));
        interfaceC5393gb.mo29159e(interfaceC5647va, c5323c9.f32355a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: I */
    public final void mo29002I(int i11, AbstractC5679x8 abstractC5679x8) {
        this.f32371a.mo28976g(i11, abstractC5679x8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: a */
    public final void mo29003a(int i11, long j11) {
        this.f32371a.mo28979j(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: b */
    public final void mo29004b(int i11, List list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f32371a.mo28976g(i11, (AbstractC5679x8) list.get(i12));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: c */
    public final void mo29005c(int i11, boolean z11) {
        this.f32371a.mo28975f(i11, z11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: d */
    public final void mo29006d(int i11, String str) {
        this.f32371a.mo28984o(i11, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: e */
    public final void mo29007e(int i11, long j11) {
        this.f32371a.mo28988s(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: f */
    public final void mo29008f(int i11) {
        this.f32371a.mo28985p(i11, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: g */
    public final void mo29009g(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Boolean) list.get(i14)).booleanValue();
                i13++;
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28974e(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28975f(i11, ((Boolean) list.get(i12)).booleanValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: h */
    public final void mo29010h(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5357e9.m29086v(((Integer) list.get(i14)).intValue());
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28982m(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28981l(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: i */
    public final void mo29011i(int i11, double d11) {
        this.f32371a.mo28979j(i11, Double.doubleToRawLongBits(d11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: j */
    public final void mo29012j(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).longValue();
                i13 += 8;
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28980k(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28979j(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: k */
    public final void mo29013k(int i11, int i12) {
        this.f32371a.mo28977h(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: l */
    public final void mo29014l(int i11, int i12) {
        this.f32371a.mo28986q(i11, (i12 >> 31) ^ (i12 + i12));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: m */
    public final void mo29015m(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5357e9.m29090z(((Long) list.get(i14)).longValue());
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28989t(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28988s(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: n */
    public final void mo29016n(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Float) list.get(i14)).floatValue();
                i13 += 4;
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28978i(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28977h(i11, Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: o */
    public final void mo29017o(int i11, long j11) {
        this.f32371a.mo28988s(i11, (j11 >> 63) ^ (j11 + j11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: p */
    public final void mo29018p(int i11, int i12) {
        this.f32371a.mo28986q(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: q */
    public final void mo29019q(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).longValue();
                i13 += 8;
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28980k(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28979j(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: r */
    public final void mo29020r(int i11, int i12) {
        this.f32371a.mo28981l(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: s */
    public final void mo29021s(int i11, int i12) {
        this.f32371a.mo28977h(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: t */
    public final void mo29022t(int i11, long j11) {
        this.f32371a.mo28979j(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: u */
    public final void mo29023u(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5357e9.m29089y(((Integer) list.get(i14)).intValue());
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28987r(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28986q(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: v */
    public final void mo29024v(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).intValue();
                i13 += 4;
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28978i(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28977h(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: w */
    public final void mo29025w(int i11, int i12) {
        this.f32371a.mo28981l(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: x */
    public final void mo29026x(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f32371a.mo28985p(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5357e9.m29086v(((Integer) list.get(i14)).intValue());
            }
            this.f32371a.mo28987r(i13);
            while (i12 < list.size()) {
                this.f32371a.mo28982m(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28981l(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: y */
    public final void mo29027y(int i11, List list) {
        int i12 = 0;
        if (list instanceof InterfaceC5341da) {
            InterfaceC5341da interfaceC5341da = (InterfaceC5341da) list;
            while (i12 < list.size()) {
                Object zzf = interfaceC5341da.zzf(i12);
                if (zzf instanceof String) {
                    this.f32371a.mo28984o(i11, (String) zzf);
                } else {
                    this.f32371a.mo28976g(i11, (AbstractC5679x8) zzf);
                }
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f32371a.mo28984o(i11, (String) list.get(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    /* renamed from: z */
    public final void mo29028z(int i11, float f11) {
        this.f32371a.mo28977h(i11, Float.floatToRawIntBits(f11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5326cc
    public final void zzE(int i11) {
        this.f32371a.mo28985p(i11, 3);
    }
}
