package z50;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import b40.C2526d;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import dj.C17945a0;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kw.C21955a;
import me0.AbstractC23016b;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p241ij.C20565b;
import p279jw.C21373a;
import sx.EnumC26407i;
import w50.C28771c;

/* renamed from: z50.e */
/* loaded from: classes5.dex */
public class C31660e extends C8009j.a {

    /* renamed from: z50.e$a */
    /* loaded from: classes5.dex */
    static class a extends BaseAdapter {

        /* renamed from: p */
        private List f145492p;

        /* renamed from: q */
        private final LayoutInflater f145493q;

        /* renamed from: z50.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static class C33063a {

            /* renamed from: a */
            TextView f145494a;

            C33063a() {
            }
        }

        public a(List list, LayoutInflater layoutInflater) {
            this.f145492p = list;
            this.f145493q = layoutInflater;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f145492p.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i11) {
            return this.f145492p.get(i11);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            C33063a c33063a;
            if (view == null) {
                view = this.f145493q.inflate(AbstractC7409c0.chat_context_menu_item, (ViewGroup) null);
                c33063a = new C33063a();
                c33063a.f145494a = (TextView) view.findViewById(AbstractC6918a0.context_item_name);
                view.setTag(c33063a);
            } else {
                c33063a = (C33063a) view.getTag();
            }
            C20565b c20565b = (C20565b) this.f145492p.get(i11);
            TextView textView = c33063a.f145494a;
            String str = c20565b.f101100b;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            if (c20565b.f101099a == AbstractC6918a0.default_cm_delete) {
                TextView textView2 = c33063a.f145494a;
                textView2.setTextColor(C23212s8.m119607o(textView2.getContext(), AbstractC7354t0.NotificationColor1));
            } else {
                TextView textView3 = c33063a.f145494a;
                textView3.setTextColor(AbstractC23136l9.m118641B(textView3.getContext(), AbstractC16801x.chat_context_menu_item_text_selector));
            }
            return view;
        }
    }

    public C31660e(Context context, final int i11, final ChatView chatView, final InterfaceC31661f interfaceC31661f, final String str) {
        super(chatView.getContext());
        boolean z11;
        if (i11 >= 0) {
            try {
                if (i11 < chatView.m59834TP().m60494h0().size()) {
                    final C28771c c28771c = (C28771c) chatView.m59834TP().m60492f0(i11);
                    final C17945a0 m143951k = c28771c.m143951k();
                    List<C17945a0> m143956p = c28771c.m143956p();
                    final List m143955o = c28771c.m143955o();
                    chatView.f56734B1 = m143955o;
                    boolean z12 = false;
                    for (int i12 = 0; i12 < m143956p.size(); i12++) {
                        C17945a0 c17945a0 = (C17945a0) m143956p.get(i12);
                        z12 = c17945a0.m95032V6() && !c17945a0.m95033V7() && m152390D(c17945a0.m95041W4());
                        if (z12) {
                            break;
                        }
                    }
                    Iterator it = m143956p.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = false;
                            break;
                        }
                        C17945a0 c17945a02 = (C17945a0) it.next();
                        if (c17945a02.m95089b4() == 0 && !c17945a02.m95139g1()) {
                            z11 = true;
                            break;
                        }
                    }
                    m43172u(AbstractC19646n0.m102885D0(m143956p));
                    m43155d(true);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    C20565b c20565b = new C20565b(AbstractC6918a0.default_cm_delete, AbstractC23136l9.m118743r0(AbstractC8020f0.delete), AbstractC16803z.icn_csc_menu_delete_n);
                    C20565b c20565b2 = new C20565b(AbstractC6918a0.default_cm_undo, AbstractC23136l9.m118743r0(AbstractC8020f0.str_item_cm_undo_send_msg), AbstractC16803z.icn_csc_menu_recall_n);
                    C20565b c20565b3 = new C20565b(AbstractC6918a0.default_cm_save, AbstractC23136l9.m118743r0(AbstractC8020f0.str_save_photos_videos_more_menu), AbstractC16803z.icn_csc_menu_download_n);
                    boolean z13 = z12;
                    C20565b c20565b4 = new C20565b(AbstractC6918a0.default_cm_resend, AbstractC23136l9.m118743r0(AbstractC8020f0.resend), AbstractC16803z.icn_csc_menu_retry_n);
                    C20565b m106986b = C20565b.m106986b(AbstractC6918a0.default_cm_add_item_to_collection, AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_add_item_to_collection), AbstractC23322a.zds_ic_plus_circle_line_24, AbstractC2808b.skb60);
                    boolean equals = TextUtils.equals(str, "4");
                    if (equals) {
                        if (C21373a.f104231a.m110802n()) {
                            z13 = false;
                        }
                    }
                    if (!equals) {
                        try {
                            if (C21373a.f104231a.m110802n() && AbstractC19646n0.m103009o(m143955o)) {
                                linkedHashSet.add(new C20565b(AbstractC6918a0.default_cm_send_to_saved_messages, AbstractC23136l9.m118743r0(AbstractC8020f0.str_save_msg_context_menu_long_form), AbstractC16803z.ic_save_message));
                            }
                        } catch (Exception e11) {
                            e = e11;
                            e.printStackTrace();
                        }
                    }
                    if (m143956p.size() > 0) {
                        boolean z14 = true;
                        boolean z15 = true;
                        for (C17945a0 c17945a03 : m143956p) {
                            if (z14 && !c17945a03.m95288w8()) {
                                z14 = false;
                            }
                            if (z15 && !c17945a03.m95033V7()) {
                                z15 = false;
                            }
                        }
                        if (!z15 && !z14) {
                            linkedHashSet.add(c20565b3);
                            if (equals && C21373a.f104231a.m110807w().m110825b()) {
                                linkedHashSet.add(m106986b);
                            }
                        }
                    }
                    if (z13) {
                        linkedHashSet.add(c20565b2);
                    }
                    if (z11) {
                        linkedHashSet.add(c20565b4);
                    }
                    linkedHashSet.add(c20565b);
                    final a aVar = new a(new ArrayList(linkedHashSet), LayoutInflater.from(context));
                    try {
                        m43153b(aVar, new InterfaceC17463d.d() { // from class: z50.d
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                                C31660e.m152391E(aVar, interfaceC31661f, i11, m143955o, str, chatView, c28771c, m143951k, interfaceC17463d, i13);
                            }
                        });
                        C2526d.f10270a.m12700Y(m143955o, "csc_msg_button", str);
                    } catch (Exception e12) {
                        e = e12;
                        e.printStackTrace();
                    }
                }
            } catch (Exception e13) {
                e = e13;
            }
        }
    }

    /* renamed from: D */
    private boolean m152390D(int i11) {
        return (i11 == 36 || i11 == 34) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ void m152391E(BaseAdapter baseAdapter, InterfaceC31661f interfaceC31661f, int i11, List list, String str, ChatView chatView, C28771c c28771c, C17945a0 c17945a0, InterfaceC17463d interfaceC17463d, int i12) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int i13 = ((C20565b) baseAdapter.getItem(i12)).f101099a;
        if (i13 == AbstractC6918a0.default_cm_forward) {
            if (interfaceC31661f != null) {
                interfaceC31661f.mo64191vc(i11, "csc_msgmenu", -1);
                return;
            }
            return;
        }
        if (i13 == AbstractC6918a0.default_cm_delete) {
            if (interfaceC31661f != null) {
                interfaceC31661f.mo64189tp(list);
                C2526d.f10270a.m12682I(list, "csc_msg_more", str);
                return;
            }
            return;
        }
        if (i13 == AbstractC6918a0.default_cm_undo) {
            if (chatView.m60020gQ().mo60789r6()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                return;
            } else {
                if (interfaceC31661f != null) {
                    interfaceC31661f.mo64159gj(c28771c.m143956p());
                    C2526d.f10270a.m12708d0(list, "csc_msg_more", str);
                    return;
                }
                return;
            }
        }
        if (i13 == AbstractC6918a0.default_cm_save) {
            if (interfaceC31661f != null) {
                interfaceC31661f.mo64134Tg(i11, c17945a0);
            }
            C2526d.f10270a.m12689M(c17945a0, -1, "csc_msg_more", str);
            return;
        }
        if (i13 == AbstractC6918a0.default_cm_resend) {
            chatView.m60020gQ().mo60754k9(AbstractC19646n0.m102891F0(c17945a0.mo95039W2(), c17945a0.m95029V3(), true), "csc_group_msg_btn");
            AbstractC23016b.m118013g();
            return;
        }
        if (i13 == AbstractC6918a0.default_cm_send_to_saved_messages) {
            if (interfaceC31661f != null) {
                AbstractC23112j7.m118566y0(EnumC26407i.f125518t);
                interfaceC31661f.mo64135Tm(c28771c.m143956p());
                return;
            }
            return;
        }
        if (i13 == AbstractC6918a0.default_cm_add_item_to_collection) {
            List m143956p = c28771c.m143956p();
            ArrayList arrayList = new ArrayList();
            Iterator it = m143956p.iterator();
            while (it.hasNext()) {
                arrayList.add(((C17945a0) it.next()).m95029V3());
            }
            chatView.m60020gQ().mo60564Fl(arrayList, "csc_photo_menu_more", C21955a.f108070a.m114643j(m143956p));
        }
    }
}
