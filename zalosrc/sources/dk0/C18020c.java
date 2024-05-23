package dk0;

import ag0.AbstractC0837p0;
import android.content.Context;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.InterfaceC17169n0;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import ho0.AbstractC20110a;
import ik0.AbstractC20595r;
import ik0.AbstractC20601x;
import ik0.C20588k;
import ik0.C20599v;
import ik0.EnumC20598u;
import ik0.InterfaceC20578a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import lk0.C22504b;
import lk0.C22505c;
import lk0.C22509g;
import ll0.C22513a;
import nj0.AbstractC23802a;
import nk0.C23855s0;
import org.json.JSONArray;
import org.json.JSONObject;
import p371nv.C23952g;
import pj0.C24777c;

/* renamed from: dk0.c */
/* loaded from: classes.dex */
public final class C18020c {

    /* renamed from: n */
    private static final ConcurrentLinkedQueue f91263n = new ConcurrentLinkedQueue();

    /* renamed from: a */
    private final Object f91264a;

    /* renamed from: b */
    private C23855s0 f91265b;

    /* renamed from: c */
    private C22505c f91266c;

    /* renamed from: d */
    public String f91267d;

    /* renamed from: e */
    private WeakReference f91268e;

    /* renamed from: f */
    private final C22513a f91269f;

    /* renamed from: g */
    private InterfaceC17169n0 f91270g;

    /* renamed from: h */
    private C20599v f91271h;

    /* renamed from: i */
    private C22509g f91272i;

    /* renamed from: j */
    private C24777c f91273j;

    /* renamed from: k */
    private boolean f91274k;

    /* renamed from: l */
    private int f91275l;

    /* renamed from: m */
    public AbstractC23802a f91276m;

    /* renamed from: dk0.c$a */
    /* loaded from: classes7.dex */
    public class a extends C20588k {
        a() {
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: b */
        public void mo61858b(AbstractC20601x abstractC20601x, Exception exc) {
            AbstractC20110a.m104543l("DiscoveryZinstant").mo104549b(exc);
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: c */
        public void mo61859c(AbstractC20601x abstractC20601x, InterfaceC20578a0 interfaceC20578a0) {
            try {
                C23855s0 m124606T = C23855s0.m124606T(interfaceC20578a0);
                if (m124606T != null) {
                    C18020c.this.m95827J(m124606T);
                    C18020c.this.f91270g.mo91775r();
                    C18020c.this.m95806H();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104543l("DiscoveryZinstant").mo104549b(e11);
            }
        }
    }

    /* renamed from: dk0.c$b */
    /* loaded from: classes7.dex */
    public class b implements C24777c.d {
        b() {
        }

        @Override // pj0.C24777c.d
        /* renamed from: a */
        public void mo95841a() {
            C18020c.m95810c(C18020c.this, -2);
            C18020c.this.m95819u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dk0.c$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC23802a {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* renamed from: dk0.c$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private static final C18020c f91279a = new C18020c(null);
    }

    /* synthetic */ C18020c(a aVar) {
        this();
    }

    /* renamed from: B */
    private boolean m95803B(String str) {
        C23855s0 c23855s0 = this.f91265b;
        if (c23855s0 != null) {
            c23855s0.m124638b0("js.action.discovery.widgets", str);
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private void m95804D(C22505c c22505c) {
        m95805G(new Runnable() { // from class: dk0.b

            /* renamed from: q */
            public final /* synthetic */ C22505c f91262q;

            public /* synthetic */ RunnableC18019b(C22505c c22505c2) {
                r2 = c22505c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18020c.this.m95822y(r2);
            }
        });
    }

    /* renamed from: G */
    private void m95805G(Runnable runnable) {
        this.f91269f.m116414a(runnable);
    }

    /* renamed from: H */
    public void m95806H() {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = f91263n.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject((String) it.next()));
            }
            if (m95803B(jSONArray.toString())) {
                f91263n.clear();
            }
        } catch (Exception unused) {
            f91263n.clear();
        }
    }

    /* renamed from: I */
    private void m95807I(String str) {
        if (str == null) {
            return;
        }
        f91263n.add(str);
    }

    /* renamed from: c */
    static /* synthetic */ int m95810c(C18020c c18020c, int i11) {
        int i12 = i11 & c18020c.f91275l;
        c18020c.f91275l = i12;
        return i12;
    }

    /* renamed from: g */
    private void m95814g() {
        if (this.f91274k) {
        } else {
            throw new IllegalStateException("This instance isn't initialized. Call init() before using it.");
        }
    }

    /* renamed from: j */
    private void m95815j() {
        C22504b m107213e = this.f91271h.m107213e(this.f91266c);
        if (m107213e != null) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: dk0.a
                public /* synthetic */ RunnableC18018a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18020c.m95821x(C22504b.this);
                }
            });
        }
    }

    /* renamed from: l */
    private int m95816l() {
        return AbstractC17158i1.m91746e();
    }

    /* renamed from: m */
    public static C18020c m95817m() {
        return d.f91279a;
    }

    /* renamed from: n */
    private String m95818n() {
        return AbstractC17158i1.f87698h;
    }

    /* renamed from: u */
    public void m95819u() {
        if (!m95820w() && (this.f91275l & 4) == 4) {
            m95838t();
        }
    }

    /* renamed from: w */
    private boolean m95820w() {
        return (this.f91275l & 1) == 1;
    }

