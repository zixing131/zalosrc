package com.zing.zalo.p077ui.mycloud;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.mycloud.MyCloudMultiSelectBottomView;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import com.zing.zalo.uicontrol.MultiSelectMenuBottomView;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import mw.AbstractC23463h;
import p279jw.C21373a;
import p365nk.C23805a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import ui0.C27280g;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class MyCloudMultiSelectBottomView extends MultiSelectMenuBottomView {
    public static final C12491a Companion = new C12491a(null);

    /* renamed from: A */
    private final InterfaceC24854k f65359A;

    /* renamed from: B */
    private Drawable f65360B;

    /* renamed from: C */
    private Drawable f65361C;

    /* renamed from: D */
    private Drawable f65362D;

    /* renamed from: E */
    private Drawable f65363E;

    /* renamed from: F */
    private Drawable f65364F;

    /* renamed from: G */
    private Drawable f65365G;

    /* renamed from: H */
    private Drawable f65366H;

    /* renamed from: I */
    private Drawable f65367I;

    /* renamed from: J */
    private Drawable f65368J;

    /* renamed from: K */
    private Drawable f65369K;

    /* renamed from: L */
    private final InterfaceC24854k f65370L;

    /* renamed from: M */
    private boolean f65371M;

    /* renamed from: N */
    private boolean f65372N;

    /* renamed from: O */
    private boolean f65373O;

    /* renamed from: P */
    private boolean f65374P;

    /* renamed from: s */
    private C23805a.e f65375s;

    /* renamed from: t */
    private TextView f65376t;

    /* renamed from: u */
    private TextView f65377u;

    /* renamed from: v */
    private TextView f65378v;

    /* renamed from: w */
    private TextView f65379w;

    /* renamed from: x */
    private TextView f65380x;

    /* renamed from: y */
    private TextView f65381y;

    /* renamed from: z */
    private InterfaceC12492b f65382z;

    /* renamed from: com.zing.zalo.ui.mycloud.MyCloudMultiSelectBottomView$a */
    /* loaded from: classes6.dex */
    public static final class C12491a {
        private C12491a() {
        }

        public /* synthetic */ C12491a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.MyCloudMultiSelectBottomView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12492b {
        /* renamed from: a */
        void mo70220a();

        /* renamed from: b */
        void mo70221b();

        /* renamed from: c */
        void mo70222c();

        /* renamed from: d */
        void mo70223d();

        /* renamed from: e */
        void mo70224e();

        /* renamed from: f */
        void mo70225f();
    }

    /* renamed from: com.zing.zalo.ui.mycloud.MyCloudMultiSelectBottomView$c */
    /* loaded from: classes6.dex */
    static final class C12493c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12493c f65383q = new C12493c();

        C12493c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.MyCloudMultiSelectBottomView$d */
    /* loaded from: classes6.dex */
    static final class C12494d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12494d f65384q = new C12494d();

        C12494d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            return Boolean.valueOf(C21373a.f104231a.m110807w().m110825b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCloudMultiSelectBottomView(Context context, C23805a.e eVar) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(eVar, "viewMode");
        this.f65375s = eVar;
        m129210a = AbstractC24856m.m129210a(C12494d.f65384q);
        this.f65359A = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C12493c.f65383q);
        this.f65370L = m129210a2;
        m70211l();
        m70218m();
    }

    private final List<SelectedItemData> getCurrSelectedList() {
        return (List) this.f65370L.getValue();
    }

    private final int getCurrSelectedRolledItemCount() {
        Iterator<T> it = getCurrSelectedList().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((SelectedItemData) it.next()).m72576a().m95022U7()) {
                i11++;
            }
        }
        return i11;
    }

    private final boolean getEnableMyCloudCollection() {
        return ((Boolean) this.f65359A.getValue()).booleanValue();
    }

    /* renamed from: l */
    private final void m70211l() {
        Context context = getContext();
        if (context != null) {
            this.f65360B = C27280g.m139659b(context, AbstractC23322a.zds_ic_plus_circle_line_24, AbstractC2808b.f150820b50);
            this.f65361C = C27280g.m139660c(context, AbstractC23322a.zds_ic_plus_circle_line_24, AbstractC2807a.icon_03);
            this.f65362D = C27280g.m139659b(context, AbstractC23322a.zds_ic_minus_circle_line_24, AbstractC2808b.tl60);
            this.f65363E = C27280g.m139660c(context, AbstractC23322a.zds_ic_minus_circle_line_24, AbstractC2807a.icon_03);
            this.f65364F = C27280g.m139659b(context, AbstractC23322a.zds_ic_share_line_24, AbstractC2808b.f150820b50);
            this.f65365G = C27280g.m139660c(context, AbstractC23322a.zds_ic_share_line_24, AbstractC2807a.icon_03);
            this.f65366H = C27280g.m139659b(context, AbstractC23322a.zds_ic_delete_line_24, AbstractC2808b.f150830r60);
            this.f65367I = C27280g.m139660c(context, AbstractC23322a.zds_ic_delete_line_24, AbstractC2807a.icon_03);
            this.f65368J = C27280g.m139659b(context, AbstractC23322a.zds_ic_download_line_24, AbstractC2808b.gr60);
            this.f65369K = C27280g.m139659b(context, AbstractC23322a.zds_ic_copy_line_24, AbstractC2808b.f150820b50);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m70212n(MyCloudMultiSelectBottomView myCloudMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(myCloudMultiSelectBottomView, "this$0");
        if (myCloudMultiSelectBottomView.getCurrSelectedList().isEmpty()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_selected_item));
            return;
        }
        InterfaceC12492b interfaceC12492b = myCloudMultiSelectBottomView.f65382z;
        if (interfaceC12492b != null) {
            interfaceC12492b.mo70221b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m70213p(MyCloudMultiSelectBottomView myCloudMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(myCloudMultiSelectBottomView, "this$0");
        if (myCloudMultiSelectBottomView.getCurrSelectedList().isEmpty()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_selected_item));
            return;
        }
        InterfaceC12492b interfaceC12492b = myCloudMultiSelectBottomView.f65382z;
        if (interfaceC12492b != null) {
            interfaceC12492b.mo70220a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m70214q(MyCloudMultiSelectBottomView myCloudMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(myCloudMultiSelectBottomView, "this$0");
        if (myCloudMultiSelectBottomView.getCurrSelectedList().isEmpty()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_selected_item));
            return;
        }
        if (myCloudMultiSelectBottomView.getCurrSelectedRolledItemCount() > 0) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_cannot_forward_rolled_msg));
            return;
        }
        InterfaceC12492b interfaceC12492b = myCloudMultiSelectBottomView.f65382z;
        if (interfaceC12492b != null) {
            interfaceC12492b.mo70224e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m70215r(MyCloudMultiSelectBottomView myCloudMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(myCloudMultiSelectBottomView, "this$0");
        if (myCloudMultiSelectBottomView.getCurrSelectedList().isEmpty()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_selected_item));
            return;
        }
        InterfaceC12492b interfaceC12492b = myCloudMultiSelectBottomView.f65382z;
        if (interfaceC12492b != null) {
            interfaceC12492b.mo70223d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m70216s(MyCloudMultiSelectBottomView myCloudMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(myCloudMultiSelectBottomView, "this$0");
        if (myCloudMultiSelectBottomView.getCurrSelectedList().isEmpty()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_selected_item));
            return;
        }
        InterfaceC12492b interfaceC12492b = myCloudMultiSelectBottomView.f65382z;
        if (interfaceC12492b != null) {
            interfaceC12492b.mo70225f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m70217u(MyCloudMultiSelectBottomView myCloudMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(myCloudMultiSelectBottomView, "this$0");
        InterfaceC12492b interfaceC12492b = myCloudMultiSelectBottomView.f65382z;
        if (interfaceC12492b != null) {
            interfaceC12492b.mo70222c();
        }
    }

    public final InterfaceC12492b getListener() {
        return this.f65382z;
    }

    public final C23805a.e getViewMode() {
        return this.f65375s;
    }

    /* renamed from: m */
    public final void m70218m() {
        List m131187O0;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setMinimumHeight(getMinHeight() + AbstractC23222t7.f112556e);
        setBackground(AbstractC23136l9.m118663M(AbstractC16803z.bg_top_shadow_4));
        int i11 = AbstractC6918a0.share;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.forward);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        TextView m87773a = m87773a(i11, m118743r0, this.f65365G);
        m87773a.setCompoundDrawablePadding(AbstractC23222t7.f112566j);
        m87773a.setOnClickListener(new View.OnClickListener() { // from class: u80.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudMultiSelectBottomView.m70214q(MyCloudMultiSelectBottomView.this, view);
            }
        });
        this.f65376t = m87773a;
        if (getEnableMyCloudCollection()) {
            if (this.f65375s == C23805a.e.f115063p) {
                int i12 = AbstractC6918a0.add_to_collection;
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_add_item_to_collection);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                TextView m87773a2 = m87773a(i12, m118743r02, this.f65361C);
                m87773a2.setCompoundDrawablePadding(AbstractC23222t7.f112566j);
                m87773a2.setOnClickListener(new View.OnClickListener() { // from class: u80.n1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyCloudMultiSelectBottomView.m70215r(MyCloudMultiSelectBottomView.this, view);
                    }
                });
                this.f65379w = m87773a2;
            }
            if (this.f65375s == C23805a.e.f115064q) {
                int i13 = AbstractC6918a0.remove_item_collection;
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_from_collection);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                TextView m87773a3 = m87773a(i13, m118743r03, this.f65363E);
                m87773a3.setCompoundDrawablePadding(AbstractC23222t7.f112566j);
                m87773a3.setOnClickListener(new View.OnClickListener() { // from class: u80.o1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyCloudMultiSelectBottomView.m70216s(MyCloudMultiSelectBottomView.this, view);
                    }
                });
                this.f65380x = m87773a3;
            }
        }
        int i14 = AbstractC6918a0.share;
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_collection_msg);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        TextView m87773a4 = m87773a(i14, m118743r04, this.f65369K);
        m87773a4.setCompoundDrawablePadding(AbstractC23222t7.f112566j);
        m87773a4.setOnClickListener(new View.OnClickListener() { // from class: u80.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudMultiSelectBottomView.m70217u(MyCloudMultiSelectBottomView.this, view);
            }
        });
        this.f65381y = m87773a4;
        int i15 = AbstractC6918a0.download;
        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.option_save);
        AbstractC19074t.m100207e(m118743r05, "getString(...)");
        TextView m87773a5 = m87773a(i15, m118743r05, this.f65368J);
        m87773a5.setCompoundDrawablePadding(AbstractC23222t7.f112566j);
        m87773a5.setOnClickListener(new View.OnClickListener() { // from class: u80.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudMultiSelectBottomView.m70212n(MyCloudMultiSelectBottomView.this, view);
            }
        });
        this.f65378v = m87773a5;
        int i16 = AbstractC6918a0.delete;
        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.delete);
        AbstractC19074t.m100207e(m118743r06, "getString(...)");
        TextView m87773a6 = m87773a(i16, m118743r06, this.f65367I);
        m87773a6.setCompoundDrawablePadding(AbstractC23222t7.f112566j);
        m87773a6.setOnClickListener(new View.OnClickListener() { // from class: u80.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudMultiSelectBottomView.m70213p(MyCloudMultiSelectBottomView.this, view);
            }
        });
        this.f65377u = m87773a6;
        m131187O0 = AbstractC25332a0.m131187O0(getCurrSelectedList());
        m70219v(m131187O0);
    }

    public final void setListener(InterfaceC12492b interfaceC12492b) {
        this.f65382z = interfaceC12492b;
    }

    public final void setViewMode(C23805a.e eVar) {
        AbstractC19074t.m100208f(eVar, "<set-?>");
        this.f65375s = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a2  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70219v(List list) {
        boolean z11;
        boolean z12;
        TextView textView;
        TextView textView2;
        Drawable drawable;
        TextView textView3;
        Drawable drawable2;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        List<SelectedItemData> list2;
        TextView textView7;
        Drawable drawable3;
        Drawable drawable4;
        AbstractC19074t.m100208f(list, "lstSelected");
        getCurrSelectedList().clear();
        getCurrSelectedList().addAll(list);
        int currSelectedRolledItemCount = getCurrSelectedRolledItemCount();
        if ((!r1.isEmpty()) && currSelectedRolledItemCount == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f65371M = z11;
        this.f65372N = !r1.isEmpty();
        if (!r1.isEmpty()) {
            List list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    if (!AbstractC23463h.m123190r(((SelectedItemData) it.next()).m72576a())) {
                    }
                }
            }
            z12 = true;
            this.f65373O = z12;
            this.f65374P = !r1.isEmpty();
            textView = this.f65379w;
            if (textView != null) {
                if (this.f65373O) {
                    drawable4 = this.f65360B;
                } else {
                    drawable4 = this.f65361C;
                }
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable4, (Drawable) null, (Drawable) null);
                mo77422c(this.f65373O, textView);
            }
            textView2 = this.f65380x;
            if (textView2 != null) {
                if (this.f65374P) {
                    drawable3 = this.f65362D;
                } else {
                    drawable3 = this.f65363E;
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable3, (Drawable) null, (Drawable) null);
                mo77422c(this.f65374P, textView2);
            }
            if (!this.f65371M) {
                drawable = this.f65364F;
            } else {
                drawable = this.f65365G;
            }
            textView3 = this.f65376t;
            if (textView3 != null) {
                textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
            }
            mo77422c(this.f65371M, this.f65376t);
            if (!this.f65372N) {
                drawable2 = this.f65366H;
            } else {
                drawable2 = this.f65367I;
            }
            textView4 = this.f65377u;
            if (textView4 != null) {
                textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, (Drawable) null);
            }
            mo77422c(this.f65372N, this.f65377u);
            if ((!r1.isEmpty()) && list.size() > currSelectedRolledItemCount) {
                list2 = list;
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    for (SelectedItemData selectedItemData : list2) {
                        if (AbstractC19646n0.m103031t1(selectedItemData.m72576a().m95041W4()) || AbstractC19646n0.m102886D1(selectedItemData.m72576a().m95041W4()) || AbstractC19646n0.m102995k1(selectedItemData.m72576a().m95041W4())) {
                        }
                    }
                }
                textView7 = this.f65378v;
                if (textView7 != null) {
                    textView7.setVisibility(0);
                }
                if (!(!r1.isEmpty()) && list.size() == 1 && ((SelectedItemData) list.get(0)).m72576a().m94927K0()) {
                    TextView textView8 = this.f65381y;
                    if (textView8 != null) {
                        textView8.setVisibility(0);
                    }
                } else {
                    textView6 = this.f65381y;
                    if (textView6 != null) {
                        textView6.setVisibility(8);
                    }
                }
                TransitionManager.beginDelayedTransition(this);
            }
            textView5 = this.f65378v;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            if (!(!r1.isEmpty())) {
            }
            textView6 = this.f65381y;
            if (textView6 != null) {
            }
            TransitionManager.beginDelayedTransition(this);
        }
        z12 = false;
        this.f65373O = z12;
        this.f65374P = !r1.isEmpty();
        textView = this.f65379w;
        if (textView != null) {
        }
        textView2 = this.f65380x;
        if (textView2 != null) {
        }
        if (!this.f65371M) {
        }
        textView3 = this.f65376t;
        if (textView3 != null) {
        }
        mo77422c(this.f65371M, this.f65376t);
        if (!this.f65372N) {
        }
        textView4 = this.f65377u;
        if (textView4 != null) {
        }
        mo77422c(this.f65372N, this.f65377u);
        if (!r1.isEmpty()) {
            list2 = list;
            if (list2 instanceof Collection) {
            }
            while (r0.hasNext()) {
            }
            textView7 = this.f65378v;
            if (textView7 != null) {
            }
            if (!(!r1.isEmpty())) {
            }
            textView6 = this.f65381y;
            if (textView6 != null) {
            }
            TransitionManager.beginDelayedTransition(this);
        }
        textView5 = this.f65378v;
        if (textView5 != null) {
        }
        if (!(!r1.isEmpty())) {
        }
        textView6 = this.f65381y;
        if (textView6 != null) {
        }
        TransitionManager.beginDelayedTransition(this);
    }
}
