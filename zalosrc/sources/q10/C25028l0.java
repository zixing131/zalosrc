package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.l0 */
/* loaded from: classes5.dex */
public final class C25028l0 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f120075p;

    /* renamed from: q */
    public final SimpleShadowTextView f120076q;

    private C25028l0(FrameLayout frameLayout, SimpleShadowTextView simpleShadowTextView) {
        this.f120075p = frameLayout;
        this.f120076q = simpleShadowTextView;
    }

    /* renamed from: a */
    public static C25028l0 m129874a(View view) {
        int i11 = AbstractC27409d.tvMore;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            return new C25028l0((FrameLayout) view, simpleShadowTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25028l0 m129875c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_search_viewmore, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129874a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f120075p;
    }
}
