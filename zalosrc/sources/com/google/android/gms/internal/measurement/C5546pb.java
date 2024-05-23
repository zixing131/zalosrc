package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.pb */
/* loaded from: classes2.dex */
final class C5546pb implements Iterator {

    /* renamed from: p */
    final Iterator f32723p;

    /* renamed from: q */
    final /* synthetic */ C5563qb f32724q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5546pb(C5563qb c5563qb) {
        InterfaceC5341da interfaceC5341da;
        this.f32724q = c5563qb;
        interfaceC5341da = c5563qb.f32750p;
        this.f32723p = interfaceC5341da.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32723p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f32723p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
