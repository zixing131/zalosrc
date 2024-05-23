package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.dynamic.f */
/* loaded from: classes2.dex */
public final class C4275f implements InterfaceC4274e {

    /* renamed from: a */
    final /* synthetic */ AbstractC4270a f16808a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4275f(AbstractC4270a abstractC4270a) {
        this.f16808a = abstractC4270a;
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4274e
    /* renamed from: a */
    public final void mo19915a(InterfaceC4272c interfaceC4272c) {
        LinkedList linkedList;
        LinkedList linkedList2;
        InterfaceC4272c interfaceC4272c2;
        this.f16808a.f16803a = interfaceC4272c;
        linkedList = this.f16808a.f16805c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            InterfaceC4280k interfaceC4280k = (InterfaceC4280k) it.next();
            interfaceC4272c2 = this.f16808a.f16803a;
            interfaceC4280k.mo19917b(interfaceC4272c2);
        }
        linkedList2 = this.f16808a.f16805c;
        linkedList2.clear();
        this.f16808a.f16804b = null;
    }
}
