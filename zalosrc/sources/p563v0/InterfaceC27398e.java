package p563v0;

import java.util.Set;

/* renamed from: v0.e */
/* loaded from: classes2.dex */
public interface InterfaceC27398e {

    /* renamed from: v0.e$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        /* renamed from: a */
        public static a m140358a(String str, Class cls) {
            return m140359b(str, cls, null);
        }

        /* renamed from: b */
        public static a m140359b(String str, Class cls, Object obj) {
            return new C27394a(str, cls, obj);
        }

        /* renamed from: c */
        public abstract String mo140353c();

        /* renamed from: d */
        public abstract Object mo140354d();

        /* renamed from: e */
        public abstract Class mo140355e();
    }

    /* renamed from: v0.e$b */
    /* loaded from: classes2.dex */
    public enum b {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    /* renamed from: b */
    Set mo138726b();

    /* renamed from: d */
    Set mo138727d(a aVar);

    /* renamed from: e */
    Object mo138728e(a aVar, b bVar);

    /* renamed from: f */
    Object mo140357f(a aVar, Object obj);
}
