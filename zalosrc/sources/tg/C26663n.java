package tg;

import ag0.AbstractC0837p0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import au.C2370r0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.common.KeyframeAnimLayout;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.p077ui.Cocos2dxAnimationActivity;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.Cocos2dxLoadingView;
import com.zing.zalo.p077ui.zviews.Cocos2dxView;
import com.zing.zalo.p077ui.zviews.TimelineView;
import gg0.AbstractC19444a;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p175g0.AbstractC19181d;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p494rv.C25979a;
import tg.C26663n;
import tg.C26674y;
import w20.InterfaceC28698a;

/* renamed from: tg.n */
/* loaded from: classes3.dex */
public class C26663n {

    /* renamed from: a */
    C2370r0 f126180a;

    /* renamed from: d */
    public int f126183d;

    /* renamed from: b */
    public String f126181b = "";

    /* renamed from: c */
    boolean f126182c = false;

    /* renamed from: e */
    float f126184e = 1.0f;

    /* renamed from: f */
    int f126185f = 0;

    /* renamed from: g */
    float f126186g = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tg.n$a */
    /* loaded from: classes3.dex */
    public class a implements C26674y.b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ void m136834d(BaseZaloView baseZaloView, KeyframeAnimLayout keyframeAnimLayout, String str) {
            try {
                if (!baseZaloView.m92681pJ()) {
                    ((ViewGroup) baseZaloView.m92656bJ()).removeView(keyframeAnimLayout);
                    baseZaloView.m78943YL(null);
                }
                C26664o.m136836a().m136843h(str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public /* synthetic */ void m136835e(final String str, int i11, String str2, C26657h c26657h) {
            boolean z11;
            int i12;
            int i13;
            try {
                try {
                    final BaseZaloView baseZaloView = (BaseZaloView) C26663n.this.f126180a.m12394a();
                    if (!TextUtils.isEmpty(C26663n.this.f126181b) && TextUtils.equals(C26663n.this.f126181b, str)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (AbstractC23304d.f113300L2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("mEffectId--");
                        sb2.append(C26663n.this.f126181b);
                        sb2.append("--Canceled--");
                        sb2.append(C26663n.this.f126182c);
                        sb2.append("--Mode Play--");
                        sb2.append(C26663n.this.f126183d);
                    }
                    if (baseZaloView != 0 && baseZaloView.m92674mJ() && !baseZaloView.m92681pJ() && baseZaloView.m92676n2() != null && z11 && !C26663n.this.f126182c && i11 == 0 && str2 != null && c26657h != null && (i12 = c26657h.f126157b) > 0) {
                        if (i12 == 11) {
                            if (!AbstractC23309i.m121072J2()) {
                                C26664o.m136836a().m136842g(C26663n.this);
                                return;
                            }
                            if (AbstractC23304d.f113300L2) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("isPlayingEffectKeyframe--effectId--");
                                sb3.append(str);
                                sb3.append("--");
                                sb3.append(C26664o.m136836a().m136839d(str));
                            }
                            if (!C26664o.m136836a().m136839d(str)) {
                                int dimensionPixelSize = baseZaloView.m92689tK().getResources().getDimensionPixelSize(AbstractC19181d.abc_action_bar_default_height_material);
                                int dimensionPixelSize2 = baseZaloView.m92689tK().getResources().getDimensionPixelSize(AbstractC16802y.min_height_input_row);
                                int m118737p0 = AbstractC23136l9.m118737p0();
                                if (baseZaloView instanceof InterfaceC28698a) {
                                    i13 = ((InterfaceC28698a) baseZaloView).mo46523Gg();
                                } else {
                                    i13 = 0;
                                }
                                final KeyframeAnimLayout keyframeAnimLayout = new KeyframeAnimLayout(baseZaloView.getContext(), AbstractC23136l9.m118722k0(), (((AbstractC23136l9.m118713h0() - m118737p0) - dimensionPixelSize) - dimensionPixelSize2) - i13, baseZaloView);
                                if (baseZaloView.m92656bJ() instanceof ViewGroup) {
                                    keyframeAnimLayout.m39937m(str2, str);
                                    if (!(baseZaloView instanceof TimelineView) && (baseZaloView.m92656bJ() instanceof FrameLayout)) {
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                        layoutParams.setMargins(0, m118737p0 + dimensionPixelSize, 0, 0);
                                        ((ViewGroup) baseZaloView.m92656bJ()).addView(keyframeAnimLayout, layoutParams);
                                    } else {
                                        ((ViewGroup) baseZaloView.m92656bJ()).addView(keyframeAnimLayout);
                                    }
                                    keyframeAnimLayout.setKeyframesLayoutListener(new KeyframeAnimLayout.InterfaceC7851b() { // from class: tg.l
                                        @Override // com.zing.zalo.common.KeyframeAnimLayout.InterfaceC7851b
                                        /* renamed from: a */
                                        public final void mo39940a() {
                                            C26663n.a.m136834d(BaseZaloView.this, keyframeAnimLayout, str);
                                        }
                                    });
                                    baseZaloView.m78943YL(keyframeAnimLayout);
                                }
                                C26664o.m136836a().m136841f(str);
                            }
                        } else if (i12 == 14) {
                            LottieConfig lottieConfig = c26657h.f126162g;
                            if (lottieConfig != null) {
                                C25979a.m133815f(baseZaloView, str, str2, lottieConfig);
                            }
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("extra_asset_path", str2);
                            bundle.putString("extra_metadata_name", "metadata");
                            bundle.putInt("extra_effect_type", c26657h.f126157b);
                            C26663n c26663n = C26663n.this;
                            bundle.putString("extra_play_params", Cocos2dxView.m78847jM(c26663n.f126184e, c26663n.f126185f, c26663n.f126186g));
                            bundle.putBoolean("extra_keyboard_showing", false);
                            if (Math.abs(AbstractC23309i.m122378s1() - System.currentTimeMillis()) > 86400000 && Math.abs(AbstractC23309i.m121186M5() - System.currentTimeMillis()) > 86400000) {
                                AbstractC23309i.m120756Aj(System.currentTimeMillis());
                                baseZaloView.m92676n2().mo35579p().m93069k2(Cocos2dxLoadingView.class, bundle, 0, true);
                            } else {
                                Intent intent = new Intent(baseZaloView.m92648SI(), (Class<?>) Cocos2dxAnimationActivity.class);
                                intent.putExtras(bundle);
                                baseZaloView.m92641HK(intent);
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C26664o.m136836a().m136842g(C26663n.this);
            } catch (Throwable th2) {
                C26664o.m136836a().m136842g(C26663n.this);
                throw th2;
            }
        }

        @Override // tg.C26674y.b
        /* renamed from: a */
        public void mo15759a(final int i11, final String str, final String str2, final C26657h c26657h) {
            try {
                AbstractC19444a.m101695c(new Runnable() { // from class: tg.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C26663n.a.this.m136835e(str, i11, str2, c26657h);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        private a() {
        }
    }

    public C26663n(BaseZaloView baseZaloView, int i11) {
        this.f126183d = 0;
        this.f126180a = new C2370r0(baseZaloView);
        this.f126183d = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m136825f(boolean z11, String str, a aVar, byte b11) {
        long j11;
        if (z11) {
            j11 = 0;
        } else {
            j11 = 300;
        }
        try {
            Thread.sleep(j11);
            if (TextUtils.equals(str, this.f126181b)) {
                C26664o.m136836a().m136840e(this);
                C26674y.m136865t().m136877n(this.f126181b, System.currentTimeMillis() + "", aVar, b11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("EffectPlayer", e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m136826g(boolean z11, String str, C26674y.b bVar) {
        long j11;
        if (z11) {
            j11 = 0;
        } else {
            j11 = 300;
        }
        try {
            Thread.sleep(j11);
            if (TextUtils.equals(str, this.f126181b)) {
                C26664o.m136836a().m136840e(this);
                C26674y.m136865t().m136877n(this.f126181b, System.currentTimeMillis() + "", bVar, (byte) 1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("EffectPlayer", e11.getMessage());
        }
    }

    /* renamed from: c */
    public void m136827c(final String str, final C26674y.b bVar, final boolean z11) {
        try {
            if (AbstractC23309i.m122610yb() && !TextUtils.isEmpty(str)) {
                this.f126181b = str;
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tg.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C26663n.this.m136826g(z11, str, bVar);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m136828d(final String str, final boolean z11, final byte b11) {
        try {
            if (AbstractC23309i.m122610yb() && !TextUtils.isEmpty(str)) {
                this.f126181b = str;
                final a aVar = new a();
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tg.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C26663n.this.m136825f(z11, str, aVar, b11);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public boolean m136829e() {
        return this.f126183d == 0;
    }

    /* renamed from: h */
    public void m136830h(boolean z11) {
        this.f126182c = z11;
    }

    /* renamed from: i */
    public void m136831i(float f11, int i11, float f12) {
        this.f126184e = f11;
        this.f126185f = i11;
        this.f126186g = f12;
    }
}
