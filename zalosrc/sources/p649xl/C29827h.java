package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.h */
/* loaded from: classes3.dex */
public final class C29827h implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137924p;

    /* renamed from: q */
    public final Avatar f137925q;

    /* renamed from: r */
    public final Button f137926r;

    /* renamed from: s */
    public final Button f137927s;

    /* renamed from: t */
    public final View f137928t;

    /* renamed from: u */
    public final RobotoTextView f137929u;

    /* renamed from: v */
    public final RobotoTextView f137930v;

    /* renamed from: w */
    public final RobotoTextView f137931w;

    /* renamed from: x */
    public final RobotoTextView f137932x;

    private C29827h(FrameLayout frameLayout, Avatar avatar, Button button, Button button2, View view, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.f137924p = frameLayout;
        this.f137925q = avatar;
        this.f137926r = button;
        this.f137927s = button2;
        this.f137928t = view;
        this.f137929u = robotoTextView;
        this.f137930v = robotoTextView2;
        this.f137931w = robotoTextView3;
        this.f137932x = robotoTextView4;
    }

    /* renamed from: a */
    public static C29827h m148009a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.avatar;
        Avatar avatar = (Avatar) AbstractC22716b.m117526a(view, i11);
        if (avatar != null) {
            i11 = AbstractC6918a0.btnNegativeAction;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.btnPositiveAction;
                Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button2 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.tempView))) != null) {
                    i11 = AbstractC6918a0.tvExistedAccountName;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.tvSupportHint;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            i11 = AbstractC6918a0.tvTitle;
                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView3 != null) {
                                i11 = AbstractC6918a0.tvTitleDescription;
                                RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView4 != null) {
                                    return new C29827h((FrameLayout) view, avatar, button, button2, m117526a, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4);
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
    public static C29827h m148010c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.already_exist_account_register_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148009a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137924p;
    }
}
