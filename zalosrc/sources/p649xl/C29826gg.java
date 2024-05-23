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
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.gg */
/* loaded from: classes3.dex */
public final class C29826gg implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137917p;

    /* renamed from: q */
    public final RobotoTextView f137918q;

    /* renamed from: r */
    public final RobotoTextView f137919r;

    /* renamed from: s */
    public final ZAppCompatImageView f137920s;

    /* renamed from: t */
    public final Button f137921t;

    /* renamed from: u */
    public final ZAppCompatImageView f137922u;

    /* renamed from: v */
    public final LinearLayout f137923v;

    private C29826gg(RelativeLayout relativeLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ZAppCompatImageView zAppCompatImageView, Button button, ZAppCompatImageView zAppCompatImageView2, LinearLayout linearLayout) {
        this.f137917p = relativeLayout;
        this.f137918q = robotoTextView;
        this.f137919r = robotoTextView2;
        this.f137920s = zAppCompatImageView;
        this.f137921t = button;
        this.f137922u = zAppCompatImageView2;
        this.f137923v = linearLayout;
    }

    /* renamed from: a */
    public static C29826gg m148006a(View view) {
        int i11 = AbstractC6918a0.bannerDescription;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.bannerTitle;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.btnClose;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    i11 = AbstractC6918a0.btnSetup;
                    Button button = (Button) AbstractC22716b.m117526a(view, i11);
                    if (button != null) {
                        i11 = AbstractC6918a0.ivLeadingIcon;
                        ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                        if (zAppCompatImageView2 != null) {
                            i11 = AbstractC6918a0.mainContent;
                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout != null) {
                                return new C29826gg((RelativeLayout) view, robotoTextView, robotoTextView2, zAppCompatImageView, button, zAppCompatImageView2, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29826gg m148007c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.zcloud_remind_setup_banner, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148006a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137917p;
    }
}
