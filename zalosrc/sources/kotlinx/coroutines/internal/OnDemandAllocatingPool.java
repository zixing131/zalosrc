package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import ln0.AbstractC22543l;
import ln0.C22537f;
import qm0.AbstractC25351j0;
import qm0.AbstractC25370t;

/* loaded from: classes7.dex */
public final class OnDemandAllocatingPool<T> {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f107407b = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState");

    /* renamed from: a */
    private final AtomicReferenceArray f107408a;
    private volatile int controlState;

    /* renamed from: a */
    public final String m113693a() {
        C22537f m116593p;
        int m131511r;
        String str;
        int i11 = f107407b.get(this);
        m116593p = AbstractC22543l.m116593p(0, Integer.MAX_VALUE & i11);
        m131511r = AbstractC25370t.m131511r(m116593p, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator<T> it = m116593p.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f107408a.get(((AbstractC25351j0) it).mo116552a()));
        }
        String obj = arrayList.toString();
        if ((i11 & Integer.MIN_VALUE) != 0) {
            str = "[closed]";
        } else {
            str = "";
        }
        return obj + str;
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + m113693a() + ')';
    }
}
