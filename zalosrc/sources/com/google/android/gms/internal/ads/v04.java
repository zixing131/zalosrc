package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class v04 implements w04 {

    /* renamed from: c */
    private static final Object f29108c = new Object();

    /* renamed from: a */
    private volatile w04 f29109a;

    /* renamed from: b */
    private volatile Object f29110b = f29108c;

    private v04(w04 w04Var) {
        this.f29109a = w04Var;
    }

    /* renamed from: a */
    public static w04 m27116a(w04 w04Var) {
        if (!(w04Var instanceof v04) && !(w04Var instanceof i04)) {
            w04Var.getClass();
            return new v04(w04Var);
        }
        return w04Var;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final Object zzb() {
        Object obj = this.f29110b;
        if (obj == f29108c) {
            w04 w04Var = this.f29109a;
            if (w04Var == null) {
                return this.f29110b;
            }
            Object zzb = w04Var.zzb();
            this.f29110b = zzb;
            this.f29109a = null;
            return zzb;
        }
        return obj;
    }
}
