package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class bj4 {

    /* renamed from: a */
    public final int f17771a;

    /* renamed from: b */
    public final e44[] f17772b;

    /* renamed from: c */
    public final ui4[] f17773c;

    /* renamed from: d */
    public final q21 f17774d;

    /* renamed from: e */
    public final Object f17775e;

    public bj4(e44[] e44VarArr, ui4[] ui4VarArr, q21 q21Var, Object obj) {
        this.f17772b = e44VarArr;
        this.f17773c = (ui4[]) ui4VarArr.clone();
        this.f17774d = q21Var;
        this.f17775e = obj;
        this.f17771a = e44VarArr.length;
    }

    /* renamed from: a */
    public final boolean m20531a(bj4 bj4Var, int i11) {
        if (bj4Var == null || !g92.m22362t(this.f17772b[i11], bj4Var.f17772b[i11]) || !g92.m22362t(this.f17773c[i11], bj4Var.f17773c[i11])) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m20532b(int i11) {
        if (this.f17772b[i11] != null) {
            return true;
        }
        return false;
    }
}
