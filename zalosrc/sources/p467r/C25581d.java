package p467r;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p562v.AbstractC27392e;

/* renamed from: r.d */
/* loaded from: classes2.dex */
public final class C25581d {

    /* renamed from: a */
    private final C25587j f122273a;

    /* renamed from: b */
    private final WebView f122274b;

    /* renamed from: c */
    private final List f122275c;

    /* renamed from: d */
    private final Map f122276d;

    /* renamed from: e */
    private final String f122277e;

    /* renamed from: f */
    private final String f122278f;

    /* renamed from: g */
    private final String f122279g;

    /* renamed from: h */
    private final EnumC25582e f122280h;

    private C25581d(C25587j c25587j, WebView webView, String str, List list, String str2, String str3, EnumC25582e enumC25582e) {
        ArrayList arrayList = new ArrayList();
        this.f122275c = arrayList;
        this.f122276d = new HashMap();
        this.f122273a = c25587j;
        this.f122274b = webView;
        this.f122277e = str;
        this.f122280h = enumC25582e;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C25588k c25588k = (C25588k) it.next();
                this.f122276d.put(UUID.randomUUID().toString(), c25588k);
            }
        }
        this.f122279g = str2;
        this.f122278f = str3;
    }

    /* renamed from: a */
    public static C25581d m132143a(C25587j c25587j, WebView webView, String str, String str2) {
        AbstractC27392e.m140336b(c25587j, "Partner is null");
        AbstractC27392e.m140336b(webView, "WebView is null");
        if (str2 != null) {
            AbstractC27392e.m140337c(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C25581d(c25587j, webView, null, null, str, str2, EnumC25582e.HTML);
    }

    /* renamed from: b */
    public static C25581d m132144b(C25587j c25587j, String str, List list, String str2, String str3) {
        AbstractC27392e.m140336b(c25587j, "Partner is null");
        AbstractC27392e.m140336b(str, "OM SDK JS script content is null");
        AbstractC27392e.m140336b(list, "VerificationScriptResources is null");
        if (str3 != null) {
            AbstractC27392e.m140337c(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C25581d(c25587j, null, str, list, str2, str3, EnumC25582e.NATIVE);
    }

    /* renamed from: c */
    public EnumC25582e m132145c() {
        return this.f122280h;
    }

    /* renamed from: d */
    public String m132146d() {
        return this.f122279g;
    }

    /* renamed from: e */
    public String m132147e() {
        return this.f122278f;
    }

    /* renamed from: f */
    public Map m132148f() {
        return Collections.unmodifiableMap(this.f122276d);
    }

    /* renamed from: g */
    public String m132149g() {
        return this.f122277e;
    }

    /* renamed from: h */
    public C25587j m132150h() {
        return this.f122273a;
    }

    /* renamed from: i */
    public List m132151i() {
        return Collections.unmodifiableList(this.f122275c);
    }

    /* renamed from: j */
    public WebView m132152j() {
        return this.f122274b;
    }
}
