package p709z9;

import ca.C3380a;
import ca.C3382c;
import ca.EnumC3381b;
import com.google.gson.AbstractC6750k;
import com.google.gson.C6743d;
import com.google.gson.InterfaceC6751l;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p016aa.AbstractC0669a;
import p674y9.AbstractC30848e;
import p674y9.AbstractC30853j;

/* renamed from: z9.c */
/* loaded from: classes3.dex */
public final class C31716c extends AbstractC6750k {

    /* renamed from: b */
    public static final InterfaceC6751l f145679b = new a();

    /* renamed from: a */
    private final List f145680a;

    /* renamed from: z9.c$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC6751l {
        a() {
        }

        @Override // com.google.gson.InterfaceC6751l
        /* renamed from: a */
        public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new C31716c();
            }
            return null;
        }
    }

    public C31716c() {
        ArrayList arrayList = new ArrayList();
        this.f145680a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (AbstractC30848e.m149972e()) {
            arrayList.add(AbstractC30853j.m149991c(2, 2));
        }
    }

    /* renamed from: e */
    private synchronized Date m152598e(String str) {
        Iterator it = this.f145680a.iterator();
        while (it.hasNext()) {
            try {
                return ((DateFormat) it.next()).parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return AbstractC0669a.m949c(str, new ParsePosition(0));
        } catch (ParseException e11) {
            throw new JsonSyntaxException(str, e11);
        }
    }

    @Override // com.google.gson.AbstractC6750k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date mo34534b(C3380a c3380a) {
        if (c3380a.m17001N() == EnumC3381b.NULL) {
            c3380a.m16999J();
            return null;
        }
        return m152598e(c3380a.m17000L());
    }

    @Override // com.google.gson.AbstractC6750k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized void mo34535d(C3382c c3382c, Date date) {
        if (date == null) {
            c3382c.mo17043v();
        } else {
            c3382c.mo17033Q(((DateFormat) this.f145680a.get(0)).format(date));
        }
    }
}
