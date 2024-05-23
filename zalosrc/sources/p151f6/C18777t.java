package p151f6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.VisibleRegion;
import p598w5.AbstractC28740a;
import p598w5.AbstractC28768z;

/* renamed from: f6.t */
/* loaded from: classes2.dex */
public final class C18777t extends AbstractC28740a implements InterfaceC18749d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C18777t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // p151f6.InterfaceC18749d
    /* renamed from: X0 */
    public final VisibleRegion mo98760X0() {
        Parcel m143867E = m143867E(3, m143868N());
        VisibleRegion visibleRegion = (VisibleRegion) AbstractC28768z.m143902a(m143867E, VisibleRegion.CREATOR);
        m143867E.recycle();
        return visibleRegion;
    }
}
