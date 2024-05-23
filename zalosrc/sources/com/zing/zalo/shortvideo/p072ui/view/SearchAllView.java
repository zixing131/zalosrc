package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b20.C2499e;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.SearchAllData;
import com.zing.zalo.shortvideo.data.model.SearchAllResult;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.ChannelReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.LoadMoreVideoReceiver;
import com.zing.zalo.shortvideo.p072ui.view.ChannelPageView;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import e20.InterfaceC18188b;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import f20.C18707e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import h20.InterfaceC19728l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ln0.C22537f;
import m20.InterfaceC22747g1;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25061v1;
import q20.C25097t;
import qm0.AbstractC25351j0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25370t;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import z10.C31155b0;

/* loaded from: classes5.dex */
public final class SearchAllView extends ZchBaseView implements InterfaceC22747g1, InterfaceC18188b {

    /* renamed from: A0 */
    private C31155b0 f53136A0;

    /* renamed from: B0 */
    private ChannelReceiver f53137B0;

    /* renamed from: C0 */
    private final InterfaceC19728l f53138C0 = AbstractC28684a.Companion.m143668E();

    /* renamed from: D0 */
    private LoadMoreVideoReceiver f53139D0;

    /* renamed from: E0 */
    private GridLayoutManager f53140E0;

    /* renamed from: F0 */
    private final String f53141F0;

    /* renamed from: G0 */
    private String f53142G0;

