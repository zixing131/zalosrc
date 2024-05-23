package com.zing.zalo.p077ui.chat.widget.banners;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.widget.banners.MediaDownloadStatusView;
import com.zing.zalo.uicontrol.TrackSeekBar;
import com.zing.zalo.utils.ToastUtils;
import me0.AbstractC23136l9;
import p716zh.C32090r5;

/* loaded from: classes5.dex */
public class MediaDownloadStatusView extends RelativeLayout {

    /* renamed from: p */
    private TrackSeekBar f60973p;

    /* renamed from: q */
    private TextView f60974q;

    /* renamed from: r */
    ImageView f60975r;

    /* renamed from: s */
    private Handler f60976s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.banners.MediaDownloadStatusView$a */
    /* loaded from: classes5.dex */
    public class C11731a extends AnimatorListenerAdapter {

        /* renamed from: p */
        boolean f60977p = false;

        C11731a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f60977p = true;
            AbstractC1579n0.m7845W0(MediaDownloadStatusView.this.f60975r, 1.0f);
            AbstractC1579n0.m7847X0(MediaDownloadStatusView.this.f60975r, 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.banners.MediaDownloadStatusView$b */
    /* loaded from: classes5.dex */
    public class C11732b extends AnimatorListenerAdapter {
        C11732b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C32090r5.m154810i().m154814d();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C32090r5.m154810i().m154814d();
        }
    }

    public MediaDownloadStatusView(Context context) {
        super(context);
        m65341e();
    }

    /* renamed from: c */
    private void m65339c() {
        this.f60976s.postDelayed(new Runnable() { // from class: k60.b
            @Override // java.lang.Runnable
            public final void run() {
                MediaDownloadStatusView.this.m65342f();
            }
        }, 1500L);
    }

    /* renamed from: d */
    private void m65340d() {
        AbstractC1579n0.m7845W0(this.f60975r, 0.0f);
        AbstractC1579n0.m7847X0(this.f60975r, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f60975r, "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f60975r, "scaleY", 0.0f, 1.0f));
        animatorSet.setDuration(500L);
        animatorSet.addListener(new C11731a());
        animatorSet.start();
    }

    /* renamed from: e */
    private void m65341e() {
        this.f60976s = new Handler(Looper.getMainLooper());
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.group_download_layout, (ViewGroup) this, true);
        TrackSeekBar trackSeekBar = (TrackSeekBar) findViewById(AbstractC6918a0.music_player_seekbar);
        this.f60973p = trackSeekBar;
        trackSeekBar.setPadding(0, 0, 0, 0);
        this.f60974q = (TextView) findViewById(AbstractC6918a0.tv_title);
        ImageView imageView = (ImageView) findViewById(AbstractC6918a0.img_icon);
        this.f60975r = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: k60.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaDownloadStatusView.m65343g(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m65342f() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(100L);
        ofFloat.addListener(new C11732b());
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m65343g(View view) {
        C32090r5.m154810i().m154811a();
    }

    /* renamed from: h */
    public void m65344h(boolean z11) {
        this.f60974q.setText(C32090r5.m154810i().m154818h());
        this.f60973p.setProgress(C32090r5.m154810i().m154817g());
        if (C32090r5.m154810i().m154822m()) {
            if (z11) {
                if (C32090r5.m154810i().m154820k() == 0) {
                    this.f60975r.setVisibility(8);
                    this.f60975r.setOnClickListener(null);
                    if (C32090r5.m154810i().m154813c()) {
                        ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                    } else {
                        ToastUtils.showMess(C32090r5.m154810i().m154818h());
                    }
                } else {
                    this.f60975r.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_bottomsheet_selectsingle_check));
                    this.f60975r.setOnClickListener(null);
                    m65340d();
                }
                m65339c();
                return;
            }
            setVisibility(8);
            C32090r5.m154810i().m154814d();
        }
    }

    public MediaDownloadStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65341e();
    }

    public MediaDownloadStatusView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m65341e();
    }
}
