package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public final class SimilarChannelLayout extends FrameLayout {

    /* renamed from: p */
    private final InterfaceC24854k f54138p;

    /* renamed from: q */
    private final InterfaceC24854k f54139q;

    /* renamed from: r */
    private final InterfaceC24854k f54140r;

    /* renamed from: s */
    private final InterfaceC24854k f54141s;

    /* renamed from: t */
    private final int f54142t;

    /* renamed from: u */
    private final int f54143u;

    /* renamed from: v */
    private final int f54144v;

    /* renamed from: w */
    private final int f54145w;

    /* renamed from: x */
    private final int f54146x;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SimilarChannelLayout$a */
    /* loaded from: classes5.dex */
    static final class C10701a extends AbstractC19075u implements InterfaceC18494a {
        C10701a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AvatarImageView mo12V4() {
            return (AvatarImageView) SimilarChannelLayout.this.findViewById(AbstractC27409d.aivAvatar);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SimilarChannelLayout$b */
    /* loaded from: classes5.dex */
    static final class C10702b extends AbstractC19075u implements InterfaceC18494a {
        C10702b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleShadowTextView mo12V4() {
            return (SimpleShadowTextView) SimilarChannelLayout.this.findViewById(AbstractC27409d.btnFollow);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SimilarChannelLayout$c */
    /* loaded from: classes5.dex */
    static final class C10703c extends AbstractC19075u implements InterfaceC18494a {
        C10703c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleShadowTextView mo12V4() {
            return (SimpleShadowTextView) SimilarChannelLayout.this.findViewById(AbstractC27409d.tvFollowStats);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SimilarChannelLayout$d */
    /* loaded from: classes5.dex */
    static final class C10704d extends AbstractC19075u implements InterfaceC18494a {
        C10704d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FitUsernameTextView mo12V4() {
            return (FitUsernameTextView) SimilarChannelLayout.this.findViewById(AbstractC27409d.txtName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarChannelLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C10701a());
        this.f54138p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10704d());
        this.f54139q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C10703c());
        this.f54140r = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C10702b());
        this.f54141s = m129210a4;
        this.f54142t = AbstractC26105g.m134347n(28);
        this.f54143u = AbstractC26105g.m134347n(12);
        this.f54144v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_similar_channel_width);
        this.f54145w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_similar_channel_height);
        this.f54146x = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_similar_avatar_size);
    }

    private final AvatarImageView getAvatarImageView() {
        Object value = this.f54138p.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (AvatarImageView) value;
    }

    private final SimpleShadowTextView getBtnFollow() {
        Object value = this.f54141s.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (SimpleShadowTextView) value;
    }

    private final SimpleShadowTextView getTvFollowStats() {
        Object value = this.f54140r.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (SimpleShadowTextView) value;
    }

    private final FitUsernameTextView getTxtName() {
        Object value = this.f54139q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (FitUsernameTextView) value;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        AbstractC26112n.m134383X(getAvatarImageView(), this.f54142t, (this.f54144v / 2) - (this.f54146x / 2));
        AbstractC26112n.m134383X(getTxtName(), getAvatarImageView().getBottom() + AbstractC26105g.m134347n(12), (this.f54144v / 2) - (getTxtName().getMeasuredWidth() / 2));
        AbstractC26112n.m134383X(getTvFollowStats(), getTxtName().getBottom() + AbstractC26105g.m134347n(4), 0);
        SimpleShadowTextView btnFollow = getBtnFollow();
        int measuredHeight = getMeasuredHeight();
        int i15 = this.f54143u;
        AbstractC26112n.m134381V(btnFollow, measuredHeight - i15, i15);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        AvatarImageView avatarImageView = getAvatarImageView();
        int i13 = this.f54146x;
        AbstractC26112n.m134387a0(avatarImageView, i13, 1073741824, i13, 1073741824);
        AbstractC26112n.m134387a0(getTxtName(), this.f54144v, 1073741824, 0, 0);
        AbstractC26112n.m134387a0(getTvFollowStats(), this.f54144v, 1073741824, 0, 0);
        AbstractC26112n.m134387a0(getBtnFollow(), this.f54144v - (AbstractC26105g.m134347n(12) * 2), 1073741824, AbstractC26105g.m134347n(28), 1073741824);
        setMeasuredDimension(this.f54144v, this.f54145w);
    }
}
