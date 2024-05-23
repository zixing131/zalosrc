package p151f6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import p598w5.AbstractC28740a;
import p598w5.AbstractC28768z;

/* renamed from: f6.o */
/* loaded from: classes2.dex */
public final class C18771o extends AbstractC28740a implements InterfaceC18743a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C18771o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // p151f6.InterfaceC18743a
    /* renamed from: B1 */
    public final InterfaceC4271b mo98725B1(CameraPosition cameraPosition) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143904c(m143868N, cameraPosition);
        Parcel m143867E = m143867E(7, m143868N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m143867E.readStrongBinder());
        m143867E.recycle();
        return m19911N;
    }

    @Override // p151f6.InterfaceC18743a
    /* renamed from: f2 */
    public final InterfaceC4271b mo98726f2(float f11) {
        Parcel m143868N = m143868N();
        m143868N.writeFloat(f11);
        Parcel m143867E = m143867E(4, m143868N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m143867E.readStrongBinder());
        m143867E.recycle();
        return m19911N;
    }

    @Override // p151f6.InterfaceC18743a
    /* renamed from: h3 */
    public final InterfaceC4271b mo98727h3(LatLng latLng) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143904c(m143868N, latLng);
        Parcel m143867E = m143867E(8, m143868N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m143867E.readStrongBinder());
        m143867E.recycle();
        return m19911N;
    }

    @Override // p151f6.InterfaceC18743a
    /* renamed from: q2 */
    public final InterfaceC4271b mo98728q2(LatLng latLng, float f11) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143904c(m143868N, latLng);
        m143868N.writeFloat(f11);
        Parcel m143867E = m143867E(9, m143868N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m143867E.readStrongBinder());
        m143867E.recycle();
        return m19911N;
    }
}
