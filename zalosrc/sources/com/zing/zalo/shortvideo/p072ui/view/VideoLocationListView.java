package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.os.AbstractC1438d;
import androidx.lifecycle.AbstractC1785o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.VideoLocationData;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView;
import com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoLocationHeader;
import com.zing.zalo.shortvideo.p072ui.receiver.LoadMoreVideoReceiver;
import com.zing.zalo.shortvideo.p072ui.view.VideoLocationListView;
import com.zing.zalo.shortvideo.p072ui.widget.HeaderLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRefreshBar;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19738v;
import java.util.Iterator;
import java.util.UUID;
import k20.C21456b;
import ln0.C22537f;
import m20.InterfaceC22730c2;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25013h1;
import qm0.AbstractC25351j0;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import w00.AbstractC28684a;
import z10.C31181o0;

/* loaded from: classes5.dex */
public final class VideoLocationListView extends ZchBaseView implements InterfaceC22730c2, C21456b.c {
    public static final C10516a Companion = new C10516a(null);

    /* renamed from: A0 */
    private C25013h1 f53475A0;

    /* renamed from: B0 */
    private C31181o0 f53476B0;

    /* renamed from: C0 */
    private OverScrollableRecyclerView.GridLayoutManager f53477C0;

    /* renamed from: D0 */
    private LoadMoreVideoReceiver f53478D0;

    /* renamed from: E0 */
    private final String f53479E0;

    /* renamed from: F0 */
    private String f53480F0;

    /* renamed from: G0 */
    private Float f53481G0;

    /* renamed from: z0 */
    private InterfaceC19738v f53482z0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoLocationListView$a */
    /* loaded from: classes5.dex */
    public static final class C10516a {
        private C10516a() {
        }

        public /* synthetic */ C10516a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final VideoLocationListView m55142a(String str) {
            AbstractC19074t.m100208f(str, "locationValue");
            VideoLocationListView videoLocationListView = new VideoLocationListView();
            videoLocationListView.mo60305zK(VideoLocationListView.Companion.m55143b(str));
            return videoLocationListView;
        }

