package p356n5;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: n5.d */
/* loaded from: classes2.dex */
public final class C23561d extends AbstractC23558a implements InterfaceC23563f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C23561d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // p356n5.InterfaceC23563f
    /* renamed from: q */
    public final boolean mo123629q(boolean z11) {
        Parcel m123625E = m123625E();
        AbstractC23560c.m123627a(m123625E, true);
        Parcel m123626N = m123626N(2, m123625E);
        boolean m123628b = AbstractC23560c.m123628b(m123626N);
        m123626N.recycle();
        return m123628b;
    }

    @Override // p356n5.InterfaceC23563f
    public final String zzc() {
        Parcel m123626N = m123626N(1, m123625E());
        String readString = m123626N.readString();
        m123626N.recycle();
        return readString;
    }

    @Override // p356n5.InterfaceC23563f
    public final boolean zzd() {
        Parcel m123626N = m123626N(6, m123625E());
        boolean m123628b = AbstractC23560c.m123628b(m123626N);
        m123626N.recycle();
        return m123628b;
    }
}
