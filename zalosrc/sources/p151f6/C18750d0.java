package p151f6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import p598w5.AbstractBinderC28743b0;
import p598w5.AbstractC28740a;
import p598w5.AbstractC28768z;
import p598w5.InterfaceC28745c0;

/* renamed from: f6.d0 */
/* loaded from: classes2.dex */
public final class C18750d0 extends AbstractC28740a implements InterfaceC18752e0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C18750d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // p151f6.InterfaceC18752e0
    /* renamed from: H */
    public final void mo98761H(InterfaceC4271b interfaceC4271b, int i11) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC4271b);
        m143868N.writeInt(18020000);
        m143869Q(6, m143868N);
    }

    @Override // p151f6.InterfaceC18752e0
    /* renamed from: d3 */
    public final void mo98762d3(InterfaceC4271b interfaceC4271b, int i11) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC4271b);
        m143868N.writeInt(i11);
        m143869Q(10, m143868N);
    }

    @Override // p151f6.InterfaceC18752e0
    /* renamed from: i4 */
    public final InterfaceC18747c mo98763i4(InterfaceC4271b interfaceC4271b, GoogleMapOptions googleMapOptions) {
        InterfaceC18747c c18756g0;
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC4271b);
        AbstractC28768z.m143904c(m143868N, googleMapOptions);
        Parcel m143867E = m143867E(3, m143868N);
        IBinder readStrongBinder = m143867E.readStrongBinder();
        if (readStrongBinder == null) {
            c18756g0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof InterfaceC18747c) {
                c18756g0 = (InterfaceC18747c) queryLocalInterface;
            } else {
                c18756g0 = new C18756g0(readStrongBinder);
            }
        }
        m143867E.recycle();
        return c18756g0;
    }

    @Override // p151f6.InterfaceC18752e0
    /* renamed from: u1 */
    public final InterfaceC18753f mo98764u1(InterfaceC4271b interfaceC4271b, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        InterfaceC18753f c18781x;
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC4271b);
        AbstractC28768z.m143904c(m143868N, streetViewPanoramaOptions);
        Parcel m143867E = m143867E(7, m143868N);
        IBinder readStrongBinder = m143867E.readStrongBinder();
        if (readStrongBinder == null) {
            c18781x = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            if (queryLocalInterface instanceof InterfaceC18753f) {
                c18781x = (InterfaceC18753f) queryLocalInterface;
            } else {
                c18781x = new C18781x(readStrongBinder);
            }
        }
        m143867E.recycle();
        return c18781x;
    }

    @Override // p151f6.InterfaceC18752e0
    public final int zzd() {
        Parcel m143867E = m143867E(9, m143868N());
        int readInt = m143867E.readInt();
        m143867E.recycle();
        return readInt;
    }

    @Override // p151f6.InterfaceC18752e0
    public final InterfaceC18743a zze() {
        InterfaceC18743a c18771o;
        Parcel m143867E = m143867E(4, m143868N());
        IBinder readStrongBinder = m143867E.readStrongBinder();
        if (readStrongBinder == null) {
            c18771o = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof InterfaceC18743a) {
                c18771o = (InterfaceC18743a) queryLocalInterface;
            } else {
                c18771o = new C18771o(readStrongBinder);
            }
        }
        m143867E.recycle();
        return c18771o;
    }

    @Override // p151f6.InterfaceC18752e0
    public final InterfaceC28745c0 zzj() {
        Parcel m143867E = m143867E(5, m143868N());
        InterfaceC28745c0 m143878N = AbstractBinderC28743b0.m143878N(m143867E.readStrongBinder());
        m143867E.recycle();
        return m143878N;
    }

    @Override // p151f6.InterfaceC18752e0
    public final void zzm(InterfaceC4271b interfaceC4271b) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC4271b);
        m143869Q(11, m143868N);
    }
}
