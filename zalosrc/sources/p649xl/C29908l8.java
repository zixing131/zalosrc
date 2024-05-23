package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.l8 */
/* loaded from: classes3.dex */
public final class C29908l8 implements InterfaceC22715a {

    /* renamed from: p */
    private final TrackingRelativeLayout f138580p;

    /* renamed from: q */
    public final RoundedImageView f138581q;

    /* renamed from: r */
    public final TrackingImageView f138582r;

    /* renamed from: s */
    public final TrackingImageView f138583s;

    /* renamed from: t */
    public final LinearLayout f138584t;

    /* renamed from: u */
    public final RelativeLayout f138585u;

    /* renamed from: v */
    public final TrackingRelativeLayout f138586v;

    /* renamed from: w */
    public final LinearLayout f138587w;

    /* renamed from: x */
    public final RobotoTextView f138588x;

    private C29908l8(TrackingRelativeLayout trackingRelativeLayout, RoundedImageView roundedImageView, TrackingImageView trackingImageView, TrackingImageView trackingImageView2, LinearLayout linearLayout, RelativeLayout relativeLayout, TrackingRelativeLayout trackingRelativeLayout2, LinearLayout linearLayout2, RobotoTextView robotoTextView) {
        this.f138580p = trackingRelativeLayout;
        this.f138581q = roundedImageView;
        this.f138582r = trackingImageView;
        this.f138583s = trackingImageView2;
        this.f138584t = linearLayout;
        this.f138585u = relativeLayout;
        this.f138586v = trackingRelativeLayout2;
        this.f138587w = linearLayout2;
        this.f138588x = robotoTextView;
    }

    /* renamed from: a */
    public static C29908l8 m148203a(View view) {
        int i11 = AbstractC6918a0.brand_avt;
        RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
        if (roundedImageView != null) {
            i11 = AbstractC6918a0.btn_exit_loading_view;
            TrackingImageView trackingImageView = (TrackingImageView) AbstractC22716b.m117526a(view, i11);
            if (trackingImageView != null) {
                i11 = AbstractC6918a0.btn_menu_loading_view;
                TrackingImageView trackingImageView2 = (TrackingImageView) AbstractC22716b.m117526a(view, i11);
                if (trackingImageView2 != null) {
                    i11 = AbstractC6918a0.control_button_container;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC6918a0.layout_ma_avt;
                        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                        if (relativeLayout != null) {
                            TrackingRelativeLayout trackingRelativeLayout = (TrackingRelativeLayout) view;
                            i11 = AbstractC6918a0.mini_app_logo_container;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout2 != null) {
                                i11 = AbstractC6918a0.txt_brand_name;
                                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView != null) {
                                    return new C29908l8(trackingRelativeLayout, roundedImageView, trackingImageView, trackingImageView2, linearLayout, relativeLayout, trackingRelativeLayout, linearLayout2, robotoTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TrackingRelativeLayout getRoot() {
        return this.f138580p;
    }
}
