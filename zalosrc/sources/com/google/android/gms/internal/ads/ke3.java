package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class ke3 {

    /* renamed from: a */
    private final xp3 f23295a;

    /* renamed from: b */
    private final uk3 f23296b = uk3.f28966b;

    private ke3(xp3 xp3Var) {
        this.f23295a = xp3Var;
    }

    /* renamed from: a */
    public static final ke3 m23930a(xp3 xp3Var) {
        if (xp3Var != null && xp3Var.m27972F() > 0) {
            return new ke3(xp3Var);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: b */
    public static final ke3 m23931b(ie3 ie3Var) {
        le3 m24262d = le3.m24262d();
        m24262d.m24269c(ie3Var.m23235a());
        return m24262d.m24268b();
    }

    /* renamed from: c */
    public final xp3 m23932c() {
        return this.f23295a;
    }

    /* renamed from: d */
    public final Object m23933d(Class cls) {
        Class m21371e = df3.m21371e(cls);
        if (m21371e != null) {
            ef3.m21703b(this.f23295a);
            se3 se3Var = new se3(m21371e, null);
            se3Var.m26295c(this.f23296b);
            for (wp3 wp3Var : this.f23295a.m27974L()) {
                if (wp3Var.m27686M() == 3) {
                    Object m21372f = df3.m21372f(wp3Var.m27684G(), m21371e);
                    if (wp3Var.m27683F() == this.f23295a.m27973G()) {
                        se3Var.m26293a(m21372f, wp3Var);
                    } else {
                        se3Var.m26294b(m21372f, wp3Var);
                    }
                }
            }
            return df3.m21375i(se3Var.m26296d(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final String toString() {
        return ef3.m21702a(this.f23295a).toString();
    }
}
