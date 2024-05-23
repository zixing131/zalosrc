package com.zing.zalo.report_v2.reportsummary;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.report_v2.reportsummary.AbstractC9350e;
import com.zing.zalo.report_v2.reportsummary.C9347b;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;

/* renamed from: com.zing.zalo.report_v2.reportsummary.b */
/* loaded from: classes4.dex */
public final class C9347b extends RecyclerView.AbstractC1880g {
    public static final d Companion = new d(null);

    /* renamed from: r */
    private final ArrayList f49485r = new ArrayList();

    /* renamed from: s */
    private h f49486s;

    /* renamed from: com.zing.zalo.report_v2.reportsummary.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RobotoTextView robotoTextView) {
            super(robotoTextView);
            ViewGroup.MarginLayoutParams marginLayoutParams;
            AbstractC19074t.m100208f(robotoTextView, "itemView");
            robotoTextView.setMaxScaledTextSize(AbstractC23222t7.f112586t);
            robotoTextView.setTextSize(0, AbstractC23222t7.f112576o);
            robotoTextView.setLineHeight(AbstractC23222t7.f112586t);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.text_02));
            ViewGroup.LayoutParams layoutParams = robotoTextView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            marginLayoutParams = marginLayoutParams == null ? new ViewGroup.MarginLayoutParams(-1, -2) : marginLayoutParams;
            int m118712h = AbstractC23136l9.m118712h(robotoTextView.getContext(), 16.0f);
            int m118712h2 = AbstractC23136l9.m118712h(robotoTextView.getContext(), 8.0f);
            marginLayoutParams.setMargins(m118712h, m118712h2, m118712h, m118712h2);
            robotoTextView.setLayoutParams(marginLayoutParams);
            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_desc_attachment_info));
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: I */
        private final ListItem f49487I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ListItem listItem, h hVar) {
            super(listItem);
            int m127173b0;
            String m127114D;
            AbstractC19074t.m100208f(listItem, "itemAttachView");
            this.f49487I = listItem;
            listItem.setIdTracking("REPORT_SUMMARY_BTN_ATTACHMENT");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_btn_attachments);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m127173b0 = AbstractC24342w.m127173b0(m118743r0, "#x#", 0, false, 6, null);
            if (m127173b0 >= 0) {
                m127114D = AbstractC24341v.m127114D(m118743r0, "#x#", "", false, 4, null);
                SpannableString spannableString = new SpannableString(m127114D);
                spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(listItem.getContext(), AbstractC2807a.text_02)), m127173b0, m127114D.length(), 33);
                listItem.setTitle(spannableString);
            }
            Context context = listItem.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            listItem.setBackground(C27280g.m139658a(context, AbstractC2810d.stencils_list_bg));
            listItem.m90592m(false);
            listItem.getIconChevronRight().setVisibility(0);
            listItem.setOnClickListener(new View.OnClickListener() { // from class: sz.a
                public /* synthetic */ ViewOnClickListenerC26424a() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C9347b.b.m50325k0(C9347b.h.this, view);
                }
            });
        }

        /* renamed from: k0 */
        public static final void m50325k0(h hVar, View view) {
            if (hVar != null) {
                hVar.mo50314Y2();
            }
        }

        @Override // com.zing.zalo.report_v2.reportsummary.C9347b.c
        /* renamed from: i0 */
        public void mo50326i0(AbstractC9350e abstractC9350e) {
            AbstractC19074t.m100208f(abstractC9350e, "itemData");
            super.mo50326i0(abstractC9350e);
            if (abstractC9350e instanceof AbstractC9350e.a) {
                this.f49487I.setSubtitle(((AbstractC9350e.a) abstractC9350e).m50340a());
            }
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.b$c */
    /* loaded from: classes4.dex */
    public static class c extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }

        /* renamed from: i0 */
        public void mo50326i0(AbstractC9350e abstractC9350e) {
            AbstractC19074t.m100208f(abstractC9350e, "itemData");
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.b$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.b$e */
    /* loaded from: classes4.dex */
    public static final class e extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.b$f */
    /* loaded from: classes4.dex */
    public static final class f extends c {

        /* renamed from: I */
        private final RobotoTextView f49488I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f49488I = (RobotoTextView) view;
        }

        @Override // com.zing.zalo.report_v2.reportsummary.C9347b.c
        /* renamed from: i0 */
        public void mo50326i0(AbstractC9350e abstractC9350e) {
            AbstractC19074t.m100208f(abstractC9350e, "itemData");
            super.mo50326i0(abstractC9350e);
            if (abstractC9350e instanceof AbstractC9350e.e) {
                this.f49488I.setText(((AbstractC9350e.e) abstractC9350e).m50342a());
            }
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.b$g */
    /* loaded from: classes4.dex */
    public static final class g extends c {

        /* renamed from: I */
        private final ReportSummaryReasonItemView f49489I;

        /* renamed from: J */
        private final h f49490J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ReportSummaryReasonItemView reportSummaryReasonItemView, h hVar) {
            super(reportSummaryReasonItemView);
            AbstractC19074t.m100208f(reportSummaryReasonItemView, "itemReasonView");
            this.f49489I = reportSummaryReasonItemView;
            this.f49490J = hVar;
        }

        @Override // com.zing.zalo.report_v2.reportsummary.C9347b.c
        /* renamed from: i0 */
        public void mo50326i0(AbstractC9350e abstractC9350e) {
            AbstractC19074t.m100208f(abstractC9350e, "itemData");
            super.mo50326i0(abstractC9350e);
            if (abstractC9350e instanceof AbstractC9350e.f) {
                this.f49489I.m50286p((AbstractC9350e.f) abstractC9350e, this.f49490J);
            }
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.b$h */
    /* loaded from: classes4.dex */
    public interface h {
        /* renamed from: V2 */
        void mo50311V2(AbstractC9350e.f.b bVar, String str);

        /* renamed from: W2 */
        void mo50312W2(AbstractC9350e.f fVar);

        /* renamed from: X2 */
        void mo50313X2(int i11);

        /* renamed from: Y2 */
        void mo50314Y2();

        /* renamed from: m1 */
        boolean mo50315m1(AbstractC9350e.f fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L */
    public void mo9990A(c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "holder");
        Object obj = this.f49485r.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        cVar.mo50326i0((AbstractC9350e) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        c fVar;
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return new c(new View(context));
                        }
                        AbstractC19074t.m100205c(context);
                        return new a(new RobotoTextView(context));
                    }
                    AbstractC19074t.m100205c(context);
                    return new b(new ListItem(context), this.f49486s);
                }
                View view = new View(context);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23136l9.m118712h(context, 12.0f)));
                fVar = new e(view);
            } else {
                AbstractC19074t.m100205c(context);
                return new g(new ReportSummaryReasonItemView(context), this.f49486s);
            }
        } else {
            AbstractC19074t.m100205c(context);
            RobotoTextView robotoTextView = new RobotoTextView(context);
            new C26708g(robotoTextView).m137319a(C26705d.m137293a(context, AbstractC2814h.t_small));
            robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_02));
            ViewGroup.LayoutParams layoutParams = robotoTextView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            }
            int m118712h = AbstractC23136l9.m118712h(context, 16.0f);
            marginLayoutParams.setMargins(m118712h, m118712h, m118712h, m118712h);
            robotoTextView.setLayoutParams(marginLayoutParams);
            fVar = new f(robotoTextView);
        }
        return fVar;
    }

    /* renamed from: N */
    public final void m50322N(h hVar) {
        this.f49486s = hVar;
    }

    /* renamed from: O */
    public final void m50323O(List list) {
        AbstractC19074t.m100208f(list, "listData");
        this.f49485r.clear();
        this.f49485r.addAll(list);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f49485r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        AbstractC9350e abstractC9350e = (AbstractC9350e) this.f49485r.get(i11);
        if (abstractC9350e instanceof AbstractC9350e.e) {
            return 1;
        }
        if (abstractC9350e instanceof AbstractC9350e.d) {
            return 3;
        }
        if (abstractC9350e instanceof AbstractC9350e.f) {
            return 2;
        }
        if (abstractC9350e instanceof AbstractC9350e.a) {
            return 4;
        }
        if (abstractC9350e instanceof AbstractC9350e.b) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }
}
