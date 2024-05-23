package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.p072ui.component.bts.CommentIdentitiesBottomSheet;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import pm0.AbstractC24866w;
import q10.C24987b;
import s20.AbstractC26112n;
import v00.C27417l;

/* loaded from: classes5.dex */
public final class CommentIdentitiesBottomSheet extends BaseBottomSheetView {
    public static final C9504b Companion = new C9504b(null);

    /* renamed from: M0 */
    private InterfaceC9503a f50439M0;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.CommentIdentitiesBottomSheet$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9503a {
        /* renamed from: a */
        void mo51876a(int i11);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.CommentIdentitiesBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C9504b {
        private C9504b() {
        }

        public /* synthetic */ C9504b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final CommentIdentitiesBottomSheet m51877a(int i11) {
            CommentIdentitiesBottomSheet commentIdentitiesBottomSheet = new CommentIdentitiesBottomSheet();
            commentIdentitiesBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("CURRENT_TYPE", Integer.valueOf(i11))));
            return commentIdentitiesBottomSheet;
        }
    }

    /* renamed from: kL */
    public static final void m51873kL(C24987b c24987b, CommentIdentitiesBottomSheet commentIdentitiesBottomSheet, View view) {
        AbstractC19074t.m100208f(c24987b, "$this_apply");
        AbstractC19074t.m100208f(commentIdentitiesBottomSheet, "this$0");
        View view2 = c24987b.f119753t;
        AbstractC19074t.m100207e(view2, "icoCheckUser");
        if (AbstractC26112n.m134379T(view2)) {
            View view3 = c24987b.f119753t;
            AbstractC19074t.m100207e(view3, "icoCheckUser");
            AbstractC26112n.m134431w0(view3);
            View view4 = c24987b.f119752s;
            AbstractC19074t.m100207e(view4, "icoCheckChannel");
            AbstractC26112n.m134374O(view4);
            InterfaceC9503a interfaceC9503a = commentIdentitiesBottomSheet.f50439M0;
            if (interfaceC9503a != null) {
                interfaceC9503a.mo51876a(1);
            }
            commentIdentitiesBottomSheet.dismiss();
        }
    }

    /* renamed from: lL */
    public static final void m51874lL(C24987b c24987b, CommentIdentitiesBottomSheet commentIdentitiesBottomSheet, View view) {
        AbstractC19074t.m100208f(c24987b, "$this_apply");
        AbstractC19074t.m100208f(commentIdentitiesBottomSheet, "this$0");
        View view2 = c24987b.f119752s;
        AbstractC19074t.m100207e(view2, "icoCheckChannel");
        if (AbstractC26112n.m134379T(view2)) {
            View view3 = c24987b.f119752s;
            AbstractC19074t.m100207e(view3, "icoCheckChannel");
            AbstractC26112n.m134431w0(view3);
            View view4 = c24987b.f119753t;
            AbstractC19074t.m100207e(view4, "icoCheckUser");
            AbstractC26112n.m134374O(view4);
            InterfaceC9503a interfaceC9503a = commentIdentitiesBottomSheet.f50439M0;
            if (interfaceC9503a != null) {
                interfaceC9503a.mo51876a(2);
            }
            commentIdentitiesBottomSheet.dismiss();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m51753XK(true);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView
    /* renamed from: WK */
    public View mo51752WK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C24987b m129758c = C24987b.m129758c(layoutInflater, viewGroup, false);
        C27417l c27417l = C27417l.f129055a;
        User m140378b = c27417l.m140378b();
        m129758c.f119751r.setAvatar(m140378b);
        m129758c.f119757x.setText(m140378b.m51235h());
        m129758c.f119755v.setOnClickListener(new View.OnClickListener() { // from class: v10.g

            /* renamed from: q */
            public final /* synthetic */ CommentIdentitiesBottomSheet f129114q;

            public /* synthetic */ ViewOnClickListenerC27429g(CommentIdentitiesBottomSheet this) {
                r2 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentIdentitiesBottomSheet.m51873kL(C24987b.this, r2, view);
            }
        });
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getInt("CURRENT_TYPE") == 1) {
            View view = m129758c.f119753t;
            AbstractC19074t.m100207e(view, "icoCheckUser");
            AbstractC26112n.m134431w0(view);
        }
        Channel m140377a = c27417l.m140377a();
        if (m140377a != null) {
            m129758c.f119750q.setAvatar(m140377a);
            m129758c.f119756w.setText(m140377a.m50775o());
            m129758c.f119756w.setChannelMarker(m140377a.m50725F());
            m129758c.f119754u.setOnClickListener(new View.OnClickListener() { // from class: v10.h

                /* renamed from: q */
                public final /* synthetic */ CommentIdentitiesBottomSheet f129116q;

                public /* synthetic */ ViewOnClickListenerC27430h(CommentIdentitiesBottomSheet this) {
                    r2 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CommentIdentitiesBottomSheet.m51874lL(C24987b.this, r2, view2);
                }
            });
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null && m92642L32.getInt("CURRENT_TYPE") == 2) {
                View view2 = m129758c.f119752s;
                AbstractC19074t.m100207e(view2, "icoCheckChannel");
                AbstractC26112n.m134431w0(view2);
            }
        }
        LinearLayout root = m129758c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: mL */
    public final void m51875mL(InterfaceC9503a interfaceC9503a) {
        this.f50439M0 = interfaceC9503a;
    }
}
