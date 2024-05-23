package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TimePicker;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.td */
/* loaded from: classes3.dex */
public final class C30055td implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139499p;

    /* renamed from: q */
    public final ButtonWithProgress f139500q;

    /* renamed from: r */
    public final LinearLayout f139501r;

    /* renamed from: s */
    public final TimePicker f139502s;

    /* renamed from: t */
    public final View f139503t;

    /* renamed from: u */
    public final RobotoTextView f139504u;

    /* renamed from: v */
    public final RobotoTextView f139505v;

    /* renamed from: w */
    public final RobotoTextView f139506w;

    private C30055td(LinearLayout linearLayout, ButtonWithProgress buttonWithProgress, LinearLayout linearLayout2, TimePicker timePicker, View view, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.f139499p = linearLayout;
        this.f139500q = buttonWithProgress;
        this.f139501r = linearLayout2;
        this.f139502s = timePicker;
        this.f139503t = view;
        this.f139504u = robotoTextView;
        this.f139505v = robotoTextView2;
        this.f139506w = robotoTextView3;
    }

    /* renamed from: a */
    public static C30055td m148544a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_done;
        ButtonWithProgress buttonWithProgress = (ButtonWithProgress) AbstractC22716b.m117526a(view, i11);
        if (buttonWithProgress != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = AbstractC6918a0.time_picker;
            TimePicker timePicker = (TimePicker) AbstractC22716b.m117526a(view, i11);
            if (timePicker != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.top_divider))) != null) {
                i11 = AbstractC6918a0.tv_end_time;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.tv_start_time;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.tv_title;
                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView3 != null) {
                            return new C30055td(linearLayout, buttonWithProgress, linearLayout, timePicker, m117526a, robotoTextView, robotoTextView2, robotoTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30055td m148545c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.time_range_picker_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148544a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139499p;
    }
}
