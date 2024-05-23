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

/* renamed from: xl.g1 */
/* loaded from: classes3.dex */
public final class C29811g1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137832p;

    /* renamed from: q */
    public final ZAppCompatImageView f137833q;

    /* renamed from: r */
    public final LinearLayout f137834r;

    /* renamed from: s */
    public final RobotoTextView f137835s;

    /* renamed from: t */
    public final RobotoTextView f137836t;

    /* renamed from: u */
    public final RobotoTextView f137837u;

    /* renamed from: v */
    public final ZAppCompatImageView f137838v;

    private C29811g1(LinearLayout linearLayout, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, ZAppCompatImageView zAppCompatImageView2) {
        this.f137832p = linearLayout;
        this.f137833q = zAppCompatImageView;
        this.f137834r = linearLayout2;
        this.f137835s = robotoTextView;
        this.f137836t = robotoTextView2;
        this.f137837u = robotoTextView3;
        this.f137838v = zAppCompatImageView2;
    }

    /* renamed from: a */
    public static C29811g1 m147972a(View view) {
        int i11 = AbstractC6918a0.icon;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.layout_account_info;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.tv_account_name_backup;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.tv_diff_acc;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.tv_title;
                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView3 != null) {
                            i11 = AbstractC6918a0.warning_icon;
                            ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                            if (zAppCompatImageView2 != null) {
                                return new C29811g1((LinearLayout) view, zAppCompatImageView, linearLayout, robotoTextView, robotoTextView2, robotoTextView3, zAppCompatImageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29811g1 m147973c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_zcloud_drive_login, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147972a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137832p;
    }
}
