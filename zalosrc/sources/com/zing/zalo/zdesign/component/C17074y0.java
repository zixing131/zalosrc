package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.RectF;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import fn0.AbstractC19074t;
import java.util.List;
import ji0.C21273a;
import ui0.C27274a;
import ui0.C27276c;

/* renamed from: com.zing.zalo.zdesign.component.y0 */
/* loaded from: classes7.dex */
public class C17074y0 extends C16971e {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17074y0(Context context, EnumC16949e enumC16949e) {
        this(context, enumC16949e.m90779c(context));
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(enumC16949e, "avatarSize");
    }

    /* renamed from: s2 */
    private final void m91364s2() {
        m90911z1().m89006m1(m90876B1()[0]);
        m90911z1().m89006m1(m90876B1()[1]);
        m90911z1().m89006m1(m90876B1()[2]);
        m90911z1().m89006m1(m90876B1()[3]);
        if (m90885L1() == 3) {
            C21273a c21273a = m90876B1()[0];
            if (c21273a != null) {
                m90911z1().m89001g1(c21273a);
            }
            C21273a c21273a2 = m90876B1()[1];
            if (c21273a2 != null) {
                m90911z1().m89001g1(c21273a2);
            }
            C21273a c21273a3 = m90876B1()[2];
            if (c21273a3 != null) {
                m90911z1().m89001g1(c21273a3);
            }
            C21273a c21273a4 = m90876B1()[3];
            if (c21273a4 != null) {
                m90911z1().m89001g1(c21273a4);
                return;
            }
            return;
        }
        C21273a c21273a5 = m90876B1()[2];
        if (c21273a5 != null) {
            m90911z1().m89001g1(c21273a5);
        }
        C21273a c21273a6 = m90876B1()[0];
        if (c21273a6 != null) {
            m90911z1().m89001g1(c21273a6);
        }
        C21273a c21273a7 = m90876B1()[1];
        if (c21273a7 != null) {
            m90911z1().m89001g1(c21273a7);
        }
        C21273a c21273a8 = m90876B1()[3];
        if (c21273a8 != null) {
            m90911z1().m89001g1(c21273a8);
        }
    }

