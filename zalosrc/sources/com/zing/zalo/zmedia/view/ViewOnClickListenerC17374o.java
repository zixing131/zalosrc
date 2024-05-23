package com.zing.zalo.zmedia.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.zplayer.C17395R;
import java.util.Formatter;
import java.util.Locale;
import p500s1.C26087b;

/* renamed from: com.zing.zalo.zmedia.view.o */
/* loaded from: classes7.dex */
public class ViewOnClickListenerC17374o implements View.OnClickListener {

    /* renamed from: A */
    protected ImageView f88537A;

    /* renamed from: B */
    protected ImageView f88538B;

    /* renamed from: C */
    protected View f88539C;

    /* renamed from: D */
    protected ImageView f88540D;

    /* renamed from: E */
    protected View f88541E;

    /* renamed from: F */
    protected ImageView f88542F;

    /* renamed from: G */
    protected ProgressBar f88543G;

    /* renamed from: I */
    Animator f88545I;

    /* renamed from: J */
    protected ImageView f88546J;

    /* renamed from: K */
    protected View f88547K;

    /* renamed from: L */
    protected View f88548L;

    /* renamed from: M */
    protected View f88549M;

    /* renamed from: N */
    protected View f88550N;

    /* renamed from: O */
    protected ImageView f88551O;

    /* renamed from: P */
    protected ViewGroup.LayoutParams f88552P;

    /* renamed from: R */
    public ProgressBar f88554R;

    /* renamed from: X */
    protected Animation f88560X;

    /* renamed from: Y */
    protected Animation f88561Y;

    /* renamed from: Z */
    protected Animation f88562Z;

    /* renamed from: a0 */
    protected Animation f88563a0;

    /* renamed from: b0 */
    protected Animation f88564b0;

    /* renamed from: c0 */
    protected Animation f88565c0;

    /* renamed from: k0 */
    protected InterfaceC17372n f88573k0;

    /* renamed from: l0 */
    protected InterfaceC17372n f88574l0;

    /* renamed from: m0 */
    protected C17391z f88575m0;

    /* renamed from: q */
    protected TrackSeekBar f88577q;

    /* renamed from: r */
    public TextView f88578r;

    /* renamed from: s */
    public TextView f88579s;

    /* renamed from: t */
    protected ImageView f88580t;

    /* renamed from: u */
    protected ImageView f88581u;

    /* renamed from: v */
    public RecyclingImageView f88582v;

    /* renamed from: w */
    protected ViewGroup f88583w;

    /* renamed from: x */
    protected ViewGroup f88584x;

    /* renamed from: y */
    protected ImageView f88585y;

    /* renamed from: z */
    protected ImageView f88586z;

    /* renamed from: p */
    protected View f88576p = null;

    /* renamed from: H */
    protected ColorDrawable f88544H = new ColorDrawable(Color.parseColor("#ccffffff"));

    /* renamed from: Q */
    boolean f88553Q = true;

    /* renamed from: S */
    protected CharSequence f88555S = "Play";

    /* renamed from: T */
    protected CharSequence f88556T = "Replay";

    /* renamed from: U */
    protected CharSequence f88557U = "Pause";

    /* renamed from: d0 */
    public int f88566d0 = C17395R.drawable.btn_play_video_full;

    /* renamed from: e0 */
    public int f88567e0 = C17395R.drawable.btn_pause_video_full;

    /* renamed from: f0 */
    public int f88568f0 = C17395R.drawable.video_thumbview;

    /* renamed from: g0 */
    public int f88569g0 = C17395R.drawable.video_fullview;

    /* renamed from: h0 */
    public int f88570h0 = C17395R.drawable.btn_videosound_off;

    /* renamed from: i0 */
    public int f88571i0 = C17395R.drawable.btn_videosound_on;

    /* renamed from: j0 */
    public int f88572j0 = C17395R.drawable.icn_btn_retry_selector;

    /* renamed from: V */
    protected StringBuilder f88558V = new StringBuilder();

