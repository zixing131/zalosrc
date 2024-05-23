package p008a2;

import fn0.AbstractC19074t;
import java.util.Map;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* renamed from: a2.g */
/* loaded from: classes2.dex */
public abstract class AbstractC0067g {
    /* renamed from: a */
    public static final CoroutineDispatcher m253a(AbstractC0086w abstractC0086w) {
        AbstractC19074t.m100208f(abstractC0086w, "<this>");
        Map m349l = abstractC0086w.m349l();
        Object obj = m349l.get("QueryDispatcher");
        if (obj == null) {
            obj = ExecutorsKt.m112727a(abstractC0086w.m353p());
            m349l.put("QueryDispatcher", obj);
        }
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) obj;
    }

    /* renamed from: b */
    public static final CoroutineDispatcher m254b(AbstractC0086w abstractC0086w) {
        AbstractC19074t.m100208f(abstractC0086w, "<this>");
        Map m349l = abstractC0086w.m349l();
        Object obj = m349l.get("TransactionDispatcher");
        if (obj == null) {
            obj = ExecutorsKt.m112727a(abstractC0086w.m356s());
            m349l.put("TransactionDispatcher", obj);
        }
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) obj;
    }
}
