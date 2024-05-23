package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.zdesign.component.ProgressBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.p9 */
/* loaded from: classes3.dex */
public final class C29981p9 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139000p;

    /* renamed from: q */
    public final FrameLayout f139001q;

    /* renamed from: r */
    public final RoundCornerImageView f139002r;

    /* renamed from: s */
    public final FrameLayout f139003s;

    /* renamed from: t */
    public final ProgressBar f139004t;

    /* renamed from: u */
    public final ZAppCompatImageView f139005u;

    /* renamed from: v */
    public final ZAppCompatImageView f139006v;

    private C29981p9(FrameLayout frameLayout, FrameLayout frameLayout2, RoundCornerImageView roundCornerImageView, FrameLayout frameLayout3, ProgressBar progressBar, ZAppCompatImageView zAppCompatImageView, ZAppCompatImageView zAppCompatImageView2) {
        this.f139000p = frameLayout;
        this.f139001q = frameLayout2;
        this.f139002r = roundCornerImageView;
        this.f139003s = frameLayout3;
        this.f139004t = progressBar;
        this.f139005u = zAppCompatImageView;
        this.f139006v = zAppCompatImageView2;
    }

    /* renamed from: a */
    public static C29981p9 m148365a(View view) {
        int i11 = AbstractC6918a0.product_photo_cover_label;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null) {
            i11 = AbstractC6918a0.product_photo_imv;
            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) AbstractC22716b.m117526a(view, i11);
            if (roundCornerImageView != null) {
                i11 = AbstractC6918a0.product_photo_overlay;
                FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout2 != null) {
                    i11 = AbstractC6918a0.product_photo_progress_bar;
                    ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                    if (progressBar != null) {
                        i11 = AbstractC6918a0.product_photo_remove_icon;
                        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                        if (zAppCompatImageView != null) {
                            i11 = AbstractC6918a0.product_photo_upload_error_icn;
                            ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                            if (zAppCompatImageView2 != null) {
                                return new C29981p9((FrameLayout) view, frameLayout, roundCornerImageView, frameLayout2, progressBar, zAppCompatImageView, zAppCompatImageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29981p9 m148366c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.prodcat_product_creating_photo_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148365a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139000p;
    }
}
