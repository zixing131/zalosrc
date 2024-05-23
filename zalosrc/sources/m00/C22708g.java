package m00;

import ai.InterfaceC0864d;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.C19322f1;
import gw.C19669z;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me0.AbstractC23262x6;
import me0.C23013a7;
import me0.C23100i6;
import me0.C23111j6;
import me0.C23139m1;
import me0.C23282z6;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import on0.AbstractC24344y;
import p142ey.C18644n;
import p304ks.C21927m;
import p461qu.AbstractC25495a;
import pm0.C24848g0;
import qm0.AbstractC25356m;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;

/* renamed from: m00.g */
/* loaded from: classes4.dex */
public final class C22708g {

    /* renamed from: a */
    public static final C22708g f111254a = new C22708g();

    /* renamed from: b */
    private static final Map f111255b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    public static boolean f111256c = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m00.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final a f111257q = new a();

        a() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo240pC(String str, String str2) {
            int i11;
            AbstractC19074t.m100208f(str, "lhs");
            AbstractC19074t.m100208f(str2, "rhs");
            if (str.length() > str2.length()) {
                i11 = -1;
            } else if (str.length() < str2.length()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            return Integer.valueOf(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m00.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final b f111258q = new b();

        b() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo240pC(String str, String str2) {
            int i11;
            AbstractC19074t.m100208f(str, "lhs");
            AbstractC19074t.m100208f(str2, "rhs");
            if (str.length() > str2.length()) {
                i11 = -1;
            } else if (str.length() < str2.length()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            return Integer.valueOf(i11);
        }
    }

    private C22708g() {
    }

    /* renamed from: c */
    private final boolean m117415c(ContactProfile contactProfile) {
        if (!C18644n.m98531l().m98558u(contactProfile.f42434r) && !contactProfile.m40374K0() && (AbstractC25495a.m132081f(contactProfile.f42434r) || !C23139m1.f112256a.m118801s(contactProfile))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final void m117416d() {
        f111255b.clear();
        List<ContactProfile> m103199P = C19669z.Companion.m103232a().m103199P();
        long currentTimeMillis = System.currentTimeMillis();
        for (ContactProfile contactProfile : m103199P) {
            C22708g c22708g = f111254a;
            if (c22708g.m117415c(contactProfile)) {
                Map map = f111255b;
                AbstractC19074t.m100207e(map, "mapUidToInteractionScore");
                map.put(contactProfile.f42434r, Integer.valueOf(c22708g.m117418f(contactProfile.m40402e0(), currentTimeMillis)));
            }
        }
        f111256c = false;
    }

    /* renamed from: e */
    public static final float m117417e(String str, String str2, List list, long j11, int i11, StringBuilder sb2) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(list, "arrNamesHit");
        return AbstractC23262x6.m119976K(str, str2, list, j11, i11, sb2) + m117419g(str);
    }

    /* renamed from: f */
    private final int m117418f(long j11, long j12) {
        long j13 = j12 - j11;
        if (!C19322f1.f95950a.m101156m() || j11 <= 0) {
            return 0;
        }
        if (j13 <= 86400000) {
            return 3500;
        }
        if (j13 <= 259200000) {
            return 3000;
        }
        if (j13 > 604800000) {
            return 0;
        }
        return 2500;
    }

    /* renamed from: g */
    public static final int m117419g(String str) {
        if (f111256c) {
            f111254a.m117416d();
        }
        Integer num = (Integer) f111255b.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: h */
    public static final float m117420h(String str, String str2, Object obj, List list, List list2, int i11) {
        AbstractC19074t.m100208f(obj, "cp");
        AbstractC19074t.m100208f(list, "arrPosToHighlightWord");
        try {
            return m117421i(str, str2, null, null, obj, list, list2, i11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return 0.0f;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:36|(6:245|(1:247)(5:248|(1:250)(1:265)|251|(1:253)(1:264)|(1:(2:256|(2:258|(2:260|(1:262))))))|240|235|236|57)(1:38)|39|40|(2:42|(3:44|(2:45|(3:47|(2:49|(3:51|52|53)(1:58))(1:60)|59)(2:61|62))|(3:55|56|57)))|(2:64|(3:66|67|68))|(1:(3:227|228|68)(1:226))|(5:231|(1:238)|235|236|57)|240|235|236|57) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:142|143|(12:(6:169|170|171|172|173|(12:175|176|177|178|179|158|(6:99|(3:101|102|104)|111|(1:113)|(1:115)(1:137)|116)(1:138)|117|(2:119|120)(1:135)|(5:125|126|127|128|129)(1:122)|123|124))(1:145)|150|151|(4:153|154|155|156)(1:162)|157|158|(0)(0)|117|(0)(0)|(0)(0)|123|124)|146|147|148|149) */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x052c, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x052d, code lost:            r51 = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0302, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0310, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x027a, code lost:            if (fn0.AbstractC19074t.m100209g(r2.charValue(), 65) < 0) goto L390;     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0594 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0578 A[Catch: Exception -> 0x05af, TRY_ENTER, TryCatch #3 {Exception -> 0x05af, blocks: (B:117:0x057c, B:126:0x0594, B:138:0x0578), top: B:125:0x0594 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0548  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float m117421i(String str, String str2, String[] strArr, String[] strArr2, Object obj, List list, List list2, int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        String[] m118488a;
        int[] iArr;
        boolean z14;
        String[] strArr3;
        String[] strArr4;
        String[] m118488a2;
        String[] m118488a3;
        String[] strArr5;
        boolean z15;
        int length;
        boolean z16;
        int i12;
        boolean z17;
        float f11;
        int i13;
        float f12;
        InterfaceC0864d interfaceC0864d;
        String[] strArr6;
        int[] iArr2;
        int i14;
        String str3;
        String[] strArr7;
        Exception exc;
        int i15;
        String str4;
        int m127173b0;
        List m131505m;
        int m127173b02;
        int i16;
        boolean z18;
        int i17;
        int i18;
        CharSequence m127168X0;
        String lowerCase;
        String str5;
        int i19;
        int i21;
        int m127173b03;
        Object m131364L;
        Object m131364L2;
        Character ch2;
        boolean z19;
        int m127173b04;
        String[] strArr8 = strArr2;
        C23013a7 c23013a7 = C23013a7.f111966a;
        boolean m117999i = c23013a7.m117999i(i11, 131072);
        boolean m117999i2 = c23013a7.m117999i(i11, 65536);
        boolean z21 = c23013a7.m117999i(i11, 32768) && C19322f1.f95956g != 0;
        if (c23013a7.m117999i(i11, 4194304)) {
            z11 = true;
        } else {
            if (c23013a7.m117999i(i11, 8388608)) {
                z11 = false;
                z12 = true;
                z13 = true;
                HashMap hashMap = new HashMap();
                float f13 = 0.0f;
                if (strArr8 != null) {
                    if (str2 != null) {
                        C23111j6 m120367c = C23282z6.m120367c(str2, (c23013a7.m117999i(i11, 16) ? 16 : 0) | 16384 | (z11 ? ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE : 0) | (z12 ? 2097152 : 0));
                        String[] m118488a4 = m120367c.m118488a();
                        int[] m118478b = m120367c instanceof C23100i6 ? ((C23100i6) m120367c).m118478b() : null;
                        if (c23013a7.m117999i(i11, 16)) {
                            m118488a = m118488a4;
                        } else {
                            m118488a = C23282z6.m120367c(str2, (z11 ? ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE : 0) | 16400 | (z12 ? 2097152 : 0)).m118488a();
                        }
                        String[] m118488a5 = C23282z6.m120367c(str2, (z11 ? ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE : 0) | 16400 | (z12 ? 2097152 : 0) | 512).m118488a();
                        if (m118488a5.length != m118488a.length) {
                            iArr = m118478b;
                            strArr8 = m118488a4;
                            z14 = false;
                        } else {
                            iArr = m118478b;
                            z14 = z21;
                            strArr8 = m118488a4;
                        }
                        String[] strArr9 = m118488a;
                        strArr3 = m118488a5;
                        strArr4 = strArr9;
                    }
                    return f13;
                }
                if (c23013a7.m117999i(i11, 16)) {
                    strArr4 = strArr8;
                } else {
                    ArrayList arrayList = new ArrayList(strArr8.length);
                    for (String str6 : strArr8) {
                        String lowerCase2 = str6.toLowerCase(Locale.ROOT);
                        AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
                        arrayList.add(lowerCase2);
                    }
                    strArr4 = (String[]) arrayList.toArray(new String[0]);
                }
                strArr3 = null;
                iArr = null;
                z14 = false;
                if (strArr != null) {
                    if (str != null) {
                        C23013a7 c23013a72 = C23013a7.f111966a;
                        boolean z22 = z14;
                        if (c23013a72.m117999i(i11, 128)) {
                            m118488a2 = C23282z6.m120367c(str, 8208 | (z13 ? 2097152 : 0)).m118488a();
                        } else {
                            m118488a2 = C23282z6.m120367c(str, 4112 | (z13 ? 2097152 : 0)).m118488a();
                        }
                        if (c23013a72.m117999i(i11, 128)) {
                            m118488a3 = C23282z6.m120367c(str, (z13 ? 2097152 : 0) | 8720).m118488a();
                        } else {
                            m118488a3 = C23282z6.m120367c(str, (z13 ? 2097152 : 0) | 528).m118488a();
                        }
                        if (m118488a3.length != m118488a2.length) {
                            strArr5 = m118488a3;
                        } else {
                            strArr5 = m118488a3;
                            z15 = z22;
                            int length2 = strArr4.length;
                            int[] iArr3 = new int[length2];
                            boolean z23 = z15;
                            Arrays.fill(iArr3, -2);
                            list.clear();
                            final a aVar = a.f111257q;
                            int[] iArr4 = iArr;
                            AbstractC25356m.m131336s(m118488a2, new Comparator() { // from class: m00.e
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    int m117422j;
                                    m117422j = C22708g.m117422j(InterfaceC18509p.this, obj2, obj3);
                                    return m117422j;
                                }
                            });
                            if (strArr5 != null) {
                                final b bVar = b.f111258q;
                                AbstractC25356m.m131336s(strArr5, new Comparator() { // from class: m00.f
                                    @Override // java.util.Comparator
                                    public final int compare(Object obj2, Object obj3) {
                                        int m117423k;
                                        m117423k = C22708g.m117423k(InterfaceC18509p.this, obj2, obj3);
                                        return m117423k;
                                    }
                                });
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            }
                            length = m118488a2.length;
                            z16 = z23;
                            String str7 = "";
                            String str8 = "toLowerCase(...)";
                            int i22 = 0;
                            int i23 = 0;
                            i12 = 0;
                            boolean z24 = false;
                            boolean z25 = false;
                            z17 = false;
                            f11 = 0.0f;
                            while (i12 < length) {
                                String str9 = m118488a2[i12];
                                int i24 = length;
                                int i25 = i23;
                                String[] strArr10 = m118488a2;
                                boolean z26 = false;
                                int i26 = -1;
                                int i27 = 0;
                                int i28 = 0;
                                boolean z27 = false;
                                boolean z28 = false;
                                int i29 = -1;
                                int i31 = -1;
                                int i32 = -1;
                                while (true) {
                                    if (i27 >= length2) {
                                        strArr6 = strArr8;
                                        iArr2 = iArr3;
                                        i14 = length2;
                                        break;
                                    }
                                    boolean z29 = i27 == 0 ? false : z26;
                                    if (i27 != 0) {
                                        strArr4[i27 - 1].length();
                                    }
                                    i14 = length2;
                                    if (iArr3[i27] != -1) {
                                        m127173b03 = AbstractC24342w.m127173b0(strArr4[i27], str9, 0, false, 6, null);
                                        int i33 = m127173b03;
                                        iArr2 = iArr3;
                                        int i34 = 0;
                                        while (i33 >= 0 && i34 <= 10) {
                                            int i35 = i28;
                                            if (C23013a7.f111966a.m117999i(i11, 8) || i33 == 0) {
                                                strArr6 = strArr8;
                                            } else {
                                                if (strArr8.length != strArr4.length) {
                                                    strArr6 = strArr8;
                                                } else {
                                                    m131364L = AbstractC25358n.m131364L(strArr8, i27);
                                                    String str10 = (String) m131364L;
                                                    Character m127207f1 = str10 != null ? AbstractC24344y.m127207f1(str10, i33) : null;
                                                    m131364L2 = AbstractC25358n.m131364L(strArr8, i27);
                                                    String str11 = (String) m131364L2;
                                                    if (str11 != null) {
                                                        strArr6 = strArr8;
                                                        ch2 = AbstractC24344y.m127207f1(str11, i33 - 1);
                                                    } else {
                                                        strArr6 = strArr8;
                                                        ch2 = null;
                                                    }
                                                    if (m127207f1 != null) {
                                                        if (ch2 != null) {
                                                            if (Character.isUpperCase(m127207f1.charValue())) {
                                                                if (!Character.isLowerCase(ch2.charValue())) {
                                                                    if (AbstractC19074t.m100209g(ch2.charValue(), ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422) <= 0) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int i36 = i35;
                                                i34++;
                                                i33 = AbstractC24342w.m127173b0(strArr4[i27], str9, i33 + str9.length(), false, 4, null);
                                                i28 = i36;
                                                strArr8 = strArr6;
                                            }
                                            if (hashMap.get(Integer.valueOf(i27)) != null) {
                                                Object obj2 = hashMap.get(Integer.valueOf(i27));
                                                AbstractC19074t.m100205c(obj2);
                                                if (((ArrayList) obj2).size() > 0) {
                                                    int i37 = 0;
                                                    while (true) {
                                                        Object obj3 = hashMap.get(Integer.valueOf(i27));
                                                        AbstractC19074t.m100205c(obj3);
                                                        if (i37 >= ((ArrayList) obj3).size() - 1) {
                                                            z19 = false;
                                                            break;
                                                        }
                                                        Object obj4 = hashMap.get(Integer.valueOf(i27));
                                                        AbstractC19074t.m100205c(obj4);
                                                        Object obj5 = ((ArrayList) obj4).get(i37);
                                                        AbstractC19074t.m100207e(obj5, "get(...)");
                                                        if (i33 >= ((Number) obj5).intValue()) {
                                                            Object obj6 = hashMap.get(Integer.valueOf(i27));
                                                            AbstractC19074t.m100205c(obj6);
                                                            Object obj7 = ((ArrayList) obj6).get(i37 + 1);
                                                            AbstractC19074t.m100207e(obj7, "get(...)");
                                                            if (i33 < ((Number) obj7).intValue()) {
                                                                i34++;
                                                                m127173b04 = AbstractC24342w.m127173b0(strArr4[i27], str9, i33 + str9.length(), false, 4, null);
                                                                i33 = m127173b04;
                                                                z19 = true;
                                                                break;
                                                            }
                                                        }
                                                        i37 += 2;
                                                    }
                                                    if (z19) {
                                                        i28 = i35;
                                                        strArr8 = strArr6;
                                                    }
                                                }
                                            }
                                            if (z21) {
                                                AbstractC19074t.m100205c(strArr3);
                                                String str12 = strArr3[i27];
                                                AbstractC19074t.m100205c(strArr5);
                                                if (AbstractC19074t.m100204b(str12, strArr5[i12])) {
                                                    i26 = i27;
                                                    i32 = i33;
                                                    i28 = i35;
                                                    z27 = true;
                                                    z29 = true;
                                                    break;
                                                }
                                            }
                                            if (!z28 && AbstractC19074t.m100204b(strArr4[i27], str9)) {
                                                if (!z16) {
                                                    i26 = i27;
                                                    i32 = i33;
                                                    i28 = i35;
                                                    z29 = true;
                                                    break;
                                                }
                                                i29 = i27;
                                                i31 = i33;
                                                z28 = true;
                                            }
                                            if (!z28 && !z29) {
                                                if (i26 == -1 || strArr4[i27].length() < (i36 = i35)) {
                                                    i28 = strArr4[i27].length();
                                                    i26 = i27;
                                                    i32 = i33;
                                                    break;
                                                }
                                                i34++;
                                                i33 = AbstractC24342w.m127173b0(strArr4[i27], str9, i33 + str9.length(), false, 4, null);
                                                i28 = i36;
                                                strArr8 = strArr6;
                                            }
                                            int i362 = i35;
                                            i34++;
                                            i33 = AbstractC24342w.m127173b0(strArr4[i27], str9, i33 + str9.length(), false, 4, null);
                                            i28 = i362;
                                            strArr8 = strArr6;
                                        }
                                        strArr6 = strArr8;
                                        i28 = i28;
                                        z26 = z29;
                                        if (z29) {
                                            break;
                                        }
                                    } else {
                                        strArr6 = strArr8;
                                        iArr2 = iArr3;
                                        z26 = z29;
                                    }
                                    i27++;
                                    length2 = i14;
                                    iArr3 = iArr2;
                                    strArr8 = strArr6;
                                }
                                if (z26 || !z28) {
                                    i31 = i32;
                                } else {
                                    i26 = i29;
                                }
                                if (i26 >= 0) {
                                    try {
                                        float length3 = str9.length() / strArr4[i26].length();
                                        if (str9.length() != strArr4[i26].length()) {
                                            try {
                                                m127173b0 = AbstractC24342w.m127173b0(strArr4[i26], str9, i31, false, 4, null);
                                                int length4 = str9.length() + m127173b0;
                                                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i26));
                                                if (arrayList2 != null) {
                                                    arrayList2.add(Integer.valueOf(m127173b0));
                                                    arrayList2.add(Integer.valueOf(length4));
                                                } else {
                                                    Integer valueOf = Integer.valueOf(i26);
                                                    m131505m = AbstractC25368s.m131505m(Integer.valueOf(m127173b0), Integer.valueOf(length4));
                                                    hashMap.put(valueOf, new ArrayList(m131505m));
                                                }
                                            } catch (Exception e11) {
                                                exc = e11;
                                                str3 = str8;
                                                iArr3 = iArr2;
                                                i15 = i22;
                                                strArr7 = strArr5;
                                                str4 = str7;
                                                AbstractC23350e.m122774d("SearchOperators", exc.toString());
                                                i12++;
                                                i22 = i15;
                                                str7 = str4;
                                                strArr5 = strArr7;
                                                length = i24;
                                                m118488a2 = strArr10;
                                                i23 = i25;
                                                length2 = i14;
                                                str8 = str3;
                                                strArr8 = strArr6;
                                            }
                                        }
                                        if (length3 == 1.0f) {
                                            z17 = true;
                                        } else {
                                            m127173b02 = AbstractC24342w.m127173b0(strArr4[i26], str9, 0, false, 6, null);
                                            if (m127173b02 == 0 && !z24) {
                                                z24 = true;
                                            }
                                        }
                                        if (z16 && length3 == 1.0f && z27) {
                                            i16 = i25 + 1;
                                            if (!z25) {
                                                try {
                                                    AbstractC19074t.m100205c(strArr5);
                                                    z25 = !TextUtils.equals(str9, strArr5[i12]);
                                                } catch (Exception e12) {
                                                    exc = e12;
                                                    i25 = i16;
                                                    str3 = str8;
                                                    iArr3 = iArr2;
                                                    i15 = i22;
                                                    strArr7 = strArr5;
                                                    str4 = str7;
                                                    AbstractC23350e.m122774d("SearchOperators", exc.toString());
                                                    i12++;
                                                    i22 = i15;
                                                    str7 = str4;
                                                    strArr5 = strArr7;
                                                    length = i24;
                                                    m118488a2 = strArr10;
                                                    i23 = i25;
                                                    length2 = i14;
                                                    str8 = str3;
                                                    strArr8 = strArr6;
                                                }
                                            }
                                            z18 = z16;
                                        } else {
                                            i16 = i25;
                                            z18 = false;
                                        }
                                        f11 += m117999i ? 100 * length3 : 1.0f;
                                        int i38 = i22 + 1;
                                        try {
                                            if (obj instanceof ContactProfile) {
                                                try {
                                                    if (str7.length() == 0) {
                                                        try {
                                                            if (AbstractC25495a.m132078c(((ContactProfile) obj).f42434r)) {
                                                                try {
                                                                    i17 = i38;
                                                                } catch (Exception e13) {
                                                                    e = e13;
                                                                    i17 = i38;
                                                                }
                                                                try {
                                                                    if (C23013a7.f111966a.m117999i(i11, 64)) {
                                                                        String mo2475c = ((ContactProfile) obj).mo2475c();
                                                                        AbstractC19074t.m100207e(mo2475c, "getDpn(...)");
                                                                        m127168X0 = AbstractC24342w.m127168X0(mo2475c);
                                                                        String m120002o = AbstractC23262x6.m120002o(m127168X0.toString());
                                                                        AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                                                                        lowerCase = m120002o.toLowerCase(Locale.ROOT);
                                                                        str3 = str8;
                                                                        try {
                                                                            AbstractC19074t.m100207e(lowerCase, str3);
                                                                            i18 = i16;
                                                                            strArr7 = strArr5;
                                                                            str4 = lowerCase;
                                                                            if (iArr4 == null) {
                                                                                int i39 = -1;
                                                                                for (int i41 = 0; i41 < i26; i41++) {
                                                                                    try {
                                                                                        i39 = i39 + strArr4[i41].length() + 1;
                                                                                    } catch (Exception e14) {
                                                                                        e = e14;
                                                                                        i25 = i18;
                                                                                        exc = e;
                                                                                        z16 = z18;
                                                                                        iArr3 = iArr2;
                                                                                        i15 = i17;
                                                                                        AbstractC23350e.m122774d("SearchOperators", exc.toString());
                                                                                        i12++;
                                                                                        i22 = i15;
                                                                                        str7 = str4;
                                                                                        strArr5 = strArr7;
                                                                                        length = i24;
                                                                                        m118488a2 = strArr10;
                                                                                        i23 = i25;
                                                                                        length2 = i14;
                                                                                        str8 = str3;
                                                                                        strArr8 = strArr6;
                                                                                    }
                                                                                }
                                                                                if (i26 == 0) {
                                                                                    i39 = 0;
                                                                                }
                                                                                i19 = AbstractC24342w.m127173b0(str4, str9, i39 >= 0 ? i39 + i31 : 0, false, 4, null);
                                                                            } else {
                                                                                i19 = iArr4[i26] + i31;
                                                                            }
                                                                            int length5 = str9.length() + i19;
                                                                            if (str9.length() == strArr4[i26].length()) {
                                                                                i21 = -1;
                                                                                iArr2[i26] = -1;
                                                                            } else {
                                                                                i21 = -1;
                                                                            }
                                                                            if (i19 != i21) {
                                                                                try {
                                                                                    iArr3 = iArr2;
                                                                                    try {
                                                                                        list.add(Integer.valueOf(i19));
                                                                                        list.add(Integer.valueOf(length5));
                                                                                    } catch (Exception e15) {
                                                                                        e = e15;
                                                                                        i25 = i18;
                                                                                        exc = e;
                                                                                        z16 = z18;
                                                                                        i15 = i17;
                                                                                        AbstractC23350e.m122774d("SearchOperators", exc.toString());
                                                                                        i12++;
                                                                                        i22 = i15;
                                                                                        str7 = str4;
                                                                                        strArr5 = strArr7;
                                                                                        length = i24;
                                                                                        m118488a2 = strArr10;
                                                                                        i23 = i25;
                                                                                        length2 = i14;
                                                                                        str8 = str3;
                                                                                        strArr8 = strArr6;
                                                                                    }
                                                                                } catch (Exception e16) {
                                                                                    e = e16;
                                                                                    iArr3 = iArr2;
                                                                                }
                                                                            } else {
                                                                                iArr3 = iArr2;
                                                                            }
                                                                            i15 = i17;
                                                                            i25 = i18;
                                                                            z16 = z18;
                                                                        } catch (Exception e17) {
                                                                            e = e17;
                                                                            exc = e;
                                                                            i25 = i16;
                                                                            strArr7 = strArr5;
                                                                            z16 = z18;
                                                                            iArr3 = iArr2;
                                                                            i15 = i17;
                                                                            str4 = str7;
                                                                            AbstractC23350e.m122774d("SearchOperators", exc.toString());
                                                                            i12++;
                                                                            i22 = i15;
                                                                            str7 = str4;
                                                                            strArr5 = strArr7;
                                                                            length = i24;
                                                                            m118488a2 = strArr10;
                                                                            i23 = i25;
                                                                            length2 = i14;
                                                                            str8 = str3;
                                                                            strArr8 = strArr6;
                                                                        }
                                                                    }
                                                                } catch (Exception e18) {
                                                                    e = e18;
                                                                    str3 = str8;
                                                                    exc = e;
                                                                    i25 = i16;
                                                                    strArr7 = strArr5;
                                                                    z16 = z18;
                                                                    iArr3 = iArr2;
                                                                    i15 = i17;
                                                                    str4 = str7;
                                                                    AbstractC23350e.m122774d("SearchOperators", exc.toString());
                                                                    i12++;
                                                                    i22 = i15;
                                                                    str7 = str4;
                                                                    strArr5 = strArr7;
                                                                    length = i24;
                                                                    m118488a2 = strArr10;
                                                                    i23 = i25;
                                                                    length2 = i14;
                                                                    str8 = str3;
                                                                    strArr8 = strArr6;
                                                                }
                                                            } else {
                                                                i17 = i38;
                                                            }
                                                            if (C23013a7.f111966a.m117999i(i11, 256)) {
                                                                strArr7 = strArr5;
                                                                try {
                                                                    str5 = ((ContactProfile) obj).m40383Q(true, false);
                                                                } catch (Exception e19) {
                                                                    e = e19;
                                                                    str4 = str7;
                                                                    i25 = i18;
                                                                    exc = e;
                                                                    z16 = z18;
                                                                    iArr3 = iArr2;
                                                                    i15 = i17;
                                                                    AbstractC23350e.m122774d("SearchOperators", exc.toString());
                                                                    i12++;
                                                                    i22 = i15;
                                                                    str7 = str4;
                                                                    strArr5 = strArr7;
                                                                    length = i24;
                                                                    m118488a2 = strArr10;
                                                                    i23 = i25;
                                                                    length2 = i14;
                                                                    str8 = str3;
                                                                    strArr8 = strArr6;
                                                                }
                                                            } else {
                                                                strArr7 = strArr5;
                                                                str5 = ((ContactProfile) obj).f42437s;
                                                            }
                                                            String m120002o2 = AbstractC23262x6.m120002o(str5);
                                                            AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                                                            lowerCase = m120002o2.toLowerCase(Locale.ROOT);
                                                            AbstractC19074t.m100207e(lowerCase, str3);
                                                            str4 = lowerCase;
                                                            if (iArr4 == null) {
                                                            }
                                                            int length52 = str9.length() + i19;
                                                            if (str9.length() == strArr4[i26].length()) {
                                                            }
                                                            if (i19 != i21) {
                                                            }
                                                            i15 = i17;
                                                            i25 = i18;
                                                            z16 = z18;
                                                        } catch (Exception e21) {
                                                            e = e21;
                                                            strArr7 = strArr5;
                                                            str4 = str7;
                                                            i25 = i18;
                                                            exc = e;
                                                            z16 = z18;
                                                            iArr3 = iArr2;
                                                            i15 = i17;
                                                            AbstractC23350e.m122774d("SearchOperators", exc.toString());
                                                            i12++;
                                                            i22 = i15;
                                                            str7 = str4;
                                                            strArr5 = strArr7;
                                                            length = i24;
                                                            m118488a2 = strArr10;
                                                            i23 = i25;
                                                            length2 = i14;
                                                            str8 = str3;
                                                            strArr8 = strArr6;
                                                        }
                                                        str3 = str8;
                                                        i18 = i16;
                                                    }
                                                } catch (Exception e22) {
                                                    e = e22;
                                                    i17 = i38;
                                                    i18 = i16;
                                                    str3 = str8;
                                                    strArr7 = strArr5;
                                                }
                                            }
                                            i17 = i38;
                                            i18 = i16;
                                            str3 = str8;
                                            strArr7 = strArr5;
                                            str4 = str7;
                                            if (iArr4 == null) {
                                            }
                                            int length522 = str9.length() + i19;
                                            if (str9.length() == strArr4[i26].length()) {
                                            }
                                            if (i19 != i21) {
                                            }
                                            i15 = i17;
                                            i25 = i18;
                                            z16 = z18;
                                        } catch (Exception e23) {
                                            e = e23;
                                            i17 = i38;
                                            i18 = i16;
                                            str3 = str8;
                                            iArr3 = iArr2;
                                            strArr7 = strArr5;
                                            str4 = str7;
                                        }
                                    } catch (Exception e24) {
                                        str3 = str8;
                                        iArr3 = iArr2;
                                        strArr7 = strArr5;
                                        exc = e24;
                                        i15 = i22;
                                    }
                                } else {
                                    str3 = str8;
                                    iArr3 = iArr2;
                                    strArr7 = strArr5;
                                    i15 = i22;
                                    str4 = str7;
                                }
                                i12++;
                                i22 = i15;
                                str7 = str4;
                                strArr5 = strArr7;
                                length = i24;
                                m118488a2 = strArr10;
                                i23 = i25;
                                length2 = i14;
                                str8 = str3;
                                strArr8 = strArr6;
                            }
                            i13 = i22;
                            int i42 = i23;
                            String[] strArr11 = m118488a2;
                            int i43 = 2;
                            if (list2 != null) {
                                list2.clear();
                                C24848g0 c24848g02 = C24848g0.f119245a;
                            }
                            if (i13 != 0 && i13 == strArr11.length) {
                                f12 = f11 / i13;
                                if (list2 != null) {
                                    list2.add(Float.valueOf(f12));
                                }
                                if (!z17 || (strArr4.length == 1 && z24)) {
                                    if (m117999i2) {
                                        if (list2 != null) {
                                            list2.add(Float.valueOf(100.0f));
                                        }
                                        f12 += 100.0f;
                                    }
                                } else if (z24) {
                                    if (m117999i2) {
                                        if (list2 != null) {
                                            list2.add(Float.valueOf(50.0f));
                                        }
                                        f12 += 50.0f;
                                    }
                                    i43 = 1;
                                } else {
                                    i43 = 4;
                                }
                                if (z16 && z25 && i42 == strArr11.length) {
                                    if (list2 != null) {
                                        list2.add(Float.valueOf(C19322f1.f95956g));
                                    }
                                    f12 += C19322f1.f95956g;
                                }
                                f13 = f12;
                                if (obj instanceof ContactProfile) {
                                    ContactProfile contactProfile = (ContactProfile) obj;
                                    if (!AbstractC25495a.m132079d(contactProfile.f42434r) && !C21927m.m114302u().m114318P(contactProfile.f42434r) && !C18644n.m98531l().m98558u(contactProfile.f42434r)) {
                                        contactProfile.f42393Y = true;
                                        i43 = 3;
                                    }
                                    contactProfile.f42396Z = str7.length();
                                    if (str7.length() > 0) {
                                        contactProfile.f42371Q1 = str7;
                                    }
                                }
                                interfaceC0864d = obj instanceof InterfaceC0864d ? (InterfaceC0864d) obj : null;
                                if (interfaceC0864d != null) {
                                    interfaceC0864d.mo2484j(i43);
                                }
                            }
                        }
                    }
                    return f13;
                }
                m118488a2 = strArr;
                strArr5 = null;
                z15 = false;
                int length22 = strArr4.length;
                int[] iArr32 = new int[length22];
                boolean z232 = z15;
                Arrays.fill(iArr32, -2);
                list.clear();
                final InterfaceC18509p aVar2 = a.f111257q;
                int[] iArr42 = iArr;
                AbstractC25356m.m131336s(m118488a2, new Comparator() { // from class: m00.e
                    @Override // java.util.Comparator
                    public final int compare(Object obj22, Object obj32) {
                        int m117422j;
                        m117422j = C22708g.m117422j(InterfaceC18509p.this, obj22, obj32);
                        return m117422j;
                    }
                });
                if (strArr5 != null) {
                }
                length = m118488a2.length;
                z16 = z232;
                String str72 = "";
                String str82 = "toLowerCase(...)";
                int i222 = 0;
                int i232 = 0;
                i12 = 0;
                boolean z242 = false;
                boolean z252 = false;
                z17 = false;
                f11 = 0.0f;
                while (i12 < length) {
                }
                i13 = i222;
                int i422 = i232;
                String[] strArr112 = m118488a2;
                int i432 = 2;
                if (list2 != null) {
                }
                if (i13 != 0) {
                    f12 = f11 / i13;
                    if (list2 != null) {
                    }
                    if (z17) {
                    }
                    if (m117999i2) {
                    }
                    if (z16) {
                        if (list2 != null) {
                        }
                        f12 += C19322f1.f95956g;
                    }
                    f13 = f12;
                    if (obj instanceof ContactProfile) {
                    }
                    interfaceC0864d = obj instanceof InterfaceC0864d ? (InterfaceC0864d) obj : null;
                    if (interfaceC0864d != null) {
                    }
                }
                return f13;
            }
            z11 = false;
        }
        z12 = false;
        z13 = false;
        HashMap hashMap2 = new HashMap();
        float f132 = 0.0f;
        if (strArr8 != null) {
        }
        if (strArr != null) {
        }
        z15 = false;
        int length222 = strArr4.length;
        int[] iArr322 = new int[length222];
        boolean z2322 = z15;
        Arrays.fill(iArr322, -2);
        list.clear();
        final InterfaceC18509p aVar22 = a.f111257q;
        int[] iArr422 = iArr;
        AbstractC25356m.m131336s(m118488a2, new Comparator() { // from class: m00.e
            @Override // java.util.Comparator
            public final int compare(Object obj22, Object obj32) {
                int m117422j;
                m117422j = C22708g.m117422j(InterfaceC18509p.this, obj22, obj32);
                return m117422j;
            }
        });
        if (strArr5 != null) {
        }
        length = m118488a2.length;
        z16 = z2322;
        String str722 = "";
        String str822 = "toLowerCase(...)";
        int i2222 = 0;
        int i2322 = 0;
        i12 = 0;
        boolean z2422 = false;
        boolean z2522 = false;
        z17 = false;
        f11 = 0.0f;
        while (i12 < length) {
        }
        i13 = i2222;
        int i4222 = i2322;
        String[] strArr1122 = m118488a2;
        int i4322 = 2;
        if (list2 != null) {
        }
        if (i13 != 0) {
        }
        return f132;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final int m117422j(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final int m117423k(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }
}
