package com.zing.zalo.p077ui.toolstorage.detail;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailTabViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import pm0.C24848g0;
import vg.AbstractC28025b8;
import vg.C28212v6;

/* loaded from: classes6.dex */
public final class ToolStorageDetailTabViewLayout extends HorizontalScrollView {
    public static final C13347a Companion = new C13347a(null);

    /* renamed from: p */
    private View[] f68502p;

    /* renamed from: q */
    private RobotoTextView[] f68503q;

    /* renamed from: r */
    private View[] f68504r;

    /* renamed from: s */
    private View[] f68505s;

    /* renamed from: t */
    private List f68506t;

    /* renamed from: u */
    private InterfaceC13348b f68507u;

    /* renamed from: v */
    private int f68508v;

    /* renamed from: w */
    private int[] f68509w;

    /* renamed from: x */
    private String f68510x;

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailTabViewLayout$a */
    /* loaded from: classes6.dex */
    public static final class C13347a {
        private C13347a() {
        }

        public /* synthetic */ C13347a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailTabViewLayout$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13348b {
        /* renamed from: a */
        void mo74907a(int i11);
    }

    public ToolStorageDetailTabViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68502p = new View[0];
        this.f68503q = new RobotoTextView[0];
        this.f68504r = new View[0];
        this.f68505s = new View[0];
        this.f68506t = new ArrayList();
        this.f68509w = new int[0];
        m74905g();
    }

    /* renamed from: d */
    private final int m74899d(String str) {
        switch (str.hashCode()) {
            case -1905167199:
                if (str.equals("Photos")) {
                    return AbstractC8020f0.str_tool_storage_usage_detail_tab_photo;
                }
                break;
            case -1732810888:
                if (str.equals("Videos")) {
                    return AbstractC8020f0.str_tool_storage_usage_detail_tab_video;
                }
                break;
            case -1269867783:
                if (str.equals("Voice message")) {
                    return AbstractC8020f0.str_tool_storage_usage_detail_tab_voice_message;
                }
                break;
            case 65921:
                if (str.equals("All")) {
                    return AbstractC8020f0.str_tool_storage_usage_detail_tab_all;
                }
                break;
            case 2189724:
                if (str.equals("File")) {
                    return AbstractC8020f0.str_tool_storage_usage_detail_tab_files;
                }
                break;
        }
        return AbstractC8020f0.str_tool_storage_usage_detail_tab_all;
    }

    private final String getTipByTab() {
        return "";
    }

    private final String getTipGlobalByTab() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m74900h(ToolStorageDetailTabViewLayout toolStorageDetailTabViewLayout, int i11, View view) {
        AbstractC19074t.m100208f(toolStorageDetailTabViewLayout, "this$0");
        try {
            InterfaceC13348b interfaceC13348b = toolStorageDetailTabViewLayout.f68507u;
            if (interfaceC13348b != null) {
                interfaceC13348b.mo74907a(i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLToolStorageDetailTabViewLayout", e11);
        }
    }

    /* renamed from: b */
    public final void m74901b(String str) {
        View view;
        View view2;
        boolean z11;
        int i11 = this.f68508v;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 < i11) {
                if (TextUtils.equals(getTipByTab(), str)) {
                    view = this.f68502p[i13];
                    view2 = this.f68505s[i13];
                    break;
                }
                i13++;
            } else {
                view = null;
                view2 = null;
                break;
            }
        }
        if (view != null) {
            C28212v6 m141453i = AbstractC28025b8.m141453i(str);
            C28212v6 m141453i2 = AbstractC28025b8.m141453i(getTipGlobalByTab());
            if (m141453i != null && m141453i.m142167f()) {
                z11 = m141453i.f131580f;
            } else {
                z11 = false;
            }
            if (m141453i2 != null && m141453i2.m142167f()) {
                z11 |= m141453i2.f131580f;
            }
            if (view2 != null) {
                if (!z11) {
                    i12 = 8;
                }
                view2.setVisibility(i12);
            }
        }
    }

    /* renamed from: c */
    public final View m74902c(int i11) {
        if (i11 >= 0) {
            View[] viewArr = this.f68502p;
            if (i11 < viewArr.length) {
                return viewArr[i11];
            }
        }
        return null;
    }

