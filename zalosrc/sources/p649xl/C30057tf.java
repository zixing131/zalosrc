package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.ProgressBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.tf */
/* loaded from: classes3.dex */
public final class C30057tf implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139512p;

    /* renamed from: q */
    public final RobotoTextView f139513q;

    /* renamed from: r */
    public final RobotoTextView f139514r;

    /* renamed from: s */
    public final RobotoTextView f139515s;

    /* renamed from: t */
    public final RobotoTextView f139516t;

    /* renamed from: u */
    public final ZAppCompatImageView f139517u;

    /* renamed from: v */
    public final LinearLayout f139518v;

    /* renamed from: w */
    public final ProgressBar f139519w;

    /* renamed from: x */
    public final RobotoTextView f139520x;

    private C30057tf(RelativeLayout relativeLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout, ProgressBar progressBar, RobotoTextView robotoTextView5) {
        this.f139512p = relativeLayout;
        this.f139513q = robotoTextView;
        this.f139514r = robotoTextView2;
        this.f139515s = robotoTextView3;
        this.f139516t = robotoTextView4;
        this.f139517u = zAppCompatImageView;
        this.f139518v = linearLayout;
        this.f139519w = progressBar;
        this.f139520x = robotoTextView5;
    }

    /* renamed from: a */
    public static C30057tf m148547a(View view) {
        int i11 = AbstractC6918a0.banner_action_btn;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.banner_desc;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.banner_title;
                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView3 != null) {
                    i11 = AbstractC6918a0.btn_hide;
                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView4 != null) {
                        i11 = AbstractC6918a0.ic_status;
                        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                        if (zAppCompatImageView != null) {
                            i11 = AbstractC6918a0.ll_content;
                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout != null) {
                                i11 = AbstractC6918a0.progress_bar;
                                ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                                if (progressBar != null) {
                                    i11 = AbstractC6918a0.progress_text;
                                    RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView5 != null) {
                                        return new C30057tf((RelativeLayout) view, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4, zAppCompatImageView, linearLayout, progressBar, robotoTextView5);
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

    /* renamed from: c */
    public static C30057tf m148548c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.zcloud_fixed_banner, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148547a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139512p;
    }
}
