package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.d9 */
/* loaded from: classes3.dex */
public final class C29765d9 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137523p;

    /* renamed from: q */
    public final Button f137524q;

    /* renamed from: r */
    public final Button f137525r;

    /* renamed from: s */
    public final RobotoTextView f137526s;

    /* renamed from: t */
    public final ZAppCompatImageView f137527t;

    /* renamed from: u */
    public final LinearLayout f137528u;

    /* renamed from: v */
    public final LinearLayout f137529v;

    /* renamed from: w */
    public final RobotoTextView f137530w;

    private C29765d9(LinearLayout linearLayout, Button button, Button button2, RobotoTextView robotoTextView, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout2, LinearLayout linearLayout3, RobotoTextView robotoTextView2) {
        this.f137523p = linearLayout;
        this.f137524q = button;
        this.f137525r = button2;
        this.f137526s = robotoTextView;
        this.f137527t = zAppCompatImageView;
        this.f137528u = linearLayout2;
        this.f137529v = linearLayout3;
        this.f137530w = robotoTextView2;
    }

    /* renamed from: a */
    public static C29765d9 m147855a(View view) {
        int i11 = AbstractC6918a0.btn_got_it;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_learn_more;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.desc_item2;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.imgIntro;
                    ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                    if (zAppCompatImageView != null) {
                        i11 = AbstractC6918a0.layout_button;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            LinearLayout linearLayout2 = (LinearLayout) view;
                            i11 = AbstractC6918a0.tvTitleIntro;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                return new C29765d9(linearLayout2, button, button2, robotoTextView, zAppCompatImageView, linearLayout, linearLayout2, robotoTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29765d9 m147856c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.onboarding_community_upgraded_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147855a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137523p;
    }
}
