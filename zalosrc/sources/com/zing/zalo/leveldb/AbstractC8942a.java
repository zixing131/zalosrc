package com.zing.zalo.leveldb;

import com.zing.zalo.leveldb.exception.LevelDBInvalidArgumentException;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import p657xt.C30203a;
import pm0.C24848g0;

/* renamed from: com.zing.zalo.leveldb.a */
/* loaded from: classes.dex */
public abstract class AbstractC8942a implements Closeable {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private static final HashMap f47758p = new HashMap();

    /* renamed from: com.zing.zalo.leveldb.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final b m47704a() {
            return new b();
        }

        /* renamed from: b */
        public final boolean m47705b(String str) {
            AbstractC19074t.m100208f(str, "path");
            if (str.length() > 0) {
                return NativeLevelDB.Companion.m47696b(str);
            }
            return false;
        }

        /* renamed from: c */
        public final AbstractC8942a m47706c(String str, b bVar) {
            Object obj;
            AbstractC19074t.m100208f(str, "path");
            synchronized (AbstractC8942a.f47758p) {
                try {
                    if (AbstractC8942a.f47758p.containsKey(str)) {
                        obj = AbstractC8942a.f47758p.get(str);
                        AbstractC19074t.m100205c(obj);
                        AbstractC19074t.m100207e(obj, "instanceDb[path]!!");
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } else {
                        NativeLevelDB nativeLevelDB = new NativeLevelDB(str, bVar);
                        AbstractC8942a.f47758p.put(str, nativeLevelDB);
                        obj = nativeLevelDB;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (AbstractC8942a) obj;
        }

        /* renamed from: d */
        public final boolean m47707d(String str, b bVar) {
            AbstractC19074t.m100208f(str, "path");
            AbstractC19074t.m100208f(bVar, "configuration");
            if (str.length() > 0) {
                return NativeLevelDB.Companion.m47697f(str, bVar.m47713e(), bVar.m47711c());
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.leveldb.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private boolean f47759a = true;

        /* renamed from: b */
        private EnumC32711b f47760b = EnumC32711b.kSnappyCompression;

        /* renamed from: c */
        private String f47761c;

        /* renamed from: d */
        private String f47762d;

        /* renamed from: com.zing.zalo.leveldb.a$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: com.zing.zalo.leveldb.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC32711b {
            kNoCompression(0),
            kSnappyCompression(1),
            kSnappyCompressionAndAesEncrypt(127),
            kAesEncryptNoCompress(126);


            /* renamed from: p */
            private final int f47768p;

            EnumC32711b(int i11) {
                this.f47768p = i11;
            }

            /* renamed from: c */
            public final int m47717c() {
                return this.f47768p;
            }
        }

        /* renamed from: h */
        private final void m47708h(String str) {
            if (str != null && str.length() >= 16) {
                this.f47761c = str;
                return;
            }
            throw new LevelDBInvalidArgumentException("IVKey cannot null and have to greater than or equal to 16 bytes");
        }

        /* renamed from: a */
        public final b m47709a(boolean z11) {
            this.f47759a = z11;
            return this;
        }

        /* renamed from: b */
        public final boolean m47710b() {
            return this.f47759a;
        }

        /* renamed from: c */
        public final byte[] m47711c() {
            String str = this.f47762d;
            if (str == null) {
                return null;
            }
            AbstractC19074t.m100205c(str);
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                AbstractC19074t.m100207e(bytes, "(this as java.lang.String).getBytes(charset)");
                return bytes;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: d */
        public final EnumC32711b m47712d() {
            if (this.f47760b == null) {
                this.f47760b = EnumC32711b.kSnappyCompression;
            }
            EnumC32711b enumC32711b = this.f47760b;
            AbstractC19074t.m100205c(enumC32711b);
            return enumC32711b;
        }

        /* renamed from: e */
        public final byte[] m47713e() {
            String str = this.f47761c;
            if (str == null) {
                return null;
            }
            AbstractC19074t.m100205c(str);
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                AbstractC19074t.m100207e(bytes, "(this as java.lang.String).getBytes(charset)");
                return bytes;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: f */
        public final void m47714f(String str) {
            if (str != null && str.length() >= 32) {
                this.f47762d = str;
                String substring = str.substring(0, 16);
                AbstractC19074t.m100207e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                m47708h(substring);
                return;
            }
            throw new LevelDBInvalidArgumentException("AesKey cannot null and have to greater than or equal to 32 bytes");
        }

        /* renamed from: g */
        public final void m47715g(EnumC32711b enumC32711b) {
            this.f47760b = enumC32711b;
        }
    }

    /* renamed from: A */
    public static final boolean m47698A(String str, b bVar) {
        return Companion.m47707d(str, bVar);
    }

    /* renamed from: c */
    public static final b m47700c() {
        return Companion.m47704a();
    }

    /* renamed from: f */
    public static final boolean m47701f(String str) {
        return Companion.m47705b(str);
    }

    /* renamed from: t */
    public static final AbstractC8942a m47702t(String str, b bVar) {
        return Companion.m47706c(str, bVar);
    }

    /* renamed from: E */
    public abstract void mo47676E(C30203a c30203a);

    /* renamed from: F */
    public abstract boolean mo47677F(C30203a c30203a);

    /* renamed from: b */
    public abstract void mo47682b(C30203a c30203a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HashMap hashMap = f47758p;
        synchronized (hashMap) {
            NativeLevelDB nativeLevelDB = (NativeLevelDB) hashMap.remove(mo47686m());
            if (nativeLevelDB != null) {
                nativeLevelDB.close();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: d */
    public abstract boolean mo47683d(String str);

    /* renamed from: h */
    public abstract byte[] mo47684h(String str);

    /* renamed from: i */
    public abstract byte[] mo47685i(byte[] bArr);

    /* renamed from: m */
    public abstract String mo47686m();

    /* renamed from: o */
    public abstract C30203a mo47687o();

    /* renamed from: q */
    public abstract byte[] mo47688q(C30203a c30203a);

    /* renamed from: r */
    public abstract byte[] mo47689r(C30203a c30203a);

    /* renamed from: s */
    public abstract void mo47690s(C30203a c30203a);

    /* renamed from: v */
    public final void m47703v(String str, byte[] bArr) {
        mo47691y(str, bArr, false);
    }

    /* renamed from: y */
    public abstract boolean mo47691y(String str, byte[] bArr, boolean z11);
}
