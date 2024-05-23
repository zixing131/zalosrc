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

/* renamed from: xl.u2 */
/* loaded from: classes3.dex */
public final class C30061u2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139533p;

    /* renamed from: q */
    public final RobotoTextView f139534q;

    /* renamed from: r */
    public final RobotoTextView f139535r;

    private C30061u2(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139533p = linearLayout;
        this.f139534q = robotoTextView;
        this.f139535r = robotoTextView2;
    }

    /* renamed from: a */
    public static C30061u2 m148556a(View view) {
        int i11 = AbstractC6918a0.tv_key;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.tv_value;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                return new C30061u2((LinearLayout) view, robotoTextView, robotoTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30061u2 m148557c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.detail_device_row, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148556a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139533p;
    }
}
