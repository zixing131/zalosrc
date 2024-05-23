package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.play_billing.b3 */
/* loaded from: classes2.dex */
final class C5732b3 implements Iterator {

    /* renamed from: p */
    final Iterator f33245p;

    /* renamed from: q */
    final /* synthetic */ C5739c3 f33246q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5732b3(C5739c3 c5739c3) {
        InterfaceC5822q1 interfaceC5822q1;
        this.f33246q = c5739c3;
        interfaceC5822q1 = c5739c3.f33247p;
        this.f33245p = interfaceC5822q1.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33245p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f33245p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
