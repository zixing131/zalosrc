package com.zing.zalo.feed.mvp.storymusic.view;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import bo.C3054x;
import bo.EnumC2963d3;
import bo.InterfaceC2987i2;
import bo.InterfaceC2997k2;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.EmptyContentView;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.storymusic.view.StoryMusicDetailBottomSheet;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import ho0.AbstractC20110a;
import kr.InterfaceC21910a;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import nr.C23928a;
import nr.C23929b;
import on0.AbstractC24341v;
import p205hc.C19964c;
import p205hc.C19965d;
import p354n3.C23528a;
import p509sp.C26361j;
import p542ub.InterfaceC27218a;
import p649xl.C29805fd;
import pm0.C24848g0;
import pm0.InterfaceC24847g;

/* loaded from: classes4.dex */
public final class StoryMusicDetailBottomSheet extends BottomSheetZaloViewWithAnim {
    public static final C8775a Companion = new C8775a(null);

    /* renamed from: W0 */
    private C29805fd f47064W0;

    /* renamed from: X0 */
    private C23928a f47065X0;

    /* renamed from: Y0 */
    private C23929b f47066Y0;

    /* renamed from: Z0 */
    private C23528a f47067Z0 = new C23528a(getContext());

    /* renamed from: a1 */
    private String f47068a1 = "";

    /* renamed from: b1 */
    private String f47069b1 = "";

    /* renamed from: c1 */
    private SongInfo f47070c1 = new SongInfo(null, null, false, 7, null);

    /* renamed from: d1 */
    private boolean f47071d1;

