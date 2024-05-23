package kotlinx.coroutines.channels;

import en0.InterfaceC18510q;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
final class LazyActorCoroutine<E> extends ActorCoroutine<E> {

    /* renamed from: t */
    private Continuation f106293t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public final void m113182w1(SelectInstance selectInstance, Object obj) {
        mo112822Z0();
        super.mo113014l().mo113834a().mo45599Hr(this, selectInstance, obj);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    /* renamed from: H */
    public boolean mo112906H(Throwable th2) {
        boolean mo112906H = super.mo112906H(th2);
        start();
        return mo112906H;
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    /* renamed from: S */
    public Object mo112908S(Object obj, Continuation continuation) {
        Object m142578e;
        start();
        Object mo112908S = super.mo112908S(obj, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo112908S == m142578e) {
            return mo112908S;
        }
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: Z0 */
    protected void mo112822Z0() {
        CancellableKt.m113753c(this.f106293t, this);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    /* renamed from: l */
    public SelectClause2 mo113014l() {
        LazyActorCoroutine$onSend$1 lazyActorCoroutine$onSend$1 = LazyActorCoroutine$onSend$1.f106294y;
        AbstractC19074t.m100206d(lazyActorCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new SelectClause2Impl(this, (InterfaceC18510q) AbstractC19069o0.m100188e(lazyActorCoroutine$onSend$1, 3), super.mo113014l().mo113836c(), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    /* renamed from: p */
    public Object mo112912p(Object obj) {
        start();
        return super.mo112912p(obj);
    }
}
