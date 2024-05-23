package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.res.AbstractC1401h;
import bi0.AbstractC2809c;
import bi0.AbstractC2814h;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import fi0.C18954a;
import fi0.C18955b;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ki0.C21737e;
import ki0.C21738f;
import ki0.C21740h;
import ri0.C25807a;
import ti0.C26705d;
import ti0.C26707f;

/* renamed from: com.zing.zalo.zdesign.component.o */
/* loaded from: classes7.dex */
public class C17023o extends C21737e implements InterfaceC16976f1 {

    /* renamed from: M0 */
    private C25807a f87073M0;

    /* renamed from: N0 */
    private final C21740h f87074N0;

    /* renamed from: O0 */
    private C21738f f87075O0;

    /* renamed from: P0 */
    private C21738f f87076P0;

    /* renamed from: Q0 */
    private Drawable f87077Q0;

    /* renamed from: R0 */
    private int f87078R0;

    /* renamed from: S0 */
    private int f87079S0;

    /* renamed from: T0 */
    private int f87080T0;

    /* renamed from: U0 */
    private Drawable f87081U0;

    /* renamed from: V0 */
    private ColorStateList f87082V0;

    /* renamed from: W0 */
    private int f87083W0;

    /* renamed from: X0 */
    private int f87084X0;

    /* renamed from: Y0 */
    private int f87085Y0;

    /* renamed from: Z0 */
    private int f87086Z0;

    /* renamed from: a1 */
    private int f87087a1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17023o(Context context) {
        this(context, AbstractC2814h.ButtonMedium_Primary);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: p1 */
    private final void m91108p1() {
        int m91163c;
        int i11 = this.f87080T0;
        if (i11 == ((int) getContext().getResources().getDimension(AbstractC2809c.btn_large_height))) {
            m91163c = EnumC17025p.BUTTON_SIZE_LARGE.m91163c();
        } else if (i11 == ((int) getContext().getResources().getDimension(AbstractC2809c.btn_medium_height))) {
            m91163c = EnumC17025p.BUTTON_SIZE_MEDIUM.m91163c();
        } else if (i11 == ((int) getContext().getResources().getDimension(AbstractC2809c.btn_small_height))) {
            m91163c = EnumC17025p.BUTTON_SIZE_SMALL.m91163c();
        } else {
            m91163c = EnumC17025p.BUTTON_SIZE_LARGE.m91163c();
        }
        this.f87087a1 = m91163c;
    }

    /* renamed from: s1 */
    private final void m91109s1() {
        int i11;
        Drawable drawable = this.f87081U0;
        if (drawable != null) {
            ColorStateList colorStateList = this.f87082V0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            if (this.f87085Y0 == EnumC17020n.TRAILING.m91100c()) {
                C16718f m89106L = this.f87076P0.m89106L();
                int i12 = this.f87083W0;
                m89106L.m89028L(i12, i12).m89034R(this.f87084X0);
                this.f87076P0.mo111925v1(drawable);
                this.f87075O0.mo44614b1(8);
                this.f87076P0.mo44614b1(0);
            } else {
                C16718f m89106L2 = this.f87075O0.m89106L();
                int i13 = this.f87083W0;
                m89106L2.m89028L(i13, i13).m89035S(this.f87084X0);
                this.f87075O0.mo111925v1(drawable);
                this.f87075O0.mo44614b1(0);
                this.f87076P0.mo44614b1(8);
            }
        } else {
            this.f87075O0.mo44614b1(8);
            this.f87074N0.m89106L().m89034R(0);
        }
        CharSequence m111973m1 = this.f87074N0.m111973m1();
        AbstractC19074t.m100207e(m111973m1, "textModule.text");
        if (m111973m1.length() == 0) {
            this.f87075O0.m89106L().m89035S(0);
            C21738f c21738f = this.f87075O0;
            if (drawable != null) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c21738f.mo44614b1(i11);
            this.f87076P0.mo44614b1(8);
            C16718f m89106L3 = m89106L();
            int i14 = this.f87078R0;
            m89106L3.m89042Z(i14, 0, i14, 0);
            return;
        }
        this.f87075O0.m89106L().m89035S(this.f87084X0);
        C16718f m89106L4 = m89106L();
        int i15 = this.f87079S0;
        m89106L4.m89042Z(i15, 0, i15, 0);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: M0 */
    public void mo89109M0(C16719g.c cVar) {
        C25807a c25807a = this.f87073M0;
        if (c25807a == null || !c25807a.m133070c(cVar)) {
            super.mo89109M0(cVar);
        }
    }

    /* renamed from: o1 */
    public final void m91110o1(int i11) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        new C26707f(this.f87074N0).m137318a(C26705d.m137293a(context, i11));
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        C18954a m99467a = C18955b.m99467a(context2, i11);
        if (m99467a.m99454e() != null) {
            m89106L().f84708d = m99467a.m99454e().intValue();
        }
        if (m99467a.m99453d() != null) {
            m89106L().f84709e = m99467a.m99453d().intValue();
        }
        if (m99467a.m99455f() != null) {
            m89106L().f84728x = m99467a.m99455f().intValue();
        }
        if (m99467a.m99456g() != null) {
            m89106L().f84727w = m99467a.m99456g().intValue();
        }
        if (m99467a.m99458i() != null) {
            m89106L().f84716l = m99467a.m99458i().intValue();
        }
        if (m99467a.m99460k() != null) {
            m89106L().f84717m = m99467a.m99460k().intValue();
        }
        if (m99467a.m99459j() != null) {
            m89106L().f84718n = m99467a.m99459j().intValue();
        }
        if (m99467a.m99457h() != null) {
            m89106L().f84719o = m99467a.m99457h().intValue();
        }
        Integer m99463n = m99467a.m99463n();
        if (m99463n != null) {
            dimensionPixelSize = m99463n.intValue();
        } else {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(AbstractC2809c.btn_padding_medium_no_text);
        }
        this.f87078R0 = dimensionPixelSize;
        Integer m99458i = m99467a.m99458i();
        if (m99458i != null) {
            dimensionPixelSize2 = m99458i.intValue();
        } else {
            dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(AbstractC2809c.btn_large_padding_left);
        }
        this.f87079S0 = dimensionPixelSize2;
        Drawable m99450a = m99467a.m99450a();
        this.f87077Q0 = m99450a;
        if (m99450a != null) {
            m99450a.setState(this.f84794x);
        }
        m89085A0(this.f87077Q0);
        Drawable drawable = this.f87081U0;
        if (drawable == null) {
            drawable = m99467a.m99461l();
        }
        this.f87081U0 = drawable;
        this.f87082V0 = m99467a.m99466q();
        this.f87083W0 = m99467a.m99465p();
        this.f87084X0 = m99467a.m99462m();
        this.f87085Y0 = m99467a.m99464o();
        this.f87086Z0 = m99467a.m99452c();
        this.f87080T0 = m99467a.m99451b();
        m91109s1();
        m91108p1();
    }

    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        super.mo44180q0(i11, i12, i13, i14);
        int m89112O = m89112O();
        int i15 = this.f87080T0;
        if (m89112O != i15 && i15 != 0) {
            m89106L().m89028L(m89114P(), this.f87080T0);
        }
    }

