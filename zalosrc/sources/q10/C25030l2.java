package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.l2 */
/* loaded from: classes5.dex */
public final class C25030l2 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f120083p;

    /* renamed from: q */
    public final FrameLayout f120084q;

    /* renamed from: r */
    public final View f120085r;

    private C25030l2(FrameLayout frameLayout, FrameLayout frameLayout2, View view) {
        this.f120083p = frameLayout;
        this.f120084q = frameLayout2;
        this.f120085r = view;
    }

    /* renamed from: a */
    public static C25030l2 m129878a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.lytContainer;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.touchOutside))) != null) {
            return new C25030l2((FrameLayout) view, frameLayout, m117526a);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25030l2 m129879c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_popup_base, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129878a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f120083p;
    }
}
