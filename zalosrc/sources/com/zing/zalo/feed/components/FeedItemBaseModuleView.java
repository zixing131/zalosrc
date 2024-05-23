package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroupOverlay;
import ao.InterfaceC2259a;
import ao.InterfaceC2266h;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.feed.components.C8406v1;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p354n3.C23528a;
import p615wn.C29106b;

/* loaded from: classes4.dex */
public abstract class FeedItemBaseModuleView extends ModulesView {

    /* renamed from: d0 */
    public static final int f44318d0 = AbstractC23136l9.m118742r(15.0f);

    /* renamed from: e0 */
    public static final int f44319e0 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: K */
    protected C16719g.c f44320K;

    /* renamed from: L */
    protected View.OnClickListener f44321L;

    /* renamed from: M */
    protected int f44322M;

    /* renamed from: N */
    protected int f44323N;

    /* renamed from: O */
    protected C23528a f44324O;

    /* renamed from: P */
    protected C16719g f44325P;

    /* renamed from: Q */
    protected C8406v1 f44326Q;

    /* renamed from: R */
    protected C8323l1 f44327R;

    /* renamed from: S */
    protected boolean f44328S;

    /* renamed from: T */
    protected boolean f44329T;

    /* renamed from: U */
    private final Drawable f44330U;

    /* renamed from: V */
    protected C3000l0 f44331V;

    /* renamed from: W */
    C8406v1.a f44332W;

    /* renamed from: a0 */
    C16719g f44333a0;

    /* renamed from: b0 */
    C16719g f44334b0;

    /* renamed from: c0 */
    private final View.OnLayoutChangeListener f44335c0;

