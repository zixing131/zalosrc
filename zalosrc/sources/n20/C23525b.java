package n20;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1798u0;
import androidx.work.AbstractC2144f;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.User;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import f10.EnumC18694f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import j20.InterfaceC20907a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n20.AbstractC23524a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import r10.C25606c;
import r10.C25610g;
import t10.C26449a;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: n20.b */
/* loaded from: classes5.dex */
public final class C23525b extends AbstractC23524a {
    public static final b Companion = new b(null);

    /* renamed from: A */
    private final MutableStateFlow f114197A;

    /* renamed from: B */
    private final StateFlow f114198B;

    /* renamed from: C */
    private final MutableStateFlow f114199C;

    /* renamed from: D */
    private final StateFlow f114200D;

    /* renamed from: u */
    private final InterfaceC24854k f114201u;

    /* renamed from: v */
    private final InterfaceC24854k f114202v;

    /* renamed from: w */
    private Integer f114203w;

    /* renamed from: x */
    private int f114204x;

    /* renamed from: y */
    private final MutableStateFlow f114205y;

    /* renamed from: z */
    private final StateFlow f114206z;

    /* renamed from: n20.b$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final User f114207a;

        /* renamed from: b */
        private final boolean f114208b;

        public a(User user, boolean z11) {
            AbstractC19074t.m100208f(user, "user");
            this.f114207a = user;
            this.f114208b = z11;
        }

        /* renamed from: a */
        public final boolean m123470a() {
            return this.f114208b;
        }

