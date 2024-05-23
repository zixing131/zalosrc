package com.zing.zalo.p077ui.mediastore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.mediastore.TabViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class TabViewLayout extends LinearLayout {

    /* renamed from: p */
    private View[] f64179p;

    /* renamed from: q */
    private RobotoTextView[] f64180q;

    /* renamed from: r */
    private View[] f64181r;

    /* renamed from: s */
    private View[] f64182s;

    /* renamed from: t */
    private List f64183t;

    /* renamed from: u */
    private InterfaceC12338a f64184u;

    /* renamed from: v */
    private int f64185v;

    /* renamed from: w */
    private int[] f64186w;

    /* renamed from: x */
    private Map f64187x;

    /* renamed from: com.zing.zalo.ui.mediastore.TabViewLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12338a {
        /* renamed from: a */
        void mo69408a(int i11);
    }

    public TabViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64179p = new View[0];
        this.f64180q = new RobotoTextView[0];
        this.f64181r = new View[0];
        this.f64182s = new View[0];
        this.f64183t = new ArrayList();
        this.f64186w = new int[0];
        this.f64187x = new LinkedHashMap();
        m69416c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m69414d(TabViewLayout tabViewLayout, int i11, View view) {
        AbstractC19074t.m100208f(tabViewLayout, "this$0");
        try {
            InterfaceC12338a interfaceC12338a = tabViewLayout.f64184u;
            if (interfaceC12338a != null) {
                interfaceC12338a.mo69408a(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public final View m69415b(int i11) {
        if (i11 >= 0) {
            View[] viewArr = this.f64179p;
            if (i11 < viewArr.length) {
                return viewArr[i11];
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m69416c() {
        removeAllViews();
        LayoutInflater from = LayoutInflater.from(getContext());
        int length = this.f64179p.length;
        for (final int i11 = 0; i11 < length; i11++) {
            String str = (String) this.f64187x.get(this.f64183t.get(i11));
            View inflate = from.inflate(AbstractC7409c0.layout_media_store_tab_item, (ViewGroup) this, false);
            this.f64179p[i11] = inflate;
            if (inflate != null) {
                inflate.setVisibility(0);
            }
            this.f64180q[i11] = inflate.findViewById(AbstractC6918a0.tab_title);
            RobotoTextView robotoTextView = this.f64180q[i11];
            if (robotoTextView != null) {
                robotoTextView.setText(str);
            }
            this.f64181r[i11] = inflate.findViewById(AbstractC6918a0.tab_bottom_line);
            this.f64182s[i11] = inflate.findViewById(AbstractC6918a0.tab_red_dot);
            addView(inflate);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: x70.v1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TabViewLayout.m69414d(TabViewLayout.this, i11, view);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m69417e(String str, String str2) {
        boolean z11;
        int indexOf;
        RobotoTextView robotoTextView;
        AbstractC19074t.m100208f(str, "tab");
        AbstractC19074t.m100208f(str2, "tabName");
        this.f64187x.put(str, str2);
        if (!this.f64187x.isEmpty()) {
            if (this.f64180q.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((!z11) && (indexOf = this.f64183t.indexOf(str)) >= 0 && indexOf < this.f64183t.size() && (robotoTextView = this.f64180q[indexOf]) != null) {
                robotoTextView.setText(str2);
            }
        }
    }

    /* renamed from: f */
    public final void m69418f(List list, Map map) {
        AbstractC19074t.m100208f(list, "tabViewList");
        AbstractC19074t.m100208f(map, "tabNames");
        this.f64183t.clear();
        List list2 = list;
        if (!list2.isEmpty()) {
            this.f64183t.addAll(list2);
            for (String str : map.keySet()) {
                this.f64187x.put(str, map.get(str));
            }
            int size = this.f64183t.size();
            this.f64185v = size;
            this.f64186w = new int[size];
            this.f64179p = new View[size];
            this.f64180q = new RobotoTextView[size];
            this.f64181r = new View[size];
            this.f64182s = new View[size];
            m69416c();
        }
    }

    /* renamed from: g */
    public final void m69419g(int i11) {
        boolean z11;
        int i12;
        try {
            int i13 = this.f64185v;
            for (int i14 = 0; i14 < i13; i14++) {
                RobotoTextView robotoTextView = this.f64180q[i14];
                if (robotoTextView != null) {
                    if (i14 == i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    robotoTextView.setSelected(z11);
                }
                View view = this.f64181r[i14];
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
            e11.printStackTrace();
        }
    }

    public final InterfaceC12338a getMListener() {
        return this.f64184u;
    }

    public final int getMNumberTab() {
        return this.f64185v;
    }

    public final RobotoTextView[] getMTabViewArr() {
        return this.f64180q;
    }

    public final int getTabCount() {
        return this.f64183t.size();
    }

    public final void setMListener(InterfaceC12338a interfaceC12338a) {
        this.f64184u = interfaceC12338a;
    }

    public final void setMNumberTab(int i11) {
        this.f64185v = i11;
    }

    public final void setMTabViewArr(RobotoTextView[] robotoTextViewArr) {
        AbstractC19074t.m100208f(robotoTextViewArr, "<set-?>");
        this.f64180q = robotoTextViewArr;
    }

    public final void setOnTabViewEventListener(InterfaceC12338a interfaceC12338a) {
        this.f64184u = interfaceC12338a;
    }

    public TabViewLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f64179p = new View[0];
        this.f64180q = new RobotoTextView[0];
        this.f64181r = new View[0];
        this.f64182s = new View[0];
        this.f64183t = new ArrayList();
        this.f64186w = new int[0];
        this.f64187x = new LinkedHashMap();
        m69416c();
    }
}
