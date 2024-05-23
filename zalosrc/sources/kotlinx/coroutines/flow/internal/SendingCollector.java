package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.C24848g0;
import vm0.AbstractC28298d;

@InternalCoroutinesApi
/* loaded from: classes7.dex */
public final class SendingCollector<T> implements FlowCollector<T> {

    /* renamed from: p */
    private final SendChannel f107329p;

    public SendingCollector(SendChannel sendChannel) {
        this.f107329p = sendChannel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    public Object mo12109b(Object obj, Continuation continuation) {
        Object m142578e;
        Object mo112908S = this.f107329p.mo112908S(obj, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo112908S == m142578e) {
            return mo112908S;
        }
        return C24848g0.f119245a;
    }
}
