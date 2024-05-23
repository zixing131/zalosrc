package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;
import p031b5.AbstractC2552a;
import p181g6.C19246l;
import p229i5.AbstractC20291l;

/* loaded from: classes2.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new C19246l();

    /* renamed from: p */
    private final String f33642p;

    public MapStyleOptions(String str) {
        AbstractC4205o.m19723l(str, "json must not be null");
        this.f33642p = str;
    }

    /* renamed from: t */
    public static MapStyleOptions m30714t(Context context, int i11) {
        try {
            return new MapStyleOptions(new String(AbstractC20291l.m105942d(context.getResources().openRawResource(i11)), "UTF-8"));
        } catch (IOException e11) {
            throw new Resources.NotFoundException("Failed to read resource " + i11 + ": " + e11.toString());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        String str = this.f33642p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, str, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
