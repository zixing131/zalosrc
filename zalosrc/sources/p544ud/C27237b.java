package p544ud;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.adapters.C7209s8;
import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ia0.AbstractC20484a;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p480rd.AbstractC25732c;
import p574vd.C27972c;
import p574vd.C27973d;
import p574vd.C27975f;
import p574vd.C27976g;
import p574vd.C27977h;
import p574vd.C27978i;

/* renamed from: ud.b */
/* loaded from: classes3.dex */
public final class C27237b extends RecyclerView.AbstractC1880g implements C7209s8.a {
    public static final b Companion = new b(null);

    /* renamed from: r */
    private Context f128010r;

    /* renamed from: s */
    private j f128011s;

    /* renamed from: t */
    private c f128012t;

    /* renamed from: u */
    private final ArrayList f128013u;

    /* renamed from: ud.b$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
        }
    }

    /* renamed from: ud.b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ud.b$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo37501a(ContactProfile contactProfile);
    }

    /* renamed from: ud.b$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC20484a {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(ViewGroup viewGroup) {
            super(viewGroup, new C27972c(r1));
            AbstractC19074t.m100208f(viewGroup, "parent");
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
        }

        /* renamed from: j0 */
        public final void m139367j0(AbstractC25732c.b bVar) {
            if (bVar != null) {
                ((C27972c) m106522i0()).m140970o1(bVar);
            }
        }
    }

    /* renamed from: ud.b$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC20484a {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(ViewGroup viewGroup) {
            super(viewGroup, new C27973d(r1));
            AbstractC19074t.m100208f(viewGroup, "parent");
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
        }
    }

    /* renamed from: ud.b$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC20484a {

        /* renamed from: J */
        private final c f128014J;

        /* renamed from: ud.b$f$a */
        /* loaded from: classes3.dex */
        public static final class a implements C27975f.a {
            a() {
            }

            @Override // p574vd.C27975f.a
            /* renamed from: a */
            public void mo139370a(ContactProfile contactProfile) {
                AbstractC19074t.m100208f(contactProfile, "profile");
                c m139369k0 = f.this.m139369k0();
                if (m139369k0 != null) {
                    m139369k0.mo37501a(contactProfile);
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f(ViewGroup viewGroup, c cVar) {
            super(viewGroup, new C27975f(r1));
            AbstractC19074t.m100208f(viewGroup, "parent");
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            this.f128014J = cVar;
        }

        /* renamed from: j0 */
        public final void m139368j0(AbstractC25732c.d dVar) {
            if (dVar != null) {
                ((C27975f) m106522i0()).m140973P1(dVar);
                ((C27975f) m106522i0()).m140974R1(new a());
            }
        }

        /* renamed from: k0 */
        public final c m139369k0() {
            return this.f128014J;
        }
    }

    /* renamed from: ud.b$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC20484a {

        /* renamed from: J */
        private final c f128016J;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(c cVar, ViewGroup viewGroup) {
            super(viewGroup, new C27976g(r1));
            AbstractC19074t.m100208f(viewGroup, "parent");
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            this.f128016J = cVar;
        }
    }

    /* renamed from: ud.b$h */
    /* loaded from: classes3.dex */
    public static final class h extends a {

        /* renamed from: I */
        private final View f128017I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            this.f128017I = view;
            view.setVisibility(8);
        }
    }

    /* renamed from: ud.b$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC20484a {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public i(ViewGroup viewGroup) {
            super(viewGroup, new C27977h(r1));
            AbstractC19074t.m100208f(viewGroup, "parent");
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
        }

        /* renamed from: j0 */
        public final void m139371j0(AbstractC25732c.g gVar) {
            if (gVar != null) {
                ((C27977h) m106522i0()).m140976o1(gVar);
            }
        }

        /* renamed from: k0 */
        public final void m139372k0(int i11) {
            ((C27977h) m106522i0()).m140977q1(this.f7784p.getTop(), i11);
        }
    }

    /* renamed from: ud.b$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC20484a {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public j(ViewGroup viewGroup) {
            super(viewGroup, new C27978i(r1));
            AbstractC19074t.m100208f(viewGroup, "parent");
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
        }

        /* renamed from: j0 */
        public final void m139373j0(AbstractC25732c abstractC25732c) {
            AbstractC19074t.m100208f(abstractC25732c, "data");
            ((C27978i) m106522i0()).m140980o1(abstractC25732c);
        }
    }

    public C27237b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f128010r = context;
        this.f128013u = new ArrayList();
    }

    /* renamed from: O */
    private final int m139357O(long j11) {
        int size = this.f128013u.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (((AbstractC25732c) this.f128013u.get(i12)).m132831b() == j11 && (i12 == 0 || ((AbstractC25732c) this.f128013u.get(i12 - 1)).m132831b() < ((AbstractC25732c) this.f128013u.get(i12)).m132831b())) {
                return i12;
            }
            if (((AbstractC25732c) this.f128013u.get(i12)).m132831b() < j11) {
                i11 = i12 + 1;
            } else {
                size = i12 - 1;
            }
        }
        return -1;
    }

    /* renamed from: R */
    private final boolean m139358R(int[] iArr, int i11) {
        int mo10005m = mo10005m(i11);
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        for (int i12 : iArr) {
            if (mo10005m == i12) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        AbstractC25732c.b bVar = null;
        AbstractC25732c.g gVar = null;
        AbstractC25732c.d dVar = null;
        if (abstractC1876c0 instanceof i) {
            i iVar = (i) abstractC1876c0;
            AbstractC25732c m139363Q = m139363Q(i11);
            if (m139363Q instanceof AbstractC25732c.g) {
                gVar = (AbstractC25732c.g) m139363Q;
            }
            iVar.m139371j0(gVar);
            return;
        }
        if (abstractC1876c0 instanceof j) {
            ((j) abstractC1876c0).m139373j0(m139363Q(i11));
            return;
        }
        if (abstractC1876c0 instanceof f) {
            f fVar = (f) abstractC1876c0;
            AbstractC25732c m139363Q2 = m139363Q(i11);
            if (m139363Q2 instanceof AbstractC25732c.d) {
                dVar = (AbstractC25732c.d) m139363Q2;
            }
            fVar.m139368j0(dVar);
            return;
        }
        if (abstractC1876c0 instanceof d) {
            d dVar2 = (d) abstractC1876c0;
            AbstractC25732c m139363Q3 = m139363Q(i11);
            if (m139363Q3 instanceof AbstractC25732c.b) {
                bVar = (AbstractC25732c.b) m139363Q3;
            }
            dVar2.m139367j0(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        switch (i11) {
            case 1:
                return new i(viewGroup);
            case 2:
                return new j(viewGroup);
            case 3:
            case 4:
                return new d(viewGroup);
            case 5:
                return new e(viewGroup);
            case 6:
                return new g(this.f128012t, viewGroup);
            case 7:
                return new f(viewGroup, this.f128012t);
            case 8:
                return new h(new View(viewGroup.getContext()));
            default:
                return new a(new View(viewGroup.getContext()));
        }
    }

    /* renamed from: L */
    public final void m139359L(int i11, AbstractC25732c abstractC25732c) {
        AbstractC19074t.m100208f(abstractC25732c, "itemData");
        this.f128013u.add(i11, abstractC25732c);
    }

    /* renamed from: M */
    public final int m139360M(long j11) {
        int size = this.f128013u.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (((AbstractC25732c) this.f128013u.get(i12)).m132831b() > j11 && (i12 == 0 || ((AbstractC25732c) this.f128013u.get(i12 - 1)).m132831b() <= j11)) {
                return i12;
            }
            if (((AbstractC25732c) this.f128013u.get(i12)).m132831b() <= j11) {
                i11 = i12 + 1;
            } else {
                size = i12 - 1;
            }
        }
        return -1;
    }

    /* renamed from: N */
    public final int m139361N(long j11, String str, int[] iArr) {
        AbstractC19074t.m100208f(str, "eventId");
        int m139357O = m139357O(j11);
        if (m139357O == -1) {
            return -1;
        }
        int size = this.f128013u.size();
        while (m139357O < size && ((AbstractC25732c) this.f128013u.get(m139357O)).m132831b() <= 86400000 + j11) {
            if ((TextUtils.isEmpty(((AbstractC25732c) this.f128013u.get(m139357O)).mo132830a()) || AbstractC19074t.m100204b(((AbstractC25732c) this.f128013u.get(m139357O)).mo132830a(), str)) && m139358R(iArr, m139357O)) {
                return m139357O;
            }
            m139357O++;
        }
        return -1;
    }

    /* renamed from: P */
    public final int m139362P(long j11, int[] iArr) {
        int m139357O = m139357O(j11);
        if (m139357O == -1) {
            return -1;
        }
        int size = this.f128013u.size();
        while (m139357O < size && ((AbstractC25732c) this.f128013u.get(m139357O)).m132831b() == j11) {
            if (m139358R(iArr, m139357O)) {
                return m139357O;
            }
            m139357O++;
        }
        return -1;
    }

    /* renamed from: Q */
    public final AbstractC25732c m139363Q(int i11) {
        Object obj = this.f128013u.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return (AbstractC25732c) obj;
    }

    /* renamed from: S */
    public final void m139364S(List list) {
        AbstractC19074t.m100208f(list, "listData");
        this.f128013u.clear();
        this.f128013u.addAll(list);
    }

    /* renamed from: T */
    public final void m139365T(int i11, AbstractC25732c abstractC25732c) {
        AbstractC19074t.m100208f(abstractC25732c, "itemData");
        this.f128013u.set(i11, abstractC25732c);
    }

    /* renamed from: U */
    public final void m139366U(c cVar) {
        this.f128012t = cVar;
    }

    @Override // com.zing.zalo.adapters.C7209s8.a
    /* renamed from: a */
    public boolean mo36685a(int i11) {
        int mo10005m = mo10005m(i11);
        if (mo10005m == 1 || mo10005m == 2 || mo10005m == 3 || mo10005m == 4) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.adapters.C7209s8.a
    /* renamed from: b */
    public void mo36686b(View view, int i11) {
        AbstractC19074t.m100208f(view, "header");
        j jVar = this.f128011s;
        if (jVar != null) {
            jVar.m139373j0(m139363Q(i11));
        }
    }

    @Override // com.zing.zalo.adapters.C7209s8.a
    /* renamed from: c */
    public int mo36687c(int i11) {
        while (!mo36685a(i11)) {
            i11--;
            if (i11 < 0) {
                return 0;
            }
        }
        return i11;
    }

    @Override // com.zing.zalo.adapters.C7209s8.a
    /* renamed from: d */
    public View mo36688d(int i11, ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        j jVar = this.f128011s;
        if (jVar == null) {
            jVar = new j(viewGroup);
            this.f128011s = jVar;
        }
        View view = jVar.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        return view;
    }

    @Override // com.zing.zalo.adapters.C7209s8.a
    /* renamed from: e */
    public boolean mo36689e(int i11) {
        int mo10005m = mo10005m(i11);
        if (mo10005m == 1 || mo10005m == 5) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f128013u.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        Object obj = this.f128013u.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        AbstractC25732c abstractC25732c = (AbstractC25732c) obj;
        if (abstractC25732c instanceof AbstractC25732c.g) {
            return 1;
        }
        if (abstractC25732c instanceof AbstractC25732c.h) {
            return 2;
        }
        if (abstractC25732c instanceof AbstractC25732c.b) {
            if (!((AbstractC25732c.b) abstractC25732c).m132832c()) {
                return 3;
            }
            return 4;
        }
        if (abstractC25732c instanceof AbstractC25732c.c) {
            return 5;
        }
        if (abstractC25732c instanceof AbstractC25732c.e) {
            return 6;
        }
        if (abstractC25732c instanceof AbstractC25732c.d) {
            return 7;
        }
        if (abstractC25732c instanceof AbstractC25732c.f) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }
}
