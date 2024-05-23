package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.h8 */
/* loaded from: classes3.dex */
public final class C29836h8 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138014p;

    /* renamed from: q */
    public final FrameLayout f138015q;

    /* renamed from: r */
    public final C29854i8 f138016r;

    private C29836h8(RelativeLayout relativeLayout, FrameLayout frameLayout, C29854i8 c29854i8) {
        this.f138014p = relativeLayout;
        this.f138015q = frameLayout;
        this.f138016r = c29854i8;
    }

    /* renamed from: a */
    public static C29836h8 m148032a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.web_base_view_container;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.web_view_bts_header))) != null) {
            return new C29836h8((RelativeLayout) view, frameLayout, C29854i8.m148074a(m117526a));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29836h8 m148033c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.miniapp_bottom_sheet_webview, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148032a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138014p;
    }
}
