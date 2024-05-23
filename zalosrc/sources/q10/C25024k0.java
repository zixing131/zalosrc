package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.k0 */
/* loaded from: classes5.dex */
public final class C25024k0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f120018p;

    /* renamed from: q */
    public final ImageView f120019q;

    /* renamed from: r */
    public final ImageView f120020r;

    /* renamed from: s */
    public final RoundedImageView f120021s;

    /* renamed from: t */
    public final EllipsizedTextView f120022t;

    /* renamed from: u */
    public final SimpleShadowTextView f120023u;

    private C25024k0(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, RoundedImageView roundedImageView, EllipsizedTextView ellipsizedTextView, SimpleShadowTextView simpleShadowTextView) {
        this.f120018p = linearLayout;
        this.f120019q = imageView;
        this.f120020r = imageView2;
        this.f120021s = roundedImageView;
        this.f120022t = ellipsizedTextView;
        this.f120023u = simpleShadowTextView;
    }

    /* renamed from: a */
    public static C25024k0 m129865a(View view) {
        int i11 = AbstractC27409d.btnPlay;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC27409d.icoStatus;
            ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView2 != null) {
                i11 = AbstractC27409d.ivCover;
                RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
                if (roundedImageView != null) {
                    i11 = AbstractC27409d.tvDes;
                    EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                    if (ellipsizedTextView != null) {
                        i11 = AbstractC27409d.tvSelect;
                        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView != null) {
                            return new C25024k0((LinearLayout) view, imageView, imageView2, roundedImageView, ellipsizedTextView, simpleShadowTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25024k0 m129866c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_search_video_channel, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129865a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f120018p;
    }
}
