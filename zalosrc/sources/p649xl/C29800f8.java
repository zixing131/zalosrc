package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.MiniAppZinstantLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.f8 */
/* loaded from: classes3.dex */
public final class C29800f8 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137748p;

    /* renamed from: q */
    public final RelativeLayout f137749q;

    /* renamed from: r */
    public final LinearLayout f137750r;

    /* renamed from: s */
    public final ZAppCompatImageView f137751s;

    /* renamed from: t */
    public final RobotoTextView f137752t;

    /* renamed from: u */
    public final MiniAppZinstantLayout f137753u;

    private C29800f8(LinearLayout linearLayout, RelativeLayout relativeLayout, LinearLayout linearLayout2, ZAppCompatImageView zAppCompatImageView, RobotoTextView robotoTextView, MiniAppZinstantLayout miniAppZinstantLayout) {
        this.f137748p = linearLayout;
        this.f137749q = relativeLayout;
        this.f137750r = linearLayout2;
        this.f137751s = zAppCompatImageView;
        this.f137752t = robotoTextView;
        this.f137753u = miniAppZinstantLayout;
    }

    /* renamed from: a */
    public static C29800f8 m147945a(View view) {
        int i11 = AbstractC6918a0.contentView;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.header_view;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.ma_menu_close;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    i11 = AbstractC6918a0.tvTitle;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.zInstant;
                        MiniAppZinstantLayout miniAppZinstantLayout = (MiniAppZinstantLayout) AbstractC22716b.m117526a(view, i11);
                        if (miniAppZinstantLayout != null) {
                            return new C29800f8((LinearLayout) view, relativeLayout, linearLayout, zAppCompatImageView, robotoTextView, miniAppZinstantLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29800f8 m147946c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.mini_app_zinstant_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147945a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137748p;
    }
}
