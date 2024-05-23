package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C4071a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p257j6.C20931a;
import p664y.AbstractC30228a;
import p665y0.C30240b;

/* renamed from: com.google.android.gms.common.internal.e */
/* loaded from: classes2.dex */
public final class C4175e {

    /* renamed from: a */
    private final Account f16579a;

    /* renamed from: b */
    private final Set f16580b;

    /* renamed from: c */
    private final Set f16581c;

    /* renamed from: d */
    private final Map f16582d;

    /* renamed from: e */
    private final int f16583e;

    /* renamed from: f */
    private final View f16584f;

    /* renamed from: g */
    private final String f16585g;

    /* renamed from: h */
    private final String f16586h;

    /* renamed from: i */
    private final C20931a f16587i;

    /* renamed from: j */
    private Integer f16588j;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private Account f16589a;

        /* renamed from: b */
        private C30240b f16590b;

        /* renamed from: c */
        private String f16591c;

        /* renamed from: d */
        private String f16592d;

        /* renamed from: e */
        private C20931a f16593e = C20931a.f102803y;

        /* renamed from: a */
        public C4175e m19659a() {
            return new C4175e(this.f16589a, this.f16590b, null, 0, null, this.f16591c, this.f16592d, this.f16593e, false);
        }

        /* renamed from: b */
        public a m19660b(String str) {
            this.f16591c = str;
            return this;
        }

        /* renamed from: c */
        public final a m19661c(Collection collection) {
            if (this.f16590b == null) {
                this.f16590b = new C30240b();
            }
            this.f16590b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final a m19662d(Account account) {
            this.f16589a = account;
            return this;
        }

        /* renamed from: e */
        public final a m19663e(String str) {
            this.f16592d = str;
            return this;
        }
    }

    public C4175e(Account account, Set set, Map map, int i11, View view, String str, String str2, C20931a c20931a, boolean z11) {
        Set unmodifiableSet;
        this.f16579a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.f16580b = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.f16582d = map;
        this.f16584f = view;
        this.f16583e = i11;
        this.f16585g = str;
        this.f16586h = str2;
        this.f16587i = c20931a == null ? C20931a.f102803y : c20931a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f16581c = Collections.unmodifiableSet(hashSet);
        } else {
            AbstractC30228a.m149044a(it.next());
            throw null;
        }
    }

    /* renamed from: a */
    public Account m19647a() {
        return this.f16579a;
    }

    /* renamed from: b */
    public String m19648b() {
        Account account = this.f16579a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public Account m19649c() {
        Account account = this.f16579a;
        if (account != null) {
            return account;
        }
        return new Account(AbstractC4172d.DEFAULT_ACCOUNT, "com.google");
    }

    /* renamed from: d */
    public Set m19650d() {
        return this.f16581c;
    }

    /* renamed from: e */
    public Set m19651e(C4071a c4071a) {
        AbstractC30228a.m149044a(this.f16582d.get(c4071a));
        return this.f16580b;
    }

    /* renamed from: f */
    public String m19652f() {
        return this.f16585g;
    }

    /* renamed from: g */
    public Set m19653g() {
        return this.f16580b;
    }

    /* renamed from: h */
    public final C20931a m19654h() {
        return this.f16587i;
    }

    /* renamed from: i */
    public final Integer m19655i() {
        return this.f16588j;
    }

    /* renamed from: j */
    public final String m19656j() {
        return this.f16586h;
    }

    /* renamed from: k */
    public final Map m19657k() {
        return this.f16582d;
    }

    /* renamed from: l */
    public final void m19658l(Integer num) {
        this.f16588j = num;
    }
}
