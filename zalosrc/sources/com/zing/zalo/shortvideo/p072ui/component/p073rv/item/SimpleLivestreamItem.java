package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import c20.C3220j;
import c20.C3226p;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.PersonalizeStream;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9766b;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.LivestreamVideoLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.view.ZVideoView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import on0.AbstractC24341v;
import p10.EnumC24601e;
import pm0.C24848g0;
import q10.C25039o0;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;

/* loaded from: classes5.dex */
public final class SimpleLivestreamItem extends FrameLayout {
    public static final C9662b Companion = new C9662b(null);

    /* renamed from: A */
    private final int f50944A;

    /* renamed from: B */
    private final int f50945B;

    /* renamed from: C */
    private final int f50946C;

    /* renamed from: D */
    private final int f50947D;

    /* renamed from: E */
    private final int f50948E;

    /* renamed from: F */
    private final int f50949F;

    /* renamed from: G */
    private final C3220j f50950G;

    /* renamed from: H */
    private boolean f50951H;

    /* renamed from: I */
    private LivestreamData f50952I;

    /* renamed from: J */
    public C25039o0 f50953J;

    /* renamed from: K */
    private boolean f50954K;

    /* renamed from: p */
    private InterfaceC9661a f50955p;

    /* renamed from: q */
    private final int f50956q;

    /* renamed from: r */
    private final int f50957r;

    /* renamed from: s */
    private final int f50958s;

    /* renamed from: t */
    private final int f50959t;

    /* renamed from: u */
    private final int f50960u;

    /* renamed from: v */
    private final int f50961v;

    /* renamed from: w */
    private final int f50962w;

    /* renamed from: x */
    private final int f50963x;

    /* renamed from: y */
    private final int f50964y;

