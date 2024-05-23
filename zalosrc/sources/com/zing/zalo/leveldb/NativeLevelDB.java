package com.zing.zalo.leveldb;

import com.zing.zalo.leveldb.AbstractC8942a;
import com.zing.zalo.leveldb.exception.LevelDBException;
import com.zing.zalo.leveldb.exception.LevelDBNotFoundException;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p657xt.C30203a;

/* loaded from: classes.dex */
public final class NativeLevelDB extends AbstractC8942a {
    public static final C8941a Companion = new C8941a(null);

    /* renamed from: q */
    private long f47755q;

    /* renamed from: r */
    private String f47756r;

    /* renamed from: s */
    private AbstractC8942a.b f47757s;

    /* renamed from: com.zing.zalo.leveldb.NativeLevelDB$a */
    /* loaded from: classes.dex */
    public static final class C8941a {
        private C8941a() {
        }

        public /* synthetic */ C8941a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        private final boolean m47693c(String str) {
            return NativeLevelDB.nativeDestroy(str);
        }

        /* renamed from: d */
        public final long m47694d(boolean z11, int i11, byte[] bArr, byte[] bArr2, String str) {
            return NativeLevelDB.nativeOpen(z11, i11, bArr, bArr2, str);
        }

        /* renamed from: e */
        private final boolean m47695e(String str, byte[] bArr, byte[] bArr2) {
            return NativeLevelDB.nativeRepair(str, bArr, bArr2);
        }

