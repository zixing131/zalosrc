package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* loaded from: classes7.dex */
final class LazyBroadcastCoroutine<E> extends BroadcastCoroutine<E> {

    /* renamed from: t */
    private final Continuation f106295t;

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: Z0 */
    protected void mo112822Z0() {
        CancellableKt.m113753c(this.f106295t, this);
    }

    @Override // kotlinx.coroutines.channels.BroadcastCoroutine, kotlinx.coroutines.channels.BroadcastChannel
    /* renamed from: m */
    public ReceiveChannel mo112900m() {
        ReceiveChannel mo112900m = m112919t1().mo112900m();
        start();
        return mo112900m;
    }
}
