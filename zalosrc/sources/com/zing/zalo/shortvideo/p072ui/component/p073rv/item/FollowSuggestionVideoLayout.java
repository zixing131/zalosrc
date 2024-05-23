package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.Outline;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.FollowSuggestionVideoLayout;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9769e;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import e10.C18168e;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;
import s20.AbstractC26112n;
import u20.C26988i;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class FollowSuggestionVideoLayout extends FrameLayout {

    /* renamed from: A */
    private String f50671A;

    /* renamed from: B */
    private ZVideoView f50672B;

    /* renamed from: p */
    private final int f50673p;

    /* renamed from: q */
    private float f50674q;

    /* renamed from: r */
    private float f50675r;

    /* renamed from: s */
    private boolean f50676s;

    /* renamed from: t */
    private boolean f50677t;

    /* renamed from: u */
    private InterfaceC18494a f50678u;

    /* renamed from: v */
    private InterfaceC18505l f50679v;

    /* renamed from: w */
    private final C26988i f50680w;

    /* renamed from: x */
    private float f50681x;

    /* renamed from: y */
    private Handler f50682y;

    /* renamed from: z */
    private C9769e f50683z;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.FollowSuggestionVideoLayout$a */
    /* loaded from: classes5.dex */
    static final class C9592a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9592a f50684q = new C9592a();

        C9592a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52161a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52161a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.FollowSuggestionVideoLayout$b */
    /* loaded from: classes5.dex */
    static final class C9593b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9593b f50685q = new C9593b();

        C9593b() {
            super(1);
        }

        /* renamed from: a */
        public final void m52162a(boolean z11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52162a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.FollowSuggestionVideoLayout$c */
    /* loaded from: classes5.dex */
    static final class C9594c extends AbstractC19075u implements InterfaceC18494a {
        C9594c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52163a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52163a() {
            FollowSuggestionVideoLayout.this.f50679v.mo205i9(Boolean.TRUE);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.FollowSuggestionVideoLayout$d */
    /* loaded from: classes5.dex */
    static final class C9595d extends AbstractC19075u implements InterfaceC18494a {
        C9595d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52164a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52164a() {
            FollowSuggestionVideoLayout.this.f50679v.mo205i9(Boolean.FALSE);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.FollowSuggestionVideoLayout$e */
    /* loaded from: classes5.dex */
    public static final class C9596e extends ViewOutlineProvider {
        C9596e() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), FollowSuggestionVideoLayout.this.f50673p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.FollowSuggestionVideoLayout$f */
    /* loaded from: classes5.dex */
    public static final class C9597f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9597f f50689q = new C9597f();

        C9597f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52165a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52165a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.FollowSuggestionVideoLayout$g */
    /* loaded from: classes5.dex */
    public static final class C9598g implements ZVideoView.InterfaceC17345q {

        /* renamed from: p */
        private int f50690p = -1;

        /* renamed from: q */
        final /* synthetic */ ZVideoView f50691q;

        /* renamed from: r */
        final /* synthetic */ FollowSuggestionVideoLayout f50692r;

        C9598g(ZVideoView zVideoView, FollowSuggestionVideoLayout followSuggestionVideoLayout) {
            this.f50691q = zVideoView;
            this.f50692r = followSuggestionVideoLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m52167b(FollowSuggestionVideoLayout followSuggestionVideoLayout, ZVideoView zVideoView) {
            AbstractC19074t.m100208f(followSuggestionVideoLayout, "this$0");
            AbstractC19074t.m100208f(zVideoView, "$this_run");
            if (followSuggestionVideoLayout.m52156m()) {
                zVideoView.start();
            }
        }

        @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
        /* renamed from: D */
        public void mo44076D(int i11) {
            if (i11 == this.f50691q.getCurrentState() && i11 != this.f50690p) {
                if (i11 != 3) {
                    this.f50692r.m52147p(false);
                } else {
                    this.f50692r.m52147p(!r2.f50680w.m139099c());
                }
                if (i11 != 0) {
                    if (i11 == 1) {
                        this.f50692r.m52148q();
                    } else if (i11 == 2) {
                        this.f50692r.m52146n();
                        this.f50692r.m52135B();
                        if (this.f50692r.m52156m()) {
                            Handler handler = this.f50692r.f50682y;
                            final FollowSuggestionVideoLayout followSuggestionVideoLayout = this.f50692r;
                            final ZVideoView zVideoView = this.f50691q;
                            handler.post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    FollowSuggestionVideoLayout.C9598g.m52167b(FollowSuggestionVideoLayout.this, zVideoView);
                                }
                            });
                        }
                    } else if (i11 == 3) {
                        this.f50692r.m52149u();
                    } else if (i11 == 4) {
                        this.f50692r.m52135B();
                    } else if (i11 == 6) {
                        this.f50692r.m52146n();
                    }
                } else {
                    this.f50692r.f50682y.removeCallbacksAndMessages(null);
                    ZVideoView zVideoView2 = this.f50691q;
                    zVideoView2.setViewRatio(zVideoView2.getVideoRatio());
                }
                this.f50690p = i11;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowSuggestionVideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50673p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_8dp);
        this.f50678u = C9592a.f50684q;
        this.f50679v = C9593b.f50685q;
        this.f50680w = new C26988i(new C9594c(), new C9595d());
        this.f50682y = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m52135B() {
        setVolumeValue(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m52146n() {
        this.f50680w.m139098b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m52147p(boolean z11) {
        if (this.f50677t != z11) {
            this.f50677t = z11;
            if (z11 && this.f50671A != null && this.f50683z != null && m52156m()) {
                C18168e m96538b = C18168e.Companion.m96538b();
                String str = this.f50671A;
                AbstractC19074t.m100205c(str);
                C9769e c9769e = this.f50683z;
                AbstractC19074t.m100205c(c9769e);
                m96538b.m96511A(str, c9769e.m52760d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m52148q() {
        this.f50680w.m139100d();
    }

    private final void setVolumeValue(float f11) {
        this.f50681x = f11;
        ZVideoView zVideoView = this.f50672B;
        if (zVideoView != null) {
            zVideoView.setVolume(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m52149u() {
        float f11;
        C9769e c9769e = this.f50683z;
        if (c9769e != null) {
            f11 = c9769e.m52761e();
        } else {
            f11 = 1.0f;
        }
        setVolumeValue(f11);
    }

    /* renamed from: v */
    private final void m52150v() {
        final ZVideoView zVideoView = this.f50672B;
        if (zVideoView != null) {
            zVideoView.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.n
                @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
                public final boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
                    boolean m52151w;
                    m52151w = FollowSuggestionVideoLayout.m52151w(FollowSuggestionVideoLayout.this, zVideoView, iMediaPlayer, i11, i12, obj);
                    return m52151w;
                }
            });
            zVideoView.setOnPlayerStateChangedListener(new C9598g(zVideoView, this));
            ZMediaPlayerSettings.PlayConfig playConfig = ZMediaPlayerSettings.getPlayConfig(9);
            if (playConfig != null) {
                playConfig.setAutoStartOnPrepared(false);
            } else {
                playConfig = null;
            }
            zVideoView.setPlayConfig(playConfig);
            zVideoView.setVideoPlayerMode(1);
            zVideoView.getVideoController().setAllowShowLoadingView(false);
            zVideoView.setExcludeSystemDecorationSize(false);
            zVideoView.setForceHideController(true);
            zVideoView.setUseVideoRatio(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final boolean m52151w(FollowSuggestionVideoLayout followSuggestionVideoLayout, ZVideoView zVideoView, IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
        boolean z11;
        AbstractC19074t.m100208f(followSuggestionVideoLayout, "this$0");
        AbstractC19074t.m100208f(zVideoView, "$this_run");
        if (i11 != 3) {
            if (i11 != 701) {
                if (i11 == 702) {
                    followSuggestionVideoLayout.m52146n();
                    if (zVideoView.getCurrentState() == 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    followSuggestionVideoLayout.m52147p(z11);
                }
            } else {
                followSuggestionVideoLayout.m52148q();
                followSuggestionVideoLayout.m52147p(false);
            }
        } else {
            followSuggestionVideoLayout.f50678u.mo12V4();
            followSuggestionVideoLayout.f50678u = C9597f.f50689q;
        }
        return false;
    }

    /* renamed from: x */
    private final void m52152x() {
        ZVideoView zVideoView = this.f50672B;
        if (zVideoView != null) {
            C9769e c9769e = this.f50683z;
            AbstractC19074t.m100205c(c9769e);
            C17391z m52759c = c9769e.m52759c();
            C18168e.c cVar = C18168e.Companion;
            C18168e m96538b = cVar.m96538b();
            String str = this.f50671A;
            AbstractC19074t.m100205c(str);
            C9769e c9769e2 = this.f50683z;
            AbstractC19074t.m100205c(c9769e2);
            m96538b.m96511A(str, c9769e2.m52760d());
            C18168e m96538b2 = cVar.m96538b();
            String str2 = m52759c.f88618a;
            AbstractC19074t.m100207e(str2, "id");
            String str3 = this.f50671A;
            AbstractC19074t.m100205c(str3);
            m52759c.f88633p = m96538b2.m96516q(str2, str3);
            zVideoView.setZVideo(m52759c);
            zVideoView.m92410d0();
        }
    }

    /* renamed from: A */
    public final void m52153A() {
        ZVideoView zVideoView = this.f50672B;
        if (zVideoView != null) {
            zVideoView.m92429s0();
        }
        this.f50683z = null;
    }

    public final String getPlaylistId() {
        return this.f50671A;
    }

    /* renamed from: k */
    public final void m52154k() {
        this.f50676s = true;
        m52158s();
    }

    /* renamed from: l */
    public final void m52155l() {
        m52157r();
        this.f50676s = false;
    }

    /* renamed from: m */
    public final boolean m52156m() {
        return this.f50676s;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ZVideoView zVideoView = new ZVideoView(getContext(), null);
        zVideoView.setKeepScreenOn(true);
        addView(zVideoView);
        this.f50672B = zVideoView;
        m52150v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        m52159y();
        ZVideoView zVideoView = this.f50672B;
        this.f50672B = null;
        removeView(zVideoView);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setClipToOutline(true);
        setOutlineProvider(new C9596e());
    }

    /* renamed from: r */
    public final void m52157r() {
        ZVideoView zVideoView;
        ZVideoView zVideoView2;
        if (this.f50676s && (zVideoView = this.f50672B) != null && zVideoView.getCurrentState() == 3 && (zVideoView2 = this.f50672B) != null) {
            zVideoView2.pause();
        }
    }

    /* renamed from: s */
    public final void m52158s() {
        ZVideoView zVideoView;
        ZVideoView zVideoView2;
        if (this.f50676s) {
            ZVideoView zVideoView3 = this.f50672B;
            if (((zVideoView3 != null && zVideoView3.getCurrentState() == 4) || ((zVideoView = this.f50672B) != null && zVideoView.getCurrentState() == 2)) && (zVideoView2 = this.f50672B) != null) {
                zVideoView2.start();
            }
        }
    }

    public final void setFirstFrameAction(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f50678u = interfaceC18494a;
    }

    public final void setItemPosition(float f11) {
        this.f50675r = f11;
        setTranslationX(this.f50674q + f11);
    }

    public final void setListPosition(float f11) {
        this.f50674q = f11;
        setTranslationX(f11 + this.f50675r);
    }

    public final void setLoadingChangedAction(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        this.f50679v = interfaceC18505l;
    }

    public final void setPlaylistId(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f50671A = str;
    }

    public final void setVideoSource(C9769e c9769e) {
        m52153A();
        if (c9769e != null && c9769e.m52762f()) {
            this.f50683z = c9769e;
            m52152x();
        }
    }

    /* renamed from: y */
    public final void m52159y() {
        m52153A();
        ZVideoView zVideoView = this.f50672B;
        if (zVideoView != null) {
            zVideoView.setOnPlayerStateChangedListener(null);
            zVideoView.setOnInfoListener(null);
            zVideoView.m92412f0(true);
        }
    }

    /* renamed from: z */
    public final void m52160z(float f11, float f12) {
        setScaleX(f11);
        setScaleY(f12);
    }
}
