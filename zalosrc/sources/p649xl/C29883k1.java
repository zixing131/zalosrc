package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.TrackingLinearLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.k1 */
/* loaded from: classes3.dex */
public final class C29883k1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138437p;

    /* renamed from: q */
    public final TrackingLinearLayout f138438q;

    /* renamed from: r */
    public final Avatar f138439r;

    /* renamed from: s */
    public final TrackingImageView f138440s;

    /* renamed from: t */
    public final TrackingImageView f138441t;

    /* renamed from: u */
    public final LinearLayout f138442u;

    /* renamed from: v */
    public final RobotoTextView f138443v;

    /* renamed from: w */
    public final RobotoTextView f138444w;

    /* renamed from: x */
    public final RobotoTextView f138445x;

    private C29883k1(LinearLayout linearLayout, TrackingLinearLayout trackingLinearLayout, Avatar avatar, TrackingImageView trackingImageView, TrackingImageView trackingImageView2, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.f138437p = linearLayout;
        this.f138438q = trackingLinearLayout;
        this.f138439r = avatar;
        this.f138440s = trackingImageView;
        this.f138441t = trackingImageView2;
        this.f138442u = linearLayout2;
        this.f138443v = robotoTextView;
        this.f138444w = robotoTextView2;
        this.f138445x = robotoTextView3;
    }

    /* renamed from: a */
    public static C29883k1 m148146a(View view) {
        int i11 = AbstractC6918a0.business_tool_badge_container;
        TrackingLinearLayout trackingLinearLayout = (TrackingLinearLayout) AbstractC22716b.m117526a(view, i11);
        if (trackingLinearLayout != null) {
            i11 = AbstractC6918a0.business_tool_imv_avatar;
            Avatar avatar = (Avatar) AbstractC22716b.m117526a(view, i11);
            if (avatar != null) {
                i11 = AbstractC6918a0.business_tool_imv_copy_link;
                TrackingImageView trackingImageView = (TrackingImageView) AbstractC22716b.m117526a(view, i11);
                if (trackingImageView != null) {
                    i11 = AbstractC6918a0.business_tool_imv_share_link;
                    TrackingImageView trackingImageView2 = (TrackingImageView) AbstractC22716b.m117526a(view, i11);
                    if (trackingImageView2 != null) {
                        i11 = AbstractC6918a0.business_tool_link_container;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.business_tool_tv_learn_more;
                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView != null) {
                                i11 = AbstractC6918a0.business_tool_tv_link;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    i11 = AbstractC6918a0.business_tool_tv_name;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView3 != null) {
                                        return new C29883k1((LinearLayout) view, trackingLinearLayout, avatar, trackingImageView, trackingImageView2, linearLayout, robotoTextView, robotoTextView2, robotoTextView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29883k1 m148147c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.business_tools_header_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148146a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138437p;
    }
}
