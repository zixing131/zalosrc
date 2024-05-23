package p571v8;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;
import p520t8.InterfaceC26586e;
import p520t8.InterfaceC26587f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v8.e */
/* loaded from: classes.dex */
public final class C27946e implements InterfaceC26585d, InterfaceC26587f {

    /* renamed from: a */
    private C27946e f130259a = null;

    /* renamed from: b */
    private boolean f130260b = true;

    /* renamed from: c */
    private final JsonWriter f130261c;

    /* renamed from: d */
    private final Map f130262d;

    /* renamed from: e */
    private final Map f130263e;

    /* renamed from: f */
    private final InterfaceC26584c f130264f;

    /* renamed from: g */
    private final boolean f130265g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C27946e(Writer writer, Map map, Map map2, InterfaceC26584c interfaceC26584c, boolean z11) {
        this.f130261c = new JsonWriter(writer);
        this.f130262d = map;
        this.f130263e = map2;
        this.f130264f = interfaceC26584c;
        this.f130265g = z11;
    }

    /* renamed from: q */
    private boolean m140813q(Object obj) {
        if (obj != null && !obj.getClass().isArray() && !(obj instanceof Collection) && !(obj instanceof Date) && !(obj instanceof Enum) && !(obj instanceof Number)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private C27946e m140814t(String str, Object obj) {
        m140816v();
        this.f130261c.name(str);
        if (obj == null) {
            this.f130261c.nullValue();
            return this;
        }
        return m140819i(obj, false);
    }

    /* renamed from: u */
    private C27946e m140815u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m140816v();
        this.f130261c.name(str);
        return m140819i(obj, false);
    }

    /* renamed from: v */
    private void m140816v() {
        if (this.f130260b) {
            C27946e c27946e = this.f130259a;
            if (c27946e != null) {
                c27946e.m140816v();
                this.f130259a.f130260b = false;
                this.f130259a = null;
                this.f130261c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: a */
    public InterfaceC26585d mo671a(C26583b c26583b, Object obj) {
        return m140823m(c26583b.m136511b(), obj);
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: b */
    public InterfaceC26585d mo672b(C26583b c26583b, long j11) {
        return m140822l(c26583b.m136511b(), j11);
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: c */
    public InterfaceC26585d mo673c(C26583b c26583b, boolean z11) {
        return m140824n(c26583b.m136511b(), z11);
    }

    @Override // p520t8.InterfaceC26585d
    /* renamed from: e */
    public InterfaceC26585d mo675e(C26583b c26583b, int i11) {
        return m140821k(c26583b.m136511b(), i11);
    }

    /* renamed from: g */
    public C27946e m140817g(int i11) {
        m140816v();
        this.f130261c.value(i11);
        return this;
    }

    /* renamed from: h */
    public C27946e m140818h(long j11) {
        m140816v();
        this.f130261c.value(j11);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C27946e m140819i(Object obj, boolean z11) {
        Class<?> cls;
        int i11 = 0;
        if (z11 && m140813q(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f130261c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f130261c.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return m140826p((byte[]) obj);
            }
            this.f130261c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i11 < length) {
                    this.f130261c.value(r6[i11]);
                    i11++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i11 < length2) {
                    m140818h(jArr[i11]);
                    i11++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i11 < length3) {
                    this.f130261c.value(dArr[i11]);
                    i11++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i11 < length4) {
                    this.f130261c.value(zArr[i11]);
                    i11++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m140819i(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m140819i(obj2, false);
                }
            }
            this.f130261c.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            this.f130261c.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m140819i(it.next(), false);
            }
            this.f130261c.endArray();
            return this;
        }
        if (obj instanceof Map) {
            this.f130261c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m140823m((String) key, entry.getValue());
                } catch (ClassCastException e11) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e11);
                }
            }
            this.f130261c.endObject();
            return this;
        }
        InterfaceC26584c interfaceC26584c = (InterfaceC26584c) this.f130262d.get(obj.getClass());
        if (interfaceC26584c != null) {
            return m140828s(interfaceC26584c, obj, z11);
        }
        InterfaceC26586e interfaceC26586e = (InterfaceC26586e) this.f130263e.get(obj.getClass());
        if (interfaceC26586e != null) {
            interfaceC26586e.mo136515a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            mo760d(((Enum) obj).name());
            return this;
        }
        return m140828s(this.f130264f, obj, z11);
    }

    @Override // p520t8.InterfaceC26587f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C27946e mo760d(String str) {
        m140816v();
        this.f130261c.value(str);
        return this;
    }

    /* renamed from: k */
    public C27946e m140821k(String str, int i11) {
        m140816v();
        this.f130261c.name(str);
        return m140817g(i11);
    }

    /* renamed from: l */
    public C27946e m140822l(String str, long j11) {
        m140816v();
        this.f130261c.name(str);
        return m140818h(j11);
    }

    /* renamed from: m */
    public C27946e m140823m(String str, Object obj) {
        if (this.f130265g) {
            return m140815u(str, obj);
        }
        return m140814t(str, obj);
    }

    /* renamed from: n */
    public C27946e m140824n(String str, boolean z11) {
        m140816v();
        this.f130261c.name(str);
        return mo761f(z11);
    }

    @Override // p520t8.InterfaceC26587f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C27946e mo761f(boolean z11) {
        m140816v();
        this.f130261c.value(z11);
        return this;
    }

    /* renamed from: p */
    public C27946e m140826p(byte[] bArr) {
        m140816v();
        if (bArr == null) {
            this.f130261c.nullValue();
        } else {
            this.f130261c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m140827r() {
        m140816v();
        this.f130261c.flush();
    }

    /* renamed from: s */
    C27946e m140828s(InterfaceC26584c interfaceC26584c, Object obj, boolean z11) {
        if (!z11) {
            this.f130261c.beginObject();
        }
        interfaceC26584c.mo480a(obj, this);
        if (!z11) {
            this.f130261c.endObject();
        }
        return this;
    }
}
