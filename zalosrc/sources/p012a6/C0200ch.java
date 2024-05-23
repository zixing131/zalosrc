package p012a6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsg;

/* renamed from: a6.ch */
/* loaded from: classes2.dex */
public final class C0200ch extends AbstractC0144a implements IInterface {
    public C0200ch(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    /* renamed from: I3 */
    public final zzsg m653I3(InterfaceC4271b interfaceC4271b, zzrr zzrrVar) {
        zzsg createFromParcel;
        Parcel m606E = m606E();
        AbstractC0165b1.m623b(m606E, interfaceC4271b);
        AbstractC0165b1.m622a(m606E, zzrrVar);
        Parcel m607N = m607N(3, m606E);
        Parcelable.Creator<zzsg> creator = zzsg.CREATOR;
        if (m607N.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(m607N);
        }
        zzsg zzsgVar = createFromParcel;
        m607N.recycle();
        return zzsgVar;
    }

    public final void zze() {
        m608Q(1, m606E());
    }

    public final void zzf() {
        m608Q(2, m606E());
    }
}
