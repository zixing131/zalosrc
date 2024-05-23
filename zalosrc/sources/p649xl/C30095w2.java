package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.w2 */
/* loaded from: classes3.dex */
public final class C30095w2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139760p;

    /* renamed from: q */
    public final RobotoButton f139761q;

    /* renamed from: r */
    public final LinearLayout f139762r;

    /* renamed from: s */
    public final ProgressBar f139763s;

    /* renamed from: t */
    public final RobotoTextView f139764t;

    private C30095w2(LinearLayout linearLayout, RobotoButton robotoButton, LinearLayout linearLayout2, ProgressBar progressBar, RobotoTextView robotoTextView) {
        this.f139760p = linearLayout;
        this.f139761q = robotoButton;
        this.f139762r = linearLayout2;
        this.f139763s = progressBar;
        this.f139764t = robotoTextView;
    }

    /* renamed from: a */
    public static C30095w2 m148638a(View view) {
        int i11 = AbstractC6918a0.btn_cancel;
        RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
        if (robotoButton != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = AbstractC6918a0.holoCircularProgressBar;
            ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
            if (progressBar != null) {
                i11 = AbstractC6918a0.tv_loading;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C30095w2(linearLayout, robotoButton, linearLayout, progressBar, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30095w2 m148639c(LayoutInflater layoutInflater) {
        return m148640d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30095w2 m148640d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.dialog_handling_cancel, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148638a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139760p;
    }
}
