package com.google.protobuf;

import com.google.protobuf.AbstractC6784a;
import com.google.protobuf.AbstractC6830s;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.q */
/* loaded from: classes3.dex */
public abstract class AbstractC6826q extends AbstractC6784a {
    private static Map<Object, AbstractC6826q> defaultInstanceMap = new ConcurrentHashMap();
    protected C6795d1 unknownFields = C6795d1.m34768a();
    protected int memoizedSerializedSize = -1;

    /* renamed from: com.google.protobuf.q$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends AbstractC6784a.a {

        /* renamed from: p */
        private final AbstractC6826q f37459p;

        /* renamed from: q */
        protected AbstractC6826q f37460q;

        /* renamed from: r */
        protected boolean f37461r = false;

        public a(AbstractC6826q abstractC6826q) {
            this.f37459p = abstractC6826q;
            this.f37460q = (AbstractC6826q) abstractC6826q.m35104s(c.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: z */
        private void m35108z(AbstractC6826q abstractC6826q, AbstractC6826q abstractC6826q2) {
            C6833t0.m35141a().m35144d(abstractC6826q).mo35045a(abstractC6826q, abstractC6826q2);
        }

        /* renamed from: q */
        public final AbstractC6826q m35109q() {
            AbstractC6826q mo34980J = mo34980J();
            if (mo34980J.m35098A()) {
                return mo34980J;
            }
            throw AbstractC6784a.a.m34718p(mo34980J);
        }

        @Override // com.google.protobuf.InterfaceC6809i0.a
        /* renamed from: r */
        public AbstractC6826q mo34980J() {
            if (this.f37461r) {
                return this.f37460q;
            }
            this.f37460q.m35099C();
            this.f37461r = true;
            return this.f37460q;
        }

        /* renamed from: s */
        public a clone() {
            a m35100G = mo34987g().m35100G();
            m35100G.m35116y(mo34980J());
            return m35100G;
        }

        /* renamed from: u */
        public final void m35112u() {
            if (this.f37461r) {
                m35113v();
                this.f37461r = false;
            }
        }

        /* renamed from: v */
        protected void m35113v() {
            AbstractC6826q abstractC6826q = (AbstractC6826q) this.f37460q.m35104s(c.NEW_MUTABLE_INSTANCE);
            m35108z(abstractC6826q, this.f37460q);
            this.f37460q = abstractC6826q;
        }

        @Override // com.google.protobuf.InterfaceC6812j0
        /* renamed from: w */
        public AbstractC6826q mo34987g() {
            return this.f37459p;
        }

        @Override // com.google.protobuf.AbstractC6784a.a
        /* renamed from: x */
        public a mo34720n(AbstractC6826q abstractC6826q) {
            return m35116y(abstractC6826q);
        }

        /* renamed from: y */
        public a m35116y(AbstractC6826q abstractC6826q) {
            m35112u();
            m35108z(this.f37460q, abstractC6826q);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.q$b */
    /* loaded from: classes3.dex */
    protected static class b extends AbstractC6787b {

        /* renamed from: b */
        private final AbstractC6826q f37462b;

        public b(AbstractC6826q abstractC6826q) {
            this.f37462b = abstractC6826q;
        }
    }

    /* renamed from: com.google.protobuf.q$c */
    /* loaded from: classes3.dex */
    public enum c {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: B */
    protected static final boolean m35089B(AbstractC6826q abstractC6826q, boolean z11) {
        Object obj;
        byte byteValue = ((Byte) abstractC6826q.m35104s(c.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo35048d = C6833t0.m35141a().m35144d(abstractC6826q).mo35048d(abstractC6826q);
        if (z11) {
            c cVar = c.SET_MEMOIZED_IS_INITIALIZED;
            if (mo35048d) {
                obj = abstractC6826q;
            } else {
                obj = null;
            }
            abstractC6826q.m35105t(cVar, obj);
        }
        return mo35048d;
    }

    /* renamed from: D */
    public static AbstractC6830s.d m35090D(AbstractC6830s.d dVar) {
        int i11;
        int size = dVar.size();
        if (size == 0) {
            i11 = 10;
        } else {
            i11 = size * 2;
        }
        return dVar.mo35124h(i11);
    }

    /* renamed from: E */
    public static AbstractC6830s.e m35091E(AbstractC6830s.e eVar) {
        int i11;
        int size = eVar.size();
        if (size == 0) {
            i11 = 10;
        } else {
            i11 = size * 2;
        }
        return eVar.mo35124h(i11);
    }

    /* renamed from: H */
    public static Object m35092H(InterfaceC6809i0 interfaceC6809i0, String str, Object[] objArr) {
        return new C6837v0(interfaceC6809i0, str, objArr);
    }

    /* renamed from: I */
    public static void m35093I(Class cls, AbstractC6826q abstractC6826q) {
        defaultInstanceMap.put(cls, abstractC6826q);
    }

    /* renamed from: v */
    public static AbstractC6830s.d m35094v() {
        return C6828r.m35118k();
    }

    /* renamed from: w */
    public static AbstractC6830s.e m35095w() {
        return C6835u0.m35147g();
    }

    /* renamed from: x */
    public static AbstractC6826q m35096x(Class cls) {
        AbstractC6826q abstractC6826q = defaultInstanceMap.get(cls);
        if (abstractC6826q == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC6826q = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (abstractC6826q == null) {
            abstractC6826q = ((AbstractC6826q) AbstractC6804g1.m34868k(cls)).mo34987g();
            if (abstractC6826q != null) {
                defaultInstanceMap.put(cls, abstractC6826q);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC6826q;
    }

    /* renamed from: z */
    public static Object m35097z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: A */
    public final boolean m35098A() {
        return m35089B(this, true);
    }

    /* renamed from: C */
    protected void m35099C() {
        C6833t0.m35141a().m35144d(this).mo35047c(this);
    }

    /* renamed from: G */
    public final a m35100G() {
        return (a) m35104s(c.NEW_BUILDER);
    }

    @Override // com.google.protobuf.InterfaceC6809i0
    /* renamed from: K */
    public final a mo34977b() {
        a aVar = (a) m35104s(c.NEW_BUILDER);
        aVar.m35116y(this);
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C6833t0.m35141a().m35144d(this).mo35051g(this, (AbstractC6826q) obj);
    }

    @Override // com.google.protobuf.InterfaceC6809i0
    /* renamed from: f */
    public int mo34978f() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = C6833t0.m35141a().m35144d(this).mo35049e(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // com.google.protobuf.InterfaceC6809i0
    /* renamed from: h */
    public void mo34979h(CodedOutputStream codedOutputStream) {
        C6833t0.m35141a().m35144d(this).mo35046b(this, C6805h.m34904P(codedOutputStream));
    }

    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int mo35050f = C6833t0.m35141a().m35144d(this).mo35050f(this);
        this.memoizedHashCode = mo35050f;
        return mo35050f;
    }

    @Override // com.google.protobuf.AbstractC6784a
    /* renamed from: l */
    int mo34712l() {
        return this.memoizedSerializedSize;
    }

    @Override // com.google.protobuf.AbstractC6784a
    /* renamed from: o */
    void mo34714o(int i11) {
        this.memoizedSerializedSize = i11;
    }

    /* renamed from: q */
    public Object m35102q() {
        return m35104s(c.BUILD_MESSAGE_INFO);
    }

    /* renamed from: r */
    public final a m35103r() {
        return (a) m35104s(c.NEW_BUILDER);
    }

    /* renamed from: s */
    protected Object m35104s(c cVar) {
        return mo35106u(cVar, null, null);
    }

    /* renamed from: t */
    protected Object m35105t(c cVar, Object obj) {
        return mo35106u(cVar, obj, null);
    }

    public String toString() {
        return AbstractC6815k0.m34998e(this, super.toString());
    }

    /* renamed from: u */
    protected abstract Object mo35106u(c cVar, Object obj, Object obj2);

    @Override // com.google.protobuf.InterfaceC6812j0
    /* renamed from: y */
    public final AbstractC6826q mo34987g() {
        return (AbstractC6826q) m35104s(c.GET_DEFAULT_INSTANCE);
    }
}
