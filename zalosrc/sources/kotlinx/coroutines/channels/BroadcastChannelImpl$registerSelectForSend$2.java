package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", m145345f = "BroadcastChannel.kt", m145346l = {291}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class BroadcastChannelImpl$registerSelectForSend$2 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f105981t;

    /* renamed from: u */
    final /* synthetic */ BroadcastChannelImpl f105982u;

    /* renamed from: v */
    final /* synthetic */ Object f105983v;

    /* renamed from: w */
    final /* synthetic */ SelectInstance f105984w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$registerSelectForSend$2(BroadcastChannelImpl broadcastChannelImpl, Object obj, SelectInstance selectInstance, Continuation continuation) {
        super(2, continuation);
        this.f105982u = broadcastChannelImpl;
        this.f105983v = obj;
        this.f105984w = selectInstance;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        return new BroadcastChannelImpl$registerSelectForSend$2(this.f105982u, this.f105983v, this.f105984w, continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        HashMap hashMap;
        Object m113072z;
        HashMap hashMap2;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f105981t;
        boolean z11 = true;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                BroadcastChannelImpl broadcastChannelImpl = this.f105982u;
                Object obj2 = this.f105983v;
                this.f105981t = 1;
                if (broadcastChannelImpl.mo112908S(obj2, this) == m142578e) {
                    return m142578e;
                }
            }
        } catch (Throwable th2) {
            if (this.f105982u.mo112909T() && ((th2 instanceof ClosedSendChannelException) || this.f105982u.m113007Y() == th2)) {
                z11 = false;
            } else {
                throw th2;
            }
        }
        ReentrantLock reentrantLock = this.f105982u.f105975C;
        BroadcastChannelImpl broadcastChannelImpl2 = this.f105982u;
        SelectInstance selectInstance = this.f105984w;
        reentrantLock.lock();
        try {
            hashMap = broadcastChannelImpl2.f105978F;
            if (z11) {
                m113072z = C24848g0.f119245a;
            } else {
                m113072z = BufferedChannelKt.m113072z();
            }
            hashMap.put(selectInstance, m113072z);
            AbstractC19074t.m100206d(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C24848g0 c24848g0 = C24848g0.f119245a;
            if (((SelectImplementation) selectInstance).m113860y(broadcastChannelImpl2, c24848g0) != TrySelectDetailedResult.REREGISTER) {
                hashMap2 = broadcastChannelImpl2.f105978F;
                hashMap2.remove(selectInstance);
            }
            reentrantLock.unlock();
            return c24848g0;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BroadcastChannelImpl$registerSelectForSend$2) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
