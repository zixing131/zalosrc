package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.ChangeableHeightView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.t6 */
/* loaded from: classes3.dex */
public final class C30048t6 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139390p;

    /* renamed from: q */
    public final Button f139391q;

    /* renamed from: r */
    public final LinearLayout f139392r;

    /* renamed from: s */
    public final RecyclingImageView f139393s;

    /* renamed from: t */
    public final LinearLayout f139394t;

    /* renamed from: u */
    public final ChangeableHeightView f139395u;

    /* renamed from: v */
    public final RobotoTextView f139396v;

    /* renamed from: w */
    public final RobotoTextView f139397w;

    private C30048t6(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, RecyclingImageView recyclingImageView, LinearLayout linearLayout3, ChangeableHeightView changeableHeightView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139390p = linearLayout;
        this.f139391q = button;
        this.f139392r = linearLayout2;
        this.f139393s = recyclingImageView;
        this.f139394t = linearLayout3;
        this.f139395u = changeableHeightView;
        this.f139396v = robotoTextView;
        this.f139397w = robotoTextView2;
    }

    /* renamed from: a */
    public static C30048t6 m148524a(View view) {
        int i11 = AbstractC6918a0.btnFullEmpty;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.content;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.imv_fullscreen_empty;
                RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                if (recyclingImageView != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view;
                    i11 = AbstractC6918a0.padding_view;
                    ChangeableHeightView changeableHeightView = (ChangeableHeightView) AbstractC22716b.m117526a(view, i11);
                    if (changeableHeightView != null) {
                        i11 = AbstractC6918a0.tv_recommend;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.tv_title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                return new C30048t6(linearLayout2, button, linearLayout, recyclingImageView, linearLayout2, changeableHeightView, robotoTextView, robotoTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30048t6 m148525c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_profile_empty_content, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148524a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139390p;
    }
}
