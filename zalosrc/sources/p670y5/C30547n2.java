package p670y5;

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
/* renamed from: y5.n2 */
/* loaded from: classes2.dex */
public final class C30547n2 implements InterfaceC26585d {

    /* renamed from: f */
    private static final Charset f141531f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C26583b f141532g;

    /* renamed from: h */
    private static final C26583b f141533h;

    /* renamed from: i */
    private static final InterfaceC26584c f141534i;

    /* renamed from: a */
    private OutputStream f141535a;

    /* renamed from: b */
    private final Map f141536b;

    /* renamed from: c */
    private final Map f141537c;

    /* renamed from: d */
    private final InterfaceC26584c f141538d;

    /* renamed from: e */
    private final C30623r2 f141539e = new C30623r2(this);

    static {
        C26583b.b m136509a = C26583b.m136509a("key");
        C30433h2 c30433h2 = new C30433h2();
        c30433h2.m149528a(1);
        f141532g = m136509a.m136514b(c30433h2.m149529b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("value");
        C30433h2 c30433h22 = new C30433h2();
        c30433h22.m149528a(2);
        f141533h = m136509a2.m136514b(c30433h22.m149529b()).m136513a();
        f141534i = C30528m2.f141493a;
    }

    public C30547n2(OutputStream outputStream, Map map, Map map2, InterfaceC26584c interfaceC26584c) {
        this.f141535a = outputStream;
        this.f141536b = map;
        this.f141537c = map2;
        this.f141538d = interfaceC26584c;
    }

    /* renamed from: k */
    public static /* synthetic */ void m149566k(Map.Entry entry, InterfaceC26585d interfaceC26585d) {
        interfaceC26585d.mo671a(f141532g, entry.getKey());
        interfaceC26585d.mo671a(f141533h, entry.getValue());
    }

    /* renamed from: l */
    private static int m149567l(C26583b c26583b) {
        InterfaceC30509l2 interfaceC30509l2 = (InterfaceC30509l2) c26583b.m136512c(InterfaceC30509l2.class);
        if (interfaceC30509l2 != null) {
            return interfaceC30509l2.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final long m149568m(InterfaceC26584c interfaceC26584c, Object obj) {
        C30452i2 c30452i2 = new C30452i2();
        try {
            OutputStream outputStream = this.f141535a;
            this.f141535a = c30452i2;
            try {
                interfaceC26584c.mo480a(obj, this);
                this.f141535a = outputStream;
                long m149531a = c30452i2.m149531a();
                c30452i2.close();
                return m149531a;
            } catch (Throwable th2) {
                this.f141535a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c30452i2.close();
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
    private static InterfaceC30509l2 m149569n(C26583b c26583b) {
        InterfaceC30509l2 interfaceC30509l2 = (InterfaceC30509l2) c26583b.m136512c(InterfaceC30509l2.class);
        if (interfaceC30509l2 != null) {
            return interfaceC30509l2;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final C30547n2 m149570o(InterfaceC26584c interfaceC26584c, C26583b c26583b, Object obj, boolean z11) {
        long m149568m = m149568m(interfaceC26584c, obj);
        if (z11 && m149568m == 0) {
            return this;
        }
        m149573r((m149567l(c26583b) << 3) | 2);
        m149574s(m149568m);
        interfaceC26584c.mo480a(obj, this);
        return this;
    }

    /* renamed from: p */
    private final C30547n2 m149571p(InterfaceC26586e interfaceC26586e, C26583b c26583b, Object obj, boolean z11) {
        this.f141539e.m149617a(c26583b, z11);
        interfaceC26586e.mo136515a(obj, this.f141539e);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m149572q(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m149573r(int i11) {
        while (true) {
            long j11 = i11 & (-128);
            OutputStream outputStream = this.f141535a;
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
    private final void m149574s(long j11) {
        while (true) {
            long j12 = (-128) & j11;
            OutputStream outputStream = this.f141535a;
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
        m149577g(c26583b, obj, true);
        return this;
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: b */
    public final /* synthetic */ InterfaceC26585d mo672b(C26583b c26583b, long j11) {
        m149579i(c26583b, j11, true);
        return this;
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: c */
    public final /* synthetic */ InterfaceC26585d mo673c(C26583b c26583b, boolean z11) {
        m149578h(c26583b, z11 ? 1 : 0, true);
        return this;
    }

    /* renamed from: d */
    final InterfaceC26585d m149575d(C26583b c26583b, double d11, boolean z11) {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        m149573r((m149567l(c26583b) << 3) | 1);
        this.f141535a.write(m149572q(8).putDouble(d11).array());
        return this;
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: e */
    public final /* synthetic */ InterfaceC26585d mo675e(C26583b c26583b, int i11) {
        m149578h(c26583b, i11, true);
        return this;
    }

    /* renamed from: f */
    final InterfaceC26585d m149576f(C26583b c26583b, float f11, boolean z11) {
        if (z11 && f11 == 0.0f) {
            return this;
        }
        m149573r((m149567l(c26583b) << 3) | 5);
        this.f141535a.write(m149572q(4).putFloat(f11).array());
        return this;
    }

    /* renamed from: g */
    public final InterfaceC26585d m149577g(C26583b c26583b, Object obj, boolean z11) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z11 && charSequence.length() == 0) {
                return this;
            }
            m149573r((m149567l(c26583b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f141531f);
            m149573r(bytes.length);
            this.f141535a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m149577g(c26583b, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m149570o(f141534i, c26583b, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            m149575d(c26583b, ((Double) obj).doubleValue(), z11);
            return this;
        }
        if (obj instanceof Float) {
            m149576f(c26583b, ((Float) obj).floatValue(), z11);
            return this;
        }
        if (obj instanceof Number) {
            m149579i(c26583b, ((Number) obj).longValue(), z11);
            return this;
        }
        if (obj instanceof Boolean) {
            m149578h(c26583b, ((Boolean) obj).booleanValue() ? 1 : 0, z11);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z11 && bArr.length == 0) {
                return this;
            }
            m149573r((m149567l(c26583b) << 3) | 2);
            m149573r(bArr.length);
            this.f141535a.write(bArr);
            return this;
        }
        InterfaceC26584c interfaceC26584c = (InterfaceC26584c) this.f141536b.get(obj.getClass());
        if (interfaceC26584c != null) {
            m149570o(interfaceC26584c, c26583b, obj, z11);
            return this;
        }
        InterfaceC26586e interfaceC26586e = (InterfaceC26586e) this.f141537c.get(obj.getClass());
        if (interfaceC26586e != null) {
            m149571p(interfaceC26586e, c26583b, obj, z11);
            return this;
        }
        if (obj instanceof InterfaceC30471j2) {
            m149578h(c26583b, ((InterfaceC30471j2) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            m149578h(c26583b, ((Enum) obj).ordinal(), true);
            return this;
        }
        m149570o(this.f141538d, c26583b, obj, z11);
        return this;
    }

    /* renamed from: h */
    public final C30547n2 m149578h(C26583b c26583b, int i11, boolean z11) {
        if (z11 && i11 == 0) {
            return this;
        }
        InterfaceC30509l2 m149569n = m149569n(c26583b);
        EnumC30490k2 enumC30490k2 = EnumC30490k2.DEFAULT;
        int ordinal = m149569n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m149573r((m149569n.zza() << 3) | 5);
                    this.f141535a.write(m149572q(4).putInt(i11).array());
                }
            } else {
                m149573r(m149569n.zza() << 3);
                m149573r((i11 + i11) ^ (i11 >> 31));
            }
        } else {
            m149573r(m149569n.zza() << 3);
            m149573r(i11);
        }
        return this;
    }

    /* renamed from: i */
    final C30547n2 m149579i(C26583b c26583b, long j11, boolean z11) {
        if (z11 && j11 == 0) {
            return this;
        }
        InterfaceC30509l2 m149569n = m149569n(c26583b);
        EnumC30490k2 enumC30490k2 = EnumC30490k2.DEFAULT;
        int ordinal = m149569n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m149573r((m149569n.zza() << 3) | 1);
                    this.f141535a.write(m149572q(8).putLong(j11).array());
                }
            } else {
                m149573r(m149569n.zza() << 3);
                m149574s((j11 >> 63) ^ (j11 + j11));
            }
        } else {
            m149573r(m149569n.zza() << 3);
            m149574s(j11);
        }
        return this;
    }

    /* renamed from: j */
    public final C30547n2 m149580j(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC26584c interfaceC26584c = (InterfaceC26584c) this.f141536b.get(obj.getClass());
        if (interfaceC26584c != null) {
            interfaceC26584c.mo480a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }
}
