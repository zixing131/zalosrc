package p674y9;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: y9.m */
/* loaded from: classes3.dex */
public abstract class AbstractC30856m {

    /* renamed from: y9.m$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC30856m {

        /* renamed from: a */
        final /* synthetic */ Method f142381a;

        /* renamed from: b */
        final /* synthetic */ Object f142382b;

        a(Method method, Object obj) {
            this.f142381a = method;
            this.f142382b = obj;
        }

        @Override // p674y9.AbstractC30856m
        /* renamed from: c */
        public Object mo149997c(Class cls) {
            AbstractC30856m.m149995a(cls);
            return this.f142381a.invoke(this.f142382b, cls);
        }
    }

    /* renamed from: y9.m$b */
    /* loaded from: classes3.dex */
    class b extends AbstractC30856m {

        /* renamed from: a */
        final /* synthetic */ Method f142383a;

        /* renamed from: b */
        final /* synthetic */ int f142384b;

        b(Method method, int i11) {
            this.f142383a = method;
            this.f142384b = i11;
        }

        @Override // p674y9.AbstractC30856m
        /* renamed from: c */
        public Object mo149997c(Class cls) {
            AbstractC30856m.m149995a(cls);
            return this.f142383a.invoke(null, cls, Integer.valueOf(this.f142384b));
        }
    }

    /* renamed from: y9.m$c */
    /* loaded from: classes3.dex */
    class c extends AbstractC30856m {

        /* renamed from: a */
        final /* synthetic */ Method f142385a;

        c(Method method) {
            this.f142385a = method;
        }

        @Override // p674y9.AbstractC30856m
        /* renamed from: c */
        public Object mo149997c(Class cls) {
            AbstractC30856m.m149995a(cls);
            return this.f142385a.invoke(null, cls, Object.class);
        }
    }

    /* renamed from: y9.m$d */
    /* loaded from: classes3.dex */
    class d extends AbstractC30856m {
        d() {
        }

        @Override // p674y9.AbstractC30856m
        /* renamed from: c */
        public Object mo149997c(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    static void m149995a(Class cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }

    /* renamed from: b */
    public static AbstractC30856m m149996b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    /* renamed from: c */
    public abstract Object mo149997c(Class cls);
}
