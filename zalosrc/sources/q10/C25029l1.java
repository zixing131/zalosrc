package q10;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.l1 */
/* loaded from: classes5.dex */
public final class C25029l1 implements InterfaceC22715a {

    /* renamed from: p */
    private final View f120077p;

    /* renamed from: q */
    public final ProgressBar f120078q;

    /* renamed from: r */
    public final SimpleShadowTextView f120079r;

    /* renamed from: s */
    public final ImageView f120080s;

    /* renamed from: t */
    public final SimpleShadowTextView f120081t;

    /* renamed from: u */
    public final SimpleShadowTextView f120082u;

    private C25029l1(View view, ProgressBar progressBar, SimpleShadowTextView simpleShadowTextView, ImageView imageView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3) {
        this.f120077p = view;
        this.f120078q = progressBar;
        this.f120079r = simpleShadowTextView;
        this.f120080s = imageView;
        this.f120081t = simpleShadowTextView2;
        this.f120082u = simpleShadowTextView3;
    }

    /* renamed from: a */
    public static C25029l1 m129877a(View view) {
        int i11 = AbstractC27409d.barLoading;
        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
        if (progressBar != null) {
            i11 = AbstractC27409d.errAction;
            SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView != null) {
                i11 = AbstractC27409d.errIcon;
                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView != null) {
                    i11 = AbstractC27409d.errMessage;
                    SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                    if (simpleShadowTextView2 != null) {
                        i11 = AbstractC27409d.errTitle;
                        SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView3 != null) {
                            return new C25029l1(view, progressBar, simpleShadowTextView, imageView, simpleShadowTextView2, simpleShadowTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f120077p;
    }
}
