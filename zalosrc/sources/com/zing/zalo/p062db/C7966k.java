package com.zing.zalo.p062db;

import am.InterfaceC0949z;

/* renamed from: com.zing.zalo.db.k */
/* loaded from: classes.dex */
public final class C7966k implements InterfaceC0949z {

    /* renamed from: p */
    private final SQLiteStatement f43368p;

    /* renamed from: q */
    private final SQLiteDatabase f43369q;

    public C7966k(SQLiteDatabase sQLiteDatabase, SQLiteStatement sQLiteStatement) {
        this.f43369q = sQLiteDatabase;
        this.f43368p = sQLiteStatement;
    }

    @Override // am.InterfaceC0949z, java.lang.AutoCloseable
    public void close() {
        int close;
        if (!this.f43368p.m41441t() && (close = this.f43368p.close()) != 0) {
            SQLiteDatabase sQLiteDatabase = this.f43369q;
            sQLiteDatabase.m41418P(close, sQLiteDatabase.m41414H());
        }
    }

    @Override // am.InterfaceC0949z
    public byte[] getBlob(int i11) {
        return this.f43368p.m41434m(i11);
    }

    @Override // am.InterfaceC0949z
    public int getColumnCount() {
        return this.f43368p.m41435n();
    }

    @Override // am.InterfaceC0949z
    public int getColumnIndex(String str) {
        return this.f43368p.m41436o(str);
    }

    @Override // am.InterfaceC0949z
    public int getInt(int i11) {
        return this.f43368p.m41437p(i11);
    }

    @Override // am.InterfaceC0949z
    public long getLong(int i11) {
        return this.f43368p.m41438q(i11);
    }

    @Override // am.InterfaceC0949z
    public String getString(int i11) {
        return this.f43368p.m41440s(i11);
    }

    @Override // am.InterfaceC0949z
    public boolean next() {
        int mo2784f = this.f43368p.mo2784f();
        if (mo2784f != 100) {
            if (mo2784f != 101) {
                SQLiteDatabase sQLiteDatabase = this.f43369q;
                sQLiteDatabase.m41418P(mo2784f, sQLiteDatabase.m41414H());
                return false;
            }
            return false;
        }
        return true;
    }
}
