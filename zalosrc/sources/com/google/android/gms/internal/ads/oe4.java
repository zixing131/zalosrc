package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class oe4 extends he4 {

    /* renamed from: h */
    private final HashMap f25614h = new HashMap();

    /* renamed from: i */
    private Handler f25615i;

    /* renamed from: j */
    private dc3 f25616j;

    /* renamed from: A */
    public abstract void mo20503A(Object obj, if4 if4Var, mr0 mr0Var);

    /* renamed from: B */
    public final void m25175B(Object obj, if4 if4Var) {
        v71.m27173d(!this.f25614h.containsKey(obj));
        hf4 le4Var = new hf4() { // from class: com.google.android.gms.internal.ads.le4

            /* renamed from: b */
            public final /* synthetic */ Object f23897b;

            public /* synthetic */ le4(Object obj2) {
                r2 = obj2;
            }

            @Override // com.google.android.gms.internal.ads.hf4
            /* renamed from: a */
            public final void mo22819a(if4 if4Var2, mr0 mr0Var) {
                oe4.this.mo20503A(r2, if4Var2, mr0Var);
            }
        };
        me4 me4Var = new me4(this, obj2);
        this.f25614h.put(obj2, new ne4(if4Var, le4Var, me4Var));
        Handler handler = this.f25615i;
        handler.getClass();
        if4Var.mo22803k(handler, me4Var);
        Handler handler2 = this.f25615i;
        handler2.getClass();
        if4Var.mo22806n(handler2, me4Var);
        if4Var.mo22805m(le4Var, this.f25616j, m22807o());
        if (!m22815y()) {
            if4Var.mo22804l(le4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: g */
    public void mo20507g() {
        Iterator it = this.f25614h.values().iterator();
        while (it.hasNext()) {
            ((ne4) it.next()).f25165a.mo20507g();
        }
    }

    @Override // com.google.android.gms.internal.ads.he4
    /* renamed from: t */
    protected final void mo22812t() {
        for (ne4 ne4Var : this.f25614h.values()) {
            ne4Var.f25165a.mo22804l(ne4Var.f25166b);
        }
    }

    @Override // com.google.android.gms.internal.ads.he4
    /* renamed from: u */
    protected final void mo22813u() {
        for (ne4 ne4Var : this.f25614h.values()) {
            ne4Var.f25165a.mo22802i(ne4Var.f25166b);
        }
    }

    @Override // com.google.android.gms.internal.ads.he4
    /* renamed from: v */
    public void mo20509v(dc3 dc3Var) {
        this.f25616j = dc3Var;
        this.f25615i = g92.m22339d(null);
    }

    @Override // com.google.android.gms.internal.ads.he4
    /* renamed from: x */
    public void mo20510x() {
        for (ne4 ne4Var : this.f25614h.values()) {
            ne4Var.f25165a.mo22798b(ne4Var.f25166b);
            ne4Var.f25165a.mo22801h(ne4Var.f25167c);
            ne4Var.f25165a.mo22800f(ne4Var.f25167c);
        }
        this.f25614h.clear();
    }

    /* renamed from: z */
    public abstract gf4 mo20511z(Object obj, gf4 gf4Var);
}
