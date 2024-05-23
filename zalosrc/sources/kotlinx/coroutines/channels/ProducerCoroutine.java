package kotlinx.coroutines.channels;

import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.channels.SendChannel;
import pm0.C24848g0;
import um0.InterfaceC27315f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ProducerCoroutine<E> extends ChannelCoroutine<E> implements ProducerScope<E> {
    public ProducerCoroutine(InterfaceC27315f interfaceC27315f, Channel channel) {
        super(interfaceC27315f, channel, true, true);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    /* renamed from: c */
    public boolean mo112496c() {
        return super.mo112496c();
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    /* renamed from: q */
    public /* bridge */ /* synthetic */ SendChannel mo112918q() {
        return m113075t1();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: q1 */
    protected void mo112499q1(Throwable th2, boolean z11) {
        if (!m113076u1().mo112906H(th2) && !z11) {
            CoroutineExceptionHandlerKt.m112629a(getContext(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public void mo112500r1(C24848g0 c24848g0) {
        SendChannel.DefaultImpls.m113195a(m113076u1(), null, 1, null);
    }
}
