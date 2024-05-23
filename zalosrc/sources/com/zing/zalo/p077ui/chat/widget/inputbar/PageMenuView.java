package com.zing.zalo.p077ui.chat.widget.inputbar;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.chat.widget.inputbar.PageMenuView;
import java.util.HashMap;
import java.util.Map;
import nh0.C23793c;
import p056cj.C3545m;
import p361nb.AbstractC23647d;
import p549uj.AbstractC27282a;
import p549uj.C27283b;
import p604wb.C28905e;
import yc0.AbstractC30905h;
import yc0.C30898a;
import yc0.C30901d;

/* loaded from: classes5.dex */
public class PageMenuView extends LinearLayout {

    /* renamed from: p */
    InterfaceC11746a f61094p;

    /* renamed from: q */
    Map f61095q;

    /* renamed from: r */
    C3545m f61096r;

    /* renamed from: s */
    C30901d f61097s;

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.PageMenuView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11746a {
        /* renamed from: l2 */
        void mo60093l2(AbstractC27282a abstractC27282a);
    }

    public PageMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61097s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m65413h(C27283b c27283b, View view) {
        try {
            if (c27283b.m139680k()) {
                Map map = this.f61095q;
                if (map != null && map.containsKey(c27283b.m139670b())) {
                    C30901d c30901d = (C30901d) this.f61095q.get(c27283b.m139670b());
                    if (c30901d.m150151n()) {
                        AbstractC23647d.m123907q("9185", "");
                        c30901d.m150137x();
                        AbstractC23647d.m123893c();
                        this.f61097s = null;
                    } else {
                        C30901d c30901d2 = this.f61097s;
                        if (c30901d2 != null) {
                            c30901d2.m150137x();
                        }
                        AbstractC23647d.m123907q("9184", "");
                        c30901d.m150135C(view);
                        this.f61097s = c30901d;
                        AbstractC23647d.m123893c();
                        if (c27283b.m139676h()) {
                            C28905e.m144373n().m144401w(c27283b.m139674f(), 0, C23793c.m124316k().mo124311f());
                        }
                    }
                    m65420l();
                    return;
                }
                return;
            }
            InterfaceC11746a interfaceC11746a = this.f61094p;
            if (interfaceC11746a != null) {
                interfaceC11746a.mo60093l2(c27283b);
            }
            if (c27283b.m139676h()) {
                C28905e.m144373n().m144401w(c27283b.m139674f(), 0, C23793c.m124316k().mo124311f());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m65414i(C27283b c27283b, AbstractC30905h abstractC30905h, int i11, String str) {
        C27283b c27283b2;
        try {
            AbstractC23647d.m123907q("9187", "");
            if (!TextUtils.isEmpty(str) && (c27283b2 = (C27283b) c27283b.m139679j().get(str)) != null) {
                InterfaceC11746a interfaceC11746a = this.f61094p;
                if (interfaceC11746a != null) {
                    interfaceC11746a.mo60093l2(c27283b2);
                }
                if (c27283b2.m139676h()) {
                    C28905e.m144373n().m144401w(c27283b2.m139674f(), 0, C23793c.m124316k().mo124311f());
                }
            }
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ boolean m65416k(View view, C30901d c30901d, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 4) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            if (new Rect(i11, i12, view.getMeasuredWidth() + i11, view.getMeasuredHeight() + i12).contains(rawX, rawY)) {
                return true;
            }
            c30901d.m150137x();
            return false;
        }
        if (motionEvent.getAction() == 0) {
            int rawX2 = (int) motionEvent.getRawX();
            int rawY2 = (int) motionEvent.getRawY();
            boolean z11 = false;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                final View childAt = getChildAt(i13);
                if (m65419g(rawX2, rawY2, childAt)) {
                    childAt.setPressed(true);
                    childAt.performClick();
                    childAt.postDelayed(new Runnable() { // from class: m60.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            childAt.setPressed(false);
                        }
                    }, 100L);
                    z11 = true;
                }
            }
            boolean contains = c30901d.m150150m().contains(rawX2, rawY2);
            if (!z11 && !contains) {
                AbstractC23647d.m123907q("9186", "");
                AbstractC23647d.m123893c();
            }
        }
        return false;
    }

    /* renamed from: e */
    void m65417e(final C27283b c27283b) {
        if (c27283b != null) {
            try {
                if (this.f61095q == null) {
                    this.f61095q = new HashMap();
                }
                final View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.page_chat_menu_item, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.page_menu_label);
                ImageView imageView = (ImageView) inflate.findViewById(AbstractC6918a0.page_menu_toggle_icon);
                textView.setText(c27283b.m139672d());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                layoutParams.weight = 1.0f;
                inflate.setTag(c27283b.m139670b());
                inflate.setOnClickListener(new View.OnClickListener() { // from class: m60.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PageMenuView.this.m65413h(c27283b, view);
                    }
                });
                addView(inflate, layoutParams);
                if (c27283b.m139680k()) {
                    imageView.setVisibility(0);
                    imageView.setImageResource(AbstractC16803z.ic_pagemenu_open);
                    final C30901d c30901d = new C30901d(getContext());
                    c30901d.m150152p(3);
                    for (C27283b c27283b2 : c27283b.m139679j().values()) {
                        if (c27283b2 != null) {
                            c30901d.m150147i(new C30898a(c27283b2.m139670b(), c27283b2.m139672d(), null));
                        }
                    }
                    c30901d.m150154r(new AbstractC30905h.a() { // from class: m60.i
                        @Override // yc0.AbstractC30905h.a
                        /* renamed from: a */
                        public final void mo117630a(AbstractC30905h abstractC30905h, int i11, String str) {
                            PageMenuView.this.m65414i(c27283b, abstractC30905h, i11, str);
                        }
                    });
                    c30901d.m150134B(new View.OnTouchListener() { // from class: m60.j
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            boolean m65416k;
                            m65416k = PageMenuView.this.m65416k(inflate, c30901d, view, motionEvent);
                            return m65416k;
                        }
                    });
                    c30901d.m150155s(new AbstractC30905h.b() { // from class: com.zing.zalo.ui.chat.widget.inputbar.a
                        @Override // yc0.AbstractC30905h.b
                        public final void onDismiss() {
                            PageMenuView.this.m65420l();
                        }
                    });
                    this.f61095q.put(c27283b.m139670b(), c30901d);
                    return;
                }
                imageView.setVisibility(8);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public void m65418f() {
        try {
            Map map = this.f61095q;
            if (map != null) {
                for (C30901d c30901d : map.values()) {
                    if (c30901d != null) {
                        c30901d.m150137x();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    boolean m65419g(int i11, int i12, View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i13 = iArr[0];
            int i14 = iArr[1];
            return new Rect(i13, i14, view.getMeasuredWidth() + i13, view.getMeasuredHeight() + i14).contains(i11, i12);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m65420l() {
        Map map;
        C27283b c27283b;
        View findViewWithTag;
        boolean z11;
        int i11;
        try {
            if (getChildCount() > 0 && (map = this.f61095q) != null && this.f61096r != null) {
                for (String str : map.keySet()) {
                    if (str != null && (c27283b = (C27283b) this.f61096r.m18016b().get(str)) != null && c27283b.m139680k() && (findViewWithTag = findViewWithTag(str)) != null) {
                        if (this.f61095q.containsKey(c27283b.m139670b()) && ((C30901d) this.f61095q.get(c27283b.m139670b())).m150151n()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        try {
                            ImageView imageView = (ImageView) findViewWithTag.findViewById(AbstractC6918a0.page_menu_toggle_icon);
                            if (z11) {
                                i11 = AbstractC16803z.ic_pagemenu_close;
                            } else {
                                i11 = AbstractC16803z.ic_pagemenu_open;
                            }
                            imageView.setImageResource(i11);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    public void setPageChatMenuViewListener(InterfaceC11746a interfaceC11746a) {
        this.f61094p = interfaceC11746a;
    }

    public void setPageMenu(C3545m c3545m) {
        this.f61096r = c3545m;
        if (c3545m != null) {
            try {
                removeAllViews();
                for (C27283b c27283b : c3545m.m18016b().values()) {
                    if (c27283b != null) {
                        m65417e(c27283b);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
