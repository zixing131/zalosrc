package com.zing.zalo.feed.formpostfeed.p063ui;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.AbstractC1409d;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.feed.components.GlowingReddot;
import com.zing.zalo.feed.formpostfeed.data.Display;
import com.zing.zalo.feed.formpostfeed.p063ui.C8459a;
import com.zing.zalo.feed.uicontrols.LottieWithImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import p379o3.C24003n;
import p649xl.C30106wd;
import p687yn.C31023a;
import ti0.C26705d;
import ti0.C26708g;

/* renamed from: com.zing.zalo.feed.formpostfeed.ui.a */
/* loaded from: classes4.dex */
public final class C8459a extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: u */
    private static final int f45930u = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: v */
    private static final int f45931v = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: w */
    private static final int f45932w = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: x */
    private static final int f45933x = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: r */
    private final Context f45934r;

    /* renamed from: s */
    private final List f45935s;

    /* renamed from: t */
    private b f45936t;

    /* renamed from: com.zing.zalo.feed.formpostfeed.ui.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m45049a() {
            return C8459a.f45931v;
        }

        /* renamed from: b */
        public final int m45050b() {
            return C8459a.f45930u;
        }
    }

    /* renamed from: com.zing.zalo.feed.formpostfeed.ui.a$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo45035a(int i11, String str);
    }

    /* renamed from: com.zing.zalo.feed.formpostfeed.ui.a$c */
    /* loaded from: classes4.dex */
    public final class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final C30106wd f45937I;

        /* renamed from: J */
        private final Context f45938J;

        /* renamed from: K */
        private final C8461c f45939K;

        /* renamed from: L */
        final /* synthetic */ C8459a f45940L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C8459a c8459a, C30106wd c30106wd) {
            super(c30106wd.getRoot());
            AbstractC19074t.m100208f(c30106wd, "binding");
            this.f45940L = c8459a;
            this.f45937I = c30106wd;
            Context context = c30106wd.f139842t.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            this.f45938J = context;
            this.f45939K = new C8461c(context);
            m45058q0();
        }

        /* renamed from: k0 */
        public static final void m45052k0(C8459a c8459a, C31023a c31023a, View view) {
            AbstractC19074t.m100208f(c8459a, "this$0");
            AbstractC19074t.m100208f(c31023a, "$item");
            b m45044Q = c8459a.m45044Q();
            if (m45044Q != null) {
                m45044Q.mo45035a(c31023a.m150835e(), c31023a.m150840j());
            }
        }

        /* renamed from: l0 */
        private final void m45053l0(C31023a c31023a) {
            int m119607o;
            if (c31023a.m150832b() != 0) {
                m119607o = c31023a.m150832b();
            } else {
                m119607o = C23212s8.m119607o(this.f45938J, AbstractC16781w.BackgroundIcon);
            }
            Drawable background = this.f45937I.f139842t.getBackground();
            if (background instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) background;
                Drawable findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.background);
                if (findDrawableByLayerId instanceof GradientDrawable) {
                    ((GradientDrawable) findDrawableByLayerId).setColor(m119607o);
                }
                rippleDrawable.setColor(ColorStateList.valueOf(AbstractC1409d.m7135d(m119607o, -7829368, 0.2f)));
            }
        }

        /* renamed from: m0 */
        private final void m45054m0(Display display, int i11) {
            Drawable drawable;
            int type = display.getType();
            if (type != 0 && type != 1) {
                if (type != 2) {
                    if (type == 3) {
                        this.f45937I.f139841s.setImageMode(LottieWithImageView.EnumC8868a.f47377p);
                        m45055n0(display);
                        C8461c.m45072m(this.f45939K, this.f45937I.f139841s.getLottieView(), display.getLottie(), i11, null, 8, null);
                        return;
                    }
                    return;
                }
                this.f45937I.f139841s.setImageMode(LottieWithImageView.EnumC8868a.f47378q);
                m45055n0(display);
                if (i11 != 0) {
                    drawable = AbstractC23136l9.m118665N(this.f45937I.f139841s.getContext(), i11);
                } else {
                    drawable = null;
                }
                C8461c.m45071k(this.f45939K, this.f45937I.f139841s.getNormalView(), display.getImgUrl().getValue(), C24003n.m125832b(C23278z2.m120146o0(), 0, drawable, 0, false, 0, false, null, 125, null), i11, null, 16, null);
                return;
            }
            if (i11 != 0) {
                this.f45937I.f139841s.setImageMode(LottieWithImageView.EnumC8868a.f47378q);
                this.f45937I.f139841s.getNormalView().setBackground(AbstractC23136l9.m118665N(this.f45937I.f139841s.getContext(), i11));
            }
        }

        /* renamed from: n0 */
        private final void m45055n0(Display display) {
            if (display.getUseCustomSize()) {
                ViewGroup.LayoutParams layoutParams = this.f45937I.f139841s.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = display.getCustomSizeInPx();
                    layoutParams.height = display.getCustomSizeInPx();
                }
                m45061t0(display.getCustomSizeInPx());
            }
        }

        /* renamed from: o0 */
        private final void m45056o0(C31023a c31023a, int i11) {
            int i12;
            GlowingReddot glowingReddot = this.f45937I.f139840r;
            if (c31023a.m150836f()) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            glowingReddot.setVisibility(i12);
            m45060s0(i11);
            if (c31023a.m150836f() && AbstractC20826v0.m108812h0()) {
                this.f45937I.f139840r.m44426f(4000L);
            } else {
                this.f45937I.f139840r.m44427g();
            }
        }

        /* renamed from: p0 */
        private final void m45057p0(C31023a c31023a) {
            this.f45937I.f139843u.setText(c31023a.m150837g());
            if (c31023a.m150838h() != 0) {
                this.f45937I.f139843u.setTextColor(c31023a.m150838h());
            }
        }

        /* renamed from: q0 */
        private final void m45058q0() {
            GlowingReddot glowingReddot = this.f45937I.f139840r;
            glowingReddot.m44424c(AbstractC23136l9.m118742r(10.0f), Color.parseColor("#ff565d"), ZAbstractBase.ZVU_PROCESS_FLUSH, 0, 1, 3, 300);
            glowingReddot.setTopLayerSize(AbstractC23136l9.m118742r(6.0f));
            glowingReddot.setTopLayerColor(Color.parseColor("#ff565d"));
            glowingReddot.setBottomLayerSize(AbstractC23136l9.m118742r(8.0f));
            glowingReddot.setBottomLayerColor(C23212s8.m119607o(glowingReddot.getContext(), AbstractC16781w.PrimaryBackgroundColor));
        }

        /* renamed from: r0 */
        private final void m45059r0(C31023a c31023a) {
            ViewGroup.LayoutParams layoutParams = this.f45937I.f139839q.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (c31023a.m150831a() < AbstractC23136l9.m118742r(12.0f)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = AbstractC23136l9.m118742r(12.0f);
                    marginLayoutParams.rightMargin = AbstractC23136l9.m118742r(12.0f);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams2.leftMargin = c31023a.m150831a();
                    marginLayoutParams2.rightMargin = c31023a.m150831a();
                }
            }
        }

        /* renamed from: s0 */
        private final void m45060s0(int i11) {
            float f11;
            float f12;
            ViewGroup.LayoutParams layoutParams = this.f45937I.f139840r.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (i11 == AbstractC23222t7.f112514B) {
                    f11 = 12.0f;
                } else {
                    f11 = 6.0f;
                }
                int m118742r = AbstractC23136l9.m118742r(f11);
                if (i11 == AbstractC23222t7.f112514B) {
                    f12 = 4.0f;
                } else {
                    f12 = 8.0f;
                }
                int m118742r2 = AbstractC23136l9.m118742r(f12) * (-1);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = m118742r;
                marginLayoutParams.topMargin = m118742r2;
            }
        }

        /* renamed from: t0 */
        private final void m45061t0(int i11) {
            ViewGroup.LayoutParams layoutParams = this.f45937I.f139839q.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (i11 == AbstractC23222t7.f112586t) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = AbstractC23136l9.m118742r(8.0f);
                    marginLayoutParams.bottomMargin = AbstractC23136l9.m118742r(8.0f);
                } else if (i11 == AbstractC23222t7.f112514B) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams2.topMargin = AbstractC23136l9.m118742r(4.0f);
                    marginLayoutParams2.bottomMargin = AbstractC23136l9.m118742r(4.0f);
                }
            }
        }

        /* renamed from: j0 */
        public final void m45062j0(C31023a c31023a) {
            AbstractC19074t.m100208f(c31023a, "item");
            m45057p0(c31023a);
            m45053l0(c31023a);
            m45054m0(c31023a.m150834d(), c31023a.m150833c());
            m45056o0(c31023a, c31023a.m150834d().getCustomSizeInPx());
            m45059r0(c31023a);
            this.f45937I.f139842t.setOnClickListener(new View.OnClickListener() { // from class: yn.b

                /* renamed from: q */
                public final /* synthetic */ C31023a f143097q;

                public /* synthetic */ ViewOnClickListenerC31024b(C31023a c31023a2) {
                    r2 = c31023a2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8459a.c.m45052k0(C8459a.this, r2, view);
                }
            });
        }
    }

    public C8459a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f45934r = context;
        this.f45935s = Collections.synchronizedList(new ArrayList());
    }

    /* renamed from: N */
    private final int m45041N(C31023a c31023a) {
        int m118725l0 = AbstractC23136l9.m118725l0(this.f45934r);
        RobotoTextView robotoTextView = new RobotoTextView(this.f45934r);
        new C26708g(robotoTextView).m137319a(C26705d.m137293a(this.f45934r, AbstractC2814h.t_small));
        robotoTextView.setText(c31023a.m150837g());
        robotoTextView.measure(View.MeasureSpec.makeMeasureSpec(m118725l0, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return robotoTextView.getMeasuredWidth() + f45933x + c31023a.m150834d().getCustomSizeInPx();
    }

    /* renamed from: O */
    private final void m45042O(List list) {
        int m118725l0 = ((AbstractC23136l9.m118725l0(this.f45934r) - (f45932w * 2)) - ((list.size() - 1) * f45930u)) - m45043P(list);
        if (m118725l0 > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C31023a) it.next()).m150841k((m118725l0 / list.size()) / 2);
            }
        }
    }

    /* renamed from: P */
    private final int m45043P(List list) {
        List list2 = list;
        int i11 = 0;
        if (list2 != null && !list2.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i11 += m45041N((C31023a) it.next());
            }
        }
        return i11;
    }

    /* renamed from: Q */
    public final b m45044Q() {
        return this.f45936t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R */
    public void mo9990A(c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "holder");
        Object obj = this.f45935s.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        cVar.m45062j0((C31023a) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        C30106wd m148667c = C30106wd.m148667c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC19074t.m100207e(m148667c, "inflate(...)");
        return new c(this, m148667c);
    }

    /* renamed from: T */
    public final void m45047T(List list) {
        AbstractC19074t.m100208f(list, "listData");
        m45042O(list);
        this.f45935s.clear();
        this.f45935s.addAll(list);
    }

    /* renamed from: U */
    public final void m45048U(b bVar) {
        this.f45936t = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f45935s.size();
    }
}
