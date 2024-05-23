package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.c7 */
/* loaded from: classes3.dex */
public final class C29745c7 implements InterfaceC22715a {

    /* renamed from: p */
    private final View f137403p;

    /* renamed from: q */
    public final RobotoTextView f137404q;

    /* renamed from: r */
    public final RobotoTextView f137405r;

    private C29745c7(View view, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137403p = view;
        this.f137404q = robotoTextView;
        this.f137405r = robotoTextView2;
    }

    /* renamed from: a */
    public static C29745c7 m147807a(View view) {
        int i11 = AbstractC6918a0.snackbar_tv_cta;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.snackbar_tv_msg;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                return new C29745c7(view, robotoTextView, robotoTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29745c7 m147808b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.layout_snackbar_content, viewGroup);
            return m147807a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f137403p;
    }
}
