package p051c7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c7.j */
/* loaded from: classes3.dex */
public final class C3315j extends AbstractC3300a implements InterfaceC3317l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3315j(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p051c7.InterfaceC3317l
    /* renamed from: j4 */
    public final void mo16784j4(String str, Bundle bundle, InterfaceC3319n interfaceC3319n) {
        Parcel m16748E = m16748E();
        m16748E.writeString(str);
        AbstractC3314i.m16783c(m16748E, bundle);
        m16748E.writeStrongBinder(interfaceC3319n);
        m16749N(2, m16748E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p051c7.InterfaceC3317l
    /* renamed from: u4 */
    public final void mo16785u4(String str, Bundle bundle, InterfaceC3319n interfaceC3319n) {
        Parcel m16748E = m16748E();
        m16748E.writeString(str);
        AbstractC3314i.m16783c(m16748E, bundle);
        m16748E.writeStrongBinder(interfaceC3319n);
        m16749N(3, m16748E);
    }
}
