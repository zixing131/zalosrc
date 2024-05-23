package com.zing.zalo.p077ui.moduleview.calendar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import au.AbstractC2353j;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.moduleview.calendar.MonthModulesView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import ge.C19413e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class MonthModulesView extends ModulesView {

    /* renamed from: b0 */
    static C16716d f64511b0;

    /* renamed from: c0 */
    static long f64512c0;

    /* renamed from: d0 */
    static String[] f64513d0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_days_of_week_short);

    /* renamed from: K */
    C16716d f64514K;

    /* renamed from: L */
    C16716d f64515L;

    /* renamed from: M */
    public InterfaceC12405a f64516M;

    /* renamed from: N */
    final int f64517N;

    /* renamed from: O */
    int f64518O;

    /* renamed from: P */
    final int f64519P;

    /* renamed from: Q */
    final int f64520Q;

    /* renamed from: R */
    final int f64521R;

    /* renamed from: S */
    final Drawable f64522S;

    /* renamed from: T */
    final Drawable f64523T;

    /* renamed from: U */
    final Drawable f64524U;

    /* renamed from: V */
    final Drawable f64525V;

    /* renamed from: W */
    final Drawable f64526W;

    /* renamed from: a0 */
    Calendar f64527a0;

    /* renamed from: com.zing.zalo.ui.moduleview.calendar.MonthModulesView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12405a {
        /* renamed from: a */
        void mo69695a(long j11);
    }

    public MonthModulesView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m69687b0(boolean z11, int[] iArr, long j11, C16719g c16719g) {
        try {
            if (c16719g instanceof C16716d) {
                if (z11) {
                    AbstractC23647d.m123897g("77700015");
                } else if (((C16716d) c16719g).m89004k1(3).m89136d0() == 0) {
                    AbstractC23647d.m123897g("77700012");
                } else {
                    int i11 = iArr[0];
                    if (i11 != 15 && i11 != 1) {
                        AbstractC23647d.m123897g("77700013");
                    }
                    AbstractC23647d.m123897g("77700014");
                }
                m69692c0((C16716d) c16719g, j11);
            }
            InterfaceC12405a interfaceC12405a = this.f64516M;
            if (interfaceC12405a != null) {
                interfaceC12405a.mo69695a(j11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W */
    public void m69688W(C19413e c19413e) {
        C16716d c16716d;
        ArrayList arrayList = new ArrayList(42);
        Calendar calendar = (Calendar) c19413e.f96321a.clone();
        calendar.set(5, 1);
        this.f64527a0 = Calendar.getInstance();
        int i11 = 7;
        calendar.add(7, -((calendar.get(7) + 5) % 7));
        while (arrayList.size() < 42) {
            arrayList.add(Long.valueOf(calendar.getTimeInMillis()));
            calendar.add(5, 1);
        }
        int[] iArr = null;
        int i12 = 0;
        boolean z11 = true;
        while (i12 < 6 && (c16716d = (C16716d) this.f64515L.m89004k1(i12)) != null) {
            int i13 = 0;
            while (true) {
                if (i13 < i11) {
                    C16716d c16716d2 = (C16716d) c16716d.m89004k1(i13);
                    calendar.setTimeInMillis(((Long) arrayList.get((i12 * 7) + i13)).longValue());
                    if (calendar.get(2) == c19413e.f96321a.get(2)) {
                        c16716d2.mo44614b1(0);
                        if (iArr == null || z11) {
                            iArr = AbstractC2353j.m12344g(calendar.get(5), calendar.get(2) + 1, calendar.get(1), 7.0d);
                            z11 = false;
                        }
                        m69689X(c16716d2, calendar, iArr);
                        if (i13 == 0 && i12 == 5) {
                            c16716d.mo44614b1(0);
                        }
                    } else {
                        if (i13 == 0 && i12 == 5) {
                            c16716d.mo44614b1(8);
                            break;
                        }
                        c16716d2.mo44614b1(4);
                    }
                    if (iArr != null) {
                        int i14 = iArr[0];
                        if (i14 >= 29) {
                            z11 = true;
                        } else {
                            iArr[0] = i14 + 1;
                        }
                    }
                    i13++;
                    i11 = 7;
                }
            }
            i12++;
            i11 = 7;
        }
    }

    /* renamed from: X */
    void m69689X(C16716d c16716d, Calendar calendar, final int[] iArr) {
        String str;
        final boolean z11;
        int i11;
        C22126c0 c22126c0 = (C22126c0) c16716d.m89004k1(1);
        c22126c0.m111959G1(String.valueOf(calendar.get(5)));
        C22126c0 c22126c02 = (C22126c0) c16716d.m89004k1(2);
        if (calendar.get(5) != 1 && (i11 = iArr[0]) != 1) {
            c22126c02.m111959G1(String.valueOf(i11));
        } else {
            if (iArr[3] == 1) {
                str = "+";
            } else {
                str = "";
            }
            c22126c02.m111959G1(iArr[0] + "/" + iArr[1] + str);
        }
        c22126c02.mo44614b1(4);
        if (AbstractC23160o0.m119235a1(calendar, this.f64527a0)) {
            c22126c02.mo44614b1(0);
            c16716d.m89085A0(this.f64523T);
            z11 = true;
        } else {
            c16716d.m89085A0(this.f64526W);
            z11 = false;
        }
        c22126c0.m111962J1(this.f64520Q);
        c22126c02.m111962J1(this.f64521R);
        final long timeInMillis = calendar.getTimeInMillis();
        c16716d.mo89109M0(new C16719g.c() { // from class: g80.a
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MonthModulesView.this.m69687b0(z11, iArr, timeInMillis, c16719g);
            }
        });
        if (calendar.get(7) == 1) {
            c22126c0.m111962J1(this.f64519P);
        }
        int i12 = iArr[0];
        if (i12 != 15 && i12 != 1) {
            if (calendar.get(7) == 2 || calendar.get(5) == 1) {
                c22126c02.m111962J1(this.f64521R);
                c22126c02.mo44614b1(0);
                return;
            }
            return;
        }
        c22126c02.m111962J1(this.f64519P);
        c22126c02.mo44614b1(0);
    }

    /* renamed from: Y */
    void m69690Y(C16716d c16716d, long j11, boolean z11) {
        boolean z12;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j11);
        int[] m12344g = AbstractC2353j.m12344g(gregorianCalendar.get(5), gregorianCalendar.get(2) + 1, gregorianCalendar.get(1), 7.0d);
        C22126c0 c22126c0 = (C22126c0) c16716d.m89004k1(2);
        c22126c0.mo44614b1(4);
        if (AbstractC23160o0.m119235a1(gregorianCalendar, this.f64527a0)) {
            c16716d.m89085A0(this.f64523T);
            c22126c0.mo44614b1(0);
            z12 = true;
        } else {
            c16716d.m89085A0(this.f64526W);
            z12 = false;
        }
        if (z11) {
            if (z12) {
                c16716d.m89085A0(this.f64524U);
            } else {
                c16716d.m89085A0(this.f64525V);
            }
            c22126c0.mo44614b1(0);
        }
        int i11 = m12344g[0];
        if (i11 != 15 && i11 != 1) {
            if (gregorianCalendar.get(7) == 2 || gregorianCalendar.get(5) == 1) {
                c22126c0.m111962J1(this.f64521R);
                c22126c0.mo44614b1(0);
                return;
            }
            return;
        }
        c22126c0.m111962J1(this.f64519P);
        c22126c0.mo44614b1(0);
    }

    /* renamed from: a0 */
    C16716d m69691a0(long j11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j11);
        gregorianCalendar.set(5, 1);
        int i11 = (gregorianCalendar.get(7) + 5) % 7;
        gregorianCalendar.setTimeInMillis(j11);
        int i12 = (gregorianCalendar.get(5) + i11) - 1;
        int i13 = i12 / 7;
        C16716d c16716d = (C16716d) this.f64515L.m89004k1(i13);
        if (c16716d == null) {
            return null;
        }
        return (C16716d) c16716d.m89004k1(i12 - (i13 * 7));
    }

    /* renamed from: c0 */
    public void m69692c0(C16716d c16716d, long j11) {
        C16716d c16716d2 = f64511b0;
        if (c16716d2 != null) {
            c16716d2.m89145l();
            m69690Y(f64511b0, f64512c0, false);
        }
        m69690Y(c16716d, j11, true);
        f64511b0 = c16716d;
        f64512c0 = j11;
    }

    /* renamed from: d0 */
    public void m69693d0(long j11) {
        C16716d m69691a0 = m69691a0(j11);
        if (m69691a0 != null) {
            m69692c0(m69691a0, j11);
        }
    }

    /* renamed from: e0 */
    public void m69694e0(long j11, int i11) {
        C16719g m89004k1;
        C16716d m69691a0 = m69691a0(j11);
        if (m69691a0 != null && (m89004k1 = m69691a0.m89004k1(3)) != null) {
            m89004k1.mo44614b1(i11);
        }
    }

    public void setAllDotVisible(int i11) {
        if (this.f64515L == null) {
            return;
        }
        for (int i12 = 0; i12 < this.f64515L.m89005l1(); i12++) {
            C16716d c16716d = (C16716d) this.f64515L.m89004k1(i12);
            if (c16716d != null) {
                for (int i13 = 0; i13 < c16716d.m89005l1(); i13++) {
                    C16716d c16716d2 = (C16716d) c16716d.m89004k1(i13);
                    if (c16716d2 != null) {
                        c16716d2.m89004k1(3).mo44614b1(i11);
                    }
                }
            }
        }
    }

    public MonthModulesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int m118742r = AbstractC23136l9.m118742r(4.0f);
        this.f64517N = m118742r;
        this.f64518O = (AbstractC23136l9.m118722k0() - (m118742r * 2)) / 7;
        this.f64527a0 = Calendar.getInstance();
        this.f64519P = C23212s8.m119607o(context, AbstractC16781w.SeparatorColor3);
        this.f64520Q = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f64521R = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f64522S = AbstractC23136l9.m118665N(context, AbstractC16803z.blue_dot_calendar_day);
        this.f64523T = AbstractC23136l9.m118665N(context, AbstractC16803z.bg_calendar_today);
        this.f64524U = AbstractC23136l9.m118665N(context, AbstractC16803z.bg_calendar_today_selected);
        this.f64525V = AbstractC23136l9.m118665N(context, AbstractC16803z.bg_calendar_selected_day);
        this.f64526W = AbstractC23136l9.m118665N(context, AbstractC16801x.transparent);
        int i11 = -1;
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f64514K = c16716d;
        c16716d.m89106L().m89042Z(m118742r, AbstractC23222t7.f112580q, m118742r, m118742r).m89028L(-1, -2);
        int i12 = 0;
        while (i12 < 7) {
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.mo111964L1(AbstractC23222t7.f112582r);
            int i13 = i12 + 1;
            c22126c0.m111959G1(f64513d0[i13 % 7]);
            if (i12 == 6) {
                c22126c0.m111962J1(this.f64519P);
            } else {
                c22126c0.m111962J1(this.f64520Q);
            }
            c22126c0.m89106L().m89054h0(this.f64514K.m89004k1(i12 - 1)).m89029M(3).m89028L(this.f64518O, -2);
            this.f64514K.m89001g1(c22126c0);
            i12 = i13;
        }
        C16716d c16716d2 = new C16716d(context);
        this.f64515L = c16716d2;
        c16716d2.m89106L().m89041Y(this.f64517N).m89028L(-1, -2).m89023G(this.f64514K);
        int i14 = 0;
        while (i14 < 6) {
            C16716d c16716d3 = new C16716d(context);
            c16716d3.m89106L().m89028L(i11, -2).m89023G(this.f64515L.m89004k1(i14 - 1));
            for (int i15 = 0; i15 < 7; i15++) {
                C16716d c16716d4 = new C16716d(context);
                C16718f m89031O = c16716d4.m89106L().m89054h0(c16716d3.m89004k1(i15 - 1)).m89031O(AbstractC23222t7.f112552c);
                int i16 = this.f64518O;
                int i17 = AbstractC23222t7.f112556e;
                m89031O.m89028L(i16 - i17, i16 - i17);
                C16719g c16719g = new C16719g(context);
                c16719g.m89106L().m89025I(true);
                c16719g.mo44614b1(4);
                C22126c0 c22126c02 = new C22126c0(context);
                C22126c0 c22126c03 = new C22126c0(context);
                c22126c02.m115422R1();
                c22126c02.mo111964L1(AbstractC23136l9.m118722k0() < 800 ? AbstractC23222t7.f112582r : AbstractC23222t7.f112590v);
                c22126c02.mo111965M1(1);
                c22126c02.m89106L().m89026J(true).m89066s(c16719g).m89028L(-2, -2);
                c22126c03.m115422R1();
                c22126c03.mo111964L1(AbstractC23222t7.f112576o);
                c22126c03.m89106L().m89026J(true).m89048d0(AbstractC23222t7.f112552c).m89023G(c16719g).m89028L(-2, -2);
                c22126c03.mo44614b1(4);
                C16719g c16719g2 = new C16719g(context);
                C16718f m89034R = c16719g2.m89106L().m89020D(c22126c02).m89054h0(c22126c02).m89036T(AbstractC23222t7.f112556e).m89034R(AbstractC23222t7.f112552c);
                int i18 = AbstractC23222t7.f112562h;
                m89034R.m89028L(i18, i18);
                c16719g2.m89085A0(this.f64522S);
                c16719g2.mo44614b1(4);
                c16716d4.m89001g1(c16719g);
                c16716d4.m89001g1(c22126c02);
                c16716d4.m89001g1(c22126c03);
                c16716d4.m89001g1(c16719g2);
                c16716d3.m89001g1(c16716d4);
            }
            this.f64515L.m89001g1(c16716d3);
            i14++;
            i11 = -1;
        }
        mo69681L(this.f64514K);
        mo69681L(this.f64515L);
    }
}
