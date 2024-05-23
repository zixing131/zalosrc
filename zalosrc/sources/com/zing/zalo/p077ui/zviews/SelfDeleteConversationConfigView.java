package com.zing.zalo.p077ui.zviews;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout;
import com.zing.zalo.utils.ToastUtils;
import dg0.AbstractC17927b;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p649xl.C29709a7;
import p716zh.C32037n9;
import pm0.C24848g0;

/* loaded from: classes6.dex */
public final class SelfDeleteConversationConfigView extends BottomPickerView {
    public static final C15015a Companion = new C15015a(null);

    /* renamed from: U0 */
    private String f77385U0 = "";

    /* renamed from: V0 */
    public C29709a7 f77386V0;

    /* renamed from: W0 */
    private ArrayList f77387W0;

    /* renamed from: X0 */
    private int f77388X0;

    /* renamed from: com.zing.zalo.ui.zviews.SelfDeleteConversationConfigView$a */
    /* loaded from: classes6.dex */
    public static final class C15015a {
        private C15015a() {
        }

        public /* synthetic */ C15015a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final SelfDeleteConversationConfigView m84035a(String str) {
            AbstractC19074t.m100208f(str, "ownerId");
            SelfDeleteConversationConfigView selfDeleteConversationConfigView = new SelfDeleteConversationConfigView();
            Bundle m78535kL = BottomPickerView.m78535kL();
            m78535kL.putString("KEY_OWNER_ID", str);
            selfDeleteConversationConfigView.mo60305zK(m78535kL);
            return selfDeleteConversationConfigView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SelfDeleteConversationConfigView$b */
    /* loaded from: classes6.dex */
    public static final class C15016b extends AbstractC19075u implements InterfaceC18509p {
        C15016b() {
            super(2);
        }

        /* renamed from: a */
        public final void m84036a(int i11, C20096c c20096c) {
            SelfDeleteConversationConfigView.this.m88272c4();
            if (i11 != 0) {
                String m84031xL = SelfDeleteConversationConfigView.this.m84031xL(i11, c20096c);
                if (m84031xL.length() > 0) {
                    ToastUtils.showMess(m84031xL);
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m84036a(((Number) obj).intValue(), (C20096c) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tL */
    public static final void m84027tL(SelfDeleteConversationConfigView selfDeleteConversationConfigView, View view) {
        AbstractC19074t.m100208f(selfDeleteConversationConfigView, "this$0");
        selfDeleteConversationConfigView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uL */
    public static final void m84028uL(SelfDeleteConversationConfigView selfDeleteConversationConfigView, View view) {
        AbstractC19074t.m100208f(selfDeleteConversationConfigView, "this$0");
        selfDeleteConversationConfigView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vL */
    public static final void m84029vL(final SelfDeleteConversationConfigView selfDeleteConversationConfigView, View view) {
        AbstractC19074t.m100208f(selfDeleteConversationConfigView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_COMMON_ACTION_CLICK_CHAT", new Runnable() { // from class: com.zing.zalo.ui.zviews.xg0
            @Override // java.lang.Runnable
            public final void run() {
                SelfDeleteConversationConfigView.m84030wL(SelfDeleteConversationConfigView.this);
            }
        }, 400L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wL */
    public static final void m84030wL(SelfDeleteConversationConfigView selfDeleteConversationConfigView) {
        AbstractC19074t.m100208f(selfDeleteConversationConfigView, "this$0");
        try {
            selfDeleteConversationConfigView.dismiss();
            ArrayList arrayList = selfDeleteConversationConfigView.f77387W0;
            if (arrayList == null) {
                AbstractC19074t.m100223u("listConfigs");
                arrayList = null;
            }
            Object obj = arrayList.get(selfDeleteConversationConfigView.m84033sL().f137220u.getValue());
            AbstractC19074t.m100207e(obj, "get(...)");
            long longValue = ((Number) obj).longValue();
            C32037n9 c32037n9 = C32037n9.f147516a;
            if (c32037n9.m154558r(selfDeleteConversationConfigView.f77385U0) != longValue) {
                selfDeleteConversationConfigView.m88268B8(null, false);
                c32037n9.m154551H(selfDeleteConversationConfigView.f77385U0, longValue, new C15016b());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xL */
    public final String m84031xL(int i11, C20096c c20096c) {
        String m118743r0;
        String m104492d;
        if (i11 == 50001) {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            return m118743r02;
        }
        if (c20096c != null && (m104492d = c20096c.m104492d()) != null && m104492d.length() > 0) {
            m118743r0 = c20096c.m104492d();
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.UNKNOWN_EXCEPTION_MSG);
        }
        AbstractC19074t.m100205c(m118743r0);
        return m118743r0;
    }

    /* renamed from: zL */
    private final void m84032zL(String str) {
        C32037n9 c32037n9 = C32037n9.f147516a;
        ArrayList arrayList = new ArrayList(c32037n9.m154556o().size() + 1);
        this.f77387W0 = arrayList;
        arrayList.add(0L);
        ArrayList arrayList2 = this.f77387W0;
        ArrayList arrayList3 = null;
        if (arrayList2 == null) {
            AbstractC19074t.m100223u("listConfigs");
            arrayList2 = null;
        }
        arrayList2.addAll(c32037n9.m154556o());
        long m154558r = c32037n9.m154558r(str);
        this.f77388X0 = 0;
        ArrayList arrayList4 = this.f77387W0;
        if (arrayList4 == null) {
            AbstractC19074t.m100223u("listConfigs");
            arrayList4 = null;
        }
        int size = arrayList4.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList arrayList5 = this.f77387W0;
            if (arrayList5 == null) {
                AbstractC19074t.m100223u("listConfigs");
                arrayList5 = null;
            }
            Object obj = arrayList5.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            long longValue = ((Number) obj).longValue();
            if (m154558r == longValue) {
                this.f77388X0 = i11;
                return;
            }
            if (longValue > m154558r) {
                ArrayList arrayList6 = this.f77387W0;
                if (arrayList6 == null) {
                    AbstractC19074t.m100223u("listConfigs");
                } else {
                    arrayList3 = arrayList6;
                }
                arrayList3.add(i11, Long.valueOf(m154558r));
                this.f77388X0 = i11;
                return;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("KEY_OWNER_ID");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f77385U0 = str;
        if (str.length() == 0) {
            finish();
        } else {
            m84032zL(this.f77385U0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        NumberPicker numberPicker = m84033sL().f137220u;
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setMinValue(0);
        ArrayList arrayList = this.f77387W0;
        if (arrayList == null) {
            AbstractC19074t.m100223u("listConfigs");
            arrayList = null;
        }
        numberPicker.setMaxValue(arrayList.size() - 1);
        numberPicker.setValue(this.f77388X0);
        ArrayList arrayList2 = this.f77387W0;
        if (arrayList2 == null) {
            AbstractC19074t.m100223u("listConfigs");
            arrayList2 = null;
        }
        int size = arrayList2.size();
        String[] strArr = new String[size];
        for (int i11 = 0; i11 < size; i11++) {
            C32037n9 c32037n9 = C32037n9.f147516a;
            ArrayList arrayList3 = this.f77387W0;
            if (arrayList3 == null) {
                AbstractC19074t.m100223u("listConfigs");
                arrayList3 = null;
            }
            Object obj = arrayList3.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            strArr[i11] = C32037n9.m154542n(c32037n9, ((Number) obj).longValue(), false, 2, null);
        }
        numberPicker.setDisplayedValues(strArr);
        m84033sL().f137216q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.vg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelfDeleteConversationConfigView.m84028uL(SelfDeleteConversationConfigView.this, view2);
            }
        });
        m84033sL().f137217r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.wg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelfDeleteConversationConfigView.m84029vL(SelfDeleteConversationConfigView.this, view2);
            }
        });
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: aL */
    protected int mo78533aL() {
        return R.style.Theme.Material.Light.Dialog.Alert;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    public View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29709a7 m147721c = C29709a7.m147721c(layoutInflater);
        AbstractC19074t.m100205c(m147721c);
        m84034yL(m147721c);
        m147721c.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ug0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelfDeleteConversationConfigView.m84027tL(SelfDeleteConversationConfigView.this, view);
            }
        });
        TouchInterceptionFrameLayout touchInterceptionFrameLayout = m147721c.f137218s;
        if (!(touchInterceptionFrameLayout instanceof TouchInterceptionFrameLayout)) {
            touchInterceptionFrameLayout = null;
        }
        if (touchInterceptionFrameLayout != null) {
            touchInterceptionFrameLayout.setScrollInterceptionListener(this);
        }
        FrameLayout root = m147721c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: jL */
    public void mo62729jL(WindowManager.LayoutParams layoutParams) {
        super.mo62729jL(layoutParams);
        if (layoutParams != null) {
            layoutParams.height = -1;
            layoutParams.width = -1;
            layoutParams.dimAmount = 0.75f;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: lL */
    protected View mo78264lL() {
        NumberPicker numberPicker = m84033sL().f137220u;
        AbstractC19074t.m100207e(numberPicker, "numberPicker");
        return numberPicker;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.layout_self_delete_conversation_config_view;
    }

    /* renamed from: sL */
    public final C29709a7 m84033sL() {
        C29709a7 c29709a7 = this.f77386V0;
        if (c29709a7 != null) {
            return c29709a7;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: yL */
    public final void m84034yL(C29709a7 c29709a7) {
        AbstractC19074t.m100208f(c29709a7, "<set-?>");
        this.f77386V0 = c29709a7;
    }
}
