package com.zing.zalo.feed.mvp.music.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import bo.C3054x;
import bo.EnumC3057x2;
import bo.InterfaceC2946a1;
import bo.InterfaceC2997k2;
import bo.InterfaceC3002l2;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.EmptyContentView;
import com.zing.zalo.feed.mvp.music.transfer.MusicDetailResult;
import com.zing.zalo.feed.mvp.music.view.MusicDetailBottomSheet;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zdesign.component.TrackingTextView;
import com.zing.zalo.zdesign.component.slider.ZdsSlider;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import ho0.AbstractC20110a;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p205hc.C19964c;
import p205hc.C19965d;
import p354n3.C23528a;
import p490rp.AbstractC25950a;
import p509sp.C26361j;
import p542ub.InterfaceC27218a;
import p554up.C27353a;
import p554up.C27355c;
import p649xl.AbstractC29980p8;
import pm0.C24848g0;
import pm0.InterfaceC24847g;

/* loaded from: classes4.dex */
public final class MusicDetailBottomSheet extends BottomSheetZaloViewWithAnim {
    public static final C8591a Companion = new C8591a(null);

    /* renamed from: W0 */
    private AbstractC29980p8 f46344W0;

    /* renamed from: X0 */
    private C27355c f46345X0;

    /* renamed from: Y0 */
    private C27353a f46346Y0;

    /* renamed from: Z0 */
    private C23528a f46347Z0 = new C23528a(getContext());

    /* renamed from: a1 */
    private String f46348a1 = "";

    /* renamed from: b1 */
    private String f46349b1 = "";

    /* renamed from: c1 */
    private String f46350c1 = "";

    /* renamed from: d1 */
    private boolean f46351d1;

    /* renamed from: e1 */
    private boolean f46352e1;

    /* renamed from: f1 */
    private int f46353f1;

    /* renamed from: g1 */
    private int f46354g1;

