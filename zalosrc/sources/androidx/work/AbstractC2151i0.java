package androidx.work;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.impl.C2221r0;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC2151i0 {

    /* renamed from: androidx.work.i0$a */
    /* loaded from: classes2.dex */
    public enum a {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    /* renamed from: h */
    public static AbstractC2151i0 m11547h(Context context) {
        return C2221r0.m11729r(context);
    }

    /* renamed from: l */
    public static void m11548l(Context context, C2138c c2138c) {
        C2221r0.m11727l(context, c2138c);
    }

    /* renamed from: a */
    public abstract InterfaceC2257y mo11549a(String str);

    /* renamed from: b */
    public abstract InterfaceC2257y mo11550b(String str);

    /* renamed from: c */
    public final InterfaceC2257y m11551c(AbstractC2241j0 abstractC2241j0) {
        return mo11552d(Collections.singletonList(abstractC2241j0));
    }

    /* renamed from: d */
    public abstract InterfaceC2257y mo11552d(List list);

    /* renamed from: e */
    public abstract InterfaceC2257y mo11553e(String str, EnumC2240j enumC2240j, C2135a0 c2135a0);

    /* renamed from: f */
    public InterfaceC2257y m11554f(String str, EnumC2242k enumC2242k, C2256x c2256x) {
        return mo11555g(str, enumC2242k, Collections.singletonList(c2256x));
    }

    /* renamed from: g */
    public abstract InterfaceC2257y mo11555g(String str, EnumC2242k enumC2242k, List list);

    /* renamed from: i */
    public abstract LiveData mo11556i(String str);

    /* renamed from: j */
    public abstract InterfaceFutureC6534a mo11557j(String str);

    /* renamed from: k */
    public abstract LiveData mo11558k(String str);
}
