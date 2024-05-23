package p454qn;

import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: qn.a */
/* loaded from: classes3.dex */
public abstract class AbstractC25384a {
    /* renamed from: a */
    public static final String m131570a(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (!Character.isWhitespace(str.charAt(i12))) {
                cArr[i11] = str.charAt(i12);
                i11++;
            }
        }
        if (i11 == length) {
            return str;
        }
        if (i11 == 0) {
            return "";
        }
        return new String(cArr, 0, i11);
    }

    /* renamed from: b */
    public static final JSONObject m131571b(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() != 0) {
            try {
            } catch (Exception unused) {
                return null;
            }
        }
        return new JSONObject(str);
    }
}
