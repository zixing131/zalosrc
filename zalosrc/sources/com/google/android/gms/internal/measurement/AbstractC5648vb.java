package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.vb */
/* loaded from: classes.dex */
abstract class AbstractC5648vb {

    /* renamed from: a */
    private static final Unsafe f32854a;

    /* renamed from: b */
    private static final Class f32855b;

    /* renamed from: c */
    private static final boolean f32856c;

    /* renamed from: d */
    private static final AbstractC5631ub f32857d;

    /* renamed from: e */
    private static final boolean f32858e;

    /* renamed from: f */
    private static final boolean f32859f;

    /* renamed from: g */
    static final long f32860g;

    /* renamed from: h */
    static final boolean f32861h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    static {
        boolean z11;
        AbstractC5631ub abstractC5631ub;
        boolean z12;
        Field m29782b;
        AbstractC5631ub abstractC5631ub2;
        Unsafe m29792l = m29792l();
        f32854a = m29792l;
        int i11 = AbstractC5441j8.f32440a;
        f32855b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean m29776A = m29776A(cls);
        f32856c = m29776A;
        boolean m29776A2 = m29776A(Integer.TYPE);
        AbstractC5631ub abstractC5631ub3 = null;
        if (m29792l != null) {
            if (m29776A) {
                abstractC5631ub3 = new C5614tb(m29792l);
            } else if (m29776A2) {
                abstractC5631ub3 = new C5597sb(m29792l);
            }
        }
        f32857d = abstractC5631ub3;
        boolean z13 = true;
        if (abstractC5631ub3 != null) {
            try {
                Class<?> cls2 = abstractC5631ub3.f32840a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th2) {
                m29793m(th2);
            }
            if (m29782b() != null) {
                z11 = true;
                f32858e = z11;
                abstractC5631ub = f32857d;
                if (abstractC5631ub != null) {
                    try {
                        Class<?> cls3 = abstractC5631ub.f32840a.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        Class<?> cls4 = Long.TYPE;
                        cls3.getMethod("getInt", Object.class, cls4);
                        cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                        cls3.getMethod("getLong", Object.class, cls4);
                        cls3.getMethod("putLong", Object.class, cls4, cls4);
                        cls3.getMethod("getObject", Object.class, cls4);
                        cls3.getMethod("putObject", Object.class, cls4, Object.class);
                        z12 = true;
                    } catch (Throwable th3) {
                        m29793m(th3);
                    }
                    f32859f = z12;
                    f32860g = m29780E(byte[].class);
                    m29780E(boolean[].class);
                    m29781a(boolean[].class);
                    m29780E(int[].class);
                    m29781a(int[].class);
                    m29780E(long[].class);
                    m29781a(long[].class);
                    m29780E(float[].class);
                    m29781a(float[].class);
                    m29780E(double[].class);
                    m29781a(double[].class);
                    m29780E(Object[].class);
                    m29781a(Object[].class);
                    m29782b = m29782b();
                    if (m29782b != null && (abstractC5631ub2 = f32857d) != null) {
                        abstractC5631ub2.f32840a.objectFieldOffset(m29782b);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z13 = false;
                    }
                    f32861h = z13;
                }
                z12 = false;
                f32859f = z12;
                f32860g = m29780E(byte[].class);
                m29780E(boolean[].class);
                m29781a(boolean[].class);
                m29780E(int[].class);
                m29781a(int[].class);
                m29780E(long[].class);
                m29781a(long[].class);
                m29780E(float[].class);
                m29781a(float[].class);
                m29780E(double[].class);
                m29781a(double[].class);
                m29780E(Object[].class);
                m29781a(Object[].class);
                m29782b = m29782b();
                if (m29782b != null) {
                    abstractC5631ub2.f32840a.objectFieldOffset(m29782b);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                f32861h = z13;
            }
        }
        z11 = false;
        f32858e = z11;
        abstractC5631ub = f32857d;
        if (abstractC5631ub != null) {
        }
        z12 = false;
        f32859f = z12;
        f32860g = m29780E(byte[].class);
        m29780E(boolean[].class);
        m29781a(boolean[].class);
        m29780E(int[].class);
        m29781a(int[].class);
        m29780E(long[].class);
        m29781a(long[].class);
        m29780E(float[].class);
        m29781a(float[].class);
        m29780E(double[].class);
        m29781a(double[].class);
        m29780E(Object[].class);
        m29781a(Object[].class);
        m29782b = m29782b();
        if (m29782b != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f32861h = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    static boolean m29776A(Class cls) {
        int i11 = AbstractC5441j8.f32440a;
        try {
            Class cls2 = f32855b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static boolean m29777B(Object obj, long j11) {
        return f32857d.mo29602g(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static boolean m29778C() {
        return f32859f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static boolean m29779D() {
        return f32858e;
    }

    /* renamed from: E */
    private static int m29780E(Class cls) {
        if (f32859f) {
            return f32857d.f32840a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m29781a(Class cls) {
        if (f32859f) {
            return f32857d.f32840a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m29782b() {
        int i11 = AbstractC5441j8.f32440a;
        Field m29783c = m29783c(Buffer.class, "effectiveDirectAddress");
        if (m29783c == null) {
            Field m29783c2 = m29783c(Buffer.class, "address");
            if (m29783c2 != null && m29783c2.getType() == Long.TYPE) {
                return m29783c2;
            }
            return null;
        }
        return m29783c;
    }

    /* renamed from: c */
    private static Field m29783c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m29784d(Object obj, long j11, byte b11) {
        AbstractC5631ub abstractC5631ub = f32857d;
        long j12 = (-4) & j11;
        int i11 = abstractC5631ub.f32840a.getInt(obj, j12);
        int i12 = ((~((int) j11)) & 3) << 3;
        abstractC5631ub.f32840a.putInt(obj, j12, ((255 & b11) << i12) | (i11 & (~(255 << i12))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m29785e(Object obj, long j11, byte b11) {
        AbstractC5631ub abstractC5631ub = f32857d;
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        abstractC5631ub.f32840a.putInt(obj, j12, ((255 & b11) << i11) | (abstractC5631ub.f32840a.getInt(obj, j12) & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static double m29786f(Object obj, long j11) {
        return f32857d.mo29596a(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m29787g(Object obj, long j11) {
        return f32857d.mo29597b(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m29788h(Object obj, long j11) {
        return f32857d.f32840a.getInt(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static long m29789i(Object obj, long j11) {
        return f32857d.f32840a.getLong(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Object m29790j(Class cls) {
        try {
            return f32854a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Object m29791k(Object obj, long j11) {
        return f32857d.f32840a.getObject(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Unsafe m29792l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C5580rb());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ void m29793m(Throwable th2) {
        Logger.getLogger(AbstractC5648vb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m29798r(Object obj, long j11, boolean z11) {
        f32857d.mo29598c(obj, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static void m29799s(byte[] bArr, long j11, byte b11) {
        f32857d.mo29599d(bArr, f32860g + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static void m29800t(Object obj, long j11, double d11) {
        f32857d.mo29600e(obj, j11, d11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static void m29801u(Object obj, long j11, float f11) {
        f32857d.mo29601f(obj, j11, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m29802v(Object obj, long j11, int i11) {
        f32857d.f32840a.putInt(obj, j11, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m29803w(Object obj, long j11, long j12) {
        f32857d.f32840a.putLong(obj, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m29804x(Object obj, long j11, Object obj2) {
        f32857d.f32840a.putObject(obj, j11, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m29805y(Object obj, long j11) {
        if (((byte) ((f32857d.f32840a.getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m29806z(Object obj, long j11) {
        if (((byte) ((f32857d.f32840a.getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}
