package jo0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.RecyclerView;
import bp0.AbstractC3082b0;
import bp0.AbstractC3104p;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalocore.CoreUtility;
import ep0.C18563w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ko0.C21791f;
import p097db.C17846e;
import p354n3.C23528a;
import p620wt.AbstractC29239n;
import qm0.AbstractC25368s;
import zm.voip.service.AbstractC32273e3;

/* renamed from: jo0.l */
/* loaded from: classes7.dex */
public final class C21334l extends RecyclerView.AbstractC1880g {

    /* renamed from: A */
    public static final a f103899A = new a(null);

    /* renamed from: B */
    private static int f103900B = AbstractC29239n.m146002a(CoreUtility.f89233i, 0);

    /* renamed from: r */
    private final Context f103901r;

    /* renamed from: s */
    private final C23528a f103902s;

    /* renamed from: t */
    private final List f103903t;

    /* renamed from: u */
    private int f103904u;

    /* renamed from: v */
    private boolean f103905v;

    /* renamed from: w */
    private int f103906w;

    /* renamed from: x */
    private boolean f103907x;

    /* renamed from: y */
    private int f103908y;

    /* renamed from: z */
    private int f103909z;

    /* renamed from: jo0.l$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m110500a() {
            return C21334l.f103900B;
        }

        /* renamed from: b */
        public final void m110501b() {
            m110502c(AbstractC29239n.m146002a(CoreUtility.f89233i, 0));
        }

