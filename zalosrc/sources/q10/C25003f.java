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

/* renamed from: q10.f */
/* loaded from: classes5.dex */
public final class C25003f implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119893p;

    /* renamed from: q */
    public final RobotoTextView f119894q;

    /* renamed from: r */
    public final RobotoTextView f119895r;

    private C25003f(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f119893p = linearLayout;
        this.f119894q = robotoTextView;
        this.f119895r = robotoTextView2;
    }

    /* renamed from: a */
    public static C25003f m129804a(View view) {
        int i11 = AbstractC27409d.rowDelete;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC27409d.rowRetry;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                return new C25003f((LinearLayout) view, robotoTextView, robotoTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25003f m129805c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_bts_upload_action, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129804a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119893p;
    }
}
