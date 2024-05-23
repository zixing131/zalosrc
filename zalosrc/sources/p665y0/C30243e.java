package p665y0;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: y0.e */
/* loaded from: classes.dex */
public class C30243e {

    /* renamed from: a */
    private final LinkedHashMap f140465a;

    /* renamed from: b */
    private int f140466b;

    /* renamed from: c */
    private int f140467c;

    /* renamed from: d */
    private int f140468d;

    /* renamed from: e */
    private int f140469e;

    /* renamed from: f */
    private int f140470f;

    /* renamed from: g */
    private int f140471g;

    /* renamed from: h */
    private int f140472h;

    public C30243e(int i11) {
        if (i11 > 0) {
            this.f140467c = i11;
            this.f140465a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: g */
    private int m149137g(Object obj, Object obj2) {
        int mo90431h = mo90431h(obj, obj2);
        if (mo90431h >= 0) {
            return mo90431h;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    /* renamed from: a */
    protected Object mo30967a(Object obj) {
        return null;
    }

    /* renamed from: b */
    protected void mo90430b(boolean z11, Object obj, Object obj2, Object obj3) {
    }

    /* renamed from: c */
    public final void m149138c() {
        m149143j(-1);
    }

    /* renamed from: d */
    public final Object m149139d(Object obj) {
        Object put;
        if (obj != null) {
            synchronized (this) {
                try {
                    Object obj2 = this.f140465a.get(obj);
                    if (obj2 != null) {
                        this.f140471g++;
                        return obj2;
                    }
                    this.f140472h++;
                    Object mo30967a = mo30967a(obj);
                    if (mo30967a == null) {
                        return null;
                    }
                    synchronized (this) {
                        try {
                            this.f140469e++;
                            put = this.f140465a.put(obj, mo30967a);
                            if (put != null) {
                                this.f140465a.put(obj, put);
                            } else {
                                this.f140466b += m149137g(obj, mo30967a);
                            }
                        } finally {
                        }
                    }
                    if (put != null) {
                        mo90430b(false, obj, mo30967a, put);
                        return put;
                    }
                    m149143j(this.f140467c);
                    return mo30967a;
                } finally {
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: e */
    public final Object m149140e(Object obj, Object obj2) {
        Object put;
        if (obj != null && obj2 != null) {
            synchronized (this) {
                try {
                    this.f140468d++;
                    this.f140466b += m149137g(obj, obj2);
                    put = this.f140465a.put(obj, obj2);
                    if (put != null) {
                        this.f140466b -= m149137g(obj, put);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (put != null) {
                mo90430b(false, obj, put, obj2);
            }
            m149143j(this.f140467c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* renamed from: f */
    public final Object m149141f(Object obj) {
        Object remove;
        if (obj != null) {
            synchronized (this) {
                try {
                    remove = this.f140465a.remove(obj);
                    if (remove != null) {
                        this.f140466b -= m149137g(obj, remove);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (remove != null) {
                mo90430b(false, obj, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: h */
    protected int mo90431h(Object obj, Object obj2) {
        return 1;
    }

    /* renamed from: i */
    public final synchronized Map m149142i() {
        return new LinkedHashMap(this.f140465a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:            throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m149143j(int i11) {
        Object key;
        Object value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f140466b < 0 || (this.f140465a.isEmpty() && this.f140466b != 0)) {
                        break;
                    }
                    if (this.f140466b <= i11 || this.f140465a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f140465a.entrySet().iterator().next();
                    key = entry.getKey();
                    value = entry.getValue();
                    this.f140465a.remove(key);
                    this.f140466b -= m149137g(key, value);
                    this.f140470f++;
                } finally {
                }
            }
            mo90430b(true, key, value, null);
        }
    }

    public final synchronized String toString() {
        int i11;
        try {
            int i12 = this.f140471g;
            int i13 = this.f140472h + i12;
            if (i13 != 0) {
                i11 = (i12 * 100) / i13;
            } else {
                i11 = 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f140467c), Integer.valueOf(this.f140471g), Integer.valueOf(this.f140472h), Integer.valueOf(i11));
    }
}
