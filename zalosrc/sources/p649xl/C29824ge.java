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

/* renamed from: xl.ge */
/* loaded from: classes3.dex */
public final class C29824ge implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137907p;

    /* renamed from: q */
    public final Button f137908q;

    /* renamed from: r */
    public final Button f137909r;

    /* renamed from: s */
    public final Button f137910s;

    /* renamed from: t */
    public final Avatar f137911t;

    /* renamed from: u */
    public final RobotoTextView f137912u;

    /* renamed from: v */
    public final RobotoTextView f137913v;

    private C29824ge(RelativeLayout relativeLayout, Button button, Button button2, Button button3, Avatar avatar, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137907p = relativeLayout;
        this.f137908q = button;
        this.f137909r = button2;
        this.f137910s = button3;
        this.f137911t = avatar;
        this.f137912u = robotoTextView;
        this.f137913v = robotoTextView2;
    }

    /* renamed from: a */
    public static C29824ge m148003a(View view) {
        int i11 = AbstractC6918a0.btnBack;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btnNegativeAction;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.btnPositiveAction;
                Button button3 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button3 != null) {
                    i11 = AbstractC6918a0.ivIllus;
                    Avatar avatar = (Avatar) AbstractC22716b.m117526a(view, i11);
                    if (avatar != null) {
                        i11 = AbstractC6918a0.tvTitle;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.tvTitleDescription;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                return new C29824ge((RelativeLayout) view, button, button2, button3, avatar, robotoTextView, robotoTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29824ge m148004c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.verify_by_another_device_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148003a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137907p;
    }
}
