package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Badge;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.v2 */
/* loaded from: classes3.dex */
public final class C30078v2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139620p;

    /* renamed from: q */
    public final ZAppCompatImageView f139621q;

    /* renamed from: r */
    public final View f139622r;

    /* renamed from: s */
    public final LinearLayout f139623s;

    /* renamed from: t */
    public final LinearLayout f139624t;

    /* renamed from: u */
    public final Badge f139625u;

    /* renamed from: v */
    public final RobotoTextView f139626v;

    private C30078v2(LinearLayout linearLayout, ZAppCompatImageView zAppCompatImageView, View view, LinearLayout linearLayout2, LinearLayout linearLayout3, Badge badge, RobotoTextView robotoTextView) {
        this.f139620p = linearLayout;
        this.f139621q = zAppCompatImageView;
        this.f139622r = view;
        this.f139623s = linearLayout2;
        this.f139624t = linearLayout3;
        this.f139625u = badge;
        this.f139626v = robotoTextView;
    }

    /* renamed from: a */
    public static C30078v2 m148598a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.img_device;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.line_action))) != null) {
            i11 = AbstractC6918a0.ll_action;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.ll_content;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout2 != null) {
                    i11 = AbstractC6918a0.tv_label;
                    Badge badge = (Badge) AbstractC22716b.m117526a(view, i11);
                    if (badge != null) {
                        i11 = AbstractC6918a0.tv_name;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            return new C30078v2((LinearLayout) view, zAppCompatImageView, m117526a, linearLayout, linearLayout2, badge, robotoTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30078v2 m148599c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.detail_login_bottom_sheet_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148598a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139620p;
    }
}
