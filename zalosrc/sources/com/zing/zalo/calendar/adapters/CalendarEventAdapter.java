package com.zing.zalo.calendar.adapters;

import ae.C0766k;
import ae.InterfaceC0765j;
import am.C0943w;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7192r2;
import com.zing.zalo.calendar.adapters.CalendarEventAdapter;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import ee.C18408p;
import ee.C18415w;
import ge.C19409a;
import ge.C19411c;
import ge.C19412d;
import ge.C19418j;
import gg0.AbstractC19444a;
import hd0.C20003a;
import hd0.C20005c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import kd0.C21692b;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22138m;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23188q6;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import p716zh.C31973j5;

/* loaded from: classes3.dex */
public class CalendarEventAdapter extends RecyclerView.AbstractC1880g implements C7192r2.b {

    /* renamed from: A */
    final Drawable f40276A;

    /* renamed from: B */
    final int f40277B;

    /* renamed from: C */
    final int f40278C;

    /* renamed from: D */
    final Drawable f40279D;

    /* renamed from: r */
    public volatile List f40284r;

    /* renamed from: s */
    public InterfaceC7417h f40285s;

    /* renamed from: t */
    Context f40286t;

    /* renamed from: w */
    InterfaceC27218a f40289w;

    /* renamed from: x */
    final int f40290x;

    /* renamed from: y */
    final int f40291y;

    /* renamed from: z */
    final int f40292z;

    /* renamed from: v */
    int f40288v = 0;

