package p360n9;

import android.content.Context;
import java.net.URI;
import p319l9.C22152a;
import p476r9.AbstractC25704l;
import p507s9.C26191h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n9.c */
/* loaded from: classes3.dex */
public final class C23629c extends AbstractC23631e {

    /* renamed from: c */
    private static final C22152a f114507c = C22152a.m115524e();

    /* renamed from: a */
    private final C26191h f114508a;

    /* renamed from: b */
    private final Context f114509b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C23629c(C26191h c26191h, Context context) {
        this.f114509b = context;
        this.f114508a = c26191h;
    }

    /* renamed from: g */
    private URI m123852g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e11) {
            f114507c.m115534k("getResultUrl throws exception %s", e11.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    private boolean m123853h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return AbstractC25704l.m132618a(uri, context);
    }

    /* renamed from: i */
    private boolean m123854i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    /* renamed from: j */
    private boolean m123855j(String str) {
        return m123854i(str);
    }

    /* renamed from: k */
    private boolean m123856k(String str) {
        if (str != null && !m123854i(str) && str.length() <= 255) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m123857m(int i11) {
        return i11 > 0;
    }

    /* renamed from: n */
    private boolean m123858n(long j11) {
        return j11 >= 0;
    }

    /* renamed from: o */
    private boolean m123859o(int i11) {
        return i11 == -1 || i11 > 0;
    }

    /* renamed from: p */
    private boolean m123860p(String str) {
        if (str == null) {
            return false;
        }
        if (!"http".equalsIgnoreCase(str) && !"https".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private boolean m123861q(long j11) {
        return j11 >= 0;
    }

    /* renamed from: r */
    private boolean m123862r(String str) {
        return str == null;
    }

    @Override // p360n9.AbstractC23631e
    /* renamed from: c */
    public boolean mo123851c() {
        C26191h.d dVar;
        if (m123855j(this.f114508a.m134650n0())) {
            f114507c.m115533j("URL is missing:" + this.f114508a.m134650n0());
            return false;
        }
        URI m123852g = m123852g(this.f114508a.m134650n0());
        if (m123852g == null) {
            f114507c.m115533j("URL cannot be parsed");
            return false;
        }
        if (!m123853h(m123852g, this.f114509b)) {
            f114507c.m115533j("URL fails allowlist rule: " + m123852g);
            return false;
        }
        if (!m123856k(m123852g.getHost())) {
            f114507c.m115533j("URL host is null or invalid");
            return false;
        }
        if (!m123860p(m123852g.getScheme())) {
            f114507c.m115533j("URL scheme is null or invalid");
            return false;
        }
        if (!m123862r(m123852g.getUserInfo())) {
            f114507c.m115533j("URL user info is null");
            return false;
        }
        if (!m123859o(m123852g.getPort())) {
            f114507c.m115533j("URL port is less than or equal to 0");
            return false;
        }
        if (this.f114508a.m134652p0()) {
            dVar = this.f114508a.m134641e0();
        } else {
            dVar = null;
        }
        if (!m123863l(dVar)) {
            f114507c.m115533j("HTTP Method is null or invalid: " + this.f114508a.m134641e0());
            return false;
        }
        if (this.f114508a.m134653q0() && !m123857m(this.f114508a.m134642f0())) {
            f114507c.m115533j("HTTP ResponseCode is a negative value:" + this.f114508a.m134642f0());
            return false;
        }
        if (this.f114508a.m134654r0() && !m123858n(this.f114508a.m134644h0())) {
            f114507c.m115533j("Request Payload is a negative value:" + this.f114508a.m134644h0());
            return false;
        }
        if (this.f114508a.m134655s0() && !m123858n(this.f114508a.m134646j0())) {
            f114507c.m115533j("Response Payload is a negative value:" + this.f114508a.m134646j0());
            return false;
        }
        if (this.f114508a.m134651o0() && this.f114508a.m134640c0() > 0) {
            if (this.f114508a.m134656t0() && !m123861q(this.f114508a.m134647k0())) {
                f114507c.m115533j("Time to complete the request is a negative value:" + this.f114508a.m134647k0());
                return false;
            }
            if (this.f114508a.m134658v0() && !m123861q(this.f114508a.m134649m0())) {
                f114507c.m115533j("Time from the start of the request to the start of the response is null or a negative value:" + this.f114508a.m134649m0());
                return false;
            }
            if (this.f114508a.m134657u0() && this.f114508a.m134648l0() > 0) {
                if (!this.f114508a.m134653q0()) {
                    f114507c.m115533j("Did not receive a HTTP Response Code");
                    return false;
                }
                return true;
            }
            f114507c.m115533j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f114508a.m134648l0());
            return false;
        }
        f114507c.m115533j("Start time of the request is null, or zero, or a negative value:" + this.f114508a.m134640c0());
        return false;
    }

    /* renamed from: l */
    boolean m123863l(C26191h.d dVar) {
        if (dVar != null && dVar != C26191h.d.HTTP_METHOD_UNKNOWN) {
            return true;
        }
        return false;
    }
}
