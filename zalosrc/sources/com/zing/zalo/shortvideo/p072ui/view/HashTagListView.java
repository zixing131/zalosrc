package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.os.AbstractC1438d;
import androidx.lifecycle.AbstractC1785o;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.LoadMoreVideoReceiver;
import com.zing.zalo.shortvideo.p072ui.view.HashTagListView;
import com.zing.zalo.shortvideo.p072ui.widget.HeaderLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19724h;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k20.C21456b;
import ln0.C22537f;
import m20.InterfaceC22742f0;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25013h1;
import qm0.AbstractC25351j0;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import w00.AbstractC28684a;
import z10.C31174l;

/* loaded from: classes5.dex */
public final class HashTagListView extends ZchBaseView implements InterfaceC22742f0, C21456b.c {
    public static final C10261a Companion = new C10261a(null);

    /* renamed from: A0 */
    private C25013h1 f52879A0;

    /* renamed from: B0 */
    private C31174l f52880B0;

    /* renamed from: C0 */
    private OverScrollableRecyclerView.GridLayoutManager f52881C0;

    /* renamed from: D0 */
    private String f52882D0 = "";

    /* renamed from: E0 */
    private String f52883E0 = "";

    /* renamed from: F0 */
    private LoadMoreVideoReceiver f52884F0;

    /* renamed from: G0 */
    private final String f52885G0;

    /* renamed from: z0 */
    private InterfaceC19724h f52886z0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.HashTagListView$a */
    /* loaded from: classes5.dex */
    public static final class C10261a {
        private C10261a() {
        }

        public /* synthetic */ C10261a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final HashTagListView m54389a(String str) {
            AbstractC19074t.m100208f(str, "collectionId");
            HashTagListView hashTagListView = new HashTagListView();
            hashTagListView.mo60305zK(HashTagListView.Companion.m54390b(str));
            return hashTagListView;
        }

        /* renamed from: b */
        public final Bundle m54390b(String str) {
            AbstractC19074t.m100208f(str, "id");
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("COLLECTION_ID", str));
        }

