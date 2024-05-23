package p012a6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;

/* renamed from: a6.f7 */
/* loaded from: classes2.dex */
public final class C0247f7 extends AbstractC0144a implements InterfaceC0287h9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0247f7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
    }

    @Override // p012a6.InterfaceC0287h9
    /* renamed from: n3 */
    public final C0227e6 mo716n3(InterfaceC4271b interfaceC4271b, zzp zzpVar) {
        C0227e6 c0227e6;
        Parcel m606E = m606E();
        AbstractC0165b1.m623b(m606E, interfaceC4271b);
        AbstractC0165b1.m622a(m606E, zzpVar);
        Parcel m607N = m607N(1, m606E);
        IBinder readStrongBinder = m607N.readStrongBinder();
        if (readStrongBinder == null) {
            c0227e6 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            if (queryLocalInterface instanceof C0227e6) {
                c0227e6 = (C0227e6) queryLocalInterface;
            } else {
                c0227e6 = new C0227e6(readStrongBinder);
            }
        }
        m607N.recycle();
        return c0227e6;
    }
}
