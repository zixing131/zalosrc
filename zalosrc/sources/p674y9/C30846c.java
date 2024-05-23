package p674y9;

import ba.AbstractC2669b;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p664y.AbstractC30228a;

/* renamed from: y9.c */
/* loaded from: classes3.dex */
public final class C30846c {

    /* renamed from: a */
    private final Map f142319a;

    /* renamed from: b */
    private final AbstractC2669b f142320b = AbstractC2669b.m13120a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC30852i {
        a() {
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC30852i {
        b() {
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            return new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC30852i {
        c() {
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            return new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC30852i {
        d() {
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            return new C30851h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$e */
    /* loaded from: classes3.dex */
    public class e implements InterfaceC30852i {

        /* renamed from: a */
        private final AbstractC30856m f142325a = AbstractC30856m.m149996b();

        /* renamed from: b */
        final /* synthetic */ Class f142326b;

        /* renamed from: c */
        final /* synthetic */ Type f142327c;

        e(Class cls, Type type) {
            this.f142326b = cls;
            this.f142327c = type;
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            try {
                return this.f142325a.mo149997c(this.f142326b);
            } catch (Exception e11) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f142327c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$f */
    /* loaded from: classes3.dex */
    public class f implements InterfaceC30852i {

        /* renamed from: a */
        final /* synthetic */ Constructor f142329a;

        f(Constructor constructor) {
            this.f142329a = constructor;
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            try {
                return this.f142329a.newInstance(null);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Failed to invoke " + this.f142329a + " with no args", e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke " + this.f142329a + " with no args", e13.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$g */
    /* loaded from: classes3.dex */
    public class g implements InterfaceC30852i {
        g() {
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            return new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$h */
    /* loaded from: classes3.dex */
    public class h implements InterfaceC30852i {

        /* renamed from: a */
        final /* synthetic */ Type f142332a;

        h(Type type) {
            this.f142332a = type;
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            Type type = this.f142332a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f142332a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f142332a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$i */
    /* loaded from: classes3.dex */
    public class i implements InterfaceC30852i {
        i() {
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$j */
    /* loaded from: classes3.dex */
    public class j implements InterfaceC30852i {
        j() {
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            return new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$k */
    /* loaded from: classes3.dex */
    public class k implements InterfaceC30852i {
        k() {
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.c$l */
    /* loaded from: classes3.dex */
    public class l implements InterfaceC30852i {
        l() {
        }

        @Override // p674y9.InterfaceC30852i
        /* renamed from: a */
        public Object mo149955a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C30846c(Map map) {
        this.f142319a = map;
    }

    /* renamed from: b */
    private InterfaceC30852i m149951b(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f142320b.mo13119b(declaredConstructor);
            }
            return new f(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private InterfaceC30852i m149952c(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new g();
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new h(type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new i();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new j();
            }
            return new k();
        }
        if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new l();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new a();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new b();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new c();
            }
            return new d();
        }
        return null;
    }

    /* renamed from: d */
    private InterfaceC30852i m149953d(Type type, Class cls) {
        return new e(cls, type);
    }

    /* renamed from: a */
    public InterfaceC30852i m149954a(TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        AbstractC30228a.m149044a(this.f142319a.get(type));
        AbstractC30228a.m149044a(this.f142319a.get(rawType));
        InterfaceC30852i m149951b = m149951b(rawType);
        if (m149951b != null) {
            return m149951b;
        }
        InterfaceC30852i m149952c = m149952c(type, rawType);
        if (m149952c != null) {
            return m149952c;
        }
        return m149953d(type, rawType);
    }

    public String toString() {
        return this.f142319a.toString();
    }
}
