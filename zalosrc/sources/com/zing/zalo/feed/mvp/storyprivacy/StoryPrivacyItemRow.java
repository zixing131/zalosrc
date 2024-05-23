package com.zing.zalo.feed.mvp.storyprivacy;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.storyprivacy.C8805a;
import com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyItemRow;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C17040q0;
import fn0.AbstractC19074t;
import ki0.C21735c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p401or.C24411a;

/* loaded from: classes4.dex */
public final class StoryPrivacyItemRow extends ModulesView {

    /* renamed from: K */
    private C17040q0 f47121K;

    /* renamed from: L */
    private C22122a0 f47122L;

    /* renamed from: M */
    private C22126c0 f47123M;

    /* renamed from: N */
    private C22126c0 f47124N;

    /* renamed from: O */
    private C22122a0 f47125O;

    /* renamed from: P */
    private C16719g f47126P;

    public StoryPrivacyItemRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m47054Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final void m47053X(StoryPrivacyItemRow storyPrivacyItemRow, C8805a.b bVar, PrivacyInfo privacyInfo, View view) {
        AbstractC19074t.m100208f(storyPrivacyItemRow, "this$0");
        storyPrivacyItemRow.m47055a0(bVar, privacyInfo);
    }

    /* renamed from: Y */
    private final void m47054Y() {
        setPadding(AbstractC23222t7.f112576o, 0, AbstractC23222t7.f112586t, 0);
        setBackgroundResource(AbstractC16803z.stencils_contact_bg);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C17040q0 c17040q0 = new C17040q0(context, C21735c.b.MEDIUM);
        C16718f m89027K = c17040q0.m89106L().m89041Y(AbstractC23222t7.f112556e).m89027K(true);
        Boolean bool = Boolean.TRUE;
        m89027K.m89073z(bool);
        mo69681L(c17040q0);
        this.f47121K = c17040q0;
        C22122a0 c22122a0 = new C22122a0(getContext());
        C16718f m89106L = c22122a0.m89106L();
        int i11 = AbstractC23222t7.f112514B;
        m89106L.m89028L(i11, i11).m89027K(true).m89054h0(this.f47121K).m89034R(AbstractC23222t7.f112576o);
        mo69681L(c22122a0);
        this.f47122L = c22122a0;
        C22122a0 c22122a02 = new C22122a0(getContext());
        c22122a02.m89106L().m89028L(AbstractC23222t7.f112514B, AbstractC23222t7.f112535N).m89041Y(AbstractC23222t7.f112552c).m89027K(true).m89017A(bool);
        c22122a02.mo111926w1(AbstractC16803z.ic_chevron_right_line_24);
        mo69681L(c22122a02);
        this.f47125O = c22122a02;
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89028L(-2, -2).m89054h0(this.f47122L).m89049e0(this.f47125O).m89034R(AbstractC23222t7.f112566j).m89036T(AbstractC23222t7.f112594x).m89018B(bool);
        c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85295f2));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor1));
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        mo69681L(c22126c0);
        this.f47123M = c22126c0;
        C22126c0 c22126c02 = new C22126c0(getContext());
        c22126c02.m89106L().m89028L(-2, -2).m89071x(this.f47123M).m89019C(this.f47123M).m89023G(this.f47123M).m89036T(AbstractC23222t7.f112556e).m89033Q(AbstractC23222t7.f112594x);
        c22126c02.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
        c22126c02.m111962J1(C23212s8.m119607o(c22126c02.getContext(), AbstractC21196a.TextColor2));
        c22126c02.m111953A1(2);
        c22126c02.m111980v1(truncateAt);
        mo69681L(c22126c02);
        this.f47124N = c22126c02;
        C16719g c16719g = new C16719g(getContext());
        c16719g.m89106L().m89028L(-2, AbstractC23222t7.f112548a).m89071x(this.f47122L).m89019C(this.f47125O).m89023G(this.f47124N);
        c16719g.mo89161z0(C23212s8.m119607o(c16719g.getContext(), AbstractC16781w.ItemSeparatorColor));
        mo69681L(c16719g);
        this.f47126P = c16719g;
    }

    /* renamed from: a0 */
    private final void m47055a0(C8805a.b bVar, PrivacyInfo privacyInfo) {
        if (privacyInfo != null && bVar != null) {
            bVar.mo47045a(privacyInfo);
        }
    }

    /* renamed from: W */
    public final void m47056W(C24411a c24411a, final C8805a.b bVar) {
        C21735c c21735c;
        C21735c m91225p1;
        int i11;
        AbstractC19074t.m100208f(c24411a, "item");
        final PrivacyInfo m127668a = c24411a.m127668a();
        C17040q0 c17040q0 = this.f47121K;
        if (c17040q0 != null) {
            c21735c = c17040q0.m91225p1();
        } else {
            c21735c = null;
        }
        if (c21735c != null) {
            c21735c.mo89091D0(c24411a.m127670c());
        }
        if (m127668a != null) {
            C22122a0 c22122a0 = this.f47122L;
            if (c22122a0 != null) {
                c22122a0.mo111926w1(m127668a.m45145m());
            }
            C22126c0 c22126c0 = this.f47123M;
            if (c22126c0 != null) {
                c22126c0.m111959G1(m127668a.m45150u());
            }
            C22126c0 c22126c02 = this.f47124N;
            if (c22126c02 != null) {
                c22126c02.m111959G1(m127668a.m45141h());
            }
        }
        C22122a0 c22122a02 = this.f47125O;
        int i12 = 8;
        if (c22122a02 != null) {
            if (c24411a.m127671d()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c22122a02.mo44614b1(i11);
        }
        C16719g c16719g = this.f47126P;
        if (c16719g != null) {
            if (c24411a.m127672e()) {
                i12 = 0;
            }
            c16719g.mo44614b1(i12);
        }
        setOnClickListener(new View.OnClickListener() { // from class: or.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryPrivacyItemRow.m47053X(StoryPrivacyItemRow.this, bVar, m127668a, view);
            }
        });
        C17040q0 c17040q02 = this.f47121K;
        if (c17040q02 != null) {
            c17040q02.mo89109M0(null);
        }
        C17040q0 c17040q03 = this.f47121K;
        if (c17040q03 != null && (m91225p1 = c17040q03.m91225p1()) != null) {
            m91225p1.mo89093E0(false);
        }
    }
}
