package com.zing.zalo.zmedia.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.zplayer.C17395R;
import java.util.Formatter;
import java.util.Locale;
import p500s1.C26087b;

/* renamed from: com.zing.zalo.zmedia.view.b */
/* loaded from: classes7.dex */
public class ViewOnClickListenerC17348b implements View.OnClickListener {

    /* renamed from: D */
    protected Animation f88465D;

    /* renamed from: E */
    protected Animation f88466E;

    /* renamed from: F */
    protected Animation f88467F;

    /* renamed from: G */
    protected Animation f88468G;

    /* renamed from: H */
    protected Animation f88469H;

    /* renamed from: I */
    protected Animation f88470I;

    /* renamed from: N */
    protected InterfaceC17346a f88475N;

    /* renamed from: O */
    protected InterfaceC17346a f88476O;

    /* renamed from: P */
    protected C17391z f88477P;

    /* renamed from: q */
    public RecyclingImageView f88479q;

    /* renamed from: r */
    protected ImageView f88480r;

    /* renamed from: s */
    protected ViewGroup f88481s;

    /* renamed from: t */
    protected ImageView f88482t;

    /* renamed from: u */
    protected ImageView f88483u;

    /* renamed from: v */
    protected ViewGroup.LayoutParams f88484v;

    /* renamed from: x */
    public ProgressBar f88486x;

    /* renamed from: p */
    protected View f88478p = null;

    /* renamed from: w */
    boolean f88485w = true;

    /* renamed from: y */
    protected CharSequence f88487y = "Play";

    /* renamed from: z */
    protected CharSequence f88488z = "Replay";

    /* renamed from: A */
    protected CharSequence f88462A = "Pause";

    /* renamed from: J */
    public int f88471J = C17395R.drawable.btn_play_video_full;

    /* renamed from: K */
    public int f88472K = C17395R.drawable.btn_pause_video_full;

    /* renamed from: L */
    public int f88473L = C17395R.drawable.video_thumbview;

    /* renamed from: M */
    public int f88474M = C17395R.drawable.video_fullview;

    /* renamed from: B */
    protected StringBuilder f88463B = new StringBuilder();

    /* renamed from: C */
    protected Formatter f88464C = new Formatter(this.f88463B, Locale.getDefault());

