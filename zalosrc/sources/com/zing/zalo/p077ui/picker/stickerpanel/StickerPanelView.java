package com.zing.zalo.p077ui.picker.stickerpanel;

import aa0.AbstractC0671b;
import am.AbstractC0924m0;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b40.C2520a;
import b40.C2526d;
import c30.C3245i;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7110j8;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.adapters.C7252w7;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.AbstractC12964n;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12951a;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12967q;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.SeasonalStickerPanelPage;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.StickersPanelPage;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.StickerIndicatorView;
import com.zing.zalo.p077ui.widget.recyclerview.SlidingTabRecyclerView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.StickerManageView;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicomponents.reddot.RedDotImageView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.SimpleMenuListPopupView;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19044c;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gi.EnumC19449b;
import hm0.C20096c;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.C23212s8;
import p038bl.C2834f;
import p134el.C18464c;
import p134el.C18465d;
import p134el.C18466e;
import p134el.C18467f;
import p134el.C18468g;
import p134el.C18469h;
import p134el.C18470i;
import p134el.C18471j;
import p134el.C18472k;
import p134el.C18473l;
import p134el.C18474m;
import p134el.C18475n;
import p134el.C18476o;
import p134el.C18477p;
import p134el.C18478q;
import p134el.C18479r;
import p134el.C18480s;
import p134el.InterfaceC18462a;
import p134el.InterfaceC18463b;
import p205hc.C19965d;
import p227i3.AbstractC20216t;
import p227i3.C20218v;
import p268ji.C21270p;
import p268ji.C21272r;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p471r3.C25630b;
import p542ub.InterfaceC27218a;
import p588vw.C28644j;
import p649xl.C30002qc;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import rc0.InterfaceC25728a;
import vg.AbstractC28025b8;
import vg.C28212v6;
import w90.C28830a0;
import y90.EnumC30857a;
import y90.EnumC30861e;
import z90.AbstractC31727b;

/* loaded from: classes6.dex */
public final class StickerPanelView extends CommonZaloview implements C23744a.c {
    public static final C12878a Companion = new C12878a(null);

    /* renamed from: Z0 */
    private static final int f66888Z0 = AbstractC23136l9.m118736p(AbstractC16802y.sticker_panel_indicator_height);

    /* renamed from: a1 */
    private static final int f66889a1 = AbstractC6918a0.sticker_indicator_visibility;

