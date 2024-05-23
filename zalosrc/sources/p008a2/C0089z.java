package p008a2;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p119e2.InterfaceC18184i;
import p119e2.InterfaceC18185j;
import pm0.C24848g0;

/* renamed from: a2.z */
/* loaded from: classes.dex */
public final class C0089z implements InterfaceC18185j, InterfaceC18184i {

    /* renamed from: x */
    public static final a f420x = new a(null);

    /* renamed from: y */
    public static final TreeMap f421y = new TreeMap();

    /* renamed from: p */
    private final int f422p;

    /* renamed from: q */
    private volatile String f423q;

    /* renamed from: r */
    public final long[] f424r;

    /* renamed from: s */
    public final double[] f425s;

    /* renamed from: t */
    public final String[] f426t;

    /* renamed from: u */
    public final byte[][] f427u;

    /* renamed from: v */
    private final int[] f428v;

    /* renamed from: w */
    private int f429w;

    /* renamed from: a2.z$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0089z m407a(String str, int i11) {
            AbstractC19074t.m100208f(str, "query");
            TreeMap treeMap = C0089z.f421y;
            synchronized (treeMap) {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i11));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    C0089z c0089z = (C0089z) ceilingEntry.getValue();
                    c0089z.m405f(str, i11);
                    AbstractC19074t.m100207e(c0089z, "sqliteQuery");
                    return c0089z;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                C0089z c0089z2 = new C0089z(i11, null);
                c0089z2.m405f(str, i11);
                return c0089z2;
            }
        }

        /* renamed from: b */
        public final void m408b() {
            TreeMap treeMap = C0089z.f421y;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                AbstractC19074t.m100207e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i11 = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i11;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public /* synthetic */ C0089z(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: c */
    public static final C0089z m401c(String str, int i11) {
        return f420x.m407a(str, i11);
    }

    @Override // p119e2.InterfaceC18185j
    /* renamed from: a */
    public String mo402a() {
        String str = this.f423q;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // p119e2.InterfaceC18184i
    /* renamed from: a0 */
    public void mo219a0(int i11, String str) {
        AbstractC19074t.m100208f(str, "value");
        this.f428v[i11] = 4;
        this.f426t[i11] = str;
    }

    @Override // p119e2.InterfaceC18185j
    /* renamed from: b */
    public void mo403b(InterfaceC18184i interfaceC18184i) {
        AbstractC19074t.m100208f(interfaceC18184i, "statement");
        int m404d = m404d();
        if (1 <= m404d) {
            int i11 = 1;
            while (true) {
                int i12 = this.f428v[i11];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    byte[] bArr = this.f427u[i11];
                                    if (bArr != null) {
                                        interfaceC18184i.mo221n0(i11, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.f426t[i11];
                                if (str != null) {
                                    interfaceC18184i.mo219a0(i11, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            interfaceC18184i.mo224x(i11, this.f425s[i11]);
                        }
                    } else {
                        interfaceC18184i.mo220l0(i11, this.f424r[i11]);
                    }
                } else {
                    interfaceC18184i.mo222u0(i11);
                }
                if (i11 != m404d) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: d */
    public int m404d() {
        return this.f429w;
    }

    /* renamed from: f */
    public final void m405f(String str, int i11) {
        AbstractC19074t.m100208f(str, "query");
        this.f423q = str;
        this.f429w = i11;
    }

    /* renamed from: h */
    public final void m406h() {
        TreeMap treeMap = f421y;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f422p), this);
            f420x.m408b();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    @Override // p119e2.InterfaceC18184i
    /* renamed from: l0 */
    public void mo220l0(int i11, long j11) {
        this.f428v[i11] = 2;
        this.f424r[i11] = j11;
    }

    @Override // p119e2.InterfaceC18184i
    /* renamed from: n0 */
    public void mo221n0(int i11, byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "value");
        this.f428v[i11] = 5;
        this.f427u[i11] = bArr;
    }

    @Override // p119e2.InterfaceC18184i
    /* renamed from: u0 */
    public void mo222u0(int i11) {
        this.f428v[i11] = 1;
    }

    @Override // p119e2.InterfaceC18184i
    /* renamed from: x */
    public void mo224x(int i11, double d11) {
        this.f428v[i11] = 3;
        this.f425s[i11] = d11;
    }

    private C0089z(int i11) {
        this.f422p = i11;
        int i12 = i11 + 1;
        this.f428v = new int[i12];
        this.f424r = new long[i12];
        this.f425s = new double[i12];
        this.f426t = new String[i12];
        this.f427u = new byte[i12];
    }
}
