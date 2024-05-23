package me0;

import android.text.TextUtils;
import au.AbstractC2353j;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zinstant.zom.node.ZOM;
import ho0.AbstractC20110a;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: me0.q4 */
/* loaded from: classes4.dex */
public class C23186q4 extends DateFormat {

    /* renamed from: p */
    DateFormatSymbols f112406p;

    /* renamed from: q */
    Locale f112407q;

    /* renamed from: r */
    String[] f112408r;

    /* renamed from: s */
    String[] f112409s;

    /* renamed from: t */
    String[] f112410t;

    /* renamed from: u */
    String[] f112411u;

    /* renamed from: v */
    String[] f112412v;

    /* renamed from: w */
    private final transient char[] f112413w;

    /* renamed from: x */
    private transient char f112414x;

    /* renamed from: y */
    private static final int[] f112404y = {0, 1, 2, 5, 11, 11, 12, 13, 14, 7, 6, 8, 3, 4, 9, 10, 10, 15, 15, 15, 2, 7};

    /* renamed from: z */
    private static final Set f112405z = Collections.unmodifiableSet(new HashSet(Arrays.asList("Etc/UCT", "Etc/UTC", "Etc/Universal", "Etc/Zulu", "UCT", "UTC", "Universal", "Zulu")));

    /* renamed from: A */
    private static final ConcurrentMap f112403A = new ConcurrentHashMap(3);

