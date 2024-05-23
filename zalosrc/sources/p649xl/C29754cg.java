package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.cg */
/* loaded from: classes3.dex */
public final class C29754cg implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137452p;

    /* renamed from: q */
    public final Button f137453q;

    /* renamed from: r */
    public final Button f137454r;

    /* renamed from: s */
    public final ImageView f137455s;

    /* renamed from: t */
    public final RobotoTextView f137456t;

    /* renamed from: u */
    public final RobotoTextView f137457u;

    /* renamed from: v */
    public final RobotoTextView f137458v;

    private C29754cg(RelativeLayout relativeLayout, Button button, Button button2, ImageView imageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.f137452p = relativeLayout;
        this.f137453q = button;
        this.f137454r = button2;
        this.f137455s = imageView;
        this.f137456t = robotoTextView;
        this.f137457u = robotoTextView2;
        this.f137458v = robotoTextView3;
    }

    /* renamed from: a */
    public static C29754cg m147826a(View view) {
        int i11 = AbstractC6918a0.btnConnectZcloud;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btnHelp;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.imv_icon;
                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView != null) {
                    i11 = AbstractC6918a0.tvHeader;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.tvTitle1;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            i11 = AbstractC6918a0.tvTitle2;
                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView3 != null) {
                                return new C29754cg((RelativeLayout) view, button, button2, imageView, robotoTextView, robotoTextView2, robotoTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29754cg m147827c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.zcloud_no_backup_info_warning_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147826a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137452p;
    }
}
