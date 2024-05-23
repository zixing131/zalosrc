package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.reddot.RedDotImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.oc */
/* loaded from: classes3.dex */
public final class C29966oc implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138897p;

    /* renamed from: q */
    public final RelativeLayout f138898q;

    /* renamed from: r */
    public final RedDotImageView f138899r;

    /* renamed from: s */
    public final RelativeLayout f138900s;

    /* renamed from: t */
    public final RobotoTextView f138901t;

    private C29966oc(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RedDotImageView redDotImageView, RelativeLayout relativeLayout3, RobotoTextView robotoTextView) {
        this.f138897p = relativeLayout;
        this.f138898q = relativeLayout2;
        this.f138899r = redDotImageView;
        this.f138900s = relativeLayout3;
        this.f138901t = robotoTextView;
    }

    /* renamed from: a */
    public static C29966oc m148333a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.more;
        RedDotImageView redDotImageView = (RedDotImageView) AbstractC22716b.m117526a(view, i11);
        if (redDotImageView != null) {
            i11 = AbstractC6918a0.moreContainer;
            RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
            if (relativeLayout2 != null) {
                i11 = AbstractC6918a0.sticker_name;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C29966oc(relativeLayout, relativeLayout, redDotImageView, relativeLayout2, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29966oc m148334c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.sticker_headeritem_container, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148333a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138897p;
    }
}
