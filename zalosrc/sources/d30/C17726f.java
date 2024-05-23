package d30;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import pm0.C24860q;

/* renamed from: d30.f */
/* loaded from: classes5.dex */
public final class C17726f {

    /* renamed from: a */
    private final Map f89853a;

    /* renamed from: b */
    private final Map f89854b;

    public C17726f(String str) {
        AbstractC19074t.m100208f(str, "item2IndexPath");
        Map m93831e = m93831e(str);
        this.f89853a = m93831e;
        this.f89854b = new HashMap();
        for (C24860q c24860q : m93831e.keySet()) {
            Integer num = (Integer) this.f89853a.get(c24860q);
            if (num != null) {
                this.f89854b.put(Integer.valueOf(num.intValue()), c24860q);
            }
        }
    }

    /* renamed from: e */
    private final Map m93831e(String str) {
        HashMap hashMap = new HashMap();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                readLine = null;
            } else {
                str2 = readLine;
            }
            if (readLine == null) {
                break;
            }
            stringBuffer.append(str2);
        }
        bufferedReader.close();
        JSONArray jSONArray = new JSONArray(stringBuffer.toString());
        int length = jSONArray.length();
        if (length > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                JSONArray jSONArray2 = jSONArray.getJSONArray(i11);
                hashMap.put(new C24860q(Integer.valueOf(jSONArray2.getInt(0)), jSONArray2.getString(1)), Integer.valueOf(i11));
                if (i12 >= length) {
                    break;
                }
                i11 = i12;
            }
        }
        AbstractC20110a.f98889a.mo104548a("MFModel Number sticker %s", Integer.valueOf(hashMap.size()));
        return hashMap;
    }

    /* renamed from: a */
    public final Set m93832a() {
        return this.f89854b.keySet();
    }

    /* renamed from: b */
    public final Integer m93833b(C24860q c24860q) {
        AbstractC19074t.m100208f(c24860q, "itemId");
        return (Integer) this.f89853a.get(c24860q);
    }

    /* renamed from: c */
    public final C24860q m93834c(int i11) {
        return (C24860q) this.f89854b.get(Integer.valueOf(i11));
    }

    /* renamed from: d */
    public final int m93835d() {
        return this.f89853a.size();
    }
}