    /* renamed from: e */
    public final RobotoTextView m74903e(int i11) {
        if (i11 >= 0) {
            RobotoTextView[] robotoTextViewArr = this.f68503q;
            if (i11 < robotoTextViewArr.length) {
                return robotoTextViewArr[i11];
            }
        }
        return null;
    }

    /* renamed from: f */
    public final RobotoTextView m74904f(String str) {
        AbstractC19074t.m100208f(str, "name");
        Iterator it = this.f68506t.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(str, (String) it.next())) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        return m74903e(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final void m74905g() {
        removeAllViews();
        LayoutInflater from = LayoutInflater.from(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int length = this.f68502p.length;
        for (final int i11 = 0; i11 < length; i11++) {
            String str = (String) this.f68506t.get(i11);
            View inflate = from.inflate(AbstractC7409c0.layout_tool_storage_tab_item, (ViewGroup) this, false);
            this.f68502p[i11] = inflate;
            if (inflate != null) {
                inflate.setVisibility(0);
            }
            RobotoTextView[] robotoTextViewArr = this.f68503q;
            View findViewById = inflate.findViewById(AbstractC6918a0.tab_title);
            RobotoTextView robotoTextView = (RobotoTextView) findViewById;
            robotoTextView.setSingleLine(true);
            robotoTextView.setLines(1);
            C24848g0 c24848g0 = C24848g0.f119245a;
            robotoTextViewArr[i11] = findViewById;
            RobotoTextView robotoTextView2 = this.f68503q[i11];
            if (robotoTextView2 != null) {
                robotoTextView2.setText(getContext().getString(m74899d(str)));
            }
            this.f68504r[i11] = inflate.findViewById(AbstractC6918a0.tab_bottom_line);
            View view = this.f68504r[i11];
            if (view != null) {
                view.setBackgroundColor(Color.parseColor("#006AF5"));
            }
            this.f68505s[i11] = inflate.findViewById(AbstractC6918a0.tab_red_dot);
            linearLayout.addView(inflate);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: wa0.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ToolStorageDetailTabViewLayout.m74900h(ToolStorageDetailTabViewLayout.this, i11, view2);
                }
            });
        }
        addView(linearLayout, new ViewGroup.LayoutParams(-2, -1));
        int i12 = this.f68508v;
        for (int i13 = 0; i13 < i12; i13++) {
            m74901b(getTipByTab());
            m74901b(getTipGlobalByTab());
        }
    }

    /* renamed from: i */
    public final void m74906i(int i11) {
        boolean z11;
        int i12;
        AbstractC28025b8.m141442M(getTipByTab());
        AbstractC28025b8.m141442M(getTipGlobalByTab());
        m74901b(getTipByTab());
        m74901b(getTipGlobalByTab());
        try {
            int i13 = this.f68508v;
            for (int i14 = 0; i14 < i13; i14++) {
                RobotoTextView robotoTextView = this.f68503q[i14];
                if (robotoTextView != null) {
                    if (i14 == i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    robotoTextView.setSelected(z11);
                }
                View view = this.f68504r[i14];
                if (view != null) {
                    if (i14 == i11) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    view.setVisibility(i12);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLToolStorageDetailTabViewLayout", e11);
        }
    }

    public final void setGroupId(String str) {
        this.f68510x = str;
    }

    public final void setOnTabViewEventListener(InterfaceC13348b interfaceC13348b) {
        this.f68507u = interfaceC13348b;
    }

    public final void setTabViewList(List<String> list) {
        AbstractC19074t.m100208f(list, "tabViewList");
        this.f68506t.clear();
        List<String> list2 = list;
        if (!list2.isEmpty()) {
            this.f68506t.addAll(list2);
            int size = this.f68506t.size();
            this.f68508v = size;
            this.f68509w = new int[size];
            this.f68502p = new View[size];
            this.f68503q = new RobotoTextView[size];
            this.f68504r = new View[size];
            this.f68505s = new View[size];
            m74905g();
        }
    }

    public ToolStorageDetailTabViewLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f68502p = new View[0];
        this.f68503q = new RobotoTextView[0];
        this.f68504r = new View[0];
        this.f68505s = new View[0];
        this.f68506t = new ArrayList();
        this.f68509w = new int[0];
        m74905g();
    }
}
