package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.e */
/* loaded from: classes5.dex */
public final class C24999e implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119860p;

    /* renamed from: q */
    public final RobotoTextView f119861q;

    /* renamed from: r */
    public final RobotoTextView f119862r;

    /* renamed from: s */
    public final RobotoTextView f119863s;

    /* renamed from: t */
    public final RobotoTextView f119864t;

    private C24999e(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.f119860p = linearLayout;
        this.f119861q = robotoTextView;
        this.f119862r = robotoTextView2;
        this.f119863s = robotoTextView3;
        this.f119864t = robotoTextView4;
    }

    /* renamed from: a */
    public static C24999e m129793a(View view) {
        int i11 = AbstractC27409d.btnShareChat;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC27409d.btnShareDiary;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC27409d.btnShareLink;
                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView3 != null) {
                    i11 = AbstractC27409d.btnShareOther;
                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView4 != null) {
                        return new C24999e((LinearLayout) view, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24999e m129794c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_bts_share, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129793a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119860p;
    }
}
