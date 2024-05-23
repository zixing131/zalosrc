package androidx.browser.trusted;

import android.os.IBinder;
import p044c0.InterfaceC3179a;

/* renamed from: androidx.browser.trusted.c */
/* loaded from: classes2.dex */
public class C1237c {

    /* renamed from: a */
    private final InterfaceC3179a f4807a;

    private C1237c(InterfaceC3179a interfaceC3179a) {
        this.f4807a = interfaceC3179a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1237c m5853a(IBinder iBinder) {
        InterfaceC3179a m15976E;
        if (iBinder == null) {
            m15976E = null;
        } else {
            m15976E = InterfaceC3179a.a.m15976E(iBinder);
        }
        if (m15976E == null) {
            return null;
        }
        return new C1237c(m15976E);
    }
}
