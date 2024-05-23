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

/* renamed from: xl.gb */
/* loaded from: classes3.dex */
public final class C29821gb implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137885p;

    /* renamed from: q */
    public final RobotoTextView f137886q;

    private C29821gb(LinearLayout linearLayout, RobotoTextView robotoTextView) {
        this.f137885p = linearLayout;
        this.f137886q = robotoTextView;
    }

    /* renamed from: a */
    public static C29821gb m147995a(View view) {
        int i11 = AbstractC6918a0.text_content_subtext;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            return new C29821gb((LinearLayout) view, robotoTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29821gb m147996c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.server_maintenance, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147995a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137885p;
    }
}
