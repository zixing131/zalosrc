package pm0;

import en0.InterfaceC18510q;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.C24861r;
import um0.C27316g;
import um0.InterfaceC27315f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29093a;
import wm0.AbstractC29100h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pm0.d */
/* loaded from: classes7.dex */
public final class C24841d extends AbstractC24839c implements Continuation {

    /* renamed from: p */
    private InterfaceC18510q f119235p;

    /* renamed from: q */
    private Object f119236q;

    /* renamed from: r */
    private Continuation f119237r;

    /* renamed from: s */
    private Object f119238s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24841d(InterfaceC18510q interfaceC18510q, Object obj) {
        super(null);
        Object obj2;
        AbstractC19074t.m100208f(interfaceC18510q, "block");
        this.f119235p = interfaceC18510q;
        this.f119236q = obj;
        AbstractC19074t.m100206d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f119237r = this;
        obj2 = AbstractC24837b.f119229a;
        this.f119238s = obj2;
    }

    @Override // pm0.AbstractC24839c
    /* renamed from: a */
    public Object mo129155a(Object obj, Continuation continuation) {
        Object m142578e;
        Object m142578e2;
        AbstractC19074t.m100206d(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f119237r = continuation;
        this.f119236q = obj;
        m142578e = AbstractC28298d.m142578e();
        m142578e2 = AbstractC28298d.m142578e();
        if (m142578e == m142578e2) {
            AbstractC29100h.m145355c(continuation);
        }
        return m142578e;
    }

    /* renamed from: b */
    public final Object m129173b() {
        Object obj;
        Object obj2;
        Object mo45599Hr;
        Object m142578e;
        while (true) {
            Object obj3 = this.f119238s;
            Continuation continuation = this.f119237r;
            if (continuation != null) {
                obj = AbstractC24837b.f119229a;
                if (!C24861r.m129220d(obj, obj3)) {
                    obj2 = AbstractC24837b.f119229a;
                    this.f119238s = obj2;
                    continuation.mo112492g(obj3);
                } else {
                    try {
                        InterfaceC18510q interfaceC18510q = this.f119235p;
                        Object obj4 = this.f119236q;
                        if (!(interfaceC18510q instanceof AbstractC29093a)) {
                            mo45599Hr = AbstractC28297c.m142577d(interfaceC18510q, this, obj4, continuation);
                        } else {
                            mo45599Hr = ((InterfaceC18510q) AbstractC19069o0.m100188e(interfaceC18510q, 3)).mo45599Hr(this, obj4, continuation);
                        }
                        m142578e = AbstractC28298d.m142578e();
                        if (mo45599Hr != m142578e) {
                            continuation.mo112492g(C24861r.m129218b(mo45599Hr));
                        }
                    } catch (Throwable th2) {
                        C24861r.a aVar = C24861r.f119264q;
                        continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
                    }
                }
            } else {
                AbstractC24862s.m129228b(obj3);
                return obj3;
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: g */
    public void mo112492g(Object obj) {
        this.f119237r = null;
        this.f119238s = obj;
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC27315f getContext() {
        return C27316g.f128559p;
    }
}
