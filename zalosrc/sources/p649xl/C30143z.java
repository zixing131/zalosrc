package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.OtpField;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.z */
/* loaded from: classes3.dex */
public final class C30143z implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f140060p;

    /* renamed from: q */
    public final LinearLayout f140061q;

    /* renamed from: r */
    public final Button f140062r;

    /* renamed from: s */
    public final Button f140063s;

    /* renamed from: t */
    public final ZAppCompatImageView f140064t;

    /* renamed from: u */
    public final C29860ie f140065u;

    /* renamed from: v */
    public final C29878je f140066v;

    /* renamed from: w */
    public final OtpField f140067w;

    /* renamed from: x */
    public final ScrollView f140068x;

    /* renamed from: y */
    public final RobotoTextView f140069y;

    /* renamed from: z */
    public final ZdsActionBar f140070z;

    private C30143z(RelativeLayout relativeLayout, LinearLayout linearLayout, Button button, Button button2, ZAppCompatImageView zAppCompatImageView, C29860ie c29860ie, C29878je c29878je, OtpField otpField, ScrollView scrollView, RobotoTextView robotoTextView, ZdsActionBar zdsActionBar) {
        this.f140060p = relativeLayout;
        this.f140061q = linearLayout;
        this.f140062r = button;
        this.f140063s = button2;
        this.f140064t = zAppCompatImageView;
        this.f140065u = c29860ie;
        this.f140066v = c29878je;
        this.f140067w = otpField;
        this.f140068x = scrollView;
        this.f140069y = robotoTextView;
        this.f140070z = zdsActionBar;
    }

    /* renamed from: a */
    public static C30143z m148755a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btnContainer;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.btnContinue;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.btnForgotPassword;
                Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button2 != null) {
                    i11 = AbstractC6918a0.ivSyncData;
                    ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                    if (zAppCompatImageView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.llWarningInputIncorrect))) != null) {
                        C29860ie m148090a = C29860ie.m148090a(m117526a);
                        i11 = AbstractC6918a0.llWarningOvertimeRetryVerifyCode;
                        View m117526a2 = AbstractC22716b.m117526a(view, i11);
                        if (m117526a2 != null) {
                            C29878je m148136a = C29878je.m148136a(m117526a2);
                            i11 = AbstractC6918a0.optFiled;
                            OtpField otpField = (OtpField) AbstractC22716b.m117526a(view, i11);
                            if (otpField != null) {
                                i11 = AbstractC6918a0.scrollView;
                                ScrollView scrollView = (ScrollView) AbstractC22716b.m117526a(view, i11);
                                if (scrollView != null) {
                                    i11 = AbstractC6918a0.title;
                                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView != null) {
                                        i11 = AbstractC6918a0.zds_action_bar;
                                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                        if (zdsActionBar != null) {
                                            return new C30143z((RelativeLayout) view, linearLayout, button, button2, zAppCompatImageView, m148090a, m148136a, otpField, scrollView, robotoTextView, zdsActionBar);
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
    public static C30143z m148756c(LayoutInflater layoutInflater) {
        return m148757d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30143z m148757d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.backup_pin_code_verification_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148755a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f140060p;
    }
}
