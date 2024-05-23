package p709z9;

import ca.C3380a;
import ca.C3382c;
import ca.EnumC3381b;
import com.google.gson.AbstractC6750k;
import com.google.gson.C6743d;
import com.google.gson.InterfaceC6751l;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: z9.i */
/* loaded from: classes3.dex */
public final class C31722i extends AbstractC6750k {

    /* renamed from: b */
    public static final InterfaceC6751l f145713b = new a();

    /* renamed from: a */
    private final DateFormat f145714a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: z9.i$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC6751l {
        a() {
        }

        @Override // com.google.gson.InterfaceC6751l
        /* renamed from: a */
        public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new C31722i();
            }
            return null;
        }
    }

    @Override // com.google.gson.AbstractC6750k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Date mo34534b(C3380a c3380a) {
        if (c3380a.m17001N() == EnumC3381b.NULL) {
            c3380a.m16999J();
            return null;
        }
        try {
            return new Date(this.f145714a.parse(c3380a.m17000L()).getTime());
        } catch (ParseException e11) {
            throw new JsonSyntaxException(e11);
        }
    }

    @Override // com.google.gson.AbstractC6750k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void mo34535d(C3382c c3382c, Date date) {
        String format;
        if (date == null) {
            format = null;
        } else {
            format = this.f145714a.format((java.util.Date) date);
        }
        c3382c.mo17033Q(format);
    }
}