    /* renamed from: z */
    private final int f50965z;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SimpleLivestreamItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9661a {
        /* renamed from: a */
        void mo52375a(SimpleLivestreamItem simpleLivestreamItem);

        /* renamed from: c */
        void mo52376c();

        /* renamed from: d */
        void mo52377d();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SimpleLivestreamItem$b */
    /* loaded from: classes5.dex */
    public static final class C9662b {
        private C9662b() {
        }

        public /* synthetic */ C9662b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SimpleLivestreamItem$c */
    /* loaded from: classes5.dex */
    static final class C9663c extends AbstractC19075u implements InterfaceC18505l {
        C9663c() {
            super(1);
        }

        /* renamed from: a */
        public final void m52378a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9661a callback = SimpleLivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52375a(SimpleLivestreamItem.this);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52378a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SimpleLivestreamItem$d */
    /* loaded from: classes5.dex */
    static final class C9664d extends AbstractC19075u implements InterfaceC18505l {
        C9664d() {
            super(1);
        }

        /* renamed from: a */
        public final void m52379a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9661a callback = SimpleLivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52377d();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52379a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SimpleLivestreamItem$e */
    /* loaded from: classes5.dex */
    static final class C9665e extends AbstractC19075u implements InterfaceC18505l {
        C9665e() {
            super(1);
        }

        /* renamed from: a */
        public final void m52380a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9661a callback = SimpleLivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52377d();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52380a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SimpleLivestreamItem$f */
    /* loaded from: classes5.dex */
    static final class C9666f extends AbstractC19075u implements InterfaceC18505l {
        C9666f() {
            super(1);
        }

        /* renamed from: a */
        public final void m52381a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9661a callback = SimpleLivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52376c();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52381a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleLivestreamItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50956q = AbstractC26112n.m134365F(this);
        this.f50957r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_height);
        this.f50958s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_header_height);
        this.f50959t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_padding);
        this.f50960u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_12);
        this.f50961v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_description_margin_right);
        this.f50962w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_avatar_size);
        this.f50963x = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_avatar_to_name);
        this.f50964y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_avatar_to_description);
        this.f50965z = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_name_to_follow);
        this.f50944A = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_dim_info_extra);
        this.f50945B = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_simple_livestream_header_extra_info_height);
        this.f50946C = AbstractC26112n.m134433y(this, AbstractC27407b.zch_simple_item_livestream_divider_height);
        this.f50947D = AbstractC26112n.m134433y(this, AbstractC27407b.zch_simple_item_livestream_avatar_to_join_live);
        this.f50948E = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_loading_bar_size);
        this.f50949F = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_8);
        this.f50950G = new C3220j();
    }

    /* renamed from: e */
    private final void m52354e(LivestreamData livestreamData, PersonalizeStream personalizeStream) {
        boolean m50741Q = livestreamData.m51010b().m50741Q();
        int m51029q = livestreamData.m51029q();
        livestreamData.m50989D(personalizeStream);
        if (livestreamData.m51010b().m50741Q() != m50741Q) {
            m52362d(livestreamData);
        }
        if (m51029q != livestreamData.m51029q()) {
            m52374w(livestreamData.m51029q());
        }
    }

    /* renamed from: g */
    private final void m52355g(LivestreamData livestreamData) {
        m52362d(livestreamData);
    }

    private final ZVideoView getZvvVideo() {
        return getBinding().f120153w.getVideoView();
    }

    /* renamed from: k */
    private final Rect m52356k(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        C25039o0 binding = getBinding();
        EllipsizedTextView ellipsizedTextView = binding.f120156z;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtDescription");
        if (AbstractC26112n.m134378S(ellipsizedTextView)) {
            EllipsizedTextView ellipsizedTextView2 = binding.f120156z;
            AbstractC19074t.m100207e(ellipsizedTextView2, "txtDescription");
            AbstractC26112n.m134381V(ellipsizedTextView2, i14, i11);
            i15 = i14 - (binding.f120156z.getMeasuredHeight() + this.f50964y);
        } else {
            i15 = i14;
        }
        AvatarImageView avatarImageView = binding.f120147q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        AbstractC26112n.m134381V(avatarImageView, i15, i11);
        int i16 = this.f50962w + this.f50963x + i11;
        FitUsernameTextView fitUsernameTextView = binding.f120144C;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134381V(fitUsernameTextView, i15, i16);
        SimpleShadowTextView simpleShadowTextView = binding.f120149s;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            int measuredWidth = i16 + binding.f120144C.getMeasuredWidth() + this.f50965z;
            int measuredHeight = i15 - ((binding.f120144C.getMeasuredHeight() - binding.f120149s.getMeasuredHeight()) / 2);
            SimpleShadowTextView simpleShadowTextView2 = binding.f120149s;
            AbstractC19074t.m100207e(simpleShadowTextView2, "btnFollow");
            AbstractC26112n.m134381V(simpleShadowTextView2, measuredHeight, measuredWidth);
        }
        int top = binding.f120147q.getTop() - this.f50947D;
        SimpleShadowTextView simpleShadowTextView3 = binding.f120155y;
        AbstractC19074t.m100207e(simpleShadowTextView3, "tvLive");
        if (AbstractC26112n.m134378S(simpleShadowTextView3)) {
            int top2 = binding.f120147q.getTop() - this.f50949F;
            SimpleShadowTextView simpleShadowTextView4 = binding.f120155y;
            AbstractC19074t.m100207e(simpleShadowTextView4, "tvLive");
            AbstractC26112n.m134381V(simpleShadowTextView4, top2, i11);
            top = binding.f120155y.getTop() - this.f50947D;
        }
        int measuredHeight2 = (top - (binding.f120143B.getMeasuredHeight() / 2)) + (this.f50946C / 2);
        View view = binding.f120150t;
        AbstractC19074t.m100207e(view, "dividerLeft");
        AbstractC26112n.m134381V(view, measuredHeight2, i11);
        int measuredWidth2 = binding.f120150t.getMeasuredWidth() + (this.f50960u * 2) + binding.f120143B.getMeasuredWidth() + i11;
        View view2 = binding.f120151u;
        AbstractC19074t.m100207e(view2, "dividerRight");
        AbstractC26112n.m134381V(view2, measuredHeight2, measuredWidth2);
        int right = binding.f120150t.getRight() + this.f50960u;
        SimpleShadowTextView simpleShadowTextView5 = binding.f120143B;
        AbstractC19074t.m100207e(simpleShadowTextView5, "txtJoinLive");
        AbstractC26112n.m134381V(simpleShadowTextView5, top, right);
        return new Rect(i11, getBinding().f120147q.getTop(), i13, i14);
    }

    /* renamed from: l */
    private final Rect m52357l(boolean z11, int i11, int i12, int i13, int i14) {
        C25039o0 binding = getBinding();
        LivestreamVideoLayout livestreamVideoLayout = binding.f120153w;
        AbstractC19074t.m100207e(livestreamVideoLayout, "lytVideo");
        AbstractC26112n.m134383X(livestreamVideoLayout, i12, i11);
        this.f50950G.m16329b(z11, i11, i12, i13, i14);
        View view = binding.f120145D;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134383X(view, i12, i11);
        return new Rect(i11, i12, i13, i14);
    }

    /* renamed from: m */
    private final Size m52358m(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        C25039o0 binding = getBinding();
        EllipsizedTextView ellipsizedTextView = binding.f120156z;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtDescription");
        if (AbstractC26112n.m134378S(ellipsizedTextView)) {
            EllipsizedTextView ellipsizedTextView2 = binding.f120156z;
            AbstractC19074t.m100207e(ellipsizedTextView2, "txtDescription");
            AbstractC26112n.m134387a0(ellipsizedTextView2, size, 1073741824, View.MeasureSpec.getSize(i12) / 2, Integer.MIN_VALUE);
            i13 = binding.f120156z.getMeasuredHeight() + this.f50964y;
        } else {
            i13 = 0;
        }
        AvatarImageView avatarImageView = binding.f120147q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        int i14 = this.f50962w;
        AbstractC26112n.m134387a0(avatarImageView, i14, 1073741824, i14, 1073741824);
        int i15 = this.f50962w;
        int i16 = i13 + i15;
        int i17 = (size - i15) - this.f50963x;
        SimpleShadowTextView simpleShadowTextView = binding.f120149s;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = binding.f120149s;
            AbstractC19074t.m100207e(simpleShadowTextView2, "btnFollow");
            AbstractC26112n.m134387a0(simpleShadowTextView2, 0, 0, 0, 0);
            i17 -= binding.f120149s.getMeasuredWidth() + this.f50965z;
        }
        FitUsernameTextView fitUsernameTextView = binding.f120144C;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134387a0(fitUsernameTextView, i17, 1073741824, this.f50962w, 1073741824);
        return new Size(size, i16);
    }

    /* renamed from: a */
    public final void m52359a() {
        this.f50951H = true;
        if (!this.f50954K) {
            getBinding().f120153w.m52525B();
        }
    }

    /* renamed from: b */
    public final void m52360b(LivestreamData livestreamData) {
        boolean m127128x;
        AbstractC19074t.m100208f(livestreamData, "video");
        this.f50952I = livestreamData;
        this.f50950G.m16337j(livestreamData.m51022j());
        m52362d(livestreamData);
        if (livestreamData.m51029q() != EnumC24601e.f118373r.m128090c()) {
            m52374w(livestreamData.m51029q());
        }
        C25039o0 binding = getBinding();
        binding.f120153w.setBlurBackground(livestreamData);
        binding.f120147q.setAvatar(livestreamData.m51010b());
        binding.f120147q.setChannelLiveStatus(false);
        binding.f120144C.setText(livestreamData.m51010b().m50775o());
        binding.f120144C.setVerifiedIcon(livestreamData.m51010b().m50725F());
        String m51032w = livestreamData.m51032w();
        if (m51032w != null) {
            m127128x = AbstractC24341v.m127128x(m51032w);
            if (!m127128x) {
                binding.f120156z.setText(livestreamData.m51032w());
                EllipsizedTextView ellipsizedTextView = binding.f120156z;
                AbstractC19074t.m100207e(ellipsizedTextView, "txtDescription");
                AbstractC26112n.m134431w0(ellipsizedTextView);
                return;
            }
        }
        EllipsizedTextView ellipsizedTextView2 = binding.f120156z;
        AbstractC19074t.m100207e(ellipsizedTextView2, "txtDescription");
        AbstractC26112n.m134367H(ellipsizedTextView2);
    }

    /* renamed from: c */
    public final void m52361c(LivestreamData livestreamData, List list) {
        AbstractC19074t.m100208f(livestreamData, "stream");
        AbstractC19074t.m100208f(list, "payloads");
        Object obj = list.get(0);
        if (AbstractC19074t.m100204b(obj, "FOLLOW")) {
            m52362d(livestreamData);
            return;
        }
        if (AbstractC19074t.m100204b(obj, "PERSONALIZE")) {
            Object obj2 = list.get(1);
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type com.zing.zalo.shortvideo.data.model.PersonalizeStream");
            m52354e(livestreamData, (PersonalizeStream) obj2);
        } else {
            if (AbstractC19074t.m100204b(obj, "SYNC")) {
                m52355g(livestreamData);
                return;
            }
            if (AbstractC19074t.m100204b(obj, "STATUS")) {
                Object obj3 = list.get(1);
                AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj3).intValue();
                Object obj4 = list.get(2);
                AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type kotlin.String");
                m52363f(livestreamData, intValue, (String) obj4);
            }
        }
    }

    /* renamed from: d */
    public final void m52362d(LivestreamData livestreamData) {
        String str;
        AbstractC19074t.m100208f(livestreamData, "stream");
        Boolean mo146377p = AbstractC28684a.Companion.m143692z().mo146377p(livestreamData.m51010b().m50769l());
        if (mo146377p != null) {
            livestreamData.m51010b().m50770l0(mo146377p.booleanValue());
        }
        C25039o0 binding = getBinding();
        String m50769l = livestreamData.m51010b().m50769l();
        Channel m140377a = C27417l.f129055a.m140377a();
        if (m140377a != null) {
            str = m140377a.m50769l();
        } else {
            str = null;
        }
        if (AbstractC19074t.m100204b(m50769l, str)) {
            SimpleShadowTextView simpleShadowTextView = binding.f120149s;
            AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
            AbstractC26112n.m134367H(simpleShadowTextView);
        } else if (livestreamData.m51010b().m50741Q()) {
            SimpleShadowTextView simpleShadowTextView2 = binding.f120149s;
            AbstractC19074t.m100207e(simpleShadowTextView2, "btnFollow");
            AbstractC26112n.m134367H(simpleShadowTextView2);
        } else {
            binding.f120149s.setBackgroundResource(AbstractC27408c.zch_bg_button_video_follow);
            SimpleShadowTextView simpleShadowTextView3 = binding.f120149s;
            AbstractC19074t.m100207e(simpleShadowTextView3, "btnFollow");
            AbstractC26112n.m134431w0(simpleShadowTextView3);
        }
    }

    /* renamed from: f */
    public final void m52363f(LivestreamData livestreamData, int i11, String str) {
        LivestreamData livestreamData2;
        AbstractC19074t.m100208f(livestreamData, "stream");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        livestreamData.m51011b0(i11);
        m52374w(i11);
        if (i11 == EnumC24601e.f118373r.m128090c() && m52365i() && (livestreamData2 = this.f50952I) != null) {
            LivestreamVideoLayout livestreamVideoLayout = getBinding().f120153w;
            if (str.length() > 0 && !AbstractC19074t.m100204b(str, livestreamData2.m51030t())) {
                livestreamData2.m51015e0(str);
            }
            livestreamVideoLayout.m52542l0();
            livestreamVideoLayout.m52540j0(C9766b.Companion.m52674a(livestreamData2), livestreamData2);
        }
    }

    protected final int getAvatarSize() {
        return this.f50962w;
    }

    protected final int getAvatarToDescription() {
        return this.f50964y;
    }

    protected final int getAvatarToName() {
        return this.f50963x;
    }

    public final C25039o0 getBinding() {
        C25039o0 c25039o0 = this.f50953J;
        if (c25039o0 != null) {
            return c25039o0;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    public final InterfaceC9661a getCallback() {
        return this.f50955p;
    }

    public final LivestreamData getCurrentStreamData() {
        return getBinding().f120153w.getCurrentStreamData();
    }

    protected final int getDescriptionMargin() {
        return this.f50961v;
    }

    protected final int getDimInfoExtra() {
        return this.f50944A;
    }

    protected final int getItemPadding() {
        return this.f50959t;
    }

    protected final int getNameToFollow() {
        return this.f50965z;
    }

    public final RecyclingImageView getThumbnailView() {
        RecyclingImageView recyclingImageView = getBinding().f120154x;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        return recyclingImageView;
    }

    public final ZVideoView getTransitionView() {
        ZVideoView zVideoView;
        ViewParent viewParent;
        ViewGroup viewGroup;
        LivestreamData livestreamData = this.f50952I;
        if (livestreamData == null || livestreamData.m51029q() != EnumC24601e.f118373r.m128090c()) {
            return null;
        }
        LivestreamVideoLayout livestreamVideoLayout = getBinding().f120153w;
        AbstractC19074t.m100207e(livestreamVideoLayout, "lytVideo");
        boolean m52479I = LivestreamVideoLayout.m52479I(livestreamVideoLayout, false, 1, null);
        View childAt = getBinding().f120153w.getChildAt(1);
        if (childAt instanceof ZVideoView) {
            zVideoView = (ZVideoView) childAt;
        } else {
            zVideoView = null;
        }
        if (zVideoView != null) {
            viewParent = zVideoView.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewParent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(zVideoView);
        }
        getBinding().f120153w.setNewVideoView(null);
        this.f50954K = true;
        if (!m52479I) {
            if (zVideoView != null) {
                zVideoView.m92429s0();
            }
            if (zVideoView != null) {
                zVideoView.m92412f0(true);
            }
        }
        if (!m52479I) {
            return null;
        }
        return zVideoView;
    }

    /* renamed from: h */
    public final void m52364h() {
        m52367n();
        this.f50951H = false;
        getBinding().f120153w.m52527E();
    }

    /* renamed from: i */
    public final boolean m52365i() {
        if (getBinding().f120153w.getVideoView() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m52366j() {
        return getBinding().f120153w.m52528F();
    }

    /* renamed from: n */
    public final void m52367n() {
        if (!this.f50954K) {
            getBinding().f120153w.m52532P();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        int i11;
        super.onFinishInflate();
        C25039o0 m129906a = C25039o0.m129906a(this);
        AbstractC19074t.m100207e(m129906a, "bind(...)");
        C3220j c3220j = this.f50950G;
        if (C3226p.Companion.m16363f()) {
            i11 = this.f50956q;
        } else {
            i11 = 0;
        }
        c3220j.m16338k(i11);
        this.f50950G.m16335h(this.f50958s);
        this.f50950G.m16333f(this.f50957r);
        this.f50950G.m16334g(this.f50945B + this.f50959t);
        C3220j c3220j2 = this.f50950G;
        RecyclingImageView recyclingImageView = m129906a.f120154x;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        c3220j2.m16339l(recyclingImageView);
        View view = m129906a.f120145D;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 637534208, 1291845632, 1711276032});
        view.setBackground(gradientDrawable);
        SimpleShadowTextView simpleShadowTextView = m129906a.f120143B;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtJoinLive");
        AbstractC26112n.m134391c0(simpleShadowTextView, AbstractC26112n.m134426u(this, AbstractC27406a.zch_ripple), AbstractC26105g.m134347n(40));
        SimpleShadowTextView simpleShadowTextView2 = m129906a.f120155y;
        AbstractC19074t.m100207e(simpleShadowTextView2, "tvLive");
        AbstractC26112n.m134391c0(simpleShadowTextView2, AbstractC26112n.m134426u(this, AbstractC27406a.zch_red_r50), AbstractC26105g.m134347n(4));
        m129906a.f120153w.setSimpleSharedLayoutor(this.f50950G);
        SimpleLivestreamItem root = m129906a.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        AbstractC26112n.m134407k0(root, new C9663c());
        AvatarImageView avatarImageView = m129906a.f120147q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        AbstractC26112n.m134407k0(avatarImageView, new C9664d());
        FitUsernameTextView fitUsernameTextView = m129906a.f120144C;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134407k0(fitUsernameTextView, new C9665e());
        SimpleShadowTextView simpleShadowTextView3 = m129906a.f120149s;
        AbstractC19074t.m100207e(simpleShadowTextView3, "btnFollow");
        AbstractC26112n.m134407k0(simpleShadowTextView3, new C9666f());
        setBinding(m129906a);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        AvatarImageView avatarImageView = getBinding().f120147q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        boolean contains = AbstractC26112n.m134360A(avatarImageView).contains((int) motionEvent.getX(), (int) motionEvent.getY());
        FitUsernameTextView fitUsernameTextView = getBinding().f120144C;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        boolean contains2 = AbstractC26112n.m134360A(fitUsernameTextView).contains((int) motionEvent.getX(), (int) motionEvent.getY());
        SimpleShadowTextView simpleShadowTextView = getBinding().f120149s;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
        boolean contains3 = AbstractC26112n.m134360A(simpleShadowTextView).contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getActionMasked() == 1 && motionEvent.getY() > this.f50958s && !contains && !contains2 && !contains3) {
            InterfaceC9661a interfaceC9661a = this.f50955p;
            if (interfaceC9661a != null) {
                interfaceC9661a.mo52375a(this);
            }
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredHeight = getMeasuredHeight();
        C25039o0 binding = getBinding();
        m52357l(z11, 0, 0, getMeasuredWidth(), measuredHeight);
        if (C3226p.Companion.m16362e()) {
            measuredHeight -= this.f50957r;
        }
        int i15 = this.f50959t;
        m52356k(z11, i15, 0, getMeasuredWidth() - this.f50961v, measuredHeight - i15);
        ProgressBar progressBar = binding.f120148r;
        AbstractC19074t.m100207e(progressBar, "barLoading");
        if (AbstractC26112n.m134378S(progressBar)) {
            RecyclingImageView recyclingImageView = binding.f120154x;
            AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
            int m134422s = AbstractC26112n.m134422s(recyclingImageView) - (this.f50948E / 2);
            RecyclingImageView recyclingImageView2 = binding.f120154x;
            AbstractC19074t.m100207e(recyclingImageView2, "rivThumbnail");
            int m134424t = AbstractC26112n.m134424t(recyclingImageView2) - (this.f50948E / 2);
            ProgressBar progressBar2 = binding.f120148r;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            AbstractC26112n.m134383X(progressBar2, m134424t, m134422s);
        }
        LinearLayout linearLayout = binding.f120152v;
        AbstractC19074t.m100207e(linearLayout, "lytInform");
        if (AbstractC26112n.m134378S(linearLayout)) {
            Rect m16328a = this.f50950G.m16328a();
            int i16 = i11 + this.f50959t;
            int centerY = m16328a.centerY() - (binding.f120152v.getMeasuredHeight() / 2);
            LinearLayout linearLayout2 = binding.f120152v;
            AbstractC19074t.m100207e(linearLayout2, "lytInform");
            AbstractC26112n.m134383X(linearLayout2, centerY, i16);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25039o0 binding = getBinding();
        this.f50950G.m16331d(i11, i12);
        LivestreamVideoLayout livestreamVideoLayout = binding.f120153w;
        AbstractC19074t.m100207e(livestreamVideoLayout, "lytVideo");
        AbstractC26112n.m134387a0(livestreamVideoLayout, size, 1073741824, size2, 1073741824);
        View view = binding.f120145D;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134387a0(view, size, 1073741824, size2, 1073741824);
        SimpleShadowTextView simpleShadowTextView = binding.f120143B;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtJoinLive");
        AbstractC26112n.m134387a0(simpleShadowTextView, 0, 0, 0, 0);
        SimpleShadowTextView simpleShadowTextView2 = binding.f120155y;
        AbstractC19074t.m100207e(simpleShadowTextView2, "tvLive");
        if (AbstractC26112n.m134378S(simpleShadowTextView2)) {
            SimpleShadowTextView simpleShadowTextView3 = binding.f120155y;
            AbstractC19074t.m100207e(simpleShadowTextView3, "tvLive");
            AbstractC26112n.m134387a0(simpleShadowTextView3, 0, 0, 0, 0);
        }
        LinearLayout linearLayout = binding.f120152v;
        AbstractC19074t.m100207e(linearLayout, "lytInform");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = binding.f120152v;
            AbstractC19074t.m100207e(linearLayout2, "lytInform");
            AbstractC26112n.m134387a0(linearLayout2, size - (this.f50959t * 2), 1073741824, 0, 0);
        }
        int measuredWidth = (((size - binding.f120143B.getMeasuredWidth()) - (this.f50959t * 2)) - (this.f50960u * 2)) / 2;
        View view2 = binding.f120150t;
        AbstractC19074t.m100207e(view2, "dividerLeft");
        AbstractC26112n.m134387a0(view2, measuredWidth, 1073741824, this.f50946C, 1073741824);
        View view3 = binding.f120151u;
        AbstractC19074t.m100207e(view3, "dividerRight");
        AbstractC26112n.m134387a0(view3, measuredWidth, 1073741824, this.f50946C, 1073741824);
        m52358m(View.MeasureSpec.makeMeasureSpec((size - this.f50959t) - this.f50961v, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        ProgressBar progressBar = binding.f120148r;
        AbstractC19074t.m100207e(progressBar, "barLoading");
        if (AbstractC26112n.m134378S(progressBar)) {
            ProgressBar progressBar2 = binding.f120148r;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            int i13 = this.f50948E;
            AbstractC26112n.m134387a0(progressBar2, i13, 1073741824, i13, 1073741824);
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: p */
    public final void m52368p() {
        if (!this.f50954K) {
            getBinding().f120153w.m52533Q();
        }
    }

    /* renamed from: q */
    public final void m52369q() {
        if (!this.f50954K) {
            m52371s();
            ZVideoView zvvVideo = getZvvVideo();
            if (zvvVideo != null) {
                zvvVideo.setOnPlayerStateChangedListener(null);
                zvvVideo.setOnVideoSizeChangedListener(null);
                zvvVideo.setOnInfoListener(null);
                zvvVideo.m92412f0(true);
            }
        }
    }

    /* renamed from: r */
    public final void m52370r() {
        ZVideoView zVideoView = new ZVideoView(getContext(), null);
        zVideoView.setId(AbstractC27409d.zvvVideo);
        zVideoView.setKeepScreenOn(true);
        getBinding().f120153w.setNewVideoView(zVideoView);
        getBinding().f120153w.addView(zVideoView, 1);
        getBinding().f120153w.m52535V(zVideoView);
        this.f50954K = false;
    }

    /* renamed from: s */
    public final void m52371s() {
        if (!this.f50954K) {
            getBinding().f120153w.m52543m0();
        }
    }

    public final void setBinding(C25039o0 c25039o0) {
        AbstractC19074t.m100208f(c25039o0, "<set-?>");
        this.f50953J = c25039o0;
    }

    public final void setCallback(InterfaceC9661a interfaceC9661a) {
        this.f50955p = interfaceC9661a;
    }

    public final void setDeferring(boolean z11) {
        getBinding().f120153w.setDeferring(z11);
    }

    public final void setLoadingVisible(boolean z11) {
        C25039o0 binding = getBinding();
        if (z11) {
            ProgressBar progressBar = binding.f120148r;
            AbstractC19074t.m100207e(progressBar, "barLoading");
            AbstractC26112n.m134431w0(progressBar);
        } else {
            ProgressBar progressBar2 = binding.f120148r;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            AbstractC26112n.m134367H(progressBar2);
        }
    }

    public final void setThumbnailVisible(boolean z11) {
        if (z11) {
            RecyclingImageView recyclingImageView = getBinding().f120154x;
            AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
            AbstractC26112n.m134431w0(recyclingImageView);
        } else {
            RecyclingImageView recyclingImageView2 = getBinding().f120154x;
            AbstractC19074t.m100207e(recyclingImageView2, "rivThumbnail");
            AbstractC26112n.m134367H(recyclingImageView2);
        }
    }

    /* renamed from: u */
    public final void m52372u() {
        getBinding().f120153w.m52543m0();
    }

    /* renamed from: v */
    public final void m52373v() {
        getBinding().f120153w.m52531J(true);
    }

    /* renamed from: w */
    public final void m52374w(int i11) {
        C25039o0 binding = getBinding();
        LivestreamVideoLayout livestreamVideoLayout = binding.f120153w;
        AbstractC19074t.m100207e(livestreamVideoLayout, "lytVideo");
        String str = null;
        LivestreamVideoLayout.m52521w0(livestreamVideoLayout, i11, false, 2, null);
        EnumC24601e enumC24601e = EnumC24601e.f118373r;
        if (i11 == enumC24601e.m128090c()) {
            SimpleShadowTextView simpleShadowTextView = binding.f120143B;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtJoinLive");
            AbstractC26112n.m134431w0(simpleShadowTextView);
            View view = binding.f120151u;
            AbstractC19074t.m100207e(view, "dividerRight");
            AbstractC26112n.m134431w0(view);
            View view2 = binding.f120150t;
            AbstractC19074t.m100207e(view2, "dividerLeft");
            AbstractC26112n.m134431w0(view2);
            SimpleShadowTextView simpleShadowTextView2 = binding.f120155y;
            AbstractC19074t.m100207e(simpleShadowTextView2, "tvLive");
            AbstractC26112n.m134431w0(simpleShadowTextView2);
            LinearLayout linearLayout = binding.f120152v;
            AbstractC19074t.m100207e(linearLayout, "lytInform");
            AbstractC26112n.m134367H(linearLayout);
        } else {
            SimpleShadowTextView simpleShadowTextView3 = binding.f120143B;
            AbstractC19074t.m100207e(simpleShadowTextView3, "txtJoinLive");
            AbstractC26112n.m134367H(simpleShadowTextView3);
            View view3 = binding.f120151u;
            AbstractC19074t.m100207e(view3, "dividerRight");
            AbstractC26112n.m134367H(view3);
            View view4 = binding.f120150t;
            AbstractC19074t.m100207e(view4, "dividerLeft");
            AbstractC26112n.m134367H(view4);
            SimpleShadowTextView simpleShadowTextView4 = binding.f120155y;
            AbstractC19074t.m100207e(simpleShadowTextView4, "tvLive");
            AbstractC26112n.m134367H(simpleShadowTextView4);
            LinearLayout linearLayout2 = binding.f120152v;
            AbstractC19074t.m100207e(linearLayout2, "lytInform");
            AbstractC26112n.m134431w0(linearLayout2);
        }
        if (i11 == EnumC24601e.f118375t.m128090c()) {
            SimpleShadowTextView simpleShadowTextView5 = getBinding().f120142A;
            int i12 = AbstractC27413h.zch_livestream_schedule_start_at;
            Object[] objArr = new Object[1];
            LivestreamData livestreamData = this.f50952I;
            if (livestreamData != null) {
                long m51024l = livestreamData.m51024l();
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                str = AbstractC26105g.m134340g(m51024l, context);
            }
            objArr[0] = str;
            simpleShadowTextView5.setText(AbstractC26112n.m134366G(this, i12, objArr));
            return;
        }
        if (i11 != enumC24601e.m128090c()) {
            if (i11 == EnumC24601e.f118376u.m128090c()) {
                getBinding().f120142A.setText(AbstractC26112n.m134366G(this, AbstractC27413h.zch_livestream_paused, new Object[0]));
            } else if (i11 == EnumC24601e.f118377v.m128090c()) {
                getBinding().f120142A.setText(AbstractC26112n.m134366G(this, AbstractC27413h.zch_item_livestream_no_signal, new Object[0]));
            } else if (i11 == EnumC24601e.f118374s.m128090c()) {
                getBinding().f120142A.setText(AbstractC26112n.m134366G(this, AbstractC27413h.zch_livestream_session_ended, new Object[0]));
            }
        }
    }
}
