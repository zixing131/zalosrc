package z10;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1925r;
import b10.AbstractC2487f;
import b10.C2484c;
import b10.C2491j;
import com.zing.zalo.shortvideo.data.model.C9440a;
import d20.AbstractC17714a;
import d20.C17715b;
import d20.C17716c;
import d20.C17717d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19071q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p338m2.InterfaceC22715a;
import q10.C25059v;
import q10.C25065x;
import q10.C25072z0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;
import s20.AbstractC26112n;

/* renamed from: z10.w */
/* loaded from: classes5.dex */
public final class C31189w extends AbstractC1925r {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private List f143993t;

    /* renamed from: u */
    private List f143994u;

    /* renamed from: z10.w$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.w$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final b f143995y = new b();

        b() {
            super(3, C25059v.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemInteractLivestreamBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151950h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25059v m151950h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25059v.m129952c(layoutInflater, viewGroup, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.w$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final c f143996y = new c();

        c() {
            super(3, C25072z0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemWelcomeLivestreamBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151951h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25072z0 m151951h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25072z0.m129984c(layoutInflater, viewGroup, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.w$d */
    /* loaded from: classes5.dex */
    public /* synthetic */ class d extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final d f143997y = new d();

        d() {
            super(3, C25065x.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemLivestreamCommentBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151952h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25065x m151952h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25065x.m129969c(layoutInflater, viewGroup, z11);
        }
    }

