package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes2.dex */
final class ce3 implements fe3 {

    /* renamed from: a */
    final /* synthetic */ zi3 f18381a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ce3(zi3 zi3Var) {
        this.f18381a = zi3Var;
    }

    @Override // com.google.android.gms.internal.ads.fe3
    /* renamed from: a */
    public final zd3 mo20867a(Class cls) {
        try {
            return new be3(this.f18381a, cls);
        } catch (IllegalArgumentException e11) {
            throw new GeneralSecurityException("Primitive type not supported", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.fe3
    public final zd3 zzb() {
        zi3 zi3Var = this.f18381a;
        return new be3(zi3Var, zi3Var.m28516g());
    }

    @Override // com.google.android.gms.internal.ads.fe3
    public final Class zzc() {
        return this.f18381a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.fe3
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fe3
    public final Set zze() {
        return this.f18381a.m28519j();
    }
}
