package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC7409c0;
import p338m2.InterfaceC22715a;

/* renamed from: xl.d6 */
/* loaded from: classes3.dex */
public final class C29762d6 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137493p;

    /* renamed from: q */
    public final LinearLayout f137494q;

    private C29762d6(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f137493p = linearLayout;
        this.f137494q = linearLayout2;
    }

    /* renamed from: a */
    public static C29762d6 m147847a(View view) {
        if (view != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new C29762d6(linearLayout, linearLayout);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C29762d6 m147848c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_multi_selection_bottom_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147847a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137493p;
    }
}
