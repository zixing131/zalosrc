package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3014o;
import bo.C3020p0;
import bo.C3025q0;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.FeedItemSuggestBanner;
import com.zing.zalo.feed.uicontrols.FeedZinstantBanner;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zview.animation.AnimationTarget;
import gg0.AbstractC19444a;
import hf0.AbstractC20049k;
import hf0.C20040b;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23170p;
import me0.C23278z2;
import p348mi.C23307g;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p489rn.C25866f0;
import p615wn.C29105a;
import p615wn.C29106b;
import p716zh.C31845ac;
import p716zh.C32002l4;
import p716zh.C32145v4;
import pj0.InterfaceC24775a;
import vg.AbstractC28025b8;
import vg.C28075g8;
import vg.C28227x3;

/* loaded from: classes4.dex */
public class FeedItemSuggestBanner extends FeedItemSuggestBase implements C20040b.c, AnimationTarget {

    /* renamed from: S0 */
    private final int f44710S0;

    /* renamed from: T0 */
    private ZSimpleGIFView f44711T0;

    /* renamed from: U0 */
    public LinearLayout f44712U0;

    /* renamed from: V0 */
    private RobotoTextView f44713V0;

    /* renamed from: W0 */
    ZVideoView f44714W0;

    /* renamed from: X0 */
    C3977j f44715X0;

    /* renamed from: Y0 */
    private C17391z f44716Y0;

    /* renamed from: Z0 */
    protected ImageButton f44717Z0;

    /* renamed from: a1 */
    protected int f44718a1;

    /* renamed from: b1 */
    FeedZinstantBanner f44719b1;

    /* renamed from: c1 */
    InterfaceC8140d f44720c1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemSuggestBanner$a */
    /* loaded from: classes4.dex */
    public class C8137a extends C23999j {
        C8137a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    FeedItemSuggestBanner.this.f44714W0.setLoadingViewImageInfo(c3979l);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSuggestBanner$b */
    /* loaded from: classes4.dex */
    public class C8138b implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2259a f44722a;

        /* renamed from: b */
        final /* synthetic */ C3025q0.c f44723b;

        C8138b(InterfaceC2259a interfaceC2259a, C3025q0.c cVar) {
            this.f44722a = interfaceC2259a;
            this.f44723b = cVar;
        }

        /* renamed from: d */
        public static /* synthetic */ void m44112d(InterfaceC2259a interfaceC2259a) {
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11964o5();
            }
        }

