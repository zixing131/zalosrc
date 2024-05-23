package com.zing.zalo.p077ui.searchglobal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalTabLayout;
import com.zing.zalo.p077ui.widget.viewpager.SmoothScrollerViewPager;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import ea0.C18316b;
import ea0.C18333g1;
import ea0.C18338j;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.C19325g1;
import ga0.C19342m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29072d;
import p612wk.AbstractC29080l;
import p612wk.C29077i;
import p612wk.C29078j;
import p612wk.C29079k;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;

/* loaded from: classes6.dex */
public final class SearchGlobalResultLayout extends LinearLayout implements InterfaceC18319c {
    public static final C13082b Companion = new C13082b(null);

    /* renamed from: p */
    private InterfaceC18319c f67444p;

    /* renamed from: q */
    private final InterfaceC24854k f67445q;

    /* renamed from: r */
    private final InterfaceC24854k f67446r;

    /* renamed from: s */
    private final C18338j f67447s;

    /* renamed from: t */
    private final InterfaceC24854k f67448t;

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultLayout$a */
    /* loaded from: classes6.dex */
    public static final class C13081a implements ViewPager.InterfaceC6875j {
        C13081a() {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            Object m129218b;
            int i12;
            C18316b c18316b;
            AbstractC29080l m145307g;
            SearchGlobalResultLayout searchGlobalResultLayout = SearchGlobalResultLayout.this;
            try {
                C24861r.a aVar = C24861r.f119264q;
                C29078j m97310x = searchGlobalResultLayout.f67447s.m97310x(i11);
                if (m97310x != null && (m145307g = m97310x.m145307g()) != null) {
                    i12 = m145307g.m145312a();
                } else {
                    i12 = 0;
                }
                InterfaceC18319c actionResponder = searchGlobalResultLayout.getActionResponder();
                if (actionResponder != null) {
                    c18316b = (C18316b) actionResponder.mo205i9(new C18316b("SGResultLayout:ACTION_RESULT_TAB_INDEX_CHANGED", Integer.valueOf(i11), Integer.valueOf(i12), null, 8, null));
                } else {
                    c18316b = null;
                }
                m129218b = C24861r.m129218b(c18316b);
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            Throwable m129221e = C24861r.m129221e(m129218b);
            if (m129221e != null) {
                m129221e.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultLayout$b */
    /* loaded from: classes6.dex */
    public static final class C13082b {
        private C13082b() {
        }

        public /* synthetic */ C13082b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultLayout$c */
    /* loaded from: classes6.dex */
    public static final class C13083c extends AbstractC19075u implements InterfaceC18494a {
        C13083c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29077i mo12V4() {
            Object obj;
            C29077i m101247x;
            C18316b c18316b;
            InterfaceC18319c actionResponder = SearchGlobalResultLayout.this.getActionResponder();
            C19325g1 c19325g1 = null;
            if (actionResponder != null && (c18316b = (C18316b) actionResponder.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
                obj = c18316b.m97245a();
            } else {
                obj = null;
            }
            if (obj instanceof C19325g1) {
                c19325g1 = (C19325g1) obj;
            }
            if (c19325g1 != null && (m101247x = c19325g1.m101247x()) != null) {
                return m101247x;
            }
            throw new IllegalStateException("State cannot be null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultLayout$d */
    /* loaded from: classes6.dex */
    public static final class C13084d extends AbstractC19075u implements InterfaceC18494a {
        C13084d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final SearchGlobalTabLayout mo12V4() {
            return (SearchGlobalTabLayout) SearchGlobalResultLayout.this.findViewById(AbstractC6918a0.tab_section);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultLayout$e */
    /* loaded from: classes6.dex */
    public static final class C13085e extends AbstractC19075u implements InterfaceC18494a {
        C13085e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ViewPager mo12V4() {
            return (ViewPager) SearchGlobalResultLayout.this.findViewById(AbstractC6918a0.search_view_pager);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchGlobalResultLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: c */
    private final void m73396c(AbstractC29080l abstractC29080l, Integer num, boolean z11, boolean z12) {
        Object obj;
        Object obj2;
        Integer num2;
        Object obj3;
        List m145301a;
        try {
            Iterator it = this.f67447s.m97309w().iterator();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (AbstractC19074t.m100204b(((C29078j) it.next()).m145307g(), abstractC29080l)) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (i12 == -1) {
                return;
            }
            Iterator it2 = this.f67447s.m97309w().iterator();
            while (true) {
                obj = null;
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (AbstractC19074t.m100204b(((C29078j) obj2).m145307g(), abstractC29080l)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C29078j c29078j = (C29078j) obj2;
            if (c29078j != null && (m145301a = c29078j.m145301a()) != null) {
                Iterator it3 = m145301a.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        AbstractC29069a abstractC29069a = (AbstractC29069a) it3.next();
                        if (abstractC29069a instanceof AbstractC29069a.i) {
                            int m145183b = ((AbstractC29069a.i) abstractC29069a).m145183b();
                            if (num != null && m145183b == num.intValue()) {
                                break;
                            }
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                num2 = Integer.valueOf(i11);
            } else {
                num2 = null;
            }
            if (!isAttachedToWindow()) {
                return;
            }
            if (num2 != null && num2.intValue() != -1) {
                Iterator it4 = this.f67447s.m97311y().iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj3 = it4.next();
                        if (AbstractC19074t.m100204b(((SearchGlobalResultPageLayout) obj3).getType(), abstractC29080l)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                SearchGlobalResultPageLayout searchGlobalResultPageLayout = (SearchGlobalResultPageLayout) obj3;
                if (searchGlobalResultPageLayout != null) {
                    searchGlobalResultPageLayout.m73419k(num2.intValue(), z12);
                } else {
                    Iterator it5 = this.f67447s.m97309w().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        Object next = it5.next();
                        if (AbstractC19074t.m100204b(((C29078j) next).m145307g(), abstractC29080l)) {
                            obj = next;
                            break;
                        }
                    }
                    C29078j c29078j2 = (C29078j) obj;
                    if (c29078j2 != null) {
                        c29078j2.m145308h(num2.intValue());
                        c29078j2.m145309i(z12);
                    }
                }
            }
            if (getViewPager().getCurrentItem() != i12) {
                getViewPager().setCurrentItem(i12, z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    private final void m73397d(List list) {
        Object m131205e0;
        AbstractC29080l abstractC29080l;
        C29078j c29078j;
        Object obj;
        Object obj2;
        Object obj3;
        int currentItem = getViewPager().getCurrentItem();
        C29078j m97310x = this.f67447s.m97310x(currentItem);
        if (m97310x == null || (abstractC29080l = m97310x.m145307g()) == null) {
            m131205e0 = AbstractC25332a0.m131205e0(getState().m145265C());
            abstractC29080l = (AbstractC29080l) m131205e0;
        }
        ArrayList arrayList = new ArrayList();
        List m97309w = this.f67447s.m97309w();
        for (AbstractC29080l abstractC29080l2 : getState().m145265C()) {
            Iterator it = list.iterator();
            while (true) {
                c29078j = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC19074t.m100204b(((C29078j) obj).m145307g(), abstractC29080l2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C29078j c29078j2 = (C29078j) obj;
            if (c29078j2 == null) {
                Iterator it2 = m97309w.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (AbstractC19074t.m100204b(((C29078j) obj3).m145307g(), abstractC29080l2)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                c29078j2 = (C29078j) obj3;
            }
            if (c29078j2 != null) {
                if (!AbstractC19074t.m100204b(c29078j2.m145307g(), abstractC29080l) && c29078j2.m145306f() <= 0) {
                    if ((!c29078j2.m145301a().isEmpty()) && AbstractC19074t.m100204b(c29078j2.m145305e(), AbstractC29072d.c.f134805a)) {
                        Iterator it3 = m97309w.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (AbstractC19074t.m100204b(c29078j2.m145307g(), ((C29078j) obj2).m145307g())) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        C29078j c29078j3 = (C29078j) obj2;
                        if (c29078j3 != null) {
                            c29078j2.m145310j(c29078j3.m145306f());
                            c29078j = c29078j3;
                        }
                        if (c29078j != null) {
                        }
                    }
                }
                arrayList.add(c29078j2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (Object obj4 : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            C29078j c29078j4 = (C29078j) obj4;
            if (AbstractC19074t.m100204b(c29078j4.m145307g(), abstractC29080l)) {
                c29078j4.m145308h(-1);
                currentItem = i11;
            } else {
                c29078j4.m145308h(0);
            }
            arrayList2.add(new SearchGlobalTabLayout.C13097a(c29078j4.m145307g().m145312a(), c29078j4.m145306f()));
            i11 = i12;
        }
        this.f67447s.m97307E(arrayList);
        if (currentItem != getViewPager().getCurrentItem()) {
            getViewPager().setCurrentItem(currentItem, false);
        }
        getTabLayout().m73437f(arrayList2, currentItem);
    }

    private final C29077i getState() {
        return (C29077i) this.f67448t.getValue();
    }

    private final SearchGlobalTabLayout getTabLayout() {
        Object value = this.f67445q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (SearchGlobalTabLayout) value;
    }

    private final ViewPager getViewPager() {
        Object value = this.f67446r.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ViewPager) value;
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: b */
    public C18316b mo205i9(C18316b c18316b) {
        int i11;
        Object m129218b;
        Object obj;
        Integer num;
        Integer num2;
        Integer num3;
        AbstractC19074t.m100208f(c18316b, "action");
        String m97246b = c18316b.m97246b();
        int i12 = 0;
        Object obj2 = null;
        switch (m97246b.hashCode()) {
            case -1976584376:
                if (m97246b.equals("ACTION_GET_PAGE_DATA")) {
                    if (c18316b.m97245a() instanceof Integer) {
                        Number number = (Number) c18316b.m97245a();
                        if (number.intValue() < this.f67447s.m97309w().size()) {
                            C29078j c29078j = (C29078j) this.f67447s.m97309w().get(number.intValue());
                            if (AbstractC19074t.m100204b(c29078j.m145307g(), AbstractC29080l.g.f134887b)) {
                                obj2 = getState().m145291s().mo145251y0();
                            }
                            return new C18316b(c18316b.m97246b(), c29078j, obj2, null, 8, null);
                        }
                        return new C18316b(c18316b.m97246b(), null, null, null, 12, null);
                    }
                    return new C18316b(c18316b.m97246b(), null, null, null, 12, null);
                }
                break;
            case -1699500379:
                if (m97246b.equals("SGResultLayout:ACTION_PERFORM_CLICK_ON_FIRST_RESULT_ITEM")) {
                    return null;
                }
                break;
            case -1167406192:
                if (m97246b.equals("Search.Result.ClickItem")) {
                    if ((c18316b.m97245a() instanceof AbstractC29069a.q) && (c18316b.m97247c() instanceof Integer)) {
                        try {
                            AbstractC29069a.b bVar = AbstractC29069a.Companion;
                            if (bVar.m145171a(((AbstractC29069a.q) c18316b.m97245a()).m145215c(), 262144)) {
                                i11 = AbstractC8020f0.str_search_global_tab_message;
                            } else if (bVar.m145171a(((AbstractC29069a.q) c18316b.m97245a()).m145215c(), 524288)) {
                                i11 = AbstractC8020f0.str_search_global_tab_file;
                            } else if (bVar.m145171a(((AbstractC29069a.q) c18316b.m97245a()).m145215c(), ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE)) {
                                i11 = AbstractC8020f0.str_search_global_tab_link;
                            } else {
                                i11 = 0;
                            }
                            Iterator it = this.f67447s.m97309w().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((C29078j) it.next()).m145307g().m145312a() != i11) {
                                        i12++;
                                    }
                                } else {
                                    i12 = -1;
                                }
                            }
                            if (i12 == -1 || getViewPager().getCurrentItem() == i12) {
                                return null;
                            }
                            getViewPager().setCurrentItem(i12);
                            return null;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return null;
                        }
                    }
                    InterfaceC18319c interfaceC18319c = this.f67444p;
                    if (interfaceC18319c == null) {
                        return null;
                    }
                    return (C18316b) interfaceC18319c.mo205i9(c18316b);
                }
                break;
            case 565459737:
                if (m97246b.equals("ACTION_RESULT_SET_CURRENT_TAB")) {
                    if (!(c18316b.m97245a() instanceof AbstractC29080l) || !(c18316b.m97247c() instanceof Boolean)) {
                        return null;
                    }
                    try {
                        Iterator it2 = this.f67447s.m97309w().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!AbstractC19074t.m100204b(((C29078j) it2.next()).m145307g(), c18316b.m97245a())) {
                                    i12++;
                                }
                            } else {
                                i12 = -1;
                            }
                        }
                        if (i12 == -1 || getViewPager().getCurrentItem() == i12) {
                            return null;
                        }
                        getViewPager().setCurrentItem(i12, ((Boolean) c18316b.m97247c()).booleanValue());
                        return null;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        return null;
                    }
                }
                break;
            case 1067115615:
                if (m97246b.equals("ACTION_RESULT_RESET_TAB_INDEX")) {
                    getViewPager().setCurrentItem(0, false);
                    return null;
                }
                break;
            case 1143257215:
                if (m97246b.equals("ACTION_GET_FILTER_DATA")) {
                    if (!(c18316b.m97245a() instanceof C29078j) || !AbstractC19074t.m100204b(((C29078j) c18316b.m97245a()).m145307g(), AbstractC29080l.g.f134887b)) {
                        return null;
                    }
                    return new C18316b(c18316b.m97246b(), getState().m145291s().mo145251y0(), null, null, 12, null);
                }
                break;
            case 1367971956:
                if (m97246b.equals("SGResultLayout:ACTION_GET_FOCUSED_ADAPTER")) {
                    if (!(c18316b.m97245a() instanceof Integer)) {
                        return null;
                    }
                    C18338j c18338j = this.f67447s;
                    try {
                        C24861r.a aVar = C24861r.f119264q;
                        Iterator it3 = c18338j.m97311y().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj = it3.next();
                                AbstractC29080l type = ((SearchGlobalResultPageLayout) obj).getType();
                                if (type != null) {
                                    num = Integer.valueOf(type.m145312a());
                                } else {
                                    num = null;
                                }
                                if (AbstractC19074t.m100204b(num, c18316b.m97245a())) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        m129218b = C24861r.m129218b((SearchGlobalResultPageLayout) obj);
                    } catch (Throwable th2) {
                        C24861r.a aVar2 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                    }
                    if (C24861r.m129223g(m129218b)) {
                        m129218b = null;
                    }
                    SearchGlobalResultPageLayout searchGlobalResultPageLayout = (SearchGlobalResultPageLayout) m129218b;
                    if (searchGlobalResultPageLayout != null) {
                        obj2 = searchGlobalResultPageLayout.getAdapter();
                    }
                    return new C18316b(c18316b.m97246b(), obj2, null, null, 12, null);
                }
                break;
            case 1523681309:
                if (m97246b.equals("ACTION_RESULT_JUMP_TO_TARGET")) {
                    if ((c18316b.m97245a() instanceof AbstractC29069a.s.o) && (c18316b.m97247c() instanceof Boolean) && (c18316b.m97248d() instanceof Boolean)) {
                        AbstractC29080l m145217c = ((AbstractC29069a.s.o) c18316b.m97245a()).m145217c();
                        AbstractC29069a.s m145216b = ((AbstractC29069a.s.o) c18316b.m97245a()).m145216b();
                        if (m145216b != null) {
                            num3 = C19342m0.Companion.m101359e(m145216b);
                        } else {
                            num3 = null;
                        }
                        m73396c(m145217c, num3, ((Boolean) c18316b.m97247c()).booleanValue(), ((Boolean) c18316b.m97248d()).booleanValue());
                        return null;
                    }
                    if (!(c18316b.m97245a() instanceof AbstractC29069a.s.q)) {
                        return null;
                    }
                    AbstractC29080l m145217c2 = ((AbstractC29069a.s.q) c18316b.m97245a()).m145217c();
                    AbstractC29069a.s m145216b2 = ((AbstractC29069a.s.q) c18316b.m97245a()).m145216b();
                    if (m145216b2 != null) {
                        num2 = C19342m0.Companion.m101359e(m145216b2);
                    } else {
                        num2 = null;
                    }
                    m73396c(m145217c2, num2, ((AbstractC29069a.s.q) c18316b.m97245a()).m145221e(), ((AbstractC29069a.s.q) c18316b.m97245a()).m145220d());
                    return null;
                }
                break;
            case 1887550944:
                if (m97246b.equals("ACTION_SUBMIT_LIST_RESULT")) {
                    if (!(c18316b.m97245a() instanceof C29079k)) {
                        return null;
                    }
                    m73397d(((C29079k) c18316b.m97245a()).m145311a());
                    return null;
                }
                break;
        }
        InterfaceC18319c interfaceC18319c2 = this.f67444p;
        if (interfaceC18319c2 == null) {
            return null;
        }
        return (C18316b) interfaceC18319c2.mo205i9(c18316b);
    }

    /* renamed from: e */
    public final void m73399e() {
        C18333g1.f92667a.m97286D(this.f67447s);
    }

    /* renamed from: f */
    public final void m73400f(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C18333g1.f92667a.m97290I(this.f67447s, str);
    }

    public final InterfaceC18319c getActionResponder() {
        return this.f67444p;
    }

    public final void setActionResponder(InterfaceC18319c interfaceC18319c) {
        this.f67444p = interfaceC18319c;
    }

    public /* synthetic */ SearchGlobalResultLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchGlobalResultLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C13084d());
        this.f67445q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13085e());
        this.f67446r = m129210a2;
        C18338j c18338j = new C18338j();
        this.f67447s = c18338j;
        setOrientation(1);
        View.inflate(context, AbstractC7409c0.search_global_result, this);
        c18338j.m97306D(this);
        getViewPager().setPageMarginDrawable(AbstractC23136l9.m118665N(getViewPager().getContext(), AbstractC16803z.slide_viewpager_seperate_line));
        getViewPager().setPageMargin(getResources().getDimensionPixelSize(AbstractC16802y.page_margin_width));
        ViewPager viewPager = getViewPager();
        SmoothScrollerViewPager smoothScrollerViewPager = viewPager instanceof SmoothScrollerViewPager ? (SmoothScrollerViewPager) viewPager : null;
        if (smoothScrollerViewPager != null) {
            smoothScrollerViewPager.setScrollDuration(275);
            smoothScrollerViewPager.setSwipeGestureEnabled(true);
            smoothScrollerViewPager.setDirection(0);
        }
        c18338j.m97308F(getViewPager());
        getTabLayout().setViewPager(getViewPager());
        getViewPager().addOnPageChangeListener(new C13081a());
        m129210a3 = AbstractC24856m.m129210a(new C13083c());
        this.f67448t = m129210a3;
    }
}