    /* renamed from: q1 */
    public final void m91111q1(int i11) {
        m91112r1(AbstractC1401h.m7082f(getContext().getResources(), i11, getContext().getTheme()));
    }

    /* renamed from: r1 */
    public final void m91112r1(Drawable drawable) {
        this.f87081U0 = drawable;
        if (drawable != null) {
            drawable.setState(this.f84794x);
        }
        m91109s1();
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25807a c25807a = this.f87073M0;
        if (c25807a != null) {
            c25807a.m133069b(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25807a c25807a = this.f87073M0;
        if (c25807a != null) {
            c25807a.m133071d(c0708i);
        }
    }

    /* renamed from: t1 */
    public final void m91113t1(EnumC17020n enumC17020n) {
        AbstractC19074t.m100208f(enumC17020n, "pos");
        if (this.f87085Y0 == enumC17020n.m91100c()) {
            return;
        }
        this.f87085Y0 = enumC17020n.m91100c();
        m91109s1();
    }

    /* renamed from: u1 */
    public final void m91114u1(int i11) {
        this.f87074N0.m111958F1(i11);
        CharSequence m111973m1 = this.f87074N0.m111973m1();
        AbstractC19074t.m100207e(m111973m1, "textModule.text");
        if (m111973m1.length() == 0) {
            C16718f m89106L = m89106L();
            int i12 = this.f87078R0;
            m89106L.m89042Z(i12, 0, i12, 0);
        } else {
            C16718f m89106L2 = m89106L();
            int i13 = this.f87079S0;
            m89106L2.m89042Z(i13, 0, i13, 0);
        }
    }

    /* renamed from: v1 */
    public final void m91115v1(CharSequence charSequence) {
        this.f87074N0.m111959G1(charSequence);
        CharSequence m111973m1 = this.f87074N0.m111973m1();
        AbstractC19074t.m100207e(m111973m1, "textModule.text");
        if (m111973m1.length() == 0) {
            C16718f m89106L = m89106L();
            int i11 = this.f87078R0;
            m89106L.m89042Z(i11, 0, i11, 0);
        } else {
            C16718f m89106L2 = m89106L();
            int i12 = this.f87079S0;
            m89106L2.m89042Z(i12, 0, i12, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17023o(Context context, int i11) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m89106L().m89028L(-2, -2).m89029M(15);
        C21738f c21738f = new C21738f(context);
        this.f87075O0 = c21738f;
        c21738f.mo44614b1(8);
        this.f87075O0.m89106L().m89027K(true);
        this.f87075O0.m111929z1(0);
        C21740h c21740h = new C21740h(context);
        this.f87074N0 = c21740h;
        c21740h.mo44614b1(0);
        c21740h.m89106L().m89028L(-2, -2).m89054h0(this.f87075O0).m89027K(true);
        c21740h.m111957E1(true);
        c21740h.m111953A1(1);
        c21740h.m111980v1(TextUtils.TruncateAt.END);
        C21738f c21738f2 = new C21738f(context);
        this.f87076P0 = c21738f2;
        c21738f2.mo44614b1(8);
        this.f87076P0.m89106L().m89054h0(c21740h).m89027K(true);
        this.f87076P0.m111929z1(0);
        m89001g1(this.f87075O0);
        m89001g1(c21740h);
        m89001g1(this.f87076P0);
        m91110o1(i11);
        this.f87073M0 = new C25807a(new WeakReference(this));
    }
}
