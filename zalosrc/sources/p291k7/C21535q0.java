package p291k7;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: k7.q0 */
/* loaded from: classes3.dex */
public final class C21535q0 {

    /* renamed from: a */
    private final Context f104573a;

    public C21535q0(Context context) {
        this.f104573a = context;
    }

    /* renamed from: b */
    private static String m111191b(Locale locale) {
        String concat;
        String language = locale.getLanguage();
        if (locale.getCountry().isEmpty()) {
            concat = "";
        } else {
            concat = "_".concat(String.valueOf(locale.getCountry()));
        }
        return String.valueOf(language).concat(concat);
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0022 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m111192a() {
        LocaleList locales;
        int size;
        int size2;
        Locale locale;
        Configuration configuration = this.f104573a.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size2; i11++) {
                locale = locales.get(i11);
                arrayList.add(m111191b(locale));
            }
            return arrayList;
        }
        return Collections.singletonList(m111191b(configuration.locale));
    }
}
