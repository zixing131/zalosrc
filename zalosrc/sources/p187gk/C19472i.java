package p187gk;

import ag0.C0824j;
import am.AbstractC0939u;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pm0.C24848g0;

/* renamed from: gk.i */
/* loaded from: classes3.dex */
public final class C19472i implements InterfaceC19468e {

    /* renamed from: a */
    private final InterfaceC19467d f96616a;

    /* renamed from: b */
    private int f96617b;

    /* renamed from: c */
    private List f96618c;

    /* renamed from: d */
    private int f96619d;

    /* renamed from: e */
    private boolean f96620e;

    /* renamed from: f */
    private final Object f96621f;

    /* renamed from: gk.i$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC0939u {

        /* renamed from: b */
        final /* synthetic */ String f96623b;

        a(String str) {
            this.f96623b = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                InterfaceC19466c m101810i = C19472i.this.m101810i(this.f96623b);
                if (m101810i != null) {
                    C19472i.this.f96616a.mo101797b(m101810i.mo101794a(), m101810i.mo101795b(), C19472i.this.m101817j());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C19472i(InterfaceC19467d interfaceC19467d, int i11) {
        AbstractC19074t.m100208f(interfaceC19467d, "mediaDataDB");
        this.f96616a = interfaceC19467d;
        this.f96617b = i11;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f96618c = synchronizedList;
        this.f96619d = interfaceC19467d.mo101798c();
        this.f96621f = new Object();
    }

    /* renamed from: h */
    private final void m101809h(InterfaceC19466c interfaceC19466c) {
        m101814n(interfaceC19466c);
        if (m101811k()) {
            m101815p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final InterfaceC19466c m101810i(String str) {
        int size = this.f96618c.size();
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC19466c interfaceC19466c = (InterfaceC19466c) this.f96618c.get(i11);
            if (AbstractC19074t.m100204b(interfaceC19466c.mo101794a(), str)) {
                return interfaceC19466c;
            }
        }
        return null;
    }

    /* renamed from: k */
    private final boolean m101811k() {
        if (this.f96618c.size() > this.f96619d) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final void m101812l() {
        try {
            for (String str : this.f96616a.mo101799d(this.f96617b)) {
                String mo101796a = this.f96616a.mo101796a(str, this.f96617b);
                if (mo101796a != null) {
                    int i11 = this.f96617b;
                    AbstractC19074t.m100205c(str);
                    m101809h(C19465b.m101792c(i11, str, mo101796a));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    private final void m101813m(InterfaceC19466c interfaceC19466c) {
        this.f96618c.set(0, interfaceC19466c);
    }

    /* renamed from: n */
    private final void m101814n(InterfaceC19466c interfaceC19466c) {
        this.f96618c.add(0, interfaceC19466c);
    }

    /* renamed from: p */
    private final InterfaceC19466c m101815p() {
        if (!this.f96618c.isEmpty()) {
            return (InterfaceC19466c) this.f96618c.remove(r0.size() - 1);
        }
        return null;
    }

    /* renamed from: q */
    private final void m101816q(String str) {
        C0824j.m2153b(new a(str));
    }

    @Override // p187gk.InterfaceC19468e
    /* renamed from: a */
    public void mo101800a() {
        synchronized (this.f96621f) {
            try {
                if (this.f96620e) {
                    this.f96618c.clear();
                    this.f96620e = false;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p187gk.InterfaceC19468e
    /* renamed from: b */
    public void mo101801b() {
        synchronized (this.f96621f) {
            try {
                if (!this.f96620e) {
                    this.f96618c.clear();
                    m101812l();
                    this.f96620e = true;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p187gk.InterfaceC19468e
    /* renamed from: c */
    public boolean mo101802c() {
        return this.f96620e;
    }

    @Override // p187gk.InterfaceC19468e
    /* renamed from: d */
    public void mo101803d(String str, InterfaceC19466c interfaceC19466c) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(interfaceC19466c, "mediaData");
        synchronized (this.f96621f) {
            try {
                if (this.f96620e) {
                    m101818o(str);
                    m101809h(interfaceC19466c);
                    m101816q(str);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p187gk.InterfaceC19468e
    /* renamed from: e */
    public InterfaceC19466c mo101804e(String str) {
        InterfaceC19466c m101810i;
        AbstractC19074t.m100208f(str, "name");
        synchronized (this.f96621f) {
            try {
                if (this.f96620e && (m101810i = m101810i(str)) != null) {
                    m101813m(m101810i);
                    return m101810i;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            return null;
        }
    }

    /* renamed from: j */
    public final int m101817j() {
        return this.f96617b;
    }

    /* renamed from: o */
    public void m101818o(String str) {
        AbstractC19074t.m100208f(str, "name");
        synchronized (this.f96621f) {
            try {
                if (this.f96620e) {
                    int size = this.f96618c.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        if (AbstractC19074t.m100204b(((InterfaceC19466c) this.f96618c.get(i11)).mo101794a(), str)) {
                            this.f96618c.remove(i11);
                            break;
                        }
                        i11++;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
