package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.f0 */
/* loaded from: classes5.dex */
public final class C25004f0 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f119896p;

    /* renamed from: q */
    public final BlinkTextView f119897q;

    private C25004f0(FrameLayout frameLayout, BlinkTextView blinkTextView) {
        this.f119896p = frameLayout;
        this.f119897q = blinkTextView;
    }

    /* renamed from: a */
    public static C25004f0 m129807a(View view) {
        int i11 = AbstractC27409d.txtClear;
        BlinkTextView blinkTextView = (BlinkTextView) AbstractC22716b.m117526a(view, i11);
        if (blinkTextView != null) {
            return new C25004f0((FrameLayout) view, blinkTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25004f0 m129808c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_search_history_clear, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129807a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f119896p;
    }
}
