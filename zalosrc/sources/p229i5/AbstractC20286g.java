package p229i5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p665y0.C30239a;
import p665y0.C30240b;

/* renamed from: i5.g */
/* loaded from: classes.dex */
public abstract class AbstractC20286g {
    /* renamed from: a */
    public static List m105916a() {
        return Collections.emptyList();
    }

    /* renamed from: b */
    public static List m105917b(Object obj) {
        return Collections.singletonList(obj);
    }

    /* renamed from: c */
    public static List m105918c(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(objArr));
            }
            return m105917b(objArr[0]);
        }
        return m105916a();
    }

    /* renamed from: d */
    public static Map m105919d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Map m105923h = m105923h(3, false);
        m105923h.put(obj, obj2);
        m105923h.put(obj3, obj4);
        m105923h.put(obj5, obj6);
        return Collections.unmodifiableMap(m105923h);
    }

    /* renamed from: e */
    public static Map m105920e(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        if (length == length2) {
            if (length != 0) {
                if (length != 1) {
                    Map m105923h = m105923h(length, false);
                    for (int i11 = 0; i11 < objArr.length; i11++) {
                        m105923h.put(objArr[i11], objArr2[i11]);
                    }
                    return Collections.unmodifiableMap(m105923h);
                }
                return Collections.singletonMap(objArr[0], objArr2[0]);
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
    }

    /* renamed from: f */
    public static Set m105921f(Object obj, Object obj2, Object obj3) {
        Set m105924i = m105924i(3, false);
        m105924i.add(obj);
        m105924i.add(obj2);
        m105924i.add(obj3);
        return Collections.unmodifiableSet(m105924i);
    }

    /* renamed from: g */
    public static Set m105922g(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            Set m105924i = m105924i(length, false);
                            Collections.addAll(m105924i, objArr);
                            return Collections.unmodifiableSet(m105924i);
                        }
                        Object obj = objArr[0];
                        Object obj2 = objArr[1];
                        Object obj3 = objArr[2];
                        Object obj4 = objArr[3];
                        Set m105924i2 = m105924i(4, false);
                        m105924i2.add(obj);
                        m105924i2.add(obj2);
                        m105924i2.add(obj3);
                        m105924i2.add(obj4);
                        return Collections.unmodifiableSet(m105924i2);
                    }
                    return m105921f(objArr[0], objArr[1], objArr[2]);
                }
                Object obj5 = objArr[0];
                Object obj6 = objArr[1];
                Set m105924i3 = m105924i(2, false);
                m105924i3.add(obj5);
                m105924i3.add(obj6);
                return Collections.unmodifiableSet(m105924i3);
            }
            return Collections.singleton(objArr[0]);
        }
        return Collections.emptySet();
    }

    /* renamed from: h */
    private static Map m105923h(int i11, boolean z11) {
        if (i11 <= 256) {
            return new C30239a(i11);
        }
        return new HashMap(i11, 1.0f);
    }

    /* renamed from: i */
    private static Set m105924i(int i11, boolean z11) {
        float f11;
        int i12;
        if (true != z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.75f;
        }
        if (true != z11) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        if (i11 <= i12) {
            return new C30240b(i11);
        }
        return new HashSet(i11, f11);
    }
}
