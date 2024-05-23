package p093d6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p568v5.AbstractBinderC27537h;
import p568v5.AbstractC27554y;

/* renamed from: d6.r */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC17783r extends AbstractBinderC27537h implements InterfaceC17784s {
    public AbstractBinderC17783r() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: N */
    public static InterfaceC17784s m93917N(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof InterfaceC17784s) {
            return (InterfaceC17784s) queryLocalInterface;
        }
        return new C17782q(iBinder);
    }

    @Override // p568v5.AbstractBinderC27537h
    /* renamed from: E */
    protected final boolean mo93918E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            mo28842P0((LocationAvailability) AbstractC27554y.m140765b(parcel, LocationAvailability.CREATOR));
        } else {
            mo28841M2((LocationResult) AbstractC27554y.m140765b(parcel, LocationResult.CREATOR));
        }
        return true;
    }
}
