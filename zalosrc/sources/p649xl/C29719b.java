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

/* renamed from: xl.b */
/* loaded from: classes3.dex */
public final class C29719b implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137276p;

    /* renamed from: q */
    public final ZAppCompatImageView f137277q;

    /* renamed from: r */
    public final RobotoTextView f137278r;

    private C29719b(LinearLayout linearLayout, ZAppCompatImageView zAppCompatImageView, RobotoTextView robotoTextView) {
        this.f137276p = linearLayout;
        this.f137277q = zAppCompatImageView;
        this.f137278r = robotoTextView;
    }

    /* renamed from: a */
    public static C29719b m147742a(View view) {
        int i11 = AbstractC6918a0.img_action;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.tv_action;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C29719b((LinearLayout) view, zAppCompatImageView, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29719b m147743c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.action_device_row, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147742a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137276p;
    }
}
