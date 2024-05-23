package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.s7 */
/* loaded from: classes3.dex */
public final class C30032s7 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139299p;

    /* renamed from: q */
    public final Button f139300q;

    /* renamed from: r */
    public final Button f139301r;

    /* renamed from: s */
    public final Button f139302s;

    /* renamed from: t */
    public final Button f139303t;

    /* renamed from: u */
    public final LinearLayout f139304u;

    /* renamed from: v */
    public final LinearLayout f139305v;

    private C30032s7(FrameLayout frameLayout, Button button, Button button2, Button button3, Button button4, LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f139299p = frameLayout;
        this.f139300q = button;
        this.f139301r = button2;
        this.f139302s = button3;
        this.f139303t = button4;
        this.f139304u = linearLayout;
        this.f139305v = linearLayout2;
    }

    /* renamed from: a */
    public static C30032s7 m148485a(View view) {
        int i11 = AbstractC6918a0.btn_cancel_leave;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_cancel_select_owner;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.btn_leave;
                Button button3 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button3 != null) {
                    i11 = AbstractC6918a0.btn_select_owner;
                    Button button4 = (Button) AbstractC22716b.m117526a(view, i11);
                    if (button4 != null) {
                        i11 = AbstractC6918a0.leave_btn_container;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.select_owner_btn_group;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout2 != null) {
                                return new C30032s7((FrameLayout) view, button, button2, button3, button4, linearLayout, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30032s7 m148486c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.leave_group_confirm_view_button_group, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148485a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139299p;
    }
}
