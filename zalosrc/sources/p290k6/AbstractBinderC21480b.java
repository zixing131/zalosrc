package p290k6;

import android.os.Parcel;
import com.google.android.gms.signin.internal.zak;
import p504s5.AbstractBinderC26134b;
import p504s5.AbstractC26135c;

/* renamed from: k6.b */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC21480b extends AbstractBinderC26134b implements InterfaceC21481c {
    public AbstractBinderC21480b() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p504s5.AbstractBinderC26134b
    /* renamed from: W4 */
    protected final boolean mo98724W4(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 3:
                AbstractC26135c.m134502b(parcel);
                break;
            case 4:
                AbstractC26135c.m134502b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC26135c.m134502b(parcel);
                break;
            case 7:
                AbstractC26135c.m134502b(parcel);
                break;
            case 8:
                zak zakVar = (zak) AbstractC26135c.m134501a(parcel, zak.CREATOR);
                AbstractC26135c.m134502b(parcel);
                mo19558u0(zakVar);
                break;
            case 9:
                AbstractC26135c.m134502b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