        /* renamed from: c */
        public final Bundle m54391c(String str) {
            AbstractC19074t.m100208f(str, "tag");
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("HASH_TAG_LIST", str));
        }

        /* renamed from: d */
        public final HashTagListView m54392d(String str) {
            AbstractC19074t.m100208f(str, "hashTag");
            HashTagListView hashTagListView = new HashTagListView();
            hashTagListView.mo60305zK(HashTagListView.Companion.m54391c(str));
            return hashTagListView;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.HashTagListView$b */
    /* loaded from: classes5.dex */
    private final class C10262b extends RecyclerView.AbstractC1892s {
        public C10262b() {
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
                HashTagListView.this.m54383bL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.HashTagListView$c */
    /* loaded from: classes5.dex */
    static final class C10263c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25013h1 f52888q;

        /* renamed from: r */
        final /* synthetic */ HashTagListView f52889r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10263c(C25013h1 c25013h1, HashTagListView hashTagListView) {
            super(0);
            this.f52888q = c25013h1;
            this.f52889r = hashTagListView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54393a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54393a() {
            this.f52888q.f119939s.m55786j();
            InterfaceC19724h interfaceC19724h = this.f52889r.f52886z0;
            if (interfaceC19724h == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19724h = null;
            }
            interfaceC19724h.mo53202i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.HashTagListView$d */
    /* loaded from: classes5.dex */
    static final class C10264d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25013h1 f52890q;

        /* renamed from: r */
        final /* synthetic */ HashTagListView f52891r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10264d(C25013h1 c25013h1, HashTagListView hashTagListView) {
            super(0);
            this.f52890q = c25013h1;
            this.f52891r = hashTagListView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54394a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54394a() {
            this.f52890q.f119939s.m55786j();
            InterfaceC19724h interfaceC19724h = this.f52891r.f52886z0;
            if (interfaceC19724h == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19724h = null;
            }
            interfaceC19724h.mo53202i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.HashTagListView$e */
    /* loaded from: classes5.dex */
    public static final class C10265e implements C31174l.b {

        /* renamed from: a */
        final /* synthetic */ C31174l f52892a;

        /* renamed from: b */
        final /* synthetic */ HashTagListView f52893b;

        C10265e(C31174l c31174l, HashTagListView hashTagListView) {
            this.f52892a = c31174l;
            this.f52893b = hashTagListView;
        }

        @Override // z10.C31174l.b
        /* renamed from: a */
        public void mo54395a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            InterfaceC19724h interfaceC19724h = this.f52893b.f52886z0;
            if (interfaceC19724h == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19724h = null;
            }
            interfaceC19724h.mo53201a(loadMoreInfo);
        }

        @Override // z10.C31174l.b
        /* renamed from: b */
        public void mo54396b(Section section, int i11, String str) {
            VideoChannelPagerView m55117e;
            AbstractC19074t.m100208f(section, "section");
            AbstractC19074t.m100208f(str, "hashTag");
            String m151752S = this.f52892a.m151752S();
            if (m151752S != null && m151752S.length() != 0) {
                m55117e = VideoChannelPagerView.Companion.m55114b(m151752S, section, i11, this.f52893b.f52885G0);
            } else {
                m55117e = VideoChannelPagerView.Companion.m55117e(str, section, i11, this.f52893b.f52885G0);
            }
            this.f52893b.m55551QK(m55117e);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.HashTagListView$f */
    /* loaded from: classes5.dex */
    static final class C10266f extends AbstractC19075u implements InterfaceC18509p {
        C10266f() {
            super(2);
        }

        /* renamed from: a */
        public final void m54397a(String str, String str2) {
            Section mo146381t;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            if (AbstractC19074t.m100204b(HashTagListView.this.f52885G0, str2) && AbstractC19074t.m100204b(str, HashTagListView.this.f52882D0) && (mo146381t = AbstractC28684a.Companion.m143692z().mo146381t(str)) != null) {
                HashTagListView.this.mo54386e(mo146381t);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54397a((String) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.HashTagListView$g */
    /* loaded from: classes5.dex */
    static final class C10267g extends AbstractC19075u implements InterfaceC18511r {
        C10267g() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m54398a((String) obj, ((Number) obj2).intValue(), (String) obj3, (String) obj4);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54398a(String str, int i11, String str2, String str3) {
            C31174l c31174l;
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            AbstractC19074t.m100208f(str3, "videoId");
            if (AbstractC19074t.m100204b(HashTagListView.this.f52885G0, str2) && (c31174l = HashTagListView.this.f52880B0) != null && AbstractC19074t.m100204b(str, HashTagListView.this.f52882D0) && i11 >= 0 && i11 < c31174l.mo10003k() && (gridLayoutManager = HashTagListView.this.f52881C0) != null) {
                gridLayoutManager.mo9756v1(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.HashTagListView$h */
    /* loaded from: classes5.dex */
    public static final class C10268h implements OverScrollableRecyclerView.InterfaceC10832c {
        C10268h() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31174l c31174l;
            C31174l c31174l2 = HashTagListView.this.f52880B0;
            if (c31174l2 != null && !c31174l2.m151444M() && (c31174l = HashTagListView.this.f52880B0) != null) {
                c31174l.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.HashTagListView$i */
    /* loaded from: classes5.dex */
    public static final class C10269i implements OverScrollableRecyclerView.InterfaceC10831b {

        /* renamed from: a */
        final /* synthetic */ C25013h1 f52897a;

        /* renamed from: b */
        final /* synthetic */ HashTagListView f52898b;

        C10269i(C25013h1 c25013h1, HashTagListView hashTagListView) {
            this.f52897a = c25013h1;
            this.f52898b = hashTagListView;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10831b
        /* renamed from: a */
        public void mo54127a(float f11, int i11) {
            if (this.f52897a.f119937q.m56228c(f11, i11)) {
                InterfaceC19724h interfaceC19724h = this.f52898b.f52886z0;
                if (interfaceC19724h == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC19724h = null;
                }
                interfaceC19724h.mo53202i();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.HashTagListView$j */
    /* loaded from: classes5.dex */
    public static final class C10270j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10270j f52899q = new C10270j();

        C10270j() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(Video video) {
            AbstractC19074t.m100208f(video, "i");
            return video.m52911t();
        }
    }

    public HashTagListView() {
        String uuid = UUID.randomUUID().toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        this.f52885G0 = uuid;
    }

    /* renamed from: ZK */
    private final boolean m54381ZK() {
        boolean z11;
        String str = this.f52883E0;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    /* renamed from: aL */
    public static final void m54382aL(HashTagListView hashTagListView, View view) {
        AbstractC19074t.m100208f(hashTagListView, "this$0");
        hashTagListView.finish();
    }

    /* renamed from: bL */
    public final void m54383bL() {
        OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = this.f52881C0;
        if (gridLayoutManager != null) {
            int m9740Y1 = gridLayoutManager.m9740Y1();
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager2 = this.f52881C0;
            if (gridLayoutManager2 != null) {
                Iterator it = new C22537f(m9740Y1, gridLayoutManager2.m9745c2()).iterator();
                while (it.hasNext()) {
                    int mo116552a = ((AbstractC25351j0) it).mo116552a();
                    C25013h1 c25013h1 = this.f52879A0;
                    if (c25013h1 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25013h1 = null;
                    }
                    RecyclerView.AbstractC1876c0 m9900t0 = c25013h1.f119941u.m9900t0(mo116552a);
                    if (m9900t0 instanceof C31174l.c) {
                        ((C31174l.c) m9900t0).m151764l0(m54381ZK());
                    }
                }
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        String str2;
        super.mo37111CJ(bundle);
        this.f52886z0 = AbstractC28684a.Companion.m143689w();
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19724h interfaceC19724h = this.f52886z0;
        String str3 = null;
        if (interfaceC19724h == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19724h = null;
        }
        lifecycle.mo9335a(interfaceC19724h);
        InterfaceC19724h interfaceC19724h2 = this.f52886z0;
        if (interfaceC19724h2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19724h2 = null;
        }
        interfaceC19724h2.mo52965Lb(this);
        InterfaceC19724h interfaceC19724h3 = this.f52886z0;
        if (interfaceC19724h3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19724h3 = null;
        }
        interfaceC19724h3.mo52970uo(m92642L3());
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("HASH_TAG_LIST");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f52882D0 = str;
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            str3 = m92642L32.getString("COLLECTION_ID");
        }
        if (str3 == null) {
            str2 = "";
        } else {
            str2 = str3;
        }
        this.f52883E0 = str2;
        C31174l c31174l = new C31174l(this.f52882D0, str2, null, 4, null);
        c31174l.m151759a0(new C10265e(c31174l, this));
        this.f52880B0 = c31174l;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25013h1 m129835c = C25013h1.m129835c(layoutInflater);
        AbstractC19074t.m100207e(m129835c, "inflate(...)");
        this.f52879A0 = m129835c;
        C25013h1 c25013h1 = null;
        if (m129835c == null) {
            AbstractC19074t.m100223u("binding");
            m129835c = null;
        }
        LoadMoreVideoReceiver loadMoreVideoReceiver = new LoadMoreVideoReceiver(new C10266f(), new C10267g());
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        loadMoreVideoReceiver.mo53685d(m92689tK);
        this.f52884F0 = loadMoreVideoReceiver;
        m129835c.f119938r.f119989q.setOnClickListener(new View.OnClickListener() { // from class: m20.g0
            public /* synthetic */ ViewOnClickListenerC22746g0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HashTagListView.m54382aL(HashTagListView.this, view);
            }
        });
        m129835c.f119938r.f119995w.setText(this.f52882D0);
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
            overScrollableRecyclerView.setAdapter(this.f52880B0);
            HashTagListView$onCreateView$1$6$gridManager$1 hashTagListView$onCreateView$1$6$gridManager$1 = new OverScrollableRecyclerView.GridLayoutManager(overScrollableRecyclerView.getContext()) { // from class: com.zing.zalo.shortvideo.ui.view.HashTagListView$onCreateView$1$6$gridManager$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public HashTagListView$onCreateView$1$6$gridManager$1(Context context) {
                    super(context, 2, 0, false, false, 28, null);
                    AbstractC19074t.m100205c(context);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
                /* renamed from: W0 */
                public void mo9666W0(RecyclerView.C1899z c1899z) {
                    super.mo9666W0(c1899z);
                    HashTagListView.this.m54383bL();
                }
            };
            overScrollableRecyclerView.setLayoutManager(hashTagListView$onCreateView$1$6$gridManager$1);
            this.f52881C0 = hashTagListView$onCreateView$1$6$gridManager$1;
            overScrollableRecyclerView.m9826E(new C10262b());
            AbstractC19074t.m100205c(overScrollableRecyclerView);
            OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView, new C10268h(), 0.0f, 2, null);
            OverScrollableRecyclerView.m56143g2(overScrollableRecyclerView, new C10269i(m129835c, this), 0.0f, 2, null);
            C25013h1 c25013h12 = this.f52879A0;
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
        LoadMoreVideoReceiver loadMoreVideoReceiver = this.f52884F0;
        if (loadMoreVideoReceiver != null) {
            loadMoreVideoReceiver.mo53687g();
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(HashTagListView.class, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        InterfaceC19724h interfaceC19724h = this.f52886z0;
        InterfaceC19724h interfaceC19724h2 = null;
        if (interfaceC19724h == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19724h = null;
        }
        if (interfaceC19724h.mo53200G() == null) {
            C25013h1 c25013h1 = this.f52879A0;
            if (c25013h1 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h1 = null;
            }
            c25013h1.f119939s.m55786j();
            InterfaceC19724h interfaceC19724h3 = this.f52886z0;
            if (interfaceC19724h3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC19724h2 = interfaceC19724h3;
            }
            interfaceC19724h2.mo53202i();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C25013h1 c25013h1 = this.f52879A0;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        if (c25013h1.f119937q.m56227b()) {
            c25013h1.f119937q.m56226a();
        }
        c25013h1.f119939s.m55781c();
    }

    @Override // m20.InterfaceC22742f0
    /* renamed from: b */
    public void mo54384b(boolean z11) {
        InterfaceC19724h interfaceC19724h = this.f52886z0;
        InterfaceC19724h interfaceC19724h2 = null;
        if (interfaceC19724h == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19724h = null;
        }
        if (interfaceC19724h.mo53200G() == null) {
            C25013h1 c25013h1 = this.f52879A0;
            if (c25013h1 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h1 = null;
            }
            if (z11) {
                c25013h1.f119939s.m55786j();
                InterfaceC19724h interfaceC19724h3 = this.f52886z0;
                if (interfaceC19724h3 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC19724h2 = interfaceC19724h3;
                }
                interfaceC19724h2.mo53202i();
            }
        }
    }

    @Override // m20.InterfaceC22742f0
    /* renamed from: d */
    public void mo54385d(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        C25013h1 c25013h1 = this.f52879A0;
        C25013h1 c25013h12 = null;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        if (c25013h1.f119937q.m56227b()) {
            C25013h1 c25013h13 = this.f52879A0;
            if (c25013h13 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h13 = null;
            }
            c25013h13.f119937q.m56226a();
        }
        C31174l c31174l = this.f52880B0;
        if (c31174l != null) {
            c31174l.m151445N();
        }
        InterfaceC19724h interfaceC19724h = this.f52886z0;
        if (interfaceC19724h == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19724h = null;
        }
        if (interfaceC19724h.mo53200G() == null) {
            C25013h1 c25013h14 = this.f52879A0;
            if (c25013h14 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25013h12 = c25013h14;
            }
            if (th2 instanceof NetworkException) {
                c25013h12.f119939s.m55784g(new C10263c(c25013h12, this));
            } else {
                c25013h12.f119939s.m55783f(new C10264d(c25013h12, this));
            }
        }
    }

    @Override // m20.InterfaceC22742f0
    /* renamed from: e */
    public void mo54386e(Section section) {
        Integer num;
        AbstractC19074t.m100208f(section, "section");
        C31174l c31174l = this.f52880B0;
        if (c31174l != null) {
            int mo10003k = c31174l.mo10003k();
            c31174l.m151753T().m51163e(section, C10270j.f52899q);
            int mo10003k2 = c31174l.mo10003k() - mo10003k;
            List m51168m = c31174l.m151753T().m51168m();
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
            c31174l.m10015w(mo10003k, mo10003k2);
            c31174l.m151445N();
        }
    }

    @Override // m20.InterfaceC22742f0
    /* renamed from: o */
    public void mo54387o(Section section) {
        AbstractC19074t.m100208f(section, "section");
        C25013h1 c25013h1 = this.f52879A0;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        if (c25013h1.f119937q.m56227b()) {
            C25013h1 c25013h12 = this.f52879A0;
            if (c25013h12 == null) {
                AbstractC19074t.m100223u("binding");
                c25013h12 = null;
            }
            c25013h12.f119937q.m56226a();
        }
        C25013h1 c25013h13 = this.f52879A0;
        if (c25013h13 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h13 = null;
        }
        c25013h13.f119939s.m55781c();
        C31174l c31174l = this.f52880B0;
        if (c31174l != null) {
            c31174l.m151445N();
        }
        C31174l c31174l2 = this.f52880B0;
        if (c31174l2 != null) {
            int i11 = 0;
            for (Object obj : section.m51168m()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                ((Video) obj).m52853L0(Integer.valueOf(i11));
                i11 = i12;
            }
            c31174l2.m151760b0(section);
            c31174l2.m10008p();
        }
        if (section.m51168m().isEmpty()) {
            C25013h1 c25013h14 = this.f52879A0;
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
        AbstractC19074t.m100208f(bVar, "extras");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("HASH_TAG_LIST");
            if (string != null) {
                AbstractC19074t.m100205c(string);
                bVar.m111023b(0, string);
            }
            String string2 = m92642L3.getString("COLLECTION_ID");
            if (string2 != null) {
                AbstractC19074t.m100205c(string2);
                bVar.m111023b(1, string2);
            }
        }
    }

    @Override // m20.InterfaceC22742f0
    /* renamed from: of */
    public void mo54388of(String str) {
        AbstractC19074t.m100208f(str, "title");
        C25013h1 c25013h1 = this.f52879A0;
        if (c25013h1 == null) {
            AbstractC19074t.m100223u("binding");
            c25013h1 = null;
        }
        c25013h1.f119938r.f119995w.setText(str);
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
        String str2 = null;
        if (m111022a instanceof String) {
            str = (String) m111022a;
        } else {
            str = null;
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            m92642L3.putString("HASH_TAG_LIST", str);
        }
        Object m111022a2 = bVar.m111022a(1);
        if (m111022a2 instanceof String) {
            str2 = (String) m111022a2;
        }
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            m92642L32.putString("COLLECTION_ID", str2);
        }
    }
}
