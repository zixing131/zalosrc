package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ga */
/* loaded from: classes3.dex */
public final class C29820ga implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137882p;

    /* renamed from: q */
    public final MultiStateView f137883q;

    /* renamed from: r */
    public final ZaloZinstantLayout f137884r;

    private C29820ga(LinearLayout linearLayout, MultiStateView multiStateView, ZaloZinstantLayout zaloZinstantLayout) {
        this.f137882p = linearLayout;
        this.f137883q = multiStateView;
        this.f137884r = zaloZinstantLayout;
    }

    /* renamed from: a */
    public static C29820ga m147992a(View view) {
        int i11 = AbstractC6918a0.multi_state_container;
        MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
        if (multiStateView != null) {
            i11 = AbstractC6918a0.zinstant_layout;
            ZaloZinstantLayout zaloZinstantLayout = (ZaloZinstantLayout) AbstractC22716b.m117526a(view, i11);
            if (zaloZinstantLayout != null) {
                return new C29820ga((LinearLayout) view, multiStateView, zaloZinstantLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29820ga m147993c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.qr_wallet_bottom_sheet_zinstant_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147992a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137882p;
    }
}
