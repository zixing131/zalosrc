package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TextField;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ee */
/* loaded from: classes3.dex */
public final class C29788ee implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137700p;

    /* renamed from: q */
    public final Button f137701q;

    /* renamed from: r */
    public final TextField f137702r;

    /* renamed from: s */
    public final RobotoTextView f137703s;

    /* renamed from: t */
    public final RobotoTextView f137704t;

    /* renamed from: u */
    public final RobotoTextView f137705u;

    private C29788ee(FrameLayout frameLayout, Button button, TextField textField, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.f137700p = frameLayout;
        this.f137701q = button;
        this.f137702r = textField;
        this.f137703s = robotoTextView;
        this.f137704t = robotoTextView2;
        this.f137705u = robotoTextView3;
    }

    /* renamed from: a */
    public static C29788ee m147912a(View view) {
        int i11 = AbstractC6918a0.btnNext;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.inputName;
            TextField textField = (TextField) AbstractC22716b.m117526a(view, i11);
            if (textField != null) {
                i11 = AbstractC6918a0.tvNamingPolicy;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.tvTitle;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.tvTitleDescription;
                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView3 != null) {
                            return new C29788ee((FrameLayout) view, button, textField, robotoTextView, robotoTextView2, robotoTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29788ee m147913c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.user_naming_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147912a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137700p;
    }
}
