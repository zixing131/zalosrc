package wm0;

import fn0.AbstractC19074t;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24861r;
import vm0.AbstractC28298d;

/* renamed from: wm0.a */
/* loaded from: classes.dex */
public abstract class AbstractC29093a implements Continuation, InterfaceC29097e, Serializable {

    /* renamed from: p */
    private final Continuation f134916p;

    public AbstractC29093a(Continuation continuation) {
        this.f134916p = continuation;
    }

    /* renamed from: C */
    public StackTraceElement mo112573C() {
        return AbstractC29099g.m145352d(this);
    }

    /* renamed from: a */
    public Continuation mo238a(Object obj, Continuation continuation) {
        AbstractC19074t.m100208f(continuation, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: e */
    public InterfaceC29097e mo112582e() {
        Continuation continuation = this.f134916p;
        if (continuation instanceof InterfaceC29097e) {
            return (InterfaceC29097e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: g */
    public final void mo112492g(Object obj) {
        Object mo239o;
        Object m142578e;
        Continuation continuation = this;
        while (true) {
            AbstractC29100h.m145354b(continuation);
            AbstractC29093a abstractC29093a = (AbstractC29093a) continuation;
            Continuation continuation2 = abstractC29093a.f134916p;
            AbstractC19074t.m100205c(continuation2);
            try {
                mo239o = abstractC29093a.mo239o(obj);
                m142578e = AbstractC28298d.m142578e();
            } catch (Throwable th2) {
                C24861r.a aVar = C24861r.f119264q;
                obj = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (mo239o == m142578e) {
                return;
            }
            obj = C24861r.m129218b(mo239o);
            abstractC29093a.mo113558p();
            if (continuation2 instanceof AbstractC29093a) {
                continuation = continuation2;
            } else {
                continuation2.mo112492g(obj);
                return;
            }
        }
    }

    /* renamed from: m */
    public final Continuation m145338m() {
        return this.f134916p;
    }

    /* renamed from: o */
    protected abstract Object mo239o(Object obj);

    /* renamed from: p */
    protected void mo113558p() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object mo112573C = mo112573C();
        if (mo112573C == null) {
            mo112573C = getClass().getName();
        }
        sb2.append(mo112573C);
        return sb2.toString();
    }
}
