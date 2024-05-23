package am;

/* renamed from: am.z */
/* loaded from: classes.dex */
public interface InterfaceC0949z extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    byte[] getBlob(int i11);

    int getColumnCount();

    int getColumnIndex(String str);

    int getInt(int i11);

    long getLong(int i11);

    String getString(int i11);

    boolean next();
}
