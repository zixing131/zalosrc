package p181g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;

/* renamed from: g6.g */
/* loaded from: classes2.dex */
public final class C19241g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        double d11 = 0.0d;
        StrokeStyle strokeStyle = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 2) {
                if (m19789v != 3) {
                    SafeParcelReader.m19764M(parcel, m19755D);
                } else {
                    d11 = SafeParcelReader.m19793z(parcel, m19755D);
                }
            } else {
                strokeStyle = (StrokeStyle) SafeParcelReader.m19782o(parcel, m19755D, StrokeStyle.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new StyleSpan(strokeStyle, d11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new StyleSpan[i11];
    }
}
