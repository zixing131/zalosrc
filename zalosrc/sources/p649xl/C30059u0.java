package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.u0 */
/* loaded from: classes3.dex */
public final class C30059u0 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139524p;

    /* renamed from: q */
    public final DatePicker f139525q;

    /* renamed from: r */
    public final RobotoTextView f139526r;

    /* renamed from: s */
    public final RobotoTextView f139527s;

    private C30059u0(RelativeLayout relativeLayout, DatePicker datePicker, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139524p = relativeLayout;
        this.f139525q = datePicker;
        this.f139526r = robotoTextView;
        this.f139527s = robotoTextView2;
    }

    /* renamed from: a */
    public static C30059u0 m148550a(View view) {
        int i11 = AbstractC6918a0.date_picker;
        DatePicker datePicker = (DatePicker) AbstractC22716b.m117526a(view, i11);
        if (datePicker != null) {
            i11 = AbstractC6918a0.select_day_description;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.tv_select_day;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    return new C30059u0((RelativeLayout) view, datePicker, robotoTextView, robotoTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30059u0 m148551c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_limit_feed_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148550a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139524p;
    }
}
