package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.t4 */
/* loaded from: classes3.dex */
public final class C30046t4 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139377p;

    /* renamed from: q */
    public final ZAppCompatImageView f139378q;

    /* renamed from: r */
    public final ZAppCompatImageView f139379r;

    /* renamed from: s */
    public final LinearLayout f139380s;

    /* renamed from: t */
    public final LinearLayout f139381t;

    /* renamed from: u */
    public final RobotoTextView f139382u;

    /* renamed from: v */
    public final RobotoTextView f139383v;

    /* renamed from: w */
    public final RobotoTextView f139384w;

    /* renamed from: x */
    public final RobotoTextView f139385x;

    private C30046t4(LinearLayout linearLayout, ZAppCompatImageView zAppCompatImageView, ZAppCompatImageView zAppCompatImageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.f139377p = linearLayout;
        this.f139378q = zAppCompatImageView;
        this.f139379r = zAppCompatImageView2;
        this.f139380s = linearLayout2;
        this.f139381t = linearLayout3;
        this.f139382u = robotoTextView;
        this.f139383v = robotoTextView2;
        this.f139384w = robotoTextView3;
        this.f139385x = robotoTextView4;
    }

    /* renamed from: a */
    public static C30046t4 m148518a(View view) {
        int i11 = AbstractC6918a0.ic_open_from_web;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.ic_open_from_zalo;
            ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView2 != null) {
                i11 = AbstractC6918a0.ll_open_from_web_setting;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC6918a0.ll_open_from_zalo_setting;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout2 != null) {
                        i11 = AbstractC6918a0.tv_open_from_web_des;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.tv_open_from_web_title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                i11 = AbstractC6918a0.tv_open_from_zalo_des;
                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView3 != null) {
                                    i11 = AbstractC6918a0.tv_open_from_zalo_title;
                                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView4 != null) {
                                        return new C30046t4((LinearLayout) view, zAppCompatImageView, zAppCompatImageView2, linearLayout, linearLayout2, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4);
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
    public static C30046t4 m148519c(LayoutInflater layoutInflater) {
        return m148520d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30046t4 m148520d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.jump_link_setting_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148518a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139377p;
    }
}
