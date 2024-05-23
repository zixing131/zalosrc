package p151f6;

import android.os.IBinder;
import android.os.Parcel;
import p598w5.AbstractC28740a;
import p598w5.AbstractC28768z;

/* renamed from: f6.z */
/* loaded from: classes2.dex */
public final class C18783z extends AbstractC28740a implements InterfaceC18755g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C18783z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // p151f6.InterfaceC18755g
    /* renamed from: N2 */
    public final void mo98767N2(boolean z11) {
        Parcel m143868N = m143868N();
        int i11 = AbstractC28768z.f133302b;
        m143868N.writeInt(z11 ? 1 : 0);
        m143869Q(2, m143868N);
    }

    @Override // p151f6.InterfaceC18755g
    /* renamed from: e0 */
    public final void mo98768e0(boolean z11) {
        Parcel m143868N = m143868N();
        int i11 = AbstractC28768z.f133302b;
        m143868N.writeInt(z11 ? 1 : 0);
        m143869Q(3, m143868N);
    }

    @Override // p151f6.InterfaceC18755g
    /* renamed from: z1 */
    public final void mo98769z1(boolean z11) {
        Parcel m143868N = m143868N();
        int i11 = AbstractC28768z.f133302b;
        m143868N.writeInt(z11 ? 1 : 0);
        m143869Q(18, m143868N);
    }
}
