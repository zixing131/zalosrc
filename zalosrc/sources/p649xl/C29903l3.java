package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.PhoneField;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.l3 */
/* loaded from: classes3.dex */
public final class C29903l3 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138547p;

    /* renamed from: q */
    public final Button f138548q;

    /* renamed from: r */
    public final Button f138549r;

    /* renamed from: s */
    public final PhoneField f138550s;

    /* renamed from: t */
    public final LinearLayout f138551t;

    /* renamed from: u */
    public final View f138552u;

    /* renamed from: v */
    public final RobotoTextView f138553v;

    /* renamed from: w */
    public final RobotoTextView f138554w;

    private C29903l3(FrameLayout frameLayout, Button button, Button button2, PhoneField phoneField, LinearLayout linearLayout, View view, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f138547p = frameLayout;
        this.f138548q = button;
        this.f138549r = button2;
        this.f138550s = phoneField;
        this.f138551t = linearLayout;
        this.f138552u = view;
        this.f138553v = robotoTextView;
        this.f138554w = robotoTextView2;
    }

    /* renamed from: a */
    public static C29903l3 m148190a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btnBack;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btnNext;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.inputPhoneNumber;
                PhoneField phoneField = (PhoneField) AbstractC22716b.m117526a(view, i11);
                if (phoneField != null) {
                    i11 = AbstractC6918a0.llAgreement;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.tempView))) != null) {
                        i11 = AbstractC6918a0.tvHintLogin;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.tvTitle;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                return new C29903l3((FrameLayout) view, button, button2, phoneField, linearLayout, m117526a, robotoTextView, robotoTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29903l3 m148191c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.enter_user_number_phone_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148190a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138547p;
    }
}
