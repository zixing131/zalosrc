package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.l5 */
/* loaded from: classes3.dex */
public final class C29905l5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138557p;

    /* renamed from: q */
    public final RobotoTextView f138558q;

    /* renamed from: r */
    public final LinearLayout f138559r;

    /* renamed from: s */
    public final LinearLayout f138560s;

    /* renamed from: t */
    public final RobotoTextView f138561t;

    /* renamed from: u */
    public final RobotoTextView f138562u;

    /* renamed from: v */
    public final RobotoTextView f138563v;

    /* renamed from: w */
    public final RobotoTextView f138564w;

    /* renamed from: x */
    public final LinearLayout f138565x;

    private C29905l5(LinearLayout linearLayout, RobotoTextView robotoTextView, LinearLayout linearLayout2, LinearLayout linearLayout3, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, LinearLayout linearLayout4) {
        this.f138557p = linearLayout;
        this.f138558q = robotoTextView;
        this.f138559r = linearLayout2;
        this.f138560s = linearLayout3;
        this.f138561t = robotoTextView2;
        this.f138562u = robotoTextView3;
        this.f138563v = robotoTextView4;
        this.f138564w = robotoTextView5;
        this.f138565x = linearLayout4;
    }

    /* renamed from: a */
    public static C29905l5 m148195a(View view) {
        int i11 = AbstractC6918a0.btn_search;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.input_option_time_container;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.suggest_list_container;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout2 != null) {
                    i11 = AbstractC6918a0.tv_from;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.tv_lable_from;
                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView3 != null) {
                            i11 = AbstractC6918a0.tv_lable_to;
                            RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView4 != null) {
                                i11 = AbstractC6918a0.tv_to;
                                RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView5 != null) {
                                    LinearLayout linearLayout3 = (LinearLayout) view;
                                    return new C29905l5(linearLayout3, robotoTextView, linearLayout, linearLayout2, robotoTextView2, robotoTextView3, robotoTextView4, robotoTextView5, linearLayout3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29905l5 m148196c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_input_search_time_media_store_page, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148195a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138557p;
    }
}
