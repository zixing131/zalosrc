package kotlinx.coroutines;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m145345f = "Interruptible.kt", m145346l = {}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class InterruptibleKt$runInterruptible$2 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f105890t;

    /* renamed from: u */
    private /* synthetic */ Object f105891u;

    /* renamed from: v */
    final /* synthetic */ InterfaceC18494a f105892v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterruptibleKt$runInterruptible$2(InterfaceC18494a interfaceC18494a, Continuation continuation) {
        super(2, continuation);
        this.f105892v = interfaceC18494a;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.f105892v, continuation);
        interruptibleKt$runInterruptible$2.f105891u = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m112730b;
        AbstractC28298d.m142578e();
        if (this.f105890t == 0) {
            AbstractC24862s.m129228b(obj);
            m112730b = InterruptibleKt.m112730b(((CoroutineScope) this.f105891u).mo9207O(), this.f105892v);
            return m112730b;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((InterruptibleKt$runInterruptible$2) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
