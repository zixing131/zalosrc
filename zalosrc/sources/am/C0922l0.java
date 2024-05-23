package am;

import android.database.sqlite.SQLiteStatement;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* renamed from: am.l0 */
/* loaded from: classes3.dex */
public class C0922l0 implements InterfaceC0897a0 {

    /* renamed from: a */
    private SQLiteStatement f3419a;

    public C0922l0(SQLiteStatement sQLiteStatement) {
        this.f3419a = sQLiteStatement;
    }

    @Override // am.InterfaceC0897a0
    /* renamed from: a */
    public int mo2779a() {
        return this.f3419a.executeUpdateDelete();
    }

    @Override // am.InterfaceC0897a0
    /* renamed from: b */
    public long mo2780b() {
        return this.f3419a.executeInsert();
    }

    @Override // am.InterfaceC0897a0
    /* renamed from: c */
    public int mo2781c(int i11, String str) {
        this.f3419a.bindString(i11, str);
        return 0;
    }

    @Override // am.InterfaceC0897a0
    public int close() {
        this.f3419a = null;
        return 0;
    }

    @Override // am.InterfaceC0897a0
    /* renamed from: d */
    public long mo2782d() {
        return this.f3419a.simpleQueryForLong();
    }

    @Override // am.InterfaceC0897a0
    /* renamed from: e */
    public int mo2783e(int i11, Object obj) {
        if (obj == null) {
            return m2881k(i11);
        }
        if (obj instanceof Integer) {
            return m2878h(i11, ((Integer) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m2878h(i11, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Long) {
            return m2879i(i11, ((Long) obj).longValue());
        }
        if (obj instanceof Date) {
            return m2879i(i11, ((Date) obj).getTime());
        }
        if (obj instanceof Double) {
            return m2877g(i11, ((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return m2877g(i11, ((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            return mo2781c(i11, (String) obj);
        }
        if (obj instanceof BigDecimal) {
            return m2877g(i11, ((BigDecimal) obj).doubleValue());
        }
        if (obj instanceof BigInteger) {
            return m2879i(i11, ((BigInteger) obj).longValue());
        }
        if (obj instanceof byte[]) {
            return m2880j(i11, (byte[]) obj);
        }
        return 1;
    }

    @Override // am.InterfaceC0897a0
    /* renamed from: f */
    public int mo2784f() {
        this.f3419a.execute();
        return 0;
    }

    /* renamed from: g */
    public int m2877g(int i11, double d11) {
        this.f3419a.bindDouble(i11, d11);
        return 0;
    }

    /* renamed from: h */
    public int m2878h(int i11, int i12) {
        this.f3419a.bindLong(i11, i12);
        return 0;
    }

    /* renamed from: i */
    public int m2879i(int i11, long j11) {
        this.f3419a.bindLong(i11, j11);
        return 0;
    }

    /* renamed from: j */
    public int m2880j(int i11, byte[] bArr) {
        this.f3419a.bindBlob(i11, bArr);
        return 0;
    }

    /* renamed from: k */
    public int m2881k(int i11) {
        this.f3419a.bindNull(i11);
        return 0;
    }
}
