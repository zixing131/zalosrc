package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
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
public final class SuggestFollowLayout extends FrameLayout {

    /* renamed from: p */
    private final int f54151p;

    /* renamed from: q */
    private final int f54152q;

    /* renamed from: r */
    private final int f54153r;

    /* renamed from: s */
    private final int f54154s;

    /* renamed from: t */
    private final InterfaceC24854k f54155t;

    /* renamed from: u */
    private final InterfaceC24854k f54156u;

    /* renamed from: v */
    private final InterfaceC24854k f54157v;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SuggestFollowLayout$a */
    /* loaded from: classes5.dex */
    static final class C10705a extends AbstractC19075u implements InterfaceC18494a {
        C10705a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleShadowTextView mo12V4() {
            return (SimpleShadowTextView) SuggestFollowLayout.this.findViewById(AbstractC27409d.btnFollowSuggest);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SuggestFollowLayout$b */
    /* loaded from: classes5.dex */
    static final class C10706b extends AbstractC19075u implements InterfaceC18494a {
        C10706b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AvatarImageView mo12V4() {
            return (AvatarImageView) SuggestFollowLayout.this.findViewById(AbstractC27409d.rivAvatarSuggest);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SuggestFollowLayout$c */
    /* loaded from: classes5.dex */
    static final class C10707c extends AbstractC19075u implements InterfaceC18494a {
        C10707c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EllipsizedTextView mo12V4() {
            return (EllipsizedTextView) SuggestFollowLayout.this.findViewById(AbstractC27409d.tvTitleSuggest);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestFollowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        this.f54151p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_size_thumb_suggest_follow);
        this.f54152q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_horizontal_margin_suggest_follow);
        this.f54153r = AbstractC26105g.m134347n(12);
        this.f54154s = AbstractC26105g.m134347n(8);
        m129210a = AbstractC24856m.m129210a(new C10706b());
        this.f54155t = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10705a());
        this.f54156u = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C10707c());
        this.f54157v = m129210a3;
    }

    private final SimpleShadowTextView getBtnFollow() {
        Object value = this.f54156u.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (SimpleShadowTextView) value;
    }

    private final AvatarImageView getIvAvatar() {
        Object value = this.f54155t.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (AvatarImageView) value;
    }

    private final EllipsizedTextView getTvTitle() {
        Object value = this.f54157v.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (EllipsizedTextView) value;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        int measuredHeight = (getMeasuredHeight() - getIvAvatar().getMeasuredHeight()) / 2;
        int measuredHeight2 = (getMeasuredHeight() - getBtnFollow().getMeasuredHeight()) / 2;
        AbstractC26112n.m134383X(getIvAvatar(), measuredHeight, this.f54152q);
        AbstractC26112n.m134384Y(getBtnFollow(), measuredHeight2, getMeasuredWidth() - this.f54152q);
        AbstractC26112n.m134384Y(getTvTitle(), getIvAvatar().getTop() + ((getIvAvatar().getMeasuredHeight() - getTvTitle().getMeasuredHeight()) / 2), getBtnFollow().getLeft() - this.f54154s);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        AvatarImageView ivAvatar = getIvAvatar();
        int i13 = this.f54151p;
        AbstractC26112n.m134387a0(ivAvatar, i13, 1073741824, i13, 1073741824);
        AbstractC26112n.m134387a0(getBtnFollow(), 0, 0, 0, 0);
        AbstractC26112n.m134387a0(getTvTitle(), ((((size - (this.f54152q * 2)) - getIvAvatar().getMeasuredWidth()) - getBtnFollow().getMeasuredWidth()) - this.f54153r) - this.f54154s, 1073741824, 0, 0);
    }
}
