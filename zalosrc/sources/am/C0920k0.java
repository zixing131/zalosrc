package am;

import android.database.Cursor;

/* renamed from: am.k0 */
/* loaded from: classes3.dex */
public class C0920k0 implements InterfaceC0949z {

    /* renamed from: p */
    private Cursor f3416p;

    public C0920k0(Cursor cursor) {
        this.f3416p = cursor;
    }

    @Override // am.InterfaceC0949z, java.lang.AutoCloseable
    public void close() {
        this.f3416p.close();
    }

    @Override // am.InterfaceC0949z
    public byte[] getBlob(int i11) {
        return this.f3416p.getBlob(i11);
    }

    @Override // am.InterfaceC0949z
    public int getColumnCount() {
        return this.f3416p.getColumnCount();
    }

    @Override // am.InterfaceC0949z
    public int getColumnIndex(String str) {
        return this.f3416p.getColumnIndex(str);
    }

    @Override // am.InterfaceC0949z
    public int getInt(int i11) {
        return this.f3416p.getInt(i11);
    }

    @Override // am.InterfaceC0949z
    public long getLong(int i11) {
        return this.f3416p.getLong(i11);
    }

    @Override // am.InterfaceC0949z
    public String getString(int i11) {
        return this.f3416p.getString(i11);
    }

    @Override // am.InterfaceC0949z
    public boolean next() {
        return this.f3416p.moveToNext();
    }
}
