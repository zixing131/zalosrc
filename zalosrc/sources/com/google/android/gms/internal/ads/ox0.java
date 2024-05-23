package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ox0 implements j04 {

    /* renamed from: a */
    private final w04 f25984a;

    /* renamed from: b */
    private final w04 f25985b;

    public ox0(w04 w04Var, w04 w04Var2) {
        this.f25984a = w04Var;
        this.f25985b = w04Var2;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* synthetic */ Object zzb() {
        j90 j90Var = new j90();
        String str = (String) this.f25985b.zzb();
        if (((Boolean) AbstractC5260zy.f31718a.m24091e()).booleanValue()) {
            return new i90(j90Var, str);
        }
        return new cl0(str);
    }
}
