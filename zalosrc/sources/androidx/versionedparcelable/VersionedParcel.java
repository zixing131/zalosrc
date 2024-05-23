package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p312l2.InterfaceC22005a;
import p665y0.C30239a;

/* loaded from: classes2.dex */
public abstract class VersionedParcel {

    /* renamed from: a */
    protected final C30239a f8738a;

    /* renamed from: b */
    protected final C30239a f8739b;

    /* renamed from: c */
    protected final C30239a f8740c;

    /* loaded from: classes2.dex */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C30239a c30239a, C30239a c30239a2, C30239a c30239a3) {
        this.f8738a = c30239a;
        this.f8739b = c30239a2;
        this.f8740c = c30239a3;
    }

    /* renamed from: N */
    private void m11114N(InterfaceC22005a interfaceC22005a) {
        try {
            mo11126I(m11115c(interfaceC22005a.getClass()).getName());
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(interfaceC22005a.getClass().getSimpleName() + " does not have a Parcelizer", e11);
        }
    }

    /* renamed from: c */
    private Class m11115c(Class cls) {
        Class cls2 = (Class) this.f8740c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f8740c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* renamed from: d */
    private Method m11116d(String str) {
        Method method = (Method) this.f8738a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.f8738a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private Method m11117e(Class cls) {
        Method method = (Method) this.f8739b.get(cls.getName());
        if (method == null) {
            Class m11115c = m11115c(cls);
            System.currentTimeMillis();
            Method declaredMethod = m11115c.getDeclaredMethod("write", cls, VersionedParcel.class);
            this.f8739b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: A */
    protected abstract void mo11118A(byte[] bArr);

    /* renamed from: B */
    public void m11119B(byte[] bArr, int i11) {
        mo11150w(i11);
        mo11118A(bArr);
    }

    /* renamed from: C */
    protected abstract void mo11120C(CharSequence charSequence);

    /* renamed from: D */
    public void m11121D(CharSequence charSequence, int i11) {
        mo11150w(i11);
        mo11120C(charSequence);
    }

    /* renamed from: E */
    protected abstract void mo11122E(int i11);

    /* renamed from: F */
    public void m11123F(int i11, int i12) {
        mo11150w(i12);
        mo11122E(i11);
    }

    /* renamed from: G */
    protected abstract void mo11124G(Parcelable parcelable);

    /* renamed from: H */
    public void m11125H(Parcelable parcelable, int i11) {
        mo11150w(i11);
        mo11124G(parcelable);
    }

    /* renamed from: I */
    protected abstract void mo11126I(String str);

    /* renamed from: J */
    public void m11127J(String str, int i11) {
        mo11150w(i11);
        mo11126I(str);
    }

    /* renamed from: K */
    protected void m11128K(InterfaceC22005a interfaceC22005a, VersionedParcel versionedParcel) {
        try {
            m11117e(interfaceC22005a.getClass()).invoke(null, interfaceC22005a, versionedParcel);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
        } catch (InvocationTargetException e14) {
            if (e14.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e14.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m11129L(InterfaceC22005a interfaceC22005a) {
        if (interfaceC22005a == null) {
            mo11126I(null);
            return;
        }
        m11114N(interfaceC22005a);
        VersionedParcel mo11132b = mo11132b();
        m11128K(interfaceC22005a, mo11132b);
        mo11132b.mo11131a();
    }

    /* renamed from: M */
    public void m11130M(InterfaceC22005a interfaceC22005a, int i11) {
        mo11150w(i11);
        m11129L(interfaceC22005a);
    }

    /* renamed from: a */
    protected abstract void mo11131a();

    /* renamed from: b */
    protected abstract VersionedParcel mo11132b();

    /* renamed from: f */
    public boolean m11133f() {
        return false;
    }

    /* renamed from: g */
    protected abstract boolean mo11134g();

    /* renamed from: h */
    public boolean m11135h(boolean z11, int i11) {
        if (!mo11140m(i11)) {
            return z11;
        }
        return mo11134g();
    }

    /* renamed from: i */
    protected abstract byte[] mo11136i();

    /* renamed from: j */
    public byte[] m11137j(byte[] bArr, int i11) {
        if (!mo11140m(i11)) {
            return bArr;
        }
        return mo11136i();
    }

    /* renamed from: k */
    protected abstract CharSequence mo11138k();

    /* renamed from: l */
    public CharSequence m11139l(CharSequence charSequence, int i11) {
        if (!mo11140m(i11)) {
            return charSequence;
        }
        return mo11138k();
    }

    /* renamed from: m */
    protected abstract boolean mo11140m(int i11);

    /* renamed from: n */
    protected InterfaceC22005a m11141n(String str, VersionedParcel versionedParcel) {
        try {
            return (InterfaceC22005a) m11116d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
        } catch (InvocationTargetException e14) {
            if (e14.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e14.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e14);
        }
    }

    /* renamed from: o */
    protected abstract int mo11142o();

    /* renamed from: p */
    public int m11143p(int i11, int i12) {
        if (!mo11140m(i12)) {
            return i11;
        }
        return mo11142o();
    }

    /* renamed from: q */
    protected abstract Parcelable mo11144q();

    /* renamed from: r */
    public Parcelable m11145r(Parcelable parcelable, int i11) {
        if (!mo11140m(i11)) {
            return parcelable;
        }
        return mo11144q();
    }

    /* renamed from: s */
    protected abstract String mo11146s();

    /* renamed from: t */
    public String m11147t(String str, int i11) {
        if (!mo11140m(i11)) {
            return str;
        }
        return mo11146s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public InterfaceC22005a m11148u() {
        String mo11146s = mo11146s();
        if (mo11146s == null) {
            return null;
        }
        return m11141n(mo11146s, mo11132b());
    }

    /* renamed from: v */
    public InterfaceC22005a m11149v(InterfaceC22005a interfaceC22005a, int i11) {
        if (!mo11140m(i11)) {
            return interfaceC22005a;
        }
        return m11148u();
    }

    /* renamed from: w */
    protected abstract void mo11150w(int i11);

    /* renamed from: x */
    public void m11151x(boolean z11, boolean z12) {
    }

    /* renamed from: y */
    protected abstract void mo11152y(boolean z11);

    /* renamed from: z */
    public void m11153z(boolean z11, int i11) {
        mo11150w(i11);
        mo11152y(z11);
    }
}