    /* renamed from: h1 */
    private boolean f46355h1;

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicDetailBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C8591a {
        private C8591a() {
        }

        public /* synthetic */ C8591a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicDetailBottomSheet$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8592b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46356a;

        static {
            int[] iArr = new int[EnumC3057x2.values().length];
            try {
                iArr[EnumC3057x2.f12360q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3057x2.f12359p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3057x2.f12361r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46356a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicDetailBottomSheet$c */
    /* loaded from: classes4.dex */
    public static final class C8593c implements EmptyContentView.InterfaceC8078a {
        C8593c() {
        }

        @Override // com.zing.zalo.feed.components.EmptyContentView.InterfaceC8078a
        /* renamed from: s */
        public void mo43432s(C3054x c3054x) {
            AbstractC19074t.m100208f(c3054x, "emptyContentData");
            C27353a c27353a = MusicDetailBottomSheet.this.f46346Y0;
            if (c27353a == null) {
                AbstractC19074t.m100223u("feedMusicPlaybackViewModel");
                c27353a = null;
            }
            c27353a.m140001t0(MusicDetailBottomSheet.this.f46349b1, MusicDetailBottomSheet.this.f46348a1);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicDetailBottomSheet$d */
    /* loaded from: classes4.dex */
    public static final class C8594d implements ZdsSlider.InterfaceC17047c {
        C8594d() {
        }

        @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
        /* renamed from: a */
        public void mo45797a() {
            MusicDetailBottomSheet.this.f46355h1 = false;
            C27353a c27353a = MusicDetailBottomSheet.this.f46346Y0;
            AbstractC29980p8 abstractC29980p8 = null;
            if (c27353a == null) {
                AbstractC19074t.m100223u("feedMusicPlaybackViewModel");
                c27353a = null;
            }
            AbstractC29980p8 abstractC29980p82 = MusicDetailBottomSheet.this.f46344W0;
            if (abstractC29980p82 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                abstractC29980p8 = abstractC29980p82;
            }
            c27353a.m139999r0((int) (abstractC29980p8.f138995i0.getSliderValue() * MusicDetailBottomSheet.this.f46354g1));
            MusicDetailBottomSheet.this.f46352e1 = false;
        }

        @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
        /* renamed from: b */
        public void mo45798b(float f11) {
            if (MusicDetailBottomSheet.this.f46352e1) {
                AbstractC29980p8 abstractC29980p8 = null;
                if (f11 == 1.0f) {
                    AbstractC29980p8 abstractC29980p82 = MusicDetailBottomSheet.this.f46344W0;
                    if (abstractC29980p82 == null) {
                        AbstractC19074t.m100223u("binding");
                        abstractC29980p82 = null;
                    }
                    abstractC29980p82.f138995i0.setSliderValue(0.0f);
                    C27353a c27353a = MusicDetailBottomSheet.this.f46346Y0;
                    if (c27353a == null) {
                        AbstractC19074t.m100223u("feedMusicPlaybackViewModel");
                        c27353a = null;
                    }
                    c27353a.m139999r0(0);
                }
                AbstractC29980p8 abstractC29980p83 = MusicDetailBottomSheet.this.f46344W0;
                if (abstractC29980p83 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    abstractC29980p8 = abstractC29980p83;
                }
                abstractC29980p8.f138995i0.setSliderValue(f11);
                MusicDetailBottomSheet.this.m45781dN((int) (r0.f46354g1 * f11));
            }
        }

        @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
        /* renamed from: c */
        public void mo45799c() {
            MusicDetailBottomSheet.this.f46352e1 = true;
            MusicDetailBottomSheet.this.f46355h1 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicDetailBottomSheet$e */
    /* loaded from: classes4.dex */
    public static final class C8595e extends AbstractC19075u implements InterfaceC18505l {
        C8595e() {
            super(1);
        }

        /* renamed from: a */
        public final void m45800a(Boolean bool) {
            int i11;
            AbstractC29980p8 abstractC29980p8 = MusicDetailBottomSheet.this.f46344W0;
            if (abstractC29980p8 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29980p8 = null;
            }
            TrackingTextView trackingTextView = abstractC29980p8.f138989c0;
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            trackingTextView.setVisibility(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45800a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicDetailBottomSheet$f */
    /* loaded from: classes4.dex */
    public static final class C8596f extends AbstractC19075u implements InterfaceC18505l {
        C8596f() {
            super(1);
        }

        /* renamed from: a */
        public final void m45801a(C27353a.b bVar) {
            AbstractC19074t.m100208f(bVar, "ev");
            if (bVar instanceof C27353a.d) {
                MusicDetailBottomSheet.this.mo78936E(((C27353a.d) bVar).m140007a());
            } else if (bVar instanceof C27353a.f) {
                C27353a.f fVar = (C27353a.f) bVar;
                MusicDetailBottomSheet.this.m45778aN(fVar.m140008a(), fVar.m140009b());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45801a((C27353a.b) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicDetailBottomSheet$g */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8597g extends C19071q implements InterfaceC18505l {
        C8597g(Object obj) {
            super(1, obj, MusicDetailBottomSheet.class, "navigateView", "navigateView(Lcom/zing/zalo/arch/ui/Event;)V", 0);
        }

        /* renamed from: h */
        public final void m45802h(C19964c c19964c) {
            AbstractC19074t.m100208f(c19964c, "p0");
            ((MusicDetailBottomSheet) this.f94922q).m45770SM(c19964c);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45802h((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicDetailBottomSheet$h */
    /* loaded from: classes4.dex */
    public static final class C8598h implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f46361p;

        C8598h(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f46361p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f46361p;
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
            this.f46361p.mo205i9(obj);
        }
    }

    /* renamed from: EM */
    private final void m45756EM() {
        AbstractC29980p8 abstractC29980p8 = this.f46344W0;
        AbstractC29980p8 abstractC29980p82 = null;
        byte b11 = 0;
        if (abstractC29980p8 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p8 = null;
        }
        abstractC29980p8.f138985Y.setVisibility(8);
        AbstractC29980p8 abstractC29980p83 = this.f46344W0;
        if (abstractC29980p83 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p83 = null;
        }
        abstractC29980p83.f138983W.setVisibility(8);
        AbstractC29980p8 abstractC29980p84 = this.f46344W0;
        if (abstractC29980p84 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p84 = null;
        }
        boolean z11 = false;
        abstractC29980p84.f138984X.setVisibility(0);
        AbstractC29980p8 abstractC29980p85 = this.f46344W0;
        if (abstractC29980p85 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p85 = null;
        }
        EmptyContentView emptyContentView = abstractC29980p85.f138982V;
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
        AbstractC29980p8 abstractC29980p86 = this.f46344W0;
        if (abstractC29980p86 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC29980p82 = abstractC29980p86;
        }
        abstractC29980p82.f138982V.setEmptyContentListener(new C8593c());
        this.f72827B0.post(new Runnable() { // from class: tp.g
            @Override // java.lang.Runnable
            public final void run() {
                MusicDetailBottomSheet.m45757FM(MusicDetailBottomSheet.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m45757FM(MusicDetailBottomSheet musicDetailBottomSheet) {
        AbstractC19074t.m100208f(musicDetailBottomSheet, "this$0");
        musicDetailBottomSheet.m45779bN();
    }

    /* renamed from: GM */
    private final void m45758GM(InterfaceC2946a1 interfaceC2946a1) {
        boolean m127128x;
        int i11;
        boolean m127128x2;
        boolean m127128x3;
        InterfaceC2997k2 mo14160c = interfaceC2946a1.mo14160c();
        String mo14227a = mo14160c.mo14227a();
        String mo14229c = mo14160c.mo14229c();
        String mo14230d = mo14160c.mo14230d();
        AbstractC29980p8 abstractC29980p8 = this.f46344W0;
        AbstractC29980p8 abstractC29980p82 = null;
        if (abstractC29980p8 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p8 = null;
        }
        int i12 = 8;
        abstractC29980p8.f138985Y.setVisibility(8);
        AbstractC29980p8 abstractC29980p83 = this.f46344W0;
        if (abstractC29980p83 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p83 = null;
        }
        abstractC29980p83.f138984X.setVisibility(8);
        AbstractC29980p8 abstractC29980p84 = this.f46344W0;
        if (abstractC29980p84 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p84 = null;
        }
        abstractC29980p84.f138983W.setVisibility(0);
        AbstractC29980p8 abstractC29980p85 = this.f46344W0;
        if (abstractC29980p85 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p85 = null;
        }
        abstractC29980p85.f138994h0.setText(mo14227a);
        AbstractC29980p8 abstractC29980p86 = this.f46344W0;
        if (abstractC29980p86 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p86 = null;
        }
        RobotoTextView robotoTextView = abstractC29980p86.f138994h0;
        m127128x = AbstractC24341v.m127128x(mo14227a);
        if (!m127128x) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        AbstractC29980p8 abstractC29980p87 = this.f46344W0;
        if (abstractC29980p87 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p87 = null;
        }
        abstractC29980p87.f138977Q.setText(mo14229c);
        AbstractC29980p8 abstractC29980p88 = this.f46344W0;
        if (abstractC29980p88 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p88 = null;
        }
        RobotoTextView robotoTextView2 = abstractC29980p88.f138977Q;
        m127128x2 = AbstractC24341v.m127128x(mo14229c);
        if (!m127128x2) {
            i12 = 0;
        }
        robotoTextView2.setVisibility(i12);
        m127128x3 = AbstractC24341v.m127128x(mo14230d);
        if (!m127128x3) {
            C23528a c23528a = this.f46347Z0;
            AbstractC29980p8 abstractC29980p89 = this.f46344W0;
            if (abstractC29980p89 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29980p89 = null;
            }
            ((C23528a) c23528a.m123612r(abstractC29980p89.f138997k0)).m123618x(mo14230d, C23278z2.m120126f0());
        }
        AbstractC29980p8 abstractC29980p810 = this.f46344W0;
        if (abstractC29980p810 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC29980p82 = abstractC29980p810;
        }
        abstractC29980p82.f138997k0.setRoundCornerColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        this.f72827B0.post(new Runnable() { // from class: tp.f
            @Override // java.lang.Runnable
            public final void run() {
                MusicDetailBottomSheet.m45759HM(MusicDetailBottomSheet.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m45759HM(MusicDetailBottomSheet musicDetailBottomSheet) {
        AbstractC19074t.m100208f(musicDetailBottomSheet, "this$0");
        musicDetailBottomSheet.m45779bN();
    }

    /* renamed from: IM */
    private final void m45760IM(EnumC3057x2 enumC3057x2) {
        int i11 = C8592b.f46356a[enumC3057x2.ordinal()];
        AbstractC29980p8 abstractC29980p8 = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    AbstractC29980p8 abstractC29980p82 = this.f46344W0;
                    if (abstractC29980p82 == null) {
                        AbstractC19074t.m100223u("binding");
                        abstractC29980p82 = null;
                    }
                    abstractC29980p82.f138986Z.setVisibility(0);
                    AbstractC29980p8 abstractC29980p83 = this.f46344W0;
                    if (abstractC29980p83 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        abstractC29980p8 = abstractC29980p83;
                    }
                    abstractC29980p8.f138988b0.setVisibility(8);
                    return;
                }
                return;
            }
            AbstractC29980p8 abstractC29980p84 = this.f46344W0;
            if (abstractC29980p84 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29980p84 = null;
            }
            abstractC29980p84.f138988b0.setImageResource(AbstractC16803z.ic_btn_profile_music_pause);
            AbstractC29980p8 abstractC29980p85 = this.f46344W0;
            if (abstractC29980p85 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29980p85 = null;
            }
            abstractC29980p85.f138986Z.setVisibility(8);
            AbstractC29980p8 abstractC29980p86 = this.f46344W0;
            if (abstractC29980p86 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                abstractC29980p8 = abstractC29980p86;
            }
            abstractC29980p8.f138988b0.setVisibility(0);
            return;
        }
        AbstractC29980p8 abstractC29980p87 = this.f46344W0;
        if (abstractC29980p87 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p87 = null;
        }
        abstractC29980p87.f138988b0.setImageResource(AbstractC16803z.ic_btn_profile_music_play);
        AbstractC29980p8 abstractC29980p88 = this.f46344W0;
        if (abstractC29980p88 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p88 = null;
        }
        abstractC29980p88.f138986Z.setVisibility(8);
        AbstractC29980p8 abstractC29980p89 = this.f46344W0;
        if (abstractC29980p89 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC29980p8 = abstractC29980p89;
        }
        abstractC29980p8.f138988b0.setVisibility(0);
    }

    /* renamed from: JM */
    private final void m45761JM(InterfaceC3002l2 interfaceC3002l2) {
        int m116580c;
        m45780cN(interfaceC3002l2.getDuration());
        if (!this.f46355h1) {
            m45781dN(interfaceC3002l2.mo14384a());
            AbstractC29980p8 abstractC29980p8 = this.f46344W0;
            if (abstractC29980p8 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29980p8 = null;
            }
            ZdsSlider zdsSlider = abstractC29980p8.f138995i0;
            float f11 = this.f46353f1;
            m116580c = AbstractC22543l.m116580c(this.f46354g1, 1);
            zdsSlider.setSliderValue(f11 / m116580c);
        }
    }

    /* renamed from: KM */
    private final void m45762KM(InterfaceC2997k2 interfaceC2997k2) {
        AbstractC29980p8 abstractC29980p8 = this.f46344W0;
        AbstractC29980p8 abstractC29980p82 = null;
        if (abstractC29980p8 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p8 = null;
        }
        abstractC29980p8.f138984X.setVisibility(8);
        AbstractC29980p8 abstractC29980p83 = this.f46344W0;
        if (abstractC29980p83 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p83 = null;
        }
        abstractC29980p83.f138983W.setVisibility(8);
        AbstractC29980p8 abstractC29980p84 = this.f46344W0;
        if (abstractC29980p84 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p84 = null;
        }
        abstractC29980p84.f138985Y.setVisibility(0);
        this.f72827B0.post(new Runnable() { // from class: tp.e
            @Override // java.lang.Runnable
            public final void run() {
                MusicDetailBottomSheet.m45763LM(MusicDetailBottomSheet.this);
            }
        });
        C23528a c23528a = this.f46347Z0;
        AbstractC29980p8 abstractC29980p85 = this.f46344W0;
        if (abstractC29980p85 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p85 = null;
        }
        ((C23528a) c23528a.m123612r(abstractC29980p85.f138996j0)).m123618x(interfaceC2997k2.mo14230d(), C23278z2.m120126f0());
        AbstractC29980p8 abstractC29980p86 = this.f46344W0;
        if (abstractC29980p86 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p86 = null;
        }
        abstractC29980p86.f138996j0.setRoundCornerColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        AbstractC29980p8 abstractC29980p87 = this.f46344W0;
        if (abstractC29980p87 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p87 = null;
        }
        abstractC29980p87.f138993g0.setText(interfaceC2997k2.mo14227a());
        AbstractC29980p8 abstractC29980p88 = this.f46344W0;
        if (abstractC29980p88 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC29980p82 = abstractC29980p88;
        }
        abstractC29980p82.f138976P.setText(interfaceC2997k2.mo14229c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m45763LM(MusicDetailBottomSheet musicDetailBottomSheet) {
        AbstractC19074t.m100208f(musicDetailBottomSheet, "this$0");
        musicDetailBottomSheet.m45779bN();
    }

    /* renamed from: MM */
    private final void m45764MM() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("extra_song_id", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f46348a1 = string;
            String string2 = m92642L3.getString("extra_feed_id", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f46349b1 = string2;
        }
        C27353a c27353a = null;
        this.f46345X0 = (C27355c) new C1802w0(this, new C27355c.a(null, 1, null)).m9378a(C27355c.class);
        Context m92648SI = m92648SI();
        AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type com.zing.zalo.activity.ZaloActivity");
        this.f46346Y0 = (C27353a) new C1802w0((ZaloActivity) m92648SI, new C27353a.e(this, null, 2, null)).m9378a(C27353a.class);
        m45782eN();
        m45771TM();
        C27353a c27353a2 = this.f46346Y0;
        if (c27353a2 == null) {
            AbstractC19074t.m100223u("feedMusicPlaybackViewModel");
            c27353a2 = null;
        }
        c27353a2.m139996o0(this.f46349b1);
        C27353a c27353a3 = this.f46346Y0;
        if (c27353a3 == null) {
            AbstractC19074t.m100223u("feedMusicPlaybackViewModel");
        } else {
            c27353a = c27353a3;
        }
        c27353a.m139995n0(this.f46349b1);
    }

    /* renamed from: NM */
    private final void m45765NM() {
        AbstractC29980p8 abstractC29980p8 = this.f46344W0;
        if (abstractC29980p8 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p8 = null;
        }
        abstractC29980p8.f138995i0.setListener(new C8594d());
    }

    /* renamed from: OM */
    private final void m45766OM() {
        m45765NM();
        AbstractC29980p8 abstractC29980p8 = this.f46344W0;
        AbstractC29980p8 abstractC29980p82 = null;
        if (abstractC29980p8 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p8 = null;
        }
        abstractC29980p8.f138989c0.setIdTracking("create_post_music_section");
        AbstractC29980p8 abstractC29980p83 = this.f46344W0;
        if (abstractC29980p83 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p83 = null;
        }
        abstractC29980p83.f138989c0.setOnClickListener(new View.OnClickListener() { // from class: tp.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicDetailBottomSheet.m45767PM(MusicDetailBottomSheet.this, view);
            }
        });
        AbstractC29980p8 abstractC29980p84 = this.f46344W0;
        if (abstractC29980p84 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p84 = null;
        }
        abstractC29980p84.f138998l0.setOnClickListener(new View.OnClickListener() { // from class: tp.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicDetailBottomSheet.m45768QM(MusicDetailBottomSheet.this, view);
            }
        });
        AbstractC29980p8 abstractC29980p85 = this.f46344W0;
        if (abstractC29980p85 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC29980p82 = abstractC29980p85;
        }
        abstractC29980p82.f138988b0.setOnClickListener(new View.OnClickListener() { // from class: tp.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicDetailBottomSheet.m45769RM(MusicDetailBottomSheet.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m45767PM(MusicDetailBottomSheet musicDetailBottomSheet, View view) {
        AbstractC19074t.m100208f(musicDetailBottomSheet, "this$0");
        C27355c c27355c = musicDetailBottomSheet.f46345X0;
        if (c27355c == null) {
            AbstractC19074t.m100223u("musicDetailViewModel");
            c27355c = null;
        }
        c27355c.m140053Q(musicDetailBottomSheet.f46348a1, musicDetailBottomSheet.f46350c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m45768QM(MusicDetailBottomSheet musicDetailBottomSheet, View view) {
        AbstractC19074t.m100208f(musicDetailBottomSheet, "this$0");
        C27355c c27355c = musicDetailBottomSheet.f46345X0;
        if (c27355c == null) {
            AbstractC19074t.m100223u("musicDetailViewModel");
            c27355c = null;
        }
        c27355c.m140054R(musicDetailBottomSheet.f46348a1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m45769RM(MusicDetailBottomSheet musicDetailBottomSheet, View view) {
        AbstractC19074t.m100208f(musicDetailBottomSheet, "this$0");
        C27353a c27353a = musicDetailBottomSheet.f46346Y0;
        AbstractC29980p8 abstractC29980p8 = null;
        if (c27353a == null) {
            AbstractC19074t.m100223u("feedMusicPlaybackViewModel");
            c27353a = null;
        }
        String str = musicDetailBottomSheet.f46349b1;
        AbstractC29980p8 abstractC29980p82 = musicDetailBottomSheet.f46344W0;
        if (abstractC29980p82 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC29980p8 = abstractC29980p82;
        }
        c27353a.m139998q0(str, (int) (abstractC29980p8.f138995i0.getSliderValue() * musicDetailBottomSheet.f46354g1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public final void m45770SM(C19964c c19964c) {
        C27355c.c cVar = (C27355c.c) c19964c.m103749a();
        if (cVar instanceof C27355c.b) {
            m45777ZM((C27355c.b) cVar);
            return;
        }
        if (cVar instanceof C27355c.d) {
            C27353a c27353a = this.f46346Y0;
            if (c27353a == null) {
                AbstractC19074t.m100223u("feedMusicPlaybackViewModel");
                c27353a = null;
            }
            c27353a.m140005x0(((C27355c.d) cVar).m140059a());
        }
    }

    /* renamed from: TM */
    private final void m45771TM() {
        m45775XM();
        m45774WM();
        m45772UM();
        m45773VM();
    }

    /* renamed from: UM */
    private final void m45772UM() {
        C27355c c27355c = this.f46345X0;
        if (c27355c == null) {
            AbstractC19074t.m100223u("musicDetailViewModel");
            c27355c = null;
        }
        c27355c.m140051O().m9219j(this, new C8598h(new C8595e()));
    }

    /* renamed from: VM */
    private final void m45773VM() {
        C27353a c27353a = this.f46346Y0;
        if (c27353a == null) {
            AbstractC19074t.m100223u("feedMusicPlaybackViewModel");
            c27353a = null;
        }
        c27353a.m139988b0().m9219j(this, new C19965d(new C8596f()));
    }

    /* renamed from: WM */
    private final void m45774WM() {
        C27355c c27355c = this.f46345X0;
        if (c27355c == null) {
            AbstractC19074t.m100223u("musicDetailViewModel");
            c27355c = null;
        }
        c27355c.m140052P().m9219j(this, new C8598h(new C8597g(this)));
    }

    /* renamed from: XM */
    private final void m45775XM() {
        InterfaceC1764d0 interfaceC1764d0 = new InterfaceC1764d0() { // from class: tp.d
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                MusicDetailBottomSheet.m45776YM(MusicDetailBottomSheet.this, (InterfaceC2946a1) obj);
            }
        };
        C27353a c27353a = this.f46346Y0;
        if (c27353a == null) {
            AbstractC19074t.m100223u("feedMusicPlaybackViewModel");
            c27353a = null;
        }
        c27353a.m139983W().m9219j(this, interfaceC1764d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public static final void m45776YM(MusicDetailBottomSheet musicDetailBottomSheet, InterfaceC2946a1 interfaceC2946a1) {
        AbstractC19074t.m100208f(musicDetailBottomSheet, "this$0");
        AbstractC19074t.m100208f(interfaceC2946a1, "songData");
        if (AbstractC19074t.m100204b(musicDetailBottomSheet.f46348a1, interfaceC2946a1.mo14159b())) {
            try {
                musicDetailBottomSheet.f46350c1 = interfaceC2946a1.mo14160c().mo14232f();
                if (interfaceC2946a1.mo14160c().isValid() && interfaceC2946a1.mo14158a().mo14385b()) {
                    musicDetailBottomSheet.m45762KM(interfaceC2946a1.mo14160c());
                    musicDetailBottomSheet.m45760IM(interfaceC2946a1.mo14158a().mo14386c());
                    musicDetailBottomSheet.m45761JM(interfaceC2946a1.mo14158a());
                } else if (!interfaceC2946a1.mo14160c().isValid()) {
                    musicDetailBottomSheet.m45756EM();
                } else if (!interfaceC2946a1.mo14158a().mo14385b()) {
                    musicDetailBottomSheet.m45758GM(interfaceC2946a1);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: ZM */
    private final void m45777ZM(C27355c.b bVar) {
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.mo50035CK(-1, AbstractC25950a.m133687b(new Intent(), new MusicDetailResult(bVar.m140057a(), bVar.m140058b())));
        }
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public final void m45778aN(String str, String str2) {
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

    /* renamed from: bN */
    private final void m45779bN() {
        if (!this.f46351d1 && this.f72454M0.getTranslationY() != mo37128eM()) {
            this.f72454M0.setViewTranslationY(mo37128eM());
            this.f72454M0.setMaxTranslationY(mo37128eM());
            this.f72454M0.setMinTranslationY(mo37128eM());
        }
    }

    /* renamed from: cN */
    private final void m45780cN(int i11) {
        this.f46354g1 = i11;
        AbstractC29980p8 abstractC29980p8 = this.f46344W0;
        if (abstractC29980p8 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p8 = null;
        }
        abstractC29980p8.f138995i0.m91247n(ZdsSlider.EnumC17051g.TEXT, AbstractC23160o0.m119200J0(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public final void m45781dN(int i11) {
        this.f46353f1 = i11;
        AbstractC29980p8 abstractC29980p8 = this.f46344W0;
        if (abstractC29980p8 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p8 = null;
        }
        abstractC29980p8.f138995i0.m91246m(ZdsSlider.EnumC17049e.TEXT, AbstractC23160o0.m119200J0(i11));
    }

    /* renamed from: eN */
    private final void m45782eN() {
        AbstractC29980p8 abstractC29980p8 = this.f46344W0;
        if (abstractC29980p8 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p8 = null;
        }
        abstractC29980p8.m8503J(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        AbstractC29980p8 abstractC29980p8 = this.f46344W0;
        if (abstractC29980p8 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p8 = null;
        }
        RelativeLayout relativeLayout = abstractC29980p8.f138987a0;
        AbstractC19074t.m100207e(relativeLayout, "mainView");
        return relativeLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim
    public void close() {
        super.close();
        this.f46351d1 = true;
        C27355c c27355c = this.f46345X0;
        C27353a c27353a = null;
        if (c27355c == null) {
            AbstractC19074t.m100223u("musicDetailViewModel");
            c27355c = null;
        }
        c27355c.m140055S();
        C27353a c27353a2 = this.f46346Y0;
        if (c27353a2 == null) {
            AbstractC19074t.m100223u("feedMusicPlaybackViewModel");
        } else {
            c27353a = c27353a2;
        }
        c27353a.m140003v0();
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
        AbstractC29980p8 abstractC29980p8 = this.f46344W0;
        if (abstractC29980p8 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29980p8 = null;
        }
        return measuredHeight - abstractC29980p8.f138987a0.getBottom();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        ViewDataBinding m8554e = AbstractC1673g.m8554e(LayoutInflater.from(getContext()), AbstractC7409c0.music_detail_bottom_sheet_layout, this.f72454M0, true);
        AbstractC19074t.m100207e(m8554e, "inflate(...)");
        this.f46344W0 = (AbstractC29980p8) m8554e;
        m45766OM();
        m45764MM();
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
        return "MusicDetailBottomSheet";
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: hM */
    public void mo37567hM() {
        super.mo37567hM();
        this.f46351d1 = false;
        C27355c c27355c = this.f46345X0;
        if (c27355c == null) {
            AbstractC19074t.m100223u("musicDetailViewModel");
            c27355c = null;
        }
        c27355c.m140056T();
        m45779bN();
    }
}