    @Override // com.zing.zalo.zdesign.component.C16971e
    /* renamed from: O1 */
    public void mo90887O1(List list) {
        String m139636d;
        m90877C1().clear();
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            m90877C1().addAll(list2);
        } else {
            m90877C1().add("");
        }
        m90895a2(null);
        if (m90877C1().size() == 2 && AbstractC19074t.m100204b(m90877C1().get(1), "1")) {
            m90904j2(5);
            m90877C1().remove(1);
            m90895a2("1");
        } else if (m90877C1().size() == 4) {
            m90904j2(4);
            m90895a2(null);
        } else if (m90877C1().size() >= 5) {
            m90904j2(4);
            C27274a c27274a = C27274a.f128311a;
            int m139633a = c27274a.m139633a((String) m90877C1().get(4));
            if (AbstractC19074t.m100204b(m90780o1(), c27274a.m139634b())) {
                m139636d = c27274a.m139636d(m139633a - 3, m90780o1());
            } else {
                m139636d = c27274a.m139636d(m139633a, m90780o1());
            }
            m90895a2(m139636d);
        } else {
            m90904j2(m90877C1().size());
        }
        if (m90885L1() <= 0) {
            m90904j2(1);
        }
        mo90906p2();
        m90909v1();
    }

    @Override // com.zing.zalo.zdesign.component.C16971e
    /* renamed from: p2 */
    public void mo90906p2() {
        if (m90885L1() == 1) {
            m90911z1().m89106L().m89041Y(0);
        } else {
            m90911z1().m89106L().m89041Y(m90884J1());
        }
        m91364s2();
        int m90885L1 = m90885L1();
        if (m90885L1 != 2) {
            if (m90885L1 != 3) {
                super.mo90906p2();
                return;
            }
            m90888S1();
            C21273a c21273a = m90876B1()[0];
            if (c21273a != null) {
                c21273a.mo44614b1(0);
                c21273a.m89106L().m89028L(m90881G1(), m90881G1()).m89018B(Boolean.TRUE).m89026J(true);
            }
            C21273a c21273a2 = m90876B1()[1];
            if (c21273a2 != null) {
                c21273a2.mo44614b1(0);
                C16718f m89028L = c21273a2.m89106L().m89028L(m90881G1(), m90881G1());
                Boolean bool = Boolean.TRUE;
                m89028L.m89018B(bool).m89073z(bool).m89036T((m90880F1() - m90881G1()) - (m90884J1() * 4));
            }
            C21273a c21273a3 = m90876B1()[2];
            if (c21273a3 != null) {
                c21273a3.mo44614b1(0);
                C16718f m89028L2 = c21273a3.m89106L().m89028L(m90881G1(), m90881G1());
                Boolean bool2 = Boolean.TRUE;
                m89028L2.m89018B(bool2).m89036T((m90880F1() - m90881G1()) - (m90884J1() * 4)).m89017A(bool2);
                return;
            }
            return;
        }
        m90888S1();
        C21273a c21273a4 = m90876B1()[0];
        if (c21273a4 != null) {
            c21273a4.mo44614b1(0);
            C16718f m89028L3 = c21273a4.m89106L().m89028L(m90881G1(), m90881G1());
            Boolean bool3 = Boolean.TRUE;
            m89028L3.m89018B(bool3).m89036T(((m90880F1() - m90881G1()) - (m90884J1() * 2)) / 2).m89073z(bool3);
        }
        C21273a c21273a5 = m90876B1()[1];
        if (c21273a5 != null) {
            c21273a5.mo44614b1(0);
            C16718f m89028L4 = c21273a5.m89106L().m89028L(m90881G1(), m90881G1());
            Boolean bool4 = Boolean.TRUE;
            m89028L4.m89018B(bool4).m89036T(((m90880F1() - m90881G1()) - (m90884J1() * 2)) / 2).m89017A(bool4);
        }
    }

    @Override // com.zing.zalo.zdesign.component.C16971e
    /* renamed from: q2 */
    public void mo90907q2(int i11, int i12, boolean z11) {
        m90891W1(i12);
        m90898d2(i11);
        int i13 = i11 + i12;
        if (i13 != m90879E1() || z11) {
            m90892X1(i13);
            m90893Y1(m90878D1() - (m90879E1() * 2));
            m90902h2((int) (m90880F1() * 0.041666668f));
            m90894Z1(((int) (m90880F1() * 0.5416667f)) - (m90884J1() * 2));
            m90901g2(new RectF(m90884J1() / 2.0f, m90884J1() / 2.0f, m90878D1() - (m90884J1() / 2.0f), m90878D1() - (m90884J1() / 2.0f)));
            m90911z1().m89106L().m89028L(m90880F1(), m90880F1()).m89031O(m90879E1());
            AbstractC19074t.m100207e(getContext(), "context");
            m90882H1().mo111964L1((m90880F1() / 4.0f) - C27276c.m139649b(r7, 1));
            int length = m90876B1().length - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    C21273a c21273a = m90876B1()[length];
                    AbstractC19074t.m100205c(c21273a);
                    c21273a.m110190E1(m90884J1());
                    if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            mo90906p2();
        }
    }

    @Override // com.zing.zalo.zdesign.component.C16971e
    /* renamed from: r2 */
    public void mo90908r2() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m139649b = C27276c.m139649b(context, 2);
        mo90907q2(m139649b, m139649b, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17074y0(Context context, int i11) {
        super(context, i11);
        AbstractC19074t.m100208f(context, "context");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        float m139649b = C27276c.m139649b(context2, 5);
        m90890V1(new DashPathEffect(new float[]{m139649b, m139649b}, 0.0f));
        C16718f m89106L = m90910x1().m89106L();
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        C16718f m89033Q = m89106L.m89033Q(C27276c.m139649b(context3, 2));
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "context");
        m89033Q.m89035S(C27276c.m139649b(context4, 2));
    }
}
