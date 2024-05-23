package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.q4 */
/* loaded from: classes2.dex */
public final class C4896q4 implements jm4 {

    /* renamed from: d */
    public static final qm4 f26621d = new qm4() { // from class: com.google.android.gms.internal.ads.p4
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C4896q4()};
        }
    };

    /* renamed from: a */
    private mm4 f26622a;

    /* renamed from: b */
    private AbstractC5193y4 f26623b;

    /* renamed from: c */
    private boolean f26624c;

    /* renamed from: b */
    private final boolean m25653b(km4 km4Var) {
        C4970s4 c4970s4 = new C4970s4();
        if (c4970s4.m26245b(km4Var, true) && (c4970s4.f27520a & 2) == 2) {
            int min = Math.min(c4970s4.f27524e, 8);
            x02 x02Var = new x02(min);
            ((yl4) km4Var).mo23963f(x02Var.m27777h(), 0, min, false);
            x02Var.m27775f(0);
            if (x02Var.m27778i() >= 5 && x02Var.m27788s() == 127 && x02Var.m27762A() == 1179402563) {
                this.f26623b = new C4821o4();
            } else {
                x02Var.m27775f(0);
                try {
                    if (AbstractC5151x.m27760d(1, x02Var, true)) {
                        this.f26623b = new C4305a5();
                    }
                } catch (zzbu unused) {
                }
                x02Var.m27775f(0);
                if (C5044u4.m26858j(x02Var)) {
                    this.f26623b = new C5044u4();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        try {
            return m25653b(km4Var);
        } catch (zzbu unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f26622a = mm4Var;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        AbstractC5193y4 abstractC5193y4 = this.f26623b;
        if (abstractC5193y4 != null) {
            abstractC5193y4.m28122i(j11, j12);
        }
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        v71.m27171b(this.f26622a);
        if (this.f26623b == null) {
            if (m25653b(km4Var)) {
                km4Var.zzj();
            } else {
                throw zzbu.m28711a("Failed to determine bitstream type", null);
            }
        }
        if (!this.f26624c) {
            InterfaceC4928r mo21604i = this.f26622a.mo21604i(0, 1);
            this.f26622a.zzC();
            this.f26623b.m28121g(this.f26622a, mo21604i);
            this.f26624c = true;
        }
        return this.f26623b.m28118d(km4Var, c4667k);
    }
}
