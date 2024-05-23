package p008a2;

import android.os.CancellationSignal;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19075u;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import p119e2.C18177b;
import p664y.AbstractC30228a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: a2.f */
/* loaded from: classes2.dex */
public abstract class AbstractC0065f {

    /* renamed from: a */
    public static final a f271a = new a(null);

    /* renamed from: a2.f$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a2.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C32612a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f272t;

            /* renamed from: u */
            final /* synthetic */ Callable f273u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32612a(Callable callable, Continuation continuation) {
                super(2, continuation);
                this.f273u = callable;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32612a(this.f273u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f272t == 0) {
                    AbstractC24862s.m129228b(obj);
                    return this.f273u.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32612a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a2.f$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ CancellationSignal f274q;

            /* renamed from: r */
            final /* synthetic */ Job f275r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CancellationSignal cancellationSignal, Job job) {
                super(1);
                this.f274q = cancellationSignal;
                this.f275r = job;
            }

            /* renamed from: a */
            public final void m242a(Throwable th2) {
                C18177b.m96914a(this.f274q);
                Job.DefaultImpls.m112740a(this.f275r, null, 1, null);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m242a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a2.f$a$c */
        /* loaded from: classes2.dex */
        public static final class c extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f276t;

            /* renamed from: u */
            final /* synthetic */ Callable f277u;

            /* renamed from: v */
            final /* synthetic */ CancellableContinuation f278v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Callable callable, CancellableContinuation cancellableContinuation, Continuation continuation) {
                super(2, continuation);
                this.f277u = callable;
                this.f278v = cancellableContinuation;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new c(this.f277u, this.f278v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f276t == 0) {
                    AbstractC24862s.m129228b(obj);
                    try {
                        this.f278v.mo112492g(C24861r.m129218b(this.f277u.call()));
                    } catch (Throwable th2) {
                        CancellableContinuation cancellableContinuation = this.f278v;
                        C24861r.a aVar = C24861r.f119264q;
                        cancellableContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
                    }
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Object m236a(AbstractC0086w abstractC0086w, boolean z11, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
            CoroutineDispatcher m253a;
            Continuation m142576c;
            Job m112540d;
            Object m142578e;
            if (abstractC0086w.m361z() && abstractC0086w.m357t()) {
                return callable.call();
            }
            AbstractC30228a.m149044a(continuation.getContext().mo112624d(AbstractC0068g0.f283p));
            if (z11) {
                m253a = AbstractC0067g.m254b(abstractC0086w);
            } else {
                m253a = AbstractC0067g.m253a(abstractC0086w);
            }
            CoroutineDispatcher coroutineDispatcher = m253a;
            m142576c = AbstractC28297c.m142576c(continuation);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
            cancellableContinuationImpl.m112574F();
            m112540d = BuildersKt__Builders_commonKt.m112540d(GlobalScope.f105887p, coroutineDispatcher, null, new c(callable, cancellableContinuationImpl, null), 2, null);
            cancellableContinuationImpl.mo112543I(new b(cancellationSignal, m112540d));
            Object m112571A = cancellableContinuationImpl.m112571A();
            m142578e = AbstractC28298d.m142578e();
            if (m112571A == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            return m112571A;
        }

        /* renamed from: b */
        public final Object m237b(AbstractC0086w abstractC0086w, boolean z11, Callable callable, Continuation continuation) {
            CoroutineDispatcher m253a;
            if (abstractC0086w.m361z() && abstractC0086w.m357t()) {
                return callable.call();
            }
            AbstractC30228a.m149044a(continuation.getContext().mo112624d(AbstractC0068g0.f283p));
            if (z11) {
                m253a = AbstractC0067g.m254b(abstractC0086w);
            } else {
                m253a = AbstractC0067g.m253a(abstractC0086w);
            }
            return BuildersKt.m112534g(m253a, new C32612a(callable, null), continuation);
        }
    }

    /* renamed from: a */
    public static final Object m234a(AbstractC0086w abstractC0086w, boolean z11, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
        return f271a.m236a(abstractC0086w, z11, cancellationSignal, callable, continuation);
    }

    /* renamed from: b */
    public static final Object m235b(AbstractC0086w abstractC0086w, boolean z11, Callable callable, Continuation continuation) {
        return f271a.m237b(abstractC0086w, z11, callable, continuation);
    }
}
