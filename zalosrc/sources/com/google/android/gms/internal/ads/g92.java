package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class g92 {

    /* renamed from: a */
    public static final int f20474a;

    /* renamed from: b */
    public static final String f20475b;

    /* renamed from: c */
    public static final String f20476c;

    /* renamed from: d */
    public static final String f20477d;

    /* renamed from: e */
    public static final String f20478e;

    /* renamed from: f */
    public static final byte[] f20479f;

    /* renamed from: g */
    private static final Pattern f20480g;

    /* renamed from: h */
    private static final Pattern f20481h;

    /* renamed from: i */
    private static final Pattern f20482i;

    /* renamed from: j */
    private static final Pattern f20483j;

    /* renamed from: k */
    private static HashMap f20484k;

    /* renamed from: l */
    private static final String[] f20485l;

    /* renamed from: m */
    private static final String[] f20486m;

    /* renamed from: n */
    private static final int[] f20487n;

    /* renamed from: o */
    private static final int[] f20488o;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f20474a = i11;
        String str = Build.DEVICE;
        f20475b = str;
        String str2 = Build.MANUFACTURER;
        f20476c = str2;
        String str3 = Build.MODEL;
        f20477d = str3;
        f20478e = str + ", " + str3 + ", " + str2 + ", " + i11;
        f20479f = new byte[0];
        f20480g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f20481h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f20482i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f20483j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f20485l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f20486m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f20487n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f20488o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 243};
    }

    /* renamed from: A */
    public static float m22307A(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f11, f13));
    }

    /* renamed from: B */
    public static byte[] m22308B(String str) {
        return str.getBytes(w43.f29782c);
    }

    /* renamed from: C */
    public static byte[] m22309C(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: D */
    public static Object[] m22310D(Object[] objArr) {
        return objArr;
    }

    /* renamed from: E */
    public static Object[] m22311E(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    /* renamed from: F */
    public static Object[] m22312F(Object[] objArr, int i11) {
        boolean z11;
        if (i11 <= objArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27173d(z11);
        return Arrays.copyOf(objArr, i11);
    }

    /* renamed from: G */
    public static String[] m22313G() {
        String[] strArr;
        LocaleList locales;
        String languageTags;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f20474a >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            strArr = new String[]{m22356n(configuration.locale)};
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = m22358p(strArr[i11]);
        }
        return strArr;
    }

    /* renamed from: H */
    public static String[] m22314H(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: I */
    public static String[] m22315I(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: J */
    private static String m22316J(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e11) {
            lr1.m24354c("Util", "Failed to read system property ".concat(str), e11);
            return null;
        }
    }

    /* renamed from: K */
    private static HashMap m22317K() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f20485l.length;
        HashMap hashMap = new HashMap(length + 88);
        int i11 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f20485l;
            int length3 = strArr.length;
            if (i11 < 88) {
                hashMap.put(strArr[i11], strArr[i11 + 1]);
                i11 += 2;
            } else {
                return hashMap;
            }
        }
    }

    /* renamed from: L */
    public static int m22318L(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int binarySearch = Arrays.binarySearch(jArr, j11);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i11 = binarySearch + 1;
            if (i11 >= jArr.length || jArr[i11] != j11) {
                break;
            }
            binarySearch = i11;
        }
        if (!z11) {
            return i11;
        }
        return binarySearch;
    }

    /* renamed from: M */
    public static int m22319M(int[] iArr, int i11, boolean z11, boolean z12) {
        int i12;
        int i13;
        int binarySearch = Arrays.binarySearch(iArr, i11);
        if (binarySearch < 0) {
            i13 = -(binarySearch + 2);
        } else {
            while (true) {
                i12 = binarySearch - 1;
                if (i12 < 0 || iArr[i12] != i11) {
                    break;
                }
                binarySearch = i12;
            }
            if (z11) {
                i13 = binarySearch;
            } else {
                i13 = i12;
            }
        }
        if (z12) {
            return Math.max(0, i13);
        }
        return i13;
    }

    /* renamed from: N */
    public static int m22320N(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int binarySearch = Arrays.binarySearch(jArr, j11);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                int i12 = binarySearch - 1;
                if (i12 < 0 || jArr[i12] != j11) {
                    break;
                }
                binarySearch = i12;
            }
            i11 = binarySearch;
        }
        if (z12) {
            return Math.max(0, i11);
        }
        return i11;
    }

    /* renamed from: O */
    public static int m22321O(int i11, int i12) {
        return ((i11 + i12) - 1) / i12;
    }

    /* renamed from: P */
    public static int m22322P(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i11, i13));
    }

    /* renamed from: Q */
    public static int m22323Q(byte[] bArr, int i11, int i12, int i13) {
        int i14 = -1;
        for (int i15 = 0; i15 < i12; i15++) {
            i14 = f20487n[(i14 >>> 24) ^ (bArr[i15] & 255)] ^ (i14 << 8);
        }
        return i14;
    }

    /* renamed from: R */
    public static int m22324R(byte[] bArr, int i11, int i12, int i13) {
        int i14 = 0;
        while (i11 < i12) {
            i14 = f20488o[i14 ^ (bArr[i11] & 255)];
            i11++;
        }
        return i14;
    }

    /* renamed from: S */
    public static int m22325S(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: T */
    public static int m22326T(int i11) {
        if (i11 == 12) {
            return f20474a >= 32 ? 743676 : 0;
        }
        switch (i11) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i12 = f20474a;
                return (i12 < 23 && i12 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: U */
    public static int m22327U(ByteBuffer byteBuffer, int i11) {
        int i12 = byteBuffer.getInt(i11);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i12;
        }
        return Integer.reverseBytes(i12);
    }

    /* renamed from: V */
    public static int m22328V(int i11) {
        if (i11 == 2 || i11 == 4) {
            return 6005;
        }
        if (i11 == 10) {
            return 6004;
        }
        if (i11 == 7) {
            return 6005;
        }
        if (i11 == 8) {
            return 6003;
        }
        switch (i11) {
            case 15:
                return 6003;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i11) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* renamed from: W */
    public static int m22329W(String str) {
        String[] split;
        int length;
        boolean z11;
        int i11 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z11 = true;
        } else {
            z11 = false;
        }
        str2.getClass();
        try {
            i11 = Integer.parseInt(str2);
            if (z11) {
                return -i11;
            }
        } catch (NumberFormatException unused) {
        }
        return i11;
    }

    /* renamed from: X */
    public static int m22330X(int i11) {
        if (i11 == 8) {
            return 3;
        }
        if (i11 == 16) {
            return 2;
        }
        if (i11 != 24) {
            return i11 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: Y */
    public static int m22331Y(int i11, int i12) {
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 268435456) {
                        if (i11 != 536870912) {
                            if (i11 != 805306368) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            return i12 * 3;
                        }
                    }
                }
                return i12 * 4;
            }
            return i12;
        }
        return i12 + i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: Z */
    public static int m22332Z(Uri uri) {
        char c11;
        int i11;
        String scheme = uri.getScheme();
        if (scheme != null && q43.m25658c("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String m25656a = q43.m25656a(lastPathSegment.substring(lastIndexOf + 1));
            switch (m25656a.hashCode()) {
                case 104579:
                    if (m25656a.equals("ism")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 108321:
                    if (m25656a.equals("mpd")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3242057:
                    if (m25656a.equals("isml")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3299913:
                    if (m25656a.equals("m3u8")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            if (c11 != 0) {
                if (c11 != 1) {
                    if (c11 != 2 && c11 != 3) {
                        i11 = 4;
                    } else {
                        i11 = 1;
                    }
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 0;
            }
            if (i11 != 4) {
                return i11;
            }
        }
        Pattern pattern = f20483j;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public static Intent m22333a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Intent registerReceiver;
        if (f20474a >= 33) {
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, 4);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* renamed from: a0 */
    public static long m22334a0(long j11, long j12, long j13) {
        long j14 = j11 + j12;
        if (((j11 ^ j14) & (j12 ^ j14)) < 0) {
            return Long.MAX_VALUE;
        }
        return j14;
    }

    /* renamed from: b */
    public static Point m22335b(Context context) {
        Display display;
        Display.Mode mode;
        int physicalWidth;
        int physicalHeight;
        String m22316J;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m22366x(context)) {
            if (f20474a < 28) {
                m22316J = m22316J("sys.display-size");
            } else {
                m22316J = m22316J("vendor.display-size");
            }
            if (!TextUtils.isEmpty(m22316J)) {
                try {
                    String[] split = m22316J.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                lr1.m24353b("Util", "Invalid display size: ".concat(String.valueOf(m22316J)));
            }
            if ("Sony".equals(f20476c) && f20477d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f20474a >= 23) {
            mode = display.getMode();
            physicalWidth = mode.getPhysicalWidth();
            point.x = physicalWidth;
            physicalHeight = mode.getPhysicalHeight();
            point.y = physicalHeight;
            return point;
        }
        display.getRealSize(point);
        return point;
    }

    /* renamed from: b0 */
    public static long m22336b0(long j11, long j12, long j13) {
        return Math.max(j12, Math.min(j11, j13));
    }

    /* renamed from: c */
    public static Handler m22337c(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: c0 */
    public static long m22338c0(long j11, float f11) {
        if (f11 == 1.0f) {
            return j11;
        }
        return Math.round(j11 * f11);
    }

    /* renamed from: d */
    public static Handler m22339d(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        v71.m27171b(myLooper);
        return new Handler(myLooper, null);
    }

    /* renamed from: d0 */
    public static long m22340d0(long j11) {
        if (j11 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j11 + SystemClock.elapsedRealtime();
    }

    /* renamed from: e */
    public static Looper m22341e() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    /* renamed from: e0 */
    public static long m22342e0(long j11, float f11) {
        if (f11 == 1.0f) {
            return j11;
        }
        return Math.round(j11 / f11);
    }

    /* renamed from: f */
    public static C4671k3 m22343f(int i11, int i12, int i13) {
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26523s("audio/raw");
        c5004t1.m26506e0(i12);
        c5004t1.m26524t(i13);
        c5004t1.m26518n(i11);
        return c5004t1.m26529y();
    }

    /* renamed from: f0 */
    public static long m22344f0(long j11) {
        return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 * 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0068 A[ADDED_TO_REGION] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jg0 m22345g(jk0 jk0Var, jg0 jg0Var) {
        boolean z11;
        mr0 zzn;
        boolean z12;
        boolean m24700o;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean zzs = jk0Var.zzs();
        boolean zzc = jk0Var.zzc();
        e64 e64Var = (e64) jk0Var;
        mr0 zzn2 = e64Var.zzn();
        boolean z19 = true;
        if (!zzn2.m24700o()) {
            int zzf = e64Var.zzf();
            e64Var.zzj();
            e64Var.zzr();
            if (zzn2.mo23649k(zzf, 0, false) != -1) {
                z11 = true;
                zzn = e64Var.zzn();
                if (!zzn.m24700o()) {
                    int zzf2 = e64Var.zzf();
                    e64Var.zzj();
                    e64Var.zzr();
                    if (zzn.mo23648j(zzf2, 0, false) != -1) {
                        z12 = true;
                        boolean zzb = jk0Var.zzb();
                        boolean zza = jk0Var.zza();
                        m24700o = jk0Var.zzn().m24700o();
                        ne0 ne0Var = new ne0();
                        ne0Var.m24905b(jg0Var);
                        boolean z21 = !zzs;
                        ne0Var.m24907d(4, z21);
                        if (!zzc && !zzs) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ne0Var.m24907d(5, z13);
                        if (!z11 && !zzs) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ne0Var.m24907d(6, z14);
                        if (!m24700o || ((!z11 && zzb && !zzc) || zzs)) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        ne0Var.m24907d(7, z15);
                        if (!z12 && !zzs) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        ne0Var.m24907d(8, z16);
                        if (!m24700o || ((!z12 && (!zzb || !zza)) || zzs)) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        ne0Var.m24907d(9, z17);
                        ne0Var.m24907d(10, z21);
                        if (!zzc && !zzs) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        ne0Var.m24907d(11, z18);
                        if (zzc || zzs) {
                            z19 = false;
                        }
                        ne0Var.m24907d(12, z19);
                        return ne0Var.m24908e();
                    }
                }
                z12 = false;
                boolean zzb2 = jk0Var.zzb();
                boolean zza2 = jk0Var.zza();
                m24700o = jk0Var.zzn().m24700o();
                ne0 ne0Var2 = new ne0();
                ne0Var2.m24905b(jg0Var);
                boolean z212 = !zzs;
                ne0Var2.m24907d(4, z212);
                if (!zzc) {
                }
                z13 = false;
                ne0Var2.m24907d(5, z13);
                if (!z11) {
                }
                z14 = false;
                ne0Var2.m24907d(6, z14);
                if (!m24700o) {
                }
                z15 = false;
                ne0Var2.m24907d(7, z15);
                if (!z12) {
                }
                z16 = false;
                ne0Var2.m24907d(8, z16);
                if (!m24700o) {
                }
                z17 = false;
                ne0Var2.m24907d(9, z17);
                ne0Var2.m24907d(10, z212);
                if (!zzc) {
                }
                z18 = false;
                ne0Var2.m24907d(11, z18);
                if (zzc) {
                }
                z19 = false;
                ne0Var2.m24907d(12, z19);
                return ne0Var2.m24908e();
            }
        }
        z11 = false;
        zzn = e64Var.zzn();
        if (!zzn.m24700o()) {
        }
        z12 = false;
        boolean zzb22 = jk0Var.zzb();
        boolean zza22 = jk0Var.zza();
        m24700o = jk0Var.zzn().m24700o();
        ne0 ne0Var22 = new ne0();
        ne0Var22.m24905b(jg0Var);
        boolean z2122 = !zzs;
        ne0Var22.m24907d(4, z2122);
        if (!zzc) {
        }
        z13 = false;
        ne0Var22.m24907d(5, z13);
        if (!z11) {
        }
        z14 = false;
        ne0Var22.m24907d(6, z14);
        if (!m24700o) {
        }
        z15 = false;
        ne0Var22.m24907d(7, z15);
        if (!z12) {
        }
        z16 = false;
        ne0Var22.m24907d(8, z16);
        if (!m24700o) {
        }
        z17 = false;
        ne0Var22.m24907d(9, z17);
        ne0Var22.m24907d(10, z2122);
        if (!zzc) {
        }
        z18 = false;
        ne0Var22.m24907d(11, z18);
        if (zzc) {
        }
        z19 = false;
        ne0Var22.m24907d(12, z19);
        return ne0Var22.m24908e();
    }

    /* renamed from: g0 */
    public static long m22346g0(long j11, long j12, long j13) {
        if (j13 >= j12 && j13 % j12 == 0) {
            return j11 / (j13 / j12);
        }
        if (j13 < j12 && j12 % j13 == 0) {
            return j11 * (j12 / j13);
        }
        return (long) (j11 * (j12 / j13));
    }

    /* renamed from: h */
    public static Object m22347h(Object obj) {
        return obj;
    }

    /* renamed from: h0 */
    public static long m22348h0(long j11, long j12, long j13) {
        long j14 = j11 - j12;
        if (((j11 ^ j14) & (j12 ^ j11)) < 0) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    /* renamed from: i */
    public static String m22349i(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: i0 */
    public static long m22350i0(int i11, int i12) {
        return (i12 & 4294967295L) | ((i11 & 4294967295L) << 32);
    }

    /* renamed from: j */
    public static String m22351j(byte[] bArr, int i11, int i12) {
        return new String(bArr, i11, i12, w43.f29782c);
    }

    /* renamed from: j0 */
    public static long m22352j0(long j11) {
        return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 / 1000;
    }

    /* renamed from: k */
    public static String m22353k(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int length = objArr.length;
            if (i11 < length) {
                sb2.append(objArr[i11].getClass().getSimpleName());
                if (i11 < length - 1) {
                    sb2.append(", ");
                }
                i11++;
            } else {
                return sb2.toString();
            }
        }
    }

    /* renamed from: l */
    public static String m22354l(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return q43.m25657b(networkCountryIso);
            }
        }
        return q43.m25657b(Locale.getDefault().getCountry());
    }

    /* renamed from: m */
    public static String m22355m(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    /* renamed from: n */
    public static String m22356n(Locale locale) {
        if (f20474a >= 21) {
            return locale.toLanguageTag();
        }
        return locale.toString();
    }

    /* renamed from: o */
    public static String m22357o(int i11) {
        switch (i11) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    /* renamed from: p */
    public static String m22358p(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String m25656a = q43.m25656a(str);
        int i11 = 0;
        String str2 = m25656a.split("-", 2)[0];
        if (f20484k == null) {
            f20484k = m22317K();
        }
        String str3 = (String) f20484k.get(str2);
        if (str3 != null) {
            m25656a = str3.concat(String.valueOf(m25656a.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return m25656a;
        }
        while (true) {
            String[] strArr = f20486m;
            int length = strArr.length;
            if (i11 < 18) {
                if (m25656a.startsWith(strArr[i11])) {
                    return String.valueOf(strArr[i11 + 1]).concat(String.valueOf(m25656a.substring(strArr[i11].length())));
                }
                i11 += 2;
            } else {
                return m25656a;
            }
        }
    }

    /* renamed from: q */
    public static ExecutorService m22359q(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.b82

            /* renamed from: a */
            public final /* synthetic */ String f17667a;

            public /* synthetic */ b82(String str2) {
                r1 = str2;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, r1);
            }
        });
    }

    /* renamed from: r */
    public static void m22360r(long[] jArr, long j11, long j12) {
        int i11 = 0;
        if (j12 >= 1000000 && j12 % 1000000 == 0) {
            long j13 = j12 / 1000000;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] / j13;
                i11++;
            }
            return;
        }
        if (j12 < 1000000 && 1000000 % j12 == 0) {
            long j14 = 1000000 / j12;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] * j14;
                i11++;
            }
            return;
        }
        double d11 = 1000000.0d / j12;
        while (i11 < jArr.length) {
            jArr[i11] = (long) (jArr[i11] * d11);
            i11++;
        }
    }

    /* renamed from: s */
    public static void m22361s(Parcel parcel, boolean z11) {
        parcel.writeInt(z11 ? 1 : 0);
    }

    /* renamed from: t */
    public static boolean m22362t(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    /* renamed from: u */
    public static boolean m22363u(int i11) {
        return i11 == 536870912 || i11 == 805306368 || i11 == 4;
    }

    /* renamed from: v */
    public static boolean m22364v(int i11) {
        return i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 536870912 || i11 == 805306368 || i11 == 4;
    }

    /* renamed from: w */
    public static boolean m22365w(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public static boolean m22366x(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m22367y(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    /* renamed from: z */
    public static boolean m22368z(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