    /* renamed from: z0 */
    private C25061v1 f53143z0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$a */
    /* loaded from: classes5.dex */
    private final class C10366a extends RecyclerView.AbstractC1892s {
        public C10366a() {
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
                SearchAllView.this.m54730dL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$b */
    /* loaded from: classes5.dex */
    static final class C10367b extends AbstractC19075u implements InterfaceC18509p {
        C10367b() {
            super(2);
        }

        /* renamed from: a */
        public final void m54744a(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "id");
            if (z11) {
                C31155b0 c31155b0 = SearchAllView.this.f53136A0;
                if (c31155b0 != null) {
                    c31155b0.m151468X(str);
                    return;
                }
                return;
            }
            C31155b0 c31155b02 = SearchAllView.this.f53136A0;
            if (c31155b02 != null) {
                c31155b02.m151469Y(str);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54744a((String) obj, ((Boolean) obj2).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$c */
    /* loaded from: classes5.dex */
    public static final class C10368c implements C31155b0.b {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$c$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ SearchAllView f53147q;

            /* renamed from: r */
            final /* synthetic */ Channel f53148r;

            /* renamed from: s */
            final /* synthetic */ C10368c f53149s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SearchAllView searchAllView, Channel channel, C10368c c10368c) {
                super(0);
                this.f53147q = searchAllView;
                this.f53148r = channel;
                this.f53149s = c10368c;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54752a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54752a() {
                this.f53147q.f53138C0.mo53383B2(this.f53148r.m50769l());
                C10368c.m54746g(this.f53149s, this.f53148r, false, false, 4, null);
            }
        }

        C10368c() {
        }

        /* renamed from: f */
        private final void m54745f(Channel channel, boolean z11, boolean z12) {
            int i11;
            Map m131407l;
            SearchAllView searchAllView = SearchAllView.this;
            if (z11) {
                i11 = AbstractC27413h.zch_action_key_search_follow_channel;
            } else if (z12) {
                i11 = AbstractC27413h.zch_action_key_search_unfollow_confirm;
            } else {
                i11 = AbstractC27413h.zch_action_key_search_unfollow_channel;
            }
            String m92652XI = searchAllView.m92652XI(i11);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
            c19205a.m100713L(m92652XI, m131407l);
        }

        /* renamed from: g */
        static /* synthetic */ void m54746g(C10368c c10368c, Channel channel, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z12 = true;
            }
            c10368c.m54745f(channel, z11, z12);
        }

        @Override // z10.C31155b0.b
        /* renamed from: a */
        public void mo54747a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "loadMore");
            SearchAllView.this.f53138C0.mo53385t(SearchAllView.this.f53142G0, loadMoreInfo);
        }

        @Override // z10.C31155b0.b
        /* renamed from: b */
        public void mo54748b(Channel channel) {
            AbstractC19074t.m100208f(channel, "channel");
            SearchAllView.this.m55551QK(ChannelPageView.C10134b.m53981c(ChannelPageView.Companion, channel, null, 2, null));
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = SearchAllView.this.m92652XI(AbstractC27413h.zch_action_key_search_channel_detail);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            c19205a.m100713L(m92652XI, null);
        }

        @Override // z10.C31155b0.b
        /* renamed from: c */
        public void mo54749c(Channel channel, boolean z11) {
            AbstractC19074t.m100208f(channel, "channel");
            if (z11) {
                SearchAllView.this.f53138C0.mo53384a2(channel.m50769l());
                m54746g(this, channel, true, false, 4, null);
                return;
            }
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_title), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_message), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_positive), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_negative), null, false, false, 112, null);
            m51992b.m51991lL(new a(SearchAllView.this, channel, this));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, SearchAllView.this.m54734ZK(), null, 2, null);
            m54745f(channel, false, false);
        }

        @Override // z10.C31155b0.b
        /* renamed from: d */
        public void mo54750d() {
            SearchPageView m54735aL = SearchAllView.this.m54735aL();
            if (m54735aL != null) {
                m54735aL.m54822hL(C18707e.e.f93989r.ordinal());
            }
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = SearchAllView.this.m92652XI(AbstractC27413h.zch_action_key_search_channel_more);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            c19205a.m100713L(m92652XI, null);
        }

        @Override // z10.C31155b0.b
        /* renamed from: e */
        public void mo54751e(Section section, int i11) {
            AbstractC19074t.m100208f(section, "section");
            SearchAllView.this.m55551QK(VideoChannelPagerView.Companion.m55120i(section, i11, SearchAllView.this.f53142G0, SearchAllView.this.f53141F0, "SOURCE_SEARCH_ALL"));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$d */
    /* loaded from: classes5.dex */
    public static final class C10369d implements OverScrollableRecyclerView.InterfaceC10832c {
        C10369d() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31155b0 c31155b0;
            C31155b0 c31155b02 = SearchAllView.this.f53136A0;
            if (c31155b02 != null && !c31155b02.m151444M() && (c31155b0 = SearchAllView.this.f53136A0) != null) {
                c31155b0.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$e */
    /* loaded from: classes5.dex */
    static final class C10370e extends AbstractC19075u implements InterfaceC18509p {
        C10370e() {
            super(2);
        }

        /* renamed from: a */
        public final void m54753a(String str, String str2) {
            Section mo146381t;
            int m131511r;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            if (AbstractC19074t.m100204b(SearchAllView.this.f53141F0, str2) && (mo146381t = AbstractC28684a.Companion.m143692z().mo146381t(str)) != null) {
                List m51168m = mo146381t.m51168m();
                m131511r = AbstractC25370t.m131511r(m51168m, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = m51168m.iterator();
                while (it.hasNext()) {
                    arrayList.add(new SearchAllData((Video) it.next()));
                }
                SearchAllView.this.mo54738e(new Section(arrayList, 0L, mo146381t.m51169n(), 2, (AbstractC19060k) null));
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54753a((String) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$f */
    /* loaded from: classes5.dex */
    static final class C10371f extends AbstractC19075u implements InterfaceC18511r {
        C10371f() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m54754a((String) obj, ((Number) obj2).intValue(), (String) obj3, (String) obj4);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54754a(String str, int i11, String str2, String str3) {
            int i12;
            GridLayoutManager gridLayoutManager;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            AbstractC19074t.m100208f(str3, "videoId");
            if (AbstractC19074t.m100204b(SearchAllView.this.f53141F0, str2)) {
                C31155b0 c31155b0 = SearchAllView.this.f53136A0;
                if (c31155b0 != null) {
                    i12 = c31155b0.m151464T(str3);
                } else {
                    i12 = -1;
                }
                if (i12 >= 0 && (gridLayoutManager = SearchAllView.this.f53140E0) != null) {
                    gridLayoutManager.mo9756v1(i12);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$g */
    /* loaded from: classes5.dex */
    public static final class C10372g extends GridLayoutManager.AbstractC1865b {
        C10372g() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            Integer num;
            C31155b0 c31155b0 = SearchAllView.this.f53136A0;
            if (c31155b0 != null) {
                num = Integer.valueOf(c31155b0.mo10005m(i11));
            } else {
                num = null;
            }
            if (num == null || num.intValue() != 2) {
                return 2;
            }
            return 1;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$h */
    /* loaded from: classes5.dex */
    public static final class C10373h extends MetricAffectingSpan {
        C10373h() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            C25061v1 c25061v1 = SearchAllView.this.f53143z0;
            C25061v1 c25061v12 = null;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            FrameLayout root = c25061v1.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            textPaint.setTypeface(AbstractC26112n.m134364E(root, 9));
            C25061v1 c25061v13 = SearchAllView.this.f53143z0;
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

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$i */
    /* loaded from: classes5.dex */
    static final class C10374i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f53155q;

        /* renamed from: r */
        final /* synthetic */ SearchAllView f53156r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10374i(C25061v1 c25061v1, SearchAllView searchAllView) {
            super(0);
            this.f53155q = c25061v1;
            this.f53156r = searchAllView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54755a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54755a() {
            this.f53155q.f120355r.m55786j();
            SearchPageView m54735aL = this.f53156r.m54735aL();
            if (m54735aL != null) {
                m54735aL.m54823iL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$j */
    /* loaded from: classes5.dex */
    static final class C10375j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f53157q;

        /* renamed from: r */
        final /* synthetic */ SearchAllView f53158r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10375j(C25061v1 c25061v1, SearchAllView searchAllView) {
            super(0);
            this.f53157q = c25061v1;
            this.f53158r = searchAllView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54756a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54756a() {
            this.f53157q.f120355r.m55786j();
            SearchPageView m54735aL = this.f53158r.m54735aL();
            if (m54735aL != null) {
                m54735aL.m54823iL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchAllView$k */
    /* loaded from: classes5.dex */
    public static final class C10376k extends ClickableSpan {
        C10376k() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            C25061v1 c25061v1 = SearchAllView.this.f53143z0;
            C25061v1 c25061v12 = null;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            FrameLayout root = c25061v1.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            textPaint.setTypeface(AbstractC26112n.m134364E(root, 9));
            C25061v1 c25061v13 = SearchAllView.this.f53143z0;
            if (c25061v13 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25061v12 = c25061v13;
            }
            FrameLayout root2 = c25061v12.getRoot();
            AbstractC19074t.m100207e(root2, "getRoot(...)");
            textPaint.setColor(AbstractC26112n.m134426u(root2, AbstractC27406a.zch_text_tertiary));
        }
    }

    public SearchAllView() {
        String uuid = UUID.randomUUID().toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        this.f53141F0 = uuid;
        this.f53142G0 = "";
    }

    /* renamed from: cL */
    private final void m54729cL() {
        String str = "\"" + this.f53142G0 + "\"";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) m92652XI(AbstractC27413h.zch_page_search_no_results_found));
        C25061v1 c25061v1 = this.f53143z0;
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
        append2.setSpan(new C10373h(), append2.length() - str.length(), append2.length(), 17);
        C25061v1 c25061v13 = this.f53143z0;
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
    /* renamed from: dL */
    public final void m54730dL() {
        GridLayoutManager gridLayoutManager = this.f53140E0;
        if (gridLayoutManager != null) {
            int m9740Y1 = gridLayoutManager.m9740Y1();
            GridLayoutManager gridLayoutManager2 = this.f53140E0;
            if (gridLayoutManager2 != null) {
                Iterator it = new C22537f(m9740Y1, gridLayoutManager2.m9745c2()).iterator();
                while (it.hasNext()) {
                    int mo116552a = ((AbstractC25351j0) it).mo116552a();
                    C25061v1 c25061v1 = this.f53143z0;
                    if (c25061v1 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25061v1 = null;
                    }
                    RecyclerView.AbstractC1876c0 m9900t0 = c25061v1.f120356s.m9900t0(mo116552a);
                    if (m9900t0 instanceof C31155b0.g) {
                        ((C31155b0.g) m9900t0).m151479k0(this.f53142G0);
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
        getLifecycle().mo9335a(this.f53138C0);
        this.f53138C0.mo52965Lb(this);
        this.f53138C0.mo52970uo(m92642L3());
        ChannelReceiver channelReceiver = new ChannelReceiver(null, null, null, new C10367b(), null, 23, null);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        channelReceiver.mo53685d(m92689tK);
        this.f53137B0 = channelReceiver;
        String m92652XI = m92652XI(AbstractC27413h.zch_page_search_menu_channel);
        String m92652XI2 = m92652XI(AbstractC27413h.zch_page_search_menu_video);
        String m92652XI3 = m92652XI(AbstractC27413h.zch_page_search_history_see_more);
        AbstractC19074t.m100205c(m92652XI);
        AbstractC19074t.m100205c(m92652XI2);
        AbstractC19074t.m100205c(m92652XI3);
        C31155b0 c31155b0 = new C31155b0(null, m92652XI, m92652XI2, m92652XI3, 1, null);
        c31155b0.m151474d0(new C10368c());
        this.f53136A0 = c31155b0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25061v1 m129957c = C25061v1.m129957c(layoutInflater);
        AbstractC19074t.m100207e(m129957c, "inflate(...)");
        this.f53143z0 = m129957c;
        C25061v1 c25061v1 = null;
        if (m129957c == null) {
            AbstractC19074t.m100223u("binding");
            m129957c = null;
        }
        C25061v1 c25061v12 = this.f53143z0;
        if (c25061v12 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v12 = null;
        }
        FrameLayout root = c25061v12.getRoot();
        AbstractC19074t.m100205c(root);
        root.setBackgroundColor(AbstractC26112n.m134426u(root, AbstractC27406a.zch_layer_background_subtle));
        OverScrollableRecyclerView overScrollableRecyclerView = m129957c.f120356s;
        AbstractC19074t.m100205c(overScrollableRecyclerView);
        AbstractC26112n.m134413n0(overScrollableRecyclerView, AbstractC26105g.m134347n(4));
        overScrollableRecyclerView.m9826E(new C10366a());
        Context context = overScrollableRecyclerView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        overScrollableRecyclerView.m9816A(new C2499e(context));
        OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView, new C10369d(), 0.0f, 2, null);
        LoadMoreVideoReceiver loadMoreVideoReceiver = new LoadMoreVideoReceiver(new C10370e(), new C10371f());
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        loadMoreVideoReceiver.mo53685d(m92689tK);
        this.f53139D0 = loadMoreVideoReceiver;
        overScrollableRecyclerView.setAdapter(this.f53136A0);
        final Context context2 = overScrollableRecyclerView.getContext();
        OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = new OverScrollableRecyclerView.GridLayoutManager(context2) { // from class: com.zing.zalo.shortvideo.ui.view.SearchAllView$onCreateView$1$2$gridManager$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context2, 2, 0, false, false, 28, null);
                AbstractC19074t.m100205c(context2);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
            /* renamed from: W0 */
            public void mo9666W0(RecyclerView.C1899z c1899z) {
                super.mo9666W0(c1899z);
                SearchAllView.this.m54730dL();
            }
        };
        gridLayoutManager.m9671f3(new C10372g());
        this.f53140E0 = gridLayoutManager;
        overScrollableRecyclerView.setLayoutManager(gridLayoutManager);
        C25061v1 c25061v13 = this.f53143z0;
        if (c25061v13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25061v1 = c25061v13;
        }
        FrameLayout root2 = c25061v1.getRoot();
        AbstractC19074t.m100207e(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        ChannelReceiver channelReceiver = this.f53137B0;
        if (channelReceiver != null) {
            channelReceiver.mo53687g();
        }
    }

    @Override // m20.InterfaceC22747g1
    /* renamed from: L2 */
    public void mo54731L2(String str) {
        Map m131401f;
        AbstractC19074t.m100208f(str, "id");
        C31155b0 c31155b0 = this.f53136A0;
        if (c31155b0 != null) {
            c31155b0.m151468X(str);
        }
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_search_follow_channel_result);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", 1));
        c19205a.m100713L(m92652XI, m131401f);
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: Mz */
    public void mo54732Mz(String str, Throwable th2) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(th2, "throwable");
        C25061v1 c25061v1 = this.f53143z0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        if (th2 instanceof NetworkException) {
            c25061v1.f120355r.m55784g(new C10374i(c25061v1, this));
        } else {
            c25061v1.f120355r.m55783f(new C10375j(c25061v1, this));
        }
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: QA */
    public void mo54733QA(String str, SearchAllResult searchAllResult) {
        List list;
        SpannableStringBuilder spannableStringBuilder;
        LoadMoreInfo loadMoreInfo;
        List m51168m;
        List m51168m2;
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(searchAllResult, "result");
        this.f53142G0 = str;
        Section m51139c = searchAllResult.m51139c();
        Section m51137a = searchAllResult.m51137a();
        ArrayList arrayList = new ArrayList();
        if (m51137a != null && (m51168m2 = m51137a.m51168m()) != null) {
            Iterator it = m51168m2.iterator();
            while (it.hasNext()) {
                arrayList.add(new SearchAllData((Channel) it.next()));
            }
        }
        if (m51139c != null && (m51168m = m51139c.m51168m()) != null) {
            Iterator it2 = m51168m.iterator();
            while (it2.hasNext()) {
                arrayList.add(new SearchAllData((Video) it2.next()));
            }
        }
        if (m51139c != null) {
            list = m51139c.m51168m();
        } else {
            list = null;
        }
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            spannableStringBuilder = null;
        } else {
            String str2 = "\"" + this.f53142G0 + "\"";
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) m92652XI(AbstractC27413h.zch_page_search_no_video_found));
            C25061v1 c25061v1 = this.f53143z0;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            FrameLayout root = c25061v1.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            append.setSpan(new ForegroundColorSpan(AbstractC26112n.m134426u(root, AbstractC27406a.zch_text_tertiary)), 0, append.length(), 17);
            spannableStringBuilder2.append((CharSequence) " ");
            SpannableStringBuilder append2 = spannableStringBuilder2.append((CharSequence) str2);
            append2.setSpan(new C10376k(), append2.length() - str2.length(), append2.length(), 17);
            spannableStringBuilder = spannableStringBuilder2;
        }
        long j11 = 0;
        Section m51139c2 = searchAllResult.m51139c();
        if (m51139c2 != null) {
            loadMoreInfo = m51139c2.m51169n();
        } else {
            loadMoreInfo = null;
        }
        m54737bL(new Section(arrayList, j11, loadMoreInfo, 2, (AbstractC19060k) null), spannableStringBuilder);
    }

    /* renamed from: ZK */
    public final C17487o0 m54734ZK() {
        if (m92650VI() instanceof SearchPageView) {
            C17487o0 m92693xK = super.m92693xK();
            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
            return m92693xK;
        }
        C17487o0 m92649TI = super.m92649TI();
        AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
        return m92649TI;
    }

    /* renamed from: aL */
    public final SearchPageView m54735aL() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof SearchPageView) {
            return (SearchPageView) m92650VI;
        }
        return null;
    }

    @Override // m20.InterfaceC22747g1
    /* renamed from: b */
    public void mo54736b(boolean z11) {
    }

    /* renamed from: bL */
    public final void m54737bL(Section section, SpannableStringBuilder spannableStringBuilder) {
        AbstractC19074t.m100208f(section, "section");
        C25061v1 c25061v1 = this.f53143z0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55781c();
        C25061v1 c25061v12 = this.f53143z0;
        if (c25061v12 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v12 = null;
        }
        c25061v12.f120355r.m55780b();
        C31155b0 c31155b0 = this.f53136A0;
        if (c31155b0 != null) {
            c31155b0.m151445N();
        }
        if (section.m51168m().isEmpty()) {
            m54729cL();
            return;
        }
        C31155b0 c31155b02 = this.f53136A0;
        if (c31155b02 != null) {
            c31155b02.m151475e0(section);
            c31155b02.m151462R(null, spannableStringBuilder);
            c31155b02.m10008p();
        }
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

    @Override // m20.InterfaceC22747g1
    /* renamed from: e */
    public void mo54738e(Section section) {
        AbstractC19074t.m100208f(section, "section");
        C31155b0 c31155b0 = this.f53136A0;
        if (c31155b0 != null) {
            int mo10003k = c31155b0.mo10003k();
            c31155b0.m151462R(section, null);
            c31155b0.m10015w(mo10003k, c31155b0.mo10003k() - mo10003k);
        }
        C31155b0 c31155b02 = this.f53136A0;
        if (c31155b02 != null) {
            c31155b02.m151445N();
        }
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: h9 */
    public void mo54739h9() {
        C25061v1 c25061v1 = this.f53143z0;
        C25061v1 c25061v12 = null;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55781c();
        C25061v1 c25061v13 = this.f53143z0;
        if (c25061v13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25061v12 = c25061v13;
        }
        c25061v12.f120355r.m55780b();
        C31155b0 c31155b0 = this.f53136A0;
        if (c31155b0 != null) {
            c31155b0.m151463S();
        }
    }

    @Override // m20.InterfaceC22747g1
    /* renamed from: l0 */
    public void mo54740l0(boolean z11, Throwable th2) {
        String m92652XI;
        Map m131401f;
        AbstractC19074t.m100208f(th2, "throwable");
        C25097t.f120556a.m130155r(getContext(), th2);
        C19205a c19205a = C19205a.f95429a;
        if (z11) {
            m92652XI = m92652XI(AbstractC27413h.zch_action_key_search_follow_channel_result);
        } else {
            m92652XI = m92652XI(AbstractC27413h.zch_action_key_search_unfollow_channel_result);
        }
        AbstractC19074t.m100205c(m92652XI);
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", 0));
        c19205a.m100713L(m92652XI, m131401f);
    }

    @Override // m20.InterfaceC22747g1
    /* renamed from: p */
    public void mo54741p(String str, Throwable th2) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(th2, "throwable");
        C31155b0 c31155b0 = this.f53136A0;
        if (c31155b0 != null) {
            c31155b0.m151445N();
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
        C25061v1 c25061v1 = this.f53143z0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55786j();
    }

    @Override // m20.InterfaceC22747g1
    /* renamed from: z1 */
    public void mo54743z1(String str) {
        Map m131401f;
        AbstractC19074t.m100208f(str, "id");
        C31155b0 c31155b0 = this.f53136A0;
        if (c31155b0 != null) {
            c31155b0.m151469Y(str);
        }
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_search_unfollow_channel_result);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", 1));
        c19205a.m100713L(m92652XI, m131401f);
    }
}
