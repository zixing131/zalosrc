package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingBar;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import p354n3.C23528a;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q10.C25044q;
import q20.C25092o;
import qm0.AbstractC25332a0;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27413h;

/* loaded from: classes5.dex */
public final class ChannelFollowSuggestionItem extends FrameLayout {

    /* renamed from: p */
    private InterfaceC9563a f50552p;

    /* renamed from: q */
    private final int f50553q;

    /* renamed from: r */
    private final int f50554r;

    /* renamed from: s */
    private final int f50555s;

    /* renamed from: t */
    private final int f50556t;

    /* renamed from: u */
    private final int f50557u;

    /* renamed from: v */
    private final int f50558v;

    /* renamed from: w */
    private Channel f50559w;

    /* renamed from: x */
    private C25044q f50560x;

    /* renamed from: y */
    private final InterfaceC24854k f50561y;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.ChannelFollowSuggestionItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9563a {
        /* renamed from: c */
        void mo52053c();

        /* renamed from: d */
        void mo52054d();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.ChannelFollowSuggestionItem$b */
    /* loaded from: classes5.dex */
    static final class C9564b extends AbstractC19075u implements InterfaceC18494a {
        C9564b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint(1);
            ChannelFollowSuggestionItem channelFollowSuggestionItem = ChannelFollowSuggestionItem.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(AbstractC26112n.m134426u(channelFollowSuggestionItem, AbstractC27406a.zch_suggest_follow_border));
            paint.setStrokeWidth(channelFollowSuggestionItem.getResources().getDimension(AbstractC27407b.zch_suggest_follow_border));
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.ChannelFollowSuggestionItem$c */
    /* loaded from: classes5.dex */
    static final class C9565c extends AbstractC19075u implements InterfaceC18505l {
        C9565c() {
            super(1);
        }

        /* renamed from: a */
        public final void m52056a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9563a callback = ChannelFollowSuggestionItem.this.getCallback();
            if (callback != null) {
                callback.mo52053c();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52056a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.ChannelFollowSuggestionItem$d */
    /* loaded from: classes5.dex */
    public static final class C9566d extends ViewOutlineProvider {
        C9566d() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ChannelFollowSuggestionItem.this.f50553q);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFollowSuggestionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f50553q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_8dp);
        this.f50554r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_follow_suggestion_channel_loading_thick);
        this.f50555s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_follow_suggestion_channel_avatar_to_name);
        this.f50556t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_follow_suggestion_channel_name_to_follow);
        this.f50557u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_follow_suggestion_channel_follow_height);
        this.f50558v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_follow_suggestion_channel_follow_margin);
        m129210a = AbstractC24856m.m129210a(new C9564b());
        this.f50561y = m129210a;
    }

    private final Paint getBorderPaint() {
        return (Paint) this.f50561y.getValue();
    }

    /* renamed from: b */
    public final void m52050b(Channel channel) {
        List m51168m;
        Object m131205e0;
        AbstractC19074t.m100208f(channel, "channel");
        C25044q c25044q = this.f50560x;
        String str = null;
        if (c25044q == null) {
            AbstractC19074t.m100223u("binding");
            c25044q = null;
        }
        m52052d();
        this.f50559w = channel;
        C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(c25044q.f120187t);
        c23528a.m123599d();
        Section m50732J = channel.m50732J();
        if (m50732J != null && (m51168m = m50732J.m51168m()) != null) {
            m131205e0 = AbstractC25332a0.m131205e0(m51168m);
            Video video = (Video) m131205e0;
            if (video != null) {
                str = video.m52898l();
            }
        }
        C24003n c24003n = new C24003n(C25092o.f120501a.m130066e(), AbstractC26112n.m134434z(this, AbstractC27408c.zch_placeholder_thumbnail_video_channel_without_logo), 0, false, 0, false, null, 124, null);
        C23999j c23999j = new C23999j();
        c23999j.m125609e1(true);
        C24848g0 c24848g0 = C24848g0.f119245a;
        c25044q.f120184q.setAvatar(channel);
        c25044q.f120188u.setText(channel.m50775o());
        c25044q.f120188u.setVerifiedIcon(channel.m50725F());
        m52051c(channel);
    }

    /* renamed from: c */
    public final void m52051c(Channel channel) {
        AbstractC19074t.m100208f(channel, "channel");
        C25044q c25044q = this.f50560x;
        if (c25044q == null) {
            AbstractC19074t.m100223u("binding");
            c25044q = null;
        }
        if (channel.m50741Q()) {
            c25044q.f120186s.setText(AbstractC27413h.zch_page_channel_following);
            SimpleShadowTextView simpleShadowTextView = c25044q.f120186s;
            AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_secondary);
            c25044q.f120186s.setBackgroundResource(AbstractC27408c.zch_bg_button_video_qna);
            return;
        }
        c25044q.f120186s.setText(AbstractC27413h.zch_item_video_follow);
        SimpleShadowTextView simpleShadowTextView2 = c25044q.f120186s;
        AbstractC19074t.m100207e(simpleShadowTextView2, "btnFollow");
        AbstractC26112n.m134425t0(simpleShadowTextView2, AbstractC27406a.zch_text_primary);
        c25044q.f120186s.setBackgroundResource(AbstractC27408c.zch_bg_button_active_blue);
    }

    /* renamed from: d */
    public final void m52052d() {
        setThumbnailVisible(true);
        setLoadingVisible(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.dispatchDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        int i11 = this.f50553q;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i11, i11, getBorderPaint());
    }

    public final InterfaceC9563a getCallback() {
        return this.f50552p;
    }

    public final Channel getSuggestedChannel() {
        return this.f50559w;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25044q m129917a = C25044q.m129917a(this);
        AbstractC19074t.m100207e(m129917a, "bind(...)");
        View view = m129917a.f120189v;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{855638016, -1728053248});
        view.setBackground(gradientDrawable);
        m129917a.f120184q.setCornerRadius(0.25f);
        SimpleShadowTextView simpleShadowTextView = m129917a.f120186s;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
        AbstractC26112n.m134407k0(simpleShadowTextView, new C9565c());
        setClipToOutline(true);
        setOutlineProvider(new C9566d());
        this.f50560x = m129917a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (!AbstractC26112n.m134375P(this)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredHeight = getMeasuredHeight();
        C25044q c25044q = this.f50560x;
        if (c25044q == null) {
            AbstractC19074t.m100223u("binding");
            c25044q = null;
        }
        RecyclingImageView recyclingImageView = c25044q.f120187t;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        AbstractC26112n.m134381V(recyclingImageView, measuredHeight, 0);
        View view = c25044q.f120189v;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134381V(view, measuredHeight, 0);
        int i15 = this.f50558v;
        int i16 = measuredHeight - i15;
        SimpleShadowTextView simpleShadowTextView = c25044q.f120186s;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
        AbstractC26112n.m134381V(simpleShadowTextView, i16, i15);
        int measuredWidth = (getMeasuredWidth() - c25044q.f120188u.getMeasuredWidth()) / 2;
        int i17 = i16 - (this.f50557u + this.f50556t);
        FitUsernameTextView fitUsernameTextView = c25044q.f120188u;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134381V(fitUsernameTextView, i17, measuredWidth);
        int measuredWidth2 = (getMeasuredWidth() - c25044q.f120184q.getMeasuredWidth()) / 2;
        int measuredHeight2 = i17 - (c25044q.f120188u.getMeasuredHeight() + this.f50555s);
        AvatarImageView avatarImageView = c25044q.f120184q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        AbstractC26112n.m134381V(avatarImageView, measuredHeight2, measuredWidth2);
        LoadingBar loadingBar = c25044q.f120185r;
        AbstractC19074t.m100207e(loadingBar, "barLoading");
        if (AbstractC26112n.m134378S(loadingBar)) {
            LoadingBar loadingBar2 = c25044q.f120185r;
            AbstractC19074t.m100207e(loadingBar2, "barLoading");
            AbstractC26112n.m134383X(loadingBar2, 0, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i12);
        int i13 = (size / 3) * 2;
        C25044q c25044q = this.f50560x;
        if (c25044q == null) {
            AbstractC19074t.m100223u("binding");
            c25044q = null;
        }
        RecyclingImageView recyclingImageView = c25044q.f120187t;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        AbstractC26112n.m134387a0(recyclingImageView, i13, 1073741824, size, 1073741824);
        View view = c25044q.f120189v;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134387a0(view, i13, 1073741824, size, 1073741824);
        SimpleShadowTextView simpleShadowTextView = c25044q.f120186s;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
        AbstractC26112n.m134387a0(simpleShadowTextView, i13 - (this.f50558v * 2), 1073741824, this.f50557u, 1073741824);
        FitUsernameTextView fitUsernameTextView = c25044q.f120188u;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134387a0(fitUsernameTextView, i13 - (this.f50558v * 2), 1073741824, 0, 0);
        AvatarImageView avatarImageView = c25044q.f120184q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        int i14 = i13 / 4;
        AbstractC26112n.m134387a0(avatarImageView, i14, 1073741824, i14, 1073741824);
        LoadingBar loadingBar = c25044q.f120185r;
        AbstractC19074t.m100207e(loadingBar, "barLoading");
        if (AbstractC26112n.m134378S(loadingBar)) {
            LoadingBar loadingBar2 = c25044q.f120185r;
            AbstractC19074t.m100207e(loadingBar2, "barLoading");
            AbstractC26112n.m134387a0(loadingBar2, i13, 1073741824, this.f50554r, 1073741824);
        }
        setMeasuredDimension(i13, size);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC9563a interfaceC9563a;
        AbstractC19074t.m100208f(motionEvent, "event");
        if (motionEvent.getAction() == 1 && (interfaceC9563a = this.f50552p) != null) {
            interfaceC9563a.mo52054d();
        }
        return true;
    }

    public final void setCallback(InterfaceC9563a interfaceC9563a) {
        this.f50552p = interfaceC9563a;
    }

    public final void setLoadingVisible(boolean z11) {
        C25044q c25044q = this.f50560x;
        if (c25044q == null) {
            AbstractC19074t.m100223u("binding");
            c25044q = null;
        }
        if (z11) {
            LoadingBar loadingBar = c25044q.f120185r;
            AbstractC19074t.m100207e(loadingBar, "barLoading");
            AbstractC26112n.m134431w0(loadingBar);
        } else {
            LoadingBar loadingBar2 = c25044q.f120185r;
            AbstractC19074t.m100207e(loadingBar2, "barLoading");
            AbstractC26112n.m134367H(loadingBar2);
        }
    }

    public final void setThumbnailVisible(boolean z11) {
        C25044q c25044q = this.f50560x;
        if (c25044q == null) {
            AbstractC19074t.m100223u("binding");
            c25044q = null;
        }
        if (z11) {
            RecyclingImageView recyclingImageView = c25044q.f120187t;
            AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
            AbstractC26112n.m134431w0(recyclingImageView);
        } else {
            RecyclingImageView recyclingImageView2 = c25044q.f120187t;
            AbstractC19074t.m100207e(recyclingImageView2, "rivThumbnail");
            AbstractC26112n.m134367H(recyclingImageView2);
        }
    }
}
