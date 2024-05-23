package com.google.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.protobuf.k0 */
/* loaded from: classes3.dex */
public abstract class AbstractC6815k0 {
    /* renamed from: a */
    private static final String m34994a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private static boolean m34995b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof Float) {
            if (((Float) obj).floatValue() == 0.0f) {
                return true;
            }
            return false;
        }
        if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return true;
            }
            return false;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof AbstractC6799f) {
            return obj.equals(AbstractC6799f.f37259q);
        }
        if (obj instanceof InterfaceC6809i0) {
            if (obj == ((InterfaceC6809i0) obj).mo34987g()) {
                return true;
            }
            return false;
        }
        if ((obj instanceof Enum) && ((Enum) obj).ordinal() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final void m34996c(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m34996c(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m34996c(sb2, i11, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(AbstractC6789b1.m34736c((String) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC6799f) {
            sb2.append(": \"");
            sb2.append(AbstractC6789b1.m34734a((AbstractC6799f) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC6826q) {
            sb2.append(" {");
            m34997d((AbstractC6826q) obj, sb2, i11 + 2);
            sb2.append("\n");
            while (i12 < i11) {
                sb2.append(' ');
                i12++;
            }
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i14 = i11 + 2;
            m34996c(sb2, i14, "key", entry.getKey());
            m34996c(sb2, i14, "value", entry.getValue());
            sb2.append("\n");
            while (i12 < i11) {
                sb2.append(' ');
                i12++;
            }
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj.toString());
    }

    /* renamed from: d */
    private static void m34997d(InterfaceC6809i0 interfaceC6809i0, StringBuilder sb2, int i11) {
        String str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC6809i0.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String str3 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 4);
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m34996c(sb2, i11, m34994a(str3), AbstractC6826q.m35097z(method2, interfaceC6809i0, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String str4 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 3);
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m34996c(sb2, i11, m34994a(str4), AbstractC6826q.m35097z(method3, interfaceC6809i0, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + str)) != null) {
                if (str.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + str.substring(0, str.length() - 5))) {
                    }
                }
                String str5 = str.substring(0, 1).toLowerCase() + str.substring(1);
                Method method4 = (Method) hashMap.get("get" + str);
                Method method5 = (Method) hashMap.get("has" + str);
                if (method4 != null) {
                    Object m35097z = AbstractC6826q.m35097z(method4, interfaceC6809i0, new Object[0]);
                    if (method5 == null) {
                        if (!m34995b(m35097z)) {
                            m34996c(sb2, i11, m34994a(str5), m35097z);
                        }
                    } else if (((Boolean) AbstractC6826q.m35097z(method5, interfaceC6809i0, new Object[0])).booleanValue()) {
                        m34996c(sb2, i11, m34994a(str5), m35097z);
                    }
                }
            }
        }
        C6795d1 c6795d1 = ((AbstractC6826q) interfaceC6809i0).unknownFields;
        if (c6795d1 != null) {
            c6795d1.m34778i(sb2, i11);
        }
    }

    /* renamed from: e */
    public static String m34998e(InterfaceC6809i0 interfaceC6809i0, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m34997d(interfaceC6809i0, sb2, 0);
        return sb2.toString();
    }
}
