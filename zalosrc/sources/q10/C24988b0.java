package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.b0 */
/* loaded from: classes5.dex */
public final class C24988b0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119758p;

    /* renamed from: q */
    public final ImageView f119759q;

    /* renamed from: r */
    public final EllipsizedTextView f119760r;

    private C24988b0(LinearLayout linearLayout, ImageView imageView, EllipsizedTextView ellipsizedTextView) {
        this.f119758p = linearLayout;
        this.f119759q = imageView;
        this.f119760r = ellipsizedTextView;
    }

    /* renamed from: a */
    public static C24988b0 m129760a(View view) {
        int i11 = AbstractC27409d.icoSearch;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC27409d.txtCompletion;
            EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
            if (ellipsizedTextView != null) {
                return new C24988b0((LinearLayout) view, imageView, ellipsizedTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24988b0 m129761c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_search_completion, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129760a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119758p;
    }
}
