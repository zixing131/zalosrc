package com.zing.zalo.p077ui.mediastore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ci.C3522q;
import ci.C3524s;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p279jw.C21373a;
import p461qu.AbstractC25495a;

/* renamed from: com.zing.zalo.ui.mediastore.b */
/* loaded from: classes6.dex */
public final class C12340b {

    /* renamed from: a */
    public static final C12340b f64192a = new C12340b();

    /* renamed from: com.zing.zalo.ui.mediastore.b$a */
    /* loaded from: classes6.dex */
    public interface a {
        /* renamed from: a */
        void mo67255a(List list);

        /* renamed from: b */
        void mo67256b(String str, List list, boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.mediastore.b$b */
    /* loaded from: classes6.dex */
    public interface b {
        /* renamed from: a */
        void mo69087a(List list);

        /* renamed from: b */
        void mo69088b(String str, List list, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.mediastore.b$c */
    /* loaded from: classes6.dex */
    public interface c {
        /* renamed from: a */
        void mo69425a();

        /* renamed from: b */
        void mo69426b(boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.mediastore.b$d */
    /* loaded from: classes6.dex */
    public static final class d implements c {

        /* renamed from: a */
        final /* synthetic */ b f64193a;

        /* renamed from: b */
        final /* synthetic */ String f64194b;

        /* renamed from: c */
        final /* synthetic */ List f64195c;

        d(b bVar, String str, List list) {
            this.f64193a = bVar;
            this.f64194b = str;
            this.f64195c = list;
        }

        @Override // com.zing.zalo.p077ui.mediastore.C12340b.c
        /* renamed from: a */
        public void mo69425a() {
            this.f64193a.mo69087a(this.f64195c);
        }

        @Override // com.zing.zalo.p077ui.mediastore.C12340b.c
        /* renamed from: b */
        public void mo69426b(boolean z11) {
            this.f64193a.mo69088b(this.f64194b, this.f64195c, z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.b$e */
    /* loaded from: classes6.dex */
    public static final class e implements c {

        /* renamed from: a */
        final /* synthetic */ a f64196a;

        /* renamed from: b */
        final /* synthetic */ String f64197b;

        /* renamed from: c */
        final /* synthetic */ List f64198c;

        e(a aVar, String str, List list) {
            this.f64196a = aVar;
            this.f64197b = str;
            this.f64198c = list;
        }

        @Override // com.zing.zalo.p077ui.mediastore.C12340b.c
        /* renamed from: a */
        public void mo69425a() {
            this.f64196a.mo67255a(this.f64198c);
        }

        @Override // com.zing.zalo.p077ui.mediastore.C12340b.c
        /* renamed from: b */
        public void mo69426b(boolean z11) {
            this.f64196a.mo67256b(this.f64197b, this.f64198c, z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.b$f */
    /* loaded from: classes6.dex */
    public static final class f extends ArrayAdapter {

        /* renamed from: p */
        final /* synthetic */ Context f64199p;

        /* renamed from: q */
        final /* synthetic */ int f64200q;

        /* renamed from: r */
        final /* synthetic */ int f64201r;

        /* renamed from: s */
        final /* synthetic */ boolean f64202s;

        /* renamed from: t */
        final /* synthetic */ boolean f64203t;

        /* renamed from: u */
        final /* synthetic */ boolean f64204u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, String[] strArr, int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, int i14) {
            super(context, i13, i14, strArr);
            this.f64199p = context;
            this.f64200q = i11;
            this.f64201r = i12;
            this.f64202s = z11;
            this.f64203t = z12;
            this.f64204u = z13;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            View view2 = super.getView(i11, view, viewGroup);
            AbstractC19074t.m100207e(view2, "getView(...)");
            view2.setEnabled(true);
            if ((i11 == this.f64200q || i11 == this.f64201r) && this.f64202s && (view2 instanceof RobotoTextView)) {
                ((RobotoTextView) view2).setTextColor(C23212s8.m119607o(this.f64199p, AbstractC7354t0.NotificationColor1));
            }
            if ((i11 == this.f64200q && !this.f64203t) || (i11 == this.f64201r && !this.f64204u)) {
                view2.setEnabled(false);
            }
            return view2;
        }
    }

    private C12340b() {
    }

    /* renamed from: b */
    private final KeyEventCallbackC17462c m69421b(Context context, String str, List list, C3524s c3524s, final c cVar) {
        boolean z11;
        String m118746s0;
        String str2;
        int i11;
        final int i12;
        final int i13;
        if (list.size() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean m17835c = c3524s.m17835c();
        final boolean m17834b = c3524s.m17834b();
        C8009j.a aVar = new C8009j.a(context);
        aVar.m43155d(true);
        if (z11) {
            m118746s0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_multi_item_media_title2_single);
        } else {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_confirm_delete_multi_item_media_title2, Integer.valueOf(list.size()));
        }
        AbstractC19074t.m100205c(m118746s0);
        if (AbstractC25495a.m132079d(str)) {
            if (z11) {
                str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_single_item_media_desc3);
            } else {
                str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_multi_item_media_desc3);
            }
        } else {
            str2 = null;
        }
        if (str2 != null) {
            View inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.admin_del_title_view, (ViewGroup) null);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tv_title);
            if (textView != null) {
                textView.setText(m118746s0);
            }
            TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.tv_message);
            if (textView2 != null) {
                textView2.setText(str2);
            }
            aVar.m43158g(inflate);
        } else {
            aVar.m43172u(m118746s0);
        }
        boolean m132079d = AbstractC25495a.m132079d(str);
        boolean m132078c = AbstractC25495a.m132078c(str);
        ArrayList arrayList = new ArrayList();
        if (m17835c) {
            if (m132078c) {
                arrayList.add(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_multi_item_media_option_for_file_transfer));
            } else {
                arrayList.add(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_multi_item_media_option_for_me_only));
            }
            i11 = arrayList.size() - 1;
        } else {
            i11 = -1;
        }
        if (m17834b) {
            if (m132078c && C21373a.f104231a.m110802n()) {
                arrayList.add(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_multi_item_media_option_for_file_transfer));
            } else if (m132079d) {
                arrayList.add(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_multi_item_media_option_for_group));
            } else {
                arrayList.add(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_multi_item_media_option_recall));
            }
            i12 = arrayList.size() - 1;
        } else {
            i12 = -1;
        }
        if (m132079d) {
            arrayList.add(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel));
            i13 = arrayList.size() - 1;
        } else {
            i13 = -1;
        }
        aVar.m43153b(new f(context, (String[]) arrayList.toArray(new String[0]), i11, i12, m132079d, m17835c, m17834b, AbstractC7409c0.chat_context_menu_item, AbstractC6918a0.context_item_name), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.mediastore.a
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                C12340b.m69424e(i13, cVar, i12, m17834b, interfaceC17463d, i14);
            }
        });
        C8009j m43152a = aVar.m43152a();
        AbstractC19074t.m100207e(m43152a, "create(...)");
        return m43152a;
    }

    /* renamed from: c */
    public static final KeyEventCallbackC17462c m69422c(Context context, String str, List list, a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(list, "items");
        AbstractC19074t.m100208f(aVar, "listener");
        return f64192a.m69421b(context, str, list, C3522q.m17809e(str, list), new e(aVar, str, list));
    }

    /* renamed from: d */
    public static final KeyEventCallbackC17462c m69423d(Context context, String str, List list, b bVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(list, "items");
        AbstractC19074t.m100208f(bVar, "listener");
        return f64192a.m69421b(context, str, list, C3522q.m17808d(str, list), new d(bVar, str, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m69424e(int i11, c cVar, int i12, boolean z11, InterfaceC17463d interfaceC17463d, int i13) {
        boolean z12;
        AbstractC19074t.m100208f(cVar, "$listener");
        if (i11 == i13) {
            cVar.mo69425a();
            return;
        }
        if (i13 == i12) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !z11) {
            ToastUtils.m89266n(AbstractC8020f0.str_not_perform_action, new Object[0]);
        } else {
            cVar.mo69426b(z12);
        }
    }
}
