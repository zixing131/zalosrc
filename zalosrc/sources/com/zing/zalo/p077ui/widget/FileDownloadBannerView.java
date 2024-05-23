package com.zing.zalo.p077ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import dj.C17945a0;
import dj.C17990p0;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.C23212s8;
import me0.ViewOnTouchListenerC23157n8;
import mm0.AbstractC23350e;
import p239ih.C20556f;
import vg.AbstractC28236y3;

/* loaded from: classes6.dex */
public class FileDownloadBannerView extends FrameLayout {

    /* renamed from: v */
    public static C17945a0 f69220v;

    /* renamed from: p */
    private final Context f69221p;

    /* renamed from: q */
    private ValueAnimator f69222q;

    /* renamed from: r */
    private ValueAnimator f69223r;

    /* renamed from: s */
    private Runnable f69224s;

    /* renamed from: t */
    private boolean f69225t;

    /* renamed from: u */
    private boolean f69226u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.FileDownloadBannerView$a */
    /* loaded from: classes6.dex */
    public class C13499a extends ViewOnTouchListenerC23157n8.c {
        C13499a() {
        }

        @Override // me0.ViewOnTouchListenerC23157n8.c
        /* renamed from: b */
        public void mo65453b() {
            FileDownloadBannerView.this.m75717i(false);
            FileDownloadBannerView.this.setVisibility(8);
            FileDownloadBannerView.m75707f(FileDownloadBannerView.this);
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.FileDownloadBannerView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13500b {
    }

    private FileDownloadBannerView(Context context) {
        super(context);
        this.f69222q = null;
        this.f69223r = null;
        this.f69224s = null;
        this.f69225t = false;
        this.f69226u = true;
        this.f69221p = context;
        m75708l();
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ InterfaceC13500b m75707f(FileDownloadBannerView fileDownloadBannerView) {
        fileDownloadBannerView.getClass();
        return null;
    }

    /* renamed from: l */
    private void m75708l() {
        setId(AbstractC6918a0.layout_banner_file_downloaded);
        addView((FrameLayout) LayoutInflater.from(this.f69221p).inflate(AbstractC7409c0.layout_csc_noti_file_downloaded, (ViewGroup) this, false));
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileDownloadBannerView.this.m75711q(view);
            }
        });
        ViewOnTouchListenerC23157n8 viewOnTouchListenerC23157n8 = new ViewOnTouchListenerC23157n8(new C13499a(), 3);
        viewOnTouchListenerC23157n8.m119175g(0.5f);
        setOnTouchListener(viewOnTouchListenerC23157n8);
        this.f69224s = new Runnable() { // from class: com.zing.zalo.ui.widget.l0
            @Override // java.lang.Runnable
            public final void run() {
                FileDownloadBannerView.this.m75712r();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m75709n(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setAlpha(floatValue);
        if (floatValue == 0.0f) {
            setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m75710p(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setAlpha(floatValue);
        setTranslationY((floatValue - 1.0f) * 20.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m75711q(View view) {
        m75721v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m75712r() {
        m75718j(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m75713s(View view) {
        m75721v();
    }

    /* renamed from: u */
    public static FileDownloadBannerView m75714u(Context context) {
        FileDownloadBannerView fileDownloadBannerView = new FileDownloadBannerView(context);
        fileDownloadBannerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        fileDownloadBannerView.setVisibility(8);
        return fileDownloadBannerView;
    }

    /* renamed from: g */
    public void m75715g() {
        ValueAnimator valueAnimator = this.f69223r;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f69223r.cancel();
        }
    }

    /* renamed from: h */
    public void m75716h() {
        ValueAnimator valueAnimator = this.f69222q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f69222q.cancel();
        }
    }

    /* renamed from: i */
    public void m75717i(boolean z11) {
        try {
            try {
                setTag(null);
                setBannerListener(null);
                m75716h();
                m75718j(z11);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } finally {
            f69220v = null;
        }
    }

    /* renamed from: j */
    public void m75718j(boolean z11) {
        this.f69225t = false;
        removeCallbacks(this.f69224s);
        if (z11) {
            if (this.f69223r == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f69223r = valueAnimator;
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.j0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        FileDownloadBannerView.this.m75709n(valueAnimator2);
                    }
                });
            }
            if (!this.f69223r.isRunning()) {
                this.f69223r.setFloatValues(getAlpha(), 0.0f);
                this.f69223r.setDuration(r5 * 300.0f);
                this.f69223r.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.f69223r;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f69223r.end();
        }
        setVisibility(8);
    }

    /* renamed from: k */
    public void m75719k(boolean z11, long j11) {
        this.f69225t = true;
        setVisibility(0);
        removeCallbacks(this.f69224s);
        if (this.f69226u) {
            postDelayed(this.f69224s, j11);
        }
        if (z11) {
            if (this.f69222q == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f69222q = valueAnimator;
                valueAnimator.setDuration(300L);
                this.f69222q.setFloatValues(0.0f, 1.0f);
                this.f69222q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.m0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        FileDownloadBannerView.this.m75710p(valueAnimator2);
                    }
                });
            }
            if (this.f69222q.isRunning()) {
                this.f69222q.cancel();
            }
            this.f69222q.start();
            return;
        }
        ValueAnimator valueAnimator2 = this.f69222q;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f69222q.end();
        }
    }

    /* renamed from: m */
    public boolean m75720m() {
        return this.f69225t;
    }

    public void setAutoDismissBanner(boolean z11) {
        this.f69226u = z11;
    }

    public void setBannerListener(InterfaceC13500b interfaceC13500b) {
    }

    public void setContent(C17945a0 c17945a0) {
        if (c17945a0 != null) {
            try {
                ImageView imageView = (ImageView) findViewById(AbstractC6918a0.iv_file_icon);
                if (imageView != null) {
                    imageView.setImageDrawable(AbstractC23136l9.m118665N(imageView.getContext(), AbstractC28236y3.m142203n(c17945a0.m95223p3())));
                }
                RobotoTextView robotoTextView = (RobotoTextView) findViewById(AbstractC6918a0.tv_prefix);
                if (robotoTextView != null) {
                    robotoTextView.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.ChatTextColor1));
                }
                RobotoTextView robotoTextView2 = (RobotoTextView) findViewById(AbstractC6918a0.tv_file_name);
                if (robotoTextView2 != null) {
                    robotoTextView2.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.ChatTextColor1));
                    robotoTextView2.setText(c17945a0.m95232q3());
                }
                RobotoButton robotoButton = (RobotoButton) findViewById(AbstractC6918a0.btn_open_file_downloaded);
                if (robotoButton != null) {
                    robotoButton.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.n0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FileDownloadBannerView.this.m75713s(view);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: v */
    public void m75721v() {
        C17945a0 c17945a0;
        try {
            try {
                if (this.f69221p != null && m75720m() && getTag() != null && (c17945a0 = (C17945a0) getTag()) != null) {
                    AbstractC23152n3.m119036c0(this.f69221p, new C20556f(c17945a0.m94983Q3()));
                    if (c17945a0.m94929K2() instanceof C17990p0) {
                        ((C17990p0) c17945a0.m94929K2()).f91117F = true;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } finally {
            m75717i(true);
        }
    }
}
