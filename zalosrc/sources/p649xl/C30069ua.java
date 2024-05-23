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

/* renamed from: xl.ua */
/* loaded from: classes3.dex */
public final class C30069ua implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139574p;

    /* renamed from: q */
    public final Avatar f139575q;

    /* renamed from: r */
    public final Button f139576r;

    /* renamed from: s */
    public final Button f139577s;

    /* renamed from: t */
    public final View f139578t;

    /* renamed from: u */
    public final RobotoTextView f139579u;

    /* renamed from: v */
    public final RobotoTextView f139580v;

    private C30069ua(FrameLayout frameLayout, Avatar avatar, Button button, Button button2, View view, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139574p = frameLayout;
        this.f139575q = avatar;
        this.f139576r = button;
        this.f139577s = button2;
        this.f139578t = view;
        this.f139579u = robotoTextView;
        this.f139580v = robotoTextView2;
    }

    /* renamed from: a */
    public static C30069ua m148580a(View view) {
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
                    i11 = AbstractC6918a0.tvTitle;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.tvTitleDescription;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            return new C30069ua((FrameLayout) view, avatar, button, button2, m117526a, robotoTextView, robotoTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30069ua m148581c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.resume_register_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148580a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139574p;
    }
}
