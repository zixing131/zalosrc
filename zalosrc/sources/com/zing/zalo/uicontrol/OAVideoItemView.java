package com.zing.zalo.uicontrol;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import au.C2343e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17352d;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.InterfaceC17372n;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zplayer.C17395R;
import com.zing.zalocore.CoreUtility;
import hf0.AbstractC20049k;
import hf0.C20040b;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p716zh.C32106s7;
import p716zh.C32107s8;
import tj.C26712d;
import tj.C26713e;
import vg.AbstractC28207v1;
import vg.C28075g8;

/* loaded from: classes4.dex */
public class OAVideoItemView extends RelativeLayout implements C20040b.c, ValueAnimator.AnimatorUpdateListener, View.OnClickListener, ZVideoView.InterfaceC17345q, IMediaPlayer.OnInfoListener, InterfaceC17372n {

    /* renamed from: J */
    static Paint f83263J;

    /* renamed from: A */
    boolean f83264A;

    /* renamed from: B */
    int f83265B;

    /* renamed from: C */
    ValueAnimator f83266C;

    /* renamed from: D */
    int f83267D;

    /* renamed from: E */
    C32106s7 f83268E;

    /* renamed from: F */
    C26712d f83269F;

    /* renamed from: G */
    int f83270G;

    /* renamed from: H */
    Rect f83271H;

    /* renamed from: I */
    InterfaceC16474c f83272I;

    /* renamed from: p */
    C23528a f83273p;

    /* renamed from: q */
    View f83274q;

    /* renamed from: r */
    AvatarImageView f83275r;

    /* renamed from: s */
    RobotoTextView f83276s;

    /* renamed from: t */
    RobotoTextView f83277t;

    /* renamed from: u */
    ZVideoView f83278u;

    /* renamed from: v */
    C3977j f83279v;

    /* renamed from: w */
    View f83280w;

    /* renamed from: x */
    RobotoTextView f83281x;

    /* renamed from: y */
    RobotoTextView f83282y;

