package kotlinx.coroutines.stream;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class StreamFlow<T> implements Flow<T> {

    /* renamed from: q */
    private static final AtomicIntegerFieldUpdater f107564q = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed");
    private volatile int consumed;

    /* renamed from: p */
    private final Stream f107565p;

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:11:0x0031, B:14:0x0056, B:16:0x005c), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        StreamFlow$collect$1 streamFlow$collect$1;
        Object m142578e;
        int i11;
        StreamFlow<T> streamFlow;
        Iterator it;
        FlowCollector flowCollector2;
        Iterator it2;
        if (continuation instanceof StreamFlow$collect$1) {
            streamFlow$collect$1 = (StreamFlow$collect$1) continuation;
            int i12 = streamFlow$collect$1.f107571x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                streamFlow$collect$1.f107571x = i12 - Integer.MIN_VALUE;
                Object obj = streamFlow$collect$1.f107569v;
                m142578e = AbstractC28298d.m142578e();
                i11 = streamFlow$collect$1.f107571x;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it2 = (Iterator) streamFlow$collect$1.f107568u;
                        FlowCollector flowCollector3 = (FlowCollector) streamFlow$collect$1.f107567t;
                        streamFlow = (StreamFlow) streamFlow$collect$1.f107566s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            flowCollector2 = flowCollector3;
                        } catch (Throwable th2) {
                            th = th2;
                            streamFlow.f107565p.close();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (f107564q.compareAndSet(this, 0, 1)) {
                        try {
                            it = this.f107565p.iterator();
                            streamFlow = this;
                            flowCollector2 = flowCollector;
                            it2 = it;
                        } catch (Throwable th3) {
                            th = th3;
                            streamFlow = this;
                            streamFlow.f107565p.close();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("Stream.consumeAsFlow can be collected only once".toString());
                    }
                }
                while (it2.hasNext()) {
                    Object next = it2.next();
                    streamFlow$collect$1.f107566s = streamFlow;
                    streamFlow$collect$1.f107567t = flowCollector2;
                    streamFlow$collect$1.f107568u = it2;
                    streamFlow$collect$1.f107571x = 1;
                    if (flowCollector2.mo12109b(next, streamFlow$collect$1) == m142578e) {
                        return m142578e;
                    }
                }
                streamFlow.f107565p.close();
                return C24848g0.f119245a;
            }
        }
        streamFlow$collect$1 = new StreamFlow$collect$1(this, continuation);
        Object obj2 = streamFlow$collect$1.f107569v;
        m142578e = AbstractC28298d.m142578e();
        i11 = streamFlow$collect$1.f107571x;
        if (i11 == 0) {
        }
        while (it2.hasNext()) {
        }
        streamFlow.f107565p.close();
        return C24848g0.f119245a;
    }
}
