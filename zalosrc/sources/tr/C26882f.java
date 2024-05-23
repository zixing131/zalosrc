package tr;

import am.AbstractC0924m0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p509sp.C26359h;
import p509sp.C26360i;

/* renamed from: tr.f */
/* loaded from: classes4.dex */
public final class C26882f implements InterfaceC26880d {

    /* renamed from: a */
    public static final C26882f f127239a = new C26882f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tr.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f127240q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f127240q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return this.f127240q;
        }
    }

    private C26882f() {
    }

    /* renamed from: e */
    private final void m138513e(String str) {
        if (C26360i.f125213a.m135694c("FEED_TIMELINE")) {
            C26359h.f125209a.mo135685a("FEED_TIMELINE", "SUGGESTION_FEED_LOCAL_SOURCE", new a(str));
        }
    }

    @Override // tr.InterfaceC26880d
    /* renamed from: a */
    public void mo138487a(String str, int i11) {
        AbstractC19074t.m100208f(str, "data");
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC0924m0.m3228Lh(str);
            }
        } else {
            AbstractC0924m0.m3199Kh(str);
        }
        m138513e("setFeedSuggestion - tab: " + i11 + " - data: " + str);
    }

    @Override // tr.InterfaceC26880d
    /* renamed from: b */
    public String mo138488b(int i11) {
        String m3857h1;
        if (i11 != 0) {
            if (i11 != 1) {
                m3857h1 = "";
            } else {
                m3857h1 = AbstractC0924m0.m3887i1();
            }
        } else {
            m3857h1 = AbstractC0924m0.m3857h1();
        }
        m138513e("getFeedSuggestion - tab: " + i11 + " - data: " + m3857h1);
        AbstractC19074t.m100205c(m3857h1);
        return m3857h1;
    }

    @Override // tr.InterfaceC26880d
    /* renamed from: c */
    public String mo138489c() {
        String m4013m7 = AbstractC0924m0.m4013m7();
        m138513e("loadVideoChannelOffline - data: " + m4013m7);
        AbstractC19074t.m100205c(m4013m7);
        return m4013m7;
    }

    @Override // tr.InterfaceC26880d
    /* renamed from: d */
    public void mo138490d(String str) {
        AbstractC19074t.m100208f(str, "data");
        AbstractC0924m0.m3822fq(str);
        m138513e("saveVideoChannelOffline - data: " + str);
    }
}
