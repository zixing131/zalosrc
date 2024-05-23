package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.g9 */
/* loaded from: classes3.dex */
public final class C29819g9 implements InterfaceC22715a {

    /* renamed from: p */
    private final ScrollView f137877p;

    /* renamed from: q */
    public final RecyclingImageView f137878q;

    /* renamed from: r */
    public final RobotoTextView f137879r;

    /* renamed from: s */
    public final RobotoTextView f137880s;

    /* renamed from: t */
    public final RobotoTextView f137881t;

    private C29819g9(ScrollView scrollView, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.f137877p = scrollView;
        this.f137878q = recyclingImageView;
        this.f137879r = robotoTextView;
        this.f137880s = robotoTextView2;
        this.f137881t = robotoTextView3;
    }

    /* renamed from: a */
    public static C29819g9 m147989a(View view) {
        int i11 = AbstractC6918a0.pc_login_icon;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC6918a0.pc_login_message;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.pc_login_negative_button;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    i11 = AbstractC6918a0.pc_login_positive_button;
                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView3 != null) {
                        return new C29819g9((ScrollView) view, recyclingImageView, robotoTextView, robotoTextView2, robotoTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29819g9 m147990c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.pc_login_confirm_dialog, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147989a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f137877p;
    }
}
