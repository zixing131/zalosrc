package kotlinx.coroutines.debug.internal;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import nn0.AbstractC23900i;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29103k;
import wm0.InterfaceC29097e;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", m145345f = "DebugCoroutineInfoImpl.kt", m145346l = {158}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class DebugCoroutineInfoImpl$creationStackTrace$1 extends AbstractC29103k implements InterfaceC18509p {

    /* renamed from: r */
    int f106363r;

    /* renamed from: s */
    private /* synthetic */ Object f106364s;

    /* renamed from: t */
    final /* synthetic */ DebugCoroutineInfoImpl f106365t;

    /* renamed from: u */
    final /* synthetic */ StackTraceFrame f106366u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$creationStackTrace$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, StackTraceFrame stackTraceFrame, Continuation continuation) {
        super(2, continuation);
        this.f106365t = debugCoroutineInfoImpl;
        this.f106366u = stackTraceFrame;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.f106365t, this.f106366u, continuation);
        debugCoroutineInfoImpl$creationStackTrace$1.f106364s = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        Object m113235i;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106363r;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            AbstractC23900i abstractC23900i = (AbstractC23900i) this.f106364s;
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = this.f106365t;
            InterfaceC29097e mo112582e = this.f106366u.mo112582e();
            this.f106363r = 1;
            m113235i = debugCoroutineInfoImpl.m113235i(abstractC23900i, mo112582e, this);
            if (m113235i == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(AbstractC23900i abstractC23900i, Continuation continuation) {
        return ((DebugCoroutineInfoImpl$creationStackTrace$1) mo238a(abstractC23900i, continuation)).mo239o(C24848g0.f119245a);
    }
}
