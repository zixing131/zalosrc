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

/* renamed from: xl.sa */
/* loaded from: classes3.dex */
public final class C30035sa implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139325p;

    /* renamed from: q */
    public final Button f139326q;

    /* renamed from: r */
    public final Button f139327r;

    /* renamed from: s */
    public final Button f139328s;

    /* renamed from: t */
    public final RobotoTextView f139329t;

    /* renamed from: u */
    public final RobotoTextView f139330u;

    private C30035sa(LinearLayout linearLayout, Button button, Button button2, Button button3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139325p = linearLayout;
        this.f139326q = button;
        this.f139327r = button2;
        this.f139328s = button3;
        this.f139329t = robotoTextView;
        this.f139330u = robotoTextView2;
    }

    /* renamed from: a */
    public static C30035sa m148494a(View view) {
        int i11 = AbstractC6918a0.btn_cancel;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_open_setting;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.btn_remind_later;
                Button button3 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button3 != null) {
                    i11 = AbstractC6918a0.tv_desc;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.tv_title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            return new C30035sa((LinearLayout) view, button, button2, button3, robotoTextView, robotoTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30035sa m148495c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.request_full_screen_intent_permission_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148494a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139325p;
    }
}