    /* renamed from: E */
    final String f40280E = AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_event_accept);

    /* renamed from: F */
    final String f40281F = AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_event_decline);

    /* renamed from: G */
    final String f40282G = AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_attend_confirm);

    /* renamed from: H */
    private C7418i f40283H = null;

    /* renamed from: u */
    public int f40287u = m37633L();

    /* loaded from: classes3.dex */
    public static class HeaderEventView extends ModulesView implements InterfaceC7410a {

        /* renamed from: K */
        C22126c0 f40293K;

        /* renamed from: L */
        C22138m f40294L;

        /* renamed from: M */
        C23528a f40295M;

        public HeaderEventView(Context context) {
            super(context);
            this.f40295M = new C23528a(context);
            m88987U(-1, AbstractC23222t7.f112595x0);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f40293K = c22126c0;
            c22126c0.mo111964L1(AbstractC23222t7.f112514B);
            this.f40293K.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
            this.f40293K.mo111965M1(1);
            this.f40293K.m89106L().m89072y(Boolean.TRUE).m89033Q(AbstractC23222t7.f112590v).m89034R(AbstractC23222t7.f112586t).m89028L(-2, -2);
            C22138m c22138m = new C22138m(context, AbstractC23222t7.f112595x0, 2.0f);
            this.f40294L = c22138m;
            mo69681L(c22138m);
            mo69681L(this.f40293K);
        }

        /* renamed from: V */
        public void m37642V(int i11) {
            this.f40294L.m115472p1(getTop(), i11);
        }

        @Override // com.zing.zalo.calendar.adapters.CalendarEventAdapter.InterfaceC7410a
        /* renamed from: g */
        public void mo37643g(C19412d c19412d, boolean z11) {
            try {
                C19411c c19411c = c19412d.f96320b;
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTimeInMillis(c19411c.f96262b);
                this.f40293K.m111959G1(AbstractC23136l9.m118755v0(AbstractC16775v.array_months_full)[gregorianCalendar.get(2)].toUpperCase());
                this.f40294L.m115471o1((String) AbstractC23188q6.m119484b().get(gregorianCalendar.get(2) % AbstractC23188q6.m119484b().size()));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.CalendarEventAdapter$a */
    /* loaded from: classes3.dex */
    private interface InterfaceC7410a {
        /* renamed from: g */
        void mo37643g(C19412d c19412d, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calendar.adapters.CalendarEventAdapter$b */
    /* loaded from: classes3.dex */
    public static class C7411b extends RecyclerView.AbstractC1876c0 implements InterfaceC7410a {
        public C7411b(View view) {
            super(view);
        }

        @Override // com.zing.zalo.calendar.adapters.CalendarEventAdapter.InterfaceC7410a
        /* renamed from: g */
        public void mo37643g(C19412d c19412d, boolean z11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calendar.adapters.CalendarEventAdapter$c */
    /* loaded from: classes3.dex */
    public class C7412c extends ModulesView implements InterfaceC7410a {

        /* renamed from: K */
        C21693c f40296K;

        /* renamed from: L */
        C22126c0 f40297L;

        /* renamed from: M */
        C22126c0 f40298M;

        /* renamed from: N */
        C22126c0 f40299N;

        /* renamed from: O */
        C22126c0 f40300O;

        /* renamed from: P */
        C22126c0 f40301P;

        /* renamed from: Q */
        C22126c0 f40302Q;

        /* renamed from: R */
        C22126c0 f40303R;

        /* renamed from: S */
        C16716d f40304S;

        /* renamed from: T */
        C16716d f40305T;

        /* renamed from: U */
        C22126c0 f40306U;

        /* renamed from: V */
        C22126c0 f40307V;

        /* renamed from: W */
        C16716d f40308W;

        /* renamed from: a0 */
        C21692b f40309a0;

        /* renamed from: b0 */
        C22126c0 f40310b0;

        /* renamed from: c0 */
        boolean f40311c0;

        /* renamed from: d0 */
        boolean f40312d0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.calendar.adapters.CalendarEventAdapter$c$a */
        /* loaded from: classes3.dex */
        public class a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ String f40314a;

            /* renamed from: b */
            final /* synthetic */ int f40315b;

            a(String str, int i11) {
                this.f40314a = str;
                this.f40315b = i11;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                if (c20096c != null) {
                    try {
                        String m104492d = c20096c.m104492d();
                        if (!TextUtils.isEmpty(m104492d)) {
                            ToastUtils.showMess(m104492d);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
                C18408p.m97474Q().f92822a.remove(this.f40314a);
                C7412c c7412c = C7412c.this;
                c7412c.f40312d0 = false;
                c7412c.m37658k0(this.f40315b);
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                C18408p.m97474Q().f92822a.remove(this.f40314a);
                C7412c.this.f40312d0 = false;
            }
        }

        public C7412c(Context context) {
            super(context);
            this.f40311c0 = false;
            this.f40312d0 = false;
            m88987U(-1, -2);
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89048d0(AbstractC23222t7.f112586t).m89028L(AbstractC23136l9.m118742r(112.0f), -2);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f40297L = c22126c0;
            c22126c0.mo111964L1(AbstractC23222t7.f112582r);
            this.f40297L.m89106L().m89034R(AbstractC23222t7.f112586t).m89028L(-2, -2);
            C22126c0 c22126c02 = new C22126c0(context);
            this.f40303R = c22126c02;
            c22126c02.mo111964L1(AbstractC23222t7.f112586t);
            C16718f m89106L = this.f40303R.m89106L();
            Boolean bool = Boolean.TRUE;
            m89106L.m89017A(bool).m89035S(AbstractC23222t7.f112562h).m89028L(-2, -2);
            C21693c c21693c = new C21693c(context);
            this.f40296K = c21693c;
            c21693c.m89106L().m89073z(bool).m89070w(this.f40297L).m89034R(AbstractC23222t7.f112556e).m89028L(AbstractC23222t7.f112566j, AbstractC23222t7.f112572m);
            this.f40296K.mo111925v1(CalendarEventAdapter.this.f40276A);
            this.f40296K.m111929z1(0);
            C22126c0 c22126c03 = new C22126c0(context);
            this.f40298M = c22126c03;
            c22126c03.mo111964L1(AbstractC23222t7.f112582r);
            this.f40298M.m89106L().m89071x(this.f40297L).m89023G(this.f40297L).m89036T(AbstractC23222t7.f112562h).m89028L(-2, -2);
            C22126c0 c22126c04 = new C22126c0(context);
            this.f40299N = c22126c04;
            c22126c04.mo111964L1(AbstractC23222t7.f112576o);
            this.f40299N.m111962J1(CalendarEventAdapter.this.f40291y);
            this.f40299N.m89106L().m89071x(this.f40297L).m89019C(this.f40303R).m89023G(this.f40298M).m89036T(AbstractC23222t7.f112562h).m89028L(-2, -2);
            c16716d.m89001g1(this.f40297L);
            c16716d.m89001g1(this.f40303R);
            c16716d.m89001g1(this.f40296K);
            c16716d.m89001g1(this.f40298M);
            c16716d.m89001g1(this.f40299N);
            C16716d c16716d2 = new C16716d(context);
            this.f40304S = c16716d2;
            c16716d2.m89106L().m89054h0(c16716d).m89048d0(AbstractC23222t7.f112586t).m89047c0(AbstractC23222t7.f112586t).m89028L(-1, -2);
            C22126c0 c22126c05 = new C22126c0(context);
            this.f40300O = c22126c05;
            c22126c05.m111953A1(3);
            this.f40300O.mo111964L1(AbstractC23222t7.f112586t);
            C22126c0 c22126c06 = this.f40300O;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c06.m111980v1(truncateAt);
            this.f40300O.m89106L().m89028L(-1, -2);
            C22126c0 c22126c07 = new C22126c0(context);
            this.f40301P = c22126c07;
            c22126c07.mo111964L1(AbstractC23222t7.f112582r);
            this.f40301P.m111953A1(1);
            this.f40301P.m111980v1(truncateAt);
            this.f40301P.m89106L().m89023G(this.f40300O).m89048d0(AbstractC23222t7.f112556e).m89028L(-1, -2);
            C22126c0 c22126c08 = new C22126c0(context);
            this.f40302Q = c22126c08;
            c22126c08.mo111964L1(AbstractC23222t7.f112582r);
            this.f40302Q.m111953A1(1);
            this.f40302Q.m111980v1(truncateAt);
            this.f40302Q.m89106L().m89023G(this.f40301P).m89048d0(AbstractC23222t7.f112556e).m89028L(-1, -2);
            this.f40304S.m89001g1(this.f40300O);
            this.f40304S.m89001g1(this.f40301P);
            this.f40304S.m89001g1(this.f40302Q);
            C16716d c16716d3 = new C16716d(context);
            this.f40305T = c16716d3;
            c16716d3.m89106L().m89036T(AbstractC23222t7.f112586t).m89024H(new C20003a(c16716d, this.f40304S)).m89041Y(AbstractC23222t7.f112550b).m89026J(true).m89028L(-1, -2);
            C20005c c20005c = new C20005c();
            c20005c.m103822e(0.5f);
            C22126c0 c22126c09 = new C22126c0(context);
            this.f40307V = c22126c09;
            c22126c09.m89106L().m89052g0(c20005c).m89035S(AbstractC23222t7.f112566j).m89029M(15).m89028L(-2, -2).m89042Z(AbstractC23222t7.f112514B, AbstractC23222t7.f112562h, AbstractC23222t7.f112514B, AbstractC23222t7.f112562h);
            this.f40307V.m111953A1(1);
            this.f40307V.m111980v1(truncateAt);
            this.f40307V.mo111964L1(AbstractC23222t7.f112582r);
            this.f40307V.m111959G1(CalendarEventAdapter.this.f40281F);
            this.f40307V.m111962J1(CalendarEventAdapter.this.f40290x);
            this.f40307V.mo111965M1(0);
            this.f40307V.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_type3_big));
            C22126c0 c22126c010 = new C22126c0(context);
            this.f40306U = c22126c010;
            c22126c010.m89106L().m89058j0(c20005c).m89034R(AbstractC23222t7.f112566j).m89029M(15).m89028L(-2, -2).m89042Z(AbstractC23222t7.f112514B, AbstractC23222t7.f112562h, AbstractC23222t7.f112514B, AbstractC23222t7.f112562h);
            this.f40306U.m111953A1(1);
            this.f40306U.m111980v1(truncateAt);
            this.f40306U.mo111964L1(AbstractC23222t7.f112582r);
            this.f40306U.m111959G1(CalendarEventAdapter.this.f40280E);
            this.f40306U.m111962J1(CalendarEventAdapter.this.f40277B);
            this.f40306U.mo111965M1(0);
            this.f40306U.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_type2_big));
            this.f40305T.m89001g1(this.f40307V);
            this.f40305T.m89001g1(this.f40306U);
            C16716d c16716d4 = new C16716d(context);
            this.f40308W = c16716d4;
            c16716d4.m89106L().m89071x(this.f40304S).m89023G(this.f40305T).m89036T(AbstractC23222t7.f112586t).m89028L(-2, -2);
            C21692b c21692b = new C21692b(context);
            this.f40309a0 = c21692b;
            C16718f m89035S = c21692b.m89106L().m89027K(true).m89035S(AbstractC23222t7.f112562h);
            int i11 = AbstractC23222t7.f112586t;
            m89035S.m89028L(i11, i11);
            this.f40309a0.m111908h1(CalendarEventAdapter.this.f40279D);
            C22126c0 c22126c011 = new C22126c0(context);
            this.f40310b0 = c22126c011;
            c22126c011.m89106L().m89027K(true).m89054h0(this.f40309a0).m89028L(-2, -2);
            this.f40310b0.mo111964L1(AbstractC23222t7.f112582r);
            this.f40310b0.m111962J1(CalendarEventAdapter.this.f40291y);
            this.f40308W.m89001g1(this.f40309a0);
            this.f40308W.m89001g1(this.f40310b0);
            C16719g c16719g = new C16719g(context);
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            c16719g.m89106L().m89023G(this.f40308W).m89036T(AbstractC23222t7.f112586t).m89028L(-1, AbstractC23222t7.f112548a);
            mo69681L(c16716d);
            mo69681L(this.f40304S);
            mo69681L(this.f40305T);
            mo69681L(this.f40308W);
            mo69681L(c16719g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d0 */
        public /* synthetic */ void m37650d0(C19411c c19411c, C16719g c16719g) {
            C19411c.a aVar;
            String str;
            try {
                if (!this.f40311c0 && c19411c.f96285y.f96250b != 1 && (aVar = c19411c.f96281u) != null && c19411c.f96277q == 2) {
                    int i11 = c19411c.f96279s;
                    if (i11 == 1) {
                        str = aVar.f96287a;
                    } else {
                        if (i11 != 4 && i11 != 5) {
                            str = null;
                        }
                        str = c19411c.f96261a;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        m37656c0(str, 1, c19411c.f96285y.f96250b, c19411c.f96278r);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e0 */
        public /* synthetic */ void m37651e0(C19411c c19411c, C16719g c16719g) {
            C19411c.a aVar;
            String str;
            try {
                if (!this.f40311c0 && c19411c.f96285y.f96250b != 2 && (aVar = c19411c.f96281u) != null && c19411c.f96277q == 2) {
                    int i11 = c19411c.f96279s;
                    if (i11 == 1) {
                        str = aVar.f96287a;
                    } else {
                        if (i11 != 4 && i11 != 5) {
                            str = null;
                        }
                        str = c19411c.f96261a;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        m37656c0(str, 2, c19411c.f96285y.f96250b, c19411c.f96278r);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f0 */
        public /* synthetic */ void m37652f0(C19411c c19411c, View view) {
            boolean z11;
            CalendarEventAdapter calendarEventAdapter = CalendarEventAdapter.this;
            InterfaceC27218a interfaceC27218a = calendarEventAdapter.f40289w;
            if (calendarEventAdapter.f40288v == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C18415w.m97598k(interfaceC27218a, c19411c, z11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g0 */
        public static /* synthetic */ void m37653g0(String str, InterfaceC0765j interfaceC0765j, int i11, String str2) {
            C18408p.m97474Q().f92823b.add(str);
            interfaceC0765j.mo1512Pa(Long.parseLong(str), i11, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h0 */
        public /* synthetic */ void m37654h0() {
            try {
                this.f40305T.mo44614b1(8);
                this.f40308W.mo44614b1(0);
                this.f40309a0.mo44614b1(0);
                this.f40310b0.m111959G1(CalendarEventAdapter.this.f40282G);
                invalidate();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i0 */
        public /* synthetic */ void m37655i0() {
            try {
                this.f40305T.mo44614b1(0);
                this.f40308W.mo44614b1(8);
                invalidate();
                this.f40311c0 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: c0 */
        void m37656c0(final String str, final int i11, int i12, final String str2) {
            try {
                if (TextUtils.isEmpty(str) || this.f40312d0) {
                    return;
                }
                this.f40312d0 = true;
                C18408p.m97474Q().f92822a.put(str, Integer.valueOf(i11));
                m37657j0(i11);
                final C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a(str, i12));
                AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.calendar.adapters.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        CalendarEventAdapter.C7412c.m37653g0(str, c0766k, i11, str2);
                    }
                }, 300L);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0467  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x031e A[Catch: Exception -> 0x006e, TRY_ENTER, TryCatch #0 {Exception -> 0x006e, blocks: (B:3:0x0002, B:8:0x0008, B:10:0x0013, B:11:0x0108, B:15:0x012d, B:17:0x0131, B:21:0x0247, B:25:0x024f, B:28:0x0254, B:30:0x0266, B:31:0x030a, B:34:0x031e, B:40:0x032a, B:42:0x032e, B:44:0x0332, B:46:0x0336, B:48:0x0340, B:49:0x034d, B:51:0x0353, B:52:0x0347, B:54:0x036b, B:56:0x036f, B:58:0x0373, B:60:0x0388, B:61:0x0393, B:63:0x0399, B:64:0x03a8, B:66:0x03b2, B:67:0x038d, B:68:0x03bd, B:70:0x03c6, B:71:0x03d0, B:73:0x03d4, B:75:0x03d8, B:77:0x03e8, B:78:0x03f3, B:80:0x03f9, B:81:0x03ed, B:82:0x0408, B:84:0x0412, B:85:0x041c, B:87:0x0425, B:89:0x042d, B:90:0x0436, B:92:0x043c, B:93:0x0432, B:94:0x045e, B:96:0x0464, B:97:0x0469, B:101:0x0278, B:102:0x027f, B:106:0x0287, B:107:0x029d, B:108:0x02be, B:109:0x02d4, B:110:0x02f5, B:111:0x013d, B:115:0x0145, B:116:0x0151, B:118:0x0155, B:120:0x0159, B:123:0x015f, B:125:0x0163, B:127:0x0181, B:128:0x0173, B:130:0x019d, B:132:0x01c1, B:134:0x01c5, B:136:0x01e3, B:139:0x01f0, B:140:0x01f6, B:141:0x020c, B:142:0x01d5, B:144:0x0222, B:145:0x022d, B:146:0x011d, B:148:0x0121, B:149:0x0238, B:150:0x0071, B:152:0x0091, B:153:0x00cd), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0425 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:3:0x0002, B:8:0x0008, B:10:0x0013, B:11:0x0108, B:15:0x012d, B:17:0x0131, B:21:0x0247, B:25:0x024f, B:28:0x0254, B:30:0x0266, B:31:0x030a, B:34:0x031e, B:40:0x032a, B:42:0x032e, B:44:0x0332, B:46:0x0336, B:48:0x0340, B:49:0x034d, B:51:0x0353, B:52:0x0347, B:54:0x036b, B:56:0x036f, B:58:0x0373, B:60:0x0388, B:61:0x0393, B:63:0x0399, B:64:0x03a8, B:66:0x03b2, B:67:0x038d, B:68:0x03bd, B:70:0x03c6, B:71:0x03d0, B:73:0x03d4, B:75:0x03d8, B:77:0x03e8, B:78:0x03f3, B:80:0x03f9, B:81:0x03ed, B:82:0x0408, B:84:0x0412, B:85:0x041c, B:87:0x0425, B:89:0x042d, B:90:0x0436, B:92:0x043c, B:93:0x0432, B:94:0x045e, B:96:0x0464, B:97:0x0469, B:101:0x0278, B:102:0x027f, B:106:0x0287, B:107:0x029d, B:108:0x02be, B:109:0x02d4, B:110:0x02f5, B:111:0x013d, B:115:0x0145, B:116:0x0151, B:118:0x0155, B:120:0x0159, B:123:0x015f, B:125:0x0163, B:127:0x0181, B:128:0x0173, B:130:0x019d, B:132:0x01c1, B:134:0x01c5, B:136:0x01e3, B:139:0x01f0, B:140:0x01f6, B:141:0x020c, B:142:0x01d5, B:144:0x0222, B:145:0x022d, B:146:0x011d, B:148:0x0121, B:149:0x0238, B:150:0x0071, B:152:0x0091, B:153:0x00cd), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0464 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:3:0x0002, B:8:0x0008, B:10:0x0013, B:11:0x0108, B:15:0x012d, B:17:0x0131, B:21:0x0247, B:25:0x024f, B:28:0x0254, B:30:0x0266, B:31:0x030a, B:34:0x031e, B:40:0x032a, B:42:0x032e, B:44:0x0332, B:46:0x0336, B:48:0x0340, B:49:0x034d, B:51:0x0353, B:52:0x0347, B:54:0x036b, B:56:0x036f, B:58:0x0373, B:60:0x0388, B:61:0x0393, B:63:0x0399, B:64:0x03a8, B:66:0x03b2, B:67:0x038d, B:68:0x03bd, B:70:0x03c6, B:71:0x03d0, B:73:0x03d4, B:75:0x03d8, B:77:0x03e8, B:78:0x03f3, B:80:0x03f9, B:81:0x03ed, B:82:0x0408, B:84:0x0412, B:85:0x041c, B:87:0x0425, B:89:0x042d, B:90:0x0436, B:92:0x043c, B:93:0x0432, B:94:0x045e, B:96:0x0464, B:97:0x0469, B:101:0x0278, B:102:0x027f, B:106:0x0287, B:107:0x029d, B:108:0x02be, B:109:0x02d4, B:110:0x02f5, B:111:0x013d, B:115:0x0145, B:116:0x0151, B:118:0x0155, B:120:0x0159, B:123:0x015f, B:125:0x0163, B:127:0x0181, B:128:0x0173, B:130:0x019d, B:132:0x01c1, B:134:0x01c5, B:136:0x01e3, B:139:0x01f0, B:140:0x01f6, B:141:0x020c, B:142:0x01d5, B:144:0x0222, B:145:0x022d, B:146:0x011d, B:148:0x0121, B:149:0x0238, B:150:0x0071, B:152:0x0091, B:153:0x00cd), top: B:2:0x0002 }] */
        @Override // com.zing.zalo.calendar.adapters.CalendarEventAdapter.InterfaceC7410a
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo37643g(C19412d c19412d, boolean z11) {
            C19418j c19418j;
            C19411c.b bVar;
            String str;
            String str2;
            String str3;
            C19411c.a aVar;
            String str4;
            C19411c.a aVar2;
            C19411c.a.e eVar;
            String str5;
            if (c19412d != null) {
                try {
                    final C19411c c19411c = c19412d.f96320b;
                    if (c19411c != null) {
                        int m101529d = c19411c.m101529d();
                        if (m101529d == 0) {
                            AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_bg_calendar_intime_with_press_state);
                            this.f40296K.mo44614b1(0);
                            this.f40297L.mo111965M1(1);
                            this.f40297L.m111962J1(CalendarEventAdapter.this.f40290x);
                            this.f40298M.mo111965M1(1);
                            this.f40298M.m111962J1(CalendarEventAdapter.this.f40290x);
                            this.f40300O.mo111965M1(1);
                            this.f40300O.m111962J1(CalendarEventAdapter.this.f40290x);
                            this.f40301P.mo111965M1(1);
                            this.f40301P.m111962J1(CalendarEventAdapter.this.f40290x);
                            this.f40302Q.mo111965M1(1);
                            this.f40302Q.m111962J1(CalendarEventAdapter.this.f40290x);
                            this.f40303R.m111962J1(CalendarEventAdapter.this.f40290x);
                        } else {
                            AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_bg_calendar_with_press_state);
                            this.f40296K.mo44614b1(8);
                            this.f40297L.mo111965M1(0);
                            this.f40298M.mo111965M1(0);
                            this.f40301P.mo111965M1(0);
                            this.f40302Q.mo111965M1(0);
                            if (m101529d == -1) {
                                this.f40297L.m111962J1(CalendarEventAdapter.this.f40291y);
                                this.f40298M.m111962J1(CalendarEventAdapter.this.f40291y);
                                this.f40300O.mo111965M1(0);
                                this.f40300O.m111962J1(CalendarEventAdapter.this.f40291y);
                                this.f40301P.m111962J1(CalendarEventAdapter.this.f40291y);
                                this.f40302Q.m111962J1(CalendarEventAdapter.this.f40291y);
                                this.f40303R.m111962J1(CalendarEventAdapter.this.f40292z);
                            } else {
                                this.f40297L.m111962J1(CalendarEventAdapter.this.f40291y);
                                this.f40298M.m111962J1(CalendarEventAdapter.this.f40291y);
                                this.f40300O.mo111965M1(1);
                                this.f40300O.m111962J1(CalendarEventAdapter.this.f40290x);
                                this.f40301P.m111962J1(CalendarEventAdapter.this.f40290x);
                                this.f40302Q.m111962J1(CalendarEventAdapter.this.f40290x);
                                this.f40303R.m111962J1(CalendarEventAdapter.this.f40290x);
                            }
                        }
                        int m101530e = c19411c.m101530e();
                        if (c19411c.f96262b > System.currentTimeMillis()) {
                            if ((m101530e == 2 || m101530e == 4) && c19411c.f96260B != 0) {
                                this.f40305T.mo44614b1(8);
                                this.f40308W.mo44614b1(8);
                            } else if (c19411c.f96271k != null) {
                                this.f40305T.mo44614b1(8);
                                this.f40308W.mo44614b1(8);
                            } else {
                                int i11 = c19411c.f96279s;
                                if (i11 != 1 && i11 != 4 && i11 != 5) {
                                    this.f40305T.mo44614b1(8);
                                    this.f40308W.mo44614b1(8);
                                } else {
                                    C19409a c19409a = c19411c.f96285y;
                                    if (c19409a != null && c19409a.f96249a) {
                                        if (c19409a.f96250b == 0) {
                                            if ((i11 == 1 && c19411c.f96281u != null && C18408p.m97474Q().f92822a.containsKey(c19411c.f96281u.f96287a)) || C18408p.m97474Q().f92822a.containsKey(c19411c.f96261a)) {
                                                this.f40305T.mo44614b1(8);
                                                this.f40308W.mo44614b1(0);
                                                this.f40309a0.mo44614b1(0);
                                                this.f40310b0.m111959G1(CalendarEventAdapter.this.f40282G);
                                                this.f40311c0 = true;
                                            } else {
                                                this.f40305T.mo44614b1(0);
                                                this.f40308W.mo44614b1(8);
                                                this.f40311c0 = false;
                                                this.f40306U.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.calendar.adapters.a
                                                    @Override // com.zing.zalo.uidrawing.C16719g.c
                                                    /* renamed from: y */
                                                    public final void mo929y(C16719g c16719g) {
                                                        CalendarEventAdapter.C7412c.this.m37650d0(c19411c, c16719g);
                                                    }
                                                });
                                                this.f40307V.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.calendar.adapters.b
                                                    @Override // com.zing.zalo.uidrawing.C16719g.c
                                                    /* renamed from: y */
                                                    public final void mo929y(C16719g c16719g) {
                                                        CalendarEventAdapter.C7412c.this.m37651e0(c19411c, c16719g);
                                                    }
                                                });
                                            }
                                        } else if ((i11 == 1 && c19411c.f96281u != null && C18408p.m97474Q().f92823b.contains(c19411c.f96281u.f96287a)) || C18408p.m97474Q().f92823b.contains(c19411c.f96261a)) {
                                            this.f40305T.mo44614b1(8);
                                            int i12 = c19411c.f96285y.f96250b;
                                            if (i12 != 1) {
                                                if (i12 != 2) {
                                                    this.f40308W.mo44614b1(8);
                                                } else {
                                                    this.f40308W.mo44614b1(0);
                                                    this.f40309a0.mo44614b1(8);
                                                    this.f40310b0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_attend_decline_new));
                                                }
                                            } else {
                                                this.f40308W.mo44614b1(0);
                                                this.f40309a0.mo44614b1(8);
                                                this.f40310b0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_attend_accept_new));
                                            }
                                        } else {
                                            this.f40305T.mo44614b1(8);
                                            this.f40308W.mo44614b1(8);
                                        }
                                    } else {
                                        this.f40305T.mo44614b1(8);
                                        this.f40308W.mo44614b1(8);
                                    }
                                }
                            }
                        } else {
                            this.f40305T.mo44614b1(8);
                            this.f40308W.mo44614b1(8);
                        }
                        if (m101530e != 3 && m101530e != 4 && c19411c.f96266f != 1) {
                            if (m101530e != 2 && c19411c.f96260B == -1) {
                                this.f40297L.m111959G1(AbstractC23160o0.m119202K0(c19411c.f96262b, true));
                                this.f40299N.mo44614b1(8);
                                if (m101530e == 1) {
                                    this.f40298M.mo44614b1(0);
                                    this.f40298M.m111959G1(AbstractC23160o0.m119202K0(c19411c.f96263c, true));
                                } else {
                                    this.f40298M.mo44614b1(8);
                                }
                                this.f40300O.m111959G1(c19411c.f96286z);
                                this.f40301P.mo44614b1(8);
                                if (CalendarEventAdapter.this.f40288v == 0) {
                                    int i13 = c19411c.f96279s;
                                    if (i13 != 1 && i13 != 4 && i13 != 5) {
                                        if (i13 == 3) {
                                            if (c19411c.f96275o != null && (aVar2 = c19411c.f96281u) != null && (eVar = aVar2.f96289c) != null) {
                                                if (CoreUtility.f89233i.equals(eVar.f96308c)) {
                                                    str5 = c19411c.f96281u.f96289c.f96309d;
                                                } else {
                                                    str5 = c19411c.f96281u.f96289c.f96307b;
                                                }
                                                if (!TextUtils.isEmpty(str5)) {
                                                    this.f40301P.mo44614b1(0);
                                                    this.f40301P.m111959G1(AbstractC23136l9.m118746s0(AbstractC8020f0.str_with_sb, str5));
                                                }
                                            }
                                        } else if (i13 == 2 && (aVar = c19411c.f96281u) != null && aVar.f96288b != null) {
                                            StringBuilder sb2 = new StringBuilder();
                                            C31973j5 m4473g = C0943w.m4462l().m4473g(c19411c.f96281u.f96288b.f96301a);
                                            if (m4473g != null) {
                                                str4 = m4473g.m153793y();
                                            } else {
                                                str4 = c19411c.f96281u.f96288b.f96302b;
                                            }
                                            if (!TextUtils.isEmpty(str4)) {
                                                sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in));
                                                sb2.append(" ");
                                                sb2.append(str4);
                                            }
                                            String sb3 = sb2.toString();
                                            if (!TextUtils.isEmpty(sb3)) {
                                                this.f40301P.mo44614b1(0);
                                                this.f40301P.m111959G1(sb3);
                                            }
                                        }
                                    }
                                    StringBuilder sb4 = new StringBuilder();
                                    InviteContactProfile inviteContactProfile = c19411c.f96275o;
                                    if (inviteContactProfile != null) {
                                        sb4.append(inviteContactProfile.m40485u1());
                                        sb4.append(" ");
                                    }
                                    C19411c.a aVar3 = c19411c.f96281u;
                                    if (aVar3 != null && aVar3.f96288b != null) {
                                        C31973j5 m4473g2 = C0943w.m4462l().m4473g(c19411c.f96281u.f96288b.f96301a);
                                        if (m4473g2 != null) {
                                            str3 = m4473g2.m153793y();
                                        } else {
                                            str3 = c19411c.f96281u.f96288b.f96302b;
                                        }
                                        if (!TextUtils.isEmpty(str3)) {
                                            sb4.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in));
                                            sb4.append(" ");
                                            sb4.append(str3);
                                        }
                                    }
                                    String sb5 = sb4.toString();
                                    if (!TextUtils.isEmpty(sb5)) {
                                        this.f40301P.mo44614b1(0);
                                        this.f40301P.m111959G1(sb5);
                                    }
                                }
                                this.f40302Q.mo44614b1(8);
                                c19418j = c19411c.f96284x;
                                if (c19418j != null) {
                                    if (TextUtils.isEmpty(c19418j.f96341c)) {
                                        str2 = c19411c.f96284x.f96342d;
                                    } else {
                                        str2 = c19411c.f96284x.f96341c;
                                    }
                                    if (!TextUtils.isEmpty(str2)) {
                                        this.f40302Q.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_at) + " " + str2);
                                        this.f40302Q.mo44614b1(0);
                                    }
                                }
                                C22126c0 c22126c0 = this.f40303R;
                                bVar = c19411c.f96282v;
                                if (bVar != null) {
                                    str = bVar.f96314a;
                                } else {
                                    str = "";
                                }
                                c22126c0.m111959G1(str);
                                setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.calendar.adapters.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        CalendarEventAdapter.C7412c.this.m37652f0(c19411c, view);
                                    }
                                });
                            }
                            int i14 = c19411c.f96260B;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 != 2) {
                                        this.f40297L.m111959G1(AbstractC23160o0.m119202K0(c19411c.f96262b, true));
                                        this.f40298M.mo44614b1(8);
                                        this.f40299N.mo44614b1(8);
                                    } else {
                                        this.f40297L.m111959G1(AbstractC23160o0.m119202K0(c19411c.f96263c, true));
                                        this.f40298M.mo44614b1(8);
                                        this.f40299N.mo44614b1(0);
                                        this.f40299N.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_multidays_event_end));
                                    }
                                } else {
                                    this.f40297L.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_calendar_event_allday));
                                    this.f40298M.mo44614b1(8);
                                    this.f40299N.mo44614b1(8);
                                }
                            } else {
                                this.f40297L.m111959G1(AbstractC23160o0.m119202K0(c19411c.f96262b, true));
                                this.f40298M.mo44614b1(8);
                                this.f40299N.mo44614b1(0);
                                this.f40299N.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_multidays_event_begin));
                            }
                            this.f40300O.m111959G1(c19411c.f96286z);
                            this.f40301P.mo44614b1(8);
                            if (CalendarEventAdapter.this.f40288v == 0) {
                            }
                            this.f40302Q.mo44614b1(8);
                            c19418j = c19411c.f96284x;
                            if (c19418j != null) {
                            }
                            C22126c0 c22126c02 = this.f40303R;
                            bVar = c19411c.f96282v;
                            if (bVar != null) {
                            }
                            c22126c02.m111959G1(str);
                            setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.calendar.adapters.c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    CalendarEventAdapter.C7412c.this.m37652f0(c19411c, view);
                                }
                            });
                        }
                        this.f40297L.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_calendar_event_allday));
                        this.f40298M.mo44614b1(8);
                        this.f40299N.mo44614b1(8);
                        this.f40300O.m111959G1(c19411c.f96286z);
                        this.f40301P.mo44614b1(8);
                        if (CalendarEventAdapter.this.f40288v == 0) {
                        }
                        this.f40302Q.mo44614b1(8);
                        c19418j = c19411c.f96284x;
                        if (c19418j != null) {
                        }
                        C22126c0 c22126c022 = this.f40303R;
                        bVar = c19411c.f96282v;
                        if (bVar != null) {
                        }
                        c22126c022.m111959G1(str);
                        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.calendar.adapters.c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                CalendarEventAdapter.C7412c.this.m37652f0(c19411c, view);
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        /* renamed from: j0 */
        void m37657j0(int i11) {
            this.f40311c0 = true;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.calendar.adapters.e
                @Override // java.lang.Runnable
                public final void run() {
                    CalendarEventAdapter.C7412c.this.m37654h0();
                }
            });
        }

        /* renamed from: k0 */
        void m37658k0(int i11) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.calendar.adapters.f
                @Override // java.lang.Runnable
                public final void run() {
                    CalendarEventAdapter.C7412c.this.m37655i0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calendar.adapters.CalendarEventAdapter$d */
    /* loaded from: classes3.dex */
    public static class C7413d extends ModulesView implements InterfaceC7410a {
        public C7413d(Context context) {
            super(context);
            m88987U(-1, AbstractC23136l9.m118742r(80.0f));
            AbstractC23136l9.m118699c1(this, C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
        }

        @Override // com.zing.zalo.calendar.adapters.CalendarEventAdapter.InterfaceC7410a
        /* renamed from: g */
        public void mo37643g(C19412d c19412d, boolean z11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calendar.adapters.CalendarEventAdapter$e */
    /* loaded from: classes3.dex */
    public static class C7414e extends C7411b {

        /* renamed from: I */
        ModulesView f40317I;

        public C7414e(ModulesView modulesView) {
            super(modulesView);
            this.f40317I = modulesView;
        }

        @Override // com.zing.zalo.calendar.adapters.CalendarEventAdapter.C7411b, com.zing.zalo.calendar.adapters.CalendarEventAdapter.InterfaceC7410a
        /* renamed from: g */
        public void mo37643g(C19412d c19412d, boolean z11) {
            ViewParent viewParent = this.f40317I;
            if (viewParent instanceof InterfaceC7410a) {
                ((InterfaceC7410a) viewParent).mo37643g(c19412d, z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calendar.adapters.CalendarEventAdapter$f */
    /* loaded from: classes3.dex */
    public static class C7415f extends ModulesView implements InterfaceC7410a {
        public C7415f(Context context) {
            super(context);
            setVisibility(8);
        }

        @Override // com.zing.zalo.calendar.adapters.CalendarEventAdapter.InterfaceC7410a
        /* renamed from: g */
        public void mo37643g(C19412d c19412d, boolean z11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calendar.adapters.CalendarEventAdapter$g */
    /* loaded from: classes3.dex */
    public class C7416g extends ModulesView implements InterfaceC7410a {

        /* renamed from: K */
        C21693c f40318K;

        /* renamed from: L */
        C22126c0 f40319L;

        /* renamed from: M */
        public InterfaceC7417h f40320M;

        public C7416g(Context context) {
            super(context);
            m88987U(-1, AbstractC23222t7.f112525G0);
            AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_bg_calendar_with_press_state);
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89025I(true);
            C21693c c21693c = new C21693c(context);
            this.f40318K = c21693c;
            c21693c.m111929z1(0);
            C16718f m89106L = this.f40318K.m89106L();
            int i11 = AbstractC23222t7.f112581q0;
            m89106L.m89028L(i11, i11).m89026J(true).m89041Y(10);
            this.f40318K.mo111926w1(AbstractC16803z.icn_calendar_empty);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f40319L = c22126c0;
            c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_event_in_month));
            this.f40319L.mo111964L1(AbstractC23222t7.f112582r);
            this.f40319L.m111962J1(CalendarEventAdapter.this.f40291y);
            this.f40319L.m89106L().m89026J(true).m89023G(this.f40318K);
            c16716d.m89001g1(this.f40318K);
            c16716d.m89001g1(this.f40319L);
            mo69681L(c16716d);
            setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.calendar.adapters.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CalendarEventAdapter.C7416g.this.m37660W(view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public /* synthetic */ void m37660W(View view) {
            InterfaceC7417h interfaceC7417h = this.f40320M;
            if (interfaceC7417h != null) {
                interfaceC7417h.mo37661a();
            }
        }

        @Override // com.zing.zalo.calendar.adapters.CalendarEventAdapter.InterfaceC7410a
        /* renamed from: g */
        public void mo37643g(C19412d c19412d, boolean z11) {
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.CalendarEventAdapter$h */
    /* loaded from: classes3.dex */
    public interface InterfaceC7417h {
        /* renamed from: a */
        void mo37661a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calendar.adapters.CalendarEventAdapter$i */
    /* loaded from: classes3.dex */
    public class C7418i extends ModulesView implements InterfaceC7410a {

        /* renamed from: K */
        C22126c0 f40322K;

        public C7418i(Context context) {
            super(context);
            m88987U(-1, -2);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f40322K = c22126c0;
            c22126c0.mo111964L1(AbstractC23222t7.f112582r);
            this.f40322K.m111980v1(TextUtils.TruncateAt.END);
            this.f40322K.m111953A1(1);
            C16718f m89028L = this.f40322K.m89106L().m89028L(-1, -2);
            int i11 = AbstractC23222t7.f112586t;
            int i12 = AbstractC23222t7.f112572m;
            m89028L.m89042Z(i11, i12, i12, i12);
            mo69681L(this.f40322K);
            AbstractC23136l9.m118699c1(this, CalendarEventAdapter.this.f40278C);
        }

        @Override // com.zing.zalo.calendar.adapters.CalendarEventAdapter.InterfaceC7410a
        /* renamed from: g */
        public void mo37643g(C19412d c19412d, boolean z11) {
            try {
                C19411c c19411c = c19412d.f96320b;
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTimeInMillis(c19411c.f96262b);
                String str = "";
                if (AbstractC23160o0.m119233a(gregorianCalendar, Calendar.getInstance()) == 0) {
                    str = "" + AbstractC23136l9.m118743r0(AbstractC8020f0.str_today) + " • ";
                    this.f40322K.m111962J1(CalendarEventAdapter.this.f40277B);
                    this.f40322K.mo111965M1(1);
                } else {
                    this.f40322K.m111962J1(CalendarEventAdapter.this.f40291y);
                    this.f40322K.mo111965M1(0);
                }
                this.f40322K.m111959G1(str + AbstractC23160o0.m119195H(gregorianCalendar, true, false, false, false));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calendar.adapters.CalendarEventAdapter$j */
    /* loaded from: classes3.dex */
    public class C7419j extends ModulesView implements InterfaceC7410a {

        /* renamed from: K */
        C22126c0 f40324K;

        /* renamed from: L */
        C22126c0 f40325L;

        /* renamed from: M */
        C22126c0 f40326M;

        /* renamed from: N */
        C21693c f40327N;

        /* renamed from: O */
        C16716d f40328O;

        /* renamed from: P */
        public InterfaceC7417h f40329P;

        /* renamed from: Q */
        final Calendar f40330Q;

        public C7419j(Context context) {
            super(context);
            this.f40330Q = new GregorianCalendar();
            m88987U(-1, -2);
            AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_bg_calendar_with_press_state);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f40326M = c22126c0;
            c22126c0.mo89161z0(CalendarEventAdapter.this.f40278C);
            this.f40326M.mo111964L1(AbstractC23222t7.f112582r);
            this.f40326M.mo111965M1(1);
            C16718f m89106L = this.f40326M.m89106L();
            int i11 = AbstractC23222t7.f112586t;
            int i12 = AbstractC23222t7.f112572m;
            m89106L.m89042Z(i11, i12, i12, i12).m89028L(-1, -2);
            C16716d c16716d = new C16716d(context);
            this.f40328O = c16716d;
            c16716d.m89087B0(AbstractC16803z.stencils_bg_white_with_press_state);
            C16718f m89106L2 = this.f40328O.m89106L();
            int i13 = AbstractC23222t7.f112586t;
            m89106L2.m89042Z(0, i13, i13, i13).m89023G(this.f40326M).m89028L(-1, -2);
            C21693c c21693c = new C21693c(context);
            this.f40327N = c21693c;
            c21693c.mo111926w1(AbstractC16803z.icn_calendar_emptyevent);
            this.f40327N.m111929z1(0);
            C16718f m89035S = this.f40327N.m89106L().m89027K(true).m89034R(AbstractC23136l9.m118742r(44.0f)).m89035S(AbstractC23136l9.m118742r(44.0f));
            int i14 = AbstractC23222t7.f112514B;
            m89035S.m89028L(i14, i14);
            C16716d c16716d2 = new C16716d(context);
            c16716d2.m89106L().m89054h0(this.f40327N).m89028L(-1, -2);
            C22126c0 c22126c02 = new C22126c0(context);
            this.f40324K = c22126c02;
            c22126c02.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_event_day));
            this.f40324K.mo111964L1(AbstractC23222t7.f112586t);
            this.f40324K.m111962J1(CalendarEventAdapter.this.f40291y);
            C22126c0 c22126c03 = new C22126c0(context);
            this.f40325L = c22126c03;
            c22126c03.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_see_the_instructions));
            this.f40325L.mo111964L1(AbstractC23222t7.f112586t);
            this.f40325L.m111962J1(CalendarEventAdapter.this.f40277B);
            this.f40325L.m89106L().m89023G(this.f40324K);
            this.f40328O.m89001g1(this.f40327N);
            c16716d2.m89001g1(this.f40324K);
            c16716d2.m89001g1(this.f40325L);
            this.f40328O.m89001g1(c16716d2);
            mo69681L(this.f40326M);
            mo69681L(this.f40328O);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public /* synthetic */ void m37663W(C16719g c16719g) {
            if (AbstractC23160o0.m119233a(this.f40330Q, Calendar.getInstance()) == 0) {
                AbstractC23647d.m123897g("77700019");
            } else {
                AbstractC23647d.m123897g("77700020");
            }
            InterfaceC7417h interfaceC7417h = this.f40329P;
            if (interfaceC7417h != null) {
                interfaceC7417h.mo37661a();
            }
        }

        @Override // com.zing.zalo.calendar.adapters.CalendarEventAdapter.InterfaceC7410a
        /* renamed from: g */
        public void mo37643g(C19412d c19412d, boolean z11) {
            try {
                this.f40330Q.setTimeInMillis(c19412d.f96320b.f96262b);
                String str = "";
                if (AbstractC23160o0.m119233a(this.f40330Q, Calendar.getInstance()) == 0) {
                    str = "" + AbstractC23136l9.m118743r0(AbstractC8020f0.str_today) + " • ";
                    this.f40326M.m111962J1(CalendarEventAdapter.this.f40277B);
                    this.f40326M.mo111965M1(1);
                } else {
                    this.f40326M.m111962J1(CalendarEventAdapter.this.f40291y);
                    this.f40326M.mo111965M1(0);
                }
                this.f40326M.m111959G1(str + AbstractC23160o0.m119195H(this.f40330Q, true, false, false, false));
                this.f40328O.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.calendar.adapters.h
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        CalendarEventAdapter.C7419j.this.m37663W(c16719g);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    public CalendarEventAdapter(Context context, InterfaceC27218a interfaceC27218a, List list) {
        this.f40284r = list;
        this.f40286t = context;
        this.f40289w = interfaceC27218a;
        this.f40290x = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f40291y = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f40292z = C23212s8.m119607o(context, AbstractC16781w.TextColor1_alpha50);
        this.f40276A = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_calendar_starttime_active);
        this.f40277B = C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor);
        this.f40278C = C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor);
        this.f40279D = AbstractC23136l9.m118665N(context, AbstractC16803z.video_loading_big);
    }

    /* renamed from: O */
    private int m37631O(long j11) {
        int size = this.f40284r.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (((C19412d) this.f40284r.get(i12)).f96320b.m101528c() == j11 && (i12 == 0 || ((C19412d) this.f40284r.get(i12 - 1)).f96320b.m101528c() < ((C19412d) this.f40284r.get(i12)).f96320b.m101528c())) {
                return i12;
            }
            if (((C19412d) this.f40284r.get(i12)).f96320b.m101528c() < j11) {
                i11 = i12 + 1;
            } else {
                size = i12 - 1;
            }
        }
        return -1;
    }

    /* renamed from: R */
    private boolean m37632R(int[] iArr, int i11) {
        int mo10005m = mo10005m(i11);
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        for (int i12 : iArr) {
            if (mo10005m == i12) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    int m37633L() {
        Paint paint = new Paint();
        paint.setTextSize(AbstractC23222t7.f112582r);
        if (C13778s1.m76960a()) {
            paint.setTypeface(C13718q1.m76694c(this.f40286t, 7));
        } else {
            paint.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return ((int) (fontMetrics.descent - fontMetrics.top)) + AbstractC23222t7.f112594x;
    }

    /* renamed from: M */
    public int m37634M(long j11) {
        int size = this.f40284r.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (((C19412d) this.f40284r.get(i12)).f96320b.m101528c() > j11 && (i12 == 0 || ((C19412d) this.f40284r.get(i12 - 1)).f96320b.m101528c() <= j11)) {
                return i12;
            }
            if (((C19412d) this.f40284r.get(i12)).f96320b.m101528c() <= j11) {
                i11 = i12 + 1;
            } else {
                size = i12 - 1;
            }
        }
        return -1;
    }

    /* renamed from: N */
    public int m37635N(long j11, String str, int[] iArr) {
        int m37631O = m37631O(j11);
        if (m37631O == -1) {
            return -1;
        }
        while (m37631O < this.f40284r.size() && ((C19412d) this.f40284r.get(m37631O)).f96320b.m101528c() <= 86400000 + j11) {
            if ((TextUtils.isEmpty(((C19412d) this.f40284r.get(m37631O)).f96320b.f96261a) || ((C19412d) this.f40284r.get(m37631O)).f96320b.f96261a.equals(str)) && m37632R(iArr, m37631O)) {
                return m37631O;
            }
            m37631O++;
        }
        return -1;
    }

    /* renamed from: P */
    public int m37636P(long j11, int[] iArr) {
        int m37631O = m37631O(j11);
        if (m37631O == -1) {
            return -1;
        }
        while (m37631O < this.f40284r.size() && ((C19412d) this.f40284r.get(m37631O)).f96320b.m101528c() == j11) {
            if (m37632R(iArr, m37631O)) {
                return m37631O;
            }
            m37631O++;
        }
        return -1;
    }

    /* renamed from: Q */
    public C19412d m37637Q(int i11) {
        return (C19412d) this.f40284r.get(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo9990A(C7411b c7411b, int i11) {
        c7411b.mo37643g((C19412d) this.f40284r.get(i11), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public C7411b mo9992C(ViewGroup viewGroup, int i11) {
        switch (i11) {
            case 0:
                return new C7414e(new C7412c(viewGroup.getContext()));
            case 1:
                return new C7414e(new HeaderEventView(viewGroup.getContext()));
            case 2:
                return new C7414e(new C7418i(viewGroup.getContext()));
            case 3:
                C7416g c7416g = new C7416g(viewGroup.getContext());
                c7416g.f40320M = this.f40285s;
                return new C7411b(c7416g);
            case 4:
            case 5:
                C7419j c7419j = new C7419j(viewGroup.getContext());
                c7419j.f40329P = this.f40285s;
                return new C7414e(c7419j);
            case 6:
                return new C7411b(new C7415f(viewGroup.getContext()));
            case 7:
                return new C7411b(new C7413d(viewGroup.getContext()));
            default:
                return new C7411b(new View(viewGroup.getContext()));
        }
    }

    /* renamed from: U */
    public void m37640U(int i11) {
        this.f40288v = i11;
    }

    /* renamed from: V */
    public void m37641V(List list) {
        this.f40284r = list;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: a */
    public boolean mo36528a(int i11) {
        int mo10005m = mo10005m(i11);
        if (mo10005m == 1 || mo10005m == 2 || mo10005m == 4 || mo10005m == 5) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: b */
    public void mo36530b(View view, int i11) {
        if (view instanceof InterfaceC7410a) {
            ((InterfaceC7410a) view).mo37643g(m37637Q(i11), false);
        }
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: c */
    public int mo36532c(int i11) {
        while (!mo36528a(i11)) {
            i11--;
            if (i11 < 0) {
                return 0;
            }
        }
        return i11;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: d */
    public View mo36534d(int i11, ViewGroup viewGroup) {
        if (this.f40283H == null) {
            this.f40283H = new C7418i(this.f40286t);
        }
        return this.f40283H;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: e */
    public boolean mo36536e(int i11) {
        int mo10005m = mo10005m(i11);
        if (mo10005m == 1 || mo10005m == 3) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f40284r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C19412d) this.f40284r.get(i11)).f96319a;
    }
}
