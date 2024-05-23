package p051c7;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: c7.m */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC3318m extends AbstractBinderC3313h implements InterfaceC3319n {
    public AbstractBinderC3318m() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // p051c7.AbstractBinderC3313h
    /* renamed from: E */
    protected final boolean mo16780E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 2) {
            if (i11 != 3) {
                return false;
            }
            Bundle bundle = (Bundle) AbstractC3314i.m16781a(parcel, Bundle.CREATOR);
            AbstractC3314i.m16782b(parcel);
            mo16788w(bundle);
            return true;
        }
        Bundle bundle2 = (Bundle) AbstractC3314i.m16781a(parcel, Bundle.CREATOR);
        AbstractC3314i.m16782b(parcel);
        mo16787M(bundle2);
        return true;
    }
}
