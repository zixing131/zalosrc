package com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c20.C3226p;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.data.model.ComplexAds;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.VideoLayout;
import com.zing.zalo.shortvideo.p072ui.model.Ended;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoAdsInfo;
import com.zing.zalo.shortvideo.p072ui.state.floating.AbstractC10105a;
import com.zing.zalo.shortvideo.p072ui.state.floating.C10107c;
import com.zing.zalo.shortvideo.p072ui.state.floating.FloatingManager;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import e10.C18168e;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ln0.AbstractC22543l;
import p354n3.C23528a;
import p379o3.C24003n;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q10.C25070y1;
import q20.C25090m;
import q20.C25092o;
import q20.C25093p;
import q20.C25101x;
import s20.AbstractC26112n;
import u10.C26947a;
import u10.C26948b;
import u20.C26988i;
import v00.AbstractC27408c;
import v00.AbstractC27410e;
import v00.C27417l;
import w00.AbstractC28684a;

/* loaded from: classes5.dex */
public final class VideoLayout extends FrameLayout {
    public static final C9752a Companion = new C9752a(null);

    /* renamed from: m0 */
    private static boolean f51181m0 = AbstractC28684a.Companion.m143681o().mo146328c();

    /* renamed from: A */
    private InterfaceC18509p f51182A;

    /* renamed from: B */
    private ArrayList f51183B;

    /* renamed from: C */
    private InterfaceC18494a f51184C;

    /* renamed from: D */
    private final C26988i f51185D;

    /* renamed from: E */
    private C3226p f51186E;

    /* renamed from: F */
    private C9769e f51187F;

    /* renamed from: G */
    private Handler f51188G;

    /* renamed from: H */
    private final Handler f51189H;

    /* renamed from: I */
    private final long f51190I;

    /* renamed from: J */
    private final Handler f51191J;

    /* renamed from: K */
    private final long f51192K;

    /* renamed from: L */
    private long f51193L;

    /* renamed from: M */
    private final Handler f51194M;

    /* renamed from: N */
    private final long f51195N;

    /* renamed from: O */
    private float f51196O;

    /* renamed from: P */
    private Video f51197P;

    /* renamed from: Q */
    private long f51198Q;

    /* renamed from: R */
    private long f51199R;

    /* renamed from: S */
    private boolean f51200S;

    /* renamed from: T */
    private Integer f51201T;

    /* renamed from: U */
    private Boolean f51202U;

    /* renamed from: V */
    private Integer f51203V;

    /* renamed from: W */
    private Boolean f51204W;

    /* renamed from: a0 */
    private Boolean f51205a0;

    /* renamed from: b0 */
    private int f51206b0;

    /* renamed from: c0 */
    private boolean f51207c0;

    /* renamed from: d0 */
    private String f51208d0;

    /* renamed from: e0 */
    private String f51209e0;

    /* renamed from: f0 */
    private String f51210f0;

    /* renamed from: g0 */
    private String f51211g0;

    /* renamed from: h0 */
    private String f51212h0;

    /* renamed from: i0 */
    private boolean f51213i0;

    /* renamed from: j0 */
    private String f51214j0;

    /* renamed from: k0 */
    private final InterfaceC24854k f51215k0;

    /* renamed from: l0 */
    private boolean f51216l0;

    /* renamed from: p */
    private float f51217p;

    /* renamed from: q */
    private float f51218q;

    /* renamed from: r */
    private boolean f51219r;

    /* renamed from: s */
    private boolean f51220s;

    /* renamed from: t */
    private boolean f51221t;

    /* renamed from: u */
    private InterfaceC18505l f51222u;

    /* renamed from: v */
    private InterfaceC18494a f51223v;

    /* renamed from: w */
    private InterfaceC18505l f51224w;

    /* renamed from: x */
    private InterfaceC18509p f51225x;

    /* renamed from: y */
    private ArrayList f51226y;

    /* renamed from: z */
    private InterfaceC18505l f51227z;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$a */
    /* loaded from: classes5.dex */
    public static final class C9752a {
        private C9752a() {
        }

        public /* synthetic */ C9752a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m52630a() {
            return VideoLayout.f51181m0;
        }

