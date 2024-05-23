package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.zing.zalo.zinstant.zom.node.ZOM;

/* loaded from: classes2.dex */
public abstract class ob0 extends AbstractBinderC4833og implements pb0 {
    public ob0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: N */
    public static pb0 m25112N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof pb0) {
            return (pb0) queryLocalInterface;
        }
        return new nb0(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0021. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        sb0 sb0Var = null;
        ib0 gb0Var = null;
        cb0 ab0Var = null;
        mb0 jb0Var = null;
        ib0 gb0Var2 = null;
        mb0 jb0Var2 = null;
        fb0 db0Var = null;
        cb0 ab0Var2 = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 10) {
                            if (i11 != 11) {
                                switch (i11) {
                                    case 13:
                                        String readString = parcel.readString();
                                        String readString2 = parcel.readString();
                                        zzl zzlVar = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                                        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                        IBinder readStrongBinder = parcel.readStrongBinder();
                                        if (readStrongBinder != null) {
                                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface instanceof cb0) {
                                                ab0Var2 = (cb0) queryLocalInterface;
                                            } else {
                                                ab0Var2 = new ab0(readStrongBinder);
                                            }
                                        }
                                        cb0 cb0Var = ab0Var2;
                                        ba0 m20041N = aa0.m20041N(parcel.readStrongBinder());
                                        zzq zzqVar = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
                                        AbstractC4871pg.m25456c(parcel);
                                        mo20064b0(readString, readString2, zzlVar, m19911N, cb0Var, m20041N, zzqVar);
                                        parcel2.writeNoException();
                                        break;
                                    case 14:
                                        String readString3 = parcel.readString();
                                        String readString4 = parcel.readString();
                                        zzl zzlVar2 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                                        InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                                        if (readStrongBinder2 != null) {
                                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                            if (queryLocalInterface2 instanceof fb0) {
                                                db0Var = (fb0) queryLocalInterface2;
                                            } else {
                                                db0Var = new db0(readStrongBinder2);
                                            }
                                        }
                                        fb0 fb0Var = db0Var;
                                        ba0 m20041N2 = aa0.m20041N(parcel.readStrongBinder());
                                        AbstractC4871pg.m25456c(parcel);
                                        mo20068n0(readString3, readString4, zzlVar2, m19911N2, fb0Var, m20041N2);
                                        parcel2.writeNoException();
                                        break;
                                    case 15:
                                        InterfaceC4271b m19911N3 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                        AbstractC4871pg.m25456c(parcel);
                                        boolean mo20063W0 = mo20063W0(m19911N3);
                                        parcel2.writeNoException();
                                        AbstractC4871pg.m25457d(parcel2, mo20063W0);
                                        break;
                                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                        String readString5 = parcel.readString();
                                        String readString6 = parcel.readString();
                                        zzl zzlVar3 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                                        InterfaceC4271b m19911N4 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                                        if (readStrongBinder3 != null) {
                                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface3 instanceof mb0) {
                                                jb0Var2 = (mb0) queryLocalInterface3;
                                            } else {
                                                jb0Var2 = new jb0(readStrongBinder3);
                                            }
                                        }
                                        mb0 mb0Var = jb0Var2;
                                        ba0 m20041N3 = aa0.m20041N(parcel.readStrongBinder());
                                        AbstractC4871pg.m25456c(parcel);
                                        mo20061Q1(readString5, readString6, zzlVar3, m19911N4, mb0Var, m20041N3);
                                        parcel2.writeNoException();
                                        break;
                                    case 17:
                                        InterfaceC4271b m19911N5 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                        AbstractC4871pg.m25456c(parcel);
                                        boolean mo20069r = mo20069r(m19911N5);
                                        parcel2.writeNoException();
                                        AbstractC4871pg.m25457d(parcel2, mo20069r);
                                        break;
                                    case 18:
                                        String readString7 = parcel.readString();
                                        String readString8 = parcel.readString();
                                        zzl zzlVar4 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                                        InterfaceC4271b m19911N6 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                                        if (readStrongBinder4 != null) {
                                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface4 instanceof ib0) {
                                                gb0Var2 = (ib0) queryLocalInterface4;
                                            } else {
                                                gb0Var2 = new gb0(readStrongBinder4);
                                            }
                                        }
                                        ib0 ib0Var = gb0Var2;
                                        ba0 m20041N4 = aa0.m20041N(parcel.readStrongBinder());
                                        AbstractC4871pg.m25456c(parcel);
                                        mo20062R2(readString7, readString8, zzlVar4, m19911N6, ib0Var, m20041N4);
                                        parcel2.writeNoException();
                                        break;
                                    case 19:
                                        String readString9 = parcel.readString();
                                        AbstractC4871pg.m25456c(parcel);
                                        mo20067l(readString9);
                                        parcel2.writeNoException();
                                        break;
                                    case 20:
                                        String readString10 = parcel.readString();
                                        String readString11 = parcel.readString();
                                        zzl zzlVar5 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                                        InterfaceC4271b m19911N7 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                                        if (readStrongBinder5 != null) {
                                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface5 instanceof mb0) {
                                                jb0Var = (mb0) queryLocalInterface5;
                                            } else {
                                                jb0Var = new jb0(readStrongBinder5);
                                            }
                                        }
                                        mb0 mb0Var2 = jb0Var;
                                        ba0 m20041N5 = aa0.m20041N(parcel.readStrongBinder());
                                        AbstractC4871pg.m25456c(parcel);
                                        mo20065c2(readString10, readString11, zzlVar5, m19911N7, mb0Var2, m20041N5);
                                        parcel2.writeNoException();
                                        break;
                                    case 21:
                                        String readString12 = parcel.readString();
                                        String readString13 = parcel.readString();
                                        zzl zzlVar6 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                                        InterfaceC4271b m19911N8 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                        IBinder readStrongBinder6 = parcel.readStrongBinder();
                                        if (readStrongBinder6 != null) {
                                            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface6 instanceof cb0) {
                                                ab0Var = (cb0) queryLocalInterface6;
                                            } else {
                                                ab0Var = new ab0(readStrongBinder6);
                                            }
                                        }
                                        cb0 cb0Var2 = ab0Var;
                                        ba0 m20041N6 = aa0.m20041N(parcel.readStrongBinder());
                                        zzq zzqVar2 = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
                                        AbstractC4871pg.m25456c(parcel);
                                        mo20060C0(readString12, readString13, zzlVar6, m19911N8, cb0Var2, m20041N6, zzqVar2);
                                        parcel2.writeNoException();
                                        break;
                                    case 22:
                                        String readString14 = parcel.readString();
                                        String readString15 = parcel.readString();
                                        zzl zzlVar7 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                                        InterfaceC4271b m19911N9 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                        IBinder readStrongBinder7 = parcel.readStrongBinder();
                                        if (readStrongBinder7 != null) {
                                            IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface7 instanceof ib0) {
                                                gb0Var = (ib0) queryLocalInterface7;
                                            } else {
                                                gb0Var = new gb0(readStrongBinder7);
                                            }
                                        }
                                        ib0 ib0Var2 = gb0Var;
                                        ba0 m20041N7 = aa0.m20041N(parcel.readStrongBinder());
                                        zzbls zzblsVar = (zzbls) AbstractC4871pg.m25454a(parcel, zzbls.CREATOR);
                                        AbstractC4871pg.m25456c(parcel);
                                        mo20070y1(readString14, readString15, zzlVar7, m19911N9, ib0Var2, m20041N7, zzblsVar);
                                        parcel2.writeNoException();
                                        break;
                                    default:
                                        return false;
                                }
                            } else {
                                parcel.createStringArray();
                                AbstractC4871pg.m25456c(parcel);
                                parcel2.writeNoException();
                            }
                        } else {
                            InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                            AbstractC4871pg.m25456c(parcel);
                            parcel2.writeNoException();
                        }
                    } else {
                        com.google.android.gms.ads.internal.client.zzdk zze = zze();
                        parcel2.writeNoException();
                        AbstractC4871pg.m25460g(parcel2, zze);
                    }
                } else {
                    zzbxq zzg = zzg();
                    parcel2.writeNoException();
                    AbstractC4871pg.m25459f(parcel2, zzg);
                }
            } else {
                zzbxq zzf = zzf();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zzf);
            }
        } else {
            InterfaceC4271b m19911N10 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
            String readString16 = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) AbstractC4871pg.m25454a(parcel, creator);
            Bundle bundle2 = (Bundle) AbstractC4871pg.m25454a(parcel, creator);
            zzq zzqVar3 = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
            IBinder readStrongBinder8 = parcel.readStrongBinder();
            if (readStrongBinder8 != null) {
                IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface8 instanceof sb0) {
                    sb0Var = (sb0) queryLocalInterface8;
                } else {
                    sb0Var = new qb0(readStrongBinder8);
                }
            }
            sb0 sb0Var2 = sb0Var;
            AbstractC4871pg.m25456c(parcel);
            mo20066c4(m19911N10, readString16, bundle, bundle2, zzqVar3, sb0Var2);
            parcel2.writeNoException();
        }
        return true;
    }
}
