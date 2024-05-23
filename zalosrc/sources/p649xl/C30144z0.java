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

/* renamed from: xl.z0 */
/* loaded from: classes3.dex */
public final class C30144z0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140071p;

    /* renamed from: q */
    public final LinearLayout f140072q;

    /* renamed from: r */
    public final RobotoTextView f140073r;

    private C30144z0(LinearLayout linearLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView) {
        this.f140071p = linearLayout;
        this.f140072q = linearLayout2;
        this.f140073r = robotoTextView;
    }

    /* renamed from: a */
    public static C30144z0 m148759a(View view) {
        int i11 = AbstractC6918a0.ll_desc_type_msg;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.tv_desc;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C30144z0((LinearLayout) view, linearLayout, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30144z0 m148760c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_report_attach_msg_type_detail, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148759a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140071p;
    }
}
