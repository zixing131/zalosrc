package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.SendChannel;
import pm0.C24848g0;

/* loaded from: classes7.dex */
class BroadcastCoroutine<E> extends AbstractCoroutine<C24848g0> implements ProducerScope<E>, BroadcastChannel<E> {

    /* renamed from: s */
    private final BroadcastChannel f105992s;

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: B */
    public void mo112917B(InterfaceC18505l interfaceC18505l) {
        this.f105992s.mo112917B(interfaceC18505l);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: H */
    public boolean mo112906H(Throwable th2) {
        boolean mo112906H = this.f105992s.mo112906H(th2);
        start();
        return mo112906H;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: S */
    public Object mo112908S(Object obj, Continuation continuation) {
        return this.f105992s.mo112908S(obj, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: T */
    public boolean mo112909T() {
        return this.f105992s.mo112909T();
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    /* renamed from: a */
    public final void mo112734a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo112497p0(), null, this);
        }
        mo112832m0(cancellationException);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    /* renamed from: c */
    public boolean mo112496c() {
        return super.mo112496c();
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    /* renamed from: m */
    public ReceiveChannel mo112900m() {
        return this.f105992s.mo112900m();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: m0 */
    public void mo112832m0(Throwable th2) {
        CancellationException m112800i1 = JobSupport.m112800i1(this, th2, null, 1, null);
        this.f105992s.mo112899a(m112800i1);
        m112830k0(m112800i1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: p */
    public Object mo112912p(Object obj) {
        return this.f105992s.mo112912p(obj);
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    /* renamed from: q */
    public SendChannel mo112918q() {
        return this;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: q1 */
    protected void mo112499q1(Throwable th2, boolean z11) {
        if (!this.f105992s.mo112906H(th2) && !z11) {
            CoroutineExceptionHandlerKt.m112629a(getContext(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t1 */
    public final BroadcastChannel m112919t1() {
        return this.f105992s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public void mo112500r1(C24848g0 c24848g0) {
        SendChannel.DefaultImpls.m113195a(this.f105992s, null, 1, null);
    }
}
