package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class vx2 {

    /* renamed from: a */
    private final dy2 f29604a;

    /* renamed from: b */
    private final WebView f29605b;

    /* renamed from: c */
    private final List f29606c = new ArrayList();

    /* renamed from: d */
    private final Map f29607d = new HashMap();

    /* renamed from: e */
    private final String f29608e = "";

    /* renamed from: f */
    private final String f29609f;

    /* renamed from: g */
    private final wx2 f29610g;

    private vx2(dy2 dy2Var, WebView webView, String str, List list, String str2, String str3, wx2 wx2Var) {
        this.f29604a = dy2Var;
        this.f29605b = webView;
        this.f29610g = wx2Var;
        this.f29609f = str2;
    }

    /* renamed from: b */
    public static vx2 m27428b(dy2 dy2Var, WebView webView, String str, String str2) {
        return new vx2(dy2Var, webView, null, null, str, "", wx2.HTML);
    }

    /* renamed from: c */
    public static vx2 m27429c(dy2 dy2Var, WebView webView, String str, String str2) {
        return new vx2(dy2Var, webView, null, null, str, "", wx2.JAVASCRIPT);
    }

    /* renamed from: a */
    public final WebView m27430a() {
        return this.f29605b;
    }

    /* renamed from: d */
    public final wx2 m27431d() {
        return this.f29610g;
    }

    /* renamed from: e */
    public final dy2 m27432e() {
        return this.f29604a;
    }

    /* renamed from: f */
    public final String m27433f() {
        return this.f29609f;
    }

    /* renamed from: g */
    public final String m27434g() {
        return this.f29608e;
    }

    /* renamed from: h */
    public final List m27435h() {
        return Collections.unmodifiableList(this.f29606c);
    }

    /* renamed from: i */
    public final Map m27436i() {
        return Collections.unmodifiableMap(this.f29607d);
    }
}
