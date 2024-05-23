package vg;

import ag0.C0809c1;
import am.AbstractC0939u;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.feed.components.FeedBackgroundView;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.uicontrol.BaseStoryItemView;
import com.zing.zalo.zmedia.cache.AbstractC17297a;
import com.zing.zalo.zmedia.cache.CacheException;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.VideoController;
import com.zing.zalo.zmedia.view.ZVideoView;
import java.lang.ref.WeakReference;
import lr.C22640a;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p361nb.C23669z;
import p379o3.C23995f;
import p379o3.C23999j;
import p420pb.C24709a;
import p509sp.C26361j;
import p588vw.C28652r;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C32123ta;
import vg.AbstractC28065f8;

/* renamed from: vg.t7 */
/* loaded from: classes3.dex */
public class C28195t7 {

    /* renamed from: a */
    float f131374a;

    /* renamed from: f */
    C32123ta f131379f;

    /* renamed from: g */
    BaseStoryItemView f131380g;

    /* renamed from: i */
    C23528a f131382i;

    /* renamed from: j */
    h f131383j;

    /* renamed from: b */
    long f131375b = 0;

    /* renamed from: c */
    long f131376c = 0;

    /* renamed from: d */
    C3977j f131377d = new C3977j(MainApplication.getAppContext());

    /* renamed from: e */
    Handler f131378e = new a(Looper.getMainLooper());

    /* renamed from: h */
    public boolean f131381h = false;

    /* renamed from: k */
    i f131384k = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.t7$a */
    /* loaded from: classes3.dex */
    public class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C28195t7 c28195t7;
            C32123ta c32123ta;
            BaseStoryItemView baseStoryItemView;
            float f11;
            C28195t7 c28195t72;
            int i11;
            try {
                if (message.what == 1 && (c32123ta = (c28195t7 = C28195t7.this).f131379f) != null && (baseStoryItemView = c28195t7.f131380g) != null && c28195t7.f131375b > 0) {
                    if (c32123ta.f148140i != 2) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C28195t7 c28195t73 = C28195t7.this;
                        long j11 = c28195t73.f131376c + (currentTimeMillis - c28195t73.f131375b);
                        c28195t73.f131376c = j11;
                        f11 = ((((float) j11) * 1.0f) / c28195t73.f131379f.f148151q) * 100.0f;
                    } else {
                        int currentState = baseStoryItemView.f83090D.getCurrentState();
                        if (currentState != 0 && currentState != 1) {
                            if (currentState != 5 && currentState != 6) {
                                C28195t7.this.f131376c = r13.f131380g.f83090D.getCurrentPosition();
                                c28195t72 = C28195t7.this;
                                if (c28195t72.f131376c > 0 && c28195t72.f131380g.f83090D.getDuration() > 0) {
                                    f11 = (((float) C28195t7.this.f131376c) * 100.0f) / r13.f131380g.f83090D.getDuration();
                                }
                            }
                            C28195t7.this.f131376c = r13.f131380g.f83090D.getDuration();
                            c28195t72 = C28195t7.this;
                            if (c28195t72.f131376c > 0) {
                                f11 = (((float) C28195t7.this.f131376c) * 100.0f) / r13.f131380g.f83090D.getDuration();
                            }
                        }
                        f11 = 0.0f;
                    }
                    C28195t7.this.f131375b = System.currentTimeMillis();
                    C28195t7.this.f131380g.f83141x.setProgress(f11);
                    C28195t7 c28195t74 = C28195t7.this;
                    h hVar = c28195t74.f131383j;
                    if (hVar != null) {
                        hVar.mo84730g(c28195t74.f131379f, c28195t74.f131376c);
                    }
                    if (f11 >= 100.0f) {
                        ZVideoView zVideoView = C28195t7.this.f131380g.f83090D;
                        if (zVideoView != null) {
                            i11 = zVideoView.getCurrentState();
                        } else {
                            i11 = 0;
                        }
                        C28195t7 c28195t75 = C28195t7.this;
                        int i12 = c28195t75.f131379f.f148140i;
                        if (i12 == 2 && (i12 != 2 || (i11 != 5 && i11 != 6))) {
                            sendMessageDelayed(obtainMessage(1), 20L);
                            return;
                        }
                        c28195t75.m141790r();
                        C28195t7 c28195t76 = C28195t7.this;
                        h hVar2 = c28195t76.f131383j;
                        if (hVar2 != null) {
                            hVar2.mo84724a(c28195t76.f131379f);
                            return;
                        }
                        return;
                    }
                    sendMessageDelayed(obtainMessage(1), 20L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.t7$b */
    /* loaded from: classes3.dex */
    public class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f131386l1;

        b(String str) {
            this.f131386l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null && c3979l.m18839c() != null) {
                C28195t7 c28195t7 = C28195t7.this;
                if (c28195t7.f131380g != null && c28195t7.f131379f != null && str.equals(this.f131386l1)) {
                    C28195t7.this.f131380g.setShowLoading(false);
                    C28195t7 c28195t72 = C28195t7.this;
                    h hVar = c28195t72.f131383j;
                    if (hVar == null || hVar.mo84728e(c28195t72.f131379f)) {
                        C28195t7.this.m141777c();
                    }
                    C28195t7.this.m141791s();
                    return;
                }
                return;
            }
            BaseStoryItemView baseStoryItemView = C28195t7.this.f131380g;
            if (baseStoryItemView != null) {
                baseStoryItemView.setShowLoading(false);
            }
            C28195t7 c28195t73 = C28195t7.this;
            h hVar2 = c28195t73.f131383j;
            if (hVar2 != null) {
                hVar2.mo84727d(c28195t73.f131379f);
            }
        }
    }

