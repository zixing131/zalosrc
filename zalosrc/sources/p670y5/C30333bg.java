package p670y5;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.zing.zalo.zinstant.zom.node.ZOM;

/* renamed from: y5.bg */
/* loaded from: classes2.dex */
public final class C30333bg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        double d11 = 0.0d;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        zzj zzjVar = null;
        zzm zzmVar = null;
        zzn zznVar = null;
        zzp zzpVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzg zzgVar = null;
        zzh zzhVar = null;
        zzi zziVar = null;
        byte[] bArr = null;
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 3:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 6:
                    pointArr = (Point[]) SafeParcelReader.m19786s(parcel, m19755D, Point.CREATOR);
                    break;
                case 7:
                    zzjVar = (zzj) SafeParcelReader.m19782o(parcel, m19755D, zzj.CREATOR);
                    break;
                case 8:
                    zzmVar = (zzm) SafeParcelReader.m19782o(parcel, m19755D, zzm.CREATOR);
                    break;
                case 9:
                    zznVar = (zzn) SafeParcelReader.m19782o(parcel, m19755D, zzn.CREATOR);
                    break;
                case 10:
                    zzpVar = (zzp) SafeParcelReader.m19782o(parcel, m19755D, zzp.CREATOR);
                    break;
                case 11:
                    zzoVar = (zzo) SafeParcelReader.m19782o(parcel, m19755D, zzo.CREATOR);
                    break;
                case 12:
                    zzkVar = (zzk) SafeParcelReader.m19782o(parcel, m19755D, zzk.CREATOR);
                    break;
                case 13:
                    zzgVar = (zzg) SafeParcelReader.m19782o(parcel, m19755D, zzg.CREATOR);
                    break;
                case 14:
                    zzhVar = (zzh) SafeParcelReader.m19782o(parcel, m19755D, zzh.CREATOR);
                    break;
                case 15:
                    zziVar = (zzi) SafeParcelReader.m19782o(parcel, m19755D, zzi.CREATOR);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    bArr = SafeParcelReader.m19774g(parcel, m19755D);
                    break;
                case 17:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 18:
                    d11 = SafeParcelReader.m19793z(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzq(i11, str, str2, i12, pointArr, zzjVar, zzmVar, zznVar, zzpVar, zzoVar, zzkVar, zzgVar, zzhVar, zziVar, bArr, z11, d11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzq[i11];
    }
}
