package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.dd */
/* loaded from: classes3.dex */
public final class C29769dd implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137573p;

    /* renamed from: q */
    public final C29904l4 f137574q;

    /* renamed from: r */
    public final RobotoTextView f137575r;

    /* renamed from: s */
    public final LinearLayout f137576s;

    private C29769dd(LinearLayout linearLayout, C29904l4 c29904l4, RobotoTextView robotoTextView, LinearLayout linearLayout2) {
        this.f137573p = linearLayout;
        this.f137574q = c29904l4;
        this.f137575r = robotoTextView;
        this.f137576s = linearLayout2;
    }

    /* renamed from: a */
    public static C29769dd m147865a(View view) {
        int i11 = AbstractC6918a0.loading_uploading;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            C29904l4 m148193a = C29904l4.m148193a(m117526a);
            int i12 = AbstractC6918a0.tv_uploading_status;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i12);
            if (robotoTextView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new C29769dd(linearLayout, m148193a, robotoTextView, linearLayout);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137573p;
    }
}
