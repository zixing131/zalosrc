package eu;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: eu.a */
/* loaded from: classes4.dex */
public abstract class AbstractC18611a {
    /* renamed from: a */
    public static final long m98345a(Collection collection, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(collection, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "selector");
        Iterator it = collection.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += ((Number) interfaceC18505l.mo205i9(it.next())).longValue();
        }
        return j11;
    }
}
