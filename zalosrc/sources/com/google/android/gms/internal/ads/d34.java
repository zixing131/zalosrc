package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class d34 {

    /* renamed from: a */
    private boolean f19072a;

    /* renamed from: b */
    public v34 f19073b;

    /* renamed from: c */
    public int f19074c;

    /* renamed from: d */
    public boolean f19075d;

    /* renamed from: e */
    public int f19076e;

    /* renamed from: f */
    public boolean f19077f;

    /* renamed from: g */
    public int f19078g;

    public d34(v34 v34Var) {
        this.f19073b = v34Var;
    }

    /* renamed from: a */
    public final void m21258a(int i11) {
        this.f19072a = 1 == ((this.f19072a ? 1 : 0) | i11);
        this.f19074c += i11;
    }

    /* renamed from: b */
    public final void m21259b(int i11) {
        this.f19072a = true;
        this.f19077f = true;
        this.f19078g = i11;
    }

    /* renamed from: c */
    public final void m21260c(v34 v34Var) {
        this.f19072a |= this.f19073b != v34Var;
        this.f19073b = v34Var;
    }

    /* renamed from: d */
    public final void m21261d(int i11) {
        boolean z11 = true;
        if (this.f19075d && this.f19076e != 5) {
            if (i11 != 5) {
                z11 = false;
            }
            v71.m27173d(z11);
        } else {
            this.f19072a = true;
            this.f19075d = true;
            this.f19076e = i11;
        }
    }
}
