package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class h04 implements j04 {

    /* renamed from: a */
    private w04 f21498a;

    /* renamed from: a */
    public static void m22673a(w04 w04Var, w04 w04Var2) {
        h04 h04Var = (h04) w04Var;
        if (h04Var.f21498a == null) {
            h04Var.f21498a = w04Var2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final Object zzb() {
        w04 w04Var = this.f21498a;
        if (w04Var != null) {
            return w04Var.zzb();
        }
        throw new IllegalStateException();
    }
}
