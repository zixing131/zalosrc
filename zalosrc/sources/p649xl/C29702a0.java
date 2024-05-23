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

/* renamed from: xl.a0 */
/* loaded from: classes3.dex */
public final class C29702a0 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137177p;

    /* renamed from: q */
    public final Avatar f137178q;

    /* renamed from: r */
    public final Button f137179r;

    /* renamed from: s */
    public final Button f137180s;

    /* renamed from: t */
    public final Button f137181t;

    /* renamed from: u */
    public final RobotoTextView f137182u;

    /* renamed from: v */
    public final RobotoTextView f137183v;

    private C29702a0(RelativeLayout relativeLayout, Avatar avatar, Button button, Button button2, Button button3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137177p = relativeLayout;
        this.f137178q = avatar;
        this.f137179r = button;
        this.f137180s = button2;
        this.f137181t = button3;
        this.f137182u = robotoTextView;
        this.f137183v = robotoTextView2;
    }

    /* renamed from: a */
    public static C29702a0 m147699a(View view) {
        int i11 = AbstractC6918a0.avatar;
        Avatar avatar = (Avatar) AbstractC22716b.m117526a(view, i11);
        if (avatar != null) {
            i11 = AbstractC6918a0.btnBack;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.btnNegativeAction;
                Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button2 != null) {
                    i11 = AbstractC6918a0.btnPositiveAction;
                    Button button3 = (Button) AbstractC22716b.m117526a(view, i11);
                    if (button3 != null) {
                        i11 = AbstractC6918a0.tvTitle;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.tvTitleDescription;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                return new C29702a0((RelativeLayout) view, avatar, button, button2, button3, robotoTextView, robotoTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29702a0 m147700c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.banned_account_register_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147699a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137177p;
    }
}
