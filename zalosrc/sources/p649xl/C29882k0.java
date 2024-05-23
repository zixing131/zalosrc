package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import androidx.core.widget.NestedScrollView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.k0 */
/* loaded from: classes3.dex */
public final class C29882k0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138428p;

    /* renamed from: q */
    public final LinearLayout f138429q;

    /* renamed from: r */
    public final Button f138430r;

    /* renamed from: s */
    public final NumberPicker f138431s;

    /* renamed from: t */
    public final NumberPicker f138432t;

    /* renamed from: u */
    public final NestedScrollView f138433u;

    /* renamed from: v */
    public final RobotoTextView f138434v;

    /* renamed from: w */
    public final RobotoTextView f138435w;

    /* renamed from: x */
    public final NumberPicker f138436x;

    private C29882k0(LinearLayout linearLayout, LinearLayout linearLayout2, Button button, NumberPicker numberPicker, NumberPicker numberPicker2, NestedScrollView nestedScrollView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, NumberPicker numberPicker3) {
        this.f138428p = linearLayout;
        this.f138429q = linearLayout2;
        this.f138430r = button;
        this.f138431s = numberPicker;
        this.f138432t = numberPicker2;
        this.f138433u = nestedScrollView;
        this.f138434v = robotoTextView;
        this.f138435w = robotoTextView2;
        this.f138436x = numberPicker3;
    }

    /* renamed from: a */
    public static C29882k0 m148143a(View view) {
        int i11 = AbstractC6918a0.birthdayPicker;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.btnPositiveAction;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.dayPickerColumn;
                NumberPicker numberPicker = (NumberPicker) AbstractC22716b.m117526a(view, i11);
                if (numberPicker != null) {
                    i11 = AbstractC6918a0.monthPickerColumn;
                    NumberPicker numberPicker2 = (NumberPicker) AbstractC22716b.m117526a(view, i11);
                    if (numberPicker2 != null) {
                        i11 = AbstractC6918a0.scrollView;
                        NestedScrollView nestedScrollView = (NestedScrollView) AbstractC22716b.m117526a(view, i11);
                        if (nestedScrollView != null) {
                            i11 = AbstractC6918a0.tvRuleBirthday;
                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView != null) {
                                i11 = AbstractC6918a0.tvTitle;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    i11 = AbstractC6918a0.yearPickerColumn;
                                    NumberPicker numberPicker3 = (NumberPicker) AbstractC22716b.m117526a(view, i11);
                                    if (numberPicker3 != null) {
                                        return new C29882k0((LinearLayout) view, linearLayout, button, numberPicker, numberPicker2, nestedScrollView, robotoTextView, robotoTextView2, numberPicker3);
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
    public static C29882k0 m148144c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_birthday_picker_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148143a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138428p;
    }
}
