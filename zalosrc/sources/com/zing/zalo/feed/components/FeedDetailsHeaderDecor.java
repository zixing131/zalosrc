package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import bo.C3011n1;
import bo.C3016o1;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;

/* loaded from: classes4.dex */
public class FeedDetailsHeaderDecor extends ModulesView {

    /* renamed from: O */
    private static final int f44258O = AbstractC23136l9.m118742r(60.0f);

    /* renamed from: K */
    C22122a0 f44259K;

    /* renamed from: L */
    C16716d f44260L;

    /* renamed from: M */
    C22122a0 f44261M;

    /* renamed from: N */
    C22126c0 f44262N;

    public FeedDetailsHeaderDecor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43649Y(context);
    }

    /* renamed from: W */
    private void m43647W(C3016o1 c3016o1, C23528a c23528a) {
        if (c3016o1 != null) {
            this.f44259K.m115375G1(c23528a, c3016o1.f12002b, C23278z2.f112845a.m120171i1());
            C3016o1.a aVar = c3016o1.f12003c;
            if (aVar != null) {
                float m118742r = AbstractC23136l9.m118742r(4.0f);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aVar.f12004a, aVar.f12005b});
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, m118742r, m118742r, m118742r, m118742r, 0.0f, 0.0f});
                this.f44260L.m89085A0(gradientDrawable);
            }
            this.f44261M.m115375G1(c23528a, c3016o1.f12001a, C23278z2.m120146o0());
        }
    }

    /* renamed from: X */
    private C3016o1 m43648X(C3011n1 c3011n1) {
        if (c3011n1 != null) {
            if (C23212s8.m119603k()) {
                return c3011n1.f11986b;
            }
            return c3011n1.f11987c;
        }
        return null;
    }

    /* renamed from: Y */
    private void m43649Y(Context context) {
        C11850a c11850a = new C11850a(context);
        this.f44259K = c11850a;
        c11850a.m89106L().m89060k0(-1).m89030N(-2).m89039W(f44258O);
        this.f44259K.m111929z1(5);
        C16716d c16716d = new C16716d(context);
        this.f44260L = c16716d;
        c16716d.m89106L().m89060k0(-2).m89030N(-2).m89046b0(AbstractC23136l9.m118742r(4.0f)).m89048d0(AbstractC23136l9.m118742r(2.0f)).m89047c0(AbstractC23136l9.m118742r(9.0f)).m89044a0(AbstractC23136l9.m118742r(2.0f)).m89027K(true);
        int m118742r = AbstractC23136l9.m118742r(24.0f);
        C22122a0 c22122a0 = new C22122a0(context);
        this.f44261M = c22122a0;
        c22122a0.m89106L().m89060k0(m118742r).m89030N(m118742r).m89027K(true);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f44262N = c22126c0;
        c22126c0.m89106L().m89060k0(-2).m89030N(-2).m89054h0(this.f44261M).m89034R(AbstractC23136l9.m118742r(6.0f)).m89027K(true);
        this.f44262N.mo111964L1(AbstractC23136l9.m118759w1(14));
        this.f44262N.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
        this.f44262N.m115423S1();
        this.f44262N.mo111965M1(1);
        mo69681L(this.f44259K);
        this.f44260L.m89001g1(this.f44261M);
        this.f44260L.m89001g1(this.f44262N);
        mo69681L(this.f44260L);
    }

    /* renamed from: V */
    public void m43650V(C3011n1 c3011n1, C23528a c23528a) {
        if (c3011n1 == null) {
            return;
        }
        try {
            this.f44262N.m111959G1(c3011n1.f11985a);
            m43647W(m43648X(c3011n1), c23528a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        this.f44259K.mo44614b1(i11);
        this.f44260L.mo44614b1(i11);
        this.f44261M.mo44614b1(i11);
        this.f44262N.mo44614b1(i11);
        super.setVisibility(i11);
    }
}
