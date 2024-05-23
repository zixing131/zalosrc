package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.p077ui.chat.C11621p0;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.zlottie.widget.C17291a;
import com.zing.zalo.zlottie.widget.LottieImageView;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.File;
import me0.AbstractC23193r0;
import p207he.C20024r;
import p494rv.C25979a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vg.AbstractC28054e7;

/* loaded from: classes6.dex */
public final class LottieEffectFullscreenView extends BaseZaloView implements ZaloView.InterfaceC17421f, InterfaceC0733x {
    public static final C14529a Companion = new C14529a(null);

    /* renamed from: M0 */
    private LottieConfig f74803M0;

    /* renamed from: N0 */
    private String f74804N0 = "";

    /* renamed from: O0 */
    private String f74805O0 = "";

    /* renamed from: P0 */
    private String f74806P0 = "";

    /* renamed from: Q0 */
    private boolean f74807Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f74808R0;

    /* renamed from: S0 */
    private final C17291a.f f74809S0;

    /* renamed from: com.zing.zalo.ui.zviews.LottieEffectFullscreenView$a */
    /* loaded from: classes6.dex */
    public static final class C14529a {
        private C14529a() {
        }

        public /* synthetic */ C14529a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.LottieEffectFullscreenView$b */
    /* loaded from: classes6.dex */
    public static final class C14530b implements C17291a.f {
        C14530b() {
        }

        @Override // com.zing.zalo.zlottie.widget.C17291a.f
        /* renamed from: a */
        public void mo55123a() {
            LottieEffectFullscreenView.this.finish();
        }

        @Override // com.zing.zalo.zlottie.widget.C17291a.f
        /* renamed from: b */
        public void mo55124b() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.LottieEffectFullscreenView$c */
    /* loaded from: classes6.dex */
    static final class C14531c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.zviews.LottieEffectFullscreenView$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC28054e7 {

            /* renamed from: a */
            final /* synthetic */ LottieEffectFullscreenView f74812a;

            a(LottieEffectFullscreenView lottieEffectFullscreenView) {
                this.f74812a = lottieEffectFullscreenView;
            }

            @Override // vg.AbstractC28054e7
            /* renamed from: a */
            public void mo16496a(int i11) {
                this.f74812a.f74806P0 = "";
            }

            @Override // vg.AbstractC28054e7
            /* renamed from: e */
            public void mo16498e() {
                this.f74812a.f74806P0 = "";
                this.f74812a.f74807Q0 = true;
            }
        }

        C14531c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a(LottieEffectFullscreenView.this);
        }
    }

    public LottieEffectFullscreenView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C14531c());
        this.f74808R0 = m129210a;
        this.f74809S0 = new C14530b();
    }

    /* renamed from: gM */
    private final void m81259gM(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.f74803M0 = (LottieConfig) bundle.getParcelable("extra_config");
        String string = bundle.getString("extra_effect_id", "");
        AbstractC19074t.m100207e(string, "getString(...)");
        this.f74804N0 = string;
        String string2 = bundle.getString("extra_effect_path", "");
        AbstractC19074t.m100207e(string2, "getString(...)");
        this.f74805O0 = string2;
    }

    /* renamed from: hM */
    private final AbstractC28054e7 m81260hM() {
        return (AbstractC28054e7) this.f74808R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static final boolean m81261iM(LottieEffectFullscreenView lottieEffectFullscreenView, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(lottieEffectFullscreenView, "this$0");
        if (!view.onTouchEvent(motionEvent)) {
            lottieEffectFullscreenView.finish();
            return true;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        boolean z11 = false;
        if (bundle != null) {
            z11 = bundle.getBoolean("extra_done_playing_sound", false);
        }
        this.f74807Q0 = z11;
        m81259gM(m92642L3());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        LottieImageView lottieImageView = new LottieImageView(m92648SI());
        lottieImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LottieConfig lottieConfig = this.f74803M0;
        if (lottieConfig != null) {
            lottieImageView.m92147B(this.f74805O0 + "/data.json", "fullscreen_lottie_effect_" + this.f74804N0, !AbstractC23193r0.m119506o(), false);
            C25979a.m133810a(lottieImageView, lottieConfig);
            lottieImageView.setAnimationListener(this.f74809S0);
            lottieImageView.m92155v();
        }
        FrameLayout frameLayout = new FrameLayout(m92686rK());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(16777215);
        frameLayout.addView(lottieImageView);
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.lv
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m81261iM;
                m81261iM = LottieEffectFullscreenView.m81261iM(LottieEffectFullscreenView.this, view, motionEvent);
                return m81261iM;
            }
        });
        return frameLayout;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        ChatView chatView;
        C11621p0 c11621p0;
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ChatView) {
            chatView = (ChatView) m92650VI;
        } else {
            chatView = null;
        }
        if (chatView != null && (c11621p0 = chatView.f56793R1) != null) {
            c11621p0.m64781i0();
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putBoolean("extra_done_playing_sound", this.f74807Q0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        LottieConfig lottieConfig = this.f74803M0;
        if (lottieConfig != null && !C20024r.m103941j()) {
            C7853b.a aVar = C7853b.Companion;
            if (!aVar.m40150a().m40133i0() && lottieConfig.m48106i() && !this.f74807Q0) {
                C7853b m40150a = aVar.m40150a();
                m40150a.m40136j1();
                this.f74806P0 = this.f74805O0 + "/sound.mp3";
                if (!new File(this.f74806P0).exists()) {
                    this.f74806P0 = "";
                } else {
                    if (m40150a.m40139l0(this.f74806P0)) {
                        return;
                    }
                    m40150a.m40093D0(this.f74806P0, 0, m81260hM(), true, C25979a.m133813d(lottieConfig), true);
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C7853b m40150a = C7853b.Companion.m40150a();
        if (this.f74806P0.length() > 0 && m40150a.m40139l0(this.f74806P0)) {
            m40150a.m40119a1(null);
            m40150a.m40136j1();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "LottieEffectFullscreenView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && !mo60294yp()) {
            finish();
            return true;
        }
        return false;
    }
}
