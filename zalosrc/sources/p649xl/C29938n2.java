package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.n2 */
/* loaded from: classes3.dex */
public final class C29938n2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138750p;

    /* renamed from: q */
    public final RobotoTextView f138751q;

    /* renamed from: r */
    public final RobotoTextView f138752r;

    private C29938n2(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f138750p = linearLayout;
        this.f138751q = robotoTextView;
        this.f138752r = robotoTextView2;
    }

    /* renamed from: a */
    public static C29938n2 m148266a(View view) {
        int i11 = AbstractC6918a0.tv_action;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.tv_custom_subtitle;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                return new C29938n2((LinearLayout) view, robotoTextView, robotoTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29938n2 m148267c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.custom_title_dialog_confirm_on_off_history_msg, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148266a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138750p;
    }
}
