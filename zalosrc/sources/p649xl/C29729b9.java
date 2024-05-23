package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC7409c0;
import p338m2.InterfaceC22715a;

/* renamed from: xl.b9 */
/* loaded from: classes3.dex */
public final class C29729b9 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137328p;

    /* renamed from: q */
    public final LinearLayout f137329q;

    private C29729b9(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f137328p = linearLayout;
        this.f137329q = linearLayout2;
    }

    /* renamed from: a */
    public static C29729b9 m147770a(View view) {
        if (view != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new C29729b9(linearLayout, linearLayout);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C29729b9 m147771c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.notification_setting_bottom_sheet_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147770a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137328p;
    }
}
