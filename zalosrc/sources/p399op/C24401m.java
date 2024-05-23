package p399op;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.AbstractC20130d;
import mm0.AbstractC23352g;
import on0.AbstractC24341v;
import p348mi.AbstractC23309i;
import p588vw.C28647m;
import p588vw.C28655u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: op.m */
/* loaded from: classes4.dex */
public final class C24401m implements InterfaceC24394f {

    /* renamed from: a */
    public static final C24401m f117816a = new C24401m();

    /* renamed from: b */
    private static final InterfaceC24854k f117817b;

    /* renamed from: op.m$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f117818q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String m104840K0 = AbstractC20130d.m104840K0();
            AbstractC19074t.m100207e(m104840K0, "getVoiceExternalStorageDirectory(...)");
            return m104840K0;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f117818q);
        f117817b = m129210a;
    }

    private C24401m() {
    }

    @Override // p399op.InterfaceC24394f
    /* renamed from: a */
    public String mo127597a() {
        return (String) f117817b.getValue();
    }

    @Override // p399op.InterfaceC24394f
    /* renamed from: b */
    public boolean mo127598b(String str) {
        boolean m127125u;
        AbstractC19074t.m100208f(str, "fileName");
        m127125u = AbstractC24341v.m127125u(str, ".LRC", false, 2, null);
        return m127125u;
    }

    @Override // p399op.InterfaceC24394f
    /* renamed from: c */
    public int mo127599c() {
        try {
            C28655u c28655u = (C28655u) C28647m.m143325c().m143328b().get(m127633f());
            if (c28655u != null) {
                String str = c28655u.f132865c;
                AbstractC19074t.m100207e(str, "countrycode");
                return Integer.parseInt(str);
            }
            return 84;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 84;
        }
    }

    @Override // p399op.InterfaceC24394f
    /* renamed from: d */
    public String mo127600d(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        String str2 = str + "-" + mo127599c();
        AbstractC19074t.m100207e(str2, "toString(...)");
        return str2;
    }

    @Override // p399op.InterfaceC24394f
    /* renamed from: e */
    public String mo127601e(String str) {
        AbstractC19074t.m100208f(str, "lyricUrl");
        return mo127597a() + AbstractC23352g.m122788d(str) + ".LRC";
    }

    /* renamed from: f */
    public String m127633f() {
        try {
            String m121704a5 = AbstractC23309i.m121704a5();
            if (m121704a5 == null) {
                return "";
            }
            return m121704a5;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }
}
