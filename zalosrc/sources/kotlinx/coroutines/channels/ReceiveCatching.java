package kotlinx.coroutines.channels;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ReceiveCatching<E> implements Waiter {

    /* renamed from: p */
    public final CancellableContinuationImpl f106302p;

    public ReceiveCatching(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f106302p = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.Waiter
    /* renamed from: b */
    public void mo112580b(Segment segment, int i11) {
        this.f106302p.mo112580b(segment, i11);
    }
}