        /* renamed from: b */
        public final User m123471b() {
            return this.f114207a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f114207a, aVar.f114207a) && this.f114208b == aVar.f114208b;
        }

        public int hashCode() {
            return (this.f114207a.hashCode() * 31) + AbstractC2144f.m11520a(this.f114208b);
        }

        public String toString() {
            return "BlockResult(user=" + this.f114207a + ", needBlock=" + this.f114208b + ")";
        }
    }

    /* renamed from: n20.b$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.b$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114209t;

        /* renamed from: v */
        final /* synthetic */ User f114211v;

        /* renamed from: n20.b$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f114212t;

            /* renamed from: u */
            /* synthetic */ Object f114213u;

            /* renamed from: v */
            final /* synthetic */ C23525b f114214v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C23525b c23525b, Continuation continuation) {
                super(3, continuation);
                this.f114214v = c23525b;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f114212t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f114214v.f114197A.setValue(new InterfaceC20907a.a((Throwable) this.f114213u));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                a aVar = new a(this.f114214v, continuation);
                aVar.f114213u = th2;
                return aVar.mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: n20.b$c$b */
        /* loaded from: classes5.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23525b f114215p;

            /* renamed from: q */
            final /* synthetic */ User f114216q;

            b(C23525b c23525b, User user) {
                this.f114215p = c23525b;
                this.f114216q = user;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(EnumC18694f enumC18694f, Continuation continuation) {
                this.f114215p.f114197A.setValue(new InterfaceC20907a.d(new a(this.f114216q, true)));
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(User user, Continuation continuation) {
            super(2, continuation);
            this.f114211v = user;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f114211v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Flow m113288f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114209t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23525b.this.f114197A.setValue(InterfaceC20907a.c.f102733a);
                Flow flow = (Flow) C23525b.this.m123456b0().m101509a(new C25610g.a.C32963a(this.f114211v.m51234g()));
                if (flow != null && (m113288f = FlowKt.m113288f(flow, new a(C23525b.this, null))) != null) {
                    b bVar = new b(C23525b.this, this.f114211v);
                    this.f114209t = 1;
                    if (m113288f.mo97893a(bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f114217q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25606c mo12V4() {
            return C26449a.f125639a.m136340e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.b$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114218t;

        /* renamed from: n20.b$e$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f114220t;

            /* renamed from: u */
            /* synthetic */ Object f114221u;

            /* renamed from: v */
            final /* synthetic */ C23525b f114222v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C23525b c23525b, Continuation continuation) {
                super(3, continuation);
                this.f114222v = c23525b;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f114220t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f114222v.f114205y.setValue(new InterfaceC20907a.a((Throwable) this.f114221u));
                    this.f114222v.f114204x = 0;
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                a aVar = new a(this.f114222v, continuation);
                aVar.f114221u = th2;
                return aVar.mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: n20.b$e$b */
        /* loaded from: classes5.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23525b f114223p;

            b(C23525b c23525b) {
                this.f114223p = c23525b;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(Section section, Continuation continuation) {
                this.f114223p.f114204x = section.m51168m().size();
                this.f114223p.f114205y.setValue(new InterfaceC20907a.d(section));
                return C24848g0.f119245a;
            }
        }

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Flow m113288f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114218t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23525b.this.f114205y.setValue(InterfaceC20907a.c.f102733a);
                Flow flow = (Flow) C23525b.this.m123455Z().m101509a(new C25606c.a(null, C23525b.this.f114203w));
                if (flow != null && (m113288f = FlowKt.m113288f(flow, new a(C23525b.this, null))) != null) {
                    b bVar = new b(C23525b.this);
                    this.f114218t = 1;
                    if (m113288f.mo97893a(bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.b$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114224t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f114226v;

        /* renamed from: n20.b$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f114227t;

            /* renamed from: u */
            /* synthetic */ Object f114228u;

            /* renamed from: v */
            final /* synthetic */ C23525b f114229v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C23525b c23525b, Continuation continuation) {
                super(3, continuation);
                this.f114229v = c23525b;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f114227t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f114229v.f114205y.setValue(new InterfaceC20907a.a((Throwable) this.f114228u));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                a aVar = new a(this.f114229v, continuation);
                aVar.f114228u = th2;
                return aVar.mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: n20.b$f$b */
        /* loaded from: classes5.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23525b f114230p;

            b(C23525b c23525b) {
                this.f114230p = c23525b;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(Section section, Continuation continuation) {
                this.f114230p.f114204x += section.m51168m().size();
                this.f114230p.f114205y.setValue(new InterfaceC20907a.d(section));
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(2, continuation);
            this.f114226v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f114226v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Flow m113288f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114224t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) C23525b.this.m123455Z().m101509a(new C25606c.a(this.f114226v, C23525b.this.f114203w));
                if (flow != null && (m113288f = FlowKt.m113288f(flow, new a(C23525b.this, null))) != null) {
                    b bVar = new b(C23525b.this);
                    this.f114224t = 1;
                    if (m113288f.mo97893a(bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.b$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f114231q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25610g mo12V4() {
            return C26449a.f125639a.m136344i();
        }
    }

    public C23525b() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(d.f114217q);
        this.f114201u = m129210a;
        m129210a2 = AbstractC24856m.m129210a(g.f114231q);
        this.f114202v = m129210a2;
        InterfaceC20907a.b bVar = InterfaceC20907a.b.f102732a;
        MutableStateFlow m113503a = StateFlowKt.m113503a(bVar);
        this.f114205y = m113503a;
        this.f114206z = FlowKt.m113284b(m113503a);
        MutableStateFlow m113503a2 = StateFlowKt.m113503a(bVar);
        this.f114197A = m113503a2;
        this.f114198B = FlowKt.m113284b(m113503a2);
        MutableStateFlow m113503a3 = StateFlowKt.m113503a(Boolean.TRUE);
        this.f114199C = m113503a3;
        this.f114200D = FlowKt.m113284b(m113503a3);
    }

    /* renamed from: Z */
    public final C25606c m123455Z() {
        return (C25606c) this.f114201u.getValue();
    }

    /* renamed from: b0 */
    public final C25610g m123456b0() {
        return (C25610g) this.f114202v.getValue();
    }

    /* renamed from: W */
    public final void m123457W(User user) {
        AbstractC19074t.m100208f(user, "user");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c(user, null), 3, null);
    }

    /* renamed from: X */
    public final StateFlow m123458X() {
        return this.f114198B;
    }

    /* renamed from: Y */
    public final StateFlow m123459Y() {
        return this.f114206z;
    }

    /* renamed from: a */
    public final void m123460a(LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        if (this.f114204x > 0 && !m123463e0()) {
            this.f114205y.setValue(InterfaceC20907a.c.f102733a);
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new f(loadMoreInfo, null), 3, null);
        }
    }

    /* renamed from: a0 */
    public final StateFlow m123461a0() {
        return this.f114200D;
    }

    /* renamed from: c0 */
    public final boolean m123462c0() {
        return this.f114206z.getValue() instanceof InterfaceC20907a.a;
    }

    /* renamed from: e0 */
    public final boolean m123463e0() {
        return this.f114206z.getValue() instanceof InterfaceC20907a.c;
    }

    /* renamed from: f0 */
    public final boolean m123464f0() {
        return this.f114204x > 0;
    }

    /* renamed from: g0 */
    public final void m123465g0() {
        m123443N(new AbstractC23524a.b("back", null, 2, null));
    }

    /* renamed from: h0 */
    public final void m123466h0(User user) {
        AbstractC19074t.m100208f(user, "user");
        m123443N(new AbstractC23524a.b("click_user", user));
    }

    /* renamed from: i */
    public final void m123467i() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new e(null), 3, null);
    }

    /* renamed from: i0 */
    public final void m123468i0(Bundle bundle) {
        Integer num;
        if (bundle != null) {
            num = Integer.valueOf(bundle.getInt("TYPE"));
        } else {
            num = null;
        }
        this.f114203w = num;
    }

    /* renamed from: j0 */
    public final void m123469j0(boolean z11) {
        this.f114199C.setValue(Boolean.valueOf(z11));
    }
}
