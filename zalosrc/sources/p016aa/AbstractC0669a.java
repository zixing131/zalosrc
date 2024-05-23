package p016aa;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: aa.a */
/* loaded from: classes3.dex */
public abstract class AbstractC0669a {

    /* renamed from: a */
    private static final TimeZone f2227a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    private static boolean m947a(String str, int i11, char c11) {
        if (i11 < str.length() && str.charAt(i11) == c11) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static int m948b(String str, int i11) {
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (charAt >= '0' && charAt <= '9') {
                i11++;
            } else {
                return i11;
            }
        }
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d1  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date m949c(String str, ParsePosition parsePosition) {
        String str2;
        String message;
        int i11;
        int i12;
        int i13;
        int i14;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i15 = index + 4;
            int m950d = m950d(str, index, i15);
            if (m947a(str, i15, '-')) {
                i15 = index + 5;
            }
            int i16 = i15 + 2;
            int m950d2 = m950d(str, i15, i16);
            if (m947a(str, i16, '-')) {
                i16 = i15 + 3;
            }
            int i17 = i16 + 2;
            int m950d3 = m950d(str, i16, i17);
            boolean m947a = m947a(str, i17, 'T');
            if (!m947a && str.length() <= i17) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(m950d, m950d2 - 1, m950d3);
                parsePosition.setIndex(i17);
                return gregorianCalendar.getTime();
            }
            if (m947a) {
                int i18 = i16 + 5;
                int m950d4 = m950d(str, i16 + 3, i18);
                if (m947a(str, i18, ':')) {
                    i18 = i16 + 6;
                }
                int i19 = i18 + 2;
                int m950d5 = m950d(str, i18, i19);
                if (m947a(str, i19, ':')) {
                    i19 = i18 + 3;
                }
                if (str.length() > i19 && (charAt = str.charAt(i19)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i21 = i19 + 2;
                    i14 = m950d(str, i19, i21);
                    if (i14 > 59 && i14 < 63) {
                        i14 = 59;
                    }
                    if (m947a(str, i21, '.')) {
                        int i22 = i19 + 3;
                        int m948b = m948b(str, i19 + 4);
                        int min = Math.min(m948b, i19 + 6);
                        int m950d6 = m950d(str, i22, min);
                        int i23 = min - i22;
                        if (i23 != 1) {
                            if (i23 == 2) {
                                m950d6 *= 10;
                            }
                        } else {
                            m950d6 *= 100;
                        }
                        i11 = m950d4;
                        i17 = m948b;
                        i12 = m950d5;
                        i13 = m950d6;
                    } else {
                        i11 = m950d4;
                        i17 = i21;
                        i12 = m950d5;
                        i13 = 0;
                    }
                } else {
                    i12 = m950d5;
                    i13 = 0;
                    i14 = 0;
                    i17 = i19;
                    i11 = m950d4;
                }
            } else {
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            if (str.length() > i17) {
                char charAt2 = str.charAt(i17);
                if (charAt2 == 'Z') {
                    timeZone = f2227a;
                    length = i17 + 1;
                } else {
                    if (charAt2 != '+' && charAt2 != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                    }
                    String substring = str.substring(i17);
                    if (substring.length() < 5) {
                        substring = substring + "00";
                    }
                    length = i17 + substring.length();
                    if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                        String str3 = "GMT" + substring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id2 = timeZone2.getID();
                        if (!id2.equals(str3) && !id2.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                    timeZone = f2227a;
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, m950d);
                gregorianCalendar2.set(2, m950d2 - 1);
                gregorianCalendar2.set(5, m950d3);
                gregorianCalendar2.set(11, i11);
                gregorianCalendar2.set(12, i12);
                gregorianCalendar2.set(13, i14);
                gregorianCalendar2.set(14, i13);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            throw new IllegalArgumentException("No time zone indicator");
        } catch (IllegalArgumentException e11) {
            e = e11;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e12) {
            e = e12;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e13) {
            e = e13;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException22 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        }
    }

    /* renamed from: d */
    private static int m950d(String str, int i11, int i12) {
        int i13;
        int i14;
        if (i11 >= 0 && i12 <= str.length() && i11 <= i12) {
            if (i11 < i12) {
                i14 = i11 + 1;
                int digit = Character.digit(str.charAt(i11), 10);
                if (digit >= 0) {
                    i13 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
                }
            } else {
                i13 = 0;
                i14 = i11;
            }
            while (i14 < i12) {
                int i15 = i14 + 1;
                int digit2 = Character.digit(str.charAt(i14), 10);
                if (digit2 >= 0) {
                    i13 = (i13 * 10) - digit2;
                    i14 = i15;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
                }
            }
            return -i13;
        }
        throw new NumberFormatException(str);
    }
}
