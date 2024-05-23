package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import q10.C25001e1;
import s20.AbstractC26112n;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class EditProfileLayout extends FrameLayout {

    /* renamed from: p */
    private final int f54062p;

    /* renamed from: q */
    private final int f54063q;

    /* renamed from: r */
    private final int f54064r;

    /* renamed from: s */
    private final int f54065s;

    /* renamed from: t */
    private final int f54066t;

    /* renamed from: u */
    private final int f54067u;

    /* renamed from: v */
    private C25001e1 f54068v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54062p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_loading_bar_size);
        this.f54063q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_edit_profile_divider_height);
        this.f54064r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_16dp);
        this.f54065s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_edit_profile_iv_camera_margin);
        this.f54066t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_edit_profile_avatar_size);
        this.f54067u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_edit_profile_avatar_overlay_height);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25001e1 m129799a = C25001e1.m129799a(this);
        AbstractC19074t.m100207e(m129799a, "bind(...)");
        this.f54068v = m129799a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int m116580c;
        int m116580c2;
        int m116580c3;
        int m116580c4;
        int m116580c5;
        int m116580c6;
        int m116580c7;
        int m116580c8;
        int m116580c9;
        int i15 = this.f54064r;
        int i16 = this.f54062p;
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = getMeasuredWidth() / 2;
        C25001e1 c25001e1 = this.f54068v;
        if (c25001e1 == null) {
            AbstractC19074t.m100223u("binding");
            c25001e1 = null;
        }
        AvatarImageView avatarImageView = c25001e1.f119878s;
        AbstractC19074t.m100207e(avatarImageView, "ivAvatar");
        AbstractC26112n.m134383X(avatarImageView, i16, measuredWidth2 - (this.f54066t / 2));
        View view = c25001e1.f119884y;
        AbstractC19074t.m100207e(view, "overlay");
        AbstractC26112n.m134383X(view, c25001e1.f119878s.getBottom() - this.f54067u, c25001e1.f119878s.getLeft());
        int bottom = (c25001e1.f119878s.getBottom() - c25001e1.f119879t.getMeasuredHeight()) - this.f54065s;
        ImageView imageView = c25001e1.f119879t;
        AbstractC19074t.m100207e(imageView, "ivCamera");
        AbstractC26112n.m134383X(imageView, bottom, measuredWidth2 - (c25001e1.f119879t.getMeasuredWidth() / 2));
        m116580c = AbstractC22543l.m116580c(c25001e1.f119871C.getMeasuredWidth(), c25001e1.f119874F.getMeasuredWidth());
        m116580c2 = AbstractC22543l.m116580c(m116580c, c25001e1.f119869A.getMeasuredWidth());
        int bottom2 = c25001e1.f119878s.getBottom() + this.f54062p;
        m116580c3 = AbstractC22543l.m116580c(c25001e1.f119871C.getMeasuredHeight(), c25001e1.f119870B.getMeasuredHeight());
        m116580c4 = AbstractC22543l.m116580c(m116580c3, c25001e1.f119882w.getMeasuredHeight());
        int i17 = (m116580c4 / 2) + bottom2;
        RobotoTextView robotoTextView = c25001e1.f119871C;
        AbstractC19074t.m100207e(robotoTextView, "tvChannelNameTitle");
        AbstractC26112n.m134383X(robotoTextView, i17 - (c25001e1.f119871C.getMeasuredHeight() / 2), i15);
        EllipsizedTextView ellipsizedTextView = c25001e1.f119870B;
        AbstractC19074t.m100207e(ellipsizedTextView, "tvChannelName");
        int i18 = m116580c2 + i15;
        AbstractC26112n.m134383X(ellipsizedTextView, i17 - (c25001e1.f119870B.getMeasuredHeight() / 2), this.f54064r + i18);
        ImageView imageView2 = c25001e1.f119882w;
        AbstractC19074t.m100207e(imageView2, "ivEditName");
        AbstractC26112n.m134383X(imageView2, i17 - (c25001e1.f119882w.getMeasuredHeight() / 2), measuredWidth - c25001e1.f119882w.getMeasuredWidth());
        int i19 = bottom2 + m116580c4 + this.f54064r;
        View view2 = c25001e1.f119877r;
        AbstractC19074t.m100207e(view2, "dividerName");
        AbstractC26112n.m134383X(view2, i19, i15);
        int bottom3 = c25001e1.f119877r.getBottom() + this.f54064r;
        m116580c5 = AbstractC22543l.m116580c(c25001e1.f119874F.getMeasuredHeight(), c25001e1.f119872D.getMeasuredHeight());
        m116580c6 = AbstractC22543l.m116580c(m116580c5, c25001e1.f119881v.getMeasuredHeight());
        int i21 = (m116580c6 / 2) + bottom3;
        RobotoTextView robotoTextView2 = c25001e1.f119874F;
        AbstractC19074t.m100207e(robotoTextView2, "tvIdTitle");
        AbstractC26112n.m134383X(robotoTextView2, i21 - (c25001e1.f119874F.getMeasuredHeight() / 2), i15);
        EllipsizedTextView ellipsizedTextView2 = c25001e1.f119872D;
        AbstractC19074t.m100207e(ellipsizedTextView2, "tvID");
        AbstractC26112n.m134383X(ellipsizedTextView2, i21 - (c25001e1.f119872D.getMeasuredHeight() / 2), this.f54064r + i18);
        ImageView imageView3 = c25001e1.f119881v;
        AbstractC19074t.m100207e(imageView3, "ivEditID");
        AbstractC26112n.m134383X(imageView3, i21 - (c25001e1.f119881v.getMeasuredHeight() / 2), measuredWidth - c25001e1.f119881v.getMeasuredWidth());
        int i22 = bottom3 + m116580c6;
        int i23 = this.f54064r + i22;
        EllipsizedTextView ellipsizedTextView3 = c25001e1.f119873E;
        AbstractC19074t.m100207e(ellipsizedTextView3, "tvIDFull");
        if (AbstractC26112n.m134380U(ellipsizedTextView3)) {
            int i24 = i22 + (this.f54064r / 2);
            m116580c9 = AbstractC22543l.m116580c(c25001e1.f119873E.getMeasuredHeight(), c25001e1.f119880u.getMeasuredHeight());
            int i25 = (m116580c9 / 2) + i24;
            EllipsizedTextView ellipsizedTextView4 = c25001e1.f119873E;
            AbstractC19074t.m100207e(ellipsizedTextView4, "tvIDFull");
            AbstractC26112n.m134383X(ellipsizedTextView4, i25 - (c25001e1.f119873E.getMeasuredHeight() / 2), this.f54064r + i18);
            ImageView imageView4 = c25001e1.f119880u;
            AbstractC19074t.m100207e(imageView4, "ivCopy");
            AbstractC26112n.m134383X(imageView4, i25 - (c25001e1.f119880u.getMeasuredHeight() / 2), c25001e1.f119873E.getRight() + (this.f54064r / 4));
            i23 = this.f54064r + i24 + m116580c9;
        }
        View view3 = c25001e1.f119876q;
        AbstractC19074t.m100207e(view3, "dividerID");
        AbstractC26112n.m134383X(view3, i23, i15);
        int bottom4 = c25001e1.f119876q.getBottom() + this.f54064r;
        m116580c7 = AbstractC22543l.m116580c(c25001e1.f119869A.getMeasuredHeight(), c25001e1.f119885z.getMeasuredHeight());
        m116580c8 = AbstractC22543l.m116580c(m116580c7, c25001e1.f119883x.getMeasuredHeight());
        int i26 = bottom4 + (m116580c8 / 2);
        RobotoTextView robotoTextView3 = c25001e1.f119869A;
        AbstractC19074t.m100207e(robotoTextView3, "tvBioTitle");
        AbstractC26112n.m134383X(robotoTextView3, i26 - (c25001e1.f119869A.getMeasuredHeight() / 2), i15);
        EllipsizedTextView ellipsizedTextView5 = c25001e1.f119885z;
        AbstractC19074t.m100207e(ellipsizedTextView5, "tvBio");
        AbstractC26112n.m134383X(ellipsizedTextView5, i26 - (c25001e1.f119885z.getMeasuredHeight() / 2), i18 + this.f54064r);
        ImageView imageView5 = c25001e1.f119883x;
        AbstractC19074t.m100207e(imageView5, "ivEdtBio");
        AbstractC26112n.m134383X(imageView5, i26 - (c25001e1.f119883x.getMeasuredHeight() / 2), measuredWidth - c25001e1.f119883x.getMeasuredWidth());
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int m116580c;
        int m116580c2;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25001e1 c25001e1 = this.f54068v;
        if (c25001e1 == null) {
            AbstractC19074t.m100223u("binding");
            c25001e1 = null;
        }
        AvatarImageView avatarImageView = c25001e1.f119878s;
        AbstractC19074t.m100207e(avatarImageView, "ivAvatar");
        int i13 = this.f54066t;
        AbstractC26112n.m134387a0(avatarImageView, i13, 1073741824, i13, 1073741824);
        View view = c25001e1.f119884y;
        AbstractC19074t.m100207e(view, "overlay");
        AbstractC26112n.m134387a0(view, this.f54066t, 1073741824, this.f54067u, 1073741824);
        ImageView imageView = c25001e1.f119879t;
        AbstractC19074t.m100207e(imageView, "ivCamera");
        AbstractC26112n.m134387a0(imageView, 0, 0, 0, 0);
        RobotoTextView robotoTextView = c25001e1.f119871C;
        AbstractC19074t.m100207e(robotoTextView, "tvChannelNameTitle");
        AbstractC26112n.m134387a0(robotoTextView, 0, 0, 0, 0);
        RobotoTextView robotoTextView2 = c25001e1.f119869A;
        AbstractC19074t.m100207e(robotoTextView2, "tvBioTitle");
        AbstractC26112n.m134387a0(robotoTextView2, 0, 0, 0, 0);
        RobotoTextView robotoTextView3 = c25001e1.f119874F;
        AbstractC19074t.m100207e(robotoTextView3, "tvIdTitle");
        AbstractC26112n.m134387a0(robotoTextView3, 0, 0, 0, 0);
        m116580c = AbstractC22543l.m116580c(c25001e1.f119871C.getMeasuredWidth(), c25001e1.f119869A.getMeasuredWidth());
        m116580c2 = AbstractC22543l.m116580c(m116580c, c25001e1.f119874F.getMeasuredWidth());
        ImageView imageView2 = c25001e1.f119882w;
        AbstractC19074t.m100207e(imageView2, "ivEditName");
        AbstractC26112n.m134387a0(imageView2, 0, 0, 0, 0);
        ImageView imageView3 = c25001e1.f119881v;
        AbstractC19074t.m100207e(imageView3, "ivEditID");
        AbstractC26112n.m134387a0(imageView3, 0, 0, 0, 0);
        ImageView imageView4 = c25001e1.f119883x;
        AbstractC19074t.m100207e(imageView4, "ivEdtBio");
        AbstractC26112n.m134387a0(imageView4, 0, 0, 0, 0);
        int measuredWidth = ((size - m116580c2) - c25001e1.f119882w.getMeasuredWidth()) - (this.f54064r * 2);
        EllipsizedTextView ellipsizedTextView = c25001e1.f119870B;
        AbstractC19074t.m100207e(ellipsizedTextView, "tvChannelName");
        AbstractC26112n.m134387a0(ellipsizedTextView, measuredWidth, 1073741824, 0, 0);
        EllipsizedTextView ellipsizedTextView2 = c25001e1.f119872D;
        AbstractC19074t.m100207e(ellipsizedTextView2, "tvID");
        AbstractC26112n.m134387a0(ellipsizedTextView2, measuredWidth, 1073741824, 0, 0);
        EllipsizedTextView ellipsizedTextView3 = c25001e1.f119873E;
        AbstractC19074t.m100207e(ellipsizedTextView3, "tvIDFull");
        if (AbstractC26112n.m134380U(ellipsizedTextView3)) {
            ImageView imageView5 = c25001e1.f119880u;
            AbstractC19074t.m100207e(imageView5, "ivCopy");
            AbstractC26112n.m134387a0(imageView5, 0, 0, 0, 0);
            EllipsizedTextView ellipsizedTextView4 = c25001e1.f119873E;
            AbstractC19074t.m100207e(ellipsizedTextView4, "tvIDFull");
            AbstractC26112n.m134387a0(ellipsizedTextView4, measuredWidth - c25001e1.f119880u.getMeasuredWidth(), Integer.MIN_VALUE, 0, 0);
        }
        EllipsizedTextView ellipsizedTextView5 = c25001e1.f119885z;
        AbstractC19074t.m100207e(ellipsizedTextView5, "tvBio");
        AbstractC26112n.m134387a0(ellipsizedTextView5, measuredWidth, 1073741824, 0, 0);
        View view2 = c25001e1.f119877r;
        AbstractC19074t.m100207e(view2, "dividerName");
        AbstractC26112n.m134387a0(view2, size - this.f54062p, 1073741824, this.f54063q, 1073741824);
        View view3 = c25001e1.f119876q;
        AbstractC19074t.m100207e(view3, "dividerID");
        AbstractC26112n.m134387a0(view3, size - this.f54062p, 1073741824, this.f54063q, 1073741824);
        setMeasuredDimension(size, size2);
    }
}
