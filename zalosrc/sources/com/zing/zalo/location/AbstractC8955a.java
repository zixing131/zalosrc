package com.zing.zalo.location;

import com.google.android.gms.common.C4070a;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.zing.zalo.AbstractC8012e0;
import com.zing.zalo.MainApplication;

/* renamed from: com.zing.zalo.location.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8955a {

    /* renamed from: a */
    public static final MapStyleOptions f47897a = MapStyleOptions.m30714t(MainApplication.getAppContext(), AbstractC8012e0.google_map_style);

    /* renamed from: b */
    public static final MapStyleOptions f47898b = MapStyleOptions.m30714t(MainApplication.getAppContext(), AbstractC8012e0.custom_google_map_style);

    /* renamed from: a */
    public static boolean m47863a() {
        try {
            if (C4070a.m19196p().mo19200i(MainApplication.getAppContext()) == 0) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }
}
