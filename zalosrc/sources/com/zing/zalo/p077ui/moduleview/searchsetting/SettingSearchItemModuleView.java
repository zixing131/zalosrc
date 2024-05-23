package com.zing.zalo.p077ui.moduleview.searchsetting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.adapters.C7251w6;
import com.zing.zalo.p077ui.moduleview.searchsetting.SettingSearchItemModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import kd0.C21693c;
import kd0.C21696f;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23210s6;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p716zh.C32178x9;
import ui0.C27280g;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class SettingSearchItemModuleView extends ModulesView {

    /* renamed from: K */
    private final C7251w6.c f65181K;

    /* renamed from: L */
    C16716d f65182L;

    /* renamed from: M */
    C21693c f65183M;

    /* renamed from: N */
    C16716d f65184N;

    /* renamed from: O */
    C22126c0 f65185O;

    /* renamed from: P */
    C22126c0 f65186P;

    /* renamed from: Q */
    C22126c0 f65187Q;

    /* renamed from: R */
    C21696f f65188R;

    /* renamed from: S */
    C21693c f65189S;

    /* renamed from: T */
    C16719g f65190T;

    /* renamed from: U */
    C16719g f65191U;

    /* renamed from: V */
    final int f65192V;

    /* renamed from: W */
    final int f65193W;

    /* renamed from: a0 */
    final int f65194a0;

    public SettingSearchItemModuleView(Context context, C7251w6.c cVar) {
        super(context);
        int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f65192V = m119607o;
        int m119607o2 = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f65193W = m119607o2;
        int m119607o3 = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
        this.f65194a0 = m119607o3;
        this.f65181K = cVar;
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f65182L = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89046b0(AbstractC23136l9.m118742r(16.0f)).m89047c0(AbstractC23136l9.m118742r(16.0f)).m89039W(AbstractC23136l9.m118742r(52.0f)).m89029M(12);
        C21693c c21693c = new C21693c(context);
        this.f65183M = c21693c;
        C16718f m89028L = c21693c.m89106L().m89028L(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89035S(AbstractC23136l9.m118742r(18.0f)).m89027K(true);
        C21693c c21693c2 = new C21693c(context);
        this.f65189S = c21693c2;
        c21693c2.m89106L().m89028L(AbstractC23136l9.m118742r(34.0f), AbstractC23136l9.m118742r(34.0f)).m89017A(bool).m89027K(true).m89041Y(AbstractC23136l9.m118742r(9.0f));
        C21696f c21696f = new C21696f(context);
        this.f65188R = c21696f;
        c21696f.m89106L().m89028L(-2, -2).m89049e0(this.f65189S).m89034R(AbstractC23136l9.m118742r(8.0f)).m89027K(true);
        this.f65188R.mo89099H0(false);
        this.f65188R.mo44614b1(8);
        C16716d c16716d2 = new C16716d(context);
        this.f65184N = c16716d2;
        c16716d2.m89106L().m89028L(-1, -2).m89054h0(this.f65183M).m89049e0(this.f65188R).m89027K(true).m89048d0(AbstractC23136l9.m118742r(4.0f)).m89044a0(AbstractC23136l9.m118742r(4.0f));
        C22126c0 c22126c0 = new C22126c0(context);
        this.f65185O = c22126c0;
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(16.0f));
        this.f65185O.mo111965M1(0);
        this.f65185O.m111962J1(m119607o);
        this.f65185O.m89106L().m89028L(-1, -2);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f65186P = c22126c02;
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f65186P.mo111965M1(0);
        this.f65186P.m111962J1(m119607o2);
        this.f65186P.m89106L().m89028L(-1, -2).m89023G(this.f65185O);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f65187Q = c22126c03;
        c22126c03.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f65187Q.mo111965M1(0);
        this.f65187Q.m111962J1(m119607o2);
        this.f65187Q.m89106L().m89028L(-1, -2).m89023G(this.f65186P);
        this.f65184N.m89001g1(this.f65185O);
        this.f65184N.m89001g1(this.f65186P);
        this.f65184N.m89001g1(this.f65187Q);
        this.f65182L.m89001g1(this.f65183M);
        this.f65182L.m89001g1(this.f65189S);
        this.f65182L.m89001g1(this.f65188R);
        this.f65182L.m89001g1(this.f65184N);
        C16719g c16719g = new C16719g(context);
        this.f65191U = c16719g;
        c16719g.mo89161z0(m119607o3);
        this.f65191U.m89106L().m89028L(-1, 1).m89066s(this.f65182L).m89034R(AbstractC23136l9.m118742r(16.0f));
        C16719g c16719g2 = new C16719g(context);
        this.f65190T = c16719g2;
        c16719g2.mo89161z0(m119607o3);
        this.f65190T.m89106L().m89028L(-1, 1).m89023G(this.f65182L).m89034R(AbstractC23136l9.m118742r(16.0f)).m89054h0(this.f65183M);
        mo69681L(this.f65191U);
        mo69681L(this.f65182L);
        mo69681L(this.f65190T);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m69953X(C32178x9 c32178x9, C16719g c16719g) {
        C7251w6.c cVar = this.f65181K;
        if (cVar != null) {
            cVar.mo36965sj(c32178x9);
        }
    }

    /* renamed from: W */
    public void m69954W(final C32178x9 c32178x9) {
        if (c32178x9 != null) {
            try {
                this.f65186P.mo44614b1(8);
                this.f65187Q.mo44614b1(8);
                if (!c32178x9.f148378G) {
                    if (c32178x9.f148390x != 0) {
                        C21693c c21693c = this.f65183M;
                        c21693c.mo111925v1(C27280g.m139659b(c21693c.getContext(), c32178x9.f148390x, AbstractC2808b.f150821b60));
                        this.f65183M.mo44614b1(0);
                    } else if (this.f65181K.mo36964as()) {
                        this.f65183M.mo44614b1(4);
                    } else {
                        this.f65183M.mo44614b1(8);
                    }
                    int i11 = c32178x9.f148389w;
                    if (i11 != 0) {
                        this.f65187Q.m111958F1(i11);
                        this.f65187Q.mo44614b1(0);
                    } else {
                        this.f65187Q.mo44614b1(8);
                    }
                    this.f65188R.mo44614b1(8);
                    if (c32178x9.f148377F.isEmpty()) {
                        this.f65185O.m111959G1(c32178x9.f148385s);
                        this.f65185O.mo44614b1(0);
                        this.f65186P.mo44614b1(8);
                    } else if (!TextUtils.isEmpty(c32178x9.f148386t)) {
                        SpannableString spannableString = new SpannableString(c32178x9.f148386t);
                        int size = c32178x9.f148377F.size();
                        for (int i12 = 0; i12 < size - 1; i12 += 2) {
                            if (((Integer) c32178x9.f148377F.get(i12)).intValue() >= 0) {
                                int i13 = i12 + 1;
                                if (((Integer) c32178x9.f148377F.get(i13)).intValue() > ((Integer) c32178x9.f148377F.get(i12)).intValue()) {
                                    spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(getContext(), AbstractC16781w.AppPrimaryColor)), ((Integer) c32178x9.f148377F.get(i12)).intValue(), ((Integer) c32178x9.f148377F.get(i13)).intValue(), 33);
                                }
                            }
                        }
                        this.f65186P.m111959G1(spannableString);
                        this.f65186P.mo44614b1(0);
                        this.f65185O.m111959G1(c32178x9.f148385s);
                        this.f65185O.mo44614b1(0);
                    } else {
                        SpannableString spannableString2 = new SpannableString(c32178x9.f148385s);
                        int size2 = c32178x9.f148377F.size();
                        for (int i14 = 0; i14 < size2 - 1; i14 += 2) {
                            if (((Integer) c32178x9.f148377F.get(i14)).intValue() >= 0) {
                                int i15 = i14 + 1;
                                if (((Integer) c32178x9.f148377F.get(i15)).intValue() > ((Integer) c32178x9.f148377F.get(i14)).intValue()) {
                                    spannableString2.setSpan(new ForegroundColorSpan(C23212s8.m119607o(getContext(), AbstractC16781w.AppPrimaryColor)), ((Integer) c32178x9.f148377F.get(i14)).intValue(), ((Integer) c32178x9.f148377F.get(i15)).intValue(), 33);
                                }
                            }
                        }
                        this.f65185O.m111959G1(spannableString2);
                        this.f65185O.mo44614b1(0);
                        this.f65186P.mo44614b1(8);
                    }
                    this.f65189S.mo44614b1(8);
                } else {
                    this.f65182L.m89106L().m89046b0(AbstractC23136l9.m118742r(16.0f));
                    this.f65190T.m89106L().m89034R(AbstractC23136l9.m118742r(16.0f));
                    this.f65191U.m89106L().m89034R(AbstractC23136l9.m118742r(16.0f));
                    this.f65183M.mo44614b1(8);
                    this.f65185O.m111959G1(c32178x9.f148385s);
                    this.f65189S.mo44614b1(0);
                    this.f65189S.mo111926w1(AbstractC16803z.icn_list_remove);
                    this.f65189S.mo89109M0(new C16719g.c() { // from class: r80.a
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            SettingSearchItemModuleView.this.m69953X(c32178x9, c16719g);
                        }
                    });
                }
                if (c32178x9.f148379H) {
                    this.f65190T.mo44614b1(0);
                } else {
                    this.f65190T.mo44614b1(8);
                }
                if (c32178x9.f148380I) {
                    this.f65191U.mo44614b1(0);
                } else {
                    this.f65191U.mo44614b1(8);
                }
                if (c32178x9.f148381J) {
                    this.f65190T.m89106L().m89034R(0);
                    this.f65190T.mo44614b1(0);
                }
                if (AbstractC23210s6.f112470b && !TextUtils.isEmpty(c32178x9.f148374C)) {
                    this.f65187Q.m111959G1(c32178x9.f148374C);
                    this.f65187Q.mo44614b1(0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
