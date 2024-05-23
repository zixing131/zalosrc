package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.camera.filterpicker.customviews.FilterPickerRoundedCornerImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.m1 */
/* loaded from: classes3.dex */
public final class C29919m1 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138636p;

    /* renamed from: q */
    public final RobotoTextView f138637q;

    /* renamed from: r */
    public final RobotoTextView f138638r;

    /* renamed from: s */
    public final FilterPickerRoundedCornerImageView f138639s;

    private C29919m1(FrameLayout frameLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, FilterPickerRoundedCornerImageView filterPickerRoundedCornerImageView) {
        this.f138636p = frameLayout;
        this.f138637q = robotoTextView;
        this.f138638r = robotoTextView2;
        this.f138639s = filterPickerRoundedCornerImageView;
    }

    /* renamed from: a */
    public static C29919m1 m148226a(View view) {
        int i11 = AbstractC6918a0.duration_text;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.gif_label;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.image_view;
                FilterPickerRoundedCornerImageView filterPickerRoundedCornerImageView = (FilterPickerRoundedCornerImageView) AbstractC22716b.m117526a(view, i11);
                if (filterPickerRoundedCornerImageView != null) {
                    return new C29919m1((FrameLayout) view, robotoTextView, robotoTextView2, filterPickerRoundedCornerImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29919m1 m148227c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.camera_gallery_mini_item_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148226a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138636p;
    }
}
