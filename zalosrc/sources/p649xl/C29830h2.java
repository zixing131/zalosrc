package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.GlowingReddot;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zlottie.widget.LottieImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.h2 */
/* loaded from: classes3.dex */
public final class C29830h2 implements InterfaceC22715a {

    /* renamed from: A */
    public final GlowingReddot f137943A;

    /* renamed from: B */
    public final Switch f137944B;

    /* renamed from: C */
    public final RobotoTextView f137945C;

    /* renamed from: D */
    public final RobotoTextView f137946D;

    /* renamed from: E */
    public final RobotoTextView f137947E;

    /* renamed from: F */
    public final RobotoTextView f137948F;

    /* renamed from: G */
    public final RobotoTextView f137949G;

    /* renamed from: p */
    private final HorizontalScrollView f137950p;

    /* renamed from: q */
    public final HorizontalScrollView f137951q;

    /* renamed from: r */
    public final AppCompatImageView f137952r;

    /* renamed from: s */
    public final ImageView f137953s;

    /* renamed from: t */
    public final RelativeLayout f137954t;

    /* renamed from: u */
    public final LinearLayout f137955u;

    /* renamed from: v */
    public final RelativeLayout f137956v;

    /* renamed from: w */
    public final LinearLayout f137957w;

    /* renamed from: x */
    public final LinearLayout f137958x;

    /* renamed from: y */
    public final LinearLayout f137959y;

    /* renamed from: z */
    public final LottieImageView f137960z;

    private C29830h2(HorizontalScrollView horizontalScrollView, HorizontalScrollView horizontalScrollView2, AppCompatImageView appCompatImageView, ImageView imageView, RelativeLayout relativeLayout, LinearLayout linearLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LottieImageView lottieImageView, GlowingReddot glowingReddot, Switch r15, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5) {
        this.f137950p = horizontalScrollView;
        this.f137951q = horizontalScrollView2;
        this.f137952r = appCompatImageView;
        this.f137953s = imageView;
        this.f137954t = relativeLayout;
        this.f137955u = linearLayout;
        this.f137956v = relativeLayout2;
        this.f137957w = linearLayout2;
        this.f137958x = linearLayout3;
        this.f137959y = linearLayout4;
        this.f137960z = lottieImageView;
        this.f137943A = glowingReddot;
        this.f137944B = r15;
        this.f137945C = robotoTextView;
        this.f137946D = robotoTextView2;
        this.f137947E = robotoTextView3;
        this.f137948F = robotoTextView4;
        this.f137949G = robotoTextView5;
    }

    /* renamed from: a */
    public static C29830h2 m148018a(View view) {
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view;
        int i11 = AbstractC6918a0.image_layout;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageView != null) {
            i11 = AbstractC6918a0.image_music;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC6918a0.layout_change_multi_photo_layout;
                RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                if (relativeLayout != null) {
                    i11 = AbstractC6918a0.layout_lyric;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC6918a0.layout_music;
                        RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                        if (relativeLayout2 != null) {
                            i11 = AbstractC6918a0.layout_not_lyric;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout2 != null) {
                                i11 = AbstractC6918a0.layout_select_multi_photo_layout;
                                LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout3 != null) {
                                    i11 = AbstractC6918a0.layout_select_music;
                                    LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                    if (linearLayout4 != null) {
                                        i11 = AbstractC6918a0.lottie_music;
                                        LottieImageView lottieImageView = (LottieImageView) AbstractC22716b.m117526a(view, i11);
                                        if (lottieImageView != null) {
                                            i11 = AbstractC6918a0.music_reddot;
                                            GlowingReddot glowingReddot = (GlowingReddot) AbstractC22716b.m117526a(view, i11);
                                            if (glowingReddot != null) {
                                                i11 = AbstractC6918a0.switch_lyric;
                                                Switch r13 = (Switch) AbstractC22716b.m117526a(view, i11);
                                                if (r13 != null) {
                                                    i11 = AbstractC6918a0.tag_friend;
                                                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView != null) {
                                                        i11 = AbstractC6918a0.tv_change_layout;
                                                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView2 != null) {
                                                            i11 = AbstractC6918a0.tvLyric;
                                                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                            if (robotoTextView3 != null) {
                                                                i11 = AbstractC6918a0.tv_select_album;
                                                                RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                if (robotoTextView4 != null) {
                                                                    i11 = AbstractC6918a0.tv_select_music;
                                                                    RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                    if (robotoTextView5 != null) {
                                                                        return new C29830h2(horizontalScrollView, horizontalScrollView, appCompatImageView, imageView, relativeLayout, linearLayout, relativeLayout2, linearLayout2, linearLayout3, linearLayout4, lottieImageView, glowingReddot, r13, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4, robotoTextView5);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static C29830h2 m148019c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.compose_feed_button_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148018a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public HorizontalScrollView getRoot() {
        return this.f137950p;
    }
}
