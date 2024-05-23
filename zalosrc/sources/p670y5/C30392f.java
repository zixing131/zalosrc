package p670y5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;

/* renamed from: y5.f */
/* loaded from: classes2.dex */
public final class C30392f extends AbstractC30296a implements IInterface {
    public C30392f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    /* renamed from: I3 */
    public final zzq[] m149500I3(InterfaceC4271b interfaceC4271b, zzaj zzajVar) {
        Parcel m149436E = m149436E();
        AbstractC30298a1.m149441b(m149436E, interfaceC4271b);
        AbstractC30298a1.m149440a(m149436E, zzajVar);
        Parcel m149437N = m149437N(1, m149436E);
        zzq[] zzqVarArr = (zzq[]) m149437N.createTypedArray(zzq.CREATOR);
        m149437N.recycle();
        return zzqVarArr;
    }

    /* renamed from: W4 */
    public final zzq[] m149501W4(InterfaceC4271b interfaceC4271b, zzaj zzajVar) {
        Parcel m149436E = m149436E();
        AbstractC30298a1.m149441b(m149436E, interfaceC4271b);
        AbstractC30298a1.m149440a(m149436E, zzajVar);
        Parcel m149437N = m149437N(2, m149436E);
        zzq[] zzqVarArr = (zzq[]) m149437N.createTypedArray(zzq.CREATOR);
        m149437N.recycle();
        return zzqVarArr;
    }

    public final void zzd() {
        m149438Q(3, m149436E());
    }
}
