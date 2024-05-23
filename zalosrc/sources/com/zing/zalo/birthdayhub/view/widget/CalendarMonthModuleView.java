package com.zing.zalo.birthdayhub.view.widget;

import ac.C0708i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import au.C2367q;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.birthdayhub.view.widget.CalendarMonthModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C16979g1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p480rd.C25730a;
import vl0.AbstractC28293c;

/* loaded from: classes3.dex */
public final class CalendarMonthModuleView extends ModulesView {
    public static final C7387a Companion = new C7387a(null);

    /* renamed from: K */
    private final int f40174K;

    /* renamed from: L */
    private int f40175L;

    /* renamed from: M */
    private int f40176M;

    /* renamed from: N */
    private final String[] f40177N;

    /* renamed from: O */
    private long f40178O;

    /* renamed from: P */
    private C16716d f40179P;

    /* renamed from: Q */
    private C16716d f40180Q;

    /* renamed from: R */
    private final int f40181R;

    /* renamed from: S */
    private final int f40182S;

    /* renamed from: T */
    private final int f40183T;

    /* renamed from: U */
    private final Bitmap f40184U;

    /* renamed from: V */
    private final Drawable f40185V;

    /* renamed from: W */
    private final Drawable f40186W;

    /* renamed from: a0 */
    private final Drawable f40187a0;

    /* renamed from: b0 */
    private final Drawable f40188b0;

    /* renamed from: c0 */
    private Calendar f40189c0;

    /* renamed from: d0 */
    private C16716d f40190d0;

    /* renamed from: e0 */
    private InterfaceC7388b f40191e0;

    /* renamed from: com.zing.zalo.birthdayhub.view.widget.CalendarMonthModuleView$a */
    /* loaded from: classes3.dex */
    public static final class C7387a {
        private C7387a() {
        }

        public /* synthetic */ C7387a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.widget.CalendarMonthModuleView$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7388b {
        /* renamed from: a */
        void mo37502a(long j11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarMonthModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        int m118742r = AbstractC23136l9.m118742r(4.0f);
        this.f40174K = m118742r;
        this.f40175L = -1;
        this.f40176M = -1;
        String[] m118755v0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_days_of_week_short);
        AbstractC19074t.m100207e(m118755v0, "getStringArray(...)");
        this.f40177N = m118755v0;
        this.f40189c0 = Calendar.getInstance();
        this.f40181R = AbstractC23136l9.m118641B(context, AbstractC2808b.f150830r60);
        this.f40182S = C23212s8.m119607o(context, AbstractC2807a.text_02);
        this.f40183T = C23212s8.m119607o(context, AbstractC2807a.text_01);
        this.f40184U = C2367q.m12384a(context, AbstractC23322a.zds_ic_cake_solid_16, AbstractC28293c.core_birthdayhub_birthday_indicator_pink);
        this.f40185V = AbstractC23136l9.m118665N(context, AbstractC16803z.bg_calendar_today);
        this.f40186W = AbstractC23136l9.m118665N(context, AbstractC16803z.bg_calendar_today_selected);
        this.f40187a0 = AbstractC23136l9.m118665N(context, AbstractC16803z.bg_calendar_selected_day);
        this.f40188b0 = AbstractC23136l9.m118665N(context, AbstractC16801x.transparent);
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f40179P = c16716d;
        c16716d.m89106L().m89042Z(m118742r, AbstractC23222t7.f112580q, m118742r, m118742r).m89028L(-1, -2);
        int i11 = 0;
        while (i11 < 7) {
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.mo111964L1(AbstractC23222t7.f112582r);
            int i12 = i11 + 1;
            c22126c0.m111959G1(this.f40177N[i12 % 7]);
            c22126c0.m111962J1(this.f40182S);
            c22126c0.mo111965M1(1);
            c22126c0.m89106L().m89054h0(this.f40179P.m89004k1(i11 - 1)).m89029M(3).m89028L(getCellWidth(), -2);
            this.f40179P.m89001g1(c22126c0);
            i11 = i12;
        }
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89041Y(this.f40174K).m89028L(-1, -2).m89023G(this.f40179P);
        this.f40180Q = c16716d2;
        for (int i13 = 0; i13 < 6; i13++) {
            C16716d c16716d3 = new C16716d(context);
            c16716d3.m89106L().m89028L(-1, -2).m89023G(this.f40180Q.m89004k1(i13 - 1));
            for (int i14 = 0; i14 < 7; i14++) {
                C16979g1 c16979g1 = new C16979g1(context);
                c16979g1.setIdTracking("BIRTHDAY_HUB_CLICK_DAY_CALENDAR");
                c16979g1.m89106L().m89054h0(c16716d3.m89004k1(i14 - 1)).m89031O(AbstractC23222t7.f112552c).m89028L(getCellWidth() - AbstractC23222t7.f112556e, getCellHeight() - AbstractC23222t7.f112556e);
                C16719g c16719g = new C16719g(context);
                c16719g.m89106L().m89025I(true);
                c16719g.mo44614b1(4);
                C22126c0 c22126c02 = new C22126c0(context);
                c22126c02.m115422R1();
                c22126c02.mo111964L1(AbstractC23222t7.f112582r);
                c22126c02.mo111965M1(1);
                c22126c02.m89106L().m89026J(true).m89066s(c16719g).m89028L(-2, -2);
                C16719g c16719g2 = new C16719g(context);
                C16718f m89023G = c16719g2.m89106L().m89026J(true).m89023G(c16719g);
                int i15 = AbstractC23222t7.f112586t;
                m89023G.m89028L(i15, i15);
                c16719g2.m89159y0(this.f40184U);
                c16719g2.mo44614b1(4);
                c16979g1.m89001g1(c16719g);
                c16979g1.m89001g1(c22126c02);
                c16979g1.m89001g1(c16719g2);
                c16716d3.m89001g1(c16979g1);
            }
            this.f40180Q.m89001g1(c16716d3);
        }
        mo69681L(this.f40179P);
        mo69681L(this.f40180Q);
    }

