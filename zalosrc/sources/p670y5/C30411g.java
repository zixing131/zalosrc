package p670y5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;

/* renamed from: y5.g */
/* loaded from: classes2.dex */
public final class C30411g extends AbstractC30296a implements InterfaceC30449i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C30411g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // p670y5.InterfaceC30449i
    /* renamed from: I0 */
    public final C30392f mo149504I0(InterfaceC4271b interfaceC4271b, zzad zzadVar) {
        C30392f c30392f;
        Parcel m149436E = m149436E();
        AbstractC30298a1.m149441b(m149436E, interfaceC4271b);
        AbstractC30298a1.m149440a(m149436E, zzadVar);
        Parcel m149437N = m149437N(1, m149436E);
        IBinder readStrongBinder = m149437N.readStrongBinder();
        if (readStrongBinder == null) {
            c30392f = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (queryLocalInterface instanceof C30392f) {
                c30392f = (C30392f) queryLocalInterface;
            } else {
                c30392f = new C30392f(readStrongBinder);
            }
        }
        m149437N.recycle();
        return c30392f;
    }
}
