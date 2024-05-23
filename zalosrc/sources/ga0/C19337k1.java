package ga0;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.zing.zalo.AbstractC16781w;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23148n;
import me0.C23024b7;
import me0.C23139m1;
import me0.C23212s8;
import p348mi.AbstractC23304d;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29072d;
import p612wk.AbstractC29075g;
import p612wk.AbstractC29076h;
import p716zh.C32178x9;
import qm0.AbstractC25376w;

/* renamed from: ga0.k1 */
/* loaded from: classes6.dex */
public final class C19337k1 extends AbstractC19358r1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19337k1(InterfaceC18319c interfaceC18319c, String str) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
    }

    /* renamed from: m */
    private final void m101294m(AbstractC29069a.v vVar) {
        String str = vVar.m145222b().f148386t;
        AbstractC19074t.m100207e(str, "mSettingNameSecondary");
        if (str.length() == 0) {
            String str2 = vVar.m145222b().f148385s;
            AbstractC19074t.m100207e(str2, "mSettingName");
            ArrayList arrayList = vVar.m145222b().f148377F;
            AbstractC19074t.m100207e(arrayList, "arrPosToHighlight");
            vVar.m145226f(m101295n(str2, arrayList));
            String m101307j = C19340l1.f96076a.m101307j(vVar.m145222b().f148384r);
            if (m101307j == null) {
                m101307j = "";
            }
            vVar.m145227g(m101307j);
            return;
        }
        vVar.m145226f(vVar.m145222b().f148385s);
        String str3 = vVar.m145222b().f148386t;
        AbstractC19074t.m100207e(str3, "mSettingNameSecondary");
        ArrayList arrayList2 = vVar.m145222b().f148377F;
        AbstractC19074t.m100207e(arrayList2, "arrPosToHighlight");
        vVar.m145227g(m101295n(str3, arrayList2));
    }

    /* renamed from: n */
    private final CharSequence m101295n(CharSequence charSequence, List list) {
        if (charSequence.length() == 0 || list.isEmpty()) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        int size = list.size();
        for (int i11 = 0; i11 < size - 1; i11 += 2) {
            if (((Number) list.get(i11)).intValue() >= 0) {
                int i12 = i11 + 1;
                if (((Number) list.get(i12)).intValue() > ((Number) list.get(i11)).intValue()) {
                    spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119606n(AbstractC16781w.AppPrimaryColor)), ((Number) list.get(i11)).intValue(), ((Number) list.get(i12)).intValue(), 33);
                }
            }
        }
        return spannableString;
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C18316b c18316b;
        C19322f1 c19322f1 = C19322f1.f95950a;
        if (!c19322f1.m101160q()) {
            mo205i9(new C18316b("ACTION_SEARCH_TASK_RESULT_SET_DATA", AbstractC29075g.m145255b(AbstractC29076h.u.f134835b, m101455l(), new ArrayList(), AbstractC29072d.d.f134806a), null, null, 12, null));
            return;
        }
        AbstractC23148n.m118838l();
        InterfaceC18319c m101438e = m101438e();
        C19325g1 c19325g1 = null;
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C19325g1) {
            c19325g1 = (C19325g1) obj;
        }
        C19325g1 c19325g12 = c19325g1;
        if (c19325g12 == null) {
            return;
        }
        if (c19325g12.m101192R()) {
            C19340l1.f96076a.m101306e();
            c19325g12.m101246w0(false);
        }
        ArrayList arrayList = new ArrayList();
        C23024b7 c23024b7 = C23024b7.f111993a;
        c23024b7.m118054P(m101455l(), AbstractC23304d.f113372d, arrayList, c19322f1.m101134I() | 67141632, this);
        if (isCancelled()) {
            return;
        }
        c23024b7.m118074w(arrayList, C19372y0.Companion.m101489f(c19325g12, m101455l()), System.currentTimeMillis(), 0, null);
        AbstractC25376w.m131534w(arrayList, C23139m1.f112256a.m118798l());
        if (isCancelled()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC29069a.v vVar = new AbstractC29069a.v(2097152, (C32178x9) it.next(), null, null, 12, null);
            m101294m(vVar);
            arrayList2.add(vVar);
        }
        mo205i9(new C18316b("ACTION_SEARCH_TASK_RESULT_SET_DATA", AbstractC29075g.m145255b(AbstractC29076h.u.f134835b, m101455l(), arrayList2, AbstractC29072d.d.f134806a), null, null, 12, null));
    }
}