    /* renamed from: com.zing.zalo.feed.components.FeedItemBaseModuleView$a */
    /* loaded from: classes4.dex */
    class ViewOnLayoutChangeListenerC8085a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC8085a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            if (FeedItemBaseModuleView.this.f44330U != null) {
                FeedItemBaseModuleView feedItemBaseModuleView = FeedItemBaseModuleView.this;
                int i19 = feedItemBaseModuleView.f44322M;
                if (i19 != 2 && i19 != 3) {
                    feedItemBaseModuleView.f44330U.setBounds(0, 0, view.getWidth(), view.getHeight());
                } else {
                    feedItemBaseModuleView.f44330U.setBounds(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_left_profile), 0, i13 - AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_right_profile), view.getHeight());
                }
            }
        }
    }

    public FeedItemBaseModuleView(Context context) {
        super(context);
        this.f44335c0 = new ViewOnLayoutChangeListenerC8085a();
        this.f44330U = AbstractC23136l9.m118665N(context, AbstractC16803z.foreground_local_feed_item);
    }

    /* renamed from: c0 */
    private void m43692c0() {
        boolean z11;
        C3000l0 c3000l0;
        boolean z12;
        C3000l0 c3000l02;
        try {
            ViewGroupOverlay overlay = getOverlay();
            if (overlay != null && this.f44330U != null) {
                int i11 = this.f44322M;
                boolean z13 = true;
                if (i11 != 0 && i11 != 2 && i11 != 3 && i11 != 4) {
                    z11 = false;
                    c3000l0 = this.f44331V;
                    if (c3000l0 == null && c3000l0.m14285C0()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c3000l02 = this.f44331V;
                    if (c3000l02 != null || c3000l02.m14322a0() == null || this.f44331V.m14322a0().m14498b0()) {
                        z13 = false;
                    }
                    if (!z11 && z12 && z13) {
                        overlay.add(this.f44330U);
                        return;
                    } else {
                        overlay.remove(this.f44330U);
                    }
                }
                z11 = true;
                c3000l0 = this.f44331V;
                if (c3000l0 == null) {
                }
                z12 = false;
                c3000l02 = this.f44331V;
                if (c3000l02 != null) {
                }
                z13 = false;
                if (!z11) {
                }
                overlay.remove(this.f44330U);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l0 */
    public static void m43693l0(FeedItemBaseModuleView feedItemBaseModuleView, C3000l0 c3000l0) {
        feedItemBaseModuleView.setFeedContent(c3000l0);
    }

    /* renamed from: W */
    public abstract void mo43694W(C29106b c29106b);

    /* renamed from: X */
    public void m43695X(C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a) {
        try {
            this.f44328S = z11;
            if (c3000l0 != null && c3000l0.m14324b0(i11) != null && this.f44322M == 1) {
                this.f44327R.m44767T1(c3000l0, i11, interfaceC2259a, z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y */
    public void m43696Y(C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f) {
        try {
            this.f44328S = z11;
            if (c3000l0 != null && c3000l0.m14324b0(i11) != null) {
                int i12 = this.f44322M;
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        if (i12 != 4 && i12 != 6 && i12 != 11) {
                        }
                    } else {
                        C8406v1.a aVar = this.f44332W;
                        if (aVar != null) {
                            aVar.m44940r1(c3000l0, c3000l0.m14324b0(i11));
                        }
                    }
                }
                C8406v1 c8406v1 = this.f44326Q;
                if (c8406v1 != null) {
                    c8406v1.m44928b2(c3000l0, i11, z11, interfaceC2259a, interfaceC10867f);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a0 */
    public void m43697a0(C3000l0 c3000l0) {
        C8406v1 c8406v1 = this.f44326Q;
        if (c8406v1 != null) {
            c8406v1.m44929c2(c3000l0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:            vg.C28051e4.m141514f().m141527p(r13);     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:            return;     */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo43698b0(C3000l0 c3000l0, int i11, Context context, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f, boolean z11, InterfaceC2266h interfaceC2266h, boolean z12) {
        C8406v1 c8406v1;
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            int i12 = this.f44322M;
            if ((i12 == 1 || i12 == 4 || i12 == 6 || i12 == 11) && (c8406v1 = this.f44326Q) != null) {
                c8406v1.m44932f2(c3000l0, i11, context, interfaceC2259a, interfaceC10867f);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d0 */
    public void m43699d0(C16719g c16719g, boolean z11) {
        int m118742r;
        if (this.f44334b0 == null) {
            C16719g c16719g2 = new C16719g(this.f84675p);
            this.f44334b0 = c16719g2;
            C16718f m89028L = c16719g2.m89106L().m89028L(-1, 1);
            if (z11) {
                m118742r = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top);
            } else {
                m118742r = AbstractC23136l9.m118742r(8.0f);
            }
            m89028L.m89036T(m118742r).m89023G(c16719g).m89071x(c16719g).m89019C(c16719g);
            this.f44334b0.mo89161z0(C23212s8.m119607o(this.f84675p, AbstractC16781w.ProfileLineColor));
            mo69681L(this.f44334b0);
        }
    }

    /* renamed from: e0 */
    public void m43700e0() {
        C11850a c11850a;
        C8406v1 c8406v1 = this.f44326Q;
        if (c8406v1 != null && (c11850a = c8406v1.f45777S0) != null) {
            c11850a.mo44614b1(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f0 */
    public void m43701f0() {
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.ProfilePrimaryBackgroundColor));
        C16719g c16719g = new C16719g(getContext());
        this.f44333a0 = c16719g;
        c16719g.m89085A0(AbstractC23136l9.m118665N(getContext(), getBackgroundProfileResID()));
        this.f44333a0.m89106L().m89028L(-1, -1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile));
        mo69681L(this.f44333a0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g0 */
    public void m43702g0() {
        C16719g c16719g = new C16719g(getContext());
        this.f44325P = c16719g;
        c16719g.m89106L().m89060k0(-1).m89030N(-1);
        this.f44325P.m89087B0(AbstractC16803z.bg_feed_group_noborder);
        mo69681L(this.f44325P);
    }

    public List<Integer> getArrIdsListCallback() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        return arrayList;
    }

    int getBackgroundProfileResID() {
        return AbstractC16803z.bg_feed_profile_body;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h0 */
    public void m43703h0(int i11) {
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.feed_footer_bar_content_height_group);
        if (i11 != 1) {
            this.f44327R = new C8323l1(getContext());
        } else {
            this.f44327R = new C8331m1(getContext());
            m118655I = -2;
        }
        this.f44327R.m44778w1(getContext(), i11);
        this.f44327R.m89106L().m89060k0(-1).m89030N(m118655I).m89072y(Boolean.TRUE);
        mo69681L(this.f44327R);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i0 */
    public void m43704i0(Context context, int i11) {
        C8406v1 c8406v1 = new C8406v1(context);
        this.f44326Q = c8406v1;
        c8406v1.m89106L().m89060k0(-1).m89030N(-2);
        this.f44326Q.m44915A1(context, i11);
        this.f44326Q.m44936j2(i11);
        mo69681L(this.f44326Q);
    }

    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        this.f44324O = new C23528a(context);
        this.f44323N = AbstractC23136l9.m118641B(context, AbstractC16801x.cProfileDotStroke);
    }

    /* renamed from: k0 */
    public void m43706k0() {
        C8406v1.a aVar = new C8406v1.a(this.f84675p);
        this.f44332W = aVar;
        aVar.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_timebar_marginleft));
        mo69681L(this.f44332W);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.f44335c0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeOnLayoutChangeListener(this.f44335c0);
        super.onDetachedFromWindow();
    }

    public void setFeedContent(C3000l0 c3000l0) {
        this.f44331V = c3000l0;
        m43692c0();
    }

    public void setListListener(SparseArray<C16719g.c> sparseArray) {
        if (sparseArray != null) {
            setOnProfileClickListener(sparseArray.get(0));
            setOnAvatarClickListener(sparseArray.get(1));
        }
    }

    public void setOnAvatarClickListener(C16719g.c cVar) {
        try {
            int i11 = this.f44322M;
            if (i11 == 1 || i11 == 4) {
                this.f44326Q.m44933g2(cVar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setOnFeedMenuClickListener(C16719g.c cVar) {
        try {
            if (this.f44322M == 1) {
                this.f44327R.m44770W1(cVar);
                C8406v1 c8406v1 = this.f44326Q;
                if (c8406v1 != null) {
                    c8406v1.m44934h2(cVar);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setOnFooterClickListener(C16719g.c cVar) {
        try {
            if (this.f44322M == 1) {
                this.f44327R.mo89109M0(cVar);
                this.f44327R.m44769V1(cVar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setOnItemClickListener(C16719g.c cVar) {
        C16719g c16719g = this.f44325P;
        if (c16719g != null) {
            c16719g.mo89109M0(cVar);
        }
    }

    public void setOnProfileClickListener(C16719g.c cVar) {
        try {
            int i11 = this.f44322M;
            if (i11 == 1 || i11 == 4 || i11 == 6) {
                this.f44326Q.m44935i2(cVar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setOnRecentlyLikeClickListener(C16719g.c cVar) {
        C8323l1 c8323l1;
        if (this.f44322M == 1 && (c8323l1 = this.f44327R) != null) {
            c8323l1.m44771X1(cVar);
        }
    }

    public void setOpenFeedDetailListener(View.OnClickListener onClickListener) {
        this.f44321L = onClickListener;
    }

    public void setShowMutualAvatar(boolean z11) {
        this.f44329T = z11;
    }

    public void setOpenFeedDetailListener(C16719g.c cVar) {
        this.f44320K = cVar;
    }

    public FeedItemBaseModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44335c0 = new ViewOnLayoutChangeListenerC8085a();
        this.f44330U = AbstractC23136l9.m118665N(context, AbstractC16803z.foreground_local_feed_item);
    }

    public FeedItemBaseModuleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44335c0 = new ViewOnLayoutChangeListenerC8085a();
        this.f44330U = AbstractC23136l9.m118665N(context, AbstractC16803z.foreground_local_feed_item);
    }
}
