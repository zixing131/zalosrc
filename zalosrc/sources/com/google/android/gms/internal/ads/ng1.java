package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class ng1 {

    /* renamed from: a */
    private final sh1 f25175a;

    /* renamed from: b */
    private final zq0 f25176b;

    public ng1(sh1 sh1Var, zq0 zq0Var) {
        this.f25175a = sh1Var;
        this.f25176b = zq0Var;
    }

    /* renamed from: h */
    public static final if1 m24912h(hw2 hw2Var) {
        return new if1(hw2Var, kl0.f23368f);
    }

    /* renamed from: i */
    public static final if1 m24913i(xh1 xh1Var) {
        return new if1(xh1Var, kl0.f23368f);
    }

    /* renamed from: a */
    public final View m24914a() {
        zq0 zq0Var = this.f25176b;
        if (zq0Var == null) {
            return null;
        }
        return zq0Var.mo26701m();
    }

    /* renamed from: b */
    public final View m24915b() {
        zq0 zq0Var = this.f25176b;
        if (zq0Var != null) {
            return zq0Var.mo26701m();
        }
        return null;
    }

    /* renamed from: c */
    public final zq0 m24916c() {
        return this.f25176b;
    }

    /* renamed from: d */
    public final if1 m24917d(Executor executor) {
        final zq0 zq0Var = this.f25176b;
        return new if1(new mc1() { // from class: com.google.android.gms.internal.ads.lg1
            @Override // com.google.android.gms.internal.ads.mc1
            public final void zza() {
                zq0 zq0Var2 = zq0.this;
                if (zq0Var2.zzN() != null) {
                    zq0Var2.zzN().zzb();
                }
            }
        }, executor);
    }

    /* renamed from: e */
    public final sh1 m24918e() {
        return this.f25175a;
    }

    /* renamed from: f */
    public Set mo24919f(v61 v61Var) {
        return Collections.singleton(new if1(v61Var, kl0.f23368f));
    }

    /* renamed from: g */
    public Set mo24920g(v61 v61Var) {
        return Collections.singleton(new if1(v61Var, kl0.f23368f));
    }
}
