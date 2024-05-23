package kotlinx.coroutines.selects;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1", m145345f = "SelectOld.kt", m145346l = {71}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class UnbiasedSelectBuilderImpl$initSelectResult$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107558t;

    /* renamed from: u */
    final /* synthetic */ UnbiasedSelectBuilderImpl f107559u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnbiasedSelectBuilderImpl$initSelectResult$1(UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl, Continuation continuation) {
        super(2, continuation);
        this.f107559u = unbiasedSelectBuilderImpl;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        return new UnbiasedSelectBuilderImpl$initSelectResult$1(this.f107559u, continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        CancellableContinuationImpl cancellableContinuationImpl;
        CancellableContinuationImpl cancellableContinuationImpl2;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107558t;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = this.f107559u;
                this.f107558t = 1;
                obj = unbiasedSelectBuilderImpl.mo113858p(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            cancellableContinuationImpl2 = this.f107559u.f107557w;
            SelectOldKt.m113879c(cancellableContinuationImpl2, obj);
            return C24848g0.f119245a;
        } catch (Throwable th2) {
            cancellableContinuationImpl = this.f107559u.f107557w;
            SelectOldKt.m113880d(cancellableContinuationImpl, th2);
            return C24848g0.f119245a;
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UnbiasedSelectBuilderImpl$initSelectResult$1) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
