package kg;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: kg.g */
/* loaded from: classes3.dex */
public class C21710g implements InterfaceC21713j {

    /* renamed from: v */
    private static final C21712i f105442v = C21712i.m112059b();

    /* renamed from: w */
    private static int f105443w = 0;

    /* renamed from: p */
    private final C21715l f105444p = C21715l.m112062k();

    /* renamed from: q */
    private final CopyOnWriteArrayList f105445q = new CopyOnWriteArrayList();

    /* renamed from: r */
    private final CopyOnWriteArrayList f105446r = new CopyOnWriteArrayList();

    /* renamed from: s */
    private int f105447s = -1;

    /* renamed from: t */
    private final C21711h f105448t;

    /* renamed from: u */
    private final C21711h f105449u;

    private C21710g(int i11, int i12, int i13, int i14) {
        C21711h m112058a = C21711h.m112058a(i11, i12);
        this.f105448t = m112058a;
        C21711h m112058a2 = C21711h.m112058a(i13, i14);
        this.f105449u = m112058a2;
        C21712i c21712i = f105442v;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("main spring ");
        int i15 = f105443w;
        f105443w = i15 + 1;
        sb2.append(i15);
        c21712i.m112060a(m112058a, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("attachment spring ");
        int i16 = f105443w;
        f105443w = i16 + 1;
        sb3.append(i16);
        c21712i.m112060a(m112058a2, sb3.toString());
    }

    /* renamed from: f */
    public static C21710g m112053f(int i11, int i12, int i13, int i14) {
        return new C21710g(i11, i12, i13, i14);
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: a */
    public void mo39827a(C21709f c21709f) {
        int i11;
        int i12;
        int indexOf = this.f105446r.indexOf(c21709f);
        InterfaceC21713j interfaceC21713j = (InterfaceC21713j) this.f105445q.get(indexOf);
        int i13 = this.f105447s;
        if (indexOf == i13) {
            i12 = indexOf - 1;
            i11 = indexOf + 1;
        } else if (indexOf < i13) {
            i12 = indexOf - 1;
            i11 = -1;
        } else {
            if (indexOf > i13) {
                i11 = indexOf + 1;
            } else {
                i11 = -1;
            }
            i12 = -1;
        }
        if (i11 > -1 && i11 < this.f105446r.size()) {
            ((C21709f) this.f105446r.get(i11)).m112046s(c21709f.m112033d());
        }
        if (i12 > -1 && i12 < this.f105446r.size()) {
            ((C21709f) this.f105446r.get(i12)).m112046s(c21709f.m112033d());
        }
        interfaceC21713j.mo39827a(c21709f);
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: b */
    public void mo39828b(C21709f c21709f) {
        ((InterfaceC21713j) this.f105445q.get(this.f105446r.indexOf(c21709f))).mo39828b(c21709f);
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: c */
    public void mo39829c(C21709f c21709f) {
        ((InterfaceC21713j) this.f105445q.get(this.f105446r.indexOf(c21709f))).mo39829c(c21709f);
    }

    /* renamed from: d */
    public C21710g m112054d(InterfaceC21713j interfaceC21713j) {
        this.f105446r.add(this.f105444p.m112019d().m112030a(this).m112048u(this.f105449u));
        this.f105445q.add(interfaceC21713j);
        return this;
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: e */
    public void mo39830e(C21709f c21709f) {
        ((InterfaceC21713j) this.f105445q.get(this.f105446r.indexOf(c21709f))).mo39830e(c21709f);
    }

    /* renamed from: g */
    public List m112055g() {
        return this.f105446r;
    }

    /* renamed from: h */
    public C21709f m112056h() {
        return (C21709f) this.f105446r.get(this.f105447s);
    }

    /* renamed from: i */
    public C21710g m112057i(int i11) {
        this.f105447s = i11;
        if (((C21709f) this.f105446r.get(i11)) == null) {
            return null;
        }
        Iterator it = this.f105444p.m112021f().iterator();
        while (it.hasNext()) {
            ((C21709f) it.next()).m112048u(this.f105449u);
        }
        m112056h().m112048u(this.f105448t);
        return this;
    }
}