    /* renamed from: x */
    public static /* synthetic */ void m95821x(C22504b c22504b) {
        try {
            String str = c22504b.f110129c;
            ArrayList arrayList = new ArrayList();
            C20599v.m107208j(str, arrayList);
            C24777c.m128776n(1, arrayList);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    public /* synthetic */ void m95822y(C22505c c22505c) {
        C23855s0 m95835q = m95835q();
        if (m95835q == null || !m95835q.checkIntegrity(m95833o(), -1, m95818n(), m95816l(), this.f91276m, c22505c.mo116353c())) {
            this.f91271h.m107219m(AbstractC20601x.m107225c(AbstractC20595r.m107194b(c22505c).mo107049a()).mo107107g(1).mo107106f(EnumC20598u.LIMIT).mo107112l(AbstractC20601x.b.m107228a(m95833o(), m95816l()).mo107129d(m95818n()).mo107128c(this.f91276m).mo107126a()).mo107109i(true).mo107103c(), new a());
        }
    }

    /* renamed from: A */
    public void m95823A() {
        try {
            m95825E();
            C24777c.m128774k(1);
            m95829L(null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    public void m95824C(String str) {
        if (str != null && !m95803B(str)) {
            m95807I(str);
        }
    }

    /* renamed from: E */
    public void m95825E() {
        this.f91270g.mo91763b();
        this.f91270g.mo91769j();
        this.f91272i.m116380b();
        f91263n.clear();
        this.f91265b = null;
    }

    /* renamed from: F */
    public void m95826F() {
        this.f91273j.m128791x();
        m95825E();
        this.f91270g.mo91772o();
    }

    /* renamed from: J */
    public void m95827J(C23855s0 c23855s0) {
        synchronized (this.f91264a) {
            this.f91265b = c23855s0;
        }
    }

    /* renamed from: K */
    public void m95828K(Context context) {
        this.f91268e = new WeakReference(context);
    }

    /* renamed from: L */
    public void m95829L(C22505c c22505c) {
        String str;
        m95814g();
        C22505c c22505c2 = this.f91266c;
        if (c22505c2 != null || c22505c != null) {
            if (c22505c2 != null && c22505c2.equals(c22505c)) {
                return;
            }
            this.f91266c = c22505c;
            m95819u();
            this.f91270g.mo91772o();
            AbstractC20110a.b m104543l = AbstractC20110a.m104543l("DiscoveryZinstant");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ZinstantDataConfig: ");
            if (c22505c != null) {
                str = c22505c.toString();
            } else {
                str = "Null";
            }
            sb2.append(str);
            m104543l.mo104556o(8, sb2.toString(), new Object[0]);
        }
    }

    /* renamed from: h */
    public void m95830h() {
        if (System.currentTimeMillis() - this.f91270g.mo91768i() > this.f91270g.mo91771n()) {
            m95815j();
            this.f91270g.mo91766g();
        }
        if (this.f91274k) {
            this.f91272i.m116380b();
        }
    }

    /* renamed from: i */
    public void m95831i() {
        this.f91275l |= 1;
        C24777c.m128775l(1, new b());
    }

    /* renamed from: k */
    public InterfaceC17169n0 m95832k() {
        return this.f91270g;
    }

    /* renamed from: o */
    public int m95833o() {
        Context context = (Context) this.f91268e.get();
        if (context != null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        Context m91742a = AbstractC17158i1.m91742a();
        if (m91742a != null) {
            return m91742a.getResources().getDisplayMetrics().widthPixels;
        }
        return 0;
    }

    /* renamed from: p */
    public C22505c m95834p() {
        return this.f91266c;
    }

    /* renamed from: q */
    public C23855s0 m95835q() {
        return this.f91265b;
    }

    /* renamed from: r */
    public boolean m95836r() {
        ZOMDocument zOMDocument;
        C23855s0 c23855s0 = this.f91265b;
        if (c23855s0 != null && (zOMDocument = c23855s0.f115178b) != null && zOMDocument.mAttention != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public void m95837s(InterfaceC17169n0 interfaceC17169n0, C20599v c20599v, C22509g c22509g, C24777c c24777c, InterfaceC17139d interfaceC17139d) {
        this.f91270g = interfaceC17169n0;
        this.f91271h = c20599v;
        this.f91272i = c22509g;
        this.f91273j = c24777c;
        this.f91276m.m124373d(interfaceC17139d);
        this.f91274k = true;
    }

    /* renamed from: t */
    public void m95838t() {
        m95814g();
        if (this.f91270g.mo91767h()) {
            if (m95820w()) {
                this.f91275l |= 4;
                AbstractC20110a.m104535d("Wait cleaning before init", new Object[0]);
            } else {
                C22505c c22505c = this.f91266c;
                if (c22505c != null) {
                    m95804D(c22505c);
                }
            }
        }
    }

    /* renamed from: v */
    public boolean m95839v() {
        return this.f91274k;
    }

    /* renamed from: z */
    public void m95840z() {
        try {
            C22505c c22505c = this.f91266c;
            if (c22505c != null) {
                C23952g.m125345j("DiscoveryZinstant", String.format("pull api: url=%s | zinstantdata_id=%s | expirationTime=%s | timestampLastSync=%s", c22505c.f110141a, c22505c.f110142b, Long.valueOf(c22505c.f110144d), Long.valueOf(this.f91266c.f110145e)));
            } else {
                C23952g.m125345j("DiscoveryZinstant", "pull config: null");
            }
            C23952g.m125345j("DiscoveryZinstant", "dataExtras: " + this.f91267d);
        } catch (Exception e11) {
            C23952g.m125345j("DiscoveryZinstant", e11.getMessage());
        }
    }

    private C18020c() {
        this.f91264a = new Object();
        this.f91268e = new WeakReference(null);
        this.f91275l = 0;
        this.f91276m = new c(null);
        this.f91269f = new C22513a("DiscoveryZinstant");
    }
}
