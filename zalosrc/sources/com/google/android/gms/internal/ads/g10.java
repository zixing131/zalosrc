package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class g10 {

    /* renamed from: a */
    public final Object f20363a;

    /* renamed from: b */
    public final int f20364b;

    /* renamed from: c */
    public final int f20365c;

    /* renamed from: d */
    public final long f20366d;

    /* renamed from: e */
    public final int f20367e;

    /* JADX INFO: Access modifiers changed from: protected */
    public g10(g10 g10Var) {
        this.f20363a = g10Var.f20363a;
        this.f20364b = g10Var.f20364b;
        this.f20365c = g10Var.f20365c;
        this.f20366d = g10Var.f20366d;
        this.f20367e = g10Var.f20367e;
    }

    /* renamed from: a */
    public final g10 m22261a(Object obj) {
        if (this.f20363a.equals(obj)) {
            return this;
        }
        return new g10(obj, this.f20364b, this.f20365c, this.f20366d, this.f20367e);
    }

    /* renamed from: b */
    public final boolean m22262b() {
        return this.f20364b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g10)) {
            return false;
        }
        g10 g10Var = (g10) obj;
        if (this.f20363a.equals(g10Var.f20363a) && this.f20364b == g10Var.f20364b && this.f20365c == g10Var.f20365c && this.f20366d == g10Var.f20366d && this.f20367e == g10Var.f20367e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f20363a.hashCode() + 527) * 31) + this.f20364b) * 31) + this.f20365c) * 31) + ((int) this.f20366d)) * 31) + this.f20367e;
    }

    private g10(Object obj, int i11, int i12, long j11, int i13) {
        this.f20363a = obj;
        this.f20364b = i11;
        this.f20365c = i12;
        this.f20366d = j11;
        this.f20367e = i13;
    }

    public g10(Object obj, int i11, int i12, long j11) {
        this(obj, i11, i12, j11, -1);
    }

    public g10(Object obj, long j11) {
        this(obj, -1, -1, j11, -1);
    }

    public g10(Object obj, long j11, int i11) {
        this(obj, -1, -1, j11, i11);
    }
}
