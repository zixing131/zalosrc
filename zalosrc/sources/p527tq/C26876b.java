package p527tq;

import android.os.Bundle;
import is.AbstractC20826v0;

/* renamed from: tq.b */
/* loaded from: classes4.dex */
public class C26876b {

    /* renamed from: a */
    public int f127178a;

    /* renamed from: b */
    public String f127179b;

    /* renamed from: c */
    public String f127180c;

    /* renamed from: d */
    public long f127181d;

    public C26876b(int i11, String str, String str2, long j11) {
        this.f127178a = i11;
        this.f127179b = str;
        this.f127180c = str2;
        this.f127181d = j11;
    }

    /* renamed from: a */
    public static C26876b m138439a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new C26876b(bundle.getInt(AbstractC20826v0.f102360j, -1), bundle.getString(AbstractC20826v0.f102361k, ""), bundle.getString(AbstractC20826v0.f102363m, ""), bundle.getLong(AbstractC20826v0.f102362l, 0L));
    }
}
