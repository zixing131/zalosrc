package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes2.dex */
final class de3 implements fe3 {

    /* renamed from: a */
    final /* synthetic */ oj3 f19195a;

    /* renamed from: b */
    final /* synthetic */ zi3 f19196b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public de3(oj3 oj3Var, zi3 zi3Var) {
        this.f19195a = oj3Var;
        this.f19196b = zi3Var;
    }

    @Override // com.google.android.gms.internal.ads.fe3
    /* renamed from: a */
    public final zd3 mo20867a(Class cls) {
        try {
            return new bf3(this.f19195a, this.f19196b, cls);
        } catch (IllegalArgumentException e11) {
            throw new GeneralSecurityException("Primitive type not supported", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.fe3
    public final zd3 zzb() {
        oj3 oj3Var = this.f19195a;
        return new bf3(oj3Var, this.f19196b, oj3Var.m28516g());
    }

    @Override // com.google.android.gms.internal.ads.fe3
    public final Class zzc() {
        return this.f19195a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.fe3
    public final Class zzd() {
        return this.f19196b.getClass();
    }

    @Override // com.google.android.gms.internal.ads.fe3
    public final Set zze() {
        return this.f19195a.m28519j();
    }
}
