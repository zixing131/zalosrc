package p119e2;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: e2.a */
/* loaded from: classes.dex */
public final class C18176a implements InterfaceC18185j {

    /* renamed from: r */
    public static final a f92334r = new a(null);

    /* renamed from: p */
    private final String f92335p;

    /* renamed from: q */
    private final Object[] f92336q;

    /* renamed from: e2.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final void m96912a(InterfaceC18184i interfaceC18184i, int i11, Object obj) {
            long j11;
            if (obj == null) {
                interfaceC18184i.mo222u0(i11);
                return;
            }
            if (obj instanceof byte[]) {
                interfaceC18184i.mo221n0(i11, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                interfaceC18184i.mo224x(i11, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                interfaceC18184i.mo224x(i11, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                interfaceC18184i.mo220l0(i11, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                interfaceC18184i.mo220l0(i11, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                interfaceC18184i.mo220l0(i11, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                interfaceC18184i.mo220l0(i11, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                interfaceC18184i.mo219a0(i11, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j11 = 1;
                } else {
                    j11 = 0;
                }
                interfaceC18184i.mo220l0(i11, j11);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i11 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        /* renamed from: b */
        public final void m96913b(InterfaceC18184i interfaceC18184i, Object[] objArr) {
            AbstractC19074t.m100208f(interfaceC18184i, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i11 = 0;
            while (i11 < length) {
                Object obj = objArr[i11];
                i11++;
                m96912a(interfaceC18184i, i11, obj);
            }
        }
    }

    public C18176a(String str, Object[] objArr) {
        AbstractC19074t.m100208f(str, "query");
        this.f92335p = str;
        this.f92336q = objArr;
    }

    @Override // p119e2.InterfaceC18185j
    /* renamed from: a */
    public String mo402a() {
        return this.f92335p;
    }

    @Override // p119e2.InterfaceC18185j
    /* renamed from: b */
    public void mo403b(InterfaceC18184i interfaceC18184i) {
        AbstractC19074t.m100208f(interfaceC18184i, "statement");
        f92334r.m96913b(interfaceC18184i, this.f92336q);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18176a(String str) {
        this(str, null);
        AbstractC19074t.m100208f(str, "query");
    }
}
