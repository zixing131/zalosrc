package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p665y0.C30245g;

/* loaded from: classes2.dex */
public final class hk1 {

    /* renamed from: h */
    public static final hk1 f21815h = new hk1(new ek1());

    /* renamed from: a */
    private final m10 f21816a;

    /* renamed from: b */
    private final j10 f21817b;

    /* renamed from: c */
    private final z10 f21818c;

    /* renamed from: d */
    private final w10 f21819d;

    /* renamed from: e */
    private final v60 f21820e;

    /* renamed from: f */
    private final C30245g f21821f;

    /* renamed from: g */
    private final C30245g f21822g;

    public /* synthetic */ hk1(ek1 ek1Var, gk1 gk1Var) {
        this(ek1Var);
    }

    /* renamed from: a */
    public final j10 m22948a() {
        return this.f21817b;
    }

    /* renamed from: b */
    public final m10 m22949b() {
        return this.f21816a;
    }

    /* renamed from: c */
    public final p10 m22950c(String str) {
        return (p10) this.f21822g.get(str);
    }

    /* renamed from: d */
    public final s10 m22951d(String str) {
        return (s10) this.f21821f.get(str);
    }

    /* renamed from: e */
    public final w10 m22952e() {
        return this.f21819d;
    }

    /* renamed from: f */
    public final z10 m22953f() {
        return this.f21818c;
    }

    /* renamed from: g */
    public final v60 m22954g() {
        return this.f21820e;
    }

    /* renamed from: h */
    public final ArrayList m22955h() {
        ArrayList arrayList = new ArrayList(this.f21821f.size());
        for (int i11 = 0; i11 < this.f21821f.size(); i11++) {
            arrayList.add((String) this.f21821f.m149163i(i11));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final ArrayList m22956i() {
        ArrayList arrayList = new ArrayList();
        if (this.f21818c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f21816a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f21817b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f21821f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f21820e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public hk1(ek1 ek1Var) {
        this.f21816a = ek1Var.f19656a;
        this.f21817b = ek1Var.f19657b;
        this.f21818c = ek1Var.f19658c;
        this.f21821f = new C30245g(ek1Var.f19661f);
        this.f21822g = new C30245g(ek1Var.f19662g);
        this.f21819d = ek1Var.f19659d;
        this.f21820e = ek1Var.f19660e;
    }
}
