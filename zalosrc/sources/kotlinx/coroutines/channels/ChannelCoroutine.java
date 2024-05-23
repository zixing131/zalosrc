package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause2;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public class ChannelCoroutine<E> extends AbstractCoroutine<C24848g0> implements Channel<E> {

    /* renamed from: s */
    private final Channel f106066s;

    public ChannelCoroutine(InterfaceC27315f interfaceC27315f, Channel channel, boolean z11, boolean z12) {
        super(interfaceC27315f, z11, z12);
        this.f106066s = channel;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: B */
    public void mo112917B(InterfaceC18505l interfaceC18505l) {
        this.f106066s.mo112917B(interfaceC18505l);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: H */
    public boolean mo112906H(Throwable th2) {
        return this.f106066s.mo112906H(th2);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: S */
    public Object mo112908S(Object obj, Continuation continuation) {
        return this.f106066s.mo112908S(obj, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: T */
    public boolean mo112909T() {
        return this.f106066s.mo112909T();
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    /* renamed from: a */
    public final void mo112734a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo112497p0(), null, this);
        }
        mo112832m0(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator iterator() {
        return this.f106066s.iterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: l */
    public SelectClause2 mo113014l() {
        return this.f106066s.mo113014l();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: m0 */
    public void mo112832m0(Throwable th2) {
        CancellationException m112800i1 = JobSupport.m112800i1(this, th2, null, 1, null);
        this.f106066s.mo113009a(m112800i1);
        m112830k0(m112800i1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: p */
    public Object mo112912p(Object obj) {
        return this.f106066s.mo112912p(obj);
    }

    /* renamed from: t1 */
    public final Channel m113075t1() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: u */
    public SelectClause1 mo113016u() {
        return this.f106066s.mo113016u();
    }

    /* renamed from: u1 */
    public final Channel m113076u1() {
        return this.f106066s;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: w */
    public SelectClause1 mo113017w() {
        return this.f106066s.mo113017w();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: x */
    public Object mo113019x() {
        return this.f106066s.mo113019x();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: z */
    public Object mo113021z(Continuation continuation) {
        Object mo113021z = this.f106066s.mo113021z(continuation);
        AbstractC28298d.m142578e();
        return mo113021z;
    }
}
