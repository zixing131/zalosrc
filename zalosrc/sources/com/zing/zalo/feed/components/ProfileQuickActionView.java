package com.zing.zalo.feed.components;

import ag0.C0815e1;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.SimpleAdapter;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.ZinstantQuickActionView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import java.util.ArrayList;
import java.util.HashMap;
import me0.AbstractC23136l9;
import me0.C23212s8;
import org.json.JSONObject;
import p131ei.C18434b;
import p716zh.C31862c;

/* loaded from: classes4.dex */
public class ProfileQuickActionView extends FrameLayout {

    /* renamed from: p */
    int f45106p;

    /* renamed from: q */
    boolean f45107q;

    /* renamed from: r */
    QuickActionViewLayout f45108r;

    /* renamed from: s */
    QuickActionViewLayout f45109s;

    /* renamed from: t */
    QuickActionViewLayout f45110t;

    /* renamed from: u */
    QuickActionViewLayout f45111u;

    /* renamed from: v */
    C8009j f45112v;

    /* renamed from: w */
    private InterfaceC8219b f45113w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.ProfileQuickActionView$a */
    /* loaded from: classes4.dex */
    public class C8218a implements InterfaceC13567b1.a {
        C8218a() {
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: B5 */
        public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
            C0815e1.m2075D().m2092K(c31862c, str, i11);
            if (str.equals("action.open.mp")) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("sourceOpen", 4005);
                    str2 = jSONObject.toString();
                } catch (Exception unused) {
                }
            }
            ProfileQuickActionView.this.m44490h(c31862c, str, str2);
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: P1 */
        public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
            if (!c31862c.f146315h) {
                ProfileQuickActionView.this.m44492j(c31862c);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.ProfileQuickActionView$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8219b {
        /* renamed from: Y */
        void mo44495Y(String str, String str2);
    }

    public ProfileQuickActionView(Context context) {
        super(context);
        this.f45106p = 0;
        this.f45107q = false;
        m44489f();
    }

    /* renamed from: c */
    private QuickActionViewLayout m44484c(C31862c c31862c) {
        if (c31862c == null) {
            return null;
        }
        try {
            QuickActionViewLayout quickActionViewLayout = new QuickActionViewLayout(getContext(), c31862c.f146309b);
            quickActionViewLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            quickActionViewLayout.setId(AbstractC6918a0.view_quick_action_top);
            return quickActionViewLayout;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    private QuickActionViewLayout m44485d(C31862c c31862c) {
        QuickActionViewLayout quickActionViewLayout = getQuickActionViewLayout();
        if (quickActionViewLayout == null) {
            quickActionViewLayout = m44484c(c31862c);
        }
        setQuickActionViewLayout(quickActionViewLayout);
        return quickActionViewLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m44486g(SimpleAdapter simpleAdapter, C31862c c31862c, InterfaceC17463d interfaceC17463d, int i11) {
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
            m44491i(c31862c);
        }
    }

    /* renamed from: b */
    public void m44487b(C31862c c31862c, boolean z11) {
        this.f45107q = z11;
        if (c31862c != null && !c31862c.m153154f() && !c31862c.f146332y) {
            switch (c31862c.f146308a) {
                case 12:
                    this.f45106p = 0;
                    break;
                case 13:
                    this.f45106p = 1;
                    break;
                case 14:
                    this.f45106p = 2;
                    break;
            }
            m44493k(c31862c);
            return;
        }
        m44488e();
    }

    /* renamed from: e */
    void m44488e() {
        removeAllViews();
        this.f45108r = null;
    }

    /* renamed from: f */
    public void m44489f() {
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.ProfilePrimaryBackgroundColor));
    }

    QuickActionViewLayout getQuickActionViewLayout() {
        int i11 = this.f45106p;
        if (i11 == 0) {
            return this.f45109s;
        }
        if (i11 == 1) {
            return this.f45110t;
        }
        if (i11 != 2) {
            return null;
        }
        return this.f45111u;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0016 A[Catch: Exception -> 0x000d, TryCatch #0 {Exception -> 0x000d, blocks: (B:19:0x0002, B:21:0x0008, B:3:0x0010, B:5:0x0016, B:8:0x0020, B:12:0x0024, B:14:0x0028), top: B:18:0x0002 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m44490h(C31862c c31862c, String str, String str2) {
        boolean z11;
        if (c31862c != null) {
            try {
                if (c31862c.m153153e()) {
                    m44491i(c31862c);
                    z11 = true;
                    if (TextUtils.isEmpty(str)) {
                        if (str.equals("action.window.close")) {
                            if (!z11) {
                                m44491i(c31862c);
                                return;
                            }
                            return;
                        } else {
                            InterfaceC8219b interfaceC8219b = this.f45113w;
                            if (interfaceC8219b != null) {
                                interfaceC8219b.mo44495Y(str, str2);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        z11 = false;
        if (TextUtils.isEmpty(str)) {
        }
    }

    /* renamed from: i */
    void m44491i(C31862c c31862c) {
        try {
            C18434b.m97679l().m97691w(c31862c);
            int i11 = this.f45106p;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f45111u = null;
                    }
                } else {
                    this.f45110t = null;
                }
            } else {
                this.f45109s = null;
            }
            m44488e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    void m44492j(final C31862c c31862c) {
        if (c31862c != null && !c31862c.f146315h) {
            C8009j c8009j = this.f45112v;
            if (c8009j != null && c8009j.m92868m()) {
                this.f45112v.dismiss();
            }
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.delete));
            hashMap.put("id", Integer.valueOf(AbstractC6918a0.menu_delete));
            arrayList.add(hashMap);
            final SimpleAdapter simpleAdapter = new SimpleAdapter(getContext(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar = new C8009j.a(getContext());
            aVar.m43172u("");
            aVar.m43173v(100);
            aVar.m43155d(true);
            aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.feed.components.d7
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ProfileQuickActionView.this.m44486g(simpleAdapter, c31862c, interfaceC17463d, i11);
                }
            });
            C8009j m43152a = aVar.m43152a();
            this.f45112v = m43152a;
            if (m43152a != null) {
                m43152a.mo13822K();
            }
        }
    }

    /* renamed from: k */
    void m44493k(C31862c c31862c) {
        removeAllViews();
        QuickActionViewLayout m44485d = m44485d(c31862c);
        if (m44485d != null) {
            m44485d.m75818b(c31862c, new C8218a());
            this.f45108r = m44485d;
            addView(m44485d);
            m44494l(this.f45107q);
        }
    }

    /* renamed from: l */
    void m44494l(boolean z11) {
        InterfaceC13567b1 interfaceC13567b1;
        if (!z11) {
            try {
                QuickActionViewLayout quickActionViewLayout = this.f45108r;
                if (quickActionViewLayout != null && (interfaceC13567b1 = quickActionViewLayout.f69453s) != null && (interfaceC13567b1 instanceof ZinstantQuickActionView)) {
                    ((ZinstantQuickActionView) interfaceC13567b1).m76005i();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public void setQuickActionCallback(InterfaceC8219b interfaceC8219b) {
        this.f45113w = interfaceC8219b;
    }

    void setQuickActionViewLayout(QuickActionViewLayout quickActionViewLayout) {
        int i11 = this.f45106p;
        if (i11 == 0) {
            this.f45109s = quickActionViewLayout;
        } else if (i11 == 1) {
            this.f45110t = quickActionViewLayout;
        } else {
            if (i11 != 2) {
                return;
            }
            this.f45111u = quickActionViewLayout;
        }
    }
}
