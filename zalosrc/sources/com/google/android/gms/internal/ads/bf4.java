package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public final class bf4 extends oe4 {

    /* renamed from: k */
    private final if4 f17729k;

    /* renamed from: l */
    private final boolean f17730l;

    /* renamed from: m */
    private final jq0 f17731m;

    /* renamed from: n */
    private final ho0 f17732n;

    /* renamed from: o */
    private ze4 f17733o;

    /* renamed from: p */
    private ye4 f17734p;

    /* renamed from: q */
    private boolean f17735q;

    /* renamed from: r */
    private boolean f17736r;

    /* renamed from: s */
    private boolean f17737s;

    public bf4(if4 if4Var, boolean z11) {
        boolean z12;
        this.f17729k = if4Var;
        if (z11) {
            if4Var.mo22797a();
            z12 = true;
        } else {
            z12 = false;
        }
        this.f17730l = z12;
        this.f17731m = new jq0();
        this.f17732n = new ho0();
        if4Var.mo22799e();
        this.f17733o = ze4.m28493q(if4Var.zzz());
    }

    /* renamed from: E */
    private final Object m20501E(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.f17733o.f31483e;
        if (obj2 != null && obj.equals(ze4.f31481f)) {
            obj3 = this.f17733o.f31483e;
            return obj3;
        }
        return obj;
    }

    /* renamed from: F */
    private final void m20502F(long j11) {
        ye4 ye4Var = this.f17734p;
        int mo20105a = this.f17733o.mo20105a(ye4Var.f30915p.f20363a);
        if (mo20105a == -1) {
            return;
        }
        ze4 ze4Var = this.f17733o;
        ho0 ho0Var = this.f17732n;
        ze4Var.mo20108d(mo20105a, ho0Var, false);
        long j12 = ho0Var.f21856d;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        ye4Var.m28196i(j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    @Override // com.google.android.gms.internal.ads.oe4
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void mo20503A(Object obj, if4 if4Var, mr0 mr0Var) {
        long j11;
        ze4 m28494r;
        ye4 ye4Var;
        ze4 m28494r2;
        gf4 gf4Var = null;
        if (this.f17736r) {
            this.f17733o = this.f17733o.m28496p(mr0Var);
            ye4 ye4Var2 = this.f17734p;
            if (ye4Var2 != null) {
                m20502F(ye4Var2.m28193e());
            }
        } else if (mr0Var.m24700o()) {
            if (this.f17737s) {
                m28494r2 = this.f17733o.m28496p(mr0Var);
            } else {
                m28494r2 = ze4.m28494r(mr0Var, jq0.f22926o, ze4.f31481f);
            }
            this.f17733o = m28494r2;
        } else {
            mr0Var.mo20109e(0, this.f17731m, 0L);
            Object obj2 = this.f17731m.f22930a;
            ye4 ye4Var3 = this.f17734p;
            if (ye4Var3 != null) {
                long m28194f = ye4Var3.m28194f();
                this.f17733o.mo23650n(ye4Var3.f30915p.f20363a, this.f17732n);
                this.f17733o.mo20109e(0, this.f17731m, 0L);
                if (m28194f != 0) {
                    j11 = m28194f;
                    Pair m24698l = mr0Var.m24698l(this.f17731m, this.f17732n, 0, j11);
                    Object obj3 = m24698l.first;
                    long longValue = ((Long) m24698l.second).longValue();
                    if (!this.f17737s) {
                        m28494r = this.f17733o.m28496p(mr0Var);
                    } else {
                        m28494r = ze4.m28494r(mr0Var, obj2, obj3);
                    }
                    this.f17733o = m28494r;
                    ye4Var = this.f17734p;
                    if (ye4Var != null) {
                        m20502F(longValue);
                        gf4 gf4Var2 = ye4Var.f30915p;
                        gf4Var = gf4Var2.m22434c(m20501E(gf4Var2.f20363a));
                    }
                }
            }
            j11 = 0;
            Pair m24698l2 = mr0Var.m24698l(this.f17731m, this.f17732n, 0, j11);
            Object obj32 = m24698l2.first;
            long longValue2 = ((Long) m24698l2.second).longValue();
            if (!this.f17737s) {
            }
            this.f17733o = m28494r;
            ye4Var = this.f17734p;
            if (ye4Var != null) {
            }
        }
        this.f17737s = true;
        this.f17736r = true;
        m22814w(this.f17733o);
        if (gf4Var != null) {
            ye4 ye4Var4 = this.f17734p;
            ye4Var4.getClass();
            ye4Var4.m28195h(gf4Var);
        }
    }

    /* renamed from: C */
    public final mr0 m20504C() {
        return this.f17733o;
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final ye4 mo20508j(gf4 gf4Var, jj4 jj4Var, long j11) {
        ye4 ye4Var = new ye4(gf4Var, jj4Var, j11, null);
        ye4Var.m28198o(this.f17729k);
        if (this.f17736r) {
            ye4Var.m28195h(gf4Var.m22434c(m20501E(gf4Var.f20363a)));
        } else {
            this.f17734p = ye4Var;
            if (!this.f17735q) {
                this.f17735q = true;
                m25175B(null, this.f17729k);
            }
        }
        return ye4Var;
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: d */
    public final void mo20506d(ef4 ef4Var) {
        ((ye4) ef4Var).m28197m();
        if (ef4Var == this.f17734p) {
            this.f17734p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.oe4, com.google.android.gms.internal.ads.if4
    /* renamed from: g */
    public final void mo20507g() {
    }

    @Override // com.google.android.gms.internal.ads.oe4, com.google.android.gms.internal.ads.he4
    /* renamed from: v */
    public final void mo20509v(dc3 dc3Var) {
        super.mo20509v(dc3Var);
        if (!this.f17730l) {
            this.f17735q = true;
            m25175B(null, this.f17729k);
        }
    }

    @Override // com.google.android.gms.internal.ads.oe4, com.google.android.gms.internal.ads.he4
    /* renamed from: x */
    public final void mo20510x() {
        this.f17736r = false;
        this.f17735q = false;
        super.mo20510x();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.oe4
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ gf4 mo20511z(Object obj, gf4 gf4Var) {
        Object obj2;
        Object obj3;
        Object obj4 = gf4Var.f20363a;
        obj2 = this.f17733o.f31483e;
        if (obj2 != null) {
            obj3 = this.f17733o.f31483e;
            if (obj3.equals(obj4)) {
                obj4 = ze4.f31481f;
            }
        }
        return gf4Var.m22434c(obj4);
    }

    @Override // com.google.android.gms.internal.ads.if4
    public final C4330au zzz() {
        return this.f17729k.zzz();
    }
}