    /* renamed from: X */
    private final void m37513X(C16716d c16716d, Calendar calendar) {
        int i11;
        C16719g m89004k1 = c16716d.m89004k1(1);
        AbstractC19074t.m100206d(m89004k1, "null cannot be cast to non-null type com.zing.zalo.ui.moduleview.modulewidget.RobotoTextModule");
        C22126c0 c22126c0 = (C22126c0) m89004k1;
        c22126c0.m111959G1(String.valueOf(calendar.get(5)));
        if (calendar.get(7) == 1) {
            i11 = this.f40181R;
        } else {
            i11 = this.f40183T;
        }
        c22126c0.m111962J1(i11);
        if (AbstractC23160o0.m119235a1(calendar, this.f40189c0)) {
            c16716d.m89085A0(this.f40185V);
        } else {
            c16716d.m89085A0(this.f40188b0);
        }
        final long timeInMillis = calendar.getTimeInMillis();
        c16716d.mo89109M0(new C16719g.c() { // from class: vd.b
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                CalendarMonthModuleView.m37514Y(CalendarMonthModuleView.this, timeInMillis, c16719g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m37514Y(CalendarMonthModuleView calendarMonthModuleView, long j11, C16719g c16719g) {
        AbstractC19074t.m100208f(calendarMonthModuleView, "this$0");
        try {
            if (c16719g instanceof C16716d) {
                calendarMonthModuleView.m37517d0((C16716d) c16719g, j11);
            }
            InterfaceC7388b interfaceC7388b = calendarMonthModuleView.f40191e0;
            if (interfaceC7388b != null) {
                interfaceC7388b.mo37502a(j11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* renamed from: a0 */
    private final C16979g1 m37515a0(long j11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j11);
        gregorianCalendar.set(5, 1);
        int i11 = (gregorianCalendar.get(7) + 5) % 7;
        gregorianCalendar.setTimeInMillis(j11);
        int i12 = (gregorianCalendar.get(5) + i11) - 1;
        int i13 = i12 / 7;
        C16716d c16716d = (C16716d) this.f40180Q.m89004k1(i13);
        if (c16716d == null) {
            return null;
        }
        return (C16979g1) c16716d.m89004k1(i12 - (i13 * 7));
    }

    /* renamed from: c0 */
    private final void m37516c0() {
        for (int i11 = 0; i11 < 7; i11++) {
            this.f40179P.m89004k1(i11).m89106L().m89028L(getCellWidth(), -2);
        }
        for (int i12 = 0; i12 < 6; i12++) {
            C16719g m89004k1 = this.f40180Q.m89004k1(i12);
            AbstractC19074t.m100206d(m89004k1, "null cannot be cast to non-null type com.zing.zalo.uidrawing.GroupModule");
            C16716d c16716d = (C16716d) m89004k1;
            for (int i13 = 0; i13 < 7; i13++) {
                c16716d.m89004k1(i13).m89106L().m89028L(getCellWidth() - AbstractC23222t7.f112556e, getCellHeight() - AbstractC23222t7.f112556e);
            }
        }
    }

    /* renamed from: d0 */
    private final void m37517d0(C16716d c16716d, long j11) {
        C16716d c16716d2 = this.f40190d0;
        if (c16716d2 != null) {
            c16716d2.m89145l();
            if (this.f40178O > 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(this.f40178O);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(j11);
                if (calendar2.get(2) == calendar.get(2)) {
                    m37518g0(c16716d2, this.f40178O, false);
                }
            }
        }
        m37518g0(c16716d, j11, true);
        this.f40190d0 = c16716d;
        this.f40178O = j11;
    }

    /* renamed from: g0 */
    private final void m37518g0(C16716d c16716d, long j11, boolean z11) {
        Drawable drawable;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j11);
        if (AbstractC23160o0.m119235a1(gregorianCalendar, this.f40189c0)) {
            if (z11) {
                drawable = this.f40186W;
            } else {
                drawable = this.f40185V;
            }
        } else if (z11) {
            drawable = this.f40187a0;
        } else {
            drawable = this.f40188b0;
        }
        c16716d.m89085A0(drawable);
    }

    private final int getCellHeight() {
        int cellWidth;
        if (this.f40176M == -1) {
            if (AbstractC23136l9.m118722k0() > AbstractC23136l9.m118713h0() * 0.7f) {
                cellWidth = AbstractC23222t7.f112540S;
            } else {
                cellWidth = getCellWidth();
            }
            this.f40176M = cellWidth;
        }
        return this.f40176M;
    }

    private final int getCellWidth() {
        if (this.f40175L == -1) {
            this.f40175L = (AbstractC23136l9.m118722k0() - (this.f40174K * 2)) / 7;
        }
        return this.f40175L;
    }

    /* renamed from: W */
    public final void m37519W(C25730a c25730a) {
        AbstractC19074t.m100208f(c25730a, "calendarMonthParam");
        ArrayList arrayList = new ArrayList(42);
        Object clone = c25730a.m132822a().clone();
        AbstractC19074t.m100206d(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar = (Calendar) clone;
        calendar.set(5, 1);
        this.f40189c0 = Calendar.getInstance();
        calendar.add(7, -((calendar.get(7) + 5) % 7));
        while (arrayList.size() < 42) {
            arrayList.add(Long.valueOf(calendar.getTimeInMillis()));
            calendar.add(5, 1);
        }
        for (int i11 = 0; i11 < 6; i11++) {
            C16719g m89004k1 = this.f40180Q.m89004k1(i11);
            AbstractC19074t.m100206d(m89004k1, "null cannot be cast to non-null type com.zing.zalo.uidrawing.GroupModule");
            C16716d c16716d = (C16716d) m89004k1;
            int i12 = 0;
            while (true) {
                if (i12 < 7) {
                    C16719g m89004k12 = c16716d.m89004k1(i12);
                    AbstractC19074t.m100206d(m89004k12, "null cannot be cast to non-null type com.zing.zalo.uidrawing.GroupModule");
                    C16716d c16716d2 = (C16716d) m89004k12;
                    Object obj = arrayList.get((i11 * 7) + i12);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    calendar.setTimeInMillis(((Number) obj).longValue());
                    if (calendar.get(2) == c25730a.m132822a().get(2)) {
                        c16716d2.mo44614b1(0);
                        m37513X(c16716d2, calendar);
                        if (i12 == 0 && i11 == 5) {
                            c16716d.mo44614b1(0);
                        }
                    } else {
                        if (i12 == 0 && i11 == 5) {
                            c16716d.mo44614b1(8);
                            break;
                        }
                        c16716d2.mo44614b1(4);
                    }
                    i12++;
                }
            }
        }
    }

    /* renamed from: b0 */
    public final void m37520b0() {
        this.f40175L = -1;
        this.f40176M = -1;
        m37516c0();
        requestLayout();
    }

    /* renamed from: e0 */
    public final void m37521e0(long j11) {
        C16979g1 m37515a0 = m37515a0(j11);
        if (m37515a0 != null) {
            m37517d0(m37515a0, j11);
        }
    }

    /* renamed from: f0 */
    public final void m37522f0(long j11, int i11, int i12) {
        boolean z11;
        C16979g1 m37515a0 = m37515a0(j11);
        if (m37515a0 != null) {
            C16719g m89004k1 = m37515a0.m89004k1(2);
            if (m89004k1 != null) {
                m89004k1.mo44614b1(i12);
            }
            C0708i c0708i = new C0708i();
            if (i12 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c0708i.m1076g("hasBirthday", z11);
            if (i12 != 0) {
                i11 = 0;
            }
            c0708i.m1072c("countBirthday", i11);
            m37515a0.setTrackingExtraData(c0708i);
        }
    }

    public final InterfaceC7388b getOnDayClickListener() {
        return this.f40191e0;
    }

    public final void setAllDotVisible(int i11) {
        int m89005l1 = this.f40180Q.m89005l1();
        for (int i12 = 0; i12 < m89005l1; i12++) {
            C16716d c16716d = (C16716d) this.f40180Q.m89004k1(i12);
            if (c16716d != null) {
                int m89005l12 = c16716d.m89005l1();
                for (int i13 = 0; i13 < m89005l12; i13++) {
                    C16979g1 c16979g1 = (C16979g1) c16716d.m89004k1(i13);
                    if (c16979g1 != null) {
                        c16979g1.m89004k1(2).mo44614b1(i11);
                        C0708i c0708i = new C0708i();
                        c0708i.m1076g("hasBirthday", false);
                        c0708i.m1072c("countBirthday", 0);
                        c16979g1.setTrackingExtraData(c0708i);
                    }
                }
            }
        }
    }

    public final void setOnDayClickListener(InterfaceC7388b interfaceC7388b) {
        this.f40191e0 = interfaceC7388b;
    }

    public /* synthetic */ CalendarMonthModuleView(Context context, AttributeSet attributeSet, int i11, AbstractC19060k abstractC19060k) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }
}
