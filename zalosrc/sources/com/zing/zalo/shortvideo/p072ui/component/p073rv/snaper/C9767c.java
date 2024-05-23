package com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c20.C3212b;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem;
import com.zing.zalo.shortvideo.p072ui.state.floating.FloatingManager;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p10.EnumC24601e;
import pm0.C24848g0;
import z10.C31178n;
import z10.C31179n0;

/* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.c */
/* loaded from: classes5.dex */
public final class C9767c extends RecyclerView.AbstractC1892s {

    /* renamed from: a */
    private final OverScrollableRecyclerView f51264a;

    /* renamed from: b */
    private final LivestreamVideoLayout f51265b;

    /* renamed from: c */
    private final C3212b f51266c;

    /* renamed from: d */
    private LivestreamData f51267d;

    /* renamed from: e */
    private c f51268e;

    /* renamed from: f */
    private int f51269f;

    /* renamed from: g */
    private int f51270g;

    /* renamed from: h */
    private int f51271h;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.c$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.AbstractC1892s {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            C9767c.this.f51271h = i11;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.c$b */
    /* loaded from: classes5.dex */
    public static final class b implements OverScrollableRecyclerView.InterfaceC10830a {
        b() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10830a
        /* renamed from: a */
        public void mo52660a(float f11, float f12) {
            C9767c.this.f51265b.setListPosition(f12);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.c$c */
    /* loaded from: classes5.dex */
    public interface c {
        /* renamed from: a */
        void mo52692a(int i11);

        /* renamed from: b */
        void mo52693b(int i11);

        /* renamed from: c */
        void mo52694c(int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.c$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f51274q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52695a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52695a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.c$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ View f51275q;

        /* renamed from: r */
        final /* synthetic */ LivestreamData f51276r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(View view, LivestreamData livestreamData) {
            super(0);
            this.f51275q = view;
            this.f51276r = livestreamData;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52696a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52696a() {
            ((LivestreamItem) this.f51275q).setThumbnailVisible(false);
            if (this.f51276r.m51022j() > 1.0f) {
                ((LivestreamItem) this.f51275q).m52264x0(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.c$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ View f51277q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(1);
            this.f51277q = view;
        }

        /* renamed from: a */
        public final void m52697a(boolean z11) {
            ((LivestreamItem) this.f51277q).setLoadingVisible(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52697a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    public C9767c(OverScrollableRecyclerView overScrollableRecyclerView, LivestreamVideoLayout livestreamVideoLayout, C3212b c3212b, LivestreamData livestreamData) {
        AbstractC19074t.m100208f(overScrollableRecyclerView, "recyclerView");
        AbstractC19074t.m100208f(livestreamVideoLayout, "streamLayout");
        AbstractC19074t.m100208f(c3212b, "videoSnapper");
        this.f51264a = overScrollableRecyclerView;
        this.f51265b = livestreamVideoLayout;
        this.f51266c = c3212b;
        this.f51267d = livestreamData;
        this.f51269f = -1;
        this.f51270g = -1;
        overScrollableRecyclerView.m9826E(this);
        overScrollableRecyclerView.m9826E(new a());
        overScrollableRecyclerView.m56145b2(new b());
    }

    /* renamed from: i */
    private final void m52678i(int i11, View view) {
        String str;
        View view2;
        RecyclerView.AbstractC1880g adapter = this.f51264a.getAdapter();
        AbstractC19074t.m100206d(adapter, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.adapter.LivestreamAdapter");
        C31178n c31178n = (C31178n) adapter;
        int i12 = this.f51269f;
        if (i12 > -1) {
            RecyclerView.AbstractC1888o layoutManager = this.f51264a.getLayoutManager();
            if (layoutManager != null) {
                view2 = layoutManager.mo9732P(i12);
            } else {
                view2 = null;
            }
            if (!(view2 instanceof LivestreamItem)) {
                view2 = null;
            }
            LivestreamItem livestreamItem = (LivestreamItem) view2;
            if (livestreamItem != null) {
                this.f51265b.m52531J(true);
                livestreamItem.m52255p0();
            }
            c cVar = this.f51268e;
            if (cVar != null) {
                cVar.mo52694c(this.f51269f);
            }
            this.f51269f = -1;
        }
        if (view instanceof LivestreamItem) {
            this.f51269f = i11;
            this.f51265b.m52545q0();
            this.f51265b.setFirstFrameAction(d.f51274q);
            this.f51265b.setItemPosition(view.getTop());
            LivestreamItem livestreamItem2 = (LivestreamItem) view;
            this.f51265b.setSharedVideoLayoutor(livestreamItem2.getVideoLayoutor());
            LivestreamData m151826T = c31178n.m151826T(this.f51269f);
            livestreamItem2.setCurrentStream(m151826T);
            livestreamItem2.m52257q0();
            if (m151826T.m51022j() <= 1.0f || m151826T.m51029q() == EnumC24601e.f118373r.m128090c() || m151826T.m51029q() == EnumC24601e.f118375t.m128090c()) {
                livestreamItem2.m52264x0(false);
            }
            this.f51265b.setDeferring(false);
            LivestreamData livestreamData = this.f51267d;
            if (livestreamData != null) {
                if (livestreamData != null) {
                    str = livestreamData.m51016f();
                } else {
                    str = null;
                }
                if (AbstractC19074t.m100204b(str, m151826T.m51016f())) {
                    if (m151826T.m51022j() > 1.0f) {
                        livestreamItem2.m52264x0(true);
                    }
                    this.f51265b.m52541k0();
                    this.f51267d = null;
                    livestreamItem2.setThumbnailVisible(false);
                    this.f51265b.setFirstFrameAction(new e(view, m151826T));
                    this.f51265b.setLoadingChangedAction(new f(view));
                    livestreamItem2.m52260t0();
                    FloatingManager.C10103a c10103a = FloatingManager.Companion;
                    c10103a.m53859a(m52681k());
                    c10103a.m53864f(livestreamItem2.getThumbnailView());
                }
            }
            this.f51265b.m52540j0(C9766b.Companion.m52674a(m151826T), m151826T);
            this.f51265b.setFirstFrameAction(new e(view, m151826T));
            this.f51265b.setLoadingChangedAction(new f(view));
            livestreamItem2.m52260t0();
            FloatingManager.C10103a c10103a2 = FloatingManager.Companion;
            c10103a2.m53859a(m52681k());
            c10103a2.m53864f(livestreamItem2.getThumbnailView());
        }
        c31178n.m151446O(i11);
        c cVar2 = this.f51268e;
        if (cVar2 != null) {
            cVar2.mo52692a(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
    /* renamed from: b */
    public void mo952b(RecyclerView recyclerView, int i11) {
        C31179n0 c31179n0;
        int i12;
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        if (i11 == 0) {
            RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                return;
            }
            RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
            View view = null;
            if (adapter instanceof C31179n0) {
                c31179n0 = (C31179n0) adapter;
            } else {
                c31179n0 = null;
            }
            if (c31179n0 == null) {
                return;
            }
            View mo10402h = this.f51266c.mo10402h(layoutManager);
            if (mo10402h != null) {
                this.f51270g = layoutManager.m10112b(mo10402h);
                view = mo10402h;
            }
            if (view != null && (i12 = this.f51270g) >= 0 && i12 <= c31179n0.mo10003k() - 1) {
                if (view.getTop() != 0) {
                    this.f51266c.m16327t(this.f51270g);
                } else {
                    c cVar = this.f51268e;
                    if (cVar != null) {
                        cVar.mo52693b(this.f51270g);
                    }
                }
                int i13 = this.f51269f;
                int i14 = this.f51270g;
                if (i13 != i14) {
                    m52678i(i14, view);
                }
            } else {
                return;
            }
        }
        this.f51271h = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
    /* renamed from: d */
    public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
        View mo10402h;
        int top;
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (mo10402h = this.f51266c.mo10402h(layoutManager)) == null) {
            return;
        }
        int m10112b = layoutManager.m10112b(mo10402h);
        this.f51270g = m10112b;
        View mo9732P = layoutManager.mo9732P(m10112b - 1);
        View mo9732P2 = layoutManager.mo9732P(this.f51270g + 1);
        if (i12 != 0 && recyclerView.getScrollState() == 1 && this.f51270g == this.f51269f) {
            RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
            AbstractC19074t.m100206d(adapter, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.adapter.LivestreamAdapter");
            C31178n c31178n = (C31178n) adapter;
            if (mo10402h.getTop() < 0 && this.f51269f + 1 < c31178n.mo10003k()) {
                LivestreamData m151826T = c31178n.m151826T(this.f51269f + 1);
                this.f51265b.m52534U(C9766b.Companion.m52674a(m151826T), m151826T);
            } else if (mo10402h.getTop() > 0) {
                int i13 = this.f51269f;
                if (i13 - 1 >= 0) {
                    LivestreamData m151826T2 = c31178n.m151826T(i13 - 1);
                    this.f51265b.m52534U(C9766b.Companion.m52674a(m151826T2), m151826T2);
                }
            }
        }
        LivestreamVideoLayout livestreamVideoLayout = this.f51265b;
        int i14 = this.f51269f;
        int i15 = this.f51270g;
        if (i14 == i15 - 1) {
            if (mo9732P != null) {
                top = mo9732P.getTop();
            } else {
                top = mo10402h.getTop();
            }
        } else if (i14 == i15 + 1) {
            if (mo9732P2 != null) {
                top = mo9732P2.getTop();
            } else {
                top = mo10402h.getTop();
            }
        } else {
            top = mo10402h.getTop();
        }
        livestreamVideoLayout.setItemPosition(top);
        if (this.f51269f == -1 && this.f51271h == 0) {
            c cVar = this.f51268e;
            if (cVar != null) {
                cVar.mo52693b(this.f51270g);
            }
            m52678i(this.f51270g, mo10402h);
            return;
        }
        if (this.f51271h == 2) {
            if (i12 > 0 && mo10402h.getTop() > 0) {
                int i16 = this.f51269f;
                int i17 = this.f51270g;
                if (i16 != i17) {
                    m52678i(i17, mo10402h);
                    return;
                }
                return;
            }
            if (i12 > 0 && mo10402h.getTop() < 0) {
                int i18 = this.f51269f;
                int i19 = this.f51270g;
                if (i18 == i19) {
                    int i21 = i19 + 1;
                    if (mo9732P2 == null) {
                        return;
                    }
                    m52678i(i21, mo9732P2);
                    return;
                }
                return;
            }
            if (i12 < 0 && mo10402h.getTop() > 0) {
                int i22 = this.f51269f;
                int i23 = this.f51270g;
                if (i22 == i23) {
                    int i24 = i23 - 1;
                    if (mo9732P == null) {
                        return;
                    }
                    m52678i(i24, mo9732P);
                    return;
                }
                return;
            }
            if (i12 < 0 && mo10402h.getTop() < 0) {
                int i25 = this.f51269f;
                int i26 = this.f51270g;
                if (i25 != i26) {
                    m52678i(i26, mo10402h);
                }
            }
        }
    }

    /* renamed from: h */
    public final void m52679h() {
        this.f51265b.m52525B();
        FloatingManager.C10103a c10103a = FloatingManager.Companion;
        c10103a.m53859a(m52681k());
        c10103a.m53865g(this.f51265b);
        LivestreamItem m52684n = m52684n();
        if (m52684n != null) {
            c10103a.m53864f(m52684n.getThumbnailView());
        }
    }

    /* renamed from: j */
    public final void m52680j() {
        this.f51265b.m52527E();
    }

    /* renamed from: k */
    public final LivestreamData m52681k() {
        return this.f51265b.getCurrentStreamData();
    }

    /* renamed from: l */
    public final int m52682l() {
        return this.f51269f;
    }

    /* renamed from: m */
    public final int m52683m() {
        return this.f51270g;
    }

    /* renamed from: n */
    public final LivestreamItem m52684n() {
        RecyclerView.AbstractC1888o layoutManager = this.f51264a.getLayoutManager();
        if (layoutManager == null) {
            return null;
        }
        View mo10402h = this.f51266c.mo10402h(layoutManager);
        if (!(mo10402h instanceof LivestreamItem)) {
            return null;
        }
        return (LivestreamItem) mo10402h;
    }

    /* renamed from: o */
    public final LivestreamItem m52685o(int i11) {
        View view;
        RecyclerView.AbstractC1888o layoutManager = this.f51264a.getLayoutManager();
        View view2 = null;
        if (layoutManager != null) {
            view = layoutManager.mo9732P(i11);
        } else {
            view = null;
        }
        if (view instanceof LivestreamItem) {
            view2 = view;
        }
        return (LivestreamItem) view2;
    }

    /* renamed from: p */
    public final boolean m52686p() {
        return this.f51265b.m52528F();
    }

    /* renamed from: q */
    public final void m52687q() {
        this.f51265b.m52536Y();
    }

    /* renamed from: r */
    public final void m52688r() {
        this.f51267d = null;
    }

    /* renamed from: s */
    public final boolean m52689s() {
        int i11 = this.f51270g;
        if (i11 != -1) {
            this.f51266c.m16327t(i11);
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final void m52690t(c cVar) {
        this.f51268e = cVar;
    }

    /* renamed from: u */
    public final void m52691u(int i11) {
        this.f51266c.m16327t(i11);
    }
}
