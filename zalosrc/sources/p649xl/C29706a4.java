package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.a4 */
/* loaded from: classes3.dex */
public final class C29706a4 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137196p;

    /* renamed from: q */
    public final FrameLayout f137197q;

    /* renamed from: r */
    public final RoundedImageView f137198r;

    /* renamed from: s */
    public final ProgressBar f137199s;

    /* renamed from: t */
    public final RobotoTextView f137200t;

    /* renamed from: u */
    public final ZAppCompatImageView f137201u;

    private C29706a4(FrameLayout frameLayout, FrameLayout frameLayout2, RoundedImageView roundedImageView, ProgressBar progressBar, RobotoTextView robotoTextView, ZAppCompatImageView zAppCompatImageView) {
        this.f137196p = frameLayout;
        this.f137197q = frameLayout2;
        this.f137198r = roundedImageView;
        this.f137199s = progressBar;
        this.f137200t = robotoTextView;
        this.f137201u = zAppCompatImageView;
    }

    /* renamed from: a */
    public static C29706a4 m147711a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = AbstractC6918a0.image_view;
        RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
        if (roundedImageView != null) {
            i11 = AbstractC6918a0.loading_view;
            ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
            if (progressBar != null) {
                i11 = AbstractC6918a0.retry_view;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.selected_filter;
                    ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                    if (zAppCompatImageView != null) {
                        return new C29706a4(frameLayout, frameLayout, roundedImageView, progressBar, robotoTextView, zAppCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29706a4 m147712c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.filter_item_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147711a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137196p;
    }
}
