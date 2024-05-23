package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ProgressBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.y2 */
/* loaded from: classes3.dex */
public final class C30129y2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139991p;

    /* renamed from: q */
    public final Button f139992q;

    /* renamed from: r */
    public final ProgressBar f139993r;

    /* renamed from: s */
    public final AppCompatImageView f139994s;

    /* renamed from: t */
    public final RobotoTextView f139995t;

    private C30129y2(LinearLayout linearLayout, Button button, ProgressBar progressBar, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView) {
        this.f139991p = linearLayout;
        this.f139992q = button;
        this.f139993r = progressBar;
        this.f139994s = appCompatImageView;
        this.f139995t = robotoTextView;
    }

    /* renamed from: a */
    public static C30129y2 m148719a(View view) {
        int i11 = AbstractC6918a0.action_button;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.progress_bar;
            ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
            if (progressBar != null) {
                i11 = AbstractC6918a0.state_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (appCompatImageView != null) {
                    i11 = AbstractC6918a0.state_text_view;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        return new C30129y2((LinearLayout) view, button, progressBar, appCompatImageView, robotoTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30129y2 m148720c(LayoutInflater layoutInflater) {
        return m148721d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30129y2 m148721d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.download_to_forward, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148719a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139991p;
    }
}
