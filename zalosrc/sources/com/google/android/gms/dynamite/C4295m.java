package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p538u5.AbstractC27034a;
import p538u5.AbstractC27036c;

/* renamed from: com.google.android.gms.dynamite.m */
/* loaded from: classes2.dex */
public final class C4295m extends AbstractC27034a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4295m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: I3 */
    public final int m19933I3(InterfaceC4271b interfaceC4271b, String str, boolean z11) {
        Parcel m139177N = m139177N();
        AbstractC27036c.m139182e(m139177N, interfaceC4271b);
        m139177N.writeString(str);
        AbstractC27036c.m139180c(m139177N, z11);
        Parcel m139176E = m139176E(5, m139177N);
        int readInt = m139176E.readInt();
        m139176E.recycle();
        return readInt;
    }

    /* renamed from: Q */
    public final int m19934Q(InterfaceC4271b interfaceC4271b, String str, boolean z11) {
        Parcel m139177N = m139177N();
        AbstractC27036c.m139182e(m139177N, interfaceC4271b);
        m139177N.writeString(str);
        AbstractC27036c.m139180c(m139177N, z11);
        Parcel m139176E = m139176E(3, m139177N);
        int readInt = m139176E.readInt();
        m139176E.recycle();
        return readInt;
    }

    /* renamed from: W4 */
    public final InterfaceC4271b m19935W4(InterfaceC4271b interfaceC4271b, String str, int i11) {
        Parcel m139177N = m139177N();
        AbstractC27036c.m139182e(m139177N, interfaceC4271b);
        m139177N.writeString(str);
        m139177N.writeInt(i11);
        Parcel m139176E = m139176E(2, m139177N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m139176E.readStrongBinder());
        m139176E.recycle();
        return m19911N;
    }

    /* renamed from: X4 */
    public final InterfaceC4271b m19936X4(InterfaceC4271b interfaceC4271b, String str, int i11, InterfaceC4271b interfaceC4271b2) {
        Parcel m139177N = m139177N();
        AbstractC27036c.m139182e(m139177N, interfaceC4271b);
        m139177N.writeString(str);
        m139177N.writeInt(i11);
        AbstractC27036c.m139182e(m139177N, interfaceC4271b2);
        Parcel m139176E = m139176E(8, m139177N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m139176E.readStrongBinder());
        m139176E.recycle();
        return m19911N;
    }

    /* renamed from: Y4 */
    public final InterfaceC4271b m19937Y4(InterfaceC4271b interfaceC4271b, String str, int i11) {
        Parcel m139177N = m139177N();
        AbstractC27036c.m139182e(m139177N, interfaceC4271b);
        m139177N.writeString(str);
        m139177N.writeInt(i11);
        Parcel m139176E = m139176E(4, m139177N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m139176E.readStrongBinder());
        m139176E.recycle();
        return m19911N;
    }

    /* renamed from: Z4 */
    public final InterfaceC4271b m19938Z4(InterfaceC4271b interfaceC4271b, String str, boolean z11, long j11) {
        Parcel m139177N = m139177N();
        AbstractC27036c.m139182e(m139177N, interfaceC4271b);
        m139177N.writeString(str);
        AbstractC27036c.m139180c(m139177N, z11);
        m139177N.writeLong(j11);
        Parcel m139176E = m139176E(7, m139177N);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m139176E.readStrongBinder());
        m139176E.recycle();
        return m19911N;
    }

    public final int zze() {
        Parcel m139176E = m139176E(6, m139177N());
        int readInt = m139176E.readInt();
        m139176E.recycle();
        return readInt;
    }
}
