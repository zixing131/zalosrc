package p598w5;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: w5.b */
/* loaded from: classes2.dex */
public final class C28742b extends AbstractC28740a implements InterfaceC28746d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C28742b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // p598w5.InterfaceC28746d
    /* renamed from: D0 */
    public final boolean mo143872D0(InterfaceC28746d interfaceC28746d) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC28746d);
        Parcel m143867E = m143867E(16, m143868N);
        boolean m143906e = AbstractC28768z.m143906e(m143867E);
        m143867E.recycle();
        return m143906e;
    }

    @Override // p598w5.InterfaceC28746d
    /* renamed from: K */
    public final void mo143873K(InterfaceC4271b interfaceC4271b) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC4271b);
        m143869Q(29, m143868N);
    }

    @Override // p598w5.InterfaceC28746d
    /* renamed from: d0 */
    public final void mo143874d0(float f11) {
        Parcel m143868N = m143868N();
        m143868N.writeFloat(f11);
        m143869Q(27, m143868N);
    }

    @Override // p598w5.InterfaceC28746d
    /* renamed from: m */
    public final boolean mo143875m() {
        Parcel m143867E = m143867E(15, m143868N());
        boolean m143906e = AbstractC28768z.m143906e(m143867E);
        m143867E.recycle();
        return m143906e;
    }

    @Override // p598w5.InterfaceC28746d
    /* renamed from: p2 */
    public final void mo143876p2(InterfaceC4271b interfaceC4271b) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC4271b);
        m143869Q(18, m143868N);
    }

    @Override // p598w5.InterfaceC28746d
    /* renamed from: r0 */
    public final void mo143877r0(LatLng latLng) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143904c(m143868N, latLng);
        m143869Q(3, m143868N);
    }

    @Override // p598w5.InterfaceC28746d
    public final void zzB(boolean z11) {
        Parcel m143868N = m143868N();
        int i11 = AbstractC28768z.f133302b;
        m143868N.writeInt(z11 ? 1 : 0);
        m143869Q(14, m143868N);
    }

    @Override // p598w5.InterfaceC28746d
    public final int zzg() {
        Parcel m143867E = m143867E(17, m143868N());
        int readInt = m143867E.readInt();
        m143867E.recycle();
        return readInt;
    }

    @Override // p598w5.InterfaceC28746d
    public final InterfaceC4271b zzi() {
        Parcel m143867E = m143867E(30, m143868N());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m143867E.readStrongBinder());
        m143867E.recycle();
        return m19911N;
    }

    @Override // p598w5.InterfaceC28746d
    public final LatLng zzj() {
        Parcel m143867E = m143867E(4, m143868N());
        LatLng latLng = (LatLng) AbstractC28768z.m143902a(m143867E, LatLng.CREATOR);
        m143867E.recycle();
        return latLng;
    }

    @Override // p598w5.InterfaceC28746d
    public final void zzo() {
        m143869Q(1, m143868N());
    }
}
