package cg;

import android.media.MediaFormat;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* renamed from: cg.f */
/* loaded from: classes3.dex */
public abstract class AbstractC3458f {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final int m17423d(MediaFormat mediaFormat, String str, int i11) {
        Object m129218b;
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b(Integer.valueOf(mediaFormat.getInteger(str)));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129223g(m129218b)) {
            m129218b = null;
        }
        Integer num = (Integer) m129218b;
        if (num != null) {
            return num.intValue();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final Integer m17424e(MediaFormat mediaFormat, String str) {
        Object m129218b;
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b(Integer.valueOf(mediaFormat.getInteger(str)));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129223g(m129218b)) {
            m129218b = null;
        }
        return (Integer) m129218b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final String m17425f(MediaFormat mediaFormat, String str, String str2) {
        Object m129218b;
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b(mediaFormat.getString(str));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129223g(m129218b)) {
            m129218b = null;
        }
        String str3 = (String) m129218b;
        if (str3 != null) {
            return str3;
        }
        return str2;
    }
}
