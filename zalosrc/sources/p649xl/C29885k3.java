package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.DatePickerField;
import com.zing.zalo.zdesign.component.DropdownField;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.k3 */
/* loaded from: classes3.dex */
public final class C29885k3 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138452p;

    /* renamed from: q */
    public final Button f138453q;

    /* renamed from: r */
    public final Button f138454r;

    /* renamed from: s */
    public final DatePickerField f138455s;

    /* renamed from: t */
    public final DropdownField f138456t;

    /* renamed from: u */
    public final RobotoTextView f138457u;

    private C29885k3(RelativeLayout relativeLayout, Button button, Button button2, DatePickerField datePickerField, DropdownField dropdownField, RobotoTextView robotoTextView) {
        this.f138452p = relativeLayout;
        this.f138453q = button;
        this.f138454r = button2;
        this.f138455s = datePickerField;
        this.f138456t = dropdownField;
        this.f138457u = robotoTextView;
    }

    /* renamed from: a */
    public static C29885k3 m148151a(View view) {
        int i11 = AbstractC6918a0.btnBack;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btnNext;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.inputDOB;
                DatePickerField datePickerField = (DatePickerField) AbstractC22716b.m117526a(view, i11);
                if (datePickerField != null) {
                    i11 = AbstractC6918a0.inputGender;
                    DropdownField dropdownField = (DropdownField) AbstractC22716b.m117526a(view, i11);
                    if (dropdownField != null) {
                        i11 = AbstractC6918a0.tvTitle;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            return new C29885k3((RelativeLayout) view, button, button2, datePickerField, dropdownField, robotoTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29885k3 m148152c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.enter_user_extra_profile_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148151a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138452p;
    }
}
