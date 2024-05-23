package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.internal.SafeCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

@ExperimentalCoroutinesApi
/* loaded from: classes7.dex */
public abstract class AbstractFlow<T> implements Flow<T>, CancellableFlow<T> {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        AbstractFlow$collect$1 abstractFlow$collect$1;
        Object m142578e;
        int i11;
        Throwable th2;
        SafeCollector safeCollector;
        if (continuation instanceof AbstractFlow$collect$1) {
            abstractFlow$collect$1 = (AbstractFlow$collect$1) continuation;
            int i12 = abstractFlow$collect$1.f106405v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                abstractFlow$collect$1.f106405v = i12 - Integer.MIN_VALUE;
                Object obj = abstractFlow$collect$1.f106403t;
                m142578e = AbstractC28298d.m142578e();
                i11 = abstractFlow$collect$1.f106405v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        safeCollector = (SafeCollector) abstractFlow$collect$1.f106402s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            safeCollector.mo113558p();
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    SafeCollector safeCollector2 = new SafeCollector(flowCollector, abstractFlow$collect$1.getContext());
                    try {
                        abstractFlow$collect$1.f106402s = safeCollector2;
                        abstractFlow$collect$1.f106405v = 1;
                        if (mo113257e(safeCollector2, abstractFlow$collect$1) == m142578e) {
                            return m142578e;
                        }
                        safeCollector = safeCollector2;
                    } catch (Throwable th4) {
                        th2 = th4;
                        safeCollector = safeCollector2;
                        safeCollector.mo113558p();
                        throw th2;
                    }
                }
                safeCollector.mo113558p();
                return C24848g0.f119245a;
            }
        }
        abstractFlow$collect$1 = new AbstractFlow$collect$1(this, continuation);
        Object obj2 = abstractFlow$collect$1.f106403t;
        m142578e = AbstractC28298d.m142578e();
        i11 = abstractFlow$collect$1.f106405v;
        if (i11 == 0) {
        }
        safeCollector.mo113558p();
        return C24848g0.f119245a;
    }

    /* renamed from: e */
    public abstract Object mo113257e(FlowCollector flowCollector, Continuation continuation);
}
