package p670y5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
import com.google.android.gms.internal.mlkit_vision_barcode.zztf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y5.kh */
/* loaded from: classes2.dex */
public final class C30505kh extends AbstractC30296a implements IInterface {
    public C30505kh(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    /* renamed from: I3 */
    public final List m149561I3(InterfaceC4271b interfaceC4271b, zztf zztfVar) {
        Parcel m149436E = m149436E();
        AbstractC30298a1.m149441b(m149436E, interfaceC4271b);
        AbstractC30298a1.m149440a(m149436E, zztfVar);
        Parcel m149437N = m149437N(3, m149436E);
        ArrayList createTypedArrayList = m149437N.createTypedArrayList(zzsm.CREATOR);
        m149437N.recycle();
        return createTypedArrayList;
    }

    public final void zze() {
        m149438Q(1, m149436E());
    }

    public final void zzf() {
        m149438Q(2, m149436E());
    }
}
