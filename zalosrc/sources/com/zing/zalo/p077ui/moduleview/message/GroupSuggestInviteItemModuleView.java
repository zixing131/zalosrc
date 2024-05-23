package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p716zh.C31973j5;
import p716zh.C32020m7;
import rs.C25976a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class GroupSuggestInviteItemModuleView extends MsgItemInfoModulesView {

    /* renamed from: K */
    C16716d f64864K;

    /* renamed from: L */
    C22129e f64865L;

    /* renamed from: M */
    C21693c f64866M;

    /* renamed from: N */
    C3977j f64867N;

    /* renamed from: O */
    C22126c0 f64868O;

    /* renamed from: P */
    C22126c0 f64869P;

    /* renamed from: Q */
    C22126c0 f64870Q;

    /* renamed from: R */
    C22126c0 f64871R;

    /* renamed from: S */
    C23528a f64872S;

    /* renamed from: T */
    int f64873T;

    /* renamed from: U */
    int f64874U;

    /* renamed from: V */
    C25976a.a f64875V;

    public GroupSuggestInviteItemModuleView(Context context, C23528a c23528a, C25976a.a aVar) {
        super(context);
        this.f64872S = c23528a;
        this.f64875V = aVar;
        this.f64873T = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f64874U = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        m88987U(-1, -2);
        setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_contact_bg));
        this.f64867N = new C3977j(context);
        C16716d c16716d = new C16716d(context);
        this.f64864K = c16716d;
        c16716d.m89106L().m89028L(AbstractC23222t7.f112567j0, -2).m89042Z(AbstractC23222t7.f112586t, AbstractC23222t7.f112562h, AbstractC23222t7.f112586t, AbstractC23222t7.f112562h).m89027K(true);
        this.f64865L = new C22129e(context, AbstractC23222t7.f112539R);
        C21693c c21693c = new C21693c(context);
        this.f64866M = c21693c;
        C16718f m89106L = c21693c.m89106L();
        int i11 = AbstractC23222t7.f112586t;
        C16718f m89028L = m89106L.m89028L(i11, i11);
        Boolean bool = Boolean.TRUE;
        m89028L.m89072y(bool).m89017A(bool);
        this.f64866M.m111929z1(5);
        this.f64864K.m89001g1(this.f64865L);
        this.f64864K.m89001g1(this.f64866M);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64870Q = c22126c0;
        c22126c0.m111979u1(true);
        this.f64870Q.m111958F1(AbstractC8020f0.str_tv_addfriend);
        this.f64870Q.m89106L().m89060k0(-2).m89040X(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_3_w)).m89035S(AbstractC23136l9.m118742r(8.0f)).m89029M(15).m89042Z(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
        AbstractC23022b5.m118023a(this.f64870Q, AbstractC8915g0.btnType1_small);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64871R = c22126c02;
        c22126c02.m111962J1(this.f64874U);
        this.f64871R.mo111964L1(AbstractC23222t7.f112580q);
        this.f64871R.m89106L().m89017A(bool).m89034R(AbstractC23222t7.f112572m).m89035S(AbstractC23222t7.f112586t).m89027K(true);
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89028L(-2, -2).m89017A(bool).m89027K(true);
        c16716d2.m89001g1(this.f64870Q);
        c16716d2.m89001g1(this.f64871R);
        C16716d c16716d3 = new C16716d(context);
        c16716d3.m89106L().m89054h0(this.f64864K).m89049e0(c16716d2).m89027K(true).m89029M(12).m89028L(-1, -2);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f64868O = c22126c03;
        c22126c03.m89106L().m89028L(-1, -2);
        this.f64868O.m111953A1(1);
        C22126c0 c22126c04 = this.f64868O;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c04.m111980v1(truncateAt);
        this.f64868O.mo111964L1(AbstractC23222t7.f112586t);
        this.f64868O.m111962J1(this.f64873T);
        C22126c0 c22126c05 = new C22126c0(context);
        this.f64869P = c22126c05;
        c22126c05.m89106L().m89023G(this.f64868O).m89028L(-1, -2);
        this.f64869P.m111953A1(1);
        this.f64869P.m111980v1(truncateAt);
        this.f64869P.mo111964L1(AbstractC23222t7.f112574n);
        this.f64869P.m111962J1(this.f64874U);
        c16716d3.m89001g1(this.f64868O);
        c16716d3.m89001g1(this.f64869P);
        mo69681L(this.f64864K);
        mo69681L(c16716d2);
        mo69681L(c16716d3);
    }

    /* renamed from: W */
    public /* synthetic */ void m69784W(C31973j5 c31973j5, boolean z11, String str, C16719g c16719g) {
        C25976a.a aVar = this.f64875V;
        if (aVar != null && c31973j5 != null) {
            if (z11) {
                aVar.mo67819tl(c31973j5);
            } else {
                aVar.mo67804Gq(str, c31973j5.m153781r());
            }
        }
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
    /* renamed from: w */
    public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
        String str;
        try {
            C31973j5 c31973j5 = c32020m7.f147413d;
            ContactProfile contactProfile = c32020m7.f147411b;
            JSONObject jSONObject = c32020m7.f147424o;
            if (jSONObject != null && jSONObject.has("STR_EXTRA_CONTACT_UID")) {
                str = jSONObject.getString("STR_EXTRA_CONTACT_UID");
            } else {
                str = "";
            }
            boolean z12 = !TextUtils.isEmpty(c32020m7.f147429t);
            if (c31973j5 != null && contactProfile != null) {
                SpannableString spannableString = new SpannableString(c31973j5.m153793y());
                for (int i12 = 0; i12 < contactProfile.f42399a1.size() - 1; i12 += 2) {
                    if (((Integer) contactProfile.f42399a1.get(i12)).intValue() >= 0) {
                        int i13 = i12 + 1;
                        if (((Integer) contactProfile.f42399a1.get(i13)).intValue() > ((Integer) contactProfile.f42399a1.get(i12)).intValue()) {
                            spannableString.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i12)).intValue(), ((Integer) contactProfile.f42399a1.get(i13)).intValue(), 33);
                        }
                    }
                }
                this.f64868O.m111959G1(spannableString);
                if (z12) {
                    this.f64870Q.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_open));
                    AbstractC23022b5.m118023a(this.f64870Q, AbstractC8915g0.btnType2_small);
                    this.f64869P.mo44614b1(0);
                    this.f64869P.m111959G1(c32020m7.f147429t);
                } else {
                    this.f64870Q.m111958F1(AbstractC8020f0.str_tv_addfriend);
                    AbstractC23022b5.m118023a(this.f64870Q, AbstractC8915g0.btnType1_small);
                    this.f64869P.mo44614b1(8);
                }
                this.f64865L.m115437u1(c31973j5);
                this.f64866M.mo44614b1(8);
                this.f64871R.mo44614b1(8);
            }
            this.f64870Q.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.h

                /* renamed from: q */
                public final /* synthetic */ C31973j5 f65041q;

                /* renamed from: r */
                public final /* synthetic */ boolean f65042r;

                /* renamed from: s */
                public final /* synthetic */ String f65043s;

                public /* synthetic */ C12437h(C31973j5 c31973j52, boolean z122, String str2) {
                    r2 = c31973j52;
                    r3 = z122;
                    r4 = str2;
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    GroupSuggestInviteItemModuleView.this.m69784W(r2, r3, r4, c16719g);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
