package com.zing.zalo.p077ui.mycloud.collection;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.mycloud.collection.CollectionListingView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.List;
import kw.C21955a;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.C23459d;
import on0.AbstractC24341v;
import p193h0.AbstractC19694b;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C29794f2;
import pk.C24799c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ui0.C27280g;
import x80.C29499p;
import x80.InterfaceC29498o;

/* loaded from: classes6.dex */
public final class CollectionListingView extends SlidableZaloView implements InterfaceC29498o {
    public static final C12537f Companion = new C12537f(null);

    /* renamed from: T0 */
    private static final int f65516T0;

    /* renamed from: U0 */
    private static final int f65517U0;

    /* renamed from: P0 */
    private final InterfaceC24854k f65518P0;

    /* renamed from: Q0 */
    private C29794f2 f65519Q0;

    /* renamed from: R0 */
    private C12535d f65520R0;

    /* renamed from: S0 */
    private ActionBarMenuItem f65521S0;

    @SuppressLint({"ViewConstructor"})
    /* loaded from: classes6.dex */
    public static final class CollectionInfoModuleView extends ModulesView implements InterfaceC12534c {

        /* renamed from: K */
        private C23528a f65522K;

        /* renamed from: L */
        private C16716d f65523L;

        /* renamed from: M */
        private C22122a0 f65524M;

        /* renamed from: N */
        private C16716d f65525N;

