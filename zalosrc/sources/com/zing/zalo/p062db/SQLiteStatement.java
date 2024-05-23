package com.zing.zalo.p062db;

import am.InterfaceC0897a0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class SQLiteStatement implements InterfaceC0897a0 {

    /* renamed from: a */
    private final int f43185a;

    /* renamed from: b */
    private final TreeMap f43186b = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: c */
    private long f43187c;

    /* renamed from: d */
    private long f43188d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteStatement(long j11, long j12) {
        this.f43188d = j11;
        this.f43187c = j12;
        this.f43185a = getColumnCount(j12);
        for (int i11 = 0; i11 < this.f43185a; i11++) {
            this.f43186b.put(getColumnName(this.f43187c, i11), Integer.valueOf(i11));
        }
    }

    private native int bind(long j11, int i11, double d11);

    private native int bind(long j11, int i11, int i12);

    private native int bind(long j11, int i11, long j12);

    private native int bind(long j11, int i11, String str);

    private native int bind(long j11, int i11, byte[] bArr);

    private native int bindNull(long j11, int i11);

    private native int bindParameterCount(long j11);

    private native int bindParameterIndex(long j11, String str);

    private native int clearBindings(long j11);

    private native int finalize(long j11);

    private native byte[] getBlob(long j11, int i11);

    private native int getColumnCount(long j11);

    private native String getColumnName(long j11, int i11);

    private native int getColumnType(long j11, int i11);

    private native double getDouble(long j11, int i11);

    private native int getInt(long j11, int i11);

    private native long getLong(long j11, int i11);

    private native String getText(long j11, int i11);

    private native int nativeExecuteForChangedRowCount(long j11, long j12);

    private native long nativeExecuteForLastInsertedRowId(long j11, long j12);

    private native int reset(long j11);

    private native int step(long j11);

    @Override // am.InterfaceC0897a0
    /* renamed from: a */
    public int mo2779a() {
        return nativeExecuteForChangedRowCount(this.f43188d, this.f43187c);
    }

    @Override // am.InterfaceC0897a0
    /* renamed from: b */
    public long mo2780b() {
        return nativeExecuteForLastInsertedRowId(this.f43188d, this.f43187c);
    }

    @Override // am.InterfaceC0897a0
    /* renamed from: c */
    public int mo2781c(int i11, String str) {
        return bind(this.f43187c, i11, str);
    }

    @Override // am.InterfaceC0897a0
    public int close() {
        long j11 = this.f43187c;
        this.f43187c = 0L;
        return finalize(j11);
    }

    @Override // am.InterfaceC0897a0
    /* renamed from: d */
    public long mo2782d() {
        mo2784f();
        return m41438q(0);
    }

    @Override // am.InterfaceC0897a0
    /* renamed from: e */
    public int mo2783e(int i11, Object obj) {
        if (obj == null) {
            return m41432k(i11);
        }
        if (obj instanceof Integer) {
            return m41429h(i11, ((Integer) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m41429h(i11, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Long) {
            return m41430i(i11, ((Long) obj).longValue());
        }
        if (obj instanceof Date) {
            return m41430i(i11, ((Date) obj).getTime());
        }
        if (obj instanceof Double) {
            return m41428g(i11, ((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return m41428g(i11, ((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            return mo2781c(i11, (String) obj);
        }
        if (obj instanceof BigDecimal) {
            return m41428g(i11, ((BigDecimal) obj).doubleValue());
        }
        if (obj instanceof BigInteger) {
            return m41430i(i11, ((BigInteger) obj).longValue());
        }
        if (obj instanceof byte[]) {
            return m41431j(i11, (byte[]) obj);
        }
        return 1;
    }

    @Override // am.InterfaceC0897a0
    /* renamed from: f */
    public int mo2784f() {
        return step(this.f43187c);
    }

    /* renamed from: g */
    public int m41428g(int i11, double d11) {
        return bind(this.f43187c, i11, d11);
    }

    /* renamed from: h */
    public int m41429h(int i11, int i12) {
        return bind(this.f43187c, i11, i12);
    }

    /* renamed from: i */
    public int m41430i(int i11, long j11) {
        return bind(this.f43187c, i11, j11);
    }

    /* renamed from: j */
    public int m41431j(int i11, byte[] bArr) {
        return bind(this.f43187c, i11, bArr);
    }

    /* renamed from: k */
    public int m41432k(int i11) {
        return bindNull(this.f43187c, i11);
    }

    /* renamed from: l */
    public int m41433l() {
        return bindParameterCount(this.f43187c);
    }

    /* renamed from: m */
    public byte[] m41434m(int i11) {
        return getBlob(this.f43187c, i11);
    }

    /* renamed from: n */
    public int m41435n() {
        return this.f43185a;
    }

    /* renamed from: o */
    public int m41436o(String str) {
        if (this.f43186b.containsKey(str)) {
            return ((Integer) this.f43186b.get(str)).intValue();
        }
        return -1;
    }

    /* renamed from: p */
    public int m41437p(int i11) {
        return getInt(this.f43187c, i11);
    }

    /* renamed from: q */
    public long m41438q(int i11) {
        return getLong(this.f43187c, i11);
    }

    /* renamed from: r */
    public int m41439r(String str) {
        return bindParameterIndex(this.f43187c, str);
    }

    /* renamed from: s */
    public String m41440s(int i11) {
        return getText(this.f43187c, i11);
    }

    /* renamed from: t */
    public boolean m41441t() {
        return this.f43187c == 0;
    }
}
