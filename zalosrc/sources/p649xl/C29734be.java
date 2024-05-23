package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.be */
/* loaded from: classes3.dex */
public final class C29734be implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137355p;

    /* renamed from: q */
    public final ZAppCompatImageView f137356q;

    /* renamed from: r */
    public final ZAppCompatImageView f137357r;

    /* renamed from: s */
    public final RobotoTextView f137358s;

    private C29734be(LinearLayout linearLayout, ZAppCompatImageView zAppCompatImageView, ZAppCompatImageView zAppCompatImageView2, RobotoTextView robotoTextView) {
        this.f137355p = linearLayout;
        this.f137356q = zAppCompatImageView;
        this.f137357r = zAppCompatImageView2;
        this.f137358s = robotoTextView;
    }

    /* renamed from: a */
    public static C29734be m147785a(View view) {
        int i11 = AbstractC6918a0.icLeading;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.icTrailing;
            ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView2 != null) {
                i11 = AbstractC6918a0.tvTitle;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C29734be((LinearLayout) view, zAppCompatImageView, zAppCompatImageView2, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29734be m147786c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.type_protect_code_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147785a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137355p;
    }
}
