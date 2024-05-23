package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC7409c0;
import p338m2.InterfaceC22715a;

/* renamed from: xl.t2 */
/* loaded from: classes3.dex */
public final class C30044t2 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139371p;

    /* renamed from: q */
    public final FrameLayout f139372q;

    private C30044t2(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f139371p = frameLayout;
        this.f139372q = frameLayout2;
    }

    /* renamed from: a */
    public static C30044t2 m148511a(View view) {
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new C30044t2(frameLayout, frameLayout);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C30044t2 m148512c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.default_bottom_sheet_space_divider_row_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148511a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139371p;
    }
}
