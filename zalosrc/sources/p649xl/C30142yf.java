package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.ProgressBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.yf */
/* loaded from: classes3.dex */
public final class C30142yf implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140056p;

    /* renamed from: q */
    public final ProgressBar f140057q;

    /* renamed from: r */
    public final RobotoTextView f140058r;

    /* renamed from: s */
    public final RobotoTextView f140059s;

    private C30142yf(LinearLayout linearLayout, ProgressBar progressBar, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f140056p = linearLayout;
        this.f140057q = progressBar;
        this.f140058r = robotoTextView;
        this.f140059s = robotoTextView2;
    }

    /* renamed from: a */
    public static C30142yf m148753a(View view) {
        int i11 = AbstractC6918a0.progressBarMigrate;
        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
        if (progressBar != null) {
            i11 = AbstractC6918a0.tvProgress;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.tvTitle;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    return new C30142yf((LinearLayout) view, progressBar, robotoTextView, robotoTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140056p;
    }
}
