package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* loaded from: classes2.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f7247t;

    /* renamed from: u */
    private /* synthetic */ Object f7248u;

    /* renamed from: v */
    final /* synthetic */ AbstractC1785o f7249v;

    /* renamed from: w */
    final /* synthetic */ AbstractC1785o.b f7250w;

    /* renamed from: x */
    final /* synthetic */ InterfaceC18509p f7251x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    /* loaded from: classes2.dex */
    public static final class C17481 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ AbstractC1785o f7252A;

        /* renamed from: B */
        final /* synthetic */ AbstractC1785o.b f7253B;

        /* renamed from: C */
        final /* synthetic */ CoroutineScope f7254C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC18509p f7255D;

        /* renamed from: t */
        Object f7256t;

        /* renamed from: u */
        Object f7257u;

        /* renamed from: v */
        Object f7258v;

        /* renamed from: w */
        Object f7259w;

        /* renamed from: x */
        Object f7260x;

        /* renamed from: y */
        Object f7261y;

        /* renamed from: z */
        int f7262z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C17481(AbstractC1785o abstractC1785o, AbstractC1785o.b bVar, CoroutineScope coroutineScope, InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f7252A = abstractC1785o;
            this.f7253B = bVar;
            this.f7254C = coroutineScope;
            this.f7255D = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C17481(this.f7252A, this.f7253B, this.f7254C, this.f7255D, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C19059j0 c19059j0;
            C19059j0 c19059j02;
            Continuation m142576c;
            Object m142578e2;
            Job job;
            InterfaceC1795t interfaceC1795t;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f7262z;
            if (i11 != 0) {
                if (i11 == 1) {
                    c19059j02 = (C19059j0) this.f7257u;
                    c19059j0 = (C19059j0) this.f7256t;
                    try {
                        AbstractC24862s.m129228b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        job = (Job) c19059j0.f94941p;
                        if (job != null) {
                        }
                        interfaceC1795t = (InterfaceC1795t) c19059j02.f94941p;
                        if (interfaceC1795t != null) {
                        }
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (this.f7252A.mo9336b() == AbstractC1785o.b.DESTROYED) {
                    return C24848g0.f119245a;
                }
                final C19059j0 c19059j03 = new C19059j0();
                C19059j0 c19059j04 = new C19059j0();
                try {
                    AbstractC1785o.b bVar = this.f7253B;
                    AbstractC1785o abstractC1785o = this.f7252A;
                    final CoroutineScope coroutineScope = this.f7254C;
                    final InterfaceC18509p interfaceC18509p = this.f7255D;
                    this.f7256t = c19059j03;
                    this.f7257u = c19059j04;
                    this.f7258v = bVar;
                    this.f7259w = abstractC1785o;
                    this.f7260x = coroutineScope;
                    this.f7261y = interfaceC18509p;
                    this.f7262z = 1;
                    m142576c = AbstractC28297c.m142576c(this);
                    final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                    cancellableContinuationImpl.m112574F();
                    AbstractC1785o.a.C32633a c32633a = AbstractC1785o.a.Companion;
                    final AbstractC1785o.a m9343c = c32633a.m9343c(bVar);
                    final AbstractC1785o.a m9341a = c32633a.m9341a(bVar);
                    final Mutex m113910b = MutexKt.m113910b(false, 1, null);
                    InterfaceC1795t interfaceC1795t2 = new InterfaceC1795t() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a */
                        /* loaded from: classes2.dex */
                        static final class C1749a extends AbstractC29104l implements InterfaceC18509p {

                            /* renamed from: t */
                            Object f7270t;

                            /* renamed from: u */
                            Object f7271u;

                            /* renamed from: v */
                            int f7272v;

                            /* renamed from: w */
                            final /* synthetic */ Mutex f7273w;

                            /* renamed from: x */
                            final /* synthetic */ InterfaceC18509p f7274x;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a */
                            /* loaded from: classes2.dex */
                            public static final class a extends AbstractC29104l implements InterfaceC18509p {

                                /* renamed from: t */
                                int f7275t;

                                /* renamed from: u */
                                private /* synthetic */ Object f7276u;

                                /* renamed from: v */
                                final /* synthetic */ InterfaceC18509p f7277v;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                a(InterfaceC18509p interfaceC18509p, Continuation continuation) {
                                    super(2, continuation);
                                    this.f7277v = interfaceC18509p;
                                }

                                @Override // wm0.AbstractC29093a
                                /* renamed from: a */
                                public final Continuation mo238a(Object obj, Continuation continuation) {
                                    a aVar = new a(this.f7277v, continuation);
                                    aVar.f7276u = obj;
                                    return aVar;
                                }

                                @Override // wm0.AbstractC29093a
                                /* renamed from: o */
                                public final Object mo239o(Object obj) {
                                    Object m142578e;
                                    m142578e = AbstractC28298d.m142578e();
                                    int i11 = this.f7275t;
                                    if (i11 != 0) {
                                        if (i11 == 1) {
                                            AbstractC24862s.m129228b(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        AbstractC24862s.m129228b(obj);
                                        CoroutineScope coroutineScope = (CoroutineScope) this.f7276u;
                                        InterfaceC18509p interfaceC18509p = this.f7277v;
                                        this.f7275t = 1;
                                        if (interfaceC18509p.mo240pC(coroutineScope, this) == m142578e) {
                                            return m142578e;
                                        }
                                    }
                                    return C24848g0.f119245a;
                                }

                                @Override // en0.InterfaceC18509p
                                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                                    return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C1749a(Mutex mutex, InterfaceC18509p interfaceC18509p, Continuation continuation) {
                                super(2, continuation);
                                this.f7273w = mutex;
                                this.f7274x = interfaceC18509p;
                            }

                            @Override // wm0.AbstractC29093a
                            /* renamed from: a */
                            public final Continuation mo238a(Object obj, Continuation continuation) {
                                return new C1749a(this.f7273w, this.f7274x, continuation);
                            }

                            @Override // wm0.AbstractC29093a
                            /* renamed from: o */
                            public final Object mo239o(Object obj) {
                                Object m142578e;
                                Mutex mutex;
                                InterfaceC18509p interfaceC18509p;
                                Mutex mutex2;
                                Throwable th2;
                                m142578e = AbstractC28298d.m142578e();
                                int i11 = this.f7272v;
                                try {
                                    if (i11 != 0) {
                                        if (i11 != 1) {
                                            if (i11 == 2) {
                                                mutex2 = (Mutex) this.f7270t;
                                                try {
                                                    AbstractC24862s.m129228b(obj);
                                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                                    mutex2.mo113890c(null);
                                                    return C24848g0.f119245a;
                                                } catch (Throwable th3) {
                                                    th2 = th3;
                                                    mutex2.mo113890c(null);
                                                    throw th2;
                                                }
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        interfaceC18509p = (InterfaceC18509p) this.f7271u;
                                        Mutex mutex3 = (Mutex) this.f7270t;
                                        AbstractC24862s.m129228b(obj);
                                        mutex = mutex3;
                                    } else {
                                        AbstractC24862s.m129228b(obj);
                                        mutex = this.f7273w;
                                        interfaceC18509p = this.f7274x;
                                        this.f7270t = mutex;
                                        this.f7271u = interfaceC18509p;
                                        this.f7272v = 1;
                                        if (mutex.mo113889b(null, this) == m142578e) {
                                            return m142578e;
                                        }
                                    }
                                    a aVar = new a(interfaceC18509p, null);
                                    this.f7270t = mutex;
                                    this.f7271u = null;
                                    this.f7272v = 2;
                                    if (CoroutineScopeKt.m112640d(aVar, this) == m142578e) {
                                        return m142578e;
                                    }
                                    mutex2 = mutex;
                                    C24848g0 c24848g02 = C24848g0.f119245a;
                                    mutex2.mo113890c(null);
                                    return C24848g0.f119245a;
                                } catch (Throwable th4) {
                                    mutex2 = mutex;
                                    th2 = th4;
                                    mutex2.mo113890c(null);
                                    throw th2;
                                }
                            }

                            @Override // en0.InterfaceC18509p
                            /* renamed from: r, reason: merged with bridge method [inline-methods] */
                            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                                return ((C1749a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                            }
                        }

                        @Override // androidx.lifecycle.InterfaceC1795t
                        /* renamed from: X6 */
                        public final void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                            Job m112540d;
                            AbstractC19074t.m100208f(interfaceC1801w, "<anonymous parameter 0>");
                            AbstractC19074t.m100208f(aVar, "event");
                            if (aVar == AbstractC1785o.a.this) {
                                C19059j0 c19059j05 = c19059j03;
                                m112540d = BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new C1749a(m113910b, interfaceC18509p, null), 3, null);
                                c19059j05.f94941p = m112540d;
                                return;
                            }
                            if (aVar == m9341a) {
                                Job job2 = (Job) c19059j03.f94941p;
                                if (job2 != null) {
                                    Job.DefaultImpls.m112740a(job2, null, 1, null);
                                }
                                c19059j03.f94941p = null;
                            }
                            if (aVar == AbstractC1785o.a.ON_DESTROY) {
                                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                                C24861r.a aVar2 = C24861r.f119264q;
                                cancellableContinuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
                            }
                        }
                    };
                    c19059j04.f94941p = interfaceC1795t2;
                    AbstractC19074t.m100206d(interfaceC1795t2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    abstractC1785o.mo9335a(interfaceC1795t2);
                    Object m112571A = cancellableContinuationImpl.m112571A();
                    m142578e2 = AbstractC28298d.m142578e();
                    if (m112571A == m142578e2) {
                        AbstractC29100h.m145355c(this);
                    }
                    if (m112571A == m142578e) {
                        return m142578e;
                    }
                    c19059j0 = c19059j03;
                    c19059j02 = c19059j04;
                } catch (Throwable th3) {
                    th = th3;
                    c19059j0 = c19059j03;
                    c19059j02 = c19059j04;
                    job = (Job) c19059j0.f94941p;
                    if (job != null) {
                        Job.DefaultImpls.m112740a(job, null, 1, null);
                    }
                    interfaceC1795t = (InterfaceC1795t) c19059j02.f94941p;
                    if (interfaceC1795t != null) {
                        this.f7252A.mo9338d(interfaceC1795t);
                    }
                    throw th;
                }
            }
            Job job2 = (Job) c19059j0.f94941p;
            if (job2 != null) {
                Job.DefaultImpls.m112740a(job2, null, 1, null);
            }
            InterfaceC1795t interfaceC1795t3 = (InterfaceC1795t) c19059j02.f94941p;
            if (interfaceC1795t3 != null) {
                this.f7252A.mo9338d(interfaceC1795t3);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C17481) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(AbstractC1785o abstractC1785o, AbstractC1785o.b bVar, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(2, continuation);
        this.f7249v = abstractC1785o;
        this.f7250w = bVar;
        this.f7251x = interfaceC18509p;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f7249v, this.f7250w, this.f7251x, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f7248u = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f7247t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f7248u;
            MainCoroutineDispatcher mo112861G0 = Dispatchers.m112681c().mo112861G0();
            C17481 c17481 = new C17481(this.f7249v, this.f7250w, coroutineScope, this.f7251x, null);
            this.f7247t = 1;
            if (BuildersKt.m112534g(mo112861G0, c17481, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
