package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.je */
/* loaded from: classes3.dex */
public final class C29878je implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138348p;

    /* renamed from: q */
    public final RobotoTextView f138349q;

    private C29878je(LinearLayout linearLayout, RobotoTextView robotoTextView) {
        this.f138348p = linearLayout;
        this.f138349q = robotoTextView;
    }

    /* renamed from: a */
    public static C29878je m148136a(View view) {
        int i11 = AbstractC6918a0.tvTitleWarning;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            return new C29878je((LinearLayout) view, robotoTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138348p;
    }
}
