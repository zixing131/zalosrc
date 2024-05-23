package p008a2;

import androidx.lifecycle.LiveData;
import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: a2.o */
/* loaded from: classes.dex */
public final class C0078o {

    /* renamed from: a */
    private final AbstractC0086w f314a;

    /* renamed from: b */
    private final Set f315b;

    public C0078o(AbstractC0086w abstractC0086w) {
        AbstractC19074t.m100208f(abstractC0086w, "database");
        this.f314a = abstractC0086w;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC19074t.m100207e(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f315b = newSetFromMap;
    }

    /* renamed from: a */
    public final LiveData m273a(String[] strArr, boolean z11, Callable callable) {
        AbstractC19074t.m100208f(strArr, "tableNames");
        AbstractC19074t.m100208f(callable, "computeFunction");
        return new C0060c0(this.f314a, this, z11, callable, strArr);
    }

    /* renamed from: b */
    public final void m274b(LiveData liveData) {
        AbstractC19074t.m100208f(liveData, "liveData");
        this.f315b.add(liveData);
    }

    /* renamed from: c */
    public final void m275c(LiveData liveData) {
        AbstractC19074t.m100208f(liveData, "liveData");
        this.f315b.remove(liveData);
    }
}
