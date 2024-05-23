package com.google.android.gms.internal.ads;

import p342m6.AbstractC22888j;
import p342m6.InterfaceC22878e;

/* loaded from: classes2.dex */
public abstract class p23 {
    /* renamed from: a */
    public static tc3 m25381a(AbstractC22888j abstractC22888j) {
        final o23 o23Var = new o23(abstractC22888j);
        abstractC22888j.mo117573b(ad3.m20088b(), new InterfaceC22878e() { // from class: com.google.android.gms.internal.ads.n23
            @Override // p342m6.InterfaceC22878e
            /* renamed from: a */
            public final void mo16804a(AbstractC22888j abstractC22888j2) {
                o23 o23Var2 = o23.this;
                if (abstractC22888j2.mo117586o()) {
                    o23Var2.cancel(false);
                    return;
                }
                if (abstractC22888j2.mo117588q()) {
                    o23Var2.mo20863g(abstractC22888j2.mo117584m());
                    return;
                }
                Exception mo117583l = abstractC22888j2.mo117583l();
                if (mo117583l != null) {
                    o23Var2.mo20864h(mo117583l);
                    return;
                }
                throw new IllegalStateException();
            }
        });
        return o23Var;
    }
}
