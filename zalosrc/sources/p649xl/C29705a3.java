package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.a3 */
/* loaded from: classes3.dex */
public final class C29705a3 implements InterfaceC22715a {

    /* renamed from: p */
    private final ScrollView f137190p;

    /* renamed from: q */
    public final Button f137191q;

    /* renamed from: r */
    public final RobotoTextView f137192r;

    /* renamed from: s */
    public final ZAppCompatImageView f137193s;

    /* renamed from: t */
    public final ScrollView f137194t;

    /* renamed from: u */
    public final RobotoTextView f137195u;

    private C29705a3(ScrollView scrollView, Button button, RobotoTextView robotoTextView, ZAppCompatImageView zAppCompatImageView, ScrollView scrollView2, RobotoTextView robotoTextView2) {
        this.f137190p = scrollView;
        this.f137191q = button;
        this.f137192r = robotoTextView;
        this.f137193s = zAppCompatImageView;
        this.f137194t = scrollView2;
        this.f137195u = robotoTextView2;
    }

    /* renamed from: a */
    public static C29705a3 m147708a(View view) {
        int i11 = AbstractC6918a0.confirmButton;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.e2ee_default_description;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.imgIntro;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    ScrollView scrollView = (ScrollView) view;
                    i11 = AbstractC6918a0.tvTitleIntro;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        return new C29705a3(scrollView, button, robotoTextView, zAppCompatImageView, scrollView, robotoTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29705a3 m147709c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.e2ee_intro, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147708a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f137190p;
    }
}
