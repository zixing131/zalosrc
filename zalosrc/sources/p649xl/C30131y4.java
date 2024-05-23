package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoCheckBox;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.y4 */
/* loaded from: classes3.dex */
public final class C30131y4 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140002p;

    /* renamed from: q */
    public final RobotoTextView f140003q;

    /* renamed from: r */
    public final RobotoTextView f140004r;

    /* renamed from: s */
    public final RobotoCheckBox f140005s;

    /* renamed from: t */
    public final RobotoCheckBox f140006t;

    /* renamed from: u */
    public final RobotoTextView f140007u;

    /* renamed from: v */
    public final RobotoTextView f140008v;

    /* renamed from: w */
    public final LinearLayout f140009w;

    /* renamed from: x */
    public final RobotoTextView f140010x;

    /* renamed from: y */
    public final RobotoTextView f140011y;

    private C30131y4(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoCheckBox robotoCheckBox, RobotoCheckBox robotoCheckBox2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, LinearLayout linearLayout2, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6) {
        this.f140002p = linearLayout;
        this.f140003q = robotoTextView;
        this.f140004r = robotoTextView2;
        this.f140005s = robotoCheckBox;
        this.f140006t = robotoCheckBox2;
        this.f140007u = robotoTextView3;
        this.f140008v = robotoTextView4;
        this.f140009w = linearLayout2;
        this.f140010x = robotoTextView5;
        this.f140011y = robotoTextView6;
    }

    /* renamed from: a */
    public static C30131y4 m148725a(View view) {
        int i11 = AbstractC6918a0.btn_back;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.btn_decline;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.checkbox_block_invitation;
                RobotoCheckBox robotoCheckBox = (RobotoCheckBox) AbstractC22716b.m117526a(view, i11);
                if (robotoCheckBox != null) {
                    i11 = AbstractC6918a0.checkbox_block_invitor;
                    RobotoCheckBox robotoCheckBox2 = (RobotoCheckBox) AbstractC22716b.m117526a(view, i11);
                    if (robotoCheckBox2 != null) {
                        i11 = AbstractC6918a0.layout_desc;
                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView3 != null) {
                            i11 = AbstractC6918a0.layout_header;
                            RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView4 != null) {
                                LinearLayout linearLayout = (LinearLayout) view;
                                i11 = AbstractC6918a0.tv_block_invitation;
                                RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView5 != null) {
                                    i11 = AbstractC6918a0.tv_block_invitor;
                                    RobotoTextView robotoTextView6 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView6 != null) {
                                        return new C30131y4(linearLayout, robotoTextView, robotoTextView2, robotoCheckBox, robotoCheckBox2, robotoTextView3, robotoTextView4, linearLayout, robotoTextView5, robotoTextView6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30131y4 m148726c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_confirm_decline_invitation_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148725a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140002p;
    }
}
