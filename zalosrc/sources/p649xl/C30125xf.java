package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.xf */
/* loaded from: classes3.dex */
public final class C30125xf implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139976p;

    /* renamed from: q */
    public final Button f139977q;

    /* renamed from: r */
    public final RobotoTextView f139978r;

    private C30125xf(LinearLayout linearLayout, Button button, RobotoTextView robotoTextView) {
        this.f139976p = linearLayout;
        this.f139977q = button;
        this.f139978r = robotoTextView;
    }

    /* renamed from: a */
    public static C30125xf m148711a(View view) {
        int i11 = AbstractC6918a0.filter_btn;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.section_title;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C30125xf((LinearLayout) view, button, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139976p;
    }
}
