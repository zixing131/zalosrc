package com.zing.zalo.zdesign.component.navigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zlottie.widget.LottieImageView;
import fn0.AbstractC19074t;
import ui0.C27276c;

/* loaded from: classes7.dex */
public final class NavigationTab extends FrameLayout {

    /* renamed from: A */
    private int f87061A;

    /* renamed from: p */
    public RobotoTextView f87062p;

    /* renamed from: q */
    public RelativeLayout f87063q;

    /* renamed from: r */
    public ImageView f87064r;

    /* renamed from: s */
    public LottieImageView f87065s;

    /* renamed from: t */
    private boolean f87066t;

    /* renamed from: u */
    private int f87067u;

    /* renamed from: v */
    private int f87068v;

    /* renamed from: w */
    private float f87069w;

    /* renamed from: x */
    private int f87070x;

    /* renamed from: y */
    private int f87071y;

    /* renamed from: z */
    private int f87072z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationTab(Context context, int i11) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        try {
            this.f87067u = i11;
            LayoutInflater.from(context).inflate(AbstractC2812f.navigation_tab_content, this);
            View findViewById = findViewById(AbstractC2811e.navbar_tv_title);
            AbstractC19074t.m100207e(findViewById, "findViewById(R.id.navbar_tv_title)");
            setTvTitle((RobotoTextView) findViewById);
            View findViewById2 = findViewById(AbstractC2811e.navbar_image_layout);
            AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.navbar_image_layout)");
            setImageWithDot((RelativeLayout) findViewById2);
            View findViewById3 = getImageWithDot().findViewById(AbstractC2811e.navbar_icon);
            AbstractC19074t.m100207e(findViewById3, "imageWithDot.findViewById(R.id.navbar_icon)");
            setImageView((ImageView) findViewById3);
            View findViewById4 = getImageWithDot().findViewById(AbstractC2811e.navbar_icon_active);
            AbstractC19074t.m100207e(findViewById4, "imageWithDot.findViewById(R.id.navbar_icon_active)");
            setImageViewActive((LottieImageView) findViewById4);
            getImageViewActive().setVisibility(4);
            setBackground(AbstractC2816j.Companion.m13594c(context, AbstractC2807a.bottom_navigation_bg));
            this.f87068v = C27276c.m139648a(context, 8.0f);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void m91107a(int i11, int i12) {
        if (this.f87070x != i11 || this.f87071y != i12) {
            this.f87070x = i11;
            this.f87071y = i12;
            setProgress(this.f87069w);
        }
    }

    public final Badge getBadge() {
        View findViewById = findViewById(AbstractC2811e.navbar_badge);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.navbar_badge)");
        return (Badge) findViewById;
    }

    public final float getCurrentProgress() {
        return this.f87069w;
    }

    public final int getIconMaxTranslationY() {
        return this.f87068v;
    }

    public final View getIconView() {
        return getImageWithDot();
    }

    public final ImageView getImageView() {
        ImageView imageView = this.f87064r;
        if (imageView != null) {
            return imageView;
        }
        AbstractC19074t.m100223u("imageView");
        return null;
    }

    public final LottieImageView getImageViewActive() {
        LottieImageView lottieImageView = this.f87065s;
        if (lottieImageView != null) {
            return lottieImageView;
        }
        AbstractC19074t.m100223u("imageViewActive");
        return null;
    }

    public final RelativeLayout getImageWithDot() {
        RelativeLayout relativeLayout = this.f87063q;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        AbstractC19074t.m100223u("imageWithDot");
        return null;
    }

    public final int getPosition() {
        return this.f87067u;
    }

    public final int getTabMaxWidth() {
        return this.f87071y;
    }

    public final int getTabWidth() {
        return this.f87070x;
    }

    public final int getTextColorActived() {
        return this.f87061A;
    }

    public final int getTextColorNormal() {
        return this.f87072z;
    }

    public final RobotoTextView getTvTitle() {
        RobotoTextView robotoTextView = this.f87062p;
        if (robotoTextView != null) {
            return robotoTextView;
        }
        AbstractC19074t.m100223u("tvTitle");
        return null;
    }

    public final void setCurrentProgress(float f11) {
        this.f87069w = f11;
    }

    public final void setEnableLottieAnimation(boolean z11) {
        this.f87066t = z11;
    }

    public final void setIconMaxTranslationY(int i11) {
        this.f87068v = i11;
    }

    public final void setImageView(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f87064r = imageView;
    }

    public final void setImageViewActive(LottieImageView lottieImageView) {
        AbstractC19074t.m100208f(lottieImageView, "<set-?>");
        this.f87065s = lottieImageView;
    }

    public final void setImageWithDot(RelativeLayout relativeLayout) {
        AbstractC19074t.m100208f(relativeLayout, "<set-?>");
        this.f87063q = relativeLayout;
    }

    public final void setPosition(int i11) {
        this.f87067u = i11;
    }

    public final void setProgress(float f11) {
        ViewGroup.LayoutParams layoutParams;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        try {
            this.f87069w = f11;
            if (this.f87070x > 0 && this.f87071y > 0 && (layoutParams = getLayoutParams()) != null) {
                layoutParams.width = (int) (this.f87070x + ((this.f87071y - r2) * f11));
                setLayoutParams(layoutParams);
                if (f11 > 0.5f) {
                    getImageView().setVisibility(4);
                    getImageViewActive().setVisibility(0);
                    getImageViewActive().setAlpha(f11);
                    getTvTitle().setTextColor(this.f87061A);
                    if (this.f87066t) {
                        getImageViewActive().m92155v();
                    }
                } else {
                    getImageViewActive().setVisibility(4);
                    getImageView().setVisibility(0);
                    getImageView().setAlpha(1.0f - f11);
                    getTvTitle().setTextColor(this.f87072z);
                    if (this.f87066t) {
                        getImageViewActive().m92150E();
                    }
                }
                if (f11 > 0.65f) {
                    getTvTitle().setAlpha((f11 - 0.65f) * 2.857143f);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void setTabMaxWidth(int i11) {
        this.f87071y = i11;
    }

    public final void setTabWidth(int i11) {
        this.f87070x = i11;
    }

    public final void setTextColorActived(int i11) {
        this.f87061A = i11;
    }

    public final void setTextColorNormal(int i11) {
        this.f87072z = i11;
    }

    public final void setTvTitle(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f87062p = robotoTextView;
    }
}
