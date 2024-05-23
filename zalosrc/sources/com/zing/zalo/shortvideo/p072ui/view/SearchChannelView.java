package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.AbstractC1388a;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.SearchAllResult;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.receiver.ChannelReceiver;
import com.zing.zalo.shortvideo.p072ui.view.ChannelPageView;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import e20.InterfaceC18188b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import h20.InterfaceC19729m;
import java.util.Map;
import m20.InterfaceC22751h1;
import p148f3.C18711c;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25061v1;
import q20.C25097t;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import z10.C31157c0;

/* loaded from: classes5.dex */
public final class SearchChannelView extends ZchBaseView implements InterfaceC22751h1, InterfaceC18188b {

    /* renamed from: A0 */
    private C25061v1 f53161A0;

    /* renamed from: B0 */
    private C31157c0 f53162B0;

    /* renamed from: C0 */
    private ChannelReceiver f53163C0;

    /* renamed from: z0 */
    private final InterfaceC19729m f53165z0 = AbstractC28684a.Companion.m143669F();

    /* renamed from: D0 */
    private String f53164D0 = "";

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchChannelView$a */
    /* loaded from: classes5.dex */
    static final class C10377a extends AbstractC19075u implements InterfaceC18509p {
        C10377a() {
            super(2);
        }

        /* renamed from: a */
        public final void m54771a(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "id");
            if (z11) {
                C31157c0 c31157c0 = SearchChannelView.this.f53162B0;
                if (c31157c0 != null) {
                    c31157c0.m151512V(str);
                    return;
                }
                return;
            }
            C31157c0 c31157c02 = SearchChannelView.this.f53162B0;
            if (c31157c02 != null) {
                c31157c02.m151513W(str);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54771a((String) obj, ((Boolean) obj2).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchChannelView$b */
    /* loaded from: classes5.dex */
    public static final class C10378b implements C31157c0.a {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchChannelView$b$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ SearchChannelView f53168q;

            /* renamed from: r */
            final /* synthetic */ Channel f53169r;

            /* renamed from: s */
            final /* synthetic */ C10378b f53170s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SearchChannelView searchChannelView, Channel channel, C10378b c10378b) {
                super(0);
                this.f53168q = searchChannelView;
                this.f53169r = channel;
                this.f53170s = c10378b;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54777a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54777a() {
                this.f53168q.f53165z0.mo53405B2(this.f53169r.m50769l());
                C10378b.m54773e(this.f53170s, this.f53169r, false, false, 4, null);
            }
        }

        C10378b() {
        }

        /* renamed from: d */
        private final void m54772d(Channel channel, boolean z11, boolean z12) {
            int i11;
            Map m131407l;
            SearchChannelView searchChannelView = SearchChannelView.this;
            if (z11) {
                i11 = AbstractC27413h.zch_action_key_search_follow_channel;
            } else if (z12) {
                i11 = AbstractC27413h.zch_action_key_search_unfollow_confirm;
            } else {
                i11 = AbstractC27413h.zch_action_key_search_unfollow_channel;
            }
            String m92652XI = searchChannelView.m92652XI(i11);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
            c19205a.m100713L(m92652XI, m131407l);
        }

        /* renamed from: e */
        static /* synthetic */ void m54773e(C10378b c10378b, Channel channel, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z12 = true;
            }
            c10378b.m54772d(channel, z11, z12);
        }

        @Override // z10.C31157c0.a
        /* renamed from: a */
        public void mo54774a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            SearchChannelView.this.f53165z0.mo53407t(SearchChannelView.this.f53164D0, loadMoreInfo);
        }

        @Override // z10.C31157c0.a
        /* renamed from: b */
        public void mo54775b(Channel channel) {
            AbstractC19074t.m100208f(channel, "channel");
            SearchChannelView.this.m55551QK(ChannelPageView.C10134b.m53981c(ChannelPageView.Companion, channel, null, 2, null));
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = SearchChannelView.this.m92652XI(AbstractC27413h.zch_action_key_search_channel_detail);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            c19205a.m100713L(m92652XI, null);
        }

