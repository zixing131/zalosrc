package p568v5;

import android.os.Parcel;
import com.google.android.gms.internal.location.zzaa;

/* renamed from: v5.d */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC27533d extends AbstractBinderC27537h implements InterfaceC27534e {
    public AbstractBinderC27533d() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // p568v5.AbstractBinderC27537h
    /* renamed from: E */
    protected final boolean mo93918E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            zzc();
        } else {
            mo93913I4((zzaa) AbstractC27554y.m140765b(parcel, zzaa.CREATOR));
        }
        return true;
    }
}
