package p098dc;

import android.view.View;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1611v0;
import androidx.core.view.InterfaceC1614w0;
import androidx.recyclerview.widget.AbstractC1933z;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: dc.j */
/* loaded from: classes3.dex */
public abstract class AbstractC17876j extends AbstractC1933z {

    /* renamed from: h */
    private ArrayList f90322h = new ArrayList();

    /* renamed from: i */
    private ArrayList f90323i = new ArrayList();

    /* renamed from: j */
    private ArrayList f90324j = new ArrayList();

    /* renamed from: k */
    ArrayList f90325k = new ArrayList();

    /* renamed from: l */
    ArrayList f90326l = new ArrayList();

    /* renamed from: m */
    ArrayList f90327m = new ArrayList();

    /* renamed from: n */
    ArrayList f90328n = new ArrayList();

    /* renamed from: o */
    ArrayList f90329o = new ArrayList();

    /* renamed from: dc.j$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ ArrayList f90330p;

        a(ArrayList arrayList) {
            this.f90330p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f90330p.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                AbstractC17876j.this.m94413X(hVar.f90355a, hVar.f90356b, hVar.f90357c, hVar.f90358d, hVar.f90359e);
            }
            this.f90330p.clear();
            AbstractC17876j.this.f90325k.remove(this.f90330p);
        }
    }

    /* renamed from: dc.j$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ ArrayList f90332p;

        b(ArrayList arrayList) {
            this.f90332p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f90332p.iterator();
            while (it.hasNext()) {
                AbstractC17876j.this.m94412W((g) it.next());
            }
            this.f90332p.clear();
            AbstractC17876j.this.f90326l.remove(this.f90332p);
        }
    }

    /* renamed from: dc.j$c */
    /* loaded from: classes3.dex */
    public class c extends i {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1876c0 f90334a;

        /* renamed from: b */
        final /* synthetic */ C1611v0 f90335b;

        c(RecyclerView.AbstractC1876c0 abstractC1876c0, C1611v0 c1611v0) {
            this.f90334a = abstractC1876c0;
            this.f90335b = c1611v0;
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            this.f90335b.m8222j(null);
            AbstractC1579n0.m7805C0(view, 1.0f);
            AbstractC17876j.this.m10684L(this.f90334a);
            AbstractC17876j.this.f90328n.remove(this.f90334a);
            AbstractC17876j.this.m94415a0();
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
            AbstractC17876j.this.m10685M(this.f90334a);
        }
    }

    /* renamed from: dc.j$d */
    /* loaded from: classes3.dex */
    public class d extends i {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1876c0 f90337a;

        /* renamed from: b */
        final /* synthetic */ int f90338b;

        /* renamed from: c */
        final /* synthetic */ int f90339c;

        /* renamed from: d */
        final /* synthetic */ C1611v0 f90340d;

        d(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, C1611v0 c1611v0) {
            this.f90337a = abstractC1876c0;
            this.f90338b = i11;
            this.f90339c = i12;
            this.f90340d = c1611v0;
        }

        @Override // p098dc.AbstractC17876j.i, androidx.core.view.InterfaceC1614w0
        /* renamed from: a */
        public void mo5454a(View view) {
            if (this.f90338b != 0) {
                AbstractC1579n0.m7854a1(view, 0.0f);
            }
            if (this.f90339c != 0) {
                AbstractC1579n0.m7857b1(view, 0.0f);
            }
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            this.f90340d.m8222j(null);
            AbstractC17876j.this.m10682J(this.f90337a);
            AbstractC17876j.this.f90327m.remove(this.f90337a);
            AbstractC17876j.this.m94415a0();
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
            AbstractC17876j.this.m10683K(this.f90337a);
        }
    }

    /* renamed from: dc.j$e */
    /* loaded from: classes3.dex */
    public class e extends i {

        /* renamed from: a */
        final /* synthetic */ g f90342a;

        /* renamed from: b */
        final /* synthetic */ C1611v0 f90343b;

        e(g gVar, C1611v0 c1611v0) {
            this.f90342a = gVar;
            this.f90343b = c1611v0;
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            this.f90343b.m8222j(null);
            AbstractC1579n0.m7805C0(view, 1.0f);
            AbstractC1579n0.m7854a1(view, 0.0f);
            AbstractC1579n0.m7857b1(view, 0.0f);
            AbstractC17876j.this.m10680H(this.f90342a.f90349a, true);
            AbstractC17876j.this.f90329o.remove(this.f90342a.f90349a);
            AbstractC17876j.this.m94415a0();
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
            AbstractC17876j.this.m10681I(this.f90342a.f90349a, true);
        }
    }

    /* renamed from: dc.j$f */
    /* loaded from: classes3.dex */
    public class f extends i {

        /* renamed from: a */
        final /* synthetic */ g f90345a;

