package p008a2;

import android.content.Context;
import fn0.AbstractC19074t;
import on0.AbstractC24341v;
import p008a2.AbstractC0086w;

/* renamed from: a2.v */
/* loaded from: classes.dex */
public final class C0085v {

    /* renamed from: a */
    public static final C0085v f367a = new C0085v();

    private C0085v() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC0086w.a m327a(Context context, Class cls, String str) {
        boolean z11;
        boolean m127128x;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(cls, "klass");
        if (str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                z11 = false;
                if (!(true ^ z11)) {
                    return new AbstractC0086w.a(context, cls, str);
                }
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
            }
        }
        z11 = true;
        if (!(true ^ z11)) {
        }
    }

    /* renamed from: b */
    public static final Object m328b(Class cls, String str) {
        String m127113C;
        String str2;
        AbstractC19074t.m100208f(cls, "klass");
        AbstractC19074t.m100208f(str, "suffix");
        Package r12 = cls.getPackage();
        AbstractC19074t.m100205c(r12);
        String name = r12.getName();
        String canonicalName = cls.getCanonicalName();
        AbstractC19074t.m100205c(canonicalName);
        AbstractC19074t.m100207e(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            AbstractC19074t.m100207e(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = canonicalName;
        StringBuilder sb2 = new StringBuilder();
        m127113C = AbstractC24341v.m127113C(str3, '.', '_', false, 4, null);
        sb2.append(m127113C);
        sb2.append(str);
        String sb3 = sb2.toString();
        try {
            if (name.length() == 0) {
                str2 = sb3;
            } else {
                str2 = name + '.' + sb3;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            AbstractC19074t.m100206d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + sb3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    /* renamed from: c */
    public static final AbstractC0086w.a m329c(Context context, Class cls) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(cls, "klass");
        return new AbstractC0086w.a(context, cls, null);
    }
}
