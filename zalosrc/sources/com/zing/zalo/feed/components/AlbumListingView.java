package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bo.C2989j;
import bo.C2999l;
import bo.C3004m;
import bo.C3054x;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zview.animation.AnimationTarget;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import java.util.List;
import me0.AbstractC23136l9;
import p489rn.C25845a;
import p649xl.C29784ea;

/* loaded from: classes4.dex */
public final class AlbumListingView extends FrameLayout {
    public static final C8054a Companion = new C8054a(null);

    /* renamed from: p */
    public C29784ea f44081p;

    /* renamed from: q */
    public C25845a f44082q;

    /* renamed from: r */
    private FeedBaseAdapter.AlbumProfileCallback f44083r;

    /* renamed from: s */
    public RecyclerView.AbstractC1888o f44084s;

    /* renamed from: t */
    private int f44085t;

    /* renamed from: u */
    private boolean f44086u;

    /* renamed from: v */
    private boolean f44087v;

    /* renamed from: com.zing.zalo.feed.components.AlbumListingView$a */
    /* loaded from: classes4.dex */
    public static final class C8054a {
        private C8054a() {
        }

        public /* synthetic */ C8054a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.AlbumListingView$b */
    /* loaded from: classes4.dex */
    public static final class C8055b implements C25845a.a {
        C8055b() {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowInputDescView.InterfaceC8062a
        /* renamed from: V3 */
        public void mo43421V3(String str) {
            C25845a.a.C32968a.m133307i(this, str);
        }

        @Override // com.zing.zalo.feed.components.ProfileAlbumItemCreateSquareView.InterfaceC8214a
        /* renamed from: X0 */
        public void mo43422X0() {
            FeedBaseAdapter.AlbumProfileCallback albumProfileCallback = AlbumListingView.this.f44083r;
            if (albumProfileCallback != null) {
                albumProfileCallback.mo43227X0();
            }
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewThemeView.InterfaceC8069a
        /* renamed from: a */
        public void mo43423a(C2999l c2999l) {
            C25845a.a.C32968a.m133300b(this, c2999l);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewAlbumView.InterfaceC8066a
        /* renamed from: b */
        public void mo43424b(C2989j c2989j) {
            C25845a.a.C32968a.m133299a(this, c2989j);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: c */
        public void mo43425c(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11) {
            C25845a.a.C32968a.m133309k(this, animationTarget, itemAlbumMobile, i11);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowSelectInfoView.InterfaceC8070a
        /* renamed from: d */
        public void mo43426d(C3004m c3004m) {
            C25845a.a.C32968a.m133301c(this, c3004m);
        }

        @Override // com.zing.zalo.feed.components.AlbumItemSquareView.InterfaceC8052a
        /* renamed from: f */
        public void mo43406f(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
            FeedBaseAdapter.AlbumProfileCallback albumProfileCallback = AlbumListingView.this.f44083r;
            if (albumProfileCallback != null) {
                albumProfileCallback.mo43234e4(profilePreviewAlbumItem);
            }
        }

        @Override // com.zing.zalo.feed.components.AlbumItemSquareView.InterfaceC8052a
        /* renamed from: g */
        public void mo43407g(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
            FeedBaseAdapter.AlbumProfileCallback albumProfileCallback = AlbumListingView.this.f44083r;
            if (albumProfileCallback != null) {
                albumProfileCallback.mo43228a4(profilePreviewAlbumItem);
            }
        }

        @Override // com.zing.zalo.feed.components.AlbumRowCreateAlbumView.InterfaceC8061a
        /* renamed from: h */
        public void mo43427h() {
            C25845a.a.C32968a.m133302d(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: i */
        public void mo43428i(int i11) {
            C25845a.a.C32968a.m133312n(this, i11);
        }

        @Override // com.zing.zalo.feed.components.ProfileAlbumItemSeeMoreView.InterfaceC8215a
        /* renamed from: l0 */
        public void mo43429l0() {
            FeedBaseAdapter.AlbumProfileCallback albumProfileCallback = AlbumListingView.this.f44083r;
            if (albumProfileCallback != null) {
                albumProfileCallback.mo43236l0();
            }
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: n1 */
        public void mo43430n1() {
            C25845a.a.C32968a.m133304f(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: r2 */
        public void mo43431r2() {
            C25845a.a.C32968a.m133310l(this);
        }

        @Override // com.zing.zalo.feed.components.EmptyContentView.InterfaceC8078a
        /* renamed from: s */
        public void mo43432s(C3054x c3054x) {
            AbstractC19074t.m100208f(c3054x, "emptyContentData");
            FeedBaseAdapter.AlbumProfileCallback albumProfileCallback = AlbumListingView.this.f44083r;
            if (albumProfileCallback != null) {
                albumProfileCallback.mo43237s(c3054x);
            }
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: x1 */
        public void mo43433x1() {
            C25845a.a.C32968a.m133313o(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowInputTitleView.InterfaceC8064a
        /* renamed from: z2 */
        public void mo43434z2(String str) {
            C25845a.a.C32968a.m133308j(this, str);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.AlbumListingView$c */
    /* loaded from: classes4.dex */
    public static final class C8056c extends RecyclerView.AbstractC1887n {
        C8056c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = AlbumListingView.this.getBinding().f137681r.f83582p0.m9817A0(view);
            rect.right = AbstractC23136l9.m118742r(8.0f);
            rect.top = AbstractC23136l9.m118742r(16.0f);
            rect.bottom = AbstractC23136l9.m118742r(16.0f);
            if (m9817A0 == 0) {
                rect.left = AbstractC23136l9.m118742r(16.0f);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.AlbumListingView$d */
    /* loaded from: classes4.dex */
    public static final class C8057d implements FeedRecyclerView.InterfaceC8863b {
        C8057d() {
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: a */
        public void mo43265a() {
            FeedBaseAdapter.AlbumProfileCallback albumProfileCallback = AlbumListingView.this.f44083r;
            if (albumProfileCallback != null) {
                albumProfileCallback.mo43239v(false);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: b */
        public void mo43266b() {
            FeedBaseAdapter.AlbumProfileCallback albumProfileCallback = AlbumListingView.this.f44083r;
            if (albumProfileCallback != null) {
                albumProfileCallback.mo43239v(true);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: c */
        public void mo43267c() {
            FeedBaseAdapter.AlbumProfileCallback albumProfileCallback = AlbumListingView.this.f44083r;
            if (albumProfileCallback != null) {
                albumProfileCallback.mo43239v(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.AlbumListingView$e */
    /* loaded from: classes4.dex */
    public static final class C8058e extends RecyclerView.AbstractC1892s {
        C8058e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            FeedBaseAdapter.AlbumProfileCallback albumProfileCallback = AlbumListingView.this.f44083r;
            if (albumProfileCallback != null) {
                if (i11 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                albumProfileCallback.mo43241x(z11);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
        }
    }

    /* renamed from: com.zing.zalo.feed.components.AlbumListingView$f */
    /* loaded from: classes4.dex */
    public static final class C8059f extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        final /* synthetic */ C29784ea f44092a;

        /* renamed from: b */
        final /* synthetic */ AlbumListingView f44093b;

        C8059f(C29784ea c29784ea, AlbumListingView albumListingView) {
            this.f44092a = c29784ea;
            this.f44093b = albumListingView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = this.f44092a.f137681r.f83582p0.m9817A0(view);
            int m118722k0 = (AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(148.0f) * 2)) / 3;
            if (m9817A0 % 2 != 0) {
                m118722k0 /= 2;
            }
            rect.left = m118722k0;
            rect.top = AbstractC23136l9.m118742r(24.0f);
            if (m9817A0 == this.f44093b.getProfileSuggestAlbumAdapter().mo10003k() - 1) {
                rect.bottom = AbstractC23136l9.m118742r(24.0f);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.AlbumListingView$g */
    /* loaded from: classes4.dex */
    public static final class C8060g extends RecyclerView.AbstractC1892s {
        C8060g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            FeedBaseAdapter.AlbumProfileCallback albumProfileCallback = AlbumListingView.this.f44083r;
            if (albumProfileCallback != null) {
                if (i11 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                albumProfileCallback.mo43241x(z11);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            FeedBaseAdapter.AlbumProfileCallback albumProfileCallback;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            try {
                RecyclerView.AbstractC1888o layoutManager = AlbumListingView.this.getLayoutManager();
                AbstractC19074t.m100206d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                if (((GridLayoutManager) layoutManager).m9745c2() >= AlbumListingView.this.getLayoutManager().m10127i() - 5 && (albumProfileCallback = AlbumListingView.this.f44083r) != null) {
                    albumProfileCallback.mo43230c4();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumListingView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: g */
    private final void m43412g() {
        FeedBaseAdapter.AlbumProfileCallback albumProfileCallback = this.f44083r;
        if (albumProfileCallback != null) {
            albumProfileCallback.mo43232e();
        }
    }

    /* renamed from: j */
    private final void m43413j() {
        C29784ea binding = getBinding();
        binding.f137681r.setVisibility(0);
        binding.f137681r.f83582p0.setBackgroundResource(AbstractC16803z.rectangle_transparent);
        binding.f137681r.f83582p0.setVisibility(0);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.m9723C2(1);
        setLayoutManager(gridLayoutManager);
        binding.f137681r.f83582p0.setLayoutManager(getLayoutManager());
        binding.f137681r.f83582p0.setAdapter(getProfileSuggestAlbumAdapter());
        binding.f137681r.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.feed.components.c
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                AlbumListingView.m43414k(AlbumListingView.this);
            }
        });
        binding.f137681r.f83582p0.m9816A(new C8059f(binding, this));
        binding.f137681r.f83582p0.m9826E(new C8060g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m43414k(AlbumListingView albumListingView) {
        AbstractC19074t.m100208f(albumListingView, "this$0");
        albumListingView.m43412g();
    }

    /* renamed from: c */
    public final void m43415c(List list) {
        AbstractC19074t.m100208f(list, "albumRows");
        if (this.f44085t == 1 && (getLayoutManager() instanceof GridLayoutManager)) {
            RecyclerView.AbstractC1888o layoutManager = getLayoutManager();
            AbstractC19074t.m100206d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            if (((GridLayoutManager) layoutManager).m9668X2() != 2) {
                RecyclerView.AbstractC1888o layoutManager2 = getLayoutManager();
                AbstractC19074t.m100206d(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                ((GridLayoutManager) layoutManager2).m9670e3(2);
            }
        }
        getProfileSuggestAlbumAdapter().m133297O(list);
        getProfileSuggestAlbumAdapter().m10008p();
    }

    /* renamed from: d */
    public final void m43416d(List list, int i11) {
        AbstractC19074t.m100208f(list, "albumRows");
        if (this.f44085t == 1 && (getLayoutManager() instanceof GridLayoutManager)) {
            RecyclerView.AbstractC1888o layoutManager = getLayoutManager();
            AbstractC19074t.m100206d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            if (((GridLayoutManager) layoutManager).m9668X2() != i11) {
                RecyclerView.AbstractC1888o layoutManager2 = getLayoutManager();
                AbstractC19074t.m100206d(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                ((GridLayoutManager) layoutManager2).m9670e3(i11);
            }
        }
        getProfileSuggestAlbumAdapter().m133297O(list);
        getProfileSuggestAlbumAdapter().m10008p();
    }

    /* renamed from: e */
    public final void m43417e() {
        getBinding().f137681r.setRefreshing(false);
    }

    /* renamed from: f */
    public final void m43418f(Context context) {
        AbstractC19074t.m100208f(context, "context");
        C29784ea m147901c = C29784ea.m147901c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m147901c, "inflate(...)");
        setBinding(m147901c);
        setProfileSuggestAlbumAdapter(new C25845a(context));
        getProfileSuggestAlbumAdapter().m133298P(new C8055b());
        m43419h(this.f44085t);
    }

    public final C29784ea getBinding() {
        C29784ea c29784ea = this.f44081p;
        if (c29784ea != null) {
            return c29784ea;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    public final boolean getHasCreateItem() {
        return this.f44087v;
    }

    public final boolean getHasMoreItem() {
        return this.f44086u;
    }

    public final RecyclerView.AbstractC1888o getLayoutManager() {
        RecyclerView.AbstractC1888o abstractC1888o = this.f44084s;
        if (abstractC1888o != null) {
            return abstractC1888o;
        }
        AbstractC19074t.m100223u("layoutManager");
        return null;
    }

    public final int getMode() {
        return this.f44085t;
    }

    public final C25845a getProfileSuggestAlbumAdapter() {
        C25845a c25845a = this.f44082q;
        if (c25845a != null) {
            return c25845a;
        }
        AbstractC19074t.m100223u("profileSuggestAlbumAdapter");
        return null;
    }

    /* renamed from: h */
    public final void m43419h(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                m43413j();
                return;
            }
            return;
        }
        m43420i();
    }

    /* renamed from: i */
    public final void m43420i() {
        C29784ea binding = getBinding();
        binding.f137680q.setVisibility(0);
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(getContext());
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        binding.f137680q.setLayoutManager(getLayoutManager());
        binding.f137680q.setAdapter(getProfileSuggestAlbumAdapter());
        binding.f137680q.m9816A(new C8056c());
        AbstractC20826v0.m108780Q0(getBinding().f137680q);
        binding.f137680q.setCatchTouchEventListener(new C8057d());
        binding.f137680q.m9826E(new C8058e());
        this.f44087v = true;
    }

    public final void setBinding(C29784ea c29784ea) {
        AbstractC19074t.m100208f(c29784ea, "<set-?>");
        this.f44081p = c29784ea;
    }

    public final void setFeedProfileCallback(FeedBaseAdapter.AlbumProfileCallback albumProfileCallback) {
        this.f44083r = albumProfileCallback;
    }

    public final void setHasCreateItem(boolean z11) {
        this.f44087v = z11;
    }

    public final void setHasMoreItem(boolean z11) {
        this.f44086u = z11;
    }

    public final void setLayoutManager(RecyclerView.AbstractC1888o abstractC1888o) {
        AbstractC19074t.m100208f(abstractC1888o, "<set-?>");
        this.f44084s = abstractC1888o;
    }

    public final void setMode(int i11) {
        this.f44085t = i11;
    }

    public final void setProfileSuggestAlbumAdapter(C25845a c25845a) {
        AbstractC19074t.m100208f(c25845a, "<set-?>");
        this.f44082q = c25845a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumListingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }
}
