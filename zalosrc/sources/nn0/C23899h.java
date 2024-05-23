package nn0;

import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import um0.C27316g;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: nn0.h */
/* loaded from: classes7.dex */
public final class C23899h extends AbstractC23900i implements Iterator, Continuation, InterfaceC19517a {

    /* renamed from: p */
    private int f115513p;

    /* renamed from: q */
    private Object f115514q;

    /* renamed from: r */
    private Iterator f115515r;

    /* renamed from: s */
    private Continuation f115516s;

    /* renamed from: h */
    private final Throwable m124990h() {
        int i11 = this.f115513p;
        if (i11 != 4) {
            if (i11 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f115513p);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    /* renamed from: i */
    private final Object m124991i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // nn0.AbstractC23900i
    /* renamed from: a */
    public Object mo124992a(Object obj, Continuation continuation) {
        Object m142578e;
        Object m142578e2;
        Object m142578e3;
        this.f115514q = obj;
        this.f115513p = 3;
        this.f115516s = continuation;
        m142578e = AbstractC28298d.m142578e();
        m142578e2 = AbstractC28298d.m142578e();
        if (m142578e == m142578e2) {
            AbstractC29100h.m145355c(continuation);
        }
        m142578e3 = AbstractC28298d.m142578e();
        if (m142578e == m142578e3) {
            return m142578e;
        }
        return C24848g0.f119245a;
    }

    @Override // nn0.AbstractC23900i
    /* renamed from: d */
    public Object mo124993d(Iterator it, Continuation continuation) {
        Object m142578e;
        Object m142578e2;
        Object m142578e3;
        if (!it.hasNext()) {
            return C24848g0.f119245a;
        }
        this.f115515r = it;
        this.f115513p = 2;
        this.f115516s = continuation;
        m142578e = AbstractC28298d.m142578e();
        m142578e2 = AbstractC28298d.m142578e();
        if (m142578e == m142578e2) {
            AbstractC29100h.m145355c(continuation);
        }
        m142578e3 = AbstractC28298d.m142578e();
        if (m142578e == m142578e3) {
            return m142578e;
        }
        return C24848g0.f119245a;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: g */
    public void mo112492g(Object obj) {
        AbstractC24862s.m129228b(obj);
        this.f115513p = 4;
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC27315f getContext() {
        return C27316g.f128559p;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i11 = this.f115513p;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        return true;
                    }
                    if (i11 == 4) {
                        return false;
                    }
                    throw m124990h();
                }
                Iterator it = this.f115515r;
                AbstractC19074t.m100205c(it);
                if (it.hasNext()) {
                    this.f115513p = 2;
                    return true;
                }
                this.f115515r = null;
            }
            this.f115513p = 5;
            Continuation continuation = this.f115516s;
            AbstractC19074t.m100205c(continuation);
            this.f115516s = null;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
        }
    }

    /* renamed from: l */
    public final void m124994l(Continuation continuation) {
        this.f115516s = continuation;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i11 = this.f115513p;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    this.f115513p = 0;
                    Object obj = this.f115514q;
                    this.f115514q = null;
                    return obj;
                }
                throw m124990h();
            }
            this.f115513p = 1;
            Iterator it = this.f115515r;
            AbstractC19074t.m100205c(it);
            return it.next();
        }
        return m124991i();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
