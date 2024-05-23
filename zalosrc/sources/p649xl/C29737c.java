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

/* renamed from: xl.c */
/* loaded from: classes3.dex */
public final class C29737c implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137368p;

    /* renamed from: q */
    public final LinearLayout f137369q;

    /* renamed from: r */
    public final RobotoTextView f137370r;

    /* renamed from: s */
    public final RobotoTextView f137371s;

    /* renamed from: t */
    public final LinearLayout f137372t;

    /* renamed from: u */
    public final AppCompatImageView f137373u;

    /* renamed from: v */
    public final AppCompatImageView f137374v;

    /* renamed from: w */
    public final LinearLayout f137375w;

    private C29737c(LinearLayout linearLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, LinearLayout linearLayout3, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout4) {
        this.f137368p = linearLayout;
        this.f137369q = linearLayout2;
        this.f137370r = robotoTextView;
        this.f137371s = robotoTextView2;
        this.f137372t = linearLayout3;
        this.f137373u = appCompatImageView;
        this.f137374v = appCompatImageView2;
        this.f137375w = linearLayout4;
    }

    /* renamed from: a */
    public static C29737c m147788a(View view) {
        int i11 = AbstractC6918a0.date_picker_spinner_layout;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.date_picker_sub_tv;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.date_picker_tv;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    i11 = AbstractC6918a0.navigate_month_calendar;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout2 != null) {
                        i11 = AbstractC6918a0.navigate_next_month;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                        if (appCompatImageView != null) {
                            i11 = AbstractC6918a0.navigate_previous_month;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                            if (appCompatImageView2 != null) {
                                i11 = AbstractC6918a0.right_menu_calendar;
                                LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout3 != null) {
                                    return new C29737c((LinearLayout) view, linearLayout, robotoTextView, robotoTextView2, linearLayout2, appCompatImageView, appCompatImageView2, linearLayout3);
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
    public static C29737c m147789c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.actionbar_left_view_birthay_hub_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147788a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137368p;
    }
}
