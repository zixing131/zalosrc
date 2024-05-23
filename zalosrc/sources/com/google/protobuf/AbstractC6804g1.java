package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.g1 */
/* loaded from: classes3.dex */
public abstract class AbstractC6804g1 {

    /* renamed from: a */
    private static final Unsafe f37287a = m34841D();

    /* renamed from: b */
    private static final Class f37288b = AbstractC6793d.m34761b();

    /* renamed from: c */
    private static final boolean f37289c = m34872o(Long.TYPE);

    /* renamed from: d */
    private static final boolean f37290d = m34872o(Integer.TYPE);

    /* renamed from: e */
    private static final e f37291e = m34839B();

    /* renamed from: f */
    private static final boolean f37292f = m34857T();

    /* renamed from: g */
    private static final boolean f37293g = m34856S();

    /* renamed from: h */
    static final long f37294h;

    /* renamed from: i */
    private static final long f37295i;

    /* renamed from: j */
    private static final long f37296j;

    /* renamed from: k */
    private static final long f37297k;

    /* renamed from: l */
    private static final long f37298l;

    /* renamed from: m */
    private static final long f37299m;

    /* renamed from: n */
    private static final long f37300n;

    /* renamed from: o */
    private static final long f37301o;

    /* renamed from: p */
    private static final long f37302p;

    /* renamed from: q */
    private static final long f37303q;

    /* renamed from: r */
    private static final long f37304r;

    /* renamed from: s */
    private static final long f37305s;

    /* renamed from: t */
    private static final long f37306t;

    /* renamed from: u */
    private static final long f37307u;

    /* renamed from: v */
    private static final int f37308v;