        /* renamed from: b */
        public final boolean m47696b(String str) {
            AbstractC19074t.m100208f(str, "path");
            try {
                return m47693c(str);
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }

        /* renamed from: f */
        public final boolean m47697f(String str, byte[] bArr, byte[] bArr2) {
            AbstractC19074t.m100208f(str, "path");
            try {
                return m47695e(str, bArr, bArr2);
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
    }

    public NativeLevelDB(String str, AbstractC8942a.b bVar) {
        m47679M(str, bVar);
    }

    private final native int nativeClose(long j11);

    private final native void nativeCloseIterator(long j11);

    private final native int nativeDelete(long j11, byte[] bArr, boolean z11) throws LevelDBException;

    public static final native boolean nativeDestroy(String str) throws LevelDBException;

    private final native byte[] nativeGet(long j11, byte[] bArr, boolean z11, boolean z12, byte[] bArr2, byte[] bArr3) throws LevelDBException;

    private final native byte[] nativeGetKey(long j11);

    private final native byte[] nativeGetValue(long j11);

    private final native long nativeIterator(long j11, byte[] bArr, byte[] bArr2);

    private final native void nativeNext(long j11);

    public static final native long nativeOpen(boolean z11, int i11, byte[] bArr, byte[] bArr2, String str) throws LevelDBException;

    private final native int nativePut(long j11, byte[] bArr, byte[] bArr2, boolean z11) throws LevelDBException;

    public static final native boolean nativeRepair(String str, byte[] bArr, byte[] bArr2);

    private final native void nativeSeekToFirst(long j11);

    private final native boolean nativeValid(long j11);

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: E */
    public void mo47676E(C30203a c30203a) {
        if (c30203a != null) {
            nativeSeekToFirst(c30203a.m148955b());
            return;
        }
        throw new LevelDBNotFoundException("iterator is null");
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: F */
    public boolean mo47677F(C30203a c30203a) {
        if (c30203a != null) {
            return nativeValid(c30203a.m148955b());
        }
        throw new LevelDBNotFoundException("iterator is null");
    }

    /* renamed from: L */
    public AbstractC8942a.b m47678L() {
        return this.f47757s;
    }

    /* renamed from: M */
    public final void m47679M(String str, AbstractC8942a.b bVar) {
        if (bVar == null) {
            bVar = AbstractC8942a.Companion.m47704a();
        }
        m47680N(bVar);
        m47681O(str);
        C8941a c8941a = Companion;
        AbstractC8942a.b m47678L = m47678L();
        AbstractC19074t.m100205c(m47678L);
        boolean m47710b = m47678L.m47710b();
        AbstractC8942a.b m47678L2 = m47678L();
        AbstractC19074t.m100205c(m47678L2);
        int m47717c = m47678L2.m47712d().m47717c();
        AbstractC8942a.b m47678L3 = m47678L();
        AbstractC19074t.m100205c(m47678L3);
        byte[] m47713e = m47678L3.m47713e();
        AbstractC8942a.b m47678L4 = m47678L();
        AbstractC19074t.m100205c(m47678L4);
        this.f47755q = c8941a.m47694d(m47710b, m47717c, m47713e, m47678L4.m47711c(), str);
    }

    /* renamed from: N */
    public void m47680N(AbstractC8942a.b bVar) {
        this.f47757s = bVar;
    }

    /* renamed from: O */
    protected void m47681O(String str) {
        this.f47756r = str;
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: b */
    public void mo47682b(C30203a c30203a) {
        if (c30203a != null) {
            nativeCloseIterator(c30203a.m148955b());
            return;
        }
        throw new LevelDBNotFoundException("iterator is null");
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j11 = this.f47755q;
        if (j11 != 0) {
            nativeClose(j11);
            this.f47755q = 0L;
        }
        super.close();
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: d */
    public boolean mo47683d(String str) {
        long j11 = this.f47755q;
        if (j11 != 0) {
            if (str == null) {
                return false;
            }
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            byte[] bytes = str.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "(this as java.lang.String).getBytes(charset)");
            if (nativeDelete(j11, bytes, false) != 0) {
                return false;
            }
            return true;
        }
        throw new LevelDBNotFoundException("nativePointer is null ,leveldb have to open LevelDB first.");
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: h */
    public byte[] mo47684h(String str) {
        AbstractC19074t.m100208f(str, "key");
        Charset charset = StandardCharsets.UTF_8;
        AbstractC19074t.m100207e(charset, "UTF_8");
        byte[] bytes = str.getBytes(charset);
        AbstractC19074t.m100207e(bytes, "(this as java.lang.String).getBytes(charset)");
        return mo47685i(bytes);
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: i */
    public byte[] mo47685i(byte[] bArr) {
        if (this.f47755q != 0) {
            if (bArr == null || m47678L() == null) {
                return null;
            }
            long j11 = this.f47755q;
            AbstractC8942a.b m47678L = m47678L();
            AbstractC19074t.m100205c(m47678L);
            byte[] m47713e = m47678L.m47713e();
            AbstractC8942a.b m47678L2 = m47678L();
            AbstractC19074t.m100205c(m47678L2);
            return nativeGet(j11, bArr, false, true, m47713e, m47678L2.m47711c());
        }
        throw new LevelDBNotFoundException("nativePointer is null ,leveldb have to open LevelDB first.");
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: m */
    public String mo47686m() {
        return this.f47756r;
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: o */
    public C30203a mo47687o() {
        long j11 = this.f47755q;
        if (j11 != 0) {
            AbstractC8942a.b m47678L = m47678L();
            AbstractC19074t.m100205c(m47678L);
            byte[] m47713e = m47678L.m47713e();
            AbstractC8942a.b m47678L2 = m47678L();
            AbstractC19074t.m100205c(m47678L2);
            return new C30203a(this, nativeIterator(j11, m47713e, m47678L2.m47711c()));
        }
        throw new LevelDBNotFoundException("nativePointer is null ,leveldb have to open LevelDB first.");
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: q */
    public byte[] mo47688q(C30203a c30203a) {
        if (c30203a != null) {
            return nativeGetKey(c30203a.m148955b());
        }
        throw new LevelDBNotFoundException("iterator is null");
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: r */
    public byte[] mo47689r(C30203a c30203a) {
        if (c30203a != null) {
            return nativeGetValue(c30203a.m148955b());
        }
        throw new LevelDBNotFoundException("iterator is null");
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: s */
    public void mo47690s(C30203a c30203a) {
        if (c30203a != null) {
            nativeNext(c30203a.m148955b());
            return;
        }
        throw new LevelDBNotFoundException("iterator is null");
    }

    @Override // com.zing.zalo.leveldb.AbstractC8942a
    /* renamed from: y */
    public boolean mo47691y(String str, byte[] bArr, boolean z11) {
        long j11 = this.f47755q;
        if (j11 != 0) {
            if (str == null || bArr == null) {
                return false;
            }
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            byte[] bytes = str.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "(this as java.lang.String).getBytes(charset)");
            if (nativePut(j11, bytes, bArr, false) != 0) {
                return false;
            }
            return true;
        }
        throw new LevelDBNotFoundException("nativePointer is null ,leveldb have to open LevelDB first.");
    }
}
