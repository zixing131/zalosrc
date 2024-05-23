package p501s2;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p470r2.AbstractC25616b;
import p470r2.InterfaceC25615a;
import p515t2.AbstractC26456g;
import p535u2.C26976w;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: s2.c */
/* loaded from: classes.dex */
public abstract class AbstractC26093c {

    /* renamed from: a */
    private final AbstractC26456g f124294a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s2.c$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f124295t;

        /* renamed from: u */
        private /* synthetic */ Object f124296u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s2.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C32969a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ AbstractC26093c f124298q;

            /* renamed from: r */
            final /* synthetic */ b f124299r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32969a(AbstractC26093c abstractC26093c, b bVar) {
                super(0);
                this.f124298q = abstractC26093c;
                this.f124299r = bVar;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m134288a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m134288a() {
                this.f124298q.f124294a.m136361f(this.f124299r);
            }
        }

        /* renamed from: s2.c$a$b */
        /* loaded from: classes2.dex */
        public static final class b implements InterfaceC25615a {

            /* renamed from: a */
            final /* synthetic */ AbstractC26093c f124300a;

            /* renamed from: b */
            final /* synthetic */ ProducerScope f124301b;

            b(AbstractC26093c abstractC26093c, ProducerScope producerScope) {
                this.f124300a = abstractC26093c;
                this.f124301b = producerScope;
            }

            @Override // p470r2.InterfaceC25615a
            /* renamed from: a */
            public void mo132298a(Object obj) {
                Object obj2;
                if (this.f124300a.mo134281d(obj)) {
                    obj2 = new AbstractC25616b.b(this.f124300a.mo134279b());
                } else {
                    obj2 = AbstractC25616b.a.f122468a;
                }
                this.f124301b.mo112918q().mo112912p(obj2);
            }
        }

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f124296u = obj;
            return aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f124295t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ProducerScope producerScope = (ProducerScope) this.f124296u;
                b bVar = new b(AbstractC26093c.this, producerScope);
                AbstractC26093c.this.f124294a.m136359c(bVar);
                C32969a c32969a = new C32969a(AbstractC26093c.this, bVar);
                this.f124295t = 1;
                if (ProduceKt.m113184a(producerScope, c32969a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((a) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public AbstractC26093c(AbstractC26456g abstractC26456g) {
        AbstractC19074t.m100208f(abstractC26456g, "tracker");
        this.f124294a = abstractC26456g;
    }

    /* renamed from: b */
    public abstract int mo134279b();

    /* renamed from: c */
    public abstract boolean mo134280c(C26976w c26976w);

    /* renamed from: d */
    public abstract boolean mo134281d(Object obj);

    /* renamed from: e */
    public final boolean m134285e(C26976w c26976w) {
        AbstractC19074t.m100208f(c26976w, "workSpec");
        if (mo134280c(c26976w) && mo134281d(this.f124294a.mo136351e())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Flow m134286f() {
        return FlowKt.m113287e(new a(null));
    }
}
