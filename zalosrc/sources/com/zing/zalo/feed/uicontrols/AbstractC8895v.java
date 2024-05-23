package com.zing.zalo.feed.uicontrols;

import ag0.C0815e1;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SimpleAdapter;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.uicontrols.AbstractC8895v;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fi.C18953k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import p131ei.C18434b;
import p142ey.C18644n;
import p304ks.C21927m;
import p716zh.C31862c;
import vg.C28203u6;

/* renamed from: com.zing.zalo.feed.uicontrols.v */
/* loaded from: classes4.dex */
public abstract class AbstractC8895v {

    /* renamed from: a */
    public C31862c f47613a;

    /* renamed from: b */
    public QuickActionViewLayout f47614b;

    /* renamed from: e */
    public Context f47617e;

    /* renamed from: f */
    c f47618f;

    /* renamed from: g */
    C8009j f47619g;

    /* renamed from: i */
    int f47621i;

    /* renamed from: c */
    Handler f47615c = new Handler();

    /* renamed from: d */
    boolean f47616d = false;

    /* renamed from: h */
    C18434b.d f47620h = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.uicontrols.v$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC13567b1.a {
        a() {
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: B5 */
        public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
            boolean z11;
            C0815e1.m2075D().m2092K(c31862c, str, i11);
            if (c31862c != null && c31862c.m153153e()) {
                AbstractC8895v.this.m47502l(c31862c);
                z11 = true;
            } else {
                z11 = false;
            }
            if (!TextUtils.isEmpty(str)) {
                if (str.equals("action.window.close")) {
                    if (!z11) {
                        AbstractC8895v.this.m47502l(c31862c);
                        return;
                    }
                    return;
                }
                AbstractC8895v.this.f47618f.mo47511k0(str, str2);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: P1 */
        public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
            if (!c31862c.f146315h) {
                AbstractC8895v.this.m47504n(c31862c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.uicontrols.v$b */
    /* loaded from: classes4.dex */
    public class b implements C18434b.d {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m47508c(List list) {
            if (list != null) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C31862c c31862c = (C31862c) it.next();
                        if (c31862c != null && !c31862c.m153154f() && !c31862c.f146332y) {
                            AbstractC8895v abstractC8895v = AbstractC8895v.this;
                            if (abstractC8895v.f47621i == c31862c.f146308a) {
                                abstractC8895v.m47500h(c31862c);
                                return;
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // p131ei.C18434b.d
        /* renamed from: a */
        public void mo47509a(int i11, final List list) {
            if (list == null) {
                return;
            }
            try {
                AbstractC8895v.this.f47615c.post(new Runnable() { // from class: com.zing.zalo.feed.uicontrols.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC8895v.b.this.m47508c(list);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.v$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: j0 */
        void mo47510j0();

        /* renamed from: k0 */
        void mo47511k0(String str, String str2);
    }

    /* renamed from: c */
    private void m47493c(C31862c c31862c, View view) {
        if (c31862c == null) {
            return;
        }
        try {
            QuickActionViewLayout quickActionViewLayout = new QuickActionViewLayout(this.f47617e, c31862c.f146309b);
            this.f47614b = quickActionViewLayout;
            quickActionViewLayout.m75820f(true);
            this.f47614b.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f47614b.setId(AbstractC6918a0.view_quick_action_top);
            this.f47613a = c31862c;
            this.f47614b.m75819e(true ^ c31862c.f146315h);
            this.f47614b.m75818b(c31862c, new a());
            m47506p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m47494j() {
        try {
            ViewGroup mo47497e = mo47497e(this.f47613a);
            if (mo47497e != null) {
                mo47497e.removeAllViews();
                this.f47616d = false;
                this.f47613a = null;
                this.f47614b = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m47495k(SimpleAdapter simpleAdapter, C31862c c31862c, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC6918a0.menu_delete && c31862c != null) {
            C0815e1.m2075D().m2092K(c31862c, "action.window.close", 3);
            m47502l(c31862c);
        }
    }

    /* renamed from: d */
    public abstract boolean mo47496d(C31862c c31862c);

    /* renamed from: e */
    public abstract ViewGroup mo47497e(C31862c c31862c);

    /* renamed from: f */
    public void m47498f(String str, int i11) {
        try {
            this.f47621i = i11;
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            int m99337P = C18953k.m99337P(m141809c);
            int m99328E = C18953k.m99328E(m141809c);
            int m119306z = AbstractC23160o0.m119306z();
            boolean m98558u = C18644n.m98531l().m98558u(str);
            boolean contains = C21927m.m114302u().m114351p().contains(str);
            int m119234a0 = AbstractC23160o0.m119234a0();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(i11));
            C18434b.m97679l().m97687p(arrayList, str, new C18434b.c(m99337P, m99328E, m119306z, m98558u ? 1 : 0, contains ? 1 : 0, m119234a0), null, this.f47620h);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m47499g() {
        this.f47615c.post(new Runnable() { // from class: com.zing.zalo.feed.uicontrols.t
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC8895v.this.m47494j();
            }
        });
    }

    /* renamed from: h */
    void m47500h(C31862c c31862c) {
        if (c31862c == null) {
            return;
        }
        m47493c(c31862c, null);
    }

    /* renamed from: i */
    public boolean m47501i() {
        return this.f47616d;
    }

    /* renamed from: l */
    void m47502l(C31862c c31862c) {
        try {
            m47499g();
            C18434b.m97679l().m97691w(c31862c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public void m47503m(c cVar) {
        this.f47618f = cVar;
    }

    /* renamed from: n */
    void m47504n(final C31862c c31862c) {
        if (c31862c != null && !c31862c.f146315h) {
            C8009j c8009j = this.f47619g;
            if (c8009j != null && c8009j.m92868m()) {
                this.f47619g.dismiss();
            }
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.delete));
            hashMap.put("id", Integer.valueOf(AbstractC6918a0.menu_delete));
            arrayList.add(hashMap);
            final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f47617e, arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar = new C8009j.a(this.f47617e);
            aVar.m43172u("");
            aVar.m43173v(100);
            aVar.m43155d(true);
            aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.feed.uicontrols.u
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC8895v.this.m47495k(simpleAdapter, c31862c, interfaceC17463d, i11);
                }
            });
            C8009j m43152a = aVar.m43152a();
            this.f47619g = m43152a;
            if (m43152a != null) {
                m43152a.mo13822K();
            }
        }
    }

    /* renamed from: o */
    public void m47505o() {
        C31862c c31862c = this.f47613a;
        if (c31862c == null) {
            return;
        }
        try {
            ViewGroup mo47497e = mo47497e(c31862c);
            if (mo47497e != null) {
                mo47497e.removeAllViews();
                QuickActionViewLayout quickActionViewLayout = this.f47614b;
                if (quickActionViewLayout != null) {
                    mo47497e.addView(quickActionViewLayout);
                    this.f47616d = true;
                    c cVar = this.f47618f;
                    if (cVar != null) {
                        cVar.mo47510j0();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    void m47506p() {
        try {
            C31862c c31862c = this.f47613a;
            if (c31862c != null && mo47496d(c31862c)) {
                m47505o();
            } else {
                m47499g();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
