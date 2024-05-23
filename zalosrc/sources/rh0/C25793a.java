package rh0;

import android.os.Build;

/* renamed from: rh0.a */
/* loaded from: classes.dex */
public class C25793a {

    /* renamed from: a */
    private String f122987a = "Android";

    /* renamed from: b */
    private String f122988b = Build.VERSION.RELEASE;

    /* renamed from: c */
    private String f122989c = Build.VERSION.INCREMENTAL;

    /* renamed from: d */
    private String f122990d = Build.MANUFACTURER;

    /* renamed from: e */
    private String f122991e = Build.MODEL;

    /* renamed from: f */
    private String f122992f = "";

    /* renamed from: g */
    private String f122993g = "";

    /* renamed from: h */
    private String f122994h = "";

    /* renamed from: i */
    private String f122995i = System.getProperty("os.arch");

    /* renamed from: j */
    private String f122996j = System.getProperty("java.vm.version");

    public String toString() {
        return super.toString() + "DeviceInformation={osName=" + this.f122987a + ",osVersion=" + this.f122988b + ",osBuild=" + this.f122989c + ",manufacturer=" + this.f122990d + ",model=" + this.f122991e + ",appVersion=" + this.f122992f + ",countryCode=" + this.f122993g + ",regionCode=" + this.f122994h + ",architecture=" + this.f122995i + ",runTime=" + this.f122996j + "}";
    }
}
