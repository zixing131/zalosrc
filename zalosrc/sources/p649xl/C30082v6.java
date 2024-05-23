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

/* renamed from: xl.v6 */
/* loaded from: classes3.dex */
public final class C30082v6 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139660p;

    /* renamed from: q */
    public final RobotoTextView f139661q;

    /* renamed from: r */
    public final LinearLayout f139662r;

    /* renamed from: s */
    public final RobotoTextView f139663s;

    private C30082v6(LinearLayout linearLayout, RobotoTextView robotoTextView, LinearLayout linearLayout2, RobotoTextView robotoTextView2) {
        this.f139660p = linearLayout;
        this.f139661q = robotoTextView;
        this.f139662r = linearLayout2;
        this.f139663s = robotoTextView2;
    }

    /* renamed from: a */
    public static C30082v6 m148610a(View view) {
        int i11 = AbstractC6918a0.btnRetry;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i12 = AbstractC6918a0.tv_title;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i12);
            if (robotoTextView2 != null) {
                return new C30082v6(linearLayout, robotoTextView, linearLayout, robotoTextView2);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30082v6 m148611c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_ring_back_tone_empty_content, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148610a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139660p;
    }
}
