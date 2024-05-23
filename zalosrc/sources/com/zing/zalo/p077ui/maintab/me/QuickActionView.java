package com.zing.zalo.p077ui.maintab.me;

import ag0.C0815e1;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.maintab.me.QuickActionView;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.ZinstantQuickActionView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import me0.AbstractC23136l9;
import p131ei.C18434b;
import p716zh.C31862c;
import r70.C25670b;

/* loaded from: classes5.dex */
public final class QuickActionView extends RelativeLayout {

    /* renamed from: p */
    private QuickActionViewLayout f63376p;

    /* renamed from: q */
    private boolean f63377q;

    /* renamed from: r */
    private InterfaceC12135a f63378r;

    /* renamed from: s */
    private C8009j f63379s;

    /* renamed from: com.zing.zalo.ui.maintab.me.QuickActionView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC12135a {
        /* renamed from: c */
        void mo67848c();

        /* renamed from: k0 */
        void mo67849k0(String str, String str2);
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.QuickActionView$b */
    /* loaded from: classes5.dex */
    public static final class C12136b implements InterfaceC13567b1.a {
        C12136b() {
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: B5 */
        public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
            if (c31862c == null || str == null) {
                return;
            }
            C0815e1.m2075D().m2092K(c31862c, str, i11);
            QuickActionView.this.m67844e(c31862c, str, str2);
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: P1 */
        public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
            AbstractC19074t.m100208f(quickActionViewLayout, "view");
            AbstractC19074t.m100208f(c31862c, "actionItemInfo");
            if (!c31862c.f146315h) {
                QuickActionView.this.m67846g(c31862c);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickActionView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: c */
    private final QuickActionViewLayout m67839c(C31862c c31862c) {
        if (c31862c == null) {
            return null;
        }
        try {
            QuickActionViewLayout quickActionViewLayout = new QuickActionViewLayout(getContext(), c31862c.f146309b);
            quickActionViewLayout.m75819e(!c31862c.f146315h);
            quickActionViewLayout.setId(AbstractC6918a0.view_quick_action_top);
            return quickActionViewLayout;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m67840h(SimpleAdapter simpleAdapter, C31862c c31862c, QuickActionView quickActionView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(simpleAdapter, "$a");
        AbstractC19074t.m100208f(quickActionView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        Object item = simpleAdapter.getItem(i11);
        AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
        Object obj = ((HashMap) item).get("id");
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) obj).intValue() == AbstractC6918a0.menu_delete) {
            C0815e1.m2075D().m2092K(c31862c, "action.window.close", 3);
            quickActionView.m67845f(c31862c);
        }
    }

    /* renamed from: j */
    private final void m67841j(QuickActionViewLayout quickActionViewLayout, boolean z11) {
        if (quickActionViewLayout != null && !z11) {
            try {
                InterfaceC13567b1 interfaceC13567b1 = quickActionViewLayout.f69453s;
                if (interfaceC13567b1 != null && (interfaceC13567b1 instanceof ZinstantQuickActionView)) {
                    AbstractC19074t.m100206d(interfaceC13567b1, "null cannot be cast to non-null type com.zing.zalo.ui.widget.ZinstantQuickActionView");
                    ((ZinstantQuickActionView) interfaceC13567b1).m76005i();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void m67842b(C25670b c25670b, boolean z11) {
        if (c25670b == null) {
            return;
        }
        this.f63377q = z11;
        C31862c m132555d = c25670b.m132555d();
        if (m132555d != null && !m132555d.m153154f() && !m132555d.f146332y) {
            m67847i(m132555d);
        } else {
            m67843d();
        }
    }

    /* renamed from: d */
    public final void m67843d() {
        removeAllViews();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:20:0x0007, B:22:0x000d, B:4:0x0015, B:6:0x001b, B:9:0x0025, B:13:0x0029, B:15:0x002d), top: B:19:0x0007 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m67844e(C31862c c31862c, String str, String str2) {
        boolean z11;
        AbstractC19074t.m100208f(str, "actionType");
        if (c31862c != null) {
            try {
                if (c31862c.m153153e()) {
                    m67845f(c31862c);
                    z11 = true;
                    if (TextUtils.isEmpty(str)) {
                        if (AbstractC19074t.m100204b(str, "action.window.close")) {
                            if (!z11) {
                                m67845f(c31862c);
                                return;
                            }
                            return;
                        } else {
                            InterfaceC12135a interfaceC12135a = this.f63378r;
                            if (interfaceC12135a != null) {
                                interfaceC12135a.mo67849k0(str, str2);
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

    /* renamed from: f */
    public final void m67845f(C31862c c31862c) {
        try {
            C18434b.Companion.m97695b().m97691w(c31862c);
            InterfaceC12135a interfaceC12135a = this.f63378r;
            if (interfaceC12135a != null) {
                interfaceC12135a.mo67848c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public final void m67846g(final C31862c c31862c) {
        if (c31862c != null && !c31862c.f146315h) {
            C8009j c8009j = this.f63379s;
            if (c8009j != null) {
                AbstractC19074t.m100205c(c8009j);
                if (c8009j.m92868m()) {
                    C8009j c8009j2 = this.f63379s;
                    AbstractC19074t.m100205c(c8009j2);
                    c8009j2.dismiss();
                }
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
            aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: r70.c
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    QuickActionView.m67840h(simpleAdapter, c31862c, this, interfaceC17463d, i11);
                }
            });
            C8009j m43152a = aVar.m43152a();
            this.f63379s = m43152a;
            if (m43152a != null) {
                AbstractC19074t.m100205c(m43152a);
                m43152a.mo13822K();
            }
        }
    }

    public final C8009j getContextMenuDialog() {
        return this.f63379s;
    }

    public final InterfaceC12135a getListener() {
        return this.f63378r;
    }

    /* renamed from: i */
    public final void m67847i(C31862c c31862c) {
        QuickActionViewLayout quickActionViewLayout = this.f63376p;
        if (quickActionViewLayout == null) {
            quickActionViewLayout = m67839c(c31862c);
        }
        if (quickActionViewLayout != null) {
            quickActionViewLayout.m75818b(c31862c, new C12136b());
            this.f63376p = quickActionViewLayout;
            if (quickActionViewLayout.getParent() == null) {
                addView(quickActionViewLayout);
            }
            m67841j(quickActionViewLayout, this.f63377q);
        }
    }

    public final void setContextMenuDialog(C8009j c8009j) {
        this.f63379s = c8009j;
    }

    public final void setListener(InterfaceC12135a interfaceC12135a) {
        this.f63378r = interfaceC12135a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }
}
