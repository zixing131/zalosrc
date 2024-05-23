package tm0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;

/* renamed from: tm0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC26735a {

    /* renamed from: tm0.a$a */
    /* loaded from: classes7.dex */
    public static final class a extends Thread {

        /* renamed from: p */
        final /* synthetic */ InterfaceC18494a f126834p;

        a(InterfaceC18494a interfaceC18494a) {
            this.f126834p = interfaceC18494a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f126834p.mo12V4();
        }
    }

    /* renamed from: a */
    public static final Thread m137530a(boolean z11, boolean z12, ClassLoader classLoader, String str, int i11, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "block");
        a aVar = new a(interfaceC18494a);
        if (z12) {
            aVar.setDaemon(true);
        }
        if (i11 > 0) {
            aVar.setPriority(i11);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z11) {
            aVar.start();
        }
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ Thread m137531b(boolean z11, boolean z12, ClassLoader classLoader, String str, int i11, InterfaceC18494a interfaceC18494a, int i12, Object obj) {
        boolean z13;
        boolean z14;
        ClassLoader classLoader2;
        String str2;
        int i13;
        if ((i12 & 1) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i12 & 2) != 0) {
            z14 = false;
        } else {
            z14 = z12;
        }
        if ((i12 & 4) != 0) {
            classLoader2 = null;
        } else {
            classLoader2 = classLoader;
        }
        if ((i12 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i12 & 16) != 0) {
            i13 = -1;
        } else {
            i13 = i11;
        }
        return m137530a(z13, z14, classLoader2, str2, i13, interfaceC18494a);
    }
}
