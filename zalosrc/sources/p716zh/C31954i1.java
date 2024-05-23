package p716zh;

import dj.C17945a0;
import dj.C17969i0;
import p648xk.AbstractC29692h;
import p648xk.C29686b;
import p648xk.C29687c;
import p648xk.InterfaceC29685a;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* renamed from: zh.i1 */
/* loaded from: classes3.dex */
public class C31954i1 implements InterfaceC29685a {

    /* renamed from: b */
    public static final InterfaceC29685a.a f146854b = new InterfaceC29685a.a() { // from class: zh.h1
        @Override // p648xk.InterfaceC29685a.a
        /* renamed from: a */
        public final InterfaceC29685a mo147640a(InterfaceC29690f interfaceC29690f) {
            C31954i1 m153653f;
            m153653f = C31954i1.m153653f(interfaceC29690f);
            return m153653f;
        }
    };

    /* renamed from: a */
    public String f146855a;

    public C31954i1() {
        this.f146855a = "";
    }

    /* renamed from: c */
    static C31954i1 m153651c(InterfaceC29690f interfaceC29690f) {
        C31954i1 c31954i1 = new C31954i1();
        c31954i1.f146855a = interfaceC29690f.mo147646f();
        return c31954i1;
    }

    /* renamed from: d */
    public static C31954i1 m153652d(byte[] bArr) {
        C31954i1 c31954i1 = null;
        if (bArr != null && bArr.length > 0) {
            try {
                C29686b c29686b = new C29686b(bArr);
                while (c29686b.m147649i() > 0) {
                    InterfaceC29685a m147683a = AbstractC29692h.m147683a(c29686b);
                    if (m147683a instanceof C31954i1) {
                        c31954i1 = (C31954i1) m147683a;
                    }
                }
                c29686b.m147650j();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return c31954i1;
    }

    /* renamed from: f */
    public static /* synthetic */ C31954i1 m153653f(InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        int mo147644d2 = interfaceC29690f.mo147644d();
        if (mo147644d == 0) {
            return m153651c(interfaceC29690f);
        }
        if (mo147644d2 <= 0) {
            return m153651c(interfaceC29690f);
        }
        return null;
    }

    /* renamed from: g */
    public static byte[] m153654g(C31954i1 c31954i1) {
        C29687c c29687c = new C29687c();
        AbstractC29692h.m147686d(c31954i1, c29687c);
        byte[] m147660i = c29687c.m147660i();
        c29687c.m147659h();
        return m147660i;
    }

    @Override // p648xk.InterfaceC29685a
    /* renamed from: a */
    public void mo147639a(InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147655d(this.f146855a);
    }

    /* renamed from: e */
    public String m153655e() {
        return this.f146855a;
    }

    public C31954i1(C17945a0 c17945a0) {
        this.f146855a = "";
        if (c17945a0.m94977P7()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2.f91016u.equals("recommened.misscall") || m94929K2.f91016u.equals("recommened.calltime") || m94929K2.f91016u.equals("recommened.groupcall")) {
                this.f146855a = m94929K2.mo95393c();
            }
        }
    }

    public C31954i1(C31924g1 c31924g1) {
        this.f146855a = "";
        if (c31924g1 != null) {
            this.f146855a = c31924g1.toString();
        }
    }
}