    /* renamed from: L0 */
    private final InterfaceC24854k f66890L0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C28830a0.class), new C12905n0(new C12903m0(this)), new C12911q0());

    /* renamed from: M0 */
    private C30002qc f66891M0;

    /* renamed from: N0 */
    private final InterfaceC24854k f66892N0;

    /* renamed from: O0 */
    private final InterfaceC24854k f66893O0;

    /* renamed from: P0 */
    private final InterfaceC24854k f66894P0;

    /* renamed from: Q0 */
    private AbstractC31727b f66895Q0;

    /* renamed from: R0 */
    private final C12951a f66896R0;

    /* renamed from: S0 */
    private C28212v6 f66897S0;

    /* renamed from: T0 */
    private C13306b f66898T0;

    /* renamed from: U0 */
    private final InterfaceC24854k f66899U0;

    /* renamed from: V0 */
    private ViewPager2.AbstractC2075i f66900V0;

    /* renamed from: W0 */
    private SimpleMenuListPopupView f66901W0;

    /* renamed from: X0 */
    private boolean f66902X0;

    /* renamed from: Y0 */
    private final StickerView.InterfaceC10959a f66903Y0;

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$a */
    /* loaded from: classes6.dex */
    public static final class C12878a {
        private C12878a() {
        }

        public /* synthetic */ C12878a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m72711a() {
            return StickerPanelView.f66888Z0;
        }

        /* renamed from: b */
        public final Bundle m72712b(EnumC30861e enumC30861e, int i11, boolean z11, boolean z12, StickerIndicatorView.C13538e c13538e, C7110j8.d dVar, boolean z13, int i12, String str, boolean z14, int i13, int i14, boolean z15, int i15, boolean z16, boolean z17) {
            AbstractC19074t.m100208f(enumC30861e, "stickerPanelType");
            AbstractC19074t.m100208f(str, "autoPlayPrefix");
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_PANEL_TYPE", enumC30861e);
            bundle.putInt("EXTRA_SYSTEM_EMOJI_COLUMN_COUNT", i11);
            bundle.putBoolean("EXTRA_ENABLE_SETTING_ICON", z11);
            bundle.putBoolean("EXTRA_ENABLE_SEARCH_GIF_ICON", z17);
            bundle.putBoolean("EXTRA_ENABLE_AUTO_PLAY_LOOP_ANIM", z12);
            if (c13538e != null) {
                bundle.putSerializable("EXTRA_INDICATOR_CUSTOM_STYLE", c13538e);
            }
            if (dVar != null) {
                bundle.putSerializable("EXTRA_PAGER_CUSTOM_STYLE", dVar);
            }
            bundle.putBoolean("EXTRA_STICKER_ONLY_IN_RECENT_TAB", z13);
            bundle.putInt("EXTRA_SOURCE_FRAGMENT", i12);
            bundle.putString("EXTRA_AUTO_PLAY_PREFIX", str);
            bundle.putBoolean("EXTRA_ENABLE_INDICATOR", z14);
            bundle.putInt("EXTRA_NORMAL_PANEL_COMPONENTS", i13);
            bundle.putInt("EXTRA_INDICATOR_BACKGROUND_COLOR_RES", i14);
            bundle.putBoolean("EXTRA_ENABLE_GO_TO_STORE_BTN", z15);
            bundle.putInt("EXTRA_STICKER_PANEL_HEIGHT", i15);
            bundle.putBoolean("EXTRA_ENABLE_FORCE_JUMP_SEASONAL_TAB", z16);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$a0 */
    /* loaded from: classes6.dex */
    public static final class C12879a0 extends AbstractC19075u implements InterfaceC18505l {
        C12879a0() {
            super(1);
        }

        /* renamed from: a */
        public final void m72713a(boolean z11) {
            int i11;
            C30002qc c30002qc = StickerPanelView.this.f66891M0;
            if (c30002qc == null) {
                AbstractC19074t.m100223u("binding");
                c30002qc = null;
            }
            FrameLayout frameLayout = c30002qc.f139139r;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            frameLayout.setVisibility(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72713a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12880b {
        /* renamed from: a */
        void mo36267a(C20096c c20096c);

        /* renamed from: b */
        void mo36268b();

        /* renamed from: c */
        void mo36269c();
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$b0 */
    /* loaded from: classes6.dex */
    public static final class C12881b0 implements InterfaceC1764d0 {
        C12881b0() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C18474m c18474m) {
            AbstractC19074t.m100208f(c18474m, "dataParam");
            StickerPanelView.this.m72647hN().m144263v0(c18474m);
            KeyEvent.Callback m72787e0 = StickerPanelView.this.m72630ZM().m72787e0(StickerPanelView.this.m72630ZM().m72785c0());
            if (m72787e0 != null) {
                ((InterfaceC12966p) m72787e0).mo72819g();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC12882c {
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$c0 */
    /* loaded from: classes6.dex */
    public static final class C12883c0 implements InterfaceC1764d0 {
        C12883c0() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(InterfaceC18462a interfaceC18462a) {
            AbstractC31727b m72704fN;
            AbstractC31727b m72704fN2;
            AbstractC31727b m72704fN3;
            AbstractC19074t.m100208f(interfaceC18462a, "dataParam");
            if (interfaceC18462a instanceof C18475n) {
                C18475n c18475n = (C18475n) interfaceC18462a;
                C25630b m72622TM = StickerPanelView.this.m72622TM(c18475n.m97818b());
                if (m72622TM != null && (m72704fN3 = StickerPanelView.this.m72704fN()) != null) {
                    m72704fN3.mo38307o(m72622TM, c18475n.m97817a(), c18475n.m97818b().getRowIndex(), c18475n.m97818b().getIndicatorIndex());
                    return;
                }
                return;
            }
            if (interfaceC18462a instanceof C18476o) {
                C18476o c18476o = (C18476o) interfaceC18462a;
                C25630b m72622TM2 = StickerPanelView.this.m72622TM(c18476o.m97819a());
                if (m72622TM2 != null) {
                    StickerPanelView stickerPanelView = StickerPanelView.this;
                    if ((!stickerPanelView.m72647hN().m144184A0() || m72622TM2.m132398F() || m72622TM2.m132399G()) && (m72704fN2 = stickerPanelView.m72704fN()) != null) {
                        m72704fN2.mo46564p(m72622TM2, c18476o.m97820b(), c18476o.m97819a().getRowIndex(), c18476o.m97819a().getIndicatorIndex());
                        return;
                    }
                    return;
                }
                return;
            }
            if (interfaceC18462a instanceof C18477p) {
                AbstractC31727b m72704fN4 = StickerPanelView.this.m72704fN();
                if (m72704fN4 != null) {
                    m72704fN4.mo46563c(((C18477p) interfaceC18462a).m97821a());
                    return;
                }
                return;
            }
            if (interfaceC18462a instanceof C18468g) {
                AbstractC31727b m72704fN5 = StickerPanelView.this.m72704fN();
                if (m72704fN5 != null) {
                    m72704fN5.mo71325h(((C18468g) interfaceC18462a).m97802a());
                    return;
                }
                return;
            }
            if (interfaceC18462a instanceof C18469h) {
                AbstractC31727b m72704fN6 = StickerPanelView.this.m72704fN();
                if (m72704fN6 != null) {
                    C18469h c18469h = (C18469h) interfaceC18462a;
                    m72704fN6.mo71326i(c18469h.m97804b(), c18469h.m97803a());
                    return;
                }
                return;
            }
            if (interfaceC18462a instanceof C18471j) {
                AbstractC31727b m72704fN7 = StickerPanelView.this.m72704fN();
                if (m72704fN7 != null) {
                    C18471j c18471j = (C18471j) interfaceC18462a;
                    m72704fN7.mo71327k(c18471j.m97808b(), c18471j.m97807a());
                    return;
                }
                return;
            }
            if (interfaceC18462a instanceof C18472k) {
                AbstractC31727b m72704fN8 = StickerPanelView.this.m72704fN();
                if (m72704fN8 != null) {
                    C18472k c18472k = (C18472k) interfaceC18462a;
                    m72704fN8.mo71328l(c18472k.m97810b(), c18472k.m97809a());
                    return;
                }
                return;
            }
            if (interfaceC18462a instanceof C18480s) {
                C18480s c18480s = (C18480s) interfaceC18462a;
                C25630b m72622TM3 = StickerPanelView.this.m72622TM(c18480s.m97832b());
                if (m72622TM3 != null) {
                    m72622TM3.m132404N(c18480s.m97831a());
                    AbstractC31727b m72704fN9 = StickerPanelView.this.m72704fN();
                    if (m72704fN9 != null) {
                        m72704fN9.mo71333t(m72622TM3, c18480s.m97832b().getRowIndex(), c18480s.m97832b().getIndicatorIndex(), c18480s.m97833c(), c18480s.m97834d());
                        return;
                    }
                    return;
                }
                return;
            }
            if (interfaceC18462a instanceof C18478q) {
                AbstractC31727b m72704fN10 = StickerPanelView.this.m72704fN();
                if (m72704fN10 != null) {
                    C18478q c18478q = (C18478q) interfaceC18462a;
                    m72704fN10.mo71331r(c18478q.m97825d(), c18478q.m97824c(), c18478q.m97823b(), c18478q.m97822a(), c18478q.m97826e());
                    return;
                }
                return;
            }
            if ((interfaceC18462a instanceof C18479r) && (m72704fN = StickerPanelView.this.m72704fN()) != null) {
                C18479r c18479r = (C18479r) interfaceC18462a;
                m72704fN.mo71332s(c18479r.m97829c(), c18479r.m97828b(), c18479r.m97827a().getRowIndex(), c18479r.m97827a().getIndicatorIndex(), c18479r.m97830d());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$d */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12884d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66907a;

        static {
            int[] iArr = new int[EnumC30861e.values().length];
            try {
                iArr[EnumC30861e.f142417p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC30861e.f142418q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC30861e.f142419r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66907a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$d0 */
    /* loaded from: classes6.dex */
    public static final class C12885d0 implements InterfaceC1764d0 {
        C12885d0() {
        }

        /* renamed from: a */
        public void m72716a(int i11) {
            View m72787e0 = StickerPanelView.this.m72630ZM().m72787e0(StickerPanelView.this.m72630ZM().m72785c0());
            if (m72787e0 != null) {
                ((StickersPanelPage) m72787e0).m72842f2(i11);
            }
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public /* bridge */ /* synthetic */ void mo8524qp(Object obj) {
            m72716a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$e */
    /* loaded from: classes6.dex */
    static final class C12886e extends AbstractC19075u implements InterfaceC18494a {
        C12886e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7252w7 mo12V4() {
            return new C7252w7(StickerPanelView.this.m72647hN().m144208U0());
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$e0 */
    /* loaded from: classes6.dex */
    public static final class C12887e0 implements InterfaceC1764d0 {
        C12887e0() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C18474m c18474m) {
            AbstractC19074t.m100208f(c18474m, "dataParam");
            C2834f.f11325a.m13689k();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$f */
    /* loaded from: classes6.dex */
    public static final class C12888f implements C7252w7.c {
        C12888f() {
        }

        @Override // com.zing.zalo.adapters.C7252w7.c
        /* renamed from: a */
        public void mo36987a() {
            StickerPanelView.this.m72650iN();
        }

        @Override // com.zing.zalo.adapters.C7252w7.c
        /* renamed from: b */
        public void mo36988b(View view, int i11) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
        }

        @Override // com.zing.zalo.adapters.C7252w7.c
        /* renamed from: c */
        public void mo36989c() {
            StickerPanelView.this.m72631ZN("9195", null);
        }

        @Override // com.zing.zalo.adapters.C7252w7.c
        /* renamed from: d */
        public void mo36990d(StickerIndicatorView stickerIndicatorView, int i11) {
            boolean m72610NM;
            AbstractC19074t.m100208f(stickerIndicatorView, "view");
            if (StickerPanelView.this.m72647hN().m144258t1() != 250) {
                return;
            }
            if (i11 == StickerPanelView.this.m72647hN().m144189G0()) {
                m72610NM = StickerPanelView.this.m72620SM("tip.csc.sticker.emoticon");
            } else {
                m72610NM = i11 == StickerPanelView.this.m72647hN().m144191I0() ? StickerPanelView.this.m72610NM() : false;
            }
            stickerIndicatorView.setEnableNoti(m72610NM);
        }

        @Override // com.zing.zalo.adapters.C7252w7.c
        /* renamed from: e */
        public void mo36991e(View view, int i11) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            C2520a.f10235a.m12629k("ai_sticker_panel");
            StickerPanelView.m72636cO(StickerPanelView.this, i11, false, true, false, 10, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$f0 */
    /* loaded from: classes6.dex */
    public static final class C12889f0 implements InterfaceC1764d0 {
        C12889f0() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C18474m c18474m) {
            AbstractC19074t.m100208f(c18474m, "dataParam");
            KeyEvent.Callback m72787e0 = StickerPanelView.this.m72630ZM().m72787e0(StickerPanelView.this.m72630ZM().m72785c0());
            if (m72787e0 != null) {
                ((InterfaceC12966p) m72787e0).mo72819g();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$g */
    /* loaded from: classes6.dex */
    public static final class C12890g extends RecyclerView.AbstractC1892s {
        C12890g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 1) {
                C21272r.a aVar = C21272r.Companion;
                if (((C21272r) aVar.m122672a()).m110178g()) {
                    ((C21272r) aVar.m122672a()).m110175d().m122673a().put(2);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$g0 */
    /* loaded from: classes6.dex */
    public static final class C12891g0 implements InterfaceC1764d0 {
        C12891g0() {
        }

        /* renamed from: a */
        public void m72720a(int i11) {
            if (StickerPanelView.this.m72702YM() != null) {
                StickerPanelView stickerPanelView = StickerPanelView.this;
                int m72785c0 = stickerPanelView.m72630ZM().m72785c0();
                int m144257t0 = stickerPanelView.m72647hN().m144257t0(i11, m72785c0);
                C2520a.f10235a.m12629k("csc_sticker_panel");
                stickerPanelView.m72698zO(m144257t0);
                InterfaceC12965o m72776T = stickerPanelView.m72630ZM().m72776T(m72785c0);
                if (m72776T != null) {
                    stickerPanelView.m72647hN().m144268w2(m72776T, m72785c0, m144257t0);
                }
            }
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public /* bridge */ /* synthetic */ void mo8524qp(Object obj) {
            m72720a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$h */
    /* loaded from: classes6.dex */
    public static final class C12892h extends ViewPager2.AbstractC2075i {

        /* renamed from: a */
        private int f66913a;

        /* renamed from: b */
        private int f66914b;

        /* renamed from: c */
        private InterfaceC12965o f66915c;

        /* renamed from: d */
        private boolean f66916d;

        /* renamed from: e */
        private boolean f66917e;

        /* renamed from: f */
        private int f66918f = -1;

        C12892h() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2075i
        /* renamed from: a */
        public void mo11254a(int i11) {
            if (StickerPanelView.this.mo60294yp()) {
                return;
            }
            boolean z11 = true;
            if (i11 != 0) {
                if (i11 == 1) {
                    StickerPanelView.this.m72647hN().m144201O1();
                    this.f66917e = true;
                    this.f66916d = false;
                }
            } else {
                StickerPanelView.this.m72647hN().m144188F1(this.f66915c, this.f66913a, this.f66918f, this.f66917e, this.f66916d);
                C12922b m72630ZM = StickerPanelView.this.m72630ZM();
                C30002qc c30002qc = StickerPanelView.this.f66891M0;
                if (c30002qc == null) {
                    AbstractC19074t.m100223u("binding");
                    c30002qc = null;
                }
                KeyEvent.Callback m72787e0 = m72630ZM.m72787e0(c30002qc.f139143v.getCurrentItem());
                if (m72787e0 != null) {
                    ((InterfaceC12966p) m72787e0).mo72819g();
                }
                this.f66917e = false;
                this.f66916d = false;
            }
            C12951a c12951a = StickerPanelView.this.f66896R0;
            if (i11 == 0) {
                z11 = false;
            }
            c12951a.m72855b(z11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2075i
        /* renamed from: b */
        public void mo11275b(int i11, float f11, int i12) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2075i
        /* renamed from: c */
        public void mo11255c(int i11) {
            boolean z11;
            if (StickerPanelView.this.mo60294yp()) {
                return;
            }
            int i12 = this.f66913a;
            this.f66914b = i12;
            if (i12 != i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f66916d = z11;
            this.f66913a = i11;
            InterfaceC12965o m72776T = StickerPanelView.this.m72630ZM().m72776T(i11);
            this.f66915c = m72776T;
            if (m72776T != null) {
                StickerPanelView stickerPanelView = StickerPanelView.this;
                this.f66918f = stickerPanelView.m72647hN().m144199N1(m72776T, this.f66913a);
                stickerPanelView.m72647hN().m144265v2(m72776T, this.f66913a, this.f66918f);
                stickerPanelView.m72698zO(this.f66918f);
                StickerPanelView.m72672qO(stickerPanelView, true, false, 2, null);
            }
            if (this.f66916d) {
                StickerPanelView.this.m72647hN().m144243l0();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$h0 */
    /* loaded from: classes6.dex */
    public static final class C12893h0 implements InterfaceC1764d0 {
        C12893h0() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "dataParam");
            StickerPanelView.this.m72689wO();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$i */
    /* loaded from: classes6.dex */
    public static final class C12894i implements InterfaceC1764d0 {
        C12894i() {
        }

        /* renamed from: a */
        public void m72722a(int i11) {
            C2834f.f11325a.m13689k();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public /* bridge */ /* synthetic */ void mo8524qp(Object obj) {
            m72722a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$i0 */
    /* loaded from: classes6.dex */
    public static final class C12895i0 extends AbstractC19075u implements InterfaceC18505l {
        C12895i0() {
            super(1);
        }

        /* renamed from: a */
        public final void m72723a(List list) {
            AbstractC19074t.m100208f(list, "it");
            StickerPanelView.this.m72604KM(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72723a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$j */
    /* loaded from: classes6.dex */
    public static final class C12896j implements InterfaceC1764d0 {
        C12896j() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(InterfaceC18463b interfaceC18463b) {
            AbstractC31727b m72704fN;
            AbstractC19074t.m100208f(interfaceC18463b, "dataParam");
            if (interfaceC18463b instanceof C18464c) {
                AbstractC31727b m72704fN2 = StickerPanelView.this.m72704fN();
                if (m72704fN2 != null) {
                    C18464c c18464c = (C18464c) interfaceC18463b;
                    m72704fN2.mo38306d(c18464c.m97795a(), c18464c.m97796b(), c18464c.m97797c());
                    return;
                }
                return;
            }
            if (interfaceC18463b instanceof C18466e) {
                AbstractC31727b m72704fN3 = StickerPanelView.this.m72704fN();
                if (m72704fN3 != null) {
                    C18466e c18466e = (C18466e) interfaceC18463b;
                    m72704fN3.mo71323f(c18466e.m97799a(), c18466e.m97800b(), c18466e.m97801c());
                    return;
                }
                return;
            }
            if (interfaceC18463b instanceof C18465d) {
                AbstractC31727b m72704fN4 = StickerPanelView.this.m72704fN();
                if (m72704fN4 != null) {
                    m72704fN4.mo39093e(((C18465d) interfaceC18463b).m97798a());
                    return;
                }
                return;
            }
            if ((interfaceC18463b instanceof C18467f) && (m72704fN = StickerPanelView.this.m72704fN()) != null) {
                m72704fN.mo71324g();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$j0 */
    /* loaded from: classes6.dex */
    static final class C12897j0 extends AbstractC19075u implements InterfaceC18494a {
        C12897j0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C12922b mo12V4() {
            return new C12922b(StickerPanelView.this.getContext(), new C23528a(StickerPanelView.this.getContext()), StickerPanelView.this.m72647hN().m144258t1(), StickerPanelView.this.m72647hN().m144215Y0(), StickerPanelView.this.f66896R0, StickerPanelView.this.m72647hN().m144184A0(), StickerPanelView.this.m72647hN().m144185E0(), StickerPanelView.this.m72647hN().m144251o1(), StickerPanelView.this.m72647hN().m144267w1(), StickerPanelView.this.m72647hN().m144202P0(), StickerPanelView.this.m72647hN().m144272z1(), StickerPanelView.this.m72705gN());
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$k */
    /* loaded from: classes6.dex */
    public static final class C12898k implements InterfaceC1764d0 {
        C12898k() {
        }

        /* renamed from: a */
        public void m72726a(int i11) {
            StickerPanelView.m72636cO(StickerPanelView.this, i11, true, false, false, 12, null);
            StickerPanelView.m72672qO(StickerPanelView.this, true, false, 2, null);
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public /* bridge */ /* synthetic */ void mo8524qp(Object obj) {
            m72726a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$k0 */
    /* loaded from: classes6.dex */
    public static final class C12899k0 implements C7145n.a {

        /* renamed from: b */
        final /* synthetic */ C17487o0 f66926b;

        /* renamed from: c */
        final /* synthetic */ C3245i f66927c;

        /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$k0$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f66928a;

            static {
                int[] iArr = new int[EnumC30857a.values().length];
                try {
                    iArr[EnumC30857a.f142386q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC30857a.f142387r.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC30857a.f142388s.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f66928a = iArr;
            }
        }

        C12899k0(C17487o0 c17487o0, C3245i c3245i) {
            this.f66926b = c17487o0;
            this.f66927c = c3245i;
        }

        @Override // com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            C17487o0 c17487o0;
            EnumC30857a m150000a;
            StickerPanelView.this.m72707mN(this.f66926b);
            InterfaceC27218a m92676n2 = StickerPanelView.this.m92676n2();
            if (m92676n2 != null) {
                c17487o0 = m92676n2.mo35579p();
            } else {
                c17487o0 = null;
            }
            if (c17487o0 == null || (m150000a = EnumC30857a.Companion.m150000a(i11)) == null) {
                return;
            }
            int i12 = a.f66928a[m150000a.ordinal()];
            if (i12 == 1) {
                StickerPanelView.this.m72631ZN("9598", Integer.valueOf(this.f66927c.m16463e()));
                return;
            }
            if (i12 != 2) {
                if (i12 == 3) {
                    AbstractC23647d.m123897g("9601");
                    StickerPanelView.this.m72647hN().m144255r2(c17487o0, this.f66927c);
                    return;
                }
                return;
            }
            AbstractC23647d.m123897g("9599");
            StickerPanelView.this.removeDialog(0);
            StickerPanelView.this.m92639EK(0, Integer.valueOf(this.f66927c.m16463e()));
        }

        @Override // com.zing.zalo.adapters.C7145n.a
        /* renamed from: b */
        public void mo36358b(int i11, boolean z11) {
        }

        @Override // com.zing.zalo.adapters.C7145n.a
        /* renamed from: c */
        public void mo36359c(int i11) {
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$l */
    /* loaded from: classes6.dex */
    public static final class C12900l implements InterfaceC1764d0 {
        C12900l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m72728c(StickerPanelView stickerPanelView) {
            AbstractC19074t.m100208f(stickerPanelView, "this$0");
            if (stickerPanelView.mo60294yp()) {
                return;
            }
            stickerPanelView.m72630ZM().m10008p();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "value");
            C30002qc c30002qc = StickerPanelView.this.f66891M0;
            if (c30002qc == null) {
                AbstractC19074t.m100223u("binding");
                c30002qc = null;
            }
            ViewPager2 viewPager2 = c30002qc.f139143v;
            final StickerPanelView stickerPanelView = StickerPanelView.this;
            viewPager2.post(new Runnable() { // from class: w90.w
                @Override // java.lang.Runnable
                public final void run() {
                    StickerPanelView.C12900l.m72728c(StickerPanelView.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$l0 */
    /* loaded from: classes6.dex */
    static final class C12901l0 extends AbstractC19075u implements InterfaceC18494a {
        C12901l0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NoPredictiveItemAnimLinearLayoutMngr mo12V4() {
            return new NoPredictiveItemAnimLinearLayoutMngr(StickerPanelView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$m */
    /* loaded from: classes6.dex */
    public static final class C12902m implements InterfaceC1764d0 {
        C12902m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m72732c(StickerPanelView stickerPanelView) {
            AbstractC19074t.m100208f(stickerPanelView, "this$0");
            if (stickerPanelView.mo60294yp()) {
                return;
            }
            stickerPanelView.m72630ZM().m10008p();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "dataParam");
            C30002qc c30002qc = StickerPanelView.this.f66891M0;
            if (c30002qc == null) {
                AbstractC19074t.m100223u("binding");
                c30002qc = null;
            }
            ViewPager2 viewPager2 = c30002qc.f139143v;
            final StickerPanelView stickerPanelView = StickerPanelView.this;
            viewPager2.post(new Runnable() { // from class: w90.x
                @Override // java.lang.Runnable
                public final void run() {
                    StickerPanelView.C12902m.m72732c(StickerPanelView.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$m0 */
    /* loaded from: classes6.dex */
    public static final class C12903m0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f66932q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12903m0(ZaloView zaloView) {
            super(0);
            this.f66932q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f66932q;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$n */
    /* loaded from: classes6.dex */
    public static final class C12904n implements InterfaceC1764d0 {
        C12904n() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "dataParam");
            StickerPanelView.this.m72706gO();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$n0 */
    /* loaded from: classes6.dex */
    public static final class C12905n0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f66934q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12905n0(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f66934q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f66934q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$o */
    /* loaded from: classes6.dex */
    public static final class C12906o extends AbstractC19075u implements InterfaceC18505l {
        C12906o() {
            super(1);
        }

        /* renamed from: a */
        public final void m72737a(C24848g0 c24848g0) {
            AbstractC23152n3.m119030Z(StickerPanelView.this.m92676n2(), StickerPanelView.this);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72737a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$o0 */
    /* loaded from: classes6.dex */
    static final class C12907o0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12907o0 f66936q = new C12907o0();

        C12907o0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccelerateDecelerateInterpolator mo12V4() {
            return new AccelerateDecelerateInterpolator();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$p */
    /* loaded from: classes6.dex */
    public static final class C12908p implements InterfaceC1764d0 {
        C12908p() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C18473l c18473l) {
            AbstractC19074t.m100208f(c18473l, "dataParam");
            StickerPanelView stickerPanelView = StickerPanelView.this;
            C17487o0 m92649TI = stickerPanelView.m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            stickerPanelView.m72675rO(m92649TI, new Rect(c18473l.m97813c(), c18473l.m97815e(), c18473l.m97814d(), c18473l.m97811a()), c18473l.m97812b());
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$p0 */
    /* loaded from: classes6.dex */
    public static final class C12909p0 implements StickerView.InterfaceC10959a {
        C12909p0() {
        }

        @Override // com.zing.zalo.p077ui.StickerView.InterfaceC10959a
        /* renamed from: a */
        public boolean mo35967a() {
            AbstractC31727b m72704fN;
            if (!StickerPanelView.this.f66896R0.get().booleanValue() && ((m72704fN = StickerPanelView.this.m72704fN()) == null || !m72704fN.mo71321a())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$q */
    /* loaded from: classes6.dex */
    public static final class C12910q implements InterfaceC1764d0 {
        C12910q() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C18470i c18470i) {
            AbstractC19074t.m100208f(c18470i, "dataParam");
            AbstractC31727b m72704fN = StickerPanelView.this.m72704fN();
            if (m72704fN != null) {
                m72704fN.mo38308q(c18470i.m97806b(), c18470i.m97805a());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$q0 */
    /* loaded from: classes6.dex */
    static final class C12911q0 extends AbstractC19075u implements InterfaceC18494a {
        C12911q0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return AbstractC0671b.m956b(StickerPanelView.this);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$r */
    /* loaded from: classes6.dex */
    public static final class C12912r implements InterfaceC1764d0 {
        C12912r() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C24860q c24860q) {
            AbstractC19074t.m100208f(c24860q, "dataParam");
            int m144186E1 = StickerPanelView.this.m72647hN().m144186E1(c24860q);
            if (m144186E1 == -1) {
                StickerPanelView.this.m72669pO(false, true);
            } else if (m144186E1 == 1) {
                StickerPanelView.this.m72669pO(true, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$s */
    /* loaded from: classes6.dex */
    public static final class C12913s implements InterfaceC1764d0 {
        C12913s() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, AbstractC20216t.f99969a);
            StickerPanelView.this.m72669pO(false, false);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$t */
    /* loaded from: classes6.dex */
    public static final class C12914t implements InterfaceC1764d0 {
        C12914t() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, AbstractC20216t.f99969a);
            StickerPanelView.this.m72669pO(true, false);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$u */
    /* loaded from: classes6.dex */
    public static final class C12915u implements InterfaceC1764d0 {
        C12915u() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(MotionEvent motionEvent) {
            boolean z11;
            AbstractC19074t.m100208f(motionEvent, "dataParam");
            boolean z12 = false;
            if (motionEvent.getAction() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                z12 = true;
            }
            StickerPanelView.this.m72647hN().m144211V1(z11, z12, motionEvent.getY());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$v */
    /* loaded from: classes6.dex */
    public static final class C12916v extends AbstractC19075u implements InterfaceC18505l {
        C12916v() {
            super(1);
        }

        /* renamed from: a */
        public final void m72746a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
            StickerPanelView.this.m72685vN();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72746a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$w */
    /* loaded from: classes6.dex */
    public static final class C12917w implements InterfaceC1764d0 {
        C12917w() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, AbstractC20216t.f99969a);
            StickerPanelView.this.m72630ZM().m72788f0();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$x */
    /* loaded from: classes6.dex */
    public static final class C12918x implements InterfaceC1764d0 {
        C12918x() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C24848g0 c24848g0) {
            boolean z11;
            AbstractC19074t.m100208f(c24848g0, "dataParam");
            if (StickerPanelView.this.m72630ZM().m72783a0(-3) != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            StickerPanelView.this.m72647hN().m144271z0(z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$y */
    /* loaded from: classes6.dex */
    public static final class C12919y implements InterfaceC1764d0 {
        C12919y() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(C24848g0 c24848g0) {
            boolean z11;
            AbstractC19074t.m100208f(c24848g0, "dataParam");
            if (StickerPanelView.this.m72630ZM().m72784b0(-2) != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            StickerPanelView.this.m72647hN().m144271z0(z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.StickerPanelView$z */
    /* loaded from: classes6.dex */
    public static final class C12920z implements InterfaceC1764d0 {
        C12920z() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8524qp(String str) {
            AbstractC19074t.m100208f(str, "kwd");
            AbstractC31727b m72704fN = StickerPanelView.this.m72704fN();
            if (m72704fN != null) {
                m72704fN.mo71330n(str);
            }
        }
    }

    public StickerPanelView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        m129210a = AbstractC24856m.m129210a(new C12901l0());
        this.f66892N0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12897j0());
        this.f66893O0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C12886e());
        this.f66894P0 = m129210a3;
        this.f66896R0 = new C12951a(false);
        m129210a4 = AbstractC24856m.m129210a(C12907o0.f66936q);
        this.f66899U0 = m129210a4;
        this.f66903Y0 = new C12909p0();
    }

    /* renamed from: AN */
    private final void m72581AN() {
        m72647hN().m144236i1().m9219j(this, new C12902m());
    }

    /* renamed from: AO */
    private final void m72582AO(List list) {
        m72630ZM().m72789g0(list);
    }

    /* renamed from: BN */
    private final void m72584BN() {
        m72647hN().m144241k1().m9219j(this, new C12904n());
    }

    /* renamed from: BO */
    private final void m72585BO(Object[] objArr) {
        try {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            final String str = (String) obj;
            AbstractC19444a.m101695c(new Runnable() { // from class: w90.s
                @Override // java.lang.Runnable
                public final void run() {
                    StickerPanelView.m72588CO(StickerPanelView.this, str);
                }
            });
        } catch (Exception unused) {
            AbstractC20110a.f98889a.mo104551d("PARSE WRONG DATA TYPE FROM updateRedDotStickerPanel", new Object[0]);
        }
    }

    /* renamed from: CN */
    private final void m72587CN() {
        m72630ZM().m72774R().m9219j(this, new C12923c(new C12906o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CO */
    public static final void m72588CO(StickerPanelView stickerPanelView, String str) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        AbstractC19074t.m100208f(str, "$tipCat");
        if (stickerPanelView.mo60294yp()) {
            return;
        }
        stickerPanelView.m72591DO(new String[]{str});
    }

    /* renamed from: DN */
    private final void m72590DN() {
        m72630ZM().m72775S().m9219j(this, new C12908p());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: DO */
    private final void m72591DO(String[] strArr) {
        if (strArr != null) {
            Iterator m100149a = AbstractC19044c.m100149a(strArr);
            while (m100149a.hasNext()) {
                String str = (String) m100149a.next();
                int hashCode = str.hashCode();
                if (hashCode != -675379003) {
                    RecyclerView recyclerView = null;
                    C30002qc c30002qc = null;
                    boolean z11 = true;
                    int i11 = 0;
                    if (hashCode != -487737950) {
                        if (hashCode == 262238436 && str.equals("tip.csc.sticker.promotion") && m72647hN().m144258t1() == 250) {
                            C28212v6 m141453i = AbstractC28025b8.m141453i(str);
                            if (m141453i == null || !m141453i.m142167f() || !m141453i.f131580f) {
                                z11 = false;
                            }
                            C30002qc c30002qc2 = this.f66891M0;
                            if (c30002qc2 == null) {
                                AbstractC19074t.m100223u("binding");
                                c30002qc2 = null;
                            }
                            View childAt = c30002qc2.f139143v.getChildAt(0);
                            if (childAt instanceof RecyclerView) {
                                recyclerView = (RecyclerView) childAt;
                            }
                            if (recyclerView != null) {
                                while (i11 < recyclerView.getChildCount()) {
                                    int i12 = i11 + 1;
                                    View childAt2 = recyclerView.getChildAt(i11);
                                    if (childAt2 instanceof StickersPanelPage) {
                                        RedDotImageView m72841e2 = ((StickersPanelPage) childAt2).m72841e2();
                                        if (m72841e2 != null) {
                                            m72841e2.setEnableNoti(z11);
                                        }
                                    } else {
                                        View findViewById = recyclerView.findViewById(AbstractC6918a0.more);
                                        if (findViewById instanceof InterfaceC25728a) {
                                            ((InterfaceC25728a) findViewById).setEnableNoti(z11);
                                        }
                                    }
                                    i11 = i12;
                                }
                            }
                        }
                    } else if (str.equals("tip.csc.sticker.store")) {
                        if (System.currentTimeMillis() >= AbstractC23309i.m121600Xc() && (m72647hN().m144258t1() != 250 || !m72620SM(str))) {
                            z11 = false;
                        }
                        C30002qc c30002qc3 = this.f66891M0;
                        if (c30002qc3 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c30002qc = c30002qc3;
                        }
                        c30002qc.f139138q.setEnableNoti(z11);
                    }
                } else if (str.equals("tip.csc.sticker.gif") && m72647hN().m144258t1() == 250) {
                    View m72703bN = m72703bN();
                    if (m72703bN instanceof StickerIndicatorView) {
                        ((StickerIndicatorView) m72703bN).setEnableNoti(m72610NM());
                    }
                }
            }
        }
    }

    /* renamed from: EN */
    private final void m72593EN() {
        m72630ZM().m72777U().m9219j(this, new C12910q());
    }

    /* renamed from: FN */
    private final void m72595FN() {
        m72630ZM().m72778V().m9219j(this, new C12912r());
    }

    /* renamed from: GN */
    private final void m72597GN() {
        m72647hN().m144219a1().m9219j(this, new C12913s());
    }

    /* renamed from: HN */
    private final void m72599HN() {
        m72647hN().m144221b1().m9219j(this, new C12914t());
    }

    /* renamed from: IM */
    private final void m72600IM() {
        if (m72647hN().m144264v1() == EnumC30861e.f142418q) {
            C23744a.b bVar = C23744a.Companion;
            bVar.m124119a().m124115b(this, 8001);
            bVar.m124119a().m124115b(this, 39);
        } else {
            C23744a.Companion.m124119a().m124115b(this, 8000);
        }
        C23744a.b bVar2 = C23744a.Companion;
        bVar2.m124119a().m124115b(this, 8002);
        bVar2.m124119a().m124115b(this, 8003);
        bVar2.m124119a().m124115b(this, 8004);
        bVar2.m124119a().m124115b(this, 8005);
        bVar2.m124119a().m124115b(this, 8006);
        bVar2.m124119a().m124115b(this, 8007);
        bVar2.m124119a().m124115b(this, 8008);
    }

    /* renamed from: IN */
    private final void m72601IN() {
        m72630ZM().m72779W().m9219j(this, new C12915u());
    }

    /* renamed from: JM */
    private final void m72602JM(ZaloView zaloView, Rect rect) {
        InterfaceC27218a m92676n2 = zaloView.m92676n2();
        if (m92676n2 == null || !m92676n2.mo35586v2()) {
            rect.top -= AbstractC23136l9.m118737p0();
            rect.bottom -= AbstractC23136l9.m118737p0();
        }
    }

    /* renamed from: JN */
    private final void m72603JN() {
        m72647hN().m144228e1().m9219j(this, new C19965d(new C12916v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public final void m72604KM(final List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f66902X0 = true;
        C30002qc c30002qc = this.f66891M0;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        c30002qc.f139143v.post(new Runnable() { // from class: w90.u
            @Override // java.lang.Runnable
            public final void run() {
                StickerPanelView.m72606LM(StickerPanelView.this, list);
            }
        });
    }

    /* renamed from: KN */
    private final void m72605KN() {
        m72647hN().m144234h1().m9219j(this, new C12917w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m72606LM(StickerPanelView stickerPanelView, List list) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        AbstractC19074t.m100208f(list, "$pagerList");
        if (stickerPanelView.mo60294yp()) {
            return;
        }
        stickerPanelView.m72616QM(list);
        stickerPanelView.f66902X0 = false;
    }

    /* renamed from: LN */
    private final void m72607LN() {
        if (m72647hN().m144264v1() == EnumC30861e.f142419r) {
            return;
        }
        if (m72647hN().m144264v1() == EnumC30861e.f142418q) {
            m72647hN().m144232g1().m9219j(this, new C12918x());
        } else {
            m72647hN().m144239j1().m9219j(this, new C12919y());
        }
    }

    /* renamed from: MM */
    private final void m72608MM() {
        removeDialog(0);
        int i11 = C12884d.f66907a[m72647hN().m144264v1().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m72647hN().m144227e0();
                    return;
                }
                return;
            }
            m72647hN().m144220b0();
            return;
        }
        m72647hN().m144223c0();
    }

    /* renamed from: MN */
    private final void m72609MN() {
        m72630ZM().m72781Y().m9219j(this, new C12920z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public final boolean m72610NM() {
        C13306b c13306b;
        C28212v6 m141453i = AbstractC28025b8.m141453i("tip.csc.sticker.gif");
        if (m141453i != null && m141453i.m142167f() && m141453i.f131580f && m141453i.f131594t && (c13306b = this.f66898T0) != null && !c13306b.m74706o("tip.csc.sticker.gif")) {
            return true;
        }
        return false;
    }

    /* renamed from: NN */
    private final void m72611NN() {
        m72647hN().m144248n1().m9219j(this, new C19965d(new C12879a0()));
    }

    /* renamed from: OM */
    private final void m72612OM(final int i11) {
        C30002qc c30002qc = this.f66891M0;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        c30002qc.f139142u.post(new Runnable() { // from class: w90.h
            @Override // java.lang.Runnable
            public final void run() {
                StickerPanelView.m72614PM(StickerPanelView.this, i11);
            }
        });
    }

    /* renamed from: ON */
    private final void m72613ON() {
        m72630ZM().m72782Z().m9219j(this, new C12881b0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m72614PM(StickerPanelView stickerPanelView, int i11) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        if (stickerPanelView.mo60294yp()) {
            return;
        }
        stickerPanelView.m72651iO(i11);
    }

    /* renamed from: PN */
    private final void m72615PN() {
        m72630ZM().m72770N().m9219j(this, new C12883c0());
    }

    /* renamed from: QM */
    private final void m72616QM(List list) {
        List m144210V0 = m72647hN().m144210V0(list);
        if (m144210V0.isEmpty()) {
            return;
        }
        m72582AO(list);
        final int m144205R1 = m72647hN().m144205R1(m144210V0);
        m72695yO(m144210V0, m144205R1);
        final int m144254r0 = m72647hN().m144254r0(m144205R1, m72630ZM());
        C30002qc c30002qc = this.f66891M0;
        C30002qc c30002qc2 = null;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        if (m144254r0 != c30002qc.f139143v.getCurrentItem()) {
            m72647hN().m144229e2(m144205R1);
            C30002qc c30002qc3 = this.f66891M0;
            if (c30002qc3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30002qc2 = c30002qc3;
            }
            c30002qc2.f139143v.m11247j(m144254r0, false);
        } else {
            m72612OM(m144205R1);
        }
        m72689wO();
        final InterfaceC12965o m72776T = m72630ZM().m72776T(m144254r0);
        if (m72776T != null) {
            m72647hN().m144259t2(m72776T, m144254r0, m144205R1);
        }
        if (m72776T instanceof C12967q) {
            AbstractC19444a.m101695c(new Runnable() { // from class: w90.i
                @Override // java.lang.Runnable
                public final void run() {
                    StickerPanelView.m72618RM(StickerPanelView.this, m72776T, m144205R1, m144254r0);
                }
            });
        }
    }

    /* renamed from: QN */
    private final void m72617QN() {
        m72647hN().m144244l1().m9219j(this, new C12885d0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m72618RM(StickerPanelView stickerPanelView, InterfaceC12965o interfaceC12965o, int i11, int i12) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        if (stickerPanelView.mo60294yp()) {
            return;
        }
        stickerPanelView.m72657kO((C12967q) interfaceC12965o, i11, i12, true);
    }

    /* renamed from: RN */
    private final void m72619RN() {
        m72647hN().m144196L0().m9219j(this, new C12887e0());
        m72647hN().m144194K0().m9219j(this, new C12889f0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public final boolean m72620SM(String str) {
        C28212v6 m72632aN = m72632aN();
        if (m72632aN == null || !TextUtils.equals(m72632aN.f131577c, str)) {
            return false;
        }
        return m72632aN.f131580f;
    }

    /* renamed from: SN */
    private final void m72621SN() {
        m72630ZM().m72786d0().m9219j(this, new C12891g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public final C25630b m72622TM(StickerView stickerView) {
        String emoticon = stickerView.getEmoticon();
        if (emoticon.length() > 0) {
            C25630b m143290W = C28644j.m143233Y().m143290W(emoticon);
            int[] iArr = new int[2];
            stickerView.getLocationInWindow(iArr);
            m143290W.m132415Y(iArr[0] + (stickerView.getWidth() / 2), iArr[1] + (stickerView.getHeight() / 2));
            return m143290W;
        }
        return null;
    }

    /* renamed from: TN */
    private final void m72623TN() {
        m72647hN().m144270x1().m9219j(this, new C12893h0());
    }

    /* renamed from: UN */
    private final void m72624UN() {
        m72647hN().m144224c1().m9219j(this, new C19965d(new C12895i0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VN */
    public static final void m72625VN(StickerPanelView stickerPanelView) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        if (stickerPanelView.mo60294yp()) {
            return;
        }
        stickerPanelView.m72644fO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WN */
    public static final void m72626WN(StickerPanelView stickerPanelView, int i11, InterfaceC17463d interfaceC17463d, int i12) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        if (interfaceC17463d != null && interfaceC17463d.mo92862f() == 0 && i12 == -1) {
            AbstractC23647d.m123897g("9615");
            stickerPanelView.m72647hN().m144260u0(stickerPanelView.m72630ZM(), i11);
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: XM */
    private final C7252w7 m72627XM() {
        return (C7252w7) this.f66894P0.getValue();
    }

    /* renamed from: XN */
    private final void m72628XN() {
        if (m72647hN().m144258t1() == 250) {
            AbstractC28025b8.m141442M("tip.csc.sticker.store");
        }
        AbstractC23309i.m122374ry(System.currentTimeMillis());
        m72591DO(new String[]{"tip.csc.sticker.store"});
        m72633aO();
        C21270p.Companion.m110161b().m110152Z(((C21272r) C21272r.Companion.m122672a()).m110174c(), 9, "9_1", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YN */
    public static final void m72629YN(StickerPanelView stickerPanelView, boolean z11) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        if (stickerPanelView.mo60294yp()) {
            return;
        }
        stickerPanelView.m72647hN().m144250o0(z11, stickerPanelView.m72627XM().m36978M());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public final C12922b m72630ZM() {
        return (C12922b) this.f66893O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZN */
    public final void m72631ZN(String str, Integer num) {
        AbstractC23647d.m123897g(str);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt(StickerManageView.f77867h1, num.intValue());
            bundle.putBoolean(StickerManageView.f77868i1, true);
        }
        bundle.putInt(StickerManageView.f77869j1, 4);
        m92676n2.mo35579p().m93066i2(StickerManageView.class, bundle, 101, 1, true);
    }

    /* renamed from: aN */
    private final C28212v6 m72632aN() {
        if (this.f66897S0 == null && m72647hN().m144258t1() == 250) {
            this.f66897S0 = AbstractC28025b8.m141456l(AbstractC28025b8.f130846c);
        }
        return this.f66897S0;
    }

    /* renamed from: aO */
    private final void m72633aO() {
        AbstractC23647d.m123897g("9196");
        Bundle bundle = new Bundle();
        if (m72647hN().m144230f1() == 2) {
            bundle.putInt(StickerManageView.f77867h1, m72647hN().m144212W0());
        }
        bundle.putInt(StickerManageView.f77869j1, 4);
        AbstractC23152n3.m119076w0(m92676n2(), "", 100, bundle);
    }

    /* renamed from: bO */
    private final void m72634bO(final int i11, boolean z11, boolean z12, boolean z13) {
        KeyEvent.Callback m72787e0;
        try {
            final int m144254r0 = m72647hN().m144254r0(i11, m72630ZM());
            if (m144254r0 == m72630ZM().m72773Q() && z12) {
                m72656kN("tip.csc.sticker.emoticon");
            }
            final InterfaceC12965o m72776T = m72630ZM().m72776T(m144254r0);
            if (i11 == m72627XM().m36980O()) {
                if (z11 && (m72787e0 = m72630ZM().m72787e0(m144254r0)) != null) {
                    ((InterfaceC12966p) m72787e0).mo72819g();
                }
                m72698zO(i11);
                if (m72776T instanceof C12967q) {
                    AbstractC19444a.m101695c(new Runnable() { // from class: w90.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            StickerPanelView.m72639dO(StickerPanelView.this, m72776T, i11, m144254r0);
                        }
                    });
                }
            } else {
                C30002qc c30002qc = this.f66891M0;
                C30002qc c30002qc2 = null;
                if (c30002qc == null) {
                    AbstractC19074t.m100223u("binding");
                    c30002qc = null;
                }
                if (m144254r0 != c30002qc.f139143v.getCurrentItem()) {
                    m72647hN().m144229e2(i11);
                    C30002qc c30002qc3 = this.f66891M0;
                    if (c30002qc3 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c30002qc2 = c30002qc3;
                    }
                    c30002qc2.f139143v.m11247j(m144254r0, m72647hN().m144246m1());
                } else if (m72776T instanceof C12967q) {
                    m72698zO(i11);
                    m72647hN().m144262u2((C12967q) m72776T, m144254r0, i11);
                }
                if (m72776T instanceof C12967q) {
                    AbstractC19444a.m101695c(new Runnable() { // from class: w90.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            StickerPanelView.m72642eO(StickerPanelView.this, m72776T, i11, m144254r0);
                        }
                    });
                }
            }
            if (z13 && (m72630ZM().m72787e0(m144254r0) instanceof SeasonalStickerPanelPage)) {
                C2526d.f10270a.m12724p0("csc_sticker_panel", EnumC19449b.f96548w.m101746d(), true);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("CommonZaloview").mo104552e(e11);
        }
    }

    /* renamed from: cN */
    private final LinearLayoutManager m72635cN() {
        return (LinearLayoutManager) this.f66892N0.getValue();
    }

    /* renamed from: cO */
    static /* synthetic */ void m72636cO(StickerPanelView stickerPanelView, int i11, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        if ((i12 & 8) != 0) {
            z13 = true;
        }
        stickerPanelView.m72634bO(i11, z11, z12, z13);
    }

    /* renamed from: dN */
    public static final Bundle m72638dN(EnumC30861e enumC30861e, int i11, boolean z11, boolean z12, StickerIndicatorView.C13538e c13538e, C7110j8.d dVar, boolean z13, int i12, String str, boolean z14, int i13, int i14, boolean z15, int i15, boolean z16, boolean z17) {
        return Companion.m72712b(enumC30861e, i11, z11, z12, c13538e, dVar, z13, i12, str, z14, i13, i14, z15, i15, z16, z17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dO */
    public static final void m72639dO(StickerPanelView stickerPanelView, InterfaceC12965o interfaceC12965o, int i11, int i12) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        if (stickerPanelView.mo60294yp()) {
            return;
        }
        m72660lO(stickerPanelView, (C12967q) interfaceC12965o, i11, i12, false, 8, null);
    }

    /* renamed from: eN */
    private final TimeInterpolator m72641eN() {
        return (TimeInterpolator) this.f66899U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eO */
    public static final void m72642eO(StickerPanelView stickerPanelView, InterfaceC12965o interfaceC12965o, int i11, int i12) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        if (stickerPanelView.mo60294yp()) {
            return;
        }
        m72660lO(stickerPanelView, (C12967q) interfaceC12965o, i11, i12, false, 8, null);
    }

    /* renamed from: fO */
    private final void m72644fO() {
        C12922b m72630ZM = m72630ZM();
        C30002qc c30002qc = this.f66891M0;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        KeyEvent.Callback m72787e0 = m72630ZM.m72787e0(c30002qc.f139143v.getCurrentItem());
        if (m72787e0 != null) {
            ((InterfaceC12966p) m72787e0).mo72819g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public final C28830a0 m72647hN() {
        return (C28830a0) this.f66890L0.getValue();
    }

    /* renamed from: hO */
    private final void m72648hO() {
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 8000);
        bVar.m124119a().m124117e(this, 8001);
        bVar.m124119a().m124117e(this, 39);
        bVar.m124119a().m124117e(this, 8002);
        bVar.m124119a().m124117e(this, 8003);
        bVar.m124119a().m124117e(this, 8004);
        bVar.m124119a().m124117e(this, 8005);
        bVar.m124119a().m124117e(this, 8006);
        bVar.m124119a().m124117e(this, 8007);
        bVar.m124119a().m124117e(this, 8008);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public final void m72650iN() {
        AbstractC31727b abstractC31727b = this.f66895Q0;
        if (abstractC31727b != null) {
            abstractC31727b.mo71329m();
        }
        if (m72647hN().m144258t1() == 250) {
            AbstractC28025b8.m141442M("tip.csc.sticker.gif");
            m72591DO(new String[]{"tip.csc.sticker.gif"});
        }
    }

    /* renamed from: iO */
    private final void m72651iO(final int i11) {
        C30002qc c30002qc = this.f66891M0;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        final SlidingTabRecyclerView slidingTabRecyclerView = c30002qc.f139142u;
        slidingTabRecyclerView.m9866X1();
        AbstractC19074t.m100205c(slidingTabRecyclerView);
        if (!m72681tO(slidingTabRecyclerView, m72635cN(), i11)) {
            slidingTabRecyclerView.m9837K1(i11);
            slidingTabRecyclerView.post(new Runnable() { // from class: w90.l
                @Override // java.lang.Runnable
                public final void run() {
                    StickerPanelView.m72654jO(StickerPanelView.this, slidingTabRecyclerView, i11);
                }
            });
        }
    }

    /* renamed from: jN */
    private final void m72653jN() {
        AbstractC0924m0.m3108Hd(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jO */
    public static final void m72654jO(StickerPanelView stickerPanelView, SlidingTabRecyclerView slidingTabRecyclerView, int i11) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        AbstractC19074t.m100208f(slidingTabRecyclerView, "$this_with");
        if (stickerPanelView.mo60294yp()) {
            return;
        }
        stickerPanelView.m72681tO(slidingTabRecyclerView, stickerPanelView.m72635cN(), i11);
    }

    /* renamed from: kN */
    private final void m72656kN(final String str) {
        if (m72647hN().m144258t1() == 250) {
            C28212v6 c28212v6 = this.f66897S0;
            if (c28212v6 != null && TextUtils.equals(c28212v6.f131577c, str)) {
                c28212v6.f131580f = false;
            }
            AbstractC28025b8.m141442M(str);
            AbstractC19444a.m101694b(new Runnable() { // from class: w90.m
                @Override // java.lang.Runnable
                public final void run() {
                    StickerPanelView.m72659lN(StickerPanelView.this, str);
                }
            }, 500L);
        }
    }

    /* renamed from: kO */
    private final void m72657kO(C12967q c12967q, int i11, int i12, final boolean z11) {
        AbstractC12964n abstractC12964n;
        final View m72787e0;
        C3245i m72862c;
        InterfaceC12965o m36979N = m72627XM().m36979N(i11);
        final Integer num = null;
        if (m36979N instanceof AbstractC12964n) {
            abstractC12964n = (AbstractC12964n) m36979N;
        } else {
            abstractC12964n = null;
        }
        if (abstractC12964n != null && (m72862c = abstractC12964n.m72862c()) != null && m72862c.f13854b == -10) {
            m72653jN();
        }
        C3245i m72865e = c12967q.m72865e(m72647hN().m144256s0(i11, i12));
        if (m72865e != null) {
            num = Integer.valueOf(m72865e.m16463e());
        }
        if (num != null && (m72787e0 = m72630ZM().m72787e0(m72630ZM().m72785c0())) != null) {
            AbstractC19444a.m101695c(new Runnable() { // from class: w90.j
                @Override // java.lang.Runnable
                public final void run() {
                    StickerPanelView.m72662mO(StickerPanelView.this, z11, m72787e0, num);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public static final void m72659lN(StickerPanelView stickerPanelView, String str) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        AbstractC19074t.m100208f(str, "$tipCat");
        if (stickerPanelView.mo60294yp()) {
            return;
        }
        stickerPanelView.m72591DO(new String[]{str});
    }

    /* renamed from: lO */
    static /* synthetic */ void m72660lO(StickerPanelView stickerPanelView, C12967q c12967q, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        stickerPanelView.m72657kO(c12967q, i11, i12, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mO */
    public static final void m72662mO(StickerPanelView stickerPanelView, boolean z11, View view, Integer num) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        AbstractC19074t.m100208f(view, "$view");
        if (stickerPanelView.mo60294yp()) {
            return;
        }
        if (z11) {
            ((StickersPanelPage) view).m72842f2(num.intValue());
        } else {
            ((StickersPanelPage) view).m72843g2(num.intValue());
        }
    }

    /* renamed from: nN */
    private final void m72664nN() {
        C30002qc c30002qc = this.f66891M0;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        RedDotImageButton redDotImageButton = c30002qc.f139138q;
        if (m72647hN().m144200O0()) {
            redDotImageButton.setVisibility(0);
            redDotImageButton.setImageDrawable(AbstractC23136l9.m118665N(redDotImageButton.getContext(), AbstractC16803z.ic_sticker_store));
            int m118742r = AbstractC23136l9.m118742r(10.0f);
            redDotImageButton.setPadding(m118742r, m118742r, m118742r, m118742r);
            redDotImageButton.setOnClickListener(new View.OnClickListener() { // from class: w90.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StickerPanelView.m72666oN(StickerPanelView.this, view);
                }
            });
            return;
        }
        redDotImageButton.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public static final void m72666oN(StickerPanelView stickerPanelView, View view) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        stickerPanelView.m72628XN();
    }

    /* renamed from: pN */
    private final void m72668pN() {
        m72627XM().m36985e0(new C12888f());
        m72635cN().m9723C2(0);
        C30002qc c30002qc = this.f66891M0;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        SlidingTabRecyclerView slidingTabRecyclerView = c30002qc.f139142u;
        slidingTabRecyclerView.setLayoutManager(m72635cN());
        slidingTabRecyclerView.setOverScrollMode(2);
        slidingTabRecyclerView.m9826E(new C12890g());
        slidingTabRecyclerView.setBackground(C23212s8.m119609q(slidingTabRecyclerView.getContext(), m72647hN().m144207T0()));
        slidingTabRecyclerView.setAdapter(m72627XM());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pO */
    public final void m72669pO(boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        C30002qc c30002qc = this.f66891M0;
        C30002qc c30002qc2 = null;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        FrameLayout frameLayout = c30002qc.f139141t;
        if (!m72647hN().m144202P0()) {
            frameLayout.setVisibility(8);
            return;
        }
        if (m72647hN().m144264v1() != EnumC30861e.f142417p) {
            return;
        }
        frameLayout.setVisibility(0);
        C12922b m72630ZM = m72630ZM();
        C30002qc c30002qc3 = this.f66891M0;
        if (c30002qc3 == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc3 = null;
        }
        KeyEvent.Callback m72787e0 = m72630ZM.m72787e0(c30002qc3.f139143v.getCurrentItem());
        if ((m72787e0 instanceof InterfaceC12966p) && ((InterfaceC12966p) m72787e0).mo72820i()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z12 && z13) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z11) {
            C30002qc c30002qc4 = this.f66891M0;
            if (c30002qc4 == null) {
                AbstractC19074t.m100223u("binding");
                c30002qc4 = null;
            }
            FrameLayout frameLayout2 = c30002qc4.f139141t;
            int i11 = f66889a1;
            if (frameLayout2.getTag(i11) == null) {
                C30002qc c30002qc5 = this.f66891M0;
                if (c30002qc5 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30002qc5 = null;
                }
                c30002qc5.f139141t.setTag(i11, 1);
                C30002qc c30002qc6 = this.f66891M0;
                if (c30002qc6 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30002qc2 = c30002qc6;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c30002qc2.f139141t, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(m72641eN());
                ofFloat.start();
                return;
            }
        }
        if (!z11) {
            C30002qc c30002qc7 = this.f66891M0;
            if (c30002qc7 == null) {
                AbstractC19074t.m100223u("binding");
                c30002qc7 = null;
            }
            FrameLayout frameLayout3 = c30002qc7.f139141t;
            int i12 = f66889a1;
            if (frameLayout3.getTag(i12) != null && z14) {
                C30002qc c30002qc8 = this.f66891M0;
                if (c30002qc8 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30002qc8 = null;
                }
                c30002qc8.f139141t.setTag(i12, null);
                C30002qc c30002qc9 = this.f66891M0;
                if (c30002qc9 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30002qc2 = c30002qc9;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c30002qc2.f139141t, (Property<FrameLayout, Float>) View.TRANSLATION_Y, -f66888Z0);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(m72641eN());
                ofFloat2.start();
            }
        }
    }

    /* renamed from: qN */
    private final void m72671qN() {
        m72680tN();
    }

    /* renamed from: qO */
    static /* synthetic */ void m72672qO(StickerPanelView stickerPanelView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        stickerPanelView.m72669pO(z11, z12);
    }

    /* renamed from: rN */
    private final void m72674rN() {
        m72647hN().m144226d2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rO */
    public final void m72675rO(final C17487o0 c17487o0, Rect rect, C3245i c3245i) {
        boolean z11;
        C13306b c13306b;
        if (c3245i == null) {
            return;
        }
        if (c3245i.m16463e() != 0 && c3245i.m16463e() != 39) {
            z11 = true;
        } else {
            z11 = false;
        }
        removeDialog(0);
        m72707mN(c17487o0);
        m72602JM(this, rect);
        SimpleMenuListPopupView m87994OL = SimpleMenuListPopupView.m87994OL(m92689tK(), rect, new C12899k0(c17487o0, c3245i), z11);
        this.f66901W0 = m87994OL;
        AbstractC19074t.m100205c(m87994OL);
        m87994OL.m92599QK(new InterfaceC17463d.h() { // from class: w90.p
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.h
            /* renamed from: n7 */
            public final void mo92604n7() {
                StickerPanelView.m72678sO(StickerPanelView.this, c17487o0);
            }
        });
        c17487o0.m93060e2(0, this.f66901W0, "", 0, false);
        if (m72647hN().m144258t1() == 250) {
            if (AbstractC28025b8.m141465u("tip.csc.sticker.promotion") && (c13306b = this.f66898T0) != null) {
                c13306b.m74702j("tip.csc.sticker.promotion");
            }
            AbstractC28025b8.m141442M("tip.csc.sticker.promotion");
            m72591DO(new String[]{"tip.csc.sticker.promotion"});
        }
    }

    /* renamed from: sN */
    private final void m72677sN() {
        int i11;
        C30002qc c30002qc = this.f66891M0;
        C30002qc c30002qc2 = null;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        View childAt = c30002qc.f139143v.getChildAt(0);
        AbstractC19074t.m100206d(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) childAt;
        recyclerView.setOverScrollMode(2);
        AbstractC0671b.m955a(recyclerView);
        if (!m72630ZM().m10006n()) {
            m72630ZM().m9999J(true);
        }
        C30002qc c30002qc3 = this.f66891M0;
        if (c30002qc3 == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc3 = null;
        }
        c30002qc3.f139143v.setAdapter(m72630ZM());
        C30002qc c30002qc4 = this.f66891M0;
        if (c30002qc4 == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc4 = null;
        }
        ViewPager2 viewPager2 = c30002qc4.f139143v;
        if (m72647hN().m144217Z0() > 0) {
            i11 = m72647hN().m144217Z0();
        } else {
            i11 = -1;
        }
        viewPager2.setOffscreenPageLimit(i11);
        C30002qc c30002qc5 = this.f66891M0;
        if (c30002qc5 == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc5 = null;
        }
        View childAt2 = c30002qc5.f139143v.getChildAt(0);
        AbstractC19074t.m100206d(childAt2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        ((RecyclerView) childAt2).setItemViewCacheSize(0);
        ViewPager2.AbstractC2075i abstractC2075i = this.f66900V0;
        if (abstractC2075i != null) {
            C30002qc c30002qc6 = this.f66891M0;
            if (c30002qc6 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30002qc2 = c30002qc6;
            }
            c30002qc2.f139143v.m11245g(abstractC2075i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sO */
    public static final void m72678sO(StickerPanelView stickerPanelView, C17487o0 c17487o0) {
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        AbstractC19074t.m100208f(c17487o0, "$childZaloViewManager");
        stickerPanelView.m72707mN(c17487o0);
    }

    /* renamed from: tN */
    private final void m72680tN() {
        m72685vN();
        this.f66900V0 = new C12892h();
        m72677sN();
        m72664nN();
        m72668pN();
    }

    /* renamed from: tO */
    private final boolean m72681tO(SlidingTabRecyclerView slidingTabRecyclerView, LinearLayoutManager linearLayoutManager, int i11) {
        View mo9732P;
        if (slidingTabRecyclerView.getWidth() <= 0 || (mo9732P = linearLayoutManager.mo9732P(i11)) == null) {
            return false;
        }
        slidingTabRecyclerView.m9845O1(mo9732P.getLeft() - ((slidingTabRecyclerView.getWidth() - mo9732P.getWidth()) / 2), 0);
        return true;
    }

    /* renamed from: uO */
    private final void m72683uO() {
        m72609MN();
        m72615PN();
        m72691xN();
        m72593EN();
        m72590DN();
        m72688wN();
        m72601IN();
        m72621SN();
        m72697zN();
        m72613ON();
        m72595FN();
        m72587CN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vN */
    public final void m72685vN() {
        C30002qc c30002qc = this.f66891M0;
        C30002qc c30002qc2 = null;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        if (c30002qc.f139140s.getLayoutParams() == null) {
            C30002qc c30002qc3 = this.f66891M0;
            if (c30002qc3 == null) {
                AbstractC19074t.m100223u("binding");
                c30002qc3 = null;
            }
            c30002qc3.f139140s.setLayoutParams(new ViewGroup.LayoutParams(-1, m72647hN().m144261u1()));
        } else {
            C30002qc c30002qc4 = this.f66891M0;
            if (c30002qc4 == null) {
                AbstractC19074t.m100223u("binding");
                c30002qc4 = null;
            }
            c30002qc4.f139140s.getLayoutParams().height = m72647hN().m144261u1();
        }
        C30002qc c30002qc5 = this.f66891M0;
        if (c30002qc5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30002qc2 = c30002qc5;
        }
        c30002qc2.f139140s.requestLayout();
    }

    /* renamed from: vO */
    private final void m72686vO() {
        m72605KN();
        m72599HN();
        m72597GN();
        m72617QN();
        m72619RN();
        m72694yN();
        m72581AN();
        m72584BN();
        m72607LN();
        m72611NN();
        m72624UN();
        m72603JN();
        m72623TN();
    }

    /* renamed from: wN */
    private final void m72688wN() {
        m72630ZM().m72771O().m9219j(this, new C12894i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wO */
    public final void m72689wO() {
        C30002qc c30002qc = this.f66891M0;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        c30002qc.f139142u.postDelayed(new Runnable() { // from class: w90.t
            @Override // java.lang.Runnable
            public final void run() {
                StickerPanelView.m72692xO(StickerPanelView.this);
            }
        }, 500L);
    }

    /* renamed from: xN */
    private final void m72691xN() {
        m72630ZM().m72772P().m9219j(this, new C12896j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xO */
    public static final void m72692xO(StickerPanelView stickerPanelView) {
        AbstractC31727b abstractC31727b;
        AbstractC19074t.m100208f(stickerPanelView, "this$0");
        if (!stickerPanelView.mo60294yp() && (abstractC31727b = stickerPanelView.f66895Q0) != null) {
            abstractC31727b.mo71334u("tip.csc.sticker.gif");
        }
    }

    /* renamed from: yN */
    private final void m72694yN() {
        m72647hN().m144206S0().m9219j(this, new C12898k());
    }

    /* renamed from: yO */
    private final void m72695yO(List list, int i11) {
        if (i11 == -1) {
            return;
        }
        m72627XM().m36984d0(list);
        m72627XM().m36986f0(i11);
        m72627XM().m10008p();
    }

    /* renamed from: zN */
    private final void m72697zN() {
        m72630ZM().m72780X().m9219j(this, new C12900l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zO */
    public final void m72698zO(int i11) {
        AbstractC31727b abstractC31727b;
        C30002qc c30002qc = this.f66891M0;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        c30002qc.f139142u.m76911d2(i11);
        m72612OM(i11);
        if (i11 == m72647hN().m144187F0() && (abstractC31727b = this.f66895Q0) != null) {
            abstractC31727b.mo71322b();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m72647hN().m144198M1(C12921a.Companion.m72767a(m92642L3()));
        m72674rN();
        m72600IM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "objects");
        if (i11 == 0 && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof Integer) {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
                final int intValue = ((Integer) obj).intValue();
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stickercategory_askdelete)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: w90.r
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        StickerPanelView.m72626WN(StickerPanelView.this, intValue, interfaceC17463d, i12);
                    }
                });
                return aVar.m43152a();
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30002qc m148415c = C30002qc.m148415c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148415c, "inflate(...)");
        this.f66891M0 = m148415c;
        m72671qN();
        C30002qc c30002qc = this.f66891M0;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        FrameLayout root = c30002qc.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        m72648hO();
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: MJ */
    public void mo67117MJ(final boolean z11) {
        super.mo67117MJ(z11);
        if (!this.f66902X0) {
            m72647hN().m144250o0(z11, m72627XM().m36978M());
            return;
        }
        C30002qc c30002qc = this.f66891M0;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        c30002qc.f139143v.post(new Runnable() { // from class: w90.k
            @Override // java.lang.Runnable
            public final void run() {
                StickerPanelView.m72629YN(StickerPanelView.this, z11);
            }
        });
    }

    /* renamed from: UM */
    public final View m72699UM() {
        try {
            C30002qc c30002qc = this.f66891M0;
            if (c30002qc == null) {
                AbstractC19074t.m100223u("binding");
                c30002qc = null;
            }
            return c30002qc.f139138q;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m72647hN().m144209U1();
    }

    /* renamed from: VM */
    public final View m72700VM() {
        try {
            C12922b m72630ZM = m72630ZM();
            C30002qc c30002qc = this.f66891M0;
            if (c30002qc == null) {
                AbstractC19074t.m100223u("binding");
                c30002qc = null;
            }
            View m72787e0 = m72630ZM.m72787e0(c30002qc.f139143v.getCurrentItem());
            if (!(m72787e0 instanceof StickersPanelPage)) {
                return null;
            }
            return ((StickersPanelPage) m72787e0).m72841e2();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: WM */
    public final View m72701WM() {
        try {
            C30002qc c30002qc = this.f66891M0;
            if (c30002qc == null) {
                AbstractC19074t.m100223u("binding");
                c30002qc = null;
            }
            RecyclerView.AbstractC1876c0 m9900t0 = c30002qc.f139142u.m9900t0(m72647hN().m144189G0());
            if (m9900t0 == null) {
                return null;
            }
            return m9900t0.f7784p;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: YM */
    public final ViewPager2.AbstractC2075i m72702YM() {
        return this.f66900V0;
    }

    /* renamed from: bN */
    public final View m72703bN() {
        try {
            C30002qc c30002qc = this.f66891M0;
            if (c30002qc == null) {
                AbstractC19074t.m100223u("binding");
                c30002qc = null;
            }
            RecyclerView.AbstractC1876c0 m9900t0 = c30002qc.f139142u.m9900t0(m72647hN().m144191I0());
            if (m9900t0 == null) {
                return null;
            }
            return m9900t0.f7784p;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: fN */
    public final AbstractC31727b m72704fN() {
        return this.f66895Q0;
    }

    /* renamed from: gN */
    public final StickerView.InterfaceC10959a m72705gN() {
        return this.f66903Y0;
    }

    /* renamed from: gO */
    public final void m72706gO() {
        m72608MM();
    }

    /* renamed from: mN */
    public final void m72707mN(C17487o0 c17487o0) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        SimpleMenuListPopupView simpleMenuListPopupView = this.f66901W0;
        if (simpleMenuListPopupView != null) {
            c17487o0.mo92702G1(simpleMenuListPopupView, 0);
        }
        this.f66901W0 = null;
    }

    /* renamed from: nO */
    public final void m72708nO(C13306b c13306b) {
        this.f66898T0 = c13306b;
    }

    /* renamed from: oO */
    public final void m72709oO(AbstractC31727b abstractC31727b) {
        this.f66895Q0 = abstractC31727b;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if ((i11 == 100 || i11 == 101) && i12 == -1 && intent != null && intent.getBooleanExtra(StickerManageView.f77870k1, false)) {
            C2834f.f11325a.m13686e();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        AbstractC19444a.m101695c(new Runnable() { // from class: w90.q
            @Override // java.lang.Runnable
            public final void run() {
                StickerPanelView.m72625VN(StickerPanelView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (m72627XM().m36980O() != -1) {
            m72636cO(this, m72627XM().m36980O(), true, false, false, 4, null);
        }
    }

    /* renamed from: uN */
    public final boolean m72710uN() {
        C30002qc c30002qc = this.f66891M0;
        if (c30002qc == null) {
            AbstractC19074t.m100223u("binding");
            c30002qc = null;
        }
        if (c30002qc.f139143v.getScrollState() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 39) {
            switch (i11) {
                case 8000:
                    m72647hN().m144195K1();
                    return;
                case 8001:
                    m72647hN().m144192I1();
                    return;
                case 8002:
                    break;
                case 8003:
                    m72647hN().m144193J1();
                    return;
                case 8004:
                    m72647hN().m144190G1(objArr, m72630ZM());
                    return;
                case 8005:
                    m72647hN().m144238j0(m72627XM().m36978M());
                    return;
                case 8006:
                    m72647hN().m144197L1(objArr);
                    return;
                case 8007:
                    m72644fO();
                    return;
                case 8008:
                    m72585BO(objArr);
                    return;
                default:
                    return;
            }
        }
        m72706gO();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m72686vO();
        m72683uO();
        m72608MM();
        m72591DO(AbstractC28025b8.f130846c);
    }
}
