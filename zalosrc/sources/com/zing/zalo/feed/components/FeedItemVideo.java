package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import ao.InterfaceC2266h;
import bo.AbstractC3059y0;
import bo.C3000l0;
import bo.C3020p0;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.components.video.FeedVideoSpeakerView;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.C13621e2;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.upload.video.C16727a;
import com.zing.zalo.videoplayer.VideoThumbnailView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zplayer.C17395R;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import hf0.AbstractC20049k;
import hf0.C20040b;
import hf0.C20047i;
import ho0.AbstractC20110a;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23170p;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p106dp.AbstractC18038a;
import p106dp.C18039b;
import p106dp.C18040c;
import p348mi.C23307g;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p458qr.C25482o;
import p509sp.C26356e;
import p615wn.C29106b;
import p615wn.C29109e;
import p616wo.C29116a;
import sn.C26333b;
import vg.C28075g8;
import vn.C28304f;

/* loaded from: classes4.dex */
public class FeedItemVideo extends FeedItemBase implements C20040b.c, AnimationTarget, C20047i.a {

    /* renamed from: A0 */
    private int f44857A0;

    /* renamed from: B0 */
    private int f44858B0;

    /* renamed from: C0 */
    C3020p0 f44859C0;

    /* renamed from: D0 */
    public View f44860D0;

    /* renamed from: E0 */
    private C28304f f44861E0;

    /* renamed from: F0 */
    int f44862F0;

    /* renamed from: G0 */
    int f44863G0;

    /* renamed from: H0 */
    int f44864H0;

    /* renamed from: I0 */
    private boolean f44865I0;

    /* renamed from: J0 */
    boolean f44866J0;

    /* renamed from: K0 */
    View.OnClickListener f44867K0;

    /* renamed from: L0 */
    View.OnClickListener f44868L0;

    /* renamed from: M0 */
    private boolean f44869M0;

    /* renamed from: N0 */
    Runnable f44870N0;

    /* renamed from: r0 */
    public ZVideoView f44871r0;

    /* renamed from: s0 */
    public C3977j f44872s0;

    /* renamed from: t0 */
    public VideoThumbnailView f44873t0;

    /* renamed from: u0 */
    public AspectRatioImageView f44874u0;

    /* renamed from: v0 */
    C17391z f44875v0;

    /* renamed from: w0 */
    public ImageView f44876w0;

    /* renamed from: x0 */
    private C13621e2 f44877x0;

    /* renamed from: y0 */
    FeedVideoSpeakerView f44878y0;

    /* renamed from: z0 */
    private View f44879z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemVideo$a */
    /* loaded from: classes4.dex */
    public class ViewOnClickListenerC8149a implements View.OnClickListener {
        ViewOnClickListenerC8149a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener onClickListener = FeedItemVideo.this.f44868L0;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideo$b */
    /* loaded from: classes4.dex */
    public class C8150b extends C23999j {
        C8150b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    FeedItemVideo.this.f44871r0.setEnableBlurThumb(false);
                    FeedItemVideo.this.f44871r0.setLoadingViewImageInfo(c3979l);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
    }

    public FeedItemVideo(Context context) {
        super(context);
        this.f44862F0 = 0;
        this.f44863G0 = 0;
        this.f44864H0 = 0;
        this.f44865I0 = true;
        this.f44866J0 = true;
        this.f44867K0 = new ViewOnClickListenerC8149a();
        this.f44869M0 = false;
        this.f44870N0 = new Runnable() { // from class: com.zing.zalo.feed.components.z4
            public /* synthetic */ RunnableC8449z4() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FeedItemVideo.this.m44201o0();
            }
        };
    }

