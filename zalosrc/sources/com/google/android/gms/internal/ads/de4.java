package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class de4 {

    /* renamed from: a */
    private static final Pattern f19197a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap f19198b = new HashMap();

    /* renamed from: c */
    private static int f19199c = -1;

    /* renamed from: d */
    public static final /* synthetic */ int f19200d = 0;

    /* renamed from: a */
    public static int m21353a() {
        int i11;
        int i12;
        int i13 = f19199c;
        if (i13 == -1) {
            hd4 m21355c = m21355c("video/avc", false, false);
            if (m21355c != null) {
                int i14 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m21355c.m22795g()) {
                    int i15 = codecProfileLevel.level;
                    if (i15 != 1 && i15 != 2) {
                        switch (i15) {
                            case 8:
                            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                i12 = 101376;
                                break;
                            case 64:
                                i12 = 202752;
                                break;
                            case 128:
                            case 256:
                                i12 = 414720;
                                break;
                            case 512:
                                i12 = 921600;
                                break;
                            case 1024:
                                i12 = 1310720;
                                break;
                            case ZVideoUtilMetadata.FF_PROFILE_H264_INTRA /* 2048 */:
                            case 4096:
                                i12 = 2097152;
                                break;
                            case 8192:
                                i12 = 2228224;
                                break;
                            case 16384:
                                i12 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i12 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i12 = 35651584;
                                break;
                            default:
                                i12 = -1;
                                break;
                        }
                    } else {
                        i12 = 25344;
                    }
                    i14 = Math.max(i12, i14);
                }
                if (g92.f20474a >= 21) {
                    i11 = 345600;
                } else {
                    i11 = 172800;
                }
                i13 = Math.max(i14, i11);
            } else {
                i13 = 0;
            }
            f19199c = i13;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c6 A[Catch: NumberFormatException -> 0x02d6, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x02d6, blocks: (B:126:0x026a, B:128:0x027c, B:139:0x0298, B:142:0x02c6), top: B:125:0x026a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f2  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m21354b(C4671k3 c4671k3) {
        char c11;
        int parseInt;
        int parseInt2;
        int i11;
        int i12;
        int i13;
        int i14;
        char c12;
        int i15;
        char c13;
        Integer num;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        char c14;
        Integer num2;
        Integer num3;
        String str = c4671k3.f23096i;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int i22 = 2;
        int i23 = 1;
        if ("video/dolby-vision".equals(c4671k3.f23099l)) {
            String str2 = c4671k3.f23096i;
            if (split.length < 3) {
                lr1.m24356e("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str2)));
            } else {
                Matcher matcher = f19197a.matcher(split[1]);
                if (!matcher.matches()) {
                    lr1.m24356e("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str2)));
                } else {
                    String group = matcher.group(1);
                    if (group != null) {
                        switch (group.hashCode()) {
                            case 1536:
                                if (group.equals("00")) {
                                    c14 = 0;
                                    break;
                                }
                                c14 = 65535;
                                break;
                            case 1537:
                                if (group.equals("01")) {
                                    c14 = 1;
                                    break;
                                }
                                c14 = 65535;
                                break;
                            case 1538:
                                if (group.equals("02")) {
                                    c14 = 2;
                                    break;
                                }
                                c14 = 65535;
                                break;
                            case 1539:
                                if (group.equals("03")) {
                                    c14 = 3;
                                    break;
                                }
                                c14 = 65535;
                                break;
                            case 1540:
                                if (group.equals("04")) {
                                    c14 = 4;
                                    break;
                                }
                                c14 = 65535;
                                break;
                            case 1541:
                                if (group.equals("05")) {
                                    c14 = 5;
                                    break;
                                }
                                c14 = 65535;
                                break;
                            case 1542:
                                if (group.equals("06")) {
                                    c14 = 6;
                                    break;
                                }
                                c14 = 65535;
                                break;
                            case 1543:
                                if (group.equals("07")) {
                                    c14 = 7;
                                    break;
                                }
                                c14 = 65535;
                                break;
                            case 1544:
                                if (group.equals("08")) {
                                    c14 = '\b';
                                    break;
                                }
                                c14 = 65535;
                                break;
                            case 1545:
                                if (group.equals("09")) {
                                    c14 = '\t';
                                    break;
                                }
                                c14 = 65535;
                                break;
                            default:
                                c14 = 65535;
                                break;
                        }
                        switch (c14) {
                            case 0:
                                num2 = 1;
                                break;
                            case 1:
                                num2 = 2;
                                break;
                            case 2:
                                num2 = 4;
                                break;
                            case 3:
                                num2 = 8;
                                break;
                            case 4:
                                num2 = 16;
                                break;
                            case 5:
                                num2 = 32;
                                break;
                            case 6:
                                num2 = 64;
                                break;
                            case 7:
                                num2 = 128;
                                break;
                            case '\b':
                                num2 = 256;
                                break;
                            case '\t':
                                num2 = 512;
                                break;
                        }
                        if (num2 != null) {
                            lr1.m24356e("MediaCodecUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(group)));
                        } else {
                            String str3 = split[2];
                            if (str3 != null) {
                                int hashCode = str3.hashCode();
                                switch (hashCode) {
                                    case 1537:
                                        if (str3.equals("01")) {
                                            num3 = 1;
                                            break;
                                        }
                                        break;
                                    case 1538:
                                        if (str3.equals("02")) {
                                            num3 = 2;
                                            break;
                                        }
                                        break;
                                    case 1539:
                                        if (str3.equals("03")) {
                                            num3 = 4;
                                            break;
                                        }
                                        break;
                                    case 1540:
                                        if (str3.equals("04")) {
                                            num3 = 8;
                                            break;
                                        }
                                        break;
                                    case 1541:
                                        if (str3.equals("05")) {
                                            num3 = 16;
                                            break;
                                        }
                                        break;
                                    case 1542:
                                        if (str3.equals("06")) {
                                            num3 = 32;
                                            break;
                                        }
                                        break;
                                    case 1543:
                                        if (str3.equals("07")) {
                                            num3 = 64;
                                            break;
                                        }
                                        break;
                                    case 1544:
                                        if (str3.equals("08")) {
                                            num3 = 128;
                                            break;
                                        }
                                        break;
                                    case 1545:
                                        if (str3.equals("09")) {
                                            num3 = 256;
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 1567:
                                                if (str3.equals("10")) {
                                                    num3 = 512;
                                                    break;
                                                }
                                                break;
                                            case 1568:
                                                if (str3.equals("11")) {
                                                    num3 = 1024;
                                                    break;
                                                }
                                                break;
                                            case 1569:
                                                if (str3.equals("12")) {
                                                    num3 = Integer.valueOf(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
                                                    break;
                                                }
                                                break;
                                            case 1570:
                                                if (str3.equals("13")) {
                                                    num3 = 4096;
                                                    break;
                                                }
                                                break;
                                        }
                                }
                                if (num3 != null) {
                                    lr1.m24356e("MediaCodecUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str3)));
                                } else {
                                    return new Pair(num2, num3);
                                }
                            }
                            num3 = null;
                            if (num3 != null) {
                            }
                        }
                    }
                    num2 = null;
                    if (num2 != null) {
                    }
                }
            }
            return null;
        }
        String str4 = split[0];
        switch (str4.hashCode()) {
            case 3004662:
                if (str4.equals("av01")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 3006243:
                if (str4.equals("avc1")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 3006244:
                if (str4.equals("avc2")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 3199032:
                if (str4.equals("hev1")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 3214780:
                if (str4.equals("hvc1")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 3356560:
                if (str4.equals("mp4a")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 3624515:
                if (str4.equals("vp09")) {
                    c11 = 2;
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
                String str5 = c4671k3.f23096i;
                int length = split.length;
                if (length < 2) {
                    lr1.m24356e("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5)));
                } else {
                    try {
                        if (split[1].length() == 6) {
                            parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                            parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                        } else if (length >= 3) {
                            parseInt = Integer.parseInt(split[1]);
                            parseInt2 = Integer.parseInt(split[2]);
                        } else {
                            lr1.m24356e("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str5);
                        }
                        if (parseInt != 66) {
                            if (parseInt != 77) {
                                if (parseInt != 88) {
                                    if (parseInt != 100) {
                                        if (parseInt != 110) {
                                            if (parseInt != 122) {
                                                if (parseInt != 244) {
                                                    i11 = -1;
                                                    i22 = -1;
                                                } else {
                                                    i11 = -1;
                                                    i22 = 64;
                                                }
                                            } else {
                                                i11 = -1;
                                                i22 = 32;
                                            }
                                        } else {
                                            i11 = -1;
                                            i22 = 16;
                                        }
                                    } else {
                                        i11 = -1;
                                        i22 = 8;
                                    }
                                } else {
                                    i11 = -1;
                                    i22 = 4;
                                }
                            } else {
                                i11 = -1;
                            }
                        } else {
                            i11 = -1;
                            i22 = 1;
                        }
                        if (i22 == i11) {
                            lr1.m24356e("MediaCodecUtil", "Unknown AVC profile: " + parseInt);
                        } else {
                            switch (parseInt2) {
                                case 10:
                                    i12 = 1;
                                    break;
                                case 11:
                                    i12 = 4;
                                    break;
                                case 12:
                                    i12 = 8;
                                    break;
                                case 13:
                                    i12 = 16;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i12 = 32;
                                            break;
                                        case 21:
                                            i12 = 64;
                                            break;
                                        case 22:
                                            i12 = 128;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                                    i12 = 256;
                                                    break;
                                                case 31:
                                                    i12 = 512;
                                                    break;
                                                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                                    i12 = 1024;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i12 = ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                                                            break;
                                                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                                            i12 = 4096;
                                                            break;
                                                        case 42:
                                                            i12 = 8192;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    i12 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i12 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i12 = 65536;
                                                                    break;
                                                                default:
                                                                    i12 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i12 == -1) {
                                lr1.m24356e("MediaCodecUtil", "Unknown AVC level: " + parseInt2);
                            } else {
                                return new Pair(Integer.valueOf(i22), Integer.valueOf(i12));
                            }
                        }
                    } catch (NumberFormatException unused) {
                        lr1.m24356e("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5)));
                    }
                }
                return null;
            case 2:
                String str6 = c4671k3.f23096i;
                if (split.length < 3) {
                    lr1.m24356e("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                } else {
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2]);
                        if (parseInt3 != 0) {
                            if (parseInt3 != 1) {
                                if (parseInt3 != 2) {
                                    if (parseInt3 != 3) {
                                        i13 = -1;
                                    } else {
                                        i13 = 8;
                                    }
                                } else {
                                    i13 = 4;
                                }
                            } else {
                                i13 = 2;
                            }
                        } else {
                            i13 = 1;
                        }
                        if (i13 == -1) {
                            lr1.m24356e("MediaCodecUtil", "Unknown VP9 profile: " + parseInt3);
                        } else {
                            if (parseInt4 != 10) {
                                if (parseInt4 != 11) {
                                    if (parseInt4 != 20) {
                                        if (parseInt4 != 21) {
                                            if (parseInt4 != 30) {
                                                if (parseInt4 != 31) {
                                                    if (parseInt4 != 40) {
                                                        if (parseInt4 != 41) {
                                                            if (parseInt4 != 50) {
                                                                if (parseInt4 != 51) {
                                                                    switch (parseInt4) {
                                                                        case 60:
                                                                            i14 = -1;
                                                                            i23 = ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                                                                            break;
                                                                        case 61:
                                                                            i14 = -1;
                                                                            i23 = 4096;
                                                                            break;
                                                                        case 62:
                                                                            i14 = -1;
                                                                            i23 = 8192;
                                                                            break;
                                                                        default:
                                                                            i14 = -1;
                                                                            i23 = -1;
                                                                            break;
                                                                    }
                                                                } else {
                                                                    i14 = -1;
                                                                    i23 = 512;
                                                                }
                                                            } else {
                                                                i14 = -1;
                                                                i23 = 256;
                                                            }
                                                        } else {
                                                            i14 = -1;
                                                            i23 = 128;
                                                        }
                                                    } else {
                                                        i14 = -1;
                                                        i23 = 64;
                                                    }
                                                } else {
                                                    i14 = -1;
                                                    i23 = 32;
                                                }
                                            } else {
                                                i14 = -1;
                                                i23 = 16;
                                            }
                                        } else {
                                            i14 = -1;
                                            i23 = 8;
                                        }
                                    } else {
                                        i14 = -1;
                                        i23 = 4;
                                    }
                                } else {
                                    i14 = -1;
                                    i23 = 2;
                                }
                            } else {
                                i14 = -1;
                            }
                            if (i23 == i14) {
                                lr1.m24356e("MediaCodecUtil", "Unknown VP9 level: " + parseInt4);
                            } else {
                                return new Pair(Integer.valueOf(i13), Integer.valueOf(i23));
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        lr1.m24356e("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                    }
                }
                return null;
            case 3:
            case 4:
                String str7 = c4671k3.f23096i;
                if (split.length < 4) {
                    lr1.m24356e("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str7)));
                } else {
                    Matcher matcher2 = f19197a.matcher(split[1]);
                    if (!matcher2.matches()) {
                        lr1.m24356e("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str7)));
                    } else {
                        String group2 = matcher2.group(1);
                        if ("1".equals(group2)) {
                            c12 = 3;
                            i15 = 1;
                        } else if ("2".equals(group2)) {
                            c12 = 3;
                            i15 = 2;
                        } else {
                            lr1.m24356e("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group2)));
                        }
                        String str8 = split[c12];
                        if (str8 != null) {
                            switch (str8.hashCode()) {
                                case 70821:
                                    if (str8.equals("H30")) {
                                        c13 = '\r';
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 70914:
                                    if (str8.equals("H60")) {
                                        c13 = 14;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 70917:
                                    if (str8.equals("H63")) {
                                        c13 = 15;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 71007:
                                    if (str8.equals("H90")) {
                                        c13 = 16;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 71010:
                                    if (str8.equals("H93")) {
                                        c13 = 17;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 74665:
                                    if (str8.equals("L30")) {
                                        c13 = 0;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 74758:
                                    if (str8.equals("L60")) {
                                        c13 = 1;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 74761:
                                    if (str8.equals("L63")) {
                                        c13 = 2;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 74851:
                                    if (str8.equals("L90")) {
                                        c13 = 3;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 74854:
                                    if (str8.equals("L93")) {
                                        c13 = 4;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2193639:
                                    if (str8.equals("H120")) {
                                        c13 = 18;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2193642:
                                    if (str8.equals("H123")) {
                                        c13 = 19;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2193732:
                                    if (str8.equals("H150")) {
                                        c13 = 20;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2193735:
                                    if (str8.equals("H153")) {
                                        c13 = 21;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2193738:
                                    if (str8.equals("H156")) {
                                        c13 = 22;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2193825:
                                    if (str8.equals("H180")) {
                                        c13 = 23;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2193828:
                                    if (str8.equals("H183")) {
                                        c13 = 24;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2193831:
                                    if (str8.equals("H186")) {
                                        c13 = 25;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2312803:
                                    if (str8.equals("L120")) {
                                        c13 = 5;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2312806:
                                    if (str8.equals("L123")) {
                                        c13 = 6;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2312896:
                                    if (str8.equals("L150")) {
                                        c13 = 7;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2312899:
                                    if (str8.equals("L153")) {
                                        c13 = '\b';
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2312902:
                                    if (str8.equals("L156")) {
                                        c13 = '\t';
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2312989:
                                    if (str8.equals("L180")) {
                                        c13 = '\n';
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2312992:
                                    if (str8.equals("L183")) {
                                        c13 = 11;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 2312995:
                                    if (str8.equals("L186")) {
                                        c13 = '\f';
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                default:
                                    c13 = 65535;
                                    break;
                            }
                            switch (c13) {
                                case 0:
                                    num = 1;
                                    break;
                                case 1:
                                    num = 4;
                                    break;
                                case 2:
                                    num = 16;
                                    break;
                                case 3:
                                    num = 64;
                                    break;
                                case 4:
                                    num = 256;
                                    break;
                                case 5:
                                    num = 1024;
                                    break;
                                case 6:
                                    num = 4096;
                                    break;
                                case 7:
                                    num = 16384;
                                    break;
                                case '\b':
                                    num = 65536;
                                    break;
                                case '\t':
                                    num = 262144;
                                    break;
                                case '\n':
                                    num = Integer.valueOf(ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
                                    break;
                                case 11:
                                    num = 4194304;
                                    break;
                                case '\f':
                                    num = 16777216;
                                    break;
                                case '\r':
                                    num = 2;
                                    break;
                                case 14:
                                    num = 8;
                                    break;
                                case 15:
                                    num = 32;
                                    break;
                                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                    num = 128;
                                    break;
                                case 17:
                                    num = 512;
                                    break;
                                case 18:
                                    num = Integer.valueOf(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
                                    break;
                                case 19:
                                    num = 8192;
                                    break;
                                case 20:
                                    num = 32768;
                                    break;
                                case 21:
                                    num = 131072;
                                    break;
                                case 22:
                                    num = 524288;
                                    break;
                                case 23:
                                    num = 2097152;
                                    break;
                                case 24:
                                    num = 8388608;
                                    break;
                                case 25:
                                    num = 33554432;
                                    break;
                            }
                            if (num != null) {
                                lr1.m24356e("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(str8)));
                            } else {
                                return new Pair(Integer.valueOf(i15), num);
                            }
                        }
                        num = null;
                        if (num != null) {
                        }
                    }
                }
                return null;
            case 5:
                String str9 = c4671k3.f23096i;
                sc4 sc4Var = c4671k3.f23111x;
                if (split.length < 4) {
                    lr1.m24356e("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str9)));
                } else {
                    try {
                        int parseInt5 = Integer.parseInt(split[1]);
                        int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt7 = Integer.parseInt(split[3]);
                        if (parseInt5 != 0) {
                            lr1.m24356e("MediaCodecUtil", "Unknown AV1 profile: " + parseInt5);
                        } else {
                            if (parseInt7 != 8) {
                                if (parseInt7 != 10) {
                                    lr1.m24356e("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt7);
                                } else if (sc4Var != null && (sc4Var.f27623d != null || (i18 = sc4Var.f27622c) == 7 || i18 == 6)) {
                                    i16 = 4096;
                                } else {
                                    i16 = 2;
                                }
                            } else {
                                i16 = 1;
                            }
                            switch (parseInt6) {
                                case 0:
                                    i17 = 1;
                                    break;
                                case 1:
                                    i17 = 2;
                                    break;
                                case 2:
                                    i17 = 4;
                                    break;
                                case 3:
                                    i17 = 8;
                                    break;
                                case 4:
                                    i17 = 16;
                                    break;
                                case 5:
                                    i17 = 32;
                                    break;
                                case 6:
                                    i17 = 64;
                                    break;
                                case 7:
                                    i17 = 128;
                                    break;
                                case 8:
                                    i17 = 256;
                                    break;
                                case 9:
                                    i17 = 512;
                                    break;
                                case 10:
                                    i17 = 1024;
                                    break;
                                case 11:
                                    i17 = ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                                    break;
                                case 12:
                                    i17 = 4096;
                                    break;
                                case 13:
                                    i17 = 8192;
                                    break;
                                case 14:
                                    i17 = 16384;
                                    break;
                                case 15:
                                    i17 = 32768;
                                    break;
                                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                    i17 = 65536;
                                    break;
                                case 17:
                                    i17 = 131072;
                                    break;
                                case 18:
                                    i17 = 262144;
                                    break;
                                case 19:
                                    i17 = 524288;
                                    break;
                                case 20:
                                    i17 = ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
                                    break;
                                case 21:
                                    i17 = 2097152;
                                    break;
                                case 22:
                                    i17 = 4194304;
                                    break;
                                case 23:
                                    i17 = 8388608;
                                    break;
                                default:
                                    i17 = -1;
                                    break;
                            }
                            if (i17 == -1) {
                                lr1.m24356e("MediaCodecUtil", "Unknown AV1 level: " + parseInt6);
                            } else {
                                return new Pair(Integer.valueOf(i16), Integer.valueOf(i17));
                            }
                        }
                    } catch (NumberFormatException unused3) {
                        lr1.m24356e("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str9)));
                    }
                }
                return null;
            case 6:
                String str10 = c4671k3.f23096i;
                if (split.length != 3) {
                    lr1.m24356e("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str10)));
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(k70.m23846d(Integer.parseInt(split[1], 16)))) {
                            int parseInt8 = Integer.parseInt(split[2]);
                            if (parseInt8 != 17) {
                                if (parseInt8 != 20) {
                                    if (parseInt8 != 23) {
                                        if (parseInt8 != 29) {
                                            if (parseInt8 != 39) {
                                                if (parseInt8 != 42) {
                                                    switch (parseInt8) {
                                                        case 1:
                                                            i21 = -1;
                                                            i19 = 1;
                                                            break;
                                                        case 2:
                                                            i21 = -1;
                                                            i19 = 2;
                                                            break;
                                                        case 3:
                                                            i21 = -1;
                                                            i19 = 3;
                                                            break;
                                                        case 4:
                                                            i21 = -1;
                                                            i19 = 4;
                                                            break;
                                                        case 5:
                                                            i21 = -1;
                                                            i19 = 5;
                                                            break;
                                                        case 6:
                                                            i21 = -1;
                                                            i19 = 6;
                                                            break;
                                                        default:
                                                            i21 = -1;
                                                            i19 = -1;
                                                            break;
                                                    }
                                                } else {
                                                    i19 = 42;
                                                }
                                            } else {
                                                i19 = 39;
                                            }
                                        } else {
                                            i19 = 29;
                                        }
                                    } else {
                                        i19 = 23;
                                    }
                                } else {
                                    i21 = -1;
                                    i19 = 20;
                                }
                                if (i19 != i21) {
                                    return new Pair(Integer.valueOf(i19), 0);
                                }
                            } else {
                                i19 = 17;
                            }
                            i21 = -1;
                            if (i19 != i21) {
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        lr1.m24356e("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str10)));
                    }
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static hd4 m21355c(String str, boolean z11, boolean z12) {
        List m21358f = m21358f(str, false, false);
        if (m21358f.isEmpty()) {
            return null;
        }
        return (hd4) m21358f.get(0);
    }

    /* renamed from: d */
    public static hd4 m21356d() {
        return m21355c("audio/raw", false, false);
    }

    /* renamed from: e */
    public static String m21357e(C4671k3 c4671k3) {
        Pair m21354b;
        if ("audio/eac3-joc".equals(c4671k3.f23099l)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(c4671k3.f23099l) && (m21354b = m21354b(c4671k3)) != null) {
            int intValue = ((Integer) m21354b.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    /* renamed from: f */
    public static synchronized List m21358f(String str, boolean z11, boolean z12) {
        ud4 wd4Var;
        synchronized (de4.class) {
            try {
                rd4 rd4Var = new rd4(str, z11, z12);
                HashMap hashMap = f19198b;
                List list = (List) hashMap.get(rd4Var);
                if (list != null) {
                    return list;
                }
                int i11 = g92.f20474a;
                if (i11 >= 21) {
                    wd4Var = new xd4(z11, z12);
                } else {
                    wd4Var = new wd4(null);
                }
                ArrayList m21360h = m21360h(rd4Var, wd4Var);
                if (z11 && m21360h.isEmpty() && i11 >= 21 && i11 <= 23) {
                    m21360h = m21360h(rd4Var, new wd4(null));
                    if (!m21360h.isEmpty()) {
                        lr1.m24356e("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((hd4) m21360h.get(0)).f21638a);
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (i11 < 26 && g92.f20475b.equals("R9") && m21360h.size() == 1 && ((hd4) m21360h.get(0)).f21638a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        m21360h.add(hd4.m22786c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                    }
                    m21361i(m21360h, new yd4() { // from class: com.google.android.gms.internal.ads.pd4
                        @Override // com.google.android.gms.internal.ads.yd4
                        public final int zza(Object obj) {
                            int i12 = de4.f19200d;
                            String str2 = ((hd4) obj).f21638a;
                            if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                                return 1;
                            }
                            if (g92.f20474a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                                return 0;
                            }
                            return -1;
                        }
                    });
                }
                if (i11 < 21 && m21360h.size() > 1) {
                    String str2 = ((hd4) m21360h.get(0)).f21638a;
                    if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                        m21361i(m21360h, new yd4() { // from class: com.google.android.gms.internal.ads.qd4
                            @Override // com.google.android.gms.internal.ads.yd4
                            public final int zza(Object obj) {
                                int i12 = de4.f19200d;
                                if (((hd4) obj).f21638a.startsWith("OMX.google")) {
                                    return 1;
                                }
                                return 0;
                            }
                        });
                    }
                }
                if (i11 < 32 && m21360h.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((hd4) m21360h.get(0)).f21638a)) {
                    m21360h.add((hd4) m21360h.remove(0));
                }
                c83 m20830u = c83.m20830u(m21360h);
                hashMap.put(rd4Var, m20830u);
                return m20830u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static List m21359g(List list, final C4671k3 c4671k3) {
        ArrayList arrayList = new ArrayList(list);
        m21361i(arrayList, new yd4() { // from class: com.google.android.gms.internal.ads.nd4
            @Override // com.google.android.gms.internal.ads.yd4
            public final int zza(Object obj) {
                C4671k3 c4671k32 = C4671k3.this;
                hd4 hd4Var = (hd4) obj;
                int i11 = de4.f19200d;
                try {
                    if (!hd4Var.m22792d(c4671k32)) {
                        return 0;
                    }
                    return 1;
                } catch (zzqz unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0243, code lost:            if (r1.f27169b == false) goto L155;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:            if ("SCV31".equals(r10) == false) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011b, code lost:            if (r8.startsWith(p609wh.C29037t0.f134385J) == false) goto L72;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:            if (r9 != false) goto L9;     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01eb A[Catch: Exception -> 0x01f2, TryCatch #5 {Exception -> 0x01f2, blocks: (B:92:0x01ba, B:96:0x01d1, B:100:0x01e5, B:102:0x01eb, B:103:0x0209, B:105:0x0211, B:107:0x023b, B:155:0x0216, B:157:0x0226, B:159:0x022e, B:163:0x01fe), top: B:91:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0211 A[Catch: Exception -> 0x01f2, TryCatch #5 {Exception -> 0x01f2, blocks: (B:92:0x01ba, B:96:0x01d1, B:100:0x01e5, B:102:0x01eb, B:103:0x0209, B:105:0x0211, B:107:0x023b, B:155:0x0216, B:157:0x0226, B:159:0x022e, B:163:0x01fe), top: B:91:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b7 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0067, B:28:0x006f, B:30:0x0077, B:34:0x0085, B:36:0x008d, B:38:0x0095, B:40:0x009d, B:42:0x00a7, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c7, B:52:0x00cf, B:54:0x00d7, B:58:0x00e5, B:60:0x00ed, B:62:0x00f5, B:64:0x00ff, B:66:0x0107, B:68:0x010d, B:70:0x0115, B:73:0x011f, B:75:0x0127, B:79:0x0133, B:81:0x013b, B:83:0x0143, B:85:0x014b, B:116:0x02af, B:119:0x02b7, B:121:0x02bd, B:124:0x02d7, B:125:0x02fa, B:87:0x0154, B:175:0x0157, B:177:0x015f, B:180:0x016a, B:182:0x0172, B:187:0x0180, B:189:0x0188, B:192:0x0193, B:194:0x019b, B:197:0x01a6, B:199:0x01ae), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d7 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0241 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0216 A[Catch: Exception -> 0x01f2, TryCatch #5 {Exception -> 0x01f2, blocks: (B:92:0x01ba, B:96:0x01d1, B:100:0x01e5, B:102:0x01eb, B:103:0x0209, B:105:0x0211, B:107:0x023b, B:155:0x0216, B:157:0x0226, B:159:0x022e, B:163:0x01fe), top: B:91:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fe A[Catch: Exception -> 0x01f2, TryCatch #5 {Exception -> 0x01f2, blocks: (B:92:0x01ba, B:96:0x01d1, B:100:0x01e5, B:102:0x01eb, B:103:0x0209, B:105:0x0211, B:107:0x023b, B:155:0x0216, B:157:0x0226, B:159:0x022e, B:163:0x01fe), top: B:91:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01df  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList m21360h(rd4 rd4Var, ud4 ud4Var) {
        String str;
        String str2;
        String str3;
        int i11;
        int i12;
        String str4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean mo26916a;
        boolean mo26917b;
        int i13;
        boolean z11;
        boolean m21362j;
        boolean z12;
        String str5;
        boolean isHardwareAccelerated;
        boolean isAlias;
        rd4 rd4Var2 = rd4Var;
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = rd4Var2.f27168a;
            int zza = ud4Var.zza();
            boolean zze = ud4Var.zze();
            int i14 = 0;
            while (i14 < zza) {
                MediaCodecInfo zzb = ud4Var.zzb(i14);
                int i15 = g92.f20474a;
                if (i15 >= 29) {
                    isAlias = zzb.isAlias();
                }
                String name = zzb.getName();
                if (!zzb.isEncoder() && ((zze || !name.endsWith(".secure")) && (i15 >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))))) {
                    if (i15 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(g92.f20476c))) {
                        String str7 = g92.f20475b;
                        if (!str7.startsWith("zeroflte")) {
                            if (!str7.startsWith("zerolte")) {
                                if (!str7.startsWith("zenlte")) {
                                    if (!"SC-05G".equals(str7)) {
                                        if (!"marinelteatt".equals(str7)) {
                                            if (!"404SC".equals(str7)) {
                                                if (!"SC-04G".equals(str7)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i15 <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(g92.f20476c)) {
                        String str8 = g92.f20475b;
                        if (!str8.startsWith("d2")) {
                            if (!str8.startsWith("serrano")) {
                                if (!str8.startsWith("jflte")) {
                                    if (!str8.startsWith("santos")) {
                                    }
                                }
                            }
                        }
                    }
                    if ((i15 > 19 || !g92.f20475b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) && (i15 > 23 || !"audio/eac3-joc".equals(str6) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))) {
                        String[] supportedTypes = zzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 < length) {
                                str = supportedTypes[i16];
                                if (str.equalsIgnoreCase(str6)) {
                                    break;
                                }
                                i16++;
                            } else if (str6.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str = "video/hevcdv";
                                } else {
                                    if (!"OMX.RTK.video.decoder".equals(name)) {
                                        if ("OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        }
                                        str = null;
                                    }
                                    str = "video/dv_hevc";
                                }
                            } else if (str6.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str6.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (str6.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                                str = null;
                            }
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = zzb.getCapabilitiesForType(str);
                                mo26916a = ud4Var.mo26916a("tunneled-playback", str, capabilitiesForType);
                                mo26917b = ud4Var.mo26917b("tunneled-playback", str, capabilitiesForType);
                            } catch (Exception e11) {
                                e = e11;
                                str2 = str;
                                str3 = name;
                                i11 = i14;
                                i12 = zza;
                                str4 = str6;
                            }
                            if (!rd4Var2.f27170c) {
                                if (!mo26917b) {
                                    boolean mo26916a2 = ud4Var.mo26916a("secure-playback", str, capabilitiesForType);
                                    boolean mo26917b2 = ud4Var.mo26917b("secure-playback", str, capabilitiesForType);
                                    if (rd4Var2.f27169b) {
                                        if (!mo26917b2) {
                                            i13 = g92.f20474a;
                                            if (i13 < 29) {
                                                isHardwareAccelerated = zzb.isHardwareAccelerated();
                                                z11 = isHardwareAccelerated;
                                            } else if (!m21362j(zzb, str6)) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            m21362j = m21362j(zzb, str6);
                                            if (i13 < 29) {
                                                z12 = zzb.isVendor();
                                            } else {
                                                String m25656a = q43.m25656a(zzb.getName());
                                                if (!m25656a.startsWith("omx.google.") && !m25656a.startsWith("c2.android.") && !m25656a.startsWith("c2.google.")) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                            }
                                            if (zze || rd4Var2.f27169b != mo26916a2) {
                                                if (!zze) {
                                                    try {
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        str2 = str;
                                                        str5 = name;
                                                        i11 = i14;
                                                        i12 = zza;
                                                        str4 = str6;
                                                        str3 = str5;
                                                        if (g92.f20474a <= 23) {
                                                        }
                                                        lr1.m24353b("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                        throw e;
                                                    }
                                                }
                                                str2 = str;
                                                i11 = i14;
                                                i12 = zza;
                                                str4 = str6;
                                                if (!zze && mo26916a2) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    try {
                                                        sb2.append(name);
                                                        sb2.append(".secure");
                                                        str3 = name;
                                                        try {
                                                            arrayList.add(hd4.m22786c(sb2.toString(), str4, str2, capabilitiesForType, z11, m21362j, z12, false, true));
                                                            return arrayList;
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            if (g92.f20474a <= 23 && !arrayList.isEmpty()) {
                                                                lr1.m24353b("MediaCodecUtil", "Skipping codec " + str3 + " (failed to query capabilities)");
                                                                i14 = i11 + 1;
                                                                rd4Var2 = rd4Var;
                                                                zza = i12;
                                                                str6 = str4;
                                                            } else {
                                                                lr1.m24353b("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                                throw e;
                                                            }
                                                        }
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        str3 = name;
                                                    }
                                                }
                                            }
                                            str2 = str;
                                            str5 = name;
                                            i11 = i14;
                                            i12 = zza;
                                            str4 = str6;
                                            try {
                                                arrayList.add(hd4.m22786c(name, str6, str, capabilitiesForType, z11, m21362j, z12, false, false));
                                            } catch (Exception e15) {
                                                e = e15;
                                                str3 = str5;
                                                if (g92.f20474a <= 23) {
                                                }
                                                lr1.m24353b("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                throw e;
                                            }
                                        }
                                    } else if (mo26916a2) {
                                        mo26916a2 = true;
                                        i13 = g92.f20474a;
                                        if (i13 < 29) {
                                        }
                                        m21362j = m21362j(zzb, str6);
                                        if (i13 < 29) {
                                        }
                                        if (zze) {
                                        }
                                        if (!zze) {
                                        }
                                        str2 = str;
                                        i11 = i14;
                                        i12 = zza;
                                        str4 = str6;
                                        if (!zze) {
                                            StringBuilder sb22 = new StringBuilder();
                                            sb22.append(name);
                                            sb22.append(".secure");
                                            str3 = name;
                                            arrayList.add(hd4.m22786c(sb22.toString(), str4, str2, capabilitiesForType, z11, m21362j, z12, false, true));
                                            return arrayList;
                                        }
                                        continue;
                                    }
                                    i14 = i11 + 1;
                                    rd4Var2 = rd4Var;
                                    zza = i12;
                                    str6 = str4;
                                }
                            } else {
                                if (!mo26916a) {
                                }
                                boolean mo26916a22 = ud4Var.mo26916a("secure-playback", str, capabilitiesForType);
                                boolean mo26917b22 = ud4Var.mo26917b("secure-playback", str, capabilitiesForType);
                                if (rd4Var2.f27169b) {
                                }
                                i14 = i11 + 1;
                                rd4Var2 = rd4Var;
                                zza = i12;
                                str6 = str4;
                            }
                        }
                    }
                }
                i11 = i14;
                i12 = zza;
                str4 = str6;
                i14 = i11 + 1;
                rd4Var2 = rd4Var;
                zza = i12;
                str6 = str4;
            }
            return arrayList;
        } catch (Exception e16) {
            throw new zzqz(e16, null);
        }
    }

    /* renamed from: i */
    private static void m21361i(List list, final yd4 yd4Var) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.od4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                yd4 yd4Var2 = yd4.this;
                int i11 = de4.f19200d;
                return yd4Var2.zza(obj2) - yd4Var2.zza(obj);
            }
        });
    }

    /* renamed from: j */
    private static boolean m21362j(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (g92.f20474a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (k70.m23849g(str)) {
            return true;
        }
        String m25656a = q43.m25656a(mediaCodecInfo.getName());
        if (m25656a.startsWith("arc.")) {
            return false;
        }
        if (m25656a.startsWith("omx.google.") || m25656a.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((m25656a.startsWith("omx.sec.") && m25656a.contains(".sw.")) || m25656a.equals("omx.qcom.video.decoder.hevcswvdec") || m25656a.startsWith("c2.android.") || m25656a.startsWith("c2.google.")) {
            return true;
        }
        if (!m25656a.startsWith("omx.") && !m25656a.startsWith("c2.")) {
            return true;
        }
        return false;
    }
}
