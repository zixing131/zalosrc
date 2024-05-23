package p088d1;

import java.util.ArrayList;
import p045c1.C3187f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d1.m */
/* loaded from: classes2.dex */
public class C17704m {

    /* renamed from: h */
    public static int f89750h;

    /* renamed from: c */
    AbstractC17707p f89753c;

    /* renamed from: d */
    AbstractC17707p f89754d;

    /* renamed from: f */
    int f89756f;

    /* renamed from: g */
    int f89757g;

    /* renamed from: a */
    public int f89751a = 0;

    /* renamed from: b */
    public boolean f89752b = false;

    /* renamed from: e */
    ArrayList f89755e = new ArrayList();

    public C17704m(AbstractC17707p abstractC17707p, int i11) {
        this.f89753c = null;
        this.f89754d = null;
        int i12 = f89750h;
        this.f89756f = i12;
        f89750h = i12 + 1;
        this.f89753c = abstractC17707p;
        this.f89754d = abstractC17707p;
        this.f89757g = i11;
    }

    /* renamed from: c */
    private long m93756c(C17697f c17697f, long j11) {
        AbstractC17707p abstractC17707p = c17697f.f89726d;
        if (abstractC17707p instanceof C17702k) {
            return j11;
        }
        int size = c17697f.f89733k.size();
        long j12 = j11;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC17695d interfaceC17695d = (InterfaceC17695d) c17697f.f89733k.get(i11);
            if (interfaceC17695d instanceof C17697f) {
                C17697f c17697f2 = (C17697f) interfaceC17695d;
                if (c17697f2.f89726d != abstractC17707p) {
                    j12 = Math.min(j12, m93756c(c17697f2, c17697f2.f89728f + j11));
                }
            }
        }
        if (c17697f == abstractC17707p.f89784i) {
            long mo93720j = j11 - abstractC17707p.mo93720j();
            return Math.min(Math.min(j12, m93756c(abstractC17707p.f89783h, mo93720j)), mo93720j - abstractC17707p.f89783h.f89728f);
        }
        return j12;
    }

    /* renamed from: d */
    private long m93757d(C17697f c17697f, long j11) {
        AbstractC17707p abstractC17707p = c17697f.f89726d;
        if (abstractC17707p instanceof C17702k) {
            return j11;
        }
        int size = c17697f.f89733k.size();
        long j12 = j11;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC17695d interfaceC17695d = (InterfaceC17695d) c17697f.f89733k.get(i11);
            if (interfaceC17695d instanceof C17697f) {
                C17697f c17697f2 = (C17697f) interfaceC17695d;
                if (c17697f2.f89726d != abstractC17707p) {
                    j12 = Math.max(j12, m93757d(c17697f2, c17697f2.f89728f + j11));
                }
            }
        }
        if (c17697f == abstractC17707p.f89783h) {
            long mo93720j = j11 + abstractC17707p.mo93720j();
            return Math.max(Math.max(j12, m93757d(abstractC17707p.f89784i, mo93720j)), mo93720j - abstractC17707p.f89784i.f89728f);
        }
        return j12;
    }

    /* renamed from: a */
    public void m93758a(AbstractC17707p abstractC17707p) {
        this.f89755e.add(abstractC17707p);
        this.f89754d = abstractC17707p;
    }

    /* renamed from: b */
    public long m93759b(C3187f c3187f, int i11) {
        AbstractC17707p abstractC17707p;
        AbstractC17707p abstractC17707p2;
        long mo93720j;
        int i12;
        AbstractC17707p abstractC17707p3 = this.f89753c;
        long j11 = 0;
        if (abstractC17707p3 instanceof C17694c) {
            if (((C17694c) abstractC17707p3).f89781f != i11) {
                return 0L;
            }
        } else if (i11 == 0) {
            if (!(abstractC17707p3 instanceof C17703l)) {
                return 0L;
            }
        } else if (!(abstractC17707p3 instanceof C17705n)) {
            return 0L;
        }
        if (i11 == 0) {
            abstractC17707p = c3187f.f13529e;
        } else {
            abstractC17707p = c3187f.f13531f;
        }
        C17697f c17697f = abstractC17707p.f89783h;
        if (i11 == 0) {
            abstractC17707p2 = c3187f.f13529e;
        } else {
            abstractC17707p2 = c3187f.f13531f;
        }
        C17697f c17697f2 = abstractC17707p2.f89784i;
        boolean contains = abstractC17707p3.f89783h.f89734l.contains(c17697f);
        boolean contains2 = this.f89753c.f89784i.f89734l.contains(c17697f2);
        long mo93720j2 = this.f89753c.mo93720j();
        if (contains && contains2) {
            long m93757d = m93757d(this.f89753c.f89783h, 0L);
            long m93756c = m93756c(this.f89753c.f89784i, 0L);
            long j12 = m93757d - mo93720j2;
            AbstractC17707p abstractC17707p4 = this.f89753c;
            int i13 = abstractC17707p4.f89784i.f89728f;
            if (j12 >= (-i13)) {
                j12 += i13;
            }
            int i14 = abstractC17707p4.f89783h.f89728f;
            long j13 = ((-m93756c) - mo93720j2) - i14;
            if (j13 >= i14) {
                j13 -= i14;
            }
            float m16117s = abstractC17707p4.f89777b.m16117s(i11);
            if (m16117s > 0.0f) {
                j11 = (((float) j13) / m16117s) + (((float) j12) / (1.0f - m16117s));
            }
            float f11 = (float) j11;
            long j14 = (f11 * m16117s) + 0.5f + mo93720j2 + (f11 * (1.0f - m16117s)) + 0.5f;
            mo93720j = r13.f89783h.f89728f + j14;
            i12 = this.f89753c.f89784i.f89728f;
        } else {
            if (contains) {
                return Math.max(m93757d(this.f89753c.f89783h, r13.f89728f), this.f89753c.f89783h.f89728f + mo93720j2);
            }
            if (contains2) {
                return Math.max(-m93756c(this.f89753c.f89784i, r13.f89728f), (-this.f89753c.f89784i.f89728f) + mo93720j2);
            }
            mo93720j = r13.f89783h.f89728f + this.f89753c.mo93720j();
            i12 = this.f89753c.f89784i.f89728f;
        }
        return mo93720j - i12;
    }
}
