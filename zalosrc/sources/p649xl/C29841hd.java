package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.hd */
/* loaded from: classes3.dex */
public final class C29841hd implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138059p;

    /* renamed from: q */
    public final LinearLayout f138060q;

    /* renamed from: r */
    public final RobotoTextView f138061r;

    private C29841hd(LinearLayout linearLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView) {
        this.f138059p = linearLayout;
        this.f138060q = linearLayout2;
        this.f138061r = robotoTextView;
    }

    /* renamed from: a */
    public static C29841hd m148045a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = AbstractC6918a0.tv_story_see_more;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            return new C29841hd(linearLayout, linearLayout, robotoTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138059p;
    }
}
