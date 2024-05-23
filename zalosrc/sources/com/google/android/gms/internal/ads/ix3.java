package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class ix3 {

    /* renamed from: a */
    private static final Unsafe f22540a;

    /* renamed from: b */
    private static final Class f22541b;

    /* renamed from: c */
    private static final boolean f22542c;

    /* renamed from: d */
    private static final hx3 f22543d;

    /* renamed from: e */
    private static final boolean f22544e;

    /* renamed from: f */
    private static final boolean f22545f;

    /* renamed from: g */
    static final long f22546g;

    /* renamed from: h */
    private static final long f22547h;

    /* renamed from: i */
    static final boolean f22548i;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    static {
        boolean z11;
        hx3 hx3Var;
        boolean z12;
        Field m23443e;
        long j11;
        hx3 hx3Var2;
        Unsafe m23455q = m23455q();
        f22540a = m23455q;
        f22541b = xs3.m28007a();
        Class<?> cls = Long.TYPE;
        boolean m23437G = m23437G(cls);
        f22542c = m23437G;
        boolean m23437G2 = m23437G(Integer.TYPE);
        hx3 hx3Var3 = null;
        if (m23455q != null) {
            if (m23437G) {
                hx3Var3 = new gx3(m23455q);
            } else if (m23437G2) {
                hx3Var3 = new fx3(m23455q);
            }
        }
        f22543d = hx3Var3;
        boolean z13 = true;
        if (hx3Var3 != null) {
            try {
                Class<?> cls2 = hx3Var3.f21950a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th2) {
                m23456r(th2);
            }
            if (m23443e() != null) {
                z11 = true;
                f22544e = z11;
                hx3Var = f22543d;
                if (hx3Var != null) {
                    try {
                        Class<?> cls3 = hx3Var.f21950a.getClass();
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
                        m23456r(th3);
                    }
                    f22545f = z12;
                    f22546g = m23441c(byte[].class);
                    m23441c(boolean[].class);
                    m23442d(boolean[].class);
                    m23441c(int[].class);
                    m23442d(int[].class);
                    m23441c(long[].class);
                    m23442d(long[].class);
                    m23441c(float[].class);
                    m23442d(float[].class);
                    m23441c(double[].class);
                    m23442d(double[].class);
                    m23441c(Object[].class);
                    m23442d(Object[].class);
                    m23443e = m23443e();
                    j11 = -1;
                    if (m23443e != null && (hx3Var2 = f22543d) != null) {
                        j11 = hx3Var2.m23073n(m23443e);
                    }
                    f22547h = j11;
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z13 = false;
                    }
                    f22548i = z13;
                }
                z12 = false;
                f22545f = z12;
                f22546g = m23441c(byte[].class);
                m23441c(boolean[].class);
                m23442d(boolean[].class);
                m23441c(int[].class);
                m23442d(int[].class);
                m23441c(long[].class);
                m23442d(long[].class);
                m23441c(float[].class);
                m23442d(float[].class);
                m23441c(double[].class);
                m23442d(double[].class);
                m23441c(Object[].class);
                m23442d(Object[].class);
                m23443e = m23443e();
                j11 = -1;
                if (m23443e != null) {
                    j11 = hx3Var2.m23073n(m23443e);
                }
                f22547h = j11;
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                f22548i = z13;
            }
        }
        z11 = false;
        f22544e = z11;
        hx3Var = f22543d;
        if (hx3Var != null) {
        }
        z12 = false;
        f22545f = z12;
        f22546g = m23441c(byte[].class);
        m23441c(boolean[].class);
        m23442d(boolean[].class);
        m23441c(int[].class);
        m23442d(int[].class);
        m23441c(long[].class);
        m23442d(long[].class);
        m23441c(float[].class);
        m23442d(float[].class);
        m23441c(double[].class);
        m23442d(double[].class);
        m23441c(Object[].class);
        m23442d(Object[].class);
        m23443e = m23443e();
        j11 = -1;
        if (m23443e != null) {
        }
        f22547h = j11;
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f22548i = z13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static void m23431A(Object obj, long j11, float f11) {
        f22543d.mo22208h(obj, j11, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static void m23432B(Object obj, long j11, int i11) {
        f22543d.m23075p(obj, j11, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static void m23433C(Object obj, long j11, long j12) {
        f22543d.m23076q(obj, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static void m23434D(Object obj, long j11, Object obj2) {
        f22543d.m23077r(obj, j11, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* bridge */ /* synthetic */ boolean m23435E(Object obj, long j11) {
        if (((byte) ((f22543d.m23071l(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* bridge */ /* synthetic */ boolean m23436F(Object obj, long j11) {
        if (((byte) ((f22543d.m23071l(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    static boolean m23437G(Class cls) {
        int i11 = xs3.f30618a;
        try {
            Class cls2 = f22541b;
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
    /* renamed from: H */
    public static boolean m23438H(Object obj, long j11) {
        return f22543d.mo22209i(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m23439a() {
        return f22545f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m23440b() {
        return f22544e;
    }

    /* renamed from: c */
    private static int m23441c(Class cls) {
        if (f22545f) {
            return f22543d.m23069j(cls);
        }
        return -1;
    }

    /* renamed from: d */
    private static int m23442d(Class cls) {
        if (f22545f) {
            return f22543d.m23070k(cls);
        }
        return -1;
    }

    /* renamed from: e */
    private static Field m23443e() {
        int i11 = xs3.f30618a;
        Field m23444f = m23444f(Buffer.class, "effectiveDirectAddress");
        if (m23444f == null) {
            Field m23444f2 = m23444f(Buffer.class, "address");
            if (m23444f2 != null && m23444f2.getType() == Long.TYPE) {
                return m23444f2;
            }
            return null;
        }
        return m23444f;
    }

    /* renamed from: f */
    private static Field m23444f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static void m23445g(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        hx3 hx3Var = f22543d;
        int m23071l = hx3Var.m23071l(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        hx3Var.m23075p(obj, j12, ((255 & b11) << i11) | (m23071l & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static void m23446h(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        hx3 hx3Var = f22543d;
        int i11 = (((int) j11) & 3) << 3;
        hx3Var.m23075p(obj, j12, ((255 & b11) << i11) | (hx3Var.m23071l(obj, j12) & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static byte m23447i(long j11) {
        return f22543d.mo22201a(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static double m23448j(Object obj, long j11) {
        return f22543d.mo22202b(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static float m23449k(Object obj, long j11) {
        return f22543d.mo22203c(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m23450l(Object obj, long j11) {
        return f22543d.m23071l(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static long m23451m(ByteBuffer byteBuffer) {
        return f22543d.m23072m(byteBuffer, f22547h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static long m23452n(Object obj, long j11) {
        return f22543d.m23072m(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static Object m23453o(Class cls) {
        try {
            return f22540a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static Object m23454p(Object obj, long j11) {
        return f22543d.m23074o(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static Unsafe m23455q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ex3());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static /* bridge */ /* synthetic */ void m23456r(Throwable th2) {
        Logger.getLogger(ix3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m23461w(long j11, byte[] bArr, long j12, long j13) {
        f22543d.mo22204d(j11, bArr, j12, j13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m23462x(Object obj, long j11, boolean z11) {
        f22543d.mo22205e(obj, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static void m23463y(byte[] bArr, long j11, byte b11) {
        f22543d.mo22206f(bArr, f22546g + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static void m23464z(Object obj, long j11, double d11) {
        f22543d.mo22207g(obj, j11, d11);
    }
}
