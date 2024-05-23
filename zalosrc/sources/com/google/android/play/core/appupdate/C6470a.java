package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import java.util.Map;

/* renamed from: com.google.android.play.core.appupdate.a */
/* loaded from: classes3.dex */
public class C6470a {

    /* renamed from: a */
    private final String f36258a;

    /* renamed from: b */
    private final int f36259b;

    /* renamed from: c */
    private final int f36260c;

    /* renamed from: d */
    private final int f36261d;

    /* renamed from: e */
    private final Integer f36262e;

    /* renamed from: f */
    private final int f36263f;

    /* renamed from: g */
    private final long f36264g;

    /* renamed from: h */
    private final long f36265h;

    /* renamed from: i */
    private final long f36266i;

    /* renamed from: j */
    private final long f36267j;

    /* renamed from: k */
    private final PendingIntent f36268k;

    /* renamed from: l */
    private final PendingIntent f36269l;

    /* renamed from: m */
    private final PendingIntent f36270m;

    /* renamed from: n */
    private final PendingIntent f36271n;

    /* renamed from: o */
    private final Map f36272o;

    /* renamed from: p */
    private boolean f36273p = false;

    private C6470a(String str, int i11, int i12, int i13, Integer num, int i14, long j11, long j12, long j13, long j14, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f36258a = str;
        this.f36259b = i11;
        this.f36260c = i12;
        this.f36261d = i13;
        this.f36262e = num;
        this.f36263f = i14;
        this.f36264g = j11;
        this.f36265h = j12;
        this.f36266i = j13;
        this.f36267j = j14;
        this.f36268k = pendingIntent;
        this.f36269l = pendingIntent2;
        this.f36270m = pendingIntent3;
        this.f36271n = pendingIntent4;
        this.f36272o = map;
    }

    /* renamed from: g */
    public static C6470a m33323g(String str, int i11, int i12, int i13, Integer num, int i14, long j11, long j12, long j13, long j14, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new C6470a(str, i11, i12, i13, num, i14, j11, j12, j13, j14, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    /* renamed from: j */
    private final boolean m33324j(AbstractC6476d abstractC6476d) {
        if (abstractC6476d.mo33342a() && this.f36266i <= this.f36267j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int m33325a() {
        return this.f36259b;
    }

    /* renamed from: b */
    public int m33326b() {
        return this.f36261d;
    }

    /* renamed from: c */
    public boolean m33327c(int i11) {
        if (m33330f(AbstractC6476d.m33344c(i11)) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m33328d(AbstractC6476d abstractC6476d) {
        if (m33330f(abstractC6476d) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int m33329e() {
        return this.f36260c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final PendingIntent m33330f(AbstractC6476d abstractC6476d) {
        if (abstractC6476d.mo33343b() == 0) {
            PendingIntent pendingIntent = this.f36269l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (!m33324j(abstractC6476d)) {
                return null;
            }
            return this.f36271n;
        }
        if (abstractC6476d.mo33343b() == 1) {
            PendingIntent pendingIntent2 = this.f36268k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (m33324j(abstractC6476d)) {
                return this.f36270m;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m33331h() {
        this.f36273p = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean m33332i() {
        return this.f36273p;
    }
}
