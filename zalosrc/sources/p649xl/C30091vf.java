package p649xl;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ProgressBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.vf */
/* loaded from: classes3.dex */
public final class C30091vf implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139733p;

    /* renamed from: q */
    public final Button f139734q;

    /* renamed from: r */
    public final RobotoTextView f139735r;

    /* renamed from: s */
    public final AppCompatImageView f139736s;

    /* renamed from: t */
    public final RobotoTextView f139737t;

    /* renamed from: u */
    public final ProgressBar f139738u;

    /* renamed from: v */
    public final RobotoTextView f139739v;

    /* renamed from: w */
    public final RobotoTextView f139740w;

    /* renamed from: x */
    public final RobotoTextView f139741x;

    private C30091vf(RelativeLayout relativeLayout, Button button, RobotoTextView robotoTextView, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView2, ProgressBar progressBar, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5) {
        this.f139733p = relativeLayout;
        this.f139734q = button;
        this.f139735r = robotoTextView;
        this.f139736s = appCompatImageView;
        this.f139737t = robotoTextView2;
        this.f139738u = progressBar;
        this.f139739v = robotoTextView3;
        this.f139740w = robotoTextView4;
        this.f139741x = robotoTextView5;
    }

    /* renamed from: a */
    public static C30091vf m148631a(View view) {
        int i11 = AbstractC6918a0.action_btn;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.banner_desc;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.banner_ic;
                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (appCompatImageView != null) {
                    i11 = AbstractC6918a0.banner_title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.progress_bar;
                        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                        if (progressBar != null) {
                            i11 = AbstractC6918a0.tv_cta;
                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView3 != null) {
                                i11 = AbstractC6918a0.tv_downloading;
                                RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView4 != null) {
                                    i11 = AbstractC6918a0.tv_progress;
                                    RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView5 != null) {
                                        return new C30091vf((RelativeLayout) view, button, robotoTextView, appCompatImageView, robotoTextView2, progressBar, robotoTextView3, robotoTextView4, robotoTextView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139733p;
    }
}
