package p649xl;

import android.view.View;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.n3 */
/* loaded from: classes3.dex */
public final class C29939n3 implements InterfaceC22715a {

    /* renamed from: p */
    private final View f138753p;

    /* renamed from: q */
    public final RobotoTextView f138754q;

    private C29939n3(View view, RobotoTextView robotoTextView) {
        this.f138753p = view;
        this.f138754q = robotoTextView;
    }

    /* renamed from: a */
    public static C29939n3 m148269a(View view) {
        int i11 = AbstractC6918a0.bubble_date;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            return new C29939n3(view, robotoTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f138753p;
    }
}
