package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d */
/* loaded from: classes2.dex */
final class C5330d implements Iterator {

    /* renamed from: p */
    final /* synthetic */ Iterator f32322p;

    /* renamed from: q */
    final /* synthetic */ Iterator f32323q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5330d(C5364f c5364f, Iterator it, Iterator it2) {
        this.f32322p = it;
        this.f32323q = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f32322p.hasNext()) {
            return true;
        }
        return this.f32323q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f32322p.hasNext()) {
            return new C5619u(((Integer) this.f32322p.next()).toString());
        }
        if (this.f32323q.hasNext()) {
            return new C5619u((String) this.f32323q.next());
        }
        throw new NoSuchElementException();
    }
}
