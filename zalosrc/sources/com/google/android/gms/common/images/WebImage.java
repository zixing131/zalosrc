package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new C4162c();

    /* renamed from: p */
    final int f16517p;

    /* renamed from: q */
    private final Uri f16518q;

    /* renamed from: r */
    private final int f16519r;

    /* renamed from: s */
    private final int f16520s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebImage(int i11, Uri uri, int i12, int i13) {
        this.f16517p = i11;
        this.f16518q = uri;
        this.f16519r = i12;
        this.f16520s = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (AbstractC4199m.m19701a(this.f16518q, webImage.f16518q) && this.f16519r == webImage.f16519r && this.f16520s == webImage.f16520s) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f16520s;
    }

    public int getWidth() {
        return this.f16519r;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f16518q, Integer.valueOf(this.f16519r), Integer.valueOf(this.f16520s));
    }

    /* renamed from: t */
    public Uri m19610t() {
        return this.f16518q;
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f16519r), Integer.valueOf(this.f16520s), this.f16518q.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16517p);
        AbstractC2552a.m12932u(parcel, 2, m19610t(), i11, false);
        AbstractC2552a.m12924m(parcel, 3, getWidth());
        AbstractC2552a.m12924m(parcel, 4, getHeight());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
