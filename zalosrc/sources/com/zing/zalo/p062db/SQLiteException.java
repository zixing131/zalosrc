package com.zing.zalo.p062db;

/* loaded from: classes.dex */
public class SQLiteException extends Exception {

    /* renamed from: p */
    private final int f43182p;

    /* renamed from: q */
    private final String f43183q;

    /* renamed from: r */
    private final String f43184r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteException(int i11, String str) {
        this(i11, str, null);
    }

    /* renamed from: a */
    public int m41426a() {
        return this.f43182p;
    }

    /* renamed from: b */
    public String m41427b() {
        return this.f43183q;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SQLiteException : code: ");
        sb2.append(this.f43182p);
        sb2.append("  |  Message: ");
        sb2.append(this.f43183q);
        if (this.f43184r != null) {
            str = " Query: " + this.f43184r;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteException(int i11, String str, String str2) {
        this.f43182p = i11;
        this.f43183q = str;
        this.f43184r = str2;
    }
}
