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

/* renamed from: xl.m6 */
/* loaded from: classes3.dex */
public final class C29924m6 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138660p;

    /* renamed from: q */
    public final RelativeLayout f138661q;

    /* renamed from: r */
    public final RobotoTextView f138662r;

    /* renamed from: s */
    public final CustomEditText f138663s;

    private C29924m6(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RobotoTextView robotoTextView, CustomEditText customEditText) {
        this.f138660p = relativeLayout;
        this.f138661q = relativeLayout2;
        this.f138662r = robotoTextView;
        this.f138663s = customEditText;
    }

    /* renamed from: a */
    public static C29924m6 m148239a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.desc;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.input;
            CustomEditText customEditText = (CustomEditText) AbstractC22716b.m117526a(view, i11);
            if (customEditText != null) {
                return new C29924m6(relativeLayout, relativeLayout, robotoTextView, customEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29924m6 m148240c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_profile_album_row_edit_desc, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148239a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138660p;
    }
}
