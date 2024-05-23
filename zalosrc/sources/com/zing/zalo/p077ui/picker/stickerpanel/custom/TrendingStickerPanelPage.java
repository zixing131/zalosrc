package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.uicontrol.ScrollControlGridLayoutManager;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import p134el.C18470i;
import p268ji.C21272r;
import p354n3.C23528a;
import p649xl.C30157zd;
import pm0.C24860q;
import x90.C29520c0;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes6.dex */
public final class TrendingStickerPanelPage extends FrameLayout implements InterfaceC12966p {
    public static final C12950e Companion = new C12950e(null);

    /* renamed from: u */
    private static final int f67066u = AbstractC23136l9.m118742r(188.0f);

    /* renamed from: p */
    private final C30157zd f67067p;

    /* renamed from: q */
    private C29520c0 f67068q;

    /* renamed from: r */
    private ScrollControlGridLayoutManager f67069r;

    /* renamed from: s */
    private boolean f67070s;

    /* renamed from: t */
    private final int f67071t;

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.TrendingStickerPanelPage$a */
    /* loaded from: classes6.dex */
    public static final class C12946a extends GridLayoutManager.AbstractC1865b {
        C12946a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            C29520c0 c29520c0 = TrendingStickerPanelPage.this.f67068q;
            C29520c0 c29520c02 = null;
            if (c29520c0 == null) {
                AbstractC19074t.m100223u("_adapter");
                c29520c0 = null;
            }
            if (!c29520c0.m146798T(i11)) {
                C29520c0 c29520c03 = TrendingStickerPanelPage.this.f67068q;
                if (c29520c03 == null) {
                    AbstractC19074t.m100223u("_adapter");
                } else {
                    c29520c02 = c29520c03;
                }
                if (c29520c02.m146797S(i11)) {
                    return 2;
                }
                return 4;
            }
            return 1;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.TrendingStickerPanelPage$b */
    /* loaded from: classes6.dex */
    public static final class C12947b extends RecyclerView.AbstractC1887n {
        C12947b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int i11;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = recyclerView.m9817A0(view);
            C29520c0 c29520c0 = TrendingStickerPanelPage.this.f67068q;
            C29520c0 c29520c02 = null;
            if (c29520c0 == null) {
                AbstractC19074t.m100223u("_adapter");
                c29520c0 = null;
            }
            int i12 = 0;
            if (!c29520c0.m146802a(m9817A0)) {
                C29520c0 c29520c03 = TrendingStickerPanelPage.this.f67068q;
                if (c29520c03 == null) {
                    AbstractC19074t.m100223u("_adapter");
                    c29520c03 = null;
                }
                if (!c29520c03.m146798T(m9817A0)) {
                    C29520c0 c29520c04 = TrendingStickerPanelPage.this.f67068q;
                    if (c29520c04 == null) {
                        AbstractC19074t.m100223u("_adapter");
                    } else {
                        c29520c02 = c29520c04;
                    }
                    if (c29520c02.m146797S(m9817A0)) {
                        i12 = ((TrendingStickerPanelPage.this.getWidth() / 2) - TrendingStickerPanelPage.f67066u) / 2;
                    }
                } else {
                    i12 = ((TrendingStickerPanelPage.this.getWidth() / 4) - TrendingStickerPanelPage.this.f67071t) / 2;
                }
                i11 = AbstractC23136l9.m118742r(7.0f);
            } else {
                i11 = 0;
            }
            rect.set(i12, i11, i12, i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.TrendingStickerPanelPage$c */
    /* loaded from: classes6.dex */
    public static final class C12948c extends RecyclerView.AbstractC1890q {

        /* renamed from: a */
        final /* synthetic */ C1761c0 f67074a;

        C12948c(C1761c0 c1761c0) {
            this.f67074a = c1761c0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
        /* renamed from: a */
        public boolean mo10175a(int i11, int i12) {
            this.f67074a.mo9224q(new C24860q(Integer.valueOf(i11), Integer.valueOf(i12)));
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.TrendingStickerPanelPage$d */
    /* loaded from: classes6.dex */
    public static final class C12949d extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        private int f67075a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC12972v f67076b;

        /* renamed from: c */
        final /* synthetic */ TrendingStickerPanelPage f67077c;

        /* renamed from: d */
        final /* synthetic */ C1761c0 f67078d;

        C12949d(InterfaceC12972v interfaceC12972v, TrendingStickerPanelPage trendingStickerPanelPage, C1761c0 c1761c0) {
            this.f67076b = interfaceC12972v;
            this.f67077c = trendingStickerPanelPage;
            this.f67078d = c1761c0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            try {
                if (i11 == 0) {
                    this.f67076b.set(Boolean.FALSE);
                    C29520c0 c29520c0 = this.f67077c.f67068q;
                    if (c29520c0 == null) {
                        AbstractC19074t.m100223u("_adapter");
                        c29520c0 = null;
                    }
                    c29520c0.m10008p();
                    this.f67078d.mo9224q(new C18470i(true, this.f67075a));
                    return;
                }
                if (i11 == 1) {
                    C21272r.a aVar = C21272r.Companion;
                    if (((C21272r) aVar.m122672a()).m110178g()) {
                        ((C21272r) aVar.m122672a()).m110175d().m122673a().put(3);
                    }
                }
                this.f67076b.set(Boolean.TRUE);
                this.f67078d.mo9224q(new C18470i(false, this.f67075a));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            this.f67075a = this.f67077c.f67069r.m9737T1();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.TrendingStickerPanelPage$e */
    /* loaded from: classes6.dex */
    public static final class C12950e {
        private C12950e() {
        }

        public /* synthetic */ C12950e(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingStickerPanelPage(LayoutInflater layoutInflater, Context context) {
        super(context);
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100205c(context);
        C30157zd m148791b = C30157zd.m148791b(layoutInflater, this);
        AbstractC19074t.m100207e(m148791b, "inflate(...)");
        this.f67067p = m148791b;
        this.f67069r = new ScrollControlGridLayoutManager(context, 4);
        this.f67071t = AbstractC23136l9.m118739q(context, AbstractC16802y.item_sticker_height);
        this.f67069r.m9671f3(new C12946a());
        m148791b.f140149q.setHasFixedSize(true);
        m148791b.f140149q.setLayoutManager(this.f67069r);
        m148791b.f140149q.setOverScrollMode(2);
        m148791b.f140149q.m9816A(new C12947b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m72847b(C1761c0 c1761c0, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(c1761c0, "$touchLiveData");
        c1761c0.mo9224q(motionEvent);
        return false;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: g */
    public void mo72819g() {
        C29520c0 c29520c0 = this.f67068q;
        if (c29520c0 == null) {
            AbstractC19074t.m100223u("_adapter");
            c29520c0 = null;
        }
        c29520c0.m10008p();
    }

    public Integer getPageId() {
        return null;
    }

    /* renamed from: h */
    public final void m72852h(List list, Map map, int i11) {
        int i12;
        AbstractC19074t.m100208f(list, "listKwds");
        AbstractC19074t.m100208f(map, "trendingStickerMap");
        C29520c0 c29520c0 = this.f67068q;
        C29520c0 c29520c02 = null;
        if (c29520c0 == null) {
            AbstractC19074t.m100223u("_adapter");
            c29520c0 = null;
        }
        c29520c0.m146803a0(i11);
        C29520c0 c29520c03 = this.f67068q;
        if (c29520c03 == null) {
            AbstractC19074t.m100223u("_adapter");
        } else {
            c29520c02 = c29520c03;
        }
        c29520c02.m146801Y(list, map);
        ProgressBar progressBar = this.f67067p.f140150r;
        if (!list.isEmpty()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        progressBar.setVisibility(i12);
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: i */
    public boolean mo72820i() {
        RecyclerView.AbstractC1888o layoutManager = this.f67067p.f140149q.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).m9740Y1() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m72853j(int i11, int i12, int i13, int i14) {
        this.f67067p.f140149q.setPadding(i11, i12, i13, i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrendingStickerPanelPage(LayoutInflater layoutInflater, Context context, C23528a c23528a, C1755a0 c1755a0, C1761c0 c1761c0, boolean z11, final C1761c0 c1761c02, String str, InterfaceC12972v interfaceC12972v, C1761c0 c1761c03) {
        this(layoutInflater, context);
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        AbstractC19074t.m100208f(c1755a0, "animViewActionLiveData");
        AbstractC19074t.m100208f(c1761c0, "pageScrollLiveData");
        AbstractC19074t.m100208f(c1761c02, "touchLiveData");
        AbstractC19074t.m100208f(str, "autoPlayPrefix");
        AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
        AbstractC19074t.m100208f(c1761c03, "pagerFlingLiveData");
        this.f67070s = z11;
        C29520c0 c29520c0 = new C29520c0(layoutInflater, c23528a, c1755a0, interfaceC12972v, z11, str);
        this.f67068q = c29520c0;
        c29520c0.m9999J(true);
        RecyclerView recyclerView = this.f67067p.f140149q;
        C29520c0 c29520c02 = this.f67068q;
        if (c29520c02 == null) {
            AbstractC19074t.m100223u("_adapter");
            c29520c02 = null;
        }
        recyclerView.setAdapter(c29520c02);
        this.f67067p.f140149q.setOnFlingListener(new C12948c(c1761c03));
        this.f67067p.f140149q.m9826E(new C12949d(interfaceC12972v, this, c1761c0));
        this.f67067p.f140149q.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.picker.stickerpanel.custom.u
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m72847b;
                m72847b = TrendingStickerPanelPage.m72847b(C1761c0.this, view, motionEvent);
                return m72847b;
            }
        });
    }
}
