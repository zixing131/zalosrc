package com.zing.zalo.preferences;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.zing.zalo.leveldb.AbstractC8942a;
import com.zing.zalo.leveldb.exception.LevelDBCorruptionException;
import com.zing.zalo.leveldb.exception.LevelDBException;
import com.zing.zalo.leveldb.exception.LevelDBIOException;
import com.zing.zalo.leveldb.exception.LevelDBInvalidArgumentException;
import com.zing.zalo.leveldb.exception.LevelDBNotFoundException;
import com.zing.zalo.preferences.IPreferences;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import lm0.InterfaceC22529a;
import me0.AbstractC23041d2;
import me0.AbstractC23044d5;
import me0.AbstractC23133l6;
import mm0.AbstractC23352g;
import p657xt.C30203a;
import p657xt.C30204b;

/* renamed from: com.zing.zalo.preferences.b */
/* loaded from: classes.dex */
public class C9050b implements IPreferences {

    /* renamed from: a */
    private AbstractC8942a f48493a;

    /* renamed from: b */
    private final AbstractC8942a.b f48494b;

    /* renamed from: c */
    private final String f48495c;

    /* renamed from: d */
    private final AtomicBoolean f48496d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.preferences.b$a */
    /* loaded from: classes4.dex */
    public static class a extends LevelDBException {
        a(String str) {
            super(str);
        }
    }

