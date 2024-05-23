package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.r2 */
/* loaded from: classes3.dex */
public final class C30010r2 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139187p;

    /* renamed from: q */
    public final RobotoTextView f139188q;

    private C30010r2(RelativeLayout relativeLayout, RobotoTextView robotoTextView) {
        this.f139187p = relativeLayout;
        this.f139188q = robotoTextView;
    }

    /* renamed from: a */
    public static C30010r2 m148429a(View view) {
        int i11 = AbstractC6918a0.label;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            return new C30010r2((RelativeLayout) view, robotoTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30010r2 m148430c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.default_bottom_sheet_label_row_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148429a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139187p;
    }
}
