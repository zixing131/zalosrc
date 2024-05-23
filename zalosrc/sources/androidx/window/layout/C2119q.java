package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C2121s;
import androidx.window.layout.InterfaceC2120r;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p378o2.C23981b;

/* renamed from: androidx.window.layout.q */
/* loaded from: classes2.dex */
public final class C2119q {

    /* renamed from: a */
    public static final C2119q f8990a = new C2119q();

    private C2119q() {
    }

    /* renamed from: c */
    private final boolean m11368c(Activity activity, C23981b c23981b) {
        Rect m11339a = C2114l0.f8979b.mo11343a(activity).m11339a();
        if (c23981b.m125490e()) {
            return false;
        }
        if (c23981b.m125489d() != m11339a.width() && c23981b.m125486a() != m11339a.height()) {
            return false;
        }
        if (c23981b.m125489d() < m11339a.width() && c23981b.m125486a() < m11339a.height()) {
            return false;
        }
        if (c23981b.m125489d() == m11339a.width() && c23981b.m125486a() == m11339a.height()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final InterfaceC2120r m11369a(Activity activity, FoldingFeature foldingFeature) {
        C2121s.b m11374a;
        InterfaceC2120r.a aVar;
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC19074t.m100208f(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            m11374a = C2121s.b.f8999b.m11375b();
        } else {
            m11374a = C2121s.b.f8999b.m11374a();
        }
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state != 2) {
                return null;
            }
            aVar = InterfaceC2120r.a.f8993d;
        } else {
            aVar = InterfaceC2120r.a.f8992c;
        }
        Rect bounds = foldingFeature.getBounds();
        AbstractC19074t.m100207e(bounds, "oemFeature.bounds");
        if (!m11368c(activity, new C23981b(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        AbstractC19074t.m100207e(bounds2, "oemFeature.bounds");
        return new C2121s(new C23981b(bounds2), m11374a, aVar);
    }

    /* renamed from: b */
    public final C2102f0 m11370b(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        InterfaceC2120r interfaceC2120r;
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC19074t.m100208f(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        AbstractC19074t.m100207e(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C2119q c2119q = f8990a;
                AbstractC19074t.m100207e(foldingFeature, "feature");
                interfaceC2120r = c2119q.m11369a(activity, foldingFeature);
            } else {
                interfaceC2120r = null;
            }
            if (interfaceC2120r != null) {
                arrayList.add(interfaceC2120r);
            }
        }
        return new C2102f0(arrayList);
    }
}
