package com.zing.zalo.p077ui.mediastore.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaSkeletonView;
import com.zing.zalo.uicontrol.C16658t0;
import com.zing.zalo.uicontrol.C16666v0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public final class MediaStoreMediaSkeletonView extends LinearLayout {
    public static final C12357a Companion = new C12357a(null);

    /* renamed from: A */
    private final int f64270A;

    /* renamed from: B */
    private final int f64271B;

    /* renamed from: C */
    private final int f64272C;

    /* renamed from: D */
    private final int f64273D;

    /* renamed from: E */
    private final int f64274E;

    /* renamed from: F */
    private final int f64275F;

    /* renamed from: G */
    private final int f64276G;

    /* renamed from: H */
    private final int f64277H;

    /* renamed from: I */
    private final int f64278I;

    /* renamed from: J */
    private final int f64279J;

    /* renamed from: K */
    private final int f64280K;

    /* renamed from: L */
    private final int f64281L;

    /* renamed from: M */
    private final int f64282M;

    /* renamed from: N */
    private final int f64283N;

    /* renamed from: O */
    private final int f64284O;

    /* renamed from: P */
    private final int f64285P;

    /* renamed from: Q */
    private final int f64286Q;

    /* renamed from: R */
    private final int f64287R;

    /* renamed from: S */
    private final int f64288S;

    /* renamed from: T */
    private final int f64289T;

    /* renamed from: U */
    private final int f64290U;

    /* renamed from: V */
    private final int f64291V;

    /* renamed from: W */
    private final int f64292W;

    /* renamed from: a0 */
    private final int f64293a0;

    /* renamed from: b0 */
    private final int f64294b0;

    /* renamed from: c0 */
    private final int f64295c0;

    /* renamed from: d0 */
    private final int f64296d0;

    /* renamed from: e0 */
    private final int f64297e0;

    /* renamed from: f0 */
    private final int f64298f0;

    /* renamed from: g0 */
    private final int f64299g0;

    /* renamed from: h0 */
    private final int f64300h0;

    /* renamed from: i0 */
    private final int f64301i0;

    /* renamed from: j0 */
    private final int f64302j0;

    /* renamed from: k0 */
    private final int f64303k0;

    /* renamed from: l0 */
    private final int f64304l0;

    /* renamed from: m0 */
    private final int f64305m0;

    /* renamed from: n0 */
    private final int f64306n0;

    /* renamed from: o0 */
    private final int f64307o0;

    /* renamed from: p */
    private int f64308p;

    /* renamed from: p0 */
    private final int f64309p0;

    /* renamed from: q */
    private ModulesView f64310q;

    /* renamed from: q0 */
    private final int f64311q0;

    /* renamed from: r */
    private List f64312r;

    /* renamed from: r0 */
    private int f64313r0;

    /* renamed from: s */
    private View f64314s;

    /* renamed from: s0 */
    private boolean f64315s0;

    /* renamed from: t */
    private final int f64316t;

    /* renamed from: t0 */
    private C16658t0 f64317t0;

    /* renamed from: u */
    private final int f64318u;

    /* renamed from: u0 */
    private int[] f64319u0;

    /* renamed from: v */
    private final int f64320v;

    /* renamed from: v0 */
    private RectF f64321v0;

    /* renamed from: w */
    private final int f64322w;

    /* renamed from: w0 */
    private Matrix f64323w0;

    /* renamed from: x */
    private final int f64324x;

    /* renamed from: x0 */
    private C16658t0.b f64325x0;

    /* renamed from: y */
    private final int f64326y;

    /* renamed from: z */
    private final int f64327z;

    /* renamed from: com.zing.zalo.ui.mediastore.common.MediaStoreMediaSkeletonView$a */
    /* loaded from: classes6.dex */
    public static final class C12357a {
        private C12357a() {
        }

        public /* synthetic */ C12357a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.common.MediaStoreMediaSkeletonView$b */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserverOnPreDrawListenerC12358b implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC12358b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int min;
            MediaStoreMediaSkeletonView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            MediaStoreMediaSkeletonView mediaStoreMediaSkeletonView = MediaStoreMediaSkeletonView.this;
            mediaStoreMediaSkeletonView.getLocationOnScreen(mediaStoreMediaSkeletonView.f64319u0);
            int i11 = MediaStoreMediaSkeletonView.this.f64319u0[1];
            int m118713h0 = AbstractC23136l9.m118713h0();
            Iterator it = MediaStoreMediaSkeletonView.this.f64312r.iterator();
            while (true) {
                int i12 = 0;
                if (!it.hasNext()) {
                    return false;
                }
                C16666v0 c16666v0 = (C16666v0) it.next();
                int m88806g1 = c16666v0.m88806g1();
                int m89098H = c16666v0.m89098H() + i11;
                if (c16666v0.f84500H0 == 1) {
                    min = (int) Math.min(255.0f, 30 + (((m89098H * 255) * 1.0f) / m118713h0));
                } else {
                    min = Math.min(255, ((int) (255 * (1 - ((m89098H * 1.0f) / m118713h0)))) + 30);
                }
                if (min >= 0) {
                    i12 = min;
                }
                c16666v0.m88811l1(Color.argb(i12, Color.red(m88806g1), Color.green(m88806g1), Color.blue(m88806g1)));
            }
        }
    }

    public MediaStoreMediaSkeletonView(Context context) {
        super(context);
        this.f64312r = new ArrayList();
        this.f64316t = AbstractC32232i.m155453a(16.0f);
        this.f64318u = AbstractC32232i.m155453a(8.0f);
        this.f64320v = AbstractC32232i.m155453a(46.0f);
        this.f64322w = AbstractC32232i.m155453a(19.0f);
        this.f64324x = AbstractC32232i.m155453a(16.0f);
        this.f64326y = AbstractC32232i.m155453a(8.0f);
        this.f64327z = AbstractC32232i.m155453a(61.0f);
        this.f64270A = AbstractC32232i.m155453a(24.0f);
        this.f64271B = AbstractC32232i.m155453a(16.0f);
        this.f64272C = AbstractC32232i.m155453a(12.0f);
        this.f64273D = AbstractC32232i.m155453a(19.0f);
        this.f64274E = AbstractC32232i.m155453a(16.0f);
        this.f64275F = AbstractC32232i.m155453a(10.0f);
        MainApplication.C6895a c6895a = MainApplication.Companion;
        int dimensionPixelSize = c6895a.m35500c().getResources().getDimensionPixelSize(AbstractC16802y.media_store_horizontal_album_list_item_photogroup_width_small);
        this.f64276G = dimensionPixelSize;
        this.f64277H = c6895a.m35500c().getResources().getDimensionPixelSize(AbstractC16802y.media_store_horizontal_album_list_item_photogroup_height);
        this.f64278I = AbstractC32232i.m155453a(10.0f);
        this.f64279J = AbstractC32232i.m155453a(8.0f);
        this.f64280K = dimensionPixelSize;
        this.f64281L = AbstractC32232i.m155453a(12.0f);
        this.f64282M = AbstractC32232i.m155453a(6.0f);
        this.f64283N = AbstractC32232i.m155453a(46.0f);
        this.f64284O = AbstractC32232i.m155453a(88.0f);
        this.f64285P = AbstractC32232i.m155453a(24.0f);
        this.f64286Q = AbstractC32232i.m155453a(22.0f);
        this.f64287R = AbstractC32232i.m155453a(15.0f);
        this.f64288S = AbstractC32232i.m155453a(25.0f);
        this.f64289T = AbstractC32232i.m155453a(61.0f);
        this.f64290U = AbstractC32232i.m155453a(12.0f);
        this.f64291V = AbstractC32232i.m155453a(16.0f);
        this.f64292W = AbstractC32232i.m155453a(18.0f);
        this.f64293a0 = AbstractC32232i.m155453a(3.0f);
        this.f64294b0 = AbstractC32232i.m155453a(20.0f);
        this.f64295c0 = AbstractC32232i.m155453a(3.0f);
        this.f64296d0 = AbstractC32232i.m155453a(88.0f);
        this.f64297e0 = AbstractC32232i.m155453a(88.0f);
        this.f64298f0 = AbstractC32232i.m155453a(8.0f);
        this.f64299g0 = AbstractC32232i.m155453a(250.0f);
        this.f64300h0 = AbstractC32232i.m155453a(24.0f);
        this.f64301i0 = AbstractC32232i.m155453a(180.0f);
        this.f64302j0 = AbstractC32232i.m155453a(20.0f);
        this.f64303k0 = AbstractC32232i.m155453a(155.0f);
        this.f64304l0 = AbstractC32232i.m155453a(92.0f);
        this.f64305m0 = AbstractC32232i.m155453a(66.0f);
        this.f64306n0 = AbstractC32232i.m155453a(195.0f);
        this.f64307o0 = AbstractC32232i.m155453a(14.0f);
        this.f64309p0 = AbstractC32232i.m155453a(140.0f);
        this.f64311q0 = AbstractC32232i.m155453a(14.0f);
        this.f64313r0 = 1;
        this.f64319u0 = new int[2];
        this.f64321v0 = new RectF();
        this.f64323w0 = new Matrix();
        this.f64325x0 = new C16658t0.b() { // from class: z70.b
            @Override // com.zing.zalo.uicontrol.C16658t0.b
            /* renamed from: a */
            public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                MediaStoreMediaSkeletonView.m69486l(MediaStoreMediaSkeletonView.this, c16658t0, rectF);
            }
        };
    }

    /* renamed from: d */
    private final void m69478d() {
        int i11;
        setOrientation(1);
        if (this.f64310q == null) {
            this.f64310q = new ModulesView(getContext());
            addView(this.f64310q, new LinearLayout.LayoutParams(-1, -2));
        }
        if (this.f64308p == 1) {
            if (this.f64314s == null) {
                View view = new View(getContext());
                this.f64314s = view;
                view.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.SecondaryBackgroundColor));
                addView(this.f64314s, new LinearLayout.LayoutParams(-1, AbstractC32232i.m155453a(8.0f)));
            }
            View view2 = this.f64314s;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View view3 = this.f64314s;
            if (view3 != null && view3 != null) {
                view3.setVisibility(8);
            }
        }
        ModulesView modulesView = this.f64310q;
        if (modulesView != null) {
            modulesView.mo44090O();
        }
        switch (this.f64308p) {
            case 1:
                m69482h();
                break;
            case 2:
                m69483i();
                break;
            case 3:
                m69479e(true);
                break;
            case 4:
                m69479e(false);
                break;
            case 5:
                m69480f(AbstractC32232i.m155453a(8.0f), 4);
                break;
            case 6:
                if (this.f64313r0 == 1) {
                    i11 = AbstractC23136l9.m118713h0() / (AbstractC23222t7.f112514B + this.f64305m0);
                } else {
                    i11 = 3;
                }
                m69481g(0, AbstractC23222t7.f112582r, i11);
                break;
            case 7:
                m69484j();
                break;
            case 8:
                m69485k();
                break;
        }
        requestLayout();
        if (this.f64317t0 == null) {
            C16658t0 c16658t0 = new C16658t0(getContext());
            Rect rect = new Rect();
            rect.set(0, 0, AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0());
            c16658t0.m88778d(rect);
            c16658t0.m88782h(this.f64325x0);
            this.f64317t0 = c16658t0;
        }
        C16658t0 c16658t02 = this.f64317t0;
        if (c16658t02 != null) {
            c16658t02.mo88784j();
        }
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC12358b());
    }

    /* renamed from: e */
    private final void m69479e(boolean z11) {
        C16716d c16716d;
        int i11;
        ModulesView modulesView;
        int i12;
        if (z11) {
            int m155453a = AbstractC32232i.m155453a(16.0f);
            int m155453a2 = AbstractC32232i.m155453a(32.0f);
            int m155453a3 = AbstractC32232i.m155453a(48.0f);
            c16716d = new C16716d(getContext());
            c16716d.m89106L().m89060k0(AbstractC23136l9.m118722k0()).m89042Z(m155453a, m155453a2, m155453a, m155453a3);
            C16666v0 c16666v0 = new C16666v0(getContext());
            c16666v0.m89106L().m89060k0(this.f64299g0).m89030N(this.f64300h0).m89026J(true);
            c16716d.m89001g1(c16666v0);
            this.f64312r.add(c16666v0);
            C16666v0 c16666v02 = new C16666v0(getContext());
            c16666v02.m89106L().m89060k0(this.f64301i0).m89030N(this.f64302j0).m89023G(c16666v0).m89036T(AbstractC32232i.m155453a(8.0f)).m89026J(true);
            c16716d.m89001g1(c16666v02);
            this.f64312r.add(c16666v02);
        } else {
            c16716d = null;
        }
        int m118722k0 = (int) (2 * ((AbstractC23136l9.m118722k0() * 1.0f) / 320));
        int m118722k02 = (int) (((AbstractC23136l9.m118722k0() - (2 * m118722k0)) * 1.0f) / 3);
        if (this.f64315s0) {
            i11 = AbstractC23136l9.m118713h0() / (m118722k02 + m118722k0);
        } else {
            i11 = 3;
        }
        ArrayList arrayList = new ArrayList();
        C16719g c16719g = c16716d;
        int i13 = 0;
        while (i13 < i11) {
            C16719g c16719g2 = null;
            C16719g c16719g3 = null;
            int i14 = 0;
            while (i14 < 3) {
                C16719g c16666v03 = new C16666v0(getContext());
                C16718f m89054h0 = c16666v03.m89106L().m89060k0(m118722k02).m89030N(m118722k02).m89023G(c16719g).m89054h0(c16719g3);
                if (c16719g3 != null) {
                    i12 = m118722k0;
                } else {
                    i12 = 0;
                }
                m89054h0.m89032P(i12, 0, 0, m118722k0);
                arrayList.add(c16666v03);
                if (i14 == 0) {
                    c16719g2 = c16666v03;
                }
                i14++;
                c16719g3 = c16666v03;
            }
            i13++;
            c16719g = c16719g2;
        }
        this.f64312r.addAll(arrayList);
        if (c16716d != null && (modulesView = this.f64310q) != null) {
            modulesView.mo69681L(c16716d);
        }
        ModulesView modulesView2 = this.f64310q;
        if (modulesView2 != null) {
            modulesView2.mo69682M(arrayList);
        }
    }

    /* renamed from: f */
    private final int m69480f(int i11, int i12) {
        int m118722k0 = AbstractC23136l9.m118722k0();
        int i13 = this.f64303k0;
        int i14 = this.f64304l0;
        int m155453a = AbstractC32232i.m155453a(16.0f);
        int m155453a2 = AbstractC32232i.m155453a(12.0f);
        int m155453a3 = AbstractC32232i.m155453a(8.0f);
        int m155453a4 = AbstractC32232i.m155453a(48.0f);
        int m155453a5 = AbstractC32232i.m155453a(16.0f);
        int m155453a6 = AbstractC32232i.m155453a(14.0f);
        int m155453a7 = AbstractC32232i.m155453a(14.0f);
        int m118742r = AbstractC23136l9.m118742r(6.0f);
        Context context = getContext();
        int i15 = i11 + m155453a;
        int i16 = (m118722k0 - (i13 * 2)) / 3;
        int i17 = i12;
        int i18 = 0;
        while (i18 < i17) {
            int i19 = i14 + m155453a2 + m155453a6 + m155453a3 + m155453a7 + m155453a5;
            int i21 = i16;
            int i22 = m155453a;
            int i23 = i18;
            int i24 = 0;
            int i25 = i21;
            while (i24 < 2) {
                int i26 = i24;
                C16666v0 c16666v0 = new C16666v0(context, 1);
                int i27 = i19;
                c16666v0.m89106L().m89060k0(i13).m89030N(i19).m89032P(i25, i15, 0, 0);
                c16666v0.m89085A0(AbstractC1388a.m6964f(context, AbstractC16803z.rectangle_6_corner_white));
                c16666v0.m88811l1(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
                float f11 = m118742r;
                c16666v0.m88808i1(f11, f11, f11, f11);
                this.f64312r.add(c16666v0);
                ModulesView modulesView = this.f64310q;
                if (modulesView != null) {
                    modulesView.mo69681L(c16666v0);
                }
                C16666v0 c16666v02 = new C16666v0(context);
                int i28 = i14;
                c16666v02.m89106L().m89060k0(i13).m89030N(i14).m89032P(i25, i15, 0, 0);
                c16666v02.m88808i1(f11, f11, 0.0f, 0.0f);
                this.f64312r.add(c16666v02);
                ModulesView modulesView2 = this.f64310q;
                if (modulesView2 != null) {
                    modulesView2.mo69681L(c16666v02);
                }
                C16666v0 c16666v03 = new C16666v0(context);
                int i29 = i13 - m155453a3;
                int i31 = m118742r;
                c16666v03.m89106L().m89060k0(i29 - m155453a3).m89030N(m155453a6).m89023G(c16666v02).m89071x(c16666v02).m89032P(m155453a3, m155453a2, m155453a3, 0);
                c16666v03.m88807h1(f11);
                this.f64312r.add(c16666v03);
                ModulesView modulesView3 = this.f64310q;
                if (modulesView3 != null) {
                    modulesView3.mo69681L(c16666v03);
                }
                C16666v0 c16666v04 = new C16666v0(context);
                int i32 = m155453a2;
                c16666v04.m89106L().m89060k0(i29 - m155453a4).m89030N(m155453a7).m89023G(c16666v03).m89071x(c16666v02).m89032P(m155453a3, m155453a3, m155453a4, m155453a5);
                c16666v04.m88807h1(f11);
                this.f64312r.add(c16666v04);
                ModulesView modulesView4 = this.f64310q;
                if (modulesView4 != null) {
                    modulesView4.mo69681L(c16666v04);
                }
                i25 += i13 + i21;
                i24 = i26 + 1;
                i19 = i27;
                i14 = i28;
                m118742r = i31;
                m155453a2 = i32;
            }
            i15 += i19 + i22;
            i18 = i23 + 1;
            i17 = i12;
            m155453a = i22;
            i16 = i21;
        }
        return i15 - m155453a;
    }

    /* renamed from: g */
    private final void m69481g(int i11, int i12, int i13) {
        int i14 = AbstractC23222t7.f112566j;
        Context context = getContext();
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = i11 + AbstractC23222t7.f112586t;
            int i17 = AbstractC23222t7.f112582r;
            int i18 = i16 + i17;
            int i19 = i17 + i16 + AbstractC23222t7.f112572m + this.f64307o0;
            C16666v0 c16666v0 = new C16666v0(context);
            c16666v0.m89106L().m89060k0(this.f64305m0).m89030N(this.f64305m0).m89073z(Boolean.TRUE).m89032P(i12, i16, AbstractC23222t7.f112592w, i14);
            c16666v0.m88807h1(AbstractC23222t7.f112562h);
            this.f64312r.add(c16666v0);
            ModulesView modulesView = this.f64310q;
            if (modulesView != null) {
                modulesView.mo69681L(c16666v0);
            }
            C16666v0 c16666v02 = new C16666v0(context);
            c16666v02.m89106L().m89060k0(this.f64306n0).m89030N(this.f64307o0).m89054h0(c16666v0).m89032P(0, i18, 0, 0);
            c16666v02.m88807h1(AbstractC23222t7.f112562h);
            this.f64312r.add(c16666v02);
            ModulesView modulesView2 = this.f64310q;
            if (modulesView2 != null) {
                modulesView2.mo69681L(c16666v02);
            }
            C16666v0 c16666v03 = new C16666v0(context);
            c16666v03.m89106L().m89060k0(this.f64309p0).m89030N(this.f64311q0).m89054h0(c16666v0).m89032P(0, i19, 0, 0);
            c16666v03.m88807h1(AbstractC23222t7.f112562h);
            this.f64312r.add(c16666v03);
            ModulesView modulesView3 = this.f64310q;
            if (modulesView3 != null) {
                modulesView3.mo69681L(c16666v03);
            }
            i11 = i16 + this.f64305m0 + i14;
        }
    }

    /* renamed from: h */
    private final void m69482h() {
        int i11;
        C16666v0 c16666v0 = new C16666v0(getContext());
        c16666v0.m89106L().m89060k0(this.f64327z).m89030N(this.f64270A).m89032P(this.f64316t, this.f64271B, 0, this.f64272C);
        c16666v0.m88807h1(this.f64318u);
        this.f64312r.add(c16666v0);
        C16666v0 c16666v02 = new C16666v0(getContext());
        c16666v02.m89106L().m89060k0(this.f64320v).m89030N(this.f64322w).m89017A(Boolean.TRUE).m89032P(0, this.f64273D, this.f64324x, 0);
        c16666v02.m88807h1(this.f64326y);
        this.f64312r.add(c16666v02);
        int m118722k0 = ((int) ((AbstractC23136l9.m118722k0() * 1.0f) / this.f64276G)) + 1;
        C16666v0 c16666v03 = null;
        int i12 = 0;
        while (i12 < m118722k0) {
            if (c16666v03 == null) {
                i11 = this.f64274E;
            } else {
                i11 = this.f64278I;
            }
            C16666v0 c16666v04 = new C16666v0(getContext());
            c16666v04.m89106L().m89060k0(this.f64276G).m89030N(this.f64277H).m89023G(c16666v0).m89054h0(c16666v03).m89032P(i11, 0, 0, this.f64275F);
            int i13 = this.f64279J;
            c16666v04.m88808i1(i13, i13, 0.0f, 0.0f);
            this.f64312r.add(c16666v04);
            C16666v0 c16666v05 = new C16666v0(getContext());
            c16666v05.m89106L().m89060k0(this.f64280K).m89030N(this.f64281L).m89023G(c16666v04).m89071x(c16666v04).m89032P(0, 0, 0, AbstractC23136l9.m118742r(4.0f));
            c16666v05.m88807h1(this.f64282M);
            this.f64312r.add(c16666v05);
            C16666v0 c16666v06 = new C16666v0(getContext());
            c16666v06.m89106L().m89060k0((this.f64280K * 3) / 4).m89030N(this.f64281L).m89023G(c16666v05).m89071x(c16666v04).m89032P(0, 0, 0, this.f64283N);
            c16666v06.m88807h1(this.f64282M);
            this.f64312r.add(c16666v06);
            i12++;
            c16666v03 = c16666v04;
        }
        ModulesView modulesView = this.f64310q;
        if (modulesView != null) {
            modulesView.mo69682M(this.f64312r);
        }
    }

    /* renamed from: i */
    private final void m69483i() {
        int i11;
        C16666v0 c16666v0 = new C16666v0(getContext());
        c16666v0.m89106L().m89060k0(this.f64284O).m89030N(this.f64285P).m89032P(this.f64316t, this.f64286Q, 0, this.f64287R);
        c16666v0.m88807h1(this.f64318u);
        this.f64312r.add(c16666v0);
        C16666v0 c16666v02 = new C16666v0(getContext());
        c16666v02.m89106L().m89060k0(this.f64320v).m89030N(this.f64322w).m89017A(Boolean.TRUE).m89032P(0, this.f64288S, this.f64324x, 0);
        c16666v02.m88807h1(this.f64326y);
        this.f64312r.add(c16666v02);
        int m118722k0 = ((int) ((AbstractC23136l9.m118722k0() * 1.0f) / this.f64296d0)) + 1;
        for (int i12 = 0; i12 < 3; i12++) {
            C16666v0 c16666v03 = new C16666v0(getContext());
            c16666v03.m89106L().m89060k0(this.f64289T).m89030N(this.f64290U).m89023G(c16666v0).m89032P(this.f64291V, 0, 0, this.f64292W);
            c16666v03.m88807h1(this.f64293a0);
            this.f64312r.add(c16666v03);
            C16666v0 c16666v04 = null;
            int i13 = 0;
            while (i13 < m118722k0) {
                C16666v0 c16666v05 = new C16666v0(getContext());
                C16718f m89054h0 = c16666v05.m89106L().m89060k0(this.f64296d0).m89030N(this.f64297e0).m89023G(c16666v03).m89054h0(c16666v04);
                if (c16666v04 != null) {
                    i11 = this.f64295c0;
                } else {
                    i11 = 0;
                }
                m89054h0.m89032P(i11, 0, 0, this.f64294b0);
                c16666v05.m88807h1(this.f64298f0);
                this.f64312r.add(c16666v05);
                if (i13 == 0) {
                    c16666v0 = c16666v05;
                }
                i13++;
                c16666v04 = c16666v05;
            }
        }
        ModulesView modulesView = this.f64310q;
        if (modulesView != null) {
            modulesView.mo69682M(this.f64312r);
        }
    }

    /* renamed from: j */
    private final void m69484j() {
        int i11;
        C16719g c16719g = new C16719g(getContext());
        c16719g.m89106L().m89060k0(-1).m89030N(this.f64294b0);
        ModulesView modulesView = this.f64310q;
        if (modulesView != null) {
            modulesView.mo69681L(c16719g);
        }
        int m118722k0 = ((int) ((AbstractC23136l9.m118722k0() * 1.0f) / this.f64296d0)) + 1;
        for (int i12 = 0; i12 < 5; i12++) {
            C16666v0 c16666v0 = new C16666v0(getContext());
            c16666v0.m89106L().m89060k0(this.f64289T).m89030N(this.f64290U).m89023G(c16719g).m89032P(this.f64291V, 0, 0, this.f64292W);
            c16666v0.m88807h1(this.f64293a0);
            this.f64312r.add(c16666v0);
            C16666v0 c16666v02 = null;
            int i13 = 0;
            while (i13 < m118722k0) {
                C16666v0 c16666v03 = new C16666v0(getContext());
                C16718f m89054h0 = c16666v03.m89106L().m89060k0(this.f64296d0).m89030N(this.f64297e0).m89023G(c16666v0).m89054h0(c16666v02);
                if (c16666v02 != null) {
                    i11 = this.f64295c0;
                } else {
                    i11 = 0;
                }
                m89054h0.m89032P(i11, 0, 0, this.f64294b0);
                c16666v03.m88807h1(this.f64298f0);
                this.f64312r.add(c16666v03);
                if (i13 == 0) {
                    c16719g = c16666v03;
                }
                i13++;
                c16666v02 = c16666v03;
            }
        }
        ModulesView modulesView2 = this.f64310q;
        if (modulesView2 != null) {
            modulesView2.mo69682M(this.f64312r);
        }
    }

    /* renamed from: k */
    private final void m69485k() {
        int m118722k0 = AbstractC23136l9.m118722k0();
        int m118742r = AbstractC23136l9.m118742r(60.0f);
        int m118742r2 = AbstractC23136l9.m118742r(24.0f);
        int m118742r3 = AbstractC23136l9.m118742r(46.0f);
        int m118742r4 = AbstractC23136l9.m118742r(20.0f);
        int i11 = (m118722k0 - (this.f64303k0 * 2)) / 3;
        int m118742r5 = AbstractC23136l9.m118742r(6.0f);
        int m118742r6 = AbstractC23136l9.m118742r(14.0f);
        int i12 = (m118742r2 - m118742r4) / 2;
        int i13 = i12 + m118742r6;
        C16666v0 c16666v0 = new C16666v0(getContext());
        c16666v0.m89106L().m89060k0(m118742r).m89030N(m118742r2).m89034R(i11).m89036T(m118742r6);
        float f11 = m118742r5;
        c16666v0.m88808i1(f11, f11, f11, f11);
        this.f64312r.add(c16666v0);
        ModulesView modulesView = this.f64310q;
        if (modulesView != null) {
            modulesView.mo69681L(c16666v0);
        }
        C16666v0 c16666v02 = new C16666v0(getContext());
        C16718f m89030N = c16666v02.m89106L().m89060k0(m118742r3).m89030N(m118742r4);
        Boolean bool = Boolean.TRUE;
        m89030N.m89017A(bool).m89036T(i13).m89035S(i11);
        c16666v02.m88808i1(f11, f11, f11, f11);
        this.f64312r.add(c16666v02);
        ModulesView modulesView2 = this.f64310q;
        if (modulesView2 != null) {
            modulesView2.mo69681L(c16666v02);
        }
        int m69480f = m69480f(AbstractC23136l9.m118742r(12.0f) + m118742r2, 1);
        int m118742r7 = AbstractC23136l9.m118742r(8.0f);
        int m118742r8 = m69480f + AbstractC23136l9.m118742r(14.0f);
        C16666v0 c16666v03 = new C16666v0(getContext());
        c16666v03.m89106L().m89060k0(-1).m89030N(m118742r7).m89036T(m118742r8);
        this.f64312r.add(c16666v03);
        ModulesView modulesView3 = this.f64310q;
        if (modulesView3 != null) {
            modulesView3.mo69681L(c16666v03);
        }
        int i14 = i12 + m118742r8 + m118742r6 + m118742r7;
        int i15 = m118742r8 + m118742r6 + m118742r7;
        C16666v0 c16666v04 = new C16666v0(getContext());
        c16666v04.m89106L().m89060k0(m118742r).m89030N(m118742r2).m89034R(i11).m89036T(i15);
        c16666v04.m88808i1(f11, f11, f11, f11);
        this.f64312r.add(c16666v04);
        ModulesView modulesView4 = this.f64310q;
        if (modulesView4 != null) {
            modulesView4.mo69681L(c16666v04);
        }
        C16666v0 c16666v05 = new C16666v0(getContext());
        c16666v05.m89106L().m89060k0(m118742r3).m89030N(m118742r4).m89017A(bool).m89036T(i14).m89035S(i11);
        c16666v05.m88808i1(f11, f11, f11, f11);
        this.f64312r.add(c16666v05);
        ModulesView modulesView5 = this.f64310q;
        if (modulesView5 != null) {
            modulesView5.mo69681L(c16666v05);
        }
        m69481g(i15 + m118742r2, i11, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m69486l(MediaStoreMediaSkeletonView mediaStoreMediaSkeletonView, C16658t0 c16658t0, RectF rectF) {
        Paint paint;
        AbstractC19074t.m100208f(mediaStoreMediaSkeletonView, "this$0");
        mediaStoreMediaSkeletonView.getLocationOnScreen(mediaStoreMediaSkeletonView.f64319u0);
        mediaStoreMediaSkeletonView.f64321v0.setEmpty();
        mediaStoreMediaSkeletonView.f64323w0.reset();
        Matrix matrix = mediaStoreMediaSkeletonView.f64323w0;
        int[] iArr = mediaStoreMediaSkeletonView.f64319u0;
        matrix.setTranslate(-iArr[0], -iArr[1]);
        mediaStoreMediaSkeletonView.f64323w0.mapRect(mediaStoreMediaSkeletonView.f64321v0, rectF);
        for (C16666v0 c16666v0 : mediaStoreMediaSkeletonView.f64312r) {
            RectF rectF2 = mediaStoreMediaSkeletonView.f64321v0;
            C16658t0 c16658t02 = mediaStoreMediaSkeletonView.f64317t0;
            if (c16658t02 != null) {
                paint = c16658t02.m88776b();
            } else {
                paint = null;
            }
            c16666v0.m88810k1(rectF2, paint);
        }
    }

    /* renamed from: m */
    public final void m69487m(int i11, int i12) {
        this.f64313r0 = i12;
        if (this.f64308p != i11) {
            this.f64308p = i11;
            m69478d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C16658t0 c16658t0 = this.f64317t0;
        if (c16658t0 != null) {
            c16658t0.mo88784j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C16658t0 c16658t0 = this.f64317t0;
        if (c16658t0 != null) {
            c16658t0.m88785k();
        }
    }

    public final void setLayoutSkeletonTypeAlbumDetailsAutoCalculateRow(boolean z11) {
        this.f64315s0 = z11;
    }

    public final void setSkeletonLayoutType(int i11) {
        m69487m(i11, 1);
    }

    public MediaStoreMediaSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64312r = new ArrayList();
        this.f64316t = AbstractC32232i.m155453a(16.0f);
        this.f64318u = AbstractC32232i.m155453a(8.0f);
        this.f64320v = AbstractC32232i.m155453a(46.0f);
        this.f64322w = AbstractC32232i.m155453a(19.0f);
        this.f64324x = AbstractC32232i.m155453a(16.0f);
        this.f64326y = AbstractC32232i.m155453a(8.0f);
        this.f64327z = AbstractC32232i.m155453a(61.0f);
        this.f64270A = AbstractC32232i.m155453a(24.0f);
        this.f64271B = AbstractC32232i.m155453a(16.0f);
        this.f64272C = AbstractC32232i.m155453a(12.0f);
        this.f64273D = AbstractC32232i.m155453a(19.0f);
        this.f64274E = AbstractC32232i.m155453a(16.0f);
        this.f64275F = AbstractC32232i.m155453a(10.0f);
        MainApplication.C6895a c6895a = MainApplication.Companion;
        int dimensionPixelSize = c6895a.m35500c().getResources().getDimensionPixelSize(AbstractC16802y.media_store_horizontal_album_list_item_photogroup_width_small);
        this.f64276G = dimensionPixelSize;
        this.f64277H = c6895a.m35500c().getResources().getDimensionPixelSize(AbstractC16802y.media_store_horizontal_album_list_item_photogroup_height);
        this.f64278I = AbstractC32232i.m155453a(10.0f);
        this.f64279J = AbstractC32232i.m155453a(8.0f);
        this.f64280K = dimensionPixelSize;
        this.f64281L = AbstractC32232i.m155453a(12.0f);
        this.f64282M = AbstractC32232i.m155453a(6.0f);
        this.f64283N = AbstractC32232i.m155453a(46.0f);
        this.f64284O = AbstractC32232i.m155453a(88.0f);
        this.f64285P = AbstractC32232i.m155453a(24.0f);
        this.f64286Q = AbstractC32232i.m155453a(22.0f);
        this.f64287R = AbstractC32232i.m155453a(15.0f);
        this.f64288S = AbstractC32232i.m155453a(25.0f);
        this.f64289T = AbstractC32232i.m155453a(61.0f);
        this.f64290U = AbstractC32232i.m155453a(12.0f);
        this.f64291V = AbstractC32232i.m155453a(16.0f);
        this.f64292W = AbstractC32232i.m155453a(18.0f);
        this.f64293a0 = AbstractC32232i.m155453a(3.0f);
        this.f64294b0 = AbstractC32232i.m155453a(20.0f);
        this.f64295c0 = AbstractC32232i.m155453a(3.0f);
        this.f64296d0 = AbstractC32232i.m155453a(88.0f);
        this.f64297e0 = AbstractC32232i.m155453a(88.0f);
        this.f64298f0 = AbstractC32232i.m155453a(8.0f);
        this.f64299g0 = AbstractC32232i.m155453a(250.0f);
        this.f64300h0 = AbstractC32232i.m155453a(24.0f);
        this.f64301i0 = AbstractC32232i.m155453a(180.0f);
        this.f64302j0 = AbstractC32232i.m155453a(20.0f);
        this.f64303k0 = AbstractC32232i.m155453a(155.0f);
        this.f64304l0 = AbstractC32232i.m155453a(92.0f);
        this.f64305m0 = AbstractC32232i.m155453a(66.0f);
        this.f64306n0 = AbstractC32232i.m155453a(195.0f);
        this.f64307o0 = AbstractC32232i.m155453a(14.0f);
        this.f64309p0 = AbstractC32232i.m155453a(140.0f);
        this.f64311q0 = AbstractC32232i.m155453a(14.0f);
        this.f64313r0 = 1;
        this.f64319u0 = new int[2];
        this.f64321v0 = new RectF();
        this.f64323w0 = new Matrix();
        this.f64325x0 = new C16658t0.b() { // from class: z70.b
            @Override // com.zing.zalo.uicontrol.C16658t0.b
            /* renamed from: a */
            public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                MediaStoreMediaSkeletonView.m69486l(MediaStoreMediaSkeletonView.this, c16658t0, rectF);
            }
        };
    }
}
