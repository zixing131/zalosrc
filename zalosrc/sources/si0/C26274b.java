package si0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.tab.TabItemView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: si0.b */
/* loaded from: classes7.dex */
public final class C26274b implements InterfaceC22715a {

    /* renamed from: p */
    private final TabItemView f124712p;

    /* renamed from: q */
    public final FrameLayout f124713q;

    /* renamed from: r */
    public final Badge f124714r;

    /* renamed from: s */
    public final View f124715s;

    /* renamed from: t */
    public final LinearLayout f124716t;

    /* renamed from: u */
    public final ConstraintLayout f124717u;

    /* renamed from: v */
    public final TrackingImageView f124718v;

    /* renamed from: w */
    public final ConstraintLayout f124719w;

    /* renamed from: x */
    public final ConstraintLayout f124720x;

    /* renamed from: y */
    public final RobotoTextView f124721y;

    /* renamed from: z */
    public final RobotoTextView f124722z;

    private C26274b(TabItemView tabItemView, FrameLayout frameLayout, Badge badge, View view, LinearLayout linearLayout, ConstraintLayout constraintLayout, TrackingImageView trackingImageView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f124712p = tabItemView;
        this.f124713q = frameLayout;
        this.f124714r = badge;
        this.f124715s = view;
        this.f124716t = linearLayout;
        this.f124717u = constraintLayout;
        this.f124718v = trackingImageView;
        this.f124719w = constraintLayout2;
        this.f124720x = constraintLayout3;
        this.f124721y = robotoTextView;
        this.f124722z = robotoTextView2;
    }

    /* renamed from: a */
    public static C26274b m135162a(View view) {
        View m117526a;
        int i11 = AbstractC2811e.custom_container;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null) {
            i11 = AbstractC2811e.dot_badge;
            Badge badge = (Badge) AbstractC22716b.m117526a(view, i11);
            if (badge != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC2811e.indicator))) != null) {
                i11 = AbstractC2811e.itemContainer;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC2811e.leadingContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC22716b.m117526a(view, i11);
                    if (constraintLayout != null) {
                        i11 = AbstractC2811e.tab_icon;
                        TrackingImageView trackingImageView = (TrackingImageView) AbstractC22716b.m117526a(view, i11);
                        if (trackingImageView != null) {
                            i11 = AbstractC2811e.textContainer;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) AbstractC22716b.m117526a(view, i11);
                            if (constraintLayout2 != null) {
                                i11 = AbstractC2811e.trailing_container;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) AbstractC22716b.m117526a(view, i11);
                                if (constraintLayout3 != null) {
                                    i11 = AbstractC2811e.txtContent;
                                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView != null) {
                                        i11 = AbstractC2811e.txtNumber;
                                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView2 != null) {
                                            return new C26274b((TabItemView) view, frameLayout, badge, m117526a, linearLayout, constraintLayout, trackingImageView, constraintLayout2, constraintLayout3, robotoTextView, robotoTextView2);
                                        }
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
    public static C26274b m135163c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC2812f.normal_tab_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m135162a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TabItemView getRoot() {
        return this.f124712p;
    }
}
