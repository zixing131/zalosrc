package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.b6 */
/* loaded from: classes3.dex */
public final class C29726b6 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137304p;

    /* renamed from: q */
    public final Button f137305q;

    /* renamed from: r */
    public final RelativeLayout f137306r;

    /* renamed from: s */
    public final RobotoTextView f137307s;

    /* renamed from: t */
    public final RobotoTextView f137308t;

    private C29726b6(RelativeLayout relativeLayout, Button button, RelativeLayout relativeLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137304p = relativeLayout;
        this.f137305q = button;
        this.f137306r = relativeLayout2;
        this.f137307s = robotoTextView;
        this.f137308t = robotoTextView2;
    }

    /* renamed from: a */
    public static C29726b6 m147761a(View view) {
        int i11 = AbstractC6918a0.expandable_icon;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i11 = AbstractC6918a0.subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.title;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    return new C29726b6(relativeLayout, button, relativeLayout, robotoTextView, robotoTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29726b6 m147762c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_move_tab_user_section_row_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147761a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137304p;
    }
}
