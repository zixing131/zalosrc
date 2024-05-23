package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p053c9.AbstractC3372d;
import p126e9.C18307b;
import p126e9.InterfaceC18306a;

/* renamed from: com.google.firebase.installations.h */
/* loaded from: classes.dex */
public final class C6589h {

    /* renamed from: b */
    public static final long f36547b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f36548c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C6589h f36549d;

    /* renamed from: a */
    private final InterfaceC18306a f36550a;

    private C6589h(InterfaceC18306a interfaceC18306a) {
        this.f36550a = interfaceC18306a;
    }

    /* renamed from: c */
    public static C6589h m33670c() {
        return m33671d(C18307b.m97219b());
    }

    /* renamed from: d */
    public static C6589h m33671d(InterfaceC18306a interfaceC18306a) {
        if (f36549d == null) {
            f36549d = new C6589h(interfaceC18306a);
        }
        return f36549d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m33672g(String str) {
        return f36548c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m33673h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m33674a() {
        return this.f36550a.mo97218a();
    }

    /* renamed from: b */
    public long m33675b() {
        return TimeUnit.MILLISECONDS.toSeconds(m33674a());
    }

    /* renamed from: e */
    public long m33676e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m33677f(AbstractC3372d abstractC3372d) {
        if (TextUtils.isEmpty(abstractC3372d.mo16938b()) || abstractC3372d.mo16944h() + abstractC3372d.mo16939c() < m33675b() + f36547b) {
            return true;
        }
        return false;
    }
}
