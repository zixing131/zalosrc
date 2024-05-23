package p291k7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: k7.k0 */
/* loaded from: classes3.dex */
public final class C21517k0 extends AbstractC21506g1 implements InterfaceC21523m0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C21517k0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p291k7.InterfaceC21523m0
    /* renamed from: H3 */
    public final void mo111168H3(String str, int i11, Bundle bundle, InterfaceC21529o0 interfaceC21529o0) {
        Parcel m111155E = m111155E();
        m111155E.writeString(str);
        m111155E.writeInt(i11);
        AbstractC21512i1.m111161c(m111155E, bundle);
        m111155E.writeStrongBinder(interfaceC21529o0);
        m111156N(4, m111155E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p291k7.InterfaceC21523m0
    /* renamed from: h0 */
    public final void mo111169h0(String str, List list, Bundle bundle, InterfaceC21529o0 interfaceC21529o0) {
        Parcel m111155E = m111155E();
        m111155E.writeString(str);
        m111155E.writeTypedList(list);
        AbstractC21512i1.m111161c(m111155E, bundle);
        m111155E.writeStrongBinder(interfaceC21529o0);
        m111156N(2, m111155E);
    }
}
