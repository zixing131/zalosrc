package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class z64 {

    /* renamed from: a */
    private final String f31389a;

    /* renamed from: b */
    private int f31390b;

    /* renamed from: c */
    private long f31391c;

    /* renamed from: d */
    private gf4 f31392d;

    /* renamed from: e */
    private boolean f31393e;

    /* renamed from: f */
    private boolean f31394f;

    /* renamed from: g */
    final /* synthetic */ a74 f31395g;

    public z64(a74 a74Var, String str, int i11, gf4 gf4Var) {
        this.f31395g = a74Var;
        this.f31389a = str;
        this.f31390b = i11;
        this.f31391c = gf4Var == null ? -1L : gf4Var.f20366d;
        if (gf4Var == null || !gf4Var.m22262b()) {
            return;
        }
        this.f31392d = gf4Var;
    }

    /* renamed from: g */
    public final void m28448g(int i11, gf4 gf4Var) {
        if (this.f31391c == -1 && i11 == this.f31390b && gf4Var != null) {
            this.f31391c = gf4Var.f20366d;
        }
    }

    /* renamed from: j */
    public final boolean m28449j(int i11, gf4 gf4Var) {
        if (gf4Var == null) {
            return i11 == this.f31390b;
        }
        gf4 gf4Var2 = this.f31392d;
        return gf4Var2 == null ? !gf4Var.m22262b() && gf4Var.f20366d == this.f31391c : gf4Var.f20366d == gf4Var2.f20366d && gf4Var.f20364b == gf4Var2.f20364b && gf4Var.f20365c == gf4Var2.f20365c;
    }

    /* renamed from: k */
    public final boolean m28450k(s44 s44Var) {
        long j11 = this.f31391c;
        if (j11 == -1) {
            return false;
        }
        gf4 gf4Var = s44Var.f27540d;
        if (gf4Var == null) {
            if (this.f31390b == s44Var.f27539c) {
                return false;
            }
            return true;
        }
        if (gf4Var.f20366d > j11) {
            return true;
        }
        if (this.f31392d == null) {
            return false;
        }
        int mo20105a = s44Var.f27538b.mo20105a(gf4Var.f20363a);
        int mo20105a2 = s44Var.f27538b.mo20105a(this.f31392d.f20363a);
        gf4 gf4Var2 = s44Var.f27540d;
        if (gf4Var2.f20366d < this.f31392d.f20366d || mo20105a < mo20105a2) {
            return false;
        }
        if (mo20105a > mo20105a2) {
            return true;
        }
        if (gf4Var2.m22262b()) {
            gf4 gf4Var3 = s44Var.f27540d;
            int i11 = gf4Var3.f20364b;
            int i12 = gf4Var3.f20365c;
            gf4 gf4Var4 = this.f31392d;
            int i13 = gf4Var4.f20364b;
            if (i11 <= i13 && (i11 != i13 || i12 <= gf4Var4.f20365c)) {
                return false;
            }
            return true;
        }
        int i14 = s44Var.f27540d.f20367e;
        if (i14 != -1 && i14 <= this.f31392d.f20364b) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:            if (r0 < r8.mo20107c()) goto L15;     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m28451l(mr0 mr0Var, mr0 mr0Var2) {
        int i11 = this.f31390b;
        if (i11 < mr0Var.mo20107c()) {
            mr0Var.mo20109e(i11, a74.m20022h(this.f31395g), 0L);
            for (int i12 = a74.m20022h(this.f31395g).f22942m; i12 <= a74.m20022h(this.f31395g).f22943n; i12++) {
                int mo20105a = mr0Var2.mo20105a(mr0Var.mo20110f(i12));
                if (mo20105a != -1) {
                    i11 = mr0Var2.mo20108d(mo20105a, a74.m20021g(this.f31395g), false).f21855c;
                    break;
                }
            }
            i11 = -1;
        }
        this.f31390b = i11;
        if (i11 == -1) {
            return false;
        }
        gf4 gf4Var = this.f31392d;
        if (gf4Var != null && mr0Var2.mo20105a(gf4Var.f20363a) == -1) {
            return false;
        }
        return true;
    }
}
