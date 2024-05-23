package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoButton;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.z8 */
/* loaded from: classes3.dex */
public final class C30152z8 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140120p;

    /* renamed from: q */
    public final RobotoButton f140121q;

    /* renamed from: r */
    public final RobotoButton f140122r;

    private C30152z8(LinearLayout linearLayout, RobotoButton robotoButton, RobotoButton robotoButton2) {
        this.f140120p = linearLayout;
        this.f140121q = robotoButton;
        this.f140122r = robotoButton2;
    }

    /* renamed from: a */
    public static C30152z8 m148776a(View view) {
        int i11 = AbstractC6918a0.btIgnore;
        RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
        if (robotoButton != null) {
            i11 = AbstractC6918a0.btResolve;
            RobotoButton robotoButton2 = (RobotoButton) AbstractC22716b.m117526a(view, i11);
            if (robotoButton2 != null) {
                return new C30152z8((LinearLayout) view, robotoButton, robotoButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30152z8 m148777c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.no_webview_installed_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148776a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140120p;
    }
}
