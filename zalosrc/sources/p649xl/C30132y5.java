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

/* renamed from: xl.y5 */
/* loaded from: classes3.dex */
public final class C30132y5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140012p;

    /* renamed from: q */
    public final RobotoTextView f140013q;

    /* renamed from: r */
    public final RobotoTextView f140014r;

    private C30132y5(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f140012p = linearLayout;
        this.f140013q = robotoTextView;
        this.f140014r = robotoTextView2;
    }

    /* renamed from: a */
    public static C30132y5 m148728a(View view) {
        int i11 = AbstractC6918a0.bullet_point;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.title;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                return new C30132y5((LinearLayout) view, robotoTextView, robotoTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30132y5 m148729c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_move_tab_user_description_row_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148728a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140012p;
    }
}
