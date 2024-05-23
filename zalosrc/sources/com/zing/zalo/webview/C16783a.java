package com.zing.zalo.webview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p267jh.C21253b;
import p664y.AbstractC30228a;

/* renamed from: com.zing.zalo.webview.a */
/* loaded from: classes5.dex */
public class C16783a {

    /* renamed from: a */
    private List f85183a;

    /* renamed from: b */
    private final C21253b f85184b;

    /* renamed from: com.zing.zalo.webview.a$a */
    /* loaded from: classes5.dex */
    private static final class a {

        /* renamed from: a */
        static final C16783a f85185a = new C16783a();
    }

    /* renamed from: b */
    public static C16783a m89629b() {
        return a.f85185a;
    }

    /* renamed from: a */
    public synchronized void m89630a(int i11) {
        Iterator it = this.f85183a.iterator();
        if (it.hasNext()) {
            AbstractC30228a.m149044a(it.next());
            throw null;
        }
    }

    private C16783a() {
        this.f85183a = new ArrayList();
        this.f85184b = new C21253b();
    }
}
