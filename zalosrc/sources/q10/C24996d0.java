package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.d0 */
/* loaded from: classes5.dex */
public final class C24996d0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119840p;

    /* renamed from: q */
    public final ImageView f119841q;

    /* renamed from: r */
    public final EllipsizedTextView f119842r;

    /* renamed from: s */
    public final SimpleShadowTextView f119843s;

    private C24996d0(LinearLayout linearLayout, ImageView imageView, EllipsizedTextView ellipsizedTextView, SimpleShadowTextView simpleShadowTextView) {
        this.f119840p = linearLayout;
        this.f119841q = imageView;
        this.f119842r = ellipsizedTextView;
        this.f119843s = simpleShadowTextView;
    }

    /* renamed from: a */
    public static C24996d0 m129784a(View view) {
        int i11 = AbstractC27409d.ivHashtag;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC27409d.tvHashtag;
            EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
            if (ellipsizedTextView != null) {
                i11 = AbstractC27409d.tvViewCount;
                SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView != null) {
                    return new C24996d0((LinearLayout) view, imageView, ellipsizedTextView, simpleShadowTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24996d0 m129785c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_search_hashtag, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129784a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119840p;
    }
}
