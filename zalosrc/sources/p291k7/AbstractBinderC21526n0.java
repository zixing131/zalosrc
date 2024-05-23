package p291k7;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: k7.n0 */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC21526n0 extends AbstractBinderC21509h1 implements InterfaceC21529o0 {
    public AbstractBinderC21526n0() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // p291k7.AbstractBinderC21509h1
    /* renamed from: E */
    protected final boolean mo111157E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC21512i1.m111159a(parcel, Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                mo109517A1(readInt, bundle);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) AbstractC21512i1.m111159a(parcel, Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                mo109524g1(readInt2, bundle2);
                return true;
            case 4:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) AbstractC21512i1.m111159a(parcel, Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                mo109515I(readInt3, bundle3);
                return true;
            case 5:
                int readInt4 = parcel.readInt();
                Bundle bundle4 = (Bundle) AbstractC21512i1.m111159a(parcel, Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                mo109523d2(readInt4, bundle4);
                return true;
            case 6:
                Bundle bundle5 = (Bundle) AbstractC21512i1.m111159a(parcel, Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                mo109518A(bundle5);
                return true;
            case 7:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                mo109521V(createTypedArrayList);
                return true;
            case 8:
                Bundle bundle6 = (Bundle) AbstractC21512i1.m111159a(parcel, Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                mo109522X2(bundle6);
                return true;
            case 9:
                Bundle bundle7 = (Bundle) AbstractC21512i1.m111159a(parcel, Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                mo109520M(bundle7);
                return true;
            case 10:
                Bundle bundle8 = (Bundle) AbstractC21512i1.m111159a(parcel, Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                mo109525i1(bundle8);
                return true;
            case 11:
                Bundle bundle9 = (Bundle) AbstractC21512i1.m111159a(parcel, Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                zzk(bundle9);
                return true;
            case 12:
                Bundle bundle10 = (Bundle) AbstractC21512i1.m111159a(parcel, Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                mo109526v(bundle10);
                return true;
            case 13:
                Bundle bundle11 = (Bundle) AbstractC21512i1.m111159a(parcel, Bundle.CREATOR);
                AbstractC21512i1.m111160b(parcel);
                mo109519J(bundle11);
                return true;
            default:
                return false;
        }
    }
}
