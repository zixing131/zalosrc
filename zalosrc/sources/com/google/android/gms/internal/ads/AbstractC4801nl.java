package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import android.util.SparseIntArray;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.nl */
/* loaded from: classes2.dex */
public abstract class AbstractC4801nl {

    /* renamed from: d */
    private static final SparseIntArray f25231d;

    /* renamed from: e */
    private static final SparseIntArray f25232e;

    /* renamed from: f */
    private static final Map f25233f;

    /* renamed from: a */
    private static final C4394cl f25228a = C4394cl.m20925b("OMX.google.raw.decoder");

    /* renamed from: b */
    private static final Pattern f25229b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap f25230c = new HashMap();

    /* renamed from: g */
    private static int f25234g = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25231d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f25232e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f25233f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", Integer.valueOf(ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE));
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", Integer.valueOf(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA));
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    /* renamed from: a */
    public static int m24939a() {
        int i11;
        int i12 = f25234g;
        if (i12 == -1) {
            C4394cl m24941c = m24941c("video/avc", false);
            if (m24941c != null) {
                int i13 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m24941c.m20932g()) {
                    int i14 = codecProfileLevel.level;
                    int i15 = 25344;
                    if (i14 != 1 && i14 != 2) {
                        i15 = 414720;
                        switch (i14) {
                            case 8:
                            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                i15 = 101376;
                                break;
                            case 64:
                                i15 = 202752;
                                break;
                            case 128:
                            case 256:
                                break;
                            case 512:
                                i15 = 921600;
                                break;
                            case 1024:
                                i15 = 1310720;
                                break;
                            case ZVideoUtilMetadata.FF_PROFILE_H264_INTRA /* 2048 */:
                            case 4096:
                                i15 = 2097152;
                                break;
                            case 8192:
                                i15 = 2228224;
                                break;
                            case 16384:
                                i15 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i15 = 9437184;
                                break;
                            default:
                                i15 = -1;
                                break;
                        }
                    }
                    i13 = Math.max(i15, i13);
                }
                if (AbstractC4916qo.f26898a >= 21) {
                    i11 = 345600;
                } else {
                    i11 = 172800;
                }
                i12 = Math.max(i13, i11);
            } else {
                i12 = 0;
            }
            f25234g = i12;
        }
        return i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static Pair m24940b(String str) {
        char c11;
        Integer valueOf;
        Integer valueOf2;
        String[] split = str.split("\\.");
        String str2 = split[0];
        int i11 = 2;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 != 0 && c11 != 1) {
            if (c11 != 2 && c11 != 3) {
                return null;
            }
            int length = split.length;
            if (length < 2) {
                "Ignoring malformed AVC codec string: ".concat(str);
                return null;
            }
            try {
                if (split[1].length() == 6) {
                    valueOf = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                    valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(4), 16));
                } else if (length >= 3) {
                    valueOf = Integer.valueOf(Integer.parseInt(split[1]));
                    valueOf2 = Integer.valueOf(Integer.parseInt(split[2]));
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ignoring malformed AVC codec string: ");
                    sb2.append(str);
                    return null;
                }
                return new Pair(Integer.valueOf(f25231d.get(valueOf.intValue())), Integer.valueOf(f25232e.get(valueOf2.intValue())));
            } catch (NumberFormatException unused) {
                "Ignoring malformed AVC codec string: ".concat(str);
                return null;
            }
        }
        if (split.length < 4) {
            "Ignoring malformed HEVC codec string: ".concat(str);
            return null;
        }
        Matcher matcher = f25229b.matcher(split[1]);
        if (!matcher.matches()) {
            "Ignoring malformed HEVC codec string: ".concat(str);
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i11 = 1;
        } else if (!"2".equals(group)) {
            "Unknown HEVC profile string: ".concat(String.valueOf(group));
            return null;
        }
        Integer num = (Integer) f25233f.get(split[3]);
        if (num == null) {
            "Unknown HEVC level string: ".concat(String.valueOf(matcher.group(1)));
            return null;
        }
        return new Pair(Integer.valueOf(i11), num);
    }

    /* renamed from: c */
    public static C4394cl m24941c(String str, boolean z11) {
        List m24942d = m24942d(str, z11);
        if (m24942d.isEmpty()) {
            return null;
        }
        return (C4394cl) m24942d.get(0);
    }

    /* renamed from: d */
    public static synchronized List m24942d(String str, boolean z11) {
        InterfaceC4652jl c4726ll;
        synchronized (AbstractC4801nl.class) {
            try {
                C4542gl c4542gl = new C4542gl(str, z11);
                HashMap hashMap = f25230c;
                List list = (List) hashMap.get(c4542gl);
                if (list != null) {
                    return list;
                }
                int i11 = AbstractC4916qo.f26898a;
                if (i11 >= 21) {
                    c4726ll = new C4764ml(z11);
                } else {
                    c4726ll = new C4726ll(null);
                }
                List m24943e = m24943e(c4542gl, c4726ll);
                if (z11 && m24943e.isEmpty() && i11 >= 21 && i11 <= 23) {
                    m24943e = m24943e(c4542gl, new C4726ll(null));
                    if (!m24943e.isEmpty()) {
                        String str2 = ((C4394cl) m24943e.get(0)).f18469a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("MediaCodecList API didn't list secure decoder for: ");
                        sb2.append(str);
                        sb2.append(". Assuming: ");
                        sb2.append(str2);
                    }
                }
                List unmodifiableList = Collections.unmodifiableList(m24943e);
                hashMap.put(c4542gl, unmodifiableList);
                return unmodifiableList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:            if ("SO-02E".equals(r14) == false) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0124, code lost:            if ("C1605".equals(r13) == false) goto L76;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0164, code lost:            if (r14.startsWith(p609wh.C29037t0.f134385J) == false) goto L92;     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c6 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:141:0x019b, B:143:0x01a5, B:146:0x01b3, B:148:0x01bb, B:107:0x01c6, B:129:0x01cf), top: B:140:0x019b }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List m24943e(C4542gl c4542gl, InterfaceC4652jl interfaceC4652jl) {
        int i11;
        int i12;
        MediaCodecInfo mediaCodecInfo;
        boolean z11;
        InterfaceC4652jl interfaceC4652jl2 = interfaceC4652jl;
        try {
            ArrayList arrayList = new ArrayList();
            String str = c4542gl.f20724a;
            int zza = interfaceC4652jl.zza();
            boolean zzd = interfaceC4652jl.zzd();
            int i13 = 0;
            while (i13 < zza) {
                MediaCodecInfo zzb = interfaceC4652jl2.zzb(i13);
                String name = zzb.getName();
                if (!zzb.isEncoder() && ((zzd || !name.endsWith(".secure")) && (((i11 = AbstractC4916qo.f26898a) >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((i11 >= 18 || !"OMX.SEC.MP3.Decoder".equals(name)) && (i11 >= 18 || !"OMX.MTK.AUDIO.DECODER.AAC".equals(name) || !"a70".equals(AbstractC4916qo.f26899b)))))) {
                    if (i11 == 16 && "OMX.qcom.audio.decoder.mp3".equals(name)) {
                        String str2 = AbstractC4916qo.f26899b;
                        if (!"dlxu".equals(str2)) {
                            if (!"protou".equals(str2)) {
                                if (!"ville".equals(str2)) {
                                    if (!"villeplus".equals(str2)) {
                                        if (!"villec2".equals(str2)) {
                                            if (!str2.startsWith("gee")) {
                                                if (!"C6602".equals(str2)) {
                                                    if (!"C6603".equals(str2)) {
                                                        if (!"C6606".equals(str2)) {
                                                            if (!"C6616".equals(str2)) {
                                                                if (!"L36h".equals(str2)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i11 == 16 && "OMX.qcom.audio.decoder.aac".equals(name)) {
                        String str3 = AbstractC4916qo.f26899b;
                        if (!"C1504".equals(str3)) {
                            if (!"C1505".equals(str3)) {
                                if (!"C1604".equals(str3)) {
                                }
                            }
                        }
                    }
                    if (i11 <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(AbstractC4916qo.f26900c)) {
                        String str4 = AbstractC4916qo.f26899b;
                        if (!str4.startsWith("d2")) {
                            if (!str4.startsWith("serrano")) {
                                if (!str4.startsWith("jflte")) {
                                    if (!str4.startsWith("santos")) {
                                    }
                                }
                            }
                        }
                    }
                    if (i11 > 19 || !AbstractC4916qo.f26899b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) {
                        String[] supportedTypes = zzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i14 = 0;
                        while (i14 < length) {
                            String str5 = supportedTypes[i14];
                            if (str5.equalsIgnoreCase(str)) {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType = zzb.getCapabilitiesForType(str5);
                                    boolean mo23630a = interfaceC4652jl2.mo23630a(str, capabilitiesForType);
                                    i12 = zza;
                                    mediaCodecInfo = zzb;
                                    if (AbstractC4916qo.f26898a <= 22) {
                                        try {
                                            String str6 = AbstractC4916qo.f26901d;
                                            if (!str6.equals("ODROID-XU3")) {
                                                if (str6.equals("Nexus 10")) {
                                                }
                                            }
                                            if ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name)) {
                                                z11 = true;
                                                try {
                                                    if (zzd) {
                                                        if (c4542gl.f20725b == mo23630a) {
                                                        }
                                                        arrayList.add(C4394cl.m20924a(name, str, capabilitiesForType, z11, false));
                                                    }
                                                    arrayList.add(C4394cl.m20924a(name, str, capabilitiesForType, z11, false));
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    if (AbstractC4916qo.f26898a > 23) {
                                                    }
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append("Failed to query codec ");
                                                    sb2.append(name);
                                                    sb2.append(" (");
                                                    sb2.append(str5);
                                                    sb2.append(")");
                                                    throw e;
                                                }
                                                if (!zzd || c4542gl.f20725b) {
                                                    if (!zzd && mo23630a) {
                                                        arrayList.add(C4394cl.m20924a(name + ".secure", str, capabilitiesForType, z11, true));
                                                        return arrayList;
                                                    }
                                                }
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            if (AbstractC4916qo.f26898a > 23 && !arrayList.isEmpty()) {
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append("Skipping codec ");
                                                sb3.append(name);
                                                sb3.append(" (failed to query capabilities)");
                                                i14++;
                                                interfaceC4652jl2 = interfaceC4652jl;
                                                zza = i12;
                                                zzb = mediaCodecInfo;
                                            } else {
                                                StringBuilder sb22 = new StringBuilder();
                                                sb22.append("Failed to query codec ");
                                                sb22.append(name);
                                                sb22.append(" (");
                                                sb22.append(str5);
                                                sb22.append(")");
                                                throw e;
                                            }
                                        }
                                    }
                                    z11 = false;
                                    if (zzd) {
                                    }
                                    if (!zzd) {
                                    }
                                    if (!zzd) {
                                        arrayList.add(C4394cl.m20924a(name + ".secure", str, capabilitiesForType, z11, true));
                                        return arrayList;
                                    }
                                    continue;
                                } catch (Exception e13) {
                                    e = e13;
                                    i12 = zza;
                                    mediaCodecInfo = zzb;
                                }
                            } else {
                                i12 = zza;
                                mediaCodecInfo = zzb;
                            }
                            i14++;
                            interfaceC4652jl2 = interfaceC4652jl;
                            zza = i12;
                            zzb = mediaCodecInfo;
                        }
                    }
                }
                i13++;
                interfaceC4652jl2 = interfaceC4652jl;
                zza = zza;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new zzawz(e14, null);
        }
    }
}
