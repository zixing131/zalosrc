package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bi0.AbstractC2816j;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ki0.C21736d;
import ki0.C21737e;
import ki0.C21740h;
import ki0.EnumC21741i;
import ri0.C25807a;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27276c;

/* renamed from: com.zing.zalo.zdesign.component.x0 */
/* loaded from: classes7.dex */
public final class C17072x0 extends C21737e implements InterfaceC16976f1 {

    /* renamed from: M0 */
    private C25807a f87358M0;

    /* renamed from: N0 */
    private C21736d f87359N0;

    /* renamed from: O0 */
    private C21740h f87360O0;

    /* renamed from: P0 */
    private int f87361P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17072x0(Context context, EnumC21741i enumC21741i) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(enumC21741i, "size");
        this.f87359N0 = new C21736d(context, enumC21741i);
        this.f87360O0 = new C21740h(context);
        this.f87359N0.m89106L().m89027K(true);
        m91358o1(enumC21741i);
        m89001g1(this.f87359N0);
        m89001g1(this.f87360O0);
        this.f87358M0 = new C25807a(new WeakReference(this));
    }

    /* renamed from: o1 */
    private final void m91358o1(EnumC21741i enumC21741i) {
        if (enumC21741i == EnumC21741i.SMALL) {
            C26707f c26707f = new C26707f(this.f87360O0);
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            c26707f.m137318a(C26705d.m137293a(context, AbstractC2814h.checkbox_text_xsmall));
            C16718f m89028L = this.f87360O0.m89106L().m89028L(-2, -2);
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            m89028L.m89046b0(C27276c.m139649b(context2, 4)).m89054h0(this.f87359N0).m89027K(true);
        } else {
            C26707f c26707f2 = new C26707f(this.f87360O0);
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            c26707f2.m137318a(C26705d.m137293a(context3, AbstractC2814h.checkbox_text_small));
            C16718f m89028L2 = this.f87360O0.m89106L().m89028L(-2, -2);
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "context");
            m89028L2.m89046b0(C27276c.m139649b(context4, 8)).m89054h0(this.f87359N0).m89027K(true);
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "context");
        this.f87361P0 = aVar.m13592a(context5, AbstractC2807a.text_01);
        m91360q1("");
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: M0 */
    public void mo89109M0(C16719g.c cVar) {
        C25807a c25807a = this.f87358M0;
        if (c25807a == null || !c25807a.m133070c(cVar)) {
            super.mo89109M0(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        int i11;
        C21740h c21740h = this.f87360O0;
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        ColorStateList m13593b = aVar.m13593b(context, AbstractC2807a.switch_text_color);
        if (m13593b != null) {
            i11 = m13593b.getColorForState(this.f84794x, this.f87361P0);
        } else {
            i11 = 0;
        }
        c21740h.m111962J1(i11);
        super.mo44775o0(canvas);
    }

    /* renamed from: p1 */
    public final C21736d m91359p1() {
        return this.f87359N0;
    }

    /* renamed from: q1 */
    public final void m91360q1(String str) {
        AbstractC19074t.m100208f(str, "text");
        this.f87360O0.m111959G1(str);
        if (str.length() == 0) {
            this.f87360O0.mo44614b1(8);
        } else {
            this.f87360O0.mo44614b1(0);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25807a c25807a = this.f87358M0;
        if (c25807a != null) {
            c25807a.m133069b(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25807a c25807a = this.f87358M0;
        if (c25807a != null) {
            c25807a.m133071d(c0708i);
        }
    }
}
