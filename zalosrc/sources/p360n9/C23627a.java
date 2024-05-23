package p360n9;

import p319l9.C22152a;
import p507s9.C26186c;

/* renamed from: n9.a */
/* loaded from: classes3.dex */
public class C23627a extends AbstractC23631e {

    /* renamed from: b */
    private static final C22152a f114504b = C22152a.m115524e();

    /* renamed from: a */
    private final C26186c f114505a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C23627a(C26186c c26186c) {
        this.f114505a = c26186c;
    }

    /* renamed from: g */
    private boolean m123850g() {
        C26186c c26186c = this.f114505a;
        if (c26186c == null) {
            f114504b.m115533j("ApplicationInfo is null");
            return false;
        }
        if (!c26186c.m134556X()) {
            f114504b.m115533j("GoogleAppId is null");
            return false;
        }
        if (!this.f114505a.m134554V()) {
            f114504b.m115533j("AppInstanceId is null");
            return false;
        }
        if (!this.f114505a.m134555W()) {
            f114504b.m115533j("ApplicationProcessState is null");
            return false;
        }
        if (this.f114505a.m134553U()) {
            if (!this.f114505a.m134552R().m134525Q()) {
                f114504b.m115533j("AndroidAppInfo.packageName is null");
                return false;
            }
            if (!this.f114505a.m134552R().m134526R()) {
                f114504b.m115533j("AndroidAppInfo.sdkVersion is null");
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // p360n9.AbstractC23631e
    /* renamed from: c */
    public boolean mo123851c() {
        if (!m123850g()) {
            f114504b.m115533j("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }
}
