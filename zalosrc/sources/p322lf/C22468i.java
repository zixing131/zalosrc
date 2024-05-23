package p322lf;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: lf.i */
/* loaded from: classes3.dex */
public final class C22468i {

    /* renamed from: a */
    public static final C22468i f109885a = new C22468i();

    /* renamed from: b */
    private static final InterfaceC24854k f109886b;

    /* renamed from: lf.i$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f109887q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat mo12V4() {
            return new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f109887q);
        f109886b = m129210a;
    }

    private C22468i() {
    }

    /* renamed from: a */
    public static final String m116146a(Date date) {
        String format;
        AbstractC19074t.m100208f(date, "date");
        C22468i c22468i = f109885a;
        synchronized (c22468i) {
            format = c22468i.m116147b().format(date);
        }
        AbstractC19074t.m100207e(format, "synchronized(...)");
        return format;
    }

    /* renamed from: b */
    private final SimpleDateFormat m116147b() {
        return (SimpleDateFormat) f109886b.getValue();
    }
}
