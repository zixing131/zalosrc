package com.zing.zalo.p077ui.chattag;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.chattag.ChatTagFilterSkeletonView;
import com.zing.zalo.uicontrol.C16658t0;
import com.zing.zalo.uicontrol.C16666v0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import kd0.C21693c;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class ChatTagFilterSkeletonView extends LinearLayout {

    /* renamed from: A */
    private final int f61591A;

    /* renamed from: B */
    private final int f61592B;

    /* renamed from: C */
    private final int f61593C;

    /* renamed from: D */
    private final int f61594D;

    /* renamed from: E */
    private final int f61595E;

    /* renamed from: F */
    private ModulesView f61596F;

    /* renamed from: G */
    private ArrayList f61597G;

    /* renamed from: H */
    private C16658t0 f61598H;

    /* renamed from: I */
    private final int[] f61599I;

    /* renamed from: J */
    private final RectF f61600J;

    /* renamed from: K */
    private final Matrix f61601K;

    /* renamed from: L */
    private final C16658t0.b f61602L;

    /* renamed from: p */
    private final int f61603p;

    /* renamed from: q */
    private final int f61604q;

    /* renamed from: r */
    private final int f61605r;

    /* renamed from: s */
    private final int f61606s;

    /* renamed from: t */
    private final int f61607t;

    /* renamed from: u */
    private final int f61608u;

    /* renamed from: v */
    private final int f61609v;

    /* renamed from: w */
    private final int f61610w;

    /* renamed from: x */
    private final int f61611x;

    /* renamed from: y */
    private final int f61612y;

    /* renamed from: z */
    private final int f61613z;

    public ChatTagFilterSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61603p = 100;
        this.f61604q = AbstractC23136l9.m118742r(70.0f);
        this.f61605r = AbstractC23136l9.m118742r(18.0f);
        this.f61606s = AbstractC23136l9.m118742r(17.0f);
        this.f61607t = AbstractC23136l9.m118742r(153.0f);
        this.f61608u = AbstractC23136l9.m118742r(129.0f);
        this.f61609v = AbstractC23136l9.m118742r(210.0f);
        this.f61610w = AbstractC23136l9.m118742r(96.0f);
        this.f61611x = AbstractC23136l9.m118742r(165.0f);
        this.f61612y = AbstractC23136l9.m118742r(16.0f);
        this.f61613z = AbstractC23136l9.m118742r(12.0f);
        this.f61591A = AbstractC23136l9.m118742r(8.0f);
        this.f61592B = AbstractC23136l9.m118742r(100.0f);
        this.f61593C = AbstractC23136l9.m118742r(56.0f);
        this.f61594D = AbstractC23136l9.m118742r(20.0f);
        this.f61595E = AbstractC23136l9.m118742r(20.0f);
        this.f61597G = new ArrayList();
        this.f61599I = new int[2];
        this.f61600J = new RectF();
        this.f61601K = new Matrix();
        this.f61602L = new C16658t0.b() { // from class: v60.h
            @Override // com.zing.zalo.uicontrol.C16658t0.b
            /* renamed from: a */
            public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                ChatTagFilterSkeletonView.m65766f(ChatTagFilterSkeletonView.this, c16658t0, rectF);
            }
        };
    }

    /* renamed from: b */
    private final C16719g m65763b(C16719g c16719g) {
        C16719g c16719g2 = new C16719g(getContext());
        c16719g2.m89106L().m89028L(-1, 1).m89023G(c16719g).m89034R(this.f61593C);
        c16719g2.mo89161z0(C23212s8.m119607o(c16719g2.getContext(), AbstractC16781w.ItemSeparatorColor));
        return c16719g2;
    }

    /* renamed from: c */
    private final void m65764c() {
        C16666v0 c16666v0 = new C16666v0(getContext());
        c16666v0.m89106L().m89060k0(this.f61604q).m89030N(this.f61605r).m89032P(this.f61612y, this.f61613z, 0, this.f61591A);
        c16666v0.m88811l1(C23212s8.m119607o(c16666v0.getContext(), AbstractC2807a.ui_background_pressed));
        c16666v0.m88807h1(this.f61592B);
        this.f61597G.add(c16666v0);
        C16716d m65765d = m65765d(c16666v0, AbstractC2807a.ui_background_pressed, this.f61607t, this.f61606s);
        C16716d m65765d2 = m65765d(m65765d, AbstractC2807a.ui_background_pressed, this.f61608u, this.f61606s);
        C16716d m65765d3 = m65765d(m65765d2, AbstractC2807a.ui_background_pressed, this.f61609v, this.f61606s);
        C16716d m65765d4 = m65765d(m65765d3, AbstractC2807a.ui_background_pressed, this.f61610w, this.f61606s);
        C16716d m65765d5 = m65765d(m65765d4, AbstractC2807a.ui_background_pressed, this.f61611x, this.f61606s);
        ModulesView modulesView = this.f61596F;
        if (modulesView != null) {
            modulesView.mo69681L(c16666v0);
        }
        ModulesView modulesView2 = this.f61596F;
        if (modulesView2 != null) {
            modulesView2.mo69681L(m65765d);
        }
        ModulesView modulesView3 = this.f61596F;
        if (modulesView3 != null) {
            modulesView3.mo69681L(m65763b(m65765d));
        }
        ModulesView modulesView4 = this.f61596F;
        if (modulesView4 != null) {
            modulesView4.mo69681L(m65765d2);
        }
        ModulesView modulesView5 = this.f61596F;
        if (modulesView5 != null) {
            modulesView5.mo69681L(m65763b(m65765d2));
        }
        ModulesView modulesView6 = this.f61596F;
        if (modulesView6 != null) {
            modulesView6.mo69681L(m65765d3);
        }
        ModulesView modulesView7 = this.f61596F;
        if (modulesView7 != null) {
            modulesView7.mo69681L(m65763b(m65765d3));
        }
        ModulesView modulesView8 = this.f61596F;
        if (modulesView8 != null) {
            modulesView8.mo69681L(m65765d4);
        }
        ModulesView modulesView9 = this.f61596F;
        if (modulesView9 != null) {
            modulesView9.mo69681L(m65763b(m65765d4));
        }
        ModulesView modulesView10 = this.f61596F;
        if (modulesView10 != null) {
            modulesView10.mo69681L(m65765d5);
        }
    }

    /* renamed from: d */
    private final C16716d m65765d(C16719g c16719g, int i11, int i12, int i13) {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-1, -2).m89023G(c16719g).m89042Z(this.f61612y, this.f61594D, 0, this.f61595E);
        C21693c c21693c = new C21693c(getContext());
        c21693c.m89106L().m89028L(-2, -2).m89027K(true);
        Context context = c21693c.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c21693c.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_tag_horizontal_solid_24, i11));
        C16666v0 c16666v0 = new C16666v0(getContext());
        c16666v0.m89106L().m89060k0(i12).m89030N(i13).m89027K(true).m89034R(this.f61612y).m89054h0(c21693c);
        c16666v0.m88811l1(C23212s8.m119607o(c16666v0.getContext(), i11));
        c16666v0.m88807h1(this.f61592B);
        c16716d.m89001g1(c21693c);
        c16716d.m89001g1(c16666v0);
        this.f61597G.add(c16666v0);
        return c16716d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m65766f(ChatTagFilterSkeletonView chatTagFilterSkeletonView, C16658t0 c16658t0, RectF rectF) {
        Paint paint;
        AbstractC19074t.m100208f(chatTagFilterSkeletonView, "this$0");
        try {
            chatTagFilterSkeletonView.getLocationOnScreen(chatTagFilterSkeletonView.f61599I);
            chatTagFilterSkeletonView.f61600J.setEmpty();
            chatTagFilterSkeletonView.f61601K.reset();
            Matrix matrix = chatTagFilterSkeletonView.f61601K;
            int[] iArr = chatTagFilterSkeletonView.f61599I;
            matrix.setTranslate(-iArr[0], -iArr[1]);
            chatTagFilterSkeletonView.f61601K.mapRect(chatTagFilterSkeletonView.f61600J, rectF);
            Iterator it = chatTagFilterSkeletonView.f61597G.iterator();
            while (it.hasNext()) {
                C16666v0 c16666v0 = (C16666v0) it.next();
                RectF rectF2 = chatTagFilterSkeletonView.f61600J;
                C16658t0 c16658t02 = chatTagFilterSkeletonView.f61598H;
                if (c16658t02 != null) {
                    paint = c16658t02.m88776b();
                } else {
                    paint = null;
                }
                c16666v0.m88810k1(rectF2, paint);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: e */
    public final void m65767e() {
        setOrientation(1);
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC2807a.page_background_03));
        if (this.f61596F == null) {
            ModulesView modulesView = new ModulesView(getContext());
            modulesView.setBackgroundColor(C23212s8.m119607o(modulesView.getContext(), AbstractC2807a.ui_background));
            this.f61596F = modulesView;
            addView(this.f61596F, new LinearLayout.LayoutParams(-1, -2));
        }
        ModulesView modulesView2 = this.f61596F;
        if (modulesView2 != null) {
            modulesView2.mo44090O();
        }
        this.f61597G.clear();
        m65764c();
        requestLayout();
        if (this.f61598H == null) {
            C16658t0 c16658t0 = new C16658t0(getContext());
            Rect rect = new Rect();
            rect.set(0, 0, AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0());
            c16658t0.m88778d(rect);
            c16658t0.m88782h(this.f61602L);
            c16658t0.m88779e(this.f61603p);
            this.f61598H = c16658t0;
        }
        C16658t0 c16658t02 = this.f61598H;
        if (c16658t02 != null) {
            c16658t02.mo88784j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C16658t0 c16658t0 = this.f61598H;
        if (c16658t0 != null) {
            c16658t0.mo88784j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C16658t0 c16658t0 = this.f61598H;
        if (c16658t0 != null) {
            c16658t0.m88785k();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        if (i11 == 0) {
            C16658t0 c16658t0 = this.f61598H;
            if (c16658t0 != null) {
                c16658t0.mo88784j();
                return;
            }
            return;
        }
        C16658t0 c16658t02 = this.f61598H;
        if (c16658t02 != null) {
            c16658t02.m88785k();
        }
    }
}
