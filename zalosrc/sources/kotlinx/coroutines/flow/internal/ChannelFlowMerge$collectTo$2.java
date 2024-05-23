package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Semaphore;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ChannelFlowMerge$collectTo$2<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ Job f107204p;

    /* renamed from: q */
    final /* synthetic */ Semaphore f107205q;

    /* renamed from: r */
    final /* synthetic */ ProducerScope f107206r;

    /* renamed from: s */
    final /* synthetic */ SendingCollector f107207s;

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", m145345f = "Merge.kt", m145346l = {69}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 */
    /* loaded from: classes7.dex */
    public static final class C218621 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f107208t;

        /* renamed from: u */
        final /* synthetic */ Flow f107209u;

        /* renamed from: v */
        final /* synthetic */ SendingCollector f107210v;

        /* renamed from: w */
        final /* synthetic */ Semaphore f107211w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218621(Flow flow, SendingCollector sendingCollector, Semaphore semaphore, Continuation continuation) {
            super(2, continuation);
            this.f107209u = flow;
            this.f107210v = sendingCollector;
            this.f107211w = semaphore;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C218621(this.f107209u, this.f107210v, this.f107211w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f107208t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow flow = this.f107209u;
                    SendingCollector sendingCollector = this.f107210v;
                    this.f107208t = 1;
                    if (flow.mo97893a(sendingCollector, this) == m142578e) {
                        return m142578e;
                    }
                }
                this.f107211w.release();
                return C24848g0.f119245a;
            } catch (Throwable th2) {
                this.f107211w.release();
                throw th2;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C218621) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelFlowMerge$collectTo$2(Job job, Semaphore semaphore, ProducerScope producerScope, SendingCollector sendingCollector) {
        this.f107204p = job;
        this.f107205q = semaphore;
        this.f107206r = producerScope;
        this.f107207s = sendingCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Flow flow, Continuation continuation) {
        ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
        Object m142578e;
        int i11;
        ChannelFlowMerge$collectTo$2<T> channelFlowMerge$collectTo$2;
        if (continuation instanceof ChannelFlowMerge$collectTo$2$emit$1) {
            channelFlowMerge$collectTo$2$emit$1 = (ChannelFlowMerge$collectTo$2$emit$1) continuation;
            int i12 = channelFlowMerge$collectTo$2$emit$1.f107216w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelFlowMerge$collectTo$2$emit$1.f107216w = i12 - Integer.MIN_VALUE;
                Object obj = channelFlowMerge$collectTo$2$emit$1.f107214u;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelFlowMerge$collectTo$2$emit$1.f107216w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        flow = (Flow) channelFlowMerge$collectTo$2$emit$1.f107213t;
                        channelFlowMerge$collectTo$2 = (ChannelFlowMerge$collectTo$2) channelFlowMerge$collectTo$2$emit$1.f107212s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Job job = this.f107204p;
                    if (job != null) {
                        JobKt.m112757j(job);
                    }
                    Semaphore semaphore = this.f107205q;
                    channelFlowMerge$collectTo$2$emit$1.f107212s = this;
                    channelFlowMerge$collectTo$2$emit$1.f107213t = flow;
                    channelFlowMerge$collectTo$2$emit$1.f107216w = 1;
                    if (semaphore.mo113914a(channelFlowMerge$collectTo$2$emit$1) == m142578e) {
                        return m142578e;
                    }
                    channelFlowMerge$collectTo$2 = this;
                }
                BuildersKt__Builders_commonKt.m112540d(channelFlowMerge$collectTo$2.f107206r, null, null, new C218621(flow, channelFlowMerge$collectTo$2.f107207s, channelFlowMerge$collectTo$2.f107205q, null), 3, null);
                return C24848g0.f119245a;
            }
        }
        channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, continuation);
        Object obj2 = channelFlowMerge$collectTo$2$emit$1.f107214u;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelFlowMerge$collectTo$2$emit$1.f107216w;
        if (i11 == 0) {
        }
        BuildersKt__Builders_commonKt.m112540d(channelFlowMerge$collectTo$2.f107206r, null, null, new C218621(flow, channelFlowMerge$collectTo$2.f107207s, channelFlowMerge$collectTo$2.f107205q, null), 3, null);
        return C24848g0.f119245a;
    }
}
