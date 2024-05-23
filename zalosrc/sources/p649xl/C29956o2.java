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

/* renamed from: xl.o2 */
/* loaded from: classes3.dex */
public final class C29956o2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138848p;

    /* renamed from: q */
    public final RobotoTextView f138849q;

    /* renamed from: r */
    public final RobotoTextView f138850r;

    private C29956o2(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f138848p = linearLayout;
        this.f138849q = robotoTextView;
        this.f138850r = robotoTextView2;
    }

    /* renamed from: a */
    public static C29956o2 m148304a(View view) {
        int i11 = AbstractC6918a0.tvSubtitle;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.tvTitle;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                return new C29956o2((LinearLayout) view, robotoTextView, robotoTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29956o2 m148305c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.custom_title_sub_title_dialog, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148304a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138848p;
    }
}
