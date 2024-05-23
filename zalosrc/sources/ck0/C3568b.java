package ck0;

import ag0.AbstractC0837p0;
import android.text.SpannableString;
import ck0.C3568b;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.AbstractC17153h;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zinstant.AbstractC17168n;
import com.zing.zalo.zinstant.C17099a;
import com.zing.zalo.zinstant.C17141d1;
import com.zing.zalo.zinstant.C17149f1;
import com.zing.zalo.zinstant.C17152g1;
import com.zing.zalo.zinstant.C17166m;
import com.zing.zalo.zinstant.C17171o0;
import com.zing.zalo.zinstant.C17177r0;
import com.zing.zalo.zinstant.C17181t0;
import com.zing.zalo.zinstant.C17210v;
import com.zing.zalo.zinstant.C17242w0;
import com.zing.zalo.zinstant.InterfaceC17169n0;
import com.zing.zalo.zinstant.utils.ScriptHelperImpl;
import dk0.AbstractC18021d;
import dk0.C18020c;
import hu.AbstractC20130d;
import ik0.C20590m;
import ik0.C20592o;
import ik0.C20594q;
import ik0.C20599v;
import ik0.C20600w;
import kk0.C21755b;
import lk0.C22507e;
import lk0.C22509g;
import oj0.C24281a;
import p354n3.C23528a;
import p588vw.C28652r;
import pj0.C24777c;
import vj0.AbstractC28270d;
import vj0.C28273g;

/* renamed from: ck0.b */
/* loaded from: classes.dex */
public class C3568b {

    /* renamed from: a */
    private boolean f15126a;

    /* renamed from: b */
    private final Object f15127b;

    /* renamed from: ck0.b$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC28270d {
        a() {
        }

        @Override // vj0.AbstractC28270d
        /* renamed from: b */
        public CharSequence mo18128b(CharSequence charSequence) {
            return C28652r.m143349v().m143354E(SpannableString.valueOf(charSequence));
        }
    }

    /* renamed from: ck0.b$b */
    /* loaded from: classes7.dex */
    public interface b {
        /* renamed from: c */
        void mo18129c(Exception exc);

        /* renamed from: d */
        void mo18130d(C3568b c3568b);
    }

    /* renamed from: ck0.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private static final C3568b f15129a = new C3568b();
    }

    /* synthetic */ C3568b(AbstractC3569c abstractC3569c) {
        this();
    }

    /* renamed from: b */
    public static C3568b m18124b() {
        return c.f15129a;
    }

    /* renamed from: e */
    public /* synthetic */ void m18125e(b bVar) {
        try {
            m18126c();
            if (bVar != null) {
                bVar.mo18130d(this);
            }
        } catch (Exception e11) {
            if (bVar != null) {
                bVar.mo18129c(e11);
            }
        }
    }

    /* renamed from: c */
    public void m18126c() {
        if (this.f15126a) {
            return;
        }
        try {
            synchronized (this.f15127b) {
                try {
                    if (this.f15126a) {
                        return;
                    }
                    if (AbstractC17158i1.m91742a() == null) {
                        AbstractC17158i1.m91748g(MainApplication.getAppContext());
                    }
                    AbstractC17168n.m91761t(new C17171o0());
                    InterfaceC17169n0 m91760s = AbstractC17168n.m91760s();
                    C17152g1 c17152g1 = new C17152g1();
                    C22507e c22507e = new C22507e(m91760s);
                    C17177r0 c17177r0 = new C17177r0();
                    C20599v c20599v = new C20599v(new C20594q(60), new C20600w(), new C17181t0(), m91760s.mo91774q(), c17152g1, c22507e, new AbstractC17148f0.e());
                    C20599v.m107207h(c20599v);
                    C18020c.m95817m().m95837s(AbstractC17168n.m91760s(), c20599v, C22509g.m116378g(), C24777c.m128780t(), c17177r0);
                    C17099a.m91453c().m91454d(m91760s, C22509g.m116378g(), C18020c.m95817m());
                    C24281a.m126786b().m126787c(c20599v, m91760s.mo91774q(), m91760s);
                    C24777c.m128780t().m128789u(AbstractC20130d.m104847O(false), m91760s.mo91765f(), m91760s.mo91771n(), m91760s.mo91762a(), m91760s.mo91770k());
                    AbstractC28270d.m142429c(new a());
                    this.f15126a = true;
                    AbstractC17153h.m91730v();
                    AbstractC17148f0.m91691j();
                    C28273g.m142439i().m142454A(m91760s.mo91774q());
                    C17141d1 c17141d1 = new C17141d1();
                    ScriptHelperImpl.setNetworkProvider(new C17149f1());
                    ScriptHelperImpl.setZinstantUtilityProvider(new C17242w0());
                    ScriptHelperImpl.setZinstantPreferencesData(c17141d1);
                    ScriptHelperImpl.setResourceDownloader(m91760s.mo91774q());
                    C17210v c17210v = C17210v.f87767a;
                    c17210v.m91896C(m91760s.mo91774q(), new C23528a(AbstractC17158i1.m91742a()));
                    C20590m.f101272a.m107144d(new C20592o(AbstractC17158i1.m91742a(), c17210v), c17210v);
                    C21755b.Companion.m112233b(new C17166m(), c17210v);
                    AbstractC18021d.m95843a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            AbstractC17153h.m91729u(e11);
            throw e11;
        }
    }

    /* renamed from: d */
    public void m18127d(b bVar) {
        if (this.f15126a) {
            if (bVar != null) {
                bVar.mo18130d(this);
                return;
            }
            return;
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: ck0.a

            /* renamed from: q */
            public final /* synthetic */ C3568b.b f15125q;

            public /* synthetic */ RunnableC3567a(C3568b.b bVar2) {
                r2 = bVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3568b.this.m18125e(r2);
            }
        });
    }

    private C3568b() {
        this.f15127b = new Object();
    }
}
