package qn0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import dn0.AbstractC18031a;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.KSerializer;
import mn0.InterfaceC23364b;
import pm0.C24860q;
import pm0.C24865v;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import rn0.AbstractC25935a;
import tn0.AbstractC26796h1;
import tn0.AbstractC26846y0;
import wn0.AbstractC29112b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qn0.j */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC25395j {
    /* renamed from: a */
    private static final KSerializer m131589a(AbstractC29112b abstractC29112b, GenericArrayType genericArrayType, boolean z11) {
        KSerializer m131588b;
        InterfaceC23364b interfaceC23364b;
        Object m131356D;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            AbstractC19074t.m100207e(upperBounds, "it.upperBounds");
            m131356D = AbstractC25358n.m131356D(upperBounds);
            genericComponentType = (Type) m131356D;
        }
        AbstractC19074t.m100207e(genericComponentType, "eType");
        if (z11) {
            m131588b = AbstractC25394i.m131587a(abstractC29112b, genericComponentType);
        } else {
            m131588b = AbstractC25394i.m131588b(abstractC29112b, genericComponentType);
            if (m131588b == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            AbstractC19074t.m100206d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            interfaceC23364b = AbstractC18031a.m95870c((Class) rawType);
        } else if (genericComponentType instanceof InterfaceC23364b) {
            interfaceC23364b = (InterfaceC23364b) genericComponentType;
        } else {
            throw new IllegalStateException("unsupported type in GenericArray: " + AbstractC19061k0.m100169b(genericComponentType.getClass()));
        }
        AbstractC19074t.m100206d(interfaceC23364b, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer m133610a = AbstractC25935a.m133610a(interfaceC23364b, m131588b);
        AbstractC19074t.m100206d(m133610a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return m133610a;
    }

    /* renamed from: b */
    private static final Class m131590b(Type type) {
        Object m131356D;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            AbstractC19074t.m100207e(rawType, "it.rawType");
            return m131590b(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            AbstractC19074t.m100207e(upperBounds, "it.upperBounds");
            m131356D = AbstractC25358n.m131356D(upperBounds);
            AbstractC19074t.m100207e(m131356D, "it.upperBounds.first()");
            return m131590b((Type) m131356D);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            AbstractC19074t.m100207e(genericComponentType, "it.genericComponentType");
            return m131590b(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + AbstractC19061k0.m100169b(type.getClass()));
    }

    /* renamed from: c */
    private static final KSerializer m131591c(AbstractC29112b abstractC29112b, Class cls, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer m137996b = AbstractC26846y0.m137996b(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (m137996b != null) {
            return m137996b;
        }
        InterfaceC23364b m95870c = AbstractC18031a.m95870c(cls);
        KSerializer m137849b = AbstractC26796h1.m137849b(m95870c);
        if (m137849b == null) {
            return abstractC29112b.mo145361b(m95870c, list);
        }
        return m137849b;
    }

    /* renamed from: d */
    public static final KSerializer m131592d(AbstractC29112b abstractC29112b, Type type) {
        AbstractC19074t.m100208f(abstractC29112b, "<this>");
        AbstractC19074t.m100208f(type, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        KSerializer m131593e = m131593e(abstractC29112b, type, true);
        if (m131593e != null) {
            return m131593e;
        }
        AbstractC26846y0.m138003i(m131590b(type));
        throw new KotlinNothingValueException();
    }

    /* renamed from: e */
    private static final KSerializer m131593e(AbstractC29112b abstractC29112b, Type type, boolean z11) {
        Object m131356D;
        ArrayList<KSerializer> arrayList;
        int m131511r;
        if (type instanceof GenericArrayType) {
            return m131589a(abstractC29112b, (GenericArrayType) type, z11);
        }
        if (type instanceof Class) {
            return m131596h(abstractC29112b, (Class) type, z11);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            AbstractC19074t.m100206d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls = (Class) rawType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            AbstractC19074t.m100207e(actualTypeArguments, "args");
            if (z11) {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type2 : actualTypeArguments) {
                    AbstractC19074t.m100207e(type2, "it");
                    arrayList.add(AbstractC25394i.m131587a(abstractC29112b, type2));
                }
            } else {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type3 : actualTypeArguments) {
                    AbstractC19074t.m100207e(type3, "it");
                    KSerializer m131588b = AbstractC25394i.m131588b(abstractC29112b, type3);
                    if (m131588b == null) {
                        return null;
                    }
                    arrayList.add(m131588b);
                }
            }
            if (Set.class.isAssignableFrom(cls)) {
                KSerializer m133623n = AbstractC25935a.m133623n((KSerializer) arrayList.get(0));
                AbstractC19074t.m100206d(m133623n, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return m133623n;
            }
            if (!List.class.isAssignableFrom(cls) && !Collection.class.isAssignableFrom(cls)) {
                if (Map.class.isAssignableFrom(cls)) {
                    KSerializer m133620k = AbstractC25935a.m133620k((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                    AbstractC19074t.m100206d(m133620k, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return m133620k;
                }
                if (Map.Entry.class.isAssignableFrom(cls)) {
                    KSerializer m133619j = AbstractC25935a.m133619j((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                    AbstractC19074t.m100206d(m133619j, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return m133619j;
                }
                if (C24860q.class.isAssignableFrom(cls)) {
                    KSerializer m133622m = AbstractC25935a.m133622m((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                    AbstractC19074t.m100206d(m133622m, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return m133622m;
                }
                if (!C24865v.class.isAssignableFrom(cls)) {
                    m131511r = AbstractC25370t.m131511r(arrayList, 10);
                    ArrayList arrayList2 = new ArrayList(m131511r);
                    for (KSerializer kSerializer : arrayList) {
                        AbstractC19074t.m100206d(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                        arrayList2.add(kSerializer);
                    }
                    return m131591c(abstractC29112b, cls, arrayList2);
                }
                KSerializer m133625p = AbstractC25935a.m133625p((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
                AbstractC19074t.m100206d(m133625p, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return m133625p;
            }
            KSerializer m133617h = AbstractC25935a.m133617h((KSerializer) arrayList.get(0));
            AbstractC19074t.m100206d(m133617h, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return m133617h;
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            AbstractC19074t.m100207e(upperBounds, "type.upperBounds");
            m131356D = AbstractC25358n.m131356D(upperBounds);
            AbstractC19074t.m100207e(m131356D, "type.upperBounds.first()");
            return m131594f(abstractC29112b, (Type) m131356D, false, 2, null);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + AbstractC19061k0.m100169b(type.getClass()));
    }

    /* renamed from: f */
    static /* synthetic */ KSerializer m131594f(AbstractC29112b abstractC29112b, Type type, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return m131593e(abstractC29112b, type, z11);
    }

    /* renamed from: g */
    public static final KSerializer m131595g(AbstractC29112b abstractC29112b, Type type) {
        AbstractC19074t.m100208f(abstractC29112b, "<this>");
        AbstractC19074t.m100208f(type, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        return m131593e(abstractC29112b, type, false);
    }

    /* renamed from: h */
    private static final KSerializer m131596h(AbstractC29112b abstractC29112b, Class cls, boolean z11) {
        List m131502j;
        KSerializer m131588b;
        if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
            Class<?> componentType = cls.getComponentType();
            AbstractC19074t.m100207e(componentType, "type.componentType");
            if (z11) {
                m131588b = AbstractC25394i.m131587a(abstractC29112b, componentType);
            } else {
                m131588b = AbstractC25394i.m131588b(abstractC29112b, componentType);
                if (m131588b == null) {
                    return null;
                }
            }
            InterfaceC23364b m95870c = AbstractC18031a.m95870c(componentType);
            AbstractC19074t.m100206d(m95870c, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            KSerializer m133610a = AbstractC25935a.m133610a(m95870c, m131588b);
            AbstractC19074t.m100206d(m133610a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return m133610a;
        }
        AbstractC19074t.m100206d(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
        m131502j = AbstractC25368s.m131502j();
        return m131591c(abstractC29112b, cls, m131502j);
    }
}
