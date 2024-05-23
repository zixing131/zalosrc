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
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.SearchAllResult;
import com.zing.zalo.shortvideo.data.model.SearchHashTag;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.zview.ZaloView;
import e20.InterfaceC18188b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import h20.InterfaceC19730n;
import m20.InterfaceC22755i1;
import pm0.C24848g0;
import q10.C25061v1;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import z10.C31161e0;

/* loaded from: classes5.dex */
public final class SearchHashtagView extends ZchBaseView implements InterfaceC22755i1, InterfaceC18188b {

    /* renamed from: A0 */
    private C25061v1 f53180A0;

    /* renamed from: B0 */
    private C31161e0 f53181B0;

    /* renamed from: z0 */
    private final InterfaceC19730n f53183z0 = AbstractC28684a.Companion.m143670G();

    /* renamed from: C0 */
    private String f53182C0 = "";

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchHashtagView$a */
    /* loaded from: classes5.dex */
    public static final class C10385a implements C31161e0.b {
        C10385a() {
        }

        @Override // z10.C31161e0.b
        /* renamed from: a */
        public void mo54791a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            SearchHashtagView.this.f53183z0.mo53429t(SearchHashtagView.this.f53182C0, loadMoreInfo);
        }

        @Override // z10.C31161e0.b
        /* renamed from: b */
        public void mo54792b(SearchHashTag searchHashTag) {
            AbstractC19074t.m100208f(searchHashTag, "searchHashTag");
            SearchHashtagView.this.m55551QK(HashTagListView.Companion.m54392d("#" + searchHashTag.m51145c()));
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = SearchHashtagView.this.m92652XI(AbstractC27413h.zch_action_key_search_hashtag_detail);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            c19205a.m100713L(m92652XI, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchHashtagView$b */
    /* loaded from: classes5.dex */
    public static final class C10386b implements OverScrollableRecyclerView.InterfaceC10832c {
        C10386b() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31161e0 c31161e0;
            C31161e0 c31161e02 = SearchHashtagView.this.f53181B0;
            if (c31161e02 != null && !c31161e02.m151444M() && (c31161e0 = SearchHashtagView.this.f53181B0) != null) {
                c31161e0.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchHashtagView$c */
    /* loaded from: classes5.dex */
    public static final class C10387c extends MetricAffectingSpan {
        C10387c() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            C25061v1 c25061v1 = SearchHashtagView.this.f53180A0;
            C25061v1 c25061v12 = null;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            FrameLayout root = c25061v1.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            textPaint.setTypeface(AbstractC26112n.m134364E(root, 9));
            C25061v1 c25061v13 = SearchHashtagView.this.f53180A0;
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

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchHashtagView$d */
    /* loaded from: classes5.dex */
    static final class C10388d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10388d f53187q = new C10388d();

        C10388d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(SearchHashTag searchHashTag) {
            AbstractC19074t.m100208f(searchHashTag, "i");
            return searchHashTag.m51145c();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchHashtagView$e */
    /* loaded from: classes5.dex */
    static final class C10389e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f53188q;

        /* renamed from: r */
        final /* synthetic */ SearchHashtagView f53189r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10389e(C25061v1 c25061v1, SearchHashtagView searchHashtagView) {
            super(0);
            this.f53188q = c25061v1;
            this.f53189r = searchHashtagView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54794a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54794a() {
            this.f53188q.f120355r.m55786j();
            SearchPageView m54786WK = this.f53189r.m54786WK();
            if (m54786WK != null) {
                m54786WK.m54823iL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchHashtagView$f */
    /* loaded from: classes5.dex */
    static final class C10390f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f53190q;

        /* renamed from: r */
        final /* synthetic */ SearchHashtagView f53191r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10390f(C25061v1 c25061v1, SearchHashtagView searchHashtagView) {
            super(0);
            this.f53190q = c25061v1;
            this.f53191r = searchHashtagView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54795a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54795a() {
            this.f53190q.f120355r.m55786j();
            SearchPageView m54786WK = this.f53191r.m54786WK();
            if (m54786WK != null) {
                m54786WK.m54823iL();
            }
        }
    }

    /* renamed from: XK */
    private final void m54785XK() {
        String str = "\"" + this.f53182C0 + "\"";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) m92652XI(AbstractC27413h.zch_page_search_no_hashtag_found));
        C25061v1 c25061v1 = this.f53180A0;
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
        append2.setSpan(new C10387c(), append2.length() - str.length(), append2.length(), 17);
        C25061v1 c25061v13 = this.f53180A0;
        if (c25061v13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25061v12 = c25061v13;
        }
        LoadingLayout loadingLayout = c25061v12.f120355r;
        AbstractC19074t.m100207e(loadingLayout, "lytLoading");
        LoadingLayout.m55778e(loadingLayout, null, null, spannableStringBuilder, null, null, null, 59, null);
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
        getLifecycle().mo9335a(this.f53183z0);
        this.f53183z0.mo52965Lb(this);
        this.f53183z0.mo52970uo(m92642L3());
        C31161e0 c31161e0 = new C31161e0(null, 1, null);
        c31161e0.m151550Y(new C10385a());
        this.f53181B0 = c31161e0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25061v1 m129957c = C25061v1.m129957c(layoutInflater);
        AbstractC19074t.m100207e(m129957c, "inflate(...)");
        this.f53180A0 = m129957c;
        C25061v1 c25061v1 = null;
        if (m129957c == null) {
            AbstractC19074t.m100223u("binding");
            m129957c = null;
        }
        C25061v1 c25061v12 = this.f53180A0;
        if (c25061v12 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v12 = null;
        }
        FrameLayout root = c25061v12.getRoot();
        AbstractC19074t.m100205c(root);
        root.setBackgroundColor(AbstractC26112n.m134426u(root, AbstractC27406a.zch_layer_background_subtle));
        OverScrollableRecyclerView overScrollableRecyclerView = m129957c.f120356s;
        AbstractC19074t.m100205c(overScrollableRecyclerView);
        AbstractC26112n.m134421r0(overScrollableRecyclerView, AbstractC26105g.m134347n(4));
        Context context = overScrollableRecyclerView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        overScrollableRecyclerView.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(context, 0, false, false, 14, null));
        overScrollableRecyclerView.setAdapter(this.f53181B0);
        OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView, new C10386b(), 0.0f, 2, null);
        C25061v1 c25061v13 = this.f53180A0;
        if (c25061v13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25061v1 = c25061v13;
        }
        FrameLayout root2 = c25061v1.getRoot();
        AbstractC19074t.m100207e(root2, "getRoot(...)");
        return root2;
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: Mz */
    public void mo54732Mz(String str, Throwable th2) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(th2, "throwable");
        C25061v1 c25061v1 = this.f53180A0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        if (th2 instanceof NetworkException) {
            c25061v1.f120355r.m55784g(new C10389e(c25061v1, this));
        } else {
            c25061v1.f120355r.m55783f(new C10390f(c25061v1, this));
        }
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: QA */
    public void mo54733QA(String str, SearchAllResult searchAllResult) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(searchAllResult, "result");
        this.f53182C0 = str;
        m54789o(searchAllResult.m51138b());
    }

    /* renamed from: WK */
    public final SearchPageView m54786WK() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof SearchPageView) {
            return (SearchPageView) m92650VI;
        }
        return null;
    }

    @Override // m20.InterfaceC22755i1
    /* renamed from: b */
    public void mo54787b(boolean z11) {
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

    @Override // m20.InterfaceC22755i1
    /* renamed from: e */
    public void mo54788e(Section section) {
        AbstractC19074t.m100208f(section, "section");
        C31161e0 c31161e0 = this.f53181B0;
        if (c31161e0 != null) {
            int mo10003k = c31161e0.mo10003k();
            c31161e0.m151545T().m51163e(section, C10388d.f53187q);
            c31161e0.m10015w(mo10003k, c31161e0.mo10003k() - mo10003k);
        }
        C31161e0 c31161e02 = this.f53181B0;
        if (c31161e02 != null) {
            c31161e02.m151445N();
        }
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: h9 */
    public void mo54739h9() {
        C25061v1 c25061v1 = this.f53180A0;
        C25061v1 c25061v12 = null;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55781c();
        C25061v1 c25061v13 = this.f53180A0;
        if (c25061v13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25061v12 = c25061v13;
        }
        c25061v12.f120355r.m55780b();
        C31161e0 c31161e0 = this.f53181B0;
        if (c31161e0 != null) {
            c31161e0.m151543R();
        }
    }

    /* renamed from: o */
    public final void m54789o(Section section) {
        if (section != null && !section.m51168m().isEmpty()) {
            C25061v1 c25061v1 = this.f53180A0;
            C25061v1 c25061v12 = null;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            c25061v1.f120355r.m55781c();
            C25061v1 c25061v13 = this.f53180A0;
            if (c25061v13 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25061v12 = c25061v13;
            }
            c25061v12.f120355r.m55780b();
            C31161e0 c31161e0 = this.f53181B0;
            if (c31161e0 != null) {
                c31161e0.m151445N();
            }
            C31161e0 c31161e02 = this.f53181B0;
            if (c31161e02 != null) {
                c31161e02.m151551Z(section);
                c31161e02.m10008p();
                return;
            }
            return;
        }
        m54785XK();
    }

    @Override // m20.InterfaceC22755i1
    /* renamed from: p */
    public void mo54790p(String str, Throwable th2) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(th2, "throwable");
        C31161e0 c31161e0 = this.f53181B0;
        if (c31161e0 != null) {
            c31161e0.m151445N();
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
        C25061v1 c25061v1 = this.f53180A0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55786j();
    }
}