    /* renamed from: W */
    protected Formatter f88559W = new Formatter(this.f88558V, Locale.getDefault());

    /* renamed from: com.zing.zalo.zmedia.view.o$a */
    /* loaded from: classes7.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewOnClickListenerC17374o.this.f88576p.setBackgroundDrawable(null);
        }
    }

    public ViewOnClickListenerC17374o() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.f88560X = alphaAnimation;
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        this.f88560X.setDuration(800L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.f88561Y = alphaAnimation2;
        alphaAnimation2.setInterpolator(new AccelerateInterpolator());
        this.f88561Y.setDuration(800L);
        C26087b c26087b = new C26087b();
        this.f88562Z = new TranslateAnimation(0, 0.0f, 0, 0.0f, 2, 1.0f, 0, 0.0f);
        this.f88563a0 = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 2, 1.0f);
        this.f88562Z.setDuration(300L);
        this.f88563a0.setDuration(300L);
        this.f88562Z.setInterpolator(c26087b);
        this.f88563a0.setInterpolator(c26087b);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
        this.f88564b0 = alphaAnimation3;
        alphaAnimation3.setInterpolator(c26087b);
        this.f88564b0.setDuration(300L);
        AlphaAnimation alphaAnimation4 = new AlphaAnimation(1.0f, 0.0f);
        this.f88565c0 = alphaAnimation4;
        alphaAnimation4.setInterpolator(c26087b);
        this.f88565c0.setDuration(300L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public void mo92477A(boolean z11, boolean z12) {
        boolean z13;
        int i11;
        ViewGroup viewGroup = this.f88583w;
        int i12 = 4;
        boolean z14 = true;
        if (viewGroup != null) {
            if (viewGroup.getVisibility() == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            ViewGroup viewGroup2 = this.f88583w;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            AbstractC17358g.m92498k(viewGroup2, i11);
            if (z12 && ((z11 && !z13) || (!z11 && z13))) {
                m92514g(this.f88583w, z11);
            }
        }
        ViewGroup viewGroup3 = this.f88584x;
        if (viewGroup3 != null) {
            if (viewGroup3.getVisibility() != 0) {
                z14 = false;
            }
            ViewGroup viewGroup4 = this.f88584x;
            if (z11) {
                i12 = 0;
            }
            AbstractC17358g.m92498k(viewGroup4, i12);
            if (z12) {
                if ((z11 && !z14) || (!z11 && z14)) {
                    m92513f(this.f88584x, z11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public void m92501B(boolean z11) {
        int i11;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        AbstractC17358g.m92498k(this.f88549M, i11);
        AbstractC17358g.m92498k(this.f88551O, i11);
        if (i11 == 0) {
            AbstractC17358g.m92498k(this.f88554R, 4);
            AbstractC17358g.m92498k(this.f88546J, 4);
            AbstractC17358g.m92498k(this.f88547K, 4);
            AbstractC17358g.m92498k(this.f88548L, 4);
        }
    }

    /* renamed from: C */
    public void m92502C(boolean z11) {
        int i11;
        ProgressBar progressBar = this.f88554R;
        if (progressBar != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            if (progressBar.getVisibility() != i11) {
                AbstractC17358g.m92498k(this.f88554R, i11);
            }
        }
    }