    /* renamed from: vg.t7$c */
    /* loaded from: classes3.dex */
    public class c extends VideoController.AbstractC17311d {
        c() {
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: a */
        public void mo61749a(boolean z11) {
            BaseStoryItemView baseStoryItemView = C28195t7.this.f131380g;
            if (baseStoryItemView != null) {
                baseStoryItemView.setShowLoading(z11);
            }
        }
    }

    /* renamed from: vg.t7$d */
    /* loaded from: classes3.dex */
    public class d implements ZVideoView.InterfaceC17345q {

        /* renamed from: p */
        int f131389p = Integer.MIN_VALUE;

        d() {
        }

        @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
        /* renamed from: D */
        public void mo44076D(int i11) {
            C28195t7 c28195t7;
            C32123ta c32123ta;
            ZVideoView zVideoView;
            if (i11 == 2) {
                C28195t7 c28195t72 = C28195t7.this;
                h hVar = c28195t72.f131383j;
                if (hVar != null && !hVar.mo84728e(c28195t72.f131379f)) {
                    BaseStoryItemView baseStoryItemView = C28195t7.this.f131380g;
                    if (baseStoryItemView != null && (zVideoView = baseStoryItemView.f83090D) != null) {
                        zVideoView.pause();
                    }
                } else {
                    C28195t7.this.f131380g.f83090D.start();
                    C28195t7.this.m141777c();
                }
                if (this.f131389p != i11) {
                    C28195t7.this.m141791s();
                }
            } else if (i11 == -1) {
                C28195t7 c28195t73 = C28195t7.this;
                if (c28195t73.f131379f != null) {
                    c28195t73.m141778d();
                    BaseStoryItemView baseStoryItemView2 = C28195t7.this.f131380g;
                    if (baseStoryItemView2 != null && baseStoryItemView2.f83090D.getVideoController() != null) {
                        C28195t7.this.f131380g.f83090D.m92419m0(false);
                    }
                    C28195t7 c28195t74 = C28195t7.this;
                    h hVar2 = c28195t74.f131383j;
                    if (hVar2 != null) {
                        hVar2.mo84727d(c28195t74.f131379f);
                    }
                }
            } else if (i11 == 0 && (c32123ta = (c28195t7 = C28195t7.this).f131379f) != null && c32123ta.f148126b == 2 && c32123ta.f148128c == 2) {
                c28195t7.m141791s();
            }
            i iVar = C28195t7.this.f131384k;
            if (iVar != null) {
                iVar.mo84723D(i11);
            }
            this.f131389p = i11;
        }
    }

