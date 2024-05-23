package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class x90 extends AbstractBinderC4833og implements y90 {
    public x90() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        ba0 ba0Var = null;
        switch (i11) {
            case 1:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzq zzqVar = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
                zzl zzlVar = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof ba0) {
                        ba0Var = (ba0) queryLocalInterface;
                    } else {
                        ba0Var = new z90(readStrongBinder);
                    }
                }
                ba0 ba0Var2 = ba0Var;
                AbstractC4871pg.m25456c(parcel);
                mo26890J3(m19911N, zzqVar, zzlVar, readString, ba0Var2);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC4271b zzn = zzn();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzn);
                return true;
            case 3:
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzl zzlVar2 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof ba0) {
                        ba0Var = (ba0) queryLocalInterface2;
                    } else {
                        ba0Var = new z90(readStrongBinder2);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                mo26892S0(m19911N2, zzlVar2, readString2, ba0Var);
                parcel2.writeNoException();
                return true;
            case 4:
                mo26898e();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC4271b m19911N3 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
                zzl zzlVar3 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof ba0) {
                        ba0Var = (ba0) queryLocalInterface3;
                    } else {
                        ba0Var = new z90(readStrongBinder3);
                    }
                }
                ba0 ba0Var3 = ba0Var;
                AbstractC4871pg.m25456c(parcel);
                mo26902m1(m19911N3, zzqVar2, zzlVar3, readString3, readString4, ba0Var3);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC4271b m19911N4 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzl zzlVar4 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof ba0) {
                        ba0Var = (ba0) queryLocalInterface4;
                    } else {
                        ba0Var = new z90(readStrongBinder4);
                    }
                }
                ba0 ba0Var4 = ba0Var;
                AbstractC4871pg.m25456c(parcel);
                mo26907z0(m19911N4, zzlVar4, readString5, readString6, ba0Var4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzD();
                parcel2.writeNoException();
                return true;
            case 9:
                zzE();
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC4271b m19911N5 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzl zzlVar5 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                String readString7 = parcel.readString();
                ng0 m24562N = mg0.m24562N(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                mo26900i3(m19911N5, zzlVar5, readString7, m24562N, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                zzl zzlVar6 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                String readString9 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                mo26895a2(zzlVar6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                mo26899h();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean mo26906u = mo26906u();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, mo26906u);
                return true;
            case 14:
                InterfaceC4271b m19911N6 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzl zzlVar7 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof ba0) {
                        ba0Var = (ba0) queryLocalInterface5;
                    } else {
                        ba0Var = new z90(readStrongBinder5);
                    }
                }
                ba0 ba0Var5 = ba0Var;
                zzbls zzblsVar = (zzbls) AbstractC4871pg.m25454a(parcel, zzbls.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                AbstractC4871pg.m25456c(parcel);
                mo26893V0(m19911N6, zzlVar7, readString10, readString11, ba0Var5, zzblsVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, null);
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zzg);
                return true;
            case 20:
                zzl zzlVar8 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                mo26889J2(zzlVar8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                InterfaceC4271b m19911N7 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo26891P2(m19911N7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, false);
                return true;
            case 23:
                InterfaceC4271b m19911N8 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                ng0 m24562N2 = mg0.m24562N(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                AbstractC4871pg.m25456c(parcel);
                mo26903q0(m19911N8, m24562N2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                e10 zzi = zzi();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzi);
                return true;
            case 25:
                boolean m25461h = AbstractC4871pg.m25461h(parcel);
                AbstractC4871pg.m25456c(parcel);
                mo26904q1(m25461h);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdk zzh = zzh();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzh);
                return true;
            case 27:
                ka0 zzk = zzk();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzk);
                return true;
            case 28:
                InterfaceC4271b m19911N9 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzl zzlVar9 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof ba0) {
                        ba0Var = (ba0) queryLocalInterface6;
                    } else {
                        ba0Var = new z90(readStrongBinder6);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                mo26901l0(m19911N9, zzlVar9, readString14, ba0Var);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                InterfaceC4271b m19911N10 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo26897d4(m19911N10);
                parcel2.writeNoException();
                return true;
            case 31:
                InterfaceC4271b m19911N11 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                f60 m21620N = e60.m21620N(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbsa.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo26887G0(m19911N11, m21620N, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                InterfaceC4271b m19911N12 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzl zzlVar10 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof ba0) {
                        ba0Var = (ba0) queryLocalInterface7;
                    } else {
                        ba0Var = new z90(readStrongBinder7);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                mo26905s1(m19911N12, zzlVar10, readString15, ba0Var);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbxq zzl = zzl();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zzl);
                return true;
            case 34:
                zzbxq zzm = zzm();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zzm);
                return true;
            case 35:
                InterfaceC4271b m19911N13 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
                zzl zzlVar11 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof ba0) {
                        ba0Var = (ba0) queryLocalInterface8;
                    } else {
                        ba0Var = new z90(readStrongBinder8);
                    }
                }
                ba0 ba0Var6 = ba0Var;
                AbstractC4871pg.m25456c(parcel);
                mo26888I1(m19911N13, zzqVar3, zzlVar11, readString16, readString17, ba0Var6);
                parcel2.writeNoException();
                return true;
            case 36:
                ea0 zzj = zzj();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzj);
                return true;
            case 37:
                InterfaceC4271b m19911N14 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo26894X3(m19911N14);
                parcel2.writeNoException();
                return true;
        }
    }
}
