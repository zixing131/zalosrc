package kotlinx.coroutines.selects;

import com.google.android.gms.internal.ads.ya3;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import um0.InterfaceC27315f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public class SelectImplementation<R> extends CancelHandler implements SelectBuilder<R>, SelectInstanceInternal<R> {

    /* renamed from: u */
    private static final AtomicReferenceFieldUpdater f107523u = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state");

    /* renamed from: p */
    private final InterfaceC27315f f107524p;

    /* renamed from: q */
    private List f107525q;

    /* renamed from: r */
    private Object f107526r;

    /* renamed from: s */
    private int f107527s;
    private volatile Object state;

    /* renamed from: t */
    private Object f107528t;

    /* loaded from: classes7.dex */
    public final class ClauseData {

        /* renamed from: a */
        public final Object f107529a;

        /* renamed from: b */
        private final InterfaceC18510q f107530b;

        /* renamed from: c */
        private final InterfaceC18510q f107531c;

        /* renamed from: d */
        private final Object f107532d;

        /* renamed from: e */
        private final Object f107533e;

        /* renamed from: f */
        public final InterfaceC18510q f107534f;

        /* renamed from: g */
        public Object f107535g;

        /* renamed from: h */
        public int f107536h = -1;

        public ClauseData(Object obj, InterfaceC18510q interfaceC18510q, InterfaceC18510q interfaceC18510q2, Object obj2, Object obj3, InterfaceC18510q interfaceC18510q3) {
            this.f107529a = obj;
            this.f107530b = interfaceC18510q;
            this.f107531c = interfaceC18510q2;
            this.f107532d = obj2;
            this.f107533e = obj3;
            this.f107534f = interfaceC18510q3;
        }

        /* renamed from: a */
        public final InterfaceC18505l m113861a(SelectInstance selectInstance, Object obj) {
            InterfaceC18510q interfaceC18510q = this.f107534f;
            if (interfaceC18510q != null) {
                return (InterfaceC18505l) interfaceC18510q.mo45599Hr(selectInstance, this.f107532d, obj);
            }
            return null;
        }

        /* renamed from: b */
        public final void m113862b() {
            Object obj = this.f107535g;
            SelectImplementation selectImplementation = SelectImplementation.this;
            DisposableHandle disposableHandle = null;
            if (obj instanceof Segment) {
                ((Segment) obj).mo113098o(this.f107536h, null, selectImplementation.getContext());
                return;
            }
            if (obj instanceof DisposableHandle) {
                disposableHandle = (DisposableHandle) obj;
            }
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }

        /* renamed from: c */
        public final Object m113863c(Object obj, Continuation continuation) {
            Object obj2 = this.f107533e;
            if (this.f107532d == SelectKt.m113874i()) {
                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((InterfaceC18505l) obj2).mo205i9(continuation);
            }
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((InterfaceC18509p) obj2).mo240pC(obj, continuation);
        }

        /* renamed from: d */
        public final Object m113864d(Object obj) {
            return this.f107531c.mo45599Hr(this.f107529a, this.f107532d, obj);
        }

        /* renamed from: e */
        public final boolean m113865e(SelectImplementation selectImplementation) {
            Symbol symbol;
            this.f107530b.mo45599Hr(this.f107529a, selectImplementation, this.f107532d);
            Object obj = selectImplementation.f107528t;
            symbol = SelectKt.f107549e;
            if (obj == symbol) {
                return true;
            }
            return false;
        }
    }

    public SelectImplementation(InterfaceC27315f interfaceC27315f) {
        Symbol symbol;
        Symbol symbol2;
        this.f107524p = interfaceC27315f;
        symbol = SelectKt.f107546b;
        this.state = symbol;
        this.f107525q = new ArrayList(2);
        this.f107527s = -1;
        symbol2 = SelectKt.f107549e;
        this.f107528t = symbol2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:            r0 = r0.m112571A();        r1 = vm0.AbstractC28298d.m142578e();     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:            if (r0 != r1) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:            wm0.AbstractC29100h.m145355c(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:            r6 = vm0.AbstractC28298d.m142578e();     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:            if (r0 != r6) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:            return pm0.C24848g0.f119245a;     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m113838A(Continuation continuation) {
        Continuation m142576c;
        Symbol symbol;
        Symbol symbol2;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
        cancellableContinuationImpl.m112574F();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107523u;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            symbol = SelectKt.f107546b;
            if (obj == symbol) {
                if (ya3.m28173a(f107523u, this, obj, cancellableContinuationImpl)) {
                    cancellableContinuationImpl.mo112543I(this);
                    break;
                }
            } else if (obj instanceof List) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f107523u;
                symbol2 = SelectKt.f107546b;
                if (ya3.m28173a(atomicReferenceFieldUpdater2, this, obj, symbol2)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        m113853x(it.next());
                    }
                }
            } else if (obj instanceof ClauseData) {
                cancellableContinuationImpl.mo112551y(C24848g0.f119245a, ((ClauseData) obj).m113861a(this, this.f107528t));
            } else {
                throw new IllegalStateException(("unexpected state: " + obj).toString());
            }
        }
    }

    /* renamed from: m */
    private final void m113844m(Object obj) {
        List list = this.f107525q;
        AbstractC19074t.m100205c(list);
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((ClauseData) it.next()).f107529a == obj) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                }
            }
        }
    }

    /* renamed from: n */
    private final void m113845n(ClauseData clauseData) {
        Symbol symbol;
        Symbol symbol2;
        List<ClauseData> list = this.f107525q;
        if (list == null) {
            return;
        }
        for (ClauseData clauseData2 : list) {
            if (clauseData2 != clauseData) {
                clauseData2.m113862b();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107523u;
        symbol = SelectKt.f107547c;
        atomicReferenceFieldUpdater.set(this, symbol);
        symbol2 = SelectKt.f107549e;
        this.f107528t = symbol2;
        this.f107525q = null;
    }

    /* renamed from: o */
    private final Object m113846o(Continuation continuation) {
        Object obj = f107523u.get(this);
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        ClauseData clauseData = (ClauseData) obj;
        Object obj2 = this.f107528t;
        m113845n(clauseData);
        return clauseData.m113863c(clauseData.m113864d(obj2), continuation);
    }

    /* renamed from: q */
    static /* synthetic */ Object m113847q(SelectImplementation selectImplementation, Continuation continuation) {
        if (selectImplementation.m113850t()) {
            return selectImplementation.m113846o(continuation);
        }
        return selectImplementation.m113848r(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057 A[PHI: r6
  0x0057: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0054, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m113848r(Continuation continuation) {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        Object obj;
        Object m142578e;
        int i11;
        SelectImplementation<R> selectImplementation;
        if (continuation instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) continuation;
            int i12 = selectImplementation$doSelectSuspend$1.f107541v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.f107541v = i12 - Integer.MIN_VALUE;
                obj = selectImplementation$doSelectSuspend$1.f107539t;
                m142578e = AbstractC28298d.m142578e();
                i11 = selectImplementation$doSelectSuspend$1.f107541v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    selectImplementation = (SelectImplementation) selectImplementation$doSelectSuspend$1.f107538s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    selectImplementation$doSelectSuspend$1.f107538s = this;
                    selectImplementation$doSelectSuspend$1.f107541v = 1;
                    if (m113838A(selectImplementation$doSelectSuspend$1) == m142578e) {
                        return m142578e;
                    }
                    selectImplementation = this;
                }
                selectImplementation$doSelectSuspend$1.f107538s = null;
                selectImplementation$doSelectSuspend$1.f107541v = 2;
                obj = selectImplementation.m113846o(selectImplementation$doSelectSuspend$1);
                if (obj != m142578e) {
                    return m142578e;
                }
                return obj;
            }
        }
        selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuation);
        obj = selectImplementation$doSelectSuspend$1.f107539t;
        m142578e = AbstractC28298d.m142578e();
        i11 = selectImplementation$doSelectSuspend$1.f107541v;
        if (i11 == 0) {
        }
        selectImplementation$doSelectSuspend$1.f107538s = null;
        selectImplementation$doSelectSuspend$1.f107541v = 2;
        obj = selectImplementation.m113846o(selectImplementation$doSelectSuspend$1);
        if (obj != m142578e) {
        }
    }

    /* renamed from: s */
    private final ClauseData m113849s(Object obj) {
        List list = this.f107525q;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ClauseData) next).f107529a == obj) {
                obj2 = next;
                break;
            }
        }
        ClauseData clauseData = (ClauseData) obj2;
        if (clauseData != null) {
            return clauseData;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* renamed from: t */
    private final boolean m113850t() {
        return f107523u.get(this) instanceof ClauseData;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m113851u(ClauseData clauseData, Object obj, Continuation continuation) {
        C21875xf491fb2a c21875xf491fb2a;
        Object m142578e;
        int i11;
        if (continuation instanceof C21875xf491fb2a) {
            c21875xf491fb2a = (C21875xf491fb2a) continuation;
            int i12 = c21875xf491fb2a.f107544u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c21875xf491fb2a.f107544u = i12 - Integer.MIN_VALUE;
                Object obj2 = c21875xf491fb2a.f107542s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c21875xf491fb2a.f107544u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    Object m113864d = clauseData.m113864d(obj);
                    c21875xf491fb2a.f107544u = 1;
                    obj2 = clauseData.m113863c(m113864d, c21875xf491fb2a);
                    if (obj2 == m142578e) {
                        return m142578e;
                    }
                }
                return obj2;
            }
        }
        c21875xf491fb2a = new C21875xf491fb2a(this, continuation);
        Object obj22 = c21875xf491fb2a.f107542s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c21875xf491fb2a.f107544u;
        if (i11 == 0) {
        }
        return obj22;
    }

    /* renamed from: w */
    public static /* synthetic */ void m113852w(SelectImplementation selectImplementation, ClauseData clauseData, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            selectImplementation.m113859v(clauseData, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
    }

    /* renamed from: x */
    public final void m113853x(Object obj) {
        ClauseData m113849s = m113849s(obj);
        AbstractC19074t.m100205c(m113849s);
        m113849s.f107535g = null;
        m113849s.f107536h = -1;
        m113859v(m113849s, true);
    }

    /* renamed from: z */
    private final int m113854z(Object obj, Object obj2) {
        boolean m113875j;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        List m131496e;
        List m131223w0;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107523u;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof CancellableContinuation)) {
                symbol = SelectKt.f107547c;
                if (!AbstractC19074t.m100204b(obj3, symbol) && !(obj3 instanceof ClauseData)) {
                    symbol2 = SelectKt.f107548d;
                    if (!AbstractC19074t.m100204b(obj3, symbol2)) {
                        symbol3 = SelectKt.f107546b;
                        if (AbstractC19074t.m100204b(obj3, symbol3)) {
                            m131496e = AbstractC25366r.m131496e(obj);
                            if (ya3.m28173a(atomicReferenceFieldUpdater, this, obj3, m131496e)) {
                                return 1;
                            }
                        } else if (obj3 instanceof List) {
                            m131223w0 = AbstractC25332a0.m131223w0((Collection) obj3, obj);
                            if (ya3.m28173a(atomicReferenceFieldUpdater, this, obj3, m131223w0)) {
                                return 1;
                            }
                        } else {
                            throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                        }
                    } else {
                        return 2;
                    }
                } else {
                    return 3;
                }
            } else {
                ClauseData m113849s = m113849s(obj);
                if (m113849s == null) {
                    continue;
                } else {
                    InterfaceC18505l m113861a = m113849s.m113861a(this, obj2);
                    if (ya3.m28173a(atomicReferenceFieldUpdater, this, obj3, m113849s)) {
                        this.f107528t = obj2;
                        m113875j = SelectKt.m113875j((CancellableContinuation) obj3, m113861a);
                        if (m113875j) {
                            return 0;
                        }
                        this.f107528t = null;
                        return 2;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    /* renamed from: a */
    public void mo113830a(SelectClause0 selectClause0, InterfaceC18505l interfaceC18505l) {
        m113852w(this, new ClauseData(selectClause0.mo113837d(), selectClause0.mo113834a(), selectClause0.mo113836c(), SelectKt.m113874i(), interfaceC18505l, selectClause0.mo113835b()), false, 1, null);
    }

    @Override // kotlinx.coroutines.Waiter
    /* renamed from: b */
    public void mo112580b(Segment segment, int i11) {
        this.f107526r = segment;
        this.f107527s = i11;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    /* renamed from: c */
    public void mo113831c(SelectClause1 selectClause1, InterfaceC18509p interfaceC18509p) {
        m113852w(this, new ClauseData(selectClause1.mo113837d(), selectClause1.mo113834a(), selectClause1.mo113836c(), null, interfaceC18509p, selectClause1.mo113835b()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: d */
    public void mo113855d(Object obj) {
        this.f107528t = obj;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: e */
    public void mo113856e(DisposableHandle disposableHandle) {
        this.f107526r = disposableHandle;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: f */
    public boolean mo113857f(Object obj, Object obj2) {
        if (m113854z(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: g */
    public void mo112519g(Throwable th2) {
        Object obj;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107523u;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            symbol = SelectKt.f107547c;
            if (obj != symbol) {
                symbol2 = SelectKt.f107548d;
            } else {
                return;
            }
        } while (!ya3.m28173a(atomicReferenceFieldUpdater, this, obj, symbol2));
        List list = this.f107525q;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ClauseData) it.next()).m113862b();
        }
        symbol3 = SelectKt.f107549e;
        this.f107528t = symbol3;
        this.f107525q = null;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public InterfaceC27315f getContext() {
        return this.f107524p;
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        mo112519g((Throwable) obj);
        return C24848g0.f119245a;
    }

    /* renamed from: p */
    public Object mo113858p(Continuation continuation) {
        return m113847q(this, continuation);
    }

    /* renamed from: v */
    public final void m113859v(ClauseData clauseData, boolean z11) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107523u;
        if (atomicReferenceFieldUpdater.get(this) instanceof ClauseData) {
            return;
        }
        if (!z11) {
            m113844m(clauseData.f107529a);
        }
        if (clauseData.m113865e(this)) {
            if (!z11) {
                List list = this.f107525q;
                AbstractC19074t.m100205c(list);
                list.add(clauseData);
            }
            clauseData.f107535g = this.f107526r;
            clauseData.f107536h = this.f107527s;
            this.f107526r = null;
            this.f107527s = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, clauseData);
    }

    /* renamed from: y */
    public final TrySelectDetailedResult m113860y(Object obj, Object obj2) {
        TrySelectDetailedResult m113866a;
        m113866a = SelectKt.m113866a(m113854z(obj, obj2));
        return m113866a;
    }
}
