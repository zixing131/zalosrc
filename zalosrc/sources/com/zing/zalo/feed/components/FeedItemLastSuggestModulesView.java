package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3055x0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.feed.uicontrols.C8875f;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23999j;
import p379o3.C24003n;

/* loaded from: classes4.dex */
public class FeedItemLastSuggestModulesView extends ModulesView {

    /* renamed from: T */
    private static final int f44429T = AbstractC23136l9.m118742r(64.0f);

    /* renamed from: U */
    private static final int f44430U = AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding);

    /* renamed from: V */
    private static final int f44431V = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left);

    /* renamed from: W */
    private static final int f44432W = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right);

    /* renamed from: a0 */
    private static final int f44433a0 = AbstractC23136l9.m118742r(64.0f);

    /* renamed from: K */
    private C22126c0 f44434K;

    /* renamed from: L */
    private C16716d f44435L;

    /* renamed from: M */
    private C22126c0 f44436M;

    /* renamed from: N */
    private C22126c0 f44437N;

    /* renamed from: O */
    private C11850a f44438O;

    /* renamed from: P */
    private C8875f f44439P;

    /* renamed from: Q */
    private C16719g f44440Q;

    /* renamed from: R */
    private final C23528a f44441R;

    /* renamed from: S */
    private boolean f44442S;

    public FeedItemLastSuggestModulesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f44442S = true;
        this.f44441R = new C23528a(context);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m43775Y(InterfaceC2259a interfaceC2259a, C3055x0 c3055x0, C16719g c16719g) {
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11938V2(c3055x0.f12345h, c3055x0.f12347j, null);
        }
        AbstractC23647d.m123897g("490501");
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m43776a0(InterfaceC2259a interfaceC2259a, C3055x0 c3055x0, View view) {
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11938V2(c3055x0.f12345h, c3055x0.f12347j, null);
        }
        AbstractC23647d.m123897g("490502");
    }

    /* renamed from: b0 */
    private void m43777b0(C3055x0.a aVar) {
        if (aVar != null) {
            try {
                C8875f c8875f = this.f44439P;
                if (c8875f != null) {
                    c8875f.m115413n1();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: d0 */
    private void m43778d0() {
        int i11;
        C16718f m89030N = this.f44434K.m89106L().m89060k0(-2).m89030N(-2);
        Boolean bool = Boolean.TRUE;
        C16718f m89018B = m89030N.m89073z(bool).m89018B(bool);
        int i12 = f44431V;
        C16718f m89034R = m89018B.m89034R(i12);
        int i13 = f44430U;
        m89034R.m89036T(i13).m89033Q(i13);
        this.f44434K.mo111965M1(1);
        this.f44434K.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
        this.f44435L.m89106L().m89060k0(-1).m89030N(-2).m89034R(i12).m89035S(f44432W).m89023G(this.f44434K);
        C16718f m89030N2 = this.f44440Q.m89106L().m89060k0(AbstractC23136l9.m118742r(1.0f)).m89030N(AbstractC23136l9.m118742r(1.0f));
        int i14 = f44433a0;
        m89030N2.m89034R(i14);
        this.f44438O.m89106L().m89060k0(i14).m89030N(i14);
        this.f44438O.m111921r1(true);
        this.f44438O.m65869e2(1);
        this.f44439P.m89106L().m89060k0(i14).m89030N(i14);
        this.f44439P.mo44614b1(8);
        this.f44436M.m89106L().m89060k0(-1).m89030N(-2).m89054h0(this.f44440Q).m89049e0(this.f44437N).m89034R(i13).m89035S(i13);
        this.f44436M.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
        this.f44436M.m111980v1(TextUtils.TruncateAt.END);
        C22126c0 c22126c0 = this.f44436M;
        if (AbstractC23136l9.m118654H0(getContext())) {
            i11 = 2;
        } else {
            i11 = 4;
        }
        c22126c0.m111953A1(i11);
        this.f44436M.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
        AbstractC23022b5.m118023a(this.f44437N, AbstractC8915g0.btnType2_medium);
        this.f44437N.m89106L().m89060k0(-2).m89040X(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_1_w)).m89018B(bool).m89017A(bool).m89029M(15);
        this.f44435L.m89001g1(this.f44440Q);
        this.f44435L.m89001g1(this.f44438O);
        this.f44435L.m89001g1(this.f44439P);
        this.f44435L.m89001g1(this.f44437N);
        this.f44435L.m89001g1(this.f44436M);
        mo69681L(this.f44434K);
        mo69681L(this.f44435L);
    }

    /* renamed from: e0 */
    private void m43779e0() {
        this.f44434K.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f1s));
    }

    /* renamed from: f0 */
    private void m43780f0() {
        this.f44434K.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
        this.f44437N.m89106L().m89046b0(AbstractC23136l9.m118742r(8.0f)).m89047c0(AbstractC23136l9.m118742r(8.0f));
    }

    /* renamed from: X */
    public void m43781X(Context context, int i11) {
        boolean z11;
        mo44090O();
        this.f44434K = new C22126c0(context);
        this.f44435L = new C16716d(context);
        this.f44440Q = new C16719g(context);
        this.f44438O = new C11850a(context);
        this.f44439P = new C8875f(context);
        this.f44436M = new C22126c0(context);
        this.f44437N = new C22126c0(context);
        if (i11 == 1 && AbstractC23136l9.m118654H0(context)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f44442S = z11;
        if (i11 == 0) {
            m43779e0();
        } else if (i11 == 1) {
            m43780f0();
        }
        m43778d0();
    }

    /* renamed from: c0 */
    public void m43782c0(C3000l0 c3000l0, boolean z11, InterfaceC2259a interfaceC2259a) {
        C3055x0 c3055x0;
        String string;
        int i11;
        C24003n m120143n;
        String str;
        if (c3000l0 != null) {
            try {
                c3055x0 = c3000l0.f11879b0;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            c3055x0 = null;
        }
        if (c3055x0 == null) {
            return;
        }
        this.f44434K.m111959G1(c3055x0.f12339b);
        this.f44436M.m111959G1(c3055x0.f12340c);
        this.f44438O.mo44614b1(8);
        this.f44439P.mo44614b1(8);
        if (this.f44442S) {
            int i12 = c3055x0.f12342e;
            if (i12 != 1) {
                if (i12 == 2) {
                    this.f44439P.mo44614b1(0);
                    C3055x0.a aVar = c3055x0.f12341d;
                    if (aVar != null) {
                        this.f44439P.m47353v1(c3000l0.f11895q, aVar.f12348a, aVar.f12353f, f44429T, 1.0f, aVar.f12349b, aVar.f12350c, false);
                        m43777b0(c3055x0.f12341d);
                    }
                }
            } else {
                this.f44438O.mo44614b1(0);
                int i13 = c3055x0.f12343f;
                if (i13 == 1) {
                    i11 = AbstractC16803z.bg_feed;
                } else {
                    i11 = AbstractC16803z.default_avatar;
                }
                if (i13 == 1) {
                    m120143n = C23278z2.m120123e0();
                } else {
                    m120143n = C23278z2.m120143n();
                }
                C11850a c11850a = this.f44438O;
                c11850a.mo111925v1(AbstractC23136l9.m118665N(c11850a.getContext(), i11));
                C3055x0.a aVar2 = c3055x0.f12341d;
                if (aVar2 != null) {
                    str = aVar2.f12353f;
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str) && (C23999j.m125696L2(str, m120143n) || !z11)) {
                    this.f44438O.m115375G1(this.f44441R, str, m120143n);
                }
            }
        }
        if (!TextUtils.isEmpty(c3055x0.f12344g)) {
            string = c3055x0.f12344g;
        } else {
            string = this.f44437N.getContext().getString(AbstractC8020f0.str_title_writeInvitation);
        }
        this.f44437N.m111959G1(string);
        this.f44437N.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.w1

            /* renamed from: q */
            public final /* synthetic */ C3055x0 f45842q;

            public /* synthetic */ C8422w1(C3055x0 c3055x02) {
                r2 = c3055x02;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                FeedItemLastSuggestModulesView.m43775Y(InterfaceC2259a.this, r2, c16719g);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.x1

            /* renamed from: q */
            public final /* synthetic */ C3055x0 f45862q;

            public /* synthetic */ ViewOnClickListenerC8430x1(C3055x0 c3055x02) {
                r2 = c3055x02;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemLastSuggestModulesView.m43776a0(InterfaceC2259a.this, r2, view);
            }
        });
    }
}
