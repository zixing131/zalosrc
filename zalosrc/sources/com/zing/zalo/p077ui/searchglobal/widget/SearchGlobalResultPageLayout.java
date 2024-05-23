package com.zing.zalo.p077ui.searchglobal.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1579n0;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalResultPageLayout;
import com.zing.zalo.p077ui.widget.AbstractC13642h0;
import com.zing.zalo.p077ui.widget.C13818y1;
import com.zing.zalo.uidrawing.C16719g;
import ea0.C18316b;
import ea0.C18328f;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.C19318e0;
import ga0.C19322f1;
import i40.AbstractAnimationAnimationListenerC20277g;
import ja0.C21185t;
import java.util.ArrayList;
import l00.AbstractC21994b;
import me0.AbstractC23136l9;
import p227i3.C20218v;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29080l;
import p612wk.C29070b;
import p612wk.C29078j;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import q80.C25162a;

/* loaded from: classes6.dex */
public final class SearchGlobalResultPageLayout extends FrameLayout implements InterfaceC18319c {

    /* renamed from: A */
    private boolean f67453A;

    /* renamed from: B */
    private final ViewOnTouchListenerC13091f f67454B;

    /* renamed from: C */
    private final InterfaceC24854k f67455C;

    /* renamed from: D */
    private boolean f67456D;

    /* renamed from: E */
    private final C13092g f67457E;

    /* renamed from: F */
    private final C13090e f67458F;

    /* renamed from: G */
    private final InterfaceC24854k f67459G;

    /* renamed from: p */
    private final RecyclerView f67460p;

    /* renamed from: q */
    private final C21185t f67461q;

    /* renamed from: r */
    private final AbstractC21994b f67462r;

    /* renamed from: s */
    private final C18328f f67463s;

    /* renamed from: t */
    private AbstractC29080l f67464t;

    /* renamed from: u */
    private Integer f67465u;

    /* renamed from: v */
    private int f67466v;

    /* renamed from: w */
    private InterfaceC18319c f67467w;

    /* renamed from: x */
    private final InterfaceC24854k f67468x;

    /* renamed from: y */
    private final InterfaceC24854k f67469y;

    /* renamed from: z */
    private Animation f67470z;

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultPageLayout$a */
    /* loaded from: classes6.dex */
    public static final class C13086a extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        private boolean f67471a;

        C13086a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            SearchGlobalResultPageLayout.this.getAdapter().m97257S(i11);
            if (i11 != 0) {
                if (i11 == 1 && !this.f67471a) {
                    SearchGlobalResultPageLayout.this.m73414l();
                    this.f67471a = true ^ this.f67471a;
                    return;
                }
                return;
            }
            this.f67471a = false;
            SearchGlobalResultPageLayout.this.m73412i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            LinearLayoutManager linearLayoutManager;
            Object m129218b;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                SearchGlobalResultPageLayout searchGlobalResultPageLayout = SearchGlobalResultPageLayout.this;
                try {
                    C24861r.a aVar = C24861r.f119264q;
                    int m9740Y1 = linearLayoutManager.m9740Y1();
                    int m9745c2 = linearLayoutManager.m9745c2();
                    int m10110a = linearLayoutManager.m10110a();
                    int m10127i = linearLayoutManager.m10127i();
                    int i13 = m9740Y1 + m10110a;
                    AbstractC29080l type = searchGlobalResultPageLayout.getType();
                    boolean z11 = false;
                    if (type != null && C19318e0.Companion.m101097f(type) && i13 >= Math.max(0, m10127i - 25)) {
                        C29070b c29070b = new C29070b(m9740Y1, m9745c2, m10110a, m10127i, i13);
                        InterfaceC18319c actionResponder = searchGlobalResultPageLayout.getActionResponder();
                        if (actionResponder != null) {
                        }
                    }
                    if (linearLayoutManager.m9737T1() <= 1) {
                        z11 = true;
                    }
                    searchGlobalResultPageLayout.m73411h(z11);
                    m129218b = C24861r.m129218b(C24848g0.f119245a);
                } catch (Throwable th2) {
                    C24861r.a aVar2 = C24861r.f119264q;
                    m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                }
                Throwable m129221e = C24861r.m129221e(m129218b);
                if (m129221e != null) {
                    m129221e.printStackTrace();
                }
                C24861r.m129217a(m129218b);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultPageLayout$b */
    /* loaded from: classes6.dex */
    static final class C13087b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f67473q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13087b(Context context) {
            super(0);
            this.f67473q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(this.f67473q, 36.0f));
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultPageLayout$c */
    /* loaded from: classes6.dex */
    static final class C13088c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13088c f67474q = new C13088c();

