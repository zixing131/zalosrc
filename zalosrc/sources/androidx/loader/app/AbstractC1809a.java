package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1801w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p564v1.AbstractC27421b;

/* renamed from: androidx.loader.app.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1809a {

    /* renamed from: androidx.loader.app.a$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo9422a(AbstractC27421b abstractC27421b, Object obj);

        /* renamed from: b */
        AbstractC27421b mo9423b(int i11, Bundle bundle);

        /* renamed from: c */
        void mo9424c(AbstractC27421b abstractC27421b);
    }

    /* renamed from: b */
    public static AbstractC1809a m9418b(InterfaceC1801w interfaceC1801w) {
        return new C1810b(interfaceC1801w, ((InterfaceC1756a1) interfaceC1801w).mo4644Oc());
    }

    /* renamed from: a */
    public abstract void mo9419a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract AbstractC27421b mo9420c(int i11, Bundle bundle, a aVar);

    /* renamed from: d */
    public abstract void mo9421d();
}
