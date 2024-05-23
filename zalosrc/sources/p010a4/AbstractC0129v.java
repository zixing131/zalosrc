package p010a4;

import android.content.Context;
import java.io.Closeable;
import p228i4.InterfaceC20230d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a4.v */
/* loaded from: classes.dex */
public abstract class AbstractC0129v implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a4.v$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        AbstractC0129v mo524a();

        /* renamed from: b */
        a mo525b(Context context);
    }

    /* renamed from: a */
    abstract InterfaceC20230d mo522a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C0128u mo523b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo522a().close();
    }
}
