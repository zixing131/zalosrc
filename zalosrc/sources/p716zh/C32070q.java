package p716zh;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p648xk.AbstractC29692h;
import p648xk.C29686b;
import p648xk.C29687c;
import p648xk.InterfaceC29685a;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;
import p716zh.C32070q;

/* renamed from: zh.q */
/* loaded from: classes3.dex */
public class C32070q {

    /* renamed from: a */
    public int f147662a;

    /* renamed from: b */
    public long f147663b;

    /* renamed from: c */
    public String f147664c;

    /* renamed from: d */
    public a f147665d;

    /* renamed from: zh.q$a */
    /* loaded from: classes3.dex */
    public static class a implements InterfaceC29685a {

        /* renamed from: b */
        public static final InterfaceC29685a.a f147666b = new InterfaceC29685a.a() { // from class: zh.p
            @Override // p648xk.InterfaceC29685a.a
            /* renamed from: a */
            public final InterfaceC29685a mo147640a(InterfaceC29690f interfaceC29690f) {
                C32070q.a m154709e;
                m154709e = C32070q.a.m154709e(interfaceC29690f);
                return m154709e;
            }
        };

        /* renamed from: a */
        public final Map f147667a = Collections.synchronizedMap(new LinkedHashMap());

        /* renamed from: c */
        static a m154708c(InterfaceC29690f interfaceC29690f) {
            a aVar = new a();
            int mo147644d = interfaceC29690f.mo147644d();
            for (int i11 = 0; i11 < mo147644d; i11++) {
                long mo147647g = interfaceC29690f.mo147647g();
                int mo147648h = interfaceC29690f.mo147648h();
                if (mo147648h != 4 && mo147648h != 3) {
                    mo147648h = mo147648h == 17 ? 4 : 3;
                }
                aVar.m154711f(mo147647g, mo147648h);
            }
            return aVar;
        }

        /* renamed from: e */
        public static /* synthetic */ a m154709e(InterfaceC29690f interfaceC29690f) {
            int mo147644d = interfaceC29690f.mo147644d();
            int mo147644d2 = interfaceC29690f.mo147644d();
            if (mo147644d == 0) {
                return m154708c(interfaceC29690f);
            }
            if (mo147644d2 <= 0) {
                return m154708c(interfaceC29690f);
            }
            return null;
        }

        @Override // p648xk.InterfaceC29685a
        /* renamed from: a */
        public void mo147639a(InterfaceC29691g interfaceC29691g) {
            interfaceC29691g.mo147652a(0);
            interfaceC29691g.mo147652a(0);
            synchronized (this.f147667a) {
                try {
                    interfaceC29691g.mo147652a(this.f147667a.size());
                    Iterator it = this.f147667a.keySet().iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        interfaceC29691g.mo147657f(longValue);
                        interfaceC29691g.mo147656e(((Integer) this.f147667a.get(Long.valueOf(longValue))).intValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: d */
        public int m154710d(long j11) {
            Integer num = (Integer) this.f147667a.get(Long.valueOf(j11));
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }

        /* renamed from: f */
        public void m154711f(long j11, int i11) {
            this.f147667a.remove(Long.valueOf(j11));
            this.f147667a.put(Long.valueOf(j11), Integer.valueOf(i11));
        }
    }

    public C32070q() {
        this.f147662a = 0;
        this.f147663b = 0L;
        this.f147664c = "";
        this.f147665d = new a();
    }

    /* renamed from: a */
    public void m154705a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                C29686b c29686b = new C29686b(bArr);
                if (c29686b.mo147644d() == 0) {
                    while (c29686b.m147649i() > 0) {
                        InterfaceC29685a m147683a = AbstractC29692h.m147683a(c29686b);
                        if (m147683a instanceof a) {
                            this.f147665d = (a) m147683a;
                        }
                    }
                }
                c29686b.m147650j();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public byte[] m154706b() {
        a aVar;
        try {
            C29687c c29687c = new C29687c();
            c29687c.mo147652a(this.f147662a);
            if (this.f147662a == 0 && (aVar = this.f147665d) != null) {
                try {
                    AbstractC29692h.m147686d(aVar, c29687c);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            byte[] m147660i = c29687c.m147660i();
            c29687c.m147659h();
            return m147660i;
        } catch (Exception e12) {
            e12.printStackTrace();
            return null;
        }
    }

    public C32070q(long j11, String str, a aVar) {
        this.f147662a = 0;
        this.f147663b = 0L;
        this.f147664c = "";
        new a();
        this.f147663b = j11;
        this.f147664c = str;
        this.f147665d = aVar;
    }
}