    /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StoryMusicDetailBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C8775a {
        private C8775a() {
        }

        public /* synthetic */ C8775a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StoryMusicDetailBottomSheet$b */
    /* loaded from: classes4.dex */
    public static final class C8776b implements EmptyContentView.InterfaceC8078a {
        C8776b() {
        }

        @Override // com.zing.zalo.feed.components.EmptyContentView.InterfaceC8078a
        /* renamed from: s */
        public void mo43432s(C3054x c3054x) {
            AbstractC19074t.m100208f(c3054x, "emptyContentData");
            C23929b c23929b = StoryMusicDetailBottomSheet.this.f47066Y0;
            if (c23929b == null) {
                AbstractC19074t.m100223u("storyMusicPlaybackViewModel");
                c23929b = null;
            }
            c23929b.m125124y0(StoryMusicDetailBottomSheet.this.f47069b1, StoryMusicDetailBottomSheet.this.f47068a1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StoryMusicDetailBottomSheet$c */
    /* loaded from: classes4.dex */
    public static final class C8777c extends AbstractC19075u implements InterfaceC18505l {
        C8777c() {
            super(1);
        }

        /* renamed from: a */
        public final void m46997a(C23929b.b bVar) {
            AbstractC19074t.m100208f(bVar, "ev");
            if (bVar instanceof C23929b.c) {
                StoryMusicDetailBottomSheet.this.mo78936E(((C23929b.c) bVar).m125128a());
            } else if (bVar instanceof C23929b.e) {
                C23929b.e eVar = (C23929b.e) bVar;
                StoryMusicDetailBottomSheet.this.m46981OM(eVar.m125132a(), eVar.m125133b());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46997a((C23929b.b) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StoryMusicDetailBottomSheet$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8778d extends C19071q implements InterfaceC18505l {
        C8778d(Object obj) {
            super(1, obj, StoryMusicDetailBottomSheet.class, "navigateView", "navigateView(Lcom/zing/zalo/arch/ui/Event;)V", 0);
        }

        /* renamed from: h */
        public final void m46998h(C19964c c19964c) {
            AbstractC19074t.m100208f(c19964c, "p0");
            ((StoryMusicDetailBottomSheet) this.f94922q).m46974HM(c19964c);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46998h((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StoryMusicDetailBottomSheet$e */
    /* loaded from: classes4.dex */
    public static final class C8779e implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f47074p;

        C8779e(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f47074p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f47074p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f47074p.mo205i9(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static final void m46967AM(StoryMusicDetailBottomSheet storyMusicDetailBottomSheet) {
        AbstractC19074t.m100208f(storyMusicDetailBottomSheet, "this$0");
        storyMusicDetailBottomSheet.m46982PM();
    }

    /* renamed from: BM */
    private final void m46968BM(InterfaceC2997k2 interfaceC2997k2) {
        C29805fd c29805fd = this.f47064W0;
        C29805fd c29805fd2 = null;
        if (c29805fd == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd = null;
        }
        c29805fd.f137796x.setVisibility(8);
        C29805fd c29805fd3 = this.f47064W0;
        if (c29805fd3 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd3 = null;
        }
        c29805fd3.f137795w.setVisibility(8);
        C29805fd c29805fd4 = this.f47064W0;
        if (c29805fd4 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd4 = null;
        }
        c29805fd4.f137797y.setVisibility(0);
        this.f72827B0.post(new Runnable() { // from class: mr.i
            @Override // java.lang.Runnable
            public final void run() {
                StoryMusicDetailBottomSheet.m46969CM(StoryMusicDetailBottomSheet.this);
            }
        });
        C23528a c23528a = this.f47067Z0;
        C29805fd c29805fd5 = this.f47064W0;
        if (c29805fd5 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd5 = null;
        }
        ((C23528a) c23528a.m123612r(c29805fd5.f137784F)).m123618x(interfaceC2997k2.mo14230d(), C23278z2.m120126f0());
        C29805fd c29805fd6 = this.f47064W0;
        if (c29805fd6 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd6 = null;
        }
        c29805fd6.f137784F.setRoundCornerColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        C29805fd c29805fd7 = this.f47064W0;
        if (c29805fd7 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd7 = null;
        }
        c29805fd7.f137782D.setText(interfaceC2997k2.mo14227a());
        C29805fd c29805fd8 = this.f47064W0;
        if (c29805fd8 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29805fd2 = c29805fd8;
        }
        c29805fd2.f137789q.setText(interfaceC2997k2.mo14229c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m46969CM(StoryMusicDetailBottomSheet storyMusicDetailBottomSheet) {
        AbstractC19074t.m100208f(storyMusicDetailBottomSheet, "this$0");
        storyMusicDetailBottomSheet.m46982PM();
    }

    /* renamed from: DM */
    private final void m46970DM() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("extra_song_id", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f47068a1 = string;
            String string2 = m92642L3.getString("extra_story_id", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f47069b1 = string2;
            SongInfo songInfo = (SongInfo) m92642L3.getParcelable("extra_song_info");
            if (songInfo == null) {
                songInfo = new SongInfo(this.f47068a1, null, false, 6, null);
            } else {
                AbstractC19074t.m100205c(songInfo);
            }
            this.f47070c1 = songInfo;
        }
        C23929b c23929b = null;
        this.f47065X0 = (C23928a) new C1802w0(this, new C23928a.a(null, 1, null)).m9378a(C23928a.class);
        this.f47066Y0 = (C23929b) new C1802w0(this, new C23929b.d(this, null, 2, null)).m9378a(C23929b.class);
        m46975IM();
        C23929b c23929b2 = this.f47066Y0;
        if (c23929b2 == null) {
            AbstractC19074t.m100223u("storyMusicPlaybackViewModel");
        } else {
            c23929b = c23929b2;
        }
        c23929b.m125120u0(this.f47069b1, this.f47070c1);
    }

    /* renamed from: EM */
    private final void m46971EM() {
        C29805fd c29805fd = this.f47064W0;
        C29805fd c29805fd2 = null;
        if (c29805fd == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd = null;
        }
        c29805fd.f137779A.setOnClickListener(new View.OnClickListener() { // from class: mr.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryMusicDetailBottomSheet.m46972FM(StoryMusicDetailBottomSheet.this, view);
            }
        });
        C29805fd c29805fd3 = this.f47064W0;
        if (c29805fd3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29805fd2 = c29805fd3;
        }
        c29805fd2.f137786H.setOnClickListener(new View.OnClickListener() { // from class: mr.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryMusicDetailBottomSheet.m46973GM(StoryMusicDetailBottomSheet.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m46972FM(StoryMusicDetailBottomSheet storyMusicDetailBottomSheet, View view) {
        AbstractC19074t.m100208f(storyMusicDetailBottomSheet, "this$0");
        C23928a c23928a = storyMusicDetailBottomSheet.f47065X0;
        if (c23928a == null) {
            AbstractC19074t.m100223u("musicDetailViewModel");
            c23928a = null;
        }
        c23928a.m125062P(storyMusicDetailBottomSheet.f47068a1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m46973GM(StoryMusicDetailBottomSheet storyMusicDetailBottomSheet, View view) {
        AbstractC19074t.m100208f(storyMusicDetailBottomSheet, "this$0");
        C23928a c23928a = storyMusicDetailBottomSheet.f47065X0;
        if (c23928a == null) {
            AbstractC19074t.m100223u("musicDetailViewModel");
            c23928a = null;
        }
        c23928a.m125063Q(storyMusicDetailBottomSheet.f47068a1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public final void m46974HM(C19964c c19964c) {
        C23928a.c cVar = (C23928a.c) c19964c.m103749a();
        if (cVar instanceof C23928a.b) {
            m46980NM();
            return;
        }
        if (cVar instanceof C23928a.d) {
            C23929b c23929b = this.f47066Y0;
            if (c23929b == null) {
                AbstractC19074t.m100223u("storyMusicPlaybackViewModel");
                c23929b = null;
            }
            c23929b.m125107D0(((C23928a.d) cVar).m125064a());
        }
    }

    /* renamed from: IM */
    private final void m46975IM() {
        m46978LM();
        m46977KM();
        m46976JM();
    }

    /* renamed from: JM */
    private final void m46976JM() {
        C23929b c23929b = this.f47066Y0;
        if (c23929b == null) {
            AbstractC19074t.m100223u("storyMusicPlaybackViewModel");
            c23929b = null;
        }
        c23929b.m125117k0().m9219j(this, new C19965d(new C8777c()));
    }

    /* renamed from: KM */
    private final void m46977KM() {
        C23928a c23928a = this.f47065X0;
        if (c23928a == null) {
            AbstractC19074t.m100223u("musicDetailViewModel");
            c23928a = null;
        }
        c23928a.m125061O().m9219j(this, new C8779e(new C8778d(this)));
    }

    /* renamed from: LM */
    private final void m46978LM() {
        InterfaceC1764d0 interfaceC1764d0 = new InterfaceC1764d0() { // from class: mr.d
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryMusicDetailBottomSheet.m46979MM(StoryMusicDetailBottomSheet.this, (InterfaceC21910a) obj);
            }
        };
        C23929b c23929b = this.f47066Y0;
        if (c23929b == null) {
            AbstractC19074t.m100223u("storyMusicPlaybackViewModel");
            c23929b = null;
        }
        c23929b.m125118l0().m9219j(this, interfaceC1764d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m46979MM(StoryMusicDetailBottomSheet storyMusicDetailBottomSheet, InterfaceC21910a interfaceC21910a) {
        AbstractC19074t.m100208f(storyMusicDetailBottomSheet, "this$0");
        AbstractC19074t.m100208f(interfaceC21910a, "songData");
        if (AbstractC19074t.m100204b(storyMusicDetailBottomSheet.f47068a1, interfaceC21910a.mo14159b())) {
            if (interfaceC21910a.mo14160c().isValid() && interfaceC21910a.mo14158a().mo14385b()) {
                storyMusicDetailBottomSheet.m46968BM(interfaceC21910a.mo14160c());
            } else if (interfaceC21910a.mo14160c().getState() == EnumC2963d3.f11685t) {
                storyMusicDetailBottomSheet.m46996zM(interfaceC21910a);
            } else if (interfaceC21910a.mo14160c().getState() == EnumC2963d3.f11683r) {
                storyMusicDetailBottomSheet.m46994xM();
            }
        }
    }

    /* renamed from: NM */
    private final void m46980NM() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public final void m46981OM(String str, String str2) {
        try {
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C26361j c26361j = C26361j.f125215a;
            if (!c26361j.m135706l(m92689tK, str) && !c26361j.m135705k(m92689tK)) {
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_WEB_URL", str2);
                bundle.putInt("EXTRA_SOURCE_LINK", 12);
                String m40689a = new TrackingSource.C7894b().m40694f(12).m40689a();
                if (!TextUtils.isEmpty(m40689a)) {
                    bundle.putString("EXTRA_SOURCE_PARAM", m40689a);
                }
                ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
                InterfaceC27218a m92676n2 = m92676n2();
                AbstractC19074t.m100205c(m92676n2);
                c15403a.m87171F(m92676n2, str2, bundle);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: PM */
    private final void m46982PM() {
        if (!this.f47071d1 && this.f72454M0.getTranslationY() != mo37128eM()) {
            this.f72454M0.setViewTranslationY(mo37128eM());
            this.f72454M0.setMaxTranslationY(mo37128eM());
            this.f72454M0.setMinTranslationY(mo37128eM());
        }
    }

    /* renamed from: xM */
    private final void m46994xM() {
        C29805fd c29805fd = this.f47064W0;
        C29805fd c29805fd2 = null;
        byte b11 = 0;
        if (c29805fd == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd = null;
        }
        c29805fd.f137797y.setVisibility(8);
        C29805fd c29805fd3 = this.f47064W0;
        if (c29805fd3 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd3 = null;
        }
        c29805fd3.f137795w.setVisibility(8);
        C29805fd c29805fd4 = this.f47064W0;
        if (c29805fd4 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd4 = null;
        }
        boolean z11 = false;
        c29805fd4.f137796x.setVisibility(0);
        C29805fd c29805fd5 = this.f47064W0;
        if (c29805fd5 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd5 = null;
        }
        EmptyContentView emptyContentView = c29805fd5.f137794v;
        C3054x c3054x = new C3054x(z11, 1, b11 == true ? 1 : 0);
        c3054x.m14664V(1);
        c3054x.m14663U(true);
        c3054x.m14648F(C23212s8.m119607o(getContext(), AbstractC16781w.ProfileSecondaryBackgroundColor));
        c3054x.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_error));
        c3054x.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_network_error_detail));
        c3054x.m14657O(AbstractC16803z.im_connect);
        c3054x.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.tap_to_retry));
        c3054x.m14661S(0);
        c3054x.m14660R(AbstractC23136l9.m118742r(0.0f));
        c3054x.m14662T(AbstractC23136l9.m118742r(0.0f));
        emptyContentView.m43610e(c3054x);
        C29805fd c29805fd6 = this.f47064W0;
        if (c29805fd6 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29805fd2 = c29805fd6;
        }
        c29805fd2.f137794v.setEmptyContentListener(new C8776b());
        this.f72827B0.post(new Runnable() { // from class: mr.h
            @Override // java.lang.Runnable
            public final void run() {
                StoryMusicDetailBottomSheet.m46995yM(StoryMusicDetailBottomSheet.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m46995yM(StoryMusicDetailBottomSheet storyMusicDetailBottomSheet) {
        AbstractC19074t.m100208f(storyMusicDetailBottomSheet, "this$0");
        storyMusicDetailBottomSheet.m46982PM();
    }

    /* renamed from: zM */
    private final void m46996zM(InterfaceC2987i2 interfaceC2987i2) {
        boolean m127128x;
        int i11;
        boolean m127128x2;
        boolean m127128x3;
        InterfaceC2997k2 mo14160c = interfaceC2987i2.mo14160c();
        String mo14227a = mo14160c.mo14227a();
        String mo14229c = mo14160c.mo14229c();
        String mo14230d = mo14160c.mo14230d();
        C29805fd c29805fd = this.f47064W0;
        C29805fd c29805fd2 = null;
        if (c29805fd == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd = null;
        }
        int i12 = 8;
        c29805fd.f137797y.setVisibility(8);
        C29805fd c29805fd3 = this.f47064W0;
        if (c29805fd3 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd3 = null;
        }
        c29805fd3.f137796x.setVisibility(8);
        C29805fd c29805fd4 = this.f47064W0;
        if (c29805fd4 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd4 = null;
        }
        c29805fd4.f137795w.setVisibility(0);
        C29805fd c29805fd5 = this.f47064W0;
        if (c29805fd5 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd5 = null;
        }
        c29805fd5.f137783E.setText(mo14227a);
        C29805fd c29805fd6 = this.f47064W0;
        if (c29805fd6 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd6 = null;
        }
        RobotoTextView robotoTextView = c29805fd6.f137783E;
        m127128x = AbstractC24341v.m127128x(mo14227a);
        if (!m127128x) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        C29805fd c29805fd7 = this.f47064W0;
        if (c29805fd7 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd7 = null;
        }
        c29805fd7.f137790r.setText(mo14229c);
        C29805fd c29805fd8 = this.f47064W0;
        if (c29805fd8 == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd8 = null;
        }
        RobotoTextView robotoTextView2 = c29805fd8.f137790r;
        m127128x2 = AbstractC24341v.m127128x(mo14229c);
        if (!m127128x2) {
            i12 = 0;
        }
        robotoTextView2.setVisibility(i12);
        m127128x3 = AbstractC24341v.m127128x(mo14230d);
        if (!m127128x3) {
            C23528a c23528a = this.f47067Z0;
            C29805fd c29805fd9 = this.f47064W0;
            if (c29805fd9 == null) {
                AbstractC19074t.m100223u("binding");
                c29805fd9 = null;
            }
            ((C23528a) c23528a.m123612r(c29805fd9.f137785G)).m123618x(mo14230d, C23278z2.m120126f0());
        }
        C29805fd c29805fd10 = this.f47064W0;
        if (c29805fd10 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29805fd2 = c29805fd10;
        }
        c29805fd2.f137785G.setRoundCornerColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        this.f72827B0.post(new Runnable() { // from class: mr.g
            @Override // java.lang.Runnable
            public final void run() {
                StoryMusicDetailBottomSheet.m46967AM(StoryMusicDetailBottomSheet.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C29805fd c29805fd = this.f47064W0;
        if (c29805fd == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd = null;
        }
        RelativeLayout relativeLayout = c29805fd.f137798z;
        AbstractC19074t.m100207e(relativeLayout, "mainView");
        return relativeLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim
    public void close() {
        super.close();
        this.f47071d1 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: dM */
    public int mo37127dM() {
        return this.f72454M0.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        int measuredHeight = this.f72454M0.getMeasuredHeight();
        C29805fd c29805fd = this.f47064W0;
        if (c29805fd == null) {
            AbstractC19074t.m100223u("binding");
            c29805fd = null;
        }
        return measuredHeight - c29805fd.f137798z.getBottom();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C29805fd m147958c = C29805fd.m147958c(LayoutInflater.from(getContext()), this.f72454M0, true);
        AbstractC19074t.m100207e(m147958c, "inflate(...)");
        this.f47064W0 = m147958c;
        m46971EM();
        m46970DM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMaxTranslationY(mo37128eM());
        this.f72454M0.setMinTranslationY(mo37128eM());
        this.f72454M0.setEnableScrollY(true);
        this.f72454M0.setShouldInterceptTouchEvent(false);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "StoryMusicDetailBottomSheet";
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: hM */
    public void mo37567hM() {
        super.mo37567hM();
        this.f47071d1 = false;
        m46982PM();
    }
}
