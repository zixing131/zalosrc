package p670y5;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzse;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;

/* renamed from: y5.ch */
/* loaded from: classes2.dex */
public final class C30353ch implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzsf zzsfVar = null;
        zzsi zzsiVar = null;
        zzsj zzsjVar = null;
        zzsl zzslVar = null;
        zzsk zzskVar = null;
        zzsg zzsgVar = null;
        zzsc zzscVar = null;
        zzsd zzsdVar = null;
        zzse zzseVar = null;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 2:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 3:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    bArr = SafeParcelReader.m19774g(parcel, m19755D);
                    break;
                case 5:
                    pointArr = (Point[]) SafeParcelReader.m19786s(parcel, m19755D, Point.CREATOR);
                    break;
                case 6:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 7:
                    zzsfVar = (zzsf) SafeParcelReader.m19782o(parcel, m19755D, zzsf.CREATOR);
                    break;
                case 8:
                    zzsiVar = (zzsi) SafeParcelReader.m19782o(parcel, m19755D, zzsi.CREATOR);
                    break;
                case 9:
                    zzsjVar = (zzsj) SafeParcelReader.m19782o(parcel, m19755D, zzsj.CREATOR);
                    break;
                case 10:
                    zzslVar = (zzsl) SafeParcelReader.m19782o(parcel, m19755D, zzsl.CREATOR);
                    break;
                case 11:
                    zzskVar = (zzsk) SafeParcelReader.m19782o(parcel, m19755D, zzsk.CREATOR);
                    break;
                case 12:
                    zzsgVar = (zzsg) SafeParcelReader.m19782o(parcel, m19755D, zzsg.CREATOR);
                    break;
                case 13:
                    zzscVar = (zzsc) SafeParcelReader.m19782o(parcel, m19755D, zzsc.CREATOR);
                    break;
                case 14:
                    zzsdVar = (zzsd) SafeParcelReader.m19782o(parcel, m19755D, zzsd.CREATOR);
                    break;
                case 15:
                    zzseVar = (zzse) SafeParcelReader.m19782o(parcel, m19755D, zzse.CREATOR);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzsm(i11, str, str2, bArr, pointArr, i12, zzsfVar, zzsiVar, zzsjVar, zzslVar, zzskVar, zzsgVar, zzscVar, zzsdVar, zzseVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzsm[i11];
    }
}
