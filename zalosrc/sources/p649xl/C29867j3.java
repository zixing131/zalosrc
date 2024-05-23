package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.OtpField;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.j3 */
/* loaded from: classes3.dex */
public final class C29867j3 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f138240A;

    /* renamed from: B */
    public final RobotoTextView f138241B;

    /* renamed from: p */
    private final FrameLayout f138242p;

    /* renamed from: q */
    public final LinearLayout f138243q;

    /* renamed from: r */
    public final Button f138244r;

    /* renamed from: s */
    public final Button f138245s;

    /* renamed from: t */
    public final Button f138246t;

    /* renamed from: u */
    public final OtpField f138247u;

    /* renamed from: v */
    public final LinearLayout f138248v;

    /* renamed from: w */
    public final View f138249w;

    /* renamed from: x */
    public final RobotoTextView f138250x;

    /* renamed from: y */
    public final RobotoTextView f138251y;

    /* renamed from: z */
    public final RobotoTextView f138252z;

    private C29867j3(FrameLayout frameLayout, LinearLayout linearLayout, Button button, Button button2, Button button3, OtpField otpField, LinearLayout linearLayout2, View view, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5) {
        this.f138242p = frameLayout;
        this.f138243q = linearLayout;
        this.f138244r = button;
        this.f138245s = button2;
        this.f138246t = button3;
        this.f138247u = otpField;
        this.f138248v = linearLayout2;
        this.f138249w = view;
        this.f138250x = robotoTextView;
        this.f138251y = robotoTextView2;
        this.f138252z = robotoTextView3;
        this.f138240A = robotoTextView4;
        this.f138241B = robotoTextView5;
    }

    /* renamed from: a */
    public static C29867j3 m148105a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.OutQuotaMessageContainer;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.btnBack;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.btnNext;
                Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button2 != null) {
                    i11 = AbstractC6918a0.btnSendMessage;
                    Button button3 = (Button) AbstractC22716b.m117526a(view, i11);
                    if (button3 != null) {
                        i11 = AbstractC6918a0.inputOtp;
                        OtpField otpField = (OtpField) AbstractC22716b.m117526a(view, i11);
                        if (otpField != null) {
                            i11 = AbstractC6918a0.llContentView;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout2 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.tempView))) != null) {
                                i11 = AbstractC6918a0.tvGuideMessage;
                                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView != null) {
                                    i11 = AbstractC6918a0.tvHintRequest;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView2 != null) {
                                        i11 = AbstractC6918a0.tvHintSupport;
                                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView3 != null) {
                                            i11 = AbstractC6918a0.tvTitle;
                                            RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView4 != null) {
                                                i11 = AbstractC6918a0.tvTitleDescription;
                                                RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView5 != null) {
                                                    return new C29867j3((FrameLayout) view, linearLayout, button, button2, button3, otpField, linearLayout2, m117526a, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4, robotoTextView5);
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
    public static C29867j3 m148106c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.enter_otp_register_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148105a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138242p;
    }
}
