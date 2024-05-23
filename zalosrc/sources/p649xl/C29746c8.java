package p649xl;

import android.view.View;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.rounedlayout.LinearRoundedLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TrackingLinearLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.c8 */
/* loaded from: classes3.dex */
public final class C29746c8 implements InterfaceC22715a {

    /* renamed from: p */
    private final TrackingLinearLayout f137406p;

    /* renamed from: q */
    public final Button f137407q;

    /* renamed from: r */
    public final TrackingLinearLayout f137408r;

    /* renamed from: s */
    public final LinearRoundedLayout f137409s;

    /* renamed from: t */
    public final RecyclingImageView f137410t;

    /* renamed from: u */
    public final RobotoTextView f137411u;

    /* renamed from: v */
    public final RobotoTextView f137412v;

    private C29746c8(TrackingLinearLayout trackingLinearLayout, Button button, TrackingLinearLayout trackingLinearLayout2, LinearRoundedLayout linearRoundedLayout, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137406p = trackingLinearLayout;
        this.f137407q = button;
        this.f137408r = trackingLinearLayout2;
        this.f137409s = linearRoundedLayout;
        this.f137410t = recyclingImageView;
        this.f137411u = robotoTextView;
        this.f137412v = robotoTextView2;
    }

    /* renamed from: a */
    public static C29746c8 m147809a(View view) {
        int i11 = AbstractC6918a0.ma_aw_close_button;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            TrackingLinearLayout trackingLinearLayout = (TrackingLinearLayout) view;
            i11 = AbstractC6918a0.ma_aw_content;
            LinearRoundedLayout linearRoundedLayout = (LinearRoundedLayout) AbstractC22716b.m117526a(view, i11);
            if (linearRoundedLayout != null) {
                i11 = AbstractC6918a0.ma_aw_cover;
                RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                if (recyclingImageView != null) {
                    i11 = AbstractC6918a0.ma_aw_description_text;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.ma_aw_label_text;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            return new C29746c8(trackingLinearLayout, button, trackingLinearLayout, linearRoundedLayout, recyclingImageView, robotoTextView, robotoTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public TrackingLinearLayout getRoot() {
        return this.f137406p;
    }
}
