package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.g5 */
/* loaded from: classes3.dex */
public final class C29815g5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137851p;

    /* renamed from: q */
    public final RobotoButton f137852q;

    /* renamed from: r */
    public final RobotoTextView f137853r;

    /* renamed from: s */
    public final AppCompatImageView f137854s;

    private C29815g5(LinearLayout linearLayout, RobotoButton robotoButton, RobotoTextView robotoTextView, AppCompatImageView appCompatImageView) {
        this.f137851p = linearLayout;
        this.f137852q = robotoButton;
        this.f137853r = robotoTextView;
        this.f137854s = appCompatImageView;
    }

    /* renamed from: a */
    public static C29815g5 m147981a(View view) {
        int i11 = AbstractC6918a0.btn_refresh;
        RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
        if (robotoButton != null) {
            i11 = AbstractC6918a0.error_title;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.image_error;
                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (appCompatImageView != null) {
                    return new C29815g5((LinearLayout) view, robotoButton, robotoTextView, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137851p;
    }
}
