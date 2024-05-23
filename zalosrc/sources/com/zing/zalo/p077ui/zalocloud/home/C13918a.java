package com.zing.zalo.p077ui.zalocloud.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.RecyclerView;
import bc0.InterfaceC2726a;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageChartView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.home.AbstractC13919b;
import com.zing.zalo.p077ui.zalocloud.home.AbstractC13920c;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.C21459a;
import kotlin.NoWhenBranchMatchedException;
import p649xl.C30057tf;
import qm0.AbstractC25332a0;
import qm0.C25345g0;
import wg0.AbstractC28981d;

/* renamed from: com.zing.zalo.ui.zalocloud.home.a */
/* loaded from: classes6.dex */
public final class C13918a extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private final InterfaceC2726a f71697r;

    /* renamed from: s */
    private final ArrayList f71698s;

    /* renamed from: com.zing.zalo.ui.zalocloud.home.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC1915h.b {

        /* renamed from: a */
        private final List f71699a;

        /* renamed from: b */
        private final List f71700b;

        public b(List list, List list2) {
            AbstractC19074t.m100208f(list, "oldList");
            AbstractC19074t.m100208f(list2, "newList");
            this.f71699a = list;
            this.f71700b = list2;
        }

        /* renamed from: f */
        private final boolean m77432f(AbstractC13919b.j jVar, AbstractC13919b.j jVar2) {
            if (jVar.m77453c() == jVar2.m77453c() && jVar.m77452b() == jVar2.m77452b()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0047 A[RETURN, SYNTHETIC] */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final boolean m77433g(AbstractC28981d abstractC28981d, AbstractC28981d abstractC28981d2) {
            boolean z11;
            if (abstractC28981d.m144695b() == abstractC28981d2.m144695b()) {
                if (abstractC28981d instanceof AbstractC28981d.a) {
                    if ((abstractC28981d2 instanceof AbstractC28981d.a) && ((AbstractC28981d.a) abstractC28981d).m144699f() == ((AbstractC28981d.a) abstractC28981d2).m144699f()) {
                        return true;
                    }
                } else {
                    if (abstractC28981d instanceof AbstractC28981d.b) {
                        z11 = abstractC28981d2 instanceof AbstractC28981d.b;
                    } else if (abstractC28981d instanceof AbstractC28981d.c) {
                        z11 = abstractC28981d2 instanceof AbstractC28981d.c;
                    } else if (abstractC28981d instanceof AbstractC28981d.d) {
                        z11 = abstractC28981d2 instanceof AbstractC28981d.d;
                    } else if (abstractC28981d instanceof AbstractC28981d.e) {
                        z11 = abstractC28981d2 instanceof AbstractC28981d.e;
                    } else if (abstractC28981d instanceof AbstractC28981d.f) {
                        z11 = abstractC28981d2 instanceof AbstractC28981d.f;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (z11) {
                    }
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: a */
        public boolean mo421a(int i11, int i12) {
            AbstractC13919b abstractC13919b = (AbstractC13919b) this.f71699a.get(i11);
            AbstractC13919b abstractC13919b2 = (AbstractC13919b) this.f71700b.get(i12);
            if (abstractC13919b instanceof AbstractC13919b.b.a) {
                if (!(abstractC13919b2 instanceof AbstractC13919b.b.a) || !AbstractC19074t.m100204b(((AbstractC13919b.b.a) abstractC13919b).m77435b(), ((AbstractC13919b.b.a) abstractC13919b2).m77435b())) {
                    return false;
                }
            } else if (abstractC13919b instanceof AbstractC13919b.c.a) {
                if (!(abstractC13919b2 instanceof AbstractC13919b.c.a) || !AbstractC19074t.m100204b(((AbstractC13919b.c.a) abstractC13919b).m77437b(), ((AbstractC13919b.c.a) abstractC13919b2).m77437b())) {
                    return false;
                }
            } else if (abstractC13919b instanceof AbstractC13919b.h) {
                if (!(abstractC13919b2 instanceof AbstractC13919b.h) || !AbstractC19074t.m100204b(((AbstractC13919b.h) abstractC13919b).m77450b(), ((AbstractC13919b.h) abstractC13919b2).m77450b())) {
                    return false;
                }
            } else if (abstractC13919b instanceof AbstractC13919b.f.c) {
                if (!(abstractC13919b2 instanceof AbstractC13919b.f.c)) {
                    return false;
                }
                AbstractC13919b.f.c cVar = (AbstractC13919b.f.c) abstractC13919b;
                AbstractC13919b.f.c cVar2 = (AbstractC13919b.f.c) abstractC13919b2;
                if (cVar.m77443b() != cVar2.m77443b() || cVar.m77444c() != cVar2.m77444c()) {
                    return false;
                }
            } else if (abstractC13919b instanceof AbstractC13919b.f.d) {
                if (!(abstractC13919b2 instanceof AbstractC13919b.f.d)) {
                    return false;
                }
                AbstractC13919b.f.d dVar = (AbstractC13919b.f.d) abstractC13919b;
                AbstractC13919b.f.d dVar2 = (AbstractC13919b.f.d) abstractC13919b2;
                if (dVar.m77446b() != dVar2.m77446b() || dVar.m77447c() != dVar2.m77447c()) {
                    return false;
                }
            } else if (abstractC13919b instanceof AbstractC13919b.i) {
                if (!(abstractC13919b2 instanceof AbstractC13919b.i) || !m77433g(((AbstractC13919b.i) abstractC13919b).m77451b(), ((AbstractC13919b.i) abstractC13919b2).m77451b())) {
                    return false;
                }
            } else if ((abstractC13919b instanceof AbstractC13919b.j) && (!(abstractC13919b2 instanceof AbstractC13919b.j) || !m77432f((AbstractC13919b.j) abstractC13919b, (AbstractC13919b.j) abstractC13919b2))) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: b */
        public boolean mo422b(int i11, int i12) {
            if (((AbstractC13919b) this.f71699a.get(i11)).m77434a() == ((AbstractC13919b) this.f71700b.get(i12)).m77434a()) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: d */
        public int mo424d() {
            return this.f71700b.size();
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: e */
        public int mo425e() {
            return this.f71699a.size();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.a$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71701a;

        static {
            int[] iArr = new int[AbstractC13919b.f.b.values().length];
            try {
                iArr[AbstractC13919b.f.b.f71717p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC13919b.f.b.f71718q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC13919b.f.b.f71719r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC13919b.f.b.f71720s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f71701a = iArr;
        }
    }

    public C13918a(InterfaceC2726a interfaceC2726a) {
        AbstractC19074t.m100208f(interfaceC2726a, "cloudMediaHomeListener");
        this.f71697r = interfaceC2726a;
        this.f71698s = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo9990A(AbstractC13920c abstractC13920c, int i11) {
        AbstractC19074t.m100208f(abstractC13920c, "holder");
        Object obj = this.f71698s.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        AbstractC13919b abstractC13919b = (AbstractC13919b) obj;
        if (abstractC13920c instanceof AbstractC13920c.b) {
            ((AbstractC13920c.b) abstractC13920c).m77457j0((AbstractC13919b.c) abstractC13919b);
            return;
        }
        if (abstractC13920c instanceof AbstractC13920c.c) {
            ((AbstractC13920c.c) abstractC13920c).m77459j0((AbstractC13919b.b) abstractC13919b);
            return;
        }
        if (abstractC13920c instanceof AbstractC13920c.e) {
            ((AbstractC13920c.e) abstractC13920c).m77454i0((AbstractC13919b.e) abstractC13919b);
            return;
        }
        if (abstractC13920c instanceof AbstractC13920c.h) {
            ((AbstractC13920c.h) abstractC13920c).m77474j0((AbstractC13919b.h) abstractC13919b);
            return;
        }
        if (abstractC13920c instanceof AbstractC13920c.g) {
            ((AbstractC13920c.g) abstractC13920c).m77473j0((AbstractC13919b.g) abstractC13919b);
            return;
        }
        if (abstractC13920c instanceof AbstractC13920c.f) {
            ((AbstractC13920c.f) abstractC13920c).m77471j0((AbstractC13919b.f) abstractC13919b);
            return;
        }
        if (abstractC13920c instanceof AbstractC13920c.d) {
            ((AbstractC13920c.d) abstractC13920c).m77466m0((AbstractC13919b.d) abstractC13919b);
            return;
        }
        if (abstractC13920c instanceof AbstractC13920c.a) {
            ((AbstractC13920c.a) abstractC13920c).m77454i0((AbstractC13919b.a) abstractC13919b);
        } else if (abstractC13920c instanceof AbstractC13920c.i) {
            ((AbstractC13920c.i) abstractC13920c).m77476k0((AbstractC13919b.i) abstractC13919b);
        } else if (abstractC13920c instanceof AbstractC13920c.j) {
            ((AbstractC13920c.j) abstractC13920c).m77479k0((AbstractC13919b.j) abstractC13919b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public AbstractC13920c mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC13920c bVar;
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        switch (i11) {
            case 1:
                View inflate = from.inflate(AbstractC7409c0.zcloud_home_chart_header, viewGroup, false);
                AbstractC19074t.m100207e(inflate, "inflate(...)");
                bVar = new AbstractC13920c.b(inflate);
                break;
            case 2:
                return new AbstractC13920c.c(new ToolStorageChartView(context));
            case 3:
            default:
                throw new IllegalArgumentException("Invalid view type");
            case 4:
                return new AbstractC13920c.e(new View(context));
            case 5:
                return new AbstractC13920c.g(new View(context), this.f71697r);
            case 6:
                Context context2 = viewGroup.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                bVar = new AbstractC13920c.h(new RobotoTextView(context2));
                break;
            case 7:
                AbstractC19074t.m100205c(context);
                return new AbstractC13920c.f(new ListItem(context));
            case 8:
                AbstractC19074t.m100205c(context);
                return new AbstractC13920c.d(new ListItem(context), this.f71697r);
            case 9:
                C30057tf m148547a = C30057tf.m148547a(from.inflate(AbstractC7409c0.zcloud_fixed_banner, viewGroup, false));
                AbstractC19074t.m100207e(m148547a, "bind(...)");
                bVar = new AbstractC13920c.a(m148547a, this.f71697r);
                break;
            case 10:
                View inflate2 = from.inflate(AbstractC7409c0.zcloud_home_migrate_chart, viewGroup, false);
                AbstractC19074t.m100207e(inflate2, "inflate(...)");
                bVar = new AbstractC13920c.i(inflate2, this.f71697r);
                break;
            case 11:
                AbstractC19074t.m100205c(context);
                return new AbstractC13920c.j(new ListItem(context), this.f71697r);
        }
        return bVar;
    }

    /* renamed from: N */
    public final void m77428N(List list) {
        boolean z11;
        AbstractC19074t.m100208f(list, "listData");
        if (this.f71698s.size() != list.size()) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC1915h.c m10492a = AbstractC1915h.m10492a(new b(this.f71698s, list));
        AbstractC19074t.m100207e(m10492a, "calculateDiff(...)");
        this.f71698s.clear();
        this.f71698s.addAll(list);
        m10492a.m10505e(this);
        if (z11) {
            m10008p();
        }
    }

    /* renamed from: O */
    public final void m77429O() {
        Iterable m131194T0;
        Object obj;
        m131194T0 = AbstractC25332a0.m131194T0(this.f71698s);
        Iterator it = m131194T0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C25345g0) obj).m131264b() instanceof AbstractC13919b.g) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C25345g0 c25345g0 = (C25345g0) obj;
        if (c25345g0 != null) {
            m10009q(c25345g0.m131263a());
        }
    }

    /* renamed from: P */
    public final void m77430P(List list) {
        Iterable m131194T0;
        Object obj;
        AbstractC19074t.m100208f(list, "threadList");
        m131194T0 = AbstractC25332a0.m131194T0(this.f71698s);
        Iterator it = m131194T0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C25345g0) obj).m131264b() instanceof AbstractC13919b.f.d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C25345g0 c25345g0 = (C25345g0) obj;
        if (c25345g0 != null) {
            Object m131264b = c25345g0.m131264b();
            AbstractC19074t.m100206d(m131264b, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.home.CloudMediaHomeItem.MediaInfo.ThreadTypeInfo");
            ((AbstractC13919b.f.d) m131264b).m77448d(list.size());
            Object m131264b2 = c25345g0.m131264b();
            AbstractC19074t.m100206d(m131264b2, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.home.CloudMediaHomeItem.MediaInfo.ThreadTypeInfo");
            AbstractC13919b.f.d dVar = (AbstractC13919b.f.d) m131264b2;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((ThreadStorageInfo) obj2).m74803l() >= C21459a.m111040i(100)) {
                    arrayList.add(obj2);
                }
            }
            dVar.m77449e(arrayList.size());
            m10009q(c25345g0.m131263a());
        }
    }

    /* renamed from: Q */
    public final void m77431Q(ZCloudQuotaUsage zCloudQuotaUsage) {
        Iterable m131194T0;
        Object obj;
        Object obj2;
        Iterable m131194T02;
        Iterable m131194T03;
        long m41250h;
        AbstractC19074t.m100208f(zCloudQuotaUsage, "quotaUsage");
        m131194T0 = AbstractC25332a0.m131194T0(this.f71698s);
        Iterator it = m131194T0.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((C25345g0) obj2).m131264b() instanceof AbstractC13919b.c.a) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C25345g0 c25345g0 = (C25345g0) obj2;
        if (c25345g0 != null) {
            Object m131264b = c25345g0.m131264b();
            AbstractC19074t.m100206d(m131264b, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.home.CloudMediaHomeItem.ChartHeader.NormalHeader");
            ((AbstractC13919b.c.a) m131264b).m77438c(zCloudQuotaUsage);
        }
        m131194T02 = AbstractC25332a0.m131194T0(this.f71698s);
        Iterator it2 = m131194T02.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C25345g0) next).m131264b() instanceof AbstractC13919b.b.a) {
                obj = next;
                break;
            }
        }
        C25345g0 c25345g02 = (C25345g0) obj;
        if (c25345g02 != null) {
            Object m131264b2 = c25345g02.m131264b();
            AbstractC19074t.m100206d(m131264b2, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.home.CloudMediaHomeItem.Chart.NormalChart");
            ((AbstractC13919b.b.a) m131264b2).m77436c(zCloudQuotaUsage);
        }
        m131194T03 = AbstractC25332a0.m131194T0(this.f71698s);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : m131194T03) {
            if (((C25345g0) obj3).m131264b() instanceof AbstractC13919b.f.c) {
                arrayList.add(obj3);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object m131264b3 = ((C25345g0) it3.next()).m131264b();
            AbstractC19074t.m100206d(m131264b3, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.home.CloudMediaHomeItem.MediaInfo.SingleTypeInfo");
            AbstractC13919b.f.c cVar = (AbstractC13919b.f.c) m131264b3;
            int i11 = c.f71701a[cVar.m77443b().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            m41250h = zCloudQuotaUsage.m41249g();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        m41250h = zCloudQuotaUsage.m41248f();
                    }
                } else {
                    m41250h = zCloudQuotaUsage.m41254l();
                }
            } else {
                m41250h = zCloudQuotaUsage.m41250h();
            }
            cVar.m77445d(m41250h);
        }
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f71698s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((AbstractC13919b) this.f71698s.get(i11)).m77434a();
    }
}
