package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.widget.InputKeyCodeView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.s */
/* loaded from: classes3.dex */
public final class C30024s implements InterfaceC22715a {

    /* renamed from: A */
    public final InputKeyCodeView f139261A;

    /* renamed from: B */
    public final ZdsActionBar f139262B;

    /* renamed from: p */
    private final RelativeLayout f139263p;

    /* renamed from: q */
    public final LinearLayout f139264q;

    /* renamed from: r */
    public final Button f139265r;

    /* renamed from: s */
    public final Button f139266s;

    /* renamed from: t */
    public final ZAppCompatImageView f139267t;

    /* renamed from: u */
    public final C29860ie f139268u;

    /* renamed from: v */
    public final C29878je f139269v;

    /* renamed from: w */
    public final ScrollView f139270w;

    /* renamed from: x */
    public final FrameLayout f139271x;

    /* renamed from: y */
    public final RobotoTextView f139272y;

    /* renamed from: z */
    public final RobotoTextView f139273z;

    private C30024s(RelativeLayout relativeLayout, LinearLayout linearLayout, Button button, Button button2, ZAppCompatImageView zAppCompatImageView, C29860ie c29860ie, C29878je c29878je, ScrollView scrollView, FrameLayout frameLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, InputKeyCodeView inputKeyCodeView, ZdsActionBar zdsActionBar) {
        this.f139263p = relativeLayout;
        this.f139264q = linearLayout;
        this.f139265r = button;
        this.f139266s = button2;
        this.f139267t = zAppCompatImageView;
        this.f139268u = c29860ie;
        this.f139269v = c29878je;
        this.f139270w = scrollView;
        this.f139271x = frameLayout;
        this.f139272y = robotoTextView;
        this.f139273z = robotoTextView2;
        this.f139261A = inputKeyCodeView;
        this.f139262B = zdsActionBar;
    }

    /* renamed from: a */
    public static C30024s m148463a(View view) {
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
                            i11 = AbstractC6918a0.scrollView;
                            ScrollView scrollView = (ScrollView) AbstractC22716b.m117526a(view, i11);
                            if (scrollView != null) {
                                i11 = AbstractC6918a0.snackBarContainer;
                                FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                if (frameLayout != null) {
                                    i11 = AbstractC6918a0.title;
                                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView != null) {
                                        i11 = AbstractC6918a0.tvImportFormGgdrive;
                                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView2 != null) {
                                            i11 = AbstractC6918a0.vPassphrase;
                                            InputKeyCodeView inputKeyCodeView = (InputKeyCodeView) AbstractC22716b.m117526a(view, i11);
                                            if (inputKeyCodeView != null) {
                                                i11 = AbstractC6918a0.zds_action_bar;
                                                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                                if (zdsActionBar != null) {
                                                    return new C30024s((RelativeLayout) view, linearLayout, button, button2, zAppCompatImageView, m148090a, m148136a, scrollView, frameLayout, robotoTextView, robotoTextView2, inputKeyCodeView, zdsActionBar);
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
    public static C30024s m148464c(LayoutInflater layoutInflater) {
        return m148465d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30024s m148465d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.backup_passphrase_verification_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148463a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139263p;
    }
}
