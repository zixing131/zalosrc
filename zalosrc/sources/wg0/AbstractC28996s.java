package wg0;

import p297kd.C21688c;
import p297kd.C21689d;
import p297kd.C21690e;
import p586vt.AbstractC28618c;
import p586vt.AbstractC28626k;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import si.C26263i;
import tg0.C26676b;
import wg0.AbstractC28997t;

/* renamed from: wg0.s */
/* loaded from: classes7.dex */
public abstract class AbstractC28996s implements InterfaceC28625j {
    /* renamed from: a */
    public abstract boolean mo144690a(C21688c.b bVar);

    /* renamed from: b */
    public abstract void mo144691b(AbstractC28997t abstractC28997t);

    /* renamed from: c */
    public void m144867c() {
    }

    @Override // p586vt.InterfaceC28625j
    /* renamed from: lk */
    public void mo57172lk(AbstractC28627l abstractC28627l) {
        String str;
        C21690e c21690e;
        C21689d c21689d;
        AbstractC28997t fVar;
        AbstractC28997t cVar;
        if (abstractC28627l instanceof C21688c.b) {
            C21688c.b bVar = (C21688c.b) abstractC28627l;
            if (mo144690a(bVar)) {
                int m111856g = bVar.m111856g();
                boolean m135069I = C26263i.m135055u().m135069I();
                int i11 = bVar.f132722a;
                int i12 = bVar.f105263d;
                AbstractC28626k m143178a = bVar.m143178a();
                AbstractC28618c abstractC28618c = null;
                if (m143178a != null) {
                    str = m143178a.toString();
                } else {
                    str = null;
                }
                AbstractC28626k m143178a2 = bVar.m143178a();
                if (m143178a2 instanceof C21690e) {
                    c21690e = (C21690e) m143178a2;
                } else {
                    c21690e = null;
                }
                if (c21690e != null) {
                    c21689d = c21690e.m111895u();
                } else {
                    c21689d = null;
                }
                C26676b.m136952b("SMLZCloudOnboardingJobStateExt", "updateJobStatus(): phase=" + i11 + ", progress=" + i12 + ", jobResult=" + str + ", syncErrorData=" + c21689d + ", isSyncJobInterrupted=" + m135069I);
                int i13 = bVar.f132722a;
                if (i13 == 0 && m135069I) {
                    C26676b.m136952b("SMLZCloudOnboardingJobStateExt", "Sync job interrupted");
                    mo144691b(new AbstractC28997t.c(m111856g, null, true, 2, null));
                    m144867c();
                    return;
                }
                if (i13 > 0 && i13 <= 17) {
                    if (i13 == 1) {
                        cVar = new AbstractC28997t.d(m111856g);
                    } else {
                        if (3 <= i13 && i13 < 17) {
                            fVar = new AbstractC28997t.b(m111856g, i13, bVar.f105263d);
                        } else if (i13 == 17) {
                            AbstractC28626k m143178a3 = bVar.m143178a();
                            if (m143178a3 != null && m143178a3.m143172f()) {
                                cVar = new AbstractC28997t.e(m111856g);
                            } else {
                                if (m143178a3 != null) {
                                    abstractC28618c = m143178a3.m143169b();
                                }
                                cVar = new AbstractC28997t.c(m111856g, abstractC28618c, m135069I);
                            }
                        } else {
                            fVar = new AbstractC28997t.f(m111856g, i13, bVar.f105263d);
                        }
                        cVar = fVar;
                    }
                    mo144691b(cVar);
                }
            }
        }
    }
}
