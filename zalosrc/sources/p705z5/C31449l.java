package p705z5;

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
/* renamed from: z5.l */
/* loaded from: classes2.dex */
public final class C31449l implements InterfaceC26585d {

    /* renamed from: f */
    private static final Charset f144887f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C26583b f144888g;

    /* renamed from: h */
    private static final C26583b f144889h;

    /* renamed from: i */
    private static final InterfaceC26584c f144890i;

    /* renamed from: a */
    private OutputStream f144891a;

    /* renamed from: b */
    private final Map f144892b;

    /* renamed from: c */
    private final Map f144893c;

    /* renamed from: d */
    private final InterfaceC26584c f144894d;

    /* renamed from: e */
    private final C31505p f144895e = new C31505p(this);

    static {
        C26583b.b m136509a = C26583b.m136509a("key");
        C31365f c31365f = new C31365f();
        c31365f.m152222a(1);
        f144888g = m136509a.m136514b(c31365f.m152223b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("value");
        C31365f c31365f2 = new C31365f();
        c31365f2.m152222a(2);
        f144889h = m136509a2.m136514b(c31365f2.m152223b()).m136513a();
        f144890i = C31435k.f144858a;
    }

    public C31449l(OutputStream outputStream, Map map, Map map2, InterfaceC26584c interfaceC26584c) {
        this.f144891a = outputStream;
        this.f144892b = map;
        this.f144893c = map2;
        this.f144894d = interfaceC26584c;
    }

    /* renamed from: k */
    public static /* synthetic */ void m152285k(Map.Entry entry, InterfaceC26585d interfaceC26585d) {
        interfaceC26585d.mo671a(f144888g, entry.getKey());
        interfaceC26585d.mo671a(f144889h, entry.getValue());
    }

    /* renamed from: l */
    private static int m152286l(C26583b c26583b) {
        InterfaceC31421j interfaceC31421j = (InterfaceC31421j) c26583b.m136512c(InterfaceC31421j.class);
        if (interfaceC31421j != null) {
            return interfaceC31421j.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final long m152287m(InterfaceC26584c interfaceC26584c, Object obj) {
        C31379g c31379g = new C31379g();
        try {
            OutputStream outputStream = this.f144891a;
            this.f144891a = c31379g;
            try {
                interfaceC26584c.mo480a(obj, this);
                this.f144891a = outputStream;
                long m152237a = c31379g.m152237a();
                c31379g.close();
                return m152237a;
            } catch (Throwable th2) {
                this.f144891a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c31379g.close();
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
    private static InterfaceC31421j m152288n(C26583b c26583b) {
        InterfaceC31421j interfaceC31421j = (InterfaceC31421j) c26583b.m136512c(InterfaceC31421j.class);
        if (interfaceC31421j != null) {
            return interfaceC31421j;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final C31449l m152289o(InterfaceC26584c interfaceC26584c, C26583b c26583b, Object obj, boolean z11) {
        long m152287m = m152287m(interfaceC26584c, obj);
        if (z11 && m152287m == 0) {
            return this;
        }
        m152292r((m152286l(c26583b) << 3) | 2);
        m152293s(m152287m);
        interfaceC26584c.mo480a(obj, this);
        return this;
    }

    /* renamed from: p */
    private final C31449l m152290p(InterfaceC26586e interfaceC26586e, C26583b c26583b, Object obj, boolean z11) {
        this.f144895e.m152337a(c26583b, z11);
        interfaceC26586e.mo136515a(obj, this.f144895e);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m152291q(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m152292r(int i11) {
        while (true) {
            long j11 = i11 & (-128);
            OutputStream outputStream = this.f144891a;
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
    private final void m152293s(long j11) {
        while (true) {
            long j12 = (-128) & j11;
            OutputStream outputStream = this.f144891a;
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
        m152296g(c26583b, obj, true);
        return this;
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: b */
    public final /* synthetic */ InterfaceC26585d mo672b(C26583b c26583b, long j11) {
        m152298i(c26583b, j11, true);
        return this;
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: c */
    public final /* synthetic */ InterfaceC26585d mo673c(C26583b c26583b, boolean z11) {
        m152297h(c26583b, z11 ? 1 : 0, true);
        return this;
    }

    /* renamed from: d */
    final InterfaceC26585d m152294d(C26583b c26583b, double d11, boolean z11) {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        m152292r((m152286l(c26583b) << 3) | 1);
        this.f144891a.write(m152291q(8).putDouble(d11).array());
        return this;
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: e */
    public final /* synthetic */ InterfaceC26585d mo675e(C26583b c26583b, int i11) {
        m152297h(c26583b, i11, true);
        return this;
    }

    /* renamed from: f */
    final InterfaceC26585d m152295f(C26583b c26583b, float f11, boolean z11) {
        if (z11 && f11 == 0.0f) {
            return this;
        }
        m152292r((m152286l(c26583b) << 3) | 5);
        this.f144891a.write(m152291q(4).putFloat(f11).array());
        return this;
    }

    /* renamed from: g */
    public final InterfaceC26585d m152296g(C26583b c26583b, Object obj, boolean z11) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z11 && charSequence.length() == 0) {
                return this;
            }
            m152292r((m152286l(c26583b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f144887f);
            m152292r(bytes.length);
            this.f144891a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m152296g(c26583b, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m152289o(f144890i, c26583b, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            m152294d(c26583b, ((Double) obj).doubleValue(), z11);
            return this;
        }
        if (obj instanceof Float) {
            m152295f(c26583b, ((Float) obj).floatValue(), z11);
            return this;
        }
        if (obj instanceof Number) {
            m152298i(c26583b, ((Number) obj).longValue(), z11);
            return this;
        }
        if (obj instanceof Boolean) {
            m152297h(c26583b, ((Boolean) obj).booleanValue() ? 1 : 0, z11);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z11 && bArr.length == 0) {
                return this;
            }
            m152292r((m152286l(c26583b) << 3) | 2);
            m152292r(bArr.length);
            this.f144891a.write(bArr);
            return this;
        }
        InterfaceC26584c interfaceC26584c = (InterfaceC26584c) this.f144892b.get(obj.getClass());
        if (interfaceC26584c != null) {
            m152289o(interfaceC26584c, c26583b, obj, z11);
            return this;
        }
        InterfaceC26586e interfaceC26586e = (InterfaceC26586e) this.f144893c.get(obj.getClass());
        if (interfaceC26586e != null) {
            m152290p(interfaceC26586e, c26583b, obj, z11);
            return this;
        }
        if (obj instanceof InterfaceC31393h) {
            m152297h(c26583b, ((InterfaceC31393h) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            m152297h(c26583b, ((Enum) obj).ordinal(), true);
            return this;
        }
        m152289o(this.f144894d, c26583b, obj, z11);
        return this;
    }

    /* renamed from: h */
    public final C31449l m152297h(C26583b c26583b, int i11, boolean z11) {
        if (z11 && i11 == 0) {
            return this;
        }
        InterfaceC31421j m152288n = m152288n(c26583b);
        EnumC31407i enumC31407i = EnumC31407i.DEFAULT;
        int ordinal = m152288n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m152292r((m152288n.zza() << 3) | 5);
                    this.f144891a.write(m152291q(4).putInt(i11).array());
                }
            } else {
                m152292r(m152288n.zza() << 3);
                m152292r((i11 + i11) ^ (i11 >> 31));
            }
        } else {
            m152292r(m152288n.zza() << 3);
            m152292r(i11);
        }
        return this;
    }

    /* renamed from: i */
    final C31449l m152298i(C26583b c26583b, long j11, boolean z11) {
        if (z11 && j11 == 0) {
            return this;
        }
        InterfaceC31421j m152288n = m152288n(c26583b);
        EnumC31407i enumC31407i = EnumC31407i.DEFAULT;
        int ordinal = m152288n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m152292r((m152288n.zza() << 3) | 1);
                    this.f144891a.write(m152291q(8).putLong(j11).array());
                }
            } else {
                m152292r(m152288n.zza() << 3);
                m152293s((j11 >> 63) ^ (j11 + j11));
            }
        } else {
            m152292r(m152288n.zza() << 3);
            m152293s(j11);
        }
        return this;
    }

    /* renamed from: j */
    public final C31449l m152299j(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC26584c interfaceC26584c = (InterfaceC26584c) this.f144892b.get(obj.getClass());
        if (interfaceC26584c != null) {
            interfaceC26584c.mo480a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }
}
