package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.j1 */
/* loaded from: classes3.dex */
public final class C29865j1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138225p;

    /* renamed from: q */
    public final LinearLayout f138226q;

    /* renamed from: r */
    public final LinearLayout f138227r;

    /* renamed from: s */
    public final LinearLayout f138228s;

    /* renamed from: t */
    public final LinearLayout f138229t;

    /* renamed from: u */
    public final RobotoTextView f138230u;

    /* renamed from: v */
    public final RobotoTextView f138231v;

    /* renamed from: w */
    public final RobotoTextView f138232w;

    /* renamed from: x */
    public final Button f138233x;

    /* renamed from: y */
    public final LinearLayout f138234y;

    private C29865j1(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, Button button, LinearLayout linearLayout6) {
        this.f138225p = linearLayout;
        this.f138226q = linearLayout2;
        this.f138227r = linearLayout3;
        this.f138228s = linearLayout4;
        this.f138229t = linearLayout5;
        this.f138230u = robotoTextView;
        this.f138231v = robotoTextView2;
        this.f138232w = robotoTextView3;
        this.f138233x = button;
        this.f138234y = linearLayout6;
    }

    /* renamed from: a */
    public static C29865j1 m148098a(View view) {
        int i11 = AbstractC6918a0.ba_detail_ll_end_date;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.ba_detail_ll_label_container;
            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout2 != null) {
                i11 = AbstractC6918a0.ba_detail_ll_package_info;
                LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout3 != null) {
                    i11 = AbstractC6918a0.ba_detail_ll_start_date;
                    LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout4 != null) {
                        i11 = AbstractC6918a0.ba_detail_tv_end_date;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.ba_detail_tv_learn_more;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                i11 = AbstractC6918a0.ba_detail_tv_start_date;
                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView3 != null) {
                                    i11 = AbstractC6918a0.btn_change_plan;
                                    Button button = (Button) AbstractC22716b.m117526a(view, i11);
                                    if (button != null) {
                                        LinearLayout linearLayout5 = (LinearLayout) view;
                                        return new C29865j1(linearLayout5, linearLayout, linearLayout2, linearLayout3, linearLayout4, robotoTextView, robotoTextView2, robotoTextView3, button, linearLayout5);
                                    }
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
    public static C29865j1 m148099c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.business_account_detail_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148098a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138225p;
    }
}
