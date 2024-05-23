package androidx.lifecycle;

import fn0.AbstractC19074t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.z0 */
/* loaded from: classes.dex */
public class C1808z0 {

    /* renamed from: a */
    private final Map f7434a = new LinkedHashMap();

    /* renamed from: a */
    public final void m9414a() {
        Iterator it = this.f7434a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC1796t0) it.next()).m9370F();
        }
        this.f7434a.clear();
    }

    /* renamed from: b */
    public final AbstractC1796t0 m9415b(String str) {
        AbstractC19074t.m100208f(str, "key");
        return (AbstractC1796t0) this.f7434a.get(str);
    }

    /* renamed from: c */
    public final Set m9416c() {
        return new HashSet(this.f7434a.keySet());
    }

    /* renamed from: d */
    public final void m9417d(String str, AbstractC1796t0 abstractC1796t0) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(abstractC1796t0, "viewModel");
        AbstractC1796t0 abstractC1796t02 = (AbstractC1796t0) this.f7434a.put(str, abstractC1796t0);
        if (abstractC1796t02 != null) {
            abstractC1796t02.mo9130J();
        }
    }
}
