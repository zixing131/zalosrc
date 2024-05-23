package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.rounedlayout.RelativeRoundedLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.d8 */
/* loaded from: classes3.dex */
public final class C29764d8 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f137509A;

    /* renamed from: B */
    public final RobotoTextView f137510B;

    /* renamed from: C */
    public final RobotoTextView f137511C;

    /* renamed from: p */
    private final LinearLayout f137512p;

    /* renamed from: q */
    public final RelativeLayout f137513q;

    /* renamed from: r */
    public final ZAppCompatImageView f137514r;

    /* renamed from: s */
    public final ZAppCompatImageView f137515s;

    /* renamed from: t */
    public final ZAppCompatImageView f137516t;

    /* renamed from: u */
    public final RobotoTextView f137517u;

    /* renamed from: v */
    public final ZAppCompatImageView f137518v;

    /* renamed from: w */
    public final RoundedImageView f137519w;

    /* renamed from: x */
    public final RobotoTextView f137520x;

    /* renamed from: y */
    public final RelativeRoundedLayout f137521y;

    /* renamed from: z */
    public final RelativeRoundedLayout f137522z;

    private C29764d8(LinearLayout linearLayout, RelativeLayout relativeLayout, ZAppCompatImageView zAppCompatImageView, ZAppCompatImageView zAppCompatImageView2, ZAppCompatImageView zAppCompatImageView3, RobotoTextView robotoTextView, ZAppCompatImageView zAppCompatImageView4, RoundedImageView roundedImageView, RobotoTextView robotoTextView2, RelativeRoundedLayout relativeRoundedLayout, RelativeRoundedLayout relativeRoundedLayout2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5) {
        this.f137512p = linearLayout;
        this.f137513q = relativeLayout;
        this.f137514r = zAppCompatImageView;
        this.f137515s = zAppCompatImageView2;
        this.f137516t = zAppCompatImageView3;
        this.f137517u = robotoTextView;
        this.f137518v = zAppCompatImageView4;
        this.f137519w = roundedImageView;
        this.f137520x = robotoTextView2;
        this.f137521y = relativeRoundedLayout;
        this.f137522z = relativeRoundedLayout2;
        this.f137509A = robotoTextView3;
        this.f137510B = robotoTextView4;
        this.f137511C = robotoTextView5;
    }

    /* renamed from: a */
    public static C29764d8 m147852a(View view) {
        int i11 = AbstractC6918a0.header_view;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.iconNext;
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView != null) {
                i11 = AbstractC6918a0.iconPermission;
                ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView2 != null) {
                    i11 = AbstractC6918a0.iconReport;
                    ZAppCompatImageView zAppCompatImageView3 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                    if (zAppCompatImageView3 != null) {
                        i11 = AbstractC6918a0.ma_menu_category_tv;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.ma_menu_close;
                            ZAppCompatImageView zAppCompatImageView4 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                            if (zAppCompatImageView4 != null) {
                                i11 = AbstractC6918a0.ma_menu_icon;
                                RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
                                if (roundedImageView != null) {
                                    i11 = AbstractC6918a0.ma_menu_name_tv;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView2 != null) {
                                        i11 = AbstractC6918a0.maPermissionView;
                                        RelativeRoundedLayout relativeRoundedLayout = (RelativeRoundedLayout) AbstractC22716b.m117526a(view, i11);
                                        if (relativeRoundedLayout != null) {
                                            i11 = AbstractC6918a0.ma_report_view;
                                            RelativeRoundedLayout relativeRoundedLayout2 = (RelativeRoundedLayout) AbstractC22716b.m117526a(view, i11);
                                            if (relativeRoundedLayout2 != null) {
                                                i11 = AbstractC6918a0.ma_tv_description;
                                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView3 != null) {
                                                    i11 = AbstractC6918a0.text1;
                                                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView4 != null) {
                                                        i11 = AbstractC6918a0.text2;
                                                        RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView5 != null) {
                                                            return new C29764d8((LinearLayout) view, relativeLayout, zAppCompatImageView, zAppCompatImageView2, zAppCompatImageView3, robotoTextView, zAppCompatImageView4, roundedImageView, robotoTextView2, relativeRoundedLayout, relativeRoundedLayout2, robotoTextView3, robotoTextView4, robotoTextView5);
                                                        }
                                                    }
                                                }
                                            }
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
    public static C29764d8 m147853c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.mini_app_info_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147852a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137512p;
    }
}
