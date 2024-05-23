package mx;

import android.os.SystemClock;
import android.text.TextUtils;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import p171fx.AbstractC19164e;

/* renamed from: mx.l */
/* loaded from: classes.dex */
public class C23475l {

    /* renamed from: e */
    private static C23475l f113996e = null;

    /* renamed from: f */
    private static byte f113997f = -1;

    /* renamed from: a */
    private String f113998a;

    /* renamed from: b */
    private boolean f113999b = false;

    /* renamed from: c */
    ArrayList f114000c;

    /* renamed from: d */
    ArrayList f114001d;

    private C23475l(byte b11, String str) {
        m123245g(b11, str);
    }

    /* renamed from: c */
    public static byte m123239c() {
        if (f113996e == null) {
            return (byte) -1;
        }
        return f113997f;
    }

    /* renamed from: d */
    public static C23475l m123240d() {
        if (f113996e == null) {
            f113996e = new C23475l((byte) -1, "");
        }
        return f113996e;
    }

    /* renamed from: e */
    public static void m123241e(byte b11, String str) {
        if (f113996e == null) {
            f113996e = new C23475l(b11, str);
        }
    }

    /* renamed from: a */
    public void m123242a(String str) {
        try {
            if (!this.f113999b && f113997f >= 0 && !TextUtils.isEmpty(this.f113998a)) {
                this.f114000c.add(Long.valueOf(SystemClock.elapsedRealtime()));
                this.f114001d.add(str);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104536e(e11);
        }
    }

    /* renamed from: b */
    public void m123243b() {
        String str;
        try {
            if (this.f113999b) {
                return;
            }
            if (f113997f > -1 && !TextUtils.isEmpty(this.f113998a)) {
                long longValue = ((Long) this.f114000c.get(0)).longValue();
                long j11 = longValue;
                for (int i11 = 1; i11 < this.f114000c.size(); i11++) {
                    j11 = ((Long) this.f114000c.get(i11)).longValue();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f113998a);
                sb2.append(": end, ");
                long j12 = j11 - longValue;
                sb2.append(j12);
                sb2.append(" ms");
                AbstractC20110a.m104541j(sb2.toString(), new Object[0]);
                String str2 = (String) this.f114001d.get(this.f114000c.size() - 1);
                byte b11 = f113997f;
                String str3 = this.f113998a;
                if (str3 != null && str3.equals(str2)) {
                    str = null;
                } else {
                    str = str2;
                }
                AbstractC19164e.m100537w((byte) 0, b11, str3, str, j12);
            }
            f113996e = null;
        } catch (Exception e11) {
            AbstractC20110a.m104536e(e11);
        }
    }

    /* renamed from: f */
    public void m123244f() {
        this.f113999b = false;
        ArrayList arrayList = this.f114000c;
        if (arrayList == null) {
            this.f114000c = new ArrayList();
            this.f114001d = new ArrayList();
        } else {
            arrayList.clear();
            this.f114001d.clear();
        }
        m123242a(null);
    }

    /* renamed from: g */
    public void m123245g(byte b11, String str) {
        f113997f = b11;
        this.f113998a = str;
        m123244f();
    }
}
