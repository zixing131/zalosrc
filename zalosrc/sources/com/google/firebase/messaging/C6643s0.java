package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.s0 */
/* loaded from: classes.dex */
public final class C6643s0 {

    /* renamed from: a */
    private final SharedPreferences f36692a;

    /* renamed from: b */
    private final String f36693b;

    /* renamed from: c */
    private final String f36694c;

    /* renamed from: e */
    private final Executor f36696e;

    /* renamed from: d */
    final ArrayDeque f36695d = new ArrayDeque();

    /* renamed from: f */
    private boolean f36697f = false;

    private C6643s0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f36692a = sharedPreferences;
        this.f36693b = str;
        this.f36694c = str2;
        this.f36696e = executor;
    }

    /* renamed from: b */
    private boolean m33939b(boolean z11) {
        if (z11 && !this.f36697f) {
            m33943i();
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C6643s0 m33940c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C6643s0 c6643s0 = new C6643s0(sharedPreferences, str, str2, executor);
        c6643s0.m33941d();
        return c6643s0;
    }

    /* renamed from: d */
    private void m33941d() {
        synchronized (this.f36695d) {
            try {
                this.f36695d.clear();
                String string = this.f36692a.getString(this.f36693b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f36694c)) {
                    String[] split = string.split(this.f36694c, -1);
                    int length = split.length;
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f36695d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m33942h() {
        synchronized (this.f36695d) {
            this.f36692a.edit().putString(this.f36693b, m33946g()).commit();
        }
    }

    /* renamed from: i */
    private void m33943i() {
        this.f36696e.execute(new Runnable() { // from class: com.google.firebase.messaging.r0
            @Override // java.lang.Runnable
            public final void run() {
                C6643s0.this.m33942h();
            }
        });
    }

    /* renamed from: e */
    public String m33944e() {
        String str;
        synchronized (this.f36695d) {
            str = (String) this.f36695d.peek();
        }
        return str;
    }

    /* renamed from: f */
    public boolean m33945f(Object obj) {
        boolean m33939b;
        synchronized (this.f36695d) {
            m33939b = m33939b(this.f36695d.remove(obj));
        }
        return m33939b;
    }

    /* renamed from: g */
    public String m33946g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f36695d.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(this.f36694c);
        }
        return sb2.toString();
    }
}
