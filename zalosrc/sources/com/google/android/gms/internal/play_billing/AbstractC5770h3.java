package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.h3 */
/* loaded from: classes2.dex */
abstract class AbstractC5770h3 {

    /* renamed from: a */
    private static final Unsafe f33325a;

    /* renamed from: b */
    private static final Class f33326b;

    /* renamed from: c */
    private static final boolean f33327c;

    /* renamed from: d */
    private static final AbstractC5764g3 f33328d;

    /* renamed from: e */
    private static final boolean f33329e;

    /* renamed from: f */
    private static final boolean f33330f;

    /* renamed from: g */
    static final long f33331g;

    /* renamed from: h */
    static final boolean f33332h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    static {
        boolean z11;
        AbstractC5764g3 abstractC5764g3;
        boolean z12;
        Field m30249b;
        AbstractC5764g3 abstractC5764g32;
        Unsafe m30259l = m30259l();
        f33325a = m30259l;
        int i11 = AbstractC5722a0.f33231a;
        f33326b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean m30243A = m30243A(cls);
        f33327c = m30243A;
        boolean m30243A2 = m30243A(Integer.TYPE);
        AbstractC5764g3 abstractC5764g33 = null;
        if (m30259l != null) {
            if (m30243A) {
                abstractC5764g33 = new C5758f3(m30259l);
            } else if (m30243A2) {
                abstractC5764g33 = new C5752e3(m30259l);
            }
        }
        f33328d = abstractC5764g33;
        boolean z13 = true;
        if (abstractC5764g33 != null) {
            try {
                Class<?> cls2 = abstractC5764g33.f33321a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th2) {
                m30260m(th2);
            }
            if (m30249b() != null) {
                z11 = true;
                f33329e = z11;
                abstractC5764g3 = f33328d;
                if (abstractC5764g3 != null) {
                    try {
                        Class<?> cls3 = abstractC5764g3.f33321a.getClass();
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
                        m30260m(th3);
                    }
                    f33330f = z12;
                    f33331g = m30247E(byte[].class);
                    m30247E(boolean[].class);
                    m30248a(boolean[].class);
                    m30247E(int[].class);
                    m30248a(int[].class);
                    m30247E(long[].class);
                    m30248a(long[].class);
                    m30247E(float[].class);
                    m30248a(float[].class);
                    m30247E(double[].class);
                    m30248a(double[].class);
                    m30247E(Object[].class);
                    m30248a(Object[].class);
                    m30249b = m30249b();
                    if (m30249b != null && (abstractC5764g32 = f33328d) != null) {
                        abstractC5764g32.f33321a.objectFieldOffset(m30249b);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z13 = false;
                    }
                    f33332h = z13;
                }
                z12 = false;
                f33330f = z12;
                f33331g = m30247E(byte[].class);
                m30247E(boolean[].class);
                m30248a(boolean[].class);
                m30247E(int[].class);
                m30248a(int[].class);
                m30247E(long[].class);
                m30248a(long[].class);
                m30247E(float[].class);
                m30248a(float[].class);
                m30247E(double[].class);
                m30248a(double[].class);
                m30247E(Object[].class);
                m30248a(Object[].class);
                m30249b = m30249b();
                if (m30249b != null) {
                    abstractC5764g32.f33321a.objectFieldOffset(m30249b);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                f33332h = z13;
            }
        }
        z11 = false;
        f33329e = z11;
        abstractC5764g3 = f33328d;
        if (abstractC5764g3 != null) {
        }
        z12 = false;
        f33330f = z12;
        f33331g = m30247E(byte[].class);
        m30247E(boolean[].class);
        m30248a(boolean[].class);
        m30247E(int[].class);
        m30248a(int[].class);
        m30247E(long[].class);
        m30248a(long[].class);
        m30247E(float[].class);
        m30248a(float[].class);
        m30247E(double[].class);
        m30248a(double[].class);
        m30247E(Object[].class);
        m30248a(Object[].class);
        m30249b = m30249b();
        if (m30249b != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f33332h = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    static boolean m30243A(Class cls) {
        int i11 = AbstractC5722a0.f33231a;
        try {
            Class cls2 = f33326b;
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
    public static boolean m30244B(Object obj, long j11) {
        return f33328d.mo30218g(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static boolean m30245C() {
        return f33330f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static boolean m30246D() {
        return f33329e;
    }

    /* renamed from: E */
    private static int m30247E(Class cls) {
        if (f33330f) {
            return f33328d.f33321a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m30248a(Class cls) {
        if (f33330f) {
            return f33328d.f33321a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m30249b() {
        int i11 = AbstractC5722a0.f33231a;
        Field m30250c = m30250c(Buffer.class, "effectiveDirectAddress");
        if (m30250c == null) {
            Field m30250c2 = m30250c(Buffer.class, "address");
            if (m30250c2 != null && m30250c2.getType() == Long.TYPE) {
                return m30250c2;
            }
            return null;
        }
        return m30250c;
    }

    /* renamed from: c */
    private static Field m30250c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m30251d(Object obj, long j11, byte b11) {
        AbstractC5764g3 abstractC5764g3 = f33328d;
        long j12 = (-4) & j11;
        int i11 = abstractC5764g3.f33321a.getInt(obj, j12);
        int i12 = ((~((int) j11)) & 3) << 3;
        abstractC5764g3.f33321a.putInt(obj, j12, ((255 & b11) << i12) | (i11 & (~(255 << i12))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m30252e(Object obj, long j11, byte b11) {
        AbstractC5764g3 abstractC5764g3 = f33328d;
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        abstractC5764g3.f33321a.putInt(obj, j12, ((255 & b11) << i11) | (abstractC5764g3.f33321a.getInt(obj, j12) & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static double m30253f(Object obj, long j11) {
        return f33328d.mo30212a(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m30254g(Object obj, long j11) {
        return f33328d.mo30213b(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m30255h(Object obj, long j11) {
        return f33328d.f33321a.getInt(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static long m30256i(Object obj, long j11) {
        return f33328d.f33321a.getLong(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Object m30257j(Class cls) {
        try {
            return f33325a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Object m30258k(Object obj, long j11) {
        return f33328d.f33321a.getObject(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Unsafe m30259l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C5746d3());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ void m30260m(Throwable th2) {
        Logger.getLogger(AbstractC5770h3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m30265r(Object obj, long j11, boolean z11) {
        f33328d.mo30214c(obj, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static void m30266s(byte[] bArr, long j11, byte b11) {
        f33328d.mo30215d(bArr, f33331g + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static void m30267t(Object obj, long j11, double d11) {
        f33328d.mo30216e(obj, j11, d11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static void m30268u(Object obj, long j11, float f11) {
        f33328d.mo30217f(obj, j11, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m30269v(Object obj, long j11, int i11) {
        f33328d.f33321a.putInt(obj, j11, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m30270w(Object obj, long j11, long j12) {
        f33328d.f33321a.putLong(obj, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m30271x(Object obj, long j11, Object obj2) {
        f33328d.f33321a.putObject(obj, j11, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m30272y(Object obj, long j11) {
        if (((byte) ((f33328d.f33321a.getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m30273z(Object obj, long j11) {
        if (((byte) ((f33328d.f33321a.getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}
