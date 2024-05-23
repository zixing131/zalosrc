package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.d1 */
/* loaded from: classes3.dex */
public final class C29757d1 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137469p;

    /* renamed from: q */
    public final MultiStateView f137470q;

    /* renamed from: r */
    public final ZaloZinstantLayout f137471r;

    private C29757d1(FrameLayout frameLayout, MultiStateView multiStateView, ZaloZinstantLayout zaloZinstantLayout) {
        this.f137469p = frameLayout;
        this.f137470q = multiStateView;
        this.f137471r = zaloZinstantLayout;
    }

    /* renamed from: a */
    public static C29757d1 m147834a(View view) {
        int i11 = AbstractC6918a0.multi_state_container;
        MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
        if (multiStateView != null) {
            i11 = AbstractC6918a0.zinstant_layout;
            ZaloZinstantLayout zaloZinstantLayout = (ZaloZinstantLayout) AbstractC22716b.m117526a(view, i11);
            if (zaloZinstantLayout != null) {
                return new C29757d1((FrameLayout) view, multiStateView, zaloZinstantLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29757d1 m147835c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_suggest_open_app, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147834a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137469p;
    }
}
