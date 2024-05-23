package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.dg */
/* loaded from: classes3.dex */
public final class C29772dg implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137598p;

    /* renamed from: q */
    public final RobotoTextView f137599q;

    /* renamed from: r */
    public final RobotoTextView f137600r;

    /* renamed from: s */
    public final ZAppCompatImageView f137601s;

    /* renamed from: t */
    public final Button f137602t;

    /* renamed from: u */
    public final ZAppCompatImageView f137603u;

    /* renamed from: v */
    public final LinearLayout f137604v;

    private C29772dg(RelativeLayout relativeLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ZAppCompatImageView zAppCompatImageView, Button button, ZAppCompatImageView zAppCompatImageView2, LinearLayout linearLayout) {
        this.f137598p = relativeLayout;
        this.f137599q = robotoTextView;
        this.f137600r = robotoTextView2;
        this.f137601s = zAppCompatImageView;
        this.f137602t = button;
        this.f137603u = zAppCompatImageView2;
        this.f137604v = linearLayout;
    }

    /* renamed from: a */
    public static C29772dg m147870a(View view) {
        int i11 = AbstractC6918a0.bannerDescription;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.bannerTitle;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.btnClose;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    i11 = AbstractC6918a0.btnForgotProtectionCode;
                    Button button = (Button) AbstractC22716b.m117526a(view, i11);
                    if (button != null) {
                        i11 = AbstractC6918a0.ivLeadingIcon;
                        ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                        if (zAppCompatImageView2 != null) {
                            i11 = AbstractC6918a0.mainContent;
                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout != null) {
                                return new C29772dg((RelativeLayout) view, robotoTextView, robotoTextView2, zAppCompatImageView, button, zAppCompatImageView2, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29772dg m147871c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.zcloud_notifiy_lock_verify_cloud_fixed_banner, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147870a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137598p;
    }
}
