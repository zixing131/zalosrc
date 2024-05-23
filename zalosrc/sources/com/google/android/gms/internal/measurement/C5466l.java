package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.l */
/* loaded from: classes2.dex */
public final class C5466l implements Iterator {

    /* renamed from: p */
    final /* synthetic */ Iterator f32470p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5466l(Iterator it) {
        this.f32470p = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32470p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C5619u((String) this.f32470p.next());
    }
}
