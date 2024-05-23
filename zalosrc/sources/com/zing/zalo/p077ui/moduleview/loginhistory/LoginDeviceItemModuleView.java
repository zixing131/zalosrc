package com.zing.zalo.p077ui.moduleview.loginhistory;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.adapters.C7094i3;
import com.zing.zalo.p077ui.moduleview.loginhistory.LoginDeviceItemModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import hd0.C20003a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p716zh.C32077q6;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class LoginDeviceItemModuleView extends ModulesView {

    /* renamed from: K */
    private final C7094i3.a f64817K;

    /* renamed from: L */
    C16716d f64818L;

    /* renamed from: M */
    C16719g f64819M;

    /* renamed from: N */
    C21693c f64820N;

    /* renamed from: O */
    C16716d f64821O;

    /* renamed from: P */
    C22126c0 f64822P;

    /* renamed from: Q */
    C22126c0 f64823Q;

    /* renamed from: R */
    C22126c0 f64824R;

    /* renamed from: S */
    C22126c0 f64825S;

    /* renamed from: T */
    final int f64826T;

    /* renamed from: U */
    final int f64827U;

    /* renamed from: V */
    final int f64828V;

    /* renamed from: W */
    final int f64829W;

    public LoginDeviceItemModuleView(Context context, C7094i3.a aVar) {
        super(context);
        int m119607o = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
        this.f64826T = m119607o;
        int m119607o2 = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f64827U = m119607o2;
        int m119607o3 = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f64828V = m119607o3;
        this.f64829W = C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor);
        this.f64817K = aVar;
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f64818L = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89046b0(AbstractC23222t7.f112586t).m89047c0(AbstractC23222t7.f112586t).m89039W(AbstractC23222t7.f112553c0).m89029M(12);
        C21693c c21693c = new C21693c(context);
        this.f64820N = c21693c;
        C16718f m89106L = c21693c.m89106L();
        int i11 = AbstractC23222t7.f112528I;
        C16718f m89028L = m89106L.m89028L(i11, i11);
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89027K(true).m89035S(AbstractC23222t7.f112586t);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64825S = c22126c0;
        c22126c0.m89106L().m89028L(-2, -2).m89017A(bool).m89027K(true).m89034R(AbstractC23222t7.f112576o);
        this.f64825S.mo111964L1(AbstractC23222t7.f112576o);
        this.f64825S.m111962J1(m119607o3);
        this.f64825S.mo111965M1(0);
        this.f64825S.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_logged_out));
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64824R = c22126c02;
        C16718f m89029M = c22126c02.m89106L().m89028L(-2, -2).m89040X(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_3_w)).m89017A(bool).m89027K(true).m89034R(AbstractC23222t7.f112576o).m89029M(15);
        int i12 = AbstractC23222t7.f112566j;
        m89029M.m89042Z(i12, 0, i12, 0);
        this.f64824R.m111979u1(true);
        this.f64824R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.logout_title));
        AbstractC23022b5.m118023a(this.f64824R, AbstractC8915g0.btnType3_xsmall);
        C16716d c16716d2 = new C16716d(context);
        this.f64821O = c16716d2;
        c16716d2.m89106L().m89028L(-1, -2).m89054h0(this.f64820N).m89050f0(new C20003a(this.f64825S, this.f64824R)).m89027K(true).m89048d0(AbstractC23222t7.f112556e).m89044a0(AbstractC23222t7.f112556e).m89029M(12);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f64822P = c22126c03;
        c22126c03.m89106L().m89028L(-1, -2);
        this.f64822P.mo111964L1(AbstractC23222t7.f112586t);
        this.f64822P.m111962J1(m119607o2);
        this.f64822P.mo111965M1(0);
        C22126c0 c22126c04 = new C22126c0(context);
        this.f64823Q = c22126c04;
        c22126c04.m89106L().m89028L(-1, -2).m89023G(this.f64822P);
        this.f64823Q.mo111964L1(AbstractC23222t7.f112576o);
        this.f64823Q.m111962J1(m119607o3);
        this.f64823Q.mo111965M1(0);
        this.f64821O.m89001g1(this.f64822P);
        this.f64821O.m89001g1(this.f64823Q);
        this.f64818L.m89001g1(this.f64820N);
        this.f64818L.m89001g1(this.f64825S);
        this.f64818L.m89001g1(this.f64824R);
        this.f64818L.m89001g1(this.f64821O);
        C16719g c16719g = new C16719g(context);
        this.f64819M = c16719g;
        c16719g.mo89161z0(m119607o);
        this.f64819M.m89106L().m89028L(-1, 1).m89023G(this.f64818L).m89054h0(this.f64820N).m89034R(AbstractC23222t7.f112586t);
        mo69681L(this.f64818L);
        mo69681L(this.f64819M);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_bg_white_with_press_state);
        setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m69760a0(C32077q6 c32077q6, C16719g c16719g) {
        C7094i3.a aVar = this.f64817K;
        if (aVar != null) {
            aVar.mo36172Ky(c32077q6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ boolean m69761b0(C32077q6 c32077q6, View view) {
        C7094i3.a aVar = this.f64817K;
        if (aVar != null) {
            aVar.mo36171F4(c32077q6);
            return true;
        }
        return true;
    }

    /* renamed from: X */
    public void m69762X(final C32077q6 c32077q6, boolean z11, int i11) {
        if (c32077q6 != null) {
            try {
                if (c32077q6.f147721n != 0) {
                    this.f64820N.mo44614b1(0);
                    this.f64820N.mo111926w1(c32077q6.f147721n);
                } else {
                    this.f64820N.mo44614b1(4);
                }
                this.f64822P.m111959G1(c32077q6.f147708a);
                CharSequence m69763Y = m69763Y(c32077q6);
                if (m69763Y != null && m69763Y.length() > 0) {
                    this.f64823Q.mo44614b1(0);
                    this.f64823Q.m111959G1(m69763Y);
                } else {
                    this.f64823Q.mo44614b1(8);
                }
                if (c32077q6.f147712e == 1) {
                    this.f64824R.mo44614b1(0);
                    if (TextUtils.isEmpty(c32077q6.f147718k)) {
                        c32077q6.f147718k = AbstractC23136l9.m118743r0(AbstractC8020f0.logout_title);
                    }
                    this.f64824R.m111959G1(c32077q6.f147718k);
                    this.f64824R.mo89109M0(new C16719g.c() { // from class: k80.a
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            LoginDeviceItemModuleView.this.m69760a0(c32077q6, c16719g);
                        }
                    });
                    this.f64825S.mo44614b1(8);
                } else if (c32077q6.f147712e == 0) {
                    this.f64825S.mo44614b1(0);
                    if (TextUtils.isEmpty(c32077q6.f147718k)) {
                        c32077q6.f147718k = AbstractC23136l9.m118743r0(AbstractC8020f0.str_logged_out);
                    }
                    this.f64825S.m111959G1(c32077q6.f147718k);
                    this.f64824R.mo44614b1(8);
                } else {
                    this.f64825S.mo44614b1(8);
                    this.f64824R.mo44614b1(8);
                }
                if (c32077q6.f147722o) {
                    this.f64819M.mo44614b1(0);
                } else {
                    this.f64819M.mo44614b1(8);
                }
                setOnLongClickListener(new View.OnLongClickListener() { // from class: k80.b
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m69761b0;
                        m69761b0 = LoginDeviceItemModuleView.this.m69761b0(c32077q6, view);
                        return m69761b0;
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: Y */
    public CharSequence m69763Y(C32077q6 c32077q6) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            if (!TextUtils.isEmpty(c32077q6.f147711d)) {
                spannableStringBuilder.append((CharSequence) c32077q6.f147711d);
            }
            if (c32077q6.f147714g > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                String m119290t = AbstractC23160o0.m119290t(c32077q6.f147714g, true);
                if (!TextUtils.isEmpty(m119290t)) {
                    if (spannableStringBuilder.length() > 0) {
                        spannableStringBuilder.append((CharSequence) " • ");
                    }
                    int i11 = (int) ((currentTimeMillis - c32077q6.f147714g) / 1000);
                    if (i11 >= 0 && i11 <= 60) {
                        SpannableString spannableString = new SpannableString(m119290t);
                        spannableString.setSpan(new ForegroundColorSpan(this.f64829W), 0, m119290t.length(), 33);
                        spannableStringBuilder.append((CharSequence) spannableString);
                    } else {
                        spannableStringBuilder.append((CharSequence) m119290t);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return spannableStringBuilder;
    }
}
