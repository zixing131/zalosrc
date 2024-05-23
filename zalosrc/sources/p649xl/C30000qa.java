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

/* renamed from: xl.qa */
/* loaded from: classes3.dex */
public final class C30000qa implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139115p;

    /* renamed from: q */
    public final Button f139116q;

    /* renamed from: r */
    public final LinearLayout f139117r;

    /* renamed from: s */
    public final RobotoTextView f139118s;

    /* renamed from: t */
    public final RobotoTextView f139119t;

    private C30000qa(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139115p = linearLayout;
        this.f139116q = button;
        this.f139117r = linearLayout2;
        this.f139118s = robotoTextView;
        this.f139119t = robotoTextView2;
    }

    /* renamed from: a */
    public static C30000qa m148409a(View view) {
        int i11 = AbstractC6918a0.btn_done;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.list_item_report_follow_action;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.report_success_desc;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.report_success_title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        return new C30000qa((LinearLayout) view, button, linearLayout, robotoTextView, robotoTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30000qa m148410c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.report_success_action_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148409a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139115p;
    }
}
