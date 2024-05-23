package p648xk;

import java.util.HashMap;
import p648xk.InterfaceC29685a;
import p716zh.C31954i1;
import p716zh.C32070q;

/* renamed from: xk.h */
/* loaded from: classes3.dex */
public abstract class AbstractC29692h {

    /* renamed from: a */
    private static final HashMap f137147a = new HashMap();

    /* renamed from: b */
    private static final HashMap f137148b = new HashMap();

    static {
        m147684b();
    }

    /* renamed from: a */
    public static InterfaceC29685a m147683a(InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        int mo147644d2 = interfaceC29690f.mo147644d();
        InterfaceC29685a.a aVar = (InterfaceC29685a.a) f137147a.get(Integer.valueOf(mo147644d));
        if (aVar != null) {
            int position = interfaceC29690f.getPosition();
            interfaceC29690f.mo147645e(0);
            try {
                InterfaceC29685a mo147640a = aVar.mo147640a(interfaceC29690f);
                int position2 = mo147644d2 - (interfaceC29690f.getPosition() - position);
                if (mo147644d2 > 0) {
                    if (position2 > 0) {
                        interfaceC29690f.mo147641a(position2);
                    } else if (position2 < 0) {
                        if (interfaceC29690f.mo147642b()) {
                            interfaceC29690f.reset();
                            interfaceC29690f.mo147641a(mo147644d2);
                        } else {
                            throw new RuntimeException("Serializable logic error");
                        }
                    }
                } else if (mo147640a == null) {
                    throw new RuntimeException("Serializable create error");
                }
                return mo147640a;
            } catch (Exception e11) {
                if (interfaceC29690f.mo147642b()) {
                    interfaceC29690f.reset();
                    interfaceC29690f.mo147641a(mo147644d2);
                    return null;
                }
                throw e11;
            }
        }
        if (mo147644d2 > 0) {
            interfaceC29690f.mo147641a(mo147644d2);
            return null;
        }
        throw new RuntimeException("Serializable is unsupported");
    }

    /* renamed from: b */
    public static void m147684b() {
        m147685c(4, C32070q.a.f147666b, C32070q.a.class);
        m147685c(15, C31954i1.f146854b, C31954i1.class);
    }

    /* renamed from: c */
    public static void m147685c(int i11, InterfaceC29685a.a aVar, Class cls) {
        f137147a.put(Integer.valueOf(i11), aVar);
        f137148b.put(cls, Integer.valueOf(i11));
    }

    /* renamed from: d */
    public static void m147686d(InterfaceC29685a interfaceC29685a, InterfaceC29691g interfaceC29691g) {
        int intValue = ((Integer) f137148b.get(interfaceC29685a.getClass())).intValue();
        if (intValue > 0) {
            C29687c c29687c = new C29687c();
            interfaceC29685a.mo147639a(c29687c);
            byte[] m147660i = c29687c.m147660i();
            c29687c.m147659h();
            if (m147660i != null && m147660i.length > 0) {
                interfaceC29691g.mo147652a(intValue);
                interfaceC29691g.mo147652a(m147660i.length);
                interfaceC29691g.mo147653b(m147660i);
                return;
            }
            return;
        }
        throw new RuntimeException("Serializable is unsupported");
    }
}
