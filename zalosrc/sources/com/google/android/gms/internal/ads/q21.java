package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class q21 {

    /* renamed from: b */
    public static final q21 f26605b = new q21(c83.m20832w());

    /* renamed from: c */
    public static final g94 f26606c = nz0.f25378a;

    /* renamed from: a */
    private final c83 f26607a;

    public q21(List list) {
        this.f26607a = c83.m20830u(list);
    }

    /* renamed from: a */
    public final c83 m25630a() {
        return this.f26607a;
    }

    /* renamed from: b */
    public final boolean m25631b(int i11) {
        for (int i12 = 0; i12 < this.f26607a.size(); i12++) {
            p11 p11Var = (p11) this.f26607a.get(i12);
            if (p11Var.m25375c() && p11Var.m25373a() == i11) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q21.class == obj.getClass()) {
            return this.f26607a.equals(((q21) obj).f26607a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26607a.hashCode();
    }
}
