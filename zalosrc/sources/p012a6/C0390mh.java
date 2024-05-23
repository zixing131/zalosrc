package p012a6;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsk;
import java.util.ArrayList;

/* renamed from: a6.mh */
/* loaded from: classes2.dex */
public final class C0390mh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        Rect rect = null;
        ArrayList arrayList = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        if (m19789v != 4) {
                            if (m19789v != 5) {
                                SafeParcelReader.m19764M(parcel, m19755D);
                            } else {
                                f12 = SafeParcelReader.m19753B(parcel, m19755D);
                            }
                        } else {
                            f11 = SafeParcelReader.m19753B(parcel, m19755D);
                        }
                    } else {
                        arrayList = SafeParcelReader.m19787t(parcel, m19755D, Point.CREATOR);
                    }
                } else {
                    rect = (Rect) SafeParcelReader.m19782o(parcel, m19755D, Rect.CREATOR);
                }
            } else {
                str = SafeParcelReader.m19783p(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzsk(str, rect, arrayList, f11, f12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzsk[i11];
    }
}