    /* renamed from: D */
    public void m92503D(boolean z11, boolean z12) {
        RecyclingImageView recyclingImageView = this.f88582v;
        if (recyclingImageView == null) {
            return;
        }
        recyclingImageView.clearAnimation();
        if (z11) {
            AbstractC17358g.m92498k(this.f88582v, 0);
            if (z12) {
                this.f88582v.startAnimation(this.f88560X);
                return;
            }
            return;
        }
        AbstractC17358g.m92498k(this.f88582v, 4);
        if (z12) {
            this.f88582v.startAnimation(this.f88561Y);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public void m92504E(boolean z11) {
        int i11;
        if (this.f88546J != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            ProgressBar progressBar = this.f88554R;
            if (progressBar != null && progressBar.getVisibility() == 0) {
                i11 = 4;
            }
            AbstractC17358g.m92498k(this.f88546J, i11);
            if (i11 == 0) {
                AbstractC17358g.m92498k(this.f88549M, 4);
                AbstractC17358g.m92498k(this.f88551O, 4);
                AbstractC17358g.m92498k(this.f88547K, 4);
                AbstractC17358g.m92498k(this.f88548L, 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void m92505F(boolean z11) {
        int i11;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        AbstractC17358g.m92498k(this.f88547K, i11);
        AbstractC17358g.m92498k(this.f88548L, i11);
        if (i11 == 0) {
            AbstractC17358g.m92498k(this.f88549M, 4);
            AbstractC17358g.m92498k(this.f88551O, 4);
            AbstractC17358g.m92498k(this.f88546J, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G */
    public String m92506G(int i11) {
        int i12 = i11 / 1000;
        int i13 = i12 % 60;
        int i14 = (i12 / 60) % 60;
        int i15 = i12 / 3600;
        this.f88558V.setLength(0);
        if (i15 > 0) {
            return this.f88559W.format("%d:%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i14), Integer.valueOf(i13)).toString();
        }
        return this.f88559W.format("%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i13)).toString();
    }

    /* renamed from: H */
    public void m92507H() {
        View view = this.f88548L;
        if (view != null && (view instanceof ImageView)) {
            ((ImageView) view).setImageResource(this.f88572j0);
            ((ImageView) this.f88548L).setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    /* renamed from: I */
    void m92508I() {
    }

    /* renamed from: a */
    protected int m92509a(boolean z11) {
        return z11 ? this.f88568f0 : this.f88569g0;
    }

    /* renamed from: b */
    protected int m92510b(boolean z11) {
        return z11 ? this.f88567e0 : this.f88566d0;
    }

    /* renamed from: c */
    public int m92511c() {
        ImageView imageView = this.f88546J;
        if (imageView != null) {
            return imageView.getVisibility();
        }
        return -1;
    }

    /* renamed from: d */
    public void mo92478d(View view) {
        ViewGroup.LayoutParams layoutParams;
        this.f88576p = view;
        this.f88583w = (ViewGroup) view.findViewById(C17395R.id.video_bottom_control_layout);
        this.f88584x = (ViewGroup) this.f88576p.findViewById(C17395R.id.video_center_control_layout);
        this.f88540D = (ImageView) this.f88576p.findViewById(C17395R.id.video_btn_mute);
        RecyclingImageView recyclingImageView = (RecyclingImageView) this.f88576p.findViewById(C17395R.id.video_imv_loading);
        this.f88582v = recyclingImageView;
        if (recyclingImageView != null && (layoutParams = this.f88552P) != null) {
            recyclingImageView.setLayoutParams(layoutParams);
        }
        this.f88554R = (ProgressBar) this.f88576p.findViewById(C17395R.id.video_loading_progress_bar);
        this.f88549M = this.f88576p.findViewById(C17395R.id.video_error_layout);
        this.f88551O = (ImageView) this.f88576p.findViewById(C17395R.id.video_imv_error);
        this.f88581u = (ImageView) this.f88576p.findViewById(C17395R.id.video_btn_fullscreen);
        this.f88546J = (ImageView) this.f88576p.findViewById(C17395R.id.video_btn_play);
        this.f88547K = this.f88576p.findViewById(C17395R.id.video_retry_layout);
        View findViewById = this.f88576p.findViewById(C17395R.id.video_btn_retry);
        this.f88548L = findViewById;
        if (findViewById instanceof ImageView) {
            ((ImageView) findViewById).setImageResource(this.f88572j0);
        }
        this.f88585y = (ImageView) this.f88576p.findViewById(C17395R.id.video_btn_fast_forward);
        this.f88586z = (ImageView) this.f88576p.findViewById(C17395R.id.video_btn_rewind);
        this.f88537A = (ImageView) this.f88576p.findViewById(C17395R.id.video_btn_next);
        this.f88538B = (ImageView) this.f88576p.findViewById(C17395R.id.video_btn_previous);
        TrackSeekBar trackSeekBar = (TrackSeekBar) this.f88576p.findViewById(C17395R.id.video_progress_bar);
        this.f88577q = trackSeekBar;
        if (trackSeekBar != null) {
            trackSeekBar.setMax(1000);
        }
        this.f88578r = (TextView) this.f88576p.findViewById(C17395R.id.video_tv_duration);
        this.f88579s = (TextView) this.f88576p.findViewById(C17395R.id.video_tv_current);
        this.f88580t = (ImageView) this.f88576p.findViewById(C17395R.id.video_btn_setting);
        this.f88539C = this.f88576p.findViewById(C17395R.id.video_btn_close);
        this.f88541E = this.f88576p.findViewById(C17395R.id.video_layout_snapshot);
        this.f88542F = (ImageView) this.f88576p.findViewById(C17395R.id.video_btn_snapshot);
        this.f88543G = (ProgressBar) this.f88576p.findViewById(C17395R.id.video_progress_bar_snapshot);
        m92517j(this.f88540D);
        m92517j(this.f88581u);
        m92517j(this.f88546J);
        m92517j(this.f88548L);
        m92517j(this.f88585y);
        m92517j(this.f88586z);
        m92517j(this.f88537A);
        m92517j(this.f88538B);
        m92517j(this.f88580t);
        m92517j(this.f88539C);
        m92517j(this.f88550N);
        m92517j(this.f88542F);
    }

    /* renamed from: e */
    public void m92512e() {
        TrackSeekBar trackSeekBar = this.f88577q;
        if (trackSeekBar != null) {
            trackSeekBar.setProgress(0);
            this.f88577q.setSecondaryProgress(0);
        }
        TextView textView = this.f88578r;
        if (textView != null) {
            textView.setText(m92506G(0));
        }
        TextView textView2 = this.f88579s;
        if (textView2 != null) {
            textView2.setText(m92506G(0));
        }
    }

    /* renamed from: f */
    public void m92513f(View view, boolean z11) {
        Animation animation;
        Animation animation2;
        if (view != null) {
            view.clearAnimation();
            if (z11 && (animation2 = this.f88564b0) != null) {
                view.startAnimation(animation2);
            } else if (!z11 && (animation = this.f88565c0) != null) {
                view.startAnimation(animation);
            }
        }
    }

    /* renamed from: g */
    public void m92514g(View view, boolean z11) {
        Animation animation;
        Animation animation2;
        if (view != null) {
            view.clearAnimation();
            if (z11 && (animation2 = this.f88562Z) != null) {
                view.startAnimation(animation2);
            } else if (!z11 && (animation = this.f88563a0) != null) {
                view.startAnimation(animation);
            }
        }
    }

    /* renamed from: h */
    public void m92515h(boolean z11) {
        this.f88553Q = z11;
        if (!z11) {
            RecyclingImageView recyclingImageView = this.f88582v;
            if (recyclingImageView != null) {
                recyclingImageView.setImageDrawable(null);
            }
            ProgressBar progressBar = this.f88554R;
            if (progressBar != null) {
                progressBar.setIndeterminateDrawable(null);
            }
        }
    }

    /* renamed from: i */
    public void m92516i(View.OnClickListener onClickListener) {
        View view = this.f88539C;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: j */
    void m92517j(View view) {
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    /* renamed from: k */
    public void m92518k(int i11, int i12, int i13, int i14) {
        ViewGroup viewGroup = this.f88583w;
        if (viewGroup != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.setMargins(i11, 0, i13, i14);
            this.f88583w.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: l */
    public void m92519l(long j11) {
        TextView textView = this.f88579s;
        if (textView != null) {
            textView.setText(m92506G((int) j11));
        }
    }

    /* renamed from: m */
    public void m92520m(boolean z11) {
        int i11;
        ImageView imageView = this.f88581u;
        if (imageView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            this.f88581u.setEnabled(z11);
        }
        m92508I();
    }

    /* renamed from: n */
    public void m92521n(boolean z11) {
        int i11;
        View view = this.f88541E;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
            ImageView imageView = this.f88542F;
            if (imageView != null) {
                imageView.setEnabled(z11);
            }
        }
        m92508I();
    }

    /* renamed from: o */
    public void m92522o(boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        ImageView imageView = this.f88546J;
        int i22 = 4;
        if (imageView != null) {
            imageView.setEnabled(z11);
            ImageView imageView2 = this.f88546J;
            if (z11) {
                i21 = 0;
            } else {
                i21 = 4;
            }
            imageView2.setVisibility(i21);
        }
        ImageView imageView3 = this.f88585y;
        if (imageView3 != null) {
            imageView3.setEnabled(z11);
            ImageView imageView4 = this.f88585y;
            if (z11) {
                i19 = 0;
            } else {
                i19 = 4;
            }
            imageView4.setVisibility(i19);
        }
        ImageView imageView5 = this.f88586z;
        if (imageView5 != null) {
            imageView5.setEnabled(z11);
            ImageView imageView6 = this.f88586z;
            if (z11) {
                i18 = 0;
            } else {
                i18 = 4;
            }
            imageView6.setVisibility(i18);
        }
        ImageView imageView7 = this.f88537A;
        if (imageView7 != null) {
            imageView7.setEnabled(z11);
            ImageView imageView8 = this.f88537A;
            if (z11) {
                i17 = 0;
            } else {
                i17 = 4;
            }
            imageView8.setVisibility(i17);
        }
        ImageView imageView9 = this.f88538B;
        if (imageView9 != null) {
            imageView9.setEnabled(z11);
            ImageView imageView10 = this.f88538B;
            if (z11) {
                i16 = 0;
            } else {
                i16 = 4;
            }
            imageView10.setVisibility(i16);
        }
        TrackSeekBar trackSeekBar = this.f88577q;
        if (trackSeekBar != null) {
            trackSeekBar.setEnabled(z11);
            TrackSeekBar trackSeekBar2 = this.f88577q;
            if (z11) {
                i15 = 0;
            } else {
                i15 = 4;
            }
            trackSeekBar2.setVisibility(i15);
        }
        ImageView imageView11 = this.f88580t;
        if (imageView11 != null) {
            imageView11.setEnabled(z11);
            ImageView imageView12 = this.f88580t;
            if (z11) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            imageView12.setVisibility(i14);
        }
        ImageView imageView13 = this.f88581u;
        if (imageView13 != null) {
            imageView13.setEnabled(z11);
            ImageView imageView14 = this.f88581u;
            if (z11) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            imageView14.setVisibility(i13);
        }
        TextView textView = this.f88578r;
        if (textView != null) {
            textView.setEnabled(z11);
            TextView textView2 = this.f88578r;
            if (z11) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            textView2.setVisibility(i12);
        }
        TextView textView3 = this.f88579s;
        if (textView3 != null) {
            textView3.setEnabled(z11);
            TextView textView4 = this.f88579s;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            textView4.setVisibility(i11);
        }
        ImageView imageView15 = this.f88542F;
        if (imageView15 != null) {
            imageView15.setEnabled(z11);
            ImageView imageView16 = this.f88542F;
            if (z11) {
                i22 = 0;
            }
            imageView16.setVisibility(i22);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC17372n interfaceC17372n;
        InterfaceC17372n interfaceC17372n2 = this.f88574l0;
        if ((interfaceC17372n2 == null || !interfaceC17372n2.mo79717k3(view)) && (interfaceC17372n = this.f88573k0) != null) {
            interfaceC17372n.mo79717k3(view);
        }
    }

    /* renamed from: p */
    public void m92523p(InterfaceC17372n interfaceC17372n) {
        this.f88574l0 = interfaceC17372n;
    }

    /* renamed from: q */
    public void m92524q(boolean z11) {
        ImageView imageView = this.f88581u;
        if (imageView != null) {
            imageView.setImageResource(m92509a(z11));
        }
    }

    /* renamed from: r */
    public void m92525r(boolean z11) {
        int i11;
        ImageView imageView = this.f88540D;
        if (imageView != null) {
            if (z11) {
                i11 = this.f88570h0;
            } else {
                i11 = this.f88571i0;
            }
            imageView.setImageResource(i11);
        }
    }

    /* renamed from: s */
    public void m92526s(boolean z11) {
        ImageView imageView = this.f88546J;
        if (imageView != null) {
            imageView.setImageResource(m92510b(z11));
            if (z11) {
                this.f88546J.setContentDescription(this.f88557U);
            } else {
                this.f88546J.setContentDescription(this.f88555S);
            }
        }
    }

    /* renamed from: t */
    public void m92527t(C3979l c3979l) {
        RecyclingImageView recyclingImageView = this.f88582v;
        if (recyclingImageView != null) {
            recyclingImageView.setImageInfo(c3979l);
        }
    }

    /* renamed from: u */
    public void m92528u(ViewGroup.LayoutParams layoutParams) {
        this.f88552P = layoutParams;
        RecyclingImageView recyclingImageView = this.f88582v;
        if (recyclingImageView != null) {
            recyclingImageView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: v */
    public void m92529v(ImageView.ScaleType scaleType) {
        RecyclingImageView recyclingImageView = this.f88582v;
        if (recyclingImageView != null) {
            recyclingImageView.setScaleType(scaleType);
        }
    }

    /* renamed from: w */
    public void m92530w(long j11, long j12, int i11) {
        TrackSeekBar trackSeekBar = this.f88577q;
        if (trackSeekBar != null) {
            if (j11 > 0) {
                trackSeekBar.setProgress((int) ((1000 * j12) / j11));
            }
            this.f88577q.setSecondaryProgress(i11 * 10);
        }
        if (this.f88578r != null) {
            String m92506G = m92506G((int) j11);
            if (!m92506G.equals(this.f88578r.getText())) {
                this.f88578r.setText(m92506G);
            }
        }
        if (this.f88579s != null) {
            String m92506G2 = m92506G((int) j12);
            if (!m92506G2.equals(this.f88579s.getText())) {
                this.f88579s.setText(m92506G2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public void m92531x(boolean z11) {
        int i11;
        ImageView imageView = this.f88542F;
        int i12 = 8;
        if (imageView != null) {
            imageView.setEnabled(!z11);
            ImageView imageView2 = this.f88542F;
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            imageView2.setVisibility(i11);
        }
        ProgressBar progressBar = this.f88543G;
        if (progressBar != null) {
            if (z11) {
                i12 = 0;
            }
            progressBar.setVisibility(i12);
        }
        Animator animator = this.f88545I;
        if (animator == null || !animator.isRunning()) {
            if (z11) {
                this.f88576p.setBackgroundDrawable(this.f88544H);
                this.f88544H.setAlpha(0);
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f88544H, "alpha", 0, 255, 0);
                this.f88545I = ofInt;
                ofInt.setDuration(150L);
                this.f88545I.addListener(new a());
                this.f88545I.start();
                return;
            }
            this.f88576p.setBackgroundDrawable(null);
            Animator animator2 = this.f88545I;
            if (animator2 != null && animator2.isRunning()) {
                this.f88545I.cancel();
            }
        }
    }

    /* renamed from: y */
    public void mo92479y(C17391z c17391z) {
        this.f88575m0 = c17391z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public void mo92480z(boolean z11) {
        int i11;
        if (this.f88584x != null) {
            int i12 = 4;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            ProgressBar progressBar = this.f88554R;
            if (progressBar == null || progressBar.getVisibility() != 0) {
                i12 = i11;
            }
            AbstractC17358g.m92498k(this.f88584x, i12);
        }
    }
}
