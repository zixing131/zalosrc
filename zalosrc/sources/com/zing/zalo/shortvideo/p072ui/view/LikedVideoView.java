package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1785o;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.LoadMoreVideoReceiver;
import com.zing.zalo.shortvideo.p072ui.view.LikedVideoView;
import com.zing.zalo.shortvideo.p072ui.widget.HeaderLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRefreshBar;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19725i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k20.C21456b;
import ln0.C22537f;
import m20.InterfaceC22750h0;
import pm0.C24848g0;
import q10.C25013h1;
import qm0.AbstractC25351j0;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import z10.C31176m;

/* loaded from: classes5.dex */
public final class LikedVideoView extends ZchBaseView implements InterfaceC22750h0, C21456b.c {

    /* renamed from: A0 */
    private C25013h1 f52903A0;

    /* renamed from: B0 */
    private C31176m f52904B0;

    /* renamed from: C0 */
    private OverScrollableRecyclerView.GridLayoutManager f52905C0;

    /* renamed from: D0 */
    private LoadMoreVideoReceiver f52906D0;

    /* renamed from: E0 */
    private final String f52907E0;

    /* renamed from: z0 */
    private InterfaceC19725i f52908z0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LikedVideoView$a */
    /* loaded from: classes5.dex */
    private final class C10274a extends RecyclerView.AbstractC1892s {
        public C10274a() {
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
            if (i12 != 0) {
                LikedVideoView.this.m54410aL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LikedVideoView$b */
    /* loaded from: classes5.dex */
    static final class C10275b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25013h1 f52910q;

        /* renamed from: r */
        final /* synthetic */ LikedVideoView f52911r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10275b(C25013h1 c25013h1, LikedVideoView likedVideoView) {
            super(0);
            this.f52910q = c25013h1;
            this.f52911r = likedVideoView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54415a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54415a() {
            this.f52910q.f119939s.m55786j();
            InterfaceC19725i interfaceC19725i = this.f52911r.f52908z0;
            if (interfaceC19725i == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19725i = null;
            }
            interfaceC19725i.mo53223i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LikedVideoView$c */
    /* loaded from: classes5.dex */
    static final class C10276c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25013h1 f52912q;

        /* renamed from: r */
        final /* synthetic */ LikedVideoView f52913r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10276c(C25013h1 c25013h1, LikedVideoView likedVideoView) {
            super(0);
            this.f52912q = c25013h1;
            this.f52913r = likedVideoView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54416a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54416a() {
            this.f52912q.f119939s.m55786j();
            InterfaceC19725i interfaceC19725i = this.f52913r.f52908z0;
            if (interfaceC19725i == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19725i = null;
            }
            interfaceC19725i.mo53223i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LikedVideoView$d */
    /* loaded from: classes5.dex */
    public static final class C10277d implements C31176m.b {
        C10277d() {
        }

        @Override // z10.C31176m.b
        /* renamed from: a */
        public void mo54417a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            InterfaceC19725i interfaceC19725i = LikedVideoView.this.f52908z0;
            if (interfaceC19725i == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19725i = null;
            }
            interfaceC19725i.mo53222a(loadMoreInfo);
        }

        @Override // z10.C31176m.b
        /* renamed from: b */
        public void mo54418b(Section section, int i11) {
            AbstractC19074t.m100208f(section, "section");
            LikedVideoView.this.m55551QK(VideoChannelPagerView.Companion.m55118f(section, i11, LikedVideoView.this.f52907E0));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LikedVideoView$e */
    /* loaded from: classes5.dex */
    static final class C10278e extends AbstractC19075u implements InterfaceC18509p {
        C10278e() {
            super(2);
        }

        /* renamed from: a */
        public final void m54419a(String str, String str2) {
            Section mo146381t;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            if (AbstractC19074t.m100204b(LikedVideoView.this.f52907E0, str2) && (mo146381t = AbstractC28684a.Companion.m143692z().mo146381t(str)) != null) {
                LikedVideoView.this.mo54413e(mo146381t);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54419a((String) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LikedVideoView$f */
    /* loaded from: classes5.dex */
    static final class C10279f extends AbstractC19075u implements InterfaceC18511r {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.LikedVideoView$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f52917q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo205i9(Video video) {
                AbstractC19074t.m100208f(video, "i");
                return video.m52911t();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.LikedVideoView$f$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final b f52918q = new b();

            b() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo205i9(Video video) {
                AbstractC19074t.m100208f(video, "i");
                return video.m52911t();
            }
        }

        C10279f() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m54420a((String) obj, ((Number) obj2).intValue(), (String) obj3, (String) obj4);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54420a(String str, int i11, String str2, String str3) {
            C31176m c31176m;
            List list;
            Section m151788S;
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager;
            Section m151788S2;
            List m51168m;
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager2;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            AbstractC19074t.m100208f(str3, "videoId");
            if (!AbstractC19074t.m100204b(LikedVideoView.this.f52907E0, str2) || (c31176m = LikedVideoView.this.f52904B0) == null) {
                return;
            }
            AbstractC28684a.h hVar = AbstractC28684a.Companion;
            List mo146365d = hVar.m143692z().mo146365d();
            List mo146369h = hVar.m143692z().mo146369h();
            if (mo146365d.isEmpty() && mo146369h.isEmpty()) {
                if (i11 >= 0 && i11 < c31176m.mo10003k() && (gridLayoutManager2 = LikedVideoView.this.f52905C0) != null) {
                    gridLayoutManager2.mo9756v1(i11);
                    return;
                }
                return;
            }
            if ((!mo146365d.isEmpty()) && mo146369h.isEmpty()) {
                if (mo146365d.size() == 1) {
                    C31176m c31176m2 = LikedVideoView.this.f52904B0;
                    if (c31176m2 != null) {
                        c31176m2.m151789U((String) mo146365d.get(0));
                    }
                    C31176m c31176m3 = LikedVideoView.this.f52904B0;
                    int i12 = -1;
                    if (c31176m3 != null && (m151788S2 = c31176m3.m151788S()) != null && (m51168m = m151788S2.m51168m()) != null) {
                        Iterator it = m51168m.iterator();
                        int i13 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (AbstractC19074t.m100204b(((Video) it.next()).m52911t(), str3)) {
                                i12 = i13;
                                break;
                            }
                            i13++;
                        }
                    }
                    if (i12 >= 0 && (gridLayoutManager = LikedVideoView.this.f52905C0) != null) {
                        gridLayoutManager.mo9756v1(i12);
                    }
                } else {
                    C31176m c31176m4 = LikedVideoView.this.f52904B0;
                    if (c31176m4 != null) {
                        Section m151788S3 = c31176m4.m151788S();
                        List m51168m2 = c31176m4.m151788S().m51168m();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : m51168m2) {
                            if (!mo146365d.contains(((Video) obj).m52911t())) {
                                arrayList.add(obj);
                            }
                        }
                        m151788S3.m51172q(arrayList);
                        c31176m4.m10008p();
                    }
                }
                C31176m c31176m5 = LikedVideoView.this.f52904B0;
                if (c31176m5 != null && (m151788S = c31176m5.m151788S()) != null) {
                    list = m151788S.m51168m();
                } else {
                    list = null;
                }
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    C25013h1 c25013h1 = LikedVideoView.this.f52903A0;
                    if (c25013h1 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25013h1 = null;
                    }
                    LoadingLayout loadingLayout = c25013h1.f119939s;
                    AbstractC19074t.m100207e(loadingLayout, "lytLoading");
                    LoadingLayout.m55779i(loadingLayout, 0, 1, null);
                    return;
                }
                return;
            }
            if (mo146365d.isEmpty()) {
                C31176m c31176m6 = LikedVideoView.this.f52904B0;
                if (c31176m6 != null) {
                    LikedVideoView likedVideoView = LikedVideoView.this;
                    int size = c31176m6.m151788S().m51168m().size();
                    c31176m6.m151788S().m51164g(new Section(mo146369h, 0L, (LoadMoreInfo) null, 6, (AbstractC19060k) null), a.f52917q);
                    c31176m6.m10015w(0, c31176m6.m151788S().m51168m().size() - size);
                    OverScrollableRecyclerView.GridLayoutManager gridLayoutManager3 = likedVideoView.f52905C0;
                    if (gridLayoutManager3 != null) {
                        gridLayoutManager3.m9721B2(0, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            C31176m c31176m7 = LikedVideoView.this.f52904B0;
            if (c31176m7 != null) {
                LikedVideoView likedVideoView2 = LikedVideoView.this;
                Section m151788S4 = c31176m7.m151788S();
                List m51168m3 = c31176m7.m151788S().m51168m();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : m51168m3) {
                    if (!mo146365d.contains(((Video) obj2).m52911t())) {
                        arrayList2.add(obj2);
                    }
                }
                m151788S4.m51172q(arrayList2);
                c31176m7.m151788S().m51164g(new Section(mo146369h, 0L, (LoadMoreInfo) null, 6, (AbstractC19060k) null), b.f52918q);
                c31176m7.m10008p();
                OverScrollableRecyclerView.GridLayoutManager gridLayoutManager4 = likedVideoView2.f52905C0;
                if (gridLayoutManager4 != null) {
                    gridLayoutManager4.m9721B2(0, 0);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LikedVideoView$g */
    /* loaded from: classes5.dex */
    public static final class C10280g implements OverScrollableRecyclerView.InterfaceC10832c {
        C10280g() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31176m c31176m;
            C31176m c31176m2 = LikedVideoView.this.f52904B0;
            if (c31176m2 != null && !c31176m2.m151444M() && (c31176m = LikedVideoView.this.f52904B0) != null) {
                c31176m.mo151429P();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.LikedVideoView$h */
    /* loaded from: classes5.dex */
    public static final class C10281h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10281h f52920q = new C10281h();

        C10281h() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(Video video) {
            AbstractC19074t.m100208f(video, "i");
            return video.m52911t();
        }
    }

    public LikedVideoView() {
        String uuid = UUID.randomUUID().toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        this.f52907E0 = uuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZK */
    public static final void m54409ZK(LikedVideoView likedVideoView, View view) {
        AbstractC19074t.m100208f(likedVideoView, "this$0");
        likedVideoView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aL */
    public final void m54410aL() {
        OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = this.f52905C0;
        if (gridLayoutManager != null) {
            int m9740Y1 = gridLayoutManager.m9740Y1();
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager2 = this.f52905C0;
            if (gridLayoutManager2 != null) {
                Iterator it = new C22537f(m9740Y1, gridLayoutManager2.m9745c2()).iterator();
                while (it.hasNext()) {
                    int mo116552a = ((AbstractC25351j0) it).mo116552a();
                    C25013h1 c25013h1 = this.f52903A0;
                    if (c25013h1 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25013h1 = null;
                    }
                    RecyclerView.AbstractC1876c0 m9900t0 = c25013h1.f119941u.m9900t0(mo116552a);
                    if (m9900t0 instanceof C31176m.c) {
                        ((C31176m.c) m9900t0).m151799l0();
                    }
                }
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        AbstractC28684a.h hVar = AbstractC28684a.Companion;
        this.f52908z0 = hVar.m143690x();
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19725i interfaceC19725i = this.f52908z0;
        if (interfaceC19725i == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19725i = null;
        }
        lifecycle.mo9335a(interfaceC19725i);
        InterfaceC19725i interfaceC19725i2 = this.f52908z0;
        if (interfaceC19725i2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19725i2 = null;
        }
        interfaceC19725i2.mo52965Lb(this);
        InterfaceC19725i interfaceC19725i3 = this.f52908z0;
        if (interfaceC19725i3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19725i3 = null;
        }
        interfaceC19725i3.mo52970uo(m92642L3());
        C31176m c31176m = new C31176m(null, 1, null);
        c31176m.m151794Z(new C10277d());
        this.f52904B0 = c31176m;
        hVar.m143692z().mo146378q(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25013h1 m129835c = C25013h1.m129835c(layoutInflater);
        AbstractC19074t.m100207e(m129835c, "inflate(...)");
        this.f52903A0 = m129835c;
        C25013h1 c25013h1 = null;
        if (m129835c == null) {
            AbstractC19074t.m100223u("binding");
            m129835c = null;
        }
        LoadMoreVideoReceiver loadMoreVideoReceiver = new LoadMoreVideoReceiver(new C10278e(), new C10279f());
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        loadMoreVideoReceiver.mo53685d(m92689tK);
        this.f52906D0 = loadMoreVideoReceiver;
        OverScrollableRefreshBar overScrollableRefreshBar = m129835c.f119937q;
        AbstractC19074t.m100207e(overScrollableRefreshBar, "barRefresh");
        AbstractC26112n.m134367H(overScrollableRefreshBar);
        m129835c.f119938r.f119989q.setOnClickListener(new View.OnClickListener() { // from class: m20.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LikedVideoView.m54409ZK(LikedVideoView.this, view);
            }
        });
        m129835c.f119938r.f119995w.setText(m92652XI(AbstractC27413h.zch_page_setting_liked_video));
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
            overScrollableRecyclerView.setAdapter(this.f52904B0);
            final Context context = overScrollableRecyclerView.getContext();
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = new OverScrollableRecyclerView.GridLayoutManager(context) { // from class: com.zing.zalo.shortvideo.ui.view.LikedVideoView$onCreateView$1$6$gridManager$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(context, 2, 0, false, false, 28, null);
                    AbstractC19074t.m100205c(context);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
                /* renamed from: W0 */
                public void mo9666W0(RecyclerView.C1899z c1899z) {
                    super.mo9666W0(c1899z);
                    LikedVideoView.this.m54410aL();
                }
            };
            overScrollableRecyclerView.setLayoutManager(gridLayoutManager);
            this.f52905C0 = gridLayoutManager;
            overScrollableRecyclerView.m9826E(new C10274a());
            AbstractC19074t.m100205c(overScrollableRecyclerView);
            OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView, new C10280g(), 0.0f, 2, null);
            C25013h1 c25013h12 = this.f52903A0;
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

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        AbstractC28684a.Companion.m143692z().mo146378q(false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        LoadMoreVideoReceiver loadMoreVideoReceiver = this.f52906D0;
        if (loadMoreVideoReceiver != null) {
            loadMoreVideoReceiver.mo53687g();
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(LikedVideoView.class, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        InterfaceC19725i interfaceC19725i = this.f52908z0;
        InterfaceC19725i interfaceC19725i2 = null;
        if (interfaceC19725i == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19725i = null;
        }
        if (interfaceC19725i.mo53221G() == null) {
            C25013h1 c25013h1 = this.f52903A0;
            if (c25013h1 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h1 = null;
            }
            c25013h1.f119939s.m55786j();
            InterfaceC19725i interfaceC19725i3 = this.f52908z0;
            if (interfaceC19725i3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC19725i2 = interfaceC19725i3;
            }
            interfaceC19725i2.mo53223i();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C25013h1 c25013h1 = this.f52903A0;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        if (c25013h1.f119937q.m56227b()) {
            c25013h1.f119937q.m56226a();
        }
        c25013h1.f119939s.m55781c();
    }

    @Override // m20.InterfaceC22750h0
    /* renamed from: b */
    public void mo54411b(boolean z11) {
        InterfaceC19725i interfaceC19725i = this.f52908z0;
        InterfaceC19725i interfaceC19725i2 = null;
        if (interfaceC19725i == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19725i = null;
        }
        if (interfaceC19725i.mo53221G() == null) {
            C25013h1 c25013h1 = this.f52903A0;
            if (c25013h1 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h1 = null;
            }
            if (z11) {
                c25013h1.f119939s.m55786j();
                InterfaceC19725i interfaceC19725i3 = this.f52908z0;
                if (interfaceC19725i3 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC19725i2 = interfaceC19725i3;
                }
                interfaceC19725i2.mo53223i();
            }
        }
    }

    @Override // m20.InterfaceC22750h0
    /* renamed from: d */
    public void mo54412d(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        C25013h1 c25013h1 = this.f52903A0;
        C25013h1 c25013h12 = null;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        if (c25013h1.f119937q.m56227b()) {
            C25013h1 c25013h13 = this.f52903A0;
            if (c25013h13 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h13 = null;
            }
            c25013h13.f119937q.m56226a();
        }
        InterfaceC19725i interfaceC19725i = this.f52908z0;
        if (interfaceC19725i == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19725i = null;
        }
        if (interfaceC19725i.mo53221G() == null) {
            C25013h1 c25013h14 = this.f52903A0;
            if (c25013h14 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25013h12 = c25013h14;
            }
            if (th2 instanceof NetworkException) {
                c25013h12.f119939s.m55784g(new C10275b(c25013h12, this));
                return;
            }
            C31176m c31176m = this.f52904B0;
            if (c31176m != null) {
                c31176m.m151445N();
            }
            c25013h12.f119939s.m55783f(new C10276c(c25013h12, this));
            return;
        }
        C31176m c31176m2 = this.f52904B0;
        if (c31176m2 != null) {
            c31176m2.m151445N();
        }
    }

    @Override // m20.InterfaceC22750h0
    /* renamed from: e */
    public void mo54413e(Section section) {
        Integer num;
        AbstractC19074t.m100208f(section, "section");
        C31176m c31176m = this.f52904B0;
        if (c31176m != null) {
            int mo10003k = c31176m.mo10003k();
            c31176m.m151788S().m51163e(section, C10281h.f52920q);
            int mo10003k2 = c31176m.mo10003k() - mo10003k;
            List m51168m = c31176m.m151788S().m51168m();
            int i11 = mo10003k + mo10003k2;
            for (int i12 = mo10003k; i12 < i11; i12++) {
                Video video = (Video) m51168m.get(i12);
                Integer m52919y = ((Video) m51168m.get(i12 - 1)).m52919y();
                if (m52919y != null) {
                    num = Integer.valueOf(m52919y.intValue() + 1);
                } else {
                    num = null;
                }
                video.m52853L0(num);
            }
            c31176m.m10015w(mo10003k, mo10003k2);
            c31176m.m151445N();
        }
    }

    @Override // m20.InterfaceC22750h0
    /* renamed from: o */
    public void mo54414o(Section section) {
        AbstractC19074t.m100208f(section, "section");
        C25013h1 c25013h1 = this.f52903A0;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        if (c25013h1.f119937q.m56227b()) {
            C25013h1 c25013h12 = this.f52903A0;
            if (c25013h12 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h12 = null;
            }
            c25013h12.f119937q.m56226a();
        }
        C31176m c31176m = this.f52904B0;
        if (c31176m != null) {
            c31176m.m151445N();
        }
        C25013h1 c25013h13 = this.f52903A0;
        if (c25013h13 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h13 = null;
        }
        c25013h13.f119939s.m55781c();
        C31176m c31176m2 = this.f52904B0;
        if (c31176m2 != null) {
            int i11 = 0;
            for (Object obj : section.m51168m()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                ((Video) obj).m52853L0(Integer.valueOf(i11));
                i11 = i12;
            }
            c31176m2.m151795a0(section);
            c31176m2.m10008p();
        }
        if (section.m51168m().isEmpty()) {
            C25013h1 c25013h14 = this.f52903A0;
            if (c25013h14 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h14 = null;
            }
            LoadingLayout loadingLayout = c25013h14.f119939s;
            AbstractC19074t.m100207e(loadingLayout, "lytLoading");
            LoadingLayout.m55779i(loadingLayout, 0, 1, null);
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        C21456b.c.a.m111025b(this, bVar);
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
        C21456b.c.a.m111024a(this, bVar);
    }
}
