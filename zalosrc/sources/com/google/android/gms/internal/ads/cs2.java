package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzay;
import com.zing.zalo.zinstant.zom.node.ZOM;

/* loaded from: classes2.dex */
public abstract class cs2 {
    /* renamed from: a */
    public static zze m20996a(Throwable th2) {
        if (th2 instanceof zzehg) {
            zzehg zzehgVar = (zzehg) th2;
            return m20998c(zzehgVar.m28810a(), zzehgVar.m28811b());
        }
        if (th2 instanceof zzebh) {
            if (th2.getMessage() == null) {
                return m20999d(((zzebh) th2).m28810a(), null, null);
            }
            return m20999d(((zzebh) th2).m28810a(), th2.getMessage(), null);
        }
        if (th2 instanceof zzay) {
            zzay zzayVar = (zzay) th2;
            return new zze(zzayVar.zza(), z53.m28437c(zzayVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        }
        return m20999d(1, null, null);
    }

    /* renamed from: b */
    public static zze m20997b(Throwable th2, g32 g32Var) {
        zze zzeVar;
        zze m20996a = m20996a(th2);
        int i11 = m20996a.zza;
        if ((i11 == 3 || i11 == 0) && (zzeVar = m20996a.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            m20996a.zzd = null;
        }
        if (g32Var != null) {
            m20996a.zze = g32Var.m22269b();
        }
        return m20996a;
    }

    /* renamed from: c */
    public static zze m20998c(int i11, zze zzeVar) {
        if (i11 != 0) {
            if (i11 == 8) {
                if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21234e7)).intValue() <= 0) {
                    i11 = 8;
                } else {
                    return zzeVar;
                }
            }
            return m20999d(i11, null, zzeVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x005f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zze m20999d(int i11, String str, zze zzeVar) {
        String str2;
        String str3;
        if (str == null) {
            int i12 = i11 - 1;
            if (i11 != 0) {
                switch (i12) {
                    case 1:
                        str = "Invalid request.";
                        break;
                    case 2:
                        str2 = "No fill.";
                        break;
                    case 3:
                        str = "App ID missing.";
                        break;
                    case 4:
                        str = "Network error.";
                        break;
                    case 5:
                        str = "Invalid request: Invalid ad unit ID.";
                        break;
                    case 6:
                        str = "Invalid request: Invalid ad size.";
                        break;
                    case 7:
                        str = "A mediation adapter failed to show the ad.";
                        break;
                    case 8:
                        str = "The ad is not ready.";
                        break;
                    case 9:
                        str = "The ad has already been shown.";
                        break;
                    case 10:
                        str = "The ad can not be shown when app is not in foreground.";
                        break;
                    case 11:
                    default:
                        str = "Internal error.";
                        break;
                    case 12:
                        if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21264h7)).intValue() <= 0) {
                            str = "The mediation adapter did not return an ad.";
                            break;
                        }
                        str2 = "No fill.";
                        break;
                    case 13:
                        str = "Mismatch request IDs.";
                        break;
                    case 14:
                        str = "Invalid ad string.";
                        break;
                    case 15:
                        str = "Ad inspector had an internal error.";
                        break;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        str = "Ad inspector failed to load.";
                        break;
                    case 17:
                        str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                        break;
                    case 18:
                        str = "Ad inspector cannot be opened because it is already open.";
                        break;
                }
                int i13 = i11 - 1;
                if (i11 == 0) {
                    int i14 = 2;
                    switch (i13) {
                        case 0:
                        case 11:
                        case 15:
                            i14 = 0;
                            return new zze(i14, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                        case 1:
                        case 5:
                        case 6:
                        case 9:
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            i14 = 1;
                            return new zze(i14, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                        case 2:
                        case 10:
                        case 18:
                            i14 = 3;
                            return new zze(i14, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                        case 3:
                            i14 = 8;
                            return new zze(i14, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                        case 4:
                        case 8:
                        case 17:
                            return new zze(i14, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                        case 7:
                            i14 = 4;
                            return new zze(i14, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                        case 12:
                            if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21264h7)).intValue() <= 0) {
                                i14 = 9;
                                return new zze(i14, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                            }
                            i14 = 3;
                            return new zze(i14, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                        case 13:
                            i14 = 10;
                            return new zze(i14, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                        case 14:
                            i14 = 11;
                            return new zze(i14, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                        default:
                            switch (i11) {
                                case 1:
                                    str3 = "INTERNAL_ERROR";
                                    break;
                                case 2:
                                    str3 = "INVALID_REQUEST";
                                    break;
                                case 3:
                                    str3 = "NO_FILL";
                                    break;
                                case 4:
                                    str3 = "APP_ID_MISSING";
                                    break;
                                case 5:
                                    str3 = "NETWORK_ERROR";
                                    break;
                                case 6:
                                    str3 = "INVALID_AD_UNIT_ID";
                                    break;
                                case 7:
                                    str3 = "INVALID_AD_SIZE";
                                    break;
                                case 8:
                                    str3 = "MEDIATION_SHOW_ERROR";
                                    break;
                                case 9:
                                    str3 = "NOT_READY";
                                    break;
                                case 10:
                                    str3 = "AD_REUSED";
                                    break;
                                case 11:
                                    str3 = "APP_NOT_FOREGROUND";
                                    break;
                                case 12:
                                    str3 = "INTERNAL_SHOW_ERROR";
                                    break;
                                case 13:
                                    str3 = "MEDIATION_NO_FILL";
                                    break;
                                case 14:
                                    str3 = "REQUEST_ID_MISMATCH";
                                    break;
                                case 15:
                                    str3 = "INVALID_AD_STRING";
                                    break;
                                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                    str3 = "AD_INSPECTOR_INTERNAL_ERROR";
                                    break;
                                case 17:
                                    str3 = "AD_INSPECTOR_FAILED_TO_LOAD";
                                    break;
                                case 18:
                                    str3 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                                    break;
                                default:
                                    str3 = "AD_INSPECTOR_ALREADY_OPEN";
                                    break;
                            }
                            throw new AssertionError("Unknown SdkError: ".concat(str3));
                    }
                }
                throw null;
            }
            throw null;
        }
        str2 = str;
        int i132 = i11 - 1;
        if (i11 == 0) {
        }
    }
}
