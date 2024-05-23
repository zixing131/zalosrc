package id0;

import com.zing.zalo.uidrawing.C16719g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: id0.c */
/* loaded from: classes4.dex */
public class C20517c extends C20516b {

    /* renamed from: i */
    List f100803i = new ArrayList();

    /* renamed from: j */
    int f100804j = 0;

    @Override // id0.C20516b
    /* renamed from: a */
    public boolean mo106585a(C16719g c16719g, long j11) {
        int i11 = this.f100804j;
        boolean z11 = true;
        boolean z12 = false;
        if (i11 == 0) {
            Iterator it = this.f100803i.iterator();
            while (true) {
                if (it.hasNext()) {
                    C20516b c20516b = (C20516b) it.next();
                    long j12 = c20516b.f100796a;
                    if (j11 > j12) {
                        j11 -= j12;
                    } else {
                        c20516b.mo106585a(c16719g, j11);
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            z12 = z11;
        } else if (i11 == 1) {
            Iterator it2 = this.f100803i.iterator();
            while (it2.hasNext()) {
                z12 |= ((C20516b) it2.next()).mo106585a(c16719g, j11);
            }
        }
        if (z12) {
            c16719g.invalidate();
        }
        return z12;
    }

    @Override // id0.C20516b
    /* renamed from: b */
    public void mo106586b(C16719g c16719g) {
        Iterator it = this.f100803i.iterator();
        while (it.hasNext()) {
            ((C20516b) it.next()).mo106586b(c16719g);
        }
    }

    @Override // id0.C20516b
    /* renamed from: h */
    public void mo106592h(C16719g c16719g) {
        Iterator it = this.f100803i.iterator();
        while (it.hasNext()) {
            ((C20516b) it.next()).mo106592h(c16719g);
        }
    }

    /* renamed from: o */
    public C20517c m106598o(C20516b c20516b) {
        if (c20516b != null) {
            this.f100803i.add(c20516b);
        }
        return this;
    }
}
