package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public abstract class k70 {

    /* renamed from: a */
    private static final ArrayList f23175a = new ArrayList();

    /* renamed from: b */
    private static final Pattern f23176b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m23843a(String str, String str2) {
        char c11;
        l60 m23845c;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (m23845c = m23845c(str2)) == null) {
                    return 0;
                }
                return m23845c.m24135a();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static int m23844b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m23849g(str)) {
            return 1;
        }
        if (!m23850h(str)) {
            if (!"text".equals(m23851i(str)) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
                if ("image".equals(m23851i(str))) {
                    return 4;
                }
                if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
                    if (!"application/x-camera-motion".equals(str)) {
                        ArrayList arrayList = f23175a;
                        if (arrayList.size() <= 0) {
                            return -1;
                        }
                        AbstractC30228a.m149044a(arrayList.get(0));
                        throw null;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 2;
    }

    /* renamed from: c */
    static l60 m23845c(String str) {
        int i11;
        Matcher matcher = f23176b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i11 = Integer.parseInt(group2);
            } else {
                i11 = 0;
            }
            return new l60(parseInt, i11);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static String m23846d(int i11) {
        if (i11 == 32) {
            return "video/mp4v-es";
        }
        if (i11 == 33) {
            return "video/avc";
        }
        if (i11 == 35) {
            return "video/hevc";
        }
        if (i11 == 64) {
            return "audio/mp4a-latm";
        }
        if (i11 == 163) {
            return "video/wvc1";
        }
        if (i11 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i11 == 165) {
            return "audio/ac3";
        }
        if (i11 == 166) {
            return "audio/eac3";
        }
        switch (i11) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i11) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: e */
    public static String m23847e(String str) {
        char c11;
        int hashCode = str.hashCode();
        if (hashCode == -1007807498) {
            if (str.equals("audio/x-flac")) {
                c11 = 0;
            }
            c11 = 65535;
        } else if (hashCode != -586683234) {
            if (hashCode == 187090231 && str.equals("audio/mp3")) {
                c11 = 1;
            }
            c11 = 65535;
        } else {
            if (str.equals("audio/x-wav")) {
                c11 = 2;
            }
            c11 = 65535;
        }
        return c11 != 0 ? c11 != 1 ? c11 != 2 ? str : "audio/wav" : "audio/mpeg" : "audio/flac";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: f */
    public static boolean m23848f(String str, String str2) {
        char c11;
        l60 m23845c;
        int m24135a;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                if (str2 == null || (m23845c = m23845c(str2)) == null || (m24135a = m23845c.m24135a()) == 0 || m24135a == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: g */
    public static boolean m23849g(String str) {
        return "audio".equals(m23851i(str));
    }

    /* renamed from: h */
    public static boolean m23850h(String str) {
        return "video".equals(m23851i(str));
    }

    /* renamed from: i */
    private static String m23851i(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
