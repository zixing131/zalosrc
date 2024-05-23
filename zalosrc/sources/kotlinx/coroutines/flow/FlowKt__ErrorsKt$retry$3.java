package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", m145345f = "Errors.kt", m145346l = {95}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__ErrorsKt$retry$3 extends AbstractC29104l implements InterfaceC18511r {

    /* renamed from: t */
    int f106675t;

    /* renamed from: u */
    /* synthetic */ Object f106676u;

    /* renamed from: v */
    /* synthetic */ long f106677v;

    /* renamed from: w */
    final /* synthetic */ long f106678w;

    /* renamed from: x */
    final /* synthetic */ InterfaceC18509p f106679x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__ErrorsKt$retry$3(long j11, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(4, continuation);
        this.f106678w = j11;
        this.f106679x = interfaceC18509p;
    }

    @Override // en0.InterfaceC18511r
    /* renamed from: Uc */
    public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
        return m113363r((FlowCollector) obj, (Throwable) obj2, ((Number) obj3).longValue(), (Continuation) obj4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:            if (((java.lang.Boolean) r8).booleanValue() != false) goto L17;     */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106675t;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            Throwable th2 = (Throwable) this.f106676u;
            if (this.f106677v < this.f106678w) {
                InterfaceC18509p interfaceC18509p = this.f106679x;
                this.f106675t = 1;
                obj = interfaceC18509p.mo240pC(th2, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            z11 = false;
            return AbstractC29094b.m145339a(z11);
        }
    }

    /* renamed from: r */
    public final Object m113363r(FlowCollector flowCollector, Throwable th2, long j11, Continuation continuation) {
        FlowKt__ErrorsKt$retry$3 flowKt__ErrorsKt$retry$3 = new FlowKt__ErrorsKt$retry$3(this.f106678w, this.f106679x, continuation);
        flowKt__ErrorsKt$retry$3.f106676u = th2;
        flowKt__ErrorsKt$retry$3.f106677v = j11;
        return flowKt__ErrorsKt$retry$3.mo239o(C24848g0.f119245a);
    }
}
