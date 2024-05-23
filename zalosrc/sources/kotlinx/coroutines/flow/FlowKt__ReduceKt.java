package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.C19059j0;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__ReduceKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113379a(Flow flow, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Object m142578e;
        int i11;
        InterfaceC18509p interfaceC18509p2;
        C19059j0 c19059j0;
        AbortFlowException e11;
        FlowCollector flowCollector;
        Object obj;
        if (continuation instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuation;
            int i12 = flowKt__ReduceKt$first$3.f106813w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.f106813w = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ReduceKt$first$3.f106812v;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ReduceKt$first$3.f106813w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) flowKt__ReduceKt$first$3.f106811u;
                        c19059j0 = (C19059j0) flowKt__ReduceKt$first$3.f106810t;
                        interfaceC18509p2 = (InterfaceC18509p) flowKt__ReduceKt$first$3.f106809s;
                        try {
                            AbstractC24862s.m129228b(obj2);
                        } catch (AbortFlowException e12) {
                            e11 = e12;
                            FlowExceptions_commonKt.m113553a(e11, flowCollector);
                            obj = c19059j0.f94941p;
                            if (obj == NullSurrogateKt.f107313a) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    C19059j0 c19059j02 = new C19059j0();
                    c19059j02.f94941p = NullSurrogateKt.f107313a;
                    FlowCollector flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(interfaceC18509p, c19059j02);
                    try {
                        flowKt__ReduceKt$first$3.f106809s = interfaceC18509p;
                        flowKt__ReduceKt$first$3.f106810t = c19059j02;
                        flowKt__ReduceKt$first$3.f106811u = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                        flowKt__ReduceKt$first$3.f106813w = 1;
                        if (flow.mo97893a(flowKt__ReduceKt$first$$inlined$collectWhile$2, flowKt__ReduceKt$first$3) == m142578e) {
                            return m142578e;
                        }
                        interfaceC18509p2 = interfaceC18509p;
                        c19059j0 = c19059j02;
                    } catch (AbortFlowException e13) {
                        interfaceC18509p2 = interfaceC18509p;
                        c19059j0 = c19059j02;
                        e11 = e13;
                        flowCollector = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                        FlowExceptions_commonKt.m113553a(e11, flowCollector);
                        obj = c19059j0.f94941p;
                        if (obj == NullSurrogateKt.f107313a) {
                        }
                    }
                }
                obj = c19059j0.f94941p;
                if (obj == NullSurrogateKt.f107313a) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + interfaceC18509p2);
            }
        }
        flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuation);
        Object obj22 = flowKt__ReduceKt$first$3.f106812v;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ReduceKt$first$3.f106813w;
        if (i11 == 0) {
        }
        obj = c19059j0.f94941p;
        if (obj == NullSurrogateKt.f107313a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113380b(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        AbortFlowException e11;
        FlowCollector flowCollector;
        Object obj;
        if (continuation instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuation;
            int i12 = flowKt__ReduceKt$first$1.f106808v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.f106808v = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ReduceKt$first$1.f106807u;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ReduceKt$first$1.f106808v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$1) flowKt__ReduceKt$first$1.f106806t;
                        c19059j0 = (C19059j0) flowKt__ReduceKt$first$1.f106805s;
                        try {
                            AbstractC24862s.m129228b(obj2);
                        } catch (AbortFlowException e12) {
                            e11 = e12;
                            FlowExceptions_commonKt.m113553a(e11, flowCollector);
                            obj = c19059j0.f94941p;
                            if (obj == NullSurrogateKt.f107313a) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    final C19059j0 c19059j02 = new C19059j0();
                    c19059j02.f94941p = NullSurrogateKt.f107313a;
                    FlowCollector flowCollector2 = new FlowCollector<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* renamed from: b */
                        public Object mo12109b(Object obj3, Continuation continuation2) {
                            C19059j0.this.f94941p = obj3;
                            throw new AbortFlowException(this);
                        }
                    };
                    try {
                        flowKt__ReduceKt$first$1.f106805s = c19059j02;
                        flowKt__ReduceKt$first$1.f106806t = flowCollector2;
                        flowKt__ReduceKt$first$1.f106808v = 1;
                        if (flow.mo97893a(flowCollector2, flowKt__ReduceKt$first$1) == m142578e) {
                            return m142578e;
                        }
                        c19059j0 = c19059j02;
                    } catch (AbortFlowException e13) {
                        c19059j0 = c19059j02;
                        e11 = e13;
                        flowCollector = flowCollector2;
                        FlowExceptions_commonKt.m113553a(e11, flowCollector);
                        obj = c19059j0.f94941p;
                        if (obj == NullSurrogateKt.f107313a) {
                        }
                    }
                }
                obj = c19059j0.f94941p;
                if (obj == NullSurrogateKt.f107313a) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
        Object obj22 = flowKt__ReduceKt$first$1.f106807u;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ReduceKt$first$1.f106808v;
        if (i11 == 0) {
        }
        obj = c19059j0.f94941p;
        if (obj == NullSurrogateKt.f107313a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113381c(Flow flow, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        AbortFlowException e11;
        FlowCollector flowCollector;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3) continuation;
            int i12 = flowKt__ReduceKt$firstOrNull$3.f106821v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$3.f106821v = i12 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$firstOrNull$3.f106820u;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ReduceKt$firstOrNull$3.f106821v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) flowKt__ReduceKt$firstOrNull$3.f106819t;
                        c19059j0 = (C19059j0) flowKt__ReduceKt$firstOrNull$3.f106818s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (AbortFlowException e12) {
                            e11 = e12;
                            FlowExceptions_commonKt.m113553a(e11, flowCollector);
                            return c19059j0.f94941p;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C19059j0 c19059j02 = new C19059j0();
                    FlowCollector flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(interfaceC18509p, c19059j02);
                    try {
                        flowKt__ReduceKt$firstOrNull$3.f106818s = c19059j02;
                        flowKt__ReduceKt$firstOrNull$3.f106819t = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                        flowKt__ReduceKt$firstOrNull$3.f106821v = 1;
                        if (flow.mo97893a(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, flowKt__ReduceKt$firstOrNull$3) == m142578e) {
                            return m142578e;
                        }
                        c19059j0 = c19059j02;
                    } catch (AbortFlowException e13) {
                        c19059j0 = c19059j02;
                        e11 = e13;
                        flowCollector = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                        FlowExceptions_commonKt.m113553a(e11, flowCollector);
                        return c19059j0.f94941p;
                    }
                }
                return c19059j0.f94941p;
            }
        }
        flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuation);
        Object obj2 = flowKt__ReduceKt$firstOrNull$3.f106820u;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ReduceKt$firstOrNull$3.f106821v;
        if (i11 == 0) {
        }
        return c19059j0.f94941p;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113382d(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        AbortFlowException e11;
        FlowCollector flowCollector;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) continuation;
            int i12 = flowKt__ReduceKt$firstOrNull$1.f106817v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.f106817v = i12 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$firstOrNull$1.f106816u;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ReduceKt$firstOrNull$1.f106817v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) flowKt__ReduceKt$firstOrNull$1.f106815t;
                        c19059j0 = (C19059j0) flowKt__ReduceKt$firstOrNull$1.f106814s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (AbortFlowException e12) {
                            e11 = e12;
                            FlowExceptions_commonKt.m113553a(e11, flowCollector);
                            return c19059j0.f94941p;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    final C19059j0 c19059j02 = new C19059j0();
                    FlowCollector flowCollector2 = new FlowCollector<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* renamed from: b */
                        public Object mo12109b(Object obj2, Continuation continuation2) {
                            C19059j0.this.f94941p = obj2;
                            throw new AbortFlowException(this);
                        }
                    };
                    try {
                        flowKt__ReduceKt$firstOrNull$1.f106814s = c19059j02;
                        flowKt__ReduceKt$firstOrNull$1.f106815t = flowCollector2;
                        flowKt__ReduceKt$firstOrNull$1.f106817v = 1;
                        if (flow.mo97893a(flowCollector2, flowKt__ReduceKt$firstOrNull$1) == m142578e) {
                            return m142578e;
                        }
                        c19059j0 = c19059j02;
                    } catch (AbortFlowException e13) {
                        c19059j0 = c19059j02;
                        e11 = e13;
                        flowCollector = flowCollector2;
                        FlowExceptions_commonKt.m113553a(e11, flowCollector);
                        return c19059j0.f94941p;
                    }
                }
                return c19059j0.f94941p;
            }
        }
        flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
        Object obj2 = flowKt__ReduceKt$firstOrNull$1.f106816u;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ReduceKt$firstOrNull$1.f106817v;
        if (i11 == 0) {
        }
        return c19059j0.f94941p;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113383e(Flow flow, Object obj, InterfaceC18510q interfaceC18510q, Continuation continuation) {
        FlowKt__ReduceKt$fold$1 flowKt__ReduceKt$fold$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        if (continuation instanceof FlowKt__ReduceKt$fold$1) {
            flowKt__ReduceKt$fold$1 = (FlowKt__ReduceKt$fold$1) continuation;
            int i12 = flowKt__ReduceKt$fold$1.f106824u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$fold$1.f106824u = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ReduceKt$fold$1.f106823t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ReduceKt$fold$1.f106824u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19059j0 = (C19059j0) flowKt__ReduceKt$fold$1.f106822s;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    C19059j0 c19059j02 = new C19059j0();
                    c19059j02.f94941p = obj;
                    FlowCollector flowKt__ReduceKt$fold$2 = new FlowKt__ReduceKt$fold$2(c19059j02, interfaceC18510q);
                    flowKt__ReduceKt$fold$1.f106822s = c19059j02;
                    flowKt__ReduceKt$fold$1.f106824u = 1;
                    if (flow.mo97893a(flowKt__ReduceKt$fold$2, flowKt__ReduceKt$fold$1) == m142578e) {
                        return m142578e;
                    }
                    c19059j0 = c19059j02;
                }
                return c19059j0.f94941p;
            }
        }
        flowKt__ReduceKt$fold$1 = new FlowKt__ReduceKt$fold$1(continuation);
        Object obj22 = flowKt__ReduceKt$fold$1.f106823t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ReduceKt$fold$1.f106824u;
        if (i11 == 0) {
        }
        return c19059j0.f94941p;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113384f(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$last$1 flowKt__ReduceKt$last$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        Object obj;
        if (continuation instanceof FlowKt__ReduceKt$last$1) {
            flowKt__ReduceKt$last$1 = (FlowKt__ReduceKt$last$1) continuation;
            int i12 = flowKt__ReduceKt$last$1.f106833u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$last$1.f106833u = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ReduceKt$last$1.f106832t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ReduceKt$last$1.f106833u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19059j0 = (C19059j0) flowKt__ReduceKt$last$1.f106831s;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    final C19059j0 c19059j02 = new C19059j0();
                    c19059j02.f94941p = NullSurrogateKt.f107313a;
                    FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* renamed from: b */
                        public final Object mo12109b(Object obj3, Continuation continuation2) {
                            C19059j0.this.f94941p = obj3;
                            return C24848g0.f119245a;
                        }
                    };
                    flowKt__ReduceKt$last$1.f106831s = c19059j02;
                    flowKt__ReduceKt$last$1.f106833u = 1;
                    if (flow.mo97893a(flowCollector, flowKt__ReduceKt$last$1) == m142578e) {
                        return m142578e;
                    }
                    c19059j0 = c19059j02;
                }
                obj = c19059j0.f94941p;
                if (obj == NullSurrogateKt.f107313a) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        flowKt__ReduceKt$last$1 = new FlowKt__ReduceKt$last$1(continuation);
        Object obj22 = flowKt__ReduceKt$last$1.f106832t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ReduceKt$last$1.f106833u;
        if (i11 == 0) {
        }
        obj = c19059j0.f94941p;
        if (obj == NullSurrogateKt.f107313a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113385g(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$lastOrNull$1 flowKt__ReduceKt$lastOrNull$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        if (continuation instanceof FlowKt__ReduceKt$lastOrNull$1) {
            flowKt__ReduceKt$lastOrNull$1 = (FlowKt__ReduceKt$lastOrNull$1) continuation;
            int i12 = flowKt__ReduceKt$lastOrNull$1.f106837u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$lastOrNull$1.f106837u = i12 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$lastOrNull$1.f106836t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ReduceKt$lastOrNull$1.f106837u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19059j0 = (C19059j0) flowKt__ReduceKt$lastOrNull$1.f106835s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    final C19059j0 c19059j02 = new C19059j0();
                    FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* renamed from: b */
                        public final Object mo12109b(Object obj2, Continuation continuation2) {
                            C19059j0.this.f94941p = obj2;
                            return C24848g0.f119245a;
                        }
                    };
                    flowKt__ReduceKt$lastOrNull$1.f106835s = c19059j02;
                    flowKt__ReduceKt$lastOrNull$1.f106837u = 1;
                    if (flow.mo97893a(flowCollector, flowKt__ReduceKt$lastOrNull$1) == m142578e) {
                        return m142578e;
                    }
                    c19059j0 = c19059j02;
                }
                return c19059j0.f94941p;
            }
        }
        flowKt__ReduceKt$lastOrNull$1 = new FlowKt__ReduceKt$lastOrNull$1(continuation);
        Object obj2 = flowKt__ReduceKt$lastOrNull$1.f106836t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ReduceKt$lastOrNull$1.f106837u;
        if (i11 == 0) {
        }
        return c19059j0.f94941p;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113386h(Flow flow, InterfaceC18510q interfaceC18510q, Continuation continuation) {
        FlowKt__ReduceKt$reduce$1 flowKt__ReduceKt$reduce$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        Object obj;
        if (continuation instanceof FlowKt__ReduceKt$reduce$1) {
            flowKt__ReduceKt$reduce$1 = (FlowKt__ReduceKt$reduce$1) continuation;
            int i12 = flowKt__ReduceKt$reduce$1.f106841u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$1.f106841u = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ReduceKt$reduce$1.f106840t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ReduceKt$reduce$1.f106841u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19059j0 = (C19059j0) flowKt__ReduceKt$reduce$1.f106839s;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    C19059j0 c19059j02 = new C19059j0();
                    c19059j02.f94941p = NullSurrogateKt.f107313a;
                    FlowCollector flowKt__ReduceKt$reduce$2 = new FlowKt__ReduceKt$reduce$2(c19059j02, interfaceC18510q);
                    flowKt__ReduceKt$reduce$1.f106839s = c19059j02;
                    flowKt__ReduceKt$reduce$1.f106841u = 1;
                    if (flow.mo97893a(flowKt__ReduceKt$reduce$2, flowKt__ReduceKt$reduce$1) == m142578e) {
                        return m142578e;
                    }
                    c19059j0 = c19059j02;
                }
                obj = c19059j0.f94941p;
                if (obj == NullSurrogateKt.f107313a) {
                    return obj;
                }
                throw new NoSuchElementException("Empty flow can't be reduced");
            }
        }
        flowKt__ReduceKt$reduce$1 = new FlowKt__ReduceKt$reduce$1(continuation);
        Object obj22 = flowKt__ReduceKt$reduce$1.f106840t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ReduceKt$reduce$1.f106841u;
        if (i11 == 0) {
        }
        obj = c19059j0.f94941p;
        if (obj == NullSurrogateKt.f107313a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113387i(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        Object obj;
        if (continuation instanceof FlowKt__ReduceKt$single$1) {
            flowKt__ReduceKt$single$1 = (FlowKt__ReduceKt$single$1) continuation;
            int i12 = flowKt__ReduceKt$single$1.f106850u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$single$1.f106850u = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ReduceKt$single$1.f106849t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ReduceKt$single$1.f106850u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19059j0 = (C19059j0) flowKt__ReduceKt$single$1.f106848s;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    final C19059j0 c19059j02 = new C19059j0();
                    c19059j02.f94941p = NullSurrogateKt.f107313a;
                    FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* renamed from: b */
                        public final Object mo12109b(Object obj3, Continuation continuation2) {
                            C19059j0 c19059j03 = C19059j0.this;
                            if (c19059j03.f94941p == NullSurrogateKt.f107313a) {
                                c19059j03.f94941p = obj3;
                                return C24848g0.f119245a;
                            }
                            throw new IllegalArgumentException("Flow has more than one element".toString());
                        }
                    };
                    flowKt__ReduceKt$single$1.f106848s = c19059j02;
                    flowKt__ReduceKt$single$1.f106850u = 1;
                    if (flow.mo97893a(flowCollector, flowKt__ReduceKt$single$1) == m142578e) {
                        return m142578e;
                    }
                    c19059j0 = c19059j02;
                }
                obj = c19059j0.f94941p;
                if (obj == NullSurrogateKt.f107313a) {
                    return obj;
                }
                throw new NoSuchElementException("Flow is empty");
            }
        }
        flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(continuation);
        Object obj22 = flowKt__ReduceKt$single$1.f106849t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ReduceKt$single$1.f106850u;
        if (i11 == 0) {
        }
        obj = c19059j0.f94941p;
        if (obj == NullSurrogateKt.f107313a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113388j(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$singleOrNull$1 flowKt__ReduceKt$singleOrNull$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        AbortFlowException e11;
        FlowCollector flowCollector;
        Object obj;
        if (continuation instanceof FlowKt__ReduceKt$singleOrNull$1) {
            flowKt__ReduceKt$singleOrNull$1 = (FlowKt__ReduceKt$singleOrNull$1) continuation;
            int i12 = flowKt__ReduceKt$singleOrNull$1.f106855v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$singleOrNull$1.f106855v = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ReduceKt$singleOrNull$1.f106854u;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ReduceKt$singleOrNull$1.f106855v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        flowCollector = (FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) flowKt__ReduceKt$singleOrNull$1.f106853t;
                        c19059j0 = (C19059j0) flowKt__ReduceKt$singleOrNull$1.f106852s;
                        try {
                            AbstractC24862s.m129228b(obj2);
                        } catch (AbortFlowException e12) {
                            e11 = e12;
                            FlowExceptions_commonKt.m113553a(e11, flowCollector);
                            obj = c19059j0.f94941p;
                            if (obj != NullSurrogateKt.f107313a) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    final C19059j0 c19059j02 = new C19059j0();
                    c19059j02.f94941p = NullSurrogateKt.f107313a;
                    FlowCollector flowCollector2 = new FlowCollector<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* renamed from: b */
                        public Object mo12109b(Object obj3, Continuation continuation2) {
                            C19059j0 c19059j03 = C19059j0.this;
                            Object obj4 = c19059j03.f94941p;
                            Symbol symbol = NullSurrogateKt.f107313a;
                            if (obj4 == symbol) {
                                c19059j03.f94941p = obj3;
                                return C24848g0.f119245a;
                            }
                            c19059j03.f94941p = symbol;
                            throw new AbortFlowException(this);
                        }
                    };
                    try {
                        flowKt__ReduceKt$singleOrNull$1.f106852s = c19059j02;
                        flowKt__ReduceKt$singleOrNull$1.f106853t = flowCollector2;
                        flowKt__ReduceKt$singleOrNull$1.f106855v = 1;
                        if (flow.mo97893a(flowCollector2, flowKt__ReduceKt$singleOrNull$1) == m142578e) {
                            return m142578e;
                        }
                        c19059j0 = c19059j02;
                    } catch (AbortFlowException e13) {
                        c19059j0 = c19059j02;
                        e11 = e13;
                        flowCollector = flowCollector2;
                        FlowExceptions_commonKt.m113553a(e11, flowCollector);
                        obj = c19059j0.f94941p;
                        if (obj != NullSurrogateKt.f107313a) {
                        }
                    }
                }
                obj = c19059j0.f94941p;
                if (obj != NullSurrogateKt.f107313a) {
                    return null;
                }
                return obj;
            }
        }
        flowKt__ReduceKt$singleOrNull$1 = new FlowKt__ReduceKt$singleOrNull$1(continuation);
        Object obj22 = flowKt__ReduceKt$singleOrNull$1.f106854u;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ReduceKt$singleOrNull$1.f106855v;
        if (i11 == 0) {
        }
        obj = c19059j0.f94941p;
        if (obj != NullSurrogateKt.f107313a) {
        }
    }
}
