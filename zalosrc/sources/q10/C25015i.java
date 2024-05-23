package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.i */
/* loaded from: classes5.dex */
public final class C25015i implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119952p;

    /* renamed from: q */
    public final SimpleShadowTextView f119953q;

    /* renamed from: r */
    public final SimpleShadowTextView f119954r;

    private C25015i(LinearLayout linearLayout, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2) {
        this.f119952p = linearLayout;
        this.f119953q = simpleShadowTextView;
        this.f119954r = simpleShadowTextView2;
    }

    /* renamed from: a */
    public static C25015i m129841a(View view) {
        int i11 = AbstractC27409d.tvNumStats;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            i11 = AbstractC27409d.tvTitleStats;
            SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView2 != null) {
                return new C25015i((LinearLayout) view, simpleShadowTextView, simpleShadowTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25015i m129842c(LayoutInflater layoutInflater) {
        return m129843d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25015i m129843d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_channel_view_stats, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129841a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119952p;
    }
}
