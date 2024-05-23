package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class he4 implements if4 {

    /* renamed from: a */
    private final ArrayList f21655a = new ArrayList(1);

    /* renamed from: b */
    private final HashSet f21656b = new HashSet(1);

    /* renamed from: c */
    private final pf4 f21657c = new pf4();

    /* renamed from: d */
    private final dc4 f21658d = new dc4();

    /* renamed from: e */
    private Looper f21659e;

    /* renamed from: f */
    private mr0 f21660f;

    /* renamed from: g */
    private i94 f21661g;

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: a */
    public final /* synthetic */ boolean mo22797a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: b */
    public final void mo22798b(hf4 hf4Var) {
        this.f21655a.remove(hf4Var);
        if (this.f21655a.isEmpty()) {
            this.f21659e = null;
            this.f21660f = null;
            this.f21661g = null;
            this.f21656b.clear();
            mo20510x();
            return;
        }
        mo22804l(hf4Var);
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: e */
    public final /* synthetic */ mr0 mo22799e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: f */
    public final void mo22800f(ec4 ec4Var) {
        this.f21658d.m21347c(ec4Var);
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: h */
    public final void mo22801h(qf4 qf4Var) {
        this.f21657c.m25453m(qf4Var);
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: i */
    public final void mo22802i(hf4 hf4Var) {
        this.f21659e.getClass();
        boolean isEmpty = this.f21656b.isEmpty();
        this.f21656b.add(hf4Var);
        if (isEmpty) {
            mo22813u();
        }
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: k */
    public final void mo22803k(Handler handler, qf4 qf4Var) {
        qf4Var.getClass();
        this.f21657c.m25442b(handler, qf4Var);
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: l */
    public final void mo22804l(hf4 hf4Var) {
        boolean isEmpty = this.f21656b.isEmpty();
        this.f21656b.remove(hf4Var);
        if ((!isEmpty) && this.f21656b.isEmpty()) {
            mo22812t();
        }
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: m */
    public final void mo22805m(hf4 hf4Var, dc3 dc3Var, i94 i94Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f21659e;
        boolean z11 = true;
        if (looper != null && looper != myLooper) {
            z11 = false;
        }
        v71.m27173d(z11);
        this.f21661g = i94Var;
        mr0 mr0Var = this.f21660f;
        this.f21655a.add(hf4Var);
        if (this.f21659e == null) {
            this.f21659e = myLooper;
            this.f21656b.add(hf4Var);
            mo20509v(dc3Var);
        } else if (mr0Var != null) {
            mo22802i(hf4Var);
            hf4Var.mo22819a(this, mr0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: n */
    public final void mo22806n(Handler handler, ec4 ec4Var) {
        ec4Var.getClass();
        this.f21658d.m21346b(handler, ec4Var);
    }

    /* renamed from: o */
    public final i94 m22807o() {
        i94 i94Var = this.f21661g;
        v71.m27171b(i94Var);
        return i94Var;
    }

    /* renamed from: p */
    public final dc4 m22808p(gf4 gf4Var) {
        return this.f21658d.m21345a(0, gf4Var);
    }

    /* renamed from: q */
    public final dc4 m22809q(int i11, gf4 gf4Var) {
        return this.f21658d.m21345a(i11, gf4Var);
    }

    /* renamed from: r */
    public final pf4 m22810r(gf4 gf4Var) {
        return this.f21657c.m25441a(0, gf4Var, 0L);
    }

    /* renamed from: s */
    public final pf4 m22811s(int i11, gf4 gf4Var, long j11) {
        return this.f21657c.m25441a(i11, gf4Var, 0L);
    }

    /* renamed from: t */
    protected void mo22812t() {
    }

    /* renamed from: u */
    protected void mo22813u() {
    }

    /* renamed from: v */
    protected abstract void mo20509v(dc3 dc3Var);

    /* renamed from: w */
    public final void m22814w(mr0 mr0Var) {
        this.f21660f = mr0Var;
        ArrayList arrayList = this.f21655a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((hf4) arrayList.get(i11)).mo22819a(this, mr0Var);
        }
    }

    /* renamed from: x */
    protected abstract void mo20510x();

    /* renamed from: y */
    public final boolean m22815y() {
        if (!this.f21656b.isEmpty()) {
            return true;
        }
        return false;
    }
}
