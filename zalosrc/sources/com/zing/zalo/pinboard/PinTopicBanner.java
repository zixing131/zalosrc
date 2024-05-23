package com.zing.zalo.pinboard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.pinboard.PinTopicBanner;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import ge.C19411c;
import hd0.C20003a;
import ho0.AbstractC20110a;
import java.util.Calendar;
import kd0.C21693c;
import kd0.C21697g;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p471r3.C25630b;
import p588vw.C28644j;
import p588vw.C28652r;
import vg.C28020b3;

/* loaded from: classes4.dex */
public class PinTopicBanner extends ModulesView {

    /* renamed from: d0 */
    private static String[] f48469d0;

    /* renamed from: K */
    C23528a f48470K;

    /* renamed from: L */
    C3977j f48471L;

    /* renamed from: M */
    C21693c f48472M;

    /* renamed from: N */
    C22126c0 f48473N;

    /* renamed from: O */
    C22126c0 f48474O;

    /* renamed from: P */
    C21697g f48475P;

    /* renamed from: Q */
    C21697g f48476Q;

    /* renamed from: R */
    C21693c f48477R;

    /* renamed from: S */
    C16716d f48478S;

    /* renamed from: T */
    C21697g f48479T;

    /* renamed from: U */
    C21693c f48480U;

    /* renamed from: V */
    C7904b f48481V;

    /* renamed from: W */
    C19411c f48482W;

    /* renamed from: a0 */
    int f48483a0;

    /* renamed from: b0 */
    boolean f48484b0;

