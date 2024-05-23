package p598w5;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* renamed from: w5.a0 */
/* loaded from: classes2.dex */
public final class C28741a0 extends AbstractC28740a implements InterfaceC28745c0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C28741a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // p598w5.InterfaceC28745c0
    /* renamed from: n */
    public final InterfaceC4271b mo143870n(int i11) {
        Parcel m143868N = m143868N();
        m143868N.writeInt(i11);
        Parcel m143867E = m143867E(1, m143868N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m143867E.readStrongBinder());
        m143867E.recycle();
        return m19911N;
    }

    @Override // p598w5.InterfaceC28745c0
    /* renamed from: y0 */
    public final InterfaceC4271b mo143871y0(Bitmap bitmap) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143904c(m143868N, bitmap);
        Parcel m143867E = m143867E(6, m143868N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m143867E.readStrongBinder());
        m143867E.recycle();
        return m19911N;
    }
}