        /* renamed from: b */
        public final Bundle m55143b(String str) {
            AbstractC19074t.m100208f(str, "locationValue");
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("VIDEO_LOCATION_VALUE", str));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoLocationListView$b */
    /* loaded from: classes5.dex */
    private final class C10517b extends RecyclerView.AbstractC1892s {
        public C10517b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            VideoLocationListView.this.m55135aL();
            if (i12 != 0) {
                VideoLocationListView.this.m55137cL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoLocationListView$c */
    /* loaded from: classes5.dex */
    static final class C10518c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25013h1 f53484q;

        /* renamed from: r */
        final /* synthetic */ VideoLocationListView f53485r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10518c(C25013h1 c25013h1, VideoLocationListView videoLocationListView) {
            super(0);
            this.f53484q = c25013h1;
            this.f53485r = videoLocationListView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55144a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55144a() {
            this.f53484q.f119939s.m55786j();
            InterfaceC19738v interfaceC19738v = this.f53485r.f53482z0;
            if (interfaceC19738v == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19738v = null;
            }
            interfaceC19738v.mo53507i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoLocationListView$d */
    /* loaded from: classes5.dex */
    static final class C10519d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25013h1 f53486q;

        /* renamed from: r */
        final /* synthetic */ VideoLocationListView f53487r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10519d(C25013h1 c25013h1, VideoLocationListView videoLocationListView) {
            super(0);
            this.f53486q = c25013h1;
            this.f53487r = videoLocationListView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55145a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55145a() {
            this.f53486q.f119939s.m55786j();
            InterfaceC19738v interfaceC19738v = this.f53487r.f53482z0;
            if (interfaceC19738v == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19738v = null;
            }
            interfaceC19738v.mo53507i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoLocationListView$e */
    /* loaded from: classes5.dex */
    public static final class C10520e implements C31181o0.b {
        C10520e() {
        }

        @Override // z10.C31181o0.b
        /* renamed from: a */
        public void mo55146a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            InterfaceC19738v interfaceC19738v = VideoLocationListView.this.f53482z0;
            if (interfaceC19738v == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19738v = null;
            }
            interfaceC19738v.mo53506a(loadMoreInfo);
        }

        @Override // z10.C31181o0.b
        /* renamed from: b */
        public void mo55147b(Section section, int i11) {
            AbstractC19074t.m100208f(section, "section");
            VideoLocationListView.this.m55551QK(VideoChannelPagerView.Companion.m55122k(VideoLocationListView.this.f53480F0, section, i11, VideoLocationListView.this.f53479E0));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoLocationListView$f */
    /* loaded from: classes5.dex */
    static final class C10521f extends AbstractC19075u implements InterfaceC18509p {
        C10521f() {
            super(2);
        }

        /* renamed from: a */
        public final void m55148a(String str, String str2) {
            Section mo146381t;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            if (AbstractC19074t.m100204b(VideoLocationListView.this.f53479E0, str2) && AbstractC19074t.m100204b(str, VideoLocationListView.this.f53480F0) && (mo146381t = AbstractC28684a.Companion.m143692z().mo146381t(str)) != null) {
                VideoLocationListView.this.mo55141e(mo146381t);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m55148a((String) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoLocationListView$g */
    /* loaded from: classes5.dex */
    static final class C10522g extends AbstractC19075u implements InterfaceC18511r {
        C10522g() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m55149a((String) obj, ((Number) obj2).intValue(), (String) obj3, (String) obj4);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55149a(String str, int i11, String str2, String str3) {
            C31181o0 c31181o0;
            int m151902T;
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            AbstractC19074t.m100208f(str3, "videoId");
            if (AbstractC19074t.m100204b(VideoLocationListView.this.f53479E0, str2) && (c31181o0 = VideoLocationListView.this.f53476B0) != null && AbstractC19074t.m100204b(str, VideoLocationListView.this.f53480F0) && (m151902T = c31181o0.m151902T(str3)) >= 0 && m151902T < c31181o0.mo10003k() && (gridLayoutManager = VideoLocationListView.this.f53477C0) != null) {
                gridLayoutManager.mo9756v1(m151902T);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoLocationListView$h */
    /* loaded from: classes5.dex */
    public static final class C10523h extends GridLayoutManager.AbstractC1865b {
        C10523h() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            C31181o0 c31181o0 = VideoLocationListView.this.f53476B0;
            if (c31181o0 == null || !c31181o0.m151905X(i11)) {
                return 1;
            }
            return 2;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoLocationListView$i */
    /* loaded from: classes5.dex */
    public static final class C10524i implements OverScrollableRecyclerView.InterfaceC10832c {
        C10524i() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31181o0 c31181o0;
            C31181o0 c31181o02 = VideoLocationListView.this.f53476B0;
            if (c31181o02 != null && !c31181o02.m151444M() && (c31181o0 = VideoLocationListView.this.f53476B0) != null) {
                c31181o0.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoLocationListView$j */
    /* loaded from: classes5.dex */
    static final class C10525j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f53493q;

        /* renamed from: r */
        final /* synthetic */ VideoLocationListView f53494r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10525j(String str, VideoLocationListView videoLocationListView) {
            super(1);
            this.f53493q = str;
            this.f53494r = videoLocationListView;
        }

        /* renamed from: a */
        public final void m55150a(View view) {
            AbstractC19074t.m100208f(view, "it");
            ShareBottomSheet m51921c = ShareBottomSheet.Companion.m51921c(this.f53493q);
            C17487o0 m92649TI = this.f53494r.m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            BaseBottomSheetView.m51747hL(m51921c, m92649TI, null, 2, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55150a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public VideoLocationListView() {
        String uuid = UUID.randomUUID().toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        this.f53479E0 = uuid;
        this.f53480F0 = "";
    }

    /* renamed from: aL */
    public final void m55135aL() {
        C25013h1 c25013h1;
        OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = this.f53477C0;
        if (gridLayoutManager != null) {
            int m9740Y1 = gridLayoutManager.m9740Y1();
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager2 = this.f53477C0;
            if (gridLayoutManager2 != null) {
                Iterator it = new C22537f(m9740Y1, gridLayoutManager2.m9745c2()).iterator();
                boolean z11 = false;
                while (true) {
                    c25013h1 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    int mo116552a = ((AbstractC25351j0) it).mo116552a();
                    C25013h1 c25013h12 = this.f53475A0;
                    if (c25013h12 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25013h12 = null;
                    }
                    RecyclerView.AbstractC1876c0 m9900t0 = c25013h12.f119941u.m9900t0(mo116552a);
                    if (m9900t0 instanceof C31181o0.d) {
                        Rect rect = new Rect();
                        View view = ((C31181o0.d) m9900t0).f7784p;
                        AbstractC19074t.m100207e(view, "itemView");
                        boolean localVisibleRect = view.getLocalVisibleRect(rect);
                        double height = rect.height() / view.getMeasuredHeight();
                        z11 = true;
                        if (localVisibleRect) {
                            float f11 = 1 - ((float) height);
                            this.f53481G0 = Float.valueOf(f11);
                            C25013h1 c25013h13 = this.f53475A0;
                            if (c25013h13 == null) {
                                AbstractC19074t.m100223u("binding");
                            } else {
                                c25013h1 = c25013h13;
                            }
                            c25013h1.f119938r.f119995w.setAlpha(f11);
                        } else {
                            this.f53481G0 = Float.valueOf(1.0f);
                            C25013h1 c25013h14 = this.f53475A0;
                            if (c25013h14 == null) {
                                AbstractC19074t.m100223u("binding");
                            } else {
                                c25013h1 = c25013h14;
                            }
                            c25013h1.f119938r.f119995w.setAlpha(1.0f);
                        }
                    }
                }
                if (!z11 && !AbstractC19074t.m100203a(this.f53481G0, 1.0f)) {
                    this.f53481G0 = Float.valueOf(1.0f);
                    C25013h1 c25013h15 = this.f53475A0;
                    if (c25013h15 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c25013h1 = c25013h15;
                    }
                    c25013h1.f119938r.f119995w.setAlpha(1.0f);
                }
            }
        }
    }

    /* renamed from: bL */
    public static final void m55136bL(VideoLocationListView videoLocationListView, View view) {
        AbstractC19074t.m100208f(videoLocationListView, "this$0");
        videoLocationListView.finish();
    }

    /* renamed from: cL */
    public final void m55137cL() {
        OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = this.f53477C0;
        if (gridLayoutManager != null) {
            int m9740Y1 = gridLayoutManager.m9740Y1();
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager2 = this.f53477C0;
            if (gridLayoutManager2 != null) {
                Iterator it = new C22537f(m9740Y1, gridLayoutManager2.m9745c2()).iterator();
                while (it.hasNext()) {
                    int mo116552a = ((AbstractC25351j0) it).mo116552a();
                    C25013h1 c25013h1 = this.f53475A0;
                    if (c25013h1 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25013h1 = null;
                    }
                    RecyclerView.AbstractC1876c0 m9900t0 = c25013h1.f119941u.m9900t0(mo116552a);
                    if (m9900t0 instanceof C31181o0.e) {
                        ((C31181o0.e) m9900t0).m151916l0();
                    }
                }
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        this.f53482z0 = AbstractC28684a.Companion.m143675L();
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19738v interfaceC19738v = this.f53482z0;
        if (interfaceC19738v == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19738v = null;
        }
        lifecycle.mo9335a(interfaceC19738v);
        InterfaceC19738v interfaceC19738v2 = this.f53482z0;
        if (interfaceC19738v2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19738v2 = null;
        }
        interfaceC19738v2.mo52965Lb(this);
        InterfaceC19738v interfaceC19738v3 = this.f53482z0;
        if (interfaceC19738v3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19738v3 = null;
        }
        interfaceC19738v3.mo52970uo(m92642L3());
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("VIDEO_LOCATION_VALUE");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f53480F0 = str;
        C31181o0 c31181o0 = new C31181o0(null, null, 3, null);
        c31181o0.m151910c0(new C10520e());
        this.f53476B0 = c31181o0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25013h1 m129835c = C25013h1.m129835c(layoutInflater);
        AbstractC19074t.m100207e(m129835c, "inflate(...)");
        this.f53475A0 = m129835c;
        C25013h1 c25013h1 = null;
        if (m129835c == null) {
            AbstractC19074t.m100223u("binding");
            m129835c = null;
        }
        LoadMoreVideoReceiver loadMoreVideoReceiver = new LoadMoreVideoReceiver(new C10521f(), new C10522g());
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        loadMoreVideoReceiver.mo53685d(m92689tK);
        this.f53478D0 = loadMoreVideoReceiver;
        OverScrollableRefreshBar overScrollableRefreshBar = m129835c.f119937q;
        AbstractC19074t.m100207e(overScrollableRefreshBar, "barRefresh");
        AbstractC26112n.m134367H(overScrollableRefreshBar);
        m129835c.f119938r.f119989q.setOnClickListener(new View.OnClickListener() { // from class: m20.d2
            public /* synthetic */ ViewOnClickListenerC22735d2() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoLocationListView.m55136bL(VideoLocationListView.this, view);
            }
        });
        m129835c.f119938r.f119995w.setAlpha(0.0f);
        HeaderLayout root = m129835c.f119938r.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            RelativeLayout root2 = m129835c.getRoot();
            AbstractC19074t.m100207e(root2, "getRoot(...)");
            layoutParams2.topMargin = AbstractC26112n.m134365F(root2);
            root.setLayoutParams(layoutParams2);
            OverScrollableRecyclerView overScrollableRecyclerView = m129835c.f119941u;
            overScrollableRecyclerView.setItemAnimator(null);
            overScrollableRecyclerView.setAdapter(this.f53476B0);
            VideoLocationListView$onCreateView$1$6$gridManager$1 videoLocationListView$onCreateView$1$6$gridManager$1 = new OverScrollableRecyclerView.GridLayoutManager(overScrollableRecyclerView.getContext()) { // from class: com.zing.zalo.shortvideo.ui.view.VideoLocationListView$onCreateView$1$6$gridManager$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public VideoLocationListView$onCreateView$1$6$gridManager$1(Context context) {
                    super(context, 2, 0, false, false, 28, null);
                    AbstractC19074t.m100205c(context);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
                /* renamed from: W0 */
                public void mo9666W0(RecyclerView.C1899z c1899z) {
                    super.mo9666W0(c1899z);
                    VideoLocationListView.this.m55137cL();
                }
            };
            videoLocationListView$onCreateView$1$6$gridManager$1.m9671f3(new C10523h());
            overScrollableRecyclerView.setLayoutManager(videoLocationListView$onCreateView$1$6$gridManager$1);
            this.f53477C0 = videoLocationListView$onCreateView$1$6$gridManager$1;
            overScrollableRecyclerView.m9826E(new C10517b());
            AbstractC19074t.m100205c(overScrollableRecyclerView);
            OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView, new C10524i(), 0.0f, 2, null);
            C25013h1 c25013h12 = this.f53475A0;
            if (c25013h12 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25013h1 = c25013h12;
            }
            RelativeLayout root3 = c25013h1.getRoot();
            AbstractC19074t.m100207e(root3, "getRoot(...)");
            return root3;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        LoadMoreVideoReceiver loadMoreVideoReceiver = this.f53478D0;
        if (loadMoreVideoReceiver != null) {
            loadMoreVideoReceiver.mo53687g();
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(VideoLocationListView.class, null);
    }

    @Override // m20.InterfaceC22730c2
    /* renamed from: S5 */
    public void mo55138S5(VideoLocationData videoLocationData) {
        AbstractC19074t.m100208f(videoLocationData, "data");
        Section m51390c = videoLocationData.m51390c();
        C25013h1 c25013h1 = this.f53475A0;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        c25013h1.f119938r.f119995w.setText(videoLocationData.m51392e());
        String m51391d = videoLocationData.m51391d();
        if (m51391d != null) {
            C25013h1 c25013h12 = this.f53475A0;
            if (c25013h12 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h12 = null;
            }
            ImageView imageView = c25013h12.f119938r.f119990r;
            AbstractC19074t.m100207e(imageView, "btnShare");
            AbstractC26112n.m134431w0(imageView);
            C25013h1 c25013h13 = this.f53475A0;
            if (c25013h13 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h13 = null;
            }
            ImageView imageView2 = c25013h13.f119938r.f119990r;
            AbstractC19074t.m100207e(imageView2, "btnShare");
            AbstractC26112n.m134407k0(imageView2, new C10525j(m51391d, this));
        }
        C25013h1 c25013h14 = this.f53475A0;
        if (c25013h14 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h14 = null;
        }
        if (c25013h14.f119937q.m56227b()) {
            C25013h1 c25013h15 = this.f53475A0;
            if (c25013h15 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h15 = null;
            }
            c25013h15.f119937q.m56226a();
        }
        C31181o0 c31181o0 = this.f53476B0;
        if (c31181o0 != null) {
            c31181o0.m151445N();
        }
        C25013h1 c25013h16 = this.f53475A0;
        if (c25013h16 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h16 = null;
        }
        c25013h16.f119939s.m55781c();
        C31181o0 c31181o02 = this.f53476B0;
        if (c31181o02 != null) {
            c31181o02.m151912e0(new VideoLocationHeader(videoLocationData.m51392e(), videoLocationData.m51389b()));
            int i11 = 0;
            for (Object obj : m51390c.m51168m()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                ((Video) obj).m52853L0(Integer.valueOf(i11));
                i11 = i12;
            }
            c31181o02.m151911d0(m51390c);
            C31181o0.m151899S(c31181o02, null, 1, null);
            c31181o02.m10008p();
        }
        if (m51390c.m51168m().isEmpty()) {
            C25013h1 c25013h17 = this.f53475A0;
            if (c25013h17 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h17 = null;
            }
            LoadingLayout loadingLayout = c25013h17.f119939s;
            AbstractC19074t.m100207e(loadingLayout, "lytLoading");
            LoadingLayout.m55779i(loadingLayout, 0, 1, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        InterfaceC19738v interfaceC19738v = this.f53482z0;
        InterfaceC19738v interfaceC19738v2 = null;
        if (interfaceC19738v == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19738v = null;
        }
        if (interfaceC19738v.mo53505Qh() == null) {
            C25013h1 c25013h1 = this.f53475A0;
            if (c25013h1 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h1 = null;
            }
            c25013h1.f119939s.m55786j();
            InterfaceC19738v interfaceC19738v3 = this.f53482z0;
            if (interfaceC19738v3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC19738v2 = interfaceC19738v3;
            }
            interfaceC19738v2.mo53507i();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C25013h1 c25013h1 = this.f53475A0;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        if (c25013h1.f119937q.m56227b()) {
            c25013h1.f119937q.m56226a();
        }
        c25013h1.f119939s.m55781c();
    }

    @Override // m20.InterfaceC22730c2
    /* renamed from: b */
    public void mo55139b(boolean z11) {
        InterfaceC19738v interfaceC19738v = this.f53482z0;
        InterfaceC19738v interfaceC19738v2 = null;
        if (interfaceC19738v == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19738v = null;
        }
        if (interfaceC19738v.mo53505Qh() == null) {
            C25013h1 c25013h1 = this.f53475A0;
            if (c25013h1 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h1 = null;
            }
            if (z11) {
                c25013h1.f119939s.m55786j();
                InterfaceC19738v interfaceC19738v3 = this.f53482z0;
                if (interfaceC19738v3 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC19738v2 = interfaceC19738v3;
                }
                interfaceC19738v2.mo53507i();
            }
        }
    }

    @Override // m20.InterfaceC22730c2
    /* renamed from: d */
    public void mo55140d(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        C25013h1 c25013h1 = this.f53475A0;
        C25013h1 c25013h12 = null;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        if (c25013h1.f119937q.m56227b()) {
            C25013h1 c25013h13 = this.f53475A0;
            if (c25013h13 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h13 = null;
            }
            c25013h13.f119937q.m56226a();
        }
        InterfaceC19738v interfaceC19738v = this.f53482z0;
        if (interfaceC19738v == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19738v = null;
        }
        if (interfaceC19738v.mo53505Qh() == null) {
            C25013h1 c25013h14 = this.f53475A0;
            if (c25013h14 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25013h12 = c25013h14;
            }
            if (th2 instanceof NetworkException) {
                c25013h12.f119939s.m55784g(new C10518c(c25013h12, this));
                return;
            }
            C31181o0 c31181o0 = this.f53476B0;
            if (c31181o0 != null) {
                c31181o0.m151445N();
            }
            c25013h12.f119939s.m55783f(new C10519d(c25013h12, this));
            return;
        }
        C31181o0 c31181o02 = this.f53476B0;
        if (c31181o02 != null) {
            c31181o02.m151445N();
        }
    }

    @Override // m20.InterfaceC22730c2
    /* renamed from: e */
    public void mo55141e(Section section) {
        AbstractC19074t.m100208f(section, "data");
        C31181o0 c31181o0 = this.f53476B0;
        if (c31181o0 != null) {
            int mo10003k = c31181o0.mo10003k();
            c31181o0.m151901R(section);
            c31181o0.m10015w(mo10003k, c31181o0.mo10003k() - mo10003k);
            c31181o0.m151445N();
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        String string;
        AbstractC19074t.m100208f(bVar, "extras");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (string = m92642L3.getString("VIDEO_LOCATION_VALUE")) != null) {
            AbstractC19074t.m100205c(string);
            bVar.m111023b(0, string);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // k20.C21456b.c
    /* renamed from: pt */
    public void mo53936pt(C21456b.b bVar) {
        String str;
        AbstractC19074t.m100208f(bVar, "extras");
        Object m111022a = bVar.m111022a(0);
        if (m111022a instanceof String) {
            str = (String) m111022a;
        } else {
            str = null;
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            m92642L3.putString("VIDEO_LOCATION_VALUE", str);
        }
    }
}
