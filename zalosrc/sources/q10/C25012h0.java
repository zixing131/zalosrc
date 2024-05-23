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

/* renamed from: q10.h0 */
/* loaded from: classes5.dex */
public final class C25012h0 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f119934p;

    /* renamed from: q */
    public final SimpleShadowTextView f119935q;

    private C25012h0(FrameLayout frameLayout, SimpleShadowTextView simpleShadowTextView) {
        this.f119934p = frameLayout;
        this.f119935q = simpleShadowTextView;
    }

    /* renamed from: a */
    public static C25012h0 m129831a(View view) {
        int i11 = AbstractC27409d.tvTitle;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            return new C25012h0((FrameLayout) view, simpleShadowTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25012h0 m129832c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_search_section_title, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129831a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f119934p;
    }
}