    public C23186q4(String str, Locale locale) {
        this.f112413w = m119475c(str);
        this.f112407q = locale;
        ((DateFormat) this).calendar = Calendar.getInstance(TimeZone.getDefault(), locale);
        this.f112406p = DateFormatSymbols.getInstance(locale);
        ConcurrentMap concurrentMap = f112403A;
        NumberFormat numberFormat = (NumberFormat) concurrentMap.get(locale);
        ((DateFormat) this).numberFormat = numberFormat;
        if (numberFormat == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
            ((DateFormat) this).numberFormat = integerInstance;
            integerInstance.setGroupingUsed(false);
            concurrentMap.putIfAbsent(locale, ((DateFormat) this).numberFormat);
        }
        ((DateFormat) this).numberFormat = (NumberFormat) ((DateFormat) this).numberFormat.clone();
        this.f112408r = MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_days_of_week_full);
        this.f112409s = MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_days_of_week_short);
        this.f112411u = MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_months_lunar_short);
        this.f112410t = MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_months_lunar_full);
        this.f112412v = MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_years_lunar);
    }

    /* renamed from: a */
    private void m119473a(StringBuffer stringBuffer, int i11, int i12) {
        int minimumIntegerDigits = ((DateFormat) this).numberFormat.getMinimumIntegerDigits();
        ((DateFormat) this).numberFormat.setMinimumIntegerDigits(i11);
        ((DateFormat) this).numberFormat.format(Integer.valueOf(i12), stringBuffer, new FieldPosition(0));
        ((DateFormat) this).numberFormat.setMinimumIntegerDigits(minimumIntegerDigits);
    }

    /* renamed from: b */
    private void m119474b(StringBuffer stringBuffer, boolean z11) {
        char c11;
        int i11 = ((DateFormat) this).calendar.get(15) + ((DateFormat) this).calendar.get(16);
        if (i11 < 0) {
            i11 = -i11;
            c11 = '-';
        } else {
            c11 = '+';
        }
        if (z11) {
            stringBuffer.append("GMT");
        }
        stringBuffer.append(c11);
        m119473a(stringBuffer, 2, i11 / 3600000);
        if (z11) {
            stringBuffer.append(':');
        }
        m119473a(stringBuffer, 2, (i11 % 3600000) / 60000);
    }

    /* renamed from: c */
    private char[] m119475c(String str) {
        int i11;
        char charAt;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length * 2);
        int i12 = 0;
        StringBuilder sb3 = null;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = -1;
        while (i13 < length) {
            char charAt2 = str.charAt(i13);
            if (charAt2 == '\'') {
                int i16 = i13 + 1;
                if (i16 < length && (charAt = str.charAt(i16)) == '\'') {
                    if (i14 != 0) {
                        m119476e(i15, i14, sb2);
                        i14 = 0;
                        i15 = -1;
                    }
                    if (z11) {
                        sb3.append(charAt);
                    } else {
                        sb2.append((char) (charAt | 25600));
                    }
                    i13 = i16;
                    i11 = 1;
                    i13 += i11;
                    i12 = 0;
                } else {
                    if (!z11) {
                        if (i14 != 0) {
                            m119476e(i15, i14, sb2);
                            i14 = 0;
                            i15 = -1;
                        }
                        if (sb3 == null) {
                            sb3 = new StringBuilder(length);
                        } else {
                            sb3.setLength(i12);
                        }
                        i11 = 1;
                        z11 = true;
                    } else {
                        int length2 = sb3.length();
                        if (length2 == 1) {
                            char charAt3 = sb3.charAt(i12);
                            if (charAt3 < 128) {
                                sb2.append((char) (charAt3 | 25600));
                            } else {
                                sb2.append((char) 25857);
                                sb2.append(charAt3);
                            }
                        } else {
                            m119476e(101, length2, sb2);
                            sb2.append((CharSequence) sb3);
                        }
                        i11 = 1;
                        z11 = false;
                    }
                    i13 += i11;
                    i12 = 0;
                }
            } else {
                if (z11) {
                    sb3.append(charAt2);
                } else if ((charAt2 >= 'a' && charAt2 <= 'z') || (charAt2 >= 'A' && charAt2 <= 'Z')) {
                    int indexOf = "GyMdkHmsSEDFwWahKzZYuXLc".indexOf(charAt2);
                    if (indexOf != -1) {
                        if (i15 != -1 && i15 != indexOf) {
                            m119476e(i15, i14, sb2);
                            i15 = indexOf;
                            i11 = 1;
                            i14 = 1;
                            i13 += i11;
                            i12 = 0;
                        } else {
                            i14++;
                            i15 = indexOf;
                        }
                    } else {
                        throw new IllegalArgumentException("Illegal pattern character '" + charAt2 + "'");
                    }
                } else {
                    if (i14 != 0) {
                        m119476e(i15, i14, sb2);
                        i14 = 0;
                        i15 = -1;
                    }
                    if (charAt2 < 128) {
                        sb2.append((char) (charAt2 | 25600));
                    } else {
                        int i17 = i13 + 1;
                        while (i17 < length) {
                            char charAt4 = str.charAt(i17);
                            if (charAt4 == '\'' || ((charAt4 >= 'a' && charAt4 <= 'z') || (charAt4 >= 'A' && charAt4 <= 'Z'))) {
                                break;
                            }
                            i17++;
                        }
                        sb2.append((char) ((i17 - i13) | 25856));
                        while (i13 < i17) {
                            sb2.append(str.charAt(i13));
                            i13++;
                        }
                        i13--;
                    }
                }
                i11 = 1;
                i13 += i11;
                i12 = 0;
            }
        }
        if (!z11) {
            if (i14 != 0) {
                m119476e(i15, i14, sb2);
            }
            int length3 = sb2.length();
            char[] cArr = new char[length3];
            sb2.getChars(0, length3, cArr, 0);
            return cArr;
        }
        throw new IllegalArgumentException("Unterminated quote");
    }

    /* renamed from: e */
    private static void m119476e(int i11, int i12, StringBuilder sb2) {
        if (i11 == 21 && i12 >= 4) {
            throw new IllegalArgumentException("invalid ISO 8601 format: length=" + i12);
        }
        if (i12 < 255) {
            sb2.append((char) ((i11 << 8) | i12));
            return;
        }
        sb2.append((char) ((i11 << 8) | 255));
        sb2.append((char) (i12 >>> 16));
        sb2.append((char) (65535 & i12));
    }

    /* renamed from: f */
    private StringBuffer m119477f(Date date, StringBuffer stringBuffer) {
        ((DateFormat) this).calendar.setTime(date);
        int[] m12344g = AbstractC2353j.m12344g(((DateFormat) this).calendar.get(5), ((DateFormat) this).calendar.get(2) + 1, ((DateFormat) this).calendar.get(1), 7.0d);
        int i11 = 0;
        while (true) {
            char[] cArr = this.f112413w;
            if (i11 < cArr.length) {
                char c11 = cArr[i11];
                int i12 = c11 >>> '\b';
                int i13 = i11 + 1;
                int i14 = c11 & 255;
                if (i14 == 255) {
                    int i15 = cArr[i13] << 16;
                    i14 = cArr[i11 + 2] | i15;
                    i13 = i11 + 3;
                }
                if (i12 != 100) {
                    if (i12 != 101) {
                        m119481j(i12, i14, stringBuffer, m12344g);
                    } else {
                        stringBuffer.append(cArr, i13, i14);
                        i13 += i14;
                    }
                } else {
                    stringBuffer.append((char) i14);
                }
                i11 = i13;
            } else {
                return stringBuffer;
            }
        }
    }

    /* renamed from: g */
    private String m119478g(int i11, int i12, boolean z11, int i13, StringBuffer stringBuffer) {
        String[] strArr;
        String str = null;
        if (i11 == 4) {
            strArr = this.f112410t;
        } else if (i11 == 3) {
            strArr = this.f112411u;
        } else {
            strArr = null;
        }
        if (strArr != null) {
            str = strArr[(i12 - 1) % strArr.length];
        }
        if (z11 && !TextUtils.isEmpty(str)) {
            str = String.format("%s %s", str, MainApplication.getAppContext().getString(AbstractC8020f0.str_format_date_string_lunar_leap_full));
        }
        if (TextUtils.isEmpty(str)) {
            m119482k(i12, i11, i13, stringBuffer);
        }
        return str;
    }

    /* renamed from: h */
    private String m119479h(int i11, int i12) {
        String[] strArr;
        if (i11 > 3) {
            strArr = this.f112408r;
        } else {
            strArr = this.f112409s;
        }
        return strArr[i12];
    }

    /* renamed from: i */
    public static void m119480i(StringBuffer stringBuffer, int i11, int i12) {
        long j11 = i11;
        if (j11 < 0) {
            stringBuffer.append('-');
            j11 = -j11;
            i12--;
        }
        int i13 = 10;
        for (int i14 = 2; i14 < i12; i14++) {
            i13 *= 10;
        }
        for (int i15 = 1; i15 < i12 && j11 < i13; i15++) {
            stringBuffer.append('0');
            i13 /= 10;
        }
        stringBuffer.append(j11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:            if (r9 == null) goto L57;     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m119481j(int i11, int i12, StringBuffer stringBuffer, int[] iArr) {
        boolean z11;
        boolean z12;
        String displayName;
        int i13 = ((DateFormat) this).calendar.get(f112404y[i11]);
        String str = "";
        int i14 = 0;
        boolean z13 = false;
        String str2 = null;
        switch (i11) {
            case 0:
                String[] eras = this.f112406p.getEras();
                if (i13 < eras.length) {
                    str2 = eras[i13];
                    break;
                }
                break;
            case 1:
            case 19:
                String[] strArr = this.f112412v;
                str = strArr[((iArr[2] + strArr.length) - 4) % strArr.length];
                break;
            case 2:
            case 22:
                int i15 = iArr[1];
                if (iArr[3] == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                str = m119478g(i12, i15, z11, Integer.MAX_VALUE, stringBuffer);
                break;
            case 3:
                str = iArr[0] + "";
                break;
            case 4:
                if (i13 == 0) {
                    m119482k(((DateFormat) this).calendar.getMaximum(11) + 1, i12, Integer.MAX_VALUE, stringBuffer);
                } else {
                    m119482k(i13, i12, Integer.MAX_VALUE, stringBuffer);
                }
                str = str2;
                break;
            case 5:
            case 6:
            case 7:
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                m119482k(i13, i12, Integer.MAX_VALUE, stringBuffer);
                str = str2;
                break;
            case 8:
                m119482k((int) ((i13 / 1000.0d) * Math.pow(10.0d, i12)), i12, i12, stringBuffer);
                str = str2;
                break;
            case 9:
            case 23:
                str = m119479h(i12, i13);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 20:
            default:
                str = str2;
                break;
            case 14:
                str = this.f112406p.getAmPmStrings()[i13];
                break;
            case 15:
                if (i13 == 0) {
                    m119482k(((DateFormat) this).calendar.getLeastMaximum(10) + 1, i12, Integer.MAX_VALUE, stringBuffer);
                } else {
                    m119482k(i13, i12, Integer.MAX_VALUE, stringBuffer);
                }
                str = str2;
                break;
            case 17:
                TimeZone timeZone = ((DateFormat) this).calendar.getTimeZone();
                if (((DateFormat) this).calendar.get(16) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (f112405z.contains(timeZone.getID())) {
                    displayName = "UTC";
                } else {
                    if (i12 >= 4) {
                        i14 = 1;
                    }
                    displayName = timeZone.getDisplayName(z12, i14, this.f112407q);
                }
                if (displayName != null) {
                    stringBuffer.append(displayName);
                } else {
                    m119474b(stringBuffer, true);
                }
                str = str2;
                break;
            case 18:
                if (i12 == 4) {
                    z13 = true;
                }
                m119474b(stringBuffer, z13);
                str = str2;
                break;
            case 21:
                int i16 = ((DateFormat) this).calendar.get(15) + ((DateFormat) this).calendar.get(16);
                if (i16 == 0) {
                    stringBuffer.append('Z');
                } else {
                    int i17 = i16 / 60000;
                    if (i17 >= 0) {
                        stringBuffer.append('+');
                    } else {
                        stringBuffer.append('-');
                        i17 = -i17;
                    }
                    m119480i(stringBuffer, i17 / 60, 2);
                    if (i12 != 1) {
                        if (i12 == 3) {
                            stringBuffer.append(':');
                        }
                        m119480i(stringBuffer, i17 % 60, 2);
                    }
                }
                str = str2;
                break;
        }
        if (str != null) {
            stringBuffer.append(str);
        }
    }

    /* renamed from: k */
    private void m119482k(int i11, int i12, int i13, StringBuffer stringBuffer) {
        try {
            if (this.f112414x == 0) {
                this.f112414x = ((DecimalFormat) ((DateFormat) this).numberFormat).getDecimalFormatSymbols().getZeroDigit();
            }
            if (i11 >= 0) {
                if (i11 < 100 && i12 >= 1 && i12 <= 2) {
                    if (i11 < 10) {
                        if (i12 == 2) {
                            stringBuffer.append(this.f112414x);
                        }
                        stringBuffer.append((char) (this.f112414x + i11));
                        return;
                    } else {
                        stringBuffer.append((char) (this.f112414x + (i11 / 10)));
                        stringBuffer.append((char) (this.f112414x + (i11 % 10)));
                        return;
                    }
                }
                if (i11 >= 1000 && i11 < 10000) {
                    if (i12 == 4) {
                        stringBuffer.append((char) (this.f112414x + (i11 / 1000)));
                        int i14 = i11 % 1000;
                        stringBuffer.append((char) (this.f112414x + (i14 / 100)));
                        int i15 = i14 % 100;
                        stringBuffer.append((char) (this.f112414x + (i15 / 10)));
                        stringBuffer.append((char) (this.f112414x + (i15 % 10)));
                        return;
                    }
                    if (i12 == 2 && i13 == 2) {
                        m119482k(i11 % 100, 2, 2, stringBuffer);
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        ((DateFormat) this).numberFormat.setMinimumIntegerDigits(i12);
        ((DateFormat) this).numberFormat.setMaximumIntegerDigits(i13);
        ((DateFormat) this).numberFormat.format(i11, stringBuffer, new FieldPosition(0));
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return m119477f(date, stringBuffer);
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        return null;
    }
}
