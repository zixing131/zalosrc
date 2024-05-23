package com.zing.zalo.p077ui.zalocloud.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageChartView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.home.AbstractC13923f;
import com.zing.zalo.p077ui.zalocloud.home.AbstractC13925h;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zinstant.zom.node.ZOM;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import mg0.AbstractC23291c;
import og0.C24252c;
import og0.EnumC24251b;
import p664y.AbstractC30228a;
import qm0.AbstractC25332a0;
import qm0.C25345g0;
import wg0.AbstractC28981d;

/* renamed from: com.zing.zalo.ui.zalocloud.home.e */
/* loaded from: classes6.dex */
public final class C13922e extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private final InterfaceC13924g f71762r;

    /* renamed from: s */
    private final ArrayList f71763s;

    /* renamed from: t */
    private final EnumMap f71764t;

    /* renamed from: com.zing.zalo.ui.zalocloud.home.e$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.e$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC1915h.b {

        /* renamed from: a */
        private final List f71765a;

        /* renamed from: b */
        private final List f71766b;

        public b(List list, List list2) {
            AbstractC19074t.m100208f(list, "oldList");
            AbstractC19074t.m100208f(list2, "newList");
            this.f71765a = list;
            this.f71766b = list2;
        }

        /* renamed from: f */
        private final boolean m77493f(AbstractC23291c abstractC23291c, AbstractC23291c abstractC23291c2) {
            if (AbstractC19074t.m100204b(abstractC23291c, AbstractC23291c.b.f113053b)) {
                return abstractC23291c2 instanceof AbstractC23291c.b;
            }
            if (AbstractC19074t.m100204b(abstractC23291c, AbstractC23291c.d.f113055b)) {
                return abstractC23291c2 instanceof AbstractC23291c.d;
            }
            if (!(abstractC23291c instanceof AbstractC23291c.a) ? !(abstractC23291c instanceof AbstractC23291c.c) || ((abstractC23291c2 instanceof AbstractC23291c.c) && abstractC23291c2.mo120404a() == abstractC23291c.mo120404a()) : (abstractC23291c2 instanceof AbstractC23291c.a) && abstractC23291c2.mo120404a() == abstractC23291c.mo120404a() && AbstractC19074t.m100204b(((AbstractC23291c.a) abstractC23291c2).m120405b(), ((AbstractC23291c.a) abstractC23291c).m120405b())) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private final boolean m77494g(AbstractC13923f.n nVar, AbstractC13923f.n nVar2) {
            if (nVar.m77519c() == nVar2.m77519c() && nVar.m77520d() == nVar2.m77520d() && nVar.m77518b() == nVar2.m77518b()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0047 A[RETURN, SYNTHETIC] */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final boolean m77495h(AbstractC28981d abstractC28981d, AbstractC28981d abstractC28981d2) {
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

        /* renamed from: i */
        private final boolean m77496i(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f2) {
            if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) {
                if (!(abstractC16884f2 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) || ((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) abstractC16884f2).m90209b() != ((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) abstractC16884f).m90209b()) {
                    return false;
                }
            } else if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) {
                if (!(abstractC16884f2 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) || !AbstractC19074t.m100204b(((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) abstractC16884f2).m90210b(), ((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) abstractC16884f).m90210b())) {
                    return false;
                }
            } else {
                if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c) {
                    return abstractC16884f2 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c;
                }
                if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) {
                    return abstractC16884f2 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN, SYNTHETIC] */
        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo421a(int i11, int i12) {
            AbstractC13923f abstractC13923f = (AbstractC13923f) this.f71765a.get(i11);
            AbstractC13923f abstractC13923f2 = (AbstractC13923f) this.f71766b.get(i12);
            if (abstractC13923f instanceof AbstractC13923f.a.C32785a) {
                return abstractC13923f2 instanceof AbstractC13923f.a.C32785a;
            }
            if (abstractC13923f instanceof AbstractC13923f.a.b) {
                return abstractC13923f2 instanceof AbstractC13923f.a.b;
            }
            if (abstractC13923f instanceof AbstractC13923f.i.a) {
                return abstractC13923f2 instanceof AbstractC13923f.i.a;
            }
            if (abstractC13923f instanceof AbstractC13923f.b.a) {
                if (!(abstractC13923f2 instanceof AbstractC13923f.b.a) || !m77493f(((AbstractC13923f.b.a) abstractC13923f).m77498b(), ((AbstractC13923f.b.a) abstractC13923f2).m77498b())) {
                    return false;
                }
            }
            if (abstractC13923f instanceof AbstractC13923f.b.C32786b) {
                if (!(abstractC13923f2 instanceof AbstractC13923f.b.C32786b) || !AbstractC19074t.m100204b(((AbstractC13923f.b.C32786b) abstractC13923f).m77499b(), ((AbstractC13923f.b.C32786b) abstractC13923f2).m77499b())) {
                }
            } else if (abstractC13923f instanceof AbstractC13923f.c.a) {
                if (!(abstractC13923f2 instanceof AbstractC13923f.c.a) || !m77493f(((AbstractC13923f.c.a) abstractC13923f).m77501b(), ((AbstractC13923f.c.a) abstractC13923f2).m77501b())) {
                }
            } else if (abstractC13923f instanceof AbstractC13923f.c.b) {
                if (!(abstractC13923f2 instanceof AbstractC13923f.c.b) || !AbstractC19074t.m100204b(((AbstractC13923f.c.b) abstractC13923f).m77502b(), ((AbstractC13923f.c.b) abstractC13923f2).m77502b())) {
                }
            } else if (abstractC13923f instanceof AbstractC13923f.h) {
                if (!(abstractC13923f2 instanceof AbstractC13923f.h) || !AbstractC19074t.m100204b(((AbstractC13923f.h) abstractC13923f).m77508b(), ((AbstractC13923f.h) abstractC13923f2).m77508b())) {
                }
            } else {
                if (!(abstractC13923f instanceof AbstractC13923f.j)) {
                    return abstractC13923f instanceof AbstractC13923f.m ? true : true;
                }
                if (abstractC13923f2 instanceof AbstractC13923f.j) {
                    AbstractC13923f.j jVar = (AbstractC13923f.j) abstractC13923f;
                    AbstractC13923f.j jVar2 = (AbstractC13923f.j) abstractC13923f2;
                    if (jVar.m77509b().m109965b() == jVar2.m77509b().m109965b() && jVar.m77512e() == jVar2.m77512e()) {
                        C24252c c24252c = C24252c.f117152a;
                        if (c24252c.m126600f(jVar.m77509b().m109965b()) != c24252c.m126600f(jVar2.m77509b().m109965b()) || jVar2.m77513f() != jVar.m77513f() || jVar2.m77511d() != jVar.m77511d()) {
                        }
                    }
                }
                return false;
            }
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: b */
        public boolean mo422b(int i11, int i12) {
            if (((AbstractC13923f) this.f71765a.get(i11)).m77497a() == ((AbstractC13923f) this.f71766b.get(i12)).m77497a()) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: d */
        public int mo424d() {
            return this.f71766b.size();
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: e */
        public int mo425e() {
            return this.f71765a.size();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.e$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71767a;

        static {
            int[] iArr = new int[EnumC24251b.values().length];
            try {
                iArr[EnumC24251b.f117146q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24251b.f117147r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24251b.f117148s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71767a = iArr;
        }
    }

    public C13922e(InterfaceC13924g interfaceC13924g) {
        AbstractC19074t.m100208f(interfaceC13924g, "zCloudHomeListener");
        this.f71762r = interfaceC13924g;
        this.f71763s = new ArrayList();
        this.f71764t = new EnumMap(EnumC24251b.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo9990A(AbstractC13925h abstractC13925h, int i11) {
        AbstractC19074t.m100208f(abstractC13925h, "holder");
        Object obj = this.f71763s.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        AbstractC13923f abstractC13923f = (AbstractC13923f) obj;
        if (abstractC13925h instanceof AbstractC13925h.a) {
            ((AbstractC13925h.a) abstractC13925h).m77522j0((AbstractC13923f.a) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.b) {
            ((AbstractC13925h.b) abstractC13925h).m77523j0((AbstractC13923f.c) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.c) {
            ((AbstractC13925h.c) abstractC13925h).m77526k0((AbstractC13923f.b) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.d) {
            ((AbstractC13925h.d) abstractC13925h).m77529k0((AbstractC13923f.d) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.f) {
            ((AbstractC13925h.f) abstractC13925h).m77521i0((AbstractC13923f.e) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.g) {
            ((AbstractC13925h.g) abstractC13925h).m77521i0((AbstractC13923f.f) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.h) {
            ((AbstractC13925h.h) abstractC13925h).m77545j0((AbstractC13923f.g) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.j) {
            ((AbstractC13925h.j) abstractC13925h).m77549l0((AbstractC13923f.i) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.i) {
            ((AbstractC13925h.i) abstractC13925h).m77546j0((AbstractC13923f.h) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.e) {
            ((AbstractC13925h.e) abstractC13925h).m77542o0((AbstractC13923f.j) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.m) {
            ((AbstractC13925h.m) abstractC13925h).m77560k0((AbstractC13923f.m) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.n) {
            ((AbstractC13925h.n) abstractC13925h).m77563k0((AbstractC13923f.n) abstractC13923f, i11);
            return;
        }
        if (abstractC13925h instanceof AbstractC13925h.l) {
            AbstractC30228a.m149044a(abstractC13923f);
            ((AbstractC13925h.l) abstractC13925h).m77558k0(null, i11);
        } else if (abstractC13925h instanceof AbstractC13925h.k) {
            ((AbstractC13925h.k) abstractC13925h).m77555n0((AbstractC13923f.k) abstractC13923f, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public AbstractC13925h mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        switch (i11) {
                            case 9:
                                return new AbstractC13925h.f(new View(context));
                            case 10:
                                View inflate = from.inflate(AbstractC7409c0.search_global_skeleton_section_list_layout, viewGroup, false);
                                AbstractC19074t.m100207e(inflate, "inflate(...)");
                                return new AbstractC13925h.g(inflate);
                            case 11:
                                View inflate2 = from.inflate(AbstractC7409c0.zcloud_home_banner, viewGroup, false);
                                AbstractC19074t.m100207e(inflate2, "inflate(...)");
                                return new AbstractC13925h.a(inflate2);
                            case 12:
                                return new AbstractC13925h.h(new View(context), this.f71762r);
                            case 13:
                                Context context2 = viewGroup.getContext();
                                AbstractC19074t.m100207e(context2, "getContext(...)");
                                return new AbstractC13925h.i(new RobotoTextView(context2));
                            case 14:
                                AbstractC19074t.m100205c(context);
                                return new AbstractC13925h.e(new ListItem(context), this.f71762r);
                            case 15:
                                View inflate3 = from.inflate(AbstractC7409c0.zcloud_home_migrate_chart, viewGroup, false);
                                AbstractC19074t.m100207e(inflate3, "inflate(...)");
                                return new AbstractC13925h.m(inflate3, this.f71762r);
                            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                AbstractC19074t.m100205c(context);
                                return new AbstractC13925h.n(new ListItem(context), this.f71762r);
                            case 17:
                                View inflate4 = from.inflate(AbstractC7409c0.zcloud_home_bottom_banner, viewGroup, false);
                                AbstractC19074t.m100207e(inflate4, "inflate(...)");
                                return new AbstractC13925h.l(inflate4, this.f71762r);
                            case 18:
                                View inflate5 = from.inflate(AbstractC7409c0.zcloud_home_bottom_banner, viewGroup, false);
                                AbstractC19074t.m100207e(inflate5, "inflate(...)");
                                return new AbstractC13925h.k(inflate5, this.f71762r);
                            default:
                                throw new IllegalArgumentException("Invalid view type");
                        }
                    }
                    AbstractC19074t.m100205c(context);
                    return new AbstractC13925h.d(new ListItem(context), this.f71762r);
                }
                Context context3 = viewGroup.getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                return new AbstractC13925h.j(new RobotoTextView(context3), this.f71762r);
            }
            return new AbstractC13925h.c(new ToolStorageChartView(context));
        }
        View inflate6 = from.inflate(AbstractC7409c0.zcloud_home_chart_header, viewGroup, false);
        AbstractC19074t.m100207e(inflate6, "inflate(...)");
        return new AbstractC13925h.b(inflate6);
    }

    /* renamed from: N */
    public final void m77488N(List list) {
        Object obj;
        AbstractC19074t.m100208f(list, "listData");
        Set<Map.Entry> entrySet = this.f71764t.entrySet();
        AbstractC19074t.m100207e(entrySet, "<get-entries>(...)");
        for (Map.Entry entry : entrySet) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    AbstractC13923f abstractC13923f = (AbstractC13923f) obj;
                    if ((abstractC13923f instanceof AbstractC13923f.j) && ((AbstractC13923f.j) abstractC13923f).m77509b().m109965b() == entry.getKey()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AbstractC13923f abstractC13923f2 = (AbstractC13923f) obj;
            if (abstractC13923f2 != null) {
                AbstractC19074t.m100206d(abstractC13923f2, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.home.ZCloudHomeItem.ZCloudConnectFeature");
                Object value = entry.getValue();
                AbstractC19074t.m100207e(value, "<get-value>(...)");
                ((AbstractC13923f.j) abstractC13923f2).m77514g(((Boolean) value).booleanValue());
            }
        }
        if (this.f71763s.size() != list.size()) {
            this.f71763s.clear();
            this.f71763s.addAll(list);
            m10008p();
        } else {
            AbstractC1915h.c m10492a = AbstractC1915h.m10492a(new b(this.f71763s, list));
            AbstractC19074t.m100207e(m10492a, "calculateDiff(...)");
            this.f71763s.clear();
            this.f71763s.addAll(list);
            m10492a.m10505e(this);
        }
    }

    /* renamed from: O */
    public final void m77489O(EnumC24251b enumC24251b, boolean z11) {
        Iterable m131194T0;
        Object obj;
        AbstractC19074t.m100208f(enumC24251b, "feature");
        this.f71764t.put((EnumMap) enumC24251b, (EnumC24251b) Boolean.valueOf(z11));
        m131194T0 = AbstractC25332a0.m131194T0(this.f71763s);
        Iterator it = m131194T0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C25345g0 c25345g0 = (C25345g0) obj;
                if (c25345g0.m131264b() instanceof AbstractC13923f.j) {
                    Object m131264b = c25345g0.m131264b();
                    AbstractC19074t.m100206d(m131264b, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.home.ZCloudHomeItem.ZCloudConnectFeature");
                    if (((AbstractC13923f.j) m131264b).m77509b().m109965b() == enumC24251b) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        C25345g0 c25345g02 = (C25345g0) obj;
        if (c25345g02 != null) {
            Object m131264b2 = c25345g02.m131264b();
            AbstractC19074t.m100206d(m131264b2, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.home.ZCloudHomeItem.ZCloudConnectFeature");
            ((AbstractC13923f.j) m131264b2).m77514g(z11);
            m10009q(c25345g02.m131263a());
        }
    }

    /* renamed from: P */
    public final void m77490P(boolean z11) {
        Object obj;
        if (z11) {
            this.f71763s.add(AbstractC13923f.f.f71777b);
        } else {
            Iterator it = this.f71763s.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((AbstractC13923f) obj) instanceof AbstractC13923f.f) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AbstractC19069o0.m100184a(this.f71763s).remove((AbstractC13923f) obj);
        }
        m10008p();
    }

    /* renamed from: Q */
    public final void m77491Q() {
        Iterable m131194T0;
        Object obj;
        m131194T0 = AbstractC25332a0.m131194T0(this.f71763s);
        Iterator it = m131194T0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C25345g0) obj).m131264b() instanceof AbstractC13923f.g) {
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
            AbstractC19074t.m100206d(m131264b, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.home.ZCloudHomeItem.RemainingSpace");
            ((AbstractC13923f.g) m131264b).m77507c(false);
            m10009q(c25345g0.m131263a());
        }
    }

    /* renamed from: R */
    public final void m77492R(ZCloudQuotaUsage zCloudQuotaUsage) {
        Object obj;
        Object obj2;
        Object obj3;
        long m41265a;
        AbstractC19074t.m100208f(zCloudQuotaUsage, "cloudQuotaUsage");
        Iterator it = this.f71763s.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((AbstractC13923f) obj2) instanceof AbstractC13923f.c.b) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        AbstractC13923f abstractC13923f = (AbstractC13923f) obj2;
        if (abstractC13923f != null) {
            ((AbstractC13923f.c.b) abstractC13923f).m77503c(zCloudQuotaUsage);
        }
        Iterator it2 = this.f71763s.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj3 = it2.next();
                if (((AbstractC13923f) obj3) instanceof AbstractC13923f.b.C32786b) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        AbstractC13923f abstractC13923f2 = (AbstractC13923f) obj3;
        if (abstractC13923f2 != null) {
            ((AbstractC13923f.b.C32786b) abstractC13923f2).m77500c(zCloudQuotaUsage);
        }
        Iterator it3 = this.f71763s.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((AbstractC13923f) next) instanceof AbstractC13923f.d) {
                obj = next;
                break;
            }
        }
        AbstractC13923f abstractC13923f3 = (AbstractC13923f) obj;
        if (abstractC13923f3 != null) {
            ((AbstractC13923f.d) abstractC13923f3).m77505c(zCloudQuotaUsage.m41252j());
        }
        ArrayList arrayList = this.f71763s;
        ArrayList<AbstractC13923f> arrayList2 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (((AbstractC13923f) obj4) instanceof AbstractC13923f.j) {
                arrayList2.add(obj4);
            }
        }
        for (AbstractC13923f abstractC13923f4 : arrayList2) {
            AbstractC19074t.m100206d(abstractC13923f4, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.home.ZCloudHomeItem.ZCloudConnectFeature");
            AbstractC13923f.j jVar = (AbstractC13923f.j) abstractC13923f4;
            int i11 = c.f71767a[jVar.m77509b().m109965b().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        m41265a = zCloudQuotaUsage.m41251i().m41266b();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    m41265a = zCloudQuotaUsage.m41251i().m41267c();
                }
            } else {
                m41265a = zCloudQuotaUsage.m41251i().m41265a();
            }
            jVar.m77515h(m41265a);
        }
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f71763s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((AbstractC13923f) this.f71763s.get(i11)).m77497a();
    }
}
