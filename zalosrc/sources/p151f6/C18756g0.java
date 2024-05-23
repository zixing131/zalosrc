package p151f6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p598w5.AbstractC28740a;
import p598w5.AbstractC28768z;

/* renamed from: f6.g0 */
/* loaded from: classes2.dex */
public final class C18756g0 extends AbstractC28740a implements InterfaceC18747c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C18756g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // p151f6.InterfaceC18747c
    /* renamed from: U4 */
    public final void mo98758U4(InterfaceC18765l interfaceC18765l) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC18765l);
        m143869Q(9, m143868N);
    }

    @Override // p151f6.InterfaceC18747c
    public final InterfaceC4271b getView() {
        Parcel m143867E = m143867E(8, m143868N());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m143867E.readStrongBinder());
        m143867E.recycle();
        return m19911N;
    }

    @Override // p151f6.InterfaceC18747c
    public final void onDestroy() {
        m143869Q(5, m143868N());
    }

    @Override // p151f6.InterfaceC18747c
    public final void onLowMemory() {
        m143869Q(6, m143868N());
    }

    @Override // p151f6.InterfaceC18747c
    public final void onPause() {
        m143869Q(4, m143868N());
    }

    @Override // p151f6.InterfaceC18747c
    public final void onResume() {
        m143869Q(3, m143868N());
    }

    @Override // p151f6.InterfaceC18747c
    public final void onStart() {
        m143869Q(12, m143868N());
    }

    @Override // p151f6.InterfaceC18747c
    public final void onStop() {
        m143869Q(13, m143868N());
    }

    @Override // p151f6.InterfaceC18747c
    /* renamed from: s */
    public final void mo98759s(Bundle bundle) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143904c(m143868N, bundle);
        m143869Q(2, m143868N);
    }
}
