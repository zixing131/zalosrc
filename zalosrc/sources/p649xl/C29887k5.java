package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import p338m2.InterfaceC22715a;

/* renamed from: xl.k5 */
/* loaded from: classes3.dex */
public final class C29887k5 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138462p;

    /* renamed from: q */
    public final FrameLayout f138463q;

    private C29887k5(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f138462p = frameLayout;
        this.f138463q = frameLayout2;
    }

    /* renamed from: a */
    public static C29887k5 m148157a(View view) {
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new C29887k5(frameLayout, frameLayout);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138462p;
    }
}
