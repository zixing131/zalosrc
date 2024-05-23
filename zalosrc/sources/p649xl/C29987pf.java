package p649xl;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.pf */
/* loaded from: classes3.dex */
public final class C29987pf implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139039p;

    /* renamed from: q */
    public final ZdsActionBar f139040q;

    /* renamed from: r */
    public final Button f139041r;

    /* renamed from: s */
    public final ZAppCompatImageView f139042s;

    /* renamed from: t */
    public final RobotoTextView f139043t;

    /* renamed from: u */
    public final RobotoTextView f139044u;

    private C29987pf(RelativeLayout relativeLayout, ZdsActionBar zdsActionBar, Button button, ZAppCompatImageView zAppCompatImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139039p = relativeLayout;
        this.f139040q = zdsActionBar;
        this.f139041r = button;
        this.f139042s = zAppCompatImageView;
        this.f139043t = robotoTextView;
        this.f139044u = robotoTextView2;
    }

    /* renamed from: a */
    public static C29987pf m148378a(View view) {
        int i11 = AbstractC6918a0.action_bar;
        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
        if (zdsActionBar != null) {
            i11 = AbstractC6918a0.btn_done;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.imv_success;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    i11 = AbstractC6918a0.tv_subtitle;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.tv_title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            return new C29987pf((RelativeLayout) view, zdsActionBar, button, zAppCompatImageView, robotoTextView, robotoTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139039p;
    }
}
