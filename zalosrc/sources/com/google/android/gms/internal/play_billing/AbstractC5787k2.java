package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.play_billing.k2 */
/* loaded from: classes2.dex */
public abstract class AbstractC5787k2 {

    /* renamed from: a */
    private static final char[] f33344a;

    static {
        char[] cArr = new char[80];
        f33344a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m30313a(InterfaceC5775i2 interfaceC5775i2, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m30316d(interfaceC5775i2, sb2, 0);
        return sb2.toString();
    }

    /* renamed from: b */
    public static void m30314b(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m30314b(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m30314b(sb2, i11, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m30315c(i11, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i12 = 1; i12 < str.length(); i12++) {
                char charAt = str.charAt(i12);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(AbstractC5859w2.m30548a(new C5785k0(((String) obj).getBytes(AbstractC5804n1.f33376b))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC5803n0) {
            sb2.append(": \"");
            sb2.append(AbstractC5859w2.m30548a((AbstractC5803n0) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC5774i1) {
            sb2.append(" {");
            m30316d((AbstractC5774i1) obj, sb2, i11 + 2);
            sb2.append("\n");
            m30315c(i11, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            int i13 = i11 + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            m30314b(sb2, i13, "key", entry.getKey());
            m30314b(sb2, i13, "value", entry.getValue());
            sb2.append("\n");
            m30315c(i11, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    /* renamed from: c */
    private static void m30315c(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(f33344a, 0, i12);
            i11 -= i12;
        }
    }

    /* renamed from: d */
    private static void m30316d(InterfaceC5775i2 interfaceC5775i2, StringBuilder sb2, int i11) {
        int i12;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC5775i2.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i12 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i12);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m30314b(sb2, i11, substring.substring(0, substring.length() - 4), AbstractC5774i1.m30277i(method2, interfaceC5775i2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m30314b(sb2, i11, substring.substring(0, substring.length() - 3), AbstractC5774i1.m30277i(method, interfaceC5775i2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m30277i = AbstractC5774i1.m30277i(method4, interfaceC5775i2, new Object[0]);
                    if (method5 == null) {
                        if (m30277i instanceof Boolean) {
                            if (!((Boolean) m30277i).booleanValue()) {
                            }
                            m30314b(sb2, i11, substring, m30277i);
                        } else if (m30277i instanceof Integer) {
                            if (((Integer) m30277i).intValue() == 0) {
                            }
                            m30314b(sb2, i11, substring, m30277i);
                        } else if (m30277i instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m30277i).floatValue()) == 0) {
                            }
                            m30314b(sb2, i11, substring, m30277i);
                        } else if (m30277i instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m30277i).doubleValue()) == 0) {
                            }
                            m30314b(sb2, i11, substring, m30277i);
                        } else {
                            if (m30277i instanceof String) {
                                equals = m30277i.equals("");
                            } else if (m30277i instanceof AbstractC5803n0) {
                                equals = m30277i.equals(AbstractC5803n0.f33371q);
                            } else if (m30277i instanceof InterfaceC5775i2) {
                                if (m30277i == ((InterfaceC5775i2) m30277i).zzf()) {
                                }
                                m30314b(sb2, i11, substring, m30277i);
                            } else {
                                if ((m30277i instanceof Enum) && ((Enum) m30277i).ordinal() == 0) {
                                }
                                m30314b(sb2, i11, substring, m30277i);
                            }
                            if (equals) {
                            }
                            m30314b(sb2, i11, substring, m30277i);
                        }
                    } else {
                        if (!((Boolean) AbstractC5774i1.m30277i(method5, interfaceC5775i2, new Object[0])).booleanValue()) {
                        }
                        m30314b(sb2, i11, substring, m30277i);
                    }
                }
            }
            i12 = 3;
        }
        C5871y2 c5871y2 = ((AbstractC5774i1) interfaceC5775i2).zzc;
        if (c5871y2 != null) {
            c5871y2.m30577i(sb2, i11);
        }
    }
}
