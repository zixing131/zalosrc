package com.zing.zalo.p077ui.searchglobal.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalTrackingLogPanelLayout;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import ea0.C18316b;
import ea0.C18328f;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me0.AbstractC23136l9;
import p612wk.AbstractC29069a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;

/* loaded from: classes6.dex */
public final class SearchGlobalTrackingLogPanelLayout extends FrameLayout implements InterfaceC18319c {
    public static final C13102a Companion = new C13102a(null);

    /* renamed from: t */
    private static final int f67515t = View.generateViewId();

    /* renamed from: u */
    private static final int f67516u = View.generateViewId();

    /* renamed from: v */
    private static final int f67517v = View.generateViewId();

    /* renamed from: w */
    private static Window f67518w;

    /* renamed from: p */
    private final HorizontalScrollView f67519p;

    /* renamed from: q */
    private final C18328f f67520q;

    /* renamed from: r */
    private int f67521r;

    /* renamed from: s */
    private final List f67522s;

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalTrackingLogPanelLayout$a */
    /* loaded from: classes6.dex */
    public static final class C13102a {
        private C13102a() {
        }

        public /* synthetic */ C13102a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final SearchGlobalTrackingLogPanelLayout m73462a(Window window) {
            ViewGroup viewGroup;
            View view;
            SearchGlobalTrackingLogPanelLayout searchGlobalTrackingLogPanelLayout;
            View decorView = window.getDecorView();
            ViewGroup viewGroup2 = null;
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup) decorView;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                view = viewGroup.findViewById(SearchGlobalTrackingLogPanelLayout.f67515t);
            } else {
                view = null;
            }
            if (view instanceof SearchGlobalTrackingLogPanelLayout) {
                searchGlobalTrackingLogPanelLayout = (SearchGlobalTrackingLogPanelLayout) view;
            } else {
                searchGlobalTrackingLogPanelLayout = null;
            }
            if (searchGlobalTrackingLogPanelLayout == null) {
                Context context = window.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                searchGlobalTrackingLogPanelLayout = new SearchGlobalTrackingLogPanelLayout(context, null, 0, 6, null);
                View decorView2 = window.getDecorView();
                if (decorView2 instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) decorView2;
                }
                if (viewGroup2 != null) {
                    viewGroup2.addView(searchGlobalTrackingLogPanelLayout);
                }
            }
            return searchGlobalTrackingLogPanelLayout;
        }

        /* renamed from: b */
        private final void m73463b(Window window, AbstractC29069a abstractC29069a) {
            m73462a(window).m73459j(abstractC29069a);
        }

        /* renamed from: c */
        public final void m73464c(AbstractC29069a abstractC29069a) {
            AbstractC19074t.m100208f(abstractC29069a, "item");
            Window window = SearchGlobalTrackingLogPanelLayout.f67518w;
            if (window != null) {
                SearchGlobalTrackingLogPanelLayout.Companion.m73463b(window, abstractC29069a);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalTrackingLogPanelLayout$b */
    /* loaded from: classes6.dex */
    public static final class ViewOnAttachStateChangeListenerC13103b implements View.OnAttachStateChangeListener {

        /* renamed from: p */
        final /* synthetic */ View f67523p;

        /* renamed from: q */
        final /* synthetic */ SearchGlobalTrackingLogPanelLayout f67524q;

        /* renamed from: r */
        final /* synthetic */ AspectRatioImageView f67525r;

        /* renamed from: s */
        final /* synthetic */ int f67526s;

        /* renamed from: t */
        final /* synthetic */ RecyclerView f67527t;

        /* renamed from: u */
        final /* synthetic */ int f67528u;

        public ViewOnAttachStateChangeListenerC13103b(View view, SearchGlobalTrackingLogPanelLayout searchGlobalTrackingLogPanelLayout, AspectRatioImageView aspectRatioImageView, int i11, RecyclerView recyclerView, int i12) {
            this.f67523p = view;
            this.f67524q = searchGlobalTrackingLogPanelLayout;
            this.f67525r = aspectRatioImageView;
            this.f67526s = i11;
            this.f67527t = recyclerView;
            this.f67528u = i12;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C1421e m8054f;
            Object m129218b;
            AbstractC19074t.m100208f(view, "view");
            this.f67523p.removeOnAttachStateChangeListener(this);
            C1580n1 m7824M = AbstractC1579n0.m7824M(this.f67524q.getRootView());
            if (m7824M != null && (m8054f = m7824M.m8054f(C1580n1.m.m8118f())) != null) {
                try {
                    C24861r.a aVar = C24861r.f119264q;
                    ViewGroup.LayoutParams layoutParams = this.f67525r.getLayoutParams();
                    AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    int i11 = m8054f.f6232c;
                    int i12 = this.f67526s;
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, i11 + i12, m8054f.f6233d + i12);
                    this.f67525r.requestLayout();
                    this.f67527t.setPadding(m8054f.f6230a, m8054f.f6231b, m8054f.f6232c, m8054f.f6233d + this.f67526s + this.f67528u);
                    m129218b = C24861r.m129218b(C24848g0.f119245a);
                } catch (Throwable th2) {
                    C24861r.a aVar2 = C24861r.f119264q;
                    m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                }
                C24861r.m129217a(m129218b);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC19074t.m100208f(view, "view");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchGlobalTrackingLogPanelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m73451e(SearchGlobalTrackingLogPanelLayout searchGlobalTrackingLogPanelLayout, View view) {
        AbstractC19074t.m100208f(searchGlobalTrackingLogPanelLayout, "this$0");
        searchGlobalTrackingLogPanelLayout.m73458i();
    }

    /* renamed from: h */
    private final void m73454h() {
        ViewGroup viewGroup;
        if (isAttachedToWindow()) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m73455k(SearchGlobalTrackingLogPanelLayout searchGlobalTrackingLogPanelLayout, AbstractC29069a abstractC29069a) {
        AbstractC19074t.m100208f(searchGlobalTrackingLogPanelLayout, "this$0");
        AbstractC19074t.m100208f(abstractC29069a, "$item");
        searchGlobalTrackingLogPanelLayout.f67522s.add(abstractC29069a);
        C18328f c18328f = searchGlobalTrackingLogPanelLayout.f67520q;
        List list = searchGlobalTrackingLogPanelLayout.f67522s;
        AbstractC19074t.m100207e(list, "data");
        C18328f.m97253R(c18328f, list, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m73456m(SearchGlobalTrackingLogPanelLayout searchGlobalTrackingLogPanelLayout, View view) {
        AbstractC19074t.m100208f(searchGlobalTrackingLogPanelLayout, "this$0");
        if (searchGlobalTrackingLogPanelLayout.f67521r % 2 == 0) {
            searchGlobalTrackingLogPanelLayout.m73461p();
        } else {
            searchGlobalTrackingLogPanelLayout.m73458i();
        }
        searchGlobalTrackingLogPanelLayout.f67521r++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final boolean m73457n(SearchGlobalTrackingLogPanelLayout searchGlobalTrackingLogPanelLayout, View view) {
        AbstractC19074t.m100208f(searchGlobalTrackingLogPanelLayout, "this$0");
        searchGlobalTrackingLogPanelLayout.m73454h();
        return true;
    }

    /* renamed from: i */
    public final void m73458i() {
        this.f67519p.setVisibility(8);
    }

    /* renamed from: j */
    public final void m73459j(final AbstractC29069a abstractC29069a) {
        AbstractC19074t.m100208f(abstractC29069a, "item");
        if (AbstractC19444a.m101693a()) {
            this.f67522s.add(abstractC29069a);
            C18328f c18328f = this.f67520q;
            List list = this.f67522s;
            AbstractC19074t.m100207e(list, "data");
            C18328f.m97253R(c18328f, list, null, 2, null);
            return;
        }
        post(new Runnable() { // from class: ka0.i
            @Override // java.lang.Runnable
            public final void run() {
                SearchGlobalTrackingLogPanelLayout.m73455k(SearchGlobalTrackingLogPanelLayout.this, abstractC29069a);
            }
        });
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        Context context = getContext();
        Window window = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity != null) {
            window = activity.getWindow();
        }
        f67518w = window;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        f67518w = null;
        super.onDetachedFromWindow();
    }

    /* renamed from: p */
    public final void m73461p() {
        this.f67519p.setVisibility(0);
    }

    public /* synthetic */ SearchGlobalTrackingLogPanelLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchGlobalTrackingLogPanelLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        C1421e m8054f;
        Object m129218b;
        AbstractC19074t.m100208f(context, "context");
        C18328f c18328f = new C18328f();
        this.f67520q = c18328f;
        setId(f67515t);
        setBackgroundColor(0);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(c18328f);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setOnClickListener(new View.OnClickListener() { // from class: ka0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchGlobalTrackingLogPanelLayout.m73451e(SearchGlobalTrackingLogPanelLayout.this, view);
            }
        });
        int m118742r = AbstractC23136l9.m118742r(56.0f);
        int m118742r2 = AbstractC23136l9.m118742r(16.0f);
        AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(context);
        aspectRatioImageView.setId(f67517v);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m118742r, m118742r);
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = m118742r2;
        layoutParams.rightMargin = m118742r2;
        aspectRatioImageView.setLayoutParams(layoutParams);
        aspectRatioImageView.setImageResource(AbstractC16803z.ic_darkmode_logo_zalo_headchat);
        aspectRatioImageView.setOnClickListener(new View.OnClickListener() { // from class: ka0.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchGlobalTrackingLogPanelLayout.m73456m(SearchGlobalTrackingLogPanelLayout.this, view);
            }
        });
        aspectRatioImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: ka0.h
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m73457n;
                m73457n = SearchGlobalTrackingLogPanelLayout.m73457n(SearchGlobalTrackingLogPanelLayout.this, view);
                return m73457n;
            }
        });
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f67519p = horizontalScrollView;
        horizontalScrollView.setId(f67516u);
        horizontalScrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        horizontalScrollView.addView(recyclerView);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.setBackgroundColor(-2013265920);
        addView(horizontalScrollView);
        addView(aspectRatioImageView);
        if (AbstractC1579n0.m7862d0(this)) {
            C1580n1 m7824M = AbstractC1579n0.m7824M(getRootView());
            if (m7824M != null && (m8054f = m7824M.m8054f(C1580n1.m.m8118f())) != null) {
                try {
                    C24861r.a aVar = C24861r.f119264q;
                    ViewGroup.LayoutParams layoutParams2 = aspectRatioImageView.getLayoutParams();
                    AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, 0, m8054f.f6232c + m118742r2, m8054f.f6233d + m118742r2);
                    aspectRatioImageView.requestLayout();
                    recyclerView.setPadding(m8054f.f6230a, m8054f.f6231b, m8054f.f6232c, m8054f.f6233d + m118742r2 + m118742r);
                    m129218b = C24861r.m129218b(C24848g0.f119245a);
                } catch (Throwable th2) {
                    C24861r.a aVar2 = C24861r.f119264q;
                    m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                }
                C24861r.m129217a(m129218b);
            }
        } else {
            addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13103b(this, this, aspectRatioImageView, m118742r2, recyclerView, m118742r));
        }
        this.f67522s = Collections.synchronizedList(new ArrayList());
    }
}
