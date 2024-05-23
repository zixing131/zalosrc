package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class em4 implements qm4 {

    /* renamed from: b */
    private static final int[] f19691b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: c */
    private static final dm4 f19692c = new dm4(new cm4() { // from class: com.google.android.gms.internal.ads.zl4
        @Override // com.google.android.gms.internal.ads.cm4
        public final Constructor zza() {
            if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return null;
            }
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(jm4.class).getConstructor(Integer.TYPE);
        }
    });

    /* renamed from: d */
    private static final dm4 f19693d = new dm4(new cm4() { // from class: com.google.android.gms.internal.ads.bm4
        @Override // com.google.android.gms.internal.ads.cm4
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(jm4.class).getConstructor(new Class[0]);
        }
    });

    /* renamed from: b */
    private static final void m21760b(int i11, List list) {
        switch (i11) {
            case 0:
                list.add(new C4378c5());
                return;
            case 1:
                list.add(new C4489f5());
                return;
            case 2:
                list.add(new C4600i5(0));
                return;
            case 3:
                list.add(new C5225z(0));
                return;
            case 4:
                jm4 m21494a = f19692c.m21494a(0);
                if (m21494a != null) {
                    list.add(m21494a);
                    return;
                } else {
                    list.add(new C4929r0(0));
                    return;
                }
            case 5:
                list.add(new C5040u0());
                return;
            case 6:
                list.add(new C5005t2(0));
                return;
            case 7:
                list.add(new C4303a3(0));
                return;
            case 8:
                list.add(new C5117w3(0, null));
                list.add(new C4341b4(0));
                return;
            case 9:
                list.add(new C4896q4());
                return;
            case 10:
                list.add(new C4786n6());
                return;
            case 11:
                list.add(new C5158x6(1, 0, 112800));
                return;
            case 12:
                list.add(new C4638j7());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new C5189y0());
                return;
            case 15:
                jm4 m21494a2 = f19693d.m21494a(new Object[0]);
                if (m21494a2 != null) {
                    list.add(m21494a2);
                    return;
                }
                return;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                list.add(new C4484f0());
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0314, code lost:            if (r9 == r3) goto L205;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0316, code lost:            m21760b(r9, r0);     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01a7 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x01a7, B:14:0x01aa, B:19:0x0316, B:20:0x0319, B:22:0x031e, B:25:0x0324, B:27:0x0327, B:31:0x032a, B:36:0x01b3, B:38:0x01bb, B:40:0x01c6, B:43:0x01d1, B:45:0x01d9, B:47:0x01e4, B:50:0x01ef, B:53:0x01fa, B:56:0x0205, B:58:0x020d, B:60:0x0215, B:62:0x0221, B:64:0x022f, B:66:0x023a, B:69:0x0245, B:71:0x024d, B:73:0x025b, B:75:0x0269, B:77:0x027b, B:79:0x0289, B:81:0x0295, B:83:0x029d, B:85:0x02a5, B:87:0x02ad, B:89:0x02b8, B:91:0x02c0, B:93:0x02d1, B:95:0x02d9, B:98:0x02e2, B:100:0x02ea, B:102:0x02f5, B:104:0x02fd, B:106:0x0308, B:119:0x0043, B:120:0x004b, B:123:0x0178, B:141:0x0050, B:144:0x005c, B:147:0x0068, B:150:0x0074, B:153:0x0080, B:156:0x008b, B:159:0x0096, B:162:0x00a1, B:165:0x00ad, B:168:0x00b9, B:171:0x00c5, B:174:0x00d1, B:177:0x00dc, B:180:0x00e7, B:183:0x00f2, B:186:0x00fe, B:189:0x010a, B:192:0x0116, B:195:0x0121, B:198:0x012c, B:201:0x0137, B:204:0x0142, B:207:0x014c, B:210:0x0157, B:213:0x0162, B:216:0x016d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x031e A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x01a7, B:14:0x01aa, B:19:0x0316, B:20:0x0319, B:22:0x031e, B:25:0x0324, B:27:0x0327, B:31:0x032a, B:36:0x01b3, B:38:0x01bb, B:40:0x01c6, B:43:0x01d1, B:45:0x01d9, B:47:0x01e4, B:50:0x01ef, B:53:0x01fa, B:56:0x0205, B:58:0x020d, B:60:0x0215, B:62:0x0221, B:64:0x022f, B:66:0x023a, B:69:0x0245, B:71:0x024d, B:73:0x025b, B:75:0x0269, B:77:0x027b, B:79:0x0289, B:81:0x0295, B:83:0x029d, B:85:0x02a5, B:87:0x02ad, B:89:0x02b8, B:91:0x02c0, B:93:0x02d1, B:95:0x02d9, B:98:0x02e2, B:100:0x02ea, B:102:0x02f5, B:104:0x02fd, B:106:0x0308, B:119:0x0043, B:120:0x004b, B:123:0x0178, B:141:0x0050, B:144:0x005c, B:147:0x0068, B:150:0x0074, B:153:0x0080, B:156:0x008b, B:159:0x0096, B:162:0x00a1, B:165:0x00ad, B:168:0x00b9, B:171:0x00c5, B:174:0x00d1, B:177:0x00dc, B:180:0x00e7, B:183:0x00f2, B:186:0x00fe, B:189:0x010a, B:192:0x0116, B:195:0x0121, B:198:0x012c, B:201:0x0137, B:204:0x0142, B:207:0x014c, B:210:0x0157, B:213:0x0162, B:216:0x016d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b3 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x01a7, B:14:0x01aa, B:19:0x0316, B:20:0x0319, B:22:0x031e, B:25:0x0324, B:27:0x0327, B:31:0x032a, B:36:0x01b3, B:38:0x01bb, B:40:0x01c6, B:43:0x01d1, B:45:0x01d9, B:47:0x01e4, B:50:0x01ef, B:53:0x01fa, B:56:0x0205, B:58:0x020d, B:60:0x0215, B:62:0x0221, B:64:0x022f, B:66:0x023a, B:69:0x0245, B:71:0x024d, B:73:0x025b, B:75:0x0269, B:77:0x027b, B:79:0x0289, B:81:0x0295, B:83:0x029d, B:85:0x02a5, B:87:0x02ad, B:89:0x02b8, B:91:0x02c0, B:93:0x02d1, B:95:0x02d9, B:98:0x02e2, B:100:0x02ea, B:102:0x02f5, B:104:0x02fd, B:106:0x0308, B:119:0x0043, B:120:0x004b, B:123:0x0178, B:141:0x0050, B:144:0x005c, B:147:0x0068, B:150:0x0074, B:153:0x0080, B:156:0x008b, B:159:0x0096, B:162:0x00a1, B:165:0x00ad, B:168:0x00b9, B:171:0x00c5, B:174:0x00d1, B:177:0x00dc, B:180:0x00e7, B:183:0x00f2, B:186:0x00fe, B:189:0x010a, B:192:0x0116, B:195:0x0121, B:198:0x012c, B:201:0x0137, B:204:0x0142, B:207:0x014c, B:210:0x0157, B:213:0x0162, B:216:0x016d), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.qm4
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized jm4[] mo20401a(Uri uri, Map map) {
        ArrayList arrayList;
        char c11;
        int i11;
        String lastPathSegment;
        int i12;
        try {
            arrayList = new ArrayList(16);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            int i13 = 12;
            if (str != null) {
                String m23847e = k70.m23847e(str);
                switch (m23847e.hashCode()) {
                    case -2123537834:
                        if (m23847e.equals("audio/eac3-joc")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1662384011:
                        if (m23847e.equals("video/mp2p")) {
                            c11 = 20;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1662384007:
                        if (m23847e.equals("video/mp2t")) {
                            c11 = 21;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1662095187:
                        if (m23847e.equals("video/webm")) {
                            c11 = '\f';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1606874997:
                        if (m23847e.equals("audio/amr-wb")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1487394660:
                        if (m23847e.equals("image/jpeg")) {
                            c11 = 24;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1248337486:
                        if (m23847e.equals("application/mp4")) {
                            c11 = 18;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1079884372:
                        if (m23847e.equals("video/x-msvideo")) {
                            c11 = 25;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1004728940:
                        if (m23847e.equals("text/vtt")) {
                            c11 = 23;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -387023398:
                        if (m23847e.equals("audio/x-matroska")) {
                            c11 = 11;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -43467528:
                        if (m23847e.equals("application/webm")) {
                            c11 = 14;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 13915911:
                        if (m23847e.equals("video/x-flv")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 187078296:
                        if (m23847e.equals("audio/ac3")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 187078297:
                        if (m23847e.equals("audio/ac4")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 187078669:
                        if (m23847e.equals("audio/amr")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 187090232:
                        if (m23847e.equals("audio/mp4")) {
                            c11 = 17;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 187091926:
                        if (m23847e.equals("audio/ogg")) {
                            c11 = 19;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 187099443:
                        if (m23847e.equals("audio/wav")) {
                            c11 = 22;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1331848029:
                        if (m23847e.equals("video/mp4")) {
                            c11 = 16;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1503095341:
                        if (m23847e.equals("audio/3gpp")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1504578661:
                        if (m23847e.equals("audio/eac3")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1504619009:
                        if (m23847e.equals("audio/flac")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1504824762:
                        if (m23847e.equals("audio/midi")) {
                            c11 = '\t';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1504831518:
                        if (m23847e.equals("audio/mpeg")) {
                            c11 = 15;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1505118770:
                        if (m23847e.equals("audio/webm")) {
                            c11 = '\r';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2039520277:
                        if (m23847e.equals("video/x-matroska")) {
                            c11 = '\n';
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
                        i11 = 0;
                        break;
                    case 3:
                        i11 = 1;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i11 = 3;
                        break;
                    case 7:
                        i11 = 4;
                        break;
                    case '\b':
                        i11 = 5;
                        break;
                    case '\t':
                        i11 = 15;
                        break;
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                        i11 = 6;
                        break;
                    case 15:
                        i11 = 7;
                        break;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    case 17:
                    case 18:
                        i11 = 8;
                        break;
                    case 19:
                        i11 = 9;
                        break;
                    case 20:
                        i11 = 10;
                        break;
                    case 21:
                        i11 = 11;
                        break;
                    case 22:
                        i11 = 12;
                        break;
                    case 23:
                        i11 = 13;
                        break;
                    case 24:
                        i11 = 14;
                        break;
                    case 25:
                        i11 = 16;
                        break;
                }
                if (i11 != -1) {
                    m21760b(i11, arrayList);
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                        i13 = 0;
                    } else if (lastPathSegment.endsWith(".ac4")) {
                        i13 = 1;
                    } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                        i13 = 2;
                    } else if (lastPathSegment.endsWith(".amr")) {
                        i13 = 3;
                    } else if (lastPathSegment.endsWith(".flac")) {
                        i13 = 4;
                    } else if (lastPathSegment.endsWith(".flv")) {
                        i13 = 5;
                    } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                        i13 = 15;
                    } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                        i13 = 6;
                    } else if (lastPathSegment.endsWith(".mp3")) {
                        i13 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        i13 = 8;
                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        i13 = 9;
                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        i13 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i13 = 11;
                    } else if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                            i13 = 13;
                        } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                            i13 = 14;
                        } else if (lastPathSegment.endsWith(".avi")) {
                            i13 = 16;
                        }
                    }
                    int[] iArr = f19691b;
                    for (i12 = 0; i12 < 16; i12++) {
                        int i14 = iArr[i12];
                        if (i14 != i11 && i14 != i13) {
                            m21760b(i14, arrayList);
                        }
                    }
                }
                i13 = -1;
                int[] iArr2 = f19691b;
                while (i12 < 16) {
                }
            }
            i11 = -1;
            if (i11 != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i13 = -1;
            int[] iArr22 = f19691b;
            while (i12 < 16) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (jm4[]) arrayList.toArray(new jm4[arrayList.size()]);
    }

    @Override // com.google.android.gms.internal.ads.qm4
    public final synchronized jm4[] zza() {
        return mo20401a(Uri.EMPTY, new HashMap());
    }
}
