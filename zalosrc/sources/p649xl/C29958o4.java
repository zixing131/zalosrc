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

/* renamed from: xl.o4 */
/* loaded from: classes3.dex */
public final class C29958o4 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138855p;

    /* renamed from: q */
    public final LinearLayout f138856q;

    /* renamed from: r */
    public final RobotoTextView f138857r;

    /* renamed from: s */
    public final RobotoTextView f138858s;

    private C29958o4(LinearLayout linearLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f138855p = linearLayout;
        this.f138856q = linearLayout2;
        this.f138857r = robotoTextView;
        this.f138858s = robotoTextView2;
    }

    /* renamed from: a */
    public static C29958o4 m148310a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = AbstractC6918a0.tv_backup_rules_desc;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.tv_backup_rules_desc_2;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                return new C29958o4(linearLayout, linearLayout, robotoTextView, robotoTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29958o4 m148311c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.introduce_backup_rules_btm_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148310a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138855p;
    }
}
