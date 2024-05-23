package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes2.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f6203a = versionedParcel.m11143p(iconCompat.f6203a, 1);
        iconCompat.f6205c = versionedParcel.m11137j(iconCompat.f6205c, 2);
        iconCompat.f6206d = versionedParcel.m11145r(iconCompat.f6206d, 3);
        iconCompat.f6207e = versionedParcel.m11143p(iconCompat.f6207e, 4);
        iconCompat.f6208f = versionedParcel.m11143p(iconCompat.f6208f, 5);
        iconCompat.f6209g = (ColorStateList) versionedParcel.m11145r(iconCompat.f6209g, 6);
        iconCompat.f6211i = versionedParcel.m11147t(iconCompat.f6211i, 7);
        iconCompat.f6212j = versionedParcel.m11147t(iconCompat.f6212j, 8);
        iconCompat.m7164p();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.m11151x(true, true);
        iconCompat.m7165q(versionedParcel.m11133f());
        int i11 = iconCompat.f6203a;
        if (-1 != i11) {
            versionedParcel.m11123F(i11, 1);
        }
        byte[] bArr = iconCompat.f6205c;
        if (bArr != null) {
            versionedParcel.m11119B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f6206d;
        if (parcelable != null) {
            versionedParcel.m11125H(parcelable, 3);
        }
        int i12 = iconCompat.f6207e;
        if (i12 != 0) {
            versionedParcel.m11123F(i12, 4);
        }
        int i13 = iconCompat.f6208f;
        if (i13 != 0) {
            versionedParcel.m11123F(i13, 5);
        }
        ColorStateList colorStateList = iconCompat.f6209g;
        if (colorStateList != null) {
            versionedParcel.m11125H(colorStateList, 6);
        }
        String str = iconCompat.f6211i;
        if (str != null) {
            versionedParcel.m11127J(str, 7);
        }
        String str2 = iconCompat.f6212j;
        if (str2 != null) {
            versionedParcel.m11127J(str2, 8);
        }
    }
}