        /* renamed from: b */
        public final void m52631b(boolean z11) {
            VideoLayout.f51181m0 = z11;
            AbstractC28684a.Companion.m143681o().mo146299A(z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$b */
    /* loaded from: classes5.dex */
    static final class C9753b extends AbstractC19075u implements InterfaceC18494a {
        C9753b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25070y1 mo12V4() {
            return C25070y1.m129980a(VideoLayout.this);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$c */
    /* loaded from: classes5.dex */
    static final class C9754c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9754c f51229q = new C9754c();

        C9754c() {
            super(1);
        }

        /* renamed from: a */
        public final void m52633a(boolean z11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52633a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$d */
    /* loaded from: classes5.dex */
    static final class C9755d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9755d f51230q = new C9755d();

        C9755d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52634a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52634a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$e */
    /* loaded from: classes5.dex */
    static final class C9756e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9756e f51231q = new C9756e();

        C9756e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52635a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52635a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$f */
    /* loaded from: classes5.dex */
    static final class C9757f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9757f f51232q = new C9757f();

        C9757f() {
            super(1);
        }

        /* renamed from: a */
        public final void m52636a(boolean z11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52636a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$g */
    /* loaded from: classes5.dex */
    static final class C9758g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9758g f51233q = new C9758g();

        C9758g() {
            super(1);
        }

        /* renamed from: a */
        public final void m52637a(boolean z11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52637a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$h */
    /* loaded from: classes5.dex */
    static final class C9759h extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final C9759h f51234q = new C9759h();

        C9759h() {
            super(2);
        }

        /* renamed from: a */
        public final void m52638a(int i11, C9769e c9769e) {
            AbstractC19074t.m100208f(c9769e, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m52638a(((Number) obj).intValue(), (C9769e) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$i */
    /* loaded from: classes5.dex */
    static final class C9760i extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final C9760i f51235q = new C9760i();

        C9760i() {
            super(2);
        }

        /* renamed from: a */
        public final void m52639a(long j11, long j12) {
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m52639a(((Number) obj).longValue(), ((Number) obj2).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$j */
    /* loaded from: classes5.dex */
    static final class C9761j extends AbstractC19075u implements InterfaceC18494a {
        C9761j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52640a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52640a() {
            VideoLayout.this.f51224w.mo205i9(Boolean.TRUE);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$k */
    /* loaded from: classes5.dex */
    static final class C9762k extends AbstractC19075u implements InterfaceC18494a {
        C9762k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52641a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52641a() {
            VideoLayout.this.f51224w.mo205i9(Boolean.FALSE);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$l */
    /* loaded from: classes5.dex */
    public static final class C9763l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9763l f51238q = new C9763l();

        C9763l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52642a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52642a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.VideoLayout$m */
    /* loaded from: classes5.dex */
    public static final class C9764m implements ZVideoView.InterfaceC17345q {

        /* renamed from: p */
        private int f51239p = -1;

        /* renamed from: q */
        final /* synthetic */ ZVideoView f51240q;

        /* renamed from: r */
        final /* synthetic */ VideoLayout f51241r;

        C9764m(ZVideoView zVideoView, VideoLayout videoLayout) {
            this.f51240q = zVideoView;
            this.f51241r = videoLayout;
        }

        /* renamed from: b */
        public static final void m52644b(VideoLayout videoLayout, ZVideoView zVideoView) {
            AbstractC19074t.m100208f(videoLayout, "this$0");
            AbstractC19074t.m100208f(zVideoView, "$this_run");
            if (videoLayout.m52612F() && !videoLayout.m52613G()) {
                zVideoView.start();
            }
        }

        @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
        /* renamed from: D */
        public void mo44076D(int i11) {
            if (i11 == this.f51240q.getCurrentState() && i11 != this.f51239p) {
                if (i11 != 3) {
                    this.f51241r.m52574O(false);
                } else {
                    this.f51241r.m52574O(!r2.f51185D.m139099c());
                }
                if (i11 == -1) {
                    this.f51241r.m52573N();
                } else if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                this.f51241r.m52578U();
                                this.f51241r.f51227z.mo205i9(Boolean.TRUE);
                            } else if (i11 == 4) {
                                this.f51241r.m52598k0();
                                this.f51241r.f51227z.mo205i9(Boolean.FALSE);
                            } else if (i11 == 6) {
                                this.f51241r.m52572M();
                            }
                        } else {
                            this.f51241r.f51199R = System.currentTimeMillis();
                            this.f51241r.m52572M();
                            this.f51241r.m52598k0();
                            if (this.f51241r.m52612F() && !this.f51241r.m52613G()) {
                                this.f51241r.f51188G.post(new Runnable() { // from class: c20.o

                                    /* renamed from: q */
                                    public final /* synthetic */ ZVideoView f13764q;

                                    public /* synthetic */ RunnableC3225o(ZVideoView zVideoView) {
                                        r2 = zVideoView;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        VideoLayout.C9764m.m52644b(VideoLayout.this, r2);
                                    }
                                });
                            }
                        }
                    } else {
                        this.f51241r.f51198Q = System.currentTimeMillis();
                        this.f51241r.m52575P();
                    }
                } else {
                    this.f51241r.f51188G.removeCallbacksAndMessages(null);
                    ZVideoView zVideoView = this.f51240q;
                    zVideoView.setViewRatio(zVideoView.getVideoRatio());
                }
                this.f51239p = i11;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        View.inflate(context, AbstractC27410e.zch_layout_video, this);
        setWillNotDraw(false);
        this.f51222u = C9754c.f51229q;
        this.f51223v = C9756e.f51231q;
        this.f51224w = C9757f.f51232q;
        this.f51225x = C9760i.f51235q;
        this.f51226y = new ArrayList();
        this.f51227z = C9758g.f51233q;
        this.f51182A = C9759h.f51234q;
        this.f51183B = new ArrayList();
        this.f51184C = C9755d.f51230q;
        this.f51185D = new C26988i(new C9761j(), new C9762k());
        this.f51186E = new C3226p();
        this.f51188G = new Handler(Looper.getMainLooper());
        this.f51189H = new Handler(Looper.getMainLooper());
        this.f51190I = 30000L;
        this.f51191J = new Handler(Looper.getMainLooper());
        this.f51192K = 500L;
        this.f51194M = new Handler(Looper.getMainLooper());
        this.f51195N = 50L;
        this.f51201T = 0;
        this.f51203V = 0;
        m129210a = AbstractC24856m.m129210a(new C9753b());
        this.f51215k0 = m129210a;
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m52568I(VideoLayout videoLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return videoLayout.m52614H(z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m52569J(int i11, int i12) {
        int i13;
        LinkedHashMap linkedHashMap;
        String str;
        String str2;
        Integer num;
        Video video;
        Integer num2;
        int m52933i;
        int i14 = this.f51206b0;
        if (i14 > 0 && i12 > 0) {
            this.f51206b0 = 0;
            long j11 = this.f51199R - this.f51198Q;
            this.f51199R = 0L;
            this.f51198Q = 0L;
            Video video2 = this.f51197P;
            String str3 = this.f51208d0;
            String str4 = this.f51209e0;
            String str5 = this.f51210f0;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (str3 != null) {
                linkedHashMap2.put("search_kw", str3);
            }
            if (str4 != null) {
                linkedHashMap2.put("hashtag", str4);
            }
            if (str5 != null) {
                linkedHashMap2.put("collection_id", str5);
            }
            if (video2 != null) {
                if (i14 > i12) {
                    i13 = i12;
                } else {
                    i13 = i14;
                }
                boolean z11 = this.f51200S;
                boolean z12 = this.f51207c0;
                ComplexAds.Config config = null;
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = linkedHashMap2;
                }
                String str6 = this.f51211g0;
                String str7 = this.f51212h0;
                VideoAdsInfo m52881b = video2.m52881b();
                if (m52881b != null) {
                    str = m52881b.m52928d();
                } else {
                    str = null;
                }
                VideoAdsInfo m52881b2 = video2.m52881b();
                if (m52881b2 != null) {
                    str2 = m52881b2.m52929e();
                } else {
                    str2 = null;
                }
                boolean z13 = this.f51213i0;
                VideoAdsInfo m52881b3 = video2.m52881b();
                if (m52881b3 != null) {
                    num = Integer.valueOf(m52881b3.m52933i());
                } else {
                    num = null;
                }
                C19205a.c cVar = new C19205a.c(video2, j11, i13, i12, i11, z11, z12, linkedHashMap, str6, str7, str, str2, z13, num, null, null, 49152, null);
                if (video2.m52834A0()) {
                    C26947a.b bVar = C26947a.Companion;
                    video = video2;
                    C26948b.a m138839b = bVar.m138839b(this.f51214j0, video);
                    if (m138839b != null) {
                        m52933i = m138839b.m138882c();
                    } else {
                        VideoAdsInfo m52881b4 = video.m52881b();
                        if (m52881b4 != null) {
                            m52933i = m52881b4.m52933i();
                        } else {
                            num2 = null;
                            cVar.m100756r(num2);
                            cVar.m100757s(Integer.valueOf(bVar.m138841f(this.f51214j0)));
                            if (m138839b != null) {
                                config = m138839b.m138880a();
                            }
                            cVar.m100755q(config);
                            C19205a.f95429a.m100727d0(cVar);
                        }
                    }
                    num2 = Integer.valueOf(m52933i);
                    cVar.m100756r(num2);
                    cVar.m100757s(Integer.valueOf(bVar.m138841f(this.f51214j0)));
                    if (m138839b != null) {
                    }
                    cVar.m100755q(config);
                    C19205a.f95429a.m100727d0(cVar);
                } else {
                    video = video2;
                    C19205a.f95429a.m100726c0(cVar);
                }
                C19205a.f95429a.m100718T(new C19205a.a(video.m52911t(), i11, this.f51201T, this.f51202U, this.f51203V, this.f51204W, this.f51205a0));
                C25093p.Companion.m130109e(this.f51214j0, new C25101x(video.m52911t(), video.m52913u(), i11, this.f51201T, this.f51202U, this.f51203V, this.f51204W, this.f51205a0));
            }
        }
    }

    /* renamed from: K */
    static /* synthetic */ void m52570K(VideoLayout videoLayout, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = videoLayout.getBinding().f120435s.getCurrentPosition();
        }
        if ((i13 & 2) != 0) {
            i12 = videoLayout.getBinding().f120435s.getDuration();
        }
        videoLayout.m52569J(i11, i12);
    }

    /* renamed from: L */
    private final void m52571L() {
        String str;
        this.f51206b0 += (int) (C27417l.f129055a.m140382f().m130131a() - this.f51193L);
        C26947a.b bVar = C26947a.Companion;
        String str2 = this.f51214j0;
        C9769e c9769e = this.f51187F;
        C10107c c10107c = null;
        if (c9769e != null) {
            str = c9769e.m52760d();
        } else {
            str = null;
        }
        bVar.m138844i(str2, str, this.f51206b0);
        ZVideoView zVideoView = getBinding().f120435s;
        this.f51225x.mo240pC(Long.valueOf(zVideoView.getCurrentPosition()), Long.valueOf(zVideoView.getDuration()));
        AbstractC10105a m53860b = FloatingManager.Companion.m53860b();
        if (m53860b instanceof C10107c) {
            c10107c = (C10107c) m53860b;
        }
        if (c10107c != null) {
            c10107c.m53897t(zVideoView.getCurrentPosition());
        }
        Iterator it = new ArrayList(this.f51226y).iterator();
        while (it.hasNext()) {
            ((InterfaceC18505l) it.next()).mo205i9(Long.valueOf(this.f51206b0));
        }
        m52600l0();
    }

    /* renamed from: M */
    public final void m52572M() {
        this.f51185D.m139098b();
        this.f51189H.removeCallbacksAndMessages(null);
    }

    /* renamed from: N */
    public final void m52573N() {
        C9769e c9769e;
        if (C25090m.f120499a.m130050b(getContext()) && (c9769e = this.f51187F) != null) {
            c9769e.m52763g();
        }
        C9769e c9769e2 = this.f51187F;
        if (c9769e2 != null && c9769e2.m52762f()) {
            ZVideoView zVideoView = getBinding().f120435s;
            int currentPosition = zVideoView.getCurrentPosition();
            zVideoView.m92429s0();
            m52582Y(currentPosition);
        } else {
            C9769e c9769e3 = this.f51187F;
            if (c9769e3 != null) {
                m52623i0();
                this.f51182A.mo240pC(2, c9769e3);
            }
        }
        this.f51189H.removeCallbacksAndMessages(null);
    }

    /* renamed from: O */
    public final void m52574O(boolean z11) {
        if (this.f51220s != z11) {
            this.f51220s = z11;
            if (z11) {
                if (this.f51214j0 != null && this.f51187F != null && m52612F()) {
                    C18168e m96538b = C18168e.Companion.m96538b();
                    String str = this.f51214j0;
                    AbstractC19074t.m100205c(str);
                    C9769e c9769e = this.f51187F;
                    AbstractC19074t.m100205c(c9769e);
                    m96538b.m96511A(str, c9769e.m52760d());
                }
                m52600l0();
                m52571L();
                m52576S();
                return;
            }
            m52596j0();
            m52571L();
        }
    }

    /* renamed from: P */
    public final void m52575P() {
        this.f51185D.m139100d();
        Handler handler = this.f51189H;
        if (getBinding().f120435s.getCurrentState() == 1 && !handler.hasMessages(0)) {
            handler.postDelayed(new Runnable() { // from class: c20.n
                public /* synthetic */ RunnableC3224n() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VideoLayout.this.m52573N();
                }
            }, this.f51190I);
        }
    }

    /* renamed from: S */
    private final void m52576S() {
        this.f51191J.postDelayed(new Runnable() { // from class: c20.m
            public /* synthetic */ RunnableC3223m() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoLayout.m52577T(VideoLayout.this);
            }
        }, this.f51192K);
    }

    /* renamed from: T */
    public static final void m52577T(VideoLayout videoLayout) {
        AbstractC19074t.m100208f(videoLayout, "this$0");
        videoLayout.m52576S();
        videoLayout.m52571L();
    }

    /* renamed from: U */
    public final void m52578U() {
        float f11;
        ZVideoView zVideoView = getBinding().f120435s;
        C9769e c9769e = this.f51187F;
        if (c9769e != null) {
            f11 = c9769e.m52761e();
        } else {
            f11 = 1.0f;
        }
        setVolumeValue(f11);
    }

    /* renamed from: V */
    private final void m52579V() {
        ZVideoView zVideoView = getBinding().f120435s;
        zVideoView.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: c20.k

            /* renamed from: q */
            public final /* synthetic */ ZVideoView f13758q;

            public /* synthetic */ C3221k(ZVideoView zVideoView2) {
                r2 = zVideoView2;
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
                VideoLayout.m52580W(VideoLayout.this, r2, iMediaPlayer, i11, i12, i13, i14);
            }
        });
        zVideoView2.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: c20.l

            /* renamed from: q */
            public final /* synthetic */ ZVideoView f13760q;

            public /* synthetic */ C3222l(ZVideoView zVideoView2) {
                r2 = zVideoView2;
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
                boolean m52581X;
                m52581X = VideoLayout.m52581X(VideoLayout.this, r2, iMediaPlayer, i11, i12, obj);
                return m52581X;
            }
        });
        zVideoView2.setOnPlayerStateChangedListener(new C9764m(zVideoView2, this));
        ZMediaPlayerSettings.PlayConfig playConfig = ZMediaPlayerSettings.getPlayConfig(9);
        if (playConfig != null) {
            playConfig.setAutoStartOnPrepared(false);
        } else {
            playConfig = null;
        }
        zVideoView2.setPlayConfig(playConfig);
        zVideoView2.setVideoPlayerMode(1);
        zVideoView2.getVideoController().setAllowShowLoadingView(false);
        zVideoView2.setExcludeSystemDecorationSize(false);
        zVideoView2.setForceHideController(true);
        zVideoView2.setUseVideoRatio(false);
    }

    /* renamed from: W */
    public static final void m52580W(VideoLayout videoLayout, ZVideoView zVideoView, IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
        Float f11;
        AbstractC19074t.m100208f(videoLayout, "this$0");
        AbstractC19074t.m100208f(zVideoView, "$this_run");
        C9769e c9769e = videoLayout.f51187F;
        if (c9769e != null) {
            f11 = Float.valueOf(c9769e.m52758b());
        } else {
            f11 = null;
        }
        if (!AbstractC19074t.m100203a(f11, zVideoView.getVideoRatio())) {
            C9769e c9769e2 = videoLayout.f51187F;
            if (c9769e2 != null) {
                c9769e2.m52765i(zVideoView.getVideoRatio());
            }
            zVideoView.setViewRatio(zVideoView.getVideoRatio());
            zVideoView.requestLayout();
        }
    }

    /* renamed from: X */
    public static final boolean m52581X(VideoLayout videoLayout, ZVideoView zVideoView, IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
        Ended ended;
        boolean z11;
        Video video;
        VideoAdsInfo m52881b;
        AbstractC19074t.m100208f(videoLayout, "this$0");
        AbstractC19074t.m100208f(zVideoView, "$this_run");
        boolean z12 = true;
        if (i11 != 3) {
            if (i11 != 11000) {
                if (i11 != 701) {
                    if (i11 == 702) {
                        videoLayout.m52572M();
                        if (zVideoView.getCurrentState() != 3) {
                            z12 = false;
                        }
                        videoLayout.m52574O(z12);
                    }
                } else {
                    videoLayout.m52575P();
                    videoLayout.m52574O(false);
                }
            } else {
                Video video2 = videoLayout.f51197P;
                if (video2 != null && (m52881b = video2.m52881b()) != null) {
                    ended = m52881b.m52932h();
                } else {
                    ended = null;
                }
                if (ended != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && (!f51181m0 || (video = videoLayout.f51197P) == null || video.m52834A0())) {
                    Iterator it = new ArrayList(videoLayout.f51183B).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC18494a) it.next()).mo12V4();
                    }
                    m52570K(videoLayout, 0, 0, 3, null);
                    videoLayout.f51200S = true;
                } else {
                    if (!z11) {
                        zVideoView.pause();
                    }
                    m52570K(videoLayout, 0, 0, 3, null);
                    if (z11) {
                        videoLayout.f51200S = true;
                    }
                    if (z11) {
                        videoLayout.f51184C.mo12V4();
                    } else {
                        InterfaceC18509p interfaceC18509p = videoLayout.f51182A;
                        C9769e c9769e = videoLayout.f51187F;
                        if (c9769e == null) {
                            return false;
                        }
                        interfaceC18509p.mo240pC(0, c9769e);
                    }
                }
            }
        } else {
            videoLayout.f51223v.mo12V4();
            videoLayout.f51216l0 = true;
            videoLayout.f51223v = C9763l.f51238q;
            Video video3 = videoLayout.f51197P;
            if (video3 != null) {
                C19205a.f95429a.m100720V(video3.m52911t());
            }
            RecyclingImageView recyclingImageView = videoLayout.getBinding().f120434r;
            AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
            AbstractC26112n.m134367H(recyclingImageView);
        }
        return false;
    }

    /* renamed from: Y */
    private final void m52582Y(int i11) {
        int m116580c;
        ZVideoView zVideoView = getBinding().f120435s;
        C9769e c9769e = this.f51187F;
        AbstractC19074t.m100205c(c9769e);
        C17391z m52759c = c9769e.m52759c();
        C18168e.c cVar = C18168e.Companion;
        C18168e m96538b = cVar.m96538b();
        String str = this.f51214j0;
        AbstractC19074t.m100205c(str);
        C9769e c9769e2 = this.f51187F;
        AbstractC19074t.m100205c(c9769e2);
        m96538b.m96511A(str, c9769e2.m52760d());
        C18168e m96538b2 = cVar.m96538b();
        String str2 = m52759c.f88618a;
        AbstractC19074t.m100207e(str2, "id");
        String str3 = this.f51214j0;
        AbstractC19074t.m100205c(str3);
        m52759c.f88633p = m96538b2.m96516q(str2, str3);
        zVideoView.setZVideo(m52759c);
        C9769e c9769e3 = this.f51187F;
        AbstractC19074t.m100205c(c9769e3);
        m116580c = AbstractC22543l.m116580c((int) c9769e3.m52757a(), i11);
        zVideoView.m92411e0(m116580c);
        this.f51216l0 = false;
    }

    /* renamed from: Z */
    static /* synthetic */ void m52583Z(VideoLayout videoLayout, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        videoLayout.m52582Y(i11);
    }

    /* renamed from: e0 */
    private final void m52589e0(Video video, boolean z11, String str, String str2, String str3) {
        this.f51197P = video;
        this.f51206b0 = 0;
        this.f51198Q = 0L;
        this.f51199R = 0L;
        this.f51200S = false;
        this.f51201T = 0;
        this.f51202U = null;
        this.f51203V = 0;
        this.f51204W = null;
        this.f51205a0 = null;
        this.f51212h0 = null;
        this.f51211g0 = null;
        this.f51213i0 = false;
        this.f51207c0 = z11;
        this.f51208d0 = str;
        this.f51209e0 = str2;
        this.f51210f0 = str3;
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m52593h0(VideoLayout videoLayout, C9769e c9769e, Video video, boolean z11, String str, String str2, String str3, int i11, Object obj) {
        boolean z12;
        String str4;
        String str5;
        String str6;
        if ((i11 & 4) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i11 & 16) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i11 & 32) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        videoLayout.m52622g0(c9769e, video, z12, str4, str5, str6);
    }

    /* renamed from: j0 */
    private final void m52596j0() {
        this.f51191J.removeCallbacksAndMessages(null);
    }

    /* renamed from: k0 */
    public final void m52598k0() {
        ZVideoView zVideoView = getBinding().f120435s;
        setVolumeValue(0.0f);
    }

    /* renamed from: l0 */
    private final void m52600l0() {
        this.f51193L = C27417l.f129055a.m140382f().m130131a();
    }

    private final void setVolumeValue(float f11) {
        this.f51196O = f11;
        getBinding().f120435s.setVolume(f11);
    }

    /* renamed from: A */
    public final void m52607A() {
        this.f51202U = Boolean.TRUE;
    }

    /* renamed from: B */
    public final void m52608B() {
        this.f51200S = true;
    }

    /* renamed from: C */
    public final void m52609C() {
        int i11;
        Integer num = this.f51203V;
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        this.f51203V = Integer.valueOf(i11 + 1);
    }

    /* renamed from: D */
    public final void m52610D(String str) {
        this.f51205a0 = Boolean.TRUE;
        this.f51211g0 = str;
    }

    /* renamed from: E */
    public final void m52611E(String str) {
        this.f51205a0 = Boolean.TRUE;
        this.f51212h0 = str;
    }

    /* renamed from: F */
    public final boolean m52612F() {
        return this.f51219r;
    }

    /* renamed from: G */
    public final boolean m52613G() {
        return this.f51221t;
    }

    /* renamed from: H */
    public final boolean m52614H(boolean z11) {
        if (getBinding().f120435s.getCurrentState() == 3 && (z11 || !this.f51185D.m139099c())) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final void m52615Q() {
        if (this.f51219r && getBinding().f120435s.getCurrentState() == 3) {
            getBinding().f120435s.pause();
        }
    }

    /* renamed from: R */
    public final void m52616R() {
        if (this.f51219r && !this.f51221t) {
            if (getBinding().f120435s.getCurrentState() == 4 || getBinding().f120435s.getCurrentState() == 2) {
                getBinding().f120435s.start();
            }
        }
    }

    /* renamed from: a0 */
    public final void m52617a0() {
        m52623i0();
        ZVideoView zVideoView = getBinding().f120435s;
        zVideoView.setOnPlayerStateChangedListener(null);
        zVideoView.setOnVideoSizeChangedListener(null);
        zVideoView.setOnInfoListener(null);
        zVideoView.m92412f0(true);
    }

    /* renamed from: b0 */
    public final void m52618b0(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f51183B.remove(interfaceC18494a);
    }

    /* renamed from: c0 */
    public final void m52619c0(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        this.f51226y.remove(interfaceC18505l);
    }

    /* renamed from: d0 */
    public final void m52620d0() {
        m52616R();
    }

    /* renamed from: f0 */
    public final void m52621f0(long j11) {
        getBinding().f120435s.seekTo((int) j11);
    }

    /* renamed from: g0 */
    public final void m52622g0(C9769e c9769e, Video video, boolean z11, String str, String str2, String str3) {
        C10107c c10107c;
        String str4;
        AbstractC19074t.m100208f(c9769e, "source");
        AbstractC19074t.m100208f(video, "video");
        m52623i0();
        m52589e0(video, z11, str, str2, str3);
        if (c9769e.m52762f()) {
            this.f51187F = c9769e;
            FloatingManager.C10103a c10103a = FloatingManager.Companion;
            AbstractC10105a m53860b = c10103a.m53860b();
            if (m53860b instanceof C10107c) {
                c10107c = (C10107c) m53860b;
            } else {
                c10107c = null;
            }
            if (c10103a.m53863e()) {
                if (c10107c != null) {
                    str4 = c10107c.mo53883i();
                } else {
                    str4 = null;
                }
                if (AbstractC19074t.m100204b(str4, c9769e.m52760d())) {
                    m52582Y((int) c10107c.m53896s());
                    c10103a.m53868j();
                    ((C23528a) new C23528a(getContext()).m123612r(getBinding().f120434r)).m123618x(video.m52898l(), new C24003n(C25092o.f120501a.m130066e(), AbstractC26112n.m134434z(this, AbstractC27408c.zch_placeholder_thumbnail_video), 0, false, 0, false, null, 124, null));
                    RecyclingImageView recyclingImageView = getBinding().f120434r;
                    AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
                    AbstractC26112n.m134431w0(recyclingImageView);
                    return;
                }
            }
            m52583Z(this, 0, 1, null);
            ((C23528a) new C23528a(getContext()).m123612r(getBinding().f120434r)).m123618x(video.m52898l(), new C24003n(C25092o.f120501a.m130066e(), AbstractC26112n.m134434z(this, AbstractC27408c.zch_placeholder_thumbnail_video), 0, false, 0, false, null, 124, null));
            RecyclingImageView recyclingImageView2 = getBinding().f120434r;
            AbstractC19074t.m100207e(recyclingImageView2, "rivThumbnail");
            AbstractC26112n.m134431w0(recyclingImageView2);
            return;
        }
        this.f51182A.mo240pC(1, c9769e);
    }

    public final C25070y1 getBinding() {
        return (C25070y1) this.f51215k0.getValue();
    }

    public final int getCurrentPosition() {
        return getBinding().f120435s.getCurrentPosition();
    }

    public final Video getCurrentVideo() {
        return this.f51197P;
    }

    public final int getDuration() {
        return getBinding().f120435s.getDuration();
    }

    public final boolean getHasFirstFrame() {
        return this.f51216l0;
    }

    public final String getPlaylistId() {
        return this.f51214j0;
    }

    /* renamed from: i0 */
    public final void m52623i0() {
        ZVideoView zVideoView = getBinding().f120435s;
        int currentPosition = zVideoView.getCurrentPosition();
        int duration = zVideoView.getDuration();
        zVideoView.m92429s0();
        C24848g0 c24848g0 = C24848g0.f119245a;
        m52569J(currentPosition, duration);
        this.f51187F = null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C3226p c3226p = this.f51186E;
        ZVideoView zVideoView = getBinding().f120435s;
        AbstractC19074t.m100207e(zVideoView, "zvvVideo");
        c3226p.m16357r(zVideoView);
        m52579V();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25070y1 binding = getBinding();
        View view = binding.f120433q;
        AbstractC19074t.m100207e(view, "bgdVideo");
        AbstractC26112n.m134383X(view, 0, 0);
        this.f51186E.m16354m(z11, i11, i12, i13, i14);
        RecyclingImageView recyclingImageView = binding.f120434r;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        if (AbstractC26112n.m134378S(recyclingImageView)) {
            RecyclingImageView recyclingImageView2 = binding.f120434r;
            AbstractC19074t.m100207e(recyclingImageView2, "rivThumbnail");
            AbstractC26112n.m134383X(recyclingImageView2, binding.f120435s.getTop(), binding.f120435s.getLeft());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25070y1 binding = getBinding();
        View view = binding.f120433q;
        AbstractC19074t.m100207e(view, "bgdVideo");
        AbstractC26112n.m134387a0(view, size, 1073741824, size2, 1073741824);
        this.f51186E.m16356q(binding.f120435s.getVideoRatio());
        this.f51186E.m16355n(i11, i12);
        RecyclingImageView recyclingImageView = binding.f120434r;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        if (AbstractC26112n.m134378S(recyclingImageView)) {
            RecyclingImageView recyclingImageView2 = binding.f120434r;
            AbstractC19074t.m100207e(recyclingImageView2, "rivThumbnail");
            AbstractC26112n.m134387a0(recyclingImageView2, binding.f120435s.getMeasuredWidth(), 1073741824, binding.f120435s.getMeasuredHeight(), 1073741824);
        }
        setMeasuredDimension(size, size2);
    }

    public final void setActiveChangedAction(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        this.f51222u = interfaceC18505l;
    }

    public final void setAdsShowEndedAction(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f51184C = interfaceC18494a;
    }

    public final void setDeferring(boolean z11) {
        if (this.f51221t != z11) {
            this.f51221t = z11;
        }
    }

    public final void setFirstFrameAction(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f51223v = interfaceC18494a;
        this.f51216l0 = false;
    }

    public final void setHasFirstFrame(boolean z11) {
        this.f51216l0 = z11;
    }

    public final void setItemPosition(float f11) {
        this.f51218q = f11;
        setTranslationY(this.f51217p + f11);
    }

    public final void setListPosition(float f11) {
        this.f51217p = f11;
        setTranslationY(f11 + this.f51218q);
    }

    public final void setLoadingChangedAction(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        this.f51224w = interfaceC18505l;
    }

    public final void setPlayStateChangedAction(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        this.f51227z = interfaceC18505l;
    }

    public final void setPlayerEndedAction(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "action");
        this.f51182A = interfaceC18509p;
    }

    public final void setPlaylistId(String str) {
        this.f51214j0 = str;
    }

    public final void setProgressChangedAction(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "action");
        this.f51225x = interfaceC18509p;
    }

    /* renamed from: u */
    public final void m52624u() {
        this.f51219r = true;
        m52616R();
        this.f51222u.mo205i9(Boolean.TRUE);
    }

    /* renamed from: v */
    public final void m52625v(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f51183B.add(interfaceC18494a);
    }

    /* renamed from: w */
    public final void m52626w(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        this.f51226y.add(interfaceC18505l);
    }

    /* renamed from: x */
    public final void m52627x() {
        m52615Q();
        m52570K(this, 0, 0, 3, null);
        this.f51219r = false;
        this.f51222u.mo205i9(Boolean.FALSE);
    }

    /* renamed from: y */
    public final void m52628y() {
        int i11;
        Integer num = this.f51201T;
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        this.f51201T = Integer.valueOf(i11 + 1);
    }

    /* renamed from: z */
    public final void m52629z() {
        this.f51204W = Boolean.TRUE;
    }
}
