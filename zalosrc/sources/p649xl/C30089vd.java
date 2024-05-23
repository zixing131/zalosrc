package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.formpostfeed.p063ui.FpfPromoteCtaLayout;
import com.zing.zalo.feed.uicontrols.LottieWithImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.vd */
/* loaded from: classes3.dex */
public final class C30089vd implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139709p;

    /* renamed from: q */
    public final LottieWithImageView f139710q;

    /* renamed from: r */
    public final RecyclingImageView f139711r;

    /* renamed from: s */
    public final View f139712s;

    /* renamed from: t */
    public final RobotoTextView f139713t;

    /* renamed from: u */
    public final RobotoTextView f139714u;

    /* renamed from: v */
    public final LottieWithImageView f139715v;

    /* renamed from: w */
    public final RelativeLayout f139716w;

    /* renamed from: x */
    public final FpfPromoteCtaLayout f139717x;

    /* renamed from: y */
    public final LottieWithImageView f139718y;

    /* renamed from: z */
    public final View f139719z;

    private C30089vd(RelativeLayout relativeLayout, LottieWithImageView lottieWithImageView, RecyclingImageView recyclingImageView, View view, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, LottieWithImageView lottieWithImageView2, RelativeLayout relativeLayout2, FpfPromoteCtaLayout fpfPromoteCtaLayout, LottieWithImageView lottieWithImageView3, View view2) {
        this.f139709p = relativeLayout;
        this.f139710q = lottieWithImageView;
        this.f139711r = recyclingImageView;
        this.f139712s = view;
        this.f139713t = robotoTextView;
        this.f139714u = robotoTextView2;
        this.f139715v = lottieWithImageView2;
        this.f139716w = relativeLayout2;
        this.f139717x = fpfPromoteCtaLayout;
        this.f139718y = lottieWithImageView3;
        this.f139719z = view2;
    }

    /* renamed from: a */
    public static C30089vd m148628a(View view) {
        View m117526a;
        View m117526a2;
        int i11 = AbstractC6918a0.avatar;
        LottieWithImageView lottieWithImageView = (LottieWithImageView) AbstractC22716b.m117526a(view, i11);
        if (lottieWithImageView != null) {
            i11 = AbstractC6918a0.background_image;
            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.bottom_anchor))) != null) {
                i11 = AbstractC6918a0.greet_text;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.hint_text;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.left_decor;
                        LottieWithImageView lottieWithImageView2 = (LottieWithImageView) AbstractC22716b.m117526a(view, i11);
                        if (lottieWithImageView2 != null) {
                            i11 = AbstractC6918a0.post_triggering;
                            RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                            if (relativeLayout != null) {
                                i11 = AbstractC6918a0.promote_layout;
                                FpfPromoteCtaLayout fpfPromoteCtaLayout = (FpfPromoteCtaLayout) AbstractC22716b.m117526a(view, i11);
                                if (fpfPromoteCtaLayout != null) {
                                    i11 = AbstractC6918a0.right_decor;
                                    LottieWithImageView lottieWithImageView3 = (LottieWithImageView) AbstractC22716b.m117526a(view, i11);
                                    if (lottieWithImageView3 != null && (m117526a2 = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.top_anchor))) != null) {
                                        return new C30089vd((RelativeLayout) view, lottieWithImageView, recyclingImageView, m117526a, robotoTextView, robotoTextView2, lottieWithImageView2, relativeLayout, fpfPromoteCtaLayout, lottieWithImageView3, m117526a2);
                                    }
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
    public static C30089vd m148629c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.timeline_fpf_entry_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148628a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139709p;
    }
}
