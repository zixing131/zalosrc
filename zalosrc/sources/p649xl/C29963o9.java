package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC7409c0;
import p338m2.InterfaceC22715a;

/* renamed from: xl.o9 */
/* loaded from: classes3.dex */
public final class C29963o9 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138882p;

    /* renamed from: q */
    public final LinearLayout f138883q;

    private C29963o9(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f138882p = linearLayout;
        this.f138883q = linearLayout2;
    }

    /* renamed from: a */
    public static C29963o9 m148325a(View view) {
        if (view != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new C29963o9(linearLayout, linearLayout);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C29963o9 m148326c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.prodcat_product_context_menu_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148325a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138882p;
    }
}
