package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import p338m2.InterfaceC22715a;

/* renamed from: xl.pa */
/* loaded from: classes3.dex */
public final class C29982pa implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139007p;

    /* renamed from: q */
    public final FrameLayout f139008q;

    private C29982pa(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f139007p = frameLayout;
        this.f139008q = frameLayout2;
    }

    /* renamed from: a */
    public static C29982pa m148368a(View view) {
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new C29982pa(frameLayout, frameLayout);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139007p;
    }
}
