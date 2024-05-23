package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.q0 */
/* loaded from: classes3.dex */
public final class C29990q0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139064p;

    /* renamed from: q */
    public final Button f139065q;

    /* renamed from: r */
    public final ZAppCompatImageView f139066r;

    /* renamed from: s */
    public final LinearLayout f139067s;

    /* renamed from: t */
    public final RobotoTextView f139068t;

    /* renamed from: u */
    public final RobotoTextView f139069u;

    /* renamed from: v */
    public final RobotoTextView f139070v;

    private C29990q0(LinearLayout linearLayout, Button button, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.f139064p = linearLayout;
        this.f139065q = button;
        this.f139066r = zAppCompatImageView;
        this.f139067s = linearLayout2;
        this.f139068t = robotoTextView;
        this.f139069u = robotoTextView2;
        this.f139070v = robotoTextView3;
    }

    /* renamed from: a */
    public static C29990q0 m148382a(View view) {
        int i11 = AbstractC6918a0.btnClose;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.imgIcon;
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView != null) {
                i11 = AbstractC6918a0.layoutContent;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC6918a0.tvDescription;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.tvMore;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            i11 = AbstractC6918a0.tvTitle;
                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView3 != null) {
                                return new C29990q0((LinearLayout) view, button, zAppCompatImageView, linearLayout, robotoTextView, robotoTextView2, robotoTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29990q0 m148383c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_e2ee_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148382a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139064p;
    }
}
