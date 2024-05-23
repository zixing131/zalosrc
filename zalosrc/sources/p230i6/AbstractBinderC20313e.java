package p230i6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC5535p0;
import com.google.android.gms.internal.measurement.AbstractC5552q0;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzq;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.List;

/* renamed from: i6.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC20313e extends AbstractBinderC5535p0 implements InterfaceC20314f {
    public AbstractBinderC20313e() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC5535p0
    /* renamed from: E */
    protected final boolean mo29114E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 1:
                zzaw zzawVar = (zzaw) AbstractC5552q0.m29542a(parcel, zzaw.CREATOR);
                zzq zzqVar = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                mo30903b1(zzawVar, zzqVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzli zzliVar = (zzli) AbstractC5552q0.m29542a(parcel, zzli.CREATOR);
                zzq zzqVar2 = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                mo30900X1(zzliVar, zzqVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                zzq zzqVar3 = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                mo30904f1(zzqVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzaw zzawVar2 = (zzaw) AbstractC5552q0.m29542a(parcel, zzaw.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC5552q0.m29544c(parcel);
                mo31026Z3(zzawVar2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzq zzqVar4 = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                mo30893D2(zzqVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzq zzqVar5 = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                boolean m29547f = AbstractC5552q0.m29547f(parcel);
                AbstractC5552q0.m29544c(parcel);
                List mo31028k0 = mo31028k0(zzqVar5, m29547f);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo31028k0);
                return true;
            case 9:
                zzaw zzawVar3 = (zzaw) AbstractC5552q0.m29542a(parcel, zzaw.CREATOR);
                String readString3 = parcel.readString();
                AbstractC5552q0.m29544c(parcel);
                byte[] mo30899U2 = mo30899U2(zzawVar3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(mo30899U2);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                AbstractC5552q0.m29544c(parcel);
                mo30906l1(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzq zzqVar6 = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                String mo30902a3 = mo30902a3(zzqVar6);
                parcel2.writeNoException();
                parcel2.writeString(mo30902a3);
                return true;
            case 12:
                zzac zzacVar = (zzac) AbstractC5552q0.m29542a(parcel, zzac.CREATOR);
                zzq zzqVar7 = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                mo30907z4(zzacVar, zzqVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzac zzacVar2 = (zzac) AbstractC5552q0.m29542a(parcel, zzac.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                mo31027i0(zzacVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean m29547f2 = AbstractC5552q0.m29547f(parcel);
                zzq zzqVar8 = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                List mo30898N1 = mo30898N1(readString7, readString8, m29547f2, zzqVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo30898N1);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean m29547f3 = AbstractC5552q0.m29547f(parcel);
                AbstractC5552q0.m29544c(parcel);
                List mo30896K2 = mo30896K2(readString9, readString10, readString11, m29547f3);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo30896K2);
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzq zzqVar9 = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                List mo30897M3 = mo30897M3(readString12, readString13, zzqVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo30897M3);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                AbstractC5552q0.m29544c(parcel);
                List mo30905g3 = mo30905g3(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo30905g3);
                return true;
            case 18:
                zzq zzqVar10 = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                mo30901Y1(zzqVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
                zzq zzqVar11 = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                mo30895I2(bundle, zzqVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzq zzqVar12 = (zzq) AbstractC5552q0.m29542a(parcel, zzq.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                mo30894H1(zzqVar12);
                parcel2.writeNoException();
                return true;
        }
    }
}
