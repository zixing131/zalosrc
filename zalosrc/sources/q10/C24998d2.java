package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.photoview.PhotoView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.d2 */
/* loaded from: classes5.dex */
public final class C24998d2 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f119855p;

    /* renamed from: q */
    public final ImageView f119856q;

    /* renamed from: r */
    public final LinearLayout f119857r;

    /* renamed from: s */
    public final FrameLayout f119858s;

    /* renamed from: t */
    public final PhotoView f119859t;

    private C24998d2(FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, FrameLayout frameLayout2, PhotoView photoView) {
        this.f119855p = frameLayout;
        this.f119856q = imageView;
        this.f119857r = linearLayout;
        this.f119858s = frameLayout2;
        this.f119859t = photoView;
    }

    /* renamed from: a */
    public static C24998d2 m129790a(View view) {
        int i11 = AbstractC27409d.btnClose;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC27409d.lytHeader;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i11 = AbstractC27409d.rivImage;
                PhotoView photoView = (PhotoView) AbstractC22716b.m117526a(view, i11);
                if (photoView != null) {
                    return new C24998d2(frameLayout, imageView, linearLayout, frameLayout, photoView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24998d2 m129791c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_page_image, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129790a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f119855p;
    }
}
