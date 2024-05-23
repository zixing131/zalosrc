package ua;

import java.util.Iterator;
import java.util.LinkedList;
import va.C27953a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ua.f */
/* loaded from: classes3.dex */
public final class C27212f {

    /* renamed from: e */
    static final C27212f f127942e = new C27212f(AbstractC27213g.f127947b, 0, 0, 0);

    /* renamed from: a */
    private final int f127943a;

    /* renamed from: b */
    private final AbstractC27213g f127944b;

    /* renamed from: c */
    private final int f127945c;

    /* renamed from: d */
    private final int f127946d;

    private C27212f(AbstractC27213g abstractC27213g, int i11, int i12, int i13) {
        this.f127944b = abstractC27213g;
        this.f127943a = i11;
        this.f127945c = i12;
        this.f127946d = i13;
    }

    /* renamed from: b */
    private static int m139296b(C27212f c27212f) {
        int i11 = c27212f.f127945c;
        if (i11 > 62) {
            return 21;
        }
        if (i11 > 31) {
            return 20;
        }
        if (i11 > 0) {
            return 10;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C27212f m139297a(int i11) {
        int i12;
        AbstractC27213g abstractC27213g = this.f127944b;
        int i13 = this.f127943a;
        int i14 = this.f127946d;
        if (i13 == 4 || i13 == 2) {
            int i15 = C27210d.f127935c[i13][0];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            abstractC27213g = abstractC27213g.m139306a(i16, i17);
            i14 += i17;
            i13 = 0;
        }
        int i18 = this.f127945c;
        if (i18 != 0 && i18 != 31) {
            if (i18 == 62) {
                i12 = 9;
            } else {
                i12 = 8;
            }
        } else {
            i12 = 18;
        }
        C27212f c27212f = new C27212f(abstractC27213g, i13, i18 + 1, i14 + i12);
        if (c27212f.f127945c == 2078) {
            return c27212f.m139298c(i11 + 1);
        }
        return c27212f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C27212f m139298c(int i11) {
        int i12 = this.f127945c;
        if (i12 == 0) {
            return this;
        }
        return new C27212f(this.f127944b.m139307b(i11 - i12, i12), this.f127943a, 0, this.f127946d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m139299d() {
        return this.f127945c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m139300e() {
        return this.f127946d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m139301f() {
        return this.f127943a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m139302g(C27212f c27212f) {
        int i11 = this.f127946d + (C27210d.f127935c[this.f127943a][c27212f.f127943a] >> 16);
        int i12 = this.f127945c;
        int i13 = c27212f.f127945c;
        if (i12 < i13) {
            i11 += m139296b(c27212f) - m139296b(this);
        } else if (i12 > i13 && i13 > 0) {
            i11 += 10;
        }
        if (i11 <= c27212f.f127946d) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C27212f m139303h(int i11, int i12) {
        int i13;
        int i14 = this.f127946d;
        AbstractC27213g abstractC27213g = this.f127944b;
        int i15 = this.f127943a;
        if (i11 != i15) {
            int i16 = C27210d.f127935c[i15][i11];
            int i17 = 65535 & i16;
            int i18 = i16 >> 16;
            abstractC27213g = abstractC27213g.m139306a(i17, i18);
            i14 += i18;
        }
        if (i11 == 2) {
            i13 = 4;
        } else {
            i13 = 5;
        }
        return new C27212f(abstractC27213g.m139306a(i12, i13), i11, 0, i14 + i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C27212f m139304i(int i11, int i12) {
        int i13;
        AbstractC27213g abstractC27213g = this.f127944b;
        int i14 = this.f127943a;
        if (i14 == 2) {
            i13 = 4;
        } else {
            i13 = 5;
        }
        return new C27212f(abstractC27213g.m139306a(C27210d.f127937e[i14][i11], i13).m139306a(i12, 5), this.f127943a, 0, this.f127946d + i13 + 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C27953a m139305j(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (AbstractC27213g abstractC27213g = m139298c(bArr.length).f127944b; abstractC27213g != null; abstractC27213g = abstractC27213g.m139308d()) {
            linkedList.addFirst(abstractC27213g);
        }
        C27953a c27953a = new C27953a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((AbstractC27213g) it.next()).mo139279c(c27953a, bArr);
        }
        return c27953a;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", C27210d.f127934b[this.f127943a], Integer.valueOf(this.f127946d), Integer.valueOf(this.f127945c));
    }
}
