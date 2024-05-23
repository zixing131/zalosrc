package p535u2;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;
import p008a2.AbstractC0074k;
import p008a2.AbstractC0086w;
import p008a2.C0089z;
import p046c2.AbstractC3206b;
import p119e2.InterfaceC18186k;

/* renamed from: u2.f */
/* loaded from: classes.dex */
public final class C26959f implements InterfaceC26957e {

    /* renamed from: a */
    private final AbstractC0086w f127465a;

    /* renamed from: b */
    private final AbstractC0074k f127466b;

    /* renamed from: u2.f$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C26955d c26955d) {
            if (c26955d.m138918a() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c26955d.m138918a());
            }
            if (c26955d.m138919b() == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo220l0(2, c26955d.m138919b().longValue());
            }
        }
    }

    public C26959f(AbstractC0086w abstractC0086w) {
        this.f127465a = abstractC0086w;
        this.f127466b = new a(abstractC0086w);
    }

    /* renamed from: c */
    public static List m138934c() {
        return Collections.emptyList();
    }

    @Override // p535u2.InterfaceC26957e
    /* renamed from: a */
    public Long mo138922a(String str) {
        C0089z m401c = C0089z.m401c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127465a.m341d();
        Long l11 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f127465a, m401c, false, null);
        try {
            if (m16306c.moveToFirst() && !m16306c.isNull(0)) {
                l11 = Long.valueOf(m16306c.getLong(0));
            }
            return l11;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p535u2.InterfaceC26957e
    /* renamed from: b */
    public void mo138923b(C26955d c26955d) {
        this.f127465a.m341d();
        this.f127465a.m342e();
        try {
            this.f127466b.m263j(c26955d);
            this.f127465a.m339E();
        } finally {
            this.f127465a.m347j();
        }
    }
}
