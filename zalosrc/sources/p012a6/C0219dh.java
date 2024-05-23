package p012a6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsi;

/* renamed from: a6.dh */
/* loaded from: classes2.dex */
public final class C0219dh extends AbstractC0144a implements InterfaceC0257fh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0219dh(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }

    @Override // p012a6.InterfaceC0257fh
    /* renamed from: O4 */
    public final C0200ch mo659O4(InterfaceC4271b interfaceC4271b, zzsi zzsiVar) {
        C0200ch c0200ch;
        Parcel m606E = m606E();
        AbstractC0165b1.m623b(m606E, interfaceC4271b);
        AbstractC0165b1.m622a(m606E, zzsiVar);
        Parcel m607N = m607N(2, m606E);
        IBinder readStrongBinder = m607N.readStrongBinder();
        if (readStrongBinder == null) {
            c0200ch = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            if (queryLocalInterface instanceof C0200ch) {
                c0200ch = (C0200ch) queryLocalInterface;
            } else {
                c0200ch = new C0200ch(readStrongBinder);
            }
        }
        m607N.recycle();
        return c0200ch;
    }

    @Override // p012a6.InterfaceC0257fh
    public final C0200ch zzd(InterfaceC4271b interfaceC4271b) {
        C0200ch c0200ch;
        Parcel m606E = m606E();
        AbstractC0165b1.m623b(m606E, interfaceC4271b);
        Parcel m607N = m607N(1, m606E);
        IBinder readStrongBinder = m607N.readStrongBinder();
        if (readStrongBinder == null) {
            c0200ch = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            if (queryLocalInterface instanceof C0200ch) {
                c0200ch = (C0200ch) queryLocalInterface;
            } else {
                c0200ch = new C0200ch(readStrongBinder);
            }
        }
        m607N.recycle();
        return c0200ch;
    }
}
