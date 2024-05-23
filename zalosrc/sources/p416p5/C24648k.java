package p416p5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: p5.k */
/* loaded from: classes2.dex */
public final class C24648k extends AbstractC24638a implements InterfaceC24646i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C24648k(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // p416p5.InterfaceC24646i
    /* renamed from: G */
    public final Bundle mo128186G(String str, Bundle bundle) {
        Parcel m128180E = m128180E();
        m128180E.writeString(str);
        AbstractC24645h.m128185b(m128180E, bundle);
        Parcel m128181N = m128181N(2, m128180E);
        Bundle bundle2 = (Bundle) AbstractC24645h.m128184a(m128181N, Bundle.CREATOR);
        m128181N.recycle();
        return bundle2;
    }

    @Override // p416p5.InterfaceC24646i
    /* renamed from: t2 */
    public final Bundle mo128187t2(Account account, String str, Bundle bundle) {
        Parcel m128180E = m128180E();
        AbstractC24645h.m128185b(m128180E, account);
        m128180E.writeString(str);
        AbstractC24645h.m128185b(m128180E, bundle);
        Parcel m128181N = m128181N(5, m128180E);
        Bundle bundle2 = (Bundle) AbstractC24645h.m128184a(m128181N, Bundle.CREATOR);
        m128181N.recycle();
        return bundle2;
    }
}
