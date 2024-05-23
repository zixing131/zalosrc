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

/* renamed from: xl.p3 */
/* loaded from: classes3.dex */
public final class C29975p3 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138938p;

    /* renamed from: q */
    public final LinearLayout f138939q;

    /* renamed from: r */
    public final RobotoTextView f138940r;

    private C29975p3(LinearLayout linearLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView) {
        this.f138938p = linearLayout;
        this.f138939q = linearLayout2;
        this.f138940r = robotoTextView;
    }

    /* renamed from: a */
    public static C29975p3 m148353a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = AbstractC6918a0.tv_profile_footer_error;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            return new C29975p3(linearLayout, linearLayout, robotoTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29975p3 m148354c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.feed_footer_layout_error, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148353a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138938p;
    }
}
