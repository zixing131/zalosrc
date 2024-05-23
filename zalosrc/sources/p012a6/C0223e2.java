package p012a6;

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

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.e2 */
/* loaded from: classes2.dex */
public final class C0223e2 implements InterfaceC26585d {

    /* renamed from: f */
    private static final Charset f1005f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C26583b f1006g;

    /* renamed from: h */
    private static final C26583b f1007h;

    /* renamed from: i */
    private static final InterfaceC26584c f1008i;

    /* renamed from: a */
    private OutputStream f1009a;

    /* renamed from: b */
    private final Map f1010b;

    /* renamed from: c */
    private final Map f1011c;

    /* renamed from: d */
    private final InterfaceC26584c f1012d;

    /* renamed from: e */
    private final C0299i2 f1013e = new C0299i2(this);

    static {
        C26583b.b m136509a = C26583b.m136509a("key");
        C0598y1 c0598y1 = new C0598y1();
        c0598y1.m900a(1);
        f1006g = m136509a.m136514b(c0598y1.m901b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("value");
        C0598y1 c0598y12 = new C0598y1();
        c0598y12.m900a(2);
        f1007h = m136509a2.m136514b(c0598y12.m901b()).m136513a();
        f1008i = C0204d2.f967a;
    }

    public C0223e2(OutputStream outputStream, Map map, Map map2, InterfaceC26584c interfaceC26584c) {
        this.f1009a = outputStream;
        this.f1010b = map;
        this.f1011c = map2;
        this.f1012d = interfaceC26584c;
    }

    /* renamed from: k */
    public static /* synthetic */ void m662k(Map.Entry entry, InterfaceC26585d interfaceC26585d) {
        interfaceC26585d.mo671a(f1006g, entry.getKey());
        interfaceC26585d.mo671a(f1007h, entry.getValue());
    }

    /* renamed from: l */
    private static int m663l(C26583b c26583b) {
        InterfaceC0185c2 interfaceC0185c2 = (InterfaceC0185c2) c26583b.m136512c(InterfaceC0185c2.class);
        if (interfaceC0185c2 != null) {
            return interfaceC0185c2.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final long m664m(InterfaceC26584c interfaceC26584c, Object obj) {
        C0616z1 c0616z1 = new C0616z1();
        try {
            OutputStream outputStream = this.f1009a;
            this.f1009a = c0616z1;
            try {
                interfaceC26584c.mo480a(obj, this);
                this.f1009a = outputStream;
                long m904a = c0616z1.m904a();
                c0616z1.close();
                return m904a;
            } catch (Throwable th2) {
                this.f1009a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c0616z1.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    /* renamed from: n */
    private static InterfaceC0185c2 m665n(C26583b c26583b) {
        InterfaceC0185c2 interfaceC0185c2 = (InterfaceC0185c2) c26583b.m136512c(InterfaceC0185c2.class);
        if (interfaceC0185c2 != null) {
            return interfaceC0185c2;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final C0223e2 m666o(InterfaceC26584c interfaceC26584c, C26583b c26583b, Object obj, boolean z11) {
        long m664m = m664m(interfaceC26584c, obj);
        if (z11 && m664m == 0) {
            return this;
        }
        m669r((m663l(c26583b) << 3) | 2);
        m670s(m664m);
        interfaceC26584c.mo480a(obj, this);
        return this;
    }

    /* renamed from: p */
    private final C0223e2 m667p(InterfaceC26586e interfaceC26586e, C26583b c26583b, Object obj, boolean z11) {
        this.f1013e.m759a(c26583b, z11);
        interfaceC26586e.mo136515a(obj, this.f1013e);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m668q(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m669r(int i11) {
        while (true) {
            long j11 = i11 & (-128);
            OutputStream outputStream = this.f1009a;
            if (j11 != 0) {
                outputStream.write((i11 & 127) | 128);
                i11 >>>= 7;
            } else {
                outputStream.write(i11 & 127);
                return;
            }
        }
    }

    /* renamed from: s */
    private final void m670s(long j11) {
        while (true) {
            long j12 = (-128) & j11;
            OutputStream outputStream = this.f1009a;
            if (j12 != 0) {
                outputStream.write((((int) j11) & 127) | 128);
                j11 >>>= 7;
            } else {
                outputStream.write(((int) j11) & 127);
                return;
            }
        }
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: a */
    public final InterfaceC26585d mo671a(C26583b c26583b, Object obj) {
        m677g(c26583b, obj, true);
        return this;
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: b */
    public final /* synthetic */ InterfaceC26585d mo672b(C26583b c26583b, long j11) {
        m679i(c26583b, j11, true);
        return this;
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: c */
    public final /* synthetic */ InterfaceC26585d mo673c(C26583b c26583b, boolean z11) {
        m678h(c26583b, z11 ? 1 : 0, true);
        return this;
    }

    /* renamed from: d */
    final InterfaceC26585d m674d(C26583b c26583b, double d11, boolean z11) {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        m669r((m663l(c26583b) << 3) | 1);
        this.f1009a.write(m668q(8).putDouble(d11).array());
        return this;
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: e */
    public final /* synthetic */ InterfaceC26585d mo675e(C26583b c26583b, int i11) {
        m678h(c26583b, i11, true);
        return this;
    }

    /* renamed from: f */
    final InterfaceC26585d m676f(C26583b c26583b, float f11, boolean z11) {
        if (z11 && f11 == 0.0f) {
            return this;
        }
        m669r((m663l(c26583b) << 3) | 5);
        this.f1009a.write(m668q(4).putFloat(f11).array());
        return this;
    }

    /* renamed from: g */
    public final InterfaceC26585d m677g(C26583b c26583b, Object obj, boolean z11) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z11 && charSequence.length() == 0) {
                return this;
            }
            m669r((m663l(c26583b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f1005f);
            m669r(bytes.length);
            this.f1009a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m677g(c26583b, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m666o(f1008i, c26583b, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            m674d(c26583b, ((Double) obj).doubleValue(), z11);
            return this;
        }
        if (obj instanceof Float) {
            m676f(c26583b, ((Float) obj).floatValue(), z11);
            return this;
        }
        if (obj instanceof Number) {
            m679i(c26583b, ((Number) obj).longValue(), z11);
            return this;
        }
        if (obj instanceof Boolean) {
            m678h(c26583b, ((Boolean) obj).booleanValue() ? 1 : 0, z11);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z11 && bArr.length == 0) {
                return this;
            }
            m669r((m663l(c26583b) << 3) | 2);
            m669r(bArr.length);
            this.f1009a.write(bArr);
            return this;
        }
        InterfaceC26584c interfaceC26584c = (InterfaceC26584c) this.f1010b.get(obj.getClass());
        if (interfaceC26584c != null) {
            m666o(interfaceC26584c, c26583b, obj, z11);
            return this;
        }
        InterfaceC26586e interfaceC26586e = (InterfaceC26586e) this.f1011c.get(obj.getClass());
        if (interfaceC26586e != null) {
            m667p(interfaceC26586e, c26583b, obj, z11);
            return this;
        }
        if (obj instanceof InterfaceC0147a2) {
            m678h(c26583b, ((InterfaceC0147a2) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            m678h(c26583b, ((Enum) obj).ordinal(), true);
            return this;
        }
        m666o(this.f1012d, c26583b, obj, z11);
        return this;
    }

    /* renamed from: h */
    public final C0223e2 m678h(C26583b c26583b, int i11, boolean z11) {
        if (z11 && i11 == 0) {
            return this;
        }
        InterfaceC0185c2 m665n = m665n(c26583b);
        EnumC0166b2 enumC0166b2 = EnumC0166b2.DEFAULT;
        int ordinal = m665n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m669r((m665n.zza() << 3) | 5);
                    this.f1009a.write(m668q(4).putInt(i11).array());
                }
            } else {
                m669r(m665n.zza() << 3);
                m669r((i11 + i11) ^ (i11 >> 31));
            }
        } else {
            m669r(m665n.zza() << 3);
            m669r(i11);
        }
        return this;
    }

    /* renamed from: i */
    final C0223e2 m679i(C26583b c26583b, long j11, boolean z11) {
        if (z11 && j11 == 0) {
            return this;
        }
        InterfaceC0185c2 m665n = m665n(c26583b);
        EnumC0166b2 enumC0166b2 = EnumC0166b2.DEFAULT;
        int ordinal = m665n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m669r((m665n.zza() << 3) | 1);
                    this.f1009a.write(m668q(8).putLong(j11).array());
                }
            } else {
                m669r(m665n.zza() << 3);
                m670s((j11 >> 63) ^ (j11 + j11));
            }
        } else {
            m669r(m665n.zza() << 3);
            m670s(j11);
        }
        return this;
    }

    /* renamed from: j */
    public final C0223e2 m680j(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC26584c interfaceC26584c = (InterfaceC26584c) this.f1010b.get(obj.getClass());
        if (interfaceC26584c != null) {
            interfaceC26584c.mo480a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }
}