    /* renamed from: vg.t7$e */
    /* loaded from: classes3.dex */
    public class e implements AbstractC17297a.b {
        e() {
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: cH */
        public void mo39665cH(C17391z c17391z, CacheException cacheException) {
            C17391z c17391z2;
            C32123ta c32123ta = C28195t7.this.f131379f;
            if (c32123ta != null && (c17391z2 = c32123ta.f148101D) != null && c17391z2.equals(c17391z)) {
                C28195t7.this.m141778d();
                BaseStoryItemView baseStoryItemView = C28195t7.this.f131380g;
                if (baseStoryItemView != null && baseStoryItemView.f83090D.getVideoController() != null) {
                    C28195t7.this.f131380g.f83090D.m92419m0(false);
                }
                C28195t7 c28195t7 = C28195t7.this;
                h hVar = c28195t7.f131383j;
                if (hVar != null) {
                    hVar.mo84727d(c28195t7.f131379f);
                }
            }
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: qH */
        public void mo39666qH(C17391z c17391z) {
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: tE */
        public void mo39667tE(C17391z c17391z) {
        }
    }

    /* renamed from: vg.t7$f */
    /* loaded from: classes3.dex */
    public class f extends C23999j {
        f() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            C32123ta c32123ta;
            BaseStoryItemView baseStoryItemView;
            try {
                C3977j c3977j = C28195t7.this.f131377d;
                if (c3977j != null) {
                    c3977j.setImageInfo(c3979l, false);
                }
                if (c3979l != null && (c32123ta = C28195t7.this.f131379f) != null && c32123ta.f148146l.equals(str) && (baseStoryItemView = C28195t7.this.f131380g) != null) {
                    baseStoryItemView.f83090D.setLoadingViewImageInfo(c3979l);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.t7$g */
    /* loaded from: classes3.dex */
    public class g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f131393a;

        g(C23669z c23669z) {
            this.f131393a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f131393a);
        }
    }

    /* renamed from: vg.t7$h */
    /* loaded from: classes3.dex */
    public interface h {
        /* renamed from: a */
        boolean mo84724a(C32123ta c32123ta);

        /* renamed from: b */
        void mo84725b(C32123ta c32123ta);

        /* renamed from: c */
        void mo84726c(C32123ta c32123ta);

        /* renamed from: d */
        void mo84727d(C32123ta c32123ta);

        /* renamed from: e */
        boolean mo84728e(C32123ta c32123ta);

        /* renamed from: f */
        void mo84729f(C32123ta c32123ta);

        /* renamed from: g */
        void mo84730g(C32123ta c32123ta, long j11);
    }

    /* renamed from: vg.t7$i */
    /* loaded from: classes3.dex */
    public interface i {
        /* renamed from: D */
        void mo84723D(int i11);

        boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj);
    }

    public C28195t7() {
        this.f131374a = 0.0f;
        this.f131374a = (AbstractC23136l9.m118722k0() * 1.0f) / AbstractC23136l9.m118713h0();
    }

    /* renamed from: h */
    public /* synthetic */ void m141775h(WeakReference weakReference, int i11, String str, C31890dc c31890dc) {
        int i12;
        int i13;
        try {
            int i14 = 0;
            this.f131380g.setShowLoading(false);
            FeedBackgroundView feedBackgroundView = (FeedBackgroundView) weakReference.get();
            if (i11 == 0 && c31890dc != null && str.equals(feedBackgroundView.getTag(1090453510))) {
                if (c31890dc.m153249t()) {
                    i12 = C31890dc.f146485E;
                } else {
                    i12 = c31890dc.f146497c;
                }
                CharSequence m143356G = C28652r.m143349v().m143356G(new SpannableStringBuilder(this.f131379f.f148115R), AbstractC23136l9.m118742r(i12));
                feedBackgroundView.setContent(m143356G);
                if (!TextUtils.isEmpty(m143356G)) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                feedBackgroundView.setVisibility(i13);
                if (this.f131379f.f148117T.m14430a()) {
                    int i15 = AbstractC6918a0.tag_visibility;
                    if (TextUtils.isEmpty(m143356G)) {
                        i14 = 8;
                    }
                    feedBackgroundView.m43644q(i15, Integer.valueOf(i14));
                    feedBackgroundView.setTypeRender(1);
                    feedBackgroundView.m43641m(c31890dc, false, false, m143356G, C32123ta.m155029B(), 8);
                }
                h hVar = this.f131383j;
                if (hVar == null || hVar.mo84728e(this.f131379f)) {
                    m141777c();
                }
                m141791s();
                return;
            }
            h hVar2 = this.f131383j;
            if (hVar2 != null) {
                hVar2.mo84727d(this.f131379f);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            h hVar3 = this.f131383j;
            if (hVar3 != null) {
                hVar3.mo84727d(this.f131379f);
            }
        }
    }

    /* renamed from: i */
    public /* synthetic */ boolean m141776i(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
        i iVar = this.f131384k;
        if (iVar != null) {
            iVar.onInfo(iMediaPlayer, i11, i12, obj);
            return false;
        }
        return false;
    }

    /* renamed from: c */
    void m141777c() {
        this.f131381h = true;
        this.f131375b = System.currentTimeMillis();
        this.f131378e.sendEmptyMessage(1);
    }

    /* renamed from: d */
    void m141778d() {
        this.f131381h = false;
        this.f131375b = 0L;
        this.f131378e.removeMessages(1);
    }

    /* renamed from: e */
    public long m141779e() {
        return this.f131376c;
    }

    /* renamed from: f */
    public C32123ta m141780f() {
        return this.f131379f;
    }

    /* renamed from: g */
    public BaseStoryItemView m141781g() {
        return this.f131380g;
    }

    /* renamed from: j */
    public void m141782j() {
        ZVideoView zVideoView;
        int currentState;
        BaseStoryItemView baseStoryItemView = this.f131380g;
        if (baseStoryItemView != null && (zVideoView = baseStoryItemView.f83090D) != null && ((currentState = zVideoView.getCurrentState()) == 3 || currentState == 4)) {
            this.f131380g.f83090D.pause();
        }
        m141778d();
    }

    /* renamed from: k */
    public void m141783k(C32123ta c32123ta, BaseStoryItemView baseStoryItemView) {
        int i11;
        boolean z11;
        float f11;
        C17391z c17391z;
        C17391z c17391z2;
        String str;
        C32123ta c32123ta2;
        int i12;
        if (c32123ta != null && baseStoryItemView != null) {
            h hVar = this.f131383j;
            if (hVar != null) {
                hVar.mo84725b(c32123ta);
            }
            if (this.f131382i == null) {
                this.f131382i = new C23528a(baseStoryItemView.getContext());
            }
            C32123ta c32123ta3 = this.f131379f;
            if (c32123ta3 != null) {
                if (c32123ta3.f148138h.equals(c32123ta.f148138h) && this.f131380g.equals(baseStoryItemView)) {
                    if (this.f131381h && ((i12 = (c32123ta2 = this.f131379f).f148140i) != 2 || (i12 == 2 && c32123ta2.f148101D != null))) {
                        boolean z12 = c32123ta2.f148152r;
                        if (z12) {
                            c32123ta.f148152r = z12;
                            return;
                        } else {
                            this.f131379f = c32123ta;
                            return;
                        }
                    }
                } else {
                    m141790r();
                }
            }
            h hVar2 = this.f131383j;
            if (hVar2 != null && this.f131379f != null) {
                hVar2.mo84729f(c32123ta);
            }
            this.f131379f = c32123ta;
            this.f131380g = baseStoryItemView;
            if (c32123ta.m155070J()) {
                this.f131380g.f83090D.setVisibility(8);
                this.f131380g.f83091E.setVisibility(0);
                this.f131380g.f83089C.setVisibility(8);
                this.f131380g.setShowLoading(true);
                this.f131380g.f83091E.setTypeRender(1);
                this.f131380g.f83091E.m43639k(c32123ta.f148117T, c32123ta.f148115R, C32123ta.m155029B());
                this.f131380g.f83091E.setTag(1090453510, String.valueOf(c32123ta.f148116S));
                C31845ac.m152996J().m153057o0(c32123ta.f148116S, new C31845ac.e() { // from class: vg.r7

                    /* renamed from: b */
                    public final /* synthetic */ WeakReference f131292b;

                    public /* synthetic */ C28177r7(WeakReference weakReference) {
                        r2 = weakReference;
                    }

                    @Override // p716zh.C31845ac.e
                    /* renamed from: a */
                    public final void mo39491a(int i13, String str2, C31890dc c31890dc) {
                        C28195t7.this.m141775h(r2, i13, str2, c31890dc);
                    }
                });
                return;
            }
            if (this.f131379f.f148140i != 2) {
                this.f131380g.f83090D.setVisibility(8);
                this.f131380g.f83091E.setVisibility(8);
                this.f131380g.f83089C.setVisibility(0);
                C32123ta c32123ta4 = this.f131379f;
                if (c32123ta4.f148140i == 1) {
                    str = c32123ta4.f148147m;
                } else {
                    str = c32123ta4.f148146l;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (!this.f131379f.m155071K(this.f131382i)) {
                        this.f131380g.setShowLoading(true);
                    }
                    ((C23528a) this.f131382i.m123612r(this.f131380g.f83089C)).m123579C(str, C23278z2.m120099U0(), new b(str));
                    return;
                }
                return;
            }
            AbstractC28065f8.a aVar = (AbstractC28065f8.a) baseStoryItemView.f83110a0.f147022G.get(c32123ta.m155067D());
            if (aVar != null) {
                i11 = aVar.f130967d;
            } else {
                i11 = 0;
            }
            this.f131380g.f83089C.setImageBitmap(null);
            this.f131380g.f83089C.setVisibility(4);
            this.f131380g.f83091E.setVisibility(8);
            VideoController videoController = this.f131380g.f83090D.getVideoController();
            if (videoController != null) {
                videoController.m92307i(new c());
            }
            C32123ta c32123ta5 = this.f131379f;
            if (c32123ta5.f148101D == null) {
                int i13 = c32123ta5.f148155u;
                if (i13 == 0) {
                    f11 = this.f131374a;
                } else {
                    f11 = (c32123ta5.f148154t * 1.0f) / i13;
                }
                if (c32123ta5.f148126b == 2) {
                    VideoBlendingParam videoBlendingParam = c32123ta5.f148156v;
                    if (videoBlendingParam != null && AbstractC23041d2.m118194A(videoBlendingParam.f48278r)) {
                        C32123ta c32123ta6 = this.f131379f;
                        String str2 = c32123ta6.f148138h;
                        String str3 = c32123ta6.f148156v.f48278r;
                        String str4 = c32123ta6.f148146l;
                        int i14 = C23278z2.m120136k0().f116260a;
                        C32123ta c32123ta7 = this.f131379f;
                        c17391z2 = new C17391z(str2, "", str3, "", str4, i14, false, 9, f11, 2, c32123ta7.f148156v.f48278r, c32123ta7.f148136g, i11);
                    } else {
                        c17391z2 = null;
                    }
                    this.f131379f.f148101D = c17391z2;
                } else {
                    VideoBlendingParam videoBlendingParam2 = c32123ta5.f148156v;
                    if (videoBlendingParam2 != null && AbstractC23041d2.m118194A(videoBlendingParam2.f48278r)) {
                        C32123ta c32123ta8 = this.f131379f;
                        String str5 = c32123ta8.f148138h;
                        String str6 = c32123ta8.f148156v.f48278r;
                        String str7 = c32123ta8.f148146l;
                        int i15 = C23278z2.m120136k0().f116260a;
                        C32123ta c32123ta9 = this.f131379f;
                        c17391z = new C17391z(str5, "", str6, "", str7, i15, false, 9, f11, 2, c32123ta9.f148156v.f48278r, c32123ta9.f148136g, i11);
                    } else {
                        C32123ta c32123ta10 = this.f131379f;
                        c17391z = new C17391z(c32123ta10.f148138h, "", c32123ta10.f148147m, c32123ta10.f148148n, c32123ta10.f148146l, C23278z2.m120136k0().f116260a, true, 9, f11, 2, null, this.f131379f.f148136g, i11);
                    }
                    this.f131379f.f148101D = c17391z;
                }
            }
            if (C22640a.f111031a.mo117210a() && !C26361j.f125215a.m135702h(c32123ta)) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f131380g.f83090D.setMute(z11);
            this.f131380g.f83090D.setPlayConfig(ZMediaPlayerSettings.getPlayConfig(5));
            this.f131380g.f83090D.setOnPlayerStateChangedListener(new d());
            this.f131380g.f83090D.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: vg.s7
                public /* synthetic */ C28186s7() {
                }

                @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
                public final boolean onInfo(IMediaPlayer iMediaPlayer, int i16, int i17, Object obj) {
                    boolean m141776i;
                    m141776i = C28195t7.this.m141776i(iMediaPlayer, i16, i17, obj);
                    return m141776i;
                }
            });
            this.f131380g.f83090D.setOnCacheListener(new e());
            this.f131380g.f83090D.setAudioFocusControl(C28075g8.m141538e());
            RecyclingImageView loadingView = this.f131380g.f83090D.getLoadingView();
            if (loadingView != null) {
                loadingView.setImageInfo(null);
                loadingView.setBackgroundColor(-16777216);
            }
            if (!TextUtils.isEmpty(this.f131379f.f148146l)) {
                ((C23528a) this.f131382i.m123612r(this.f131377d)).m123579C(this.f131379f.f148146l, C23278z2.m120105X0(), new f());
            }
            this.f131380g.f83090D.m92421n0(true);
            this.f131380g.f83090D.setVisibility(0);
            this.f131380g.f83090D.setIsFocusing(true);
            if (this.f131379f.f148160z == 1) {
                this.f131380g.f83090D.setVideoPlayerMode(1);
            } else {
                this.f131380g.f83090D.setVideoPlayerMode(2);
            }
            C17391z c17391z3 = this.f131379f.f148101D;
            if (c17391z3 != null) {
                this.f131380g.f83090D.setZVideo(c17391z3);
                int currentState = this.f131380g.f83090D.getCurrentState();
                if (currentState != 0 && currentState != 5 && currentState != -1) {
                    if (currentState == 1 || currentState == 2 || currentState == 6 || currentState == 4) {
                        this.f131380g.f83090D.start();
                        return;
                    }
                    return;
                }
                this.f131380g.f83090D.m92410d0();
                return;
            }
            return;
        }
        m141790r();
    }

    /* renamed from: l */
    public void m141784l() {
        if (this.f131379f != null) {
            this.f131379f = null;
        }
        BaseStoryItemView baseStoryItemView = this.f131380g;
        if (baseStoryItemView != null) {
            baseStoryItemView.m87700Y();
            this.f131380g = null;
        }
        C3977j c3977j = this.f131377d;
        if (c3977j != null) {
            c3977j.setImageInfo(null);
        }
        this.f131382i = null;
        this.f131383j = null;
    }

    /* renamed from: m */
    public void m141785m() {
        ZVideoView zVideoView;
        C32123ta c32123ta = this.f131379f;
        if (c32123ta != null) {
            if (c32123ta.m155072L(this.f131382i) || this.f131379f.f148128c == 3) {
                if (this.f131379f.f148140i == 2) {
                    BaseStoryItemView baseStoryItemView = this.f131380g;
                    if (baseStoryItemView != null && (zVideoView = baseStoryItemView.f83090D) != null) {
                        int currentState = zVideoView.getCurrentState();
                        if (currentState == 0) {
                            m141783k(this.f131379f, this.f131380g);
                            return;
                        }
                        if (currentState != 2 && currentState != 4) {
                            if (currentState == 3 || currentState == 5 || currentState == 6) {
                                m141777c();
                                return;
                            }
                            return;
                        }
                        this.f131380g.f83090D.start();
                        m141777c();
                        return;
                    }
                    return;
                }
                m141777c();
            }
        }
    }

    /* renamed from: n */
    public void m141786n(h hVar) {
        this.f131383j = hVar;
    }

    /* renamed from: o */
    public void m141787o(C32123ta c32123ta) {
        this.f131379f = c32123ta;
    }

    /* renamed from: p */
    public void m141788p(boolean z11) {
        BaseStoryItemView baseStoryItemView;
        ZVideoView zVideoView;
        C32123ta c32123ta = this.f131379f;
        if (c32123ta != null && c32123ta.f148140i == 2 && c32123ta.f148101D != null && (baseStoryItemView = this.f131380g) != null && (zVideoView = baseStoryItemView.f83090D) != null) {
            zVideoView.setMute(z11);
        }
    }

    /* renamed from: q */
    public void m141789q(i iVar) {
        this.f131384k = iVar;
    }

    /* renamed from: r */
    public void m141790r() {
        ZVideoView zVideoView;
        try {
            this.f131376c = 0L;
            BaseStoryItemView baseStoryItemView = this.f131380g;
            if (baseStoryItemView != null && (zVideoView = baseStoryItemView.f83090D) != null) {
                C23669z m92432u0 = zVideoView.m92432u0(1);
                if (m92432u0 != null) {
                    C0809c1.m2050b(new g(m92432u0));
                }
                this.f131380g.f83090D.m92429s0();
                this.f131380g.f83090D.setOnPlayerStateChangedListener(null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        m141778d();
    }

    /* renamed from: s */
    void m141791s() {
        if (this.f131383j != null && this.f131379f != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("submitStorySeen: storyId= ");
            sb2.append(this.f131379f.f148138h);
            this.f131383j.mo84726c(this.f131379f);
        }
    }
}
