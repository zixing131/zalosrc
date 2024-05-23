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

@InterfaceC29098f(m145344c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", m145345f = "SelectOld.kt", m145346l = {43}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class SelectBuilderImpl$getResult$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107509t;

    /* renamed from: u */
    final /* synthetic */ SelectBuilderImpl f107510u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectBuilderImpl$getResult$1(SelectBuilderImpl selectBuilderImpl, Continuation continuation) {
        super(2, continuation);
        this.f107510u = selectBuilderImpl;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        return new SelectBuilderImpl$getResult$1(this.f107510u, continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        CancellableContinuationImpl cancellableContinuationImpl;
        CancellableContinuationImpl cancellableContinuationImpl2;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107509t;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                SelectBuilderImpl selectBuilderImpl = this.f107510u;
                this.f107509t = 1;
                obj = selectBuilderImpl.mo113858p(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            cancellableContinuationImpl2 = this.f107510u.f107508v;
            SelectOldKt.m113879c(cancellableContinuationImpl2, obj);
            return C24848g0.f119245a;
        } catch (Throwable th2) {
            cancellableContinuationImpl = this.f107510u.f107508v;
            SelectOldKt.m113880d(cancellableContinuationImpl, th2);
            return C24848g0.f119245a;
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SelectBuilderImpl$getResult$1) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
