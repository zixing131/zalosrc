package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.zing.zalo.shortvideo.p072ui.widget.crop.CropView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.c2 */
/* loaded from: classes5.dex */
public final class C24994c2 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f119816p;

    /* renamed from: q */
    public final ProgressBar f119817q;

    /* renamed from: r */
    public final ImageView f119818r;

    /* renamed from: s */
    public final SimpleShadowTextView f119819s;

    /* renamed from: t */
    public final LinearLayout f119820t;

    /* renamed from: u */
    public final FrameLayout f119821u;

    /* renamed from: v */
    public final FrameLayout f119822v;

    /* renamed from: w */
    public final LinearLayout f119823w;

    /* renamed from: x */
    public final LinearLayout f119824x;

    /* renamed from: y */
    public final CropView f119825y;

    private C24994c2(FrameLayout frameLayout, ProgressBar progressBar, ImageView imageView, SimpleShadowTextView simpleShadowTextView, LinearLayout linearLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, LinearLayout linearLayout2, LinearLayout linearLayout3, CropView cropView) {
        this.f119816p = frameLayout;
        this.f119817q = progressBar;
        this.f119818r = imageView;
        this.f119819s = simpleShadowTextView;
        this.f119820t = linearLayout;
        this.f119821u = frameLayout2;
        this.f119822v = frameLayout3;
        this.f119823w = linearLayout2;
        this.f119824x = linearLayout3;
        this.f119825y = cropView;
    }

    /* renamed from: a */
    public static C24994c2 m129778a(View view) {
        int i11 = AbstractC27409d.barLoading;
        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
        if (progressBar != null) {
            i11 = AbstractC27409d.btnClose;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC27409d.btnDone;
                SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView != null) {
                    i11 = AbstractC27409d.lytContainer;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC27409d.lytCrop;
                        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                        if (frameLayout != null) {
                            FrameLayout frameLayout2 = (FrameLayout) view;
                            i11 = AbstractC27409d.lytFooter;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout2 != null) {
                                i11 = AbstractC27409d.lytHeader;
                                LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout3 != null) {
                                    i11 = AbstractC27409d.vieCrop;
                                    CropView cropView = (CropView) AbstractC22716b.m117526a(view, i11);
                                    if (cropView != null) {
                                        return new C24994c2(frameLayout2, progressBar, imageView, simpleShadowTextView, linearLayout, frameLayout, frameLayout2, linearLayout2, linearLayout3, cropView);
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
    public static C24994c2 m129779c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_page_crop_image, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129778a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f119816p;
    }
}
