package p674y9;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: y9.b */
/* loaded from: classes3.dex */
public abstract class AbstractC30845b {

    /* renamed from: a */
    static final Type[] f142312a = new Type[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y9.b$a */
    /* loaded from: classes3.dex */
    public static final class a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: p */
        private final Type f142313p;

        public a(Type type) {
            this.f142313p = AbstractC30845b.m149931b(type);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && AbstractC30845b.m149935f(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f142313p;
        }

        public int hashCode() {
            return this.f142313p.hashCode();
        }

        public String toString() {
            return AbstractC30845b.m149950u(this.f142313p) + "[]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y9.b$b */
    /* loaded from: classes3.dex */
    public static final class b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: p */
        private final Type f142314p;

        /* renamed from: q */
        private final Type f142315q;

        /* renamed from: r */
        private final Type[] f142316r;

        public b(Type type, Type type2, Type... typeArr) {
            Type m149931b;
            boolean z11;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z12 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (type == null && !z11) {
                    z12 = false;
                }
                AbstractC30844a.m149928a(z12);
            }
            if (type == null) {
                m149931b = null;
            } else {
                m149931b = AbstractC30845b.m149931b(type);
            }
            this.f142314p = m149931b;
            this.f142315q = AbstractC30845b.m149931b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f142316r = typeArr2;
            int length = typeArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                AbstractC30844a.m149929b(this.f142316r[i11]);
                AbstractC30845b.m149932c(this.f142316r[i11]);
                Type[] typeArr3 = this.f142316r;
                typeArr3[i11] = AbstractC30845b.m149931b(typeArr3[i11]);
            }
        }

        public boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && AbstractC30845b.m149935f(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f142316r.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f142314p;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f142315q;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f142316r) ^ this.f142315q.hashCode()) ^ AbstractC30845b.m149942m(this.f142314p);
        }

        public String toString() {
            int length = this.f142316r.length;
            if (length == 0) {
                return AbstractC30845b.m149950u(this.f142315q);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(AbstractC30845b.m149950u(this.f142315q));
            sb2.append("<");
            sb2.append(AbstractC30845b.m149950u(this.f142316r[0]));
            for (int i11 = 1; i11 < length; i11++) {
                sb2.append(", ");
                sb2.append(AbstractC30845b.m149950u(this.f142316r[i11]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y9.b$c */
    /* loaded from: classes3.dex */
    public static final class c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: p */
        private final Type f142317p;

        /* renamed from: q */
        private final Type f142318q;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z11;
            boolean z12;
            if (typeArr2.length <= 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC30844a.m149928a(z11);
            if (typeArr.length == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            AbstractC30844a.m149928a(z12);
            if (typeArr2.length == 1) {
                AbstractC30844a.m149929b(typeArr2[0]);
                AbstractC30845b.m149932c(typeArr2[0]);
                AbstractC30844a.m149928a(typeArr[0] == Object.class);
                this.f142318q = AbstractC30845b.m149931b(typeArr2[0]);
                this.f142317p = Object.class;
                return;
            }
            AbstractC30844a.m149929b(typeArr[0]);
            AbstractC30845b.m149932c(typeArr[0]);
            this.f142318q = null;
            this.f142317p = AbstractC30845b.m149931b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && AbstractC30845b.m149935f(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f142318q;
            if (type != null) {
                return new Type[]{type};
            }
            return AbstractC30845b.f142312a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f142317p};
        }

        public int hashCode() {
            int i11;
            Type type = this.f142318q;
            if (type != null) {
                i11 = type.hashCode() + 31;
            } else {
                i11 = 1;
            }
            return i11 ^ (this.f142317p.hashCode() + 31);
        }

        public String toString() {
            if (this.f142318q != null) {
                return "? super " + AbstractC30845b.m149950u(this.f142318q);
            }
            if (this.f142317p == Object.class) {
                return "?";
            }
            return "? extends " + AbstractC30845b.m149950u(this.f142317p);
        }
    }

    /* renamed from: a */
    public static GenericArrayType m149930a(Type type) {
        return new a(type);
    }

    /* renamed from: b */
    public static Type m149931b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new a(m149931b(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    /* renamed from: c */
    static void m149932c(Type type) {
        boolean z11;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z11 = false;
        } else {
            z11 = true;
        }
        AbstractC30844a.m149928a(z11);
    }

    /* renamed from: d */
    private static Class m149933d(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    static boolean m149934e(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m149935f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (m149934e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m149935f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static Type m149936g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m149937h(Type type, Class cls) {
        Type m149941l = m149941l(type, cls, Collection.class);
        if (m149941l instanceof WildcardType) {
            m149941l = ((WildcardType) m149941l).getUpperBounds()[0];
        }
        if (m149941l instanceof ParameterizedType) {
            return ((ParameterizedType) m149941l).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: i */
    static Type m149938i(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i11 = 0; i11 < length; i11++) {
                Class<?> cls3 = interfaces[i11];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i11];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m149938i(cls.getGenericInterfaces()[i11], interfaces[i11], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m149938i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m149939j(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m149941l = m149941l(type, cls, Map.class);
        if (m149941l instanceof ParameterizedType) {
            return ((ParameterizedType) m149941l).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: k */
    public static Class m149940k(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            AbstractC30844a.m149928a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m149940k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m149940k(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    /* renamed from: l */
    static Type m149941l(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        AbstractC30844a.m149928a(cls2.isAssignableFrom(cls));
        return m149945p(type, cls, m149938i(type, cls, cls2));
    }

    /* renamed from: m */
    static int m149942m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: n */
    private static int m149943n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (obj.equals(objArr[i11])) {
                return i11;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m149944o(Type type, Type type2, Type... typeArr) {
        return new b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m149945p(Type type, Class cls, Type type2) {
        return m149946q(type, cls, type2, new HashSet());
    }

    /* renamed from: q */
    private static Type m149946q(Type type, Class cls, Type type2, Collection collection) {
        boolean z11;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = m149947r(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type m149946q = m149946q(type, cls, componentType, collection);
                if (componentType != m149946q) {
                    return m149930a(m149946q);
                }
                return cls2;
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type m149946q2 = m149946q(type, cls, genericComponentType, collection);
            if (genericComponentType != m149946q2) {
                return m149930a(m149946q2);
            }
            return genericArrayType;
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type m149946q3 = m149946q(type, cls, ownerType, collection);
            if (m149946q3 != ownerType) {
                z11 = true;
            } else {
                z11 = false;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i11 = 0; i11 < length; i11++) {
                Type m149946q4 = m149946q(type, cls, actualTypeArguments[i11], collection);
                if (m149946q4 != actualTypeArguments[i11]) {
                    if (!z11) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z11 = true;
                    }
                    actualTypeArguments[i11] = m149946q4;
                }
            }
            if (z11) {
                return m149944o(m149946q3, parameterizedType.getRawType(), actualTypeArguments);
            }
            return parameterizedType;
        }
        boolean z12 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z12) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type m149946q5 = m149946q(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (m149946q5 != lowerBounds[0]) {
                    return m149949t(m149946q5);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type m149946q6 = m149946q(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (m149946q6 != upperBounds[0]) {
                        return m149948s(m149946q6);
                    }
                }
            }
        }
        return type3;
    }

    /* renamed from: r */
    static Type m149947r(Type type, Class cls, TypeVariable typeVariable) {
        Class m149933d = m149933d(typeVariable);
        if (m149933d == null) {
            return typeVariable;
        }
        Type m149938i = m149938i(type, cls, m149933d);
        if (m149938i instanceof ParameterizedType) {
            return ((ParameterizedType) m149938i).getActualTypeArguments()[m149943n(m149933d.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    /* renamed from: s */
    public static WildcardType m149948s(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(typeArr, f142312a);
    }

    /* renamed from: t */
    public static WildcardType m149949t(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: u */
    public static String m149950u(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
