package p116e;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: e.a */
/* loaded from: classes2.dex */
public class C18150a {

    /* renamed from: a */
    private final LinkedHashMap f91801a;

    /* renamed from: b */
    private int f91802b;

    /* renamed from: c */
    private int f91803c;

    /* renamed from: d */
    private int f91804d;

    /* renamed from: e */
    private int f91805e;

    /* renamed from: f */
    private int f91806f;

    /* renamed from: g */
    private int f91807g;

    /* renamed from: h */
    private int f91808h;

    public C18150a(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f91803c = i11;
        this.f91801a = new LinkedHashMap(0, 0.75f, true);
    }

    /* renamed from: e */
    private int m96434e(Object obj, Object obj2) {
        int mo93667g = mo93667g(obj, obj2);
        if (mo93667g >= 0) {
            return mo93667g;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    /* renamed from: a */
    protected Object m96435a(Object obj) {
        return null;
    }

    /* renamed from: b */
    public final Object m96436b(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f91804d++;
                this.f91802b += m96434e(obj, obj2);
                put = this.f91801a.put(obj, obj2);
                if (put != null) {
                    this.f91802b -= m96434e(obj, put);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (put != null) {
            m96438d(false, obj, put, obj2);
        }
        m96437c(this.f91803c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:            throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m96437c(int i11) {
        Object key;
        Object value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f91802b < 0 || (this.f91801a.isEmpty() && this.f91802b != 0)) {
                        break;
                    }
                    if (this.f91802b <= i11 || this.f91801a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f91801a.entrySet().iterator().next();
                    key = entry.getKey();
                    value = entry.getValue();
                    this.f91801a.remove(key);
                    this.f91802b -= m96434e(key, value);
                    this.f91806f++;
                } finally {
                }
            }
            m96438d(true, key, value, null);
        }
    }

    /* renamed from: d */
    protected void m96438d(boolean z11, Object obj, Object obj2, Object obj3) {
    }

    /* renamed from: f */
    public final Object m96439f(Object obj) {
        Object put;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f91801a.get(obj);
                if (obj2 != null) {
                    this.f91807g++;
                    return obj2;
                }
                this.f91808h++;
                Object m96435a = m96435a(obj);
                if (m96435a == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f91805e++;
                        put = this.f91801a.put(obj, m96435a);
                        if (put != null) {
                            this.f91801a.put(obj, put);
                        } else {
                            this.f91802b += m96434e(obj, m96435a);
                        }
                    } finally {
                    }
                }
                if (put != null) {
                    m96438d(false, obj, m96435a, put);
                    return put;
                }
                m96437c(this.f91803c);
                return m96435a;
            } finally {
            }
        }
    }

    /* renamed from: g */
    protected int mo93667g(Object obj, Object obj2) {
        return 1;
    }

    /* renamed from: h */
    public final Object m96440h(Object obj) {
        Object remove;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                remove = this.f91801a.remove(obj);
                if (remove != null) {
                    this.f91802b -= m96434e(obj, remove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (remove != null) {
            m96438d(false, obj, remove, null);
        }
        return remove;
    }

    public final synchronized String toString() {
        int i11;
        int i12;
        try {
            i11 = this.f91807g;
            i12 = this.f91808h + i11;
        } catch (Throwable th2) {
            throw th2;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f91803c), Integer.valueOf(this.f91807g), Integer.valueOf(this.f91808h), Integer.valueOf(i12 != 0 ? (i11 * 100) / i12 : 0));
    }
}
