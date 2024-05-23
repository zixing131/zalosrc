package com.zing.zalo.camera.gallerypicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.camera.CameraPreviewController;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.gallerypicker.C7639a;
import com.zing.zalo.camera.gallerypicker.GalleryPickerContainer;
import hk.InterfaceC20079a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p322lf.AbstractC22463d;
import p500s1.C26087b;
import zh0.AbstractC32212c;

/* loaded from: classes3.dex */
public class GalleryPickerContainer extends FrameLayout {

    /* renamed from: p */
    public GalleryPickerMini f41260p;

    /* renamed from: q */
    private final InterfaceC7635d f41261q;

    /* renamed from: r */
    private int f41262r;

    /* renamed from: s */
    private final int f41263s;

    /* renamed from: t */
    final int f41264t;

    /* renamed from: u */
    private boolean f41265u;

    /* renamed from: v */
    private boolean f41266v;

    /* renamed from: w */
    private final InterfaceC20079a f41267w;

    /* renamed from: x */
    final C7639a.a f41268x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.gallerypicker.GalleryPickerContainer$a */
    /* loaded from: classes3.dex */
    public class C7632a implements C7639a.a {
        C7632a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m39335c() {
            GalleryPickerContainer.this.f41266v = false;
        }

        @Override // com.zing.zalo.camera.gallerypicker.C7639a.a
        /* renamed from: a */
        public void mo39336a(Intent intent) {
            try {
                if (!GalleryPickerContainer.this.f41266v) {
                    GalleryPickerContainer.this.f41266v = true;
                    GalleryPickerContainer.this.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.gallerypicker.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            GalleryPickerContainer.C7632a.this.m39335c();
                        }
                    }, 500L);
                    if (GalleryPickerContainer.this.f41261q != null) {
                        GalleryPickerContainer.this.f41261q.mo39151a(intent);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.gallerypicker.GalleryPickerContainer$b */
    /* loaded from: classes3.dex */
    public class C7633b extends AnimatorListenerAdapter {
        C7633b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                super.onAnimationEnd(animator);
                if (GalleryPickerContainer.this.f41265u) {
                    GalleryPickerContainer.this.f41265u = false;
                    GalleryPickerContainer.this.f41260p.m39344g();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.gallerypicker.GalleryPickerContainer$c */
    /* loaded from: classes3.dex */
    public class C7634c extends AnimatorListenerAdapter {
        C7634c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            GalleryPickerMini galleryPickerMini = GalleryPickerContainer.this.f41260p;
            if (galleryPickerMini != null) {
                galleryPickerMini.setVisibility(8);
            }
            GalleryPickerContainer.this.f41261q.mo39154d();
        }
    }

    /* renamed from: com.zing.zalo.camera.gallerypicker.GalleryPickerContainer$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC7635d {
        /* renamed from: a */
        void mo39151a(Intent intent);

        /* renamed from: b */
        void mo39152b(int i11);

        /* renamed from: c */
        CameraPreviewController mo39153c();

        /* renamed from: d */
        void mo39154d();
    }

    public GalleryPickerContainer(Context context, InterfaceC7635d interfaceC7635d, int i11, int i12, InterfaceC20079a interfaceC20079a) {
        super(context);
        this.f41262r = 1;
        this.f41266v = false;
        this.f41268x = new C7632a();
        ZaloCameraView.f40825K2 = AbstractC23222t7.f112591v0;
        ZaloCameraView.f40826L2 = AbstractC23222t7.f112546Y;
        this.f41261q = interfaceC7635d;
        this.f41263s = i11;
        this.f41264t = i12;
        this.f41267w = interfaceC20079a;
        this.f41265u = true;
    }

    /* renamed from: f */
    public void m39330f(boolean z11) {
        int i11;
        if (this.f41260p != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            if (!z11) {
                i11 = ZaloCameraView.f40825K2;
            } else {
                i11 = ZaloCameraView.f40826L2;
            }
            layoutParams.bottomMargin = i11;
            setLayoutParams(layoutParams);
            int m118713h0 = ((AbstractC23136l9.m118713h0() - this.f41260p.getHeight()) - AbstractC23222t7.f112539R) - layoutParams.bottomMargin;
            InterfaceC7635d interfaceC7635d = this.f41261q;
            if (interfaceC7635d != null) {
                interfaceC7635d.mo39152b(m118713h0);
            }
        }
    }

    /* renamed from: g */
    public boolean m39331g() {
        GalleryPickerMini galleryPickerMini = this.f41260p;
        if (galleryPickerMini != null && galleryPickerMini.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public int getGalleryPickerMode() {
        return this.f41262r;
    }

    /* renamed from: h */
    public void m39332h(boolean z11) {
        int i11;
        AnimatorSet animatorSet;
        this.f41262r = 1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.width = ((View) getParent()).getWidth();
        layoutParams.height = ((View) getParent()).getHeight();
        layoutParams.bottomMargin = 0;
        setLayoutParams(layoutParams);
        if (!AbstractC22463d.m116126a(getContext(), AbstractC32212c.m155331a(getContext()))) {
            i11 = ZaloCameraView.f40825K2;
        } else {
            i11 = ZaloCameraView.f40826L2;
        }
        GalleryPickerMini galleryPickerMini = this.f41260p;
        if (galleryPickerMini != null) {
            galleryPickerMini.setTranslationY(-i11);
        }
        if (z11 && this.f41261q != null) {
            animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            CameraPreviewController mo39153c = this.f41261q.mo39153c();
            if (mo39153c != null) {
                arrayList.add(ObjectAnimator.ofFloat(mo39153c, "alpha", 0.0f));
            }
            GalleryPickerMini galleryPickerMini2 = this.f41260p;
            if (galleryPickerMini2 != null) {
                arrayList.add(ObjectAnimator.ofFloat(galleryPickerMini2, "alpha", 0.0f));
            }
            animatorSet.addListener(new C7634c());
            animatorSet.setDuration(150L);
            animatorSet.playTogether(arrayList);
        } else if (this.f41260p != null) {
            animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.f41260p, "alpha", 0.0f));
            animatorSet.setDuration(500L);
        } else {
            animatorSet = null;
        }
        if (animatorSet != null) {
            animatorSet.setInterpolator(new C26087b());
            animatorSet.start();
        }
    }

    /* renamed from: i */
    public void m39333i(boolean z11) {
        int i11;
        int i12;
        long j11;
        this.f41262r = 0;
        boolean m116126a = AbstractC22463d.m116126a(getContext(), AbstractC32212c.m155331a(getContext()));
        if (this.f41260p == null) {
            this.f41260p = new GalleryPickerMini(getContext(), this, this.f41268x, this.f41263s, this.f41264t, this.f41267w);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            addView(this.f41260p, layoutParams);
        } else {
            m39330f(m116126a);
        }
        if (this.f41260p != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -2;
            if (m116126a) {
                i11 = ZaloCameraView.f40826L2;
            } else {
                i11 = ZaloCameraView.f40825K2;
            }
            layoutParams2.bottomMargin = i11;
            setLayoutParams(layoutParams2);
            if (this.f41260p.getHeight() > 0) {
                i12 = this.f41260p.getHeight();
            } else {
                i12 = ZaloCameraView.f40827M2;
            }
            int m118713h0 = ((AbstractC23136l9.m118713h0() - i12) - layoutParams2.bottomMargin) - AbstractC23222t7.f112539R;
            InterfaceC7635d interfaceC7635d = this.f41261q;
            if (interfaceC7635d != null) {
                interfaceC7635d.mo39152b(m118713h0);
            }
            this.f41260p.setVisibility(0);
            this.f41260p.setAlpha(1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            if (z11) {
                animatorSet.play(ObjectAnimator.ofFloat(this.f41260p, "translationY", i12, 0.0f));
            }
            animatorSet.addListener(new C7633b());
            if (z11) {
                j11 = 250;
            } else {
                j11 = 50;
            }
            animatorSet.setDuration(j11);
            animatorSet.start();
        }
    }
}
