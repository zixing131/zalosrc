package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class yz3 implements Iterator {

    /* renamed from: p */
    int f31286p = 0;

    /* renamed from: q */
    final /* synthetic */ zz3 f31287q;

    public yz3(zz3 zz3Var) {
        this.f31287q = zz3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f31286p >= this.f31287q.f31737p.size() && !this.f31287q.f31738q.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f31286p < this.f31287q.f31737p.size()) {
            List list = this.f31287q.f31737p;
            int i11 = this.f31286p;
            this.f31286p = i11 + 1;
            return list.get(i11);
        }
        zz3 zz3Var = this.f31287q;
        zz3Var.f31737p.add(zz3Var.f31738q.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
