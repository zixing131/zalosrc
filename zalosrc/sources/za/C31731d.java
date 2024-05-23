package za;

import com.google.zxing.EnumC6846a;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import va.C27954b;

/* renamed from: za.d */
/* loaded from: classes3.dex */
public final class C31731d extends AbstractC31741n {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: za.d$a */
    /* loaded from: classes3.dex */
    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: g */
    private static int m152688g(CharSequence charSequence, int i11, int i12) {
        a m152689h;
        a m152689h2;
        char charAt;
        a m152689h3 = m152689h(charSequence, i11);
        a aVar = a.ONE_DIGIT;
        if (m152689h3 == aVar) {
            if (i12 == 101) {
                return 101;
            }
            return 100;
        }
        a aVar2 = a.UNCODABLE;
        if (m152689h3 == aVar2) {
            if (i11 < charSequence.length() && ((charAt = charSequence.charAt(i11)) < ' ' || (i12 == 101 && (charAt < '`' || (charAt >= 241 && charAt <= 244))))) {
                return 101;
            }
            return 100;
        }
        if (i12 == 101 && m152689h3 == a.FNC_1) {
            return 101;
        }
        if (i12 == 99) {
            return 99;
        }
        if (i12 == 100) {
            a aVar3 = a.FNC_1;
            if (m152689h3 == aVar3 || (m152689h = m152689h(charSequence, i11 + 2)) == aVar2 || m152689h == aVar) {
                return 100;
            }
            if (m152689h == aVar3) {
                if (m152689h(charSequence, i11 + 3) != a.TWO_DIGITS) {
                    return 100;
                }
                return 99;
            }
            int i13 = i11 + 4;
            while (true) {
                m152689h2 = m152689h(charSequence, i13);
                if (m152689h2 != a.TWO_DIGITS) {
                    break;
                }
                i13 += 2;
            }
            if (m152689h2 == a.ONE_DIGIT) {
                return 100;
            }
            return 99;
        }
        if (m152689h3 == a.FNC_1) {
            m152689h3 = m152689h(charSequence, i11 + 1);
        }
        if (m152689h3 != a.TWO_DIGITS) {
            return 100;
        }
        return 99;
    }

    /* renamed from: h */
    private static a m152689h(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        if (i11 >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i11);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i12 = i11 + 1;
            if (i12 >= length) {
                return a.ONE_DIGIT;
            }
            char charAt2 = charSequence.charAt(i12);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return a.TWO_DIGITS;
            }
            return a.ONE_DIGIT;
        }
        return a.UNCODABLE;
    }

    @Override // za.AbstractC31741n, com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        if (enumC6846a == EnumC6846a.CODE_128) {
            return super.mo960a(str, enumC6846a, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got " + enumC6846a);
    }

    @Override // za.AbstractC31741n
    /* renamed from: d */
    public boolean[] mo152687d(String str) {
        int length = str.length();
        if (length >= 1 && length <= 80) {
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                char charAt = str.charAt(i12);
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                        break;
                    default:
                        if (charAt > 127) {
                            throw new IllegalArgumentException("Bad character in input: " + charAt);
                        }
                        break;
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 1;
            while (true) {
                int i17 = 103;
                if (i13 < length) {
                    int m152688g = m152688g(str, i13, i15);
                    int i18 = 100;
                    if (m152688g == i15) {
                        switch (str.charAt(i13)) {
                            case 241:
                                i18 = 102;
                                break;
                            case 242:
                                i18 = 97;
                                break;
                            case 243:
                                i18 = 96;
                                break;
                            case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                                if (i15 == 101) {
                                    i18 = 101;
                                    break;
                                }
                                break;
                            default:
                                if (i15 == 100) {
                                    i18 = str.charAt(i13) - ' ';
                                    break;
                                } else if (i15 != 101) {
                                    i18 = Integer.parseInt(str.substring(i13, i13 + 2));
                                    i13++;
                                    break;
                                } else {
                                    char charAt2 = str.charAt(i13);
                                    i18 = charAt2 - ' ';
                                    if (i18 < 0) {
                                        i18 = charAt2 + '@';
                                        break;
                                    }
                                }
                                break;
                        }
                        i13++;
                    } else {
                        if (i15 == 0) {
                            if (m152688g != 100) {
                                if (m152688g != 101) {
                                    i17 = 105;
                                }
                            } else {
                                i17 = 104;
                            }
                        } else {
                            i17 = m152688g;
                        }
                        i18 = i17;
                        i15 = m152688g;
                    }
                    arrayList.add(AbstractC31730c.f145796a[i18]);
                    i14 += i18 * i16;
                    if (i13 != 0) {
                        i16++;
                    }
                } else {
                    int[][] iArr = AbstractC31730c.f145796a;
                    arrayList.add(iArr[i14 % 103]);
                    arrayList.add(iArr[106]);
                    int i19 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i21 : iArr2) {
                            i19 += i21;
                        }
                    }
                    boolean[] zArr = new boolean[i19];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        i11 += AbstractC31741n.m152695b(zArr, i11, (int[]) it.next(), true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + length);
        }
    }
}