    /* renamed from: c0 */
    InterfaceC9046c f48485c0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.pinboard.PinTopicBanner$a */
    /* loaded from: classes4.dex */
    public class C9044a extends C23999j {
        C9044a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null && !c3979l.m18839c().isRecycled()) {
                        PinTopicBanner.this.f48471L.setImageInfo(c3979l, false);
                        PinTopicBanner.this.f48477R.m111929z1(6);
                        PinTopicBanner.this.f48477R.mo111924u1(c3979l.m18839c());
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.pinboard.PinTopicBanner$b */
    /* loaded from: classes4.dex */
    public class C9045b extends C28020b3.b {
        C9045b() {
        }

        @Override // vg.C28020b3.b
        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
            if (c3979l.m18839c() != null) {
                PinTopicBanner.this.f48477R.mo111925v1(new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c()));
            }
        }
    }

    /* renamed from: com.zing.zalo.pinboard.PinTopicBanner$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC9046c {
        /* renamed from: a */
        void mo48430a(C7904b c7904b);

        /* renamed from: b */
        void mo48431b();

        /* renamed from: c */
        void mo48432c(int i11, boolean z11);

        /* renamed from: d */
        void mo48433d(String str, long j11);
    }

    public PinTopicBanner(Context context) {
        super(context);
        this.f48470K = new C23528a(context);
        this.f48471L = new C3977j(context);
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        C16718f m89033Q = c16716d.m89106L().m89028L(-2, -2).m89027K(true).m89029M(12).m89035S(AbstractC23136l9.m118742r(12.0f)).m89034R(AbstractC23136l9.m118742r(12.0f)).m89036T(AbstractC23136l9.m118742r(8.0f)).m89033Q(AbstractC23136l9.m118742r(8.0f));
        Boolean bool = Boolean.TRUE;
        m89033Q.m89073z(bool);
        C21693c c21693c = new C21693c(context);
        this.f48472M = c21693c;
        c21693c.m111929z1(0);
        this.f48472M.m89106L().m89028L(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
        C22126c0 c22126c0 = new C22126c0(context);
        this.f48473N = c22126c0;
        c22126c0.m89106L().m89026J(true);
        this.f48473N.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        this.f48473N.m111962J1(Color.parseColor("#db342e"));
        C22126c0 c22126c02 = new C22126c0(context);
        this.f48474O = c22126c02;
        c22126c02.m89106L().m89023G(this.f48473N).m89026J(true);
        this.f48474O.mo111964L1(AbstractC23136l9.m118742r(20.0f));
        this.f48474O.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        c16716d.m89001g1(this.f48472M);
        c16716d.m89001g1(this.f48473N);
        c16716d.m89001g1(this.f48474O);
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89028L(-2, -2).m89029M(12).m89041Y(AbstractC23136l9.m118742r(12.0f)).m89027K(true).m89017A(bool);
        C16716d c16716d3 = new C16716d(context);
        this.f48478S = c16716d3;
        c16716d3.m89106L().m89028L(-2, -2).m89046b0(AbstractC23136l9.m118742r(8.0f)).m89047c0(AbstractC23136l9.m118742r(8.0f)).m89048d0(AbstractC23136l9.m118742r(2.0f)).m89044a0(AbstractC23136l9.m118742r(2.0f));
        C21697g c21697g = new C21697g(context);
        this.f48479T = c21697g;
        c21697g.m89106L().m89027K(true);
        this.f48479T.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f48479T.m111953A1(1);
        C21697g c21697g2 = this.f48479T;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c21697g2.m111980v1(truncateAt);
        C21693c c21693c2 = new C21693c(context);
        this.f48480U = c21693c2;
        c21693c2.m111929z1(0);
        this.f48480U.m89106L().m89054h0(this.f48479T).m89027K(true).m89028L(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
        this.f48478S.m89001g1(this.f48479T);
        this.f48478S.m89001g1(this.f48480U);
        c16716d2.m89001g1(this.f48478S);
        c16716d2.mo89109M0(new C16719g.c() { // from class: rx.s
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                PinTopicBanner.this.m48420Y(c16719g);
            }
        });
        C16716d c16716d4 = new C16716d(context);
        c16716d4.m89106L().m89028L(-1, -2).m89048d0(AbstractC23136l9.m118742r(8.0f)).m89044a0(AbstractC23136l9.m118742r(8.0f)).m89035S(AbstractC23136l9.m118742r(12.0f)).m89027K(true).m89049e0(c16716d2).m89054h0(c16716d);
        C21693c c21693c3 = new C21693c(context);
        this.f48477R = c21693c3;
        c21693c3.m89106L().m89028L(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f)).m89027K(true).m89017A(bool).m89034R(AbstractC23136l9.m118742r(8.0f));
        this.f48477R.m111929z1(5);
        C21697g c21697g3 = new C21697g(context);
        this.f48475P = c21697g3;
        c21697g3.m89106L().m89073z(bool).m89049e0(this.f48477R);
        this.f48475P.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f48475P.m111953A1(1);
        this.f48475P.m111980v1(truncateAt);
        this.f48475P.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        C21697g c21697g4 = new C21697g(context);
        this.f48476Q = c21697g4;
        c21697g4.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        this.f48476Q.m111953A1(1);
        this.f48476Q.m111980v1(truncateAt);
        this.f48476Q.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        this.f48476Q.m89106L().m89036T(AbstractC23136l9.m118742r(2.0f)).m89073z(bool).m89049e0(this.f48477R).m89023G(this.f48475P);
        c16716d4.m89001g1(this.f48477R);
        c16716d4.m89001g1(this.f48475P);
        c16716d4.m89001g1(this.f48476Q);
        mo69681L(c16716d);
        mo69681L(c16716d2);
        mo69681L(c16716d4);
        C20003a c20003a = new C20003a(c16716d, c16716d4, c16716d2);
        C16719g c16719g = new C16719g(context);
        c16719g.m89106L().m89021E(c20003a).m89068u(c20003a).m89036T(AbstractC23136l9.m118742r(8.0f)).m89033Q(AbstractC23136l9.m118742r(8.0f)).m89049e0(c16716d2).m89028L(AbstractC23136l9.m118742r(1.0f), -2);
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        mo69681L(c16719g);
        setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_group_topic_banner));
        setOnClickListener(new View.OnClickListener() { // from class: rx.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PinTopicBanner.this.m48421a0(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: rx.u
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m48422b0;
                m48422b0 = PinTopicBanner.this.m48422b0(view);
                return m48422b0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m48420Y(C16719g c16719g) {
        InterfaceC9046c interfaceC9046c = this.f48485c0;
        if (interfaceC9046c != null) {
            interfaceC9046c.mo48432c(this.f48483a0, this.f48484b0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m48421a0(View view) {
        InterfaceC9046c interfaceC9046c = this.f48485c0;
        if (interfaceC9046c != null) {
            C7904b c7904b = this.f48481V;
            if (c7904b != null) {
                interfaceC9046c.mo48430a(c7904b);
                return;
            }
            C19411c c19411c = this.f48482W;
            if (c19411c != null) {
                interfaceC9046c.mo48433d(c19411c.f96261a, c19411c.f96262b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ boolean m48422b0(View view) {
        InterfaceC9046c interfaceC9046c = this.f48485c0;
        if (interfaceC9046c != null) {
            interfaceC9046c.mo48431b();
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private void m48423c0() {
        m48424f0();
        m48427i0();
        m48425g0();
        m48426h0();
        if (this.f48483a0 > 1) {
            this.f48479T.mo44614b1(0);
            this.f48479T.m111959G1("+" + (this.f48483a0 - 1));
        } else {
            this.f48479T.mo44614b1(8);
        }
        setStateExpandBtn(this.f48484b0);
    }

    /* renamed from: f0 */
    private void m48424f0() {
        try {
            C7904b c7904b = this.f48481V;
            if (c7904b != null) {
                int i11 = c7904b.f42729a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        this.f48472M.mo44614b1(0);
                                        this.f48473N.mo44614b1(8);
                                        this.f48474O.mo44614b1(8);
                                        this.f48472M.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.ic_default_pin));
                                        return;
                                    }
                                    this.f48472M.mo44614b1(0);
                                    this.f48473N.mo44614b1(8);
                                    this.f48474O.mo44614b1(8);
                                    this.f48472M.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.ic_pinned_album));
                                    return;
                                }
                            } else {
                                this.f48472M.mo44614b1(0);
                                this.f48473N.mo44614b1(8);
                                this.f48474O.mo44614b1(8);
                                this.f48472M.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.ic_poll_color));
                                return;
                            }
                        } else {
                            this.f48472M.mo44614b1(0);
                            this.f48473N.mo44614b1(8);
                            this.f48474O.mo44614b1(8);
                            this.f48472M.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.ic_message));
                            return;
                        }
                    } else {
                        this.f48472M.mo44614b1(0);
                        this.f48473N.mo44614b1(8);
                        this.f48474O.mo44614b1(8);
                        this.f48472M.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.ic_note));
                        return;
                    }
                }
                this.f48472M.mo44614b1(0);
                this.f48473N.mo44614b1(8);
                this.f48474O.mo44614b1(8);
                if (this.f48481V.f42732d > 0) {
                    this.f48472M.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.ic_reminder));
                    return;
                } else {
                    this.f48472M.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.ic_note));
                    return;
                }
            }
            if (this.f48482W != null) {
                this.f48472M.mo44614b1(8);
                this.f48473N.mo44614b1(0);
                this.f48474O.mo44614b1(0);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(this.f48482W.f96262b);
                if (f48469d0 == null) {
                    f48469d0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_months_short);
                }
                this.f48473N.m111959G1(f48469d0[calendar.get(2)].toUpperCase());
                this.f48474O.m111959G1(calendar.get(5) + "");
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: g0 */
    private void m48425g0() {
        StringBuilder sb2 = new StringBuilder();
        C7904b c7904b = this.f48481V;
        if (c7904b != null) {
            if (c7904b.f42729a != 2) {
                sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_created_by), this.f48481V.m40765c()));
            } else {
                sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_message_from), this.f48481V.m40767e()));
            }
        } else if (this.f48482W != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.f48482W.f96262b);
            sb2.append(AbstractC23160o0.m119191F(calendar, true, true));
            if (this.f48482W.f96266f != 1) {
                sb2.append(" (");
                sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_at_time));
                sb2.append(" ");
                sb2.append(AbstractC23160o0.m119202K0(this.f48482W.f96262b, true));
                sb2.append(")");
            }
        }
        if (sb2.length() > 0) {
            this.f48476Q.mo44614b1(0);
            this.f48476Q.m111959G1(sb2.toString());
        } else {
            this.f48476Q.mo44614b1(8);
        }
    }

    /* renamed from: h0 */
    private void m48426h0() {
        try {
            C7904b c7904b = this.f48481V;
            if (c7904b != null && c7904b.f42729a == 2) {
                int i11 = c7904b.f42746r;
                if (i11 != 32 && i11 != 44 && i11 != 49) {
                    switch (i11) {
                        case 36:
                            this.f48477R.mo44614b1(0);
                            this.f48477R.mo111926w1(AbstractC16803z.no_image2);
                            if (!TextUtils.isEmpty(this.f48481V.f42749u)) {
                                C25630b m143282P0 = C28644j.m143233Y().m143282P0(new C25630b(new JSONObject(this.f48481V.f42749u)));
                                if (m143282P0.m132448z()) {
                                    Bitmap m141206w = C28020b3.f130648a.m141206w(m143282P0);
                                    if (m141206w != null) {
                                        this.f48477R.mo111924u1(m141206w);
                                        break;
                                    }
                                } else if (C25630b.m132391I(m143282P0)) {
                                    ((C23528a) this.f48470K.m123612r(this.f48471L)).m123579C(m143282P0.m132444v(), C23278z2.m120122e(), new C9044a());
                                    break;
                                } else {
                                    C28020b3.f130648a.m141182F(this.f48471L, this.f48470K, m143282P0, null, false, new C9045b());
                                    break;
                                }
                            } else {
                                String m40766d = this.f48481V.m40766d();
                                if (!TextUtils.isEmpty(m40766d)) {
                                    AbstractC23268y2.m120033g(this.f48470K, this.f48471L, this.f48477R, m40766d, C23278z2.m120122e(), false);
                                    break;
                                }
                            }
                            break;
                        case 37:
                        case 38:
                            break;
                        default:
                            this.f48477R.mo44614b1(8);
                            break;
                    }
                }
                this.f48477R.mo44614b1(0);
                this.f48477R.mo111926w1(AbstractC16803z.no_image2);
                String m40766d2 = this.f48481V.m40766d();
                if (!TextUtils.isEmpty(m40766d2)) {
                    AbstractC23268y2.m120033g(this.f48470K, this.f48471L, this.f48477R, m40766d2, C23278z2.m120122e(), false);
                } else {
                    this.f48477R.mo44614b1(8);
                }
            } else {
                this.f48477R.mo44614b1(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: i0 */
    private void m48427i0() {
        String m118743r0;
        try {
            C7904b c7904b = this.f48481V;
            if (c7904b != null) {
                int i11 = c7904b.f42729a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3 && i11 != 4 && i11 != 5) {
                                C21697g c21697g = this.f48475P;
                                String str = c7904b.f42736h;
                                if (str != null && !TextUtils.isEmpty(str)) {
                                    m118743r0 = this.f48481V.f42736h;
                                } else {
                                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unsupported_pin_title);
                                }
                                c21697g.m111959G1(m118743r0);
                                return;
                            }
                        } else {
                            this.f48475P.m111959G1(C28652r.m143349v().m143357H(this.f48481V.m40773k()));
                            return;
                        }
                    } else if (TextUtils.isEmpty(c7904b.f42716D)) {
                        this.f48475P.m111959G1(this.f48481V.f42736h);
                        return;
                    } else {
                        this.f48475P.m111959G1(this.f48481V.f42716D);
                        return;
                    }
                }
                this.f48475P.m111959G1(C28652r.m143349v().m143357H(this.f48481V.f42754z));
                return;
            }
            if (this.f48482W != null) {
                this.f48475P.m111959G1(C28652r.m143349v().m143357H(this.f48482W.f96286z));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    private void setStateExpandBtn(boolean z11) {
        if (z11) {
            this.f48478S.m89085A0(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.rounded_border_background_expand_pin_board_blue));
            this.f48479T.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC16781w.AppPrimaryColor));
            this.f48480U.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.ic_chevron_down_activated));
        } else {
            this.f48478S.m89085A0(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.rounded_border_background_expand_pin_board_gray));
            this.f48479T.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor2));
            this.f48480U.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.ic_chevron_down_clicked));
        }
    }

    /* renamed from: d0 */
    public void m48428d0(C7904b c7904b, int i11, boolean z11) {
        this.f48481V = c7904b;
        this.f48482W = null;
        this.f48483a0 = i11;
        this.f48484b0 = z11;
        m48423c0();
    }

    /* renamed from: e0 */
    public void m48429e0(C19411c c19411c, int i11, boolean z11) {
        this.f48481V = null;
        this.f48482W = c19411c;
        this.f48483a0 = i11;
        this.f48484b0 = z11;
        m48423c0();
    }

    public Rect getExpandBtnRect() {
        return new Rect(this.f48478S.m89096G(), 0, this.f48478S.m89096G() + this.f48478S.m89114P(), this.f48478S.m89090D() + this.f48478S.m89112O());
    }

    public void setListener(InterfaceC9046c interfaceC9046c) {
        this.f48485c0 = interfaceC9046c;
    }
}
