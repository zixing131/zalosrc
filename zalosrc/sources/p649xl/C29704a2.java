package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.a2 */
/* loaded from: classes3.dex */
public final class C29704a2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137187p;

    /* renamed from: q */
    public final CheckBox f137188q;

    /* renamed from: r */
    public final RobotoTextView f137189r;

    private C29704a2(LinearLayout linearLayout, CheckBox checkBox, RobotoTextView robotoTextView) {
        this.f137187p = linearLayout;
        this.f137188q = checkBox;
        this.f137189r = robotoTextView;
    }

    /* renamed from: a */
    public static C29704a2 m147705a(View view) {
        int i11 = AbstractC6918a0.cbRemoveContact;
        CheckBox checkBox = (CheckBox) AbstractC22716b.m117526a(view, i11);
        if (checkBox != null) {
            i11 = AbstractC6918a0.tvRemoveContact;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C29704a2((LinearLayout) view, checkBox, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29704a2 m147706c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.checkbox_remove_contact_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147705a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137187p;
    }
}
