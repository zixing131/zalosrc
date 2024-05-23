package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.xa */
/* loaded from: classes2.dex */
public abstract class AbstractC5681xa {

    /* renamed from: a */
    private static final char[] f32915a;

    static {
        char[] cArr = new char[80];
        f32915a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m30024a(InterfaceC5647va interfaceC5647va, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m30027d(interfaceC5647va, sb2, 0);
        return sb2.toString();
    }

    /* renamed from: b */
    public static void m30025b(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m30025b(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m30025b(sb2, i11, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m30026c(i11, sb2);
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
            sb2.append(AbstractC5461kb.m29368a(new C5611t8(((String) obj).getBytes(AbstractC5290aa.f32257b))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC5679x8) {
            sb2.append(": \"");
            sb2.append(AbstractC5461kb.m29368a((AbstractC5679x8) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC5612t9) {
            sb2.append(" {");
            m30027d((AbstractC5612t9) obj, sb2, i11 + 2);
            sb2.append("\n");
            m30026c(i11, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i13 = i11 + 2;
            m30025b(sb2, i13, "key", entry.getKey());
            m30025b(sb2, i13, "value", entry.getValue());
            sb2.append("\n");
            m30026c(i11, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    /* renamed from: c */
    private static void m30026c(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(f32915a, 0, i12);
            i11 -= i12;
        }
    }

    /* renamed from: d */
    private static void m30027d(InterfaceC5647va interfaceC5647va, StringBuilder sb2, int i11) {
        int i12;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC5647va.getClass().getDeclaredMethods();
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
                m30025b(sb2, i11, substring.substring(0, substring.length() - 4), AbstractC5612t9.m29642q(method2, interfaceC5647va, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m30025b(sb2, i11, substring.substring(0, substring.length() - 3), AbstractC5612t9.m29642q(method, interfaceC5647va, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m29642q = AbstractC5612t9.m29642q(method4, interfaceC5647va, new Object[0]);
                    if (method5 == null) {
                        if (m29642q instanceof Boolean) {
                            if (!((Boolean) m29642q).booleanValue()) {
                            }
                            m30025b(sb2, i11, substring, m29642q);
                        } else if (m29642q instanceof Integer) {
                            if (((Integer) m29642q).intValue() == 0) {
                            }
                            m30025b(sb2, i11, substring, m29642q);
                        } else if (m29642q instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m29642q).floatValue()) == 0) {
                            }
                            m30025b(sb2, i11, substring, m29642q);
                        } else if (m29642q instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m29642q).doubleValue()) == 0) {
                            }
                            m30025b(sb2, i11, substring, m29642q);
                        } else {
                            if (m29642q instanceof String) {
                                equals = m29642q.equals("");
                            } else if (m29642q instanceof AbstractC5679x8) {
                                equals = m29642q.equals(AbstractC5679x8.f32911q);
                            } else if (m29642q instanceof InterfaceC5647va) {
                                if (m29642q == ((InterfaceC5647va) m29642q).mo29647c()) {
                                }
                                m30025b(sb2, i11, substring, m29642q);
                            } else {
                                if ((m29642q instanceof Enum) && ((Enum) m29642q).ordinal() == 0) {
                                }
                                m30025b(sb2, i11, substring, m29642q);
                            }
                            if (equals) {
                            }
                            m30025b(sb2, i11, substring, m29642q);
                        }
                    } else {
                        if (!((Boolean) AbstractC5612t9.m29642q(method5, interfaceC5647va, new Object[0])).booleanValue()) {
                        }
                        m30025b(sb2, i11, substring, m29642q);
                    }
                }
            }
            i12 = 3;
        }
        C5495mb c5495mb = ((AbstractC5612t9) interfaceC5647va).zzc;
        if (c5495mb != null) {
            c5495mb.m29450i(sb2, i11);
        }
    }
}
