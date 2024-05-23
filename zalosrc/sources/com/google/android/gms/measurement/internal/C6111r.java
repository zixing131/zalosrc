package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.r */
/* loaded from: classes.dex */
final class C6111r implements Iterator {

    /* renamed from: p */
    final Iterator f34385p;

    /* renamed from: q */
    final /* synthetic */ zzau f34386q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6111r(zzau zzauVar) {
        Bundle bundle;
        this.f34386q = zzauVar;
        bundle = zzauVar.f34675p;
        this.f34385p = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f34385p.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34385p.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