    /* renamed from: w */
    static final boolean f37309w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.g1$a */
    /* loaded from: classes3.dex */
    public static class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.g1$b */
    /* loaded from: classes3.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: c */
        public boolean mo34885c(Object obj, long j11) {
            return AbstractC6804g1.f37309w ? AbstractC6804g1.m34876s(obj, j11) : AbstractC6804g1.m34877t(obj, j11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: d */
        public byte mo34886d(Object obj, long j11) {
            return AbstractC6804g1.f37309w ? AbstractC6804g1.m34879v(obj, j11) : AbstractC6804g1.m34880w(obj, j11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: e */
        public double mo34887e(Object obj, long j11) {
            return Double.longBitsToDouble(m34898h(obj, j11));
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: f */
        public float mo34888f(Object obj, long j11) {
            return Float.intBitsToFloat(m34897g(obj, j11));
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: k */
        public void mo34889k(Object obj, long j11, boolean z11) {
            if (AbstractC6804g1.f37309w) {
                AbstractC6804g1.m34846I(obj, j11, z11);
            } else {
                AbstractC6804g1.m34847J(obj, j11, z11);
            }
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: l */
        public void mo34890l(Object obj, long j11, byte b11) {
            if (AbstractC6804g1.f37309w) {
                AbstractC6804g1.m34849L(obj, j11, b11);
            } else {
                AbstractC6804g1.m34850M(obj, j11, b11);
            }
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: m */
        public void mo34891m(Object obj, long j11, double d11) {
            m34902p(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: n */
        public void mo34892n(Object obj, long j11, float f11) {
            m34901o(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: s */
        public boolean mo34893s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.g1$c */
    /* loaded from: classes3.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: c */
        public boolean mo34885c(Object obj, long j11) {
            return AbstractC6804g1.f37309w ? AbstractC6804g1.m34876s(obj, j11) : AbstractC6804g1.m34877t(obj, j11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: d */
        public byte mo34886d(Object obj, long j11) {
            return AbstractC6804g1.f37309w ? AbstractC6804g1.m34879v(obj, j11) : AbstractC6804g1.m34880w(obj, j11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: e */
        public double mo34887e(Object obj, long j11) {
            return Double.longBitsToDouble(m34898h(obj, j11));
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: f */
        public float mo34888f(Object obj, long j11) {
            return Float.intBitsToFloat(m34897g(obj, j11));
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: k */
        public void mo34889k(Object obj, long j11, boolean z11) {
            if (AbstractC6804g1.f37309w) {
                AbstractC6804g1.m34846I(obj, j11, z11);
            } else {
                AbstractC6804g1.m34847J(obj, j11, z11);
            }
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: l */
        public void mo34890l(Object obj, long j11, byte b11) {
            if (AbstractC6804g1.f37309w) {
                AbstractC6804g1.m34849L(obj, j11, b11);
            } else {
                AbstractC6804g1.m34850M(obj, j11, b11);
            }
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: m */
        public void mo34891m(Object obj, long j11, double d11) {
            m34902p(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: n */
        public void mo34892n(Object obj, long j11, float f11) {
            m34901o(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: s */
        public boolean mo34893s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.g1$d */
    /* loaded from: classes3.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: c */
        public boolean mo34885c(Object obj, long j11) {
            return this.f37310a.getBoolean(obj, j11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: d */
        public byte mo34886d(Object obj, long j11) {
            return this.f37310a.getByte(obj, j11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: e */
        public double mo34887e(Object obj, long j11) {
            return this.f37310a.getDouble(obj, j11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: f */
        public float mo34888f(Object obj, long j11) {
            return this.f37310a.getFloat(obj, j11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: k */
        public void mo34889k(Object obj, long j11, boolean z11) {
            this.f37310a.putBoolean(obj, j11, z11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: l */
        public void mo34890l(Object obj, long j11, byte b11) {
            this.f37310a.putByte(obj, j11, b11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: m */
        public void mo34891m(Object obj, long j11, double d11) {
            this.f37310a.putDouble(obj, j11, d11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: n */
        public void mo34892n(Object obj, long j11, float f11) {
            this.f37310a.putFloat(obj, j11, f11);
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: r */
        public boolean mo34894r() {
            if (!super.mo34894r()) {
                return false;
            }
            try {
                Class<?> cls = this.f37310a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                AbstractC6804g1.m34844G(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.AbstractC6804g1.e
        /* renamed from: s */
        public boolean mo34893s() {
            if (!super.mo34893s()) {
                return false;
            }
            try {
                Class<?> cls = this.f37310a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                AbstractC6804g1.m34844G(th2);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.g1$e */
    /* loaded from: classes3.dex */
    public static abstract class e {

        /* renamed from: a */
        Unsafe f37310a;

        e(Unsafe unsafe) {
            this.f37310a = unsafe;
        }

        /* renamed from: a */
        public final int m34895a(Class cls) {
            return this.f37310a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m34896b(Class cls) {
            return this.f37310a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo34885c(Object obj, long j11);

        /* renamed from: d */
        public abstract byte mo34886d(Object obj, long j11);

        /* renamed from: e */
        public abstract double mo34887e(Object obj, long j11);

        /* renamed from: f */
        public abstract float mo34888f(Object obj, long j11);

        /* renamed from: g */
        public final int m34897g(Object obj, long j11) {
            return this.f37310a.getInt(obj, j11);
        }

        /* renamed from: h */
        public final long m34898h(Object obj, long j11) {
            return this.f37310a.getLong(obj, j11);
        }

        /* renamed from: i */
        public final Object m34899i(Object obj, long j11) {
            return this.f37310a.getObject(obj, j11);
        }

        /* renamed from: j */
        public final long m34900j(Field field) {
            return this.f37310a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo34889k(Object obj, long j11, boolean z11);

        /* renamed from: l */
        public abstract void mo34890l(Object obj, long j11, byte b11);

        /* renamed from: m */
        public abstract void mo34891m(Object obj, long j11, double d11);

        /* renamed from: n */
        public abstract void mo34892n(Object obj, long j11, float f11);

        /* renamed from: o */
        public final void m34901o(Object obj, long j11, int i11) {
            this.f37310a.putInt(obj, j11, i11);
        }

        /* renamed from: p */
        public final void m34902p(Object obj, long j11, long j12) {
            this.f37310a.putLong(obj, j11, j12);
        }

        /* renamed from: q */
        public final void m34903q(Object obj, long j11, Object obj2) {
            this.f37310a.putObject(obj, j11, obj2);
        }

        /* renamed from: r */
        public boolean mo34894r() {
            Unsafe unsafe = this.f37310a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                AbstractC6804g1.m34844G(th2);
                return false;
            }
        }

        /* renamed from: s */
        public boolean mo34893s() {
            Unsafe unsafe = this.f37310a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                if (AbstractC6804g1.m34859b() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                AbstractC6804g1.m34844G(th2);
                return false;
            }
        }
    }

    static {
        boolean z11;
        long m34869l = m34869l(byte[].class);
        f37294h = m34869l;
        f37295i = m34869l(boolean[].class);
        f37296j = m34870m(boolean[].class);
        f37297k = m34869l(int[].class);
        f37298l = m34870m(int[].class);
        f37299m = m34869l(long[].class);
        f37300n = m34870m(long[].class);
        f37301o = m34869l(float[].class);
        f37302p = m34870m(float[].class);
        f37303q = m34869l(double[].class);
        f37304r = m34870m(double[].class);
        f37305s = m34869l(Object[].class);
        f37306t = m34870m(Object[].class);
        f37307u = m34874q(m34871n());
        f37308v = (int) (m34869l & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z11 = true;
        } else {
            z11 = false;
        }
        f37309w = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static long m34838A(Object obj, long j11) {
        return f37291e.m34898h(obj, j11);
    }

    /* renamed from: B */
    private static e m34839B() {
        Unsafe unsafe = f37287a;
        if (unsafe == null) {
            return null;
        }
        if (AbstractC6793d.m34762c()) {
            if (f37289c) {
                return new c(unsafe);
            }
            if (!f37290d) {
                return null;
            }
            return new b(unsafe);
        }
        return new d(unsafe);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static Object m34840C(Object obj, long j11) {
        return f37291e.m34899i(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static Unsafe m34841D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static boolean m34842E() {
        return f37293g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static boolean m34843F() {
        return f37292f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static void m34844G(Throwable th2) {
        Logger.getLogger(AbstractC6804g1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static void m34845H(Object obj, long j11, boolean z11) {
        f37291e.mo34889k(obj, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static void m34846I(Object obj, long j11, boolean z11) {
        m34849L(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static void m34847J(Object obj, long j11, boolean z11) {
        m34850M(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static void m34848K(byte[] bArr, long j11, byte b11) {
        f37291e.mo34890l(bArr, f37294h + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static void m34849L(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int m34883z = m34883z(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        m34853P(obj, j12, ((255 & b11) << i11) | (m34883z & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static void m34850M(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        m34853P(obj, j12, ((255 & b11) << i11) | (m34883z(obj, j12) & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static void m34851N(Object obj, long j11, double d11) {
        f37291e.mo34891m(obj, j11, d11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static void m34852O(Object obj, long j11, float f11) {
        f37291e.mo34892n(obj, j11, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static void m34853P(Object obj, long j11, int i11) {
        f37291e.m34901o(obj, j11, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static void m34854Q(Object obj, long j11, long j12) {
        f37291e.m34902p(obj, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static void m34855R(Object obj, long j11, Object obj2) {
        f37291e.m34903q(obj, j11, obj2);
    }

    /* renamed from: S */
    private static boolean m34856S() {
        e eVar = f37291e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo34894r();
    }

    /* renamed from: T */
    private static boolean m34857T() {
        e eVar = f37291e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo34893s();
    }

    /* renamed from: b */
    static /* synthetic */ Field m34859b() {
        return m34871n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Object m34868k(Class cls) {
        try {
            return f37287a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* renamed from: l */
    private static int m34869l(Class cls) {
        if (f37293g) {
            return f37291e.m34895a(cls);
        }
        return -1;
    }

    /* renamed from: m */
    private static int m34870m(Class cls) {
        if (f37293g) {
            return f37291e.m34896b(cls);
        }
        return -1;
    }

    /* renamed from: n */
    private static Field m34871n() {
        Field m34873p;
        if (AbstractC6793d.m34762c() && (m34873p = m34873p(Buffer.class, "effectiveDirectAddress")) != null) {
            return m34873p;
        }
        Field m34873p2 = m34873p(Buffer.class, "address");
        if (m34873p2 == null || m34873p2.getType() != Long.TYPE) {
            return null;
        }
        return m34873p2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    static boolean m34872o(Class cls) {
        if (!AbstractC6793d.m34762c()) {
            return false;
        }
        try {
            Class cls2 = f37288b;
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

    /* renamed from: p */
    private static Field m34873p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    private static long m34874q(Field field) {
        e eVar;
        if (field != null && (eVar = f37291e) != null) {
            return eVar.m34900j(field);
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static boolean m34875r(Object obj, long j11) {
        return f37291e.mo34885c(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static boolean m34876s(Object obj, long j11) {
        if (m34879v(obj, j11) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m34877t(Object obj, long j11) {
        if (m34880w(obj, j11) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static byte m34878u(byte[] bArr, long j11) {
        return f37291e.mo34886d(bArr, f37294h + j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static byte m34879v(Object obj, long j11) {
        return (byte) ((m34883z(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static byte m34880w(Object obj, long j11) {
        return (byte) ((m34883z(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static double m34881x(Object obj, long j11) {
        return f37291e.mo34887e(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static float m34882y(Object obj, long j11) {
        return f37291e.mo34888f(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static int m34883z(Object obj, long j11) {
        return f37291e.m34897g(obj, j11);
    }
}
