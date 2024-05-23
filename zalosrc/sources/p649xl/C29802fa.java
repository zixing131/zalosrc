package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.fa */
/* loaded from: classes3.dex */
public final class C29802fa implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137756p;

    /* renamed from: q */
    public final RobotoTextView f137757q;

    /* renamed from: r */
    public final RobotoTextView f137758r;

    /* renamed from: s */
    public final RobotoTextView f137759s;

    private C29802fa(RelativeLayout relativeLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.f137756p = relativeLayout;
        this.f137757q = robotoTextView;
        this.f137758r = robotoTextView2;
        this.f137759s = robotoTextView3;
    }

    /* renamed from: a */
    public static C29802fa m147948a(View view) {
        int i11 = AbstractC6918a0.btnAction;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.desc;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.title;
                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView3 != null) {
                    return new C29802fa((RelativeLayout) view, robotoTextView, robotoTextView2, robotoTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29802fa m147949c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_title_divider, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147948a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137756p;
    }
}