        /* renamed from: O */
        private C22126c0 f65526O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollectionInfoModuleView(Context context, C23528a c23528a) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(c23528a, "aQuery");
            this.f65522K = c23528a;
            this.f65523L = new C16716d(context);
            this.f65524M = new C22122a0(context);
            this.f65525N = new C16716d(context);
            this.f65526O = new C22126c0(context);
            this.f65523L.m89106L().m89028L(CollectionListingView.f65516T0, CollectionListingView.f65517U0);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_carousel_my_collection_item));
            C22122a0 c22122a0 = this.f65524M;
            c22122a0.m89106L().m89028L(-1, -1);
            c22122a0.m111929z1(3);
            int i11 = AbstractC23222t7.f112570l;
            c22122a0.m111928y1(i11, i11, i11, i11);
            this.f65525N.m89106L().m89028L(-1, -1);
            C22126c0 c22126c0 = this.f65526O;
            C16718f m89072y = c22126c0.m89106L().m89028L(-1, -2).m89072y(Boolean.TRUE);
            int i12 = AbstractC23222t7.f112576o;
            m89072y.m89032P(i12, 0, i12, i12);
            c22126c0.mo111964L1(AbstractC23222t7.f112582r);
            c22126c0.mo111965M1(1);
            c22126c0.m111962J1(Color.parseColor("#ffffff"));
            c22126c0.m111980v1(TextUtils.TruncateAt.END);
            c22126c0.m111953A1(2);
            this.f65523L.m89001g1(this.f65524M);
            this.f65523L.m89001g1(this.f65525N);
            this.f65523L.m89001g1(this.f65526O);
            mo69681L(this.f65523L);
        }

        @Override // com.zing.zalo.p077ui.mycloud.collection.CollectionListingView.InterfaceC12534c
        /* renamed from: b */
        public void mo70657b(C24799c c24799c, int i11, boolean z11) {
            boolean m127128x;
            int i12;
            AbstractC19074t.m100208f(c24799c, "item");
            try {
                this.f65526O.m111959G1(c24799c.m128821a());
                if (c24799c.m128832l()) {
                    this.f65524M.mo111925v1(AbstractC19694b.m103336d(getContext(), AbstractC16803z.ic_pin_collection_thumb));
                } else {
                    if (c24799c.m128830j().length() > 0) {
                        m127128x = AbstractC24341v.m127128x(c24799c.m128830j());
                        if (!m127128x) {
                            this.f65524M.m115375G1(this.f65522K, c24799c.m128830j(), C23278z2.m120161w0());
                        }
                    }
                    this.f65524M.mo111925v1(AbstractC19694b.m103336d(getContext(), AbstractC16803z.ic_fake_collection_thumb));
                }
                Context context = getContext();
                if (c24799c.m128832l()) {
                    i12 = AbstractC16803z.overlay_thumb_my_collection_pin;
                } else {
                    i12 = AbstractC16803z.overlay_thumb_my_collection;
                }
                this.f65525N.m89085A0(AbstractC23136l9.m118665N(context, i12));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        public final C23528a getMAQ() {
            return this.f65522K;
        }

        public final C16716d getMContainer() {
            return this.f65523L;
        }

        public final C22122a0 getMCoverImage() {
            return this.f65524M;
        }

        public final C22126c0 getMName() {
            return this.f65526O;
        }

        public final C16716d getMOverlay() {
            return this.f65525N;
        }

        public final void setMAQ(C23528a c23528a) {
            AbstractC19074t.m100208f(c23528a, "<set-?>");
            this.f65522K = c23528a;
        }

        public final void setMContainer(C16716d c16716d) {
            AbstractC19074t.m100208f(c16716d, "<set-?>");
            this.f65523L = c16716d;
        }

        public final void setMCoverImage(C22122a0 c22122a0) {
            AbstractC19074t.m100208f(c22122a0, "<set-?>");
            this.f65524M = c22122a0;
        }

        public final void setMName(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f65526O = c22126c0;
        }

        public final void setMOverlay(C16716d c16716d) {
            AbstractC19074t.m100208f(c16716d, "<set-?>");
            this.f65525N = c16716d;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionListingView$a */
    /* loaded from: classes6.dex */
    public static final class C12532a extends C12533b {

        /* renamed from: I */
        private final ModulesView f65527I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12532a(ModulesView modulesView) {
            super(modulesView);
            AbstractC19074t.m100208f(modulesView, "itemView");
            this.f65527I = modulesView;
        }

        @Override // com.zing.zalo.p077ui.mycloud.collection.CollectionListingView.C12533b, com.zing.zalo.p077ui.mycloud.collection.CollectionListingView.InterfaceC12534c
        /* renamed from: b */
        public void mo70657b(C24799c c24799c, int i11, boolean z11) {
            AbstractC19074t.m100208f(c24799c, "item");
            ViewParent viewParent = this.f65527I;
            if (viewParent instanceof InterfaceC12534c) {
                ((InterfaceC12534c) viewParent).mo70657b(c24799c, i11, z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionListingView$b */
    /* loaded from: classes6.dex */
    public static class C12533b extends RecyclerView.AbstractC1876c0 implements InterfaceC12534c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12533b(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }

        /* renamed from: b */
        public abstract void mo70657b(C24799c c24799c, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionListingView$c */
    /* loaded from: classes6.dex */
    private interface InterfaceC12534c {
        /* renamed from: b */
        void mo70657b(C24799c c24799c, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionListingView$d */
    /* loaded from: classes6.dex */
    public static final class C12535d extends RecyclerView.AbstractC1880g {

        /* renamed from: r */
        private final C23528a f65528r;

        /* renamed from: s */
        private InterfaceC12536e f65529s;

        /* renamed from: t */
        private final ArrayList f65530t;

        public C12535d(C23528a c23528a) {
            AbstractC19074t.m100208f(c23528a, "mAQ");
            this.f65528r = c23528a;
            this.f65530t = new ArrayList();
        }

        /* renamed from: O */
        public static final void m70659O(C12535d c12535d, int i11, View view) {
            AbstractC19074t.m100208f(c12535d, "this$0");
            InterfaceC12536e interfaceC12536e = c12535d.f65529s;
            if (interfaceC12536e != null) {
                interfaceC12536e.mo70665n(i11);
            }
        }

        /* renamed from: M */
        public final ArrayList m70660M() {
            return this.f65530t;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: N */
        public void mo9990A(C12533b c12533b, int i11) {
            AbstractC19074t.m100208f(c12533b, "holder");
            try {
                C24799c c24799c = (C24799c) this.f65530t.get(i11);
                AbstractC19074t.m100205c(c24799c);
                c12533b.mo70657b(c24799c, i11, false);
                c12533b.f7784p.setOnClickListener(new View.OnClickListener() { // from class: x80.s

                    /* renamed from: q */
                    public final /* synthetic */ int f136171q;

                    public /* synthetic */ ViewOnClickListenerC29502s(int i112) {
                        r2 = i112;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CollectionListingView.C12535d.m70659O(CollectionListingView.C12535d.this, r2, view);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: P */
        public C12533b mo9992C(ViewGroup viewGroup, int i11) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new C12532a(new CollectionInfoModuleView(context, this.f65528r));
        }

        /* renamed from: Q */
        public final void m70663Q(List list) {
            AbstractC19074t.m100208f(list, "itemList");
            this.f65530t.clear();
            this.f65530t.addAll(list);
            m10008p();
        }

        /* renamed from: R */
        public final void m70664R(InterfaceC12536e interfaceC12536e) {
            this.f65529s = interfaceC12536e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            return this.f65530t.size();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionListingView$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC12536e {
        /* renamed from: n */
        void mo70665n(int i11);
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionListingView$f */
    /* loaded from: classes6.dex */
    public static final class C12537f {
        private C12537f() {
        }

        public /* synthetic */ C12537f(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionListingView$g */
    /* loaded from: classes6.dex */
    public static final class C12538g implements InterfaceC12536e {
        C12538g() {
        }

        @Override // com.zing.zalo.p077ui.mycloud.collection.CollectionListingView.InterfaceC12536e
        /* renamed from: n */
        public void mo70665n(int i11) {
            CollectionListingView.this.m70650mM().m146730Ip(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionListingView$h */
    /* loaded from: classes6.dex */
    public static final class C12539h extends RecyclerView.AbstractC1887n {
        C12539h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            rect.set(AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, 0);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionListingView$i */
    /* loaded from: classes6.dex */
    static final class C12540i extends AbstractC19075u implements InterfaceC18494a {
        C12540i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29499p mo12V4() {
            return new C29499p(CollectionListingView.this);
        }
    }

    static {
        int m118722k0 = (AbstractC23136l9.m118722k0() - AbstractC23222t7.f112539R) / 2;
        f65516T0 = m118722k0;
        f65517U0 = (int) (m118722k0 / 2.6f);
    }

    public CollectionListingView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C12540i());
        this.f65518P0 = m129210a;
    }

    /* renamed from: lM */
    public static final void m70649lM(CollectionListingView collectionListingView, int i11, String str, String str2) {
        AbstractC19074t.m100208f(collectionListingView, "this$0");
        AbstractC19074t.m100208f(str, "$successMsg");
        AbstractC19074t.m100208f(str2, "$errorMessage");
        C23459d.f113954a.m123170n(collectionListingView.f72421L0, i11, str, str2);
    }

    /* renamed from: mM */
    public final C29499p m70650mM() {
        return (C29499p) this.f65518P0.getValue();
    }

    /* renamed from: nM */
    public static final void m70651nM(CollectionListingView collectionListingView, List list) {
        AbstractC19074t.m100208f(collectionListingView, "this$0");
        AbstractC19074t.m100208f(list, "$data");
        C12535d c12535d = collectionListingView.f65520R0;
        if (c12535d == null) {
            AbstractC19074t.m100223u("mAdapter");
            c12535d = null;
        }
        c12535d.m70663Q(list);
        C29794f2 c29794f2 = collectionListingView.f65519Q0;
        if (c29794f2 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29794f2 = null;
        }
        c29794f2.f137732r.invalidate();
        m70653pM(collectionListingView, false, 1, null);
    }

    /* renamed from: oM */
    private final void m70652oM(boolean z11) {
        int i11;
        C29794f2 c29794f2 = null;
        if (z11) {
            C29794f2 c29794f22 = this.f65519Q0;
            if (c29794f22 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29794f2 = c29794f22;
            }
            c29794f2.f137732r.setVisibility(8);
            MultiStateView multiStateView = c29794f2.f137731q;
            multiStateView.setVisibility(0);
            multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
            return;
        }
        C12535d c12535d = this.f65520R0;
        if (c12535d == null) {
            AbstractC19074t.m100223u("mAdapter");
            c12535d = null;
        }
        if (c12535d.m70660M().isEmpty()) {
            C29794f2 c29794f23 = this.f65519Q0;
            if (c29794f23 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29794f2 = c29794f23;
            }
            c29794f2.f137732r.setVisibility(8);
            MultiStateView multiStateView2 = c29794f2.f137731q;
            multiStateView2.setVisibility(0);
            multiStateView2.setState(MultiStateView.EnumC15914e.EMPTY);
            multiStateView2.setEmptyViewString(m92652XI(AbstractC8020f0.str_empty_msg_collection_listing_view));
            if (C23212s8.m119603k()) {
                i11 = AbstractC16803z.ic_illus_empty_mycloud_collection_light;
            } else {
                i11 = AbstractC16803z.ic_illus_empty_mycloud_collection_dark;
            }
            multiStateView2.setEmptyImageResourceId(i11);
            return;
        }
        C29794f2 c29794f24 = this.f65519Q0;
        if (c29794f24 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29794f2 = c29794f24;
        }
        c29794f2.f137732r.setVisibility(0);
        c29794f2.f137731q.setVisibility(8);
    }

    /* renamed from: pM */
    static /* synthetic */ void m70653pM(CollectionListingView collectionListingView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        collectionListingView.m70652oM(z11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        super.mo37482FJ(actionBarMenu);
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        this.f65521S0 = actionBarMenu.m92742i(0, C27280g.m139659b(context, AbstractC23322a.zds_ic_plus_line_24, AbstractC16801x.white));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29794f2 m147929c = C29794f2.m147929c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147929c, "inflate(...)");
        this.f65519Q0 = m147929c;
        C12535d c12535d = new C12535d(new C23528a(getContext()));
        c12535d.m70664R(new C12538g());
        this.f65520R0 = c12535d;
        C29794f2 c29794f2 = this.f65519Q0;
        C29794f2 c29794f22 = null;
        if (c29794f2 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29794f2 = null;
        }
        RecyclerView recyclerView = c29794f2.f137732r;
        C12535d c12535d2 = this.f65520R0;
        if (c12535d2 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c12535d2 = null;
        }
        recyclerView.setAdapter(c12535d2);
        recyclerView.m9816A(new C12539h());
        m70650mM().m146732Kp(AbstractC23306f.m120602N0().m109048C0());
        m92637BK(true);
        C21955a.f108070a.m114647n();
        C29794f2 c29794f23 = this.f65519Q0;
        if (c29794f23 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29794f22 = c29794f23;
        }
        LinearLayout root = c29794f22.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 5201);
        bVar.m124119a().m124117e(this, 5203);
        bVar.m124119a().m124117e(this, 5205);
        bVar.m124119a().m124117e(this, 5204);
        bVar.m124119a().m124117e(this, 5213);
    }

    @Override // x80.InterfaceC29498o
    /* renamed from: Pr */
    public void mo70654Pr() {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putInt("viewMode", 0);
        bundle.putBoolean("startCollectionDetail", true);
        bundle.putString("entryPoint", "mycloud_collection_list");
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(CreateNewCollectionView.class, bundle, 1, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 0) {
            m70650mM().m146731Jp();
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            actionBar.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_collection_listing_title_plural));
        }
    }

    @Override // x80.InterfaceC29498o
    /* renamed from: Ur */
    public void mo70655Ur(int i11) {
        C17487o0 mo35579p;
        C12535d c12535d = this.f65520R0;
        if (c12535d == null) {
            AbstractC19074t.m100223u("mAdapter");
            c12535d = null;
        }
        C24799c c24799c = (C24799c) c12535d.m70660M().get(i11);
        Bundle bundle = new Bundle();
        bundle.putLong("extra_collection_id", c24799c.m128824d());
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(CollectionDetailView.class, bundle, 1, true);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CollectionListing";
    }

    @Override // x80.InterfaceC29498o
    /* renamed from: je */
    public void mo70656je(List list) {
        AbstractC19074t.m100208f(list, "data");
        AbstractC19444a.m101697e(new Runnable() { // from class: x80.q

            /* renamed from: q */
            public final /* synthetic */ List f136165q;

            public /* synthetic */ RunnableC29500q(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CollectionListingView.m70651nM(CollectionListingView.this, r2);
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: x80.r.<init>(com.zing.zalo.ui.mycloud.collection.CollectionListingView, int, java.lang.String, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int r5, java.lang.Object... r6) {
        /*
            r4 = this;
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            java.lang.String r1 = "args"
            fn0.AbstractC19074t.m100208f(r6, r1)
            r1 = 5201(0x1451, float:7.288E-42)
            if (r5 == r1) goto L4a
            r1 = 5213(0x145d, float:7.305E-42)
            if (r5 == r1) goto L13
            switch(r5) {
                case 5203: goto L4a;
                case 5204: goto L4a;
                case 5205: goto L4a;
                default: goto L12;
            }
        L12:
            goto L60
        L13:
            int r1 = r6.length     // Catch: java.lang.Exception -> L45
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r1 = r1 ^ r3
            if (r1 == 0) goto L60
            r1 = r6[r2]     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            fn0.AbstractC19074t.m100206d(r1, r2)     // Catch: java.lang.Exception -> L45
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L45
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L45
            r2 = r6[r3]     // Catch: java.lang.Exception -> L45
            fn0.AbstractC19074t.m100206d(r2, r0)     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L45
            r3 = 2
            r3 = r6[r3]     // Catch: java.lang.Exception -> L45
            fn0.AbstractC19074t.m100206d(r3, r0)     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L45
            x80.r r0 = new x80.r     // Catch: java.lang.Exception -> L45
            r0.<init>()     // Catch: java.lang.Exception -> L45
            r1 = 300(0x12c, double:1.48E-321)
            r4.mo78955kl(r0, r1)     // Catch: java.lang.Exception -> L45
            goto L60
        L45:
            r0 = move-exception
            mm0.AbstractC23350e.m122778h(r0)
            goto L60
        L4a:
            java.lang.String r0 = "CommonZaloview"
            java.lang.String r1 = "NOTIFY_REFRESH_DATA_LIST_MY_CLOUD_COLLECTION"
            kw.C21956b.m114657g(r0, r1)
            x80.p r0 = r4.m70650mM()
            iw.c0 r1 = p348mi.AbstractC23306f.m120602N0()
            java.util.List r1 = r1.m109048C0()
            r0.m146732Kp(r1)
        L60:
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            super.mo17795x(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.mycloud.collection.CollectionListingView.mo17795x(int, java.lang.Object[]):void");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 5201);
        bVar.m124119a().m124115b(this, 5203);
        bVar.m124119a().m124115b(this, 5205);
        bVar.m124119a().m124115b(this, 5204);
        bVar.m124119a().m124115b(this, 5213);
    }
}
