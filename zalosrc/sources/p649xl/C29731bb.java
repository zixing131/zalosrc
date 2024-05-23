package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.SecurityCheckupItemView;
import com.zing.zalo.zinstant.ZaloZinstantRootLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.bb */
/* loaded from: classes3.dex */
public final class C29731bb implements InterfaceC22715a {

    /* renamed from: p */
    private final SecurityCheckupItemView f137347p;

    /* renamed from: q */
    public final ZaloZinstantRootLayout f137348q;

    private C29731bb(SecurityCheckupItemView securityCheckupItemView, ZaloZinstantRootLayout zaloZinstantRootLayout) {
        this.f137347p = securityCheckupItemView;
        this.f137348q = zaloZinstantRootLayout;
    }

    /* renamed from: a */
    public static C29731bb m147776a(View view) {
        int i11 = AbstractC6918a0.zinstant_layout;
        ZaloZinstantRootLayout zaloZinstantRootLayout = (ZaloZinstantRootLayout) AbstractC22716b.m117526a(view, i11);
        if (zaloZinstantRootLayout != null) {
            return new C29731bb((SecurityCheckupItemView) view, zaloZinstantRootLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29731bb m147777c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.security_checkup_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147776a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SecurityCheckupItemView getRoot() {
        return this.f137347p;
    }
}
