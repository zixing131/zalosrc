package fn0;

import dn0.AbstractC18031a;
import en0.InterfaceC18494a;
import en0.InterfaceC18495b;
import en0.InterfaceC18496c;
import en0.InterfaceC18497d;
import en0.InterfaceC18498e;
import en0.InterfaceC18499f;
import en0.InterfaceC18500g;
import en0.InterfaceC18501h;
import en0.InterfaceC18502i;
import en0.InterfaceC18503j;
import en0.InterfaceC18504k;
import en0.InterfaceC18505l;
import en0.InterfaceC18506m;
import en0.InterfaceC18507n;
import en0.InterfaceC18508o;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import en0.InterfaceC18511r;
import en0.InterfaceC18512s;
import en0.InterfaceC18513t;
import en0.InterfaceC18514u;
import en0.InterfaceC18515v;
import en0.InterfaceC18516w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mn0.InterfaceC23364b;
import on0.AbstractC24342w;
import pm0.AbstractC24866w;
import pm0.C24860q;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: fn0.i */
/* loaded from: classes.dex */
public final class C19056i implements InterfaceC23364b, InterfaceC19054h {

    /* renamed from: b */
    public static final a f94932b = new a(null);

    /* renamed from: c */
    private static final Map f94933c;

    /* renamed from: d */
    private static final HashMap f94934d;

    /* renamed from: e */
    private static final HashMap f94935e;

    /* renamed from: f */
    private static final HashMap f94936f;

    /* renamed from: g */
    private static final Map f94937g;

    /* renamed from: a */
    private final Class f94938a;

    /* renamed from: fn0.i$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:            if (r2 == null) goto L13;     */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String m100164a(Class cls) {
            String str;
            String str2;
            String m127144L0;
            String m127146M0;
            AbstractC19074t.m100208f(cls, "jClass");
            String str3 = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    AbstractC19074t.m100205c(simpleName);
                    str = AbstractC24342w.m127146M0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor != null) {
                    AbstractC19074t.m100205c(simpleName);
                    m127146M0 = AbstractC24342w.m127146M0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                    return m127146M0;
                }
                AbstractC19074t.m100205c(simpleName);
                m127144L0 = AbstractC24342w.m127144L0(simpleName, '$', null, 2, null);
                return m127144L0;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                str = "Array";
                if (componentType.isPrimitive() && (str2 = (String) C19056i.f94937g.get(componentType.getName())) != null) {
                    str3 = str2 + "Array";
                }
                if (str3 != null) {
                    return str3;
                }
            } else {
                String str4 = (String) C19056i.f94937g.get(cls.getName());
                if (str4 == null) {
                    return cls.getSimpleName();
                }
                return str4;
            }
            return str;
        }

        /* renamed from: b */
        public final boolean m100165b(Object obj, Class cls) {
            AbstractC19074t.m100208f(cls, "jClass");
            Map map = C19056i.f94933c;
            AbstractC19074t.m100206d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return AbstractC19069o0.m100194k(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = AbstractC18031a.m95869b(AbstractC18031a.m95870c(cls));
            }
            return cls.isInstance(obj);
        }
    }

    static {
        List m131505m;
        int m131511r;
        Map m131413r;
        int m131400e;
        String m127152P0;
        String m127152P02;
        int i11 = 0;
        m131505m = AbstractC25368s.m131505m(InterfaceC18494a.class, InterfaceC18505l.class, InterfaceC18509p.class, InterfaceC18510q.class, InterfaceC18511r.class, InterfaceC18512s.class, InterfaceC18513t.class, InterfaceC18514u.class, InterfaceC18515v.class, InterfaceC18516w.class, InterfaceC18495b.class, InterfaceC18496c.class, InterfaceC18497d.class, InterfaceC18498e.class, InterfaceC18499f.class, InterfaceC18500g.class, InterfaceC18501h.class, InterfaceC18502i.class, InterfaceC18503j.class, InterfaceC18504k.class, InterfaceC18506m.class, InterfaceC18507n.class, InterfaceC18508o.class);
        List list = m131505m;
        m131511r = AbstractC25370t.m131511r(list, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            arrayList.add(AbstractC24866w.m129235a((Class) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        m131413r = AbstractC25363p0.m131413r(arrayList);
        f94933c = m131413r;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f94934d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f94935e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        AbstractC19074t.m100207e(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            AbstractC19074t.m100205c(str);
            m127152P02 = AbstractC24342w.m127152P0(str, '.', null, 2, null);
            sb2.append(m127152P02);
            sb2.append("CompanionObject");
            C24860q m129235a = AbstractC24866w.m129235a(sb2.toString(), str + ".Companion");
            hashMap3.put(m129235a.m129215c(), m129235a.m129216d());
        }
        for (Map.Entry entry : f94933c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f94936f = hashMap3;
        m131400e = AbstractC25361o0.m131400e(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m131400e);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            m127152P0 = AbstractC24342w.m127152P0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, m127152P0);
        }
        f94937g = linkedHashMap;
    }

    public C19056i(Class cls) {
        AbstractC19074t.m100208f(cls, "jClass");
        this.f94938a = cls;
    }

    @Override // mn0.InterfaceC23364b
    /* renamed from: a */
    public boolean mo100162a(Object obj) {
        return f94932b.m100165b(obj, mo100159b());
    }

    @Override // fn0.InterfaceC19054h
    /* renamed from: b */
    public Class mo100159b() {
        return this.f94938a;
    }

    @Override // mn0.InterfaceC23364b
    /* renamed from: c */
    public String mo100163c() {
        return f94932b.m100164a(mo100159b());
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C19056i) && AbstractC19074t.m100204b(AbstractC18031a.m95869b(this), AbstractC18031a.m95869b((InterfaceC23364b) obj))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC18031a.m95869b(this).hashCode();
    }

    public String toString() {
        return mo100159b().toString() + " (Kotlin reflection is not available)";
    }
}
