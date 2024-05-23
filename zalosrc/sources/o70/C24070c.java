package o70;

import ag0.AbstractC0837p0;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bg0.C2797c;
import com.zing.zalo.p077ui.maintab.widget.CustomMainTab;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.Iterator;
import java.util.Map;
import mm0.AbstractC23350e;

/* renamed from: o70.c */
/* loaded from: classes5.dex */
public final class C24070c {

    /* renamed from: a */
    public static final C24070c f116404a = new C24070c();

    /* renamed from: b */
    private static final C2797c f116405b = new C2797c(AbstractC0837p0.Companion.m2237f());

    /* renamed from: c */
    private static final SparseArray f116406c = new SparseArray();

    /* renamed from: d */
    private static boolean f116407d;

    private C24070c() {
    }

    /* renamed from: c */
    private final void m125945c(ArrayMap arrayMap) {
        if (arrayMap.size() > 20) {
            Iterator it = arrayMap.entrySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    it.remove();
                    if (arrayMap.size() <= 20) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private final ArrayMap m125946d(int i11) {
        SparseArray sparseArray = f116406c;
        ArrayMap arrayMap = (ArrayMap) sparseArray.get(i11);
        if (arrayMap == null) {
            ArrayMap arrayMap2 = new ArrayMap();
            sparseArray.put(i11, arrayMap2);
            return arrayMap2;
        }
        return arrayMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m125947f(int i11, String str, boolean z11, View view) {
        AbstractC19074t.m100208f(str, "$keySource");
        AbstractC19074t.m100208f(view, "$tabViewImageContainer");
        try {
            C24070c c24070c = f116404a;
            ArrayMap m125946d = c24070c.m125946d(i11);
            m125946d.put(str, Boolean.valueOf(z11));
            c24070c.m125950j(view, c24070c.m125948g(m125946d));
            c24070c.m125945c(m125946d);
            if (i11 == C24099q0.Companion.m125984a().m125969m()) {
                f116407d = c24070c.m125949h(m125946d, "SOURCE_UNREAD_REMIND_SETTING");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: g */
    private final boolean m125948g(ArrayMap arrayMap) {
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            AbstractC19074t.m100207e(value, "<get-value>(...)");
            if (((Boolean) value).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m125949h(ArrayMap arrayMap, String str) {
        for (Map.Entry entry : arrayMap.entrySet()) {
            if (!AbstractC19074t.m100204b(entry.getKey(), str)) {
                Object value = entry.getValue();
                AbstractC19074t.m100207e(value, "<get-value>(...)");
                if (((Boolean) value).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    private final void m125950j(final View view, final boolean z11) {
        AbstractC19444a.m101695c(new Runnable() { // from class: o70.b
            @Override // java.lang.Runnable
            public final void run() {
                C24070c.m125951k(view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m125951k(View view, boolean z11) {
        AbstractC19074t.m100208f(view, "$tabViewImageContainer");
        f116404a.m125952l(view, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:            r4.setVisibility(8);     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:            if (r4.getVisibility() != 0) goto L27;     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m125952l(View view, boolean z11) {
        try {
            ImageView m68745j = CustomMainTab.m68745j(view);
            TextView m68744i = CustomMainTab.m68744i(view);
            View m68743h = CustomMainTab.m68743h(view);
            int i11 = 8;
            if ((m68745j == null || m68745j.getVisibility() != 0) && (m68744i == null || m68744i.getVisibility() != 0)) {
                if (m68743h != null) {
                    if (z11) {
                        i11 = 0;
                    }
                    m68743h.setVisibility(i11);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: e */
    public final void m125953e(final View view, final int i11, final String str, final boolean z11) {
        AbstractC19074t.m100208f(view, "tabViewImageContainer");
        AbstractC19074t.m100208f(str, "keySource");
        if (i11 >= 0 && i11 < C24099q0.Companion.m125984a().m125975s() && str.length() != 0) {
            f116405b.mo13474a(new Runnable() { // from class: o70.a
                @Override // java.lang.Runnable
                public final void run() {
                    C24070c.m125947f(i11, str, z11, view);
                }
            });
        }
    }

    /* renamed from: i */
    public final boolean m125954i() {
        return f116407d;
    }
}
