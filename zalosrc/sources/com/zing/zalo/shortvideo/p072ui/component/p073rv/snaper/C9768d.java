package com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c20.C3227q;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingVideoItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.FollowSuggestionItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.NormalVideoItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SimpleLivestreamItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoAdsInfo;
import com.zing.zalo.shortvideo.p072ui.state.floating.FloatingManager;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.zmedia.view.ZVideoView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import java.util.ArrayList;
import java.util.List;
import pm0.C24848g0;
import q10.C25039o0;
import q20.C25090m;
import q20.C25093p;
import q20.C25097t;
import qm0.AbstractC25366r;
import qm0.AbstractC25378x;
import s20.AbstractC26112n;
import u10.C26947a;
import u10.C26948b;
import v00.AbstractC27413h;
import z10.C31179n0;

/* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d */
/* loaded from: classes5.dex */
public final class C9768d extends RecyclerView.AbstractC1892s {

    /* renamed from: a */
    private final OverScrollableRecyclerView f51278a;

    /* renamed from: b */
    private final VideoLayout f51279b;

    /* renamed from: c */
    private final C3227q f51280c;

    /* renamed from: d */
    private e f51281d;

    /* renamed from: e */
    private boolean f51282e;

    /* renamed from: f */
    private int f51283f;

    /* renamed from: g */
    private int f51284g;

    /* renamed from: h */
    private int f51285h;

    /* renamed from: i */
    private int f51286i;

    /* renamed from: j */
    private boolean f51287j;

    /* renamed from: k */
    private String f51288k;

    /* renamed from: l */
    private String f51289l;

    /* renamed from: m */
    private String f51290m;

    /* renamed from: n */
    private final ArrayList f51291n;

    /* renamed from: o */
    private SimpleLivestreamItem f51292o;

    /* renamed from: p */
    private boolean f51293p;

