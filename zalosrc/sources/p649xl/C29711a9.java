package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.a9 */
/* loaded from: classes3.dex */
public final class C29711a9 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137227p;

    /* renamed from: q */
    public final AppCompatImageView f137228q;

    /* renamed from: r */
    public final RobotoTextView f137229r;

    /* renamed from: s */
    public final RobotoTextView f137230s;

    private C29711a9(LinearLayout linearLayout, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137227p = linearLayout;
        this.f137228q = appCompatImageView;
        this.f137229r = robotoTextView;
        this.f137230s = robotoTextView2;
    }

    /* renamed from: a */
    public static C29711a9 m147725a(View view) {
        int i11 = AbstractC6918a0.btn_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageView != null) {
            i11 = AbstractC6918a0.description;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.txt_action_name;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    return new C29711a9((LinearLayout) view, appCompatImageView, robotoTextView, robotoTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29711a9 m147726c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.notification_restrict_banner_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147725a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137227p;
    }
}
