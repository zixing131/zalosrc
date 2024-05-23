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

/* renamed from: xl.nd */
/* loaded from: classes3.dex */
public final class C29949nd implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138811p;

    /* renamed from: q */
    public final Avatar f138812q;

    /* renamed from: r */
    public final Button f138813r;

    /* renamed from: s */
    public final Button f138814s;

    /* renamed from: t */
    public final Button f138815t;

    /* renamed from: u */
    public final RobotoTextView f138816u;

    /* renamed from: v */
    public final RobotoTextView f138817v;

    private C29949nd(RelativeLayout relativeLayout, Avatar avatar, Button button, Button button2, Button button3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f138811p = relativeLayout;
        this.f138812q = avatar;
        this.f138813r = button;
        this.f138814s = button2;
        this.f138815t = button3;
        this.f138816u = robotoTextView;
        this.f138817v = robotoTextView2;
    }

    /* renamed from: a */
    public static C29949nd m148295a(View view) {
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
                                return new C29949nd((RelativeLayout) view, avatar, button, button2, button3, robotoTextView, robotoTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29949nd m148296c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.suggest_allow_access_native_contact_register_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148295a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138811p;
    }
}
