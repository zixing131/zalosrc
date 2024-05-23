package kotlinx.coroutines.android;

import fn0.AbstractC19060k;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    public /* synthetic */ HandlerDispatcher(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: y */
    public DisposableHandle mo112658y(long j11, Runnable runnable, InterfaceC27315f interfaceC27315f) {
        return Delay.DefaultImpls.m112664a(this, j11, runnable, interfaceC27315f);
    }

    private HandlerDispatcher() {
    }
}
