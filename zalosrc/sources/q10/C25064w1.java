package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p338m2.InterfaceC22715a;
import v00.AbstractC27410e;

/* renamed from: q10.w1 */
/* loaded from: classes5.dex */
public final class C25064w1 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f120400p;

    /* renamed from: q */
    public final FrameLayout f120401q;

    private C25064w1(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f120400p = frameLayout;
        this.f120401q = frameLayout2;
    }

    /* renamed from: a */
    public static C25064w1 m129964a(View view) {
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new C25064w1(frameLayout, frameLayout);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C25064w1 m129965c(LayoutInflater layoutInflater) {
        return m129966d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25064w1 m129966d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_update_app, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129964a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f120400p;
    }
}
