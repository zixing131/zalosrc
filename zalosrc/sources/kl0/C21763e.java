package kl0;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import jl0.AbstractC21286b;
import jl0.C21285a;
import jl0.C21287c;
import kotlin.coroutines.Continuation;
import lk0.C22504b;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24792r;
import pm0.C24861r;
import um0.C27317h;
import vk0.C28284f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import zk0.InterfaceC32222a;

/* renamed from: kl0.e */
/* loaded from: classes7.dex */
public final class C21763e extends AbstractC21286b {

    /* renamed from: kl0.e$a */
    /* loaded from: classes7.dex */
    public static final class a implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ Continuation f105661a;

        a(Continuation continuation) {
            this.f105661a = continuation;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C22504b c22504b) {
            AbstractC19074t.m100208f(c22504b, "zinstantData");
            try {
                Continuation continuation = this.f105661a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(new C21287c(c22504b, null, 2, null)));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104560t(e11);
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            try {
                C28284f c28284f = new C28284f(302, exc.getMessage());
                Continuation continuation = this.f105661a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(new C21287c(null, c28284f, 1, null)));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104560t(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21763e(C21285a c21285a, InterfaceC32222a interfaceC32222a) {
        super(c21285a, interfaceC32222a);
        AbstractC19074t.m100208f(c21285a, "info");
    }

    /* renamed from: h */
    private final Object m112255h(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        InterfaceC24792r m99745g = ((C21285a) m142531b()).m110242d().m99745g();
        int mo107090i = ((C21285a) m142531b()).m99746a().mo107090i();
        String mo107043a = ((C21285a) m142531b()).m110243e().mo107043a();
        if (mo107043a == null) {
            mo107043a = "";
        }
        m99745g.mo91708a(mo107090i, mo107043a, ((C21285a) m142531b()).m110243e().mo107048g(), ((C21285a) m142531b()).m110243e().mo107046e(), ((C21285a) m142531b()).m110243e().mo107047f(), ((C21285a) m142531b()).m110241c(), ((C21285a) m142531b()).m110243e().mo107045d(), new a(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    public Object mo13718g(Continuation continuation) {
        return m112255h(continuation);
    }
}
