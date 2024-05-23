package p612wk;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.util.Arrays;
import java.util.List;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29073e;
import qm0.AbstractC25368s;

/* renamed from: wk.g */
/* loaded from: classes3.dex */
public abstract class AbstractC29075g {
    /* renamed from: a */
    public static final void m145254a(C29074f c29074f, AbstractC29073e abstractC29073e) {
        AbstractC19074t.m100208f(c29074f, "<this>");
        AbstractC19074t.m100208f(abstractC29073e, "item");
        c29074f.m145253a().add(abstractC29073e);
    }

    /* renamed from: b */
    public static final AbstractC29073e.b m145255b(AbstractC29076h abstractC29076h, String str, List list, AbstractC29072d abstractC29072d) {
        AbstractC19074t.m100208f(abstractC29076h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(list, "data");
        AbstractC19074t.m100208f(abstractC29072d, "progressState");
        return new AbstractC29073e.b(abstractC29076h, str, list, abstractC29072d, 0, 16, null);
    }

    /* renamed from: c */
    public static final AbstractC29073e.f m145256c(AbstractC29076h abstractC29076h, String str, List list, AbstractC29072d abstractC29072d, C29071c c29071c) {
        AbstractC19074t.m100208f(abstractC29076h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(list, "data");
        AbstractC19074t.m100208f(abstractC29072d, "progressState");
        AbstractC19074t.m100208f(c29071c, "paginationData");
        return new AbstractC29073e.f(abstractC29076h, str, list, abstractC29072d, c29071c);
    }

    /* renamed from: d */
    public static final AbstractC29073e.e m145257d(AbstractC29076h abstractC29076h, String str, List list, AbstractC29072d abstractC29072d, C29071c c29071c, AbstractC29069a.f fVar) {
        AbstractC19074t.m100208f(abstractC29076h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(list, "data");
        AbstractC19074t.m100208f(abstractC29072d, "progressState");
        AbstractC19074t.m100208f(c29071c, "paginationData");
        AbstractC19074t.m100208f(fVar, "filter");
        return new AbstractC29073e.e(abstractC29076h, str, list, abstractC29072d, c29071c, fVar);
    }

    /* renamed from: e */
    public static final C29074f m145258e(AbstractC29073e... abstractC29073eArr) {
        List m131506n;
        AbstractC19074t.m100208f(abstractC29073eArr, "elements");
        m131506n = AbstractC25368s.m131506n(Arrays.copyOf(abstractC29073eArr, abstractC29073eArr.length));
        return new C29074f(m131506n);
    }
}
