package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.oe */
/* loaded from: classes3.dex */
public final class C29968oe implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138908p;

    /* renamed from: q */
    public final Button f138909q;

    /* renamed from: r */
    public final RobotoTextView f138910r;

    /* renamed from: s */
    public final RobotoTextView f138911s;

    private C29968oe(LinearLayout linearLayout, Button button, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f138908p = linearLayout;
        this.f138909q = button;
        this.f138910r = robotoTextView;
        this.f138911s = robotoTextView2;
    }

    /* renamed from: a */
    public static C29968oe m148338a(View view) {
        int i11 = AbstractC6918a0.btnGotIt;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.tvDescription;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.tvTitle;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    return new C29968oe((LinearLayout) view, button, robotoTextView, robotoTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29968oe m148339c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.z_cloud_complete_setup_bottom_sheet_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148338a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138908p;
    }
}
