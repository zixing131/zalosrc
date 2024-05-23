package com.androidquery.util;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.androidquery.util.o */
/* loaded from: classes.dex */
public final class C3982o {

    /* renamed from: b */
    public static final b f15764b = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f15765c;

    /* renamed from: a */
    private c f15766a = new c() { // from class: com.androidquery.util.n
        @Override // com.androidquery.util.C3982o.c
        /* renamed from: a */
        public final String mo18858a(String str) {
            String m18862f;
            m18862f = C3982o.m18862f(str);
            return m18862f;
        }
    };

    /* renamed from: com.androidquery.util.o$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f15767q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3982o mo12V4() {
            return new C3982o();
        }
    }

    /* renamed from: com.androidquery.util.o$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3982o m18866a() {
            return (C3982o) C3982o.f15765c.getValue();
        }
    }

    /* renamed from: com.androidquery.util.o$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        String mo18858a(String str);
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f15767q);
        f15765c = m129210a;
    }

    /* renamed from: d */
    public static final C3982o m18861d() {
        return f15764b.m18866a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final String m18862f(String str) {
        return "";
    }

    /* renamed from: c */
    public final String m18863c(String str) {
        try {
            return this.f15766a.mo18858a(str);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: e */
    public final void m18864e(c cVar) {
        AbstractC19074t.m100208f(cVar, "<set-?>");
        this.f15766a = cVar;
    }
}
