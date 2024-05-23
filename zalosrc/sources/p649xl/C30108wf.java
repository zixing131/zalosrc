package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.wf */
/* loaded from: classes3.dex */
public final class C30108wf implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139847p;

    /* renamed from: q */
    public final RobotoTextView f139848q;

    /* renamed from: r */
    public final RobotoTextView f139849r;

    private C30108wf(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139847p = linearLayout;
        this.f139848q = robotoTextView;
        this.f139849r = robotoTextView2;
    }

    /* renamed from: a */
    public static C30108wf m148669a(View view) {
        int i11 = AbstractC6918a0.chart_subtitle;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.chart_title;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                return new C30108wf((LinearLayout) view, robotoTextView, robotoTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139847p;
    }
}
