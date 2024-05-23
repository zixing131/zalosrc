package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.GlowingReddot;
import com.zing.zalo.feed.uicontrols.LottieWithImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.wd */
/* loaded from: classes3.dex */
public final class C30106wd implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139838p;

    /* renamed from: q */
    public final RelativeLayout f139839q;

    /* renamed from: r */
    public final GlowingReddot f139840r;

    /* renamed from: s */
    public final LottieWithImageView f139841s;

    /* renamed from: t */
    public final RelativeLayout f139842t;

    /* renamed from: u */
    public final RobotoTextView f139843u;

    private C30106wd(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, GlowingReddot glowingReddot, LottieWithImageView lottieWithImageView, RelativeLayout relativeLayout3, RobotoTextView robotoTextView) {
        this.f139838p = relativeLayout;
        this.f139839q = relativeLayout2;
        this.f139840r = glowingReddot;
        this.f139841s = lottieWithImageView;
        this.f139842t = relativeLayout3;
        this.f139843u = robotoTextView;
    }

    /* renamed from: a */
    public static C30106wd m148666a(View view) {
        int i11 = AbstractC6918a0.content_group;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.glowing_reddot;
            GlowingReddot glowingReddot = (GlowingReddot) AbstractC22716b.m117526a(view, i11);
            if (glowingReddot != null) {
                i11 = AbstractC6918a0.icon;
                LottieWithImageView lottieWithImageView = (LottieWithImageView) AbstractC22716b.m117526a(view, i11);
                if (lottieWithImageView != null) {
                    RelativeLayout relativeLayout2 = (RelativeLayout) view;
                    i11 = AbstractC6918a0.title;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        return new C30106wd(relativeLayout2, relativeLayout, glowingReddot, lottieWithImageView, relativeLayout2, robotoTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30106wd m148667c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.timeline_fpf_entry_promote_item_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148666a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139838p;
    }
}
