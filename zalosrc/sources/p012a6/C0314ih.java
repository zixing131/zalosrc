package p012a6;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsk;
import java.util.ArrayList;

/* renamed from: a6.ih */
/* loaded from: classes2.dex */
public final class C0314ih implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        Rect rect = null;
        ArrayList arrayList = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 2:
                    rect = (Rect) SafeParcelReader.m19782o(parcel, m19755D, Rect.CREATOR);
                    break;
                case 3:
                    arrayList = SafeParcelReader.m19787t(parcel, m19755D, Point.CREATOR);
                    break;
                case 4:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 6:
                    f12 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 7:
                    arrayList2 = SafeParcelReader.m19787t(parcel, m19755D, zzsk.CREATOR);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzsc(str, rect, arrayList, str2, f11, f12, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzsc[i11];
    }
}
