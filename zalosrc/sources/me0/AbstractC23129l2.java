package me0;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: me0.l2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23129l2 {

    /* renamed from: a */
    public static final Pattern f112235a = Pattern.compile("[+-][0-9]*.[0-9]*");

    /* renamed from: a */
    public static double[] m118632a(String str) {
        double d11;
        double[] dArr = {0.0d, 0.0d};
        try {
            if (!TextUtils.isEmpty(str)) {
                Matcher matcher = f112235a.matcher(str);
                double d12 = 0.0d;
                if (matcher.find()) {
                    d11 = Float.parseFloat(matcher.group());
                } else {
                    d11 = 0.0d;
                }
                if (matcher.find()) {
                    d12 = Float.parseFloat(matcher.group());
                }
                if (d11 >= -90.0d && d11 <= 90.0d && d12 >= -180.0d && d12 <= 180.0d) {
                    dArr[0] = d11;
                    dArr[1] = d12;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return dArr;
    }
}
