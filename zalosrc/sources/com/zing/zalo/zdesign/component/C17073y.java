package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bi0.AbstractC2816j;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import ki0.C21733a;
import ki0.C21737e;
import ki0.C21740h;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27276c;

/* renamed from: com.zing.zalo.zdesign.component.y */
/* loaded from: classes7.dex */
public final class C17073y extends C21737e {

    /* renamed from: M0 */
    private C21733a f87362M0;

    /* renamed from: N0 */
    private C21740h f87363N0;

    /* renamed from: O0 */
    private int f87364O0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17073y(Context context) {
        this(context, C21733a.a.MEDIUM);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: o1 */
    private final void m91361o1(C21733a.a aVar) {
        if (aVar == C21733a.a.SMALL) {
            C26707f c26707f = new C26707f(this.f87363N0);
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            c26707f.m137318a(C26705d.m137293a(context, AbstractC2814h.checkbox_text_xsmall));
            C16718f m89028L = this.f87363N0.m89106L().m89028L(-2, -2);
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            m89028L.m89046b0(C27276c.m139649b(context2, 4)).m89054h0(this.f87362M0).m89027K(true);
        } else {
            C26707f c26707f2 = new C26707f(this.f87363N0);
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            c26707f2.m137318a(C26705d.m137293a(context3, AbstractC2814h.checkbox_text_small));
            C16718f m89028L2 = this.f87363N0.m89106L().m89028L(-2, -2);
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "context");
            m89028L2.m89046b0(C27276c.m139649b(context4, 8)).m89054h0(this.f87362M0).m89027K(true);
        }
        AbstractC2816j.a aVar2 = AbstractC2816j.Companion;
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "context");
        this.f87364O0 = aVar2.m13592a(context5, AbstractC2807a.text_01);
        m91363q1("");
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: L0 */
    public void mo89107L0(C16719g.b bVar) {
        this.f87362M0.mo89107L0(bVar);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: M0 */
    public void mo89109M0(C16719g.c cVar) {
        this.f87362M0.mo89109M0(cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        int i11;
        C21740h c21740h = this.f87363N0;
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        ColorStateList m13593b = aVar.m13593b(context, AbstractC2807a.checkbox_text_color);
        if (m13593b != null) {
            i11 = m13593b.getColorForState(this.f84794x, this.f87364O0);
        } else {
            i11 = 0;
        }
        c21740h.m111962J1(i11);
        super.mo44775o0(canvas);
    }

    /* renamed from: p1 */
    public final void m91362p1(boolean z11, boolean z12) {
        this.f87362M0.m112161i1(z11, z12);
    }

    /* renamed from: q1 */
    public final void m91363q1(String str) {
        AbstractC19074t.m100208f(str, "text");
        this.f87363N0.m111959G1(str);
        if (str.length() == 0) {
            this.f87363N0.mo44614b1(8);
        } else {
            this.f87363N0.mo44614b1(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17073y(Context context, C21733a.a aVar) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "size");
        this.f87362M0 = new C21733a(context, aVar);
        this.f87363N0 = new C21740h(context);
        this.f87362M0.m89106L().m89027K(true);
        m91361o1(aVar);
        m89001g1(this.f87362M0);
        m89001g1(this.f87363N0);
    }
}
