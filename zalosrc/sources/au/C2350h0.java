package au;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: au.h0 */
/* loaded from: classes4.dex */
public final class C2350h0 {

    /* renamed from: a */
    public static final C2350h0 f9867a = new C2350h0();

    /* renamed from: b */
    private static final ArrayList f9868b = new ArrayList();

    /* renamed from: au.h0$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: A */
        void mo12326A();
    }

    private C2350h0() {
    }

    /* renamed from: a */
    public final void m12323a(a aVar) {
        AbstractC19074t.m100208f(aVar, "observer");
        f9868b.add(aVar);
    }

    /* renamed from: b */
    public final void m12324b() {
        Iterator it = f9868b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo12326A();
        }
    }

    /* renamed from: c */
    public final void m12325c(a aVar) {
        AbstractC19074t.m100208f(aVar, "observer");
        f9868b.remove(aVar);
    }
}
