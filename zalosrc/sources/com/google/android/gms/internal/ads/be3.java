package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class be3 implements zd3 {

    /* renamed from: a */
    private final zi3 f17721a;

    /* renamed from: b */
    private final Class f17722b;

    public be3(zi3 zi3Var, Class cls) {
        if (!zi3Var.m28519j().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zi3Var.toString(), cls.getName()));
        }
        this.f17721a = zi3Var;
        this.f17722b = cls;
    }

    /* renamed from: e */
    private final ae3 m20490e() {
        return new ae3(this.f17721a.mo20513a());
    }

    /* renamed from: f */
    private final Object m20491f(zv3 zv3Var) {
        if (!Void.class.equals(this.f17722b)) {
            this.f17721a.mo20516d(zv3Var);
            return this.f17721a.m28518i(zv3Var, this.f17722b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    @Override // com.google.android.gms.internal.ads.zd3
    /* renamed from: a */
    public final Object mo20492a(mt3 mt3Var) {
        try {
            return m20491f(this.f17721a.mo20514b(mt3Var));
        } catch (zzgrq e11) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f17721a.m28517h().getName()), e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zd3
    /* renamed from: b */
    public final Object mo20493b(zv3 zv3Var) {
        String concat = "Expected proto of type ".concat(this.f17721a.m28517h().getName());
        if (this.f17721a.m28517h().isInstance(zv3Var)) {
            return m20491f(zv3Var);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.ads.zd3
    /* renamed from: c */
    public final zv3 mo20494c(mt3 mt3Var) {
        try {
            return m20490e().m20097a(mt3Var);
        } catch (zzgrq e11) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f17721a.mo20513a().m28220e().getName()), e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zd3
    /* renamed from: d */
    public final jp3 mo20495d(mt3 mt3Var) {
        try {
            zv3 m20097a = m20490e().m20097a(mt3Var);
            ip3 m23711F = jp3.m23711F();
            m23711F.m23314q(this.f17721a.mo20515c());
            m23711F.m23315r(m20097a.mo27347h());
            m23711F.m23316s(this.f17721a.mo20517f());
            return (jp3) m23711F.m25898n();
        } catch (zzgrq e11) {
            throw new GeneralSecurityException("Unexpected proto", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zd3
    public final String zzf() {
        return this.f17721a.mo20515c();
    }
}
