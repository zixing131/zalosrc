package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.CircleImageView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.slider.ZdsSlider;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.da */
/* loaded from: classes3.dex */
public final class C29766da implements InterfaceC22715a {

    /* renamed from: A */
    public final ImageView f137531A;

    /* renamed from: B */
    public final ImageView f137532B;

    /* renamed from: C */
    public final FrameLayout f137533C;

    /* renamed from: D */
    public final ProgressBar f137534D;

    /* renamed from: E */
    public final AppCompatImageView f137535E;

    /* renamed from: F */
    public final LinearLayout f137536F;

    /* renamed from: G */
    public final RelativeLayout f137537G;

    /* renamed from: H */
    public final RelativeLayout f137538H;

    /* renamed from: I */
    public final RelativeLayout f137539I;

    /* renamed from: J */
    public final ZdsSlider f137540J;

    /* renamed from: K */
    public final RobotoTextView f137541K;

    /* renamed from: L */
    public final RobotoTextView f137542L;

    /* renamed from: M */
    public final RobotoTextView f137543M;

    /* renamed from: N */
    public final RobotoTextView f137544N;

    /* renamed from: O */
    public final RobotoTextView f137545O;

    /* renamed from: p */
    private final View f137546p;

    /* renamed from: q */
    public final Button f137547q;

    /* renamed from: r */
    public final LinearLayout f137548r;

    /* renamed from: s */
    public final CircleImageView f137549s;

    /* renamed from: t */
    public final LinearLayout f137550t;

    /* renamed from: u */
    public final LinearLayout f137551u;

    /* renamed from: v */
    public final View f137552v;

    /* renamed from: w */
    public final RelativeLayout f137553w;

    /* renamed from: x */
    public final RecyclingImageView f137554x;

    /* renamed from: y */
    public final ImageView f137555y;

    /* renamed from: z */
    public final RecyclingImageView f137556z;

    private C29766da(View view, Button button, LinearLayout linearLayout, CircleImageView circleImageView, LinearLayout linearLayout2, LinearLayout linearLayout3, View view2, RelativeLayout relativeLayout, RecyclingImageView recyclingImageView, ImageView imageView, RecyclingImageView recyclingImageView2, ImageView imageView2, ImageView imageView3, FrameLayout frameLayout, ProgressBar progressBar, AppCompatImageView appCompatImageView, LinearLayout linearLayout4, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, ZdsSlider zdsSlider, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5) {
        this.f137546p = view;
        this.f137547q = button;
        this.f137548r = linearLayout;
        this.f137549s = circleImageView;
        this.f137550t = linearLayout2;
        this.f137551u = linearLayout3;
        this.f137552v = view2;
        this.f137553w = relativeLayout;
        this.f137554x = recyclingImageView;
        this.f137555y = imageView;
        this.f137556z = recyclingImageView2;
        this.f137531A = imageView2;
        this.f137532B = imageView3;
        this.f137533C = frameLayout;
        this.f137534D = progressBar;
        this.f137535E = appCompatImageView;
        this.f137536F = linearLayout4;
        this.f137537G = relativeLayout2;
        this.f137538H = relativeLayout3;
        this.f137539I = relativeLayout4;
        this.f137540J = zdsSlider;
        this.f137541K = robotoTextView;
        this.f137542L = robotoTextView2;
        this.f137543M = robotoTextView3;
        this.f137544N = robotoTextView4;
        this.f137545O = robotoTextView5;
    }

    /* renamed from: a */
    public static C29766da m147858a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_footer_action;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_post_on_timeline;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.btn_remove_song;
                CircleImageView circleImageView = (CircleImageView) AbstractC22716b.m117526a(view, i11);
                if (circleImageView != null) {
                    i11 = AbstractC6918a0.btn_select_song;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout2 != null) {
                        i11 = AbstractC6918a0.btn_zing_mp3;
                        LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout3 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.divider))) != null) {
                            i11 = AbstractC6918a0.footer_action_container;
                            RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                            if (relativeLayout != null) {
                                i11 = AbstractC6918a0.img_media_thumb;
                                RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                                if (recyclingImageView != null) {
                                    i11 = AbstractC6918a0.img_mp3_icon;
                                    ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                                    if (imageView != null) {
                                        i11 = AbstractC6918a0.imv_footer;
                                        RecyclingImageView recyclingImageView2 = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                                        if (recyclingImageView2 != null) {
                                            i11 = AbstractC6918a0.imv_melody;
                                            ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                            if (imageView2 != null) {
                                                i11 = AbstractC6918a0.imv_post;
                                                ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                                if (imageView3 != null) {
                                                    i11 = AbstractC6918a0.music_player_button_container;
                                                    FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                                    if (frameLayout != null) {
                                                        i11 = AbstractC6918a0.music_player_loading;
                                                        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                                                        if (progressBar != null) {
                                                            i11 = AbstractC6918a0.music_player_play_button;
                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                                                            if (appCompatImageView != null) {
                                                                i11 = AbstractC6918a0.profile_music_function_container;
                                                                LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                                if (linearLayout4 != null) {
                                                                    i11 = AbstractC6918a0.song_control;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                                                    if (relativeLayout2 != null) {
                                                                        i11 = AbstractC6918a0.song_detail;
                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                                                        if (relativeLayout3 != null) {
                                                                            i11 = AbstractC6918a0.song_info;
                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                                                            if (relativeLayout4 != null) {
                                                                                i11 = AbstractC6918a0.song_slider;
                                                                                ZdsSlider zdsSlider = (ZdsSlider) AbstractC22716b.m117526a(view, i11);
                                                                                if (zdsSlider != null) {
                                                                                    i11 = AbstractC6918a0.tv_btn_right;
                                                                                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                                    if (robotoTextView != null) {
                                                                                        i11 = AbstractC6918a0.tv_footer_action;
                                                                                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                                        if (robotoTextView2 != null) {
                                                                                            i11 = AbstractC6918a0.tv_select_song;
                                                                                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                                            if (robotoTextView3 != null) {
                                                                                                i11 = AbstractC6918a0.tv_singer_name;
                                                                                                RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                if (robotoTextView4 != null) {
                                                                                                    i11 = AbstractC6918a0.tv_song_name;
                                                                                                    RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                    if (robotoTextView5 != null) {
                                                                                                        return new C29766da(view, button, linearLayout, circleImageView, linearLayout2, linearLayout3, m117526a, relativeLayout, recyclingImageView, imageView, recyclingImageView2, imageView2, imageView3, frameLayout, progressBar, appCompatImageView, linearLayout4, relativeLayout2, relativeLayout3, relativeLayout4, zdsSlider, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4, robotoTextView5);
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

    /* renamed from: b */
    public static C29766da m147859b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.profile_music_player_view, viewGroup);
            return m147858a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f137546p;
    }
}
