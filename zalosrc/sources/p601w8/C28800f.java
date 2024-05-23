package p601w8;

import com.google.firebase.encoders.EncodingException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;
import p520t8.InterfaceC26586e;
import p601w8.InterfaceC28798d;

/* renamed from: w8.f */
/* loaded from: classes.dex */
public final class C28800f implements InterfaceC26585d {

    /* renamed from: f */
    private static final Charset f133459f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C26583b f133460g = C26583b.m136509a("key").m136514b(C28795a.m144037b().m144039c(1).m144038a()).m136513a();

    /* renamed from: h */
    private static final C26583b f133461h = C26583b.m136509a("value").m136514b(C28795a.m144037b().m144039c(2).m144038a()).m136513a();

    /* renamed from: i */
    private static final InterfaceC26584c f133462i = new InterfaceC26584c() { // from class: w8.e
        @Override // p520t8.InterfaceC26584c
        /* renamed from: a */
        public final void mo480a(Object obj, Object obj2) {
            C28800f.m144048v((Map.Entry) obj, (InterfaceC26585d) obj2);
        }
    };

    /* renamed from: a */
    private OutputStream f133463a;

    /* renamed from: b */
    private final Map f133464b;

    /* renamed from: c */
    private final Map f133465c;

    /* renamed from: d */
    private final InterfaceC26584c f133466d;

    /* renamed from: e */
    private final C28803i f133467e = new C28803i(this);

