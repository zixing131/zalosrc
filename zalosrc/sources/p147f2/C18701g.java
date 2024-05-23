package p147f2;

import android.database.sqlite.SQLiteProgram;
import fn0.AbstractC19074t;
import p119e2.InterfaceC18184i;

/* renamed from: f2.g */
/* loaded from: classes.dex */
public class C18701g implements InterfaceC18184i {

    /* renamed from: p */
    private final SQLiteProgram f93956p;

    public C18701g(SQLiteProgram sQLiteProgram) {
        AbstractC19074t.m100208f(sQLiteProgram, "delegate");
        this.f93956p = sQLiteProgram;
    }

    @Override // p119e2.InterfaceC18184i
    /* renamed from: a0 */
    public void mo219a0(int i11, String str) {
        AbstractC19074t.m100208f(str, "value");
        this.f93956p.bindString(i11, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f93956p.close();
    }

    @Override // p119e2.InterfaceC18184i
    /* renamed from: l0 */
    public void mo220l0(int i11, long j11) {
        this.f93956p.bindLong(i11, j11);
    }

    @Override // p119e2.InterfaceC18184i
    /* renamed from: n0 */
    public void mo221n0(int i11, byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "value");
        this.f93956p.bindBlob(i11, bArr);
    }

    @Override // p119e2.InterfaceC18184i
    /* renamed from: u0 */
    public void mo222u0(int i11) {
        this.f93956p.bindNull(i11);
    }

    @Override // p119e2.InterfaceC18184i
    /* renamed from: x */
    public void mo224x(int i11, double d11) {
        this.f93956p.bindDouble(i11, d11);
    }
}
