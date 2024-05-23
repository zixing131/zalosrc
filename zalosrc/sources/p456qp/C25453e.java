package p456qp;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p185gc.AbstractC19383g;
import p399op.C24405q;
import p426pp.C24902e;
import p426pp.C24903f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qp.e */
/* loaded from: classes4.dex */
public final class C25453e extends AbstractC19383g {

    /* renamed from: a */
    private final C24405q f121885a;

    /* renamed from: qp.e$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo87822a(String str, Exception exc);

        /* renamed from: b */
        void mo87823b(C24902e c24902e, C24903f c24903f);

        /* renamed from: c */
        void mo87824c(Job job);
    }

    /* renamed from: qp.e$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f121886a;

        /* renamed from: b */
        private final CoroutineScope f121887b;

        /* renamed from: c */
        private final a f121888c;

        public b(String str, CoroutineScope coroutineScope, a aVar) {
            AbstractC19074t.m100208f(str, "idSong");
            AbstractC19074t.m100208f(coroutineScope, "scope");
            AbstractC19074t.m100208f(aVar, "callback");
            this.f121886a = str;
            this.f121887b = coroutineScope;
            this.f121888c = aVar;
        }

        /* renamed from: a */
        public final a m131843a() {
            return this.f121888c;
        }

        /* renamed from: b */
        public final String m131844b() {
            return this.f121886a;
        }

        /* renamed from: c */
        public final CoroutineScope m131845c() {
            return this.f121887b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f121886a, bVar.f121886a) && AbstractC19074t.m100204b(this.f121887b, bVar.f121887b) && AbstractC19074t.m100204b(this.f121888c, bVar.f121888c);
        }

        public int hashCode() {
            return (((this.f121886a.hashCode() * 31) + this.f121887b.hashCode()) * 31) + this.f121888c.hashCode();
        }

        public String toString() {
            return "Param(idSong=" + this.f121886a + ", scope=" + this.f121887b + ", callback=" + this.f121888c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qp.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f121889t;

        /* renamed from: u */
        int f121890u;

        /* renamed from: w */
        final /* synthetic */ b f121892w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f121892w = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f121892w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C24902e c24902e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121890u;
            try {
            } catch (Exception e11) {
                this.f121892w.m131843a().mo87822a(this.f121892w.m131844b(), e11);
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        c24902e = (C24902e) this.f121889t;
                        AbstractC24862s.m129228b(obj);
                        this.f121892w.m131843a().mo87823b(c24902e, (C24903f) obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C24405q m131841c = C25453e.this.m131841c();
                String m131844b = this.f121892w.m131844b();
                this.f121890u = 1;
                obj = m131841c.mo127588f(m131844b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C24902e c24902e2 = (C24902e) obj;
            C24405q m131841c2 = C25453e.this.m131841c();
            String m129490f = c24902e2.m129490f();
            String m129493i = c24902e2.m129493i();
            this.f121889t = c24902e2;
            this.f121890u = 2;
            Object mo127590i = m131841c2.mo127590i(m129490f, m129493i, this);
            if (mo127590i == m142578e) {
                return m142578e;
            }
            c24902e = c24902e2;
            obj = mo127590i;
            this.f121892w.m131843a().mo87823b(c24902e, (C24903f) obj);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C25453e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: c */
    public final C24405q m131841c() {
        return this.f121885a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        Job m112540d;
        AbstractC19074t.m100208f(bVar, "params");
        m112540d = BuildersKt__Builders_commonKt.m112540d(bVar.m131845c(), null, null, new c(bVar, null), 3, null);
        bVar.m131843a().mo87824c(m112540d);
    }

    public C25453e(C24405q c24405q) {
        AbstractC19074t.m100208f(c24405q, "repo");
        this.f121885a = c24405q;
    }

    public /* synthetic */ C25453e(C24405q c24405q, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24405q.Companion.m127651a() : c24405q);
    }
}
