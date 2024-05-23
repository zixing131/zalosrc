package com.zing.zalo.p077ui.call.settingringtone.presenter.ringtonesystemsource;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.AbstractC11208a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k50.C21478f;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l50.C22087i;
import l50.C22092n;
import p205hc.C19964c;
import p207he.C20024r;
import p426pp.AbstractC24900c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import qm0.AbstractC25370t;
import r50.AbstractC25664a;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a */
/* loaded from: classes5.dex */
public final class C11233a extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final C22087i f56516s;

    /* renamed from: t */
    private final C22092n f56517t;

    /* renamed from: u */
    private C1761c0 f56518u;

    /* renamed from: v */
    private C1761c0 f56519v;

    /* renamed from: w */
    private final LiveData f56520w;

    /* renamed from: x */
    private C1761c0 f56521x;

    /* renamed from: y */
    private final LiveData f56522y;

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a$b */
    /* loaded from: classes5.dex */
    public static abstract class b {

        /* renamed from: a */
        private final AbstractC11208a.b f56523a;

        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends b {

            /* renamed from: b */
            private final Exception f56524b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC11208a.b bVar, Exception exc) {
                super(bVar, null);
                AbstractC19074t.m100208f(bVar, "data");
                this.f56524b = exc;
            }

            /* renamed from: b */
            public final Exception m58933b() {
                return this.f56524b;
            }
        }

        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32749b extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32749b(AbstractC11208a.b bVar) {
                super(bVar, null);
                AbstractC19074t.m100208f(bVar, "data");
            }
        }

        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a$b$c */
        /* loaded from: classes5.dex */
        public static final class c extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractC11208a.b bVar) {
                super(bVar, null);
                AbstractC19074t.m100208f(bVar, "data");
            }
        }

        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a$b$d */
        /* loaded from: classes5.dex */
        public static final class d extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(AbstractC11208a.b bVar) {
                super(bVar, null);
                AbstractC19074t.m100208f(bVar, "data");
            }
        }

        public /* synthetic */ b(AbstractC11208a.b bVar, AbstractC19060k abstractC19060k) {
            this(bVar);
        }

        /* renamed from: a */
        public final AbstractC11208a.b m58932a() {
            return this.f56523a;
        }

        private b(AbstractC11208a.b bVar) {
            this.f56523a = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56525t;

        /* renamed from: v */
        final /* synthetic */ AbstractC11208a.b f56527v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC11208a.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f56527v = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f56527v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object obj2;
            AbstractC28298d.m142578e();
            if (this.f56525t == 0) {
                AbstractC24862s.m129228b(obj);
                List list = (List) C11233a.this.f56518u.mo9215f();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            AbstractC11208a abstractC11208a = (AbstractC11208a) obj2;
                            if ((abstractC11208a instanceof AbstractC11208a.b) && ((AbstractC11208a.b) abstractC11208a).m58748d()) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    AbstractC11208a abstractC11208a2 = (AbstractC11208a) obj2;
                    if (abstractC11208a2 != null) {
                        C11233a c11233a = C11233a.this;
                        if (abstractC11208a2 instanceof AbstractC11208a.b) {
                            C1761c0 c1761c0 = c11233a.f56519v;
                            AbstractC11208a.b bVar = (AbstractC11208a.b) abstractC11208a2;
                            bVar.m58750f(false);
                            c1761c0.mo9224q(new C19964c(new b.d(bVar)));
                        }
                    }
                }
                C1761c0 c1761c02 = C11233a.this.f56519v;
                AbstractC11208a.b bVar2 = this.f56527v;
                bVar2.m58751g(false);
                bVar2.m58750f(true);
                c1761c02.mo9224q(new C19964c(new b.c(bVar2)));
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

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56528t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a$d$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C11233a f56530p;

            a(C11233a c11233a) {
                this.f56530p = c11233a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                List m131496e;
                int m131511r;
                if (!(abstractC24900c instanceof AbstractC24900c.b)) {
                    if (abstractC24900c instanceof AbstractC24900c.c) {
                        C1761c0 c1761c0 = this.f56530p.f56518u;
                        Iterable iterable = (Iterable) ((AbstractC24900c.c) abstractC24900c).m129474a();
                        m131511r = AbstractC25370t.m131511r(iterable, 10);
                        ArrayList arrayList = new ArrayList(m131511r);
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AbstractC25664a.m132550b((C21478f) it.next()));
                        }
                        c1761c0.mo9221n(arrayList);
                    } else if (abstractC24900c instanceof AbstractC24900c.a) {
                        C1761c0 c1761c02 = this.f56530p.f56518u;
                        m131496e = AbstractC25366r.m131496e(AbstractC11208a.c.f56368a);
                        c1761c02.mo9221n(m131496e);
                    }
                }
                return C24848g0.f119245a;
            }
        }

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56528t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C22087i c22087i = C11233a.this.f56516s;
                this.f56528t = 1;
                obj = c22087i.m101503a(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(C11233a.this);
                this.f56528t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56531t;

        /* renamed from: v */
        final /* synthetic */ AbstractC11208a.b f56533v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.a$e$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C11233a f56534p;

            /* renamed from: q */
            final /* synthetic */ AbstractC11208a.b f56535q;

            a(C11233a c11233a, AbstractC11208a.b bVar) {
                this.f56534p = c11233a;
                this.f56535q = bVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                if (abstractC24900c instanceof AbstractC24900c.b) {
                    C1761c0 c1761c0 = this.f56534p.f56519v;
                    AbstractC11208a.b bVar = this.f56535q;
                    bVar.m58751g(true);
                    c1761c0.mo9221n(new C19964c(new b.C32749b(bVar)));
                } else if (abstractC24900c instanceof AbstractC24900c.c) {
                    this.f56534p.m58925U(this.f56535q);
                } else if (abstractC24900c instanceof AbstractC24900c.a) {
                    C1761c0 c1761c02 = this.f56534p.f56519v;
                    AbstractC11208a.b bVar2 = this.f56535q;
                    bVar2.m58751g(false);
                    c1761c02.mo9221n(new C19964c(new b.a(bVar2, ((AbstractC24900c.a) abstractC24900c).m129473a())));
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC11208a.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f56533v = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f56533v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56531t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C22092n c22092n = C11233a.this.f56517t;
                int m58746b = this.f56533v.m58746b();
                String uri = this.f56533v.m58747c().toString();
                AbstractC19074t.m100207e(uri, "toString(...)");
                C22092n.a aVar = new C22092n.a(m58746b, uri);
                this.f56531t = 1;
                obj = c22092n.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C11233a.this, this.f56533v);
                this.f56531t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C11233a(C22087i c22087i, C22092n c22092n) {
        AbstractC19074t.m100208f(c22087i, "getSystemRingtones");
        AbstractC19074t.m100208f(c22092n, "selectSystemRingtone");
        this.f56516s = c22087i;
        this.f56517t = c22092n;
        this.f56518u = new C1761c0();
        C1761c0 c1761c0 = new C1761c0();
        this.f56519v = c1761c0;
        this.f56520w = c1761c0;
        C1761c0 c1761c02 = new C1761c0();
        this.f56521x = c1761c02;
        this.f56522y = c1761c02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final Job m58925U(AbstractC11208a.b bVar) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new c(bVar, null), 2, null);
        return m112540d;
    }

    /* renamed from: X */
    private final Job m58926X(AbstractC11208a.b bVar) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new e(bVar, null), 2, null);
        return m112540d;
    }

    /* renamed from: R */
    public final LiveData m58927R() {
        return this.f56522y;
    }

    /* renamed from: S */
    public final LiveData m58928S() {
        return this.f56518u;
    }

    /* renamed from: T */
    public final LiveData m58929T() {
        return this.f56520w;
    }

    /* renamed from: V */
    public final Job m58930V() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new d(null), 3, null);
        return m112540d;
    }

    /* renamed from: W */
    public final void m58931W(AbstractC11208a.b bVar) {
        AbstractC19074t.m100208f(bVar, "data");
        if (!C20024r.m103941j() && !C7853b.Companion.m40150a().m40133i0()) {
            this.f56521x.mo9221n(new C19964c(bVar));
        }
        if (bVar.m58748d()) {
            return;
        }
        m58926X(bVar);
    }
}
