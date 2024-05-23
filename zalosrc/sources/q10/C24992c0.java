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

/* renamed from: q10.c0 */
/* loaded from: classes5.dex */
public final class C24992c0 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f119806p;

    /* renamed from: q */
    public final SimpleShadowTextView f119807q;

    private C24992c0(FrameLayout frameLayout, SimpleShadowTextView simpleShadowTextView) {
        this.f119806p = frameLayout;
        this.f119807q = simpleShadowTextView;
    }

    /* renamed from: a */
    public static C24992c0 m129772a(View view) {
        int i11 = AbstractC27409d.tvMsg;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            return new C24992c0((FrameLayout) view, simpleShadowTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24992c0 m129773c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_search_empty_video, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129772a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f119806p;
    }
}