        /* renamed from: b */
        final /* synthetic */ C1611v0 f90346b;

        /* renamed from: c */
        final /* synthetic */ View f90347c;

        f(g gVar, C1611v0 c1611v0, View view) {
            this.f90345a = gVar;
            this.f90346b = c1611v0;
            this.f90347c = view;
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            this.f90346b.m8222j(null);
            AbstractC1579n0.m7805C0(this.f90347c, 1.0f);
            AbstractC1579n0.m7854a1(this.f90347c, 0.0f);
            AbstractC1579n0.m7857b1(this.f90347c, 0.0f);
            AbstractC17876j.this.m10680H(this.f90345a.f90350b, false);
            AbstractC17876j.this.f90329o.remove(this.f90345a.f90350b);
            AbstractC17876j.this.m94415a0();
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
            AbstractC17876j.this.m10681I(this.f90345a.f90350b, false);
        }
    }

    /* renamed from: dc.j$g */
    /* loaded from: classes3.dex */
    public static class g {

        /* renamed from: a */
        public RecyclerView.AbstractC1876c0 f90349a;

        /* renamed from: b */
        public RecyclerView.AbstractC1876c0 f90350b;

        /* renamed from: c */
        public int f90351c;

        /* renamed from: d */
        public int f90352d;

        /* renamed from: e */
        public int f90353e;

        /* renamed from: f */
        public int f90354f;

        private g(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02) {
            this.f90349a = abstractC1876c0;
            this.f90350b = abstractC1876c02;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f90349a + ", newHolder=" + this.f90350b + ", fromX=" + this.f90351c + ", fromY=" + this.f90352d + ", toX=" + this.f90353e + ", toY=" + this.f90354f + '}';
        }

        g(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02, int i11, int i12, int i13, int i14) {
            this(abstractC1876c0, abstractC1876c02);
            this.f90351c = i11;
            this.f90352d = i12;
            this.f90353e = i13;
            this.f90354f = i14;
        }
    }

    /* renamed from: dc.j$h */
    /* loaded from: classes3.dex */
    public static class h {

        /* renamed from: a */
        public RecyclerView.AbstractC1876c0 f90355a;

        /* renamed from: b */
        public int f90356b;

        /* renamed from: c */
        public int f90357c;

        /* renamed from: d */
        public int f90358d;

        /* renamed from: e */
        public int f90359e;

