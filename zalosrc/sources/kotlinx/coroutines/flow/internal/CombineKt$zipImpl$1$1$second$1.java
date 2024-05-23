package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", m145345f = "Combine.kt", m145346l = {89}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class CombineKt$zipImpl$1$1$second$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107296t;

    /* renamed from: u */
    private /* synthetic */ Object f107297u;

    /* renamed from: v */
    final /* synthetic */ Flow f107298v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218671<T> implements FlowCollector {

        /* renamed from: p */
        final /* synthetic */ ProducerScope f107299p;

        C218671(ProducerScope producerScope) {
            this.f107299p = producerScope;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo12109b(Object obj, Continuation continuation) {
            CombineKt$zipImpl$1$1$second$1$1$emit$1 combineKt$zipImpl$1$1$second$1$1$emit$1;
            Object m142578e;
            int i11;
            if (continuation instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) continuation;
                int i12 = combineKt$zipImpl$1$1$second$1$1$emit$1.f107302u;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    combineKt$zipImpl$1$1$second$1$1$emit$1.f107302u = i12 - Integer.MIN_VALUE;
                    Object obj2 = combineKt$zipImpl$1$1$second$1$1$emit$1.f107300s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = combineKt$zipImpl$1$1$second$1$1$emit$1.f107302u;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        SendChannel mo112918q = this.f107299p.mo112918q();
                        if (obj == null) {
                            obj = NullSurrogateKt.f107313a;
                        }
                        combineKt$zipImpl$1$1$second$1$1$emit$1.f107302u = 1;
                        if (mo112918q.mo112908S(obj, combineKt$zipImpl$1$1$second$1$1$emit$1) == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24848g0.f119245a;
                }
            }
            combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, continuation);
            Object obj22 = combineKt$zipImpl$1$1$second$1$1$emit$1.f107300s;
            m142578e = AbstractC28298d.m142578e();
            i11 = combineKt$zipImpl$1$1$second$1$1$emit$1.f107302u;
            if (i11 == 0) {
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$second$1(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.f107298v = flow;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$1 = new CombineKt$zipImpl$1$1$second$1(this.f107298v, continuation);
        combineKt$zipImpl$1$1$second$1.f107297u = obj;
        return combineKt$zipImpl$1$1$second$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107296t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            ProducerScope producerScope = (ProducerScope) this.f107297u;
            Flow flow = this.f107298v;
            C218671 c218671 = new C218671(producerScope);
            this.f107296t = 1;
            if (flow.mo97893a(c218671, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((CombineKt$zipImpl$1$1$second$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
