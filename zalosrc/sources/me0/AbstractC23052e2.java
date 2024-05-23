package me0;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: me0.e2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23052e2 {

    /* renamed from: a */
    private static final NumberFormat f112055a;

    /* renamed from: b */
    private static final NumberFormat f112056b;

    /* renamed from: c */
    private static final DecimalFormatSymbols f112057c;

    /* renamed from: d */
    private static NumberFormat f112058d;

    static {
        Locale locale = Locale.US;
        f112055a = new DecimalFormat("#0.00", new DecimalFormatSymbols(locale));
        f112056b = new DecimalFormat("#0.00000", new DecimalFormatSymbols(locale));
        f112057c = new DecimalFormatSymbols(new Locale("en_US"));
    }

    /* renamed from: a */
    public static String m118265a(double d11, int i11) {
        if (i11 == 2) {
            return f112055a.format(d11);
        }
        if (i11 == 5) {
            return f112056b.format(d11);
        }
        return f112055a.format(d11);
    }

    /* renamed from: b */
    public static String m118266b(long j11) {
        if (f112058d == null) {
            DecimalFormatSymbols decimalFormatSymbols = f112057c;
            decimalFormatSymbols.setGroupingSeparator('.');
            f112058d = new DecimalFormat("###,###", decimalFormatSymbols);
        }
        return f112058d.format(j11);
    }
}