    /* renamed from: w8.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f133468a;

        static {
            int[] iArr = new int[InterfaceC28798d.a.values().length];
            f133468a = iArr;
            try {
                iArr[InterfaceC28798d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133468a[InterfaceC28798d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133468a[InterfaceC28798d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C28800f(OutputStream outputStream, Map map, Map map2, InterfaceC26584c interfaceC26584c) {
        this.f133463a = outputStream;
        this.f133464b = map;
        this.f133465c = map2;
        this.f133466d = interfaceC26584c;
    }

    /* renamed from: o */
    private static ByteBuffer m144042o(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: p */
    private long m144043p(InterfaceC26584c interfaceC26584c, Object obj) {
        C28796b c28796b = new C28796b();
        try {
            OutputStream outputStream = this.f133463a;
            this.f133463a = c28796b;
            try {
                interfaceC26584c.mo480a(obj, this);
                this.f133463a = outputStream;
                long m144040a = c28796b.m144040a();
                c28796b.close();
                return m144040a;
            } catch (Throwable th2) {
                this.f133463a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c28796b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: q */
    private C28800f m144044q(InterfaceC26584c interfaceC26584c, C26583b c26583b, Object obj, boolean z11) {
        long m144043p = m144043p(interfaceC26584c, obj);
        if (z11 && m144043p == 0) {
            return this;
        }
        m144049w((m144047u(c26583b) << 3) | 2);
        m144050x(m144043p);
        interfaceC26584c.mo480a(obj, this);
        return this;
    }

    /* renamed from: r */
    private C28800f m144045r(InterfaceC26586e interfaceC26586e, C26583b c26583b, Object obj, boolean z11) {
        this.f133467e.m144070b(c26583b, z11);
        interfaceC26586e.mo136515a(obj, this.f133467e);
        return this;
    }

    /* renamed from: t */
    private static InterfaceC28798d m144046t(C26583b c26583b) {
        InterfaceC28798d interfaceC28798d = (InterfaceC28798d) c26583b.m136512c(InterfaceC28798d.class);
        if (interfaceC28798d != null) {
            return interfaceC28798d;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: u */
    private static int m144047u(C26583b c26583b) {
        InterfaceC28798d interfaceC28798d = (InterfaceC28798d) c26583b.m136512c(InterfaceC28798d.class);
        if (interfaceC28798d != null) {
            return interfaceC28798d.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: v */
    public static /* synthetic */ void m144048v(Map.Entry entry, InterfaceC26585d interfaceC26585d) {
        interfaceC26585d.mo671a(f133460g, entry.getKey());
        interfaceC26585d.mo671a(f133461h, entry.getValue());
    }

    /* renamed from: w */
    private void m144049w(int i11) {
        while ((i11 & (-128)) != 0) {
            this.f133463a.write((i11 & 127) | 128);
            i11 >>>= 7;
        }
        this.f133463a.write(i11 & 127);
    }

    /* renamed from: x */
    private void m144050x(long j11) {
        while (((-128) & j11) != 0) {
            this.f133463a.write((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        this.f133463a.write(((int) j11) & 127);
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: a */
    public InterfaceC26585d mo671a(C26583b c26583b, Object obj) {
        return m144053h(c26583b, obj, true);
    }

    /* renamed from: f */
    InterfaceC26585d m144051f(C26583b c26583b, double d11, boolean z11) {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        m144049w((m144047u(c26583b) << 3) | 1);
        this.f133463a.write(m144042o(8).putDouble(d11).array());
        return this;
    }

    /* renamed from: g */
    InterfaceC26585d m144052g(C26583b c26583b, float f11, boolean z11) {
        if (z11 && f11 == 0.0f) {
            return this;
        }
        m144049w((m144047u(c26583b) << 3) | 5);
        this.f133463a.write(m144042o(4).putFloat(f11).array());
        return this;
    }

    /* renamed from: h */
    public InterfaceC26585d m144053h(C26583b c26583b, Object obj, boolean z11) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z11 && charSequence.length() == 0) {
                return this;
            }
            m144049w((m144047u(c26583b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f133459f);
            m144049w(bytes.length);
            this.f133463a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m144053h(c26583b, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m144044q(f133462i, c26583b, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return m144051f(c26583b, ((Double) obj).doubleValue(), z11);
        }
        if (obj instanceof Float) {
            return m144052g(c26583b, ((Float) obj).floatValue(), z11);
        }
        if (obj instanceof Number) {
            return m144057l(c26583b, ((Number) obj).longValue(), z11);
        }
        if (obj instanceof Boolean) {
            return m144059n(c26583b, ((Boolean) obj).booleanValue(), z11);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z11 && bArr.length == 0) {
                return this;
            }
            m144049w((m144047u(c26583b) << 3) | 2);
            m144049w(bArr.length);
            this.f133463a.write(bArr);
            return this;
        }
        InterfaceC26584c interfaceC26584c = (InterfaceC26584c) this.f133464b.get(obj.getClass());
        if (interfaceC26584c != null) {
            return m144044q(interfaceC26584c, c26583b, obj, z11);
        }
        InterfaceC26586e interfaceC26586e = (InterfaceC26586e) this.f133465c.get(obj.getClass());
        if (interfaceC26586e != null) {
            return m144045r(interfaceC26586e, c26583b, obj, z11);
        }
        if (obj instanceof InterfaceC28797c) {
            return mo675e(c26583b, ((InterfaceC28797c) obj).mo93869a());
        }
        if (obj instanceof Enum) {
            return mo675e(c26583b, ((Enum) obj).ordinal());
        }
        return m144044q(this.f133466d, c26583b, obj, z11);
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: i */
    public C28800f mo675e(C26583b c26583b, int i11) {
        return m144055j(c26583b, i11, true);
    }

    /* renamed from: j */
    C28800f m144055j(C26583b c26583b, int i11, boolean z11) {
        if (z11 && i11 == 0) {
            return this;
        }
        InterfaceC28798d m144046t = m144046t(c26583b);
        int i12 = a.f133468a[m144046t.intEncoding().ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    m144049w((m144046t.tag() << 3) | 5);
                    this.f133463a.write(m144042o(4).putInt(i11).array());
                }
            } else {
                m144049w(m144046t.tag() << 3);
                m144049w((i11 << 1) ^ (i11 >> 31));
            }
        } else {
            m144049w(m144046t.tag() << 3);
            m144049w(i11);
        }
        return this;
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: k */
    public C28800f mo672b(C26583b c26583b, long j11) {
        return m144057l(c26583b, j11, true);
    }

    /* renamed from: l */
    C28800f m144057l(C26583b c26583b, long j11, boolean z11) {
        if (z11 && j11 == 0) {
            return this;
        }
        InterfaceC28798d m144046t = m144046t(c26583b);
        int i11 = a.f133468a[m144046t.intEncoding().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m144049w((m144046t.tag() << 3) | 1);
                    this.f133463a.write(m144042o(8).putLong(j11).array());
                }
            } else {
                m144049w(m144046t.tag() << 3);
                m144050x((j11 >> 63) ^ (j11 << 1));
            }
        } else {
            m144049w(m144046t.tag() << 3);
            m144050x(j11);
        }
        return this;
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: m */
    public C28800f mo673c(C26583b c26583b, boolean z11) {
        return m144059n(c26583b, z11, true);
    }

    /* renamed from: n */
    public C28800f m144059n(C26583b c26583b, boolean z11, boolean z12) {
        return m144055j(c26583b, z11 ? 1 : 0, z12);
    }

    /* renamed from: s */
    public C28800f m144060s(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC26584c interfaceC26584c = (InterfaceC26584c) this.f133464b.get(obj.getClass());
        if (interfaceC26584c != null) {
            interfaceC26584c.mo480a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
