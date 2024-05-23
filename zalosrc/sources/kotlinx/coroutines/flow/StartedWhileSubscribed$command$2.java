package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", m145345f = "SharingStarted.kt", m145346l = {}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class StartedWhileSubscribed$command$2 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107158t;

    /* renamed from: u */
    /* synthetic */ Object f107159u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StartedWhileSubscribed$command$2(Continuation continuation) {
        super(2, continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(continuation);
        startedWhileSubscribed$command$2.f107159u = obj;
        return startedWhileSubscribed$command$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        boolean z11;
        AbstractC28298d.m142578e();
        if (this.f107158t == 0) {
            AbstractC24862s.m129228b(obj);
            if (((SharingCommand) this.f107159u) != SharingCommand.START) {
                z11 = true;
            } else {
                z11 = false;
            }
            return AbstractC29094b.m145339a(z11);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(SharingCommand sharingCommand, Continuation continuation) {
        return ((StartedWhileSubscribed$command$2) mo238a(sharingCommand, continuation)).mo239o(C24848g0.f119245a);
    }
}
