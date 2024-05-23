package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class cj3 {

    /* renamed from: a */
    public static final vk3 f18452a = new bj3(null);

    /* renamed from: a */
    public static bl3 m20910a(ze3 ze3Var) {
        he3 he3Var;
        xk3 xk3Var = new xk3();
        xk3Var.m27925b(ze3Var.m28488b());
        Iterator it = ze3Var.m28490d().iterator();
        while (it.hasNext()) {
            for (te3 te3Var : (List) it.next()) {
                int m26605e = te3Var.m26605e() - 2;
                if (m26605e != 1) {
                    if (m26605e != 2) {
                        if (m26605e == 3) {
                            he3Var = he3.f21653d;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        he3Var = he3.f21652c;
                    }
                } else {
                    he3Var = he3.f21651b;
                }
                xk3Var.m27924a(he3Var, te3Var.m26601a(), te3Var.m26602b());
            }
        }
        if (ze3Var.m28487a() != null) {
            xk3Var.m27926c(ze3Var.m28487a().m26601a());
        }
        try {
            return xk3Var.m27927d();
        } catch (GeneralSecurityException e11) {
            throw new IllegalStateException(e11);
        }
    }
}
