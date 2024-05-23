package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.CustomEditText;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.n6 */
/* loaded from: classes3.dex */
public final class C29942n6 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138762p;

    /* renamed from: q */
    public final RelativeLayout f138763q;

    /* renamed from: r */
    public final RobotoTextView f138764r;

    /* renamed from: s */
    public final CustomEditText f138765s;

    /* renamed from: t */
    public final View f138766t;

    private C29942n6(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RobotoTextView robotoTextView, CustomEditText customEditText, View view) {
        this.f138762p = relativeLayout;
        this.f138763q = relativeLayout2;
        this.f138764r = robotoTextView;
        this.f138765s = customEditText;
        this.f138766t = view;
    }

    /* renamed from: a */
    public static C29942n6 m148275a(View view) {
        View m117526a;
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.desc;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.input;
            CustomEditText customEditText = (CustomEditText) AbstractC22716b.m117526a(view, i11);
            if (customEditText != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.line_bottom))) != null) {
                return new C29942n6(relativeLayout, relativeLayout, robotoTextView, customEditText, m117526a);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29942n6 m148276c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_profile_album_row_edit_title, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148275a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138762p;
    }
}
