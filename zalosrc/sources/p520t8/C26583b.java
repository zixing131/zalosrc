package p520t8;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t8.b */
/* loaded from: classes.dex */
public final class C26583b {

    /* renamed from: a */
    private final String f125863a;

    /* renamed from: b */
    private final Map f125864b;

    /* renamed from: t8.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final String f125865a;

        /* renamed from: b */
        private Map f125866b = null;

        b(String str) {
            this.f125865a = str;
        }

        /* renamed from: a */
        public C26583b m136513a() {
            Map unmodifiableMap;
            String str = this.f125865a;
            if (this.f125866b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f125866b));
            }
            return new C26583b(str, unmodifiableMap);
        }

        /* renamed from: b */
        public b m136514b(Annotation annotation) {
            if (this.f125866b == null) {
                this.f125866b = new HashMap();
            }
            this.f125866b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    /* renamed from: a */
    public static b m136509a(String str) {
        return new b(str);
    }

    /* renamed from: d */
    public static C26583b m136510d(String str) {
        return new C26583b(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m136511b() {
        return this.f125863a;
    }

    /* renamed from: c */
    public Annotation m136512c(Class cls) {
        return (Annotation) this.f125864b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26583b)) {
            return false;
        }
        C26583b c26583b = (C26583b) obj;
        if (this.f125863a.equals(c26583b.f125863a) && this.f125864b.equals(c26583b.f125864b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f125863a.hashCode() * 31) + this.f125864b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f125863a + ", properties=" + this.f125864b.values() + "}";
    }

    private C26583b(String str, Map map) {
        this.f125863a = str;
        this.f125864b = map;
    }
}
