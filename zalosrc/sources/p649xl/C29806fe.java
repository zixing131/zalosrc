package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.fe */
/* loaded from: classes3.dex */
public final class C29806fe implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137799p;

    /* renamed from: q */
    public final Avatar f137800q;

    /* renamed from: r */
    public final Button f137801r;

    /* renamed from: s */
    public final Button f137802s;

    /* renamed from: t */
    public final RobotoTextView f137803t;

    /* renamed from: u */
    public final RobotoTextView f137804u;

    private C29806fe(RelativeLayout relativeLayout, Avatar avatar, Button button, Button button2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137799p = relativeLayout;
        this.f137800q = avatar;
        this.f137801r = button;
        this.f137802s = button2;
        this.f137803t = robotoTextView;
        this.f137804u = robotoTextView2;
    }

    /* renamed from: a */
    public static C29806fe m147960a(View view) {
        int i11 = AbstractC6918a0.avatar;
        Avatar avatar = (Avatar) AbstractC22716b.m117526a(view, i11);
        if (avatar != null) {
            i11 = AbstractC6918a0.btnNegativeAction;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.btnPositiveAction;
                Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button2 != null) {
                    i11 = AbstractC6918a0.tvTitle;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.tvTitleDescription;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            return new C29806fe((RelativeLayout) view, avatar, button, button2, robotoTextView, robotoTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29806fe m147961c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.user_update_avatar_register_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147960a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137799p;
    }
}
