package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p538u5.AbstractC27034a;
import p538u5.AbstractC27036c;

/* renamed from: com.google.android.gms.dynamite.n */
/* loaded from: classes2.dex */
public final class C4296n extends AbstractC27034a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4296n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: I3 */
    public final InterfaceC4271b m19939I3(InterfaceC4271b interfaceC4271b, String str, int i11, InterfaceC4271b interfaceC4271b2) {
        Parcel m139177N = m139177N();
        AbstractC27036c.m139182e(m139177N, interfaceC4271b);
        m139177N.writeString(str);
        m139177N.writeInt(i11);
        AbstractC27036c.m139182e(m139177N, interfaceC4271b2);
        Parcel m139176E = m139176E(3, m139177N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m139176E.readStrongBinder());
        m139176E.recycle();
        return m19911N;
    }

    /* renamed from: Q */
    public final InterfaceC4271b m19940Q(InterfaceC4271b interfaceC4271b, String str, int i11, InterfaceC4271b interfaceC4271b2) {
        Parcel m139177N = m139177N();
        AbstractC27036c.m139182e(m139177N, interfaceC4271b);
        m139177N.writeString(str);
        m139177N.writeInt(i11);
        AbstractC27036c.m139182e(m139177N, interfaceC4271b2);
        Parcel m139176E = m139176E(2, m139177N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m139176E.readStrongBinder());
        m139176E.recycle();
        return m19911N;
    }
}
