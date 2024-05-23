package p723zo;

import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: zo.i */
/* loaded from: classes4.dex */
final class C32530i implements InterfaceC32527f, InterfaceC32526e {

    /* renamed from: a */
    public static final C32530i f150252a = new C32530i();

    /* renamed from: b */
    private static final MutableSharedFlow f150253b = SharedFlowKt.m113478b(1, 0, null, 6, null);

    /* renamed from: c */
    private static final MutableSharedFlow f150254c = SharedFlowKt.m113478b(0, 1, null, 5, null);

    /* renamed from: zo.i$a */
    /* loaded from: classes4.dex */
    public static final class a implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f150255p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC32525d f150256q;

        /* renamed from: zo.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C33070a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f150257p;

            /* renamed from: q */
            final /* synthetic */ InterfaceC32525d f150258q;

            /* renamed from: zo.i$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C33071a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f150259s;

                /* renamed from: t */
                int f150260t;

                public C33071a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f150259s = obj;
                    this.f150260t |= Integer.MIN_VALUE;
                    return C33070a.this.mo12109b(null, this);
                }
            }

            public C33070a(FlowCollector flowCollector, InterfaceC32525d interfaceC32525d) {
                this.f150257p = flowCollector;
                this.f150258q = interfaceC32525d;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33071a c33071a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33071a) {
                    c33071a = (C33071a) continuation;
                    int i12 = c33071a.f150260t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33071a.f150260t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33071a.f150259s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33071a.f150260t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f150257p;
                            if (AbstractC19074t.m100204b(((AbstractC32528g) obj).m157493a(), this.f150258q)) {
                                c33071a.f150260t = 1;
                                if (flowCollector.mo12109b(obj, c33071a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33071a = new C33071a(continuation);
                Object obj22 = c33071a.f150259s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33071a.f150260t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public a(Flow flow, InterfaceC32525d interfaceC32525d) {
            this.f150255p = flow;
            this.f150256q = interfaceC32525d;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f150255p.mo97893a(new C33070a(flowCollector, this.f150256q), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* renamed from: zo.i$b */
    /* loaded from: classes4.dex */
    public static final class b implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f150262p;

        /* renamed from: q */
        final /* synthetic */ AbstractC32528g f150263q;

        /* renamed from: zo.i$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f150264p;

            /* renamed from: q */
            final /* synthetic */ AbstractC32528g f150265q;

            /* renamed from: zo.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C33072a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f150266s;

                /* renamed from: t */
                int f150267t;

                public C33072a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f150266s = obj;
                    this.f150267t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector, AbstractC32528g abstractC32528g) {
                this.f150264p = flowCollector;
                this.f150265q = abstractC32528g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33072a c33072a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33072a) {
                    c33072a = (C33072a) continuation;
                    int i12 = c33072a.f150267t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33072a.f150267t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33072a.f150266s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33072a.f150267t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f150264p;
                            if (AbstractC19074t.m100204b(((AbstractC32529h) obj).m157494a(), this.f150265q.m157493a())) {
                                c33072a.f150267t = 1;
                                if (flowCollector.mo12109b(obj, c33072a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33072a = new C33072a(continuation);
                Object obj22 = c33072a.f150266s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33072a.f150267t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public b(Flow flow, AbstractC32528g abstractC32528g) {
            this.f150262p = flow;
            this.f150263q = abstractC32528g;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f150262p.mo97893a(new a(flowCollector, this.f150263q), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zo.i$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f150269s;

        /* renamed from: t */
        /* synthetic */ Object f150270t;

        /* renamed from: v */
        int f150272v;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f150270t = obj;
            this.f150272v |= Integer.MIN_VALUE;
            return C32530i.this.mo157492b(null, this);
        }
    }

    private C32530i() {
    }

    @Override // p723zo.InterfaceC32526e
    /* renamed from: a */
    public Object mo157490a(InterfaceC32525d interfaceC32525d, Continuation continuation) {
        return FlowKt.m113304v(new a(f150253b, interfaceC32525d), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f A[PHI: r7
  0x005f: PHI (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:17:0x005c, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p723zo.InterfaceC32527f
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo157492b(AbstractC32528g abstractC32528g, Continuation continuation) {
        c cVar;
        Object obj;
        Object m142578e;
        int i11;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f150272v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f150272v = i12 - Integer.MIN_VALUE;
                obj = cVar.f150270t;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f150272v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC32528g = (AbstractC32528g) cVar.f150269s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MutableSharedFlow mutableSharedFlow = f150253b;
                    cVar.f150269s = abstractC32528g;
                    cVar.f150272v = 1;
                    if (mutableSharedFlow.mo12109b(abstractC32528g, cVar) == m142578e) {
                        return m142578e;
                    }
                }
                b bVar = new b(f150254c, abstractC32528g);
                cVar.f150269s = null;
                cVar.f150272v = 2;
                obj = FlowKt.m113304v(bVar, cVar);
                if (obj != m142578e) {
                    return m142578e;
                }
                return obj;
            }
        }
        cVar = new c(continuation);
        obj = cVar.f150270t;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f150272v;
        if (i11 == 0) {
        }
        b bVar2 = new b(f150254c, abstractC32528g);
        cVar.f150269s = null;
        cVar.f150272v = 2;
        obj = FlowKt.m113304v(bVar2, cVar);
        if (obj != m142578e) {
        }
    }

    @Override // p723zo.InterfaceC32526e
    /* renamed from: c */
    public void mo157491c(AbstractC32529h abstractC32529h) {
        AbstractC19074t.m100208f(abstractC32529h, "result");
        f150254c.mo113433d(abstractC32529h);
    }
}