        @Override // z10.C31157c0.a
        /* renamed from: c */
        public void mo54776c(Channel channel, boolean z11) {
            AbstractC19074t.m100208f(channel, "channel");
            if (z11) {
                SearchChannelView.this.f53165z0.mo53406a2(channel.m50769l());
                m54773e(this, channel, true, false, 4, null);
                return;
            }
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_title), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_message), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_positive), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_negative), null, false, false, 112, null);
            m51992b.m51991lL(new a(SearchChannelView.this, channel, this));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, SearchChannelView.this.m54763WK(), null, 2, null);
            m54772d(channel, false, false);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchChannelView$c */
    /* loaded from: classes5.dex */
    public static final class C10379c implements OverScrollableRecyclerView.InterfaceC10832c {
        C10379c() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31157c0 c31157c0;
            C31157c0 c31157c02 = SearchChannelView.this.f53162B0;
            if (c31157c02 != null && !c31157c02.m151444M() && (c31157c0 = SearchChannelView.this.f53162B0) != null) {
                c31157c0.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchChannelView$d */
    /* loaded from: classes5.dex */
    public static final class C10380d extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        private final Paint f53172a;

        /* renamed from: b */
        final /* synthetic */ int f53173b;

        C10380d(int i11, SearchChannelView searchChannelView) {
            this.f53173b = i11;
            Paint paint = new Paint();
            paint.setFlags(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(AbstractC1388a.m6961c(searchChannelView.m92689tK(), AbstractC27406a.zch_layer_background_subtle));
            this.f53172a = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int i11;
            Integer num;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i11 = adapter.mo10003k();
            } else {
                i11 = 0;
            }
            int i12 = i11 - 1;
            RecyclerView.AbstractC1876c0 m9897o0 = recyclerView.m9897o0(view);
            if (m9897o0 != null) {
                num = Integer.valueOf(m9897o0.m9929A());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                rect.top = this.f53173b;
            } else if (num != null && num.intValue() == i12) {
                rect.bottom = this.f53173b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: i */
        public void mo10068i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(canvas, C18711c.f94014e);
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10068i(canvas, recyclerView, c1899z);
            if (recyclerView.getChildCount() == 0) {
                return;
            }
            View childAt = recyclerView.getChildAt(0);
            canvas.drawRect(0.0f, childAt.getTop() - this.f53173b, recyclerView.getWidth(), childAt.getTop(), this.f53172a);
            View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            canvas.drawRect(0.0f, childAt2.getBottom(), recyclerView.getWidth(), childAt2.getBottom() + this.f53173b, this.f53172a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchChannelView$e */
    /* loaded from: classes5.dex */
    public static final class C10381e extends MetricAffectingSpan {
        C10381e() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            C25061v1 c25061v1 = SearchChannelView.this.f53161A0;
            C25061v1 c25061v12 = null;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            FrameLayout root = c25061v1.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            textPaint.setTypeface(AbstractC26112n.m134364E(root, 9));
            C25061v1 c25061v13 = SearchChannelView.this.f53161A0;
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

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchChannelView$f */
    /* loaded from: classes5.dex */
    static final class C10382f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10382f f53175q = new C10382f();

        C10382f() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(Channel channel) {
            AbstractC19074t.m100208f(channel, "i");
            return channel.m50769l();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchChannelView$g */
    /* loaded from: classes5.dex */
    static final class C10383g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f53176q;

        /* renamed from: r */
        final /* synthetic */ SearchChannelView f53177r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10383g(C25061v1 c25061v1, SearchChannelView searchChannelView) {
            super(0);
            this.f53176q = c25061v1;
            this.f53177r = searchChannelView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54779a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54779a() {
            this.f53176q.f120355r.m55786j();
            SearchPageView m54764XK = this.f53177r.m54764XK();
            if (m54764XK != null) {
                m54764XK.m54823iL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchChannelView$h */
    /* loaded from: classes5.dex */
    static final class C10384h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f53178q;

        /* renamed from: r */
        final /* synthetic */ SearchChannelView f53179r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10384h(C25061v1 c25061v1, SearchChannelView searchChannelView) {
            super(0);
            this.f53178q = c25061v1;
            this.f53179r = searchChannelView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54780a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54780a() {
            this.f53178q.f120355r.m55786j();
            SearchPageView m54764XK = this.f53179r.m54764XK();
            if (m54764XK != null) {
                m54764XK.m54823iL();
            }
        }
    }

    /* renamed from: YK */
    private final void m54761YK() {
        String str = "\"" + this.f53164D0 + "\"";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) m92652XI(AbstractC27413h.zch_page_search_no_channel_found));
        C25061v1 c25061v1 = this.f53161A0;
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
        append2.setSpan(new C10381e(), append2.length() - str.length(), append2.length(), 17);
        C25061v1 c25061v13 = this.f53161A0;
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
        getLifecycle().mo9335a(this.f53165z0);
        this.f53165z0.mo52965Lb(this);
        this.f53165z0.mo52970uo(m92642L3());
        ChannelReceiver channelReceiver = new ChannelReceiver(null, null, null, new C10377a(), null, 23, null);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        channelReceiver.mo53685d(m92689tK);
        this.f53163C0 = channelReceiver;
        C31157c0 c31157c0 = new C31157c0(null, 1, 0 == true ? 1 : 0);
        c31157c0.m151517a0(new C10378b());
        this.f53162B0 = c31157c0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25061v1 m129957c = C25061v1.m129957c(layoutInflater);
        AbstractC19074t.m100207e(m129957c, "inflate(...)");
        this.f53161A0 = m129957c;
        C25061v1 c25061v1 = null;
        if (m129957c == null) {
            AbstractC19074t.m100223u("binding");
            m129957c = null;
        }
        C25061v1 c25061v12 = this.f53161A0;
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
        Context context = overScrollableRecyclerView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        overScrollableRecyclerView.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(context, 0, false, false, 14, null));
        overScrollableRecyclerView.setAdapter(this.f53162B0);
        OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView, new C10379c(), 0.0f, 2, null);
        overScrollableRecyclerView.m9816A(new C10380d(overScrollableRecyclerView.getResources().getDimensionPixelSize(AbstractC27407b.zch_radius_16dp), this));
        C25061v1 c25061v13 = this.f53161A0;
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
        ChannelReceiver channelReceiver = this.f53163C0;
        if (channelReceiver != null) {
            channelReceiver.mo53687g();
        }
    }

    @Override // m20.InterfaceC22751h1
    /* renamed from: L2 */
    public void mo54762L2(String str) {
        Map m131401f;
        AbstractC19074t.m100208f(str, "id");
        C31157c0 c31157c0 = this.f53162B0;
        if (c31157c0 != null) {
            c31157c0.m151512V(str);
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
        C25061v1 c25061v1 = this.f53161A0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        if (th2 instanceof NetworkException) {
            c25061v1.f120355r.m55784g(new C10383g(c25061v1, this));
        } else {
            c25061v1.f120355r.m55783f(new C10384h(c25061v1, this));
        }
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: QA */
    public void mo54733QA(String str, SearchAllResult searchAllResult) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(searchAllResult, "result");
        this.f53164D0 = str;
        m54768o(searchAllResult.m51137a());
    }

    /* renamed from: WK */
    public final C17487o0 m54763WK() {
        if (m92650VI() instanceof SearchPageView) {
            C17487o0 m92693xK = super.m92693xK();
            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
            return m92693xK;
        }
        C17487o0 m92649TI = super.m92649TI();
        AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
        return m92649TI;
    }

    /* renamed from: XK */
    public final SearchPageView m54764XK() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof SearchPageView) {
            return (SearchPageView) m92650VI;
        }
        return null;
    }

    @Override // m20.InterfaceC22751h1
    /* renamed from: b */
    public void mo54765b(boolean z11) {
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

    @Override // m20.InterfaceC22751h1
    /* renamed from: e */
    public void mo54766e(Section section) {
        AbstractC19074t.m100208f(section, "section");
        C31157c0 c31157c0 = this.f53162B0;
        if (c31157c0 != null) {
            int mo10003k = c31157c0.mo10003k();
            c31157c0.m151510T().m51163e(section, C10382f.f53175q);
            int mo10003k2 = c31157c0.mo10003k() - mo10003k;
            c31157c0.m10009q(mo10003k - 1);
            c31157c0.m10015w(mo10003k, mo10003k2);
        }
        C31157c0 c31157c02 = this.f53162B0;
        if (c31157c02 != null) {
            c31157c02.m151445N();
        }
    }

    @Override // e20.InterfaceC18188b
    /* renamed from: h9 */
    public void mo54739h9() {
        C25061v1 c25061v1 = this.f53161A0;
        C25061v1 c25061v12 = null;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55781c();
        C25061v1 c25061v13 = this.f53161A0;
        if (c25061v13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25061v12 = c25061v13;
        }
        c25061v12.f120355r.m55780b();
        C31157c0 c31157c0 = this.f53162B0;
        if (c31157c0 != null) {
            c31157c0.m151508R();
        }
    }

    @Override // m20.InterfaceC22751h1
    /* renamed from: l0 */
    public void mo54767l0(boolean z11, Throwable th2) {
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

    /* renamed from: o */
    public final void m54768o(Section section) {
        if (section != null && !section.m51168m().isEmpty()) {
            C25061v1 c25061v1 = this.f53161A0;
            C25061v1 c25061v12 = null;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            c25061v1.f120355r.m55781c();
            C25061v1 c25061v13 = this.f53161A0;
            if (c25061v13 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25061v12 = c25061v13;
            }
            c25061v12.f120355r.m55780b();
            C31157c0 c31157c0 = this.f53162B0;
            if (c31157c0 != null) {
                c31157c0.m151445N();
            }
            C31157c0 c31157c02 = this.f53162B0;
            if (c31157c02 != null) {
                c31157c02.m151518b0(section);
                c31157c02.m10008p();
                return;
            }
            return;
        }
        m54761YK();
    }

    @Override // m20.InterfaceC22751h1
    /* renamed from: p */
    public void mo54769p(String str, Throwable th2) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(th2, "throwable");
        C31157c0 c31157c0 = this.f53162B0;
        if (c31157c0 != null) {
            c31157c0.m151445N();
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
        C25061v1 c25061v1 = this.f53161A0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55786j();
    }

    @Override // m20.InterfaceC22751h1
    /* renamed from: z1 */
    public void mo54770z1(String str) {
        Map m131401f;
        AbstractC19074t.m100208f(str, "id");
        C31157c0 c31157c0 = this.f53162B0;
        if (c31157c0 != null) {
            c31157c0.m151513W(str);
        }
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_search_unfollow_channel_result);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", 1));
        c19205a.m100713L(m92652XI, m131401f);
    }
}