    /* renamed from: q */
    private InterfaceC18505l f51294q;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.AbstractC1892s {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            C9768d.this.f51285h = i11;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$b */
    /* loaded from: classes5.dex */
    public static final class b implements OverScrollableRecyclerView.InterfaceC10830a {
        b() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10830a
        /* renamed from: a */
        public void mo52660a(float f11, float f12) {
            C9768d.this.f51279b.setListPosition(f12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18509p {
        c() {
            super(2);
        }

        /* renamed from: a */
        public final void m52735a(int i11, C9769e c9769e) {
            AbstractC19074t.m100208f(c9769e, "videoSrc");
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2) {
                    if (C9768d.this.f51282e) {
                        C25097t.f120556a.m130153n(C9768d.this.f51279b.getContext(), AbstractC27413h.zch_error_play_video_failed);
                        return;
                    }
                    if (C25090m.f120499a.m130050b(C9768d.this.f51278a.getContext())) {
                        RecyclerView.AbstractC1880g adapter = C9768d.this.f51278a.getAdapter();
                        AbstractC19074t.m100206d(adapter, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.adapter.VideoAdapter");
                        C31179n0 c31179n0 = (C31179n0) adapter;
                        C9768d c9768d = C9768d.this;
                        if (!AbstractC19074t.m100204b(c31179n0.m151863d0(), "SOURCE_CHANNEL")) {
                            c31179n0.m151875s0(c9769e.m52760d());
                            c9768d.m52713A(true);
                            return;
                        }
                    }
                    C9768d.m52699G(C9768d.this, false, 1, null);
                    return;
                }
                return;
            }
            if (C9768d.this.f51282e || !C9768d.this.m52717F(true)) {
                C9768d.this.f51279b.m52620d0();
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m52735a(((Number) obj).intValue(), (C9769e) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52736a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52736a() {
            List m131496e;
            if (!C9768d.this.f51282e && C9768d.this.f51286i != 1) {
                RecyclerView.AbstractC1880g adapter = C9768d.this.f51278a.getAdapter();
                if (adapter != null) {
                    int i11 = C9768d.this.f51283f;
                    m131496e = AbstractC25366r.m131496e("TRIGGER_ENDED_VIDEO");
                    adapter.m10010r(i11, m131496e);
                }
                e m52728q = C9768d.this.m52728q();
                if (m52728q != null) {
                    m52728q.mo52741e(true);
                    return;
                }
                return;
            }
            C9768d.this.f51279b.m52620d0();
            C9768d.this.f51279b.m52608B();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$e */
    /* loaded from: classes5.dex */
    public interface e {
        /* renamed from: a */
        void mo52737a(int i11);

        /* renamed from: b */
        void mo52738b(int i11);

        /* renamed from: c */
        void mo52739c(int i11);

        /* renamed from: d */
        void mo52740d(int i11, String str);

        /* renamed from: e */
        void mo52741e(boolean z11);

        /* renamed from: f */
        void mo52742f();

        /* renamed from: g */
        void mo52743g();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f51299q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52744a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52744a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final g f51300q = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m52745a(boolean z11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52745a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ View f51301q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(View view) {
            super(1);
            this.f51301q = view;
        }

        /* renamed from: a */
        public final void m52746a(boolean z11) {
            ((VideoItem) this.f51301q).setLoadingVisible(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52746a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ View f51302q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(View view) {
            super(0);
            this.f51302q = view;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52747a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52747a() {
            ((VideoItem) this.f51302q).setThumbnailVisible(false);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$j */
    /* loaded from: classes5.dex */
    public static final class j implements NormalVideoItem.InterfaceC9636c {
        j() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9675c
        /* renamed from: b */
        public void mo52452b() {
            C9768d.this.f51279b.m52615Q();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.NormalVideoItem.InterfaceC9636c
        /* renamed from: c */
        public void mo52314c() {
            C9768d.this.f51279b.setDeferring(false);
            C9768d.this.f51279b.m52616R();
            e m52728q = C9768d.this.m52728q();
            if (m52728q != null) {
                m52728q.mo52743g();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.NormalVideoItem.InterfaceC9636c
        /* renamed from: d */
        public void mo52315d() {
            e m52728q = C9768d.this.m52728q();
            if (m52728q != null) {
                m52728q.mo52742f();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9675c
        /* renamed from: e */
        public void mo52453e() {
            C9768d.this.f51279b.m52616R();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$k */
    /* loaded from: classes5.dex */
    public static final class k implements AdvertisingVideoItem.InterfaceC9549c {

        /* renamed from: b */
        final /* synthetic */ View f51305b;

        k(View view) {
            this.f51305b = view;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingVideoItem.InterfaceC9549c
        /* renamed from: a */
        public void mo52035a() {
            e m52728q = C9768d.this.m52728q();
            if (m52728q != null) {
                m52728q.mo52741e(false);
            }
            C19205a c19205a = C19205a.f95429a;
            String string = C9768d.this.f51279b.getContext().getString(AbstractC27413h.zch_action_key_end_ad_close);
            AbstractC19074t.m100207e(string, "getString(...)");
            C19205a.m100676P(c19205a, string, ((AdvertisingVideoItem) this.f51305b).getAdvertisingVideo(), null, 4, null);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9675c
        /* renamed from: b */
        public void mo52452b() {
            C9768d.this.f51279b.m52615Q();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9675c
        /* renamed from: e */
        public void mo52453e() {
            C9768d.this.f51279b.m52616R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$l */
    /* loaded from: classes5.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final l f51306q = new l();

        l() {
            super(1);
        }

        /* renamed from: a */
        public final void m52748a(long j11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52748a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$m */
    /* loaded from: classes5.dex */
    static final class m extends AbstractC19075u implements InterfaceC18505l {
        m() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean m52749a(int i11) {
            boolean z11;
            if (i11 != C9768d.this.f51284g) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m52749a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$n */
    /* loaded from: classes5.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18505l {
        n() {
            super(1);
        }

        /* renamed from: a */
        public final void m52750a(RecyclerView recyclerView) {
            AbstractC19074t.m100208f(recyclerView, "it");
            C9768d.m52698B(C9768d.this, false, 1, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52750a((RecyclerView) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$o */
    /* loaded from: classes5.dex */
    public static final class o extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final o f51309q = new o();

        o() {
            super(1);
        }

        /* renamed from: a */
        public final void m52751a(long j11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52751a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$p */
    /* loaded from: classes5.dex */
    public static final class p extends AbstractC19075u implements InterfaceC18505l {
        p() {
            super(1);
        }

        /* renamed from: a */
        public final void m52752a(long j11) {
            if (j11 > 10000 && VideoLayout.Companion.m52630a()) {
                C9768d.this.m52717F(true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52752a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$q */
    /* loaded from: classes5.dex */
    public static final class q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ LivestreamData f51312r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(LivestreamData livestreamData) {
            super(0);
            this.f51312r = livestreamData;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52753a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52753a() {
            e m52728q = C9768d.this.m52728q();
            if (m52728q != null) {
                m52728q.mo52740d(C9768d.this.f51283f, this.f51312r.m51016f());
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$r */
    /* loaded from: classes5.dex */
    public static final class r extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final r f51313q = new r();

        r() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52754a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52754a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$s */
    /* loaded from: classes5.dex */
    public static final class s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ SimpleLivestreamItem f51314q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(SimpleLivestreamItem simpleLivestreamItem) {
            super(0);
            this.f51314q = simpleLivestreamItem;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52755a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52755a() {
            this.f51314q.setThumbnailVisible(false);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.d$t */
    /* loaded from: classes5.dex */
    public static final class t extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ SimpleLivestreamItem f51315q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(SimpleLivestreamItem simpleLivestreamItem) {
            super(1);
            this.f51315q = simpleLivestreamItem;
        }

        /* renamed from: a */
        public final void m52756a(boolean z11) {
            this.f51315q.setLoadingVisible(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52756a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    public C9768d(OverScrollableRecyclerView overScrollableRecyclerView, VideoLayout videoLayout, C3227q c3227q) {
        AbstractC19074t.m100208f(overScrollableRecyclerView, "recyclerView");
        AbstractC19074t.m100208f(videoLayout, "videoLayout");
        AbstractC19074t.m100208f(c3227q, "videoSnapper");
        this.f51278a = overScrollableRecyclerView;
        this.f51279b = videoLayout;
        this.f51280c = c3227q;
        this.f51283f = -1;
        this.f51284g = -1;
        this.f51291n = new ArrayList();
        this.f51294q = l.f51306q;
        overScrollableRecyclerView.m9826E(this);
        overScrollableRecyclerView.m9826E(new a());
        overScrollableRecyclerView.m56145b2(new b());
        videoLayout.setPlayerEndedAction(new c());
        videoLayout.setAdsShowEndedAction(new d());
    }

    /* renamed from: B */
    public static /* synthetic */ void m52698B(C9768d c9768d, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c9768d.m52713A(z11);
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m52699G(C9768d c9768d, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c9768d.m52717F(z11);
    }

    /* renamed from: O */
    private final void m52700O(SimpleLivestreamItem simpleLivestreamItem, C31179n0 c31179n0) {
        View view;
        this.f51292o = simpleLivestreamItem;
        this.f51279b.m52623i0();
        Object obj = c31179n0.f143912B.get(this.f51283f);
        if (obj != null) {
            LivestreamData livestreamData = (LivestreamData) obj;
            simpleLivestreamItem.m52374w(livestreamData.m51029q());
            LivestreamVideoLayout livestreamVideoLayout = simpleLivestreamItem.getBinding().f120153w;
            ZVideoView zVideoView = livestreamVideoLayout.getZVideoView();
            if (zVideoView == null) {
                simpleLivestreamItem.m52370r();
            } else {
                livestreamVideoLayout.m52535V(zVideoView);
            }
            this.f51294q = new p();
            livestreamVideoLayout.m52544p0();
            livestreamVideoLayout.m52526C(this.f51294q);
            livestreamVideoLayout.setOnPlayError(new q(livestreamData));
            livestreamVideoLayout.setFirstFrameAction(r.f51313q);
            livestreamVideoLayout.setDeferring(false);
            livestreamVideoLayout.m52540j0(C9766b.Companion.m52674a(livestreamData), livestreamData);
            livestreamVideoLayout.setFirstFrameAction(new s(simpleLivestreamItem));
            livestreamVideoLayout.setLoadingChangedAction(new t(simpleLivestreamItem));
            if (m52732v()) {
                OverScrollableRecyclerView overScrollableRecyclerView = this.f51278a;
                int i11 = this.f51283f;
                RecyclerView.AbstractC1888o layoutManager = overScrollableRecyclerView.getLayoutManager();
                View view2 = null;
                if (layoutManager != null) {
                    view = layoutManager.mo9732P(i11);
                } else {
                    view = null;
                }
                if (view instanceof SimpleLivestreamItem) {
                    view2 = view;
                }
                SimpleLivestreamItem simpleLivestreamItem2 = (SimpleLivestreamItem) view2;
                if (simpleLivestreamItem2 != null) {
                    simpleLivestreamItem2.m52359a();
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.data.model.LivestreamData");
    }

    /* renamed from: n */
    private final void m52708n(int i11, View view) {
        View view2;
        View view3;
        View view4;
        RecyclerView.AbstractC1880g adapter = this.f51278a.getAdapter();
        AbstractC19074t.m100206d(adapter, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.adapter.VideoAdapter");
        C31179n0 c31179n0 = (C31179n0) adapter;
        int i12 = this.f51283f;
        Object obj = null;
        if (i12 > -1) {
            RecyclerView.AbstractC1888o layoutManager = this.f51278a.getLayoutManager();
            if (layoutManager != null) {
                view3 = layoutManager.mo9732P(i12);
            } else {
                view3 = null;
            }
            if (!(view3 instanceof View)) {
                view3 = null;
            }
            if (view3 != null) {
                if (view3 instanceof VideoItem) {
                    if (view3 instanceof NormalVideoItem) {
                        ((NormalVideoItem) view3).setController(null);
                    } else if (view3 instanceof AdvertisingVideoItem) {
                        ((AdvertisingVideoItem) view3).setController(null);
                    }
                    ((VideoItem) view3).mo52021Z();
                } else if (view3 instanceof SimpleLivestreamItem) {
                    SimpleLivestreamItem simpleLivestreamItem = (SimpleLivestreamItem) view3;
                    simpleLivestreamItem.m52373v();
                    simpleLivestreamItem.m52369q();
                    m52715D();
                }
            }
            OverScrollableRecyclerView overScrollableRecyclerView = this.f51278a;
            int i13 = this.f51283f;
            RecyclerView.AbstractC1888o layoutManager2 = overScrollableRecyclerView.getLayoutManager();
            if (layoutManager2 != null) {
                view4 = layoutManager2.mo9732P(i13);
            } else {
                view4 = null;
            }
            if (!(view4 instanceof FollowSuggestionItem)) {
                view4 = null;
            }
            FollowSuggestionItem followSuggestionItem = (FollowSuggestionItem) view4;
            if (followSuggestionItem != null) {
                followSuggestionItem.m52129m();
            }
            e eVar = this.f51281d;
            if (eVar != null) {
                eVar.mo52739c(this.f51283f);
            }
            this.f51283f = -1;
        }
        if (view instanceof VideoItem) {
            this.f51283f = i11;
            this.f51279b.setFirstFrameAction(f.f51299q);
            this.f51279b.setLoadingChangedAction(g.f51300q);
            this.f51279b.setItemPosition(view.getTop());
            Object obj2 = c31179n0.f143912B.get(this.f51283f);
            if (obj2 != null) {
                Video video = (Video) obj2;
                this.f51279b.setDeferring(video.m52915v0());
                this.f51279b.m52622g0(C9769e.Companion.m52769a(video), video, this.f51287j, this.f51288k, this.f51289l, this.f51290m);
                this.f51279b.setLoadingChangedAction(new h(view));
                this.f51279b.setFirstFrameAction(new i(view));
                if (view instanceof NormalVideoItem) {
                    ((NormalVideoItem) view).setController(new j());
                    FloatingManager.C10103a c10103a = FloatingManager.Companion;
                    c10103a.m53859a(m52729r());
                    c10103a.m53864f(((VideoItem) view).getThumbnailView());
                    c10103a.m53867i(true, this.f51279b.getTag());
                } else if (view instanceof AdvertisingVideoItem) {
                    ((AdvertisingVideoItem) view).setController(new k(view));
                    FloatingManager.Companion.m53867i(false, this.f51279b.getTag());
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
            }
        } else if (view instanceof SimpleLivestreamItem) {
            this.f51283f = i11;
            SimpleLivestreamItem simpleLivestreamItem2 = (SimpleLivestreamItem) view;
            m52700O(simpleLivestreamItem2, c31179n0);
            FloatingManager.C10103a c10103a2 = FloatingManager.Companion;
            c10103a2.m53859a(simpleLivestreamItem2.getCurrentStreamData());
            LivestreamVideoLayout livestreamVideoLayout = simpleLivestreamItem2.getBinding().f120153w;
            AbstractC19074t.m100207e(livestreamVideoLayout, "lytVideo");
            c10103a2.m53865g(livestreamVideoLayout);
            c10103a2.m53864f(simpleLivestreamItem2.getThumbnailView());
            c10103a2.m53867i(true, simpleLivestreamItem2.getBinding().f120153w.getTag());
        } else {
            this.f51283f = i11;
            this.f51279b.m52623i0();
            if (m52732v()) {
                OverScrollableRecyclerView overScrollableRecyclerView2 = this.f51278a;
                int i14 = this.f51283f;
                RecyclerView.AbstractC1888o layoutManager3 = overScrollableRecyclerView2.getLayoutManager();
                if (layoutManager3 != null) {
                    view2 = layoutManager3.mo9732P(i14);
                } else {
                    view2 = null;
                }
                if (!(view2 instanceof FollowSuggestionItem)) {
                    view2 = null;
                }
                FollowSuggestionItem followSuggestionItem2 = (FollowSuggestionItem) view2;
                if (followSuggestionItem2 != null) {
                    followSuggestionItem2.m52126g();
                }
            }
            FloatingManager.Companion.m53867i(false, this.f51279b.getTag());
        }
        c31179n0.m151446O(i11);
        e eVar2 = this.f51281d;
        if (eVar2 != null) {
            eVar2.mo52737a(i11);
        }
        C25093p.Companion.m130107c(this.f51279b.getPlaylistId(), i11);
        C26947a.b bVar = C26947a.Companion;
        bVar.m138843h(this.f51279b.getPlaylistId(), i11);
        if (view instanceof AdvertisingVideoItem) {
            Object obj3 = c31179n0.f143912B.get(i11);
            if (obj3 instanceof Video) {
                obj = obj3;
            }
            Video video2 = (Video) obj;
            if (video2 != null) {
                bVar.m138842g(this.f51279b.getPlaylistId(), video2);
            }
        }
    }

    /* renamed from: o */
    private final void m52709o(View view, int i11) {
        Video advertisingVideo;
        if ((view instanceof VideoItem) && !this.f51291n.contains(Integer.valueOf(i11))) {
            VideoItem videoItem = (VideoItem) view;
            if ((videoItem.getTop() >= 0 && videoItem.getTop() < videoItem.getHeight()) || (videoItem.getTop() <= 0 && videoItem.getTop() > (-videoItem.getHeight()))) {
                this.f51291n.add(Integer.valueOf(i11));
                C25093p.Companion.m130108d(this.f51279b.getPlaylistId(), i11);
                if ((view instanceof AdvertisingVideoItem) && (advertisingVideo = ((AdvertisingVideoItem) view).getAdvertisingVideo()) != null) {
                    m52711w(advertisingVideo);
                }
            }
        }
    }

    /* renamed from: u */
    private final VideoItem m52710u() {
        RecyclerView.AbstractC1888o layoutManager = this.f51278a.getLayoutManager();
        if (layoutManager == null) {
            return null;
        }
        View mo10402h = this.f51280c.mo10402h(layoutManager);
        if (!(mo10402h instanceof VideoItem)) {
            return null;
        }
        return (VideoItem) mo10402h;
    }

    /* renamed from: w */
    private final void m52711w(Video video) {
        String str;
        String str2;
        int m52933i;
        C19205a c19205a = C19205a.f95429a;
        VideoAdsInfo m52881b = video.m52881b();
        Integer num = null;
        if (m52881b != null) {
            str = m52881b.m52928d();
        } else {
            str = null;
        }
        VideoAdsInfo m52881b2 = video.m52881b();
        if (m52881b2 != null) {
            str2 = m52881b2.m52929e();
        } else {
            str2 = null;
        }
        C26947a.b bVar = C26947a.Companion;
        C26948b.a m138839b = bVar.m138839b(this.f51279b.getPlaylistId(), video);
        if (m138839b != null) {
            m52933i = m138839b.m138882c();
        } else {
            VideoAdsInfo m52881b3 = video.m52881b();
            if (m52881b3 != null) {
                m52933i = m52881b3.m52933i();
            }
            c19205a.m100722Y(str, str2, num, Integer.valueOf(bVar.m138841f(this.f51279b.getPlaylistId())));
        }
        num = Integer.valueOf(m52933i);
        c19205a.m100722Y(str, str2, num, Integer.valueOf(bVar.m138841f(this.f51279b.getPlaylistId())));
    }

    /* renamed from: z */
    private final void m52712z() {
        RecyclerView.AbstractC1880g adapter = this.f51278a.getAdapter();
        AbstractC19074t.m100206d(adapter, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.adapter.VideoAdapter");
        ((C31179n0) adapter).m151879w0(this.f51278a);
    }

    /* renamed from: A */
    public final void m52713A(boolean z11) {
        FloatingManager.Companion.m53867i(false, this.f51279b.getTag());
        this.f51279b.m52623i0();
        SimpleLivestreamItem simpleLivestreamItem = this.f51292o;
        if (simpleLivestreamItem != null) {
            simpleLivestreamItem.m52372u();
        }
        if (z11) {
            AbstractC26112n.m134406k(this.f51278a, new n());
            return;
        }
        e eVar = this.f51281d;
        if (eVar != null) {
            eVar.mo52739c(this.f51283f);
        }
        this.f51283f = -1;
        mo10176d(this.f51278a, 0, 0);
    }

    /* renamed from: C */
    public final void m52714C() {
        SimpleLivestreamItem simpleLivestreamItem;
        this.f51279b.m52617a0();
        if (!this.f51293p && (simpleLivestreamItem = this.f51292o) != null) {
            simpleLivestreamItem.m52369q();
        }
    }

    /* renamed from: D */
    public final void m52715D() {
        C25039o0 binding;
        LivestreamVideoLayout livestreamVideoLayout;
        SimpleLivestreamItem simpleLivestreamItem = this.f51292o;
        if (simpleLivestreamItem != null && (binding = simpleLivestreamItem.getBinding()) != null && (livestreamVideoLayout = binding.f120153w) != null) {
            livestreamVideoLayout.m52538c0(this.f51294q);
        }
        this.f51294q = o.f51309q;
    }

    /* renamed from: E */
    public final boolean m52716E() {
        int i11 = this.f51284g;
        if (i11 != -1) {
            this.f51280c.m16366u(i11);
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean m52717F(boolean z11) {
        int i11;
        int i12 = this.f51284g;
        RecyclerView.AbstractC1880g adapter = this.f51278a.getAdapter();
        if (adapter != null) {
            i11 = adapter.mo10003k();
        } else {
            i11 = 0;
        }
        if (i12 >= i11 - 1) {
            return false;
        }
        this.f51280c.m16366u(this.f51284g + 1);
        this.f51287j = z11;
        return true;
    }

    /* renamed from: H */
    public final void m52718H(e eVar) {
        this.f51281d = eVar;
    }

    /* renamed from: I */
    public final void m52719I(String str) {
        this.f51290m = str;
    }

    /* renamed from: J */
    public final void m52720J(boolean z11) {
        this.f51282e = z11;
        SimpleLivestreamItem simpleLivestreamItem = this.f51292o;
        if (simpleLivestreamItem != null) {
            simpleLivestreamItem.setDeferring(z11);
        }
    }

    /* renamed from: K */
    public final void m52721K(String str) {
        this.f51289l = str;
    }

    /* renamed from: L */
    public final void m52722L(int i11) {
        this.f51286i = i11;
    }

    /* renamed from: M */
    public final void m52723M(boolean z11) {
        this.f51293p = z11;
    }

    /* renamed from: N */
    public final void m52724N(String str) {
        this.f51288k = str;
    }

    /* renamed from: P */
    public final void m52725P(int i11) {
        this.f51280c.m16366u(i11);
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
            View mo10402h = this.f51280c.mo10402h(layoutManager);
            if (mo10402h != null) {
                this.f51284g = layoutManager.m10112b(mo10402h);
                view = mo10402h;
            }
            if (view != null && (i12 = this.f51284g) >= 0 && i12 <= c31179n0.mo10003k() - 1) {
                if (view.getTop() == 0) {
                    AbstractC25378x.m131542D(this.f51291n, new m());
                    e eVar = this.f51281d;
                    if (eVar != null) {
                        eVar.mo52738b(this.f51284g);
                    }
                    m52712z();
                } else {
                    this.f51280c.m16366u(this.f51284g);
                }
                int i13 = this.f51283f;
                int i14 = this.f51284g;
                if (i13 != i14) {
                    m52708n(i14, view);
                }
                this.f51287j = false;
            } else {
                return;
            }
        }
        this.f51285h = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
    /* renamed from: d */
    public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
        View mo10402h;
        int top;
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (mo10402h = this.f51280c.mo10402h(layoutManager)) == null) {
            return;
        }
        int m10112b = layoutManager.m10112b(mo10402h);
        this.f51284g = m10112b;
        View mo9732P = layoutManager.mo9732P(m10112b - 1);
        View mo9732P2 = layoutManager.mo9732P(this.f51284g + 1);
        m52709o(mo10402h, this.f51284g);
        m52709o(mo9732P, this.f51284g - 1);
        m52709o(mo9732P2, this.f51284g + 1);
        VideoLayout videoLayout = this.f51279b;
        int i13 = this.f51283f;
        int i14 = this.f51284g;
        if (i13 == i14 - 1) {
            if (mo9732P != null) {
                top = mo9732P.getTop();
            } else {
                top = mo10402h.getTop();
            }
        } else if (i13 == i14 + 1) {
            if (mo9732P2 != null) {
                top = mo9732P2.getTop();
            } else {
                top = mo10402h.getTop();
            }
        } else {
            top = mo10402h.getTop();
        }
        videoLayout.setItemPosition(top);
        if (this.f51283f == -1 && this.f51285h == 0) {
            e eVar = this.f51281d;
            if (eVar != null) {
                eVar.mo52738b(this.f51284g);
            }
            m52708n(this.f51284g, mo10402h);
            m52712z();
            return;
        }
        if (this.f51285h == 2) {
            if (i12 > 0 && mo10402h.getTop() > 0) {
                int i15 = this.f51283f;
                int i16 = this.f51284g;
                if (i15 != i16) {
                    m52708n(i16, mo10402h);
                    return;
                }
                return;
            }
            if (i12 > 0 && mo10402h.getTop() < 0) {
                int i17 = this.f51283f;
                int i18 = this.f51284g;
                if (i17 == i18) {
                    int i19 = i18 + 1;
                    if (mo9732P2 == null) {
                        return;
                    }
                    m52708n(i19, mo9732P2);
                    return;
                }
                return;
            }
            if (i12 < 0 && mo10402h.getTop() > 0) {
                int i21 = this.f51283f;
                int i22 = this.f51284g;
                if (i21 == i22) {
                    int i23 = i22 - 1;
                    if (mo9732P == null) {
                        return;
                    }
                    m52708n(i23, mo9732P);
                    return;
                }
                return;
            }
            if (i12 < 0 && mo10402h.getTop() < 0) {
                int i24 = this.f51283f;
                int i25 = this.f51284g;
                if (i24 != i25) {
                    m52708n(i25, mo10402h);
                }
            }
        }
    }

    /* renamed from: m */
    public final void m52726m() {
        View view;
        this.f51279b.m52624u();
        OverScrollableRecyclerView overScrollableRecyclerView = this.f51278a;
        int i11 = this.f51284g;
        RecyclerView.AbstractC1888o layoutManager = overScrollableRecyclerView.getLayoutManager();
        C31179n0 c31179n0 = null;
        if (layoutManager != null) {
            view = layoutManager.mo9732P(i11);
        } else {
            view = null;
        }
        if (!(view instanceof FollowSuggestionItem)) {
            view = null;
        }
        FollowSuggestionItem followSuggestionItem = (FollowSuggestionItem) view;
        if (followSuggestionItem != null) {
            followSuggestionItem.m52126g();
        }
        boolean z11 = false;
        this.f51293p = false;
        SimpleLivestreamItem simpleLivestreamItem = this.f51292o;
        if (simpleLivestreamItem == null) {
            FloatingManager.C10103a c10103a = FloatingManager.Companion;
            c10103a.m53859a(m52729r());
            c10103a.m53866h(this.f51279b);
            RecyclerView.AbstractC1880g adapter = this.f51278a.getAdapter();
            if (adapter instanceof C31179n0) {
                c31179n0 = (C31179n0) adapter;
            }
            if (m52731t() != -1 && c31179n0 != null && c31179n0.mo151443L()) {
                if (c31179n0.mo10005m(m52731t()) == 0) {
                    z11 = true;
                }
                c10103a.m53867i(z11, this.f51279b.getTag());
            } else {
                c10103a.m53867i(false, this.f51279b.getTag());
            }
            VideoItem m52710u = m52710u();
            if (m52710u != null) {
                c10103a.m53864f(m52710u.getThumbnailView());
                return;
            }
            return;
        }
        if (simpleLivestreamItem != null) {
            RecyclerView.AbstractC1880g adapter2 = this.f51278a.getAdapter();
            AbstractC19074t.m100206d(adapter2, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.adapter.VideoAdapter");
            C31179n0 c31179n02 = (C31179n0) adapter2;
            if (!simpleLivestreamItem.m52365i()) {
                simpleLivestreamItem.m52370r();
                m52700O(simpleLivestreamItem, c31179n02);
            }
            simpleLivestreamItem.m52359a();
            FloatingManager.C10103a c10103a2 = FloatingManager.Companion;
            c10103a2.m53859a(simpleLivestreamItem.getCurrentStreamData());
            LivestreamVideoLayout livestreamVideoLayout = simpleLivestreamItem.getBinding().f120153w;
            AbstractC19074t.m100207e(livestreamVideoLayout, "lytVideo");
            c10103a2.m53865g(livestreamVideoLayout);
            c10103a2.m53867i(true, simpleLivestreamItem.getBinding().f120153w.getTag());
            c10103a2.m53864f(simpleLivestreamItem.getThumbnailView());
        }
    }

    /* renamed from: p */
    public final void m52727p() {
        View view;
        this.f51279b.m52627x();
        OverScrollableRecyclerView overScrollableRecyclerView = this.f51278a;
        int i11 = this.f51284g;
        RecyclerView.AbstractC1888o layoutManager = overScrollableRecyclerView.getLayoutManager();
        View view2 = null;
        if (layoutManager != null) {
            view = layoutManager.mo9732P(i11);
        } else {
            view = null;
        }
        if (view instanceof FollowSuggestionItem) {
            view2 = view;
        }
        FollowSuggestionItem followSuggestionItem = (FollowSuggestionItem) view2;
        if (followSuggestionItem != null) {
            followSuggestionItem.m52129m();
        }
        if (!this.f51293p) {
            SimpleLivestreamItem simpleLivestreamItem = this.f51292o;
            if (simpleLivestreamItem != null) {
                simpleLivestreamItem.m52364h();
                return;
            }
            return;
        }
        SimpleLivestreamItem simpleLivestreamItem2 = this.f51292o;
        if (simpleLivestreamItem2 != null) {
            simpleLivestreamItem2.m52373v();
        }
    }

    /* renamed from: q */
    public final e m52728q() {
        return this.f51281d;
    }

    /* renamed from: r */
    public final Video m52729r() {
        return this.f51279b.getCurrentVideo();
    }

    /* renamed from: s */
    public final int m52730s() {
        return this.f51283f;
    }

    /* renamed from: t */
    public final int m52731t() {
        return this.f51284g;
    }

    /* renamed from: v */
    public final boolean m52732v() {
        SimpleLivestreamItem simpleLivestreamItem;
        if (!this.f51279b.m52612F() && ((simpleLivestreamItem = this.f51292o) == null || !simpleLivestreamItem.m52366j())) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final void m52733x() {
        SimpleLivestreamItem simpleLivestreamItem;
        this.f51279b.m52615Q();
        if (!this.f51293p && (simpleLivestreamItem = this.f51292o) != null) {
            simpleLivestreamItem.m52367n();
        }
    }

    /* renamed from: y */
    public final void m52734y() {
        SimpleLivestreamItem simpleLivestreamItem;
        this.f51279b.m52616R();
        if (!this.f51293p && (simpleLivestreamItem = this.f51292o) != null) {
            simpleLivestreamItem.m52368p();
        }
    }
}
