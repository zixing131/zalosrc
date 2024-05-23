package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: p */
    public final transient FlowCollector f107186p;

    public AbortFlowException(FlowCollector flowCollector) {
        super("Flow was aborted, no more elements needed");
        this.f107186p = flowCollector;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
