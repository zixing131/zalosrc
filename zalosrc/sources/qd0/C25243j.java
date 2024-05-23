package qd0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import im0.AbstractC20626a;
import me0.C23055e5;
import mm0.AbstractC23352g;
import od0.EnumC24229g;
import p348mi.AbstractC23309i;

/* renamed from: qd0.j */
/* loaded from: classes4.dex */
public final class C25243j {

    /* renamed from: a */
    public static final C25243j f121070a = new C25243j();

    /* renamed from: qd0.j$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f121071a;

        static {
            int[] iArr = new int[EnumC25242i.values().length];
            try {
                iArr[EnumC25242i.f121066p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f121071a = iArr;
        }
    }

    private C25243j() {
    }

    /* renamed from: a */
    public static final boolean m130612a() {
        int m122536wb = AbstractC23309i.m122536wb();
        if (m122536wb == 2) {
            return false;
        }
        if ((m122536wb == 0 && !AbstractC19074t.m100204b(AbstractC20626a.m107389e(), "WIFI")) || !C23055e5.m118273h(false, 1, null)) {
            return false;
        }
        if (m122536wb != 0 && m122536wb != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final String m130613b(int i11, String str, EnumC25242i enumC25242i, String str2) {
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(enumC25242i, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str2, "receiverUid");
        String m122788d = AbstractC23352g.m122788d(i11 + ":" + str + ":" + enumC25242i.ordinal() + ";" + str2);
        AbstractC19074t.m100207e(m122788d, "md5(...)");
        return m122788d;
    }

    /* renamed from: c */
    public static final EnumC24229g m130614c(EnumC25242i enumC25242i) {
        AbstractC19074t.m100208f(enumC25242i, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (a.f121071a[enumC25242i.ordinal()] == 1) {
            return EnumC24229g.f116983q;
        }
        return EnumC24229g.f116984r;
    }
}