    /* renamed from: a0 */
    private void m44192a0(AbstractC18038a abstractC18038a) {
        C18040c m95896b;
        boolean z11;
        int i11;
        try {
            int i12 = 4;
            if (this.f44296f0 == 4) {
                m95896b = C18039b.f91314a.m95897c(abstractC18038a);
            } else {
                m95896b = C18039b.f91314a.m95896b(abstractC18038a);
            }
            boolean z12 = true;
            if (m95896b.m95905h() != AbstractC23136l9.m118666N0(this.f44871r0.getVideoController().f88210s.f88582v)) {
                this.f44871r0.getVideoController().f88210s.m92503D(m95896b.m95905h(), true);
            }
            if (m95896b.m95901d() != AbstractC23136l9.m118666N0(this.f44879z0)) {
                View view = this.f44879z0;
                if (m95896b.m95901d()) {
                    i12 = 0;
                }
                AbstractC23136l9.m118744r1(view, i12);
            }
            if (this.f44877x0 != null) {
                boolean m95900c = m95896b.m95900c();
                if (this.f44877x0.m89136d0() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (m95900c != z11) {
                    C13621e2 c13621e2 = this.f44877x0;
                    if (m95896b.m95900c()) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    c13621e2.mo44614b1(i11);
                }
            }
            if (this.f44877x0 != null && m95896b.m95900c()) {
                this.f44877x0.m76197l1(0);
            }
            if (this.f44861E0 != null && m95896b.m95903f() != this.f44861E0.m142581b() && this.f44860D0 != null) {
                if (m95896b.m95903f()) {
                    this.f44861E0.m142583e(500L);
                } else {
                    this.f44861E0.m142582d();
                }
            }
            if (this.f44878y0 != null && m95896b.m95902e() != this.f44878y0.m44956n()) {
                if (m95896b.m95902e()) {
                    this.f44878y0.m44958s();
                } else {
                    this.f44878y0.m44954i();
                }
            }
            boolean m95904g = m95896b.m95904g();
            if (this.f44871r0.getVideoController().f88210s.m92511c() != 0) {
                z12 = false;
            }
            if (m95904g != z12) {
                this.f44871r0.getVideoController().m92300X(m95896b.m95904g());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122775e("FeedItemVideo", "changeState: ", e11);
        }
    }

    /* renamed from: e0 */
    private void m44193e0(Context context) {
        this.f44879z0 = new View(context);
        this.f44879z0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f44879z0.setVisibility(8);
        this.f44879z0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.d5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemVideo.m44200n0(view);
            }
        });
    }

    /* renamed from: g0 */
    private void m44194g0(Context context) {
        C13621e2 c13621e2 = new C13621e2(context);
        this.f44877x0 = c13621e2;
        c13621e2.m89106L().m89028L(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f)).m89032P(0, 0, AbstractC23136l9.m118742r(14.0f), AbstractC23136l9.m118742r(8.0f));
        this.f44877x0.m76193h1(0);
        this.f44877x0.m76192g1(AbstractC23136l9.m118742r(2.0f));
        this.f44877x0.m76195j1(false);
        this.f44877x0.m76196k1(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(24.0f));
        this.f44877x0.m76197l1(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        ModulesView modulesView = new ModulesView(context);
        modulesView.setLayoutParams(layoutParams);
        modulesView.mo69681L(this.f44877x0);
        addView(modulesView);
    }

    /* renamed from: i0 */
    public /* synthetic */ void m44195i0(int i11) {
        if (i11 != 0 && i11 != 5 && i11 != 6) {
            if (i11 == 4) {
                m44192a0(AbstractC18038a.e.f91311a);
                m44216y0();
                return;
            }
            if (i11 == 1) {
                m44192a0(AbstractC18038a.g.f91313a);
                return;
            }
            if (i11 == 3) {
                C7853b.m40052a0().m40108T0();
                C7853b.m40052a0().m40136j1();
                m44192a0(AbstractC18038a.f.f91312a);
                m44206u0();
                m44216y0();
                this.f44869M0 = true;
                m44208A0();
                return;
            }
            return;
        }
        m44192a0(AbstractC18038a.a.f91307a);
    }

    /* renamed from: j0 */
    public /* synthetic */ void m44196j0(IMediaPlayer iMediaPlayer) {
        try {
            this.f44871r0.getVideoController().m92303b0();
            this.f44871r0.getVideoController().m92305g();
            AbstractC20049k.m104118l(this.f44875v0.f88618a, 1);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: l0 */
    public /* synthetic */ boolean m44198l0(InterfaceC2259a interfaceC2259a, IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
        boolean z11;
        if (iMediaPlayer != null) {
            if (i11 == 3) {
                C3020p0 c3020p0 = this.f44859C0;
                if (c3020p0 != null) {
                    C25482o.f122075a.m131990K(c3020p0.f12057p);
                }
                this.f44871r0.getVideoController().m92305g();
                m44192a0(AbstractC18038a.f.f91312a);
            } else if (i11 == 10022) {
                if (i12 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f44865I0 = z11;
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.feed.components.a5

                    /* renamed from: q */
                    public final /* synthetic */ InterfaceC2259a f45170q;

                    public /* synthetic */ RunnableC8230a5(InterfaceC2259a interfaceC2259a2) {
                        r2 = interfaceC2259a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedItemVideo.this.m44197k0(r2);
                    }
                });
            } else if (i11 == 702 && this.f44871r0.isPlaying()) {
                m44192a0(AbstractC18038a.f.f91312a);
            } else if (i11 == 701 || i11 == 704) {
                m44192a0(AbstractC18038a.b.f91308a);
            }
        }
        return false;
    }

    /* renamed from: m0 */
    public /* synthetic */ void m44199m0(View view) {
        View.OnClickListener onClickListener;
        if (m44212h0() && (onClickListener = this.f44868L0) != null) {
            onClickListener.onClick(view);
        }
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m44200n0(View view) {
    }

    /* renamed from: o0 */
    public /* synthetic */ void m44201o0() {
        ZVideoView zVideoView = this.f44871r0;
        if (zVideoView != null && this.f44859C0 != null) {
            int videoFPS = zVideoView.getVideoFPS();
            if (videoFPS >= 0) {
                C26333b.f125013a.m135523s(this.f44859C0.f12057p, 1, videoFPS);
            }
            if (this.f44869M0) {
                m44208A0();
            }
        }
    }

    /* renamed from: p0 */
    public /* synthetic */ void m44202p0(InterfaceC2259a interfaceC2259a) {
        m44209Z(false, interfaceC2259a);
    }

    /* renamed from: q0 */
    public /* synthetic */ void m44203q0(InterfaceC2259a interfaceC2259a, boolean z11) {
        if (z11) {
            post(new Runnable() { // from class: com.zing.zalo.feed.components.e5

                /* renamed from: q */
                public final /* synthetic */ InterfaceC2259a f45326q;

                public /* synthetic */ RunnableC8266e5(InterfaceC2259a interfaceC2259a2) {
                    r2 = interfaceC2259a2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FeedItemVideo.this.m44202p0(r2);
                }
            });
        }
    }

    /* renamed from: r0 */
    public /* synthetic */ void m44204r0(InterfaceC2259a interfaceC2259a, View view) {
        ContactProfile m118084d = AbstractC23028c0.m118084d(this.f44859C0.f12022B.f12280b);
        if (interfaceC2259a != null && m118084d != null) {
            interfaceC2259a.mo11959k0(m118084d);
            AbstractC23647d.m123897g("4914003");
        }
    }

    /* renamed from: s0 */
    public /* synthetic */ void m44205s0(InterfaceC2259a interfaceC2259a) {
        if (this.f44865I0) {
            interfaceC2259a.mo11950cx();
        }
    }

    /* renamed from: u0 */
    private void m44206u0() {
        boolean z11;
        ZMediaPlayerSettings.PlayConfig playConfig;
        boolean z12;
        ZVideoView zVideoView = this.f44871r0;
        if (zVideoView != null) {
            boolean z13 = false;
            if (this.f44296f0 == 4) {
                zVideoView.setStateSpeaker(false);
                return;
            }
            boolean isPlaying = zVideoView.isPlaying();
            if (C29116a.f134962a.mo117210a() && C26356e.f125201a.mo117210a()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.f44865I0 && isPlaying) {
                playConfig = ZMediaPlayerSettings.getPlayConfig(3);
            } else {
                playConfig = ZMediaPlayerSettings.getPlayConfig(8);
            }
            if (!this.f44871r0.m92404K() && (!z11 || !this.f44865I0 || !isPlaying)) {
                z12 = true;
            } else {
                z12 = false;
            }
            playConfig.setSilent(z12);
            this.f44871r0.setPlayConfig(playConfig);
            ZVideoView zVideoView2 = this.f44871r0;
            if (z11 && this.f44865I0 && isPlaying) {
                z13 = true;
            }
            zVideoView2.setStateSpeaker(z13);
        }
    }

    /* renamed from: z0 */
    public void m44197k0(InterfaceC2259a interfaceC2259a) {
        if (this.f44296f0 == 0 && this.f44878y0 != null) {
            if (this.f44865I0 && C29116a.f134962a.mo117210a() && C26356e.f125201a.mo117210a()) {
                this.f44878y0.m44953h(FeedVideoSpeakerView.EnumC8413b.f45824q);
            } else if (this.f44865I0) {
                this.f44878y0.m44953h(FeedVideoSpeakerView.EnumC8413b.f45823p);
            } else {
                this.f44878y0.m44953h(FeedVideoSpeakerView.EnumC8413b.f45825r);
            }
            if (interfaceC2259a != null) {
                this.f44878y0.setSpeakViewCallback(new FeedVideoSpeakerView.InterfaceC8412a() { // from class: com.zing.zalo.feed.components.j5

                    /* renamed from: b */
                    public final /* synthetic */ InterfaceC2259a f45450b;

                    public /* synthetic */ C8311j5(InterfaceC2259a interfaceC2259a2) {
                        r2 = interfaceC2259a2;
                    }

                    @Override // com.zing.zalo.feed.components.video.FeedVideoSpeakerView.InterfaceC8412a
                    /* renamed from: a */
                    public final void mo44382a() {
                        FeedItemVideo.this.m44205s0(r2);
                    }
                });
            }
        }
    }

    /* renamed from: A0 */
    public void m44208A0() {
        this.f44303m0.postDelayed(this.f44870N0, 1000L);
    }

    /* renamed from: Z */
    public void m44209Z(boolean z11, InterfaceC2259a interfaceC2259a) {
        boolean z12;
        ZVideoView zVideoView;
        int i11;
        int i12;
        int i13;
        int i14;
        AspectRatioImageView aspectRatioImageView;
        C3977j c3977j;
        int i15;
        int i16;
        C17391z mo43894b0 = mo43894b0();
        this.f44875v0 = mo43894b0;
        boolean z13 = false;
        if (mo43894b0 != null) {
            String str = mo43894b0.f88622e;
            ZVideoView zVideoView2 = this.f44871r0;
            if (zVideoView2 != null) {
                int i17 = this.f44296f0;
                if (i17 != 0 && i17 != 4) {
                    if (i17 == 11) {
                        C23307g c23307g = this.f44859C0.f12023C.f12119j;
                        if (c23307g != null && (i15 = c23307g.f113474a) > 0 && (i16 = c23307g.f113475b) > 0) {
                            float f11 = (i15 * 1.0f) / i16;
                            zVideoView2.setUseVideoRatio(false);
                            if (f11 < 1.0f) {
                                f11 = 1.0f;
                            }
                            this.f44871r0.setUseVideoRatio(true);
                            this.f44871r0.setVideoRatio(f11);
                            this.f44871r0.setUseMinRatio(true);
                            this.f44871r0.setMinRatio(1.0f);
                        } else {
                            zVideoView2.setUseVideoRatio(true);
                            this.f44871r0.setVideoRatio(1.0f);
                            this.f44871r0.setUseMinRatio(true);
                            this.f44871r0.setMinRatio(1.0f);
                        }
                    }
                } else {
                    zVideoView2.setBackgroundColor(getResources().getColor(C17395R.color.transparent));
                    C23307g c23307g2 = this.f44859C0.f12023C.f12119j;
                    if (this.f44862F0 <= 0 && this.f44863G0 <= 0) {
                        this.f44862F0 = AbstractC23136l9.m118722k0();
                    }
                    int m118742r = this.f44862F0 - AbstractC23136l9.m118742r(24.0f);
                    if (c23307g2 != null && c23307g2.f113474a > 0 && c23307g2.f113475b > 0 && m118742r > 0) {
                        this.f44871r0.setUseVideoRatio(false);
                        int i18 = c23307g2.f113474a;
                        int i19 = c23307g2.f113475b;
                        float f12 = i18 / (i19 * 1.0f);
                        float f13 = m118742r;
                        int i21 = (int) (f13 / f12);
                        if (i18 >= i19) {
                            if (f12 > 2.3333333f) {
                                i21 = (int) (f13 / 2.3333333f);
                                this.f44871r0.setBackgroundColor(getResources().getColor(C17395R.color.black));
                            }
                            this.f44871r0.setVideoPlayerMode(2);
                        } else {
                            if (f12 <= 0.75f) {
                                i21 = (int) (f13 / 0.75f);
                            }
                            this.f44871r0.setVideoPlayerMode(1);
                        }
                        if (this.f44857A0 != m118742r || this.f44858B0 != i21) {
                            this.f44857A0 = m118742r;
                            this.f44858B0 = i21;
                            ViewGroup.LayoutParams layoutParams = this.f44871r0.getLayoutParams();
                            layoutParams.width = m118742r;
                            layoutParams.height = i21;
                            this.f44871r0.setLayoutParams(layoutParams);
                            View view = this.f44879z0;
                            if (view != null) {
                                if (this.f44296f0 == 4) {
                                    try {
                                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f44871r0.getLayoutParams();
                                        layoutParams2.addRule(12);
                                        this.f44879z0.setLayoutParams(layoutParams2);
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                } else {
                                    view.setLayoutParams(layoutParams);
                                }
                            }
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams3 = this.f44871r0.getLayoutParams();
                        layoutParams3.width = -1;
                        layoutParams3.height = -2;
                        this.f44871r0.setLayoutParams(layoutParams3);
                        this.f44871r0.setUseVideoRatio(true);
                        this.f44871r0.setVideoPlayerMode(0);
                        View view2 = this.f44879z0;
                        if (view2 != null) {
                            view2.setLayoutParams(layoutParams3);
                        }
                    }
                }
                if (this.f44871r0.getLoadingView() != null) {
                    this.f44871r0.getLoadingView().setScaleType(ImageView.ScaleType.CENTER_CROP);
                    this.f44871r0.getLoadingView().setImageDrawable(AbstractC23170p.m119358p(getContext()));
                }
                C24003n m120126f0 = C23278z2.m120126f0();
                C23528a c23528a = this.f44295e0;
                if (c23528a != null && (c3977j = this.f44872s0) != null) {
                    if (this.f44296f0 == 2) {
                        m120126f0.f116284y = true;
                    }
                    ((C23528a) c23528a.m123612r(c3977j)).m123578B(str, m120126f0, C3979l.b.UNKNOWN, new C8150b());
                }
                C17391z c17391z = this.f44875v0;
                c17391z.f88629l = 1;
                this.f44871r0.setZVideo(c17391z);
                this.f44871r0.setSkipShowControlWhenStart(true);
                this.f44871r0.setOnPlayerStateChangedListener(new ZVideoView.InterfaceC17345q() { // from class: com.zing.zalo.feed.components.f5
                    public /* synthetic */ C8275f5() {
                    }

                    @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
                    /* renamed from: D */
                    public final void mo44076D(int i22) {
                        FeedItemVideo.this.m44195i0(i22);
                    }
                });
                this.f44871r0.getVideoController().setViewMode(1);
                this.f44871r0.getVideoController().setOnFullScreenClickListener(this.f44867K0);
                this.f44871r0.getVideoController().setPlayListener(this.f44867K0);
                this.f44871r0.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: com.zing.zalo.feed.components.g5
                    public /* synthetic */ C8284g5() {
                    }

                    @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnCompletionListener
                    public final void onVideoCompletion(IMediaPlayer iMediaPlayer) {
                        FeedItemVideo.this.m44196j0(iMediaPlayer);
                    }
                });
                this.f44871r0.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: com.zing.zalo.feed.components.h5

                    /* renamed from: q */
                    public final /* synthetic */ InterfaceC2259a f45398q;

                    public /* synthetic */ C8293h5(InterfaceC2259a interfaceC2259a2) {
                        r2 = interfaceC2259a2;
                    }

                    @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
                    public final boolean onInfo(IMediaPlayer iMediaPlayer, int i22, int i23, Object obj) {
                        boolean m44198l0;
                        m44198l0 = FeedItemVideo.this.m44198l0(r2, iMediaPlayer, i22, i23, obj);
                        return m44198l0;
                    }
                });
                this.f44871r0.setAudioFocusControl(C28075g8.m141538e());
                if (!this.f44871r0.isPlaying()) {
                    if (this.f44871r0.getCurrentState() == 1) {
                        m44192a0(AbstractC18038a.g.f91313a);
                    }
                    this.f44871r0.getVideoController().m92306h(true);
                }
            } else {
                int i22 = this.f44296f0;
                if (i22 == 6 && (aspectRatioImageView = this.f44874u0) != null) {
                    aspectRatioImageView.setRatio(0.6666667f);
                    this.f44874u0.setScaleOption(3);
                    this.f44874u0.setImageDrawable(AbstractC23170p.m119358p(getContext()));
                    if (!z11 || C23999j.m125696L2(str, C23278z2.m120126f0())) {
                        ((C23528a) this.f44295e0.m123612r(this.f44874u0)).m123618x(str, C23278z2.m120126f0());
                    }
                } else {
                    VideoThumbnailView videoThumbnailView = this.f44873t0;
                    if (videoThumbnailView != null) {
                        if (i22 == 2) {
                            videoThumbnailView.setRatio(1.0f);
                        } else if (i22 == 1) {
                            videoThumbnailView.setRatio(0.0f);
                        } else {
                            C23307g c23307g3 = this.f44859C0.f12023C.f12119j;
                            if (c23307g3 != null && (i13 = c23307g3.f113474a) > 0 && (i14 = c23307g3.f113475b) > 0) {
                                videoThumbnailView.setRatio((i13 * 1.0f) / i14);
                            }
                        }
                        this.f44873t0.setImageDrawable(AbstractC23170p.m119358p(getContext()));
                        C24003n m120126f02 = C23278z2.m120126f0();
                        if (!z11 || C23999j.m125696L2(str, m120126f02)) {
                            if (this.f44296f0 == 2) {
                                m120126f02.f116284y = true;
                            }
                            ((C23528a) this.f44295e0.m123612r(this.f44873t0)).m123618x(str, m120126f02);
                        }
                        this.f44873t0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.i5
                            public /* synthetic */ ViewOnClickListenerC8302i5() {
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                FeedItemVideo.this.m44199m0(view3);
                            }
                        });
                    }
                }
            }
        }
        if (this.f44860D0 != null) {
            boolean m44212h0 = m44212h0();
            C3020p0 c3020p0 = this.f44859C0;
            if (c3020p0 != null && !m44212h0 && c3020p0.m14493X() && ((i12 = this.f44296f0) == 0 || i12 == 2 || i12 == 3)) {
                m44192a0(AbstractC18038a.d.f91310a);
            }
            VideoThumbnailView videoThumbnailView2 = this.f44873t0;
            if (videoThumbnailView2 != null) {
                videoThumbnailView2.setDrawPlayIcon(true);
            }
            ZVideoView zVideoView3 = this.f44871r0;
            if (zVideoView3 != null && !m44212h0 && (i11 = this.f44296f0) != 0 && i11 != 2 && i11 != 3) {
                zVideoView3.getVideoController().m92295S(false);
            }
        }
        C3000l0 c3000l0 = this.f44298h0;
        if (c3000l0 != null && c3000l0.m14285C0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        C3000l0 c3000l02 = this.f44298h0;
        if (c3000l02 != null && c3000l02.m14322a0() != null && !this.f44298h0.m14322a0().m14498b0()) {
            z13 = true;
        }
        if (z12 && z13 && !m44212h0() && (zVideoView = this.f44871r0) != null && zVideoView.getVideoController() != null) {
            m44192a0(AbstractC18038a.c.f91309a);
        }
    }

    /* renamed from: b0 */
    protected C17391z mo43894b0() {
        return AbstractC20826v0.m108789V(this.f44859C0);
    }

    /* renamed from: c0 */
    public void m44210c0(View... viewArr) {
        try {
            if (viewArr.length <= 0) {
                return;
            }
            for (View view : viewArr) {
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // hf0.C20040b.c
    /* renamed from: d */
    public void mo44058d(int i11, int i12) {
    }

    /* renamed from: d0 */
    public void m44211d0() {
        if (this.f44296f0 == 11) {
            m44210c0(this.f44306p, this.f44308r, this.f44311u, this.f44282O, this.f44283P);
        }
    }

    @Override // hf0.C20040b.c
    /* renamed from: f */
    public boolean mo44060f() {
        boolean z11;
        boolean z12;
        C17391z c17391z;
        int i11 = this.f44296f0;
        if (i11 != 0 && i11 != 4) {
            return false;
        }
        C3000l0 c3000l0 = this.f44298h0;
        if (c3000l0 != null && c3000l0.m14285C0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3000l0 c3000l02 = this.f44298h0;
        if (c3000l02 != null && c3000l02.m14322a0() != null && !this.f44298h0.m14322a0().m14498b0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((z11 && z12) || this.f44859C0.f12023C.f12095D || (c17391z = this.f44875v0) == null || !c17391z.m92539d(ZMediaPlayerSettings.getVideoConfig(1))) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    protected void mo43896f0(Context context, int i11) {
        try {
            this.f44296f0 = i11;
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            int i12 = this.f44296f0;
            if (i12 == 1) {
                layoutInflater.inflate(AbstractC7409c0.feed_item_video_content_group, this);
                this.f44873t0 = (VideoThumbnailView) findViewById(AbstractC6918a0.imvMediaThumb);
                RobotoTextView robotoTextView = this.f44283P;
                if (robotoTextView != null) {
                    robotoTextView.setMaxLines(1);
                    this.f44283P.setEllipsize(TextUtils.TruncateAt.END);
                }
            } else {
                if (i12 != 0 && i12 != 3) {
                    if (i12 == 4) {
                        layoutInflater.inflate(AbstractC7409c0.feed_item_video_content_detail, this);
                        this.f44871r0 = (ZVideoView) findViewById(AbstractC6918a0.zaloVideoViewBig);
                        this.f44876w0 = (ImageView) findViewById(AbstractC6918a0.video_placeholder);
                        this.f44860D0 = findViewById(AbstractC6918a0.vVideoProcessing);
                        this.f44871r0.setEnablePreciseDimension(true);
                        this.f44871r0.setRoundCorner(AbstractC23136l9.m118742r(10.0f));
                        m44194g0(context);
                        m44193e0(context);
                        try {
                            ((RelativeLayout) this.f44871r0.getParent()).addView(this.f44879z0);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        AbstractC23136l9.m118729m1(this.f44876w0, AbstractC23136l9.m118742r(10.0f));
                    } else if (i12 == 2) {
                        setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ProfilePrimaryBackgroundColor));
                        layoutInflater.inflate(AbstractC7409c0.feed_item_video_content_profile_direct, this);
                        this.f44873t0 = (VideoThumbnailView) findViewById(AbstractC6918a0.imvMediaThumb);
                        this.f44860D0 = findViewById(AbstractC6918a0.vVideoProcessing);
                        View findViewById = findViewById(AbstractC6918a0.profile_feed_video_thumb_group);
                        if (findViewById != null) {
                            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                            layoutParams.width = AbstractC20814p0.m108611J();
                            layoutParams.height = AbstractC20814p0.m108611J();
                            findViewById.setLayoutParams(layoutParams);
                        }
                    } else if (i12 == 6) {
                        layoutInflater.inflate(AbstractC7409c0.feed_item_video_content_chat, this);
                        this.f44874u0 = (AspectRatioImageView) findViewById(AbstractC6918a0.imvChatMediaThumb);
                    } else if (i12 == 11) {
                        layoutInflater.inflate(AbstractC7409c0.feed_item_video_content_memory, this);
                        this.f44871r0 = (ZVideoView) findViewById(AbstractC6918a0.zaloVideoViewBig);
                        int m118742r = AbstractC23136l9.m118742r(12.0f);
                        View findViewById2 = findViewById(AbstractC6918a0.layoutLinkBig);
                        if (findViewById2 != null) {
                            findViewById2.setPadding(m118742r, 0, m118742r, 0);
                        }
                        setPadding(0, m118742r, 0, 0);
                    }
                }
                layoutInflater.inflate(AbstractC7409c0.feed_item_video_content, this);
                this.f44871r0 = (ZVideoView) findViewById(AbstractC6918a0.zaloVideoViewBig);
                this.f44876w0 = (ImageView) findViewById(AbstractC6918a0.video_placeholder);
                this.f44871r0.setEnablePreciseDimension(true);
                this.f44871r0.setRoundCorner(AbstractC23136l9.m118742r(10.0f));
                AbstractC23136l9.m118729m1(this.f44876w0, AbstractC23136l9.m118742r(10.0f));
                ZMediaPlayerSettings.PlayConfig playConfig = ZMediaPlayerSettings.getPlayConfig(8);
                playConfig.setSilent(!this.f44871r0.m92404K());
                this.f44871r0.setPlayConfig(playConfig);
                this.f44871r0.setMute(true);
                this.f44871r0.setVolume(0.0f);
                this.f44878y0 = (FeedVideoSpeakerView) findViewById(AbstractC6918a0.btn_speaker);
                this.f44860D0 = findViewById(AbstractC6918a0.vVideoProcessing);
                this.f44878y0.m44955k();
                m44193e0(context);
                addView(this.f44879z0);
                setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
            }
            ZVideoView zVideoView = this.f44871r0;
            if (zVideoView != null) {
                zVideoView.getVideoController().f88210s.f88566d0 = AbstractC16803z.icn_csc_play_big_selector;
                this.f44871r0.getVideoController().f88210s.f88567e0 = AbstractC16803z.icn_csc_play_big_selector;
                this.f44871r0.getVideoController().f88210s.f88554R.getLayoutParams().width = AbstractC23136l9.m118742r(48.0f);
                this.f44871r0.getVideoController().f88210s.f88554R.getLayoutParams().height = AbstractC23136l9.m118742r(48.0f);
                this.f44871r0.getVideoController().f88210s.m92515h(false);
                this.f44871r0.getVideoController().m92304c0();
            }
            View view = this.f44860D0;
            if (view != null) {
                ((ProgressBar) view.findViewById(AbstractC6918a0.pbVideoProcessing)).setIndeterminateDrawable(AbstractC23136l9.m118665N(context, AbstractC16803z.feed_video_loading));
                this.f44861E0 = new C28304f(this.f44860D0);
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        return getVideoCoords();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public List<Integer> getArrIdsListCallback() {
        List<Integer> arrIdsListCallback = super.getArrIdsListCallback();
        arrIdsListCallback.add(14);
        return arrIdsListCallback;
    }

    @Override // hf0.C20040b.c
    public int getDataPosition() {
        Object tag = getTag(AbstractC6918a0.id_video_data_index);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    @Override // hf0.C20040b.c
    public ZVideoView getNewVideoView() {
        return this.f44871r0;
    }

    public C17391z getVideo() {
        return this.f44875v0;
    }

    public Rect getVideoCoords() {
        View videoDisplayView = getVideoDisplayView();
        if (videoDisplayView == null) {
            return null;
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        videoDisplayView.getLocationInWindow(iArr);
        int i11 = iArr[0];
        rect.left = i11;
        rect.top = iArr[1];
        rect.right = i11 + videoDisplayView.getWidth();
        rect.bottom = rect.top + videoDisplayView.getHeight();
        return rect;
    }

    public View getVideoDisplayView() {
        int i11 = this.f44296f0;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 6) {
                            return this.f44874u0;
                        }
                        if (i11 != 11) {
                            return null;
                        }
                    }
                }
            }
            return this.f44873t0;
        }
        return this.f44871r0;
    }

    /* renamed from: h0 */
    boolean m44212h0() {
        if (!this.f44859C0.m14493X() && !this.f44859C0.f12023C.f12095D) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
        if (c29106b instanceof C29109e) {
            setFeedContent(c29106b.f134937a);
            mo43681A(c29106b.f134937a, 0, c29106b.f134940d, c29106b.f134942f);
            setReleaseWhenDetached(false);
            C29109e c29109e = (C29109e) c29106b;
            m44214v0(c29109e.f134951k, c29109e.f134952l);
            mo43897w0(c29106b.f134937a, 0, c29106b.f134940d, c29106b.f134939c, c29106b.f134942f, c29106b.f134941e);
            m43687l();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f44866J0) {
            m44213t0();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        mo43896f0(context, i11);
        if (this.f44871r0 != null) {
            this.f44872s0 = new C3977j(context);
        }
        super.mo43688p(context, this.f44296f0);
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public void setAnimTargetVisibility(int i11) {
    }

    @Override // hf0.C20040b.c
    public void setCurrentVideoView(boolean z11) {
    }

    public void setFeedItem(C3020p0 c3020p0) {
        this.f44859C0 = c3020p0;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public void setListListener(SparseArray<View.OnClickListener> sparseArray) {
        super.setListListener(sparseArray);
        setOnVideoViewClickListener(sparseArray.get(14));
    }

    public void setOnVideoViewClickListener(View.OnClickListener onClickListener) {
        this.f44868L0 = onClickListener;
    }

    public void setReleaseWhenDetached(boolean z11) {
        this.f44866J0 = z11;
    }

    public void setShrinkHeight(int i11) {
        if (i11 > 0 && i11 != this.f44864H0 && this.f44296f0 == 11) {
            this.f44864H0 = i11;
            ZVideoView zVideoView = this.f44871r0;
            if (zVideoView != null) {
                float measuredWidth = zVideoView.getMeasuredWidth();
                float measuredHeight = this.f44871r0.getMeasuredHeight();
                if (measuredWidth > 0.0f) {
                    float f11 = i11;
                    if (measuredHeight > f11) {
                        this.f44871r0.setUseVideoRatio(true);
                        this.f44871r0.setVideoRatio(measuredWidth / (measuredHeight - f11));
                        this.f44871r0.setUseMinRatio(true);
                        this.f44871r0.setMinRatio(1.0f);
                        this.f44871r0.requestLayout();
                    }
                }
            }
        }
    }

    /* renamed from: t0 */
    public void m44213t0() {
        ZVideoView zVideoView = this.f44871r0;
        if (zVideoView != null) {
            zVideoView.m92429s0();
            this.f44871r0.m92412f0(true);
            m44216y0();
        }
    }

    /* renamed from: v0 */
    public void m44214v0(int i11, int i12) {
        this.f44862F0 = i11;
        this.f44863G0 = i12;
    }

    /* renamed from: w0 */
    public void mo43897w0(C3000l0 c3000l0, int i11, boolean z11, Context context, InterfaceC10867f interfaceC10867f, InterfaceC2259a interfaceC2259a) {
        m44215x0(c3000l0, i11, z11, context, interfaceC10867f, interfaceC2259a, null);
    }

    /* renamed from: x0 */
    public void m44215x0(C3000l0 c3000l0, int i11, boolean z11, Context context, InterfaceC10867f interfaceC10867f, InterfaceC2259a interfaceC2259a, InterfaceC2266h interfaceC2266h) {
        boolean z12;
        boolean z13;
        int i12;
        FeedVideoSpeakerView feedVideoSpeakerView;
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            C3020p0 c3020p0 = this.f44859C0;
            if (c3020p0 != null && m14324b0 != null && !c3020p0.f12057p.equals(m14324b0.f12057p) && (feedVideoSpeakerView = this.f44878y0) != null) {
                feedVideoSpeakerView.m44957p();
            }
            setFeedItem(m14324b0);
            C3020p0 c3020p02 = this.f44859C0;
            if (c3020p02 == null) {
                return;
            }
            int i13 = this.f44296f0;
            if (i13 == 1) {
                AbstractC20814p0.m108681y0(c3000l0, c3020p02, this.f44269B, this.f44270C, this.f44274G, c3000l0.f11861J, context, interfaceC10867f, this.f44299i0);
            } else if (i13 != 6 && i13 != 0) {
                if (i13 == 4) {
                    AbstractC20814p0.m108598C0(c3020p02, this.f44269B, this.f44271D, this.f44272E, this.f44274G, false, false, context, interfaceC10867f, interfaceC2266h, true, this.f44299i0, i13);
                } else if (i13 == 11) {
                    AbstractC20814p0.m108598C0(c3020p02, this.f44269B, this.f44271D, this.f44272E, this.f44274G, true, false, context, interfaceC10867f, interfaceC2266h, true, this.f44299i0, i13);
                } else {
                    AbstractC20814p0.m108675v0(c3020p02, this.f44269B, true, false, context, interfaceC10867f);
                }
            } else {
                RobotoTextView robotoTextView = this.f44269B;
                RobotoTextView robotoTextView2 = this.f44271D;
                FeedBackgroundView feedBackgroundView = this.f44274G;
                if (i13 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                AbstractC20814p0.m108598C0(c3020p02, robotoTextView, robotoTextView2, null, feedBackgroundView, true, z12, context, interfaceC10867f, null, false, this.f44299i0, i13);
            }
            AbstractC20814p0.m108669s0(context, this.f44859C0, this.f44283P, interfaceC2259a, this.f44296f0);
            m43684N(c3000l0, this.f44859C0);
            C16727a.m89188i().m89195g(c3000l0, this.f44859C0, new C16727a.c() { // from class: com.zing.zalo.feed.components.b5

                /* renamed from: b */
                public final /* synthetic */ InterfaceC2259a f45255b;

                public /* synthetic */ C8239b5(InterfaceC2259a interfaceC2259a2) {
                    r2 = interfaceC2259a2;
                }

                @Override // com.zing.zalo.upload.video.C16727a.c
                /* renamed from: a */
                public final void mo44079a(boolean z14) {
                    FeedItemVideo.this.m44203q0(r2, z14);
                }
            });
            m44197k0(interfaceC2259a2);
            m44206u0();
            m44209Z(z11, interfaceC2259a2);
            if (this.f44315y != null) {
                C3020p0 c3020p03 = this.f44859C0;
                if (AbstractC20826v0.m108828p0(c3020p03.f12058q, c3020p03.m14518m0()) && !CoreUtility.f89233i.equals(this.f44859C0.m14465A()) && AbstractC3059y0.m14708c(this.f44296f0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ImageButton imageButton = this.f44315y;
                if (z13) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageButton.setVisibility(i12);
                this.f44315y.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.c5

                    /* renamed from: q */
                    public final /* synthetic */ InterfaceC2259a f45273q;

                    public /* synthetic */ ViewOnClickListenerC8248c5(InterfaceC2259a interfaceC2259a2) {
                        r2 = interfaceC2259a2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FeedItemVideo.this.m44204r0(r2, view);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: y0 */
    public void m44216y0() {
        this.f44869M0 = false;
        this.f44303m0.removeCallbacks(this.f44870N0);
    }

    public FeedItemVideo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44862F0 = 0;
        this.f44863G0 = 0;
        this.f44864H0 = 0;
        this.f44865I0 = true;
        this.f44866J0 = true;
        this.f44867K0 = new ViewOnClickListenerC8149a();
        this.f44869M0 = false;
        this.f44870N0 = new Runnable() { // from class: com.zing.zalo.feed.components.z4
            public /* synthetic */ RunnableC8449z4() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FeedItemVideo.this.m44201o0();
            }
        };
    }
}