        /* renamed from: e */
        public /* synthetic */ void m44113e(C3025q0.c cVar) {
            int i11;
            FeedItemSuggestBanner.this.f44719b1.setVisibility(0);
            ImageButton imageButton = FeedItemSuggestBanner.this.f44717Z0;
            if (imageButton != null) {
                C3014o c3014o = cVar.f12168s;
                if (c3014o != null && c3014o.f11997c) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageButton.setVisibility(i11);
            }
            if (FeedItemSuggestBanner.this.f44712U0 != null && !TextUtils.isEmpty(cVar.f12159j) && !cVar.m14574a()) {
                FeedItemSuggestBanner.this.f44712U0.setVisibility(0);
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.feed.components.o4
                public /* synthetic */ RunnableC8350o4() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FeedItemSuggestBanner.C8138b.m44112d(InterfaceC2259a.this);
                }
            });
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: f */
        public void onSuccess(FeedZinstantBanner feedZinstantBanner) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.feed.components.n4

                /* renamed from: q */
                public final /* synthetic */ C3025q0.c f45538q;

                public /* synthetic */ RunnableC8342n4(C3025q0.c cVar) {
                    r2 = cVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FeedItemSuggestBanner.C8138b.this.m44113e(r2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemSuggestBanner$c */
    /* loaded from: classes4.dex */
    public class C8139c extends C23999j {
        C8139c() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            FeedItemSuggestBanner.this.m44108U(true);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSuggestBanner$d */
    /* loaded from: classes4.dex */
    public interface InterfaceC8140d {
        /* renamed from: a */
        void mo44115a(AnimationTarget animationTarget, C17391z c17391z);
    }

    public FeedItemSuggestBanner(Context context) {
        super(context);
        this.f44710S0 = AbstractC23136l9.m118722k0() - AbstractC23136l9.m118742r(4.0f);
        this.f44718a1 = AbstractC23136l9.m118742r(2.0f);
    }

    /* renamed from: V */
    public /* synthetic */ void m44102V(C3020p0 c3020p0, C3025q0.c cVar, InterfaceC2259a interfaceC2259a, TrackingSource trackingSource, View view) {
        AbstractC28025b8.m141442M("tip.timeline.banner.actionbutton");
        C29105a c29105a = new C29105a(getContext(), c3020p0, cVar.f12158i, cVar.f12160k, null, interfaceC2259a, trackingSource);
        c29105a.m145358a(C32002l4.m154265h(10002, 29));
        AbstractC20814p0.m108620O(c29105a);
    }

    /* renamed from: W */
    public static /* synthetic */ void m44103W(InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, C3020p0 c3020p0, View view) {
        AbstractC23647d.m123897g("490344");
        FeedActionZUtils.m47529Q(interfaceC2259a, c3000l0, c3020p0.f12057p, false);
    }

    /* renamed from: X */
    public /* synthetic */ void m44104X(C17391z c17391z, C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, View view) {
        try {
            InterfaceC8140d interfaceC8140d = this.f44720c1;
            if (interfaceC8140d != null) {
                interfaceC8140d.mo44115a(this, c17391z);
            }
            FeedActionZUtils.m47520H(c3020p0, 20);
            C3014o c3014o = c3020p0.f12023C.f12135z.f12168s;
            if (c3014o != null && c3014o.f11995a) {
                AbstractC20826v0.m108806e0(c3020p0.f12057p);
                interfaceC2259a.mo11927O();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y */
    public /* synthetic */ void m44105Y(int i11) {
        if (i11 == 0 || i11 == 5 || i11 == 6) {
            this.f44714W0.m92421n0(true);
        }
    }

    /* renamed from: Z */
    public /* synthetic */ void m44106Z(C17391z c17391z, IMediaPlayer iMediaPlayer) {
        try {
            this.f44714W0.getVideoController().m92303b0();
            this.f44714W0.m92421n0(true);
            this.f44714W0.getVideoController().m92305g();
            AbstractC20049k.m104118l(c17391z.f88618a, 1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a0 */
    public /* synthetic */ boolean m44107a0(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
        if (iMediaPlayer != null && i11 == 3) {
            this.f44714W0.getVideoController().m92305g();
            this.f44714W0.setVolume(0.0f);
            return false;
        }
        return false;
    }

    /* renamed from: U */
    void m44108U(boolean z11) {
        try {
            LinearLayout linearLayout = this.f44712U0;
            if (linearLayout != null) {
                linearLayout.setEnabled(z11);
            }
            RobotoTextView robotoTextView = this.f44713V0;
            if (robotoTextView != null) {
                robotoTextView.setEnabled(z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b0 */
    public void m44109b0(C3000l0 c3000l0, int i11, InterfaceC2259a interfaceC2259a, boolean z11) {
        int i12;
        C3025q0.c cVar;
        float f11;
        float f12;
        int i13;
        int i14;
        int i15;
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            C3025q0.c cVar2 = m14324b0.f12023C.f12135z;
            boolean z12 = false;
            m44108U(false);
            if (cVar2 != null) {
                TrackingSource trackingSource = new TrackingSource(224);
                C32145v4 c32145v4 = m14324b0.f12039S;
                if (c32145v4 != null) {
                    trackingSource.m40677a("campaignId", c32145v4.f148248a);
                }
                int i16 = 8;
                if (this.f44712U0 != null) {
                    if (!TextUtils.isEmpty(cVar2.f12159j) && !cVar2.m14574a()) {
                        this.f44712U0.setVisibility(0);
                        RobotoTextView robotoTextView = this.f44713V0;
                        if (robotoTextView != null) {
                            if (cVar2.m14575b()) {
                                i15 = 0;
                            } else {
                                i15 = AbstractC16803z.bg_feed_share;
                            }
                            robotoTextView.setCompoundDrawablesWithIntrinsicBounds(i15, 0, 0, 0);
                            this.f44713V0.setText(cVar2.f12159j);
                        }
                        m44108U(true);
                    } else {
                        this.f44712U0.setVisibility(8);
                    }
                    this.f44712U0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.h4

                        /* renamed from: q */
                        public final /* synthetic */ C3020p0 f45393q;

                        /* renamed from: r */
                        public final /* synthetic */ C3025q0.c f45394r;

                        /* renamed from: s */
                        public final /* synthetic */ InterfaceC2259a f45395s;

                        /* renamed from: t */
                        public final /* synthetic */ TrackingSource f45396t;

                        public /* synthetic */ ViewOnClickListenerC8292h4(C3020p0 m14324b02, C3025q0.c cVar22, InterfaceC2259a interfaceC2259a2, TrackingSource trackingSource2) {
                            r2 = m14324b02;
                            r3 = cVar22;
                            r4 = interfaceC2259a2;
                            r5 = trackingSource2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FeedItemSuggestBanner.this.m44102V(r2, r3, r4, r5, view);
                        }
                    });
                }
                this.f44749w0.setVisibility(8);
                this.f44711T0.setVisibility(8);
                this.f44714W0.setVisibility(8);
                this.f44719b1.setVisibility(8);
                ImageButton imageButton = this.f44717Z0;
                C3014o c3014o = cVar22.f12168s;
                if (c3014o != null && c3014o.f11997c) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageButton.setVisibility(i12);
                this.f44717Z0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.i4

                    /* renamed from: q */
                    public final /* synthetic */ C3000l0 f45425q;

                    /* renamed from: r */
                    public final /* synthetic */ C3020p0 f45426r;

                    public /* synthetic */ ViewOnClickListenerC8301i4(C3000l0 c3000l02, C3020p0 m14324b02) {
                        r2 = c3000l02;
                        r3 = m14324b02;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FeedItemSuggestBanner.m44103W(InterfaceC2259a.this, r2, r3, view);
                    }
                });
                int i17 = cVar22.f12165p;
                if (i17 != 2) {
                    if (i17 != 3) {
                        if (i17 != 4) {
                            this.f44749w0.setVisibility(0);
                            C23307g c23307g = cVar22.f12166q;
                            if (c23307g != null && (i13 = c23307g.f113474a) > 0 && (i14 = c23307g.f113475b) > 0) {
                                this.f44749w0.setRatio((i13 * 1.0f) / i14);
                            }
                            ((C23528a) this.f44741P0.m123612r(this.f44749w0)).m123613s(AbstractC16803z.bg_feed);
                            if (!z11 || C23999j.m125696L2(cVar22.f12150a, C23278z2.m120126f0())) {
                                ((C23528a) this.f44741P0.m123612r(this.f44749w0)).m123579C(cVar22.f12150a, C23278z2.m120126f0(), (C23999j) new C8139c().m125601Y0(10));
                            }
                            cVar = cVar22;
                            C25866f0.m133492v(this.f44749w0, getContext(), m14324b02, cVar22.f12161l, cVar22.f12162m, null, interfaceC2259a2, trackingSource2);
                        } else {
                            cVar = cVar22;
                            ImageButton imageButton2 = this.f44717Z0;
                            if (imageButton2 != null) {
                                imageButton2.setVisibility(8);
                            }
                            LinearLayout linearLayout = this.f44712U0;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                            m44108U(true);
                            FeedZinstantBanner feedZinstantBanner = this.f44719b1;
                            if (feedZinstantBanner != null) {
                                feedZinstantBanner.m47316g(m14324b02, trackingSource2);
                                this.f44719b1.setFeedCallback(interfaceC2259a2);
                                if (this.f44719b1.m47311a(m14324b02.f12023C.f12135z.f12169t, m14324b02.f12057p, AbstractC23136l9.m118725l0(getContext()))) {
                                    this.f44719b1.setVisibility(0);
                                    if (!z11) {
                                        this.f44719b1.m47314e();
                                    }
                                    ImageButton imageButton3 = this.f44717Z0;
                                    if (imageButton3 != null) {
                                        C3014o c3014o2 = cVar.f12168s;
                                        if (c3014o2 != null && c3014o2.f11997c) {
                                            i16 = 0;
                                        }
                                        imageButton3.setVisibility(i16);
                                    }
                                    if (this.f44712U0 != null && !TextUtils.isEmpty(cVar.f12159j) && !cVar.m14574a()) {
                                        this.f44712U0.setVisibility(0);
                                    }
                                } else {
                                    this.f44719b1.m47315f(m14324b02.f12023C.f12135z.f12169t, AbstractC23136l9.m118725l0(getContext()), new C8138b(interfaceC2259a2, cVar));
                                }
                            }
                        }
                    } else {
                        cVar = cVar22;
                        try {
                            this.f44714W0.setVisibility(0);
                            if (!TextUtils.isEmpty(cVar.f12163n) && !TextUtils.isEmpty(cVar.f12150a)) {
                                String str = cVar.f12150a;
                                String str2 = cVar.f12163n;
                                C28227x3 c28227x3 = cVar.f12167r;
                                if (c28227x3 != null) {
                                    f11 = c28227x3.m142185a();
                                } else {
                                    f11 = 0.0f;
                                }
                                if (f11 > 0.0f) {
                                    z12 = true;
                                }
                                String str3 = m14324b02.f12057p;
                                int i18 = C23278z2.m120136k0().f116260a;
                                if (z12) {
                                    f12 = f11;
                                } else {
                                    f12 = 1.85f;
                                }
                                C17391z c17391z = new C17391z(str3, "", str2, "", str, i18, false, 0, f12, 1, null, m14324b02.m14465A(), i11);
                                c17391z.f88630m = cVar.f12164o;
                                this.f44716Y0 = c17391z;
                                if (this.f44714W0.getLoadingView() != null) {
                                    this.f44714W0.getLoadingView().setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    this.f44714W0.getLoadingView().setImageDrawable(AbstractC23170p.m119358p(getContext()));
                                }
                                if (!z11 || C23999j.m125696L2(str, C23278z2.m120126f0())) {
                                    ((C23528a) this.f44741P0.m123612r(this.f44715X0)).m123579C(str, C23278z2.m120126f0(), new C8137a());
                                }
                                this.f44714W0.setUseVideoRatio(!z12);
                                if (z12) {
                                    this.f44714W0.setVideoPlayerMode(1);
                                    int m118722k0 = AbstractC23136l9.m118722k0() - (this.f44718a1 * 2);
                                    ViewGroup.LayoutParams layoutParams = this.f44714W0.getLayoutParams();
                                    layoutParams.width = m118722k0;
                                    layoutParams.height = (int) (m118722k0 / f11);
                                    this.f44714W0.setLayoutParams(layoutParams);
                                    this.f44714W0.setViewRatio(f11);
                                }
                                this.f44714W0.getVideoController().setViewMode(1);
                                this.f44714W0.setZVideo(c17391z);
                                this.f44714W0.setPlayConfig(ZMediaPlayerSettings.getPlayConfig(3));
                                this.f44714W0.setAudioFocusControl(C28075g8.m141538e());
                                ViewOnClickListenerC8310j4 viewOnClickListenerC8310j4 = new View.OnClickListener() { // from class: com.zing.zalo.feed.components.j4

                                    /* renamed from: q */
                                    public final /* synthetic */ C17391z f45446q;

                                    /* renamed from: r */
                                    public final /* synthetic */ C3020p0 f45447r;

                                    /* renamed from: s */
                                    public final /* synthetic */ InterfaceC2259a f45448s;

                                    public /* synthetic */ ViewOnClickListenerC8310j4(C17391z c17391z2, C3020p0 m14324b02, InterfaceC2259a interfaceC2259a2) {
                                        r2 = c17391z2;
                                        r3 = m14324b02;
                                        r4 = interfaceC2259a2;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        FeedItemSuggestBanner.this.m44104X(r2, r3, r4, view);
                                    }
                                };
                                this.f44714W0.getVideoController().setOnFullScreenClickListener(viewOnClickListenerC8310j4);
                                this.f44714W0.getVideoController().setPlayListener(viewOnClickListenerC8310j4);
                                this.f44714W0.setOnPlayerStateChangedListener(new ZVideoView.InterfaceC17345q() { // from class: com.zing.zalo.feed.components.k4
                                    public /* synthetic */ C8318k4() {
                                    }

                                    @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
                                    /* renamed from: D */
                                    public final void mo44076D(int i19) {
                                        FeedItemSuggestBanner.this.m44105Y(i19);
                                    }
                                });
                                this.f44714W0.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: com.zing.zalo.feed.components.l4

                                    /* renamed from: q */
                                    public final /* synthetic */ C17391z f45510q;

                                    public /* synthetic */ C8326l4(C17391z c17391z2) {
                                        r2 = c17391z2;
                                    }

                                    @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnCompletionListener
                                    public final void onVideoCompletion(IMediaPlayer iMediaPlayer) {
                                        FeedItemSuggestBanner.this.m44106Z(r2, iMediaPlayer);
                                    }
                                });
                                this.f44714W0.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: com.zing.zalo.feed.components.m4
                                    public /* synthetic */ C8334m4() {
                                    }

                                    @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
                                    public final boolean onInfo(IMediaPlayer iMediaPlayer, int i19, int i21, Object obj) {
                                        boolean m44107a0;
                                        m44107a0 = FeedItemSuggestBanner.this.m44107a0(iMediaPlayer, i19, i21, obj);
                                        return m44107a0;
                                    }
                                });
                                if (this.f44714W0.getCurrentState() == 0) {
                                    this.f44714W0.getVideoController().m92304c0();
                                    this.f44714W0.getVideoController().m92295S(true);
                                    this.f44714W0.m92421n0(true);
                                }
                                m44108U(true);
                            } else {
                                throw new IllegalArgumentException("Invalid feed banner data");
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                } else {
                    cVar = cVar22;
                    this.f44711T0.setVisibility(0);
                    int i19 = this.f44710S0;
                    Size size = new Size(i19, (int) (i19 / 1.92f));
                    C23307g c23307g2 = cVar.f12166q;
                    if (c23307g2 != null) {
                        int i21 = c23307g2.f113474a;
                        int i22 = c23307g2.f113475b;
                        if (i21 * i22 > 0) {
                            size = ZSimpleGIFView.m88218c(i21, i22, 1, this.f44710S0);
                        }
                    }
                    this.f44711T0.getLayoutParams().width = size.getWidth();
                    this.f44711T0.getLayoutParams().height = size.getHeight();
                    this.f44711T0.m88227l(new ZSimpleGIFView.C16554f(cVar.f12157h, cVar.f12150a, size.getWidth(), size.getHeight(), "FeedSuggestGIF", AbstractC23006a0.m117926v()), 0, null);
                    this.f44711T0.setScrolling(!z11);
                    this.f44711T0.m88224g(100L);
                    this.f44711T0.requestLayout();
                    C25866f0.m133492v(this.f44711T0, getContext(), m14324b02, cVar.f12161l, cVar.f12162m, null, interfaceC2259a2, trackingSource2);
                }
                C3014o c3014o3 = cVar.f12168s;
                if (c3014o3 != null && c3014o3.f12000f) {
                    C31845ac.m152996J().m153055m();
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // hf0.C20040b.c
    /* renamed from: d */
    public void mo44058d(int i11, int i12) {
    }

    @Override // hf0.C20040b.c
    /* renamed from: f */
    public boolean mo44060f() {
        int i11 = this.f44740O0;
        return i11 == 0 || i11 == 4;
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        return getVideoCoords();
    }

    @Override // hf0.C20040b.c
    public int getDataPosition() {
        Object tag = getTag(AbstractC6918a0.id_video_data_index);
        if (tag != null && (tag instanceof Integer)) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public FeedZinstantBanner getFeedZinstantBanner() {
        return this.f44719b1;
    }

    @Override // hf0.C20040b.c
    public ZVideoView getNewVideoView() {
        return this.f44714W0;
    }

    public C17391z getVideo() {
        return this.f44716Y0;
    }

    public Rect getVideoCoords() {
        if (this.f44714W0 == null) {
            return null;
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        rect.left = 0;
        rect.top = iArr[1] - AbstractC23136l9.m118740q0(getContext());
        rect.right = rect.left + this.f44714W0.getWidth();
        rect.bottom = rect.top + this.f44714W0.getHeight();
        return rect;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
    }

    @Override // com.zing.zalo.feed.components.FeedItemSuggestBase, com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (i11 == 1) {
            layoutInflater.inflate(AbstractC7409c0.feed_item_suggest_banner_body_content_group, this);
        } else {
            layoutInflater.inflate(AbstractC7409c0.feed_item_suggest_banner_content, this);
        }
        ZVideoView zVideoView = (ZVideoView) findViewById(AbstractC6918a0.video_view);
        this.f44714W0 = zVideoView;
        if (zVideoView != null) {
            zVideoView.getVideoController().f88210s.f88566d0 = AbstractC16803z.icn_csc_play_big_selector;
            this.f44714W0.getVideoController().f88210s.f88567e0 = AbstractC16803z.icn_csc_play_big_selector;
        }
        this.f44711T0 = (ZSimpleGIFView) findViewById(AbstractC6918a0.zsimple_gif_view);
        this.f44712U0 = (LinearLayout) findViewById(AbstractC6918a0.layout_action);
        this.f44713V0 = (RobotoTextView) findViewById(AbstractC6918a0.tv_action);
        this.f44715X0 = new C3977j(getContext());
        this.f44717Z0 = (ImageButton) findViewById(AbstractC6918a0.btn_menu);
        FeedZinstantBanner feedZinstantBanner = (FeedZinstantBanner) findViewById(AbstractC6918a0.zinstant_banner);
        this.f44719b1 = feedZinstantBanner;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) feedZinstantBanner.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(3, AbstractC6918a0.video_view);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f44712U0.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.addRule(3, AbstractC6918a0.zinstant_banner);
        }
        super.mo43688p(context, i11);
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public void setAnimTargetVisibility(int i11) {
    }

    @Override // hf0.C20040b.c
    public void setCurrentVideoView(boolean z11) {
    }

    public void setOnVideoClickListener(InterfaceC8140d interfaceC8140d) {
        this.f44720c1 = interfaceC8140d;
    }

    public FeedItemSuggestBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44710S0 = AbstractC23136l9.m118722k0() - AbstractC23136l9.m118742r(4.0f);
        this.f44718a1 = AbstractC23136l9.m118742r(2.0f);
    }
}
