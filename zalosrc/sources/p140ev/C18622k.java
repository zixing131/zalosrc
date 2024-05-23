package p140ev;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ev.k */
/* loaded from: classes4.dex */
public final class C18622k {

    /* renamed from: a */
    private String f93707a;

    /* renamed from: b */
    private String f93708b;

    /* renamed from: c */
    private long f93709c;

    /* renamed from: d */
    private final List f93710d;

    public C18622k(String str, String str2, long j11, List list) {
        this.f93707a = str;
        this.f93708b = str2;
        this.f93709c = j11;
        ArrayList arrayList = new ArrayList();
        this.f93710d = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    /* renamed from: a */
    public final List m98416a() {
        return new ArrayList(this.f93710d);
    }

    /* renamed from: b */
    public final long m98417b() {
        return this.f93709c;
    }

    /* renamed from: c */
    public final String m98418c() {
        return this.f93708b;
    }

    /* renamed from: d */
    public final boolean m98419d() {
        if (!TextUtils.isEmpty(this.f93707a) && !TextUtils.isEmpty(this.f93708b) && this.f93709c > 0) {
            return true;
        }
        return false;
    }
}