    public /* synthetic */ C31189w(List list, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? AbstractC25368s.m131502j() : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m151930Z(C31189w c31189w, ArrayList arrayList, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(c31189w, "this$0");
        AbstractC19074t.m100208f(arrayList, "$arrayData");
        c31189w.f143994u = arrayList;
        if (interfaceC18494a != null) {
            interfaceC18494a.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m151931b0(C31189w c31189w, ArrayList arrayList, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c31189w, "this$0");
        AbstractC19074t.m100208f(arrayList, "$arrayData");
        c31189w.f143994u = arrayList;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(Integer.valueOf(arrayList.size()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m151932d0(C31189w c31189w, ArrayList arrayList, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(c31189w, "this$0");
        AbstractC19074t.m100208f(arrayList, "$arrayData");
        AbstractC19074t.m100208f(interfaceC18494a, "$onComplete");
        c31189w.f143994u = arrayList;
        interfaceC18494a.mo12V4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m151933e0(C31189w c31189w, ArrayList arrayList, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(c31189w, "this$0");
        AbstractC19074t.m100208f(arrayList, "$arrayData");
        AbstractC19074t.m100208f(interfaceC18494a, "$onComplete");
        c31189w.f143994u = arrayList;
        interfaceC18494a.mo12V4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m151934g0(C31189w c31189w, ArrayList arrayList) {
        AbstractC19074t.m100208f(c31189w, "this$0");
        AbstractC19074t.m100208f(arrayList, "$arrayData");
        c31189w.f143994u = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m151935i0(C31189w c31189w, List list) {
        AbstractC19074t.m100208f(c31189w, "this$0");
        AbstractC19074t.m100208f(list, "$newList");
        c31189w.f143994u = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m151936p0(C31189w c31189w, ArrayList arrayList) {
        AbstractC19074t.m100208f(c31189w, "this$0");
        AbstractC19074t.m100208f(arrayList, "$arrayData");
        c31189w.f143994u = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m151937r0(C31189w c31189w, List list) {
        List m131187O0;
        AbstractC19074t.m100208f(c31189w, "this$0");
        AbstractC19074t.m100208f(list, "$newList");
        m131187O0 = AbstractC25332a0.m131187O0(list);
        c31189w.f143994u = m131187O0;
    }

    /* renamed from: Y */
    public final void m151938Y(C2491j c2491j, final InterfaceC18494a interfaceC18494a) {
        Object obj;
        Object m131206f0;
        AbstractC19074t.m100208f(c2491j, "newItem");
        Iterator it = this.f143994u.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((AbstractC2487f) obj).m12570a() == 3) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f143994u);
        m131206f0 = AbstractC25332a0.m131206f0(arrayList);
        AbstractC2487f abstractC2487f = (AbstractC2487f) m131206f0;
        if (abstractC2487f != null && abstractC2487f.m12570a() == 2) {
            arrayList.add(1, c2491j);
        } else {
            arrayList.add(0, c2491j);
        }
        m10636P(arrayList, new Runnable() { // from class: z10.v
            @Override // java.lang.Runnable
            public final void run() {
                C31189w.m151930Z(C31189w.this, arrayList, interfaceC18494a);
            }
        });
    }

    /* renamed from: a0 */
    public final void m151939a0(List list, final InterfaceC18505l interfaceC18505l) {
        Object m131206f0;
        AbstractC19074t.m100208f(list, "comments");
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f143994u);
        m131206f0 = AbstractC25332a0.m131206f0(arrayList);
        AbstractC2487f abstractC2487f = (AbstractC2487f) m131206f0;
        if (abstractC2487f != null && abstractC2487f.m12570a() == 2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(1, (AbstractC2487f) it.next());
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(0, (AbstractC2487f) it2.next());
            }
        }
        m10636P(arrayList, new Runnable() { // from class: z10.u
            @Override // java.lang.Runnable
            public final void run() {
                C31189w.m151931b0(C31189w.this, arrayList, interfaceC18505l);
            }
        });
    }

    /* renamed from: c0 */
    public final void m151940c0(C2484c c2484c, final InterfaceC18494a interfaceC18494a) {
        Object m131206f0;
        AbstractC19074t.m100208f(c2484c, "newItem");
        AbstractC19074t.m100208f(interfaceC18494a, "onComplete");
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f143994u);
        m131206f0 = AbstractC25332a0.m131206f0(arrayList);
        AbstractC2487f abstractC2487f = (AbstractC2487f) m131206f0;
        if (abstractC2487f != null && abstractC2487f.m12570a() == 2) {
            arrayList.set(0, c2484c);
            m10636P(arrayList, new Runnable() { // from class: z10.q
                @Override // java.lang.Runnable
                public final void run() {
                    C31189w.m151932d0(C31189w.this, arrayList, interfaceC18494a);
                }
            });
        } else {
            arrayList.add(0, c2484c);
            m10636P(arrayList, new Runnable() { // from class: z10.r
                @Override // java.lang.Runnable
                public final void run() {
                    C31189w.m151933e0(C31189w.this, arrayList, interfaceC18494a);
                }
            });
        }
    }

    /* renamed from: f0 */
    public final void m151941f0() {
        final ArrayList arrayList = new ArrayList();
        m10636P(arrayList, new Runnable() { // from class: z10.p
            @Override // java.lang.Runnable
            public final void run() {
                C31189w.m151934g0(C31189w.this, arrayList);
            }
        });
    }

    /* renamed from: h0 */
    public final void m151942h0(List list) {
        final List m131187O0;
        boolean m131196V;
        AbstractC19074t.m100208f(list, "cmtIds");
        if (list.isEmpty()) {
            return;
        }
        List list2 = this.f143994u;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            AbstractC2487f abstractC2487f = (AbstractC2487f) obj;
            if (abstractC2487f instanceof C9440a) {
                m131196V = AbstractC25332a0.m131196V(list, ((C9440a) abstractC2487f).m51401d());
                if (!m131196V) {
                }
            }
            arrayList.add(obj);
        }
        m131187O0 = AbstractC25332a0.m131187O0(arrayList);
        m10636P(m131187O0, new Runnable() { // from class: z10.o
            @Override // java.lang.Runnable
            public final void run() {
                C31189w.m151935i0(C31189w.this, m131187O0);
            }
        });
    }

    /* renamed from: j0 */
    public final AbstractC2487f m151943j0() {
        Object m131207g0;
        m131207g0 = AbstractC25332a0.m131207g0(this.f143994u, mo10003k() - 1);
        return (AbstractC2487f) m131207g0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1925r, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143994u.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo9990A(AbstractC17714a abstractC17714a, int i11) {
        Object m131207g0;
        AbstractC19074t.m100208f(abstractC17714a, "holder");
        m131207g0 = AbstractC25332a0.m131207g0(this.f143994u, i11);
        AbstractC2487f abstractC2487f = (AbstractC2487f) m131207g0;
        if (abstractC2487f == null) {
            return;
        }
        abstractC17714a.mo93789i0(abstractC2487f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo9991B(AbstractC17714a abstractC17714a, int i11, List list) {
        Object m131207g0;
        AbstractC19074t.m100208f(abstractC17714a, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            mo9990A(abstractC17714a, i11);
            return;
        }
        for (Object obj : list) {
            m131207g0 = AbstractC25332a0.m131207g0(this.f143994u, i11);
            AbstractC2487f abstractC2487f = (AbstractC2487f) m131207g0;
            if (abstractC2487f != null) {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                abstractC17714a.m93790j0(abstractC2487f, (List) obj);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        Object m131207g0;
        m131207g0 = AbstractC25332a0.m131207g0(this.f143994u, i11);
        AbstractC2487f abstractC2487f = (AbstractC2487f) m131207g0;
        if (abstractC2487f != null) {
            return abstractC2487f.m12570a();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public AbstractC17714a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 2) {
            if (i11 != 3) {
                InterfaceC22715a m134373N = AbstractC26112n.m134373N(viewGroup, d.f143997y, false, 2, null);
                AbstractC19074t.m100205c(m134373N);
                return new C17716c((C25065x) m134373N);
            }
            InterfaceC22715a m134373N2 = AbstractC26112n.m134373N(viewGroup, c.f143996y, false, 2, null);
            AbstractC19074t.m100205c(m134373N2);
            return new C17717d((C25072z0) m134373N2);
        }
        InterfaceC22715a m134373N3 = AbstractC26112n.m134373N(viewGroup, b.f143995y, false, 2, null);
        AbstractC19074t.m100205c(m134373N3);
        return new C17715b((C25059v) m134373N3);
    }

    /* renamed from: o0 */
    public final void m151947o0() {
        Object m131206f0;
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f143994u);
        m131206f0 = AbstractC25332a0.m131206f0(arrayList);
        AbstractC2487f abstractC2487f = (AbstractC2487f) m131206f0;
        if (abstractC2487f != null && abstractC2487f.m12570a() == 2) {
            AbstractC25378x.m131544F(arrayList);
            m10636P(arrayList, new Runnable() { // from class: z10.s
                @Override // java.lang.Runnable
                public final void run() {
                    C31189w.m151936p0(C31189w.this, arrayList);
                }
            });
        }
    }

    /* renamed from: q0 */
    public final void m151948q0(boolean z11) {
        int m131511r;
        List<Object> list = this.f143994u;
        m131511r = AbstractC25370t.m131511r(list, 10);
        final ArrayList arrayList = new ArrayList(m131511r);
        for (Object obj : list) {
            if (obj instanceof C9440a) {
                obj = ((C9440a) obj).m51409l(z11);
            }
            arrayList.add(obj);
        }
        m10636P(arrayList, new Runnable() { // from class: z10.t
            @Override // java.lang.Runnable
            public final void run() {
                C31189w.m151937r0(C31189w.this, arrayList);
            }
        });
    }

    /* renamed from: s0 */
    public final void m151949s0(String str) {
        Object m131207g0;
        C9440a c9440a;
        AbstractC19074t.m100208f(str, "statusMsg");
        if (str.length() == 0) {
            return;
        }
        Iterator it = this.f143994u.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                AbstractC2487f abstractC2487f = (AbstractC2487f) it.next();
                if ((abstractC2487f instanceof C9440a) && ((C9440a) abstractC2487f).m51403f()) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        m131207g0 = AbstractC25332a0.m131207g0(this.f143994u, i11);
        AbstractC2487f abstractC2487f2 = (AbstractC2487f) m131207g0;
        if (abstractC2487f2 == null) {
            return;
        }
        boolean z11 = abstractC2487f2 instanceof C9440a;
        C9440a c9440a2 = null;
        if (z11) {
            c9440a = (C9440a) abstractC2487f2;
        } else {
            c9440a = null;
        }
        if (c9440a != null) {
            c9440a.m51406i(false);
        }
        if (z11) {
            c9440a2 = (C9440a) abstractC2487f2;
        }
        if (c9440a2 != null) {
            c9440a2.m51407j(str);
        }
        m10009q(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31189w(List list) {
        super(AbstractC31190x.m151953a());
        AbstractC19074t.m100208f(list, "items");
        this.f143993t = list;
        this.f143994u = new ArrayList();
    }
}
