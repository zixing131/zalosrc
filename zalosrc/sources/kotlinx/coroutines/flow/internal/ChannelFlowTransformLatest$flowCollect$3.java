package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m145345f = "Merge.kt", m145346l = {27}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelFlowTransformLatest$flowCollect$3 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107222t;

    /* renamed from: u */
    private /* synthetic */ Object f107223u;

    /* renamed from: v */
    final /* synthetic */ ChannelFlowTransformLatest f107224v;

    /* renamed from: w */
    final /* synthetic */ FlowCollector f107225w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 */
    /* loaded from: classes7.dex */
    public static final class C218631<T> implements FlowCollector {

        /* renamed from: p */
        final /* synthetic */ C19059j0 f107226p;

        /* renamed from: q */
        final /* synthetic */ CoroutineScope f107227q;

        /* renamed from: r */
        final /* synthetic */ ChannelFlowTransformLatest f107228r;

        /* renamed from: s */
        final /* synthetic */ FlowCollector f107229s;

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m145345f = "Merge.kt", m145346l = {34}, m145347m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        /* loaded from: classes7.dex */
        public static final class AnonymousClass2 extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f107230t;

            /* renamed from: u */
            final /* synthetic */ ChannelFlowTransformLatest f107231u;

            /* renamed from: v */
            final /* synthetic */ FlowCollector f107232v;

            /* renamed from: w */
            final /* synthetic */ Object f107233w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ChannelFlowTransformLatest channelFlowTransformLatest, FlowCollector flowCollector, Object obj, Continuation continuation) {
                super(2, continuation);
                this.f107231u = channelFlowTransformLatest;
                this.f107232v = flowCollector;
                this.f107233w = obj;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f107231u, this.f107232v, this.f107233w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                InterfaceC18510q interfaceC18510q;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f107230t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    interfaceC18510q = this.f107231u.f107221t;
                    FlowCollector flowCollector = this.f107232v;
                    Object obj2 = this.f107233w;
                    this.f107230t = 1;
                    if (interfaceC18510q.mo45599Hr(flowCollector, obj2, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C218631(C19059j0 c19059j0, CoroutineScope coroutineScope, ChannelFlowTransformLatest channelFlowTransformLatest, FlowCollector flowCollector) {
            this.f107226p = c19059j0;
            this.f107227q = coroutineScope;
            this.f107228r = channelFlowTransformLatest;
            this.f107229s = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo12109b(Object obj, Continuation continuation) {
            ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
            Object m142578e;
            int i11;
            C218631<T> c218631;
            Job m112540d;
            if (continuation instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) continuation;
                int i12 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f107239x;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f107239x = i12 - Integer.MIN_VALUE;
                    Object obj2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f107237v;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f107239x;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.f107235t;
                            c218631 = (C218631) channelFlowTransformLatest$flowCollect$3$1$emit$1.f107234s;
                            AbstractC24862s.m129228b(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        Job job = (Job) this.f107226p.f94941p;
                        if (job != null) {
                            job.mo112734a(new ChildCancelledException());
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.f107234s = this;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.f107235t = obj;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.f107236u = job;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.f107239x = 1;
                            if (job.mo112736c0(channelFlowTransformLatest$flowCollect$3$1$emit$1) == m142578e) {
                                return m142578e;
                            }
                        }
                        c218631 = this;
                    }
                    C19059j0 c19059j0 = c218631.f107226p;
                    m112540d = BuildersKt__Builders_commonKt.m112540d(c218631.f107227q, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(c218631.f107228r, c218631.f107229s, obj, null), 1, null);
                    c19059j0.f94941p = m112540d;
                    return C24848g0.f119245a;
                }
            }
            channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
            Object obj22 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f107237v;
            m142578e = AbstractC28298d.m142578e();
            i11 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f107239x;
            if (i11 == 0) {
            }
            C19059j0 c19059j02 = c218631.f107226p;
            m112540d = BuildersKt__Builders_commonKt.m112540d(c218631.f107227q, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(c218631.f107228r, c218631.f107229s, obj, null), 1, null);
            c19059j02.f94941p = m112540d;
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest channelFlowTransformLatest, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f107224v = channelFlowTransformLatest;
        this.f107225w = flowCollector;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.f107224v, this.f107225w, continuation);
        channelFlowTransformLatest$flowCollect$3.f107223u = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107222t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f107223u;
            C19059j0 c19059j0 = new C19059j0();
            ChannelFlowTransformLatest channelFlowTransformLatest = this.f107224v;
            Flow flow = channelFlowTransformLatest.f107217s;
            C218631 c218631 = new C218631(c19059j0, coroutineScope, channelFlowTransformLatest, this.f107225w);
            this.f107222t = 1;
            if (flow.mo97893a(c218631, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChannelFlowTransformLatest$flowCollect$3) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
