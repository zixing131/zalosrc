package androidx.work;

import androidx.work.C2148h;
import fn0.AbstractC19074t;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ArrayCreatingInputMerger extends AbstractC2246n {
    /* renamed from: b */
    private final Object m11436b(Object obj, Object obj2, Class cls) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance((Class<?>) cls, length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        AbstractC19074t.m100207e(newInstance, "newArray");
        return newInstance;
    }

    /* renamed from: c */
    private final Object m11437c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        AbstractC19074t.m100205c(componentType);
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        AbstractC19074t.m100207e(newInstance, "newArray");
        return newInstance;
    }

    /* renamed from: d */
    private final Object m11438d(Object obj, Class cls) {
        Object newInstance = Array.newInstance((Class<?>) cls, 1);
        Array.set(newInstance, 0, obj);
        AbstractC19074t.m100207e(newInstance, "newArray");
        return newInstance;
    }

    @Override // androidx.work.AbstractC2246n
    /* renamed from: a */
    public C2148h mo11439a(List list) {
        Class<?> cls;
        AbstractC19074t.m100208f(list, "inputs");
        C2148h.a aVar = new C2148h.a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map m11531i = ((C2148h) it.next()).m11531i();
            AbstractC19074t.m100207e(m11531i, "input.keyValueMap");
            for (Map.Entry entry : m11531i.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    cls = value.getClass();
                } else {
                    cls = String.class;
                }
                Object obj = hashMap.get(str);
                AbstractC19074t.m100207e(str, "key");
                if (obj == null) {
                    if (!cls.isArray()) {
                        value = m11438d(value, cls);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (AbstractC19074t.m100204b(cls2, cls)) {
                        AbstractC19074t.m100207e(value, "value");
                        value = m11437c(obj, value);
                    } else if (AbstractC19074t.m100204b(cls2.getComponentType(), cls)) {
                        value = m11436b(obj, value, cls);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                AbstractC19074t.m100207e(value, "if (existingValue == nul…      }\n                }");
                hashMap.put(str, value);
            }
        }
        aVar.m11537d(hashMap);
        C2148h m11534a = aVar.m11534a();
        AbstractC19074t.m100207e(m11534a, "output.build()");
        return m11534a;
    }
}
