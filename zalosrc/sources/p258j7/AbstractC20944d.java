package p258j7;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j7.d */
/* loaded from: classes3.dex */
public abstract class AbstractC20944d {
    /* renamed from: b */
    public static AbstractC20944d m109477b(int i11, int i12, int i13, long j11, long j12, List list, List list2) {
        if (i12 != 8) {
            return new C20948f(i11, i12, i13, j11, j12, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    /* renamed from: n */
    public static AbstractC20944d m109478n(Bundle bundle) {
        return new C20948f(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    /* renamed from: a */
    public abstract long mo109479a();

    /* renamed from: c */
    public abstract int mo109480c();

    /* renamed from: d */
    public boolean m109481d() {
        int mo109486i = mo109486i();
        if (mo109486i != 0 && mo109486i != 5 && mo109486i != 6 && mo109486i != 7) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public List m109482e() {
        if (mo109488k() != null) {
            return new ArrayList(mo109488k());
        }
        return new ArrayList();
    }

    /* renamed from: f */
    public List m109483f() {
        if (mo109489l() != null) {
            return new ArrayList(mo109489l());
        }
        return new ArrayList();
    }

    /* renamed from: g */
    public abstract PendingIntent mo109484g();

    /* renamed from: h */
    public abstract int mo109485h();

    /* renamed from: i */
    public abstract int mo109486i();

    /* renamed from: j */
    public abstract long mo109487j();

    /* renamed from: k */
    public abstract List mo109488k();

    /* renamed from: l */
    public abstract List mo109489l();

    /* renamed from: m */
    public abstract List mo109490m();
}
