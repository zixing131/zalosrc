package p672y7;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p014a8.InterfaceC0650a;

/* renamed from: y7.a */
/* loaded from: classes3.dex */
public class C30804a {

    /* renamed from: g */
    private static final String[] f142255g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h */
    static final DateFormat f142256h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    private final String f142257a;

    /* renamed from: b */
    private final String f142258b;

    /* renamed from: c */
    private final String f142259c;

    /* renamed from: d */
    private final Date f142260d;

    /* renamed from: e */
    private final long f142261e;

    /* renamed from: f */
    private final long f142262f;

    public C30804a(String str, String str2, String str3, Date date, long j11, long j12) {
        this.f142257a = str;
        this.f142258b = str2;
        this.f142259c = str3;
        this.f142260d = date;
        this.f142261e = j11;
        this.f142262f = j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C30804a m149870a(InterfaceC0650a.c cVar) {
        String str = cVar.f2186d;
        if (str == null) {
            str = "";
        }
        return new C30804a(cVar.f2184b, String.valueOf(cVar.f2185c), str, new Date(cVar.f2195m), cVar.f2187e, cVar.f2192j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C30804a m149871b(Map map) {
        String str;
        m149872g(map);
        try {
            Date parse = f142256h.parse((String) map.get("experimentStartTime"));
            long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
            long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
            String str2 = (String) map.get("experimentId");
            String str3 = (String) map.get("variantId");
            if (map.containsKey("triggerEvent")) {
                str = (String) map.get("triggerEvent");
            } else {
                str = "";
            }
            return new C30804a(str2, str3, str, parse, parseLong, parseLong2);
        } catch (NumberFormatException e11) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e11);
        } catch (ParseException e12) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e12);
        }
    }

    /* renamed from: g */
    private static void m149872g(Map map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f142255g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m149873c() {
        return this.f142257a;
    }

    /* renamed from: d */
    long m149874d() {
        return this.f142260d.getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m149875e() {
        return this.f142258b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public InterfaceC0650a.c m149876f(String str) {
        String str2;
        InterfaceC0650a.c cVar = new InterfaceC0650a.c();
        cVar.f2183a = str;
        cVar.f2195m = m149874d();
        cVar.f2184b = this.f142257a;
        cVar.f2185c = this.f142258b;
        if (TextUtils.isEmpty(this.f142259c)) {
            str2 = null;
        } else {
            str2 = this.f142259c;
        }
        cVar.f2186d = str2;
        cVar.f2187e = this.f142261e;
        cVar.f2192j = this.f142262f;
        return cVar;
    }
}
