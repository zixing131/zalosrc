package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class rs2 {

    /* renamed from: a */
    private final qs2 f27367a = new qs2();

    /* renamed from: b */
    private int f27368b;

    /* renamed from: c */
    private int f27369c;

    /* renamed from: d */
    private int f27370d;

    /* renamed from: e */
    private int f27371e;

    /* renamed from: f */
    private int f27372f;

    /* renamed from: a */
    public final qs2 m26159a() {
        qs2 clone = this.f27367a.clone();
        qs2 qs2Var = this.f27367a;
        qs2Var.f26949p = false;
        qs2Var.f26950q = false;
        return clone;
    }

    /* renamed from: b */
    public final String m26160b() {
        return "\n\tPool does not exist: " + this.f27370d + "\n\tNew pools created: " + this.f27368b + "\n\tPools removed: " + this.f27369c + "\n\tEntries added: " + this.f27372f + "\n\tNo entries retrieved: " + this.f27371e + "\n";
    }

    /* renamed from: c */
    public final void m26161c() {
        this.f27372f++;
    }

    /* renamed from: d */
    public final void m26162d() {
        this.f27368b++;
        this.f27367a.f26949p = true;
    }

    /* renamed from: e */
    public final void m26163e() {
        this.f27371e++;
    }

    /* renamed from: f */
    public final void m26164f() {
        this.f27370d++;
    }

    /* renamed from: g */
    public final void m26165g() {
        this.f27369c++;
        this.f27367a.f26950q = true;
    }
}
