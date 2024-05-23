package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", m145345f = "Combine.kt", m145346l = {126}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class CombineKt$zipImpl$1$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107267t;

    /* renamed from: u */
    private /* synthetic */ Object f107268u;

    /* renamed from: v */
    final /* synthetic */ FlowCollector f107269v;

    /* renamed from: w */
    final /* synthetic */ Flow f107270w;

    /* renamed from: x */
    final /* synthetic */ Flow f107271x;

    /* renamed from: y */
    final /* synthetic */ InterfaceC18510q f107272y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218651 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ CompletableJob f107273q;

        /* renamed from: r */
        final /* synthetic */ FlowCollector f107274r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218651(CompletableJob completableJob, FlowCollector flowCollector) {
            super(1);
            this.f107273q = completableJob;
            this.f107274r = flowCollector;
        }

        /* renamed from: a */
        public final void m113546a(Throwable th2) {
            if (this.f107273q.mo112496c()) {
                this.f107273q.mo112734a(new AbortFlowException(this.f107274r));
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m113546a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", m145345f = "Combine.kt", m145346l = {127}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 */
    /* loaded from: classes7.dex */
    public static final class C218662 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f107275t;

        /* renamed from: u */
        final /* synthetic */ Flow f107276u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC27315f f107277v;

        /* renamed from: w */
        final /* synthetic */ Object f107278w;

        /* renamed from: x */
        final /* synthetic */ ReceiveChannel f107279x;

        /* renamed from: y */
        final /* synthetic */ FlowCollector f107280y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC18510q f107281z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* loaded from: classes7.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ InterfaceC27315f f107282p;

            /* renamed from: q */
            final /* synthetic */ Object f107283q;

            /* renamed from: r */
            final /* synthetic */ ReceiveChannel f107284r;

            /* renamed from: s */
            final /* synthetic */ FlowCollector f107285s;

            /* renamed from: t */
            final /* synthetic */ InterfaceC18510q f107286t;

            /* JADX INFO: Access modifiers changed from: package-private */
            @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", m145345f = "Combine.kt", m145346l = {129, 132, 132}, m145347m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C328741 extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                Object f107287t;

                /* renamed from: u */
                int f107288u;

                /* renamed from: v */
                final /* synthetic */ ReceiveChannel f107289v;

                /* renamed from: w */
                final /* synthetic */ FlowCollector f107290w;

                /* renamed from: x */
                final /* synthetic */ InterfaceC18510q f107291x;

                /* renamed from: y */
                final /* synthetic */ Object f107292y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C328741(ReceiveChannel receiveChannel, FlowCollector flowCollector, InterfaceC18510q interfaceC18510q, Object obj, Continuation continuation) {
                    super(2, continuation);
                    this.f107289v = receiveChannel;
                    this.f107290w = flowCollector;
                    this.f107291x = interfaceC18510q;
                    this.f107292y = obj;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C328741(this.f107289v, this.f107290w, this.f107291x, this.f107292y, continuation);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[RETURN] */
                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo239o(Object obj) {
                    Object m142578e;
                    Object mo113021z;
                    FlowCollector flowCollector;
                    m142578e = AbstractC28298d.m142578e();
                    int i11 = this.f107288u;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    AbstractC24862s.m129228b(obj);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            flowCollector = (FlowCollector) this.f107287t;
                            AbstractC24862s.m129228b(obj);
                            this.f107287t = null;
                            this.f107288u = 3;
                            if (flowCollector.mo12109b(obj, this) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        AbstractC24862s.m129228b(obj);
                        mo113021z = ((ChannelResult) obj).m113090k();
                    } else {
                        AbstractC24862s.m129228b(obj);
                        ReceiveChannel receiveChannel = this.f107289v;
                        this.f107288u = 1;
                        mo113021z = receiveChannel.mo113021z(this);
                        if (mo113021z == m142578e) {
                            return m142578e;
                        }
                    }
                    flowCollector = this.f107290w;
                    if (mo113021z instanceof ChannelResult.Failed) {
                        Throwable m113084e = ChannelResult.m113084e(mo113021z);
                        if (m113084e == null) {
                            throw new AbortFlowException(flowCollector);
                        }
                        throw m113084e;
                    }
                    InterfaceC18510q interfaceC18510q = this.f107291x;
                    Object obj2 = this.f107292y;
                    if (mo113021z == NullSurrogateKt.f107313a) {
                        mo113021z = null;
                    }
                    this.f107287t = flowCollector;
                    this.f107288u = 2;
                    obj = interfaceC18510q.mo45599Hr(obj2, mo113021z, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    this.f107287t = null;
                    this.f107288u = 3;
                    if (flowCollector.mo12109b(obj, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(C24848g0 c24848g0, Continuation continuation) {
                    return ((C328741) mo238a(c24848g0, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            AnonymousClass1(InterfaceC27315f interfaceC27315f, Object obj, ReceiveChannel receiveChannel, FlowCollector flowCollector, InterfaceC18510q interfaceC18510q) {
                this.f107282p = interfaceC27315f;
                this.f107283q = obj;
                this.f107284r = receiveChannel;
                this.f107285s = flowCollector;
                this.f107286t = interfaceC18510q;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
                Object m142578e;
                int i11;
                if (continuation instanceof CombineKt$zipImpl$1$1$2$1$emit$1) {
                    combineKt$zipImpl$1$1$2$1$emit$1 = (CombineKt$zipImpl$1$1$2$1$emit$1) continuation;
                    int i12 = combineKt$zipImpl$1$1$2$1$emit$1.f107295u;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        combineKt$zipImpl$1$1$2$1$emit$1.f107295u = i12 - Integer.MIN_VALUE;
                        Object obj2 = combineKt$zipImpl$1$1$2$1$emit$1.f107293s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = combineKt$zipImpl$1$1$2$1$emit$1.f107295u;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            InterfaceC27315f interfaceC27315f = this.f107282p;
                            C24848g0 c24848g0 = C24848g0.f119245a;
                            Object obj3 = this.f107283q;
                            C328741 c328741 = new C328741(this.f107284r, this.f107285s, this.f107286t, obj, null);
                            combineKt$zipImpl$1$1$2$1$emit$1.f107295u = 1;
                            if (ChannelFlowKt.m113528c(interfaceC27315f, c24848g0, obj3, c328741, combineKt$zipImpl$1$1$2$1$emit$1) == m142578e) {
                                return m142578e;
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, continuation);
                Object obj22 = combineKt$zipImpl$1$1$2$1$emit$1.f107293s;
                m142578e = AbstractC28298d.m142578e();
                i11 = combineKt$zipImpl$1$1$2$1$emit$1.f107295u;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218662(Flow flow, InterfaceC27315f interfaceC27315f, Object obj, ReceiveChannel receiveChannel, FlowCollector flowCollector, InterfaceC18510q interfaceC18510q, Continuation continuation) {
            super(2, continuation);
            this.f107276u = flow;
            this.f107277v = interfaceC27315f;
            this.f107278w = obj;
            this.f107279x = receiveChannel;
            this.f107280y = flowCollector;
            this.f107281z = interfaceC18510q;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C218662(this.f107276u, this.f107277v, this.f107278w, this.f107279x, this.f107280y, this.f107281z, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f107275t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = this.f107276u;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f107277v, this.f107278w, this.f107279x, this.f107280y, this.f107281z);
                this.f107275t = 1;
                if (flow.mo97893a(anonymousClass1, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(C24848g0 c24848g0, Continuation continuation) {
            return ((C218662) mo238a(c24848g0, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(FlowCollector flowCollector, Flow flow, Flow flow2, InterfaceC18510q interfaceC18510q, Continuation continuation) {
        super(2, continuation);
        this.f107269v = flowCollector;
        this.f107270w = flow;
        this.f107271x = flow2;
        this.f107272y = interfaceC18510q;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.f107269v, this.f107270w, this.f107271x, this.f107272y, continuation);
        combineKt$zipImpl$1$1.f107268u = obj;
        return combineKt$zipImpl$1$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        CompletableJob m112763b;
        ReceiveChannel receiveChannel;
        ReceiveChannel receiveChannel2;
        InterfaceC27315f mo112823d0;
        C24848g0 c24848g0;
        C218662 c218662;
        m142578e = AbstractC28298d.m142578e();
        ?? r12 = this.f107267t;
        try {
            if (r12 != 0) {
                if (r12 == 1) {
                    receiveChannel2 = (ReceiveChannel) this.f107268u;
                    try {
                        AbstractC24862s.m129228b(obj);
                        r12 = receiveChannel2;
                    } catch (AbortFlowException e11) {
                        e = e11;
                    }
                    ReceiveChannel.DefaultImpls.m113193a(r12, null, 1, null);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f107268u;
            ReceiveChannel m113188e = ProduceKt.m113188e(coroutineScope, null, 0, new CombineKt$zipImpl$1$1$second$1(this.f107270w, null), 3, null);
            m112763b = JobKt__JobKt.m112763b(null, 1, null);
            AbstractC19074t.m100206d(m113188e, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
            ((SendChannel) m113188e).mo112917B(new C218651(m112763b, this.f107269v));
            try {
                InterfaceC27315f mo9207O = coroutineScope.mo9207O();
                Object m113730b = ThreadContextKt.m113730b(mo9207O);
                mo112823d0 = coroutineScope.mo9207O().mo112823d0(m112763b);
                c24848g0 = C24848g0.f119245a;
                c218662 = new C218662(this.f107271x, mo9207O, m113730b, m113188e, this.f107269v, this.f107272y, null);
                this.f107268u = m113188e;
                this.f107267t = 1;
                receiveChannel = m113188e;
                try {
                } catch (AbortFlowException e12) {
                    e = e12;
                    receiveChannel2 = receiveChannel;
                    FlowExceptions_commonKt.m113553a(e, this.f107269v);
                    r12 = receiveChannel2;
                    ReceiveChannel.DefaultImpls.m113193a(r12, null, 1, null);
                    return C24848g0.f119245a;
                } catch (Throwable th2) {
                    th = th2;
                    r12 = receiveChannel;
                    ReceiveChannel.DefaultImpls.m113193a(r12, null, 1, null);
                    throw th;
                }
            } catch (AbortFlowException e13) {
                e = e13;
                receiveChannel = m113188e;
            } catch (Throwable th3) {
                th = th3;
                receiveChannel = m113188e;
            }
            if (ChannelFlowKt.m113529d(mo112823d0, c24848g0, null, c218662, this, 4, null) == m142578e) {
                return m142578e;
            }
            r12 = receiveChannel;
            ReceiveChannel.DefaultImpls.m113193a(r12, null, 1, null);
            return C24848g0.f119245a;
            FlowExceptions_commonKt.m113553a(e, this.f107269v);
            r12 = receiveChannel2;
            ReceiveChannel.DefaultImpls.m113193a(r12, null, 1, null);
            return C24848g0.f119245a;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CombineKt$zipImpl$1$1) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
