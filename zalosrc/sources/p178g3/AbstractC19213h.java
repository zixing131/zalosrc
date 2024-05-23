package p178g3;

import com.adtima.ads.ZAdsBannerSize;
import p009a3.C0098c;
import p227i3.AbstractC20202f;

/* renamed from: g3.h */
/* loaded from: classes2.dex */
public abstract class AbstractC19213h {
    /* renamed from: a */
    public static C0098c m100830a(ZAdsBannerSize zAdsBannerSize, C0098c c0098c) {
        try {
            c0098c.f499c = m100834e(zAdsBannerSize, c0098c.f499c);
            c0098c.f529r = m100834e(zAdsBannerSize, c0098c.f529r);
            c0098c.f503e = m100831b(zAdsBannerSize, c0098c.f503e);
            c0098c.f501d = m100833d(zAdsBannerSize, c0098c.f501d);
            c0098c.f535u = m100833d(zAdsBannerSize, c0098c.f535u);
            c0098c.f527q = m100833d(zAdsBannerSize, c0098c.f527q);
            c0098c.f533t = m100833d(zAdsBannerSize, c0098c.f533t);
            c0098c.f531s = m100833d(zAdsBannerSize, c0098c.f531s);
        } catch (Exception unused) {
        }
        return c0098c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[Catch: Exception -> 0x004b, TRY_LEAVE, TryCatch #0 {Exception -> 0x004b, blocks: (B:5:0x0002, B:8:0x0009, B:10:0x0011, B:11:0x0013, B:12:0x0026, B:13:0x002a, B:15:0x0035, B:20:0x0018, B:22:0x001c, B:23:0x001f, B:25:0x0023), top: B:4:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m100831b(ZAdsBannerSize zAdsBannerSize, String str) {
        int i11;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    int length = str.length();
                    if (zAdsBannerSize == ZAdsBannerSize.R31_RECTANGLE) {
                        i11 = AbstractC20202f.f99849z;
                    } else {
                        if (zAdsBannerSize != ZAdsBannerSize.MEDIUM_RECTANGLE) {
                            if (zAdsBannerSize == ZAdsBannerSize.FULL_PAGE) {
                                i11 = AbstractC20202f.f99780H;
                            }
                            String substring = str.substring(0, length);
                            if (length < str.length()) {
                                return substring;
                            }
                            return substring + "...";
                        }
                        i11 = AbstractC20202f.f99776D;
                    }
                    length = Math.min(i11, str.length());
                    String substring2 = str.substring(0, length);
                    if (length < str.length()) {
                    }
                }
            } catch (Exception unused) {
                return str;
            }
        }
        return "Xem thêm";
    }

    /* renamed from: c */
    public static String m100832c(String str) {
        try {
            return str.replace("\n", " ").replace("  ", " ");
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:6:0x0004, B:8:0x000a, B:10:0x0012, B:11:0x0014, B:12:0x0027, B:13:0x002b, B:15:0x0036, B:17:0x0044, B:18:0x004c, B:23:0x0019, B:25:0x001d, B:26:0x0020, B:28:0x0024), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m100833d(ZAdsBannerSize zAdsBannerSize, String str) {
        int i11;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    int length = str.length();
                    if (zAdsBannerSize == ZAdsBannerSize.R31_RECTANGLE) {
                        i11 = AbstractC20202f.f99845x;
                    } else {
                        if (zAdsBannerSize != ZAdsBannerSize.MEDIUM_RECTANGLE) {
                            if (zAdsBannerSize == ZAdsBannerSize.FULL_PAGE) {
                                i11 = AbstractC20202f.f99778F;
                            }
                            String substring = str.substring(0, length);
                            if (length < str.length()) {
                                return substring;
                            }
                            if (!Character.toString(str.charAt(length)).equals(" ")) {
                                substring = substring.substring(0, substring.lastIndexOf(" "));
                            }
                            return substring + "...";
                        }
                        i11 = AbstractC20202f.f99774B;
                    }
                    length = Math.min(i11, str.length());
                    String substring2 = str.substring(0, length);
                    if (length < str.length()) {
                    }
                }
            } catch (Exception unused) {
                return str;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:6:0x0004, B:8:0x000a, B:10:0x0012, B:11:0x0014, B:12:0x0027, B:13:0x002b, B:15:0x0036, B:17:0x0044, B:18:0x004c, B:23:0x0019, B:25:0x001d, B:26:0x0020, B:28:0x0024), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m100834e(ZAdsBannerSize zAdsBannerSize, String str) {
        int i11;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    int length = str.length();
                    if (zAdsBannerSize == ZAdsBannerSize.R31_RECTANGLE) {
                        i11 = AbstractC20202f.f99843w;
                    } else {
                        if (zAdsBannerSize != ZAdsBannerSize.MEDIUM_RECTANGLE) {
                            if (zAdsBannerSize == ZAdsBannerSize.FULL_PAGE) {
                                i11 = AbstractC20202f.f99777E;
                            }
                            String substring = str.substring(0, length);
                            if (length < str.length()) {
                                return substring;
                            }
                            if (!Character.toString(str.charAt(length)).equals(" ")) {
                                substring = substring.substring(0, substring.lastIndexOf(" "));
                            }
                            return substring + "...";
                        }
                        i11 = AbstractC20202f.f99773A;
                    }
                    length = Math.min(i11, str.length());
                    String substring2 = str.substring(0, length);
                    if (length < str.length()) {
                    }
                }
            } catch (Exception unused) {
                return str;
            }
        }
        return "";
    }
}
