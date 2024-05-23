package sl;

import com.zing.zalo.data.zalocloud.model.api.CloudSettings;
import fn0.AbstractC19060k;
import p348mi.AbstractC23306f;

/* renamed from: sl.c */
/* loaded from: classes3.dex */
public final class C26318c {

    /* renamed from: a */
    private final int f124981a;

    /* renamed from: b */
    private final int f124982b;

    /* renamed from: c */
    private final int f124983c;

    /* renamed from: d */
    private final int f124984d;

    public C26318c(int i11, int i12, int i13, int i14) {
        this.f124981a = i11;
        this.f124982b = i12;
        this.f124983c = i13;
        this.f124984d = i14;
    }

    /* renamed from: a */
    public final int m135455a() {
        return this.f124981a;
    }

    /* renamed from: b */
    public final int m135456b() {
        return this.f124983c;
    }

    /* renamed from: c */
    public final int m135457c() {
        return this.f124984d;
    }

    /* renamed from: d */
    public final int m135458d() {
        return this.f124982b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26318c)) {
            return false;
        }
        C26318c c26318c = (C26318c) obj;
        return this.f124981a == c26318c.f124981a && this.f124982b == c26318c.f124982b && this.f124983c == c26318c.f124983c && this.f124984d == c26318c.f124984d;
    }

    public int hashCode() {
        return (((((this.f124981a * 31) + this.f124982b) * 31) + this.f124983c) * 31) + this.f124984d;
    }

    public String toString() {
        return "UpdateCloudSettingsParams(cloudMediaFileSizeLimit=" + this.f124981a + ", myCloudFileSizeLimit=" + this.f124982b + ", enableCommunity=" + this.f124983c + ", enableOffload=" + this.f124984d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C26318c(int i11, int i12, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
        this(i11, i12, i13, i14);
        if ((i15 & 1) != 0) {
            CloudSettings m124816l0 = AbstractC23306f.m120679j2().m124816l0();
            i11 = m124816l0 != null ? m124816l0.m41306a() : 1024;
        }
        if ((i15 & 2) != 0) {
            CloudSettings m124816l02 = AbstractC23306f.m120679j2().m124816l0();
            i12 = m124816l02 != null ? m124816l02.m41309d() : 1024;
        }
        if ((i15 & 4) != 0) {
            CloudSettings m124816l03 = AbstractC23306f.m120679j2().m124816l0();
            i13 = m124816l03 != null ? m124816l03.m41307b() : 0;
        }
        if ((i15 & 8) != 0) {
            CloudSettings m124816l04 = AbstractC23306f.m120679j2().m124816l0();
            i14 = m124816l04 != null ? m124816l04.m41308c() : 0;
        }
    }
}
