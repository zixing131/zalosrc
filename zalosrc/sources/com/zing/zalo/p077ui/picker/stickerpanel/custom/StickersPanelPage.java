package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c30.C3245i;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.adapters.C7110j8;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.uicomponents.reddot.RedDotImageView;
import com.zing.zalo.uicontrol.ScrollControlGridLayoutManager;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import me0.AbstractC23136l9;
import p134el.C18470i;
import p268ji.C21272r;
import p354n3.C23528a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import x90.C29540n;

/* loaded from: classes6.dex */
public final class StickersPanelPage extends RecyclerView implements InterfaceC12966p {
    public static final C12944d Companion = new C12944d(null);

    /* renamed from: V0 */
    private final boolean f67036V0;

    /* renamed from: W0 */
    private final InterfaceC24854k f67037W0;

    /* renamed from: X0 */
    private final ScrollControlGridLayoutManager f67038X0;

    /* renamed from: Y0 */
    private final int f67039Y0;

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.StickersPanelPage$a */
    /* loaded from: classes6.dex */
    public static final class C12941a extends GridLayoutManager.AbstractC1865b {

        /* renamed from: f */
        final /* synthetic */ int f67041f;

        C12941a(int i11) {
            this.f67041f = i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            if (!StickersPanelPage.this.get_adapter().m146876a(i11) && !StickersPanelPage.this.get_adapter().m146872U(i11)) {
                return 1;
            }
            return this.f67041f;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.StickersPanelPage$b */
    /* loaded from: classes6.dex */
    public static final class C12942b extends RecyclerView.AbstractC1887n {

        /* renamed from: b */
        final /* synthetic */ int f67043b;

        C12942b(int i11) {
            this.f67043b = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = recyclerView.m9817A0(view);
            if (!StickersPanelPage.this.get_adapter().m146876a(m9817A0) && !StickersPanelPage.this.get_adapter().m146872U(m9817A0)) {
                int width = ((StickersPanelPage.this.getWidth() / this.f67043b) - StickersPanelPage.this.f67039Y0) / 2;
                int m118742r = AbstractC23136l9.m118742r(7.0f);
                rect.set(width, m118742r, width, m118742r);
                return;
            }
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.StickersPanelPage$c */
    /* loaded from: classes6.dex */
    public static final class C12943c extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        private int f67044a;

        /* renamed from: b */
        private int f67045b = -1;

        /* renamed from: c */
        private boolean f67046c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC12972v f67047d;

        /* renamed from: e */
        final /* synthetic */ StickersPanelPage f67048e;

        /* renamed from: f */
        final /* synthetic */ C1761c0 f67049f;

        /* renamed from: g */
        final /* synthetic */ C1761c0 f67050g;

        C12943c(InterfaceC12972v interfaceC12972v, StickersPanelPage stickersPanelPage, C1761c0 c1761c0, C1761c0 c1761c02) {
            this.f67047d = interfaceC12972v;
            this.f67048e = stickersPanelPage;
            this.f67049f = c1761c0;
            this.f67050g = c1761c02;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            try {
                if (!this.f67046c) {
                    if (i11 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f67046c = z11;
                }
                if (i11 == 0) {
                    this.f67046c = false;
                    this.f67047d.set(Boolean.FALSE);
                    this.f67048e.get_adapter().m10008p();
                    this.f67049f.mo9224q(new C18470i(true, this.f67044a));
                    return;
                }
                if (i11 == 1) {
                    C21272r.a aVar = C21272r.Companion;
                    if (((C21272r) aVar.m122672a()).m110178g()) {
                        ((C21272r) aVar.m122672a()).m110175d().m122673a().put(3);
                    }
                }
                this.f67047d.set(Boolean.TRUE);
                this.f67049f.mo9224q(new C18470i(false, this.f67044a));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            if (i12 != 0 && this.f67046c) {
                this.f67044a = this.f67048e.f67038X0.m9737T1();
                int m9737T1 = this.f67048e.f67038X0.m9737T1();
                if (i12 > 0) {
                    m9737T1 = this.f67048e.f67038X0.m9741Z1();
                }
                Integer num = (Integer) this.f67048e.get_adapter().m146867P().get(this.f67048e.get_adapter().m146869R(m9737T1));
                if (num != null) {
                    if (num.intValue() != this.f67045b) {
                        this.f67045b = num.intValue();
                        this.f67050g.mo9224q(num);
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.StickersPanelPage$d */
    /* loaded from: classes6.dex */
    public static final class C12944d {
        private C12944d() {
        }

        public /* synthetic */ C12944d(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.StickersPanelPage$e */
    /* loaded from: classes6.dex */
    static final class C12945e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: A */
        final /* synthetic */ String f67051A;

        /* renamed from: B */
        final /* synthetic */ boolean f67052B;

        /* renamed from: C */
        final /* synthetic */ C1761c0 f67053C;

        /* renamed from: D */
        final /* synthetic */ boolean f67054D;

        /* renamed from: E */
        final /* synthetic */ StickerView.InterfaceC10959a f67055E;

        /* renamed from: q */
        final /* synthetic */ LayoutInflater f67056q;

        /* renamed from: r */
        final /* synthetic */ C23528a f67057r;

        /* renamed from: s */
        final /* synthetic */ C1755a0 f67058s;

        /* renamed from: t */
        final /* synthetic */ C1761c0 f67059t;

        /* renamed from: u */
        final /* synthetic */ C1761c0 f67060u;

        /* renamed from: v */
        final /* synthetic */ C1761c0 f67061v;

        /* renamed from: w */
        final /* synthetic */ C7110j8.d f67062w;

        /* renamed from: x */
        final /* synthetic */ int f67063x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC12972v f67064y;

        /* renamed from: z */
        final /* synthetic */ StickersPanelPage f67065z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12945e(LayoutInflater layoutInflater, C23528a c23528a, C1755a0 c1755a0, C1761c0 c1761c0, C1761c0 c1761c02, C1761c0 c1761c03, C7110j8.d dVar, int i11, InterfaceC12972v interfaceC12972v, StickersPanelPage stickersPanelPage, String str, boolean z11, C1761c0 c1761c04, boolean z12, StickerView.InterfaceC10959a interfaceC10959a) {
            super(0);
            this.f67056q = layoutInflater;
            this.f67057r = c23528a;
            this.f67058s = c1755a0;
            this.f67059t = c1761c0;
            this.f67060u = c1761c02;
            this.f67061v = c1761c03;
            this.f67062w = dVar;
            this.f67063x = i11;
            this.f67064y = interfaceC12972v;
            this.f67065z = stickersPanelPage;
            this.f67051A = str;
            this.f67052B = z11;
            this.f67053C = c1761c04;
            this.f67054D = z12;
            this.f67055E = interfaceC10959a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29540n mo12V4() {
            return new C29540n(this.f67056q, this.f67057r, this.f67058s, this.f67059t, this.f67060u, this.f67061v, this.f67062w, this.f67063x, this.f67064y, this.f67065z.getCanAutoPlaySticker(), this.f67051A, this.f67052B, this.f67053C, this.f67054D, this.f67055E);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickersPanelPage(LayoutInflater layoutInflater, Context context, C23528a c23528a, C7110j8.d dVar, int i11, C1755a0 c1755a0, C1761c0 c1761c0, C1761c0 c1761c02, C1761c0 c1761c03, boolean z11, String str, InterfaceC12972v interfaceC12972v, C1761c0 c1761c04, C1761c0 c1761c05, boolean z12, C1761c0 c1761c06, boolean z13, StickerView.InterfaceC10959a interfaceC10959a) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(c23528a, "mAQ");
        AbstractC19074t.m100208f(c1755a0, "viewActionLiveData");
        AbstractC19074t.m100208f(c1761c0, "pageScrollLiveData");
        AbstractC19074t.m100208f(c1761c02, "openPopupActionLiveData");
        AbstractC19074t.m100208f(c1761c03, "stickersPageScrollLiveData");
        AbstractC19074t.m100208f(str, "autoPlayPrefix");
        AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
        AbstractC19074t.m100208f(c1761c04, "refreshPanelLiveData");
        AbstractC19074t.m100208f(c1761c05, "startDownloadStickerLiveData");
        AbstractC19074t.m100208f(c1761c06, "openAIStickerMpLiveData");
        AbstractC19074t.m100205c(context);
        this.f67036V0 = z11;
        m129210a = AbstractC24856m.m129210a(new C12945e(layoutInflater, c23528a, c1755a0, c1761c02, c1761c04, c1761c05, dVar, i11, interfaceC12972v, this, str, z12, c1761c06, z13, interfaceC10959a));
        this.f67037W0 = m129210a;
        this.f67039Y0 = AbstractC23136l9.m118739q(context, AbstractC16802y.item_sticker_height);
        get_adapter().m9999J(true);
        setAdapter(get_adapter());
        setItemAnimator(null);
        int i12 = dVar != null ? dVar.f38885p : 4;
        ScrollControlGridLayoutManager scrollControlGridLayoutManager = new ScrollControlGridLayoutManager(context, i12);
        this.f67038X0 = scrollControlGridLayoutManager;
        scrollControlGridLayoutManager.m9671f3(new C12941a(i12));
        setHasFixedSize(true);
        setLayoutManager(scrollControlGridLayoutManager);
        setOverScrollMode(2);
        setClipToPadding(false);
        m9816A(new C12942b(i12));
        m9826E(new C12943c(interfaceC12972v, this, c1761c0, c1761c03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C29540n get_adapter() {
        return (C29540n) this.f67037W0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m72840h2(StickersPanelPage stickersPanelPage, int i11) {
        AbstractC19074t.m100208f(stickersPanelPage, "this$0");
        stickersPanelPage.mo9854S1(i11);
    }

    /* renamed from: e2 */
    public final RedDotImageView m72841e2() {
        int m9740Y1 = this.f67038X0.m9740Y1();
        int m9745c2 = this.f67038X0.m9745c2();
        if (m9740Y1 >= 0 && m9745c2 >= m9740Y1 && m9740Y1 <= m9745c2) {
            while (!get_adapter().m146871T(m9740Y1)) {
                if (m9740Y1 != m9745c2) {
                    m9740Y1++;
                }
            }
            RecyclerView.AbstractC1876c0 m9900t0 = m9900t0(m9740Y1);
            if (!(m9900t0 instanceof C29540n.o)) {
                return null;
            }
            return ((C29540n.o) m9900t0).m146892l0();
        }
        return null;
    }

    /* renamed from: f2 */
    public final void m72842f2(int i11) {
        Integer num = (Integer) get_adapter().m146868Q().get(Integer.valueOf(i11));
        if (num != null) {
            this.f67038X0.m9721B2(num.intValue(), 0);
        }
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: g */
    public void mo72819g() {
        get_adapter().m10008p();
    }

    /* renamed from: g2 */
    public final void m72843g2(int i11) {
        Integer num;
        int i12;
        C3245i c3245i = (C3245i) get_adapter().m146866O().get(Integer.valueOf(i11));
        if (c3245i != null && (num = (Integer) get_adapter().m146868Q().get(Integer.valueOf(i11))) != null) {
            final int intValue = num.intValue();
            int m9740Y1 = this.f67038X0.m9740Y1();
            int i13 = m9740Y1 - intValue;
            if (i13 > 40) {
                i12 = c3245i.f13868p + intValue;
            } else if (i13 < -40) {
                i12 = intValue - c3245i.f13868p;
            } else {
                i12 = m9740Y1;
            }
            if (i12 != m9740Y1) {
                this.f67038X0.m9721B2(i12, 0);
            }
            post(new Runnable() { // from class: com.zing.zalo.ui.picker.stickerpanel.custom.r
                @Override // java.lang.Runnable
                public final void run() {
                    StickersPanelPage.m72840h2(StickersPanelPage.this, intValue);
                }
            });
        }
    }

    public final boolean getCanAutoPlaySticker() {
        return this.f67036V0;
    }

    public Integer getPageId() {
        return null;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: i */
    public boolean mo72820i() {
        RecyclerView.AbstractC1888o layoutManager = getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).m9740Y1() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i2 */
    public final void m72844i2(List list, List list2) {
        AbstractC19074t.m100208f(list, "downloadedCategories");
        AbstractC19074t.m100208f(list2, "promotionCategories");
        get_adapter().m146875Y(list, list2);
    }
}
