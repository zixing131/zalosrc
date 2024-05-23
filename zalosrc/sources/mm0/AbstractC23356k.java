package mm0;

import android.text.TextUtils;
import java.util.List;

/* renamed from: mm0.k */
/* loaded from: classes7.dex */
public abstract class AbstractC23356k {

    /* renamed from: a */
    public static final char[] f113576a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m122795a(String str, String[] strArr, String[] strArr2, boolean z11, int i11) {
        String str2;
        String str3;
        int length;
        String str4;
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            if (i11 >= 0) {
                int length2 = strArr.length;
                int length3 = strArr2.length;
                if (length2 == length3) {
                    boolean[] zArr = new boolean[length2];
                    int i12 = -1;
                    int i13 = -1;
                    for (int i14 = 0; i14 < length2; i14++) {
                        if (!zArr[i14] && (str4 = strArr[i14]) != null && !TextUtils.isEmpty(str4) && strArr2[i14] != null) {
                            int indexOf = str.indexOf(strArr[i14]);
                            if (indexOf == -1) {
                                zArr[i14] = true;
                            } else if (i12 == -1 || indexOf < i12) {
                                i13 = i14;
                                i12 = indexOf;
                            }
                        }
                    }
                    if (i12 == -1) {
                        return str;
                    }
                    int i15 = 0;
                    for (int i16 = 0; i16 < strArr.length; i16++) {
                        if (strArr[i16] != null && (str3 = strArr2[i16]) != null && (length = str3.length() - strArr[i16].length()) > 0) {
                            i15 += length * 3;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder(str.length() + Math.min(i15, str.length() / 5));
                    int i17 = 0;
                    while (i12 != -1) {
                        while (i17 < i12) {
                            sb2.append(str.charAt(i17));
                            i17++;
                        }
                        sb2.append(strArr2[i13]);
                        i17 = strArr[i13].length() + i12;
                        i12 = -1;
                        i13 = -1;
                        for (int i18 = 0; i18 < length2; i18++) {
                            if (!zArr[i18] && (str2 = strArr[i18]) != null && !TextUtils.isEmpty(str2) && strArr2[i18] != null) {
                                int indexOf2 = str.indexOf(strArr[i18], i17);
                                if (indexOf2 == -1) {
                                    zArr[i18] = true;
                                } else if (i12 == -1 || indexOf2 < i12) {
                                    i13 = i18;
                                    i12 = indexOf2;
                                }
                            }
                        }
                    }
                    int length4 = str.length();
                    while (i17 < length4) {
                        sb2.append(str.charAt(i17));
                        i17++;
                    }
                    String sb3 = sb2.toString();
                    if (!z11) {
                        return sb3;
                    }
                    return m122795a(sb3, strArr, strArr2, z11, i11 - 1);
                }
                throw new IllegalArgumentException("Search and Replace array lengths don't match: " + length2 + " vs " + length3);
            }
            throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
        }
        return str;
    }

    /* renamed from: b */
    public static String m122796b(List list, String str) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 != 0) {
                sb2.append(str);
            }
            sb2.append((String) list.get(i11));
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public static String m122797c(String str, String[] strArr, String[] strArr2) {
        return m122795a(str, strArr, strArr2, false, 0);
    }

    /* renamed from: d */
    public static String m122798d(byte b11) {
        StringBuffer stringBuffer = new StringBuffer("");
        char[] cArr = f113576a;
        stringBuffer.append(cArr[(b11 & 255) >> 4]);
        stringBuffer.append(cArr[b11 & 15]);
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static String m122799e(byte[] bArr) {
        return m122800f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static String m122800f(byte[] bArr, int i11, int i12) {
        if (bArr != null && bArr.length != 0 && i12 <= bArr.length && i11 + i12 <= bArr.length) {
            StringBuffer stringBuffer = new StringBuffer(i12 * 2);
            while (i11 < i12) {
                stringBuffer.append(m122798d(bArr[i11]));
                i11++;
            }
            return stringBuffer.toString();
        }
        return "";
    }
}
