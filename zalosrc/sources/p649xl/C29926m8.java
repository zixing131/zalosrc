package p649xl;

import android.view.View;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.rounedlayout.LinearRoundedLayout;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.m8 */
/* loaded from: classes3.dex */
public final class C29926m8 implements InterfaceC22715a {

    /* renamed from: p */
    private final TrackingRelativeLayout f138666p;

    /* renamed from: q */
    public final RoundedImageView f138667q;

    /* renamed from: r */
    public final TrackingImageView f138668r;

    /* renamed from: s */
    public final TrackingRelativeLayout f138669s;

    /* renamed from: t */
    public final LinearRoundedLayout f138670t;

    /* renamed from: u */
    public final TextView f138671u;

    private C29926m8(TrackingRelativeLayout trackingRelativeLayout, RoundedImageView roundedImageView, TrackingImageView trackingImageView, TrackingRelativeLayout trackingRelativeLayout2, LinearRoundedLayout linearRoundedLayout, TextView textView) {
        this.f138666p = trackingRelativeLayout;
        this.f138667q = roundedImageView;
        this.f138668r = trackingImageView;
        this.f138669s = trackingRelativeLayout2;
        this.f138670t = linearRoundedLayout;
        this.f138671u = textView;
    }

    /* renamed from: a */
    public static C29926m8 m148245a(View view) {
        int i11 = AbstractC6918a0.brand_avt;
        RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
        if (roundedImageView != null) {
            i11 = AbstractC6918a0.btn_exit_loading_view;
            TrackingImageView trackingImageView = (TrackingImageView) AbstractC22716b.m117526a(view, i11);
            if (trackingImageView != null) {
                TrackingRelativeLayout trackingRelativeLayout = (TrackingRelativeLayout) view;
                i11 = AbstractC6918a0.layout_popup;
                LinearRoundedLayout linearRoundedLayout = (LinearRoundedLayout) AbstractC22716b.m117526a(view, i11);
                if (linearRoundedLayout != null) {
                    i11 = AbstractC6918a0.txt_brand_name;
                    TextView textView = (TextView) AbstractC22716b.m117526a(view, i11);
                    if (textView != null) {
                        return new C29926m8(trackingRelativeLayout, roundedImageView, trackingImageView, trackingRelativeLayout, linearRoundedLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TrackingRelativeLayout getRoot() {
        return this.f138666p;
    }
}
