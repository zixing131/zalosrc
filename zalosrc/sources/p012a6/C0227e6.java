package p012a6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;

/* renamed from: a6.e6 */
/* loaded from: classes2.dex */
public final class C0227e6 extends AbstractC0144a implements IInterface {
    public C0227e6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    /* renamed from: I3 */
    public final zzl[] m681I3(InterfaceC4271b interfaceC4271b, zzd zzdVar) {
        Parcel m606E = m606E();
        AbstractC0165b1.m623b(m606E, interfaceC4271b);
        AbstractC0165b1.m622a(m606E, zzdVar);
        Parcel m607N = m607N(1, m606E);
        zzl[] zzlVarArr = (zzl[]) m607N.createTypedArray(zzl.CREATOR);
        m607N.recycle();
        return zzlVarArr;
    }

    public final void zzd() {
        m608Q(2, m606E());
    }
}
