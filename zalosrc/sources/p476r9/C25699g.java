package p476r9;

import java.util.NoSuchElementException;

/* renamed from: r9.g */
/* loaded from: classes3.dex */
public final class C25699g {

    /* renamed from: a */
    private final Object f122710a;

    private C25699g() {
        this.f122710a = null;
    }

    /* renamed from: a */
    public static C25699g m132609a() {
        return new C25699g();
    }

    /* renamed from: b */
    public static C25699g m132610b(Object obj) {
        if (obj == null) {
            return m132609a();
        }
        return m132611e(obj);
    }

    /* renamed from: e */
    public static C25699g m132611e(Object obj) {
        return new C25699g(obj);
    }

    /* renamed from: c */
    public Object m132612c() {
        Object obj = this.f122710a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: d */
    public boolean m132613d() {
        return this.f122710a != null;
    }

    private C25699g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value for optional is empty.");
        }
        this.f122710a = obj;
    }
}
