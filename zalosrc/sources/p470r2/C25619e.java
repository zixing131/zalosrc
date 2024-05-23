package p470r2;

import androidx.work.AbstractC2253u;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import p470r2.AbstractC25616b;
import p501s2.AbstractC26093c;
import p501s2.C26091a;
import p501s2.C26092b;
import p501s2.C26094d;
import p501s2.C26095e;
import p501s2.C26096f;
import p501s2.C26097g;
import p501s2.C26098h;
import p515t2.C26463n;
import p535u2.C26976w;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: r2.e */
/* loaded from: classes.dex */
public final class C25619e {

    /* renamed from: a */
    private final List f122474a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r2.e$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f122475q = new a();

        a() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(AbstractC26093c abstractC26093c) {
            AbstractC19074t.m100208f(abstractC26093c, "it");
            String simpleName = abstractC26093c.getClass().getSimpleName();
            AbstractC19074t.m100207e(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    /* renamed from: r2.e$b */
    /* loaded from: classes2.dex */
    public static final class b implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow[] f122476p;

        /* renamed from: r2.e$b$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Flow[] f122477q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Flow[] flowArr) {
                super(0);
                this.f122477q = flowArr;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final Object[] mo12V4() {
                return new AbstractC25616b[this.f122477q.length];
            }
        }

        /* renamed from: r2.e$b$b */
        /* loaded from: classes2.dex */
        public static final class C32965b extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f122478t;

            /* renamed from: u */
            private /* synthetic */ Object f122479u;

            /* renamed from: v */
            /* synthetic */ Object f122480v;

            public C32965b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                AbstractC25616b abstractC25616b;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f122478t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f122479u;
                    AbstractC25616b[] abstractC25616bArr = (AbstractC25616b[]) ((Object[]) this.f122480v);
                    int length = abstractC25616bArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            abstractC25616b = abstractC25616bArr[i12];
                            if (!AbstractC19074t.m100204b(abstractC25616b, AbstractC25616b.a.f122468a)) {
                                break;
                            }
                            i12++;
                        } else {
                            abstractC25616b = null;
                            break;
                        }
                    }
                    if (abstractC25616b == null) {
                        abstractC25616b = AbstractC25616b.a.f122468a;
                    }
                    this.f122478t = 1;
                    if (flowCollector.mo12109b(abstractC25616b, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
                C32965b c32965b = new C32965b(continuation);
                c32965b.f122479u = flowCollector;
                c32965b.f122480v = objArr;
                return c32965b.mo239o(C24848g0.f119245a);
            }
        }

        public b(Flow[] flowArr) {
            this.f122476p = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Flow[] flowArr = this.f122476p;
            Object m113542a = CombineKt.m113542a(flowCollector, flowArr, new a(flowArr), new C32965b(null), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m113542a == m142578e) {
                return m113542a;
            }
            return C24848g0.f119245a;
        }
    }

    public C25619e(List list) {
        AbstractC19074t.m100208f(list, "controllers");
        this.f122474a = list;
    }

    /* renamed from: a */
    public final boolean m132304a(C26976w c26976w) {
        String str;
        String m131214n0;
        AbstractC19074t.m100208f(c26976w, "workSpec");
        List list = this.f122474a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC26093c) obj).m134285e(c26976w)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            str = AbstractC25620f.f122481a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Work ");
            sb2.append(c26976w.f127497a);
            sb2.append(" constrained by ");
            m131214n0 = AbstractC25332a0.m131214n0(arrayList, null, null, null, 0, null, a.f122475q, 31, null);
            sb2.append(m131214n0);
            m11895e.mo11898a(str, sb2.toString());
        }
        return arrayList.isEmpty();
    }

    /* renamed from: b */
    public final Flow m132305b(C26976w c26976w) {
        int m131511r;
        List m131185M0;
        AbstractC19074t.m100208f(c26976w, "spec");
        List list = this.f122474a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC26093c) obj).mo134280c(c26976w)) {
                arrayList.add(obj);
            }
        }
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AbstractC26093c) it.next()).m134286f());
        }
        m131185M0 = AbstractC25332a0.m131185M0(arrayList2);
        return FlowKt.m113298p(new b((Flow[]) m131185M0.toArray(new Flow[0])));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C25619e(C26463n c26463n) {
        this(r4);
        List m131505m;
        AbstractC19074t.m100208f(c26463n, "trackers");
        m131505m = AbstractC25368s.m131505m(new C26091a(c26463n.m136373a()), new C26092b(c26463n.m136374b()), new C26098h(c26463n.m136376d()), new C26094d(c26463n.m136375c()), new C26097g(c26463n.m136375c()), new C26096f(c26463n.m136375c()), new C26095e(c26463n.m136375c()));
    }
}
