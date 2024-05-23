package au;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: au.i0 */
/* loaded from: classes4.dex */
public final class C2352i0 {

    /* renamed from: a */
    private int f9869a;

    /* renamed from: b */
    private String f9870b;

    /* renamed from: c */
    private ArrayList f9871c;

    /* renamed from: d */
    private ArrayList f9872d;

    /* renamed from: e */
    private String f9873e;

    /* renamed from: f */
    private String f9874f;

    public C2352i0(String str) {
        this(1, str);
    }

    /* renamed from: a */
    private void m12328a(String str) {
        try {
            if (TextUtils.isEmpty(this.f9870b)) {
                return;
            }
            this.f9872d.add(str);
            this.f9871c.add(Long.valueOf(SystemClock.elapsedRealtime()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    private void m12329c() {
        ArrayList arrayList = this.f9871c;
        if (arrayList == null) {
            this.f9871c = new ArrayList();
            this.f9872d = new ArrayList();
        } else {
            arrayList.clear();
            this.f9872d.clear();
        }
        m12328a("");
    }

    /* renamed from: e */
    private long m12330e() {
        int size;
        ArrayList arrayList = this.f9871c;
        if (arrayList != null && (size = arrayList.size()) >= 2) {
            return ((Long) this.f9871c.get(size - 1)).longValue() - ((Long) this.f9871c.get(size - 2)).longValue();
        }
        return 0L;
    }

    /* renamed from: b */
    public synchronized long m12331b(String str) {
        m12328a(str);
        return m12330e();
    }

    /* renamed from: d */
    public synchronized String m12332d() {
        StringBuilder sb2;
        String str;
        long j11;
        try {
            sb2 = new StringBuilder();
            try {
                if (!TextUtils.isEmpty(this.f9870b)) {
                    int size = this.f9871c.size();
                    sb2.append("\n=========== START JOB: ");
                    sb2.append(this.f9870b);
                    sb2.append(" ============\n");
                    long j12 = 0;
                    long j13 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        if (i11 == 0) {
                            j12 = ((Long) this.f9871c.get(i11)).longValue();
                            str = "Start";
                            j11 = j12;
                        } else {
                            long j14 = j13;
                            str = "[" + (((Long) this.f9871c.get(i11)).longValue() - j12) + " ms, " + ((String) this.f9872d.get(i11)) + "]";
                            j12 = ((Long) this.f9871c.get(i11)).longValue();
                            j11 = j14;
                        }
                        m12335h(str);
                        sb2.append(str);
                        sb2.append(", ");
                        if (i11 == size - 1) {
                            String str2 = "End, Total: " + (((Long) this.f9871c.get(i11)).longValue() - j11) + " ms";
                            m12335h(str2);
                            sb2.append(str2);
                        }
                        i11++;
                        j13 = j11;
                    }
                    if (!TextUtils.isEmpty(this.f9874f)) {
                        sb2.append(", Extra Param: ");
                        sb2.append(this.f9874f);
                    }
                    sb2.append("\n=========== END JOB: ");
                    sb2.append(this.f9870b);
                    sb2.append(" =============");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sb2.toString();
    }

    /* renamed from: f */
    public String m12333f() {
        return this.f9873e;
    }

    /* renamed from: g */
    public String m12334g() {
        return this.f9874f;
    }

    /* renamed from: h */
    public void m12335h(String str) {
    }

    /* renamed from: i */
    public void m12336i(String str) {
        this.f9873e = str;
    }

    /* renamed from: j */
    public void m12337j(String str) {
        this.f9874f = str;
    }

    public C2352i0(int i11, String str) {
        this.f9869a = i11;
        this.f9870b = str;
        m12329c();
    }
}