        /* renamed from: c */
        public final void m110502c(int i11) {
            C21334l.f103900B = i11;
        }
    }

    /* renamed from: jo0.l$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC1915h.b {

        /* renamed from: a */
        private final List f103910a;

        /* renamed from: b */
        private final List f103911b;

        public b(List list, List list2) {
            AbstractC19074t.m100208f(list, "oldList");
            AbstractC19074t.m100208f(list2, "newList");
            this.f103910a = list;
            this.f103911b = list2;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: a */
        public boolean mo421a(int i11, int i12) {
            C21791f c21791f = (C21791f) this.f103910a.get(i11);
            C21791f c21791f2 = (C21791f) this.f103911b.get(i12);
            if (c21791f.m112477l() == c21791f2.m112477l() && c21791f.m112481p() == c21791f2.m112481p() && AbstractC19074t.m100204b(c21791f.m112471f(), c21791f2.m112471f()) && c21791f.m112473h() == c21791f2.m112473h() && AbstractC19074t.m100204b(c21791f.m112474i(), c21791f2.m112474i()) && c21791f.m112483r() == c21791f2.m112483r()) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: b */
        public boolean mo422b(int i11, int i12) {
            if (((C21791f) this.f103910a.get(i11)).m112477l() == ((C21791f) this.f103911b.get(i12)).m112477l()) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: d */
        public int mo424d() {
            return this.f103911b.size();
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: e */
        public int mo425e() {
            return this.f103910a.size();
        }
    }

    public C21334l(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f103901r = context;
        this.f103902s = new C23528a(context);
        this.f103903t = new ArrayList();
        this.f103906w = 4;
    }

    /* renamed from: P */
    private final boolean m110474P(int i11) {
        return i11 <= this.f103909z && this.f103908y <= i11;
    }

    /* renamed from: R */
    private final int m110475R() {
        double ceil;
        if (mo10003k() <= 2) {
            return mo10003k();
        }
        if (mo10003k() <= this.f103906w) {
            ceil = Math.ceil(mo10003k() / 2);
        } else {
            ceil = Math.ceil(r2 / 2);
        }
        return (int) ceil;
    }

    /* renamed from: T */
    private final boolean m110476T() {
        if (this.f103904u == m110479O()) {
            return false;
        }
        this.f103904u = m110479O();
        m10008p();
        return true;
    }

    /* renamed from: e0 */
    private final void m110477e0(int i11) {
        if (i11 == f103900B) {
            AbstractC32273e3.m155748Q().mo155883g2(null, true, 0);
        } else {
            AbstractC32273e3.m155748Q().mo155883g2(null, false, i11);
            C17846e.m94223f().m94251v(i11, 0);
        }
    }

    /* renamed from: N */
    public final void m110478N(C21791f c21791f) {
        AbstractC19074t.m100208f(c21791f, "participant");
        try {
            int m110484W = m110484W(c21791f.m112477l());
            if (m110484W == -1) {
                if (c21791f.m112477l() == f103900B) {
                    this.f103903t.add(0, c21791f);
                } else {
                    this.f103903t.add(c21791f);
                }
                if (!m110476T()) {
                    m10011s(this.f103903t.indexOf(c21791f));
                    return;
                }
                return;
            }
            this.f103903t.set(m110484W, c21791f);
            m10009q(m110484W);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            AbstractC3082b0.m15422d("RenderGCallAdapter", "addParticipant " + e11);
        }
    }

    /* renamed from: O */
    public final int m110479O() {
        if (this.f103905v || mo10003k() <= 1) {
            return -1;
        }
        return AbstractC3104p.f13186c / m110475R();
    }

    /* renamed from: Q */
    public final int m110480Q() {
        return this.f103904u;
    }

    /* renamed from: S */
    public final int m110481S(int i11) {
        if (this.f103903t.size() <= 2) {
            return 2;
        }
        if (this.f103903t.size() % 2 != 0 && i11 == this.f103903t.size() - 1) {
            return 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: U */
    public void mo9990A(C18563w c18563w, int i11) {
        AbstractC19074t.m100208f(c18563w, "holder");
        AbstractC3082b0.m15424f("RenderGCallAdapter", "onBindViewHolder " + i11 + " - holder " + c18563w);
        c18563w.m98008D0(this.f103904u);
        C21791f c21791f = (C21791f) this.f103903t.get(i11);
        c21791f.m112465H(m110474P(i11));
        c18563w.m98007C0(c21791f, this.f103907x, this.f103905v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: V */
    public C18563w mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        AbstractC3082b0.m15421c("RenderGCallAdapter", "onCreateViewHolder");
        View inflate = LayoutInflater.from(this.f103901r).inflate(AbstractC7409c0.call_item_view_layout, viewGroup, false);
        Context context = this.f103901r;
        AbstractC19074t.m100205c(inflate);
        return new C18563w(context, inflate, this.f103902s);
    }

    /* renamed from: W */
    public final int m110484W(int i11) {
        Iterator it = this.f103903t.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            if (((C21791f) it.next()).m112477l() != i11) {
                i12++;
            } else {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: X */
    public final void m110485X(int i11, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        try {
            this.f103908y = 0;
            this.f103909z = 0;
            int m110484W = m110484W(i11);
            if (m110484W != -1) {
                m110477e0(i11);
                if ((abstractC1876c0 instanceof C18563w) && ((C18563w) abstractC1876c0).m98012u0() == i11) {
                    ((C18563w) abstractC1876c0).m98010s0((C21791f) this.f103903t.get(m110484W));
                    ((C18563w) abstractC1876c0).m98006B0();
                }
                this.f103903t.remove(m110484W);
                if (!m110476T()) {
                    m10017y(m110484W);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Y */
    public final void m110486Y(C21791f c21791f, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(c21791f, "participant");
        m110485X(c21791f.m112477l(), abstractC1876c0);
    }

    /* renamed from: Z */
    public final void m110487Z(int i11, boolean z11, boolean z12, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        try {
            int m110484W = m110484W(i11);
            if (m110484W != -1) {
                ((C21791f) this.f103903t.get(m110484W)).m112490y(z11);
                ((C21791f) this.f103903t.get(m110484W)).m112486u(z12);
                if (abstractC1876c0 instanceof C18563w) {
                    ((C18563w) abstractC1876c0).m98006B0();
                }
                m10009q(m110484W);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            AbstractC3082b0.m15422d("RenderGCallAdapter", "updateState " + e11);
        }
    }

    /* renamed from: a0 */
    public final void m110488a0(int i11) {
        this.f103906w = i11;
    }

    /* renamed from: b0 */
    public final void m110489b0(boolean z11) {
        this.f103905v = z11;
    }

    /* renamed from: c0 */
    public final void m110490c0(List list) {
        AbstractC19074t.m100208f(list, "participants");
        try {
            AbstractC1915h.c m10492a = AbstractC1915h.m10492a(new b(this.f103903t, list));
            AbstractC19074t.m100207e(m10492a, "calculateDiff(...)");
            m10492a.m10505e(this);
            this.f103903t.clear();
            this.f103903t.addAll(list);
            m110476T();
        } catch (Exception e11) {
            e11.printStackTrace();
            AbstractC3082b0.m15422d("RenderGCallAdapter", "setParticipants " + e11);
        }
    }

    /* renamed from: d0 */
    public final void m110491d0(int i11, int i12) {
        if (i11 == this.f103908y && i12 == this.f103909z) {
            return;
        }
        this.f103908y = i11;
        this.f103909z = i12;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : this.f103903t) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC25368s.m131509q();
            }
            C21791f c21791f = new C21791f((C21791f) obj);
            c21791f.m112465H(m110474P(i13));
            arrayList.add(c21791f);
            i13 = i14;
        }
        m110490c0(arrayList);
    }

    /* renamed from: f0 */
    public final void m110492f0(int i11, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        try {
            int m110484W = m110484W(i11);
            if (m110484W != -1) {
                if (abstractC1876c0 instanceof C18563w) {
                    ((C18563w) abstractC1876c0).m98010s0((C21791f) this.f103903t.get(m110484W));
                    ((C18563w) abstractC1876c0).m98006B0();
                }
                m10009q(m110484W);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            AbstractC3082b0.m15422d("RenderGCallAdapter", "updateState " + e11);
        }
    }

    /* renamed from: g0 */
    public final void m110493g0(int i11, boolean z11) {
        try {
            int m110484W = m110484W(i11);
            if (m110484W != -1) {
                ((C21791f) this.f103903t.get(m110484W)).m112486u(z11);
                m10009q(m110484W);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            AbstractC3082b0.m15422d("RenderGCallAdapter", "updateCamState " + e11);
        }
    }

    /* renamed from: h0 */
    public final void m110494h0() {
        this.f103904u = m110479O();
        m10008p();
    }

    /* renamed from: i0 */
    public final void m110495i0(boolean z11) {
        try {
            int m110484W = m110484W(f103900B);
            if (m110484W != -1) {
                ((C21791f) this.f103903t.get(m110484W)).m112491z(z11);
                m10009q(m110484W);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            AbstractC3082b0.m15422d("RenderGCallAdapter", "updateLocalViewMirrorState " + e11);
        }
    }

    /* renamed from: j0 */
    public final void m110496j0(int i11, boolean z11, boolean z12) {
        try {
            int m110484W = m110484W(i11);
            if (m110484W != -1) {
                ((C21791f) this.f103903t.get(m110484W)).m112490y(z11);
                ((C21791f) this.f103903t.get(m110484W)).m112486u(z12);
                m10009q(m110484W);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            AbstractC3082b0.m15422d("RenderGCallAdapter", "updateMicCamState " + e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f103903t.size();
    }

    /* renamed from: k0 */
    public final void m110497k0(int i11, boolean z11) {
        try {
            int m110484W = m110484W(i11);
            if (m110484W != -1) {
                ((C21791f) this.f103903t.get(m110484W)).m112490y(z11);
                m10009q(m110484W);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            AbstractC3082b0.m15422d("RenderGCallAdapter", "updateMicState " + e11);
        }
    }

    /* renamed from: l0 */
    public final void m110498l0(C21791f c21791f) {
        AbstractC19074t.m100208f(c21791f, "participant");
        try {
            int m110484W = m110484W(c21791f.m112477l());
            if (m110484W != -1) {
                this.f103903t.set(m110484W, c21791f);
                m10009q(m110484W);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            AbstractC3082b0.m15422d("RenderGCallAdapter", "updateParticipant " + e11);
        }
    }

    /* renamed from: m0 */
    public final void m110499m0(int i11, int i12) {
        try {
            int m110484W = m110484W(i11);
            if (m110484W != -1) {
                ((C21791f) this.f103903t.get(m110484W)).m112461D(i12);
                m10009q(m110484W);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
