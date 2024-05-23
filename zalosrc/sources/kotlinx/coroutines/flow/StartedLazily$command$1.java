package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.C19051f0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.StartedLazily$command$1", m145345f = "SharingStarted.kt", m145346l = {155}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class StartedLazily$command$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107144t;

    /* renamed from: u */
    private /* synthetic */ Object f107145u;

    /* renamed from: v */
    final /* synthetic */ StateFlow f107146v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218611<T> implements FlowCollector {

        /* renamed from: p */
        final /* synthetic */ C19051f0 f107147p;

        /* renamed from: q */
        final /* synthetic */ FlowCollector f107148q;

        C218611(C19051f0 c19051f0, FlowCollector flowCollector) {
            this.f107147p = c19051f0;
            this.f107148q = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m113495a(int i11, Continuation continuation) {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            Object m142578e;
            int i12;
            if (continuation instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) continuation;
                int i13 = startedLazily$command$1$1$emit$1.f107151u;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.f107151u = i13 - Integer.MIN_VALUE;
                    Object obj = startedLazily$command$1$1$emit$1.f107149s;
                    m142578e = AbstractC28298d.m142578e();
                    i12 = startedLazily$command$1$1$emit$1.f107151u;
                    if (i12 == 0) {
                        if (i12 == 1) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        if (i11 > 0) {
                            C19051f0 c19051f0 = this.f107147p;
                            if (!c19051f0.f94928p) {
                                c19051f0.f94928p = true;
                                FlowCollector flowCollector = this.f107148q;
                                SharingCommand sharingCommand = SharingCommand.START;
                                startedLazily$command$1$1$emit$1.f107151u = 1;
                                if (flowCollector.mo12109b(sharingCommand, startedLazily$command$1$1$emit$1) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
            }
            startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
            Object obj2 = startedLazily$command$1$1$emit$1.f107149s;
            m142578e = AbstractC28298d.m142578e();
            i12 = startedLazily$command$1$1$emit$1.f107151u;
            if (i12 == 0) {
            }
            return C24848g0.f119245a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
            return m113495a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(StateFlow stateFlow, Continuation continuation) {
        super(2, continuation);
        this.f107146v = stateFlow;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.f107146v, continuation);
        startedLazily$command$1.f107145u = obj;
        return startedLazily$command$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107144t;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f107145u;
            C19051f0 c19051f0 = new C19051f0();
            StateFlow stateFlow = this.f107146v;
            C218611 c218611 = new C218611(c19051f0, flowCollector);
            this.f107144t = 1;
            if (stateFlow.mo97893a(c218611, this) == m142578e) {
                return m142578e;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
        return ((StartedLazily$command$1) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
    }
}
