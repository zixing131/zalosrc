package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.HorizontalAvatar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.na */
/* loaded from: classes3.dex */
public final class C29946na implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138791p;

    /* renamed from: q */
    public final Button f138792q;

    /* renamed from: r */
    public final Button f138793r;

    /* renamed from: s */
    public final Button f138794s;

    /* renamed from: t */
    public final HorizontalAvatar f138795t;

    /* renamed from: u */
    public final ZAppCompatImageView f138796u;

    /* renamed from: v */
    public final RobotoTextView f138797v;

    /* renamed from: w */
    public final RobotoTextView f138798w;

    private C29946na(RelativeLayout relativeLayout, Button button, Button button2, Button button3, HorizontalAvatar horizontalAvatar, ZAppCompatImageView zAppCompatImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f138791p = relativeLayout;
        this.f138792q = button;
        this.f138793r = button2;
        this.f138794s = button3;
        this.f138795t = horizontalAvatar;
        this.f138796u = zAppCompatImageView;
        this.f138797v = robotoTextView;
        this.f138798w = robotoTextView2;
    }

    /* renamed from: a */
    public static C29946na m148286a(View view) {
        int i11 = AbstractC6918a0.btnClose;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btnSeeSuggestions;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.btnSkip;
                Button button3 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button3 != null) {
                    i11 = AbstractC6918a0.haListAvatar;
                    HorizontalAvatar horizontalAvatar = (HorizontalAvatar) AbstractC22716b.m117526a(view, i11);
                    if (horizontalAvatar != null) {
                        i11 = AbstractC6918a0.ivIllus;
                        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                        if (zAppCompatImageView != null) {
                            i11 = AbstractC6918a0.tvDescription;
                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView != null) {
                                i11 = AbstractC6918a0.tvTitle;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    return new C29946na((RelativeLayout) view, button, button2, button3, horizontalAvatar, zAppCompatImageView, robotoTextView, robotoTextView2);
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
    public static C29946na m148287c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.remind_clean_up_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148286a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138791p;
    }
}