        h(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, int i13, int i14) {
            this.f90355a = abstractC1876c0;
            this.f90356b = i11;
            this.f90357c = i12;
            this.f90358d = i13;
            this.f90359e = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dc.j$i */
    /* loaded from: classes3.dex */
    public static class i implements InterfaceC1614w0 {
        i() {
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: a */
        public void mo5454a(View view) {
        }
    }

    /* renamed from: Y */
    private void m94407Y(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        C1611v0 m7864e = AbstractC1579n0.m7864e(abstractC1876c0.f7784p);
        this.f90328n.add(abstractC1876c0);
        m7864e.m8220h(m10049o()).m8215b(0.0f).m8222j(new c(abstractC1876c0, m7864e)).m8225n();
    }

    /* renamed from: b0 */
    private void m94408b0(List list, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            g gVar = (g) list.get(size);
            if (m94410d0(gVar, abstractC1876c0) && gVar.f90349a == null && gVar.f90350b == null) {
                list.remove(gVar);
            }
        }
    }

    /* renamed from: c0 */
    private void m94409c0(g gVar) {
        RecyclerView.AbstractC1876c0 abstractC1876c0 = gVar.f90349a;
        if (abstractC1876c0 != null) {
            m94410d0(gVar, abstractC1876c0);
        }
        RecyclerView.AbstractC1876c0 abstractC1876c02 = gVar.f90350b;
        if (abstractC1876c02 != null) {
            m94410d0(gVar, abstractC1876c02);
        }
    }

    /* renamed from: d0 */
    private boolean m94410d0(g gVar, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        boolean z11 = false;
        if (gVar.f90350b == abstractC1876c0) {
            gVar.f90350b = null;
        } else {
            if (gVar.f90349a != abstractC1876c0) {
                return false;
            }
            gVar.f90349a = null;
            z11 = true;
        }
        AbstractC1579n0.m7805C0(abstractC1876c0.f7784p, 1.0f);
        AbstractC1579n0.m7854a1(abstractC1876c0.f7784p, 0.0f);
        AbstractC1579n0.m7857b1(abstractC1876c0.f7784p, 0.0f);
        m10680H(abstractC1876c0, z11);
        return true;
    }

    /* renamed from: e0 */
    private void m94411e0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC17868b.m94397a(abstractC1876c0.f7784p);
        mo10044j(abstractC1876c0);
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: B */
    public boolean mo10483B(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: C */
    public boolean mo10484C(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02, int i11, int i12, int i13, int i14) {
        if (abstractC1876c0 == abstractC1876c02) {
            return mo10485D(abstractC1876c0, i11, i12, i13, i14);
        }
        float m7834R = AbstractC1579n0.m7834R(abstractC1876c0.f7784p);
        float m7836S = AbstractC1579n0.m7836S(abstractC1876c0.f7784p);
        float m7903u = AbstractC1579n0.m7903u(abstractC1876c0.f7784p);
        m94411e0(abstractC1876c0);
        int i15 = (int) ((i13 - i11) - m7834R);
        int i16 = (int) ((i14 - i12) - m7836S);
        AbstractC1579n0.m7854a1(abstractC1876c0.f7784p, m7834R);
        AbstractC1579n0.m7857b1(abstractC1876c0.f7784p, m7836S);
        AbstractC1579n0.m7805C0(abstractC1876c0.f7784p, m7903u);
        if (abstractC1876c02 != null) {
            m94411e0(abstractC1876c02);
            AbstractC1579n0.m7854a1(abstractC1876c02.f7784p, -i15);
            AbstractC1579n0.m7857b1(abstractC1876c02.f7784p, -i16);
            AbstractC1579n0.m7805C0(abstractC1876c02.f7784p, 0.0f);
        }
        this.f90324j.add(new g(abstractC1876c0, abstractC1876c02, i11, i12, i13, i14));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: D */
    public boolean mo10485D(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, int i13, int i14) {
        View view = abstractC1876c0.f7784p;
        int m7834R = (int) (i11 + AbstractC1579n0.m7834R(view));
        int m7836S = (int) (i12 + AbstractC1579n0.m7836S(abstractC1876c0.f7784p));
        m94411e0(abstractC1876c0);
        int i15 = i13 - m7834R;
        int i16 = i14 - m7836S;
        if (i15 == 0 && i16 == 0) {
            m10682J(abstractC1876c0);
            return false;
        }
        if (i15 != 0) {
            AbstractC1579n0.m7854a1(view, -i15);
        }
        if (i16 != 0) {
            AbstractC1579n0.m7857b1(view, -i16);
        }
        this.f90323i.add(new h(abstractC1876c0, m7834R, m7836S, i13, i14));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: E */
    public boolean mo10486E(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        m94411e0(abstractC1876c0);
        this.f90322h.add(abstractC1876c0);
        return true;
    }

    /* renamed from: W */
    void m94412W(g gVar) {
        View view;
        RecyclerView.AbstractC1876c0 abstractC1876c0 = gVar.f90349a;
        View view2 = null;
        if (abstractC1876c0 == null) {
            view = null;
        } else {
            view = abstractC1876c0.f7784p;
        }
        RecyclerView.AbstractC1876c0 abstractC1876c02 = gVar.f90350b;
        if (abstractC1876c02 != null) {
            view2 = abstractC1876c02.f7784p;
        }
        if (view != null) {
            C1611v0 m8220h = AbstractC1579n0.m7864e(view).m8220h(m10047m());
            this.f90329o.add(gVar.f90349a);
            m8220h.m8226o(gVar.f90353e - gVar.f90351c);
            m8220h.m8227p(gVar.f90354f - gVar.f90352d);
            m8220h.m8215b(0.0f).m8222j(new e(gVar, m8220h)).m8225n();
        }
        if (view2 != null) {
            C1611v0 m7864e = AbstractC1579n0.m7864e(view2);
            this.f90329o.add(gVar.f90350b);
            m7864e.m8226o(0.0f).m8227p(0.0f).m8220h(m10047m()).m8215b(1.0f).m8222j(new f(gVar, m7864e, view2)).m8225n();
        }
    }

    /* renamed from: X */
    void m94413X(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, int i13, int i14) {
        View view = abstractC1876c0.f7784p;
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        if (i15 != 0) {
            AbstractC1579n0.m7864e(view).m8226o(0.0f);
        }
        if (i16 != 0) {
            AbstractC1579n0.m7864e(view).m8227p(0.0f);
        }
        C1611v0 m7864e = AbstractC1579n0.m7864e(view);
        this.f90327m.add(abstractC1876c0);
        m7864e.m8220h(m10048n()).m8222j(new d(abstractC1876c0, i15, i16, m7864e)).m8225n();
    }

    /* renamed from: Z */
    void m94414Z(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC1579n0.m7864e(((RecyclerView.AbstractC1876c0) list.get(size)).f7784p).m8216c();
        }
    }

    /* renamed from: a0 */
    void m94415a0() {
        if (!mo10050p()) {
            m10043i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: g */
    public boolean mo10041g(RecyclerView.AbstractC1876c0 abstractC1876c0, List list) {
        if (list.isEmpty() && !super.mo10041g(abstractC1876c0, list)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: j */
    public void mo10044j(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        View view = abstractC1876c0.f7784p;
        AbstractC1579n0.m7864e(view).m8216c();
        int size = this.f90323i.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((h) this.f90323i.get(size)).f90355a == abstractC1876c0) {
                AbstractC1579n0.m7857b1(view, 0.0f);
                AbstractC1579n0.m7854a1(view, 0.0f);
                m10682J(abstractC1876c0);
                this.f90323i.remove(size);
            }
        }
        m94408b0(this.f90324j, abstractC1876c0);
        if (this.f90322h.remove(abstractC1876c0)) {
            AbstractC1579n0.m7805C0(view, 1.0f);
            m10684L(abstractC1876c0);
        }
        for (int size2 = this.f90326l.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f90326l.get(size2);
            m94408b0(arrayList, abstractC1876c0);
            if (arrayList.isEmpty()) {
                this.f90326l.remove(size2);
            }
        }
        for (int size3 = this.f90325k.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f90325k.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((h) arrayList2.get(size4)).f90355a == abstractC1876c0) {
                    AbstractC1579n0.m7857b1(view, 0.0f);
                    AbstractC1579n0.m7854a1(view, 0.0f);
                    m10682J(abstractC1876c0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f90325k.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        this.f90328n.remove(abstractC1876c0);
        this.f90329o.remove(abstractC1876c0);
        this.f90327m.remove(abstractC1876c0);
        m94415a0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: k */
    public void mo10045k() {
        int size = this.f90323i.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            h hVar = (h) this.f90323i.get(size);
            View view = hVar.f90355a.f7784p;
            AbstractC1579n0.m7857b1(view, 0.0f);
            AbstractC1579n0.m7854a1(view, 0.0f);
            m10682J(hVar.f90355a);
            this.f90323i.remove(size);
        }
        for (int size2 = this.f90322h.size() - 1; size2 >= 0; size2--) {
            m10684L((RecyclerView.AbstractC1876c0) this.f90322h.get(size2));
            this.f90322h.remove(size2);
        }
        for (int size3 = this.f90324j.size() - 1; size3 >= 0; size3--) {
            m94409c0((g) this.f90324j.get(size3));
        }
        this.f90324j.clear();
        if (!mo10050p()) {
            return;
        }
        for (int size4 = this.f90325k.size() - 1; size4 >= 0; size4--) {
            ArrayList arrayList = (ArrayList) this.f90325k.get(size4);
            for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
                h hVar2 = (h) arrayList.get(size5);
                View view2 = hVar2.f90355a.f7784p;
                AbstractC1579n0.m7857b1(view2, 0.0f);
                AbstractC1579n0.m7854a1(view2, 0.0f);
                m10682J(hVar2.f90355a);
                arrayList.remove(size5);
                if (arrayList.isEmpty()) {
                    this.f90325k.remove(arrayList);
                }
            }
        }
        for (int size6 = this.f90326l.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList2 = (ArrayList) this.f90326l.get(size6);
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                m94409c0((g) arrayList2.get(size7));
                if (arrayList2.isEmpty()) {
                    this.f90326l.remove(arrayList2);
                }
            }
        }
        m94414Z(this.f90328n);
        m94414Z(this.f90327m);
        m94414Z(this.f90329o);
        m10043i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: p */
    public boolean mo10050p() {
        if (this.f90324j.isEmpty() && this.f90323i.isEmpty() && this.f90322h.isEmpty() && this.f90327m.isEmpty() && this.f90328n.isEmpty() && this.f90329o.isEmpty() && this.f90325k.isEmpty() && this.f90326l.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: v */
    public void mo10056v() {
        boolean z11 = !this.f90322h.isEmpty();
        boolean z12 = !this.f90323i.isEmpty();
        boolean z13 = !this.f90324j.isEmpty();
        if (!z11 && !z12 && !z13) {
            return;
        }
        Iterator it = this.f90322h.iterator();
        while (it.hasNext()) {
            m94407Y((RecyclerView.AbstractC1876c0) it.next());
        }
        this.f90322h.clear();
        if (z12) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f90323i);
            this.f90325k.add(arrayList);
            this.f90323i.clear();
            a aVar = new a(arrayList);
            if (z11) {
                AbstractC1579n0.m7902t0(((h) arrayList.get(0)).f90355a.f7784p, aVar, m10049o());
            } else {
                aVar.run();
            }
        }
        if (z13) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f90324j);
            this.f90326l.add(arrayList2);
            this.f90324j.clear();
            b bVar = new b(arrayList2);
            if (z11) {
                AbstractC1579n0.m7902t0(((g) arrayList2.get(0)).f90349a.f7784p, bVar, m10049o());
            } else {
                bVar.run();
            }
        }
    }
}
