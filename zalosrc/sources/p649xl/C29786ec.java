package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ec */
/* loaded from: classes3.dex */
public final class C29786ec implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137688p;

    /* renamed from: q */
    public final RobotoTextView f137689q;

    private C29786ec(LinearLayout linearLayout, RobotoTextView robotoTextView) {
        this.f137688p = linearLayout;
        this.f137689q = robotoTextView;
    }

    /* renamed from: a */
    public static C29786ec m147906a(View view) {
        int i11 = AbstractC6918a0.tv_label;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            return new C29786ec((LinearLayout) view, robotoTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29786ec m147907c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_security_label, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147906a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137688p;
    }
}