    public ViewOnClickListenerC17348b() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.f88465D = alphaAnimation;
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        this.f88465D.setDuration(800L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.f88466E = alphaAnimation2;
        alphaAnimation2.setInterpolator(new AccelerateInterpolator());
        this.f88466E.setDuration(800L);
        C26087b c26087b = new C26087b();
        this.f88467F = new TranslateAnimation(0, 0.0f, 0, 0.0f, 2, 1.0f, 0, 0.0f);
        this.f88468G = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 2, 1.0f);
        this.f88467F.setDuration(300L);
        this.f88468G.setDuration(300L);
        this.f88467F.setInterpolator(c26087b);
        this.f88468G.setInterpolator(c26087b);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
        this.f88469H = alphaAnimation3;
        alphaAnimation3.setInterpolator(c26087b);
        this.f88469H.setDuration(300L);
        AlphaAnimation alphaAnimation4 = new AlphaAnimation(1.0f, 0.0f);
        this.f88470I = alphaAnimation4;
        alphaAnimation4.setInterpolator(c26087b);
        this.f88470I.setDuration(300L);
    }

    /* renamed from: a */
    protected int m92454a(boolean z11) {
        return z11 ? this.f88472K : this.f88471J;
    }

    /* renamed from: b */
    public void m92455b(View view) {
        ViewGroup.LayoutParams layoutParams;
        this.f88478p = view;
        this.f88481s = (ViewGroup) view.findViewById(C17395R.id.gif_center_control_layout);
        RecyclingImageView recyclingImageView = (RecyclingImageView) this.f88478p.findViewById(C17395R.id.gif_imv_loading);
        this.f88479q = recyclingImageView;
        recyclingImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RecyclingImageView recyclingImageView2 = this.f88479q;
        if (recyclingImageView2 != null && (layoutParams = this.f88484v) != null) {
            recyclingImageView2.setLayoutParams(layoutParams);
        }
        this.f88486x = (ProgressBar) this.f88478p.findViewById(C17395R.id.gif_loading_progress_bar);
        this.f88480r = (ImageView) this.f88478p.findViewById(C17395R.id.gif_imv_error);
        this.f88482t = (ImageView) this.f88478p.findViewById(C17395R.id.gif_btn_play);
        this.f88483u = (ImageView) this.f88478p.findViewById(C17395R.id.gif_btn_retry);
        m92458e(this.f88482t);
        m92458e(this.f88483u);
    }

    /* renamed from: c */
    public void m92456c(View view, boolean z11) {
        Animation animation;
        Animation animation2;
        if (view != null) {
            view.clearAnimation();
            if (z11 && (animation2 = this.f88469H) != null) {
                view.startAnimation(animation2);
            } else if (!z11 && (animation = this.f88470I) != null) {
                view.startAnimation(animation);
            }
        }
    }

    /* renamed from: d */
    public void m92457d(boolean z11) {
        this.f88485w = z11;
        if (!z11) {
            RecyclingImageView recyclingImageView = this.f88479q;
            if (recyclingImageView != null) {
                recyclingImageView.setImageDrawable(null);
            }
            ProgressBar progressBar = this.f88486x;
            if (progressBar != null) {
                progressBar.setIndeterminateDrawable(null);
            }
        }
    }

    /* renamed from: e */
    void m92458e(View view) {
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    /* renamed from: f */
    public void m92459f(boolean z11) {
        m92472s();
    }

    /* renamed from: g */
    public void m92460g(boolean z11) {
        int i11;
        ImageView imageView = this.f88482t;
        if (imageView != null) {
            imageView.setEnabled(z11);
            ImageView imageView2 = this.f88482t;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            imageView2.setVisibility(i11);
        }
    }

    /* renamed from: h */
    public void m92461h(boolean z11) {
    }

    /* renamed from: i */
    public void m92462i(boolean z11) {
        ImageView imageView = this.f88482t;
        if (imageView != null) {
            imageView.setImageResource(m92454a(z11));
            if (z11) {
                this.f88482t.setContentDescription(this.f88462A);
            } else {
                this.f88482t.setContentDescription(this.f88487y);
            }
        }
    }

    /* renamed from: j */
    public void m92463j(C3979l c3979l) {
        RecyclingImageView recyclingImageView = this.f88479q;
        if (recyclingImageView != null) {
            recyclingImageView.setImageInfo(c3979l);
        }
    }

    /* renamed from: k */
    public void m92464k(ViewGroup.LayoutParams layoutParams) {
        this.f88484v = layoutParams;
        RecyclingImageView recyclingImageView = this.f88479q;
        if (recyclingImageView != null) {
            recyclingImageView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: l */
    public void m92465l(C17391z c17391z) {
        this.f88477P = c17391z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void m92466m(boolean z11) {
        int i11;
        if (this.f88481s != null) {
            int i12 = 4;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            ProgressBar progressBar = this.f88486x;
            if (progressBar == null || progressBar.getVisibility() != 0) {
                i12 = i11;
            }
            AbstractC17358g.m92498k(this.f88481s, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m92467n(boolean z11, boolean z12) {
        boolean z13;
        ViewGroup viewGroup = this.f88481s;
        if (viewGroup != null) {
            int i11 = 0;
            if (viewGroup.getVisibility() == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            ViewGroup viewGroup2 = this.f88481s;
            if (!z11) {
                i11 = 4;
            }
            AbstractC17358g.m92498k(viewGroup2, i11);
            if (z12) {
                if ((z11 && !z13) || (!z11 && z13)) {
                    m92456c(this.f88481s, z11);
                }
            }
        }
    }

    /* renamed from: o */
    public void m92468o(boolean z11) {
        int i11;
        ProgressBar progressBar = this.f88486x;
        if (progressBar != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            AbstractC17358g.m92498k(progressBar, i11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC17346a interfaceC17346a;
        InterfaceC17346a interfaceC17346a2 = this.f88476O;
        if ((interfaceC17346a2 == null || !interfaceC17346a2.mo92246k3(view)) && (interfaceC17346a = this.f88475N) != null) {
            interfaceC17346a.mo92246k3(view);
        }
    }

    /* renamed from: p */
    public void m92469p(boolean z11, boolean z12) {
        RecyclingImageView recyclingImageView = this.f88479q;
        if (recyclingImageView == null) {
            return;
        }
        recyclingImageView.clearAnimation();
        if (z11) {
            AbstractC17358g.m92498k(this.f88479q, 0);
            if (z12) {
                this.f88479q.startAnimation(this.f88465D);
                return;
            }
            return;
        }
        AbstractC17358g.m92498k(this.f88479q, 4);
        if (z12) {
            this.f88479q.startAnimation(this.f88466E);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public void m92470q(boolean z11) {
        int i11;
        if (this.f88482t != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            ProgressBar progressBar = this.f88486x;
            if (progressBar != null && progressBar.getVisibility() == 0) {
                i11 = 4;
            }
            AbstractC17358g.m92498k(this.f88482t, i11);
            if (i11 == 0) {
                AbstractC17358g.m92498k(this.f88480r, 4);
                AbstractC17358g.m92498k(this.f88483u, 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void m92471r(boolean z11) {
        int i11;
        ImageView imageView = this.f88483u;
        if (imageView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            AbstractC17358g.m92498k(imageView, i11);
            if (i11 == 0) {
                AbstractC17358g.m92498k(this.f88480r, 4);
                AbstractC17358g.m92498k(this.f88482t, 4);
            }
        }
    }

    /* renamed from: s */
    void m92472s() {
    }
}
