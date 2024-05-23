package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.w5 */
/* loaded from: classes3.dex */
public final class C30098w5 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139783p;

    /* renamed from: q */
    public final LinearLayout f139784q;

    /* renamed from: r */
    public final AspectRatioImageView f139785r;

    /* renamed from: s */
    public final RecyclerView f139786s;

    private C30098w5(FrameLayout frameLayout, LinearLayout linearLayout, AspectRatioImageView aspectRatioImageView, RecyclerView recyclerView) {
        this.f139783p = frameLayout;
        this.f139784q = linearLayout;
        this.f139785r = aspectRatioImageView;
        this.f139786s = recyclerView;
    }

    /* renamed from: a */
    public static C30098w5 m148646a(View view) {
        int i11 = AbstractC6918a0.empty_container;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.imv_empty;
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
            if (aspectRatioImageView != null) {
                i11 = AbstractC6918a0.recycler_view;
                RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                if (recyclerView != null) {
                    return new C30098w5((FrameLayout) view, linearLayout, aspectRatioImageView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139783p;
    }
}
