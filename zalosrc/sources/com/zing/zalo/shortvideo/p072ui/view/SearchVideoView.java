package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.SearchAllResult;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.LoadMoreVideoReceiver;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.zview.ZaloView;
import e20.InterfaceC18188b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19735s;
import java.util.Iterator;
import java.util.UUID;
import ln0.C22537f;
import m20.InterfaceC22787q1;
import pm0.C24848g0;
import q10.C25061v1;
import qm0.AbstractC25351j0;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import z10.C31165g0;

/* loaded from: classes5.dex */
public final class SearchVideoView extends ZchBaseView implements InterfaceC22787q1, InterfaceC18188b {

    /* renamed from: A0 */
    private C25061v1 f53242A0;

    /* renamed from: B0 */
    private C31165g0 f53243B0;

    /* renamed from: C0 */
    private LoadMoreVideoReceiver f53244C0;

    /* renamed from: D0 */
    private GridLayoutManager f53245D0;

    /* renamed from: E0 */
    private final String f53246E0;

    /* renamed from: F0 */
    private String f53247F0;

    /* renamed from: z0 */
    private final InterfaceC19735s f53248z0 = AbstractC28684a.Companion.m143673J();

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoView$a */
    /* loaded from: classes5.dex */
    private final class C10420a extends RecyclerView.AbstractC1892s {
        public C10420a() {
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
                SearchVideoView.this.m54880bL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoView$b */
    /* loaded from: classes5.dex */
    public static final class C10421b implements C31165g0.b {
        C10421b() {
        }

        @Override // z10.C31165g0.b
        /* renamed from: a */
        public void mo54885a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            SearchVideoView.this.f53248z0.mo53483t(SearchVideoView.this.f53247F0, loadMoreInfo);
        }

        @Override // z10.C31165g0.b
        /* renamed from: b */
        public void mo54886b(Section section, int i11) {
            AbstractC19074t.m100208f(section, "section");
            SearchVideoView.this.m55551QK(VideoChannelPagerView.Companion.m55120i(section, i11, SearchVideoView.this.f53247F0, SearchVideoView.this.f53246E0, "SOURCE_SEARCH_VIDEO"));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoView$c */
    /* loaded from: classes5.dex */
    static final class C10422c extends AbstractC19075u implements InterfaceC18509p {
        C10422c() {
            super(2);
        }

        /* renamed from: a */
        public final void m54887a(String str, String str2) {
            Section mo146381t;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            if (AbstractC19074t.m100204b(SearchVideoView.this.f53246E0, str2) && (mo146381t = AbstractC28684a.Companion.m143692z().mo146381t(str)) != null) {
                SearchVideoView.this.mo54882e(mo146381t);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54887a((String) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoView$d */
    /* loaded from: classes5.dex */
    static final class C10423d extends AbstractC19075u implements InterfaceC18511r {
        C10423d() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m54888a((String) obj, ((Number) obj2).intValue(), (String) obj3, (String) obj4);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54888a(String str, int i11, String str2, String str3) {
            C31165g0 c31165g0;
            GridLayoutManager gridLayoutManager;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            AbstractC19074t.m100208f(str3, "videoId");
            if (AbstractC19074t.m100204b(SearchVideoView.this.f53246E0, str2) && (c31165g0 = SearchVideoView.this.f53243B0) != null && i11 >= 0 && i11 < c31165g0.mo10003k() && (gridLayoutManager = SearchVideoView.this.f53245D0) != null) {
                gridLayoutManager.mo9756v1(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoView$e */
    /* loaded from: classes5.dex */
    public static final class C10424e implements OverScrollableRecyclerView.InterfaceC10832c {
        C10424e() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31165g0 c31165g0;
            C31165g0 c31165g02 = SearchVideoView.this.f53243B0;
            if (c31165g02 != null && !c31165g02.m151444M() && (c31165g0 = SearchVideoView.this.f53243B0) != null) {
                c31165g0.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoView$f */
    /* loaded from: classes5.dex */
    public static final class C10425f extends MetricAffectingSpan {
        C10425f() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            C25061v1 c25061v1 = SearchVideoView.this.f53242A0;
            C25061v1 c25061v12 = null;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            FrameLayout root = c25061v1.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            textPaint.setTypeface(AbstractC26112n.m134364E(root, 9));
            C25061v1 c25061v13 = SearchVideoView.this.f53242A0;
            if (c25061v13 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25061v12 = c25061v13;
            }
            FrameLayout root2 = c25061v12.getRoot();
            AbstractC19074t.m100207e(root2, "getRoot(...)");
            textPaint.setColor(AbstractC26112n.m134426u(root2, AbstractC27406a.zch_text_tertiary));
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "textPaint");
            updateDrawState(textPaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoView$g */
    /* loaded from: classes5.dex */
    public static final class C10426g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10426g f53255q = new C10426g();

        C10426g() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(Video video) {
            AbstractC19074t.m100208f(video, "i");
            return video.m52911t();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoView$h */
    /* loaded from: classes5.dex */
    static final class C10427h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f53256q;

        /* renamed from: r */
        final /* synthetic */ SearchVideoView f53257r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10427h(C25061v1 c25061v1, SearchVideoView searchVideoView) {
            super(0);
            this.f53256q = c25061v1;
            this.f53257r = searchVideoView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54890a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54890a() {
            this.f53256q.f120355r.m55786j();
            SearchPageView m54881ZK = this.f53257r.m54881ZK();
            if (m54881ZK != null) {
                m54881ZK.m54823iL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoView$i */
    /* loaded from: classes5.dex */
    static final class C10428i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f53258q;

        /* renamed from: r */
        final /* synthetic */ SearchVideoView f53259r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10428i(C25061v1 c25061v1, SearchVideoView searchVideoView) {
            super(0);
            this.f53258q = c25061v1;
            this.f53259r = searchVideoView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54891a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54891a() {
            this.f53258q.f120355r.m55786j();
            SearchPageView m54881ZK = this.f53259r.m54881ZK();
            if (m54881ZK != null) {
                m54881ZK.m54823iL();
            }
        }
    }

    public SearchVideoView() {
        String uuid = UUID.randomUUID().toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        this.f53246E0 = uuid;
        this.f53247F0 = "";
    }

    /* renamed from: aL */
    private final void m54879aL() {
        String str = "\"" + this.f53247F0 + "\"";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) m92652XI(AbstractC27413h.zch_page_search_no_video_found));
        C25061v1 c25061v1 = this.f53242A0;
        C25061v1 c25061v12 = null;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        FrameLayout root = c25061v1.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        append.setSpan(new ForegroundColorSpan(AbstractC26112n.m134426u(root, AbstractC27406a.zch_text_tertiary)), 0, append.length(), 17);
        spannableStringBuilder.append((CharSequence) " ");
        SpannableStringBuilder append2 = spannableStringBuilder.append((CharSequence) str);
        append2.setSpan(new C10425f(), append2.length() - str.length(), append2.length(), 17);
        C25061v1 c25061v13 = this.f53242A0;
        if (c25061v13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25061v12 = c25061v13;
        }
        LoadingLayout loadingLayout = c25061v12.f120355r;
        AbstractC19074t.m100207e(loadingLayout, "lytLoading");
        LoadingLayout.m55778e(loadingLayout, null, null, spannableStringBuilder, null, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bL */
    public final void m54880bL() {
        GridLayoutManager gridLayoutManager = this.f53245D0;
        if (gridLayoutManager != null) {
            int m9740Y1 = gridLayoutManager.m9740Y1();
            GridLayoutManager gridLayoutManager2 = this.f53245D0;
            if (gridLayoutManager2 != null) {
                Iterator it = new C22537f(m9740Y1, gridLayoutManager2.m9745c2()).iterator();
                while (it.hasNext()) {
                    int mo116552a = ((AbstractC25351j0) it).mo116552a();
                    C25061v1 c25061v1 = this.f53242A0;
                    if (c25061v1 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25061v1 = null;
                    }
                    RecyclerView.AbstractC1876c0 m9900t0 = c25061v1.f120356s.m9900t0(mo116552a);
                    if (m9900t0 instanceof C31165g0.c) {
                        ((C31165g0.c) m9900t0).m151636l0(this.f53247F0);
                    }
                }
            }
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: Bg */
    public void mo53932Bg() {
        InterfaceC18188b.a.m96939a(this);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        getLifecycle().mo9335a(this.f53248z0);
        this.f53248z0.mo52965Lb(this);
        this.f53248z0.mo52970uo(m92642L3());
        C31165g0 c31165g0 = new C31165g0(null, 1, 0 == true ? 1 : 0);
        c31165g0.m151631Z(new C10421b());
        this.f53243B0 = c31165g0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25061v1 m129957c = C25061v1.m129957c(layoutInflater);
        AbstractC19074t.m100207e(m129957c, "inflate(...)");
        this.f53242A0 = m129957c;
        C25061v1 c25061v1 = null;
        if (m129957c == null) {
            AbstractC19074t.m100223u("binding");
            m129957c = null;
        }
        C25061v1 c25061v12 = this.f53242A0;
        if (c25061v12 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v12 = null;
        }
        FrameLayout root = c25061v12.getRoot();
        AbstractC19074t.m100205c(root);
        root.setBackgroundColor(AbstractC26112n.m134426u(root, AbstractC27406a.zch_layer_background_subtle));
        LoadMoreVideoReceiver loadMoreVideoReceiver = new LoadMoreVideoReceiver(new C10422c(), new C10423d());
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        loadMoreVideoReceiver.mo53685d(m92689tK);
        this.f53244C0 = loadMoreVideoReceiver;
        OverScrollableRecyclerView overScrollableRecyclerView = m129957c.f120356s;
        AbstractC19074t.m100205c(overScrollableRecyclerView);
        AbstractC26112n.m134413n0(overScrollableRecyclerView, AbstractC26105g.m134347n(4));
        overScrollableRecyclerView.m9826E(new C10420a());
        OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView, new C10424e(), 0.0f, 2, null);
        overScrollableRecyclerView.setAdapter(this.f53243B0);
        final Context context = overScrollableRecyclerView.getContext();
        OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = new OverScrollableRecyclerView.GridLayoutManager(context) { // from class: com.zing.zalo.shortvideo.ui.view.SearchVideoView$onCreateView$1$5$gridManager$1
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
                SearchVideoView.this.m54880bL();
            }
        };
        this.f53245D0 = gridLayoutManager;
        overScrollableRecyclerView.setLayoutManager(gridLayoutManager);
        C25061v1 c25061v13 = this.f53242A0;
        if (c25061v13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25061v1 = c25061v13;
        }
        FrameLayout root2 = c25061v1.getRoot();
        AbstractC19074t.m100207e(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        LoadMoreVideoReceiver loadMoreVideoReceiver = this.f53244C0;
        if (loadMoreVideoReceiver != null) {
            loadMoreVideoReceiver.mo53687g();
        }
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: Mz */
    public void mo54732Mz(String str, Throwable th2) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(th2, "throwable");
        C25061v1 c25061v1 = this.f53242A0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        if (th2 instanceof NetworkException) {
            c25061v1.f120355r.m55784g(new C10427h(c25061v1, this));
        } else {
            c25061v1.f120355r.m55783f(new C10428i(c25061v1, this));
        }
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: QA */
    public void mo54733QA(String str, SearchAllResult searchAllResult) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(searchAllResult, "result");
        this.f53247F0 = str;
        m54883o(searchAllResult.m51139c());
    }

    /* renamed from: ZK */
    public final SearchPageView m54881ZK() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof SearchPageView) {
            return (SearchPageView) m92650VI;
        }
        return null;
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: d0 */
    public void mo53934d0() {
        InterfaceC18188b.a.m96941c(this);
    }

    @Override // e20.InterfaceC18187a
    public void deactivate() {
        InterfaceC18188b.a.m96940b(this);
    }

    @Override // m20.InterfaceC22787q1
    /* renamed from: e */
    public void mo54882e(Section section) {
        AbstractC19074t.m100208f(section, "section");
        C31165g0 c31165g0 = this.f53243B0;
        if (c31165g0 != null) {
            int mo10003k = c31165g0.mo10003k();
            c31165g0.m151626T().m51163e(section, C10426g.f53255q);
            int mo10003k2 = c31165g0.mo10003k() - mo10003k;
            c31165g0.m10009q(mo10003k - 1);
            c31165g0.m10015w(mo10003k, mo10003k2);
        }
        C31165g0 c31165g02 = this.f53243B0;
        if (c31165g02 != null) {
            c31165g02.m151445N();
        }
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: h9 */
    public void mo54739h9() {
        C25061v1 c25061v1 = this.f53242A0;
        C25061v1 c25061v12 = null;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55781c();
        C25061v1 c25061v13 = this.f53242A0;
        if (c25061v13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25061v12 = c25061v13;
        }
        c25061v12.f120355r.m55780b();
        C31165g0 c31165g0 = this.f53243B0;
        if (c31165g0 != null) {
            c31165g0.m151624R();
        }
    }

    /* renamed from: o */
    public final void m54883o(Section section) {
        if (section != null && !section.m51168m().isEmpty()) {
            C25061v1 c25061v1 = this.f53242A0;
            C25061v1 c25061v12 = null;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            c25061v1.f120355r.m55781c();
            C25061v1 c25061v13 = this.f53242A0;
            if (c25061v13 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25061v12 = c25061v13;
            }
            c25061v12.f120355r.m55780b();
            C31165g0 c31165g0 = this.f53243B0;
            if (c31165g0 != null) {
                c31165g0.m151445N();
            }
            C31165g0 c31165g02 = this.f53243B0;
            if (c31165g02 != null) {
                c31165g02.m151632a0(section);
                c31165g02.m10008p();
                return;
            }
            return;
        }
        m54879aL();
    }

    @Override // m20.InterfaceC22787q1
    /* renamed from: p */
    public void mo54884p(String str, Throwable th2) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(th2, "throwable");
        C31165g0 c31165g0 = this.f53243B0;
        if (c31165g0 != null) {
            c31165g0.m151445N();
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: r4 */
    public void mo53937r4() {
        InterfaceC18188b.a.m96942d(this);
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: wx */
    public void mo54742wx(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        C25061v1 c25061v1 = this.f53242A0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55786j();
    }
}
