package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.CustomEditText;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.rd */
/* loaded from: classes3.dex */
public final class C30021rd implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f139242A;

    /* renamed from: B */
    public final RobotoTextView f139243B;

    /* renamed from: C */
    public final C30063u4 f139244C;

    /* renamed from: p */
    private final LinearLayout f139245p;

    /* renamed from: q */
    public final RobotoTextView f139246q;

    /* renamed from: r */
    public final RobotoTextView f139247r;

    /* renamed from: s */
    public final RobotoTextView f139248s;

    /* renamed from: t */
    public final CustomEditText f139249t;

    /* renamed from: u */
    public final CustomEditText f139250u;

    /* renamed from: v */
    public final ZAppCompatImageView f139251v;

    /* renamed from: w */
    public final LinearLayout f139252w;

    /* renamed from: x */
    public final LinearLayout f139253x;

    /* renamed from: y */
    public final RobotoTextView f139254y;

    /* renamed from: z */
    public final RobotoTextView f139255z;

    private C30021rd(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, CustomEditText customEditText, CustomEditText customEditText2, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout2, LinearLayout linearLayout3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6, RobotoTextView robotoTextView7, C30063u4 c30063u4) {
        this.f139245p = linearLayout;
        this.f139246q = robotoTextView;
        this.f139247r = robotoTextView2;
        this.f139248s = robotoTextView3;
        this.f139249t = customEditText;
        this.f139250u = customEditText2;
        this.f139251v = zAppCompatImageView;
        this.f139252w = linearLayout2;
        this.f139253x = linearLayout3;
        this.f139254y = robotoTextView4;
        this.f139255z = robotoTextView5;
        this.f139242A = robotoTextView6;
        this.f139243B = robotoTextView7;
        this.f139244C = c30063u4;
    }

    /* renamed from: a */
    public static C30021rd m148460a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_ignore;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.btn_save_pass;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.btn_show_password;
                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView3 != null) {
                    i11 = AbstractC6918a0.et_enter_pass;
                    CustomEditText customEditText = (CustomEditText) AbstractC22716b.m117526a(view, i11);
                    if (customEditText != null) {
                        i11 = AbstractC6918a0.et_re_enter_pass;
                        CustomEditText customEditText2 = (CustomEditText) AbstractC22716b.m117526a(view, i11);
                        if (customEditText2 != null) {
                            i11 = AbstractC6918a0.icon;
                            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                            if (zAppCompatImageView != null) {
                                i11 = AbstractC6918a0.layout_content;
                                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout != null) {
                                    i11 = AbstractC6918a0.layout_enter_pass;
                                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                    if (linearLayout2 != null) {
                                        i11 = AbstractC6918a0.tv_description;
                                        RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView4 != null) {
                                            i11 = AbstractC6918a0.tv_pass_error;
                                            RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView5 != null) {
                                                i11 = AbstractC6918a0.tv_re_pass_error;
                                                RobotoTextView robotoTextView6 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView6 != null) {
                                                    i11 = AbstractC6918a0.tv_title;
                                                    RobotoTextView robotoTextView7 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView7 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.zalo_action_bar))) != null) {
                                                        return new C30021rd((LinearLayout) view, robotoTextView, robotoTextView2, robotoTextView3, customEditText, customEditText2, zAppCompatImageView, linearLayout, linearLayout2, robotoTextView4, robotoTextView5, robotoTextView6, robotoTextView7, C30063u4.m148563a(m117526a));
                                                    }
                                                }
                                            }
                                        }
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
    public static C30021rd m148461c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.sync_message_force_set_pass_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148460a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139245p;
    }
}
