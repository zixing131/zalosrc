package com.google.android.gms.common.internal;

import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p669y4.AbstractC30286c;
import p669y4.InterfaceC30289f;

/* renamed from: com.google.android.gms.common.internal.n */
/* loaded from: classes2.dex */
public abstract class AbstractC4202n {

    /* renamed from: a */
    private static final InterfaceC4200m0 f16635a = new C4191j0();

    /* renamed from: com.google.android.gms.common.internal.n$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        Object mo19135a(InterfaceC30289f interfaceC30289f);
    }

    /* renamed from: a */
    public static AbstractC22888j m19709a(AbstractC30286c abstractC30286c, a aVar) {
        InterfaceC4200m0 interfaceC4200m0 = f16635a;
        C22890k c22890k = new C22890k();
        abstractC30286c.mo19276a(new C4194k0(abstractC30286c, c22890k, aVar, interfaceC4200m0));
        return c22890k.m117594a();
    }

    /* renamed from: b */
    public static AbstractC22888j m19710b(AbstractC30286c abstractC30286c) {
        return m19709a(abstractC30286c, new C4197l0());
    }
}
