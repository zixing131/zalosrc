package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.v */
/* loaded from: classes3.dex */
class C6836v implements Iterator {

    /* renamed from: p */
    private Iterator f37502p;

    public C6836v(Iterator it) {
        this.f37502p = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f37502p.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37502p.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f37502p.remove();
    }
}
