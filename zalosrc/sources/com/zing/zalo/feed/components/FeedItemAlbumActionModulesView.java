package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import bo.C2944a;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* loaded from: classes4.dex */
public class FeedItemAlbumActionModulesView extends ModulesView {

    /* renamed from: K */
    C22126c0 f44263K;

    /* renamed from: L */
    C22126c0 f44264L;

    public FeedItemAlbumActionModulesView(Context context) {
        super(context);
    }

    /* renamed from: V */
    public void m43651V(C2944a c2944a) {
        int i11;
        if (c2944a != null) {
            C22126c0 c22126c0 = this.f44263K;
            int i12 = 8;
            if (c22126c0 != null) {
                if (c2944a.m13935d()) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                c22126c0.mo44614b1(i11);
                this.f44263K.m111959G1(c2944a.m13932a());
            }
            C22126c0 c22126c02 = this.f44264L;
            if (c22126c02 != null) {
                if (c2944a.m13934c()) {
                    i12 = 0;
                }
                c22126c02.mo44614b1(i12);
                this.f44264L.m111959G1(c2944a.m13933b());
            }
        }
    }

    /* renamed from: W */
    public void m43652W() {
        this.f44263K = new C22126c0(this.f84675p);
        this.f44264L = new C22126c0(this.f84675p);
        C16716d c16716d = new C16716d(this.f84675p);
        C16718f m89028L = c16716d.m89106L().m89028L(-1, -2);
        int i11 = AbstractC23222t7.f112534M;
        m89028L.m89042Z(i11, 0, i11, AbstractC23222t7.f112514B);
        this.f44263K.m89106L().m89028L(-2, -2).m89036T(AbstractC23222t7.f112514B).m89026J(true);
        this.f44263K.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor2));
        this.f44263K.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85299f6));
        c16716d.m89001g1(this.f44263K);
        this.f44264L.m89106L().m89028L(-2, AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_h)).m89023G(this.f44263K).m89026J(true).m89036T(AbstractC23222t7.f112514B).m89029M(15).m89040X(AbstractC23136l9.m118742r(153.0f)).m89046b0(AbstractC23136l9.m118742r(15.0f)).m89047c0(AbstractC23136l9.m118742r(15.0f));
        this.f44264L.m111979u1(true);
        this.f44264L.m89087B0(AbstractC16803z.bg_btn_type2_small);
        this.f44264L.m111963K1(AbstractC23136l9.m118645D(this.f84675p, AbstractC16803z.bg_btn_type2_text));
        this.f44264L.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f44264L.mo111965M1(1);
        c16716d.m89001g1(this.f44264L);
        mo69681L(c16716d);
    }

    public FeedItemAlbumActionModulesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
