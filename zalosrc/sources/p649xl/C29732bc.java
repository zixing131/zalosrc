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

/* renamed from: xl.bc */
/* loaded from: classes3.dex */
public final class C29732bc implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137349p;

    /* renamed from: q */
    public final RobotoTextView f137350q;

    private C29732bc(LinearLayout linearLayout, RobotoTextView robotoTextView) {
        this.f137349p = linearLayout;
        this.f137350q = robotoTextView;
    }

    /* renamed from: a */
    public static C29732bc m147779a(View view) {
        int i11 = AbstractC6918a0.tvTitle;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            return new C29732bc((LinearLayout) view, robotoTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29732bc m147780c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_private_detail_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147779a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137349p;
    }
}