    /* renamed from: z */
    View f83283z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.OAVideoItemView$a */
    /* loaded from: classes4.dex */
    public class C16472a extends C23999j {
        C16472a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18849m()) {
                        if (OAVideoItemView.this.f83278u.getLoadingView() != null) {
                            OAVideoItemView.this.f83278u.getLoadingView().setScaleType(ImageView.ScaleType.CENTER_CROP);
                        }
                        OAVideoItemView.this.f83278u.setLoadingViewImageInfo(c3979l);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.OAVideoItemView$b */
    /* loaded from: classes4.dex */
    public class ViewTreeObserverOnPreDrawListenerC16473b implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC16473b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            try {
                OAVideoItemView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                int height = (((View) OAVideoItemView.this.getParent()).getHeight() - OAVideoItemView.this.f83278u.getHeight()) / 2;
                OAVideoItemView oAVideoItemView = OAVideoItemView.this;
                oAVideoItemView.setPadding(oAVideoItemView.getPaddingLeft(), OAVideoItemView.this.getPaddingTop(), OAVideoItemView.this.getPaddingRight(), height);
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.OAVideoItemView$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC16474c {
        /* renamed from: a */
        void mo82418a(OAVideoItemView oAVideoItemView, C32106s7 c32106s7, C26712d c26712d);

        /* renamed from: b */
        void mo82419b(OAVideoItemView oAVideoItemView, C32106s7 c32106s7);

        /* renamed from: c */
        void mo82420c(OAVideoItemView oAVideoItemView);

        /* renamed from: d */
        void mo82421d(OAVideoItemView oAVideoItemView, C32106s7 c32106s7);

        /* renamed from: e */
        void mo82422e(OAVideoItemView oAVideoItemView, int i11);

        /* renamed from: f */
        void mo82423f(OAVideoItemView oAVideoItemView);
    }

    public OAVideoItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83264A = false;
        this.f83265B = -16777216;
        this.f83267D = 204;
        this.f83271H = null;
    }

    @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
    /* renamed from: D */
    public void mo44076D(int i11) {
        if (i11 == 0 || i11 == 5 || i11 == 6 || i11 == -1) {
            try {
                this.f83278u.getVideoController().m92303b0();
                this.f83278u.m92421n0(true);
                this.f83278u.getVideoController().m92294R(-1);
                if (i11 == 5 && this.f83278u.getVideo() != null) {
                    AbstractC20049k.m104119m(5, this.f83278u.getVideo().f88618a, -1L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        InterfaceC16474c interfaceC16474c = this.f83272I;
        if (interfaceC16474c != null) {
            interfaceC16474c.mo82422e(this, i11);
        }
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17372n
    /* renamed from: F1 */
    public void mo81899F1(boolean z11, String str) {
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17372n
    /* renamed from: XC */
    public void mo79714XC(long j11) {
    }

    /* renamed from: a */
    public void m87778a(C32106s7 c32106s7, int i11, boolean z11) {
        float f11;
        float f12;
        C23528a c23528a;
        C3977j c3977j;
        this.f83270G = i11;
        this.f83268E = c32106s7;
        this.f83269F = null;
        m87780c(z11);
        if (this.f83278u != null && c32106s7 != null && c32106s7.m154978g() != null) {
            C17391z m154978g = c32106s7.m154978g();
            String str = m154978g.f88622e;
            if (this.f83278u.getLoadingView() != null) {
                this.f83278u.getLoadingView().setScaleType(ImageView.ScaleType.FIT_XY);
                this.f83278u.getLoadingView().setImageResource(AbstractC16803z.bg_item_chat_o);
            }
            if (!TextUtils.isEmpty(str) && ((!z11 || C23999j.m125696L2(str, C23278z2.m120126f0())) && (c23528a = this.f83273p) != null && (c3977j = this.f83279v) != null)) {
                ((C23528a) c23528a.m123612r(c3977j)).m123579C(str, C23278z2.m120126f0(), new C16472a());
            }
            this.f83278u.setUseVideoRatio(false);
            this.f83278u.setVideoPlayerMode(2);
            int m118731n0 = AbstractC23136l9.m118731n0(getContext());
            int m118719j0 = AbstractC23136l9.m118719j0(getContext());
            Rect rect = this.f83271H;
            if (rect != null && rect.width() > 0 && this.f83271H.height() > 0) {
                m118731n0 = this.f83271H.width();
                m118719j0 = this.f83271H.height();
            }
            float f13 = 1.0f / m154978g.f88626i;
            if (m118731n0 <= m118719j0) {
                if (f13 > 1.0f) {
                    f12 = m118731n0 * 1.0f;
                } else if (f13 < 0.5625f) {
                    f12 = m118731n0 * 0.5625f;
                } else {
                    f12 = m118731n0 * f13;
                }
                m118719j0 = (int) f12;
            } else {
                if (f13 > 1.0f) {
                    f11 = m118719j0 / 1.0f;
                } else if (f13 < 0.5625f) {
                    f11 = m118719j0 / 0.5625f;
                } else {
                    f11 = m118719j0 / f13;
                }
                m118731n0 = (int) f11;
            }
            ViewGroup.LayoutParams layoutParams = this.f83278u.getLayoutParams();
            layoutParams.width = m118731n0;
            layoutParams.height = m118719j0;
            this.f83278u.setLayoutParams(layoutParams);
            this.f83278u.setZVideo(m154978g);
            this.f83278u.setPlayConfig(ZMediaPlayerSettings.getPlayConfig(7));
            this.f83278u.setOnPlayerStateChangedListener(this);
            this.f83278u.setOnInfoListener(this);
            this.f83278u.getVideoController().f88210s.m92523p(this);
            if (!this.f83278u.isPlaying()) {
                int currentState = this.f83278u.getCurrentState();
                if (currentState == 0 || currentState == 5 || currentState == 6) {
                    this.f83278u.m92421n0(true);
                }
                this.f83278u.getVideoController().m92306h(true);
            }
        }
    }

    /* renamed from: b */
    public void m87779b() {
        if (f83263J == null) {
            Paint paint = new Paint(1);
            f83263J = paint;
            paint.setColor(Color.parseColor("#80ff9c24"));
            f83263J.setTextSize(AbstractC23136l9.m118742r(16.0f));
        }
        this.f83273p = new C23528a(getContext());
        this.f83279v = new C3977j(getContext());
        this.f83265B = getResources().getColor(AbstractC16801x.oa_video_playlist_background);
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.oa_video_item_view, (ViewGroup) this, true);
        ZVideoView zVideoView = (ZVideoView) findViewById(AbstractC6918a0.oa_zvideo_view);
        this.f83278u = zVideoView;
        if (zVideoView != null) {
            zVideoView.setUseVideoRatio(true);
            this.f83278u.setVideoPlayerMode(0);
            this.f83278u.setAudioFocusControl(C28075g8.m141538e());
            if (this.f83278u.getVideoController().f88210s instanceof C17352d) {
                ((C17352d) this.f83278u.getVideoController().f88210s).f88492o0 = true;
            }
            this.f83278u.setBackgroundColor(getResources().getColor(AbstractC16801x.oa_video_playlist_background));
            this.f83278u.getVideoController().f88210s.f88566d0 = C17395R.drawable.btn_play_video_full;
            this.f83278u.getVideoController().f88210s.f88567e0 = C17395R.drawable.btn_pause_video_full;
        }
        this.f83274q = findViewById(AbstractC6918a0.oa_video_playlist_item_top_panel);
        AvatarImageView avatarImageView = (AvatarImageView) findViewById(AbstractC6918a0.oa_video_playlist_item_imv_avatar);
        this.f83275r = avatarImageView;
        avatarImageView.setOnClickListener(this);
        RobotoTextView robotoTextView = (RobotoTextView) findViewById(AbstractC6918a0.oa_video_playlist_item_tv_name);
        this.f83276s = robotoTextView;
        robotoTextView.setOnClickListener(this);
        RobotoTextView robotoTextView2 = (RobotoTextView) findViewById(AbstractC6918a0.oa_video_playlist_item_tv_action);
        this.f83277t = robotoTextView2;
        robotoTextView2.setOnClickListener(this);
        this.f83280w = findViewById(AbstractC6918a0.oa_video_playlist_item_bottom_panel);
        this.f83281x = (RobotoTextView) findViewById(AbstractC6918a0.oa_video_playlist_item_tv_title);
        this.f83282y = (RobotoTextView) findViewById(AbstractC6918a0.oa_video_playlist_item_tv_description);
        View findViewById = findViewById(AbstractC6918a0.oa_video_playlist_item_btn_share);
        this.f83283z = findViewById;
        findViewById.setOnClickListener(this);
        setOnClickListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m87780c(boolean z11) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z12;
        C26713e c26713e;
        int i11;
        int i12;
        C32106s7 c32106s7 = this.f83268E;
        String str5 = "";
        if (c32106s7 == null || c32106s7.m154976e() == null) {
            str = "";
            str2 = str;
            str3 = str2;
        } else {
            C32107s8 m154976e = this.f83268E.m154976e();
            str2 = String.valueOf(m154976e.f148011a);
            str3 = m154976e.f148013c;
            str = m154976e.f148012b;
        }
        AvatarImageView avatarImageView = this.f83275r;
        int i13 = 0;
        if (avatarImageView != null) {
            avatarImageView.setImageResource(AbstractC16803z.default_avatar);
            if (!TextUtils.isEmpty(str)) {
                if (C23302b.f113247a.m120523d(str) && !CoreUtility.f89233i.equals(str2)) {
                    this.f83275r.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(str3), C2343e.m12307a(str2, false)));
                } else if (!z11 || C23999j.m125696L2(str, C23278z2.m120143n())) {
                    ((C23528a) this.f83273p.m123612r(this.f83275r)).m123619y(str, C23278z2.m120143n(), 10);
                }
            }
        }
        RobotoTextView robotoTextView = this.f83276s;
        if (robotoTextView != null) {
            robotoTextView.setText(str3);
        }
        C32106s7 c32106s72 = this.f83268E;
        String str6 = null;
        if (c32106s72 != null) {
            str4 = c32106s72.f148006d;
        } else {
            str4 = null;
        }
        RobotoTextView robotoTextView2 = this.f83281x;
        if (robotoTextView2 != null) {
            robotoTextView2.setText(str4);
            RobotoTextView robotoTextView3 = this.f83281x;
            if (TextUtils.isEmpty(str4)) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            robotoTextView3.setVisibility(i12);
        }
        C32106s7 c32106s73 = this.f83268E;
        if (c32106s73 != null) {
            str6 = c32106s73.f148007e;
        }
        RobotoTextView robotoTextView4 = this.f83282y;
        if (robotoTextView4 != null) {
            robotoTextView4.setText(str6);
            RobotoTextView robotoTextView5 = this.f83282y;
            if (TextUtils.isEmpty(str6)) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            robotoTextView5.setVisibility(i11);
        }
        if (this.f83277t != null) {
            C32106s7 c32106s74 = this.f83268E;
            if (c32106s74 != null && (c26713e = c32106s74.f148008f) != null && !c26713e.m137358c().isEmpty()) {
                this.f83269F = (C26712d) this.f83268E.f148008f.m137358c().get(0);
            }
            C26712d c26712d = this.f83269F;
            if (c26712d != null) {
                str5 = c26712d.m137335c();
                if (!TextUtils.isEmpty(str5) && AbstractC28207v1.m142074z0(this.f83269F.m137334b(), this.f83269F.m137333a())) {
                    z12 = true;
                    this.f83277t.setText(str5);
                    RobotoTextView robotoTextView6 = this.f83277t;
                    if (!z12) {
                        i13 = 8;
                    }
                    robotoTextView6.setVisibility(i13);
                }
            }
            z12 = false;
            this.f83277t.setText(str5);
            RobotoTextView robotoTextView62 = this.f83277t;
            if (!z12) {
            }
            robotoTextView62.setVisibility(i13);
        }
    }

    @Override // hf0.C20040b.c
    /* renamed from: d */
    public void mo44058d(int i11, int i12) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i11 = this.f83267D;
        if (i11 != 0) {
            canvas.drawColor((i11 << 24) | (this.f83265B & 16777215));
        }
    }

    @Override // hf0.C20040b.c
    /* renamed from: f */
    public boolean mo44060f() {
        return true;
    }

    @Override // hf0.C20040b.c
    public int getDataPosition() {
        return this.f83270G;
    }

    @Override // hf0.C20040b.c
    public ZVideoView getNewVideoView() {
        return this.f83278u;
    }

    public C32106s7 getOaVideo() {
        return this.f83268E;
    }

    public C17391z getVideo() {
        ZVideoView zVideoView = this.f83278u;
        if (zVideoView != null) {
            return zVideoView.getVideo();
        }
        return null;
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17372n
    /* renamed from: k3 */
    public boolean mo79717k3(View view) {
        if (view.getId() == C17395R.id.video_btn_fullscreen) {
            InterfaceC16474c interfaceC16474c = this.f83272I;
            if (interfaceC16474c != null) {
                interfaceC16474c.mo82420c(this);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            this.f83267D = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC16474c interfaceC16474c;
        if (view == this) {
            InterfaceC16474c interfaceC16474c2 = this.f83272I;
            if (interfaceC16474c2 != null) {
                interfaceC16474c2.mo82423f(this);
                return;
            }
            return;
        }
        int id2 = view.getId();
        if (id2 != AbstractC6918a0.oa_video_playlist_item_imv_avatar && id2 != AbstractC6918a0.oa_video_playlist_item_tv_name) {
            if (id2 == AbstractC6918a0.oa_video_playlist_item_tv_action) {
                InterfaceC16474c interfaceC16474c3 = this.f83272I;
                if (interfaceC16474c3 != null) {
                    interfaceC16474c3.mo82418a(this, this.f83268E, this.f83269F);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.oa_video_playlist_item_btn_share && (interfaceC16474c = this.f83272I) != null) {
                interfaceC16474c.mo82421d(this, this.f83268E);
                return;
            }
            return;
        }
        InterfaceC16474c interfaceC16474c4 = this.f83272I;
        if (interfaceC16474c4 != null) {
            interfaceC16474c4.mo82419b(this, this.f83268E);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ZVideoView zVideoView = this.f83278u;
        if (zVideoView != null) {
            zVideoView.m92429s0();
            this.f83278u.m92412f0(true);
        }
        this.f83264A = false;
        ValueAnimator valueAnimator = this.f83266C;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f83266C.cancel();
        }
        this.f83267D = 204;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
        if (iMediaPlayer != null && i11 == 3) {
            this.f83278u.getVideoController().m92305g();
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f83264A) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // hf0.C20040b.c
    public void setCurrentVideoView(boolean z11) {
        if (z11 != this.f83264A) {
            this.f83264A = z11;
            ValueAnimator valueAnimator = this.f83266C;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f83266C.cancel();
            }
            int[] iArr = new int[2];
            int i11 = 0;
            iArr[0] = this.f83267D;
            if (!this.f83264A) {
                i11 = 204;
            }
            iArr[1] = i11;
            ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
            this.f83266C = ofInt;
            ofInt.setDuration(300L);
            this.f83266C.addUpdateListener(this);
            this.f83266C.start();
        }
    }

    public void setIsLastItemInList(boolean z11) {
        if (!z11) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), AbstractC23136l9.m118742r(16.0f));
        } else {
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC16473b());
        }
    }

    public void setOAOaVideoInteractionListener(InterfaceC16474c interfaceC16474c) {
        this.f83272I = interfaceC16474c;
    }

    public void setParentRect(Rect rect) {
        this.f83271H = rect;
    }

    public OAVideoItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f83264A = false;
        this.f83265B = -16777216;
        this.f83267D = 204;
        this.f83271H = null;
    }
}
