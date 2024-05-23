package p093d6;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.AbstractC4205o;
import p568v5.C27532c;
import p568v5.C27536g;
import p568v5.C27540k;
import p568v5.C27555z;

/* renamed from: d6.e */
/* loaded from: classes2.dex */
public abstract class AbstractC17764e {

    /* renamed from: a */
    public static final C4071a f89938a;

    /* renamed from: b */
    public static final InterfaceC17756a f89939b;

    /* renamed from: c */
    public static final InterfaceC17760c f89940c;

    /* renamed from: d */
    public static final InterfaceC17766f f89941d;

    /* renamed from: e */
    private static final C4071a.g f89942e;

    /* renamed from: f */
    private static final C4071a.a f89943f;

    static {
        C4071a.g gVar = new C4071a.g();
        f89942e = gVar;
        C17788w c17788w = new C17788w();
        f89943f = c17788w;
        f89938a = new C4071a("LocationServices.API", c17788w, gVar);
        f89939b = new C27555z();
        f89940c = new C27532c();
        f89941d = new C27540k();
    }

    /* renamed from: a */
    public static C17758b m93911a(Context context) {
        return new C17758b(context);
    }

    /* renamed from: b */
    public static C27536g m93912b(AbstractC4073c abstractC4073c) {
        boolean z11;
        boolean z12 = false;
        if (abstractC4073c != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19713b(z11, "GoogleApiClient parameter is required.");
        C27536g c27536g = (C27536g) abstractC4073c.mo19260i(f89942e);
        if (c27536g != null) {
            z12 = true;
        }
        AbstractC4205o.m19727p(z12, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return c27536g;
    }
}