        C13088c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC29069a.f mo12V4() {
            return new AbstractC29069a.f(null, 15);
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultPageLayout$d */
    /* loaded from: classes6.dex */
    public static final class C13089d extends C1923p {
        C13089d(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: B */
        protected int mo10618B() {
            return -1;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultPageLayout$e */
    /* loaded from: classes6.dex */
    public static final class C13090e extends AbstractAnimationAnimationListenerC20277g {
        C13090e() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SearchGlobalResultPageLayout.this.getFilterPanel().f7784p.setVisibility(8);
            SearchGlobalResultPageLayout.this.f67470z = null;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultPageLayout$f */
    /* loaded from: classes6.dex */
    public static final class ViewOnTouchListenerC13091f implements View.OnTouchListener {

        /* renamed from: p */
        private float f67476p;

        /* renamed from: q */
        private float f67477q;

        /* renamed from: r */
        private boolean f67478r;

        /* renamed from: s */
        private boolean f67479s;

        ViewOnTouchListenerC13091f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean m114868x;
            int action;
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            AbstractC19074t.m100208f(motionEvent, "event");
            SearchGlobalResultPageLayout searchGlobalResultPageLayout = SearchGlobalResultPageLayout.this;
            try {
                C24861r.a aVar = C24861r.f119264q;
                m114868x = searchGlobalResultPageLayout.getFastScroller().m114868x();
                action = motionEvent.getAction();
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (action != 0 && action != 1) {
                if (action != 2) {
                    if (action != 3) {
                    }
                } else if (searchGlobalResultPageLayout.getAdapter().mo10003k() != 0) {
                    float y11 = motionEvent.getY();
                    if (this.f67477q == 0.0f) {
                        this.f67477q = y11;
                    }
                    if (this.f67476p == 0.0f) {
                        this.f67476p = y11;
                    }
                    if (!this.f67478r && !this.f67479s) {
                        float f11 = this.f67477q;
                        if (y11 > f11) {
                            this.f67479s = false;
                            this.f67478r = true;
                        } else if (y11 < f11) {
                            this.f67479s = true;
                            this.f67478r = false;
                        }
                    }
                    float f12 = this.f67477q;
                    if (y11 > f12) {
                        if (this.f67479s && this.f67478r) {
                            this.f67476p = y11;
                            this.f67479s = false;
                            this.f67478r = true;
                        }
                    } else if (y11 < f12 && this.f67478r && !this.f67479s) {
                        this.f67476p = y11;
                        this.f67479s = true;
                        this.f67478r = true;
                    }
                    double d11 = y11 - this.f67476p;
                    if (d11 > 3.0d) {
                        searchGlobalResultPageLayout.m73418u(!m114868x);
                        this.f67476p = y11;
                        this.f67479s = false;
                        this.f67478r = false;
                    } else if (d11 < -3.0d) {
                        if (!searchGlobalResultPageLayout.getDisableHideSubTab()) {
                            searchGlobalResultPageLayout.m73418u(m114868x);
                        }
                        this.f67476p = y11;
                        this.f67479s = false;
                        this.f67478r = false;
                    }
                    this.f67477q = y11;
                }
                C24861r.m129218b(C24848g0.f119245a);
                return false;
            }
            this.f67476p = 0.0f;
            this.f67477q = 0.0f;
            this.f67478r = false;
            this.f67479s = false;
            C24861r.m129218b(C24848g0.f119245a);
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultPageLayout$g */
    /* loaded from: classes6.dex */
    public static final class C13092g extends AbstractAnimationAnimationListenerC20277g {
        C13092g() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SearchGlobalResultPageLayout.this.f67470z = null;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultPageLayout$h */
    /* loaded from: classes6.dex */
    static final class C13093h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f67482q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13093h(Context context) {
            super(0);
            this.f67482q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Animation mo12V4() {
            return AnimationUtils.loadAnimation(this.f67482q, AbstractC10919t.slide_in_subtab_from_top);
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultPageLayout$i */
    /* loaded from: classes6.dex */
    static final class C13094i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f67483q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13094i(Context context) {
            super(0);
            this.f67483q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Animation mo12V4() {
            return AnimationUtils.loadAnimation(this.f67483q, AbstractC10919t.slide_out_subtab_to_top);
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalResultPageLayout$j */
    /* loaded from: classes6.dex */
    public static final class ViewOnAttachStateChangeListenerC13095j implements View.OnAttachStateChangeListener {

        /* renamed from: p */
        final /* synthetic */ View f67484p;

        /* renamed from: q */
        final /* synthetic */ SearchGlobalResultPageLayout f67485q;

        public ViewOnAttachStateChangeListenerC13095j(View view, SearchGlobalResultPageLayout searchGlobalResultPageLayout) {
            this.f67484p = view;
            this.f67485q = searchGlobalResultPageLayout;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC19074t.m100208f(view, "view");
            this.f67484p.removeOnAttachStateChangeListener(this);
            SearchGlobalResultPageLayout.m73416r(this.f67485q, false, 1, null);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC19074t.m100208f(view, "view");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchGlobalResultPageLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    private final int getDpX36() {
        return ((Number) this.f67455C.getValue()).intValue();
    }

    private final AbstractC29069a.f getEmptyFilter() {
        return (AbstractC29069a.f) this.f67459G.getValue();
    }

    private final Animation getSlideInAnim() {
        return (Animation) this.f67468x.getValue();
    }

    private final Animation getSlideOutAnim() {
        return (Animation) this.f67469y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m73411h(boolean z11) {
        int i11;
        this.f67453A = z11;
        if (this.f67456D) {
            C16719g m130302o1 = ((C25162a) this.f67461q.m106522i0()).m130302o1();
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            m130302o1.mo44614b1(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m73412i() {
        try {
            C24861r.a aVar = C24861r.f119264q;
            if (this.f67453A) {
                m73418u(true);
            }
            C24861r.m129218b(Boolean.valueOf(postDelayed(new Runnable() { // from class: ka0.b
                @Override // java.lang.Runnable
                public final void run() {
                    SearchGlobalResultPageLayout.m73413j(SearchGlobalResultPageLayout.this);
                }
            }, 500L)));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m73413j(SearchGlobalResultPageLayout searchGlobalResultPageLayout) {
        AbstractC19074t.m100208f(searchGlobalResultPageLayout, "$this_runCatching");
        if (searchGlobalResultPageLayout.isAttachedToWindow() && searchGlobalResultPageLayout.f67453A) {
            searchGlobalResultPageLayout.m73418u(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m73414l() {
        InterfaceC18319c interfaceC18319c = this.f67467w;
        if (interfaceC18319c != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m73415p(SearchGlobalResultPageLayout searchGlobalResultPageLayout, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(searchGlobalResultPageLayout, "this$0");
        searchGlobalResultPageLayout.f67462r.m114859H(i14 - i12, 0.0f);
    }

    /* renamed from: r */
    public static /* synthetic */ void m73416r(SearchGlobalResultPageLayout searchGlobalResultPageLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        searchGlobalResultPageLayout.m73422q(z11);
    }

    /* renamed from: s */
    private final void m73417s() {
        C18316b c18316b;
        Object obj;
        C29078j c29078j;
        Object obj2;
        boolean z11;
        InterfaceC18319c interfaceC18319c = this.f67467w;
        AbstractC29069a.f fVar = null;
        if (interfaceC18319c != null) {
            c18316b = (C18316b) interfaceC18319c.mo205i9(new C18316b("ACTION_GET_PAGE_DATA", Integer.valueOf(this.f67466v), null, null, 12, null));
        } else {
            c18316b = null;
        }
        if (c18316b != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C29078j) {
            c29078j = (C29078j) obj;
        } else {
            c29078j = null;
        }
        if (!m73421n(c29078j)) {
            return;
        }
        if (c18316b != null) {
            obj2 = c18316b.m97247c();
        } else {
            obj2 = null;
        }
        if (obj2 instanceof AbstractC29069a.f) {
            fVar = (AbstractC29069a.f) obj2;
        }
        if (c29078j != null) {
            this.f67464t = c29078j.m145307g();
            this.f67465u = Integer.valueOf(c29078j.m145302b());
            if (AbstractC19074t.m100204b(this.f67464t, AbstractC29080l.g.f134887b) && C19322f1.f95950a.m101158o()) {
                z11 = true;
            } else {
                z11 = false;
            }
            setFilterPanelEnabled(z11);
            if (this.f67456D) {
                C21185t c21185t = this.f67461q;
                if (fVar == null) {
                    fVar = getEmptyFilter();
                }
                c21185t.m109741l0(fVar);
            }
            this.f67463s.m97256Q(c29078j.m145301a(), this.f67464t);
            if (c29078j.m145303c() >= 0) {
                m73419k(c29078j.m145303c(), c29078j.m145304d());
                c29078j.m145309i(false);
                c29078j.m145308h(0);
                return;
            }
            return;
        }
        if (this.f67463s.mo10003k() != 0) {
            setFilterPanelEnabled(false);
            this.f67463s.m97256Q(new ArrayList(), this.f67464t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final synchronized void m73418u(boolean z11) {
        if (!this.f67456D) {
            return;
        }
        View view = this.f67461q.f7784p;
        try {
            C24861r.a aVar = C24861r.f119264q;
            if (z11) {
                if (view.getVisibility() == 0) {
                    return;
                }
                if (this.f67470z != null) {
                    return;
                }
                view.setVisibility(0);
                getSlideInAnim().setAnimationListener(this.f67457E);
                this.f67470z = getSlideInAnim();
                view.startAnimation(getSlideInAnim());
            } else {
                if (view.getVisibility() == 8) {
                    return;
                }
                if (this.f67470z != null) {
                    return;
                }
                getSlideOutAnim().setAnimationListener(this.f67458F);
                this.f67470z = getSlideOutAnim();
                view.startAnimation(getSlideOutAnim());
            }
            C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    public final InterfaceC18319c getActionResponder() {
        return this.f67467w;
    }

    public final C18328f getAdapter() {
        return this.f67463s;
    }

    public final boolean getDisableHideSubTab() {
        return this.f67453A;
    }

    public final AbstractC21994b getFastScroller() {
        return this.f67462r;
    }

    public final C21185t getFilterPanel() {
        return this.f67461q;
    }

    public final boolean getFilterPanelEnabled() {
        return this.f67456D;
    }

    public final C29078j getPageData() {
        Object obj;
        C18316b c18316b;
        InterfaceC18319c interfaceC18319c = this.f67467w;
        if (interfaceC18319c != null && (c18316b = (C18316b) interfaceC18319c.mo205i9(new C18316b("ACTION_GET_PAGE_DATA", Integer.valueOf(this.f67466v), null, null, 12, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (!(obj instanceof C29078j)) {
            return null;
        }
        return (C29078j) obj;
    }

    public final Integer getPageDataId() {
        return this.f67465u;
    }

    public final int getPagePosition() {
        return this.f67466v;
    }

    public final RecyclerView getRecyclerView() {
        return this.f67460p;
    }

    public final RecyclerView.C1893t getRecyclerViewViewPool() {
        return this.f67460p.getRecycledViewPool();
    }

    public final AbstractC29080l getType() {
        return this.f67464t;
    }

    /* renamed from: k */
    public final void m73419k(int i11, boolean z11) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = this.f67460p;
        try {
            C24861r.a aVar = C24861r.f119264q;
            C24848g0 c24848g0 = null;
            if (z11) {
                RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    C13089d c13089d = new C13089d(recyclerView.getContext());
                    c13089d.m10244p(i11);
                    layoutManager.m10090H1(c13089d);
                    c24848g0 = C24848g0.f119245a;
                }
            } else {
                recyclerView.m9866X1();
                RecyclerView.AbstractC1888o layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager2;
                } else {
                    linearLayoutManager = null;
                }
                if (linearLayoutManager != null) {
                    linearLayoutManager.m9721B2(i11, 0);
                    c24848g0 = C24848g0.f119245a;
                }
            }
            C24861r.m129218b(c24848g0);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        if (AbstractC19074t.m100204b(c18316b.m97246b(), "Search.Result.ClickItem") && (c18316b.m97245a() instanceof AbstractC29069a.f)) {
            InterfaceC18319c interfaceC18319c = this.f67467w;
            if (interfaceC18319c == null) {
                return null;
            }
            return (C18316b) interfaceC18319c.mo205i9(new C18316b(c18316b.m97246b(), c18316b.m97245a(), this.f67464t, null, 8, null));
        }
        InterfaceC18319c interfaceC18319c2 = this.f67467w;
        if (interfaceC18319c2 == null) {
            return null;
        }
        return (C18316b) interfaceC18319c2.mo205i9(c18316b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:            if (r0 != r1.intValue()) goto L11;     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m73421n(C29078j c29078j) {
        if (c29078j != null) {
            int m145302b = c29078j.m145302b();
            Integer num = this.f67465u;
            if (num != null) {
            }
            return true;
        }
        if (c29078j == null && this.f67465u != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final void m73422q(boolean z11) {
        m73417s();
    }

    public final void setActionResponder(InterfaceC18319c interfaceC18319c) {
        this.f67467w = interfaceC18319c;
    }

    public final void setDisableHideSubTab(boolean z11) {
        this.f67453A = z11;
    }

    public final void setFilterPanelEnabled(boolean z11) {
        if (z11 != this.f67456D) {
            this.f67456D = z11;
            View view = this.f67461q.f7784p;
            int i11 = 0;
            if (z11 && view.getVisibility() != 0) {
                view.setVisibility(0);
            } else if (!z11 && view.getVisibility() != 8) {
                view.setVisibility(8);
            }
            if (z11) {
                i11 = getDpX36();
            }
            if (this.f67460p.getPaddingTop() != i11) {
                RecyclerView recyclerView = this.f67460p;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i11, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
            }
        }
    }

    public final void setPageDataId(Integer num) {
        this.f67465u = num;
    }

    public final void setPagePosition(int i11) {
        this.f67466v = i11;
    }

    public final void setRecyclerViewViewPool(RecyclerView.C1893t c1893t) {
        this.f67460p.setRecycledViewPool(c1893t);
    }

    public final void setType(AbstractC29080l abstractC29080l) {
        this.f67464t = abstractC29080l;
    }

    public /* synthetic */ SearchGlobalResultPageLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchGlobalResultPageLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(context, "context");
        C13818y1 c13818y1 = new C13818y1(context, null, null, null, null, 0, 0, 0, 254, null);
        this.f67462r = c13818y1;
        C18328f c18328f = new C18328f();
        this.f67463s = c18328f;
        m129210a = AbstractC24856m.m129210a(new C13093h(context));
        this.f67468x = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13094i(context));
        this.f67469y = m129210a2;
        ViewOnTouchListenerC13091f viewOnTouchListenerC13091f = new ViewOnTouchListenerC13091f();
        this.f67454B = viewOnTouchListenerC13091f;
        c18328f.m97255P(this);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setClipToPadding(false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setOverScrollMode(Build.VERSION.SDK_INT > 30 ? 0 : 2);
        recyclerView.setAdapter(c18328f);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        recyclerView.m9826E(new C13086a());
        recyclerView.setItemAnimator(null);
        AbstractC13642h0.m76248b(recyclerView, c13818y1);
        recyclerView.setOnTouchListener(viewOnTouchListenerC13091f);
        this.f67460p = recyclerView;
        C21185t c21185t = new C21185t(this, this);
        c21185t.f7784p.setVisibility(8);
        addView(c21185t.f7784p);
        c21185t.f7784p.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ka0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                SearchGlobalResultPageLayout.m73415p(SearchGlobalResultPageLayout.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
        this.f67461q = c21185t;
        if (AbstractC1579n0.m7862d0(this)) {
            m73416r(this, false, 1, null);
        } else {
            addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13095j(this, this));
        }
        m129210a3 = AbstractC24856m.m129210a(new C13087b(context));
        this.f67455C = m129210a3;
        this.f67457E = new C13092g();
        this.f67458F = new C13090e();
        m129210a4 = AbstractC24856m.m129210a(C13088c.f67474q);
        this.f67459G = m129210a4;
    }
}
