package kotlinx.coroutines;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import pm0.C24861r;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public final class AwaitAll<T> {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f105792b = AtomicIntegerFieldUpdater.newUpdater(AwaitAll.class, "notCompletedCount");

    /* renamed from: a */
    private final Deferred[] f105793a;
    private volatile int notCompletedCount;

    /* loaded from: classes7.dex */
    public final class AwaitAllNode extends JobNode {

        /* renamed from: w */
        private static final AtomicReferenceFieldUpdater f105794w = AtomicReferenceFieldUpdater.newUpdater(AwaitAllNode.class, Object.class, "_disposer");
        private volatile Object _disposer;

        /* renamed from: t */
        private final CancellableContinuation f105795t;

        /* renamed from: u */
        public DisposableHandle f105796u;

        public AwaitAllNode(CancellableContinuation cancellableContinuation) {
            this.f105795t = cancellableContinuation;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            mo112514r((Throwable) obj);
            return C24848g0.f119245a;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: r */
        public void mo112514r(Throwable th2) {
            if (th2 != null) {
                Object mo112548j = this.f105795t.mo112548j(th2);
                if (mo112548j != null) {
                    this.f105795t.mo112545U(mo112548j);
                    DisposeHandlersOnCancel m112515u = m112515u();
                    if (m112515u != null) {
                        m112515u.m112520h();
                        return;
                    }
                    return;
                }
                return;
            }
            if (AwaitAll.f105792b.decrementAndGet(AwaitAll.this) == 0) {
                CancellableContinuation cancellableContinuation = this.f105795t;
                Deferred[] deferredArr = AwaitAll.this.f105793a;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.mo112599r());
                }
                cancellableContinuation.mo112492g(C24861r.m129218b(arrayList));
            }
        }

        /* renamed from: u */
        public final DisposeHandlersOnCancel m112515u() {
            return (DisposeHandlersOnCancel) f105794w.get(this);
        }

        /* renamed from: v */
        public final DisposableHandle m112516v() {
            DisposableHandle disposableHandle = this.f105796u;
            if (disposableHandle != null) {
                return disposableHandle;
            }
            AbstractC19074t.m100223u("handle");
            return null;
        }

        /* renamed from: w */
        public final void m112517w(DisposeHandlersOnCancel disposeHandlersOnCancel) {
            f105794w.set(this, disposeHandlersOnCancel);
        }

        /* renamed from: x */
        public final void m112518x(DisposableHandle disposableHandle) {
            this.f105796u = disposableHandle;
        }
    }

    /* loaded from: classes7.dex */
    public final class DisposeHandlersOnCancel extends CancelHandler {

        /* renamed from: p */
        private final AwaitAllNode[] f105798p;

        public DisposeHandlersOnCancel(AwaitAllNode[] awaitAllNodeArr) {
            this.f105798p = awaitAllNodeArr;
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* renamed from: g */
        public void mo112519g(Throwable th2) {
            m112520h();
        }

        /* renamed from: h */
        public final void m112520h() {
            for (AwaitAllNode awaitAllNode : this.f105798p) {
                awaitAllNode.m112516v().dispose();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            mo112519g((Throwable) obj);
            return C24848g0.f119245a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f105798p + ']';
        }
    }

    public AwaitAll(Deferred[] deferredArr) {
        this.f105793a = deferredArr;
        this.notCompletedCount = deferredArr.length;
    }

    /* renamed from: c */
    public final Object m112513c(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
        cancellableContinuationImpl.m112574F();
        int length = this.f105793a.length;
        AwaitAllNode[] awaitAllNodeArr = new AwaitAllNode[length];
        for (int i11 = 0; i11 < length; i11++) {
            Deferred deferred = this.f105793a[i11];
            deferred.start();
            AwaitAllNode awaitAllNode = new AwaitAllNode(cancellableContinuationImpl);
            awaitAllNode.m112518x(deferred.mo112733M(awaitAllNode));
            C24848g0 c24848g0 = C24848g0.f119245a;
            awaitAllNodeArr[i11] = awaitAllNode;
        }
        DisposeHandlersOnCancel disposeHandlersOnCancel = new DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i12 = 0; i12 < length; i12++) {
            awaitAllNodeArr[i12].m112517w(disposeHandlersOnCancel);
        }
        if (cancellableContinuationImpl.mo112547f()) {
            disposeHandlersOnCancel.m112520h();
        } else {
            cancellableContinuationImpl.mo112543I(disposeHandlersOnCancel);
        }
        Object m112571A = cancellableContinuationImpl.m112571A();
        m142578e = AbstractC28298d.m142578e();
        if (m112571A == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m112571A;
    }
}
