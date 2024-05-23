package com.zing.zalo.p077ui.chattag;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.chattag.C11838b;
import com.zing.zalo.zdesign.component.CheckBox;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p210hh.C20060c;
import ui0.C27280g;

/* renamed from: com.zing.zalo.ui.chattag.b */
/* loaded from: classes5.dex */
public final class C11838b extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private ArrayList f61623r;

    /* renamed from: s */
    private Context f61624s;

    /* renamed from: t */
    private b f61625t;

    /* renamed from: com.zing.zalo.ui.chattag.b$a */
    /* loaded from: classes5.dex */
    public final class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final ListItem f61626I;

        /* renamed from: J */
        final /* synthetic */ C11838b f61627J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11838b c11838b, ListItem listItem) {
            super(listItem);
            AbstractC19074t.m100208f(listItem, "itemView");
            this.f61627J = c11838b;
            this.f61626I = listItem;
        }

        /* renamed from: i0 */
        public final CheckBox m65798i0() {
            View trailingItem = this.f61626I.getTrailingItem();
            if (trailingItem instanceof CheckBox) {
                return (CheckBox) trailingItem;
            }
            return null;
        }

        /* renamed from: j0 */
        public final ListItem m65799j0() {
            return this.f61626I;
        }
    }

    /* renamed from: com.zing.zalo.ui.chattag.b$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        boolean mo65757a(int i11);

        /* renamed from: b */
        void mo65758b();

        /* renamed from: c */
        void mo65759c(C20060c c20060c, int i11, boolean z11);
    }

    public C11838b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f61623r = new ArrayList();
        this.f61624s = context;
    }

    /* renamed from: Q */
    public static final void m65789Q(C11838b c11838b, CheckBox checkBox, C20060c c20060c, int i11, View view) {
        AbstractC19074t.m100208f(c11838b, "this$0");
        AbstractC19074t.m100208f(checkBox, "$this_apply");
        c11838b.m65791T(checkBox, c20060c, i11);
    }

    /* renamed from: R */
    public static final void m65790R(C11838b c11838b, a aVar, C20060c c20060c, int i11, View view) {
        AbstractC19074t.m100208f(c11838b, "this$0");
        AbstractC19074t.m100208f(aVar, "$holder");
        c11838b.m65791T(aVar.m65798i0(), c20060c, i11);
    }

    /* renamed from: T */
    private final void m65791T(CheckBox checkBox, C20060c c20060c, int i11) {
        boolean z11;
        b bVar = this.f61625t;
        if (bVar != null) {
            z11 = bVar.mo65757a(c20060c.m104215d());
        } else {
            z11 = false;
        }
        if (checkBox != null) {
            checkBox.setChecked(!z11);
        }
        b bVar2 = this.f61625t;
        if (bVar2 != null) {
            bVar2.mo65759c(c20060c, i11, !z11);
        }
    }

    /* renamed from: N */
    public final void m65792N() {
        b bVar = this.f61625t;
        if (bVar != null) {
            bVar.mo65758b();
            m10008p();
        }
    }

    /* renamed from: O */
    public final C20060c m65793O(int i11) {
        if (i11 >= 0) {
            try {
                if (i11 < this.f61623r.size()) {
                    return (C20060c) this.f61623r.get(i11);
                }
                return null;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P */
    public void mo9990A(a aVar, int i11) {
        AppCompatImageView appCompatImageView;
        boolean z11;
        AbstractC19074t.m100208f(aVar, "holder");
        C20060c m65793O = m65793O(i11);
        if (m65793O != null) {
            CheckBox m65798i0 = aVar.m65798i0();
            if (m65798i0 != null) {
                m65798i0.setIdTracking("checkbox_chat_tag_item_list");
                m65798i0.setOnClickListener(new View.OnClickListener() { // from class: v60.d

                    /* renamed from: q */
                    public final /* synthetic */ CheckBox f130232q;

                    /* renamed from: r */
                    public final /* synthetic */ C20060c f130233r;

                    /* renamed from: s */
                    public final /* synthetic */ int f130234s;

                    public /* synthetic */ ViewOnClickListenerC27932d(CheckBox m65798i02, C20060c m65793O2, int i112) {
                        r2 = m65798i02;
                        r3 = m65793O2;
                        r4 = i112;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C11838b.m65789Q(C11838b.this, r2, r3, r4, view);
                    }
                });
            }
            ListItem m65799j0 = aVar.m65799j0();
            m65799j0.setOnClickListener(new View.OnClickListener() { // from class: v60.e

                /* renamed from: q */
                public final /* synthetic */ C11838b.a f130236q;

                /* renamed from: r */
                public final /* synthetic */ C20060c f130237r;

                /* renamed from: s */
                public final /* synthetic */ int f130238s;

                public /* synthetic */ ViewOnClickListenerC27933e(C11838b.a aVar2, C20060c m65793O2, int i112) {
                    r2 = aVar2;
                    r3 = m65793O2;
                    r4 = i112;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11838b.m65790R(C11838b.this, r2, r3, r4, view);
                }
            });
            m65799j0.setTitle(m65793O2.m104216e());
            int parseColor = Color.parseColor(m65793O2.m104212a());
            View leadingItem = m65799j0.getLeadingItem();
            CheckBox checkBox = null;
            if (leadingItem instanceof AppCompatImageView) {
                appCompatImageView = (AppCompatImageView) leadingItem;
            } else {
                appCompatImageView = null;
            }
            if (appCompatImageView != null) {
                Drawable m139658a = C27280g.m139658a(this.f61624s, AbstractC16803z.icon_tag_in_tab_msg);
                if (m139658a != null) {
                    AbstractC1414a.m7196n(m139658a, parseColor);
                } else {
                    m139658a = null;
                }
                appCompatImageView.setImageDrawable(m139658a);
            }
            View trailingItem = m65799j0.getTrailingItem();
            if (trailingItem instanceof CheckBox) {
                checkBox = (CheckBox) trailingItem;
            }
            if (checkBox != null) {
                b bVar = this.f61625t;
                if (bVar != null) {
                    z11 = bVar.mo65757a(m65793O2.m104215d());
                } else {
                    z11 = false;
                }
                checkBox.m90551f(z11, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        ListItem listItem = new ListItem(context);
        listItem.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.bottom_sheet_container));
        listItem.setIdTracking("chat_tag_item_list");
        AppCompatImageView appCompatImageView = new AppCompatImageView(listItem.getContext());
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(AbstractC23136l9.m118742r(21.09f), AbstractC23136l9.m118742r(12.73f)));
        listItem.m90587c(appCompatImageView);
        listItem.setLeadingItemVisibility(0);
        listItem.setLeadingGravity(EnumC16952b0.CENTER);
        CheckBox checkBox = new CheckBox(this.f61624s);
        listItem.setVisibility(0);
        listItem.m90589e(checkBox);
        listItem.m90591l(AbstractC23222t7.f112545X, 0, 0, 0);
        return new a(this, listItem);
    }

    /* renamed from: U */
    public final void m65796U(List list) {
        AbstractC19074t.m100208f(list, "data");
        this.f61623r.clear();
        this.f61623r.addAll(list);
        m10008p();
    }

    /* renamed from: V */
    public final void m65797V(b bVar) {
        this.f61625t = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f61623r.size();
    }
}