    private C9050b(AbstractC8942a.b bVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f48494b = bVar;
            this.f48495c = str;
            this.f48496d = new AtomicBoolean(false);
            m48456o();
            return;
        }
        throw new a("Db path and Configuration cannot be empty!");
    }

    /* renamed from: A */
    private static byte[] m48451A(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(4);
        try {
            byteArrayOutputStream.write(bytes);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            AbstractC20110a.m104539h(e11);
            throw new a("io exception");
        }
    }

    /* renamed from: j */
    private void m48452j() {
        try {
            AbstractC8942a abstractC8942a = this.f48493a;
            if (abstractC8942a != null) {
                abstractC8942a.close();
                this.f48493a = null;
            }
        } catch (IOException e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: k */
    private boolean m48453k() {
        try {
            return AbstractC8942a.m47701f(this.f48495c);
        } catch (LevelDBException e11) {
            AbstractC23041d2.m118210i(new File(this.f48495c));
            AbstractC20110a.m104539h(e11);
            InterfaceC22529a interfaceC22529a = CoreUtility.f89243s;
            if (interfaceC22529a != null) {
                interfaceC22529a.mo109250b(100007);
                CoreUtility.f89243s.mo109249a(100007, "Destroy Exception - " + e11);
                return false;
            }
            return false;
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
            return false;
        }
    }

    /* renamed from: m */
    private void m48454m(LevelDBException levelDBException) {
        if (levelDBException instanceof LevelDBNotFoundException) {
            return;
        }
        AbstractC20110a.m104539h(levelDBException);
        boolean z11 = this.f48496d.get();
        if ((levelDBException.isRepairCorruption(levelDBException.getMessage()) || (levelDBException instanceof LevelDBCorruptionException)) && this.f48496d.compareAndSet(false, true)) {
            m48462u(true);
        }
        InterfaceC22529a interfaceC22529a = CoreUtility.f89243s;
        if (interfaceC22529a != null) {
            if (levelDBException instanceof LevelDBInvalidArgumentException) {
                interfaceC22529a.mo109250b(100011);
                CoreUtility.f89243s.mo109249a(100011, "Invalid Exception - " + levelDBException);
                return;
            }
            if (levelDBException instanceof LevelDBCorruptionException) {
                if (z11) {
                    interfaceC22529a.mo109250b(100010);
                    CoreUtility.f89243s.mo109249a(100010, "Corruption Exception - " + levelDBException);
                    return;
                }
                return;
            }
            if (levelDBException instanceof LevelDBIOException) {
                interfaceC22529a.mo109250b(100008);
                CoreUtility.f89243s.mo109249a(100008, "IO Exception - " + levelDBException);
            }
        }
    }

    /* renamed from: n */
    public static C9050b m48455n(String str, String str2) {
        Context appContext = CoreUtility.getAppContext();
        EnumC16739a enumC16739a = EnumC16739a.f84888e0;
        AbstractC23044d5.m118231d(appContext, enumC16739a);
        if (AbstractC23044d5.m118229b(enumC16739a)) {
            AbstractC8942a.b m47700c = AbstractC8942a.m47700c();
            m47700c.m47709a(true);
            m47700c.m47715g(AbstractC8942a.b.EnumC32711b.kSnappyCompressionAndAesEncrypt);
            m47700c.m47714f(AbstractC23352g.m122788d(str));
            return new C9050b(m47700c, str2);
        }
        throw new LevelDBException("Leveldb Native load error !");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m48456o() {
        boolean z11;
        try {
            this.f48493a = null;
            this.f48493a = AbstractC8942a.m47702t(this.f48495c, this.f48494b);
            this.f48496d.set(false);
        } catch (LevelDBException e11) {
            AbstractC20110a.m104539h(e11);
            if (e11 instanceof LevelDBIOException) {
                LevelDBIOException levelDBIOException = (LevelDBIOException) e11;
                if (levelDBIOException.isLockByPid()) {
                    InterfaceC22529a interfaceC22529a = CoreUtility.f89243s;
                    if (interfaceC22529a != null) {
                        interfaceC22529a.mo109250b(100005);
                        int lockPid = levelDBIOException.getLockPid();
                        String m118636a = AbstractC23133l6.m118636a(CoreUtility.getAppContext(), lockPid);
                        CoreUtility.f89243s.mo109249a(100005, "open error: leveldb lock by " + lockPid + " - " + m118636a + " - currentPid:" + Process.myPid() + " - dbPath:" + this.f48495c);
                    }
                    throw e11;
                }
                InterfaceC22529a interfaceC22529a2 = CoreUtility.f89243s;
                if (interfaceC22529a2 != null) {
                    interfaceC22529a2.mo109250b(100005);
                    CoreUtility.f89243s.mo109249a(100005, "open error " + this.f48495c + " - " + e11);
                }
            } else {
                if ((e11 instanceof LevelDBCorruptionException) && !this.f48496d.get()) {
                    z11 = true;
                    if (this.f48496d.compareAndSet(false, true)) {
                        m48462u(z11);
                    }
                    if (this.f48493a == null) {
                        return;
                    } else {
                        throw e11;
                    }
                }
                InterfaceC22529a interfaceC22529a3 = CoreUtility.f89243s;
                if (interfaceC22529a3 != null) {
                    interfaceC22529a3.mo109250b(100005);
                    CoreUtility.f89243s.mo109249a(100005, "open error " + this.f48495c + " - " + e11);
                }
            }
            z11 = false;
            if (this.f48496d.compareAndSet(false, true)) {
            }
            if (this.f48493a == null) {
            }
        }
    }

    /* renamed from: p */
    private void m48457p() {
        if (m48453k()) {
            File file = new File(this.f48495c);
            if (!file.exists()) {
                file.mkdirs();
            }
            m48456o();
        }
    }

    /* renamed from: q */
    private static boolean m48458q(byte[] bArr) {
        if (AbstractC17522a.m93347j(bArr, 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private static int m48459r(byte[] bArr) {
        return AbstractC17522a.m93349l(bArr, 1);
    }

    /* renamed from: s */
    private static long m48460s(byte[] bArr) {
        return AbstractC17522a.m93341d(bArr, 1);
    }

    /* renamed from: t */
    private static int m48461t(byte[] bArr) {
        return AbstractC17522a.m93347j(bArr, 0);
    }

    /* renamed from: u */
    private void m48462u(boolean z11) {
        try {
            boolean m47698A = AbstractC8942a.m47698A(this.f48495c, this.f48494b);
            m48452j();
            if (m47698A) {
                m48456o();
            } else {
                m48457p();
            }
            InterfaceC22529a interfaceC22529a = CoreUtility.f89243s;
            if (interfaceC22529a != null) {
                interfaceC22529a.mo109251c(100006);
                CoreUtility.f89243s.mo109249a(100006, "recoverDb success: " + this.f48495c + " - fromCorruption: " + z11);
            }
        } catch (LevelDBException e11) {
            AbstractC20110a.m104539h(e11);
            InterfaceC22529a interfaceC22529a2 = CoreUtility.f89243s;
            if (interfaceC22529a2 != null) {
                interfaceC22529a2.mo109250b(100006);
                CoreUtility.f89243s.mo109249a(100006, "recoverDb error " + this.f48495c + " - " + e11 + " - fromCorruption: " + z11);
            }
            m48453k();
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
    }

    /* renamed from: w */
    private void m48463w() {
        if (!this.f48496d.get()) {
        } else {
            throw new LevelDBException("LevelDB warning: Cannot access to db while repairing !");
        }
    }

    /* renamed from: x */
    private static byte[] m48464x(boolean z11) {
        return new byte[]{1, z11 ? (byte) 1 : (byte) 0};
    }

    /* renamed from: y */
    private static byte[] m48465y(int i11) {
        return new byte[]{2, (byte) (i11 & 255), (byte) ((i11 >>> 8) & 255), (byte) ((i11 >>> 16) & 255), (byte) ((i11 >>> 24) & 255)};
    }

    /* renamed from: z */
    private static byte[] m48466z(long j11) {
        return new byte[]{3, (byte) (j11 & 255), (byte) ((j11 >>> 8) & 255), (byte) ((j11 >>> 16) & 255), (byte) ((j11 >>> 24) & 255), (byte) ((j11 >>> 32) & 255), (byte) ((j11 >>> 40) & 255), (byte) ((j11 >>> 48) & 255), (byte) ((j11 >>> 56) & 255)};
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: a */
    public long mo48440a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                m48463w();
                byte[] mo47684h = this.f48493a.mo47684h(str);
                if (mo47684h != null) {
                    if (mo47684h.length == 9) {
                        if (m48461t(mo47684h) == 3) {
                            long m48460s = m48460s(mo47684h);
                            AbstractC20110a.m104535d("getLongValue [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                            return m48460s;
                        }
                        throw new a("invalid data type");
                    }
                    throw new a("invalid data length");
                }
                throw new IPreferences.PreferencesExceptionNotFound();
            } catch (LevelDBException e11) {
                m48454m(e11);
                throw new a("LevelDBException when read data : " + e11.getMessage());
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104535d("getLongValue [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            throw th2;
        }
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: b */
    public int mo48441b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                m48463w();
                byte[] mo47684h = this.f48493a.mo47684h(str);
                if (mo47684h != null) {
                    if (mo47684h.length == 5) {
                        if (m48461t(mo47684h) == 2) {
                            int m48459r = m48459r(mo47684h);
                            AbstractC20110a.m104535d("getIntValue [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                            return m48459r;
                        }
                        throw new a("invalid data type");
                    }
                    throw new a("invalid data length");
                }
                throw new IPreferences.PreferencesExceptionNotFound();
            } catch (LevelDBException e11) {
                m48454m(e11);
                throw new a("LevelDBException when read data : " + e11.getMessage());
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104535d("getIntValue [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Long] */
    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: c */
    public void mo48442c(String str, String str2) {
        if (str2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            ?? r42 = 0;
            r42 = 0;
            try {
                try {
                    m48463w();
                    this.f48493a.m47703v(str, m48451A(str2));
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    ?? valueOf = Long.valueOf(currentTimeMillis2);
                    AbstractC20110a.m104535d("setStringValue [%s] in %dms", new Object[]{str, valueOf});
                    r42 = currentTimeMillis2;
                    str = valueOf;
                } catch (LevelDBException e11) {
                    m48454m(e11);
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    ?? valueOf2 = Long.valueOf(currentTimeMillis3);
                    AbstractC20110a.m104535d("setStringValue [%s] in %dms", new Object[]{str, valueOf2});
                    r42 = currentTimeMillis3;
                    str = valueOf2;
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                    long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
                    ?? valueOf3 = Long.valueOf(currentTimeMillis4);
                    AbstractC20110a.m104535d("setStringValue [%s] in %dms", new Object[]{str, valueOf3});
                    r42 = currentTimeMillis4;
                    str = valueOf3;
                }
            } catch (Throwable th2) {
                Object[] objArr = new Object[2];
                objArr[r42] = str;
                objArr[1] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                AbstractC20110a.m104535d("setStringValue [%s] in %dms", objArr);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Long] */
    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: d */
    public void mo48443d(String str, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        ?? r42 = 0;
        r42 = 0;
        try {
            try {
                m48463w();
                this.f48493a.m47703v(str, m48465y(i11));
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                ?? valueOf = Long.valueOf(currentTimeMillis2);
                AbstractC20110a.m104535d("setIntValue [%s] in %dms", new Object[]{str, valueOf});
                r42 = currentTimeMillis2;
                str = valueOf;
            } catch (LevelDBException e11) {
                m48454m(e11);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                ?? valueOf2 = Long.valueOf(currentTimeMillis3);
                AbstractC20110a.m104535d("setIntValue [%s] in %dms", new Object[]{str, valueOf2});
                r42 = currentTimeMillis3;
                str = valueOf2;
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
                ?? valueOf3 = Long.valueOf(currentTimeMillis4);
                AbstractC20110a.m104535d("setIntValue [%s] in %dms", new Object[]{str, valueOf3});
                r42 = currentTimeMillis4;
                str = valueOf3;
            }
        } catch (Throwable th2) {
            Object[] objArr = new Object[2];
            objArr[r42] = str;
            objArr[1] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            AbstractC20110a.m104535d("setIntValue [%s] in %dms", objArr);
            throw th2;
        }
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: e */
    public String mo48444e(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                m48463w();
                byte[] mo47684h = this.f48493a.mo47684h(str);
                if (mo47684h != null) {
                    if (m48461t(mo47684h) == 4) {
                        String str2 = new String(mo47684h, 1, mo47684h.length - 1, StandardCharsets.UTF_8);
                        AbstractC20110a.m104535d("getStringValue [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        return str2;
                    }
                    throw new a("invalid data type");
                }
                throw new IPreferences.PreferencesExceptionNotFound();
            } catch (LevelDBException e11) {
                m48454m(e11);
                throw new a("LevelDBException when read data : " + e11.getMessage());
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104535d("getStringValue [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            throw th2;
        }
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: f */
    public boolean mo48445f(String str) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                m48463w();
                if (this.f48493a.mo47684h(str) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC20110a.m104535d("containKey [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return z11;
            } catch (LevelDBException e11) {
                m48454m(e11);
                AbstractC20110a.m104535d("containKey [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return false;
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104535d("containKey [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            throw th2;
        }
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: g */
    public boolean mo48446g(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                m48463w();
                byte[] mo47684h = this.f48493a.mo47684h(str);
                if (mo47684h != null) {
                    if (mo47684h.length == 2) {
                        if (m48461t(mo47684h) == 1) {
                            boolean m48458q = m48458q(mo47684h);
                            AbstractC20110a.m104535d("getBoolValue [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                            return m48458q;
                        }
                        throw new a("invalid data type");
                    }
                    throw new a("invalid data length");
                }
                throw new IPreferences.PreferencesExceptionNotFound();
            } catch (LevelDBException e11) {
                m48454m(e11);
                throw new a("LevelDBException when read data : " + e11.getMessage());
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104535d("getBoolValue [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object[]] */
    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: h */
    public void mo48447h(String str, long j11) {
        long currentTimeMillis = System.currentTimeMillis();
        ?? r42 = 0;
        r42 = 0;
        try {
            try {
                m48463w();
                this.f48493a.m47703v(str, m48466z(j11));
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                ?? valueOf = Long.valueOf(currentTimeMillis2);
                AbstractC20110a.m104535d("setLongValue [%s] in %dms", new Object[]{str, valueOf});
                r42 = currentTimeMillis2;
                str = valueOf;
            } catch (LevelDBException e11) {
                m48454m(e11);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                ?? valueOf2 = Long.valueOf(currentTimeMillis3);
                AbstractC20110a.m104535d("setLongValue [%s] in %dms", new Object[]{str, valueOf2});
                r42 = currentTimeMillis3;
                str = valueOf2;
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
                ?? valueOf3 = Long.valueOf(currentTimeMillis4);
                AbstractC20110a.m104535d("setLongValue [%s] in %dms", new Object[]{str, valueOf3});
                r42 = currentTimeMillis4;
                str = valueOf3;
            }
        } catch (Throwable th2) {
            Object[] objArr = new Object[2];
            objArr[r42] = str;
            objArr[1] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            AbstractC20110a.m104535d("setLongValue [%s] in %dms", objArr);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Long] */
    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: i */
    public void mo48448i(String str, boolean z11) {
        long currentTimeMillis = System.currentTimeMillis();
        ?? r42 = 0;
        r42 = 0;
        try {
            try {
                m48463w();
                this.f48493a.m47703v(str, m48464x(z11));
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                ?? valueOf = Long.valueOf(currentTimeMillis2);
                AbstractC20110a.m104535d("setBoolValue [%s] in %dms", new Object[]{str, valueOf});
                r42 = currentTimeMillis2;
                str = valueOf;
            } catch (LevelDBException e11) {
                m48454m(e11);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                ?? valueOf2 = Long.valueOf(currentTimeMillis3);
                AbstractC20110a.m104535d("setBoolValue [%s] in %dms", new Object[]{str, valueOf2});
                r42 = currentTimeMillis3;
                str = valueOf2;
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
                ?? valueOf3 = Long.valueOf(currentTimeMillis4);
                AbstractC20110a.m104535d("setBoolValue [%s] in %dms", new Object[]{str, valueOf3});
                r42 = currentTimeMillis4;
                str = valueOf3;
            }
        } catch (Throwable th2) {
            Object[] objArr = new Object[2];
            objArr[r42] = str;
            objArr[1] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            AbstractC20110a.m104535d("setBoolValue [%s] in %dms", objArr);
            throw th2;
        }
    }

    /* renamed from: l */
    public void m48467l(IPreferences iPreferences, HashSet hashSet) {
        if (iPreferences == null) {
            return;
        }
        try {
            C30203a mo47687o = this.f48493a.mo47687o();
            if (mo47687o != null) {
                mo47687o.m148961h();
                int i11 = 0;
                while (mo47687o.m148959f()) {
                    String m148956c = mo47687o.m148956c();
                    byte[] mo47684h = this.f48493a.mo47684h(m148956c);
                    if (mo47684h != null) {
                        int m148965e = C30204b.m148965e(mo47684h);
                        if (m148965e != 1) {
                            if (m148965e != 2) {
                                if (m148965e != 3) {
                                    if (m148965e == 4) {
                                        String str = new String(mo47684h, 1, mo47684h.length - 1, StandardCharsets.UTF_8);
                                        if (str.length() <= 100) {
                                            iPreferences.mo48442c(m148956c, str);
                                        } else {
                                            hashSet.add(m148956c);
                                        }
                                    }
                                } else {
                                    iPreferences.mo48447h(m148956c, C30204b.m148964d(mo47684h));
                                }
                            } else {
                                iPreferences.mo48443d(m148956c, C30204b.m148963c(mo47684h));
                            }
                        } else {
                            iPreferences.mo48448i(m148956c, C30204b.m148962a(mo47684h));
                        }
                    }
                    mo47687o.m148960g();
                    i11++;
                    if (i11 > 5000) {
                        break;
                    }
                }
                mo47687o.m148954a();
            }
        } catch (LevelDBException e11) {
            m48454m(e11);
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* renamed from: v */
    public boolean m48468v(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                m48463w();
                boolean mo47683d = this.f48493a.mo47683d(str);
                AbstractC20110a.m104535d("removeKey [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return mo47683d;
            } catch (LevelDBException e11) {
                m48454m(e11);
                AbstractC20110a.m104535d("removeKey [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return false;
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104535d("removeKey [%s] in %dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            throw th2;
        }
    }
}
