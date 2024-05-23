package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class i04 implements w04, d04 {

    /* renamed from: c */
    private static final Object f22005c = new Object();

    /* renamed from: a */
    private volatile w04 f22006a;

    /* renamed from: b */
    private volatile Object f22007b = f22005c;

    private i04(w04 w04Var) {
        this.f22006a = w04Var;
    }

    /* renamed from: a */
    public static d04 m23103a(w04 w04Var) {
        if (w04Var instanceof d04) {
            return (d04) w04Var;
        }
        w04Var.getClass();
        return new i04(w04Var);
    }

    /* renamed from: b */
    public static w04 m23104b(w04 w04Var) {
        w04Var.getClass();
        if (w04Var instanceof i04) {
            return w04Var;
        }
        return new i04(w04Var);
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final Object zzb() {
        Object obj = this.f22007b;
        Object obj2 = f22005c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f22007b;
                    if (obj == obj2) {
                        obj = this.f22006a.zzb();
                        Object obj3 = this.f22007b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f22007b = obj;
                        this.f22006a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
