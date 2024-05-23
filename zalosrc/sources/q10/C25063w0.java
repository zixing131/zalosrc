package q10;

import android.view.View;
import android.widget.ImageView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ShimmerVideoItem;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.w0 */
/* loaded from: classes5.dex */
public final class C25063w0 implements InterfaceC22715a {

    /* renamed from: p */
    private final ShimmerVideoItem f120397p;

    /* renamed from: q */
    public final View f120398q;

    /* renamed from: r */
    public final ImageView f120399r;

    private C25063w0(ShimmerVideoItem shimmerVideoItem, View view, ImageView imageView) {
        this.f120397p = shimmerVideoItem;
        this.f120398q = view;
        this.f120399r = imageView;
    }

    /* renamed from: a */
    public static C25063w0 m129962a(View view) {
        int i11 = AbstractC27409d.vieOverlay;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            i11 = AbstractC27409d.viePlaceholder;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                return new C25063w0((ShimmerVideoItem) view, m117526a, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public ShimmerVideoItem getRoot() {
        return this.f120397p;
    }
}
