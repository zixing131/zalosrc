package p110dt;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: dt.c */
/* loaded from: classes4.dex */
public abstract class AbstractC18068c {
    /* renamed from: a */
    public static final boolean m96073a(C18067b c18067b, C18067b c18067b2) {
        AbstractC19074t.m100208f(c18067b, "<this>");
        AbstractC19074t.m100208f(c18067b2, "other");
        if (Math.abs(c18067b2.m96068c() - c18067b.m96068c()) < c18067b.m96067b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m96074b(C18067b c18067b, C18067b c18067b2) {
        AbstractC19074t.m100208f(c18067b, "<this>");
        AbstractC19074t.m100208f(c18067b2, "other");
        if (Math.abs(c18067b2.m96069d() - c18067b.m96069d()) < c18067b.m96067b()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m96075c(int i11) {
        return i11 == 0;
    }

    /* renamed from: d */
    public static final boolean m96076d(int i11, int i12) {
        return i11 == i12 - 1;
    }

    /* renamed from: e */
    public static final boolean m96077e(C18067b c18067b, C18067b c18067b2) {
        AbstractC19074t.m100208f(c18067b, "<this>");
        AbstractC19074t.m100208f(c18067b2, "other");
        if (c18067b.m96068c() > c18067b2.m96068c()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m96078f(C18067b c18067b, C18067b c18067b2) {
        AbstractC19074t.m100208f(c18067b, "<this>");
        AbstractC19074t.m100208f(c18067b2, "other");
        if (c18067b.m96068c() < c18067b2.m96068c()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m96079g(C18067b c18067b, C18067b c18067b2) {
        AbstractC19074t.m100208f(c18067b, "<this>");
        AbstractC19074t.m100208f(c18067b2, "other");
        if (c18067b.m96069d() > c18067b2.m96069d()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m96080h(C18067b c18067b, C18067b c18067b2) {
        AbstractC19074t.m100208f(c18067b, "<this>");
        AbstractC19074t.m100208f(c18067b2, "other");
        if (c18067b.m96069d() < c18067b2.m96069d()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final void m96081i(List list) {
        boolean z11;
        AbstractC19074t.m100208f(list, "lines");
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            C18067b c18067b = (C18067b) list.get(i11);
            if (c18067b.m96068c() == c18067b.m96069d()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !z11;
            if (i11 > 0 && z12) {
                C18067b c18067b2 = (C18067b) list.get(i11 - 1);
                if (m96077e(c18067b, c18067b2) && m96073a(c18067b, c18067b2)) {
                    c18067b.m96071f(c18067b2.m96068c());
                }
                if (m96080h(c18067b, c18067b2) && m96074b(c18067b, c18067b2)) {
                    c18067b.m96072g(c18067b2.m96069d());
                }
            }
            if (i11 < list.size() - 1 && z12) {
                C18067b c18067b3 = (C18067b) list.get(i11 + 1);
                if (m96077e(c18067b, c18067b3) && m96073a(c18067b, c18067b3)) {
                    c18067b.m96071f(c18067b3.m96068c());
                    break;
                } else if (m96080h(c18067b, c18067b3) && m96074b(c18067b, c18067b3)) {
                    c18067b.m96072g(c18067b3.m96069d());
                    break;
                }
            }
            if (i11 == list.size() - 1) {
                return;
            } else {
                i11++;
            }
        }
        m96081i(list);
    }
}
