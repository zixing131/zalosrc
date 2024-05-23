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

/* renamed from: xl.ce */
/* loaded from: classes3.dex */
public final class C29752ce implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137446p;

    /* renamed from: q */
    public final Button f137447q;

    /* renamed from: r */
    public final RobotoTextView f137448r;

    private C29752ce(LinearLayout linearLayout, Button button, RobotoTextView robotoTextView) {
        this.f137446p = linearLayout;
        this.f137447q = button;
        this.f137448r = robotoTextView;
    }

    /* renamed from: a */
    public static C29752ce m147823a(View view) {
        int i11 = AbstractC6918a0.btnUnMute;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.tvDescription;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C29752ce((LinearLayout) view, button, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29752ce m147824c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.unmute_call_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147823a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137446p;
    }
}
