package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

@ObsoleteCoroutinesApi
/* loaded from: classes7.dex */
public final class ConflatedBroadcastChannel<E> implements BroadcastChannel<E> {

    /* renamed from: p */
    private final BroadcastChannelImpl f106290p;

    private ConflatedBroadcastChannel(BroadcastChannelImpl broadcastChannelImpl) {
        this.f106290p = broadcastChannelImpl;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: B */
    public void mo112917B(InterfaceC18505l interfaceC18505l) {
        this.f106290p.mo112917B(interfaceC18505l);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: H */
    public boolean mo112906H(Throwable th2) {
        return this.f106290p.mo112906H(th2);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: S */
    public Object mo112908S(Object obj, Continuation continuation) {
        return this.f106290p.mo112908S(obj, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: T */
    public boolean mo112909T() {
        return this.f106290p.mo112909T();
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    /* renamed from: a */
    public void mo112899a(CancellationException cancellationException) {
        this.f106290p.mo113009a(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    /* renamed from: m */
    public ReceiveChannel mo112900m() {
        return this.f106290p.mo112900m();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: p */
    public Object mo112912p(Object obj) {
        return this.f106290p.mo112912p(obj);
    }

    public ConflatedBroadcastChannel() {
        this(new BroadcastChannelImpl(-1));
    }
}
