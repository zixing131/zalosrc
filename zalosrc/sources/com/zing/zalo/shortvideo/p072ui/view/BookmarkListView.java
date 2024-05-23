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
import com.zing.zalo.shortvideo.p072ui.view.BookmarkListView;
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
import h20.InterfaceC19719c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k20.C21456b;
import ln0.C22537f;
import m20.InterfaceC22732d;
import pm0.C24848g0;
import q10.C25013h1;
import qm0.AbstractC25351j0;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import z10.C31156c;

/* loaded from: classes5.dex */
public final class BookmarkListView extends ZchBaseView implements InterfaceC22732d, C21456b.c {

    /* renamed from: A0 */
    private C25013h1 f52552A0;

    /* renamed from: B0 */
    private C31156c f52553B0;

    /* renamed from: C0 */
    private OverScrollableRecyclerView.GridLayoutManager f52554C0;

    /* renamed from: D0 */
    private LoadMoreVideoReceiver f52555D0;

    /* renamed from: E0 */
    private final String f52556E0;

    /* renamed from: z0 */
    private InterfaceC19719c f52557z0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BookmarkListView$a */
    /* loaded from: classes5.dex */
    private final class C10123a extends RecyclerView.AbstractC1892s {
        public C10123a() {
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
                BookmarkListView.this.m53948aL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BookmarkListView$b */
    /* loaded from: classes5.dex */
    static final class C10124b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25013h1 f52559q;

        /* renamed from: r */
        final /* synthetic */ BookmarkListView f52560r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10124b(C25013h1 c25013h1, BookmarkListView bookmarkListView) {
            super(0);
            this.f52559q = c25013h1;
            this.f52560r = bookmarkListView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53953a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53953a() {
            this.f52559q.f119939s.m55786j();
            InterfaceC19719c interfaceC19719c = this.f52560r.f52557z0;
            if (interfaceC19719c == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19719c = null;
            }
            interfaceC19719c.mo53039i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BookmarkListView$c */
    /* loaded from: classes5.dex */
    static final class C10125c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25013h1 f52561q;

        /* renamed from: r */
        final /* synthetic */ BookmarkListView f52562r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10125c(C25013h1 c25013h1, BookmarkListView bookmarkListView) {
            super(0);
            this.f52561q = c25013h1;
            this.f52562r = bookmarkListView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53954a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53954a() {
            this.f52561q.f119939s.m55786j();
            InterfaceC19719c interfaceC19719c = this.f52562r.f52557z0;
            if (interfaceC19719c == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19719c = null;
            }
            interfaceC19719c.mo53039i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BookmarkListView$d */
    /* loaded from: classes5.dex */
    public static final class C10126d implements C31156c.c {
        C10126d() {
        }

        @Override // z10.C31156c.c
        /* renamed from: a */
        public void mo53955a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            InterfaceC19719c interfaceC19719c = BookmarkListView.this.f52557z0;
            if (interfaceC19719c == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19719c = null;
            }
            interfaceC19719c.mo53038a(loadMoreInfo);
        }

        @Override // z10.C31156c.c
        /* renamed from: b */
        public void mo53956b(Section section, int i11) {
            AbstractC19074t.m100208f(section, "section");
            BookmarkListView.this.m55551QK(VideoChannelPagerView.Companion.m55113a(section, i11, BookmarkListView.this.f52556E0));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BookmarkListView$e */
    /* loaded from: classes5.dex */
    static final class C10127e extends AbstractC19075u implements InterfaceC18509p {
        C10127e() {
            super(2);
        }

        /* renamed from: a */
        public final void m53957a(String str, String str2) {
            Section mo146381t;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            if (AbstractC19074t.m100204b(BookmarkListView.this.f52556E0, str2) && (mo146381t = AbstractC28684a.Companion.m143692z().mo146381t(str)) != null) {
                BookmarkListView.this.mo53951e(mo146381t);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m53957a((String) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BookmarkListView$f */
    /* loaded from: classes5.dex */
    static final class C10128f extends AbstractC19075u implements InterfaceC18511r {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.BookmarkListView$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f52566q = new a();

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
        /* renamed from: com.zing.zalo.shortvideo.ui.view.BookmarkListView$f$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final b f52567q = new b();

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

        C10128f() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m53958a((String) obj, ((Number) obj2).intValue(), (String) obj3, (String) obj4);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53958a(String str, int i11, String str2, String str3) {
            C31156c c31156c;
            List list;
            Section m151493S;
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager;
            Section m151493S2;
            List m51168m;
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager2;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            AbstractC19074t.m100208f(str3, "videoId");
            if (!AbstractC19074t.m100204b(BookmarkListView.this.f52556E0, str2) || (c31156c = BookmarkListView.this.f52553B0) == null) {
                return;
            }
            AbstractC28684a.h hVar = AbstractC28684a.Companion;
            List mo146370i = hVar.m143692z().mo146370i();
            List mo146362a = hVar.m143692z().mo146362a();
            if (mo146370i.isEmpty() && mo146362a.isEmpty()) {
                if (i11 >= 0 && i11 < c31156c.mo10003k() && (gridLayoutManager2 = BookmarkListView.this.f52554C0) != null) {
                    gridLayoutManager2.mo9756v1(i11);
                    return;
                }
                return;
            }
            if ((!mo146370i.isEmpty()) && mo146362a.isEmpty()) {
                if (mo146370i.size() == 1) {
                    C31156c c31156c2 = BookmarkListView.this.f52553B0;
                    if (c31156c2 != null) {
                        c31156c2.m151494U((String) mo146370i.get(0));
                    }
                    C31156c c31156c3 = BookmarkListView.this.f52553B0;
                    int i12 = -1;
                    if (c31156c3 != null && (m151493S2 = c31156c3.m151493S()) != null && (m51168m = m151493S2.m51168m()) != null) {
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
                    if (i12 >= 0 && (gridLayoutManager = BookmarkListView.this.f52554C0) != null) {
                        gridLayoutManager.mo9756v1(i12);
                    }
                } else {
                    C31156c c31156c4 = BookmarkListView.this.f52553B0;
                    if (c31156c4 != null) {
                        Section m151493S3 = c31156c4.m151493S();
                        List m51168m2 = c31156c4.m151493S().m51168m();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : m51168m2) {
                            if (!mo146370i.contains(((Video) obj).m52911t())) {
                                arrayList.add(obj);
                            }
                        }
                        m151493S3.m51172q(arrayList);
                        c31156c4.m10008p();
                    }
                }
                C31156c c31156c5 = BookmarkListView.this.f52553B0;
                if (c31156c5 != null && (m151493S = c31156c5.m151493S()) != null) {
                    list = m151493S.m51168m();
                } else {
                    list = null;
                }
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    C25013h1 c25013h1 = BookmarkListView.this.f52552A0;
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
            if (mo146370i.isEmpty()) {
                C31156c c31156c6 = BookmarkListView.this.f52553B0;
                if (c31156c6 != null) {
                    BookmarkListView bookmarkListView = BookmarkListView.this;
                    int size = c31156c6.m151493S().m51168m().size();
                    c31156c6.m151493S().m51164g(new Section(mo146362a, 0L, (LoadMoreInfo) null, 6, (AbstractC19060k) null), a.f52566q);
                    c31156c6.m10015w(0, c31156c6.m151493S().m51168m().size() - size);
                    OverScrollableRecyclerView.GridLayoutManager gridLayoutManager3 = bookmarkListView.f52554C0;
                    if (gridLayoutManager3 != null) {
                        gridLayoutManager3.m9721B2(0, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            C31156c c31156c7 = BookmarkListView.this.f52553B0;
            if (c31156c7 != null) {
                BookmarkListView bookmarkListView2 = BookmarkListView.this;
                Section m151493S4 = c31156c7.m151493S();
                List m51168m3 = c31156c7.m151493S().m51168m();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : m51168m3) {
                    if (!mo146370i.contains(((Video) obj2).m52911t())) {
                        arrayList2.add(obj2);
                    }
                }
                m151493S4.m51172q(arrayList2);
                c31156c7.m151493S().m51164g(new Section(mo146362a, 0L, (LoadMoreInfo) null, 6, (AbstractC19060k) null), b.f52567q);
                c31156c7.m10008p();
                OverScrollableRecyclerView.GridLayoutManager gridLayoutManager4 = bookmarkListView2.f52554C0;
                if (gridLayoutManager4 != null) {
                    gridLayoutManager4.m9721B2(0, 0);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BookmarkListView$g */
    /* loaded from: classes5.dex */
    public static final class C10129g implements OverScrollableRecyclerView.InterfaceC10832c {
        C10129g() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31156c c31156c;
            C31156c c31156c2 = BookmarkListView.this.f52553B0;
            if (c31156c2 != null && !c31156c2.m151444M() && (c31156c = BookmarkListView.this.f52553B0) != null) {
                c31156c.mo151429P();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.BookmarkListView$h */
    /* loaded from: classes5.dex */
    public static final class C10130h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10130h f52569q = new C10130h();

        C10130h() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(Video video) {
            AbstractC19074t.m100208f(video, "i");
            return video.m52911t();
        }
    }

    public BookmarkListView() {
        String uuid = UUID.randomUUID().toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        this.f52556E0 = uuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZK */
    public static final void m53947ZK(BookmarkListView bookmarkListView, View view) {
        AbstractC19074t.m100208f(bookmarkListView, "this$0");
        bookmarkListView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aL */
    public final void m53948aL() {
        OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = this.f52554C0;
        if (gridLayoutManager != null) {
            int m9740Y1 = gridLayoutManager.m9740Y1();
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager2 = this.f52554C0;
            if (gridLayoutManager2 != null) {
                Iterator it = new C22537f(m9740Y1, gridLayoutManager2.m9745c2()).iterator();
                while (it.hasNext()) {
                    int mo116552a = ((AbstractC25351j0) it).mo116552a();
                    C25013h1 c25013h1 = this.f52552A0;
                    if (c25013h1 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25013h1 = null;
                    }
                    RecyclerView.AbstractC1876c0 m9900t0 = c25013h1.f119941u.m9900t0(mo116552a);
                    if (m9900t0 instanceof C31156c.b) {
                        ((C31156c.b) m9900t0).m151504l0();
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
        this.f52557z0 = hVar.m143679m();
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19719c interfaceC19719c = this.f52557z0;
        if (interfaceC19719c == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19719c = null;
        }
        lifecycle.mo9335a(interfaceC19719c);
        InterfaceC19719c interfaceC19719c2 = this.f52557z0;
        if (interfaceC19719c2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19719c2 = null;
        }
        interfaceC19719c2.mo52965Lb(this);
        InterfaceC19719c interfaceC19719c3 = this.f52557z0;
        if (interfaceC19719c3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19719c3 = null;
        }
        interfaceC19719c3.mo52970uo(m92642L3());
        C31156c c31156c = new C31156c(null, 1, null);
        c31156c.m151499Z(new C10126d());
        this.f52553B0 = c31156c;
        hVar.m143692z().mo146376o(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25013h1 m129835c = C25013h1.m129835c(layoutInflater);
        AbstractC19074t.m100207e(m129835c, "inflate(...)");
        this.f52552A0 = m129835c;
        C25013h1 c25013h1 = null;
        if (m129835c == null) {
            AbstractC19074t.m100223u("binding");
            m129835c = null;
        }
        LoadMoreVideoReceiver loadMoreVideoReceiver = new LoadMoreVideoReceiver(new C10127e(), new C10128f());
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        loadMoreVideoReceiver.mo53685d(m92689tK);
        this.f52555D0 = loadMoreVideoReceiver;
        OverScrollableRefreshBar overScrollableRefreshBar = m129835c.f119937q;
        AbstractC19074t.m100207e(overScrollableRefreshBar, "barRefresh");
        AbstractC26112n.m134367H(overScrollableRefreshBar);
        m129835c.f119938r.f119989q.setOnClickListener(new View.OnClickListener() { // from class: m20.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BookmarkListView.m53947ZK(BookmarkListView.this, view);
            }
        });
        m129835c.f119938r.f119995w.setText(m92652XI(AbstractC27413h.zch_page_setting_bookmark_video));
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
            overScrollableRecyclerView.setAdapter(this.f52553B0);
            final Context context = overScrollableRecyclerView.getContext();
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = new OverScrollableRecyclerView.GridLayoutManager(context) { // from class: com.zing.zalo.shortvideo.ui.view.BookmarkListView$onCreateView$1$6$gridManager$1
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
                    BookmarkListView.this.m53948aL();
                }
            };
            overScrollableRecyclerView.setLayoutManager(gridLayoutManager);
            this.f52554C0 = gridLayoutManager;
            overScrollableRecyclerView.m9826E(new C10123a());
            AbstractC19074t.m100205c(overScrollableRecyclerView);
            OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView, new C10129g(), 0.0f, 2, null);
            C25013h1 c25013h12 = this.f52552A0;
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
        AbstractC28684a.Companion.m143692z().mo146376o(false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        LoadMoreVideoReceiver loadMoreVideoReceiver = this.f52555D0;
        if (loadMoreVideoReceiver != null) {
            loadMoreVideoReceiver.mo53687g();
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(BookmarkListView.class, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        InterfaceC19719c interfaceC19719c = this.f52557z0;
        InterfaceC19719c interfaceC19719c2 = null;
        if (interfaceC19719c == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19719c = null;
        }
        if (interfaceC19719c.mo53037G() == null) {
            C25013h1 c25013h1 = this.f52552A0;
            if (c25013h1 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h1 = null;
            }
            c25013h1.f119939s.m55786j();
            InterfaceC19719c interfaceC19719c3 = this.f52557z0;
            if (interfaceC19719c3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC19719c2 = interfaceC19719c3;
            }
            interfaceC19719c2.mo53039i();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C25013h1 c25013h1 = this.f52552A0;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        if (c25013h1.f119937q.m56227b()) {
            c25013h1.f119937q.m56226a();
        }
        c25013h1.f119939s.m55781c();
    }

    @Override // m20.InterfaceC22732d
    /* renamed from: b */
    public void mo53949b(boolean z11) {
        InterfaceC19719c interfaceC19719c = this.f52557z0;
        InterfaceC19719c interfaceC19719c2 = null;
        if (interfaceC19719c == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19719c = null;
        }
        if (interfaceC19719c.mo53037G() == null) {
            C25013h1 c25013h1 = this.f52552A0;
            if (c25013h1 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h1 = null;
            }
            if (z11) {
                c25013h1.f119939s.m55786j();
                InterfaceC19719c interfaceC19719c3 = this.f52557z0;
                if (interfaceC19719c3 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC19719c2 = interfaceC19719c3;
                }
                interfaceC19719c2.mo53039i();
            }
        }
    }

    @Override // m20.InterfaceC22732d
    /* renamed from: d */
    public void mo53950d(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        C25013h1 c25013h1 = this.f52552A0;
        C25013h1 c25013h12 = null;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        if (c25013h1.f119937q.m56227b()) {
            C25013h1 c25013h13 = this.f52552A0;
            if (c25013h13 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h13 = null;
            }
            c25013h13.f119937q.m56226a();
        }
        InterfaceC19719c interfaceC19719c = this.f52557z0;
        if (interfaceC19719c == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19719c = null;
        }
        if (interfaceC19719c.mo53037G() == null) {
            C25013h1 c25013h14 = this.f52552A0;
            if (c25013h14 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25013h12 = c25013h14;
            }
            if (th2 instanceof NetworkException) {
                c25013h12.f119939s.m55784g(new C10124b(c25013h12, this));
                return;
            }
            C31156c c31156c = this.f52553B0;
            if (c31156c != null) {
                c31156c.m151445N();
            }
            c25013h12.f119939s.m55783f(new C10125c(c25013h12, this));
            return;
        }
        C31156c c31156c2 = this.f52553B0;
        if (c31156c2 != null) {
            c31156c2.m151445N();
        }
    }

    @Override // m20.InterfaceC22732d
    /* renamed from: e */
    public void mo53951e(Section section) {
        Integer num;
        AbstractC19074t.m100208f(section, "section");
        C31156c c31156c = this.f52553B0;
        if (c31156c != null) {
            int mo10003k = c31156c.mo10003k();
            c31156c.m151493S().m51163e(section, C10130h.f52569q);
            int mo10003k2 = c31156c.mo10003k() - mo10003k;
            List m51168m = c31156c.m151493S().m51168m();
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
            c31156c.m10015w(mo10003k, mo10003k2);
            c31156c.m151445N();
        }
    }

    @Override // m20.InterfaceC22732d
    /* renamed from: o */
    public void mo53952o(Section section) {
        AbstractC19074t.m100208f(section, "section");
        C25013h1 c25013h1 = this.f52552A0;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        if (c25013h1.f119937q.m56227b()) {
            C25013h1 c25013h12 = this.f52552A0;
            if (c25013h12 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h12 = null;
            }
            c25013h12.f119937q.m56226a();
        }
        C31156c c31156c = this.f52553B0;
        if (c31156c != null) {
            c31156c.m151445N();
        }
        C25013h1 c25013h13 = this.f52552A0;
        if (c25013h13 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h13 = null;
        }
        c25013h13.f119939s.m55781c();
        C31156c c31156c2 = this.f52553B0;
        if (c31156c2 != null) {
            int i11 = 0;
            for (Object obj : section.m51168m()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                ((Video) obj).m52853L0(Integer.valueOf(i11));
                i11 = i12;
            }
            c31156c2.m151500a0(section);
            c31156c2.m10008p();
        }
        if (section.m51168m().isEmpty()) {
            C25013h1 c25013h14 = this.f52552A0;
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
