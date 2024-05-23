package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p358n7.AbstractC23599c;

/* renamed from: com.google.common.collect.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6522f {

    /* renamed from: com.google.common.collect.f$a */
    /* loaded from: classes3.dex */
    static class a extends AbstractC6530n {

        /* renamed from: p */
        boolean f36361p;

        /* renamed from: q */
        final /* synthetic */ Object f36362q;

        a(Object obj) {
            this.f36362q = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f36361p;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f36361p) {
                this.f36361p = true;
                return this.f36362q;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: a */
    public static boolean m33433a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC23599c.m123729a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* renamed from: b */
    public static AbstractC6530n m33434b(Object obj) {
        return new a(obj);
    }
}
