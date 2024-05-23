package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class bw3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m20763a(zv3 zv3Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m20766d(zv3Var, sb2, 0);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static final void m20764b(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m20764b(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m20764b(sb2, i11, str, (Map.Entry) it2.next());
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
            sb2.append(ww3.m27731a(mt3.m24728K((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof mt3) {
            sb2.append(": \"");
            sb2.append(ww3.m27731a((mt3) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof tu3) {
            sb2.append(" {");
            m20766d((tu3) obj, sb2, i11 + 2);
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
            m20764b(sb2, i14, "key", entry.getKey());
            m20764b(sb2, i14, "value", entry.getValue());
            sb2.append("\n");
            while (i12 < i11) {
                sb2.append(' ');
                i12++;
            }
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    /* renamed from: c */
    private static final String m20765c(String str) {
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

    /* renamed from: d */
    private static void m20766d(zv3 zv3Var, StringBuilder sb2, int i11) {
        String str;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zv3Var.getClass().getDeclaredMethods()) {
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
                String concat = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 4)));
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m20764b(sb2, i11, m20765c(concat), tu3.m26769y(method2, zv3Var, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String concat2 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 3)));
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m20764b(sb2, i11, m20765c(concat2), tu3.m26769y(method3, zv3Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null && (!str.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(str.substring(0, str.length() - 5)))))) {
                String concat3 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object m26769y = tu3.m26769y(method4, zv3Var, new Object[0]);
                    if (method5 == null) {
                        if (m26769y instanceof Boolean) {
                            if (((Boolean) m26769y).booleanValue()) {
                                m20764b(sb2, i11, m20765c(concat3), m26769y);
                            }
                        } else if (m26769y instanceof Integer) {
                            if (((Integer) m26769y).intValue() != 0) {
                                m20764b(sb2, i11, m20765c(concat3), m26769y);
                            }
                        } else if (m26769y instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m26769y).floatValue()) != 0) {
                                m20764b(sb2, i11, m20765c(concat3), m26769y);
                            }
                        } else if (m26769y instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m26769y).doubleValue()) != 0) {
                                m20764b(sb2, i11, m20765c(concat3), m26769y);
                            }
                        } else {
                            if (m26769y instanceof String) {
                                equals = m26769y.equals("");
                            } else if (m26769y instanceof mt3) {
                                equals = m26769y.equals(mt3.f24751q);
                            } else if (m26769y instanceof zv3) {
                                if (m26769y != ((zv3) m26769y).mo20309b()) {
                                    m20764b(sb2, i11, m20765c(concat3), m26769y);
                                }
                            } else {
                                if ((m26769y instanceof Enum) && ((Enum) m26769y).ordinal() == 0) {
                                }
                                m20764b(sb2, i11, m20765c(concat3), m26769y);
                            }
                            if (!equals) {
                                m20764b(sb2, i11, m20765c(concat3), m26769y);
                            }
                        }
                    } else if (((Boolean) tu3.m26769y(method5, zv3Var, new Object[0])).booleanValue()) {
                        m20764b(sb2, i11, m20765c(concat3), m26769y);
                    }
                }
            }
        }
        if (!(zv3Var instanceof ru3)) {
            yw3 yw3Var = ((tu3) zv3Var).zzc;
            if (yw3Var != null) {
                yw3Var.m28375g(sb2, i11);
                return;
            }
            return;
        }
        throw null;
    }
}
