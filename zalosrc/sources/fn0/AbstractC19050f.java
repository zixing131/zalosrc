package fn0;

import dn0.C18032b;
import java.io.ObjectStreamException;
import java.io.Serializable;
import mn0.InterfaceC23363a;
import mn0.InterfaceC23365c;

/* renamed from: fn0.f */
/* loaded from: classes.dex */
public abstract class AbstractC19050f implements InterfaceC23363a, Serializable {

    /* renamed from: v */
    public static final Object f94920v = a.f94927p;

    /* renamed from: p */
    private transient InterfaceC23363a f94921p;

    /* renamed from: q */
    protected final Object f94922q;

    /* renamed from: r */
    private final Class f94923r;

    /* renamed from: s */
    private final String f94924s;

    /* renamed from: t */
    private final String f94925t;

    /* renamed from: u */
    private final boolean f94926u;

    /* renamed from: fn0.f$a */
    /* loaded from: classes.dex */
    private static class a implements Serializable {

        /* renamed from: p */
        private static final a f94927p = new a();

        private a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f94927p;
        }
    }

    public AbstractC19050f(Object obj, Class cls, String str, String str2, boolean z11) {
        this.f94922q = obj;
        this.f94923r = cls;
        this.f94924s = str;
        this.f94925t = str2;
        this.f94926u = z11;
    }

    @Override // mn0.InterfaceC23363a
    /* renamed from: a */
    public String mo100153a() {
        return this.f94924s;
    }

    /* renamed from: b */
    public InterfaceC23363a mo100151b() {
        InterfaceC23363a interfaceC23363a = this.f94921p;
        if (interfaceC23363a == null) {
            InterfaceC23363a mo100148c = mo100148c();
            this.f94921p = mo100148c;
            return mo100148c;
        }
        return interfaceC23363a;
    }

    /* renamed from: c */
    protected abstract InterfaceC23363a mo100148c();

    /* renamed from: d */
    public Object m100154d() {
        return this.f94922q;
    }

    /* renamed from: e */
    public InterfaceC23365c m100155e() {
        Class cls = this.f94923r;
        if (cls == null) {
            return null;
        }
        if (this.f94926u) {
            return AbstractC19061k0.m100170c(cls);
        }
        return AbstractC19061k0.m100169b(cls);
    }

    /* renamed from: f */
    public InterfaceC23363a m100156f() {
        InterfaceC23363a mo100151b = mo100151b();
        if (mo100151b != this) {
            return mo100151b;
        }
        throw new C18032b();
    }

    /* renamed from: g */
    public String m100157g() {
        return this.f94925t;
    }
}
