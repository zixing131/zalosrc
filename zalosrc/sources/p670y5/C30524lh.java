package p670y5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.mlkit_vision_barcode.zzso;

/* renamed from: y5.lh */
/* loaded from: classes2.dex */
public final class C30524lh extends AbstractC30296a implements InterfaceC30562nh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C30524lh(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // p670y5.InterfaceC30562nh
    /* renamed from: V4 */
    public final C30505kh mo149564V4(InterfaceC4271b interfaceC4271b, zzso zzsoVar) {
        C30505kh c30505kh;
        Parcel m149436E = m149436E();
        AbstractC30298a1.m149441b(m149436E, interfaceC4271b);
        AbstractC30298a1.m149440a(m149436E, zzsoVar);
        Parcel m149437N = m149437N(1, m149436E);
        IBinder readStrongBinder = m149437N.readStrongBinder();
        if (readStrongBinder == null) {
            c30505kh = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            if (queryLocalInterface instanceof C30505kh) {
                c30505kh = (C30505kh) queryLocalInterface;
            } else {
                c30505kh = new C30505kh(readStrongBinder);
            }
        }
        m149437N.recycle();
        return c30505kh;
    }
}
