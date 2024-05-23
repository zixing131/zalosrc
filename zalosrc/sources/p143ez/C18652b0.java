package p143ez;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p143ez.C18652b0;
import p588vw.C28655u;
import ui0.C27280g;
import vl0.AbstractC28291a;

/* renamed from: ez.b0 */
/* loaded from: classes4.dex */
public final class C18652b0 extends RecyclerView.AbstractC1880g {

    /* renamed from: s */
    private final int f93858s;

    /* renamed from: u */
    private InterfaceC18505l f93860u;

    /* renamed from: r */
    private List f93857r = new ArrayList();

    /* renamed from: t */
    private final int f93859t = 1;

    /* renamed from: N */
    public final InterfaceC18505l m98573N() {
        return this.f93860u;
    }

    /* renamed from: O */
    public final boolean m98574O(int i11) {
        try {
            if (this.f93857r.size() > i11) {
                return ((C28655u) this.f93857r.get(i11)).f132867e;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        aVar.m98581j0((C28655u) this.f93857r.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        return new a(this, viewGroup, 0, 0, 6, null);
    }

    /* renamed from: R */
    public final void m98577R(InterfaceC18505l interfaceC18505l) {
        this.f93860u = interfaceC18505l;
    }

    /* renamed from: S */
    public final void m98578S(List list) {
        AbstractC19074t.m100208f(list, "list");
        this.f93857r.clear();
        this.f93857r.addAll(list);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f93857r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (m98574O(i11)) {
            return this.f93858s;
        }
        return this.f93859t;
    }

    /* renamed from: ez.b0$a */
    /* loaded from: classes4.dex */
    public final class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final ListItem f93861I;

        /* renamed from: J */
        private final RobotoTextView f93862J;

        /* renamed from: K */
        final /* synthetic */ C18652b0 f93863K;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(C18652b0 c18652b0, ViewGroup viewGroup, int i11, int i12) {
            super(r11);
            AbstractC19074t.m100208f(viewGroup, "parent");
            this.f93863K = c18652b0;
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setBackground(C23212s8.m119609q(linearLayout.getContext(), AbstractC28291a.list_item_background));
            linearLayout.setOrientation(1);
            Context context = linearLayout.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setId(i12);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(AbstractC23136l9.m118712h(robotoTextView.getContext(), 16.0f), AbstractC23136l9.m118712h(robotoTextView.getContext(), 12.0f), AbstractC23136l9.m118712h(robotoTextView.getContext(), 8.0f), AbstractC23136l9.m118712h(robotoTextView.getContext(), 8.0f));
            robotoTextView.setLayoutParams(layoutParams);
            robotoTextView.setFontStyle(AbstractC2814h.t_small_m);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC28291a.information_text));
            robotoTextView.setVisibility(8);
            linearLayout.addView(robotoTextView);
            Context context2 = linearLayout.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            ListItem listItem = new ListItem(context2);
            listItem.setId(i11);
            listItem.m90591l(AbstractC23136l9.m118712h(listItem.getContext(), 16.0f), 0, 0, 0);
            listItem.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(listItem.getContext());
            Context context3 = zAppCompatImageView.getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            zAppCompatImageView.setImageDrawable(C27280g.m139660c(context3, AbstractC23322a.zds_ic_check_line_24, AbstractC2807a.selected));
            listItem.m90589e(zAppCompatImageView);
            listItem.setTrailingGravity(EnumC16952b0.CENTER);
            linearLayout.addView(listItem);
            View findViewById = this.f7784p.findViewById(i11);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f93861I = (ListItem) findViewById;
            View findViewById2 = this.f7784p.findViewById(i12);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            this.f93862J = (RobotoTextView) findViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m98580k0(C18652b0 c18652b0, C28655u c28655u, View view) {
            AbstractC19074t.m100208f(c18652b0, "this$0");
            AbstractC19074t.m100208f(c28655u, "$item");
            InterfaceC18505l m98573N = c18652b0.m98573N();
            if (m98573N != null) {
                m98573N.mo205i9(c28655u);
            }
        }

        /* renamed from: j0 */
        public final void m98581j0(final C28655u c28655u) {
            AbstractC19074t.m100208f(c28655u, "item");
            int mo10005m = this.f93863K.mo10005m(m9929A());
            if (mo10005m == this.f93863K.f93858s) {
                ListItem listItem = this.f93861I;
                final C18652b0 c18652b0 = this.f93863K;
                listItem.setTitle(c28655u.f132863a + "(+" + c28655u.f132865c + ")");
                listItem.setOnClickListener(new View.OnClickListener() { // from class: ez.a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18652b0.a.m98580k0(C18652b0.this, c28655u, view);
                    }
                });
                if (c28655u.f132872j) {
                    this.f93861I.setTrailingItemVisibility(0);
                    return;
                } else {
                    this.f93861I.setTrailingItemVisibility(8);
                    return;
                }
            }
            if (mo10005m == this.f93863K.f93859t) {
                this.f93861I.setVisibility(8);
                this.f93862J.setVisibility(0);
                this.f93862J.setText(c28655u.f132863a);
            }
        }

        public /* synthetic */ a(C18652b0 c18652b0, ViewGroup viewGroup, int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
            this(c18652b0, viewGroup, (i13 & 2) != 0 ? View.generateViewId() : i11, (i13 & 4) != 0 ? View.generateViewId() : i12);
        }
    }
}
