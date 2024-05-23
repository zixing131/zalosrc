package w50;

import dj.C17945a0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import p716zh.C32090r5;

/* renamed from: w50.c */
/* loaded from: classes5.dex */
public class C28771c {

    /* renamed from: e */
    private int f133347e;

    /* renamed from: f */
    private int f133348f;

    /* renamed from: g */
    private boolean f133349g;

    /* renamed from: h */
    private boolean f133350h;

    /* renamed from: i */
    private boolean f133351i;

    /* renamed from: j */
    private boolean f133352j;

    /* renamed from: k */
    private boolean f133353k;

    /* renamed from: l */
    private boolean f133354l;

    /* renamed from: a */
    private List f133343a = new ArrayList();

    /* renamed from: b */
    private List f133344b = new ArrayList();

    /* renamed from: c */
    private final List f133345c = new ArrayList();

    /* renamed from: d */
    private List f133346d = new ArrayList();

    /* renamed from: m */
    private boolean f133355m = false;

    /* renamed from: n */
    private boolean f133356n = false;

    /* renamed from: o */
    private boolean f133357o = false;

    /* renamed from: p */
    private boolean f133358p = false;

    public C28771c(int i11) {
        this.f133347e = i11;
    }

    /* renamed from: A */
    public void m143928A(boolean z11) {
        this.f133358p = z11;
    }

    /* renamed from: B */
    public void m143929B(boolean z11) {
        this.f133356n = z11;
    }

    /* renamed from: C */
    public void m143930C(boolean z11) {
        this.f133357o = z11;
    }

    /* renamed from: D */
    public void m143931D(List list) {
        this.f133343a = list;
    }

    /* renamed from: E */
    public void m143932E(List list) {
        this.f133344b = list;
    }

    /* renamed from: F */
    public void m143933F(List list) {
        this.f133346d = list;
    }

    /* renamed from: G */
    public void m143934G(int i11) {
        this.f133348f = i11;
    }

    /* renamed from: H */
    public void m143935H(boolean z11) {
        this.f133351i = z11;
    }

    /* renamed from: I */
    public void m143936I(boolean z11) {
        this.f133353k = z11;
    }

    /* renamed from: J */
    public void m143937J(boolean z11) {
        this.f133350h = z11;
    }

    /* renamed from: K */
    public void m143938K(boolean z11) {
        this.f133352j = z11;
    }

    /* renamed from: L */
    public void m143939L(boolean z11) {
        this.f133354l = z11;
    }

    /* renamed from: M */
    public void m143940M(boolean z11) {
        this.f133355m = z11;
    }

    /* renamed from: a */
    public void m143941a(C17945a0 c17945a0) {
        this.f133345c.add(c17945a0);
    }

    /* renamed from: b */
    public void m143942b(C17945a0 c17945a0) {
        this.f133345c.add(0, c17945a0);
    }

    /* renamed from: c */
    public boolean m143943c() {
        for (C17945a0 c17945a0 : this.f133344b) {
            C32090r5 m154810i = C32090r5.m154810i();
            if (m154810i.m154824o() && m154810i.m154823n(c17945a0.m95029V3(), c17945a0.mo95039W2())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m143944d() {
        return this.f133351i;
    }

    /* renamed from: e */
    public boolean m143945e() {
        return this.f133353k;
    }

    /* renamed from: f */
    public boolean m143946f() {
        return this.f133350h;
    }

    /* renamed from: g */
    public boolean m143947g() {
        return this.f133352j;
    }

    /* renamed from: h */
    public boolean m143948h() {
        return this.f133354l;
    }

    /* renamed from: i */
    public int m143949i() {
        Exception e11;
        int i11;
        List list;
        try {
            list = this.f133343a;
        } catch (Exception e12) {
            e11 = e12;
            i11 = 0;
        }
        if (list != null && !list.isEmpty()) {
            int size = this.f133343a.size();
            i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    if (!((C17945a0) this.f133343a.get(i12)).m95022U7()) {
                        i11++;
                    }
                } catch (Exception e13) {
                    e11 = e13;
                    AbstractC20110a.m104539h(e11);
                    return i11;
                }
            }
            return i11;
        }
        return 0;
    }

    /* renamed from: j */
    public List m143950j() {
        return this.f133345c;
    }

    /* renamed from: k */
    public C17945a0 m143951k() {
        if (this.f133345c.size() > 0) {
            return (C17945a0) this.f133345c.get(0);
        }
        return null;
    }

    /* renamed from: l */
    public int m143952l() {
        return this.f133347e;
    }

    /* renamed from: m */
    public C17945a0 m143953m(int i11) {
        if (i11 >= 0 && i11 < this.f133345c.size()) {
            return (C17945a0) this.f133345c.get(i11);
        }
        return null;
    }

    /* renamed from: n */
    public C17945a0 m143954n() {
        if (this.f133345c.size() > 0) {
            return (C17945a0) this.f133345c.get(r0.size() - 1);
        }
        return null;
    }

    /* renamed from: o */
    public List m143955o() {
        return this.f133343a;
    }

    /* renamed from: p */
    public List m143956p() {
        return this.f133344b;
    }

    /* renamed from: q */
    public List m143957q() {
        return this.f133346d;
    }

    /* renamed from: r */
    public int m143958r() {
        return this.f133348f;
    }

    /* renamed from: s */
    public int m143959s() {
        return this.f133345c.size();
    }

    /* renamed from: t */
    public boolean m143960t() {
        return this.f133356n;
    }

    public String toString() {
        return "MultiChatContent{firstItem=" + m143951k() + "groupType=" + this.f133347e + '}';
    }

    /* renamed from: u */
    public boolean m143961u() {
        return this.f133357o;
    }

    /* renamed from: v */
    public boolean m143962v() {
        return this.f133349g;
    }

    /* renamed from: w */
    public boolean m143963w() {
        return this.f133358p;
    }

    /* renamed from: x */
    public boolean m143964x() {
        return this.f133347e == 2;
    }

    /* renamed from: y */
    public boolean m143965y() {
        return this.f133355m;
    }

    /* renamed from: z */
    public void m143966z(boolean z11) {
        this.f133349g = z11;
    }
}
