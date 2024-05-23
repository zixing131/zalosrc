package p384o9;

import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import p345m9.C22961h;

/* renamed from: o9.e */
/* loaded from: classes3.dex */
public class C24135e implements ResponseHandler {

    /* renamed from: a */
    private final ResponseHandler f116660a;

    /* renamed from: b */
    private final Timer f116661b;

    /* renamed from: c */
    private final C22961h f116662c;

    public C24135e(ResponseHandler responseHandler, Timer timer, C22961h c22961h) {
        this.f116660a = responseHandler;
        this.f116661b = timer;
        this.f116662c = c22961h;
    }

    @Override // org.apache.http.client.ResponseHandler
    public Object handleResponse(HttpResponse httpResponse) {
        this.f116662c.m117708t(this.f116661b.m34292c());
        this.f116662c.m117701k(httpResponse.getStatusLine().getStatusCode());
        Long m126107a = AbstractC24137g.m126107a(httpResponse);
        if (m126107a != null) {
            this.f116662c.m117706p(m126107a.longValue());
        }
        String m126108b = AbstractC24137g.m126108b(httpResponse);
        if (m126108b != null) {
            this.f116662c.m117705o(m126108b);
        }
        this.f116662c.m117696b();
        return this.f116660a.handleResponse(httpResponse);
    }
}
