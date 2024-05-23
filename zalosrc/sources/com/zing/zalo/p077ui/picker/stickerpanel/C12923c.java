package com.zing.zalo.p077ui.picker.stickerpanel;

import androidx.lifecycle.InterfaceC1764d0;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.InterfaceC19066n;
import pm0.InterfaceC24847g;

/* renamed from: com.zing.zalo.ui.picker.stickerpanel.c */
/* loaded from: classes6.dex */
final /* synthetic */ class C12923c implements InterfaceC1764d0, InterfaceC19066n {

    /* renamed from: p */
    private final /* synthetic */ InterfaceC18505l f67007p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12923c(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "function");
        this.f67007p = interfaceC18505l;
    }

    @Override // fn0.InterfaceC19066n
    /* renamed from: c */
    public final InterfaceC24847g mo9368c() {
        return this.f67007p;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
            return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
        }
        return false;
    }

    public final int hashCode() {
        return mo9368c().hashCode();
    }

    @Override // androidx.lifecycle.InterfaceC1764d0
    /* renamed from: qp */
    public final /* synthetic */ void mo8524qp(Object obj) {
        this.f67007p.mo205i9(obj);
    }
}
